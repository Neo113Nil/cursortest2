package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetReconciliationActsDeclinerTextFieldItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerVO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/TextFieldsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/ReconciliationActsDeclinerVO$TextField;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/TextFieldViewHolder;", "Lkotlin/Function2;", "", "", "", "onTextChangedListener", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/TextFieldViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/TextFieldViewHolder;I)V", "Lkotlin/jvm/functions/Function2;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextFieldsAdapter extends t<ReconciliationActsDeclinerVO.TextField, TextFieldViewHolder> {

    @NotNull
    private final Function2<String, Integer, Unit> onTextChangedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldsAdapter(@NotNull Function2<? super String, ? super Integer, Unit> onTextChangedListener) {
        super(new i.d<ReconciliationActsDeclinerVO.TextField>() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.TextFieldsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ReconciliationActsDeclinerVO.TextField oldItem, ReconciliationActsDeclinerVO.TextField newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ReconciliationActsDeclinerVO.TextField oldItem, ReconciliationActsDeclinerVO.TextField newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getTitle(), newItem.getTitle());
            }
        });
        Intrinsics.checkNotNullParameter(onTextChangedListener, "onTextChangedListener");
        this.onTextChangedListener = onTextChangedListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TextFieldViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReconciliationActsDeclinerVO.TextField item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TextFieldViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetReconciliationActsDeclinerTextFieldItemBinding inflate = WidgetReconciliationActsDeclinerTextFieldItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new TextFieldViewHolder(inflate, this.onTextChangedListener);
    }
}
