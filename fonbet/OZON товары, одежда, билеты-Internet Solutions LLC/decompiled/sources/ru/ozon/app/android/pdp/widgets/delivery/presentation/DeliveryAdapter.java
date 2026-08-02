package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import Sc.o;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterViewHolder;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryAdapter extends LifecycleListAdapter<DeliveryAdapterItem, DeliveryAdapterViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull J lifecycleOwner) {
        super(new NewDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getLayoutId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DeliveryAdapterViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DeliveryAdapterItem item = getItem(position);
        if ((holder instanceof DeliveryAdapterViewHolder.Placeholder) || (holder instanceof DeliveryAdapterViewHolder.Separator)) {
            return;
        }
        if (holder instanceof DeliveryAdapterViewHolder.VerticalSpace) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem.VerticalSpace");
            ((DeliveryAdapterViewHolder.VerticalSpace) holder).bind((DeliveryAdapterItem.VerticalSpace) item);
            return;
        }
        if (holder instanceof DeliveryAdapterViewHolder.MainHeader) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem.MainHeader");
            ((DeliveryAdapterViewHolder.MainHeader) holder).bind((DeliveryAdapterItem.MainHeader) item);
            return;
        }
        if (holder instanceof DeliveryAdapterViewHolder.SectionHeader) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem.SectionHeader");
            ((DeliveryAdapterViewHolder.SectionHeader) holder).bind((DeliveryAdapterItem.SectionHeader) item);
            return;
        }
        if (holder instanceof DeliveryAdapterViewHolder.CellWithIcon) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem.CellSingleAtom");
            ((DeliveryAdapterViewHolder.CellWithIcon) holder).bind((DeliveryAdapterItem.CellSingleAtom) item);
            return;
        }
        if (holder instanceof DeliveryAdapterViewHolder.CellDefault) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem.CellDefault");
            ((DeliveryAdapterViewHolder.CellDefault) holder).bind((DeliveryAdapterItem.CellDefault) item);
        } else if (holder instanceof DeliveryAdapterViewHolder.Footer) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem.Footer");
            ((DeliveryAdapterViewHolder.Footer) holder).bind((DeliveryAdapterItem.Footer) item);
        } else {
            if (!(holder instanceof DeliveryAdapterViewHolder.Pickup)) {
                throw new o();
            }
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem.Pickup");
            ((DeliveryAdapterViewHolder.Pickup) holder).bind((DeliveryAdapterItem.Pickup) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DeliveryAdapterViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = ViewGroupExtKt.inflate(parent, viewType);
        if (viewType == R$layout.pdp_item_delivery_placeholder) {
            return new DeliveryAdapterViewHolder.Placeholder(inflate);
        }
        if (viewType == R$layout.pdp_item_delivery_separator) {
            return new DeliveryAdapterViewHolder.Separator(inflate);
        }
        if (viewType == R$layout.pdp_item_delivery_vertical_space) {
            return new DeliveryAdapterViewHolder.VerticalSpace(inflate);
        }
        if (viewType == R$layout.pdp_item_delivery_section_header) {
            return new DeliveryAdapterViewHolder.SectionHeader(inflate);
        }
        if (viewType == R$layout.pdp_item_delivery_main_header) {
            return new DeliveryAdapterViewHolder.MainHeader(inflate, this.onAction);
        }
        if (viewType == R$layout.pdp_item_delivery_cell_with_icon) {
            return new DeliveryAdapterViewHolder.CellWithIcon(inflate, this.onAction);
        }
        if (viewType == R$layout.pdp_item_delivery_cell_default) {
            return new DeliveryAdapterViewHolder.CellDefault(inflate, this.onAction);
        }
        if (viewType == R$layout.pdp_item_delivery_footer) {
            return new DeliveryAdapterViewHolder.Footer(inflate, this.onAction);
        }
        if (viewType == R$layout.pdp_item_delivery_pickup) {
            return new DeliveryAdapterViewHolder.Pickup(inflate, this.onAction);
        }
        throw new IllegalArgumentException("unknown layout");
    }
}
