package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.common.flags.HammersNewImageLoadingFlag;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersBodyView;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isUserAnAdult", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class HammerProductImageBinder$init$3$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ HammerProductImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HammerProductImageBinder$init$3$1(HammerProductImageBinder hammerProductImageBinder) {
        super(1);
        this.this$0 = hammerProductImageBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        AdultImageView.Image image;
        FeatureChecker featureChecker;
        AdultImageView mainImage;
        image = this.this$0.currentItem;
        if (image != null) {
            HammerProductImageBinder hammerProductImageBinder = this.this$0;
            featureChecker = hammerProductImageBinder.featureChecker;
            if (featureChecker.isEnabled(HammersNewImageLoadingFlag.INSTANCE)) {
                hammerProductImageBinder.setCurrentItem(AdultImageView.Image.copy$default(image, null, null, 0.0f, false, !z11 && image.getIsAdult(), false, null, null, null, false, null, false, 4079, null));
                return;
            }
            HammersBodyView rootView = hammerProductImageBinder.getRootView();
            if (rootView == null || (mainImage = rootView.getMainImage()) == null) {
                return;
            }
            mainImage.bind(AdultImageView.Image.copy$default(image, null, null, 0.0f, false, !z11 && image.getIsAdult(), false, null, null, null, false, null, false, 4079, null));
        }
    }
}
