package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation;

import Lm0.a;
import Sc.InterfaceC4008j;
import T00.m;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.C5320h0;
import androidx.lifecycle.J;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.R$color;
import ru.ozon.app.android.travel.feature.hotels.databinding.ViewHotelsPageHeaderShimmersBinding;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetHotelsPageHeaderBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation.HotelsPageHeaderVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.utils.AsyncWidgetPerformanceTrackerKt;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconView;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B+\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J#\u00103\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\n\u00102\u001a\u000600j\u0002`1H\u0014¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00172\u0006\u00106\u001a\u000205H\u0014¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u00172\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000509H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00172\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J3\u0010G\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\n\u0010C\u001a\u00060Aj\u0002`B2\u000e\u0010F\u001a\n\u0018\u00010Dj\u0004\u0018\u0001`EH\u0016¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010MR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR \u0010]\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00170[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010cR\u0016\u0010k\u001a\u0004\u0018\u00010h8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010n\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "prepareInvalidPriceInfoWrapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "priceInfo", "", "isPremium", "", "bindPriceInfo", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;Z)V", "showShimmer", "(Z)V", "hideShimmer", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PremiumInfoVO;", "premiumInfo", "bindPremiumInfo", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PremiumInfoVO;)V", "", "asyncData", "fetchWidget", "(Ljava/lang/String;)V", "newStateWrapper", "updateState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;)V", "updatePriceInfo", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;)V", "", "newRadius", "updateBottomRadiusIfNecessary", "(I)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsPageHeaderBinding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsPageHeaderBinding;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ViewHotelsPageHeaderShimmersBinding;", "shimmersBinding$delegate", "LSc/j;", "getShimmersBinding", "()Lru/ozon/app/android/travel/feature/hotels/databinding/ViewHotelsPageHeaderShimmersBinding;", "shimmersBinding", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/graphics/drawable/GradientDrawable;", "premiumInfoBackground", "Landroid/graphics/drawable/GradientDrawable;", "backgroundColor", "I", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "backgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "bottomRadius", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderWidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderWidgetViewModel;", "widgetViewModel", "getWidgetName", "()Ljava/lang/String;", "widgetName", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageHeaderWidgetViewHolder extends k<HotelsPageHeaderVO> implements AsyncWidgetCallbacks<HotelsPageHeaderVO.StateWrapper> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;
    private final int backgroundColor;

    @NotNull
    private final RoundedBackgroundProducer backgroundProducer;

    @NotNull
    private final WidgetHotelsPageHeaderBinding binding;
    private int bottomRadius;

    @NotNull
    private final View containerView;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final GradientDrawable premiumInfoBackground;

    @NotNull
    private final ComposerReferences references;

    /* renamed from: shimmersBinding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j shimmersBinding;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsPageHeaderWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        this.containerView = containerView;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        WidgetHotelsPageHeaderBinding bind = WidgetHotelsPageHeaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.shimmersBinding = LazyUtilsKt.unsafeLazy(new HotelsPageHeaderWidgetViewHolder$shimmersBinding$2(this));
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(12, getContext()));
        this.premiumInfoBackground = gradientDrawable;
        int themeColor = ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        this.backgroundProducer = roundedBackgroundProducer;
        containerView.setClipToOutline(true);
        containerView.setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, themeColor, 0.0f, 0.0f, 0.0f, 0.0f, 30, null));
        atomsAdapter.setOnAction(buildHandler);
        bind.hotelsPageHeaderBadgesHfal.setAdapter(atomsAdapter);
    }

    private final void bindPremiumInfo(HotelsPageHeaderVO.PremiumInfoVO premiumInfo) {
        Integer parseColor;
        CellWithSubtitle24IconView hotelsPageHeaderPremiumPointsCws = this.binding.hotelsPageHeaderPremiumPointsCws;
        Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderPremiumPointsCws, "hotelsPageHeaderPremiumPointsCws");
        CellWithSubtitle24IconHolderKt.bindOrGone(hotelsPageHeaderPremiumPointsCws, premiumInfo != null ? premiumInfo.getPremiumButton() : null, this.actionHandler);
        if (ThemeExtKt.isDarkThemeActive(getContext())) {
            parseColor = StyleParser.INSTANCE.parseColor(getContext(), premiumInfo != null ? premiumInfo.getDarkBackgroundColor() : null);
        } else {
            parseColor = StyleParser.INSTANCE.parseColor(getContext(), premiumInfo != null ? premiumInfo.getBackgroundColor() : null);
        }
        if (parseColor != null) {
            this.premiumInfoBackground.setColor(parseColor.intValue());
            this.binding.hotelsPageHeaderPremiumPointsCws.setBackground(this.premiumInfoBackground);
        }
    }

    private final void bindPriceInfo(HotelsPageHeaderVO.PriceInfo priceInfo, boolean isPremium) {
        Group hotelsPageHeaderPriceGroup = this.binding.hotelsPageHeaderPriceGroup;
        Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderPriceGroup, "hotelsPageHeaderPriceGroup");
        boolean z11 = priceInfo instanceof HotelsPageHeaderVO.PriceInfo.PriceWrapper;
        hotelsPageHeaderPriceGroup.setVisibility(z11 ? 0 : 8);
        CellWithSubtitle24IconView hotelsPageHeaderPriceInfoCell = this.binding.hotelsPageHeaderPriceInfoCell;
        Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderPriceInfoCell, "hotelsPageHeaderPriceInfoCell");
        boolean z12 = priceInfo instanceof HotelsPageHeaderVO.PriceInfo.CellWrapper;
        hotelsPageHeaderPriceInfoCell.setVisibility(z12 ? 0 : 8);
        boolean z13 = priceInfo instanceof HotelsPageHeaderVO.PriceInfo.AsyncPlaceholder;
        if (z13) {
            showShimmer(isPremium);
        } else {
            hideShimmer();
        }
        if (z11) {
            PriceView hotelsPageHeaderPricePv = this.binding.hotelsPageHeaderPricePv;
            Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderPricePv, "hotelsPageHeaderPricePv");
            HotelsPageHeaderVO.PriceInfo.PriceWrapper priceWrapper = (HotelsPageHeaderVO.PriceInfo.PriceWrapper) priceInfo;
            PriceHolderKt.bind$default(hotelsPageHeaderPricePv, priceWrapper.getPrice(), null, 2, null);
            TextAtomView hotelsPageHeaderPriceDescriptionTav = this.binding.hotelsPageHeaderPriceDescriptionTav;
            Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderPriceDescriptionTav, "hotelsPageHeaderPriceDescriptionTav");
            TextAtomHolderKt.bind$default(hotelsPageHeaderPriceDescriptionTav, priceWrapper.getPriceDescription(), null, 2, null);
            bindPremiumInfo(priceWrapper.getPremiumInfo());
            return;
        }
        if (z12) {
            CellWithSubtitle24IconView hotelsPageHeaderPriceInfoCell2 = this.binding.hotelsPageHeaderPriceInfoCell;
            Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderPriceInfoCell2, "hotelsPageHeaderPriceInfoCell");
            CellWithSubtitle24IconHolderKt.bind(hotelsPageHeaderPriceInfoCell2, ((HotelsPageHeaderVO.PriceInfo.CellWrapper) priceInfo).getCell(), this.actionHandler);
        } else if (z13) {
            fetchWidget(((HotelsPageHeaderVO.PriceInfo.AsyncPlaceholder) priceInfo).getAsyncData());
        }
    }

    private final void fetchWidget(String asyncData) {
        HotelsPageHeaderWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.fetchWidget(asyncData);
        }
    }

    private final ViewHotelsPageHeaderShimmersBinding getShimmersBinding() {
        return (ViewHotelsPageHeaderShimmersBinding) this.shimmersBinding.getValue();
    }

    private final String getWidgetName() {
        b i11;
        d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    private final HotelsPageHeaderWidgetViewModel getWidgetViewModel() {
        return (HotelsPageHeaderWidgetViewModel) getWidgetViewModel();
    }

    private final void hideShimmer() {
        if (this.binding.hotelsPageHeaderShimmersVS.getParent() == null) {
            ConstraintLayout constraintLayout = getShimmersBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            constraintLayout.setVisibility(8);
            ShimmerView hotelsPageHeaderPremiumPointsPlaceholderSv = getShimmersBinding().hotelsPageHeaderPremiumPointsPlaceholderSv;
            Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderPremiumPointsPlaceholderSv, "hotelsPageHeaderPremiumPointsPlaceholderSv");
            hotelsPageHeaderPremiumPointsPlaceholderSv.setVisibility(8);
            ConstraintLayout constraintLayout2 = getShimmersBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            Iterator<Object> it = C5320h0.a(constraintLayout2).iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                ShimmerView shimmerView = view instanceof ShimmerView ? (ShimmerView) view : null;
                if (shimmerView != null) {
                    shimmerView.hideShimmer();
                }
            }
        }
    }

    private final HotelsPageHeaderVO.PriceInfo prepareInvalidPriceInfoWrapper() {
        return HotelsPageHeaderVO.PriceInfo.Invalid.INSTANCE;
    }

    private final void showShimmer(boolean isPremium) {
        ConstraintLayout constraintLayout = getShimmersBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(0);
        if (isPremium) {
            ShimmerView hotelsPageHeaderPremiumPointsPlaceholderSv = getShimmersBinding().hotelsPageHeaderPremiumPointsPlaceholderSv;
            Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderPremiumPointsPlaceholderSv, "hotelsPageHeaderPremiumPointsPlaceholderSv");
            hotelsPageHeaderPremiumPointsPlaceholderSv.setVisibility(0);
        }
        ConstraintLayout constraintLayout2 = getShimmersBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        Iterator<Object> it = C5320h0.a(constraintLayout2).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            ShimmerView shimmerView = view instanceof ShimmerView ? (ShimmerView) view : null;
            if (shimmerView != null) {
                shimmerView.showShimmer(true);
            }
        }
    }

    private final void updateBottomRadiusIfNecessary(int newRadius) {
        if (this.bottomRadius == newRadius) {
            return;
        }
        this.bottomRadius = newRadius;
        float pxF = ResourceExtKt.toPxF(newRadius, getContext());
        this.containerView.setBackground(RoundedBackgroundProducer.produce$default(this.backgroundProducer, this.backgroundColor, 0.0f, 0.0f, pxF, pxF, 6, null));
    }

    private final void updatePriceInfo(HotelsPageHeaderVO.PriceInfo priceInfo) {
        this.references.getController().update(new HotelsPageHeaderPriceInfoUpdate(priceInfo));
    }

    private final void updateState(HotelsPageHeaderVO.StateWrapper newStateWrapper) {
        this.references.getController().update(new HotelsPageHeaderFullStateUpdate(newStateWrapper));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<HotelsPageHeaderVO.StateWrapper> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        AsyncWidgetPerformanceTrackerKt.trackAsyncWidgetEndTime(this.performanceTrackerDelegate, getWidgetName(), fetchedModel.getMetrics());
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        updateState(fetchedModel.getFetchedState());
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        updatePriceInfo(prepareInvalidPriceInfoWrapper());
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        HotelsPageHeaderWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsPageHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        HotelsPageHeaderVO.StateWrapper stateWrapper = item.getStateWrapper();
        updateBottomRadiusIfNecessary(item.getBottomRadius());
        this.atomsAdapter.bind(getContext(), stateWrapper.getBadges());
        HorizontalFlexAtomsLayout hotelsPageHeaderBadgesHfal = this.binding.hotelsPageHeaderBadgesHfal;
        Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderBadgesHfal, "hotelsPageHeaderBadgesHfal");
        hotelsPageHeaderBadgesHfal.setVisibility(stateWrapper.getIsBadgesVisible() ? 0 : 8);
        TextAtomView hotelsPageHeaderStarsTav = this.binding.hotelsPageHeaderStarsTav;
        Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderStarsTav, "hotelsPageHeaderStarsTav");
        TextAtomHolderKt.bindOrGone$default(hotelsPageHeaderStarsTav, stateWrapper.getStars(), null, 2, null);
        TextAtomView hotelsPageHeaderTitleTav = this.binding.hotelsPageHeaderTitleTav;
        Intrinsics.checkNotNullExpressionValue(hotelsPageHeaderTitleTav, "hotelsPageHeaderTitleTav");
        TextAtomHolderKt.bindOrGone$default(hotelsPageHeaderTitleTav, stateWrapper.getTitle(), null, 2, null);
        this.binding.hotelsPageHeaderAddressLbv.bindOrGone(stateWrapper.getAddress(), this.actionHandler);
        bindPriceInfo(stateWrapper.getPriceInfo(), stateWrapper.getIsPremium());
        if (stateWrapper.getIsMirBadgeExist()) {
            View childAt = this.binding.hotelsPageHeaderBadgesHfal.getChildAt(C7714v.P(stateWrapper.getBadges()));
            BadgeView badgeView = childAt instanceof BadgeView ? (BadgeView) childAt : null;
            if (badgeView != null) {
                badgeView.setBackgroundColor(getContext().getColor(R$color.bg_travel_mir));
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsPageHeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsPageHeaderWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
