package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9113N;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {804}, m = "invokeSuspend")
/* renamed from: r0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9114O extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f82437d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f82438e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9113N f82439f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f82440g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C9114O(kotlin.coroutines.d dVar, Function2 function2, C9113N c9113n) {
        super(2, dVar);
        this.f82439f = c9113n;
        this.f82440g = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C9114O c9114o = new C9114O(dVar, this.f82440g, this.f82439f);
        c9114o.f82438e = obj;
        return c9114o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9114O) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C9113N.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82437d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC9106G interfaceC9106G = (InterfaceC9106G) this.f82438e;
            C9113N c9113n = this.f82439f;
            c9113n.f82428h = interfaceC9106G;
            aVar = c9113n.f82429i;
            this.f82437d = 1;
            if (this.f82440g.invoke(aVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
