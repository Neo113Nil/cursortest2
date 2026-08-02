package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.J;
import m0.C8000l;
import m0.C8008p;
import r0.C9112M;

/* renamed from: s0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9572o extends AbstractC7737t implements Function1<C8000l<Float, C8008p>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f98084b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J f98085c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9112M.a f98086d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f98087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C9572o(float f7, J j11, C9112M.a aVar, Function1 function1) {
        super(1);
        this.f98084b = f7;
        this.f98085c = j11;
        this.f98086d = aVar;
        this.f98087e = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C8000l<Float, C8008p> c8000l) {
        C8000l<Float, C8008p> c8000l2 = c8000l;
        float c11 = C9573p.c(c8000l2.e().floatValue(), this.f98084b);
        J j11 = this.f98085c;
        float f7 = c11 - j11.f71784a;
        float a11 = this.f98086d.a(f7);
        this.f98087e.invoke(Float.valueOf(a11));
        if (Math.abs(f7 - a11) > 0.5f || c11 != c8000l2.e().floatValue()) {
            c8000l2.a();
        }
        j11.f71784a += a11;
        return Unit.f71690a;
    }
}
