package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhj extends zzhk {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public zzhj(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        try {
            Uri uri = zzhwVar.a;
            this.f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            k(zzhwVar);
            InputStream open = this.e.open(path, 1);
            this.g = open;
            long j = zzhwVar.c;
            if (open.skip(j) < j) {
                throw new zzhi(2008, null);
            }
            long j2 = zzhwVar.d;
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
            l(zzhwVar);
            return this.h;
        } catch (zzhi e) {
            throw e;
        } catch (IOException e2) {
            throw new zzhi(true != (e2 instanceof FileNotFoundException) ? 2000 : 2005, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzhi(2000, e);
                }
            }
            InputStream inputStream = this.g;
            String str = zzfm.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - read;
                }
                m(read);
                return read;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    n();
                }
            } catch (IOException e) {
                throw new zzhi(2000, e);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                n();
            }
            throw th;
        }
    }
}
