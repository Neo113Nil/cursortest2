package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a70;
import defpackage.asj;
import defpackage.hrf;
import defpackage.wqf;
import defpackage.xqf;
import defpackage.yhk;
import defpackage.yqf;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class l {
    private final xqf mObservable = new xqf();
    private boolean mHasStableIds = false;
    private wqf mStateRestorationPolicy = wqf.a;

    public final void bindViewHolder(@NonNull u uVar, int i) {
        boolean z = uVar.mBindingAdapter == null;
        if (z) {
            uVar.mPosition = i;
            if (hasStableIds()) {
                uVar.mItemId = getItemId(i);
            }
            uVar.setFlags(1, 519);
            if (asj.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(uVar.mItemViewType)));
            }
        }
        uVar.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (uVar.itemView.getParent() == null && uVar.itemView.isAttachedToWindow() != uVar.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + uVar.isTmpDetached() + ", attached to window: " + uVar.itemView.isAttachedToWindow() + ", holder: " + uVar);
            }
            if (uVar.itemView.getParent() == null && uVar.itemView.isAttachedToWindow()) {
                yhk.r(uVar, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                return;
            }
        }
        onBindViewHolder(uVar, i, uVar.getUnmodifiedPayloads());
        if (z) {
            uVar.clearPayload();
            ViewGroup.LayoutParams layoutParams = uVar.itemView.getLayoutParams();
            if (layoutParams instanceof hrf) {
                ((hrf) layoutParams).c = true;
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
    public final u createViewHolder(@NonNull ViewGroup viewGroup, int i) {
        try {
            if (asj.a()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
            }
            u onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (onCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            onCreateViewHolder.mItemViewType = i;
            return onCreateViewHolder;
        } finally {
            Trace.endSection();
        }
    }

    public int findRelativeAdapterPositionIn(@NonNull l lVar, @NonNull u uVar, int i) {
        if (lVar == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    @NonNull
    public final wqf getStateRestorationPolicy() {
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

    public final void notifyItemChanged(int i) {
        this.mObservable.d(i, 1, null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.e(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.c(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.d(i, i2, null);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.e(i, i2);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.f(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.f(i, 1);
    }

    public abstract void onBindViewHolder(u uVar, int i);

    public void onBindViewHolder(@NonNull u uVar, int i, @NonNull List<Object> list) {
        onBindViewHolder(uVar, i);
    }

    public abstract u onCreateViewHolder(ViewGroup viewGroup, int i);

    public boolean onFailedToRecycleView(@NonNull u uVar) {
        return false;
    }

    public void registerAdapterDataObserver(@NonNull yqf yqfVar) {
        this.mObservable.registerObserver(yqfVar);
    }

    public void setHasStableIds(boolean z) {
        if (hasObservers()) {
            a70.r("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.mHasStableIds = z;
        }
    }

    public void setStateRestorationPolicy(@NonNull wqf wqfVar) {
        this.mStateRestorationPolicy = wqfVar;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(@NonNull yqf yqfVar) {
        this.mObservable.unregisterObserver(yqfVar);
    }

    public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
        this.mObservable.d(i, i2, obj);
    }

    public final void notifyItemChanged(int i, @Nullable Object obj) {
        this.mObservable.d(i, 1, obj);
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onViewAttachedToWindow(@NonNull u uVar) {
    }

    public void onViewDetachedFromWindow(@NonNull u uVar) {
    }

    public void onViewRecycled(@NonNull u uVar) {
    }
}
