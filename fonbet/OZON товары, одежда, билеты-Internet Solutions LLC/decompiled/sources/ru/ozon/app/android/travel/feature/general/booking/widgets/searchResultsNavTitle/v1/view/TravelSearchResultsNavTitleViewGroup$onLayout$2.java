package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "child", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelSearchResultsNavTitleViewGroup$onLayout$2 extends AbstractC7737t implements Function2<Integer, View, Unit> {
    final /* synthetic */ int $destinationWidth;
    final /* synthetic */ int $separatorWidth;
    final /* synthetic */ int $viewPortHeight;
    final /* synthetic */ int $viewPortWidth;
    final /* synthetic */ TravelSearchResultsNavTitleViewGroup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelSearchResultsNavTitleViewGroup$onLayout$2(int i11, int i12, int i13, TravelSearchResultsNavTitleViewGroup travelSearchResultsNavTitleViewGroup, int i14) {
        super(2);
        this.$viewPortWidth = i11;
        this.$separatorWidth = i12;
        this.$destinationWidth = i13;
        this.this$0 = travelSearchResultsNavTitleViewGroup;
        this.$viewPortHeight = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, View view) {
        invoke(num.intValue(), view);
        return Unit.f71690a;
    }

    public final void invoke(int i11, View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (i11 == 0) {
            this.this$0.recalculateDimensions(child, (this.$viewPortWidth - this.$separatorWidth) - this.$destinationWidth, this.$viewPortHeight);
        }
    }
}
