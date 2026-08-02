package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000\u001a0\u0010\b\u001a\u00020\u0007*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¨\u0006\u000e"}, d2 = {"secureDealAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handlePayload", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView;", "item", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "payload", "Landroid/os/Bundle;", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePayload(SecureDealMoleculeView secureDealMoleculeView, SecureDealMoleculeDTO secureDealMoleculeDTO, Bundle bundle, Function1<? super AtomAction, Unit> function1) {
        if (bundle.containsKey("marginsChanged")) {
            secureDealMoleculeView.bindMargins(secureDealMoleculeDTO);
        }
        if (bundle.containsKey("titleChanged")) {
            secureDealMoleculeView.bindTitle(secureDealMoleculeDTO.getTitle());
        }
        if (bundle.containsKey("toggleChanged")) {
            secureDealMoleculeView.bindToggle(secureDealMoleculeDTO.getToggle());
        }
        if (bundle.containsKey("titleIconChanged")) {
            secureDealMoleculeView.bindIconButton(secureDealMoleculeDTO.getTitleIconButton(), function1);
        }
        if (bundle.containsKey("subtitleChanged")) {
            secureDealMoleculeView.bindSubtitle(secureDealMoleculeDTO.getSubtitle());
        }
        if (bundle.containsKey("bottomBlockChanged")) {
            secureDealMoleculeView.bindBottomBlock(secureDealMoleculeDTO, function1);
        }
    }

    @NotNull
    public static final AdapterDelegate<List<OrderParamsItem>> secureDealAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        return new DslViewBindingListAdapterDelegate(SecureDealDelegateKt$secureDealAdapterDelegate$1.INSTANCE, SecureDealDelegateKt$secureDealAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new SecureDealDelegateKt$secureDealAdapterDelegate$2(actionHandler), SecureDealDelegateKt$secureDealAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
