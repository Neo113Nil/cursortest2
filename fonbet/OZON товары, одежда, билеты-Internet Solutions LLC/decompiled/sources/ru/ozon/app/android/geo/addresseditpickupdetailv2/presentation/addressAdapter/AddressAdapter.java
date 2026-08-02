package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.addressAdapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/addressAdapter/AddressAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Address;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/addressAdapter/AddressViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/addressAdapter/AddressViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/addressAdapter/AddressViewHolder;I)V", "", "getItemId", "(I)J", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lkotlin/Function1;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressAdapter extends t<AddressEditPickUpDetailVO.Address, AddressViewHolder> {
    private Function1<? super AtomAction, Unit> onAction;

    public AddressAdapter() {
        super(new AddressDiffCallback());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int position) {
        return position;
    }

    public final void handleAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Function1<? super AtomAction, Unit> function1 = this.onAction;
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AddressViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AddressEditPickUpDetailVO.Address item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AddressViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new AddressViewHolder(new AddressView(context, null, 0, 6, null), new AddressAdapter$onCreateViewHolder$1(this));
    }
}
