package ru.ozon.uni.android.ds.compose.component.disclaimer;

import S0.A1;
import k1.C7456b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DsDisclaimerAtomKt$DsDisclaimerAtom$clickableModifier$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ A1<Boolean> $isPressed$delegate;
    final /* synthetic */ DsDisclaimerStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsDisclaimerAtomKt$DsDisclaimerAtom$clickableModifier$1$1$1(DsDisclaimerStyle dsDisclaimerStyle, A1<Boolean> a12) {
        super(1);
        this.$style = dsDisclaimerStyle;
        this.$isPressed$delegate = a12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        boolean DsDisclaimerAtom$lambda$1;
        float f7;
        float f11;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        DsDisclaimerAtom$lambda$1 = DsDisclaimerAtomKt.DsDisclaimerAtom$lambda$1(this.$isPressed$delegate);
        if (DsDisclaimerAtom$lambda$1) {
            long hoverColor = this.$style.getHoverColor();
            f7 = DsDisclaimerAtomKt.CORNER_RADIUS;
            float v12 = drawWithContent.v1(f7);
            f11 = DsDisclaimerAtomKt.CORNER_RADIUS;
            InterfaceC8412e.p0(drawWithContent, hoverColor, 0L, 0L, C7456b.a(v12, drawWithContent.v1(f11)), null, 246);
        }
    }
}
