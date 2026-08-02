package defpackage;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ma0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ma0(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                ((f4g) obj).b(((Number) function0.invoke()).floatValue());
                return Unit.a;
            case 1:
                wq2 wq2Var = (wq2) obj;
                wq2Var.getClass();
                if (Intrinsics.c(wq2Var, wq2.a)) {
                    function0.invoke();
                    return Unit.a;
                }
                zzl.b();
                return null;
            case 2:
                function0.invoke();
                return Unit.a;
            case 3:
                MotionEvent motionEvent = (MotionEvent) obj;
                motionEvent.getClass();
                if (motionEvent.getAction() == 0 && function0 != null) {
                    function0.invoke();
                }
                return Boolean.FALSE;
            case 4:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                motionEvent2.getClass();
                if (motionEvent2.getAction() == 0 && function0 != null) {
                    function0.invoke();
                }
                return Boolean.FALSE;
            case 5:
                function0.invoke();
                return Unit.a;
            case 6:
                function0.invoke();
                return Unit.a;
            case 7:
                function0.invoke();
                return Unit.a;
            case 8:
                function0.invoke();
                return Unit.a;
            case 9:
                ((rw0) obj).getClass();
                function0.invoke();
                return Unit.a;
            case 10:
                ((Integer) obj).intValue();
                function0.invoke();
                return Unit.a;
            case 11:
                function0.invoke();
                return Unit.a;
            case 12:
                function0.invoke();
                return Unit.a;
            case 13:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return Unit.a;
            case 14:
                b4h b4hVar = (b4h) obj;
                Object invoke = function0.invoke();
                Float f2 = (Float) (Float.isNaN(((Number) invoke).floatValue()) ? null : invoke);
                if (f2 != null) {
                    f = f2.floatValue();
                }
                y3h.i(b4hVar, new dcf(f, new lz2(1.0f)));
                return Unit.a;
            case 15:
                b4h b4hVar2 = (b4h) obj;
                Object invoke2 = function0.invoke();
                Float f3 = (Float) (Float.isNaN(((Number) invoke2).floatValue()) ? null : invoke2);
                if (f3 != null) {
                    f = f3.floatValue();
                }
                y3h.i(b4hVar2, new dcf(f, new lz2(1.0f)));
                return Unit.a;
            case 16:
                ((glg) obj).getClass();
                return function0.invoke();
            case 17:
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                float j = f4gVar.s.j() * fyg.a;
                f4gVar.b(llf.b(1.0f - ((j > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? llf.b(Math.abs(((Number) function0.invoke()).floatValue()) / j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) : 0.0f) / 0.33f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                return Unit.a;
            case 18:
                obj.getClass();
                return function0.invoke();
            case 19:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) function0.invoke()).floatValue());
            default:
                return (dnd) function0.invoke();
        }
    }
}
