package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/adapter/AddLegalAddressAdapter;", "Landroidx/recyclerview/widget/t;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/adapter/AddLegalAddressViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/adapter/AddLegalAddressViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/adapter/AddLegalAddressViewHolder;I)V", "Lkotlin/Function1;", "", "addressCallback", "Lkotlin/jvm/functions/Function1;", "getAddressCallback", "()Lkotlin/jvm/functions/Function1;", "setAddressCallback", "(Lkotlin/jvm/functions/Function1;)V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalAddressAdapter extends t<CharSequence, AddLegalAddressViewHolder> {
    private Function1<? super String, Unit> addressCallback;

    public AddLegalAddressAdapter() {
        super(new AddLegalAddressDiffCallback());
    }

    public final void setAddressCallback(Function1<? super String, Unit> function1) {
        this.addressCallback = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AddLegalAddressViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setAddressCallback(this.addressCallback);
        CharSequence item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AddLegalAddressViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new AddLegalAddressViewHolder(ViewGroupExtKt.inflate(parent, R$layout.widget_add_legal_address_mobile_item));
    }
}
