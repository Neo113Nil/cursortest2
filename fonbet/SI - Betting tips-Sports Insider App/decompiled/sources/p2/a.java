package p2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21446b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f21448d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i5, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.f21446b = i5;
        this.f21448d = function1;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21446b) {
            case 0:
                a aVar = new a(0, continuation, this.f21448d);
                aVar.f21447c = obj;
                return aVar;
            case 1:
                a aVar2 = new a(1, continuation, this.f21448d);
                aVar2.f21447c = obj;
                return aVar2;
            default:
                a aVar3 = new a(this.f21448d, continuation);
                aVar3.f21447c = obj;
                return aVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21446b) {
            case 0:
                return ((a) create((m2.l) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 1:
                return ((a) create((m2.l) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((a) create((g1.a) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f21446b;
        Function1 function1 = this.f21448d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                m2.l lVar = (m2.l) this.f21447c;
                Intrinsics.checkNotNull(lVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return function1.invoke(lVar.d());
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                m2.l lVar2 = (m2.l) this.f21447c;
                Intrinsics.checkNotNull(lVar2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return function1.invoke(lVar2.d());
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                function1.invoke((g1.a) this.f21447c);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f21446b = 2;
        this.f21448d = function1;
    }
}
