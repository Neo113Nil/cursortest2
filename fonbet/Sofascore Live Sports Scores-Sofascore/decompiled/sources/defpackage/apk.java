package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class apk extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Activity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apk(Activity activity, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = activity;
        this.s = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Activity activity = this.t;
        boolean z = this.s;
        switch (i) {
            case 0:
                return new apk(activity, z, rq3Var);
            default:
                return new apk(z, activity, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((apk) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Window window;
        int i = this.r;
        Activity activity = this.t;
        boolean z = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (activity != null && (window = activity.getWindow()) != null) {
                    bka bkaVar = new bka(window.getDecorView());
                    int i2 = Build.VERSION.SDK_INT;
                    pea aalVar = i2 >= 35 ? new aal(window, bkaVar) : i2 >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
                    aalVar.D();
                    if (z) {
                        aalVar.x(519);
                    } else {
                        aalVar.E(519);
                    }
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (z) {
                    i0.b(activity);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apk(boolean z, Activity activity, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = z;
        this.t = activity;
    }
}
