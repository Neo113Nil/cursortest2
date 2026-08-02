package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view;

import Am.C2438a;
import BQ.b;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.adapter.AviaCheckTariffsBenefitsAdapter;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001E\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJG\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001b\u0010?\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u00102R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR*\u0010R\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onItemClick", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "onExpand", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "setViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "bindAppearance", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;)V", "bindContent", "setupView", "()V", "addViews", "setConstraints", "dp2", "I", "dp4", "dp8", "dp12", "dp16", "", "dpf16", "F", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/adapter/AviaCheckTariffsBenefitsAdapter;", "benefitsAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/adapter/AviaCheckTariffsBenefitsAdapter;", "Lru/ozon/uni/android/atom/image/Image;", "imageI", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pricePAV$delegate", "getPricePAV", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pricePAV", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardView;", "discountPriceCard", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardView;", "originalPriceCard", "routeTAV$delegate", "getRouteTAV", "routeTAV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "milesBadgeBV$delegate", "getMilesBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "milesBadgeBV", "ru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsView$benefitsListRV$1", "benefitsListRV", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsView$benefitsListRV$1;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsShowMoreButtonView;", "showMoreButtonView", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsShowMoreButtonView;", "Landroid/graphics/drawable/GradientDrawable;", "gradientBackground", "Landroid/graphics/drawable/GradientDrawable;", "Lkotlin/Function0;", "onClick", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandlers", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AviaCheckTariffsView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaCheckTariffsView.class, "pricePAV", "getPricePAV()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0), C2438a.c(AviaCheckTariffsView.class, "routeTAV", "getRouteTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaCheckTariffsView.class, "milesBadgeBV", "getMilesBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable = 8;
    private Function1<? super AtomAction, Unit> actionHandlers;

    @NotNull
    private final AviaCheckTariffsBenefitsAdapter benefitsAdapter;

    @NotNull
    private final AviaCheckTariffsView$benefitsListRV$1 benefitsListRV;

    @NotNull
    private final PriceCardView discountPriceCard;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int dp8;
    private final float dpf16;

    @NotNull
    private final GradientDrawable gradientBackground;

    @NotNull
    private final Image imageI;

    /* renamed from: milesBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate milesBadgeBV;
    private Function0<Unit> onClick;

    @NotNull
    private final PriceCardView originalPriceCard;

    /* renamed from: pricePAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pricePAV;

    /* renamed from: routeTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate routeTAV;

    @NotNull
    private final AviaCheckTariffsShowMoreButtonView showMoreButtonView;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    public /* synthetic */ AviaCheckTariffsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addViews() {
        addView(this.imageI);
        addView(getTitleTAV());
        addView(getPricePAV());
        addView(this.discountPriceCard);
        addView(this.originalPriceCard);
        addView(getRouteTAV());
        addView(getMilesBadgeBV());
        addView(this.benefitsListRV);
        addView(this.showMoreButtonView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getMilesBadgeBV() {
        return (BadgeView) this.milesBadgeBV.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceAtomView getPricePAV() {
        return (PriceAtomView) this.pricePAV.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getRouteTAV() {
        return (TextAtomV2View) this.routeTAV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AviaCheckTariffsView$setConstraints$1(this));
    }

    private final void setupView() {
        setClipToOutline(true);
        setBackground(this.gradientBackground);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary), this.dpf16));
        setOnClickListener(new b(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupView$lambda$13(AviaCheckTariffsView aviaCheckTariffsView, View view) {
        Function0<Unit> function0 = aviaCheckTariffsView.onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bind(@NotNull AviaCheckTariffsVO.TariffItem.TariffVO state, Function1<? super AtomAction, Unit> onItemClick, Function1<? super CommonControlSettings, Unit> onExpand) {
        Intrinsics.checkNotNullParameter(state, "state");
        bindAppearance(state);
        bindContent(state, onItemClick, onExpand);
    }

    public final void bindAppearance(@NotNull AviaCheckTariffsVO.TariffItem.TariffVO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GradientDrawable gradientDrawable = this.gradientBackground;
        int i11 = this.dp2;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setStroke(i11, styleParser.parseColor(context, state.getBorderColor(), UniColors.GRAPHIC_NEUTRAL.getResId()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AviaCheckTariffsDTO.BackgroundWrapper backgroundColor = state.getBackgroundColor();
        int parseColor = styleParser.parseColor(context2, backgroundColor != null ? backgroundColor.getStartColor() : null, UniColors.LAYER_FLOOR_1.getResId());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        AviaCheckTariffsDTO.BackgroundWrapper backgroundColor2 = state.getBackgroundColor();
        Integer parseColor2 = styleParser.parseColor(context3, backgroundColor2 != null ? backgroundColor2.getEndColor() : null);
        this.gradientBackground.setColors(new int[]{parseColor, parseColor2 != null ? parseColor2.intValue() : parseColor});
    }

    public final void bindContent(@NotNull AviaCheckTariffsVO.TariffItem.TariffVO state, Function1<? super AtomAction, Unit> onItemClick, Function1<? super CommonControlSettings, Unit> onExpand) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.benefitsAdapter.setItems(state.getVisibleBenefits());
        TextHolderKt.bind$default(getTitleTAV(), state.getTitle(), null, 2, null);
        PriceAtomHolderKt.bindOrGone$default(getPricePAV(), state.getPrice(), null, 2, null);
        PriceCardView priceCardView = this.discountPriceCard;
        AviaCheckTariffsVO.TariffItem.PriceBlockVO priceBlock = state.getPriceBlock();
        priceCardView.bindOrGone(priceBlock != null ? priceBlock.getDiscountPriceCard() : null);
        PriceCardView priceCardView2 = this.originalPriceCard;
        AviaCheckTariffsVO.TariffItem.PriceBlockVO priceBlock2 = state.getPriceBlock();
        priceCardView2.bindOrGone(priceBlock2 != null ? priceBlock2.getOriginalPriceCard() : null);
        TextHolderKt.bindOrGone$default(getRouteTAV(), state.getRoute(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(getMilesBadgeBV(), state.getMilesBadge(), (Function1) null, 2, (Object) null);
        ImageHolderKt.bindOrGone$default(this.imageI, state.getMarketingImage(), null, 2, null);
        if (onItemClick != null) {
            this.onClick = new AviaCheckTariffsView$bindContent$1$1$1(state, onItemClick);
        }
        this.actionHandlers = onItemClick;
        this.showMoreButtonView.bindOrGone(state.getShowMoreButton(), onExpand);
        requestLayout();
    }

    public final void setViewPool(@NotNull RecyclerView.u pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        setRecycledViewPool(pool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsView$benefitsListRV$1] */
    public AviaCheckTariffsView(@NotNull final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dpf16 = ResourceExtKt.toPxF(16, context);
        AviaCheckTariffsBenefitsAdapter aviaCheckTariffsBenefitsAdapter = new AviaCheckTariffsBenefitsAdapter(new AviaCheckTariffsView$benefitsAdapter$1(this));
        this.benefitsAdapter = aviaCheckTariffsBenefitsAdapter;
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.aviaCheckTariffsImageI);
        image.setLayoutParams(new ConstraintLayout.b(-2, -2));
        image.setClipToOutline(true);
        image.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsView$imageI$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                int i12;
                int i13;
                int i14;
                int i15;
                float f7;
                if (view == null || outline == null) {
                    return;
                }
                i12 = AviaCheckTariffsView.this.dp2;
                i13 = AviaCheckTariffsView.this.dp2;
                int width = view.getWidth();
                i14 = AviaCheckTariffsView.this.dp2;
                int i16 = width - i14;
                int height = view.getHeight();
                i15 = AviaCheckTariffsView.this.dp2;
                f7 = AviaCheckTariffsView.this.dpf16;
                outline.setRoundRect(i12, i13, i16, height - i15, f7);
            }
        });
        this.imageI = image;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new AviaCheckTariffsView$special$$inlined$preCreationViewPool$default$1(this), new AviaCheckTariffsView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.pricePAV = new PreCreationViewPoolDelegate(context3, N.b(PriceAtomView.class), new AviaCheckTariffsView$special$$inlined$preCreationViewPool$default$3(this), new AviaCheckTariffsView$special$$inlined$preCreationViewPool$default$4());
        int i12 = 0;
        int i13 = 0;
        AttributeSet attributeSet2 = null;
        int i14 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        PriceCardView priceCardView = new PriceCardView(context, attributeSet2, i12, i13, i14, defaultConstructorMarker);
        priceCardView.setId(R$id.aviaCheckTariffsDiscountPricePC);
        priceCardView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.discountPriceCard = priceCardView;
        PriceCardView priceCardView2 = new PriceCardView(context, attributeSet2, i12, i13, i14, defaultConstructorMarker);
        priceCardView2.setId(R$id.aviaCheckTariffsOriginalPricePC);
        priceCardView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.originalPriceCard = priceCardView2;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.routeTAV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new AviaCheckTariffsView$special$$inlined$preCreationViewPool$default$5(this), new AviaCheckTariffsView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.milesBadgeBV = new PreCreationViewPoolDelegate(context5, N.b(BadgeView.class), new AviaCheckTariffsView$special$$inlined$preCreationViewPool$default$7(this), new AviaCheckTariffsView$special$$inlined$preCreationViewPool$default$8());
        ?? r02 = new RecyclerView(context) { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsView$benefitsListRV$1
            private final Rect tempRect = new Rect();

            private final boolean hasClickableViewAt(ViewGroup parent, int x11, int y11) {
                for (int childCount = parent.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = parent.getChildAt(childCount);
                    if (childAt.getVisibility() == 0) {
                        childAt.getHitRect(this.tempRect);
                        if (this.tempRect.contains(x11, y11) && childAt.isClickable()) {
                            return true;
                        }
                    }
                }
                return false;
            }

            private final boolean isTouchOnClickableChild(MotionEvent e11) {
                View findChildViewUnder = findChildViewUnder(e11.getX(), e11.getY());
                ViewGroup viewGroup = findChildViewUnder instanceof ViewGroup ? (ViewGroup) findChildViewUnder : null;
                if (viewGroup == null) {
                    return false;
                }
                return hasClickableViewAt(viewGroup, (int) (e11.getX() - viewGroup.getLeft()), (int) (e11.getY() - viewGroup.getTop()));
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (isTouchOnClickableChild(e11)) {
                    return super.onInterceptTouchEvent(e11);
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
            public boolean onTouchEvent(MotionEvent e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (isTouchOnClickableChild(e11)) {
                    return super.onTouchEvent(e11);
                }
                return false;
            }
        };
        r02.setId(R$id.aviaCheckTariffsBenefitsListRV);
        r02.setLayoutParams(new ConstraintLayout.b(0, -2));
        r02.setAdapter(aviaCheckTariffsBenefitsAdapter);
        r02.setItemAnimator(null);
        r02.setLayoutManager(new LinearLayoutManager(context, 1, false));
        r02.setNestedScrollingEnabled(false);
        this.benefitsListRV = r02;
        AviaCheckTariffsShowMoreButtonView aviaCheckTariffsShowMoreButtonView = new AviaCheckTariffsShowMoreButtonView(context);
        aviaCheckTariffsShowMoreButtonView.setId(R$id.aviaCheckTariffsShowMoreBadgeBV);
        aviaCheckTariffsShowMoreButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.showMoreButtonView = aviaCheckTariffsShowMoreButtonView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(16, context));
        this.gradientBackground = gradientDrawable;
        addViews();
        setupView();
        setConstraints();
    }
}
