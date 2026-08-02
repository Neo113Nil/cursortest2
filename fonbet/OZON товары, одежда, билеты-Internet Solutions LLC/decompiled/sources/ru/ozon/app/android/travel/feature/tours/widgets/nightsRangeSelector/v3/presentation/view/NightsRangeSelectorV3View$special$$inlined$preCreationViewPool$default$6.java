package ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.view;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.tag.TagButtonView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$6 extends AbstractC7737t implements Function1<TagButtonView, Unit> {
    final /* synthetic */ NightsRangeSelectorV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NightsRangeSelectorV3View$special$$inlined$preCreationViewPool$default$6(NightsRangeSelectorV3View nightsRangeSelectorV3View) {
        super(1);
        this.this$0 = nightsRangeSelectorV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TagButtonView tagButtonView) {
        invoke(tagButtonView);
        return Unit.f71690a;
    }

    public final void invoke(TagButtonView PreCreationViewPoolDelegate) {
        int i11;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        TagButtonView tagButtonView = PreCreationViewPoolDelegate;
        tagButtonView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        i11 = this.this$0.dp55;
        tagButtonView.setMinWidth(i11);
        tagButtonView.setLayoutParams(bVar);
    }
}
