package defpackage;

import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zrl extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ lom s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrl(lom lomVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = lomVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new zrl(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new zrl(this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            lom lomVar = this.s;
            lomVar.getClass();
            StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
            String w = lomVar.w();
            this.r = 1;
            storiesRepositoryImpl.getClass();
            if (StoriesRepositoryImpl.m(w) == lu3Var) {
                return lu3Var;
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
