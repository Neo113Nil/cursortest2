package ve;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24555b;

    /* renamed from: c, reason: collision with root package name */
    public int f24556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdaptedFunctionReference f24557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(int i5, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.f24555b = i5;
        switch (i5) {
            case 1:
                this.f24557d = (AdaptedFunctionReference) function1;
                super(2, continuation);
                break;
            case 2:
                this.f24557d = (AdaptedFunctionReference) function1;
                super(2, continuation);
                break;
            case 3:
                this.f24557d = (AdaptedFunctionReference) function1;
                super(2, continuation);
                break;
            case 4:
                this.f24557d = (AdaptedFunctionReference) function1;
                super(2, continuation);
                break;
            case 5:
                this.f24557d = (AdaptedFunctionReference) function1;
                super(2, continuation);
                break;
            case 6:
                this.f24557d = (AdaptedFunctionReference) function1;
                super(2, continuation);
                break;
            case 7:
                this.f24557d = (AdaptedFunctionReference) function1;
                super(2, continuation);
                break;
            case 8:
                this.f24557d = (AdaptedFunctionReference) function1;
                super(2, continuation);
                break;
            case 9:
                this.f24557d = (AdaptedFunctionReference) function1;
                super(2, continuation);
                break;
            default:
                this.f24557d = (AdaptedFunctionReference) function1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f24555b) {
            case 0:
                return new a(0, continuation, this.f24557d);
            case 1:
                return new a(1, continuation, this.f24557d);
            case 2:
                return new a(2, continuation, this.f24557d);
            case 3:
                return new a(3, continuation, this.f24557d);
            case 4:
                return new a(4, continuation, this.f24557d);
            case 5:
                return new a(5, continuation, this.f24557d);
            case 6:
                return new a(6, continuation, this.f24557d);
            case 7:
                return new a(7, continuation, this.f24557d);
            case 8:
                return new a(8, continuation, this.f24557d);
            default:
                return new a(9, continuation, this.f24557d);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f24555b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r4v13, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r4v21, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r4v25, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r4v29, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r4v33, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r4v37, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24555b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f24556c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke = this.f24557d.invoke(this);
                return invoke == aVar ? aVar : invoke;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f24556c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke2 = this.f24557d.invoke(this);
                return invoke2 == aVar2 ? aVar2 : invoke2;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f24556c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke3 = this.f24557d.invoke(this);
                return invoke3 == aVar3 ? aVar3 : invoke3;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i12 = this.f24556c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke4 = this.f24557d.invoke(this);
                return invoke4 == aVar4 ? aVar4 : invoke4;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i13 = this.f24556c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke5 = this.f24557d.invoke(this);
                return invoke5 == aVar5 ? aVar5 : invoke5;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i14 = this.f24556c;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke6 = this.f24557d.invoke(this);
                return invoke6 == aVar6 ? aVar6 : invoke6;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i15 = this.f24556c;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke7 = this.f24557d.invoke(this);
                return invoke7 == aVar7 ? aVar7 : invoke7;
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                int i16 = this.f24556c;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke8 = this.f24557d.invoke(this);
                return invoke8 == aVar8 ? aVar8 : invoke8;
            case 8:
                lf.a aVar9 = lf.a.f20034a;
                int i17 = this.f24556c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke9 = this.f24557d.invoke(this);
                return invoke9 == aVar9 ? aVar9 : invoke9;
            default:
                lf.a aVar10 = lf.a.f20034a;
                int i18 = this.f24556c;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24556c = 1;
                Object invoke10 = this.f24557d.invoke(this);
                return invoke10 == aVar10 ? aVar10 : invoke10;
        }
    }
}
