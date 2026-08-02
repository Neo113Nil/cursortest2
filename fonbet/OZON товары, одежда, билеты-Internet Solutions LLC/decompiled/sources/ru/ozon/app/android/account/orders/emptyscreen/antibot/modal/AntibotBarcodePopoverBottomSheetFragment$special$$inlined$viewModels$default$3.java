package ru.ozon.app.android.account.orders.emptyscreen.antibot.modal;

import Sc.InterfaceC4008j;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/w0;", "VM", "Landroidx/lifecycle/A0;", "invoke", "()Landroidx/lifecycle/A0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
public final class AntibotBarcodePopoverBottomSheetFragment$special$$inlined$viewModels$default$3 extends AbstractC7737t implements Function0<A0> {
    final /* synthetic */ InterfaceC4008j $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AntibotBarcodePopoverBottomSheetFragment$special$$inlined$viewModels$default$3(InterfaceC4008j interfaceC4008j) {
        super(0);
        this.$owner$delegate = interfaceC4008j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final A0 invoke() {
        return ((B0) this.$owner$delegate.getValue()).getViewModelStore();
    }
}
