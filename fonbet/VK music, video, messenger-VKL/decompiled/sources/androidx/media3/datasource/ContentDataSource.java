package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;
import xsna.evk;
import xsna.gc6;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class ContentDataSource extends gc6 {
    public final ContentResolver r;

    @Nullable
    public Uri s;

    @Nullable
    public AssetFileDescriptor t;

    @Nullable
    public FileInputStream u;
    public long v;
    public boolean w;

    public static class ContentDataSourceException extends DataSourceException {
    }

    public ContentDataSource(Context context) {
        super(false);
        this.r = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws ContentDataSourceException {
        this.s = null;
        try {
            try {
                FileInputStream fileInputStream = this.u;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.u = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.t;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSourceException(e, 2000);
                    }
                } finally {
                    this.t = null;
                    if (this.w) {
                        this.w = false;
                        transferEnded();
                    }
                }
            } catch (IOException e2) {
                throw new ContentDataSourceException(e2, 2000);
            }
        } catch (Throwable th) {
            this.u = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.t;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.t = null;
                    if (this.w) {
                        this.w = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ContentDataSourceException(e3, 2000);
                }
            } finally {
                this.t = null;
                if (this.w) {
                    this.w = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        return this.s;
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws ContentDataSourceException {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = evkVar.a;
                long j = evkVar.h;
                long j2 = evkVar.g;
                Uri normalizeScheme = uri.normalizeScheme();
                this.s = normalizeScheme;
                transferInitializing(evkVar);
                boolean equals = Objects.equals(normalizeScheme.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
                ContentResolver contentResolver = this.r;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.t = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new ContentDataSourceException(e, i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.u = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.v = -1L;
                    } else {
                        long position = size - channel.position();
                        this.v = position;
                        if (position < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.v = j3;
                    if (j3 < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.v;
                    this.v = j4 == -1 ? j : Math.min(j4, j);
                }
                this.w = true;
                transferStarted(evkVar);
                return j != -1 ? j : this.v;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (ContentDataSourceException e3) {
            throw e3;
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.v;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSourceException(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.u;
            String str = y2r0.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.v;
                if (j2 != -1) {
                    this.v = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
