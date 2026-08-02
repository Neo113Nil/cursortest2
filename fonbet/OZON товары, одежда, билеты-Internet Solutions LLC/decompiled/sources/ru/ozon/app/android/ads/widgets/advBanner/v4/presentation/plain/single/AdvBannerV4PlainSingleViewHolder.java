package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.single;

import Al.ViewOnClickListenerC2437a;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.K;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.ads.flags.AdvBannerV4LoadOptimizationFlag;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4DTO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewModel;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.view.AdvBannerV4ImageView;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.view.AdvBannerV4PlainItemView;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0017\b\u0000\u0018\u0000 ?2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001?B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0012J\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0012J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010\u0012J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010 \u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R2\u00107\u001a \u0012\b\u0012\u000603j\u0002`4\u0012\f\u0012\n\u0018\u000105j\u0004\u0018\u0001`6\u0012\u0004\u0012\u00020\u0010028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4PlainSingleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4SingleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;", "bannerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewModel;LWZ/l;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "observeSwipeRefresh", "()V", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "advBannerItemVO", "loadBannerImage", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;)V", "ru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4PlainSingleViewHolder$createLoadCallback$1", "createLoadCallback", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;)Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4PlainSingleViewHolder$createLoadCallback$1;", "trackItemClick", "trackViewAfterLoadImage", "trackViewAndImpression", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4SingleVO;Ll20/d;)V", "onRecycle", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewModel;", "LWZ/l;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lkotlin/reflect/KFunction2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "eventProcessing", "Lkotlin/reflect/h;", "", "isViewHolderVisible", "Z", "Lxe/B0;", "loadJob", "Lxe/B0;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvBannerV4PlainSingleViewHolder extends k<AdvBannerV4SingleVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdvBannerV4PlainItemView bannerView;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final h<Unit> eventProcessing;

    @NotNull
    private final FeatureChecker featureChecker;
    private boolean isViewHolderVisible;
    private B0 loadJob;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AdvBannerV4PlainViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4PlainSingleViewHolder$Companion;", "", "<init>", "()V", "HALF_BANNER_PERCENTAGE_VISIBILITY", "", "DEFAULT_HORIZONTAL_PADDING", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvBannerV4PlainSingleViewHolder(@NotNull AdvBannerV4PlainItemView bannerView, @NotNull ComposerReferences composerReferences, @NotNull AdvBannerV4PlainViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull FeatureChecker featureChecker) {
        super(bannerView);
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.bannerView = bannerView;
        this.composerReferences = composerReferences;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.featureChecker = featureChecker;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.eventProcessing = new AdvBannerV4PlainSingleViewHolder$eventProcessing$1(tokenizedAnalytics);
        bannerView.getAdvBannerImageView().setOnClickListener(new ViewOnClickListenerC2437a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AdvBannerV4PlainSingleViewHolder advBannerV4PlainSingleViewHolder, View view) {
        AdvBannerV4ItemVO banner;
        AdvBannerV4SingleVO boundData = advBannerV4PlainSingleViewHolder.getBoundData();
        if (boundData == null || (banner = boundData.getBanner()) == null) {
            return;
        }
        advBannerV4PlainSingleViewHolder.trackItemClick(banner);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.single.AdvBannerV4PlainSingleViewHolder$createLoadCallback$1] */
    private final AdvBannerV4PlainSingleViewHolder$createLoadCallback$1 createLoadCallback(final AdvBannerV4ItemVO advBannerItemVO) {
        return new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.single.AdvBannerV4PlainSingleViewHolder$createLoadCallback$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                if (resource == null) {
                    return;
                }
                AdvBannerV4ItemVO.this.setImageWasLoaded(true);
                this.trackViewAfterLoadImage();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadBannerImage(AdvBannerV4ItemVO advBannerItemVO) {
        AdvBannerV4ImageView advBannerImageView = this.bannerView.getAdvBannerImageView();
        advBannerImageView.layout(0, 0, 0, 0);
        ImageViewExtKt.load$default(advBannerImageView, advBannerItemVO.getImage(), null, createLoadCallback(advBannerItemVO), null, null, false, null, 122, null);
        advBannerImageView.requestLayout();
    }

    private final void observeSwipeRefresh() {
        this.composerReferences.getController().getEvents().observe(this.composerReferences.getContainer().g(), new AdvBannerV4PlainSingleViewHolder$sam$androidx_lifecycle_Observer$0(new AdvBannerV4PlainSingleViewHolder$observeSwipeRefresh$1(this)));
    }

    private final void trackItemClick(AdvBannerV4ItemVO advBannerItemVO) {
        String link = advBannerItemVO.getAction().getLink();
        if (link != null) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.composerReferences.getNavigator(), link, null, 2, null);
            if (advBannerItemVO.getCanTrack()) {
                t tokenizedEvent = advBannerItemVO.getTokenizedEvent();
                if (tokenizedEvent != null) {
                    TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
                }
                this.viewModel.trackClick(advBannerItemVO);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackViewAfterLoadImage() {
        trackViewAndImpression();
    }

    private final void trackViewAndImpression() {
        AdvBannerV4SingleVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        AdvBannerV4ItemVO banner = boundData.getBanner();
        if (banner.getCanTrack()) {
            this.viewModel.trackViewV4(banner, (Function2) this.eventProcessing);
            this.viewModel.trackImpressionV4(banner, (Function2) this.eventProcessing);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeSwipeRefresh();
    }

    @Override // jk0.j
    public void onRecycle() {
        B0 b02 = this.loadJob;
        if (b02 != null) {
            b02.j(null);
        }
        super.onRecycle();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        this.isViewHolderVisible = true;
        super.onViewInVisibleBounds();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        this.isViewHolderVisible = false;
        super.onViewOutOfVisibleBounds();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        double a11 = o.a(itemView, info, false);
        boolean z11 = a11 >= 0.5d;
        this.viewModel.setCanTrackPixels(a11 >= 0.5d);
        if (z11) {
            trackViewAndImpression();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdvBannerV4SingleVO item, @NotNull d info) {
        Integer marginHorizontal;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AdvBannerV4ItemVO banner = item.getBanner();
        AdvBannerV4DTO.DesignOptionsDTO designOptions = item.getDesignOptions();
        int px = ResourceExtKt.toPx((designOptions == null || (marginHorizontal = designOptions.getMarginHorizontal()) == null) ? 8 : marginHorizontal.intValue());
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.layer_floor_1);
        AdvBannerV4PlainItemView advBannerV4PlainItemView = this.bannerView;
        ViewExtKt.updatePadding$default(advBannerV4PlainItemView, px, 0, px, 0, 10, null);
        advBannerV4PlainItemView.setBackgroundColor(parseColor);
        BadgeHolderKt.bindOrGone(advBannerV4PlainItemView.getBadgeView(), banner.getBadge(), this.actionHandler);
        if (!this.featureChecker.isEnabled(AdvBannerV4LoadOptimizationFlag.INSTANCE)) {
            AdvBannerV4ImageView advBannerImageView = this.bannerView.getAdvBannerImageView();
            advBannerImageView.setCornerColor(parseColor);
            advBannerImageView.layout(0, 0, 0, 0);
            Float ratio = banner.getRatio();
            advBannerImageView.setRatio(ratio != null ? ratio.floatValue() : 1.0f);
            ImageViewExtKt.load$default(advBannerImageView, banner.getImage(), null, createLoadCallback(banner), null, null, false, null, 122, null);
            AdvBannerV4ItemVO.DesignOptions designOptions2 = banner.getDesignOptions();
            int topCornerRadius = designOptions2.getTopCornerRadius();
            Context context = advBannerImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float pxF = ResourceExtKt.toPxF(topCornerRadius, context);
            int bottomCornerRadius = designOptions2.getBottomCornerRadius();
            Context context2 = advBannerImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            advBannerImageView.setRadius(pxF, ResourceExtKt.toPxF(bottomCornerRadius, context2));
            return;
        }
        AdvBannerV4ImageView advBannerImageView2 = this.bannerView.getAdvBannerImageView();
        advBannerImageView2.setCornerColor(parseColor);
        Float ratio2 = banner.getRatio();
        advBannerImageView2.setRatio(ratio2 != null ? ratio2.floatValue() : 1.0f);
        AdvBannerV4ItemVO.DesignOptions designOptions3 = banner.getDesignOptions();
        int topCornerRadius2 = designOptions3.getTopCornerRadius();
        Context context3 = advBannerImageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float pxF2 = ResourceExtKt.toPxF(topCornerRadius2, context3);
        int bottomCornerRadius2 = designOptions3.getBottomCornerRadius();
        Context context4 = advBannerImageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        advBannerImageView2.setRadius(pxF2, ResourceExtKt.toPxF(bottomCornerRadius2, context4));
        B0 b02 = this.loadJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.loadJob = C10727i.c(K.a(this.composerReferences.getContainer().g()), null, null, new AdvBannerV4PlainSingleViewHolder$bind$3(this, banner, null), 3);
    }
}
