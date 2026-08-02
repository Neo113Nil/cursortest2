package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.view;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ButtonWithInformationV2View$smallViews$2 extends AbstractC7737t implements Function0<List<? extends View>> {
    final /* synthetic */ ButtonWithInformationV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonWithInformationV2View$smallViews$2(ButtonWithInformationV2View buttonWithInformationV2View) {
        super(0);
        this.this$0 = buttonWithInformationV2View;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends View> invoke() {
        TextAtomV2View titleView;
        PriceAtomView priceView;
        ButtonV3View smallButtonView;
        titleView = this.this$0.getTitleView();
        priceView = this.this$0.getPriceView();
        smallButtonView = this.this$0.getSmallButtonView();
        return C7714v.b0(titleView, priceView, smallButtonView);
    }
}
