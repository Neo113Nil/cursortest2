package ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment;

import Sc.InterfaceC4008j;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/w0;", "VM", "Landroidx/lifecycle/z0$b;", "invoke", "()Landroidx/lifecycle/z0$b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ReviewFormBottomSheetFragment$special$$inlined$viewModels$default$5 extends AbstractC7737t implements Function0<z0.b> {
    final /* synthetic */ InterfaceC4008j $owner$delegate;
    final /* synthetic */ ComponentCallbacksC5392m $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormBottomSheetFragment$special$$inlined$viewModels$default$5(ComponentCallbacksC5392m componentCallbacksC5392m, InterfaceC4008j interfaceC4008j) {
        super(0);
        this.$this_viewModels = componentCallbacksC5392m;
        this.$owner$delegate = interfaceC4008j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final z0.b invoke() {
        z0.b defaultViewModelProviderFactory;
        B0 b02 = (B0) this.$owner$delegate.getValue();
        InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
        return (interfaceC5431s == null || (defaultViewModelProviderFactory = interfaceC5431s.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
    }
}
