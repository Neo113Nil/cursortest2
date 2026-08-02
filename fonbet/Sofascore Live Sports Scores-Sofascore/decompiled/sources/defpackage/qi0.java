package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qi0 extends k21 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public qi0(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        try {
            Uri uri = xe4Var.a;
            long j = xe4Var.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(j) < j) {
                throw new oi0(2008, null);
            }
            long j2 = xe4Var.g;
            if (j2 != -1) {
                this.h = j2;
            } else {
                long available = this.g.available();
                this.h = available;
                if (available == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            g(xe4Var);
            return this.h;
        } catch (oi0 e) {
            throw e;
        } catch (IOException e2) {
            throw new oi0(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.re4
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new oi0(2000, e);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                d();
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
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new oi0(2000, e);
                }
            }
            InputStream inputStream = this.g;
            String str = nik.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - read;
                }
                c(read);
                return read;
            }
        }
        return -1;
    }
}
