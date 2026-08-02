package j3;

import Sc.C4005g;
import j3.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "androidx.media3.common.PlayerExtensionsKt$listen$2", f = "PlayerExtensions.kt", l = {50}, m = "invokeSuspend")
/* renamed from: j3.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7245A extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<?>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f68922d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ y f68923e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function2<y, y.b, Unit> f68924f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C7245A(y yVar, Function2<? super y, ? super y.b, Unit> function2, kotlin.coroutines.d<? super C7245A> dVar) {
        super(2, dVar);
        this.f68923e = yVar;
        this.f68924f = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7245A(this.f68923e, this.f68924f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<?> dVar) {
        return ((C7245A) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a c11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f68922d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f68922d = 1;
            c11 = C7248D.c(this.f68923e, this.f68924f, this);
            if (c11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
