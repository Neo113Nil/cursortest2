package ru.ozon.app.android.fresh.feature.b2b.widgets.trustFactors.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetTrustFactorsGroupItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.trustFactors.data.TrustFactorsDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/presentation/TrustFactorsGroupsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetTrustFactorsGroupItemBinding;", "binding", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetTrustFactorsGroupItemBinding;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/data/TrustFactorsDTO$GroupDTO;", "item", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/data/TrustFactorsDTO$GroupDTO;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetTrustFactorsGroupItemBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/presentation/TrustFactorsIconTextItemAdapter;", "iconTextItemAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/presentation/TrustFactorsIconTextItemAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TrustFactorsGroupsViewHolder extends RecyclerView.C {

    @NotNull
    private final WidgetTrustFactorsGroupItemBinding binding;

    @NotNull
    private final TrustFactorsIconTextItemAdapter iconTextItemAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustFactorsGroupsViewHolder(@NotNull WidgetTrustFactorsGroupItemBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.iconTextItemAdapter = new TrustFactorsIconTextItemAdapter();
    }

    public final void bind(@NotNull TrustFactorsDTO.GroupDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetTrustFactorsGroupItemBinding widgetTrustFactorsGroupItemBinding = this.binding;
        TextAtomV2View title = widgetTrustFactorsGroupItemBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, item.getTitle(), null, 2, null);
        widgetTrustFactorsGroupItemBinding.atomLayout.setAdapter(this.iconTextItemAdapter);
        this.iconTextItemAdapter.submitList(item.getList());
    }
}
