package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewView$showMoreButtonDelegate$1 extends AbstractC7737t implements Function0<ButtonV3View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewGalleryPreviewView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewView$showMoreButtonDelegate$1(Context context, ReviewGalleryPreviewView reviewGalleryPreviewView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewGalleryPreviewView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonV3View invoke() {
        ButtonV3View buttonV3View = new ButtonV3View(this.$context, null, 0, 0, 14, null);
        buttonV3View.setId(R$id.reviewGalleryPreviewShowMoreButton);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMarginStart(dimens.getDP_4());
        layoutParams.topMargin = dimens.getDP_4();
        buttonV3View.setLayoutParams(layoutParams);
        this.this$0.addView(buttonV3View);
        return buttonV3View;
    }
}
