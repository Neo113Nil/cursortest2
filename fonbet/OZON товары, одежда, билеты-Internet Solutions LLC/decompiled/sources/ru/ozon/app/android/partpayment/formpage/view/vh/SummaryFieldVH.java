package ru.ozon.app.android.partpayment.formpage.view.vh;

import Aw.ViewOnClickListenerC2448a;
import Ve.Lq;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.R$layout;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldSummaryActionBinding;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldSummaryBaseBinding;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldSummaryDetailBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001c\u001dBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function2;", "", "", "onChangeClick", "onActionClick", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldSummaryBaseBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldSummaryBaseBinding;", "Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$SummaryInfoAdapter;", "detailsAdapter", "Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$SummaryInfoAdapter;", "Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$ActionAdapter;", "actionsAdapter", "Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$ActionAdapter;", "SummaryInfoAdapter", "ActionAdapter", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SummaryFieldVH extends DynamicFormFieldVH {

    @NotNull
    private final ActionAdapter actionsAdapter;

    @NotNull
    private final ItemDynamicFormFieldSummaryBaseBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final SummaryInfoAdapter detailsAdapter;

    @NotNull
    private final Function2<DynamicFormFieldVH, String, Unit> onActionClick;

    @NotNull
    private final Function2<DynamicFormFieldVH, String, Unit> onChangeClick;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00052\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$ActionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$ActionAdapter$SummaryButtonVH;", "Lkotlin/Function1;", "", "", "actionSelected", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$ActionAdapter$SummaryButtonVH;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$ActionAdapter$SummaryButtonVH;I)V", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryButton;", "list", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "getActionSelected", "()Lkotlin/jvm/functions/Function1;", "", "items", "Ljava/util/List;", "SummaryButtonVH", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionAdapter extends RecyclerView.g<SummaryButtonVH> {

        @NotNull
        private final Function1<String, Unit> actionSelected;

        @NotNull
        private final List<FormPageVO.Field.Summary.SummaryButton> items;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$ActionAdapter$SummaryButtonVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$ActionAdapter;Landroid/view/View;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryButton;", "item", "", "bindItem", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryButton;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldSummaryActionBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldSummaryActionBinding;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$SummaryButton;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class SummaryButtonVH extends RecyclerView.C {

            @NotNull
            private final ItemDynamicFormFieldSummaryActionBinding binding;

            @NotNull
            private final View containerView;
            private FormPageVO.Field.Summary.SummaryButton item;
            final /* synthetic */ ActionAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SummaryButtonVH(@NotNull ActionAdapter actionAdapter, View containerView) {
                super(containerView);
                Intrinsics.checkNotNullParameter(containerView, "containerView");
                this.this$0 = actionAdapter;
                this.containerView = containerView;
                ItemDynamicFormFieldSummaryActionBinding bind = ItemDynamicFormFieldSummaryActionBinding.bind(containerView);
                Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
                this.binding = bind;
                bind.actionBtn.setOnClickListener(new Lq(1, this, actionAdapter));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void _init_$lambda$1(SummaryButtonVH summaryButtonVH, ActionAdapter actionAdapter, View view) {
                FormPageVO.Field.Summary.SummaryButton summaryButton = summaryButtonVH.item;
                if (summaryButton != null) {
                    actionAdapter.getActionSelected().invoke(summaryButton.getDeeplink());
                }
            }

            public final void bindItem(@NotNull FormPageVO.Field.Summary.SummaryButton item) {
                Intrinsics.checkNotNullParameter(item, "item");
                this.item = item;
                this.binding.actionBtn.setText(item.getTitle());
                this.binding.actionBtn.setContentDescription(item.getTitle());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ActionAdapter(@NotNull Function1<? super String, Unit> actionSelected) {
            Intrinsics.checkNotNullParameter(actionSelected, "actionSelected");
            this.actionSelected = actionSelected;
            this.items = new ArrayList();
        }

        @NotNull
        public final Function1<String, Unit> getActionSelected() {
            return this.actionSelected;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int getItemCount() {
            return this.items.size();
        }

        public final void submitList(@NotNull List<FormPageVO.Field.Summary.SummaryButton> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.items.clear();
            this.items.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(@NotNull SummaryButtonVH holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bindItem(this.items.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @NotNull
        public SummaryButtonVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new SummaryButtonVH(this, ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_summary_action));
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$SummaryInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$SummaryInfoAdapter$InfoFieldVH;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$SummaryInfoAdapter$InfoFieldVH;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$SummaryInfoAdapter$InfoFieldVH;I)V", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$InfoField;", "list", "submitList", "(Ljava/util/List;)V", "", "items", "Ljava/util/List;", "InfoFieldVH", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SummaryInfoAdapter extends RecyclerView.g<InfoFieldVH> {

        @NotNull
        private final List<FormPageVO.Field.Summary.InfoField> items = new ArrayList();

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$SummaryInfoAdapter$InfoFieldVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/vh/SummaryFieldVH$SummaryInfoAdapter;Landroid/view/View;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$InfoField;", "item", "", "bindItem", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary$InfoField;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldSummaryDetailBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldSummaryDetailBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class InfoFieldVH extends RecyclerView.C {

            @NotNull
            private final ItemDynamicFormFieldSummaryDetailBinding binding;

            @NotNull
            private final View containerView;
            final /* synthetic */ SummaryInfoAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InfoFieldVH(@NotNull SummaryInfoAdapter summaryInfoAdapter, View containerView) {
                super(containerView);
                Intrinsics.checkNotNullParameter(containerView, "containerView");
                this.this$0 = summaryInfoAdapter;
                this.containerView = containerView;
                ItemDynamicFormFieldSummaryDetailBinding bind = ItemDynamicFormFieldSummaryDetailBinding.bind(containerView);
                Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
                this.binding = bind;
            }

            public final void bindItem(@NotNull FormPageVO.Field.Summary.InfoField item) {
                Intrinsics.checkNotNullParameter(item, "item");
                ItemDynamicFormFieldSummaryDetailBinding itemDynamicFormFieldSummaryDetailBinding = this.binding;
                TextView hintTv = itemDynamicFormFieldSummaryDetailBinding.hintTv;
                Intrinsics.checkNotNullExpressionValue(hintTv, "hintTv");
                TextViewExtKt.setTextOrGone(hintTv, item.getHint());
                itemDynamicFormFieldSummaryDetailBinding.hintTv.setContentDescription(item.getHint());
                TextView valueTv = itemDynamicFormFieldSummaryDetailBinding.valueTv;
                Intrinsics.checkNotNullExpressionValue(valueTv, "valueTv");
                TextViewExtKt.setTextOrGone(valueTv, item.getValue());
                itemDynamicFormFieldSummaryDetailBinding.valueTv.setContentDescription(item.getValue());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int getItemCount() {
            return this.items.size();
        }

        public final void submitList(@NotNull List<FormPageVO.Field.Summary.InfoField> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.items.clear();
            this.items.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(@NotNull InfoFieldVH holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bindItem(this.items.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @NotNull
        public InfoFieldVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new InfoFieldVH(this, ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_summary_detail));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SummaryFieldVH(@NotNull View containerView, @NotNull Function2<? super DynamicFormFieldVH, ? super String, Unit> onChangeClick, @NotNull Function2<? super DynamicFormFieldVH, ? super String, Unit> onActionClick) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onChangeClick, "onChangeClick");
        Intrinsics.checkNotNullParameter(onActionClick, "onActionClick");
        this.containerView = containerView;
        this.onChangeClick = onChangeClick;
        this.onActionClick = onActionClick;
        ItemDynamicFormFieldSummaryBaseBinding bind = ItemDynamicFormFieldSummaryBaseBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        SummaryInfoAdapter summaryInfoAdapter = new SummaryInfoAdapter();
        this.detailsAdapter = summaryInfoAdapter;
        ActionAdapter actionAdapter = new ActionAdapter(new SummaryFieldVH$actionsAdapter$1(this));
        this.actionsAdapter = actionAdapter;
        bind.detailsRv.setAdapter(summaryInfoAdapter);
        bind.detailsRv.setNestedScrollingEnabled(false);
        bind.actionRv.setAdapter(actionAdapter);
        bind.actionRv.setNestedScrollingEnabled(false);
        bind.changeBtn.setOnClickListener(new ViewOnClickListenerC2448a(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(SummaryFieldVH summaryFieldVH, View view) {
        String changeDeeplink;
        FormPageVO.Field field = summaryFieldVH.getField();
        FormPageVO.Field.Summary summary = field instanceof FormPageVO.Field.Summary ? (FormPageVO.Field.Summary) field : null;
        if (summary == null || (changeDeeplink = summary.getChangeDeeplink()) == null) {
            return;
        }
        summaryFieldVH.onChangeClick.invoke(summaryFieldVH, changeDeeplink);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.Summary summary = (FormPageVO.Field.Summary) item;
        ItemDynamicFormFieldSummaryBaseBinding itemDynamicFormFieldSummaryBaseBinding = this.binding;
        TextView titleTv = itemDynamicFormFieldSummaryBaseBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, summary.getTitle());
        itemDynamicFormFieldSummaryBaseBinding.titleTv.setContentDescription(summary.getTitle());
        TextView changeBtn = itemDynamicFormFieldSummaryBaseBinding.changeBtn;
        Intrinsics.checkNotNullExpressionValue(changeBtn, "changeBtn");
        ViewExtKt.showOrGone(changeBtn, Boolean.valueOf(summary.getShowChangeBtn()));
        this.detailsAdapter.submitList(summary.getSummaryOptions().getFields());
        this.actionsAdapter.submitList(summary.getSummaryOptions().getButtons());
        FrameLayout layoutBackgroundProgressBar = itemDynamicFormFieldSummaryBaseBinding.layoutBackgroundProgressBar;
        Intrinsics.checkNotNullExpressionValue(layoutBackgroundProgressBar, "layoutBackgroundProgressBar");
        ViewExtKt.showOrGone(layoutBackgroundProgressBar, Boolean.valueOf(summary.getShowLoader()));
        ImageView statusIv = itemDynamicFormFieldSummaryBaseBinding.statusIv;
        Intrinsics.checkNotNullExpressionValue(statusIv, "statusIv");
        ImageViewExtKt.loadImageOrGone(statusIv, summary.getSummaryOptions().getStatusIcon());
        TextView descriptionTv = itemDynamicFormFieldSummaryBaseBinding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        TextViewExtKt.setTextOrGone(descriptionTv, summary.getSummaryOptions().getDescription());
        itemDynamicFormFieldSummaryBaseBinding.descriptionTv.setContentDescription(summary.getSummaryOptions().getDescription());
    }
}
