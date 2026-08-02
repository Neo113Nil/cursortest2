package ru.ozon.app.android.fresh.feature.b2b.widgets.trustFactors.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetTrustFactorsGroupIconTextItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.trustFactors.data.TrustFactorsDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/presentation/TrustFactorsIconTextItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetTrustFactorsGroupIconTextItemBinding;", "binding", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetTrustFactorsGroupIconTextItemBinding;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/data/TrustFactorsDTO$GroupDTO$IconTextItemDTO;", "item", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/data/TrustFactorsDTO$GroupDTO$IconTextItemDTO;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetTrustFactorsGroupIconTextItemBinding;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TrustFactorsIconTextItemViewHolder extends RecyclerView.C {

    @NotNull
    private final WidgetTrustFactorsGroupIconTextItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustFactorsIconTextItemViewHolder(@NotNull WidgetTrustFactorsGroupIconTextItemBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull TrustFactorsDTO.GroupDTO.IconTextItemDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetTrustFactorsGroupIconTextItemBinding widgetTrustFactorsGroupIconTextItemBinding = this.binding;
        IconView icon = widgetTrustFactorsGroupIconTextItemBinding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        IconHolderKt.bind$default(icon, item.getLeftIcon(), null, 2, null);
        TextAtomV2View title = widgetTrustFactorsGroupIconTextItemBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, TextDTO.copy$default(item.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null), null, 2, null);
    }
}
