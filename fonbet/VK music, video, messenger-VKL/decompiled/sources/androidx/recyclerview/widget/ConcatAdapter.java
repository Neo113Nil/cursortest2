package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import xsna.obr;
import xsna.odj;

/* loaded from: classes12.dex */
public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.e0> {
    public final f c;

    public static final class Config {

        @NonNull
        public static final Config b = new Config(StableIdMode.NO_STABLE_IDS);

        @NonNull
        public final StableIdMode a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StableIdMode {
            private static final /* synthetic */ StableIdMode[] $VALUES;
            public static final StableIdMode ISOLATED_STABLE_IDS;
            public static final StableIdMode NO_STABLE_IDS;
            public static final StableIdMode SHARED_STABLE_IDS;

            static {
                StableIdMode stableIdMode = new StableIdMode("NO_STABLE_IDS", 0);
                NO_STABLE_IDS = stableIdMode;
                StableIdMode stableIdMode2 = new StableIdMode("ISOLATED_STABLE_IDS", 1);
                ISOLATED_STABLE_IDS = stableIdMode2;
                StableIdMode stableIdMode3 = new StableIdMode("SHARED_STABLE_IDS", 2);
                SHARED_STABLE_IDS = stableIdMode3;
                $VALUES = new StableIdMode[]{stableIdMode, stableIdMode2, stableIdMode3};
            }

            public StableIdMode() {
                throw null;
            }

            public static StableIdMode valueOf(String str) {
                return (StableIdMode) Enum.valueOf(StableIdMode.class, str);
            }

            public static StableIdMode[] values() {
                return (StableIdMode[]) $VALUES.clone();
            }
        }

        public Config(@NonNull StableIdMode stableIdMode) {
            this.a = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.e0>... adapterArr) {
        this(Config.b, adapterArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int findRelativeAdapterPositionIn(@NonNull RecyclerView.Adapter<? extends RecyclerView.e0> adapter, @NonNull RecyclerView.e0 e0Var, int i) {
        f fVar = this.c;
        a0 a0Var = fVar.d.get(e0Var);
        if (a0Var == null) {
            return -1;
        }
        RecyclerView.Adapter<RecyclerView.e0> adapter2 = a0Var.c;
        int b = i - fVar.b(a0Var);
        int itemCount = adapter2.getItemCount();
        if (b >= 0 && b < itemCount) {
            return adapter2.findRelativeAdapterPositionIn(adapter, e0Var, b);
        }
        StringBuilder a = odj.a(b, itemCount, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        a.append(e0Var);
        a.append("adapter:");
        a.append(adapter);
        throw new IllegalStateException(a.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Iterator it = this.c.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((a0) it.next()).e;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        f fVar = this.c;
        f.a c = fVar.c(i);
        a0 a0Var = c.a;
        long a = a0Var.b.a(a0Var.c.getItemId(c.b));
        c.c = false;
        c.a = null;
        c.b = -1;
        fVar.f = c;
        return a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        f fVar = this.c;
        f.a c = fVar.c(i);
        a0 a0Var = c.a;
        int a = a0Var.a.a(a0Var.c.getItemViewType(c.b));
        c.c = false;
        c.a = null;
        c.b = -1;
        fVar.f = c;
        return a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        f fVar = this.c;
        ArrayList arrayList = fVar.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = fVar.e.iterator();
        while (it2.hasNext()) {
            ((a0) it2.next()).c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.e0 e0Var, int i) {
        f fVar = this.c;
        f.a c = fVar.c(i);
        fVar.d.put(e0Var, c.a);
        a0 a0Var = c.a;
        a0Var.c.bindViewHolder(e0Var, c.b);
        c.c = false;
        c.a = null;
        c.b = -1;
        fVar.f = c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        a0 a = this.c.b.a(i);
        return a.c.onCreateViewHolder(viewGroup, a.a.b(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        f fVar = this.c;
        ArrayList arrayList = fVar.c;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = fVar.e.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull RecyclerView.e0 e0Var) {
        f fVar = this.c;
        IdentityHashMap<RecyclerView.e0, a0> identityHashMap = fVar.d;
        a0 a0Var = identityHashMap.get(e0Var);
        if (a0Var != null) {
            boolean onFailedToRecycleView = a0Var.c.onFailedToRecycleView(e0Var);
            identityHashMap.remove(e0Var);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull RecyclerView.e0 e0Var) {
        this.c.d(e0Var).c.onViewAttachedToWindow(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NonNull RecyclerView.e0 e0Var) {
        this.c.d(e0Var).c.onViewDetachedFromWindow(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull RecyclerView.e0 e0Var) {
        f fVar = this.c;
        IdentityHashMap<RecyclerView.e0, a0> identityHashMap = fVar.d;
        a0 a0Var = identityHashMap.get(e0Var);
        if (a0Var != null) {
            a0Var.c.onViewRecycled(e0Var);
            identityHashMap.remove(e0Var);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + fVar);
        }
    }

    public final void x0(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull Config config, @NonNull RecyclerView.Adapter<? extends RecyclerView.e0>... adapterArr) {
        ArrayList arrayList;
        int size;
        List asList = Arrays.asList(adapterArr);
        this.c = new f(this, config);
        Iterator it = asList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                super.setHasStableIds(this.c.g != Config.StableIdMode.NO_STABLE_IDS);
                return;
            }
            RecyclerView.Adapter<RecyclerView.e0> adapter = (RecyclerView.Adapter) it.next();
            f fVar = this.c;
            arrayList = fVar.e;
            size = arrayList.size();
            if (size < 0 || size > arrayList.size()) {
                break;
            }
            if (fVar.g != Config.StableIdMode.NO_STABLE_IDS) {
                obr.a("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", adapter.hasStableIds());
            } else {
                adapter.hasStableIds();
            }
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    i = -1;
                    break;
                } else if (((a0) arrayList.get(i)).c == adapter) {
                    break;
                } else {
                    i++;
                }
            }
            if ((i == -1 ? null : (a0) arrayList.get(i)) == null) {
                a0 a0Var = new a0(adapter, fVar, fVar.b, fVar.h.a());
                arrayList.add(size, a0Var);
                Iterator it2 = fVar.c.iterator();
                while (it2.hasNext()) {
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) it2.next()).get();
                    if (recyclerView != null) {
                        adapter.onAttachedToRecyclerView(recyclerView);
                    }
                }
                if (a0Var.e > 0) {
                    fVar.a.notifyItemRangeInserted(fVar.b(a0Var), a0Var.e);
                }
                fVar.a();
            }
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
    }
}
