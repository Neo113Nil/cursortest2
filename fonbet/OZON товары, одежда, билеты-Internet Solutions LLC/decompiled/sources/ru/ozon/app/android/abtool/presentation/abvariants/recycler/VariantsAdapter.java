package ru.ozon.app.android.abtool.presentation.abvariants.recycler;

import Ez.ViewOnClickListenerC2979c;
import Sc.o;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.R$layout;
import ru.ozon.app.android.abtool.databinding.ItemAbVariantBinding;
import ru.ozon.app.android.abtool.databinding.ItemAddVariantBinding;
import ru.ozon.app.android.abtool.databinding.ItemClearVariantsBinding;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantsAdapter;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001d\u001e\u001f BM\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\"\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006!"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/ListItem;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;", "", "onDeleteVariant", "", "onVariantsInputChanged", "Lkotlin/Function0;", "onAddVariants", "onClearVariants", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "AddVariantViewHolder", "ClearVariantsViewHolder", "VariantViewHolder", "VariantsDiffCallback", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VariantsAdapter extends t<ListItem, RecyclerView.C> {

    @NotNull
    private final Function0<Unit> onAddVariants;

    @NotNull
    private final Function0<Unit> onClearVariants;

    @NotNull
    private final Function1<VariantItem, Unit> onDeleteVariant;

    @NotNull
    private final Function1<String, Unit> onVariantsInputChanged;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantsAdapter$AddVariantViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/abtool/databinding/ItemAddVariantBinding;", "binding", "Lkotlin/Function1;", "", "", "onVariantsInputChanged", "Lkotlin/Function0;", "onAddVariants", "<init>", "(Lru/ozon/app/android/abtool/databinding/ItemAddVariantBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/AddVariantItem;", "item", "bind", "(Lru/ozon/app/android/abtool/presentation/abvariants/recycler/AddVariantItem;)V", "Lru/ozon/app/android/abtool/databinding/ItemAddVariantBinding;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AddVariantViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemAddVariantBinding binding;

        @NotNull
        private final Function0<Unit> onAddVariants;

        @NotNull
        private final Function1<String, Unit> onVariantsInputChanged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AddVariantViewHolder(@NotNull final ItemAddVariantBinding binding, @NotNull Function1<? super String, Unit> onVariantsInputChanged, @NotNull Function0<Unit> onAddVariants) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(onVariantsInputChanged, "onVariantsInputChanged");
            Intrinsics.checkNotNullParameter(onAddVariants, "onAddVariants");
            this.binding = binding;
            this.onVariantsInputChanged = onVariantsInputChanged;
            this.onAddVariants = onAddVariants;
            binding.addVariantsButton.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.abtool.presentation.abvariants.recycler.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VariantsAdapter.AddVariantViewHolder.lambda$3$lambda$0(VariantsAdapter.AddVariantViewHolder.this, view);
                }
            });
            binding.clearInputImageButton.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.abtool.presentation.abvariants.recycler.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VariantsAdapter.AddVariantViewHolder.lambda$3$lambda$1(ItemAddVariantBinding.this, view);
                }
            });
            AppCompatEditText variantsEditText = binding.variantsEditText;
            Intrinsics.checkNotNullExpressionValue(variantsEditText, "variantsEditText");
            variantsEditText.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantsAdapter$AddVariantViewHolder$_init_$lambda$3$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s11) {
                    Function1 function1;
                    function1 = VariantsAdapter.AddVariantViewHolder.this.onVariantsInputChanged;
                    function1.invoke(s11 != null ? s11.toString() : null);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void lambda$3$lambda$0(AddVariantViewHolder addVariantViewHolder, View view) {
            addVariantViewHolder.onAddVariants.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void lambda$3$lambda$1(ItemAddVariantBinding itemAddVariantBinding, View view) {
            itemAddVariantBinding.variantsEditText.setText((CharSequence) null);
        }

        public final void bind(@NotNull AddVariantItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemAddVariantBinding itemAddVariantBinding = this.binding;
            TextView errorTextView = itemAddVariantBinding.errorTextView;
            Intrinsics.checkNotNullExpressionValue(errorTextView, "errorTextView");
            errorTextView.setVisibility(item.getIsValidVariantsInput() ? 4 : 0);
            if (!String.valueOf(itemAddVariantBinding.variantsEditText.getText()).equals(item.getVariantsInput())) {
                itemAddVariantBinding.variantsEditText.setText(item.getVariantsInput());
            }
            AppCompatImageButton clearInputImageButton = itemAddVariantBinding.clearInputImageButton;
            Intrinsics.checkNotNullExpressionValue(clearInputImageButton, "clearInputImageButton");
            String variantsInput = item.getVariantsInput();
            clearInputImageButton.setVisibility(variantsInput == null || variantsInput.length() == 0 ? 8 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantsAdapter$ClearVariantsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/abtool/databinding/ItemClearVariantsBinding;", "binding", "Lkotlin/Function0;", "", "onClearVariants", "<init>", "(Lru/ozon/app/android/abtool/databinding/ItemClearVariantsBinding;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function0;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ClearVariantsViewHolder extends RecyclerView.C {

        @NotNull
        private final Function0<Unit> onClearVariants;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearVariantsViewHolder(@NotNull ItemClearVariantsBinding binding, @NotNull Function0<Unit> onClearVariants) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(onClearVariants, "onClearVariants");
            this.onClearVariants = onClearVariants;
            binding.clearVariantsButton.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.abtool.presentation.abvariants.recycler.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VariantsAdapter.ClearVariantsViewHolder.lambda$1$lambda$0(VariantsAdapter.ClearVariantsViewHolder.this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void lambda$1$lambda$0(ClearVariantsViewHolder clearVariantsViewHolder, View view) {
            clearVariantsViewHolder.onClearVariants.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantsAdapter$VariantViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/abtool/databinding/ItemAbVariantBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;", "", "onDeleteVariant", "<init>", "(Lru/ozon/app/android/abtool/databinding/ItemAbVariantBinding;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;)V", "Lru/ozon/app/android/abtool/databinding/ItemAbVariantBinding;", "Lkotlin/jvm/functions/Function1;", "variant", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VariantViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemAbVariantBinding binding;

        @NotNull
        private final Function1<VariantItem, Unit> onDeleteVariant;
        private VariantItem variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public VariantViewHolder(@NotNull ItemAbVariantBinding binding, @NotNull Function1<? super VariantItem, Unit> onDeleteVariant) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(onDeleteVariant, "onDeleteVariant");
            this.binding = binding;
            this.onDeleteVariant = onDeleteVariant;
            binding.removeImageButton.setOnClickListener(new ViewOnClickListenerC2979c(this, 8));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(VariantViewHolder variantViewHolder, View view) {
            Function1<VariantItem, Unit> function1 = variantViewHolder.onDeleteVariant;
            VariantItem variantItem = variantViewHolder.variant;
            if (variantItem != null) {
                function1.invoke(variantItem);
            } else {
                Intrinsics.n("variant");
                throw null;
            }
        }

        public final void bind(@NotNull VariantItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.variant = item;
            this.binding.variantTextView.setText(item.getId());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantsAdapter$VariantsDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/ListItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/abtool/presentation/abvariants/recycler/ListItem;Lru/ozon/app/android/abtool/presentation/abvariants/recycler/ListItem;)Z", "areContentsTheSame", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class VariantsDiffCallback extends i.d<ListItem> {

        @NotNull
        public static final VariantsDiffCallback INSTANCE = new VariantsDiffCallback();

        private VariantsDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull ListItem oldItem, @NotNull ListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull ListItem oldItem, @NotNull ListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getId(), newItem.getId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VariantsAdapter(@NotNull Function1<? super VariantItem, Unit> onDeleteVariant, @NotNull Function1<? super String, Unit> onVariantsInputChanged, @NotNull Function0<Unit> onAddVariants, @NotNull Function0<Unit> onClearVariants) {
        super(VariantsDiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(onDeleteVariant, "onDeleteVariant");
        Intrinsics.checkNotNullParameter(onVariantsInputChanged, "onVariantsInputChanged");
        Intrinsics.checkNotNullParameter(onAddVariants, "onAddVariants");
        Intrinsics.checkNotNullParameter(onClearVariants, "onClearVariants");
        this.onDeleteVariant = onDeleteVariant;
        this.onVariantsInputChanged = onVariantsInputChanged;
        this.onAddVariants = onAddVariants;
        this.onClearVariants = onClearVariants;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ListItem item = getItem(position);
        if (item instanceof AddVariantItem) {
            return 0;
        }
        if (item instanceof VariantItem) {
            return 1;
        }
        if (item instanceof ClearVariantsItem) {
            return 2;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof VariantViewHolder) {
            ListItem item = getItem(position);
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantItem");
            ((VariantViewHolder) holder).bind((VariantItem) item);
        } else if (holder instanceof AddVariantViewHolder) {
            ListItem item2 = getItem(position);
            Intrinsics.g(item2, "null cannot be cast to non-null type ru.ozon.app.android.abtool.presentation.abvariants.recycler.AddVariantItem");
            ((AddVariantViewHolder) holder).bind((AddVariantItem) item2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            ItemAddVariantBinding bind = ItemAddVariantBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R$layout.item_add_variant, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            return new AddVariantViewHolder(bind, this.onVariantsInputChanged, this.onAddVariants);
        }
        if (viewType == 1) {
            ItemAbVariantBinding bind2 = ItemAbVariantBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R$layout.item_ab_variant, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind2, "bind(...)");
            return new VariantViewHolder(bind2, this.onDeleteVariant);
        }
        if (viewType != 2) {
            throw new IllegalArgumentException("Invalid view type");
        }
        ItemClearVariantsBinding bind3 = ItemClearVariantsBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R$layout.item_clear_variants, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind3, "bind(...)");
        return new ClearVariantsViewHolder(bind3, this.onClearVariants);
    }
}
