package ru.ozon.app.android.ugc.widgets.additionalReview.presentation;

import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.R$dimen;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.databinding.WidgetAdditionalReviewBinding;
import ru.ozon.app.android.ugc.widgets.additionalReview.data.AdditionalReviewDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewBinder;", "", "Lru/ozon/app/android/ugc/databinding/WidgetAdditionalReviewBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetAdditionalReviewBinding;Lkotlin/jvm/functions/Function1;LWZ/l;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "cornerRadius", "setCardCornerRadius", "(F)V", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO;", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO;)V", "trackView", "Lru/ozon/app/android/ugc/databinding/WidgetAdditionalReviewBinding;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "", "guidelineBegin", "I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdditionalReviewBinder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAdditionalReviewBinding binding;
    private final Context context;

    @NotNull
    private final FeatureChecker featureChecker;
    private final int guidelineBegin;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Multi-variable type inference failed */
    public AdditionalReviewBinder(@NotNull WidgetAdditionalReviewBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.featureChecker = featureChecker;
        this.context = binding.getConstraintLayout().getContext();
        this.guidelineBegin = binding.getConstraintLayout().getContext().getResources().getDimensionPixelSize(R$dimen.additional_review_guideline_begin);
    }

    private final void setCardCornerRadius(float cornerRadius) {
        CardView constraintLayout = this.binding.getConstraintLayout();
        if (constraintLayout.getRadius() == cornerRadius) {
            return;
        }
        constraintLayout.setRadius(cornerRadius);
    }

    public final void bind(@NotNull AdditionalReviewVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetAdditionalReviewBinding widgetAdditionalReviewBinding = this.binding;
        setCardCornerRadius(ResourceExtKt.toPxF(item.getCornerRadius().getPx()));
        d dVar = new d();
        dVar.p(widgetAdditionalReviewBinding.additionalReviewCl);
        if (item.getBonus() != null) {
            dVar.a0(R$id.guideline1, this.guidelineBegin);
            Group bonusGroup = widgetAdditionalReviewBinding.bonusGroup;
            Intrinsics.checkNotNullExpressionValue(bonusGroup, "bonusGroup");
            ViewExtKt.show(bonusGroup);
            widgetAdditionalReviewBinding.bonusTitleTv.setText(item.getBonus().getTitle());
            TextView textView = widgetAdditionalReviewBinding.bonusTitleTv;
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            textView.setTextColor(styleParser.parseColor(context, item.getBonus().getTitleColor(), UniColors.TEXT_LIGHT_KEY.getResId()));
            View view = widgetAdditionalReviewBinding.bonusBackgroundV;
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            view.setBackgroundColor(styleParser.parseColor(context2, item.getBonus().getBackgroundColor(), UniColors.GRAPHIC_MARKETING.getResId()));
            ImageView imageView = widgetAdditionalReviewBinding.bonusIconIv;
            Context context3 = this.context;
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            imageView.setColorFilter(styleParser.parseColor(context3, item.getBonus().getIconTint(), UniColors.GRAPHIC_LIGHT_KEY.getResId()));
            ImageView bonusIconIv = widgetAdditionalReviewBinding.bonusIconIv;
            Intrinsics.checkNotNullExpressionValue(bonusIconIv, "bonusIconIv");
            ImageViewExtKt.load$default(bonusIconIv, item.getBonus().getIcon(), null, null, null, null, false, null, 126, null);
        } else {
            dVar.a0(R$id.guideline1, 0);
            Group bonusGroup2 = widgetAdditionalReviewBinding.bonusGroup;
            Intrinsics.checkNotNullExpressionValue(bonusGroup2, "bonusGroup");
            ViewExtKt.gone(bonusGroup2);
        }
        dVar.f(widgetAdditionalReviewBinding.additionalReviewCl);
        Image productIv = widgetAdditionalReviewBinding.productIv;
        Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
        ImageHolderKt.bindOrGone$default(productIv, item.getProduct().getImageAtom(), null, 2, null);
        Image productIv2 = widgetAdditionalReviewBinding.productIv;
        Intrinsics.checkNotNullExpressionValue(productIv2, "productIv");
        ru.ozon.app.android.pdp.utils.ViewExtKt.bindClickAction(productIv2, item.getProduct().getAction(), this.actionHandler);
        widgetAdditionalReviewBinding.productNameTav.setTextIsSelectable(false);
        TextAtomV2View productNameTav = widgetAdditionalReviewBinding.productNameTav;
        Intrinsics.checkNotNullExpressionValue(productNameTav, "productNameTav");
        TextHolderKt.bind$default(productNameTav, item.getProduct().getName(), null, 2, null);
        TextAtomV2View productNameTav2 = widgetAdditionalReviewBinding.productNameTav;
        Intrinsics.checkNotNullExpressionValue(productNameTav2, "productNameTav");
        ru.ozon.app.android.pdp.utils.ViewExtKt.bindClickAction(productNameTav2, item.getProduct().getAction(), this.actionHandler);
        TextAtomV2View reviewTextTav = widgetAdditionalReviewBinding.reviewTextTav;
        Intrinsics.checkNotNullExpressionValue(reviewTextTav, "reviewTextTav");
        TextHolderKt.bind$default(reviewTextTav, item.getRating().getText(), null, 2, null);
        List<AdditionalReviewDTO.Rating.Star> stars = item.getRating().getStars();
        RatingStarView ratingStarView = widgetAdditionalReviewBinding.ratingStarView;
        Iterator<AdditionalReviewDTO.Rating.Star> it = stars.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            Boolean isSelected = it.next().isSelected();
            if (isSelected != null ? isSelected.booleanValue() : false) {
                break;
            } else {
                i11++;
            }
        }
        ratingStarView.setRating(i11 + 1);
        ratingStarView.setOnStarClick(new AdditionalReviewBinder$bind$1$1$2(ratingStarView, item, this));
        ratingStarView.runAnimation();
    }

    public final void trackView(@NotNull AdditionalReviewVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, viewEvent);
        }
    }
}
