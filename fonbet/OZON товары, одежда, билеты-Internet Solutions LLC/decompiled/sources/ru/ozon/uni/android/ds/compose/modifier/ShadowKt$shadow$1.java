package ru.ozon.uni.android.ds.compose.modifier;

import Sc.o;
import android.graphics.BlurMaskFilter;
import k1.C7455a;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7839p0;
import l1.C7784B;
import l1.C7785C;
import l1.C7786D;
import l1.C7807Z;
import l1.InterfaceC7802U;
import l1.J0;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class ShadowKt$shadow$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ float $alpha;
    final /* synthetic */ float $blur;
    final /* synthetic */ long $color;
    final /* synthetic */ float $offsetX;
    final /* synthetic */ float $offsetY;
    final /* synthetic */ J0 $shape;
    final /* synthetic */ float $spread;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShadowKt$shadow$1(float f7, J0 j02, float f11, long j11, float f12, float f13, float f14) {
        super(1);
        this.$spread = f7;
        this.$shape = j02;
        this.$blur = f11;
        this.$color = j11;
        this.$alpha = f12;
        this.$offsetX = f13;
        this.$offsetY = f14;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e drawBehind) {
        InterfaceC7802U interfaceC7802U;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        AbstractC7839p0 mo1createOutlinePq9zytI = this.$shape.mo1createOutlinePq9zytI(C7465k.a(drawBehind.v1(this.$spread) + C7464j.f(drawBehind.i()), drawBehind.v1(this.$spread) + C7464j.d(drawBehind.i())), drawBehind.getLayoutDirection(), drawBehind);
        C7784B a11 = C7785C.a();
        a11.b(C7807Z.o(this.$alpha, this.$color));
        if (drawBehind.v1(this.$blur) > 0.0f) {
            a11.d().setMaskFilter(new BlurMaskFilter(drawBehind.v1(this.$blur), BlurMaskFilter.Blur.NORMAL));
        }
        float f7 = this.$offsetX;
        float f11 = this.$offsetY;
        InterfaceC7802U a12 = drawBehind.w0().a();
        a12.save();
        a12.f(drawBehind.v1(f7), drawBehind.v1(f11));
        if (!(mo1createOutlinePq9zytI instanceof AbstractC7839p0.b)) {
            if (mo1createOutlinePq9zytI instanceof AbstractC7839p0.c) {
                AbstractC7839p0.c cVar = (AbstractC7839p0.c) mo1createOutlinePq9zytI;
                C7786D c11 = cVar.c();
                if (c11 != null) {
                    a12.c(c11, a11);
                } else {
                    interfaceC7802U = a12;
                    interfaceC7802U.l(cVar.b().e(), cVar.b().g(), cVar.b().f(), cVar.b().a(), C7455a.d(cVar.b().b()), C7455a.e(cVar.b().b()), a11);
                }
            } else {
                interfaceC7802U = a12;
                if (!(mo1createOutlinePq9zytI instanceof AbstractC7839p0.a)) {
                    throw new o();
                }
                interfaceC7802U.c(((AbstractC7839p0.a) mo1createOutlinePq9zytI).b(), a11);
            }
            interfaceC7802U.p();
        }
        a12.j(((AbstractC7839p0.b) mo1createOutlinePq9zytI).b(), a11);
        interfaceC7802U = a12;
        interfaceC7802U.p();
    }
}
