package defpackage;

import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kjm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ n4m s;
    public final /* synthetic */ ilm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjm(n4m n4mVar, ilm ilmVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = n4mVar;
        this.t = ilmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new kjm(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new kjm(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            gim gimVar = this.s.b;
            if (gimVar instanceof gim.d) {
                gim.d dVar = (gim.d) gimVar;
                StoryModel storyModel = dVar.a;
                srl srlVar = dVar.b;
                storyModel.q = storyModel.g.indexOf(srlVar);
                ilm ilmVar = this.t;
                StoriesRepositoryImpl storiesRepositoryImpl = ilmVar.k0;
                String str = srlVar.a;
                Integer j0 = ilmVar.j0();
                String H = ilmVar.H();
                this.r = 1;
                storiesRepositoryImpl.getClass();
                if (StoriesRepositoryImpl.e(storyModel, str, false, j0, H) == lu3Var) {
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
