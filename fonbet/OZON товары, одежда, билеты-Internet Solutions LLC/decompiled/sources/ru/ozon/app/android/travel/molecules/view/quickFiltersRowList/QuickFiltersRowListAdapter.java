package ru.ozon.app.android.travel.molecules.view.quickFiltersRowList;

import Bl.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import com.google.android.flexbox.FlexboxLayoutManager;
import gk0.q;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListAdapter;", "Ljk0/i;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "", "horizontalMargin", "verticalMargin", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;II)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "I", "ItemsDiffUtilItemCallback", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuickFiltersRowListAdapter extends i<TagButtonDTO, QuickFiltersRowListViewHolder> {
    private final int horizontalMargin;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;
    private final int verticalMargin;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListAdapter$ItemsDiffUtilItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Z", "areContentsTheSame", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ItemsDiffUtilItemCallback extends i.d<TagButtonDTO> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull TagButtonDTO oldItem, @NotNull TagButtonDTO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull TagButtonDTO oldItem, @NotNull TagButtonDTO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            String text = oldItem.getText();
            int hashCode = text != null ? text.hashCode() : 0;
            String text2 = newItem.getText();
            return hashCode == (text2 != null ? text2.hashCode() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuickFiltersRowListAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> onAction, int i11, int i12) {
        super(new ItemsDiffUtilItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
        this.horizontalMargin = i11;
        this.verticalMargin = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull QuickFiltersRowListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TagButtonDTO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.onAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public QuickFiltersRowListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TagButtonView tagButtonView = (TagButtonView) b.a(TagButtonView.class, "type", q.f64554a, null);
        if (tagButtonView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        }
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        int i11 = this.horizontalMargin;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = this.verticalMargin;
        tagButtonView.setLayoutParams(bVar);
        return new QuickFiltersRowListViewHolder(tagButtonView);
    }
}
