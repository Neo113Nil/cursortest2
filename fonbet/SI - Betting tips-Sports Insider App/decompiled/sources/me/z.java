package me;

import com.sports.insider.data.entity.prediction.GamesInfoData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20699b;

    /* renamed from: c, reason: collision with root package name */
    public int f20700c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f20702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(c0 c0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20699b = i5;
        this.f20702e = c0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20699b) {
            case 0:
                z zVar = new z(this.f20702e, continuation, 0);
                zVar.f20701d = obj;
                return zVar;
            default:
                z zVar2 = new z(this.f20702e, continuation, 1);
                zVar2.f20701d = obj;
                return zVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20699b) {
            case 0:
                return ((z) create((kc.b) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((z) create((GamesInfoData) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f20699b) {
            case 0:
                kc.b bVar = (kc.b) this.f20701d;
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f20700c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f20701d = null;
                    this.f20700c = 1;
                    if (this.f20702e.j(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                GamesInfoData gamesInfoData = (GamesInfoData) this.f20701d;
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f20700c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f20701d = null;
                    this.f20700c = 1;
                    if (c0.e(this.f20702e, gamesInfoData, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
