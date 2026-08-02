package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content;

import Sc.InterfaceC4008j;
import Sc.n;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
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
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.tours.databinding.WidgetToursFlightOptionsBinding;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsWidgetViewHolder;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.adapter.ToursFlightBadgesAdapter;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.adapter.ToursFlightBadgesItemDecoration;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import y7.InterfaceC10852c;
import y7.k;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010$\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0016¢\u0006\u0004\b$\u0010%R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010<\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u001b\u0010?\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u001b\u0010B\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u00108R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010H\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00150F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Landroid/widget/LinearLayout;", "layout", "", "", "logos", "", "size", "margin", "", "bindAirlineLogos", "(Landroid/widget/LinearLayout;Ljava/util/List;II)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetToursFlightOptionsBinding;", "binding", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetToursFlightOptionsBinding;", "", "dpf24", "F", "dp24", "I", "dp8", "bgColor", "Landroid/content/res/ColorStateList;", "rippleColor", "Landroid/content/res/ColorStateList;", "Landroid/graphics/drawable/RippleDrawable;", "defaultBackground$delegate", "LSc/j;", "getDefaultBackground", "()Landroid/graphics/drawable/RippleDrawable;", "defaultBackground", "topCornersBackground$delegate", "getTopCornersBackground", "topCornersBackground", "bottomCornersBackground$delegate", "getBottomCornersBackground", "bottomCornersBackground", "cornersBackground$delegate", "getCornersBackground", "cornersBackground", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/adapter/ToursFlightBadgesAdapter;", "badgesAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/adapter/ToursFlightBadgesAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightOptionsWidgetViewHolder extends k<ToursFlightOptionsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ToursFlightBadgesAdapter badgesAdapter;
    private final int bgColor;

    @NotNull
    private final WidgetToursFlightOptionsBinding binding;

    /* renamed from: bottomCornersBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomCornersBackground;

    /* renamed from: cornersBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cornersBackground;

    /* renamed from: defaultBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultBackground;
    private final int dp24;
    private final int dp8;
    private final float dpf24;

    @NotNull
    private final ColorStateList rippleColor;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: topCornersBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topCornersBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursFlightOptionsWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetToursFlightOptionsBinding bind = WidgetToursFlightOptionsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.dpf24 = ResourceExtKt.toPxF(24, getContext());
        this.dp24 = ResourceExtKt.toPx(24, getContext());
        this.dp8 = ResourceExtKt.toPx(8, getContext());
        this.bgColor = ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1);
        ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(getContext(), R$attr.bgActionSecondary));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        this.rippleColor = valueOf;
        n nVar = n.NONE;
        this.defaultBackground = Sc.k.a(nVar, new ToursFlightOptionsWidgetViewHolder$defaultBackground$2(this));
        this.topCornersBackground = Sc.k.a(nVar, new ToursFlightOptionsWidgetViewHolder$topCornersBackground$2(this));
        this.bottomCornersBackground = Sc.k.a(nVar, new ToursFlightOptionsWidgetViewHolder$bottomCornersBackground$2(this));
        this.cornersBackground = Sc.k.a(nVar, new ToursFlightOptionsWidgetViewHolder$cornersBackground$2(this));
        ToursFlightBadgesAdapter toursFlightBadgesAdapter = new ToursFlightBadgesAdapter();
        this.badgesAdapter = toursFlightBadgesAdapter;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        RecyclerView recyclerView = bind.toursFlightBadgeRecyclerView;
        recyclerView.setAdapter(toursFlightBadgesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.addItemDecoration(new ToursFlightBadgesItemDecoration(px, ResourceExtKt.toPx(8, context2)));
        bind.getConstraintLayout().setOnClickListener(new Dc0.n(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ToursFlightOptionsWidgetViewHolder toursFlightOptionsWidgetViewHolder, View view) {
        AtomAction selectAction;
        ToursFlightOptionsVO boundData = toursFlightOptionsWidgetViewHolder.getBoundData();
        if (boundData == null || (selectAction = boundData.getSelectAction()) == null) {
            return;
        }
        toursFlightOptionsWidgetViewHolder.actionHandler.invoke(selectAction);
    }

    private final void bindAirlineLogos(LinearLayout layout, List<String> logos, final int size, int margin) {
        layout.removeAllViews();
        int P11 = C7714v.P(logos);
        int i11 = 0;
        for (Object obj : logos) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String str = (String) obj;
            ShapeableImageView shapeableImageView = new ShapeableImageView(layout.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, size);
            layoutParams.setMarginEnd(i11 < P11 ? margin : 0);
            shapeableImageView.setLayoutParams(layoutParams);
            y7.k kVar = new y7.k();
            InterfaceC10852c interfaceC10852c = new InterfaceC10852c() { // from class: JT.a
                @Override // y7.InterfaceC10852c
                public final float a(RectF rectF) {
                    float bindAirlineLogos$lambda$6$lambda$5$lambda$4;
                    bindAirlineLogos$lambda$6$lambda$5$lambda$4 = ToursFlightOptionsWidgetViewHolder.bindAirlineLogos$lambda$6$lambda$5$lambda$4(size, rectF);
                    return bindAirlineLogos$lambda$6$lambda$5$lambda$4;
                }
            };
            k.a aVar = new k.a(kVar);
            aVar.d(interfaceC10852c);
            shapeableImageView.setShapeAppearanceModel(aVar.a());
            ImageViewExtKt.load$default(shapeableImageView, str, null, null, null, null, false, null, 126, null);
            layout.addView(shapeableImageView);
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float bindAirlineLogos$lambda$6$lambda$5$lambda$4(int i11, RectF it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return i11 / 2.0f;
    }

    private final RippleDrawable getBottomCornersBackground() {
        return (RippleDrawable) this.bottomCornersBackground.getValue();
    }

    private final RippleDrawable getCornersBackground() {
        return (RippleDrawable) this.cornersBackground.getValue();
    }

    private final RippleDrawable getDefaultBackground() {
        return (RippleDrawable) this.defaultBackground.getValue();
    }

    private final RippleDrawable getTopCornersBackground() {
        return (RippleDrawable) this.topCornersBackground.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ToursFlightOptionsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ShapeableImageView toursFlightAgencyLogoImageView = this.binding.toursFlightAgencyLogoImageView;
        Intrinsics.checkNotNullExpressionValue(toursFlightAgencyLogoImageView, "toursFlightAgencyLogoImageView");
        ImageViewExtKt.load$default(toursFlightAgencyLogoImageView, item.getAgencyLogoImageUrl(), null, null, null, null, false, null, 126, null);
        LinearLayout toursFlightAirlineLogosLayout = this.binding.toursFlightAirlineLogosLayout;
        Intrinsics.checkNotNullExpressionValue(toursFlightAirlineLogosLayout, "toursFlightAirlineLogosLayout");
        bindAirlineLogos(toursFlightAirlineLogosLayout, item.getAirlineLogoUrls(), this.dp24, this.dp8);
        BadgeView toursFlightWarningBadgeView = this.binding.toursFlightWarningBadgeView;
        Intrinsics.checkNotNullExpressionValue(toursFlightWarningBadgeView, "toursFlightWarningBadgeView");
        BadgeHolderKt.bindOrGone(toursFlightWarningBadgeView, item.getWarningBadge(), this.actionHandler);
        TextAtomView toursFlightWayThereTimeView = this.binding.toursFlightWayThereTimeView;
        Intrinsics.checkNotNullExpressionValue(toursFlightWayThereTimeView, "toursFlightWayThereTimeView");
        TextAtomHolderKt.bind$default(toursFlightWayThereTimeView, item.getWayThereDetails().getTime(), null, 2, null);
        AppCompatTextView toursFlightWayThereCounterView = this.binding.toursFlightWayThereCounterView;
        Intrinsics.checkNotNullExpressionValue(toursFlightWayThereCounterView, "toursFlightWayThereCounterView");
        TextViewExtKt.setTextOrGone(toursFlightWayThereCounterView, item.getWayThereDetails().getCounter());
        TextAtomView toursFlightWayThereRouteView = this.binding.toursFlightWayThereRouteView;
        Intrinsics.checkNotNullExpressionValue(toursFlightWayThereRouteView, "toursFlightWayThereRouteView");
        TextAtomHolderKt.bind$default(toursFlightWayThereRouteView, item.getWayThereDetails().getAirportCodes(), null, 2, null);
        TextAtomView toursFlightWayThereDurationView = this.binding.toursFlightWayThereDurationView;
        Intrinsics.checkNotNullExpressionValue(toursFlightWayThereDurationView, "toursFlightWayThereDurationView");
        TextAtomHolderKt.bind$default(toursFlightWayThereDurationView, item.getWayThereDetails().getDuration(), null, 2, null);
        TextAtomView toursFlightWayBackTimeView = this.binding.toursFlightWayBackTimeView;
        Intrinsics.checkNotNullExpressionValue(toursFlightWayBackTimeView, "toursFlightWayBackTimeView");
        TextAtomHolderKt.bind$default(toursFlightWayBackTimeView, item.getWayBackDetails().getTime(), null, 2, null);
        AppCompatTextView toursFlightWayBackCounterView = this.binding.toursFlightWayBackCounterView;
        Intrinsics.checkNotNullExpressionValue(toursFlightWayBackCounterView, "toursFlightWayBackCounterView");
        TextViewExtKt.setTextOrGone(toursFlightWayBackCounterView, item.getWayBackDetails().getCounter());
        TextAtomView toursFlightWayBackRouteView = this.binding.toursFlightWayBackRouteView;
        Intrinsics.checkNotNullExpressionValue(toursFlightWayBackRouteView, "toursFlightWayBackRouteView");
        TextAtomHolderKt.bind$default(toursFlightWayBackRouteView, item.getWayBackDetails().getAirportCodes(), null, 2, null);
        TextAtomView toursFlightWayBackDurationView = this.binding.toursFlightWayBackDurationView;
        Intrinsics.checkNotNullExpressionValue(toursFlightWayBackDurationView, "toursFlightWayBackDurationView");
        TextAtomHolderKt.bind$default(toursFlightWayBackDurationView, item.getWayBackDetails().getDuration(), null, 2, null);
        this.badgesAdapter.setItems(item.getFlightFeatures());
        PriceView toursFlightPriceView = this.binding.toursFlightPriceView;
        Intrinsics.checkNotNullExpressionValue(toursFlightPriceView, "toursFlightPriceView");
        PriceHolderKt.bind$default(toursFlightPriceView, item.getPrice(), null, 2, null);
        TextAtomView toursFlightPriceDescriptionView = this.binding.toursFlightPriceDescriptionView;
        Intrinsics.checkNotNullExpressionValue(toursFlightPriceDescriptionView, "toursFlightPriceDescriptionView");
        TextAtomHolderKt.bind$default(toursFlightPriceDescriptionView, item.getPriceDescription(), null, 2, null);
        TextAtomView toursFlightPriceMarketingView = this.binding.toursFlightPriceMarketingView;
        Intrinsics.checkNotNullExpressionValue(toursFlightPriceMarketingView, "toursFlightPriceMarketingView");
        TextAtomHolderKt.bindOrGone$default(toursFlightPriceMarketingView, item.getMarketingText(), null, 2, null);
        View toursFlightPriceSeparatorV = this.binding.toursFlightPriceSeparatorV;
        Intrinsics.checkNotNullExpressionValue(toursFlightPriceSeparatorV, "toursFlightPriceSeparatorV");
        toursFlightPriceSeparatorV.setVisibility(item.getIsLastFlight() ? 4 : 0);
        this.binding.getConstraintLayout().setBackground((item.getIsFirstFlight() && item.getIsLastFlight()) ? getCornersBackground() : item.getIsFirstFlight() ? getTopCornersBackground() : item.getIsLastFlight() ? getBottomCornersBackground() : getDefaultBackground());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ToursFlightOptionsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ToursFlightOptionsWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
