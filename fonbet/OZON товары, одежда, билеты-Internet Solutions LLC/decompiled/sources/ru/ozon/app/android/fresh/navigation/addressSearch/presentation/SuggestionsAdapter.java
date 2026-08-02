package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import HY.d;
import Ve.C4636t5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.R$layout;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.MapSdkSuggestionVO;
import ru.ozon.app.android.fresh.navigation.databinding.ItemAddressSuggestBinding;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R:\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/SuggestionsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/SuggestionsAdapter$SuggestionViewHolder;", "Landroidx/recyclerview/widget/i$d;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/i$d;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/SuggestionsAdapter$SuggestionViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/SuggestionsAdapter$SuggestionViewHolder;I)V", "Lkotlin/Function3;", "Landroid/content/Context;", "onAddressClick", "Lfd/n;", "getOnAddressClick$navigation_prodGoogleAllVendorsRelease", "()Lfd/n;", "setOnAddressClick$navigation_prodGoogleAllVendorsRelease", "(Lfd/n;)V", "SuggestionViewHolder", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuggestionsAdapter extends t<MapSdkSuggestionVO, SuggestionViewHolder> {

    @NotNull
    private InterfaceC6511n<? super Context, ? super MapSdkSuggestionVO, ? super Integer, Unit> onAddressClick;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR,\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/SuggestionsAdapter$SuggestionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/navigation/databinding/ItemAddressSuggestBinding;", "binding", "Lkotlin/Function3;", "Landroid/content/Context;", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "", "", "onAddressClick", "<init>", "(Lru/ozon/app/android/fresh/navigation/databinding/ItemAddressSuggestBinding;Lfd/n;)V", "item", "bindItem", "(Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;)V", "Lru/ozon/app/android/fresh/navigation/databinding/ItemAddressSuggestBinding;", "Lfd/n;", "currentItem", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuggestionViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemAddressSuggestBinding binding;
        private MapSdkSuggestionVO currentItem;

        @NotNull
        private final InterfaceC6511n<Context, MapSdkSuggestionVO, Integer, Unit> onAddressClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SuggestionViewHolder(@NotNull ItemAddressSuggestBinding binding, @NotNull InterfaceC6511n<? super Context, ? super MapSdkSuggestionVO, ? super Integer, Unit> onAddressClick) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(onAddressClick, "onAddressClick");
            this.binding = binding;
            this.onAddressClick = onAddressClick;
            binding.layoutSuggestionAddress.setOnClickListener(new d(this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(SuggestionViewHolder suggestionViewHolder, View view) {
            MapSdkSuggestionVO mapSdkSuggestionVO = suggestionViewHolder.currentItem;
            if (mapSdkSuggestionVO != null) {
                InterfaceC6511n<Context, MapSdkSuggestionVO, Integer, Unit> interfaceC6511n = suggestionViewHolder.onAddressClick;
                Context context = suggestionViewHolder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                interfaceC6511n.invoke(context, mapSdkSuggestionVO, Integer.valueOf(suggestionViewHolder.getAdapterPosition()));
            }
        }

        public final void bindItem(@NotNull MapSdkSuggestionVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.currentItem = item;
            this.binding.titleTv.setText(item.getTitle());
            this.itemView.setContentDescription("Выбрать: " + item.getTitle());
            this.binding.titleTv.setContentDescription(item.getTitle());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionsAdapter(@NotNull i.d<MapSdkSuggestionVO> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.onAddressClick = SuggestionsAdapter$onAddressClick$1.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SuggestionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ItemAddressSuggestBinding bind = ItemAddressSuggestBinding.bind(C4636t5.a(parent, "parent").inflate(R$layout.item_address_suggest, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new SuggestionViewHolder(bind, this.onAddressClick);
    }

    public final void setOnAddressClick$navigation_prodGoogleAllVendorsRelease(@NotNull InterfaceC6511n<? super Context, ? super MapSdkSuggestionVO, ? super Integer, Unit> interfaceC6511n) {
        Intrinsics.checkNotNullParameter(interfaceC6511n, "<set-?>");
        this.onAddressClick = interfaceC6511n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SuggestionViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MapSdkSuggestionVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bindItem(item);
    }
}
