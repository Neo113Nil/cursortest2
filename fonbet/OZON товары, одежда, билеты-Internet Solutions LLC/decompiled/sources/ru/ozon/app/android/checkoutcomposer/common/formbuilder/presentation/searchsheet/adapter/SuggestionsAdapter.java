package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.adapter;

import CG.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SuggestVO;
import ru.ozon.app.android.map.databinding.ItemAddressSuggestBinding;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter$SuggestionViewHolder;", "<init>", "()V", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter$SuggestionViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter$SuggestionViewHolder;I)V", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "items", "submitList", "(Ljava/util/List;)V", "getItem", "(I)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "Lkotlin/Function1;", "onAddressClick", "Lkotlin/jvm/functions/Function1;", "getOnAddressClick$suggestions_search_prodGoogleAllVendorsRelease", "()Lkotlin/jvm/functions/Function1;", "setOnAddressClick$suggestions_search_prodGoogleAllVendorsRelease", "(Lkotlin/jvm/functions/Function1;)V", "", "Ljava/util/List;", "SuggestionViewHolder", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SuggestionsAdapter extends RecyclerView.g<SuggestionViewHolder> {

    @NotNull
    private Function1<? super SuggestVO, Unit> onAddressClick = SuggestionsAdapter$onAddressClick$1.INSTANCE;

    @NotNull
    private final List<SuggestVO> items = new ArrayList();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter$SuggestionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/map/databinding/ItemAddressSuggestBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "", "onAddressClick", "<init>", "(Lru/ozon/app/android/map/databinding/ItemAddressSuggestBinding;Lkotlin/jvm/functions/Function1;)V", "item", "bindItem", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;)V", "Lru/ozon/app/android/map/databinding/ItemAddressSuggestBinding;", "Lkotlin/jvm/functions/Function1;", "currentItem", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuggestionViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemAddressSuggestBinding binding;
        private SuggestVO currentItem;

        @NotNull
        private final Function1<SuggestVO, Unit> onAddressClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SuggestionViewHolder(@NotNull ItemAddressSuggestBinding binding, @NotNull Function1<? super SuggestVO, Unit> onAddressClick) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(onAddressClick, "onAddressClick");
            this.binding = binding;
            this.onAddressClick = onAddressClick;
            binding.layoutSuggestionAddress.setOnClickListener(new b(this, 16));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(SuggestionViewHolder suggestionViewHolder, View view) {
            SuggestVO suggestVO = suggestionViewHolder.currentItem;
            if (suggestVO != null) {
                suggestionViewHolder.onAddressClick.invoke(suggestVO);
            }
        }

        public final void bindItem(@NotNull SuggestVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemAddressSuggestBinding itemAddressSuggestBinding = this.binding;
            this.currentItem = item;
            itemAddressSuggestBinding.titleTv.setText(item.getTitle());
            this.itemView.setContentDescription("Выбрать: " + item.getTitle());
            itemAddressSuggestBinding.titleTv.setContentDescription(item.getTitle());
        }
    }

    @NotNull
    public final SuggestVO getItem(int position) {
        return this.items.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    public final void setOnAddressClick$suggestions_search_prodGoogleAllVendorsRelease(@NotNull Function1<? super SuggestVO, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onAddressClick = function1;
    }

    public final void submitList(@NotNull List<SuggestVO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SuggestionViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindItem(getItem(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SuggestionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemAddressSuggestBinding inflate = ItemAddressSuggestBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new SuggestionViewHolder(inflate, this.onAddressClick);
    }
}
