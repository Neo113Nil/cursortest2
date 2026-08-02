package defpackage;

import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nh3 extends l {
    public final /* synthetic */ int a = 1;
    public Object b;

    public nh3(l[] lVarArr) {
        List<l> asList = Arrays.asList(lVarArr);
        this.b = new r18(this);
        for (l lVar : asList) {
            r18 r18Var = (r18) this.b;
            ArrayList arrayList = (ArrayList) r18Var.e;
            int size = arrayList.size();
            if (size < 0 || size > arrayList.size()) {
                is8.j(". Given:", "Index must be between 0 and ", arrayList.size(), size);
                throw null;
            }
            lVar.hasStableIds();
            int size2 = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size2) {
                    i = -1;
                    break;
                } else if (((a9d) arrayList.get(i)).c == lVar) {
                    break;
                } else {
                    i++;
                }
            }
            if ((i != -1 ? (a9d) arrayList.get(i) : null) == null) {
                a9d a9dVar = new a9d(lVar, r18Var, (hvk) r18Var.b, (ubf) ((e3c) r18Var.g).b);
                arrayList.add(size, a9dVar);
                Iterator it = ((ArrayList) r18Var.c).iterator();
                while (it.hasNext()) {
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
                    if (recyclerView != null) {
                        lVar.onAttachedToRecyclerView(recyclerView);
                    }
                }
                if (a9dVar.e > 0) {
                    ((nh3) r18Var.a).notifyItemRangeInserted(r18Var.d(a9dVar), a9dVar.e);
                }
                r18Var.b();
            }
        }
        ((r18) this.b).getClass();
        super.setHasStableIds(false);
    }

    @Override // androidx.recyclerview.widget.l
    public int findRelativeAdapterPositionIn(l lVar, u uVar, int i) {
        switch (this.a) {
            case 0:
                r18 r18Var = (r18) this.b;
                a9d a9dVar = (a9d) ((IdentityHashMap) r18Var.d).get(uVar);
                if (a9dVar == null) {
                    return -1;
                }
                l lVar2 = a9dVar.c;
                int d = i - r18Var.d(a9dVar);
                int itemCount = lVar2.getItemCount();
                if (d >= 0 && d < itemCount) {
                    return lVar2.findRelativeAdapterPositionIn(lVar, uVar, d);
                }
                StringBuilder s = lnb.s(d, itemCount, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
                s.append(uVar);
                s.append("adapter:");
                s.append(lVar);
                throw new IllegalStateException(s.toString());
            default:
                return super.findRelativeAdapterPositionIn(lVar, uVar, i);
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) ((r18) this.b).e).iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += ((a9d) it.next()).e;
                }
                return i;
            default:
                qfb qfbVar = (qfb) this.b;
                qfbVar.getClass();
                return qfbVar instanceof ofb ? 1 : 0;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public long getItemId(int i) {
        switch (this.a) {
            case 0:
                r18 r18Var = (r18) this.b;
                pp4 e = r18Var.e(i);
                a9d a9dVar = (a9d) e.d;
                a9dVar.c.getItemId(e.c);
                a9dVar.b.getClass();
                e.b = false;
                e.d = null;
                e.c = -1;
                r18Var.f = e;
                return -1L;
            default:
                return super.getItemId(i);
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemViewType(int i) {
        int i2;
        switch (this.a) {
            case 0:
                r18 r18Var = (r18) this.b;
                pp4 e = r18Var.e(i);
                a9d a9dVar = (a9d) e.d;
                int i3 = e.c;
                g7h g7hVar = a9dVar.a;
                int itemViewType = a9dVar.c.getItemViewType(i3);
                SparseIntArray sparseIntArray = (SparseIntArray) g7hVar.b;
                int indexOfKey = sparseIntArray.indexOfKey(itemViewType);
                if (indexOfKey > -1) {
                    i2 = sparseIntArray.valueAt(indexOfKey);
                } else {
                    hvk hvkVar = (hvk) g7hVar.e;
                    a9d a9dVar2 = (a9d) g7hVar.d;
                    int i4 = hvkVar.a;
                    hvkVar.a = i4 + 1;
                    hvkVar.b.put(i4, a9dVar2);
                    sparseIntArray.put(itemViewType, i4);
                    ((SparseIntArray) g7hVar.c).put(i4, itemViewType);
                    i2 = i4;
                }
                e.b = false;
                e.d = null;
                e.c = -1;
                r18Var.f = e;
                return i2;
            default:
                ((qfb) this.b).getClass();
                return 0;
        }
    }

    public void o(wqf wqfVar) {
        super.setStateRestorationPolicy(wqfVar);
    }

    @Override // androidx.recyclerview.widget.l
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                r18 r18Var = (r18) this.b;
                ArrayList arrayList = (ArrayList) r18Var.c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((WeakReference) it.next()).get() == recyclerView) {
                        break;
                    }
                }
                arrayList.add(new WeakReference(recyclerView));
                Iterator it2 = ((ArrayList) r18Var.e).iterator();
                while (it2.hasNext()) {
                    ((a9d) it2.next()).c.onAttachedToRecyclerView(recyclerView);
                }
                break;
            default:
                super.onAttachedToRecyclerView(recyclerView);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        switch (this.a) {
            case 0:
                r18 r18Var = (r18) this.b;
                pp4 e = r18Var.e(i);
                ((IdentityHashMap) r18Var.d).put(uVar, (a9d) e.d);
                a9d a9dVar = (a9d) e.d;
                a9dVar.c.bindViewHolder(uVar, e.c);
                e.b = false;
                e.d = null;
                e.c = -1;
                r18Var.f = e;
                break;
            default:
                uVar.getClass();
                qfb qfbVar = (qfb) this.b;
                ((ash) uVar).getClass();
                qfbVar.getClass();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 0;
        switch (this.a) {
            case 0:
                a9d a9dVar = (a9d) ((hvk) ((r18) this.b).b).b.get(i);
                if (a9dVar == null) {
                    a70.p(ljg.j(i, "Cannot find the wrapper for global view type "));
                    a9dVar = null;
                }
                g7h g7hVar = a9dVar.a;
                SparseIntArray sparseIntArray = (SparseIntArray) g7hVar.c;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    i2 = sparseIntArray.valueAt(indexOfKey);
                } else {
                    zzl.m(lnb.t(i, "requested global type ", " does not belong to the adapter:"), ((a9d) g7hVar.d).c);
                }
                return a9dVar.c.onCreateViewHolder(viewGroup, i2);
            default:
                viewGroup.getClass();
                ((qfb) this.b).getClass();
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewholder_load_state, viewGroup, false);
                inflate.getClass();
                return new ash(inflate);
        }
    }

    @Override // androidx.recyclerview.widget.l
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                r18 r18Var = (r18) this.b;
                ArrayList arrayList = (ArrayList) r18Var.c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        WeakReference weakReference = (WeakReference) arrayList.get(size);
                        if (weakReference.get() == null) {
                            arrayList.remove(size);
                        } else if (weakReference.get() == recyclerView) {
                            arrayList.remove(size);
                        }
                        size--;
                    }
                }
                Iterator it = ((ArrayList) r18Var.e).iterator();
                while (it.hasNext()) {
                    ((a9d) it.next()).c.onDetachedFromRecyclerView(recyclerView);
                }
                break;
            default:
                super.onDetachedFromRecyclerView(recyclerView);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public boolean onFailedToRecycleView(u uVar) {
        switch (this.a) {
            case 0:
                r18 r18Var = (r18) this.b;
                IdentityHashMap identityHashMap = (IdentityHashMap) r18Var.d;
                a9d a9dVar = (a9d) identityHashMap.get(uVar);
                if (a9dVar == null) {
                    zzl.l("Cannot find wrapper for ", uVar, ", seems like it is not bound by this adapter: ", r18Var);
                    return false;
                }
                boolean onFailedToRecycleView = a9dVar.c.onFailedToRecycleView(uVar);
                identityHashMap.remove(uVar);
                return onFailedToRecycleView;
            default:
                return super.onFailedToRecycleView(uVar);
        }
    }

    @Override // androidx.recyclerview.widget.l
    public void onViewAttachedToWindow(u uVar) {
        switch (this.a) {
            case 0:
                ((r18) this.b).m(uVar).c.onViewAttachedToWindow(uVar);
                break;
            default:
                super.onViewAttachedToWindow(uVar);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public void onViewDetachedFromWindow(u uVar) {
        switch (this.a) {
            case 0:
                ((r18) this.b).m(uVar).c.onViewDetachedFromWindow(uVar);
                break;
            default:
                super.onViewDetachedFromWindow(uVar);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public void onViewRecycled(u uVar) {
        switch (this.a) {
            case 0:
                r18 r18Var = (r18) this.b;
                IdentityHashMap identityHashMap = (IdentityHashMap) r18Var.d;
                a9d a9dVar = (a9d) identityHashMap.get(uVar);
                if (a9dVar == null) {
                    zzl.l("Cannot find wrapper for ", uVar, ", seems like it is not bound by this adapter: ", r18Var);
                    break;
                } else {
                    a9dVar.c.onViewRecycled(uVar);
                    identityHashMap.remove(uVar);
                    break;
                }
            default:
                super.onViewRecycled(uVar);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public void setHasStableIds(boolean z) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
            default:
                super.setHasStableIds(z);
                return;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public void setStateRestorationPolicy(wqf wqfVar) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
            default:
                super.setStateRestorationPolicy(wqfVar);
                return;
        }
    }

    public /* synthetic */ nh3() {
    }
}
