package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.forms;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ChildFormVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view.TouristCountSelectorV3ChildFormView;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\b2\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R*\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/forms/TouristCountSelectorV3FormViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3ChildFormView;", "formView", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3ChildFormView;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;)V", "Lkotlin/Function2;", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "onChildAgeSelected", "setupCallbacks", "(Lkotlin/jvm/functions/Function2;)V", "removeCallbacks", "()V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3ChildFormView;", "Lkotlin/jvm/functions/Function2;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3FormViewHolder extends RecyclerView.C {

    @NotNull
    private final TouristCountSelectorV3ChildFormView formView;
    private Function2<? super Integer, ? super ChipDTO, Unit> onChildAgeSelected;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "chip", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.forms.TouristCountSelectorV3FormViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ChipDTO, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChipDTO chipDTO) {
            invoke2(chipDTO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ChipDTO chip) {
            Intrinsics.checkNotNullParameter(chip, "chip");
            Function2 function2 = TouristCountSelectorV3FormViewHolder.this.onChildAgeSelected;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(TouristCountSelectorV3FormViewHolder.this.getAdapterPosition()), chip);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountSelectorV3FormViewHolder(@NotNull TouristCountSelectorV3ChildFormView formView) {
        super(formView);
        Intrinsics.checkNotNullParameter(formView, "formView");
        this.formView = formView;
        formView.setupCallbacks(new AnonymousClass1());
    }

    public final void bind(@NotNull TouristCountSelectorV3ChildFormVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.formView.bind(item);
    }

    public final void removeCallbacks() {
        this.onChildAgeSelected = null;
    }

    public final void setupCallbacks(Function2<? super Integer, ? super ChipDTO, Unit> onChildAgeSelected) {
        this.onChildAgeSelected = onChildAgeSelected;
    }
}
