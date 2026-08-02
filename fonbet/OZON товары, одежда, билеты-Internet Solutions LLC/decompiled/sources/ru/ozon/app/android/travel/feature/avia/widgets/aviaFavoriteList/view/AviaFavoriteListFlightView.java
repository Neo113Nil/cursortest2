package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view;

import Am.C2438a;
import JG.b;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListFlightVI;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view.adapter.AviaFavoriteListAirlineIconsAtomsDecoration;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J<\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000e072\u0018\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000e0:J6\u0010<\u001a\u00020\u000e2\u001a\u00106\u001a\u0016\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000e\u0018\u000107j\u0004\u0018\u0001`=2\b\u0010>\u001a\u0004\u0018\u0001082\b\u0010?\u001a\u0004\u0018\u00010@J\u0006\u0010A\u001a\u00020\u001dJ\b\u0010B\u001a\u00020\u000eH\u0002J\b\u0010C\u001a\u00020\u000eH\u0002J\b\u0010D\u001a\u00020\u000eH\u0002J\b\u0010E\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b$\u0010!R\u001b\u0010&\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b'\u0010!R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0016\u001a\u0004\b0\u00101¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/AviaFavoriteListFlightView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "iconsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "airlinesTextMaxWith", "", "onClick", "Lkotlin/Function0;", "", "flightBackground", "Landroid/graphics/drawable/ShapeDrawable;", "pricePAV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getPricePAV", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pricePAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "badgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeBV$delegate", "favoriteButtonV", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "flightInfoTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getFlightInfoTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "flightInfoTAV$delegate", "luggageTextTAV", "getLuggageTextTAV", "luggageTextTAV$delegate", "airlinesTextTAV", "getAirlinesTextTAV", "airlinesTextTAV$delegate", "airlineIconsHAL", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "wayThereDetailsASRFL", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/AviaFavoriteListTripRouteView;", "wayBackDetailsASRFL", "buttonV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonV", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonV$delegate", "bind", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onFavoriteButtonBind", "Lkotlin/Function2;", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "bindBackground", "Lru/ozon/app/android/action/BuildedActionHandler;", "cardClickAction", "backgroundColor", "", "getFavoriteButtonView", "addViews", "setConstraints", "setupRoot", "setupViews", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaFavoriteListFlightView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AviaFavoriteListFlightView.class, "pricePAV", "getPricePAV()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0), C2438a.c(AviaFavoriteListFlightView.class, "badgeBV", "getBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(AviaFavoriteListFlightView.class, "flightInfoTAV", "getFlightInfoTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaFavoriteListFlightView.class, "luggageTextTAV", "getLuggageTextTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaFavoriteListFlightView.class, "airlinesTextTAV", "getAirlinesTextTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaFavoriteListFlightView.class, "buttonV", "getButtonV()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final HorizontalAtomsLayout airlineIconsHAL;
    private final int airlinesTextMaxWith;

    /* renamed from: airlinesTextTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate airlinesTextTAV;

    /* renamed from: badgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badgeBV;

    /* renamed from: buttonV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate buttonV;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final ProductFavoriteMoleculeV4ButtonView favoriteButtonV;

    @NotNull
    private final ShapeDrawable flightBackground;

    /* renamed from: flightInfoTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate flightInfoTAV;

    @NotNull
    private final AtomsAdapter iconsAdapter;

    /* renamed from: luggageTextTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate luggageTextTAV;
    private Function0<Unit> onClick;

    /* renamed from: pricePAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pricePAV;

    @NotNull
    private final AviaFavoriteListTripRouteView wayBackDetailsASRFL;

    @NotNull
    private final AviaFavoriteListTripRouteView wayThereDetailsASRFL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaFavoriteListFlightView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.iconsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.airlinesTextMaxWith = (int) ((context.getResources().getDisplayMetrics().widthPixels - dimens$default.getMargin16()) * 0.4f);
        this.flightBackground = new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), dimens$default.getRadius20());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.pricePAV = new PreCreationViewPoolDelegate(context2, N.b(PriceAtomView.class), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$1(this), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.badgeBV = new PreCreationViewPoolDelegate(context3, N.b(BadgeView.class), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$3(this), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$4());
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = new ProductFavoriteMoleculeV4ButtonView(context, null, 0, 6, null);
        productFavoriteMoleculeV4ButtonView.setId(View.generateViewId());
        productFavoriteMoleculeV4ButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.favoriteButtonV = productFavoriteMoleculeV4ButtonView;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.flightInfoTAV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$5(this), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.luggageTextTAV = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$7(this), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$8());
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.airlinesTextTAV = new PreCreationViewPoolDelegate(context6, N.b(TextAtomV2View.class), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$9(this), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$10(this));
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41660x = 0;
        horizontalAtomsLayout.setLayoutParams(bVar);
        this.airlineIconsHAL = horizontalAtomsLayout;
        AviaFavoriteListTripRouteView aviaFavoriteListTripRouteView = new AviaFavoriteListTripRouteView(context);
        aviaFavoriteListTripRouteView.setId(View.generateViewId());
        aviaFavoriteListTripRouteView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.wayThereDetailsASRFL = aviaFavoriteListTripRouteView;
        AviaFavoriteListTripRouteView aviaFavoriteListTripRouteView2 = new AviaFavoriteListTripRouteView(context);
        aviaFavoriteListTripRouteView2.setId(View.generateViewId());
        aviaFavoriteListTripRouteView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.wayBackDetailsASRFL = aviaFavoriteListTripRouteView2;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.buttonV = new PreCreationViewPoolDelegate(context7, N.b(ButtonV3View.class), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$11(this), new AviaFavoriteListFlightView$special$$inlined$preCreationViewPool$default$12());
        addViews();
        setConstraints();
        setupRoot();
        setupViews();
    }

    private final void addViews() {
        addView(getPricePAV());
        addView(getBadgeBV());
        addView(this.favoriteButtonV);
        addView(this.airlineIconsHAL);
        addView(getFlightInfoTAV());
        addView(getLuggageTextTAV());
        addView(getAirlinesTextTAV());
        addView(this.wayThereDetailsASRFL);
        addView(this.wayBackDetailsASRFL);
        addView(getButtonV());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getAirlinesTextTAV() {
        return (TextAtomV2View) this.airlinesTextTAV.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getBadgeBV() {
        return (BadgeView) this.badgeBV.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View getButtonV() {
        return (ButtonV3View) this.buttonV.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getFlightInfoTAV() {
        return (TextAtomV2View) this.flightInfoTAV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getLuggageTextTAV() {
        return (TextAtomV2View) this.luggageTextTAV.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceAtomView getPricePAV() {
        return (PriceAtomView) this.pricePAV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AviaFavoriteListFlightView$setConstraints$1(this));
    }

    private final void setupRoot() {
        setPadding(this.dsProvider.getMargin16(), 0, 0, this.dsProvider.getMargin16());
        setClickable(true);
        setOnClickListener(new b(this, 12));
        setBackground(this.flightBackground);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context, UniColors.BG_ACTION_SECONDARY.getResId()), this.dsProvider.getRadius20()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRoot$lambda$15(AviaFavoriteListFlightView aviaFavoriteListFlightView, View view) {
        Function0<Unit> function0 = aviaFavoriteListFlightView.onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void setupViews() {
        this.airlineIconsHAL.setAdapter(this.iconsAdapter);
        HorizontalAtomsLayout horizontalAtomsLayout = this.airlineIconsHAL;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new AviaFavoriteListAirlineIconsAtomsDecoration(context));
        getLuggageTextTAV().setTextIsSelectable(false);
        getAirlinesTextTAV().setTextIsSelectable(false);
    }

    public final void bind(@NotNull AviaFavoriteListFlightVI item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super ProductFavoriteMoleculeV4ButtonView, ? super FavoriteProductModel, Unit> onFavoriteButtonBind) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onFavoriteButtonBind, "onFavoriteButtonBind");
        bindBackground(actionHandler, item.getCommon(), item.getBackgroundColor());
        PriceAtomHolderKt.bind$default(getPricePAV(), item.getPrice(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(getBadgeBV(), item.getBadge(), (Function1) null, 2, (Object) null);
        TextHolderKt.bindOrGone$default(getLuggageTextTAV(), item.getLuggageText(), null, 2, null);
        TextHolderKt.bindOrGone$default(getFlightInfoTAV(), item.getFlightInfo(), null, 2, null);
        onFavoriteButtonBind.invoke(this.favoriteButtonV, item.getFavoriteButton());
        if (item.getAirlineIcons() != null) {
            ViewExtKt.show(this.airlineIconsHAL);
            AtomsAdapter atomsAdapter = this.iconsAdapter;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, item.getAirlineIcons());
        } else {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.airlineIconsHAL);
        }
        TextHolderKt.bindOrGone$default(getAirlinesTextTAV(), item.getAirlinesText(), null, 2, null);
        this.wayThereDetailsASRFL.bindOrGone(item.getWayThereDetails());
        this.wayBackDetailsASRFL.bindOrGone(item.getWayBackDetails());
        ButtonV3HolderKt.bindOrGone(getButtonV(), item.getButton(), actionHandler);
    }

    public final void bindBackground(Function1<? super AtomAction, Unit> actionHandler, AtomAction cardClickAction, String backgroundColor) {
        this.onClick = new AviaFavoriteListFlightView$bindBackground$1(cardClickAction, actionHandler);
        ShapeDrawable shapeDrawable = this.flightBackground;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shapeDrawable.setTint(styleParser.parseColor(context, backgroundColor, UniColors.LAYER_FLOOR_1.getResId()));
    }

    @NotNull
    /* renamed from: getFavoriteButtonView, reason: from getter */
    public final ProductFavoriteMoleculeV4ButtonView getFavoriteButtonV() {
        return this.favoriteButtonV;
    }
}
