package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
public final class FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$4 extends AbstractC7737t implements Function1<AppCompatImageView, Unit> {
    final /* synthetic */ FlightSchemeLegendViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$4(FlightSchemeLegendViewV2 flightSchemeLegendViewV2) {
        super(1);
        this.this$0 = flightSchemeLegendViewV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AppCompatImageView appCompatImageView) {
        invoke(appCompatImageView);
        return Unit.f71690a;
    }

    public final void invoke(AppCompatImageView PreCreationViewPoolDelegate) {
        int i11;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        AppCompatImageView appCompatImageView = PreCreationViewPoolDelegate;
        appCompatImageView.setId(View.generateViewId());
        i11 = this.this$0.dp16;
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(-2, i11));
        appCompatImageView.setAdjustViewBounds(true);
    }
}
