package ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.presentation;

import W10.c;
import WZ.t;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdpoldwidgets.databinding.WidgetVideoConsultationBannerBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/presentation/VideoConsultationBannerWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/presentation/VideoConsultationBannerVO;", "Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetVideoConsultationBannerBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetVideoConsultationBannerBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/presentation/VideoConsultationBannerVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/presentation/VideoConsultationBannerVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetVideoConsultationBannerBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoConsultationBannerWidgetViewHolder extends k<VideoConsultationBannerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetVideoConsultationBannerBinding binding;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoConsultationBannerWidgetViewHolder(@NotNull WidgetVideoConsultationBannerBinding binding, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull VideoConsultationBannerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetVideoConsultationBannerBinding widgetVideoConsultationBannerBinding = this.binding;
        TextAtomV2View headerTAV = widgetVideoConsultationBannerBinding.headerTAV;
        Intrinsics.checkNotNullExpressionValue(headerTAV, "headerTAV");
        TextHolderKt.bind$default(headerTAV, item.getHeader(), null, 2, null);
        TextAtomV2View bodyTAV = widgetVideoConsultationBannerBinding.bodyTAV;
        Intrinsics.checkNotNullExpressionValue(bodyTAV, "bodyTAV");
        TextHolderKt.bind$default(bodyTAV, item.getBody(), null, 2, null);
        ImageView productIv = widgetVideoConsultationBannerBinding.productIv;
        Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
        ImageViewExtKt.load$default(productIv, item.getProductImage(), C7714v.a0(new ImageTransformation.RoundedCorners(0, null, 3, null)), null, null, null, false, null, 124, null);
        SmallButtonView mainActionBA = widgetVideoConsultationBannerBinding.mainActionBA;
        Intrinsics.checkNotNullExpressionValue(mainActionBA, "mainActionBA");
        WrappedButtonHolderKt.bind(mainActionBA, item.getMainActionButton(), this.actionHandler);
        SmallBorderlessButtonView secondaryActionBorderlessButton = widgetVideoConsultationBannerBinding.secondaryActionBorderlessButton;
        Intrinsics.checkNotNullExpressionValue(secondaryActionBorderlessButton, "secondaryActionBorderlessButton");
        WrappedBorderlessButtonHolderKt.bindOrGone(secondaryActionBorderlessButton, item.getSecondaryActionButton(), this.actionHandler);
        TextAtomV2View footerTAV = widgetVideoConsultationBannerBinding.footerTAV;
        Intrinsics.checkNotNullExpressionValue(footerTAV, "footerTAV");
        TextHolderKt.bindOrGone$default(footerTAV, item.getFooter(), null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull VideoConsultationBannerVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((VideoConsultationBannerWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
