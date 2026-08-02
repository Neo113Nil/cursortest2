package ru.ozon.app.android.account.orders.barcode.presentation;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/w0;", "VM", "Landroidx/lifecycle/z0$b;", "invoke", "()Landroidx/lifecycle/z0$b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
public final class BarcodeFragment$special$$inlined$activityViewModels$default$3 extends AbstractC7737t implements Function0<z0.b> {
    final /* synthetic */ ComponentCallbacksC5392m $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeFragment$special$$inlined$activityViewModels$default$3(ComponentCallbacksC5392m componentCallbacksC5392m) {
        super(0);
        this.$this_activityViewModels = componentCallbacksC5392m;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final z0.b invoke() {
        return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
    }
}
