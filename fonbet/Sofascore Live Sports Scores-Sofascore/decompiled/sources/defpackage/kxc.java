package defpackage;

import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kxc implements yi5 {
    public final j9e a;
    public final lxc b;
    public final String c;
    public final int d;
    public final String e;
    public vsj f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public kxc(String str, int i, String str2) {
        j9e j9eVar = new j9e(4);
        this.a = j9eVar;
        j9eVar.a[0] = -1;
        this.b = new lxc(1);
        this.n = C.TIME_UNSET;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.yi5
    public final void b(j9e j9eVar) {
        this.f.getClass();
        while (j9eVar.a() > 0) {
            int i = this.h;
            j9e j9eVar2 = this.a;
            if (i == 0) {
                byte[] bArr = j9eVar.a;
                int i2 = j9eVar.b;
                int i3 = j9eVar.c;
                while (true) {
                    if (i2 >= i3) {
                        j9eVar.N(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        j9eVar.N(i2 + 1);
                        this.k = false;
                        j9eVar2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(j9eVar.a(), 4 - this.i);
                j9eVar.k(j9eVar2.a, this.i, min);
                int i4 = this.i + min;
                this.i = i4;
                if (i4 >= 4) {
                    j9eVar2.N(0);
                    int m = j9eVar2.m();
                    lxc lxcVar = this.b;
                    if (lxcVar.a(m)) {
                        this.m = lxcVar.d;
                        if (!this.j) {
                            this.l = (lxcVar.h * 1000000) / lxcVar.e;
                            qm8 qm8Var = new qm8();
                            qm8Var.a = this.g;
                            qm8Var.m = sjc.p(this.e);
                            qm8Var.n = sjc.p(lxcVar.c);
                            qm8Var.o = 4096;
                            qm8Var.F = lxcVar.f;
                            qm8Var.G = lxcVar.e;
                            qm8Var.d = this.c;
                            qm8Var.f = this.d;
                            this.f.d(new b(qm8Var));
                            this.j = true;
                        }
                        j9eVar2.N(0);
                        this.f.g(4, j9eVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    zzl.s();
                    return;
                }
                int min2 = Math.min(j9eVar.a(), this.m - this.i);
                this.f.g(min2, j9eVar);
                int i5 = this.i + min2;
                this.i = i5;
                if (i5 >= this.m) {
                    z1a.E(this.n != C.TIME_UNSET);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.yi5
    public final void d(pl6 pl6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.g = c2kVar.f;
        c2kVar.b();
        this.f = pl6Var.mo2track(c2kVar.e, 1);
    }

    @Override // defpackage.yi5
    public final void g(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.yi5
    public final void seek() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = C.TIME_UNSET;
    }

    @Override // defpackage.yi5
    public final void c(boolean z) {
    }
}
