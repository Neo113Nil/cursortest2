package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import B0.C2454a;
import B3.D;
import CG.b;
import WZ.l;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.databinding.WidgetRateItemsV2ReviewsItemBinding;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u00178\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/ReviewsItemViewHolder;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/BaseRateItemV2ViewHolder;", "Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2ReviewsItemBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2ReviewsItemBinding;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "", "backgroundColor", "strokeColor", "Lkotlin/Function0;", "setupBackground", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;", "stringColor", "", "defaultColorRes", "getIntColor", "(Ljava/lang/String;I)I", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateReviewsItemVO;", "rateReviewsItem", "bind", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateReviewsItemVO;)V", "Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2ReviewsItemBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/core/UniColors;", "defaultBackgroundColor", "Lru/ozon/uni/core/UniColors;", "defaultStrokeColor", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "item", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateReviewsItemVO;", "getItem", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateReviewsItemVO;", "setItem", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsItemViewHolder extends BaseRateItemV2ViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetRateItemsV2ReviewsItemBinding binding;

    @NotNull
    private final UniColors defaultBackgroundColor;

    @NotNull
    private final UniColors defaultStrokeColor;

    @NotNull
    private final GradientDrawable gradientDrawable;
    private RateItemsV2VO.RateItemVO.RateReviewsItemVO item;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReviewsItemViewHolder(@NotNull WidgetRateItemsV2ReviewsItemBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(r0, tokenizedAnalytics);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = actionHandler;
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        this.defaultBackgroundColor = uniColors;
        UniColors uniColors2 = UniColors.LAYER_SURFACE;
        this.defaultStrokeColor = uniColors2;
        GradientDrawable b11 = D.b(0);
        Dimens dimens = Dimens.INSTANCE;
        b11.setCornerRadius(dimens.getDPF_16());
        b11.setColor(getIntColor(uniColors.getToken(), uniColors.getResId()));
        b11.setStroke(dimens.getDP_1(), getIntColor(uniColors2.getToken(), uniColors2.getResId()));
        this.gradientDrawable = b11;
        LinearLayout constraintLayout2 = binding.getConstraintLayout();
        constraintLayout2.setOnClickListener(new b(this, 19));
        constraintLayout2.setBackground(b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getIntColor(String stringColor, int defaultColorRes) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return styleParser.parseColor(context, stringColor, defaultColorRes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(ReviewsItemViewHolder reviewsItemViewHolder, View view) {
        RateItemsV2VO.RateItemVO.RateReviewsItemVO item = reviewsItemViewHolder.getItem();
        AtomAction action = item != null ? item.getAction() : null;
        Intrinsics.g(action, "null cannot be cast to non-null type ru.ozon.uni.atoms.af.AtomAction.Move");
        reviewsItemViewHolder.actionHandler.invoke(AtomAction.Move.copy$default((AtomAction.Move) action, null, C2454a.b("openInProfileTab", "openInProfileTab"), null, null, null, 29, null));
    }

    private final Function0<Unit> setupBackground(String backgroundColor, String strokeColor) {
        return new ReviewsItemViewHolder$setupBackground$1(backgroundColor, this, strokeColor);
    }

    public final void bind(@NotNull RateItemsV2VO.RateItemVO.RateReviewsItemVO rateReviewsItem) {
        Intrinsics.checkNotNullParameter(rateReviewsItem, "rateReviewsItem");
        WidgetRateItemsV2ReviewsItemBinding widgetRateItemsV2ReviewsItemBinding = this.binding;
        setItem(rateReviewsItem);
        setupBackground(rateReviewsItem.getBackgroundColor(), rateReviewsItem.getStrokeColor());
        widgetRateItemsV2ReviewsItemBinding.title.setTextIsSelectable(false);
        TextAtomV2View title = widgetRateItemsV2ReviewsItemBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, rateReviewsItem.getTitle(), null, 2, null);
        widgetRateItemsV2ReviewsItemBinding.title.setClickable(false);
        IconView icon = widgetRateItemsV2ReviewsItemBinding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        IconHolderKt.bindOrGone$default(icon, rateReviewsItem.getIcon(), null, 2, null);
        widgetRateItemsV2ReviewsItemBinding.icon.setClickable(false);
    }

    protected void setItem(RateItemsV2VO.RateItemVO.RateReviewsItemVO rateReviewsItemVO) {
        this.item = rateReviewsItemVO;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.BaseRateItemV2ViewHolder
    public RateItemsV2VO.RateItemVO.RateReviewsItemVO getItem() {
        return this.item;
    }
}
