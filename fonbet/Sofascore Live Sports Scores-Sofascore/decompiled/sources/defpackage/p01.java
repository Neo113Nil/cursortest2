package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.sofascore.results.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p01 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ MainActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p01(MainActivity mainActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = mainActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        MainActivity mainActivity = this.t;
        switch (i) {
            case 0:
                return new p01(mainActivity, rq3Var, 0);
            default:
                return new p01(mainActivity, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((p01) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        SharedPreferences d;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    ia0 ia0Var = ia0.q;
                    bfk g = ok3.p().g();
                    this.s = 1;
                    if (g.d(this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                vha.L(this.t);
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    if (!Intrinsics.c(this.t.z().d.d(), u0f.h)) {
                        MainActivity mainActivity = this.t;
                        if (Build.VERSION.SDK_INT >= 33) {
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = mainActivity.getApplicationContext();
                                synchronized (uic.i) {
                                    sharedPreferences = a5f.d(applicationContext);
                                    uic.j = sharedPreferences;
                                }
                                sharedPreferences.getClass();
                            }
                            boolean z = sharedPreferences.getBoolean("PREF_NOTIFICATION_PERMISSION", false);
                            boolean z2 = eq3.b(mainActivity, "android.permission.POST_NOTIFICATIONS") == 0;
                            if (!z && !z2) {
                                zqb V = this.t.V();
                                this.s = 1;
                                obj = V.g.n(this);
                                if (obj == lu3Var2) {
                                    return lu3Var2;
                                }
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                if (((Boolean) obj).booleanValue()) {
                    p4h.t(this.t, false, null, null, 60);
                    MainActivity mainActivity2 = this.t;
                    SharedPreferences sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext2 = mainActivity2.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext2);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences2 = d;
                    }
                    SharedPreferences.Editor i3 = dmi.i(sharedPreferences2, "PREF_NOTIFICATION_PERMISSION", true);
                    Unit unit = Unit.a;
                    i3.apply();
                }
                return Unit.a;
        }
    }
}
