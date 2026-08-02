package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.B0;
import m0.C8011q0;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
/* renamed from: r0.C, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9102C extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9106G, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f82390d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f82391e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f82392f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C8011q0 f82393g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.J f82394h;

    /* renamed from: r0.C$a */
    static final class a extends AbstractC7737t implements Function2<Float, Float, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f82395b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC9106G f82396c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.J j11, InterfaceC9106G interfaceC9106G) {
            super(2);
            this.f82395b = j11;
            this.f82396c = interfaceC9106G;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Float f7, Float f11) {
            float floatValue = f7.floatValue();
            f11.floatValue();
            kotlin.jvm.internal.J j11 = this.f82395b;
            float f12 = j11.f71784a;
            j11.f71784a = this.f82396c.a(floatValue - f12) + f12;
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9102C(float f7, C8011q0 c8011q0, kotlin.jvm.internal.J j11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f82392f = f7;
        this.f82393g = c8011q0;
        this.f82394h = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C9102C c9102c = new C9102C(this.f82392f, this.f82393g, this.f82394h, dVar);
        c9102c.f82391e = obj;
        return c9102c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC9106G interfaceC9106G, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9102C) create(interfaceC9106G, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82390d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f82394h, (InterfaceC9106G) this.f82391e);
            this.f82390d = 1;
            if (B0.d(0.0f, this.f82392f, this.f82393g, aVar2, this, 4) == aVar) {
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
