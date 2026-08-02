package r0;

import B0.C0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.B0;
import m0.C8000l;
import m0.C8006o;
import m0.C8008p;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;
import r0.C9112M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {893}, m = "invokeSuspend")
/* renamed from: r0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9128h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Float>, Object> {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.J f82603d;

    /* renamed from: e, reason: collision with root package name */
    C8006o f82604e;

    /* renamed from: f, reason: collision with root package name */
    int f82605f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f82606g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9129i f82607h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C9112M.a f82608i;

    /* renamed from: r0.h$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<C8000l<Float, C8008p>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f82609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C9112M.a f82610c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f82611d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9129i f82612e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.J j11, C9112M.a aVar, kotlin.jvm.internal.J j12, C9129i c9129i) {
            super(1);
            this.f82609b = j11;
            this.f82610c = aVar;
            this.f82611d = j12;
            this.f82612e = c9129i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C8000l<Float, C8008p> c8000l) {
            C8000l<Float, C8008p> c8000l2 = c8000l;
            float floatValue = c8000l2.e().floatValue();
            kotlin.jvm.internal.J j11 = this.f82609b;
            float f7 = floatValue - j11.f71784a;
            float a11 = this.f82610c.a(f7);
            j11.f71784a = c8000l2.e().floatValue();
            this.f82611d.f71784a = c8000l2.f().floatValue();
            if (Math.abs(f7 - a11) > 0.5f) {
                c8000l2.a();
            }
            C9129i c9129i = this.f82612e;
            c9129i.f(c9129i.d() + 1);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9128h(float f7, C9129i c9129i, C9112M.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f82606g = f7;
        this.f82607h = c9129i;
        this.f82608i = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C9128h(this.f82606g, this.f82607h, this.f82608i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Float> dVar) {
        return ((C9128h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        float f7;
        C8006o c8006o;
        kotlin.jvm.internal.J j11;
        C9129i c9129i = this.f82607h;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82605f;
        if (i11 == 0) {
            Sc.s.b(obj);
            f7 = this.f82606g;
            if (Math.abs(f7) > 1.0f) {
                kotlin.jvm.internal.J j12 = new kotlin.jvm.internal.J();
                j12.f71784a = f7;
                kotlin.jvm.internal.J j13 = new kotlin.jvm.internal.J();
                C8006o a11 = C0.a(0.0f, 28, f7);
                try {
                    InterfaceC7976A<Float> c11 = c9129i.c();
                    a aVar2 = new a(j13, this.f82608i, j12, c9129i);
                    this.f82603d = j12;
                    this.f82604e = a11;
                    this.f82605f = 1;
                    if (B0.e(a11, c11, false, aVar2, this) == aVar) {
                        return aVar;
                    }
                    j11 = j12;
                } catch (CancellationException unused) {
                    c8006o = a11;
                    j11 = j12;
                    j11.f71784a = ((Number) c8006o.o()).floatValue();
                    f7 = j11.f71784a;
                    return new Float(f7);
                }
            }
            return new Float(f7);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c8006o = this.f82604e;
        j11 = this.f82603d;
        try {
            Sc.s.b(obj);
        } catch (CancellationException unused2) {
            j11.f71784a = ((Number) c8006o.o()).floatValue();
            f7 = j11.f71784a;
            return new Float(f7);
        }
        f7 = j11.f71784a;
        return new Float(f7);
    }
}
