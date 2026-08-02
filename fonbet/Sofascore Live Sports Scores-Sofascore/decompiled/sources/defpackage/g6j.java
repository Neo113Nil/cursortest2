package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class g6j {
    static {
        ypa.b(new z2j(13));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String str2, boolean z, boolean z2, Boolean bool, Function0 function0, of3 of3Var, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        Boolean bool2;
        int i5;
        int i6;
        Function0 function02;
        int i7;
        boolean z5;
        boolean z6;
        Boolean bool3;
        Function0 function03;
        eqf u;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        long f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1510498315);
        int i10 = (av8Var.g(str) ? 4 : 2) | i | (av8Var.g(str2) ? 32 : 16);
        int i11 = i2 & 4;
        if (i11 != 0) {
            i10 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i10 |= av8Var.h(z3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i10 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i10 |= av8Var.h(z4) ? a.o : 1024;
                i4 = i2 & 16;
                if (i4 != 0) {
                    i5 = i10 | 24576;
                    bool2 = bool;
                } else {
                    bool2 = bool;
                    i5 = i10 | (av8Var.g(bool2) ? 16384 : 8192);
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i7 = i5 | 196608;
                    function02 = function0;
                } else {
                    function02 = function0;
                    i7 = i5 | (av8Var.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
                }
                if (av8Var.T(i7 & 1, (74899 & i7) != 74898)) {
                    if (i11 != 0) {
                        z3 = false;
                    }
                    boolean z9 = i3 != 0 ? false : z4;
                    Boolean bool4 = i4 != 0 ? null : bool2;
                    Function0 function04 = i6 == 0 ? function02 : null;
                    av8Var.d0(-110056339);
                    utc utcVar = utc.a;
                    xtc d = bkh.d(utcVar, 1.0f);
                    if (function04 != null) {
                        boolean z10 = (458752 & i7) == 131072;
                        Object O = av8Var.O();
                        if (z10 || O == nf3.a) {
                            O = new rsd(14, function04);
                            av8Var.n0(O);
                        }
                        i8 = i7;
                        z7 = false;
                        xtc y = tol.y(utcVar, false, false, false, 0L, null, (Function0) O, av8Var, 31);
                        av8Var = av8Var;
                        d = d.z(y);
                    } else {
                        i8 = i7;
                        z7 = false;
                    }
                    av8Var.s(z7);
                    xtc c0 = l98.c0(bkh.g(d, 36.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f, 8.0f);
                    kg0 kg0Var = ww9.h;
                    lv1 lv1Var = uxf.m;
                    l8g a = k8g.a(kg0Var, lv1Var, av8Var, 54);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    boolean z11 = z9;
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    xtc f0 = l98.f0(bkh.d(utcVar, 0.4f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                    wxf wxfVar = ww9.b;
                    Function0 function05 = function04;
                    l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                    boolean z12 = z3;
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, f0);
                    av8Var.h0();
                    Boolean bool5 = bool4;
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    yf8 yf8Var = xth.a;
                    av8 av8Var2 = av8Var;
                    udj.c(str, goaVar, z12 ? ljg.f(av8Var, -734153946, R.color.primary_default, av8Var, false) : ljg.f(av8Var, -734153156, R.color.n_lv_1, av8Var, false), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, z12 ? xth.l() : xth.e(), av8Var2, i8 & 14, 24960, 110584);
                    if (z12) {
                        ljg.r(4.0f, -1283767979, av8Var2, av8Var2, utcVar);
                        kq9.b(s6a.N(R.drawable.ic_external_link_16, 6, av8Var2), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var2), av8Var2, 432, 0);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-1283435473);
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                    l8g a3 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, utcVar);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a3, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    if (bool5 == null) {
                        av8Var2.d0(1956053340);
                        av8Var2.s(false);
                        i9 = 6;
                    } else {
                        av8Var2.d0(1956053341);
                        xtc v = haa.v(bkh.l(utcVar, 16.0f), bool5.booleanValue() ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i9 = 6;
                        ImageVector N = s6a.N(R.drawable.ic_arrow_drop_down_16, 6, av8Var2);
                        if (bool5.booleanValue()) {
                            z8 = false;
                            f = ljg.f(av8Var2, 1130445593, R.color.success, av8Var2, false);
                        } else {
                            z8 = false;
                            f = ljg.f(av8Var2, 1130446167, R.color.error, av8Var2, false);
                        }
                        kq9.b(N, null, v, f, av8Var2, 48, 0);
                        bf3.u(utcVar, 4.0f, av8Var2, z8);
                    }
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    udj.c(str2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), z11 ? ljg.f(av8Var2, -1876541251, R.color.primary_default, av8Var2, false) : ljg.f(av8Var2, -1876540461, R.color.n_lv_1, av8Var2, false), null, 0L, null, 0L, null, new p7j(i9), 0L, 2, false, 2, 0, null, z11 ? xth.l() : xth.e(), av8Var2, (i8 >> 3) & 14, 24960, 109560);
                    av8Var = av8Var2;
                    if (z11) {
                        ljg.r(4.0f, 1956974072, av8Var, av8Var, utcVar);
                        kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, i9, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1957312344);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    av8Var.s(true);
                    z6 = z11;
                    function03 = function05;
                    z5 = z12;
                    bool3 = bool5;
                } else {
                    av8Var.W();
                    z5 = z3;
                    z6 = z4;
                    bool3 = bool2;
                    function03 = function02;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new g25(str, str2, z5, z6, bool3, function03, i, i2);
                    return;
                }
                return;
            }
            z4 = z2;
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            if (av8Var.T(i7 & 1, (74899 & i7) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z3 = z;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        z4 = z2;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        if (av8Var.T(i7 & 1, (74899 & i7) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void b(gv9 gv9Var, of3 of3Var, int i) {
        eqf u;
        np9 np9Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1231304944);
        int i2 = 4;
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i;
        if (!av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            av8Var.W();
        } else {
            if (gv9Var.isEmpty()) {
                u = av8Var.u();
                if (u != null) {
                    np9Var = new np9(i, 3, gv9Var);
                    u.d = np9Var;
                }
                return;
            }
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.f(CollectionsKt.Y(gv9Var));
                av8Var.n0(O);
            }
            un0.a(bkh.d(l98.c0(utc.a, 8.0f, 4.0f), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(1918748990, av8Var, new e6i(10, gv9Var, (e1d) O)), av8Var, 196614, 24);
        }
        u = av8Var.u();
        if (u != null) {
            np9Var = new np9(i, i2, gv9Var);
            u.d = np9Var;
        }
    }
}
