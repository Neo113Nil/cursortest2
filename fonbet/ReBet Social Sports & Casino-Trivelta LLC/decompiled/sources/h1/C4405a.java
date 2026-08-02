package h1;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import e1.AbstractC4134a;
import e1.Z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4405a extends AbstractC4406b {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f47523e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f47524f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f47525g;

    /* renamed from: h, reason: collision with root package name */
    public long f47526h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f47527i;

    /* renamed from: h1.a$a, reason: collision with other inner class name */
    public static final class C0711a extends C4415k {
        public C0711a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C4405a(Context context) {
        super(false);
        this.f47523e = context.getAssets();
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        try {
            Uri uri = c4418n.f47554a;
            this.f47524f = uri;
            String str = (String) AbstractC4134a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            q(c4418n);
            InputStream open = this.f47523e.open(str, 1);
            this.f47525g = open;
            if (open.skip(c4418n.f47559f) < c4418n.f47559f) {
                throw new C0711a(null, 2008);
            }
            long j10 = c4418n.f47560g;
            if (j10 != -1) {
                this.f47526h = j10;
            } else {
                long available = this.f47525g.available();
                this.f47526h = available;
                if (available == 2147483647L) {
                    this.f47526h = -1L;
                }
            }
            this.f47527i = true;
            r(c4418n);
            return this.f47526h;
        } catch (C0711a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C0711a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        this.f47524f = null;
        try {
            try {
                InputStream inputStream = this.f47525g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new C0711a(e10, 2000);
            }
        } finally {
            this.f47525g = null;
            if (this.f47527i) {
                this.f47527i = false;
                p();
            }
        }
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        return this.f47524f;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47526h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C0711a(e10, 2000);
            }
        }
        int read = ((InputStream) Z.i(this.f47525g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f47526h;
        if (j11 != -1) {
            this.f47526h = j11 - read;
        }
        o(read);
        return read;
    }
}
