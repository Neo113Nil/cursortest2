package ru.ozon.app.android.travel.molecules.view.travelTab.v2.container.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import fd.InterfaceC6511n;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.TravelTabVO;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.TravelTabView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BC\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R,\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/adapter/TravelTabsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/TravelTabVO;", "Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/adapter/TravelTabViewHolder;", "Lkotlin/Function3;", "", "Landroid/view/View;", "", "onTabClickListener", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction$ViewAction;", "viewActionHandler", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lfd/n;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/adapter/TravelTabViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/molecules/view/travelTab/v2/container/adapter/TravelTabViewHolder;I)V", "Lfd/n;", "Lkotlin/jvm/functions/Function1;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelTabsAdapter extends i<TravelTabVO, TravelTabViewHolder> {

    @NotNull
    private final InterfaceC6511n<Integer, TravelTabVO, View, Unit> onTabClickListener;

    @NotNull
    private final Function1<AtomAction.ViewAction, Unit> viewActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TravelTabsAdapter(@NotNull InterfaceC6511n<? super Integer, ? super TravelTabVO, ? super View, Unit> onTabClickListener, @NotNull Function1<? super AtomAction.ViewAction, Unit> viewActionHandler, @NotNull J lifecycleOwner) {
        super(new i.d<TravelTabVO>() { // from class: ru.ozon.app.android.travel.molecules.view.travelTab.v2.container.adapter.TravelTabsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelTabVO oldItem, TravelTabVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelTabVO oldItem, TravelTabVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(onTabClickListener, "onTabClickListener");
        Intrinsics.checkNotNullParameter(viewActionHandler, "viewActionHandler");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.onTabClickListener = onTabClickListener;
        this.viewActionHandler = viewActionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TravelTabViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelTabVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TravelTabViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelTabView travelTabView = new TravelTabView(context, null, 0, 0, 14, null);
        travelTabView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new TravelTabViewHolder(travelTabView, this.onTabClickListener, this.viewActionHandler);
    }
}
