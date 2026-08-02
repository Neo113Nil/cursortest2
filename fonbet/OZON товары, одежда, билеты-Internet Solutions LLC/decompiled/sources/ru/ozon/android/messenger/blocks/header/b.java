package ru.ozon.android.messenger.blocks.header;

import Kk.C3532b;
import k1.C7455a;
import k1.C7456b;
import k1.C7460f;
import k1.C7462h;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7786D;
import l1.C7790H;
import l1.s0;
import n1.C8408a;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f85242b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f85243c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f85244d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f85245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(float f7, long j11, float f11, float f12) {
        super(1);
        this.f85242b = f7;
        this.f85243c = j11;
        this.f85244d = f11;
        this.f85245e = f12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        InterfaceC8410c drawWithContent = interfaceC8410c;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float f7 = C7464j.f(drawWithContent.i());
        float d11 = C7464j.d(drawWithContent.i());
        C7786D a11 = C7790H.a();
        C7460f c7460f = new C7460f(0.0f, 0.0f, f7, d11);
        float f11 = this.f85244d;
        long a12 = C7456b.a(f11, f11);
        float d12 = C7455a.d(a12);
        float e11 = C7455a.e(a12);
        float n11 = c7460f.n();
        float q11 = c7460f.q();
        float o11 = c7460f.o();
        float h11 = c7460f.h();
        long a13 = C7456b.a(d12, e11);
        a11.s(new C7462h(n11, q11, o11, h11, a13, a13, a13, a13), s0.a.CounterClockwise);
        C8408a.b w02 = drawWithContent.w0();
        long e12 = w02.e();
        w02.a().save();
        try {
            w02.f().a(a11);
            drawWithContent.F0();
            C3532b.b(w02, e12);
            float f12 = this.f85242b;
            float f13 = f7 - f12;
            float f14 = d11 - f12;
            C7786D a14 = C7790H.a();
            a14.a(f7, d11);
            float f15 = this.f85245e;
            a14.b(f7, f14 - f15);
            float f16 = 2 * f15;
            a14.w(new C7460f(f7 - f16, f14 - f16, f7, f14), 0.0f, 90.0f);
            a14.b(f13 + f15, f14);
            a14.w(new C7460f(f13, f14, f13 + f16, f14 + f16), -90.0f, -90.0f);
            a14.b(f13, d11 - f15);
            a14.w(new C7460f(f13 - f16, d11 - f16, f13, d11), 0.0f, 90.0f);
            a14.b(f7, d11);
            InterfaceC8412e.X(drawWithContent, a14, this.f85243c, null, 28);
            return Unit.f71690a;
        } catch (Throwable th2) {
            C3532b.b(w02, e12);
            throw th2;
        }
    }
}
