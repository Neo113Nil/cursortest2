package r0;

import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C8008p;
import m0.X0;

/* loaded from: classes8.dex */
final class b0 extends AbstractC7737t implements Function1<Long, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z f82549b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f82550c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<Float, Unit> f82551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    b0(Z z11, float f7, Function1<? super Float, Unit> function1) {
        super(1);
        this.f82549b = z11;
        this.f82550c = f7;
        this.f82551d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l11) {
        long j11;
        long j12;
        long d11;
        X0 x02;
        C8008p c8008p;
        C8008p c8008p2;
        X0 x03;
        C8008p c8008p3;
        C8008p c8008p4;
        X0 x04;
        C8008p c8008p5;
        C8008p c8008p6;
        long longValue = l11.longValue();
        Z z11 = this.f82549b;
        j11 = z11.f82538b;
        if (j11 == Long.MIN_VALUE) {
            z11.f82538b = longValue;
        }
        C8008p c8008p7 = new C8008p(z11.h());
        if (this.f82550c == 0.0f) {
            x04 = z11.f82537a;
            C8008p c8008p8 = new C8008p(z11.h());
            c8008p5 = Z.f82536f;
            c8008p6 = z11.f82539c;
            d11 = x04.b(c8008p8, c8008p5, c8008p6);
        } else {
            j12 = z11.f82538b;
            d11 = C6915b.d((longValue - j12) / r3);
        }
        long j13 = d11;
        x02 = z11.f82537a;
        c8008p = Z.f82536f;
        c8008p2 = z11.f82539c;
        float f7 = ((C8008p) x02.c(j13, c8008p7, c8008p, c8008p2)).f();
        x03 = z11.f82537a;
        c8008p3 = Z.f82536f;
        c8008p4 = z11.f82539c;
        z11.f82539c = (C8008p) x03.d(j13, c8008p7, c8008p3, c8008p4);
        z11.f82538b = longValue;
        float h11 = z11.h() - f7;
        z11.i(f7);
        this.f82551d.invoke(Float.valueOf(h11));
        return Unit.f71690a;
    }
}
