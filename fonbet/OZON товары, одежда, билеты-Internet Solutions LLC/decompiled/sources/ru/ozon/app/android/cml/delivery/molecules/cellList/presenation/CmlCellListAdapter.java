package ru.ozon.app.android.cml.delivery.molecules.cellList.presenation;

import Bl.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlCellListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlSingleCellViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlSingleCellViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlSingleCellViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlCellListAdapter extends t<CellItem, CmlSingleCellViewHolder> {
    private Function1<? super AtomAction, Unit> actionHandler;

    public CmlCellListAdapter() {
        super(new CmlCellListDiffCallback());
    }

    public final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.cellListGroup_cellViewType;
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CmlSingleCellViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CellItem item = getItem(position);
        if (item != null) {
            holder.bind(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CmlSingleCellViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SingleAtom singleAtom = (SingleAtom) b.a(SingleAtom.class, "type", q.f64554a, null);
        if (singleAtom == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SingleAtom singleAtom2 = new SingleAtom(context, null, 0, 0, 14, null);
            singleAtom2.setLayoutParams(new RecyclerView.p(-1, -2));
            singleAtom = singleAtom2;
        }
        return new CmlSingleCellViewHolder(singleAtom, new CmlCellListAdapter$onCreateViewHolder$1(this));
    }
}
