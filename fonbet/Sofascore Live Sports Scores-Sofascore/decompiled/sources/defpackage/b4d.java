package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.nativead.NativeAd;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class b4d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, AdType.Native r25, wg wgVar, h4d h4dVar, xtc xtcVar, boolean z, Function0 function0, of3 of3Var, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        Function0 function02;
        boolean z3;
        eqf u;
        Function0 function03;
        Object x3dVar;
        Integer num;
        ?? r2;
        r25.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(147737502);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.e(r25.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(wgVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.g(h4dVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            z2 = z;
            i4 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                i4 |= av8Var.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                if (av8Var.T(i4 & 1, (i4 & 599187) != 599186)) {
                    boolean z4 = i6 != 0 ? false : z2;
                    Object obj = nf3.a;
                    if (i5 != 0) {
                        Object O = av8Var.O();
                        if (O == obj) {
                            O = new ivc(5);
                            av8Var.n0(O);
                        }
                        function03 = (Function0) O;
                    } else {
                        function03 = function0;
                    }
                    Context context = (Context) av8Var.k(nz.b);
                    Integer valueOf = Integer.valueOf(i);
                    boolean i7 = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | av8Var.i(context);
                    Object O2 = av8Var.O();
                    if (i7 || O2 == obj) {
                        num = valueOf;
                        r2 = 0;
                        x3dVar = new x3d(h4dVar, context, r25, i, null);
                        av8Var.n0(x3dVar);
                    } else {
                        x3dVar = O2;
                        num = valueOf;
                        r2 = 0;
                    }
                    hz8.o(av8Var, num, (Function2) x3dVar);
                    utc utcVar = utc.a;
                    xtc d = bkh.d(utcVar, 1.0f);
                    if (!z4) {
                        d = d.z(gz8.x(utcVar, s02.h0(400, r2, jg5.a, 2), null, 2));
                    }
                    k1c c = e12.c(uxf.c, r2);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d);
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
                    if (wgVar instanceof ug) {
                        av8Var.d0(151949668);
                        NativeAd nativeAd = ((ug) wgVar).a;
                        String headline = nativeAd.getHeadline();
                        String body = nativeAd.getBody();
                        String callToAction = nativeAd.getCallToAction();
                        String advertiser = nativeAd.getAdvertiser();
                        NativeAd.Image icon = nativeAd.getIcon();
                        pf pfVar = new pf(headline, body, callToAction, advertiser, icon != null ? icon.getDrawable() : null, nativeAd.getMediaContent());
                        int i8 = a4d.a[r25.ordinal()];
                        if (i8 == 1) {
                            av8Var.d0(152066383);
                            b(pfVar, xtcVar, nativeAd, av8Var, (i4 >> 9) & 112);
                            av8Var.s(r2);
                        } else {
                            if (i8 != 2 && i8 != 3) {
                                throw dmi.h(av8Var, -133643419, r2);
                            }
                            av8Var.d0(152361906);
                            c(pfVar, xtcVar, nativeAd, av8Var, (i4 >> 9) & 112);
                            av8Var.s(r2);
                        }
                        av8Var.s(r2);
                    } else if (wgVar == null || wgVar.equals(vg.a)) {
                        av8Var.d0(-133624200);
                        if (z4) {
                            av8Var.d0(152633435);
                            xtc q = n9e.q(wnn.A(xtcVar, o7g.a(16.0f)), lz.D(R.color.n_lv_5, av8Var), oyn.e);
                            q.getClass();
                            e12.a(r2, av8Var, fqj.q(q, new ud3(29)));
                            av8Var.s(r2);
                        } else {
                            av8Var.d0(152863114);
                            av8Var.s(r2);
                        }
                        av8Var.s(r2);
                    } else {
                        if (!wgVar.equals(tg.a)) {
                            throw dmi.h(av8Var, -133646857, r2);
                        }
                        av8Var.d0(-133615154);
                        if (z4) {
                            av8Var.d0(152913861);
                            Unit unit = Unit.a;
                            boolean z5 = (i4 & 3670016) == 1048576 ? true : r2;
                            Object O3 = av8Var.O();
                            if (z5 || O3 == obj) {
                                O3 = new y3d(function03, null);
                                av8Var.n0(O3);
                            }
                            hz8.o(av8Var, unit, (Function2) O3);
                            av8Var.s(r2);
                        } else {
                            av8Var.d0(152980170);
                            av8Var.s(r2);
                        }
                        av8Var.s(r2);
                    }
                    av8Var.s(true);
                    z3 = z4;
                    function02 = function03;
                } else {
                    av8Var.W();
                    function02 = function0;
                    z3 = z2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new a49(i, r25, wgVar, h4dVar, xtcVar, z3, function02, i2, i3);
                    return;
                }
                return;
            }
            if (av8Var.T(i4 & 1, (i4 & 599187) != 599186)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z2 = z;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        if (av8Var.T(i4 & 1, (i4 & 599187) != 599186)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void b(pf pfVar, xtc xtcVar, NativeAd nativeAd, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1768403501);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(pfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(nativeAd) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new clc(13);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new clc(14);
                av8Var.n0(O2);
            }
            Function1 function12 = (Function1) O2;
            boolean i3 = av8Var.i(nativeAd) | ((i2 & 14) == 4);
            Object O3 = av8Var.O();
            if (i3 || O3 == a99Var) {
                O3 = new v3d(pfVar, nativeAd, 0);
                av8Var.n0(O3);
            }
            td4.b(function1, xtcVar, null, function12, (Function1) O3, av8Var, (i2 & 112) | 3078, 4);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w3d(pfVar, xtcVar, nativeAd, i, 0);
        }
    }

    public static final void c(pf pfVar, xtc xtcVar, NativeAd nativeAd, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1196478689);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(pfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(nativeAd) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new clc(15);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new clc(16);
                av8Var.n0(O2);
            }
            Function1 function12 = (Function1) O2;
            boolean i3 = av8Var.i(nativeAd) | ((i2 & 14) == 4);
            Object O3 = av8Var.O();
            if (i3 || O3 == a99Var) {
                O3 = new v3d(pfVar, nativeAd, 1);
                av8Var.n0(O3);
            }
            td4.b(function1, xtcVar, null, function12, (Function1) O3, av8Var, (i2 & 112) | 3078, 4);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w3d(pfVar, xtcVar, nativeAd, i, 1);
        }
    }
}
