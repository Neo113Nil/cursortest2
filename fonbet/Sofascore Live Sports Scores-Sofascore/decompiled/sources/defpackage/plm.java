package defpackage;

import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.shared.results.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class plm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ w3m s;
    public final /* synthetic */ VideoModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plm(w3m w3mVar, VideoModel videoModel, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = w3mVar;
        this.t = videoModel;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new plm(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new plm(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        VideoModel videoModel = this.t;
        if (i == 0) {
            y6a.M(obj);
            w3m w3mVar = this.s;
            qom qomVar = w3mVar.k0;
            String H = w3mVar.H();
            String str = videoModel.id;
            boolean z = videoModel.v;
            this.r = 1;
            obj = qomVar.d(H, str, z, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        if (((a9m) obj) instanceof a6m) {
            m mVar = new m();
            mVar.g = i9a.p("videoId", videoModel.id);
            j1m.a(mVar);
        }
        return Unit.a;
    }
}
