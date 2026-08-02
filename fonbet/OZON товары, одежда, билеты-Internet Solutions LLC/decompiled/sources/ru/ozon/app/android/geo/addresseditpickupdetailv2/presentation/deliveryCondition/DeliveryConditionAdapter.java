package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.deliveryCondition;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailVO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$DeliveryCondition;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionViewHolder;I)V", "", "getItemId", "(I)J", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryConditionAdapter extends t<AddressEditPickUpDetailVO.DeliveryCondition, DeliveryConditionViewHolder> {
    public DeliveryConditionAdapter() {
        super(new DeliveryConditionDiffCallback());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DeliveryConditionViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AddressEditPickUpDetailVO.DeliveryCondition item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DeliveryConditionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new DeliveryConditionViewHolder(new DeliveryConditionView(context, null, 0, 6, null));
    }
}
