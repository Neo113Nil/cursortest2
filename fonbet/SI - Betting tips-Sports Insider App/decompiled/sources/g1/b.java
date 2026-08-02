package g1;

import androidx.fragment.app.i0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m4.r;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9703b;

    /* renamed from: c, reason: collision with root package name */
    public int f9704c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f9706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Function2 function2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9703b = i5;
        switch (i5) {
            case 1:
                this.f9706e = (i) function2;
                super(2, continuation);
                break;
            case 2:
                this.f9706e = (i) function2;
                super(2, continuation);
                break;
            default:
                this.f9706e = (i) function2;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f9703b) {
            case 0:
                b bVar = new b(this.f9706e, continuation, 0);
                bVar.f9705d = obj;
                return bVar;
            case 1:
                b bVar2 = new b(this.f9706e, continuation, 1);
                bVar2.f9705d = obj;
                return bVar2;
            default:
                b bVar3 = new b(this.f9706e, continuation, 2);
                bVar3.f9705d = obj;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9703b) {
            case 0:
                return ((b) create((a) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 1:
                return ((b) create((a) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((b) create((r) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r5v14, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r5v20, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9703b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f9704c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    a aVar2 = (a) this.f9705d;
                    this.f9704c = 1;
                    obj = this.f9706e.invoke(aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                a aVar3 = (a) obj;
                Intrinsics.checkNotNull(aVar3, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) aVar3.f9702b.f10430b).set(true);
                return aVar3;
            case 1:
                lf.a aVar4 = lf.a.f20034a;
                int i10 = this.f9704c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar5 = (a) this.f9705d;
                    h8.b.B(obj);
                    return aVar5;
                }
                h8.b.B(obj);
                a aVar6 = new a(n0.j(((a) this.f9705d).a()), false);
                this.f9705d = aVar6;
                this.f9704c = 1;
                return this.f9706e.invoke(aVar6, this) == aVar4 ? aVar4 : aVar6;
            default:
                r rVar = (r) this.f9705d;
                lf.a aVar7 = lf.a.f20034a;
                int i11 = this.f9704c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                int i12 = rVar.f20419a;
                if ((200 > i12 || i12 >= 300) && i12 != 304) {
                    throw new i0("HTTP " + rVar.f20419a);
                }
                this.f9705d = null;
                this.f9704c = 1;
                Object invoke = this.f9706e.invoke(rVar, this);
                return invoke == aVar7 ? aVar7 : invoke;
        }
    }
}
