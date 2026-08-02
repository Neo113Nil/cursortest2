package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.adapter;

import CG.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemModalPickerOptionBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/adapter/ModalPickerOptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "", "onSelect", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/partpayment/databinding/ItemModalPickerOptionBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemModalPickerOptionBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalPickerOptionsViewHolder extends RecyclerView.C {

    @NotNull
    private final ItemModalPickerOptionBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final Function1<ModalPickerOptionsViewHolder, Unit> onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalPickerOptionsViewHolder(@NotNull View containerView, @NotNull Function1<? super ModalPickerOptionsViewHolder, Unit> onSelect) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        this.containerView = containerView;
        this.onSelect = onSelect;
        ItemModalPickerOptionBinding bind = ItemModalPickerOptionBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.itemView.setOnClickListener(new a(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ModalPickerOptionsViewHolder modalPickerOptionsViewHolder, View view) {
        modalPickerOptionsViewHolder.onSelect.invoke(modalPickerOptionsViewHolder);
    }

    public final void bind(@NotNull FormPageVO.Field.Options.Picker item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.optionNameTv.setText(item.getDisplayValue());
        this.binding.selectorV.setSelected(item.getIsSelected());
    }
}
