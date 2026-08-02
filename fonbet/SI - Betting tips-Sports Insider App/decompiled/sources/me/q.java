package me;

import com.sports.insider.ui.prediction.PredictionFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20674b;

    /* renamed from: c, reason: collision with root package name */
    public int f20675c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PredictionFragment f20676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nc.c f20677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(PredictionFragment predictionFragment, nc.c cVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20674b = i5;
        this.f20676d = predictionFragment;
        this.f20677e = cVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20674b) {
            case 0:
                return new q(this.f20676d, this.f20677e, continuation, 0);
            default:
                return new q(this.f20676d, this.f20677e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20674b) {
        }
        return ((q) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f20674b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f20675c;
                PredictionFragment predictionFragment = this.f20676d;
                if (i5 == 0) {
                    h8.b.B(obj);
                    nc.c cVar = this.f20677e;
                    List games = cVar != null ? cVar.getGames() : null;
                    this.f20675c = 1;
                    obj = PredictionFragment.H(predictionFragment, games, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                List<ve.c0> list = (List) obj;
                ec.x xVar = (ec.x) predictionFragment.f22459a;
                if (xVar != null) {
                    xVar.f9045f.setGames(list);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f20675c;
                PredictionFragment predictionFragment2 = this.f20676d;
                if (i10 == 0) {
                    h8.b.B(obj);
                    nc.c cVar2 = this.f20677e;
                    List games2 = cVar2 != null ? cVar2.getGames() : null;
                    this.f20675c = 1;
                    obj = PredictionFragment.H(predictionFragment2, games2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                List<ve.c0> list2 = (List) obj;
                ec.x xVar2 = (ec.x) predictionFragment2.f22459a;
                if (xVar2 != null) {
                    xVar2.f9046g.setGames(list2);
                }
                return Unit.f19194a;
        }
    }
}
