package ru.ozon.app.android.partpayment.formpage.view.vh;

import Au.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.R$layout;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldCheckerBaseBinding;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldCheckerItemBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R,\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u00060\u0018R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function3;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "", "", "onFieldsChanged", "Lkotlin/Function1;", "", "onNewPaymentMethodSelected", "<init>", "(Landroid/view/View;Lfd/n;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lfd/n;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldCheckerBaseBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldCheckerBaseBinding;", "Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH$CheckerSuggestsAdapter;", "adapter", "Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH$CheckerSuggestsAdapter;", "CheckerSuggestsAdapter", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckerFieldVH extends DynamicFormFieldVH {

    @NotNull
    private final CheckerSuggestsAdapter adapter;

    @NotNull
    private final ItemDynamicFormFieldCheckerBaseBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final InterfaceC6511n<DynamicFormFieldVH, FormPageVO.Field, Boolean, Unit> onFieldsChanged;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u001eB\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u0012\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH$CheckerSuggestsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH$CheckerSuggestsAdapter$SuggestVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH;", "Lkotlin/Function1;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Checker;", "", "onOptionSelected", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH$CheckerSuggestsAdapter$SuggestVH;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH$CheckerSuggestsAdapter$SuggestVH;I)V", "", "list", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "", "items", "Ljava/util/List;", "SuggestVH", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CheckerSuggestsAdapter extends RecyclerView.g<SuggestVH> {

        @NotNull
        private final List<FormPageVO.Field.Options.Checker> items;

        @NotNull
        private final Function1<FormPageVO.Field.Options.Checker, Unit> onOptionSelected;
        final /* synthetic */ CheckerFieldVH this$0;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH$CheckerSuggestsAdapter$SuggestVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/vh/CheckerFieldVH$CheckerSuggestsAdapter;Landroid/view/View;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Checker;", "item", "", "bindItem", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Checker;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldCheckerItemBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldCheckerItemBinding;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Checker;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class SuggestVH extends RecyclerView.C {

            @NotNull
            private final ItemDynamicFormFieldCheckerItemBinding binding;

            @NotNull
            private final View containerView;
            private FormPageVO.Field.Options.Checker item;
            final /* synthetic */ CheckerSuggestsAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuggestVH(@NotNull CheckerSuggestsAdapter checkerSuggestsAdapter, View containerView) {
                super(containerView);
                Intrinsics.checkNotNullParameter(containerView, "containerView");
                this.this$0 = checkerSuggestsAdapter;
                this.containerView = containerView;
                ItemDynamicFormFieldCheckerItemBinding bind = ItemDynamicFormFieldCheckerItemBinding.bind(containerView);
                Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
                this.binding = bind;
                this.itemView.setOnClickListener(new c(3, checkerSuggestsAdapter, this));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void _init_$lambda$0(CheckerSuggestsAdapter checkerSuggestsAdapter, SuggestVH suggestVH, View view) {
                Function1 function1 = checkerSuggestsAdapter.onOptionSelected;
                FormPageVO.Field.Options.Checker checker = suggestVH.item;
                if (checker != null) {
                    function1.invoke(checker);
                } else {
                    Intrinsics.n("item");
                    throw null;
                }
            }

            public final void bindItem(@NotNull FormPageVO.Field.Options.Checker item) {
                Intrinsics.checkNotNullParameter(item, "item");
                this.item = item;
                this.binding.titleTv.setText(item.getDisplayValue());
                this.binding.titleTv.setContentDescription(item.getDisplayValue());
                ImageView paymentIconIv = this.binding.paymentIconIv;
                Intrinsics.checkNotNullExpressionValue(paymentIconIv, "paymentIconIv");
                ImageViewExtKt.loadImageOrGone(paymentIconIv, item.getImg());
                this.binding.selectorIv.setSelected(item.getIsSelected());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CheckerSuggestsAdapter(@NotNull CheckerFieldVH checkerFieldVH, Function1<? super FormPageVO.Field.Options.Checker, Unit> onOptionSelected) {
            Intrinsics.checkNotNullParameter(onOptionSelected, "onOptionSelected");
            this.this$0 = checkerFieldVH;
            this.onOptionSelected = onOptionSelected;
            this.items = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: getItemCount */
        public int getCardsCount() {
            return this.items.size();
        }

        public final void submitList(@NotNull List<FormPageVO.Field.Options.Checker> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.items.clear();
            this.items.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(@NotNull SuggestVH holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bindItem(this.items.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @NotNull
        public SuggestVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new SuggestVH(this, ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_checker_item));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckerFieldVH(@NotNull View containerView, @NotNull InterfaceC6511n<? super DynamicFormFieldVH, ? super FormPageVO.Field, ? super Boolean, Unit> onFieldsChanged, @NotNull Function1<? super String, Unit> onNewPaymentMethodSelected) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onFieldsChanged, "onFieldsChanged");
        Intrinsics.checkNotNullParameter(onNewPaymentMethodSelected, "onNewPaymentMethodSelected");
        this.containerView = containerView;
        this.onFieldsChanged = onFieldsChanged;
        ItemDynamicFormFieldCheckerBaseBinding bind = ItemDynamicFormFieldCheckerBaseBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        CheckerSuggestsAdapter checkerSuggestsAdapter = new CheckerSuggestsAdapter(this, new CheckerFieldVH$adapter$1(this, onNewPaymentMethodSelected));
        this.adapter = checkerSuggestsAdapter;
        bind.checkerRv.setAdapter(checkerSuggestsAdapter);
        bind.checkerRv.setNestedScrollingEnabled(false);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.Checker checker = (FormPageVO.Field.Checker) item;
        this.binding.descriptionTv.setText(checker.getTitle());
        this.binding.descriptionTv.setContentDescription(checker.getTitle());
        this.adapter.submitList(checker.getOptions());
    }
}
