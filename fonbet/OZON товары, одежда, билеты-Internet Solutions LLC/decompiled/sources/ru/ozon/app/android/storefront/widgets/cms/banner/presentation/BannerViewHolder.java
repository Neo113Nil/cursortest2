package ru.ozon.app.android.storefront.widgets.cms.banner.presentation;

import W10.c;
import WZ.t;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.widgets.cms.R$id;
import ru.ozon.app.android.storefront.widgets.cms.banner.presentation.BannerViewHolder;
import ru.ozon.app.android.storefront.widgets.cms.databinding.ItemComponentBannerBinding;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001+\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindAdvBadgeView", "(Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVO;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVO;Ll20/d;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/cms/databinding/ItemComponentBannerBinding;", "binding", "Lru/ozon/app/android/storefront/widgets/cms/databinding/ItemComponentBannerBinding;", "", "dp8", "I", "dp16", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "advBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "ru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerViewHolder$roundedOutlineProvider$1", "roundedOutlineProvider", "Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerViewHolder$roundedOutlineProvider$1;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BannerViewHolder extends k<BannerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private BadgeView advBadgeView;

    @NotNull
    private final ItemComponentBannerBinding binding;

    @NotNull
    private final View containerView;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final BannerViewHolder$roundedOutlineProvider$1 roundedOutlineProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [ru.ozon.app.android.storefront.widgets.cms.banner.presentation.BannerViewHolder$roundedOutlineProvider$1] */
    public BannerViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
        ItemComponentBannerBinding bind = ItemComponentBannerBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.dp8 = ResourceExtKt.toPx(8);
        this.dp16 = ResourceExtKt.toPx(16, getContext());
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.roundedOutlineProvider = new ViewOutlineProvider() { // from class: ru.ozon.app.android.storefront.widgets.cms.banner.presentation.BannerViewHolder$roundedOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                int i11;
                if (view == null || outline == null) {
                    return;
                }
                int width = view.getWidth();
                int height = view.getHeight();
                i11 = BannerViewHolder.this.dp16;
                outline.setRoundRect(0, 0, width, height, i11);
            }
        };
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: tK.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerViewHolder._init_$lambda$3(BannerViewHolder.this, view);
            }
        });
        bind.bannerImageIv.setScaleType(ImageView.ScaleType.CENTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(BannerViewHolder bannerViewHolder, View view) {
        String deeplink;
        String str;
        t tokenizedEvent;
        BannerVO boundData = bannerViewHolder.getBoundData();
        if (boundData == null || (deeplink = boundData.getDeeplink()) == null) {
            return;
        }
        ComposerNavigator navigator = bannerViewHolder.refs.getNavigator();
        View view2 = bannerViewHolder.containerView;
        BannerVO boundData2 = bannerViewHolder.getBoundData();
        if (boundData2 == null || (str = boundData2.toString()) == null) {
            str = "";
        }
        view2.setTransitionName("transition_view".concat(str));
        Unit unit = Unit.f71690a;
        navigator.openDeeplink(deeplink, U.i(new Pair("transition_view", view2)));
        BannerVO boundData3 = bannerViewHolder.getBoundData();
        if (boundData3 == null || (tokenizedEvent = boundData3.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(bannerViewHolder.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    private final void bindAdvBadgeView(BannerVO item) {
        if (item.getAdvBadge() == null && this.advBadgeView == null) {
            return;
        }
        if (this.advBadgeView == null) {
            BadgeView badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), this.containerView.getContext());
            if (badgeView == null) {
                Context context = this.containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                badgeView = new BadgeView(context, null, 0, 0, 14, null);
            }
            badgeView.setId(R$id.advBadgeV);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            badgeView.setElevation(10.0f);
            int i11 = this.dp8;
            layoutParams.setMargins(i11, i11, i11, i11);
            badgeView.setLayoutParams(layoutParams);
            this.binding.bannerFl.addView(badgeView);
            this.advBadgeView = badgeView;
        }
        BadgeView badgeView2 = this.advBadgeView;
        if (badgeView2 != null) {
            BadgeHolderKt.bindOrGone(badgeView2, item.getAdvBadge(), this.actionHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BannerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayout.setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), R$color.layer_floor_1));
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (item.getIsRounded() && item.getDisableVerticalMargins()) {
            int i11 = this.dp16;
            constraintLayout.setPadding(i11, 0, i11, 0);
        } else if (item.getIsRounded()) {
            int i12 = this.dp16;
            constraintLayout.setPadding(i12, i12, i12, i12);
        } else {
            constraintLayout.setPadding(0, 0, 0, 0);
        }
        constraintLayout.setLayoutParams(marginLayoutParams);
        AspectRatioImageView aspectRatioImageView = this.binding.bannerImageIv;
        aspectRatioImageView.layout(0, 0, 0, 0);
        aspectRatioImageView.setRatio(Float.valueOf(item.getRatio()));
        ImageViewExtKt.loadAsBitmap$default(aspectRatioImageView, item.getImage(), null, null, null, 14, null);
        aspectRatioImageView.setOutlineProvider(item.getIsRounded() ? this.roundedOutlineProvider : ViewOutlineProvider.BACKGROUND);
        aspectRatioImageView.setClipToOutline(item.getIsRounded());
        bindAdvBadgeView(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BannerVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((BannerViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
