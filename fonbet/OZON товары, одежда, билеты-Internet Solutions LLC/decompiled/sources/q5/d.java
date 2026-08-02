package q5;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l5.C7873b;
import l5.InterfaceC7874c;
import org.jetbrains.annotations.NotNull;
import p5.m;
import q5.C8986a;
import v5.C10234h;
import v5.C10239m;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super C8986a.C1375a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f81654d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8986a f81655e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<p5.g> f81656f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<C7873b> f81657g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10234h f81658h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f81659i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<C10239m> f81660j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ InterfaceC7874c f81661k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(C8986a c8986a, kotlin.jvm.internal.M<p5.g> m11, kotlin.jvm.internal.M<C7873b> m12, C10234h c10234h, Object obj, kotlin.jvm.internal.M<C10239m> m13, InterfaceC7874c interfaceC7874c, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f81655e = c8986a;
        this.f81656f = m11;
        this.f81657g = m12;
        this.f81658h = c10234h;
        this.f81659i = obj;
        this.f81660j = m13;
        this.f81661k = interfaceC7874c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new d(this.f81655e, this.f81656f, this.f81657g, this.f81658h, this.f81659i, this.f81660j, this.f81661k, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super C8986a.C1375a> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f81654d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        m mVar = (m) this.f81656f.f71787a;
        C7873b c7873b = this.f81657g.f71787a;
        C10239m c10239m = this.f81660j.f71787a;
        this.f81654d = 1;
        Object b11 = C8986a.b(this.f81655e, mVar, c7873b, this.f81658h, this.f81659i, c10239m, this.f81661k, this);
        return b11 == aVar ? aVar : b11;
    }
}
