package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pi0 extends j21 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public pi0(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.qe4
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new ni0(2000, e);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                d();
            }
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.qe4
    public final long k(we4 we4Var) {
        try {
            Uri uri = we4Var.a;
            long j = we4Var.e;
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
                throw new ni0(2008, null);
            }
            long j2 = we4Var.f;
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
            f(we4Var);
            return this.h;
        } catch (ni0 e) {
            throw e;
        } catch (IOException e2) {
            throw new ni0(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.fe4, defpackage.ge4
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
                    throw new ni0(2000, e);
                }
            }
            InputStream inputStream = this.g;
            int i3 = lik.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - read;
                }
                b(read);
                return read;
            }
        }
        return -1;
    }
}
