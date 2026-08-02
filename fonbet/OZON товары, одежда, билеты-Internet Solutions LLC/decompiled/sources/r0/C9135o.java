package r0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.foundation.gestures.DraggableElement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: r0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9135o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC6511n<xe.M, C7459e, kotlin.coroutines.d<? super Unit>, Object> f82632a = new a(3, null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final InterfaceC6511n<xe.M, Float, kotlin.coroutines.d<? super Unit>, Object> f82633b = new b(3, null);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f82634c = 0;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r0.o$a */
    /* loaded from: classes8.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<xe.M, C7459e, kotlin.coroutines.d<? super Unit>, Object> {
        @Override // fd.InterfaceC6511n
        public final Object invoke(xe.M m11, C7459e c7459e, kotlin.coroutines.d<? super Unit> dVar) {
            c7459e.n();
            return new a(3, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r0.o$b */
    /* loaded from: classes8.dex */
    static final class b extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<xe.M, Float, kotlin.coroutines.d<? super Unit>, Object> {
        @Override // fd.InterfaceC6511n
        public final Object invoke(xe.M m11, Float f7, kotlin.coroutines.d<? super Unit> dVar) {
            f7.floatValue();
            return new b(3, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    public static androidx.compose.ui.e c(androidx.compose.ui.e eVar, InterfaceC9137q interfaceC9137q, EnumC9142v enumC9142v, boolean z11, t0.q qVar, boolean z12, InterfaceC6511n interfaceC6511n, boolean z13, int i11) {
        if ((i11 & 8) != 0) {
            qVar = null;
        }
        return eVar.l0(new DraggableElement(interfaceC9137q, enumC9142v, z11, qVar, (i11 & 16) != 0 ? false : z12, f82632a, interfaceC6511n, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z13));
    }

    @NotNull
    public static final InterfaceC9137q d(InterfaceC3967k interfaceC3967k, @NotNull Function1 function1) {
        InterfaceC3978p0 l11 = n1.l(function1, interfaceC3967k);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C9127g c9127g = new C9127g(new C9136p(l11));
            interfaceC3967k.x(c9127g);
            C11 = c9127g;
        }
        return (InterfaceC9137q) C11;
    }
}
