package defpackage;

import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import defpackage.x8m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class chm extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ ImaPresenterActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chm(ImaPresenterActivity imaPresenterActivity, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = imaPresenterActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new chm(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new chm(this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            ImaPresenterActivity imaPresenterActivity = this.s;
            x8m.a aVar = ((x8m) imaPresenterActivity.m.getValue()).q;
            if (aVar != null) {
                ncm ncmVar = new ncm(imaPresenterActivity);
                this.r = 1;
                if (aVar.collect(ncmVar, this) == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
