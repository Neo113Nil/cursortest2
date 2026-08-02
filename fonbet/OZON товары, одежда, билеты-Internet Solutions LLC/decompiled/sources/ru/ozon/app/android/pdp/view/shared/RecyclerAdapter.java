package ru.ozon.app.android.pdp.view.shared;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001f\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0001H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/view/shared/RecyclerAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "VH", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lkotlin/Function1;", "", "onItemVisible", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "getItemCount", "()I", "holder", "onViewAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "position", "getItem", "(I)Ljava/lang/Object;", "getItemOrNull", "", "list", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "items", "Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class RecyclerAdapter<T, VH extends RecyclerView.C> extends RecyclerView.g<VH> {

    @NotNull
    private List<? extends T> items;
    private final Function1<T, Unit> onItemVisible;

    public /* synthetic */ RecyclerAdapter(Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : function1);
    }

    public final T getItem(int position) {
        return this.items.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getCardsCount() {
        return this.items.size();
    }

    public final T getItemOrNull(int position) {
        return (T) C7714v.Q(position, this.items);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull VH holder) {
        T itemOrNull;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.onItemVisible == null || (itemOrNull = getItemOrNull(holder.getAdapterPosition())) == null) {
            return;
        }
        this.onItemVisible.invoke(itemOrNull);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items = list;
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerAdapter(Function1<? super T, Unit> function1) {
        this.onItemVisible = function1;
        this.items = K.f71697a;
    }
}
