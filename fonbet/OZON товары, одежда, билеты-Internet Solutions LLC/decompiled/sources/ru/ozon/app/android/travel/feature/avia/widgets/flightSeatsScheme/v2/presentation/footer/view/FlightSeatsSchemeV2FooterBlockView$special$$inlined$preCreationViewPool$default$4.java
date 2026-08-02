package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view;

import Fj.c;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$4 extends AbstractC7737t implements Function1<TextAtomV2View, Unit> {
    final /* synthetic */ FlightSeatsSchemeV2FooterBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$4(FlightSeatsSchemeV2FooterBlockView flightSeatsSchemeV2FooterBlockView) {
        super(1);
        this.this$0 = flightSeatsSchemeV2FooterBlockView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextAtomV2View textAtomV2View) {
        invoke(textAtomV2View);
        return Unit.f71690a;
    }

    public final void invoke(TextAtomV2View PreCreationViewPoolDelegate) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        TextAtomV2View textAtomV2View = PreCreationViewPoolDelegate;
        ConstraintLayout.b b11 = c.b(-2, -2, textAtomV2View);
        i11 = this.this$0.dp12;
        ((ViewGroup.MarginLayoutParams) b11).topMargin = i11;
        i12 = this.this$0.dp16;
        b11.setMarginStart(i12);
        b11.f41598E = 0.0f;
        b11.f41603J = 2;
        b11.f41616W = true;
        b11.f41660x = 0;
        textAtomV2View.setFocusable(false);
        textAtomV2View.setLayoutParams(b11);
    }
}
