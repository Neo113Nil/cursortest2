package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x0 {
    private final y0 mObservable = new y0();
    private boolean mHasStableIds = false;
    private w0 mStateRestorationPolicy = w0.f2577a;

    public final void bindViewHolder(@NonNull d2 d2Var, int i5) {
        boolean z5 = d2Var.mBindingAdapter == null;
        if (z5) {
            d2Var.mPosition = i5;
            if (hasStableIds()) {
                d2Var.mItemId = getItemId(i5);
            }
            d2Var.setFlags(1, 519);
            if (l0.k.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(d2Var.mItemViewType)));
            }
        }
        d2Var.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (d2Var.itemView.getParent() == null && d2Var.itemView.isAttachedToWindow() != d2Var.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + d2Var.isTmpDetached() + ", attached to window: " + d2Var.itemView.isAttachedToWindow() + ", holder: " + d2Var);
            }
            if (d2Var.itemView.getParent() == null && d2Var.itemView.isAttachedToWindow()) {
                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + d2Var);
            }
        }
        onBindViewHolder(d2Var, i5, d2Var.getUnmodifiedPayloads());
        if (z5) {
            d2Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = d2Var.itemView.getLayoutParams();
            if (layoutParams instanceof l1) {
                ((l1) layoutParams).f2470c = true;
            }
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int ordinal = this.mStateRestorationPolicy.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
        } else if (getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    @NonNull
    public final d2 createViewHolder(@NonNull ViewGroup viewGroup, int i5) {
        try {
            if (l0.k.a()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i5)));
            }
            d2 onCreateViewHolder = onCreateViewHolder(viewGroup, i5);
            if (onCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            onCreateViewHolder.mItemViewType = i5;
            Trace.endSection();
            return onCreateViewHolder;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public int findRelativeAdapterPositionIn(@NonNull x0 x0Var, @NonNull d2 d2Var, int i5) {
        if (x0Var == this) {
            return i5;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i5) {
        return -1L;
    }

    public int getItemViewType(int i5) {
        return 0;
    }

    @NonNull
    public final w0 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i5) {
        this.mObservable.d(i5, 1, null);
    }

    public final void notifyItemInserted(int i5) {
        this.mObservable.e(i5, 1);
    }

    public final void notifyItemMoved(int i5, int i10) {
        this.mObservable.c(i5, i10);
    }

    public final void notifyItemRangeChanged(int i5, int i10) {
        this.mObservable.d(i5, i10, null);
    }

    public final void notifyItemRangeInserted(int i5, int i10) {
        this.mObservable.e(i5, i10);
    }

    public final void notifyItemRangeRemoved(int i5, int i10) {
        this.mObservable.f(i5, i10);
    }

    public final void notifyItemRemoved(int i5) {
        this.mObservable.f(i5, 1);
    }

    public abstract void onBindViewHolder(d2 d2Var, int i5);

    public void onBindViewHolder(@NonNull d2 d2Var, int i5, @NonNull List<Object> list) {
        onBindViewHolder(d2Var, i5);
    }

    public abstract d2 onCreateViewHolder(ViewGroup viewGroup, int i5);

    public boolean onFailedToRecycleView(@NonNull d2 d2Var) {
        return false;
    }

    public void registerAdapterDataObserver(@NonNull z0 z0Var) {
        this.mObservable.registerObserver(z0Var);
    }

    public void setHasStableIds(boolean z5) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z5;
    }

    public void setStateRestorationPolicy(@NonNull w0 w0Var) {
        this.mStateRestorationPolicy = w0Var;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(@NonNull z0 z0Var) {
        this.mObservable.unregisterObserver(z0Var);
    }

    public final void notifyItemChanged(int i5, Object obj) {
        this.mObservable.d(i5, 1, obj);
    }

    public final void notifyItemRangeChanged(int i5, int i10, Object obj) {
        this.mObservable.d(i5, i10, obj);
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onViewAttachedToWindow(@NonNull d2 d2Var) {
    }

    public void onViewDetachedFromWindow(@NonNull d2 d2Var) {
    }

    public void onViewRecycled(@NonNull d2 d2Var) {
    }
}
