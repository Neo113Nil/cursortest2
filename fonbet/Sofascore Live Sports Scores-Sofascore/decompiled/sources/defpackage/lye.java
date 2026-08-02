package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lye extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ TextView t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lye(TextView textView, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = textView;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        TextView textView = this.t;
        switch (i) {
            case 0:
                return new lye(textView, rq3Var, 0);
            default:
                return new lye(textView, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lye) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(400L, this) == lu3Var) {
                        break;
                    }
                } else if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                TextView textView = this.t;
                tgj.D(textView, 400L, accelerateDecelerateInterpolator, textView.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new Float(textView.getAlpha()) : null, true);
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(400L, this) == lu3Var2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                tgj.E(this.t, 400L, new AccelerateDecelerateInterpolator(), 4);
                break;
        }
        return Unit.a;
    }
}
