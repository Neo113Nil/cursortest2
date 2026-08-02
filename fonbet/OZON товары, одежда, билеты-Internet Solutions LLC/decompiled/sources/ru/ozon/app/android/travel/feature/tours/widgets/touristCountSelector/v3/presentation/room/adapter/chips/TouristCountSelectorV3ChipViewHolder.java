package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.chips;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.v3.holders.controls.chip.ChipHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/chips/TouristCountSelectorV3ChipViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "item", "", "bind", "(Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;)V", "Lkotlin/Function1;", "onChipSelected", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;)V", "removeCallbacks", "()V", "Lru/ozon/uni/android/controls/chip/ChipView;", "chipView", "Lru/ozon/uni/android/controls/chip/ChipView;", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3ChipViewHolder extends RecyclerView.C {
    private final ChipView chipView;
    private Function1<? super ChipDTO, Unit> onChipSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountSelectorV3ChipViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View view2 = this.itemView;
        this.chipView = view2 instanceof ChipView ? (ChipView) view2 : null;
    }

    public final void bind(@NotNull ChipDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ChipView chipView = this.chipView;
        if (chipView != null) {
            ChipHolderKt.bind$default(chipView, item, null, 2, null);
            chipView.setUnselectByClick(false);
            chipView.setOnSelect(new TouristCountSelectorV3ChipViewHolder$bind$1$1(this, item));
        }
    }

    public final void removeCallbacks() {
        this.onChipSelected = null;
    }

    public final void setupCallbacks(@NotNull Function1<? super ChipDTO, Unit> onChipSelected) {
        Intrinsics.checkNotNullParameter(onChipSelected, "onChipSelected");
        this.onChipSelected = onChipSelected;
    }
}
