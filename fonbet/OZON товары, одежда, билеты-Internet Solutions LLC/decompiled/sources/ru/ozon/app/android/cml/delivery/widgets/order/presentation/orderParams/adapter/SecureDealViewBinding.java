package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter;

import X4.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/adapter/SecureDealViewBinding;", "LX4/a;", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView;", "view", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView;)V", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/presentation/SecureDealMoleculeView;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SecureDealViewBinding implements a {

    @NotNull
    private final SecureDealMoleculeView view;

    public SecureDealViewBinding(@NotNull SecureDealMoleculeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // X4.a
    @NotNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.view;
    }
}
