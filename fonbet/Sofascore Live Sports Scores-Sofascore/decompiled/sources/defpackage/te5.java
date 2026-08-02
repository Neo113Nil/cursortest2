package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbd;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzfd;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzfm;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class te5 implements xi5, yi5 {
    public final /* synthetic */ int a;
    public Object b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    public Object g;

    public te5(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new j9e(10);
                this.f = C.TIME_UNSET;
                break;
            default:
                this.b = new nkk(10);
                this.f = C.TIME_UNSET;
                break;
        }
    }

    public void a() {
        long r;
        zzfd zzfdVar = (zzfd) this.g;
        cwo cwoVar = zzfdVar.a;
        zzbd zzbdVar = zzfdVar.d;
        zzea zzeaVar = zzfdVar.e;
        zzbf zzq = cwoVar.zzq();
        Object f = zzq.g() ? null : zzq.f(cwoVar.q());
        int w = cwoVar.w();
        int x = cwoVar.x();
        long s = cwoVar.s();
        if (f == null || w != -1) {
            r = w != -1 ? cwoVar.r() : -9223372036854775807L;
        } else {
            zzq.o(f, zzbdVar);
            s -= zzfm.t(0L);
            r = zzfm.t(zzbdVar.d);
            w = -1;
        }
        boolean a = cwoVar.a();
        if (!a || r == C.TIME_UNSET || s < r) {
            zzeaVar.d(3);
            if (a && r != C.TIME_UNSET) {
                cwoVar.o();
                zzeaVar.e(3, (int) Math.ceil((r - s) / cwoVar.V.o.a));
            }
            this.c = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.c && Objects.equals(f, this.b) && w == this.d && x == this.e) {
            if (elapsedRealtime - this.f >= 2147483647L) {
                zzfdVar.c.g(new zzfe(3, Integer.MAX_VALUE));
                return;
            }
            return;
        }
        this.c = true;
        this.f = elapsedRealtime;
        this.b = f;
        this.d = w;
        this.e = x;
        zzeaVar.d(3);
        zzeaVar.e(3, Integer.MAX_VALUE);
    }

    @Override // defpackage.yi5
    public void b(j9e j9eVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 1:
                if (this.c) {
                    if (this.d == 2) {
                        if (j9eVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (j9eVar.A() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (j9eVar.a() == 0) {
                            z = false;
                        } else {
                            if (j9eVar.A() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                        }
                    }
                    int i = j9eVar.b;
                    int a = j9eVar.a();
                    for (vsj vsjVar : (vsj[]) this.g) {
                        j9eVar.N(i);
                        vsjVar.g(a, j9eVar);
                    }
                    this.e += a;
                    break;
                }
                break;
            default:
                j9e j9eVar2 = (j9e) this.b;
                ((vsj) this.g).getClass();
                if (this.c) {
                    int a2 = j9eVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(j9eVar.a, j9eVar.b, j9eVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            j9eVar2.N(0);
                            if (73 != j9eVar2.A() || 68 != j9eVar2.A() || 51 != j9eVar2.A()) {
                                tgj.d0("Discarding invalid ID3 tag");
                                this.c = false;
                                break;
                            } else {
                                j9eVar2.O(3);
                                this.d = j9eVar2.z() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((vsj) this.g).g(min2, j9eVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yi5
    public void c(boolean z) {
        int i;
        switch (this.a) {
            case 1:
                if (this.c) {
                    z1a.E(this.f != C.TIME_UNSET);
                    for (vsj vsjVar : (vsj[]) this.g) {
                        vsjVar.a(this.f, 1, this.e, 0, null);
                    }
                    this.c = false;
                    break;
                }
                break;
            default:
                ((vsj) this.g).getClass();
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    z1a.E(this.f != C.TIME_UNSET);
                    ((vsj) this.g).a(this.f, 1, this.d, 0, null);
                    this.c = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yi5
    public void d(pl6 pl6Var, c2k c2kVar) {
        switch (this.a) {
            case 1:
                vsj[] vsjVarArr = (vsj[]) this.g;
                for (int i = 0; i < vsjVarArr.length; i++) {
                    b2k b2kVar = (b2k) ((List) this.b).get(i);
                    c2kVar.a();
                    c2kVar.b();
                    vsj mo2track = pl6Var.mo2track(c2kVar.e, 3);
                    qm8 qm8Var = new qm8();
                    c2kVar.b();
                    qm8Var.a = c2kVar.f;
                    qm8Var.m = sjc.p("video/mp2t");
                    qm8Var.n = sjc.p(MimeTypes.APPLICATION_DVBSUBS);
                    qm8Var.q = Collections.singletonList(b2kVar.b);
                    qm8Var.d = b2kVar.a;
                    w1l.r(qm8Var, mo2track);
                    vsjVarArr[i] = mo2track;
                }
                break;
            default:
                c2kVar.a();
                c2kVar.b();
                vsj mo2track2 = pl6Var.mo2track(c2kVar.e, 5);
                this.g = mo2track2;
                qm8 qm8Var2 = new qm8();
                c2kVar.b();
                qm8Var2.a = c2kVar.f;
                qm8Var2.m = sjc.p("video/mp2t");
                qm8Var2.n = sjc.p(MimeTypes.APPLICATION_ID3);
                w1l.r(qm8Var2, mo2track2);
                break;
        }
    }

    @Override // defpackage.xi5
    public void f(nkk nkkVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.d == 2) {
                        if (nkkVar.c() == 0) {
                            z2 = false;
                        } else {
                            if (nkkVar.s() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (nkkVar.c() == 0) {
                            z = false;
                        } else {
                            if (nkkVar.s() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                        }
                    }
                    int i = nkkVar.b;
                    int c = nkkVar.c();
                    for (usj usjVar : (usj[]) this.g) {
                        nkkVar.E(i);
                        usjVar.d(c, nkkVar);
                    }
                    this.e += c;
                    break;
                }
                break;
            default:
                nkk nkkVar2 = (nkk) this.b;
                qx9.u((usj) this.g);
                if (this.c) {
                    int c2 = nkkVar.c();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(c2, 10 - i2);
                        System.arraycopy(nkkVar.a, nkkVar.b, nkkVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            nkkVar2.E(0);
                            if (73 != nkkVar2.s() || 68 != nkkVar2.s() || 51 != nkkVar2.s()) {
                                m6k.f0();
                                this.c = false;
                                break;
                            } else {
                                nkkVar2.F(3);
                                this.d = nkkVar2.r() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(c2, this.d - this.e);
                    ((usj) this.g).d(min2, nkkVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xi5
    public void g(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != C.TIME_UNSET) {
                        this.f = j;
                    }
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            case 1:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            case 2:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != C.TIME_UNSET) {
                        this.f = j;
                    }
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xi5
    public void h(ol6 ol6Var, c2k c2kVar) {
        switch (this.a) {
            case 0:
                usj[] usjVarArr = (usj[]) this.g;
                for (int i = 0; i < usjVarArr.length; i++) {
                    a2k a2kVar = (a2k) ((List) this.b).get(i);
                    c2kVar.a();
                    c2kVar.b();
                    usj track = ol6Var.track(c2kVar.e, 3);
                    pm8 pm8Var = new pm8();
                    c2kVar.b();
                    pm8Var.a = c2kVar.f;
                    pm8Var.k = MimeTypes.APPLICATION_DVBSUBS;
                    pm8Var.m = Collections.singletonList(a2kVar.b);
                    pm8Var.c = a2kVar.a;
                    track.a(new sm8(pm8Var));
                    usjVarArr[i] = track;
                }
                break;
            default:
                c2kVar.a();
                c2kVar.b();
                usj track2 = ol6Var.track(c2kVar.e, 5);
                this.g = track2;
                pm8 pm8Var2 = new pm8();
                c2kVar.b();
                pm8Var2.a = c2kVar.f;
                pm8Var2.k = MimeTypes.APPLICATION_ID3;
                track2.a(new sm8(pm8Var2));
                break;
        }
    }

    @Override // defpackage.xi5
    public void packetFinished() {
        int i;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.f != C.TIME_UNSET) {
                        for (usj usjVar : (usj[]) this.g) {
                            usjVar.c(this.f, 1, this.e, 0, null);
                        }
                    }
                    this.c = false;
                    break;
                }
                break;
            default:
                qx9.u((usj) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    long j = this.f;
                    if (j != C.TIME_UNSET) {
                        ((usj) this.g).c(j, 1, i, 0, null);
                    }
                    this.c = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xi5
    public void seek() {
        switch (this.a) {
            case 0:
                this.c = false;
                this.f = C.TIME_UNSET;
                break;
            case 1:
                this.c = false;
                this.f = C.TIME_UNSET;
                break;
            case 2:
                this.c = false;
                this.f = C.TIME_UNSET;
                break;
            default:
                this.c = false;
                this.f = C.TIME_UNSET;
                break;
        }
    }

    public te5(List list, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.g = new vsj[list.size()];
                this.f = C.TIME_UNSET;
                break;
            default:
                this.b = list;
                this.g = new usj[list.size()];
                this.f = C.TIME_UNSET;
                break;
        }
    }

    public te5(zzfd zzfdVar) {
        this.a = 4;
        this.g = zzfdVar;
    }
}
