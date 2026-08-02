package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qo3 extends k21 {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public qo3(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri uri = xe4Var.a;
                long j2 = xe4Var.g;
                long j3 = xe4Var.f;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f = normalizeScheme;
                e();
                boolean equals = Objects.equals(normalizeScheme.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
                ContentResolver contentResolver = this.e;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.g = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new oo3(2000, new IOException("Could not open file descriptor for: " + normalizeScheme));
                    } catch (IOException e) {
                        e = e;
                        throw new oo3(e instanceof FileNotFoundException ? 2005 : i, e);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && j3 > length) {
                    throw new oo3(2008, null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                if (skip != j3) {
                    throw new oo3(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.i = j;
                        if (j < 0) {
                            throw new oo3(2008, null);
                        }
                    }
                } else {
                    j = length - skip;
                    this.i = j;
                    if (j < 0) {
                        throw new oo3(2008, null);
                    }
                }
                if (j2 != -1) {
                    this.i = j == -1 ? j2 : Math.min(j, j2);
                }
                this.j = true;
                g(xe4Var);
                return j2 != -1 ? j2 : this.i;
            } catch (oo3 e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // defpackage.re4
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new oo3(2000, e);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                }
            } catch (IOException e2) {
                throw new oo3(2000, e2);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new oo3(2000, e3);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    d();
                }
            }
        }
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new oo3(2000, e);
                }
            }
            FileInputStream fileInputStream = this.h;
            String str = nik.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.i;
                if (j2 != -1) {
                    this.i = j2 - read;
                }
                c(read);
                return read;
            }
        }
        return -1;
    }
}
