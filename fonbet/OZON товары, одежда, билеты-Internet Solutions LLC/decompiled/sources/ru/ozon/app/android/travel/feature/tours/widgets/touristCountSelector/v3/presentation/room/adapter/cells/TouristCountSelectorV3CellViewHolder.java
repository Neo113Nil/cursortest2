package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.cells;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3QuantityCellVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view.TouristCountSelectorV3QuantityCellView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000e\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/cells/TouristCountSelectorV3CellViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3QuantityCellView;", "cellView", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3QuantityCellView;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;)V", "Lkotlin/Function1;", "onPlusButtonClicked", "onMinusButtonClicked", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "removeCallbacks", "()V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3QuantityCellView;", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3CellViewHolder extends RecyclerView.C {

    @NotNull
    private final TouristCountSelectorV3QuantityCellView cellView;
    private Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onMinusButtonClicked;
    private Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onPlusButtonClicked;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cell", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.cells.TouristCountSelectorV3CellViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<TouristCountSelectorV3QuantityCellVO, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO) {
            invoke2(touristCountSelectorV3QuantityCellVO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TouristCountSelectorV3QuantityCellVO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Function1 function1 = TouristCountSelectorV3CellViewHolder.this.onPlusButtonClicked;
            if (function1 != null) {
                function1.invoke(cell);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cell", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.cells.TouristCountSelectorV3CellViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<TouristCountSelectorV3QuantityCellVO, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO) {
            invoke2(touristCountSelectorV3QuantityCellVO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TouristCountSelectorV3QuantityCellVO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Function1 function1 = TouristCountSelectorV3CellViewHolder.this.onMinusButtonClicked;
            if (function1 != null) {
                function1.invoke(cell);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountSelectorV3CellViewHolder(@NotNull TouristCountSelectorV3QuantityCellView cellView) {
        super(cellView);
        Intrinsics.checkNotNullParameter(cellView, "cellView");
        this.cellView = cellView;
        cellView.setupCallbacks(new AnonymousClass1(), new AnonymousClass2());
    }

    public final void bind(@NotNull TouristCountSelectorV3QuantityCellVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.cellView.bind(item);
    }

    public final void removeCallbacks() {
        this.onPlusButtonClicked = null;
        this.onMinusButtonClicked = null;
    }

    public final void setupCallbacks(@NotNull Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onPlusButtonClicked, @NotNull Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onMinusButtonClicked) {
        Intrinsics.checkNotNullParameter(onPlusButtonClicked, "onPlusButtonClicked");
        Intrinsics.checkNotNullParameter(onMinusButtonClicked, "onMinusButtonClicked");
        this.onPlusButtonClicked = onPlusButtonClicked;
        this.onMinusButtonClicked = onMinusButtonClicked;
    }
}
