package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$2 extends AbstractC7737t implements Function1<IconView, Unit> {
    final /* synthetic */ RailwaySearchResultsV3TrainView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwaySearchResultsV3TrainView$special$$inlined$preCreationViewPool$default$2(RailwaySearchResultsV3TrainView railwaySearchResultsV3TrainView) {
        super(1);
        this.this$0 = railwaySearchResultsV3TrainView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IconView iconView) {
        invoke(iconView);
        return Unit.f71690a;
    }

    public final void invoke(IconView PreCreationViewPoolDelegate) {
        DesignSystemDimensProvider designSystemDimensProvider;
        DesignSystemDimensProvider designSystemDimensProvider2;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        IconView iconView = PreCreationViewPoolDelegate;
        iconView.setId(View.generateViewId());
        designSystemDimensProvider = this.this$0.dsDimensProvider;
        int margin32 = designSystemDimensProvider.getMargin32();
        designSystemDimensProvider2 = this.this$0.dsDimensProvider;
        iconView.setLayoutParams(new ConstraintLayout.b(margin32, designSystemDimensProvider2.getMargin32()));
    }
}
