package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.view;

import Am.C2438a;
import D40.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionVO;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.adapter.tariffs.PassengersLuggageSelectionTariffAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.adapter.tariffs.PassengersLuggageSelectionTariffDecoration;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000201\u0018\u000105J\b\u00107\u001a\u000201H\u0002J\b\u00108\u001a\u000201H\u0002J\b\u00109\u001a\u000201H\u0002J\b\u0010:\u001a\u000201H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\"\u0010\u001fR\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001b\u001a\u0004\b+\u0010,R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/view/PassengersLuggageSelectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "thereAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/adapter/tariffs/PassengersLuggageSelectionTariffAdapter;", "backAdapter", "dsDimensProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp4", "", "dp10", "dp12", "dp16", "dpf16", "", "tariffDecorator", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/adapter/tariffs/PassengersLuggageSelectionTariffDecoration;", "passengerBackground", "Landroid/graphics/drawable/GradientDrawable;", "cellCV", "Lru/ozon/uni/android/cell/CellView;", "getCellCV", "()Lru/ozon/uni/android/cell/CellView;", "cellCV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "titleTV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTV$delegate", "subtitleTV", "getSubtitleTV", "subtitleTV$delegate", "barrierBV", "Landroidx/constraintlayout/widget/Barrier;", "tariffsThereRV", "Landroidx/recyclerview/widget/RecyclerView;", "tariffsBackRV", "bonusCardBadgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBonusCardBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "bonusCardBadgeBV$delegate", "guidelineG", "Landroidx/constraintlayout/widget/Guideline;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setConstraints", "setupRoot", "setupViews", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassengersLuggageSelectionView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PassengersLuggageSelectionView.class, "cellCV", "getCellCV()Lru/ozon/uni/android/cell/CellView;", 0), C2438a.c(PassengersLuggageSelectionView.class, "titleTV", "getTitleTV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(PassengersLuggageSelectionView.class, "subtitleTV", "getSubtitleTV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(PassengersLuggageSelectionView.class, "bonusCardBadgeBV", "getBonusCardBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final PassengersLuggageSelectionTariffAdapter backAdapter;

    @NotNull
    private final Barrier barrierBV;

    /* renamed from: bonusCardBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate bonusCardBadgeBV;

    /* renamed from: cellCV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate cellCV;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp4;
    private final float dpf16;

    @NotNull
    private final DesignSystemDimensProvider dsDimensProvider;

    @NotNull
    private final Guideline guidelineG;

    @NotNull
    private final GradientDrawable passengerBackground;

    /* renamed from: subtitleTV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitleTV;

    @NotNull
    private final PassengersLuggageSelectionTariffDecoration tariffDecorator;

    @NotNull
    private final RecyclerView tariffsBackRV;

    @NotNull
    private final RecyclerView tariffsThereRV;

    @NotNull
    private final PassengersLuggageSelectionTariffAdapter thereAdapter;

    /* renamed from: titleTV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersLuggageSelectionView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.thereAdapter = new PassengersLuggageSelectionTariffAdapter();
        this.backAdapter = new PassengersLuggageSelectionTariffAdapter();
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsDimensProvider = dimens$default;
        int margin4 = dimens$default.getMargin4();
        this.dp4 = margin4;
        this.dp10 = dimens$default.getMargin10();
        this.dp12 = dimens$default.getMargin12();
        this.dp16 = dimens$default.getMargin16();
        float radius16 = dimens$default.getRadius16();
        this.dpf16 = radius16;
        this.tariffDecorator = new PassengersLuggageSelectionTariffDecoration(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.bgPrimary));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(radius16);
        this.passengerBackground = gradientDrawable;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.cellCV = new PreCreationViewPoolDelegate(context2, N.b(CellView.class), new PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$1(this), new PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titleTV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$3(this), new PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.subtitleTV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$5(this), new PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$6());
        Barrier barrier = new Barrier(context);
        barrier.f(1);
        barrier.setReferencedIds(new int[]{getTitleTV().getId(), getSubtitleTV().getId()});
        barrier.setId(R$id.passengersLuggageSelectionBarrier);
        this.barrierBV = barrier;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.passengersLuggageSelectionTariffsThere);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41659w = 0;
        recyclerView.setLayoutParams(bVar);
        this.tariffsThereRV = recyclerView;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(R$id.passengersLuggageSelectionTariffsBack);
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setItemAnimator(null);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41659w = 0;
        recyclerView2.setLayoutParams(bVar2);
        this.tariffsBackRV = recyclerView2;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.bonusCardBadgeBV = new PreCreationViewPoolDelegate(context5, N.b(BadgeView.class), new PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$7(this), new PassengersLuggageSelectionView$special$$inlined$preCreationViewPool$default$8());
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.passengersLuggageSelectionGuideline, -2, -2);
        a11.f41615V = 0;
        a11.f41622b = margin4;
        guideline.setLayoutParams(a11);
        this.guidelineG = guideline;
        addViews();
        setConstraints();
        setupRoot();
        setupViews();
    }

    private final void addViews() {
        addView(getCellCV());
        addView(getTitleTV());
        addView(getSubtitleTV());
        addView(this.barrierBV);
        addView(this.tariffsThereRV);
        addView(this.tariffsBackRV);
        addView(getBonusCardBadgeBV());
        addView(this.guidelineG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getBonusCardBadgeBV() {
        return (BadgeView) this.bonusCardBadgeBV.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CellView getCellCV() {
        return (CellView) this.cellCV.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getSubtitleTV() {
        return (TextAtomV2View) this.subtitleTV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitleTV() {
        return (TextAtomV2View) this.titleTV.getValue(this, $$delegatedProperties[1]);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new PassengersLuggageSelectionView$setConstraints$1(this));
    }

    private final void setupRoot() {
        setBackground(this.passengerBackground);
    }

    private final void setupViews() {
        RecyclerView recyclerView = this.tariffsThereRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.thereAdapter);
        recyclerView.addItemDecoration(this.tariffDecorator);
        RecyclerView recyclerView2 = this.tariffsBackRV;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
        recyclerView2.setAdapter(this.backAdapter);
        recyclerView2.addItemDecoration(this.tariffDecorator);
    }

    public final void bind(@NotNull PassengersLuggageSelectionVO.PassengerVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        CellHolderKt.bind(getCellCV(), item.getCell(), actionHandler);
        if (item.getIsTextShow()) {
            TextAtomV2View titleTV = getTitleTV();
            PassengersLuggageSelectionVO.PassengerVO.LuggageVO luggageThere = item.getLuggageThere();
            TextHolderKt.bindOrGone$default(titleTV, luggageThere != null ? luggageThere.getTitle() : null, null, 2, null);
            TextAtomV2View subtitleTV = getSubtitleTV();
            PassengersLuggageSelectionVO.PassengerVO.LuggageVO luggageBack = item.getLuggageBack();
            TextHolderKt.bindOrGone$default(subtitleTV, luggageBack != null ? luggageBack.getTitle() : null, null, 2, null);
        } else {
            ViewExtKt.gone(getTitleTV());
            ViewExtKt.gone(getSubtitleTV());
        }
        PassengersLuggageSelectionTariffDecoration passengersLuggageSelectionTariffDecoration = this.tariffDecorator;
        PassengersLuggageSelectionVO.PassengerVO.LuggageVO luggageBack2 = item.getLuggageBack();
        passengersLuggageSelectionTariffDecoration.setStartOffset((luggageBack2 != null ? luggageBack2.getTitle() : null) == null ? this.dp16 : 0);
        this.thereAdapter.setOnAction(actionHandler);
        this.backAdapter.setOnAction(actionHandler);
        this.barrierBV.e(item.getIsTextShow() ? this.dp4 : 0);
        this.tariffsThereRV.setVisibility(item.getIsThereShow() ? 0 : 8);
        this.tariffsBackRV.setVisibility(item.getIsBackShow() ? 0 : 8);
        PassengersLuggageSelectionTariffAdapter passengersLuggageSelectionTariffAdapter = this.thereAdapter;
        PassengersLuggageSelectionVO.PassengerVO.LuggageVO luggageThere2 = item.getLuggageThere();
        passengersLuggageSelectionTariffAdapter.setItems(luggageThere2 != null ? luggageThere2.getTariffs() : null);
        PassengersLuggageSelectionTariffAdapter passengersLuggageSelectionTariffAdapter2 = this.backAdapter;
        PassengersLuggageSelectionVO.PassengerVO.LuggageVO luggageBack3 = item.getLuggageBack();
        passengersLuggageSelectionTariffAdapter2.setItems(luggageBack3 != null ? luggageBack3.getTariffs() : null);
        BadgeHolderKt.bindOrGone(getBonusCardBadgeBV(), item.getBonusCardBadge(), actionHandler);
    }
}
