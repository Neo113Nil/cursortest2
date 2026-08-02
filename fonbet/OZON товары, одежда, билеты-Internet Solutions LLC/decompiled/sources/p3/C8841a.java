package p3;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import m3.N;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8841a extends AbstractC8842b {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f80044a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f80045b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f80046c;

    /* renamed from: d, reason: collision with root package name */
    private long f80047d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f80048e;

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    public static final class C1344a extends C8847g {
    }

    public C8841a(Context context) {
        super(false);
        this.f80044a = context.getAssets();
    }

    @Override // p3.InterfaceC8846f
    public final void close() throws C1344a {
        this.f80045b = null;
        try {
            try {
                InputStream inputStream = this.f80046c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e11) {
                throw new C1344a(2000, e11);
            }
        } finally {
            this.f80046c = null;
            if (this.f80048e) {
                this.f80048e = false;
                transferEnded();
            }
        }
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return this.f80045b;
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws C1344a {
        try {
            Uri uri = iVar.f80066a;
            long j11 = iVar.f80071f;
            this.f80045b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(iVar);
            InputStream open = this.f80044a.open(path, 1);
            this.f80046c = open;
            if (open.skip(j11) < j11) {
                throw new C1344a(2008, null);
            }
            long j12 = iVar.f80072g;
            if (j12 != -1) {
                this.f80047d = j12;
            } else {
                long available = this.f80046c.available();
                this.f80047d = available;
                if (available == 2147483647L) {
                    this.f80047d = -1L;
                }
            }
            this.f80048e = true;
            transferStarted(iVar);
            return this.f80047d;
        } catch (C1344a e11) {
            throw e11;
        } catch (IOException e12) {
            throw new C1344a(e12 instanceof FileNotFoundException ? 2005 : 2000, e12);
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws C1344a {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f80047d;
        if (j11 != 0) {
            if (j11 != -1) {
                try {
                    i12 = (int) Math.min(j11, i12);
                } catch (IOException e11) {
                    throw new C1344a(2000, e11);
                }
            }
            InputStream inputStream = this.f80046c;
            int i13 = N.f74289a;
            int read = inputStream.read(bArr, i11, i12);
            if (read != -1) {
                long j12 = this.f80047d;
                if (j12 != -1) {
                    this.f80047d = j12 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
