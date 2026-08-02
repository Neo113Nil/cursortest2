package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.appsflyer.internal.i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.Country;
import com.sofascore.model.newNetwork.AffiliateBanner;
import com.sofascore.results.R;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class g05 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j05 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ g05(int i, j05 j05Var, Function1 function1) {
        this.a = i;
        this.b = j05Var;
        this.c = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x020d, code lost:
    
        if (r11 == r10) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int i2;
        Object obj4;
        boolean z2;
        int i3;
        int i4;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
            u23 a = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
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
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            l8g a2 = k8g.a(ww9.b, uxf.n, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            sha.a(6, 0, av8Var, ljg.g(av8Var, C2, f50Var3, 1.0f, true), "API Branch");
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            j05 j05Var = this.b;
            boolean J = StringsKt.J(j05Var.s, "api.sofascore", false);
            boolean J2 = StringsKt.J(j05Var.s, "master.dev", false);
            xtc l = bkh.l(utcVar, 32.0f);
            n7g n7gVar = o7g.a;
            xtc A = wnn.A(l, n7gVar);
            long f = J ? ljg.f(av8Var, 1522897008, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 1522897802, R.color.surface_2, av8Var, false);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, f, jf9Var);
            Function1 function1 = this.c;
            boolean g = av8Var.g(function1);
            Object O = av8Var.O();
            Object obj5 = nf3.a;
            if (g || O == obj5) {
                O = new ri(16, function1);
                av8Var.n0(O);
            }
            xtc b0 = l98.b0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 6.0f);
            mv1 mv1Var = uxf.c;
            k1c c = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_home, 6, av8Var), null, bkh.l(utcVar, 24.0f), J ? ljg.f(av8Var, -391150607, R.color.on_color_primary, av8Var, false) : ljg.f(av8Var, -391149972, R.color.n_lv_3, av8Var, false), av8Var, 432, 0);
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            xtc A2 = wnn.A(bkh.l(utcVar, 32.0f), n7gVar);
            if (J2) {
                i = 1522931408;
                i2 = R.color.primary_default;
                z = false;
            } else {
                z = false;
                i = 1522932202;
                i2 = R.color.surface_2;
            }
            xtc q2 = n9e.q(A2, ljg.f(av8Var, i, i2, av8Var, z), jf9Var);
            boolean g2 = av8Var.g(function1);
            Object O2 = av8Var.O();
            if (g2) {
                obj4 = obj5;
            } else {
                obj4 = obj5;
            }
            O2 = new ri(17, function1);
            av8Var.n0(O2);
            Object obj6 = obj4;
            xtc b02 = l98.b0(tol.y(q2, false, false, false, 0L, null, (Function0) O2, av8Var, 31), 6.0f);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, b02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            if (J2) {
                i3 = 612461608;
                i4 = R.color.on_color_primary;
                z2 = false;
            } else {
                z2 = false;
                i3 = 612462243;
                i4 = R.color.n_lv_3;
            }
            kq9.b(s6a.N(R.drawable.ic_menu_list_settings, 6, av8Var), null, null, ljg.f(av8Var, i3, i4, av8Var, z2), av8Var, 48, 4);
            av8Var.s(true);
            av8Var.s(true);
            String str = j05Var.s;
            Object O3 = av8Var.O();
            if (O3 == obj6) {
                O3 = new qz4(11);
                av8Var.n0(O3);
            }
            Function1 function12 = (Function1) O3;
            List list = j05Var.q;
            boolean g3 = av8Var.g(function1);
            Object O4 = av8Var.O();
            if (g3 || O4 == obj6) {
                O4 = new vi(17, function1);
                av8Var.n0(O4);
            }
            t62.s("Host", str, function12, list, (Function1) O4, null, t62.c, false, false, av8Var, 1573254, TTAdConstant.PACKAGE_NAME_CODE);
            av8 av8Var2 = av8Var;
            if (j05Var.r) {
                bf3.r(8.0f, 1342081946, av8Var2, av8Var2, utcVar);
                long D = lz.D(R.color.error, av8Var2);
                yf8 yf8Var = xth.a;
                udj.c("There was an error with your auth token. Please try logging in or relaunching the app.", null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 6, 0, 131066);
                av8Var2 = av8Var2;
                av8Var2.s(false);
            } else {
                av8Var2.d0(1342496137);
                av8Var2.s(false);
            }
            av8Var2.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list;
        List H0;
        boolean z;
        int i = this.a;
        Object obj4 = nf3.a;
        utc utcVar = utc.a;
        Function1 function1 = this.c;
        j05 j05Var = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                xpa xpaVar = (xpa) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    un0.a(xpa.a(xpaVar, utcVar, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-608211037, av8Var, new g05(12, j05Var, function1)), av8Var, 196608, 24);
                    final AffiliateBanner affiliateBanner = j05Var.n;
                    if (affiliateBanner == null) {
                        av8Var.d0(1844093415);
                        av8Var.s(false);
                    } else {
                        bf3.r(16.0f, 1844093416, av8Var, av8Var, utcVar);
                        xtc d = bkh.d(utcVar, 1.0f);
                        k1c c = e12.c(uxf.c, false);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, d);
                        if3.k7.getClass();
                        Function0 function0 = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(function0);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c, hf3.g);
                        waa.K(av8Var, m, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C, hf3.d);
                        boolean i3 = av8Var.i(affiliateBanner);
                        Object O = av8Var.O();
                        if (i3 || O == obj4) {
                            final int i4 = 0;
                            O = new Function1() { // from class: i05
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    switch (i4) {
                                        case 0:
                                            Context context = (Context) obj5;
                                            context.getClass();
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.addView(f7a.o(context, affiliateBanner, frameLayout, null, null, null));
                                            return frameLayout;
                                        default:
                                            FrameLayout frameLayout2 = (FrameLayout) obj5;
                                            frameLayout2.getClass();
                                            frameLayout2.removeAllViews();
                                            Context context2 = frameLayout2.getContext();
                                            context2.getClass();
                                            frameLayout2.addView(f7a.o(context2, affiliateBanner, frameLayout2, null, null, null));
                                            return Unit.a;
                                    }
                                }
                            };
                            av8Var.n0(O);
                        }
                        Function1 function12 = (Function1) O;
                        xtc a = n12.a.a(bkh.p(utcVar, affiliateBanner.getWidth()), uxf.g);
                        boolean i5 = av8Var.i(affiliateBanner);
                        Object O2 = av8Var.O();
                        if (i5 || O2 == obj4) {
                            O2 = new Function1() { // from class: i05
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    switch (i2) {
                                        case 0:
                                            Context context = (Context) obj5;
                                            context.getClass();
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.addView(f7a.o(context, affiliateBanner, frameLayout, null, null, null));
                                            return frameLayout;
                                        default:
                                            FrameLayout frameLayout2 = (FrameLayout) obj5;
                                            frameLayout2.getClass();
                                            frameLayout2.removeAllViews();
                                            Context context2 = frameLayout2.getContext();
                                            context2.getClass();
                                            frameLayout2.addView(f7a.o(context2, affiliateBanner, frameLayout2, null, null, null));
                                            return Unit.a;
                                    }
                                }
                            };
                            av8Var.n0(O2);
                        }
                        td4.a(function12, a, (Function1) O2, av8Var, 0, 0);
                        av8Var.s(true);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 19) != 18)) {
                    un0.a(xpa.a(xpaVar2, utcVar, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var2), av8Var2, 0), null, null, yqo.H(-1336782804, av8Var2, new g05(10, j05Var, function1)), av8Var2, 196608, 24);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                xpa xpaVar3 = (xpa) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xpaVar3.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xpaVar3) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(1 & intValue3, (intValue3 & 19) != 18)) {
                    un0.a(xpa.a(xpaVar3, utcVar, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var3), av8Var3, 0), null, null, yqo.H(271893795, av8Var3, new g05(11, j05Var, function1)), av8Var3, 196608, 24);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                xpa xpaVar4 = (xpa) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                xpaVar4.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(xpaVar4) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(1 & intValue4, (intValue4 & 19) != 18)) {
                    un0.a(xpa.a(xpaVar4, utcVar, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var4), av8Var4, 0), null, null, yqo.H(-793073436, av8Var4, new g05(7, j05Var, function1)), av8Var4, 196608, 24);
                } else {
                    av8Var4.W();
                }
                break;
            case 4:
                xpa xpaVar5 = (xpa) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                xpaVar5.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(xpaVar5) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(1 & intValue5, (intValue5 & 19) != 18)) {
                    un0.a(xpa.a(xpaVar5, utcVar, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var5), av8Var5, 0), null, null, yqo.H(-1858040667, av8Var5, new g05(13, j05Var, function1)), av8Var5, 196608, 24);
                } else {
                    av8Var5.W();
                }
                break;
            case 5:
                xpa xpaVar6 = (xpa) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                xpaVar6.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(xpaVar6) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(1 & intValue6, (intValue6 & 19) != 18)) {
                    un0.a(xpa.a(xpaVar6, utcVar, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var6), av8Var6, 0), null, null, yqo.H(1371959398, av8Var6, new g05(8, j05Var, function1)), av8Var6, 196608, 24);
                } else {
                    av8Var6.W();
                }
                break;
            case 6:
                xpa xpaVar7 = (xpa) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                xpaVar7.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var7).g(xpaVar7) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(1 & intValue7, (intValue7 & 19) != 18)) {
                    un0.a(xpa.a(xpaVar7, utcVar, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var7), av8Var7, 0), null, null, yqo.H(306992167, av8Var7, new g05(9, j05Var, function1)), av8Var7, 196608, 24);
                } else {
                    av8Var7.W();
                }
                break;
            case 7:
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    kv1 kv1Var = uxf.p;
                    xtc f0 = l98.f0(l98.d0(gz8.x(bkh.d(utcVar, 1.0f), null, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    u23 a2 = t23.a(ww9.d, kv1Var, av8Var8, 48);
                    int hashCode2 = Long.hashCode(av8Var8.T);
                    aee m2 = av8Var8.m();
                    xtc C2 = fqj.C(av8Var8, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var8.h0();
                    if (av8Var8.S) {
                        av8Var8.l(zg3Var);
                    } else {
                        av8Var8.q0();
                    }
                    waa.K(av8Var8, a2, hf3.g);
                    waa.K(av8Var8, m2, hf3.f);
                    waa.K(av8Var8, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var8, hf3.k);
                    waa.K(av8Var8, C2, hf3.d);
                    sha.a(6, 2, av8Var8, null, "Ads");
                    xk xkVar = j05Var.m;
                    kp5 kp5Var = xk.f;
                    Object O3 = av8Var8.O();
                    if (O3 == obj4) {
                        O3 = new qz4(15);
                        av8Var8.n0(O3);
                    }
                    Function1 function13 = (Function1) O3;
                    boolean g = av8Var8.g(function1);
                    Object O4 = av8Var8.O();
                    if (g || O4 == obj4) {
                        O4 = new vi(21, function1);
                        av8Var8.n0(O4);
                    }
                    t62.s(AndroidInitializeBoldSDK.MSG_NETWORK, xkVar, function13, kp5Var, (Function1) O4, null, null, true, false, av8Var8, 12583302, 352);
                    av8Var8.s(true);
                } else {
                    av8Var8.W();
                }
                break;
            case 8:
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    kv1 kv1Var2 = uxf.p;
                    xtc f02 = l98.f0(l98.d0(gz8.x(bkh.d(utcVar, 1.0f), null, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    u23 a3 = t23.a(ww9.d, kv1Var2, av8Var9, 48);
                    int hashCode3 = Long.hashCode(av8Var9.T);
                    aee m3 = av8Var9.m();
                    xtc C3 = fqj.C(av8Var9, f02);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var9.h0();
                    if (av8Var9.S) {
                        av8Var9.l(zg3Var2);
                    } else {
                        av8Var9.q0();
                    }
                    waa.K(av8Var9, a3, hf3.g);
                    waa.K(av8Var9, m3, hf3.f);
                    waa.K(av8Var9, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var9, hf3.k);
                    waa.K(av8Var9, C3, hf3.d);
                    sha.a(6, 2, av8Var9, null, "Sofa season test IDs");
                    String str = j05Var.z;
                    List list2 = j05Var.y;
                    Object O5 = av8Var9.O();
                    if (O5 == obj4) {
                        O5 = new qz4(8);
                        av8Var9.n0(O5);
                    }
                    Function1 function14 = (Function1) O5;
                    boolean g2 = av8Var9.g(function1);
                    Object O6 = av8Var9.O();
                    if (g2 || O6 == obj4) {
                        O6 = new vi(16, function1);
                        av8Var9.n0(O6);
                    }
                    t62.s("ID", str, function14, list2, (Function1) O6, null, null, false, false, av8Var9, 390, 480);
                    av8Var9.s(true);
                } else {
                    av8Var9.W();
                }
                break;
            case 9:
                of3 of3Var10 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    kv1 kv1Var3 = uxf.p;
                    xtc f03 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    u23 a4 = t23.a(ww9.d, kv1Var3, av8Var10, 48);
                    int hashCode4 = Long.hashCode(av8Var10.T);
                    aee m4 = av8Var10.m();
                    xtc C4 = fqj.C(av8Var10, f03);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var3);
                    } else {
                        av8Var10.q0();
                    }
                    waa.K(av8Var10, a4, hf3.g);
                    waa.K(av8Var10, m4, hf3.f);
                    waa.K(av8Var10, Integer.valueOf(hashCode4), hf3.j);
                    waa.J(av8Var10, hf3.k);
                    waa.K(av8Var10, C4, hf3.d);
                    sha.a(6, 2, av8Var10, null, "Enable display");
                    av8Var10.d0(1629737000);
                    kp5 kp5Var2 = tz4.g;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : kp5Var2) {
                        int ordinal = ((tz4) obj5).ordinal();
                        if (ordinal != 0 ? ordinal != 14 ? true : j05Var.x : j05Var.w) {
                            arrayList.add(obj5);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        tz4 tz4Var = (tz4) it.next();
                        xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                        String str2 = tz4Var.a;
                        boolean c2 = Intrinsics.c((Boolean) j05Var.t.get(tz4Var), Boolean.TRUE);
                        boolean g3 = av8Var10.g(function1) | av8Var10.e(tz4Var.ordinal());
                        Object O7 = av8Var10.O();
                        if (g3 || O7 == obj4) {
                            O7 = new r82(15, function1, tz4Var);
                            av8Var10.n0(O7);
                        }
                        o3a.g(str2, c2, (Function1) O7, d0, null, av8Var10, 3072, 16);
                    }
                    av8Var10.s(false);
                    av8Var10.s(true);
                } else {
                    av8Var10.W();
                }
                break;
            case 10:
                of3 of3Var11 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    kv1 kv1Var4 = uxf.p;
                    xtc f04 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    u23 a5 = t23.a(ww9.d, kv1Var4, av8Var11, 48);
                    int hashCode5 = Long.hashCode(av8Var11.T);
                    aee m5 = av8Var11.m();
                    xtc C5 = fqj.C(av8Var11, f04);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var11.h0();
                    if (av8Var11.S) {
                        av8Var11.l(zg3Var4);
                    } else {
                        av8Var11.q0();
                    }
                    waa.K(av8Var11, a5, hf3.g);
                    waa.K(av8Var11, m5, hf3.f);
                    waa.K(av8Var11, Integer.valueOf(hashCode5), hf3.j);
                    waa.J(av8Var11, hf3.k);
                    waa.K(av8Var11, C5, hf3.d);
                    sha.a(6, 2, av8Var11, null, "Info");
                    String str3 = j05Var.e;
                    String str4 = j05Var.d;
                    String str5 = j05Var.c;
                    String str6 = j05Var.a;
                    String str7 = j05Var.b;
                    String str8 = j05Var.f;
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    String str9 = str3 == null ? "None" : str3;
                    boolean z2 = j05Var.e.length() > 0;
                    boolean g4 = av8Var11.g(function1) | av8Var11.g(j05Var);
                    Object O8 = av8Var11.O();
                    if (g4 || O8 == obj4) {
                        O8 = new vz4(3, j05Var, function1);
                        av8Var11.n0(O8);
                    }
                    k53.H("APP VERSION", str9, (Function0) O8, null, z2, av8Var11, 6);
                    String str10 = str8.length() > 0 ? str8 : null;
                    String str11 = str10 == null ? "None" : str10;
                    boolean z3 = str8.length() > 0;
                    boolean g5 = av8Var11.g(function1) | av8Var11.g(j05Var);
                    Object O9 = av8Var11.O();
                    if (g5 || O9 == obj4) {
                        O9 = new vz4(4, j05Var, function1);
                        av8Var11.n0(O9);
                    }
                    k53.H("DEV MOD", str11, (Function0) O9, null, z3, av8Var11, 6);
                    String str12 = str7.length() > 0 ? str7 : null;
                    String str13 = str12 == null ? "None" : str12;
                    boolean z4 = str7.length() > 0;
                    boolean g6 = av8Var11.g(function1) | av8Var11.g(j05Var);
                    Object O10 = av8Var11.O();
                    if (g6 || O10 == obj4) {
                        O10 = new vz4(5, j05Var, function1);
                        av8Var11.n0(O10);
                    }
                    k53.H("USER ID", str13, (Function0) O10, null, z4, av8Var11, 6);
                    String str14 = str6.length() > 0 ? str6 : null;
                    String str15 = str14 == null ? "None" : str14;
                    boolean z5 = str6.length() > 0;
                    boolean g7 = av8Var11.g(function1) | av8Var11.g(j05Var);
                    Object O11 = av8Var11.O();
                    if (g7 || O11 == obj4) {
                        O11 = new vz4(6, j05Var, function1);
                        av8Var11.n0(O11);
                    }
                    k53.H(IronSourceConstants.TYPE_UUID, str15, (Function0) O11, null, z5, av8Var11, 6);
                    String str16 = str5.length() > 0 ? str5 : null;
                    String str17 = str16 == null ? "None" : str16;
                    boolean z6 = str5.length() > 0;
                    boolean g8 = av8Var11.g(function1) | av8Var11.g(j05Var);
                    Object O12 = av8Var11.O();
                    if (g8 || O12 == obj4) {
                        O12 = new vz4(0, j05Var, function1);
                        av8Var11.n0(O12);
                    }
                    k53.H("PUSH ID", str17, (Function0) O12, null, z6, av8Var11, 6);
                    String str18 = str4.length() > 0 ? str4 : null;
                    String str19 = str18 == null ? "None" : str18;
                    boolean z7 = str4.length() > 0;
                    boolean g9 = av8Var11.g(function1) | av8Var11.g(j05Var);
                    Object O13 = av8Var11.O();
                    if (g9 || O13 == obj4) {
                        O13 = new vz4(1, j05Var, function1);
                        av8Var11.n0(O13);
                    }
                    k53.H("Firebase ID", str19, (Function0) O13, null, z7, av8Var11, 6);
                    String valueOf = String.valueOf(j05Var.B);
                    Object O14 = av8Var11.O();
                    if (O14 == obj4) {
                        O14 = new wc4(11);
                        av8Var11.n0(O14);
                    }
                    k53.H("Used Analyst free trial", valueOf, (Function0) O14, null, false, av8Var11, 24966);
                    av8Var11.s(true);
                } else {
                    av8Var11.W();
                }
                break;
            case 11:
                break;
            case 12:
                of3 of3Var12 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    kv1 kv1Var5 = uxf.p;
                    xtc f05 = l98.f0(l98.d0(gz8.x(bkh.d(utcVar, 1.0f), null, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    u23 a6 = t23.a(ww9.d, kv1Var5, av8Var12, 48);
                    int hashCode6 = Long.hashCode(av8Var12.T);
                    aee m6 = av8Var12.m();
                    xtc C6 = fqj.C(av8Var12, f05);
                    if3.k7.getClass();
                    zg3 zg3Var5 = hf3.b;
                    av8Var12.h0();
                    if (av8Var12.S) {
                        av8Var12.l(zg3Var5);
                    } else {
                        av8Var12.q0();
                    }
                    waa.K(av8Var12, a6, hf3.g);
                    waa.K(av8Var12, m6, hf3.f);
                    waa.K(av8Var12, Integer.valueOf(hashCode6), hf3.j);
                    waa.J(av8Var12, hf3.k);
                    waa.K(av8Var12, C6, hf3.d);
                    sha.a(6, 2, av8Var12, null, "Affiliate banners");
                    AffiliateBanner affiliateBanner2 = j05Var.n;
                    List list3 = f7a.f;
                    if (list3 == null || (H0 = CollectionsKt.H0(list3, new y73(14))) == null || (list = l6g.W(H0)) == null) {
                        list = rlh.b;
                    }
                    List list4 = list;
                    Object O15 = av8Var12.O();
                    if (O15 == obj4) {
                        O15 = new qz4(14);
                        av8Var12.n0(O15);
                    }
                    Function1 function15 = (Function1) O15;
                    boolean g10 = av8Var12.g(function1);
                    Object O16 = av8Var12.O();
                    if (g10 || O16 == obj4) {
                        O16 = new vi(20, function1);
                        av8Var12.n0(O16);
                    }
                    t62.s("Banner", affiliateBanner2, function15, list4, (Function1) O16, null, null, true, false, av8Var12, 12583302, 352);
                    av8Var12.s(true);
                } else {
                    av8Var12.W();
                }
                break;
            default:
                of3 of3Var13 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var13 = (av8) of3Var13;
                if (av8Var13.T(intValue13 & 1, (intValue13 & 17) != 16)) {
                    kv1 kv1Var6 = uxf.p;
                    xtc f06 = l98.f0(l98.d0(gz8.x(bkh.d(utcVar, 1.0f), null, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    u23 a7 = t23.a(ww9.d, kv1Var6, av8Var13, 48);
                    int hashCode7 = Long.hashCode(av8Var13.T);
                    aee m7 = av8Var13.m();
                    xtc C7 = fqj.C(av8Var13, f06);
                    if3.k7.getClass();
                    zg3 zg3Var6 = hf3.b;
                    av8Var13.h0();
                    if (av8Var13.S) {
                        av8Var13.l(zg3Var6);
                    } else {
                        av8Var13.q0();
                    }
                    waa.K(av8Var13, a7, hf3.g);
                    waa.K(av8Var13, m7, hf3.f);
                    waa.K(av8Var13, Integer.valueOf(hashCode7), hf3.j);
                    waa.J(av8Var13, hf3.k);
                    waa.K(av8Var13, C7, hf3.d);
                    sha.a(6, 2, av8Var13, null, "Location");
                    Country country = j05Var.o;
                    List list5 = j05Var.k;
                    Object O17 = av8Var13.O();
                    if (O17 == obj4) {
                        O17 = new qz4(12);
                        av8Var13.n0(O17);
                    }
                    Function1 function16 = (Function1) O17;
                    boolean g11 = av8Var13.g(function1);
                    Object O18 = av8Var13.O();
                    if (g11 || O18 == obj4) {
                        O18 = new vi(18, function1);
                        av8Var13.n0(O18);
                    }
                    t62.s("MCC", country, function16, list5, (Function1) O18, null, t62.d, false, false, av8Var13, 1573254, TTAdConstant.PACKAGE_NAME_CODE);
                    if (country == null) {
                        av8Var13.d0(-1986566671);
                        av8Var13.s(false);
                    } else {
                        av8Var13.d0(-1986566670);
                        if (country.getHasRegions()) {
                            bf3.r(8.0f, -1491861461, av8Var13, av8Var13, utcVar);
                            vuf vufVar = j05Var.p;
                            List list6 = j05Var.l;
                            Object O19 = av8Var13.O();
                            if (O19 == obj4) {
                                O19 = new qz4(13);
                                av8Var13.n0(O19);
                            }
                            Function1 function17 = (Function1) O19;
                            boolean g12 = av8Var13.g(function1);
                            Object O20 = av8Var13.O();
                            if (g12 || O20 == obj4) {
                                O20 = new vi(19, function1);
                                av8Var13.n0(O20);
                            }
                            t62.s("Region", vufVar, function17, list6, (Function1) O20, null, null, false, false, av8Var13, 390, 480);
                            z = false;
                            av8Var13.s(false);
                        } else {
                            z = false;
                            av8Var13.d0(-1491082090);
                            av8Var13.s(false);
                        }
                        av8Var13.s(z);
                    }
                    av8Var13.s(true);
                } else {
                    av8Var13.W();
                }
                break;
        }
        return Unit.a;
    }
}
