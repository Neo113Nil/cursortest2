package ru.ozon.app.android.fresh.main.widgets.bannerList.presentation;

import Sc.o;
import W10.c;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.databinding.WidgetBannerListItemBinding;
import ru.ozon.app.android.fresh.main.utils.RoundedViewCorners;
import ru.ozon.app.android.fresh.main.widgets.bannerList.presentation.BannerRowVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010 \u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "backgroundColor", "", "setBannerContainerBackground", "(Ljava/lang/String;)V", "item", "roundedCorners", "(Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO;)V", "addAdditionalPaddings", "clearCorners", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/main/databinding/WidgetBannerListItemBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/WidgetBannerListItemBinding;", "", "betweenMargin", "I", "separatorHeight", "roundedPadding", "", "roundedRadius", "F", "Landroid/graphics/drawable/GradientDrawable;", "topBackgroundLayer", "Landroid/graphics/drawable/GradientDrawable;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BannerRowViewHolder extends k<BannerRowVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int betweenMargin;

    @NotNull
    private final WidgetBannerListItemBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;
    private final int roundedPadding;
    private final float roundedRadius;
    private final int separatorHeight;

    @NotNull
    private final GradientDrawable topBackgroundLayer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerRowVO.RoundedCorners.values().length];
            try {
                iArr[BannerRowVO.RoundedCorners.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerRowVO.RoundedCorners.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerRowVO.RoundedCorners.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerRowViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
        WidgetBannerListItemBinding bind = WidgetBannerListItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.betweenMargin = ResourceExtKt.toPx(12);
        this.separatorHeight = ResourceExtKt.toPx(8);
        this.roundedPadding = ResourceExtKt.toPx(16);
        this.roundedRadius = ResourceExtKt.toPxF(24);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(getContext(), R$attr.oz_semantic_bg_secondary));
        this.topBackgroundLayer = gradientDrawable;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    private final void addAdditionalPaddings(BannerRowVO item) {
        if (item.getIndexOfList() != 0) {
            ViewExtKt.updatePadding$default(this.containerView, 0, this.betweenMargin, 0, 0, 13, null);
        }
        if (item.getIndexOfList() == item.getLastIndex() && C7705l.m(new BannerRowVO.RoundedCorners[]{BannerRowVO.RoundedCorners.TOP, null}, item.getRoundedCorners())) {
            ViewExtKt.updatePadding$default(this.containerView, 0, 0, 0, this.separatorHeight, 7, null);
        }
        if (item.getIndexOfList() == 0 && C7705l.m(new BannerRowVO.RoundedCorners[]{BannerRowVO.RoundedCorners.BOTTOM, null}, item.getRoundedCorners())) {
            ViewExtKt.updatePadding$default(this.containerView, 0, this.separatorHeight, 0, 0, 13, null);
        }
    }

    private final void clearCorners() {
        this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getNoneCorners());
        ViewExtKt.updatePadding(this.containerView, 0, 0, 0, 0);
        this.containerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    private final void roundedCorners(BannerRowVO item) {
        BannerRowVO.RoundedCorners roundedCorners = item.getRoundedCorners();
        if (roundedCorners != null) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[roundedCorners.ordinal()];
            if (i11 == 1) {
                ViewExtKt.updatePadding$default(this.containerView, 0, this.roundedPadding, 0, 0, 13, null);
                this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getTopCorners());
                return;
            }
            if (i11 == 2) {
                ViewExtKt.updatePadding$default(this.containerView, 0, 0, 0, this.roundedPadding, 7, null);
                View view = this.containerView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = this.separatorHeight;
                view.setLayoutParams(layoutParams2);
                this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getBottomCorners());
                return;
            }
            if (i11 != 3) {
                throw new o();
            }
            View view2 = this.containerView;
            int i12 = this.roundedPadding;
            ViewExtKt.updatePadding$default(view2, 0, i12, 0, i12 + this.separatorHeight, 5, null);
            View view3 = this.containerView;
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin = this.separatorHeight;
            view3.setLayoutParams(layoutParams4);
            this.topBackgroundLayer.setCornerRadii(RoundedViewCorners.INSTANCE.getFullCorners());
        }
    }

    private final void setBannerContainerBackground(String backgroundColor) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.roundedRadius);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.bannerContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, backgroundColor, StyleParser.OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE));
        this.binding.bannerContainer.setBackground(gradientDrawable);
        this.binding.bannerContainer.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BannerRowVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        clearCorners();
        this.binding.bannerView.setBackground(new LayerDrawable(new GradientDrawable[]{this.topBackgroundLayer}));
        roundedCorners(item);
        addAdditionalPaddings(item);
        ImageView imageIv = this.binding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ImageViewExtKt.load$default(imageIv, item.getImage(), null, null, null, null, false, null, 126, null);
        setBannerContainerBackground(item.getBackground());
        TextAtomView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextAtomHolderKt.bind$default(titleTv, item.getTitle(), null, 2, null);
        FrameLayout bannerView = this.binding.bannerView;
        Intrinsics.checkNotNullExpressionValue(bannerView, "bannerView");
        ViewExtKt.setOnClickListenerThrottle$default(bannerView, 0L, new BannerRowViewHolder$bind$1(item, this), 1, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BannerRowVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((BannerRowViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
