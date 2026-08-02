package ru.ozon.app.android.pdp.widgets.markdown.presentation.characteristics;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.markdown.presentation.MarkdownVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO$Characteristic;", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsViewHolder;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsAdapter extends t<MarkdownVO.Characteristic, CharacteristicsViewHolder> {
    public CharacteristicsAdapter() {
        super(new i.d<MarkdownVO.Characteristic>() { // from class: ru.ozon.app.android.pdp.widgets.markdown.presentation.characteristics.CharacteristicsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(MarkdownVO.Characteristic oldItem, MarkdownVO.Characteristic newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(MarkdownVO.Characteristic oldItem, MarkdownVO.Characteristic newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getClass() == newItem.getClass() && Intrinsics.d(oldItem.getName(), newItem.getName());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CharacteristicsViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MarkdownVO.Characteristic item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CharacteristicsViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_description_widget_characteristic, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new CharacteristicsViewHolder(inflate);
    }
}
