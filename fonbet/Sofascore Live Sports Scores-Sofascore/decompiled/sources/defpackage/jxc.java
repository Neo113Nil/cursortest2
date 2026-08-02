package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jxc implements xi5 {
    public final nkk a;
    public final lxc b;
    public final String c;
    public usj d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public jxc(String str) {
        nkk nkkVar = new nkk(4);
        this.a = nkkVar;
        nkkVar.a[0] = -1;
        this.b = new lxc(0);
        this.l = C.TIME_UNSET;
        this.c = str;
    }

    @Override // defpackage.xi5
    public final void f(nkk nkkVar) {
        qx9.u(this.d);
        while (nkkVar.c() > 0) {
            int i = this.f;
            nkk nkkVar2 = this.a;
            if (i == 0) {
                byte[] bArr = nkkVar.a;
                int i2 = nkkVar.b;
                int i3 = nkkVar.c;
                while (true) {
                    if (i2 >= i3) {
                        nkkVar.E(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        nkkVar.E(i2 + 1);
                        this.i = false;
                        nkkVar2.a[1] = bArr[i2];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(nkkVar.c(), 4 - this.g);
                nkkVar.e(nkkVar2.a, this.g, min);
                int i4 = this.g + min;
                this.g = i4;
                if (i4 >= 4) {
                    nkkVar2.E(0);
                    int f = nkkVar2.f();
                    lxc lxcVar = this.b;
                    if (lxcVar.a(f)) {
                        this.k = lxcVar.d;
                        if (!this.h) {
                            int i5 = lxcVar.e;
                            this.j = (lxcVar.h * 1000000) / i5;
                            pm8 pm8Var = new pm8();
                            pm8Var.a = this.e;
                            pm8Var.k = lxcVar.c;
                            pm8Var.l = 4096;
                            pm8Var.x = lxcVar.f;
                            pm8Var.y = i5;
                            pm8Var.c = this.c;
                            this.d.a(new sm8(pm8Var));
                            this.h = true;
                        }
                        nkkVar2.E(0);
                        this.d.d(4, nkkVar2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i != 2) {
                    zzl.s();
                    return;
                }
                int min2 = Math.min(nkkVar.c(), this.k - this.g);
                this.d.d(min2, nkkVar);
                int i6 = this.g + min2;
                this.g = i6;
                int i7 = this.k;
                if (i6 >= i7) {
                    long j = this.l;
                    if (j != C.TIME_UNSET) {
                        this.d.c(j, 1, i7, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // defpackage.xi5
    public final void g(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.l = j;
        }
    }

    @Override // defpackage.xi5
    public final void h(ol6 ol6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.e = c2kVar.f;
        c2kVar.b();
        this.d = ol6Var.track(c2kVar.e, 1);
    }

    @Override // defpackage.xi5
    public final void seek() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = C.TIME_UNSET;
    }

    @Override // defpackage.xi5
    public final void packetFinished() {
    }
}
