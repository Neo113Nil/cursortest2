package ru.ozon.app.android.abtool.presentation.experiments.recycler;

import Ve.C4636t5;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.R$layout;
import ru.ozon.app.android.abtool.databinding.ItemExperimentBinding;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentItem;", "Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentsAdapter$ViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentsAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentsAdapter$ViewHolder;I)V", "ViewHolder", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExperimentsAdapter extends t<ExperimentItem, ViewHolder> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/abtool/databinding/ItemExperimentBinding;", "binding", "<init>", "(Lru/ozon/app/android/abtool/databinding/ItemExperimentBinding;)V", "Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentItem;", "item", "", "bind", "(Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentItem;)V", "Lru/ozon/app/android/abtool/databinding/ItemExperimentBinding;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemExperimentBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull ItemExperimentBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public final void bind(@NotNull ExperimentItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.experimentTv.setText(item.getText());
        }
    }

    public ExperimentsAdapter() {
        super(new ExperimentsDiffCallback());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ItemExperimentBinding bind = ItemExperimentBinding.bind(C4636t5.a(parent, "parent").inflate(R$layout.item_experiment, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new ViewHolder(bind);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ExperimentItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }
}
