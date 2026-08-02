package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bsd implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ bsd(OnboardingViewModel onboardingViewModel, c6d c6dVar, boolean z, ysd ysdVar, Context context, boolean z2, BaseActivity baseActivity, e1d e1dVar, osa osaVar) {
        this.d = onboardingViewModel;
        this.e = c6dVar;
        this.b = z;
        this.f = ysdVar;
        this.g = context;
        this.c = z2;
        this.h = baseActivity;
        this.i = e1dVar;
        this.j = osaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if (r7 == com.sofascore.results.R.color.crowdsourcing_live) goto L15;
     */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xtc r;
        int i;
        int intValue;
        final int intValue2;
        int intValue3;
        String str;
        String str2;
        String str3;
        String str4;
        int i2 = this.a;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.d;
        switch (i2) {
            case 0:
                final OnboardingViewModel onboardingViewModel = (OnboardingViewModel) obj10;
                final c6d c6dVar = (c6d) obj9;
                final ysd ysdVar = (ysd) obj8;
                final Context context = (Context) obj7;
                final BaseActivity baseActivity = (BaseActivity) obj6;
                final e1d e1dVar = (e1d) obj5;
                final osa osaVar = (osa) obj4;
                p3e p3eVar = (p3e) obj;
                of3 of3Var = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                p3eVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var).g(p3eVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = e.f(Boolean.FALSE);
                        av8Var.n0(O);
                    }
                    e1d e1dVar2 = (e1d) O;
                    boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                    xtc xtcVar = utc.a;
                    if (booleanValue) {
                        xtcVar = l98.a0(xtcVar, p3eVar);
                    }
                    xtc xtcVar2 = xtcVar;
                    boolean i3 = av8Var.i(onboardingViewModel) | av8Var.i(c6dVar);
                    Object O2 = av8Var.O();
                    if (i3 || O2 == a99Var) {
                        O2 = new ixa(25, onboardingViewModel, c6dVar);
                        av8Var.n0(O2);
                    }
                    Function0 u = tol.u((Function0) O2, av8Var);
                    av8Var.d0(856410596);
                    gp5 gp5Var = new gp5(0);
                    tc3 H = yqo.H(1073821156, av8Var, new er6(ysdVar, onboardingViewModel, c6dVar, e1dVar2, 22));
                    rg2 rg2Var = rg2.t;
                    lm5 lm5Var = lm5.a;
                    lm5Var.getClass();
                    fuf fufVar = duf.a;
                    gp5Var.a(fufVar.getOrCreateKotlinClass(hsd.class), rg2Var, new dsd(lm5Var, 0), H);
                    Object O3 = av8Var.O();
                    if (O3 == a99Var) {
                        O3 = new a7d(24);
                        av8Var.n0(O3);
                    }
                    Map d = sub.d(new Pair(mx9.e.toString(), (Function1) O3));
                    final boolean z = this.c;
                    gp5Var.a(fufVar.getOrCreateKotlinClass(jsd.class), rg2.u, new oi(d, 13), yqo.H(1124691498, av8Var, new ct8() { // from class: wrd
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                            xtc r2;
                            ysd ysdVar2;
                            of3 of3Var2 = (of3) obj12;
                            int intValue5 = ((Integer) obj13).intValue();
                            ((jsd) obj11).getClass();
                            av8 av8Var2 = (av8) of3Var2;
                            if (av8Var2.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                                r2 = m6k.r(utc.a, "FollowFavoritesTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                                boolean booleanValue2 = ((Boolean) e1dVar.getValue()).booleanValue();
                                OnboardingViewModel onboardingViewModel2 = onboardingViewModel;
                                boolean i4 = av8Var2.i(onboardingViewModel2);
                                Object O4 = av8Var2.O();
                                Object obj14 = nf3.a;
                                if (i4 || O4 == obj14) {
                                    O4 = new asd(onboardingViewModel2, 0);
                                    av8Var2.n0(O4);
                                }
                                Function1 function1 = (Function1) O4;
                                boolean i5 = av8Var2.i(onboardingViewModel2);
                                Object O5 = av8Var2.O();
                                if (i5 || O5 == obj14) {
                                    O5 = new asd(onboardingViewModel2, 1);
                                    av8Var2.n0(O5);
                                }
                                Function1 function12 = (Function1) O5;
                                ysd ysdVar3 = ysd.this;
                                boolean i6 = av8Var2.i(ysdVar3) | av8Var2.i(onboardingViewModel2);
                                Context context2 = context;
                                boolean i7 = i6 | av8Var2.i(context2);
                                boolean z2 = z;
                                boolean h = i7 | av8Var2.h(z2);
                                BaseActivity baseActivity2 = baseActivity;
                                boolean i8 = h | av8Var2.i(baseActivity2);
                                c6d c6dVar2 = c6dVar;
                                boolean i9 = i8 | av8Var2.i(c6dVar2);
                                Object O6 = av8Var2.O();
                                if (i9 || O6 == obj14) {
                                    ysdVar2 = ysdVar3;
                                    Object xrdVar = new xrd(c6dVar2, ysdVar2, context2, baseActivity2, onboardingViewModel2, z2);
                                    av8Var2.n0(xrdVar);
                                    O6 = xrdVar;
                                } else {
                                    ysdVar2 = ysdVar3;
                                }
                                j72.m(ysdVar2, osaVar, booleanValue2, function1, function12, (Function0) O6, r2, av8Var2, 64);
                            } else {
                                av8Var2.W();
                            }
                            return Unit.a;
                        }
                    }));
                    gp5Var.a(fufVar.getOrCreateKotlinClass(isd.class), rg2.v, new dsd(lm5Var, 1), yqo.H(1031794456, av8Var, new a93(onboardingViewModel, z, context, baseActivity, 7)));
                    r82 r82Var = new r82(21, gp5Var, new LinkedHashMap());
                    av8Var.s(false);
                    boolean z2 = this.b;
                    boolean h = av8Var.h(z2);
                    Object O4 = av8Var.O();
                    if (h || O4 == a99Var) {
                        O4 = new c31(z2, 8);
                        av8Var.n0(O4);
                    }
                    Function1 function1 = (Function1) O4;
                    boolean h2 = av8Var.h(z2);
                    Object O5 = av8Var.O();
                    if (h2 || O5 == a99Var) {
                        O5 = new c31(z2, 9);
                        av8Var.n0(O5);
                    }
                    Function1 function12 = (Function1) O5;
                    boolean h3 = av8Var.h(z2);
                    Object O6 = av8Var.O();
                    if (h3 || O6 == a99Var) {
                        O6 = new zj7(z2, 3);
                        av8Var.n0(O6);
                    }
                    r4a.f(c6dVar, xtcVar2, null, u, null, null, null, function1, function12, (Function2) O6, r82Var, av8Var, 0);
                    r = m6k.r(utc.a, "SignInModal", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                    boolean booleanValue2 = ((Boolean) e1dVar2.getValue()).booleanValue();
                    String v = oea.v(R.string.sign_in_to_your_account, av8Var);
                    Object O7 = av8Var.O();
                    if (O7 == a99Var) {
                        O7 = new tra(11, e1dVar2);
                        av8Var.n0(O7);
                    }
                    Function0 function0 = (Function0) O7;
                    boolean i4 = av8Var.i(ysdVar) | av8Var.i(context) | av8Var.i(onboardingViewModel) | av8Var.h(z) | av8Var.i(baseActivity);
                    Object O8 = av8Var.O();
                    if (i4 || O8 == a99Var) {
                        xrd xrdVar = new xrd(context, ysdVar, e1dVar2, onboardingViewModel, z, baseActivity);
                        av8Var.n0(xrdVar);
                        O8 = xrdVar;
                    }
                    g7a.e(booleanValue2, v, function0, (Function0) O8, r, null, av8Var, 384, 32);
                } else {
                    av8Var.W();
                }
                break;
            default:
                String str5 = (String) obj10;
                final jfj jfjVar = (jfj) obj9;
                final jfj jfjVar2 = (jfj) obj8;
                final jfj jfjVar3 = (jfj) obj7;
                final jfj jfjVar4 = (jfj) obj6;
                final jfj jfjVar5 = (jfj) obj5;
                final jfj jfjVar6 = (jfj) obj4;
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((w23) obj).getClass();
                final boolean z3 = this.b;
                boolean z4 = z3 && Intrinsics.c(str5, StatusKt.STATUS_IN_PROGRESS);
                Integer num = jfjVar.b;
                if (num != null) {
                    int intValue5 = num.intValue();
                    i = R.color.crowdsourcing_live;
                    break;
                }
                i = R.color.live;
                final int i5 = i;
                int i6 = R.color.n_lv_3;
                if (z4) {
                    intValue = i5;
                } else {
                    Integer num2 = jfjVar2.b;
                    intValue = num2 != null ? num2.intValue() : R.color.n_lv_3;
                }
                if (z4) {
                    intValue2 = i5;
                } else {
                    Integer num3 = jfjVar3.b;
                    intValue2 = num3 != null ? num3.intValue() : R.color.n_lv_3;
                }
                if (z4) {
                    intValue3 = i5;
                } else {
                    Integer num4 = jfjVar4.b;
                    intValue3 = num4 != null ? num4.intValue() : R.color.n_lv_3;
                }
                if (z4) {
                    i6 = i5;
                } else {
                    Integer num5 = jfjVar5.b;
                    if (num5 != null) {
                        i6 = num5.intValue();
                    }
                }
                final boolean z5 = (!z3 || (str3 = jfjVar2.a) == null || str3.length() == 0 || (str4 = jfjVar3.a) == null || str4.length() == 0) ? false : true;
                boolean z6 = (!z3 || (str = jfjVar4.a) == null || str.length() == 0 || (str2 = jfjVar5.a) == null || str2.length() == 0) ? false : true;
                ty8 ty8Var = ty8.a;
                final boolean z7 = z4;
                final int i7 = intValue;
                nq8.g(nq8.A(ty8Var), 1, 1, yqo.H(-1697926023, of3Var2, new ct8() { // from class: a7l
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj11, Object obj12, Object obj13) {
                        String str6;
                        of3 of3Var3 = (of3) obj12;
                        ((Integer) obj13).getClass();
                        ((o8g) obj11).getClass();
                        boolean z8 = z5;
                        String str7 = z8 ? jfjVar2.a : "";
                        vy8 a = o8g.a();
                        yf8 yf8Var = xth.a;
                        o3a.i(str7, a, cfj.a(l98.j0(xth.k(), Integer.valueOf(i7), of3Var3), new o7j(5)), 0, of3Var3, 0, 8);
                        boolean z9 = z3;
                        jfj jfjVar7 = jfjVar6;
                        if (z9) {
                            str6 = " - ";
                        } else {
                            str6 = jfjVar7.a;
                            if (str6 == null) {
                                str6 = "";
                            }
                        }
                        dfj k = xth.k();
                        int i8 = R.color.n_lv_3;
                        if (!z8) {
                            Integer num6 = jfjVar7.b;
                            if (num6 != null) {
                                i8 = num6.intValue();
                            }
                        } else if (z7) {
                            i8 = i5;
                        }
                        o3a.i(str6, null, l98.j0(k, Integer.valueOf(i8), of3Var3), 0, of3Var3, 0, 10);
                        o3a.i(z8 ? jfjVar3.a : "", o8g.a(), cfj.a(l98.j0(xth.k(), Integer.valueOf(intValue2), of3Var3), new o7j(4)), 0, of3Var3, 0, 8);
                        return Unit.a;
                    }
                }), of3Var2, 3072, 0);
                vy8 A = nq8.A(ty8Var);
                final int i8 = intValue3;
                final boolean z8 = this.c;
                final int i9 = i6;
                final boolean z9 = z6;
                nq8.g(A, 1, 1, yqo.H(-1288484830, of3Var2, new ct8() { // from class: b7l
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj11, Object obj12, Object obj13) {
                        jfj jfjVar7 = jfjVar;
                        Integer num6 = jfjVar7.b;
                        String str6 = jfjVar7.a;
                        of3 of3Var3 = (of3) obj12;
                        ((Integer) obj13).getClass();
                        ((o8g) obj11).getClass();
                        String concat = (!z8 || str6 == null) ? "" : str6.concat(" ");
                        yf8 yf8Var = xth.a;
                        dfj c = xth.c();
                        int i10 = R.color.n_lv_3;
                        o3a.i(concat, null, l98.j0(c, Integer.valueOf(num6 != null ? num6.intValue() : R.color.n_lv_3), of3Var3), 0, of3Var3, 0, 10);
                        boolean z10 = z9;
                        o3a.i(z10 ? jfjVar4.a : "", null, cfj.a(l98.j0(xth.c(), Integer.valueOf(i8), of3Var3), new o7j(5)), 0, of3Var3, 0, 10);
                        if (z10) {
                            str6 = " - ";
                        } else if (str6 == null) {
                            str6 = "-";
                        }
                        String str7 = str6;
                        dfj c2 = xth.c();
                        if (z10) {
                            if (z7) {
                                i10 = R.color.live;
                            }
                        } else if (num6 != null) {
                            i10 = num6.intValue();
                        }
                        o3a.i(str7, null, l98.j0(c2, Integer.valueOf(i10), of3Var3), 0, of3Var3, 0, 10);
                        o3a.i(z10 ? jfjVar5.a : "", null, cfj.a(l98.j0(xth.c(), Integer.valueOf(i9), of3Var3), new o7j(4)), 0, of3Var3, 0, 10);
                        return Unit.a;
                    }
                }), of3Var2, 3072, 0);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bsd(boolean z, String str, jfj jfjVar, jfj jfjVar2, jfj jfjVar3, jfj jfjVar4, jfj jfjVar5, jfj jfjVar6, boolean z2) {
        this.b = z;
        this.d = str;
        this.e = jfjVar;
        this.f = jfjVar2;
        this.g = jfjVar3;
        this.h = jfjVar4;
        this.i = jfjVar5;
        this.j = jfjVar6;
        this.c = z2;
    }
}
