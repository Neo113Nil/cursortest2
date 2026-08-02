package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ChildFormVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3QuantityCellVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.cells.TouristCountSelectorV3CellsAdapter;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.cells.TouristCountSelectorV3CellsDecoration;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.forms.TouristCountSelectorV3FormsAdapter;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.forms.TouristCountSelectorV3FormsDecoration;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e¢\u0006\u0004\b%\u0010\"Jg\u0010/\u001a\u00020\u000b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b0&2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b0&2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000b0)2\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b0&j\u0002`-¢\u0006\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00108R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00108R*\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000b\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00109R*\u0010.\u001a\u0016\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b\u0018\u00010&j\u0004\u0018\u0001`-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00108R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010H¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3RoomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "addViews", "()V", "placeViews", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isTitleVisible", "bindTitle", "(Ljava/lang/String;Z)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "isButtonVisible", "bindDeleteRoomButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "guests", "bindGuests", "(Ljava/util/List;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "forms", "bindChildForms", "Lkotlin/Function1;", "onPlusButtonClicked", "onMinusButtonClicked", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "onChildAgeSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "dp8", "I", "dp12", "dp16", "", "dpf16", "F", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/cells/TouristCountSelectorV3CellsAdapter;", "cellsAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/cells/TouristCountSelectorV3CellsAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/forms/TouristCountSelectorV3FormsAdapter;", "formsAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/forms/TouristCountSelectorV3FormsAdapter;", "Landroidx/appcompat/widget/AppCompatTextView;", "titleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "deleteRoomButtonBv", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Landroidx/recyclerview/widget/RecyclerView;", "guestsRv", "Landroidx/recyclerview/widget/RecyclerView;", "childFormsRv", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3RoomView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final TouristCountSelectorV3CellsAdapter cellsAdapter;

    @NotNull
    private final RecyclerView childFormsRv;

    @NotNull
    private final ButtonV3View deleteRoomButtonBv;
    private final int dp12;
    private final int dp16;
    private final int dp8;
    private final float dpf16;

    @NotNull
    private final TouristCountSelectorV3FormsAdapter formsAdapter;

    @NotNull
    private final RecyclerView guestsRv;
    private Function2<? super Integer, ? super ChipDTO, Unit> onChildAgeSelected;
    private Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onMinusButtonClicked;
    private Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onPlusButtonClicked;

    @NotNull
    private final AppCompatTextView titleTv;

    public /* synthetic */ TouristCountSelectorV3RoomView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.titleTv);
        addView(this.deleteRoomButtonBv);
        addView(this.guestsRv);
        addView(this.childFormsRv);
    }

    private final void placeViews() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart(dVar, this.titleTv.getId(), 0, this.dp16);
        ConstraintSetExtKt.topToTop$default(dVar, this.titleTv.getId(), this.deleteRoomButtonBv.getId(), 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, this.titleTv.getId(), this.deleteRoomButtonBv.getId(), this.dp8);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.titleTv.getId(), this.deleteRoomButtonBv.getId(), 0, 4, null);
        dVar.C(this.titleTv.getId(), true);
        dVar.c0(0.0f, this.titleTv.getId());
        ConstraintSetExtKt.topToTop(dVar, this.deleteRoomButtonBv.getId(), 0, this.dp16);
        ConstraintSetExtKt.endToEnd(dVar, this.deleteRoomButtonBv.getId(), 0, this.dp16);
        ConstraintSetExtKt.startToStart(dVar, this.guestsRv.getId(), 0, this.dp16);
        ConstraintSetExtKt.topToBottom(dVar, this.guestsRv.getId(), this.deleteRoomButtonBv.getId(), this.dp8);
        ConstraintSetExtKt.endToEnd(dVar, this.guestsRv.getId(), 0, this.dp16);
        dVar.Z(this.guestsRv.getId(), 3, this.dp12);
        ConstraintSetExtKt.startToStart$default(dVar, this.childFormsRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, this.childFormsRv.getId(), this.guestsRv.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.childFormsRv.getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    public final void bind(@NotNull TouristCountSelectorV3RoomVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindTitle(item.getRoomTitle(), item.getIsRoomTitleVisible());
        bindDeleteRoomButton(item.getDeleteRoomButton(), item.getIsDeleteRoomButtonVisible());
        bindGuests(item.getGuests());
        bindChildForms(item.getChildForms());
    }

    public final void bindChildForms(@NotNull List<TouristCountSelectorV3ChildFormVO> forms) {
        Intrinsics.checkNotNullParameter(forms, "forms");
        this.formsAdapter.submitList(forms);
    }

    public final void bindDeleteRoomButton(ButtonV3DTO button, boolean isButtonVisible) {
        ButtonV3View buttonV3View = this.deleteRoomButtonBv;
        ButtonV3HolderKt.bindOrGone(buttonV3View, button, new TouristCountSelectorV3RoomView$bindDeleteRoomButton$1$1(this));
        buttonV3View.setVisibility(isButtonVisible ? 0 : 8);
    }

    public final void bindGuests(@NotNull List<TouristCountSelectorV3QuantityCellVO> guests) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        this.cellsAdapter.submitList(guests);
    }

    public final void bindTitle(@NotNull String title, boolean isTitleVisible) {
        Intrinsics.checkNotNullParameter(title, "title");
        AppCompatTextView appCompatTextView = this.titleTv;
        appCompatTextView.setText(title);
        appCompatTextView.setVisibility(isTitleVisible ? 0 : 8);
    }

    public final void setupCallbacks(@NotNull Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onPlusButtonClicked, @NotNull Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onMinusButtonClicked, @NotNull Function2<? super Integer, ? super ChipDTO, Unit> onChildAgeSelected, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(onPlusButtonClicked, "onPlusButtonClicked");
        Intrinsics.checkNotNullParameter(onMinusButtonClicked, "onMinusButtonClicked");
        Intrinsics.checkNotNullParameter(onChildAgeSelected, "onChildAgeSelected");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onPlusButtonClicked = onPlusButtonClicked;
        this.onMinusButtonClicked = onMinusButtonClicked;
        this.onChildAgeSelected = onChildAgeSelected;
        this.actionHandler = actionHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountSelectorV3RoomView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px = ResourceExtKt.toPx(12, context);
        this.dp12 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        TouristCountSelectorV3CellsAdapter touristCountSelectorV3CellsAdapter = new TouristCountSelectorV3CellsAdapter(new TouristCountSelectorV3RoomView$cellsAdapter$1(this), new TouristCountSelectorV3RoomView$cellsAdapter$2(this));
        this.cellsAdapter = touristCountSelectorV3CellsAdapter;
        TouristCountSelectorV3FormsAdapter touristCountSelectorV3FormsAdapter = new TouristCountSelectorV3FormsAdapter(new TouristCountSelectorV3RoomView$formsAdapter$1(this));
        this.formsAdapter = touristCountSelectorV3FormsAdapter;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.touristCountSelectorV3RoomTitleTv);
        appCompatTextView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        appCompatTextView.setTextAppearance(R$style.OzonTextAppearance_BodyControl_600large);
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        appCompatTextView.setMaxLines(1);
        this.titleTv = appCompatTextView;
        ButtonV3View buttonV3View = (ButtonV3View) q.f64554a.i(N.b(ButtonV3View.class), context);
        buttonV3View = buttonV3View == null ? new ButtonV3View(context, null, 0, 0, 14, null) : buttonV3View;
        buttonV3View.setId(R$id.touristCountSelectorV3RoomDeleteButtonBv);
        buttonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.deleteRoomButtonBv = buttonV3View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.touristCountSelectorV3RoomGuestsRv);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setPadding(px2, px2, px2, px2);
        recyclerView.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgSecondary), pxF));
        recyclerView.setAdapter(touristCountSelectorV3CellsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new TouristCountSelectorV3CellsDecoration(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        this.guestsRv = recyclerView;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(R$id.touristCountSelectorV3RoomChildFormsRv);
        recyclerView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView2.setAdapter(touristCountSelectorV3FormsAdapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(context));
        recyclerView2.addItemDecoration(new TouristCountSelectorV3FormsDecoration(context));
        recyclerView2.setItemAnimator(null);
        recyclerView2.setNestedScrollingEnabled(false);
        this.childFormsRv = recyclerView2;
        addViews();
        placeViews();
        setPadding(0, 0, 0, px);
    }
}
