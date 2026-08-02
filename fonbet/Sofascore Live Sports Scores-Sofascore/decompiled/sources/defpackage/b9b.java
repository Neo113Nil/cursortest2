package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class b9b {
    static {
        ypa.b(new ila(23));
    }

    public static final void a(n8b n8bVar, r8b r8bVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(369104068);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(n8bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.e(r8bVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            switch (r8bVar.ordinal()) {
                case 1:
                    av8Var.d0(863779931);
                    String str = n8bVar.j;
                    i((i2 >> 3) & 112, av8Var, xtcVar, str != null ? str : "");
                    av8Var.s(false);
                    break;
                case 2:
                    av8Var.d0(863684575);
                    String str2 = n8bVar.m;
                    i((i2 >> 3) & 112, av8Var, xtcVar, str2 != null ? str2 : "");
                    av8Var.s(false);
                    break;
                case 3:
                    av8Var.d0(-1773266231);
                    b(rd0.O(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1), n8bVar.c, null, av8Var, 0, 4);
                    av8Var.s(false);
                    break;
                case 4:
                    av8Var.d0(-1773269801);
                    b(rd0.O(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1), null, n8bVar.n, av8Var, 0, 2);
                    av8Var.s(false);
                    break;
                case 5:
                    av8Var.d0(863417417);
                    String str3 = n8bVar.i;
                    i((i2 >> 3) & 112, av8Var, xtcVar, str3 != null ? str3 : "");
                    av8Var.s(false);
                    break;
                case 6:
                    av8Var.d0(863505953);
                    String str4 = n8bVar.k;
                    i((i2 >> 3) & 112, av8Var, xtcVar, str4 != null ? str4 : "");
                    av8Var.s(false);
                    break;
                case 7:
                    av8Var.d0(863597062);
                    String str5 = n8bVar.l;
                    i((i2 >> 3) & 112, av8Var, xtcVar, str5 != null ? str5 : "");
                    av8Var.s(false);
                    break;
                default:
                    av8Var.d0(-1773248824);
                    av8Var.s(false);
                    break;
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(n8bVar, r8bVar, xtcVar, i, 17);
        }
    }

    public static final void b(xtc xtcVar, Integer num, String str, of3 of3Var, int i, int i2) {
        int i3;
        int i4;
        Integer num2;
        String str2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-68656668);
        int i5 = i | (av8Var.g(xtcVar) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
        } else {
            i3 = i5 | (av8Var.g(num) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
        } else {
            i4 = i3 | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            num2 = i6 != 0 ? null : num;
            str2 = i7 != 0 ? null : str;
            un0.a(xtcVar, o7g.a(2.0f), rd0.t(r13.d, av8Var, 6), rd0.u(2.0f, 62), null, yqo.H(-2110798670, av8Var, new yya(3, num2, str2)), av8Var, 196608 | (i4 & 14), 16);
        } else {
            av8Var.W();
            num2 = num;
            str2 = str;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cs6(xtcVar, num2, str2, i, i2);
        }
    }

    public static final void c(n8b n8bVar, int i, r8b r8bVar, bnf bnfVar, boolean z, xtc xtcVar, boolean z2, Function1 function1, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        n8bVar.getClass();
        r8bVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2124043105);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(n8bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.e(r8bVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.e(bnfVar == null ? -1 : bnfVar.ordinal()) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.h(z) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            i4 |= av8Var.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= av8Var.i(function1) ? 8388608 : 4194304;
        }
        if (av8Var.T(i4 & 1, (4793491 & i4) != 4793490)) {
            tol.b(dh3.n.a(hkg.c0((Context) av8Var.k(nz.b)) ? ema.b : ema.a), yqo.H(-801511391, av8Var, new i44(i, n8bVar, function1, r8bVar, bnfVar, z, z2)), av8Var, 56);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new h47(n8bVar, i, r8bVar, bnfVar, z, xtcVar2, z2, function1, i2);
        }
    }

    public static final void d(n8b n8bVar, boolean z, r8b r8bVar, boolean z2, xtc xtcVar, boolean z3, of3 of3Var, int i) {
        int i2;
        n12 n12Var;
        utc utcVar;
        x6f v6fVar;
        jzg jzgVar;
        x6f v6fVar2;
        jzg jzgVar2;
        x6f v6fVar3;
        jzg jzgVar3;
        boolean z4;
        mv1 mv1Var = uxf.j;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1612960195);
        int i3 = i | (av8Var.g(n8bVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.e(r8bVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z2) ? a.o : 1024) | (av8Var.h(z3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            boolean booleanValue = ((Boolean) av8Var.k(f5a.a)).booleanValue();
            Object O = av8Var.O();
            if (O == nf3.a) {
                if (!booleanValue) {
                    ia0 ia0Var = ia0.q;
                    if (!ok3.p().e().getShowTestRating()) {
                        z4 = false;
                        O = Boolean.valueOf(z4);
                        av8Var.n0(O);
                    }
                }
                z4 = true;
                O = Boolean.valueOf(z4);
                av8Var.n0(O);
            }
            boolean booleanValue2 = ((Boolean) O).booleanValue();
            mv1 mv1Var2 = uxf.c;
            k1c c = e12.c(mv1Var2, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            utc utcVar2 = utc.a;
            xtc l = bkh.l(utcVar2, 40.0f);
            mv1 mv1Var3 = uxf.d;
            n12 n12Var2 = n12.a;
            xtc a = n12Var2.a(l, mv1Var3);
            fk2 fk2Var = n8bVar.o;
            Double d = n8bVar.v;
            Double d2 = n8bVar.f;
            Integer num = n8bVar.p;
            int i4 = n8bVar.t;
            int i5 = n8bVar.s;
            int i6 = n8bVar.r;
            td4.C(n8bVar.a, u6h.C(a, (Intrinsics.c(fk2Var != null ? Boolean.valueOf(fk2Var.b) : null, Boolean.TRUE) && r8bVar == r8b.b) ? 0.34901962f : 1.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 12);
            av8Var = av8Var;
            if (r8bVar == r8b.b) {
                av8Var.d0(-1799462245);
                if (fk2Var == null) {
                    av8Var.d0(-1799556672);
                    av8Var.s(false);
                    i2 = 14;
                    n12Var = n12Var2;
                } else {
                    av8Var.d0(-1799556671);
                    i2 = 14;
                    n12Var = n12Var2;
                    pea.g(new v6f(fk2Var.a, 0L, 14), n12Var2.a(utcVar2, mv1Var2), null, av8Var, 0, 4);
                    Unit unit = Unit.a;
                    av8Var.s(false);
                }
                if (num == null) {
                    av8Var.d0(-1799197506);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1799197505);
                    pea.g(new v6f(num.intValue(), 0L, i2), n12Var.a(utcVar2, uxf.f), null, av8Var, 0, 4);
                    Unit unit2 = Unit.a;
                    av8Var.s(false);
                }
                if (n8bVar.q) {
                    av8Var.d0(-1798833379);
                    utcVar = utcVar2;
                    c5n.c(16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 384, 24, kpg.x(yid.k(d2), av8Var), 0L, av8Var, n12Var.a(utcVar2, uxf.i));
                    av8Var = av8Var;
                    av8Var.s(false);
                } else {
                    utcVar = utcVar2;
                    av8Var.d0(-1798573909);
                    av8Var.s(false);
                }
                if (i6 > 0) {
                    av8Var.d0(-1798472043);
                    xtc a2 = n12Var.a(utcVar, uxf.e);
                    if (z) {
                        av8Var.d0(-1798340200);
                        v6fVar3 = new w6f(String.valueOf(i6), lz.D(R.color.graphics_dark, av8Var));
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1798124223);
                        v6fVar3 = new v6f(R.drawable.ic_goal_incidents, lz.D(R.color.graphics_dark, av8Var), 12);
                        av8Var.s(false);
                    }
                    if (i6 <= 1 || z) {
                        av8Var.d0(-1797596169);
                        av8Var.s(false);
                        jzgVar3 = null;
                    } else {
                        av8Var.d0(-1797809387);
                        jzgVar3 = new jzg(String.valueOf(i6), lz.D(R.color.graphics_dark, av8Var));
                        av8Var.s(false);
                    }
                    pea.g(v6fVar3, a2, jzgVar3, av8Var, 0, 0);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1797514453);
                    av8Var.s(false);
                }
                if (i5 > 0) {
                    av8Var.d0(-1797409208);
                    xtc a3 = n12Var.a(utcVar, uxf.h);
                    if (z) {
                        av8Var.d0(-1797274730);
                        v6fVar2 = new w6f(String.valueOf(i5), lz.D(R.color.graphics_dark, av8Var));
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1797056707);
                        v6fVar2 = new v6f(R.drawable.ic_football_assist_16, lz.D(R.color.graphics_dark, av8Var), 12);
                        av8Var.s(false);
                    }
                    x6f x6fVar = v6fVar2;
                    if (i5 <= 1 || z) {
                        av8Var.d0(-1796520841);
                        av8Var.s(false);
                        jzgVar2 = null;
                    } else {
                        av8Var.d0(-1796735981);
                        jzg jzgVar4 = new jzg(String.valueOf(i5), lz.D(R.color.graphics_dark, av8Var));
                        av8Var.s(false);
                        jzgVar2 = jzgVar4;
                    }
                    pea.g(x6fVar, a3, jzgVar2, av8Var, 0, 0);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1796439125);
                    av8Var.s(false);
                }
                if (i4 > 0) {
                    av8Var.d0(-1796331679);
                    xtc a4 = n12Var.a(utcVar, uxf.k);
                    if (z) {
                        av8Var.d0(-1796196612);
                        v6fVar = new w6f(String.valueOf(i4), lz.D(R.color.error, av8Var));
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1795984789);
                        v6fVar = new v6f(R.drawable.ic_autogoal_16, lz.D(R.color.error, av8Var), 12);
                        av8Var.s(false);
                    }
                    x6f x6fVar2 = v6fVar;
                    if (i4 <= 1 || z) {
                        av8Var.d0(-1795467337);
                        av8Var.s(false);
                        jzgVar = null;
                    } else {
                        av8Var.d0(-1795676711);
                        jzgVar = new jzg(String.valueOf(i4), lz.D(R.color.error, av8Var));
                        av8Var.s(false);
                    }
                    pea.g(x6fVar2, a4, jzgVar, av8Var, 0, 0);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1795385621);
                    av8Var.s(false);
                }
                if (n8bVar.e) {
                    av8Var.d0(-1795322598);
                    av8 av8Var2 = av8Var;
                    xtc a5 = n12Var.a(utcVar, mv1Var);
                    boolean z5 = n8bVar.h;
                    i9a.j(z5 ? n8bVar.g : d2, z5, z2 && !z3, a5, false, false, null, av8Var2, 0, 112);
                    av8Var = av8Var2;
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1794984853);
                    av8Var.s(false);
                }
                if (!booleanValue2 || d == null) {
                    av8Var.d0(-1794751733);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1794902083);
                    h(d.doubleValue(), n12Var.a(utcVar, mv1Var3), av8Var, 0);
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else {
                av8Var.d0(-1794729506);
                a(n8bVar, r8bVar, n12Var2.a(utcVar2, mv1Var), av8Var, (i3 & 14) | ((i3 >> 3) & 112));
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new z8b(n8bVar, z, r8bVar, z2, xtcVar, z3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(x9b x9bVar, boolean z, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        t9b t9bVar;
        t9b t9bVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1931805952);
        int i2 = i | (av8Var.g(x9bVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            u23 a = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtcVar2 = xtcVar;
            xtc C = fqj.C(av8Var, xtcVar2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            w1l.o(1.0f, true, av8Var);
            String str = (x9bVar == null || (t9bVar2 = x9bVar.b) == null) ? null : t9bVar2.b;
            utc utcVar = utc.a;
            if (str == null) {
                if (((x9bVar == null || (t9bVar = x9bVar.c) == null) ? null : t9bVar.b) == null) {
                    av8Var.d0(-953969393);
                    g(null, null, av8Var, 6, 2);
                    av8Var.s(false);
                    if (z) {
                        av8Var.d0(-953707784);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-953899023);
                        f(x9bVar != null ? x9bVar.a : null, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 5), av8Var, 48);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                }
            }
            av8Var.d0(-954387924);
            t9b t9bVar3 = x9bVar.b;
            t9b t9bVar4 = x9bVar.c;
            if (t9bVar3 != null) {
                av8Var.d0(-954343811);
                g(x9bVar.b, null, av8Var, 0, 2);
                av8Var.s(false);
            } else {
                av8Var.d0(-954225608);
                av8Var.s(false);
            }
            if (t9bVar4 != null) {
                av8Var.d0(-954148418);
                g(t9bVar4, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), av8Var, 48, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-953986536);
                av8Var.s(false);
            }
            av8Var.s(false);
            if (z) {
            }
            av8Var.s(true);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60((Object) x9bVar, z, xtcVar2, i, 18);
        }
    }

    public static final void f(Double d, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1693628767);
        int i2 = (av8Var.g(d) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            long f = d != null ? ljg.f(av8Var, -215353299, R.color.on_color_primary, av8Var, false) : ljg.f(av8Var, -215352657, R.color.on_color_secondary, av8Var, false);
            jf9 jf9Var = oyn.e;
            xtc b0 = l98.b0(bkh.e(n9e.q(d2, f, jf9Var), 8.0f), 1.0f);
            l8g a = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (d != null) {
                av8Var.d0(-657080500);
                float a2 = (((float) llf.a(d.doubleValue(), -1.0d, 1.0d)) + 1.0f) / 2.0f;
                if (a2 < 0.07692308f) {
                    a2 = 0.07692308f;
                }
                cdi b = a60.b(a2, null, null, av8Var, 0, 30);
                double doubleValue = d.doubleValue();
                cdi a3 = wih.a(lz.D(doubleValue < -0.5d ? R.color.rating_10 : doubleValue < 0.0d ? R.color.rating_60 : doubleValue < 0.25d ? R.color.rating_65 : doubleValue < 0.5d ? R.color.rating_70 : doubleValue < 0.75d ? R.color.rating_80 : R.color.rating_90, av8Var), null, null, av8Var, 0, 14);
                av8Var = av8Var;
                xtc q = bkh.q(bkh.c(utc.a, 1.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                float floatValue = ((Number) b.getValue()).floatValue();
                if (floatValue <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                if (floatValue > Float.MAX_VALUE) {
                    floatValue = Float.MAX_VALUE;
                }
                nq8.h(av8Var, n9e.q(q.z(new goa(floatValue, true)), ((r13) a3.getValue()).a, jf9Var));
                if (((Number) b.getValue()).floatValue() < 1.0f) {
                    av8Var.d0(-656500366);
                    float floatValue2 = 1.0f - ((Number) b.getValue()).floatValue();
                    if (floatValue2 <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    nq8.h(av8Var, new goa(floatValue2 > Float.MAX_VALUE ? Float.MAX_VALUE : floatValue2, true));
                    av8Var.s(false);
                } else {
                    av8Var.d0(-656387929);
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else {
                av8Var.d0(-656378009);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nw6(d, xtcVar, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(t9b t9bVar, xtc xtcVar, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        av8 av8Var;
        eqf u;
        xtc xtcVar3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1968619080);
        if ((i & 6) == 0) {
            i3 = i | (av8Var2.g(t9bVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? 32 : 16;
            if (av8Var2.T(i3 & 1, (i3 & 19) == 18)) {
                av8Var = av8Var2;
                av8Var.W();
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i4 != 0 ? utcVar : xtcVar2;
                xtc e = bkh.e(xtcVar4, 16.0f);
                if (t9bVar != null) {
                    e = e.z(bkh.d(utcVar, 1.0f));
                }
                long D = lz.D(R.color.on_color_primary, av8Var2);
                jf9 jf9Var = oyn.e;
                xtc e0 = l98.e0(n9e.q(yso.o(e, 1.0f, D, jf9Var), lz.D(R.color.surface_1, av8Var2), jf9Var), 4.0f, 1.0f, t9bVar != null ? 1.0f : 4.0f, 1.0f);
                l8g a = k8g.a(new ng0(2.0f, true, new a70(6)), uxf.m, av8Var2, 54);
                int hashCode = Long.hashCode(av8Var2.T);
                aee m = av8Var2.m();
                xtc C = fqj.C(av8Var2, e0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a, hf3.g);
                waa.K(av8Var2, m, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C, hf3.d);
                if (t9bVar != null) {
                    av8Var2.d0(-1856067280);
                    xtc z = new goa(1.0f, false).z(new nok(uxf.n));
                    String v = oea.v(t9bVar.a, av8Var2);
                    yf8 yf8Var = xth.a;
                    xtcVar3 = xtcVar4;
                    q5a.w(v, z, lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, null, 0L, 2, false, 1, 0, (dfj) xth.l.getValue(), av8Var2, 0, 24960, 110584);
                    String str = t9bVar.b;
                    Regex regex = yid.a;
                    if (str == null) {
                        str = "-";
                    }
                    q5a.w(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.n(), av8Var2, 0, 0, 131066);
                    av8Var = av8Var2;
                    av8Var.s(false);
                } else {
                    xtcVar3 = xtcVar4;
                    av8Var2.d0(-1855474994);
                    yf8 yf8Var2 = xth.a;
                    q5a.w("-", utcVar, lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.n(), av8Var2, 54, 0, 131064);
                    av8Var = av8Var2;
                    av8Var.s(false);
                }
                av8Var.s(true);
                xtcVar2 = xtcVar3;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new wx1(t9bVar, xtcVar2, i, i2, 5);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var2.T(i3 & 1, (i3 & 19) == 18)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void h(double d, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1482053243);
        int i2 = (av8Var2.c(d) ? 4 : 2) | i | (av8Var2.g(xtcVar) ? 32 : 16);
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            xtc c0 = l98.c0(n9e.q(xtcVar, kpg.x(d, av8Var2), oyn.e), 2.0f, 1.0f);
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String valueOf = String.valueOf(d);
            yf8 yf8Var = xth.a;
            udj.c(valueOf, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.n(), av8Var2, 0, 0, 131066);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i17(d, xtcVar, i);
        }
    }

    public static final void i(int i, of3 of3Var, xtc xtcVar, String str) {
        int i2;
        av8 av8Var;
        int i3;
        int i4;
        int i5;
        jf9 jf9Var = oyn.e;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-646325143);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            String str2 = !StringsKt.R(str) ? str : null;
            if (str2 == null) {
                str2 = "—";
            }
            if (StringsKt.R(str)) {
                i4 = 1651801394;
                i5 = R.color.n_lv_3;
            } else {
                i4 = 1651800914;
                i5 = R.color.n_lv_1;
            }
            long f = ljg.f(av8Var2, i4, i5, av8Var2, false);
            xtc c0 = l98.c0(n9e.q(hz8.O(av8Var2) ? xtcVar.z(yso.o(utc.a, 1.0f, f, jf9Var)) : xtcVar, lz.D(R.color.surface_1, av8Var2), jf9Var), !StringsKt.R(str) ? 4.0f : 8.0f, 2.0f);
            yf8 yf8Var = xth.a;
            i3 = 2;
            av8Var = av8Var2;
            udj.c(str2, c0, f, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110584);
        } else {
            av8Var = av8Var2;
            i3 = 2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yi7(str, xtcVar, i, i3);
        }
    }
}
