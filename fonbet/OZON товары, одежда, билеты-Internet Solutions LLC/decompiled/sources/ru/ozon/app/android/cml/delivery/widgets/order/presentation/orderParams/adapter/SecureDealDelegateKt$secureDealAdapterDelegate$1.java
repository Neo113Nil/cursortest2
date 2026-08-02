package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.presentation.SecureDealMoleculeView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/adapter/SecureDealViewBinding;", "<unused var>", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SecureDealDelegateKt$secureDealAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, SecureDealViewBinding> {
    public static final SecureDealDelegateKt$secureDealAdapterDelegate$1 INSTANCE = new SecureDealDelegateKt$secureDealAdapterDelegate$1();

    SecureDealDelegateKt$secureDealAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final SecureDealViewBinding invoke(LayoutInflater layoutInflater, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SecureDealMoleculeView secureDealMoleculeView = new SecureDealMoleculeView(context, null, 0, 6, null);
        secureDealMoleculeView.setLayoutParams(new RecyclerView.p(-1, -2));
        return new SecureDealViewBinding(secureDealMoleculeView);
    }
}
