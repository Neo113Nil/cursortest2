package defpackage;

import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rfm extends hoi implements Function2 {
    public final /* synthetic */ lom r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfm(lom lomVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = lomVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new rfm(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rfm(this.r, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        lom lomVar = this.r;
        lomVar.getClass();
        StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
        String w = lomVar.w();
        storiesRepositoryImpl.getClass();
        lomVar.m(StoriesRepositoryImpl.o(w));
        return Unit.a;
    }
}
