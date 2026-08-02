package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable;

import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7795M;
import l1.C7809a0;
import n1.InterfaceC8410c;
import q1.AbstractC8972b;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class TextWithTrailingIconKt$TextWithTrailingIcon$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ long $iconColor;
    final /* synthetic */ float $iconSizePx;
    final /* synthetic */ IconSpot $iconSpot;
    final /* synthetic */ PikazonImagePainter $painter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextWithTrailingIconKt$TextWithTrailingIcon$1$1$1(IconSpot iconSpot, PikazonImagePainter pikazonImagePainter, float f7, long j11) {
        super(1);
        this.$iconSpot = iconSpot;
        this.$painter = pikazonImagePainter;
        this.$iconSizePx = f7;
        this.$iconColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        InterfaceC8410c interfaceC8410c;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        IconSpot iconSpot = this.$iconSpot;
        if (iconSpot == null) {
            return;
        }
        float x11 = iconSpot.getX();
        float y11 = iconSpot.getY();
        PikazonImagePainter pikazonImagePainter = this.$painter;
        float f7 = this.$iconSizePx;
        long j11 = this.$iconColor;
        drawWithContent.w0().f().g(x11, y11);
        try {
            long a11 = C7465k.a(f7, f7);
            C7795M a12 = C7809a0.a.a(5, j11);
            interfaceC8410c = drawWithContent;
            try {
                AbstractC8972b.m443drawx_KDEd0$default(pikazonImagePainter, interfaceC8410c, a11, 0.0f, a12, 2, null);
                interfaceC8410c.w0().f().g(-x11, -y11);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                interfaceC8410c.w0().f().g(-x11, -y11);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            interfaceC8410c = drawWithContent;
        }
    }
}
