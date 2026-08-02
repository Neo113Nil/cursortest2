package ru.ozon.app.android.account.orders.barcode.presentation;

import androidx.fragment.app.ComponentCallbacksC5392m;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/w0;", "VM", "Lf3/a;", "invoke", "()Lf3/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
public final class BarcodeFragment$special$$inlined$activityViewModels$default$2 extends AbstractC7737t implements Function0<AbstractC6409a> {
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ ComponentCallbacksC5392m $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeFragment$special$$inlined$activityViewModels$default$2(Function0 function0, ComponentCallbacksC5392m componentCallbacksC5392m) {
        super(0);
        this.$extrasProducer = function0;
        this.$this_activityViewModels = componentCallbacksC5392m;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final AbstractC6409a invoke() {
        AbstractC6409a abstractC6409a;
        Function0 function0 = this.$extrasProducer;
        return (function0 == null || (abstractC6409a = (AbstractC6409a) function0.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : abstractC6409a;
    }
}
