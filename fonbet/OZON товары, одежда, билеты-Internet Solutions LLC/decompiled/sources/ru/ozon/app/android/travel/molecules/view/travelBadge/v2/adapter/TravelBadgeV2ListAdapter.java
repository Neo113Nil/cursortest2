package ru.ozon.app.android.travel.molecules.view.travelBadge.v2.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v2.TravelBadgeV2DTO;
import ru.ozon.app.android.travel.molecules.view.travelBadge.v2.TravelBadgeV2View;
import ru.ozon.app.android.travel.ui.molecules.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelBadge/v2/adapter/TravelBadgeV2ListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/molecules/view/travelBadge/v2/adapter/TravelBadgeV2ListHolder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/molecules/view/travelBadge/v2/adapter/TravelBadgeV2ListHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/molecules/view/travelBadge/v2/adapter/TravelBadgeV2ListHolder;I)V", "", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v2/TravelBadgeV2DTO;", "items", "update", "(Ljava/util/List;)V", "Landroid/content/Context;", "", "badgeList", "Ljava/util/List;", "badgePadding", "I", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelBadgeV2ListAdapter extends RecyclerView.g<TravelBadgeV2ListHolder> {

    @NotNull
    private final List<TravelBadgeV2DTO> badgeList;
    private final int badgePadding;

    @NotNull
    private final Context context;

    public TravelBadgeV2ListAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.badgeList = new ArrayList();
        this.badgePadding = ResourceExtKt.toPx(10, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.badgeList.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void update(@NotNull List<TravelBadgeV2DTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List<TravelBadgeV2DTO> list = this.badgeList;
        list.clear();
        list.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TravelBadgeV2ListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.badgeList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TravelBadgeV2ListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TravelBadgeV2View travelBadgeV2View = new TravelBadgeV2View(this.context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = this.badgePadding;
        travelBadgeV2View.setPadding(i11, i11, i11, i11);
        travelBadgeV2View.setLayoutParams(layoutParams);
        travelBadgeV2View.setBackground(a.getDrawable(travelBadgeV2View.getContext(), R$drawable.bg_rounded_primary_4));
        travelBadgeV2View.setGravity(17);
        travelBadgeV2View.setOrientation(1);
        return new TravelBadgeV2ListHolder(travelBadgeV2View);
    }
}
