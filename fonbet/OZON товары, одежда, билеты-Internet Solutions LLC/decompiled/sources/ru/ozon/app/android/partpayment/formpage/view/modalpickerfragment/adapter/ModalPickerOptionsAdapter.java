package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.R$layout;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/adapter/ModalPickerOptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/adapter/ModalPickerOptionsViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/adapter/ModalPickerOptionsViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/adapter/ModalPickerOptionsViewHolder;I)V", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "items", "submitItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "onSelect", "Lkotlin/jvm/functions/Function1;", "getOnSelect", "()Lkotlin/jvm/functions/Function1;", "setOnSelect", "(Lkotlin/jvm/functions/Function1;)V", "", "Ljava/util/List;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalPickerOptionsAdapter extends RecyclerView.g<ModalPickerOptionsViewHolder> {

    @NotNull
    private final List<FormPageVO.Field.Options.Picker> items = new ArrayList();
    private Function1<? super FormPageVO.Field.Options.Picker, Unit> onSelect;

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    public final Function1<FormPageVO.Field.Options.Picker, Unit> getOnSelect() {
        return this.onSelect;
    }

    public final void setOnSelect(Function1<? super FormPageVO.Field.Options.Picker, Unit> function1) {
        this.onSelect = function1;
    }

    public final void submitItems(@NotNull List<FormPageVO.Field.Options.Picker> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ModalPickerOptionsViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ModalPickerOptionsViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ModalPickerOptionsViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_modal_picker_option), new ModalPickerOptionsAdapter$onCreateViewHolder$1(this));
    }
}
