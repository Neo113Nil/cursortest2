package defpackage;

import android.content.Context;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class x64 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x64(tee teeVar, old oldVar, boolean z, wla wlaVar, xtc xtcVar, Function1 function1, int i) {
        this.a = 8;
        this.d = teeVar;
        this.e = oldVar;
        this.b = z;
        this.f = wlaVar;
        this.c = xtcVar;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.a;
        a99 a99Var = nf3.a;
        Object obj3 = this.c;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                o02.B(aba.K(3073), (of3) obj, (xtc) obj3, (String) obj7, (String) obj6, (Function0) obj5, (Function0) obj4, this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                yqo.d((vnb) obj7, (Function1) obj6, this.b, (ct8) obj5, (Function2) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                hkg.h((gk7) obj7, (Function1) obj6, (Function1) obj4, (Function0) obj5, this.b, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                z8e.g((String) obj7, (String) obj6, (String) obj4, this.b, (Function0) obj5, (xtc) obj3, (of3) obj, aba.K(196609));
                break;
            case 4:
                wz9 wz9Var = (wz9) obj7;
                Context context = (Context) obj6;
                h0a h0aVar = (h0a) obj3;
                Function0 function0 = (Function0) obj5;
                Function0 function02 = (Function0) obj4;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean z = this.b;
                    boolean h = av8Var.h(z) | av8Var.i(context) | av8Var.g(h0aVar) | av8Var.g(function0) | av8Var.g(function02);
                    Object O = av8Var.O();
                    if (h || O == a99Var) {
                        tb7 tb7Var = new tb7(1, context, h0aVar, function0, function02, z);
                        av8Var.n0(tb7Var);
                        O = tb7Var;
                    }
                    nz9.g(wz9Var, z, (Function0) O, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                sha.k((mwb) obj7, (w3f) obj6, this.b, (Function1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 6:
                ysd ysdVar = (ysd) obj7;
                OnboardingViewModel onboardingViewModel = (OnboardingViewModel) obj6;
                c6d c6dVar = (c6d) obj5;
                Context context2 = (Context) obj4;
                BaseActivity baseActivity = (BaseActivity) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int i4 = ysdVar.a;
                    boolean z2 = ysdVar.b;
                    boolean i5 = av8Var2.i(onboardingViewModel) | av8Var2.i(c6dVar);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new csd(onboardingViewModel, c6dVar);
                        av8Var2.n0(O2);
                    }
                    Function0 function03 = (Function0) ((KFunction) O2);
                    boolean i6 = av8Var2.i(onboardingViewModel);
                    boolean z3 = this.b;
                    boolean h2 = av8Var2.h(z3) | i6 | av8Var2.i(context2) | av8Var2.i(baseActivity);
                    Object O3 = av8Var2.O();
                    if (h2 || O3 == a99Var) {
                        yrd yrdVar = new yrd(onboardingViewModel, z3, context2, baseActivity, 0);
                        av8Var2.n0(yrdVar);
                        O3 = yrdVar;
                    }
                    fsd.c(i4, 0, av8Var2, function03, (Function0) O3, z2);
                } else {
                    av8Var2.W();
                }
                break;
            case 7:
                ksa ksaVar = (ksa) obj7;
                b3l b3lVar = (b3l) obj6;
                l3l l3lVar = (l3l) obj4;
                Function1 function1 = (Function1) obj3;
                Function0 function04 = (Function0) obj5;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    xtc c = bkh.c(utc.a, 1.0f);
                    boolean z4 = this.b;
                    if (z4) {
                        i = 612419632;
                        i2 = R.color.surface_0;
                    } else {
                        i = 612420240;
                        i2 = R.color.surface_1;
                    }
                    xtc q = n9e.q(c, ljg.f(av8Var3, i, i2, av8Var3, false), oyn.e);
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z4 ? 8.0f : 64.0f, 7);
                    boolean h3 = av8Var3.h(z4) | av8Var3.i(b3lVar) | av8Var3.i(l3lVar) | av8Var3.g(function1) | av8Var3.g(function04);
                    Object O4 = av8Var3.O();
                    if (h3 || O4 == a99Var) {
                        b05 b05Var = new b05(z4, b3lVar, l3lVar, function1, function04);
                        av8Var3.n0(b05Var);
                        O4 = b05Var;
                    }
                    v8a.a(q, ksaVar, C, null, null, null, false, null, (Function1) O4, av8Var3, 0, PglCryptUtils.BASE64_FAILED);
                } else {
                    av8Var3.W();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                i2a.o((tee) obj7, (old) obj6, this.b, (wla) obj5, (xtc) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                g7a.m(this.b, (String) obj7, (gv9) obj6, (uv3) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x64(wz9 wz9Var, boolean z, Context context, h0a h0aVar, Function0 function0, Function0 function02) {
        this.a = 4;
        this.d = wz9Var;
        this.b = z;
        this.e = context;
        this.c = h0aVar;
        this.f = function0;
        this.g = function02;
    }

    public /* synthetic */ x64(c6d c6dVar, ysd ysdVar, Context context, BaseActivity baseActivity, OnboardingViewModel onboardingViewModel, boolean z) {
        this.a = 6;
        this.d = ysdVar;
        this.e = onboardingViewModel;
        this.f = c6dVar;
        this.b = z;
        this.g = context;
        this.c = baseActivity;
    }

    public /* synthetic */ x64(gk7 gk7Var, Function1 function1, Function1 function12, Function0 function0, boolean z, xtc xtcVar, int i) {
        this.a = 2;
        this.d = gk7Var;
        this.e = function1;
        this.g = function12;
        this.f = function0;
        this.b = z;
        this.c = xtcVar;
    }

    public /* synthetic */ x64(Object obj, Object obj2, boolean z, dt8 dt8Var, dt8 dt8Var2, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.f = dt8Var;
        this.g = dt8Var2;
        this.c = xtcVar;
    }

    public /* synthetic */ x64(String str, String str2, String str3, boolean z, Function0 function0, xtc xtcVar, int i) {
        this.a = 3;
        this.d = str;
        this.e = str2;
        this.g = str3;
        this.b = z;
        this.f = function0;
        this.c = xtcVar;
    }

    public /* synthetic */ x64(boolean z, ksa ksaVar, b3l b3lVar, l3l l3lVar, Function1 function1, Function0 function0) {
        this.a = 7;
        this.b = z;
        this.d = ksaVar;
        this.e = b3lVar;
        this.g = l3lVar;
        this.c = function1;
        this.f = function0;
    }

    public /* synthetic */ x64(boolean z, String str, Object obj, Object obj2, dt8 dt8Var, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = str;
        this.e = obj;
        this.f = obj2;
        this.g = dt8Var;
        this.c = xtcVar;
    }
}
