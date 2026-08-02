package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2FooterBlockView$footerGroupViews$2 extends AbstractC7737t implements Function0<List<? extends View>> {
    final /* synthetic */ FlightSeatsSchemeV2FooterBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2FooterBlockView$footerGroupViews$2(FlightSeatsSchemeV2FooterBlockView flightSeatsSchemeV2FooterBlockView) {
        super(0);
        this.this$0 = flightSeatsSchemeV2FooterBlockView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends View> invoke() {
        ButtonV3View submitButtonV;
        TextAtomV2View captionTV;
        AppCompatImageView infoButtonV;
        TextAtomV2View priceTV;
        submitButtonV = this.this$0.getSubmitButtonV();
        captionTV = this.this$0.getCaptionTV();
        infoButtonV = this.this$0.getInfoButtonV();
        priceTV = this.this$0.getPriceTV();
        return C7714v.b0(submitButtonV, captionTV, infoButtonV, priceTV);
    }
}
