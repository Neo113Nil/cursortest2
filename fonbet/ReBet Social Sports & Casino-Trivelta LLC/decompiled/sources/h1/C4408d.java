package h1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import e1.Z;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4408d extends AbstractC4406b {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f47532e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f47533f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f47534g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f47535h;

    /* renamed from: i, reason: collision with root package name */
    public long f47536i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f47537j;

    /* renamed from: h1.d$a */
    public static class a extends C4415k {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public C4408d(Context context) {
        super(false);
        this.f47532e = context.getContentResolver();
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri normalizeScheme = c4418n.f47554a.normalizeScheme();
            this.f47533f = normalizeScheme;
            q(c4418n);
            if (Objects.equals(normalizeScheme.getScheme(), "content")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f47532e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f47532e.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f47534g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f47535h = fileInputStream;
            if (length != -1 && c4418n.f47559f > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(c4418n.f47559f + startOffset) - startOffset;
            if (skip != c4418n.f47559f) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f47536i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f47536i = position;
                    if (position < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f47536i = j10;
                if (j10 < 0) {
                    throw new a(null, 2008);
                }
            }
            long j11 = c4418n.f47560g;
            if (j11 != -1) {
                long j12 = this.f47536i;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f47536i = j11;
            }
            this.f47537j = true;
            r(c4418n);
            long j13 = c4418n.f47560g;
            return j13 != -1 ? j13 : this.f47536i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        this.f47533f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f47535h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f47535h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f47534g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, 2000);
                    }
                } finally {
                    this.f47534g = null;
                    if (this.f47537j) {
                        this.f47537j = false;
                        p();
                    }
                }
            } catch (IOException e11) {
                throw new a(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f47535h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f47534g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f47534g = null;
                    if (this.f47537j) {
                        this.f47537j = false;
                        p();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new a(e12, 2000);
                }
            } finally {
                this.f47534g = null;
                if (this.f47537j) {
                    this.f47537j = false;
                    p();
                }
            }
        }
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        return this.f47533f;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47536i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((FileInputStream) Z.i(this.f47535h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f47536i;
        if (j11 != -1) {
            this.f47536i = j11 - read;
        }
        o(read);
        return read;
    }
}
