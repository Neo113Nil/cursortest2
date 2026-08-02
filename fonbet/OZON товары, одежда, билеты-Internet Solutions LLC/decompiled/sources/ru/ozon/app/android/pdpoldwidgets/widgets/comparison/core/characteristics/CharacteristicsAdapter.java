package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetComparisonCharacteristicGroupItemBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicsGroupVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO$Characteristic;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicViewHolder;I)V", "Lru/ozon/app/android/composer/ComposerReferences;", "DiffUtilCallback", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsAdapter extends t<CharacteristicsGroupVO.Characteristic, CharacteristicViewHolder> {

    @NotNull
    private final ComposerReferences composerReferences;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsAdapter$DiffUtilCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO$Characteristic;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO$Characteristic;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO$Characteristic;)Z", "areContentsTheSame", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DiffUtilCallback extends i.d<CharacteristicsGroupVO.Characteristic> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull CharacteristicsGroupVO.Characteristic oldItem, @NotNull CharacteristicsGroupVO.Characteristic newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull CharacteristicsGroupVO.Characteristic oldItem, @NotNull CharacteristicsGroupVO.Characteristic newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.hashCode() == newItem.hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacteristicsAdapter(@NotNull ComposerReferences composerReferences) {
        super(new DiffUtilCallback());
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerReferences = composerReferences;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CharacteristicViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CharacteristicsGroupVO.Characteristic characteristic = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(characteristic, "get(...)");
        holder.bind(characteristic);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CharacteristicViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PdpWidgetComparisonCharacteristicGroupItemBinding inflate = PdpWidgetComparisonCharacteristicGroupItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new CharacteristicViewHolder(inflate, this.composerReferences);
    }
}
