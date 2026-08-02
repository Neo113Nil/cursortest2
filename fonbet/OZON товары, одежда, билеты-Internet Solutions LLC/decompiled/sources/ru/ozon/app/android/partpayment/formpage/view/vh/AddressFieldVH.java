package ru.ozon.app.android.partpayment.formpage.view.vh;

import DN.b;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldAddressBaseBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/AddressFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "Lkotlin/Function2;", "", "", "onAddressClick", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "item", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldAddressBaseBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldAddressBaseBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressFieldVH extends DynamicFormFieldVH {

    @NotNull
    private final ItemDynamicFormFieldAddressBaseBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final Function2<DynamicFormFieldVH, String, Unit> onAddressClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressFieldVH(@NotNull View containerView, @NotNull Function2<? super DynamicFormFieldVH, ? super String, Unit> onAddressClick) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(onAddressClick, "onAddressClick");
        this.containerView = containerView;
        this.onAddressClick = onAddressClick;
        ItemDynamicFormFieldAddressBaseBinding bind = ItemDynamicFormFieldAddressBaseBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.addressFieldContainer.setOnClickListener(new b(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AddressFieldVH addressFieldVH, View view) {
        addressFieldVH.onAddressClick.invoke(addressFieldVH, String.valueOf(addressFieldVH.binding.fieldEt.getText()));
        addressFieldVH.binding.fieldTil.Z(null);
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.Address address = (FormPageVO.Field.Address) item;
        this.binding.fieldTil.d0(address.getTitle());
        this.binding.fieldEt.setText(address.getDisplayValue());
        this.binding.fieldEt.setContentDescription(address.getTitle());
        this.binding.fieldTil.Z(address.getError());
    }
}
