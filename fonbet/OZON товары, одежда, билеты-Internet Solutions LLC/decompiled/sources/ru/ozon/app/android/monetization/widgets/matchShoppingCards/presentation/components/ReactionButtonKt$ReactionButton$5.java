package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import S0.A1;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Ll1/Q;", "brush", "invoke", "(Landroidx/compose/ui/e;Ll1/Q;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class ReactionButtonKt$ReactionButton$5 extends AbstractC7737t implements InterfaceC6512o<e, AbstractC7799Q, InterfaceC3967k, Integer, e> {
    final /* synthetic */ A1<Float> $animatedPressedStrokeAlpha$delegate;
    final /* synthetic */ Function0<Float> $preferredPressedStrokeAlpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactionButtonKt$ReactionButton$5(A1<Float> a12, Function0<Float> function0) {
        super(4);
        this.$animatedPressedStrokeAlpha$delegate = a12;
        this.$preferredPressedStrokeAlpha = function0;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ e invoke(e eVar, AbstractC7799Q abstractC7799Q, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, abstractC7799Q, interfaceC3967k, num.intValue());
    }

    public final e invoke(e withGradientBrush, AbstractC7799Q brush, InterfaceC3967k interfaceC3967k, int i11) {
        float f7;
        e m816borderInsidevz2T9sI;
        Intrinsics.checkNotNullParameter(withGradientBrush, "$this$withGradientBrush");
        Intrinsics.checkNotNullParameter(brush, "brush");
        interfaceC3967k.o(1322781784);
        float f11 = 1;
        f7 = ReactionButtonKt.BUTTON_CORNER_RADIUS;
        interfaceC3967k.o(1026037145);
        boolean n11 = interfaceC3967k.n(this.$animatedPressedStrokeAlpha$delegate) | interfaceC3967k.n(this.$preferredPressedStrokeAlpha);
        Function0<Float> function0 = this.$preferredPressedStrokeAlpha;
        A1<Float> a12 = this.$animatedPressedStrokeAlpha$delegate;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new ReactionButtonKt$ReactionButton$5$1$1(function0, a12);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        m816borderInsidevz2T9sI = ReactionButtonKt.m816borderInsidevz2T9sI(withGradientBrush, brush, f11, f7, (Function0) C11, interfaceC3967k, (i11 & 14) | 3456 | (i11 & 112), 0);
        interfaceC3967k.k();
        return m816borderInsidevz2T9sI;
    }
}
