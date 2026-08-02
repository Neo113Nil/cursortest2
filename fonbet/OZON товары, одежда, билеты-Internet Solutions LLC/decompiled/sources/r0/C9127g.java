package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.C8374O;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;

/* renamed from: r0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9127g implements InterfaceC9137q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Unit> f82595a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f82596b = new b();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8374O f82597c = new C8374O();

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {626}, m = "invokeSuspend")
    /* renamed from: r0.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82598d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC8372M f82600f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC9132l, kotlin.coroutines.d<? super Unit>, Object> f82601g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(EnumC8372M enumC8372M, Function2<? super InterfaceC9132l, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f82600f = enumC8372M;
            this.f82601g = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return C9127g.this.new a(this.f82600f, this.f82601g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82598d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9127g c9127g = C9127g.this;
                C8374O c8374o = c9127g.f82597c;
                b bVar = c9127g.f82596b;
                this.f82598d = 1;
                if (c8374o.e(bVar, this.f82600f, this.f82601g, this) == aVar) {
                    return aVar;
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

    /* renamed from: r0.g$b */
    public static final class b implements InterfaceC9132l {
        b() {
        }

        @Override // r0.InterfaceC9132l
        public final void a(float f7) {
            C9127g.this.d().invoke(Float.valueOf(f7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9127g(@NotNull Function1<? super Float, Unit> function1) {
        this.f82595a = function1;
    }

    @Override // r0.InterfaceC9137q
    public final Object a(@NotNull EnumC8372M enumC8372M, @NotNull Function2<? super InterfaceC9132l, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = xe.N.d(new a(enumC8372M, function2, null), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    @NotNull
    public final Function1<Float, Unit> d() {
        return this.f82595a;
    }
}
