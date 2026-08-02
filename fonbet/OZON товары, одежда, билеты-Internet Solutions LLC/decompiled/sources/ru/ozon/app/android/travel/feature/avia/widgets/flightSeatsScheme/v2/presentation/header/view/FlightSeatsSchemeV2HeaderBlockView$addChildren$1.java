package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2HeaderBlockView$addChildren$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ FlightSeatsSchemeV2HeaderBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2HeaderBlockView$addChildren$1(FlightSeatsSchemeV2HeaderBlockView flightSeatsSchemeV2HeaderBlockView) {
        super(1);
        this.this$0 = flightSeatsSchemeV2HeaderBlockView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View titleTextView;
        TextAtomV2View titleTextView2;
        TextAtomV2View titleTextView3;
        TextAtomV2View subtitleTextView;
        TextAtomV2View subtitleTextView2;
        TextAtomV2View titleTextView4;
        int i11;
        TextAtomV2View subtitleTextView3;
        FlightSeatsSchemeV2HeaderBlockShimmerView flightSeatsSchemeV2HeaderBlockShimmerView;
        FlightSeatsSchemeV2HeaderBlockShimmerView flightSeatsSchemeV2HeaderBlockShimmerView2;
        FlightSeatsSchemeV2HeaderBlockShimmerView flightSeatsSchemeV2HeaderBlockShimmerView3;
        FlightSeatsSchemeV2HeaderBlockShimmerView flightSeatsSchemeV2HeaderBlockShimmerView4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        titleTextView = this.this$0.getTitleTextView();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, titleTextView);
        titleTextView2 = this.this$0.getTitleTextView();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, titleTextView2);
        titleTextView3 = this.this$0.getTitleTextView();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, titleTextView3);
        subtitleTextView = this.this$0.getSubtitleTextView();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, subtitleTextView);
        subtitleTextView2 = this.this$0.getSubtitleTextView();
        titleTextView4 = this.this$0.getTitleTextView();
        i11 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, subtitleTextView2, titleTextView4, i11);
        subtitleTextView3 = this.this$0.getSubtitleTextView();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, subtitleTextView3);
        flightSeatsSchemeV2HeaderBlockShimmerView = this.this$0.shimmerView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, flightSeatsSchemeV2HeaderBlockShimmerView);
        flightSeatsSchemeV2HeaderBlockShimmerView2 = this.this$0.shimmerView;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, flightSeatsSchemeV2HeaderBlockShimmerView2);
        flightSeatsSchemeV2HeaderBlockShimmerView3 = this.this$0.shimmerView;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, flightSeatsSchemeV2HeaderBlockShimmerView3);
        flightSeatsSchemeV2HeaderBlockShimmerView4 = this.this$0.shimmerView;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, flightSeatsSchemeV2HeaderBlockShimmerView4);
    }
}
