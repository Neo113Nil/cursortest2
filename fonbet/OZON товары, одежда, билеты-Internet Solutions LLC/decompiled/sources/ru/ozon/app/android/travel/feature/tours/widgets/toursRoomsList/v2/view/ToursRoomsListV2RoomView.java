package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.view;

import Bl.b;
import Lc.a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.x;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.ToursRoomsListV2RoomVO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.images.ToursRoomsListV2ImagesAdapter;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.images.ToursRoomsListV2ImagesDecoration;
import ru.ozon.app.android.travel.molecules.view.indicator.DottedIndicatorView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0013J\"\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00110+J\b\u0010-\u001a\u00020\u0011H\u0002J\b\u0010.\u001a\u00020\u0011H\u0002J\b\u0010/\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/view/ToursRoomsListV2RoomView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp4", "dp8", "dp16", "dpf24", "", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "onRoomClick", "Lkotlin/Function0;", "", "imagesAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/images/ToursRoomsListV2ImagesAdapter;", "indicatorDIV", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "imagesRV", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "detailBadgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "detailsVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "detailsClickV", "Landroid/view/View;", "pricePV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceDescriptionTAV", "selectButtonBV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "setupAdapter", "adapter", "bind", "room", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/ToursRoomsListV2RoomVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setupLayout", "addViews", "setConstraints", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursRoomsListV2RoomView extends ConstraintLayoutWithBorder {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final BadgeView detailBadgeBV;

    @NotNull
    private final View detailsClickV;

    @NotNull
    private final VerticalAtomsLayout detailsVAL;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int dp8;
    private final float dpf24;
    private ToursRoomsListV2ImagesAdapter imagesAdapter;

    @NotNull
    private final LoopedRecyclerView imagesRV;

    @NotNull
    private final DottedIndicatorView indicatorDIV;
    private Function0<Unit> onRoomClick;

    @NotNull
    private final TextAtomV2View priceDescriptionTAV;

    @NotNull
    private final PriceAtomView pricePV;

    @NotNull
    private final ButtonV3View selectButtonBV;

    @NotNull
    private final TextAtomV2View titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursRoomsListV2RoomView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        this.dp4 = ResourceExtKt.toPx(4, context);
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dpf24 = ResourceExtKt.toPxF(24, context);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        DottedIndicatorView dottedIndicatorView = new DottedIndicatorView(context, null, 2, null);
        dottedIndicatorView.setId(R$id.toursRoomsListIndicatorDIV);
        dottedIndicatorView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        dottedIndicatorView.setDotColor(ThemeExtKt.themeColor(context, R$attr.bgOverlap));
        dottedIndicatorView.setDotRadius(px);
        dottedIndicatorView.setHighlightedDotColor(ThemeExtKt.themeColor(context, R$attr.bgPrimary));
        dottedIndicatorView.setHighlightedDotLength(px2);
        dottedIndicatorView.setSpacing(px);
        this.indicatorDIV = dottedIndicatorView;
        LoopedRecyclerView loopedRecyclerView = new LoopedRecyclerView(context, null, 0, 6, null);
        loopedRecyclerView.setId(R$id.toursRoomsListImagesRV);
        loopedRecyclerView.setLayoutParams(new ConstraintLayout.b(0, ResourceExtKt.toPx(210, context)));
        new x().attachToRecyclerView(loopedRecyclerView);
        loopedRecyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        loopedRecyclerView.addItemDecoration(new ToursRoomsListV2ImagesDecoration(context));
        loopedRecyclerView.setNestedScrollingEnabled(false);
        this.imagesRV = loopedRecyclerView;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(textAtomV2View, R$id.toursRoomsListTitleTAV, 0, -2, false);
        this.titleTAV = textAtomV2View;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        Im.a.c(badgeView, R$id.toursRoomsListDetailBadgeBV, -2, -2);
        this.detailBadgeBV = badgeView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.toursRoomsListDetailsVAL);
        verticalAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(new ToursRoomsListV2RoomDecoration(context));
        verticalAtomsLayout.setClickable(false);
        verticalAtomsLayout.setFocusable(false);
        this.detailsVAL = verticalAtomsLayout;
        View view = new View(context);
        view.setId(R$id.toursRoomsListDetailsClickV);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.detailsClickV = view;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        priceAtomView = priceAtomView == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView;
        priceAtomView.setId(R$id.toursRoomsListPricePV);
        priceAtomView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.pricePV = priceAtomView;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(textAtomV2View2, R$id.toursRoomsListPriceDescriptionTAV, -2, -2, false);
        this.priceDescriptionTAV = textAtomV2View2;
        ButtonV3View buttonV3View = (ButtonV3View) b.a(ButtonV3View.class, "type", qVar, null);
        buttonV3View = buttonV3View == null ? new ButtonV3View(context, null, 0, 0, 14, null) : buttonV3View;
        buttonV3View.setId(R$id.toursRoomsListSelectButtonBV);
        buttonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.selectButtonBV = buttonV3View;
        addViews();
        setConstraints();
        setupLayout();
    }

    private final void addViews() {
        addView(this.imagesRV);
        addView(this.indicatorDIV);
        addView(this.titleTAV);
        addView(this.detailBadgeBV);
        addView(this.detailsVAL);
        addView(this.detailsClickV);
        addView(this.pricePV);
        addView(this.priceDescriptionTAV);
        addView(this.selectButtonBV);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new ToursRoomsListV2RoomView$setConstraints$1(this));
    }

    private final void setupLayout() {
        setRadius(this.dpf24);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setPadding(0, 0, 0, this.dp16);
        setOnClickListener(new DS.a(this, 6));
        this.detailsClickV.setOnClickListener(new BS.a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupLayout$lambda$10(ToursRoomsListV2RoomView toursRoomsListV2RoomView, View view) {
        Function0<Unit> function0 = toursRoomsListV2RoomView.onRoomClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupLayout$lambda$9(ToursRoomsListV2RoomView toursRoomsListV2RoomView, View view) {
        Function0<Unit> function0 = toursRoomsListV2RoomView.onRoomClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bind(@NotNull ToursRoomsListV2RoomVO room, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(room, "room");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ToursRoomsListV2ImagesAdapter toursRoomsListV2ImagesAdapter = this.imagesAdapter;
        if (toursRoomsListV2ImagesAdapter != null) {
            toursRoomsListV2ImagesAdapter.setItems(room.getImages());
        }
        TextHolderKt.bind$default(this.titleTAV, room.getTitle(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.detailBadgeBV, room.getDetailBadge(), actionHandler);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, room.getDetails());
        PriceAtomHolderKt.bind$default(this.pricePV, room.getPrice(), null, 2, null);
        TextHolderKt.bind$default(this.priceDescriptionTAV, room.getPriceDescription(), null, 2, null);
        ButtonV3HolderKt.bind(this.selectButtonBV, room.getSelectButton(), actionHandler);
        this.onRoomClick = new ToursRoomsListV2RoomView$bind$1(room, actionHandler);
        this.imagesRV.setVisibility(room.getIsImagesVisible() ? 0 : 8);
        this.indicatorDIV.setVisibility(room.getIsImagesVisible() ? 0 : 8);
        this.detailsVAL.setVisibility(room.getIsDetailsVisible() ? 0 : 8);
    }

    public final void setupAdapter(@NotNull ToursRoomsListV2ImagesAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.imagesRV.setAdapter(adapter);
        this.imagesAdapter = adapter;
        this.indicatorDIV.attachTo(this.imagesRV);
    }
}
