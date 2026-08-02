package ru.ozon.app.android.yandexsearchsheet.adapter;

import Ar.b;
import Ve.C4636t5;
import Xc.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.map.databinding.ItemAddressSuggestBinding;
import ru.ozon.app.android.map.databinding.ItemAddressSuggestWarningBinding;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004#$%&B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R4\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", "Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$SuggestionViewHolder;", "<init>", "()V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$SuggestionViewHolder;", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$SuggestionViewHolder;I)V", "Lkotlin/Function2;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "onAddressClick", "Lkotlin/jvm/functions/Function2;", "getOnAddressClick$suggestions_search_prodGoogleAllVendorsRelease", "()Lkotlin/jvm/functions/Function2;", "setOnAddressClick$suggestions_search_prodGoogleAllVendorsRelease", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onWarningClick", "Lkotlin/jvm/functions/Function1;", "getOnWarningClick$suggestions_search_prodGoogleAllVendorsRelease", "()Lkotlin/jvm/functions/Function1;", "setOnWarningClick$suggestions_search_prodGoogleAllVendorsRelease", "(Lkotlin/jvm/functions/Function1;)V", "SuggestionViewHolder", "ViewType", "SuggestionInfoViewHolder", "SuggestionWarningViewHolder", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YandexSuggestionsAdapter extends t<SuggestVO.Suggest, SuggestionViewHolder> {

    @NotNull
    private Function2<? super SuggestVO.Suggest.SuggestInfo, ? super Integer, Unit> onAddressClick;

    @NotNull
    private Function1<? super AtomAction, Unit> onWarningClick;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$SuggestionInfoViewHolder;", "Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$SuggestionViewHolder;", "Lru/ozon/app/android/map/databinding/ItemAddressSuggestBinding;", "binding", "Lkotlin/Function2;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "", "", "onAddressClick", "<init>", "(Lru/ozon/app/android/map/databinding/ItemAddressSuggestBinding;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", "item", "bindItem", "(Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;)V", "Lru/ozon/app/android/map/databinding/ItemAddressSuggestBinding;", "Lkotlin/jvm/functions/Function2;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuggestionInfoViewHolder extends SuggestionViewHolder {

        @NotNull
        private final ItemAddressSuggestBinding binding;

        @NotNull
        private final Function2<SuggestVO.Suggest.SuggestInfo, Integer, Unit> onAddressClick;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SuggestionInfoViewHolder(@NotNull ItemAddressSuggestBinding binding, @NotNull Function2<? super SuggestVO.Suggest.SuggestInfo, ? super Integer, Unit> onAddressClick) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(onAddressClick, "onAddressClick");
            ConstraintLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
            this.onAddressClick = onAddressClick;
            binding.layoutSuggestionAddress.setOnClickListener(new b(this, 4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(SuggestionInfoViewHolder suggestionInfoViewHolder, View view) {
            SuggestVO.Suggest currentItem = suggestionInfoViewHolder.getCurrentItem();
            SuggestVO.Suggest.SuggestInfo suggestInfo = currentItem instanceof SuggestVO.Suggest.SuggestInfo ? (SuggestVO.Suggest.SuggestInfo) currentItem : null;
            if (suggestInfo != null) {
                suggestionInfoViewHolder.onAddressClick.invoke(suggestInfo, Integer.valueOf(suggestionInfoViewHolder.getAdapterPosition()));
            }
        }

        @Override // ru.ozon.app.android.yandexsearchsheet.adapter.YandexSuggestionsAdapter.SuggestionViewHolder
        public void bindItem(@NotNull SuggestVO.Suggest item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemAddressSuggestBinding itemAddressSuggestBinding = this.binding;
            super.bindItem(item);
            SuggestVO.Suggest.SuggestInfo suggestInfo = (SuggestVO.Suggest.SuggestInfo) item;
            itemAddressSuggestBinding.titleTv.setText(suggestInfo.getTitle());
            this.itemView.setContentDescription("Выбрать: " + suggestInfo.getTitle());
            itemAddressSuggestBinding.titleTv.setContentDescription(suggestInfo.getTitle());
            TextView numberPVZ = itemAddressSuggestBinding.numberPVZ;
            Intrinsics.checkNotNullExpressionValue(numberPVZ, "numberPVZ");
            TextViewExtKt.setTextOrGone(numberPVZ, suggestInfo.getNumberPVZ());
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$SuggestionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", "item", "", "bindItem", "(Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;)V", "Landroid/view/View;", "currentItem", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", "getCurrentItem", "()Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", "setCurrentItem", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SuggestionViewHolder extends RecyclerView.C {

        @NotNull
        private final View containerView;
        private SuggestVO.Suggest currentItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestionViewHolder(@NotNull View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.containerView = containerView;
        }

        public void bindItem(@NotNull SuggestVO.Suggest item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.currentItem = item;
        }

        public final SuggestVO.Suggest getCurrentItem() {
            return this.currentItem;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$SuggestionWarningViewHolder;", "Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$SuggestionViewHolder;", "binding", "Lru/ozon/app/android/map/databinding/ItemAddressSuggestWarningBinding;", "onWarningClick", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/map/databinding/ItemAddressSuggestWarningBinding;Lkotlin/jvm/functions/Function1;)V", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "bindItem", "item", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuggestionWarningViewHolder extends SuggestionViewHolder {

        @NotNull
        private final AtomsAdapter atomsAdapter;

        @NotNull
        private final ItemAddressSuggestWarningBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SuggestionWarningViewHolder(@NotNull ItemAddressSuggestWarningBinding binding, @NotNull Function1<? super AtomAction, Unit> onWarningClick) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(onWarningClick, "onWarningClick");
            VerticalAtomsLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
            AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
            this.atomsAdapter = atomsAdapter;
            binding.titleVAL.setAdapter(atomsAdapter);
            atomsAdapter.setOnAction(onWarningClick);
        }

        @Override // ru.ozon.app.android.yandexsearchsheet.adapter.YandexSuggestionsAdapter.SuggestionViewHolder
        public void bindItem(@NotNull SuggestVO.Suggest item) {
            Intrinsics.checkNotNullParameter(item, "item");
            super.bindItem(item);
            AtomsAdapter atomsAdapter = this.atomsAdapter;
            Context context = this.binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, ((SuggestVO.Suggest.Warning) item).getInfo());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter$ViewType;", "", "viewType", "", "<init>", "(Ljava/lang/String;II)V", "getViewType", "()I", "SUGGEST", "WARNING", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType SUGGEST = new ViewType("SUGGEST", 0, 1);
        public static final ViewType WARNING = new ViewType("WARNING", 1, 2);
        private final int viewType;

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{SUGGEST, WARNING};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ViewType(String str, int i11, int i12) {
            this.viewType = i12;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }

        public final int getViewType() {
            return this.viewType;
        }
    }

    public YandexSuggestionsAdapter() {
        super(new i.d<SuggestVO.Suggest>() { // from class: ru.ozon.app.android.yandexsearchsheet.adapter.YandexSuggestionsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(SuggestVO.Suggest oldItem, SuggestVO.Suggest newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(SuggestVO.Suggest oldItem, SuggestVO.Suggest newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getType() == newItem.getType();
            }
        });
        this.onAddressClick = YandexSuggestionsAdapter$onAddressClick$1.INSTANCE;
        this.onWarningClick = YandexSuggestionsAdapter$onWarningClick$1.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getType().getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SuggestionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == ViewType.SUGGEST.getViewType()) {
            ItemAddressSuggestBinding inflate = ItemAddressSuggestBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new SuggestionInfoViewHolder(inflate, this.onAddressClick);
        }
        ItemAddressSuggestWarningBinding inflate2 = ItemAddressSuggestWarningBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new SuggestionWarningViewHolder(inflate2, this.onWarningClick);
    }

    public final void setOnAddressClick$suggestions_search_prodGoogleAllVendorsRelease(@NotNull Function2<? super SuggestVO.Suggest.SuggestInfo, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onAddressClick = function2;
    }

    public final void setOnWarningClick$suggestions_search_prodGoogleAllVendorsRelease(@NotNull Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onWarningClick = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SuggestionViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SuggestVO.Suggest item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bindItem(item);
    }
}
