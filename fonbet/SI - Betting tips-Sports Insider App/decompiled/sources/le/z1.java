package le;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20030b;

    /* renamed from: c, reason: collision with root package name */
    public int f20031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2 f20032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f20033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(f2 f2Var, Activity activity, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20030b = i5;
        this.f20032d = f2Var;
        this.f20033e = activity;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20030b) {
            case 0:
                return new z1(this.f20032d, this.f20033e, continuation, 0);
            default:
                return new z1(this.f20032d, this.f20033e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20030b) {
        }
        return ((z1) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f20030b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f20031c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f20031c = 1;
                    if (this.f20032d.f(this.f20033e, this) == aVar) {
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
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f20031c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f20031c = 1;
                    if (this.f20032d.f(this.f20033e, this) == aVar2) {
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
