package ru.ozon.android.messenger.blocks.floatbutton.ai;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import k1.C7460f;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7839p0;
import l1.C7784B;
import l1.C7785C;
import l1.C7786D;
import l1.C7790H;
import l1.C7807Z;
import l1.C7811b0;
import l1.C7845v;
import l1.s0;
import n1.InterfaceC8410c;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f85169b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f85170c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f85171d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ A0.g f85172e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f85173f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(float f7, float f11, float f12, A0.g gVar, long j11) {
        super(1);
        this.f85169b = f7;
        this.f85170c = f11;
        this.f85171d = f12;
        this.f85172e = gVar;
        this.f85173f = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        s0 b11;
        InterfaceC8410c drawWithContent = interfaceC8410c;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float v12 = drawWithContent.v1(this.f85169b);
        float v13 = drawWithContent.v1(this.f85170c);
        float v14 = drawWithContent.v1(this.f85171d);
        AbstractC7839p0 mo1createOutlinePq9zytI = this.f85172e.mo1createOutlinePq9zytI(C7465k.a(C7464j.f(drawWithContent.i()), C7464j.d(drawWithContent.i())), drawWithContent.getLayoutDirection(), drawWithContent);
        if (mo1createOutlinePq9zytI instanceof AbstractC7839p0.b) {
            b11 = C7790H.a();
            b11.d(new C7460f(0.0f, 0.0f, C7464j.f(drawWithContent.i()), C7464j.d(drawWithContent.i())), s0.a.CounterClockwise);
        } else if (mo1createOutlinePq9zytI instanceof AbstractC7839p0.c) {
            C7786D a11 = C7790H.a();
            a11.s(((AbstractC7839p0.c) mo1createOutlinePq9zytI).b(), s0.a.CounterClockwise);
            b11 = a11;
        } else {
            if (!(mo1createOutlinePq9zytI instanceof AbstractC7839p0.a)) {
                throw new Sc.o();
            }
            b11 = ((AbstractC7839p0.a) mo1createOutlinePq9zytI).b();
        }
        Canvas b12 = C7845v.b(drawWithContent.w0().a());
        float f7 = -v12;
        b12.saveLayer(new RectF(f7 + v13, f7 + v14, C7464j.f(drawWithContent.i()) + v12 + v13, C7464j.d(drawWithContent.i()) + v12 + v14), null);
        Paint d11 = C7785C.a().d();
        d11.setAntiAlias(true);
        d11.setColor(C7811b0.i(C7807Z.o(0.16f, this.f85173f)));
        d11.setMaskFilter(new BlurMaskFilter(v12, BlurMaskFilter.Blur.NORMAL));
        b12.save();
        b12.translate(v13, v14);
        if (!(b11 instanceof C7786D)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        C7786D c7786d = (C7786D) b11;
        b12.drawPath(c7786d.x(), d11);
        b12.restore();
        C7784B a12 = C7785C.a();
        a12.o(0);
        Paint d12 = a12.d();
        d12.setAntiAlias(true);
        if (b11 == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        b12.drawPath(c7786d.x(), d12);
        b12.restore();
        drawWithContent.F0();
        return Unit.f71690a;
    }
}
