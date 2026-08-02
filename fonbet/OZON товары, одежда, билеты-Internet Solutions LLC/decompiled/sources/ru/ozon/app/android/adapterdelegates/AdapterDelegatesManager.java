package ru.ozon.app.android.adapterdelegates;

import B90.C2618u;
import Ej.b;
import P4.f;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.a0;
import androidx.collection.b0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public class AdapterDelegatesManager<T> {
    private static final List<Object> PAYLOADS_EMPTY_LIST = Collections.EMPTY_LIST;
    protected a0<AdapterDelegate<T>> delegates = new a0<>();
    protected AdapterDelegate<T> fallbackDelegate;

    public AdapterDelegatesManager<T> addDelegate(@NonNull AdapterDelegate<T> adapterDelegate) {
        int e11 = this.delegates.e();
        do {
            a0<AdapterDelegate<T>> a0Var = this.delegates;
            a0Var.getClass();
            if (b0.c(a0Var, e11) == null) {
                return addDelegate(e11, false, adapterDelegate);
            }
            e11++;
        } while (e11 != 2147483646);
        throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
    }

    public AdapterDelegate<T> getDelegateForViewType(int i11) {
        a0<AdapterDelegate<T>> a0Var = this.delegates;
        AdapterDelegate<T> adapterDelegate = this.fallbackDelegate;
        a0Var.getClass();
        return (AdapterDelegate) b0.d(a0Var, i11, adapterDelegate);
    }

    public int getItemViewType(@NonNull T t2, int i11) {
        if (t2 == null) {
            throw new NullPointerException("Items datasource is null!");
        }
        int e11 = this.delegates.e();
        for (int i12 = 0; i12 < e11; i12++) {
            if (this.delegates.f(i12).isForViewType(t2, i11)) {
                return this.delegates.c(i12);
            }
        }
        if (this.fallbackDelegate != null) {
            return 2147483646;
        }
        throw new NullPointerException(t2 instanceof List ? C2618u.f(i11, "No AdapterDelegate added that matches item=", ((List) t2).get(i11).toString(), " at position=", " in data source") : "No AdapterDelegate added for item at position=" + i11 + ". items=" + t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBindViewHolder(@NonNull T t2, int i11, @NonNull RecyclerView.C c11, List list) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(c11.getItemViewType());
        if (delegateForViewType == 0) {
            StringBuilder f7 = f.f(i11, "No delegate found for item at position = ", " for viewType = ");
            f7.append(c11.getItemViewType());
            throw new NullPointerException(f7.toString());
        }
        if (list == null) {
            list = PAYLOADS_EMPTY_LIST;
        }
        delegateForViewType.onBindViewHolder(t2, i11, c11, list);
    }

    @NonNull
    public RecyclerView.C onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(i11);
        if (delegateForViewType == null) {
            throw new NullPointerException(b.a(i11, "No AdapterDelegate added for ViewType "));
        }
        RecyclerView.C onCreateViewHolder = delegateForViewType.onCreateViewHolder(viewGroup);
        if (onCreateViewHolder != null) {
            return onCreateViewHolder;
        }
        throw new NullPointerException("ViewHolder returned from AdapterDelegate " + delegateForViewType + " for ViewType =" + i11 + " is null!");
    }

    public boolean onFailedToRecycleView(@NonNull RecyclerView.C c11) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(c11.getItemViewType());
        if (delegateForViewType != null) {
            return delegateForViewType.onFailedToRecycleView(c11);
        }
        throw new NullPointerException("No delegate found for " + c11 + " for item at position = " + c11.getAdapterPosition() + " for viewType = " + c11.getItemViewType());
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.C c11) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(c11.getItemViewType());
        if (delegateForViewType != null) {
            delegateForViewType.onViewAttachedToWindow(c11);
            return;
        }
        throw new NullPointerException("No delegate found for " + c11 + " for item at position = " + c11.getAdapterPosition() + " for viewType = " + c11.getItemViewType());
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.C c11) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(c11.getItemViewType());
        if (delegateForViewType != null) {
            delegateForViewType.onViewDetachedFromWindow(c11);
            return;
        }
        throw new NullPointerException("No delegate found for " + c11 + " for item at position = " + c11.getAdapterPosition() + " for viewType = " + c11.getItemViewType());
    }

    public void onViewRecycled(@NonNull RecyclerView.C c11) {
        AdapterDelegate<T> delegateForViewType = getDelegateForViewType(c11.getItemViewType());
        if (delegateForViewType != null) {
            delegateForViewType.onViewRecycled(c11);
            return;
        }
        throw new NullPointerException("No delegate found for " + c11 + " for item at position = " + c11.getAdapterPosition() + " for viewType = " + c11.getItemViewType());
    }

    public AdapterDelegatesManager<T> addDelegate(int i11, @NonNull AdapterDelegate<T> adapterDelegate) {
        return addDelegate(i11, false, adapterDelegate);
    }

    public AdapterDelegatesManager<T> addDelegate(int i11, boolean z11, @NonNull AdapterDelegate<T> adapterDelegate) {
        if (adapterDelegate == null) {
            throw new NullPointerException("AdapterDelegate is null!");
        }
        if (i11 != 2147483646) {
            if (!z11) {
                a0<AdapterDelegate<T>> a0Var = this.delegates;
                a0Var.getClass();
                if (b0.c(a0Var, i11) != null) {
                    StringBuilder f7 = f.f(i11, "An AdapterDelegate is already registered for the viewType = ", ". Already registered AdapterDelegate is ");
                    a0<AdapterDelegate<T>> a0Var2 = this.delegates;
                    a0Var2.getClass();
                    f7.append(b0.c(a0Var2, i11));
                    throw new IllegalArgumentException(f7.toString());
                }
            }
            this.delegates.d(i11, adapterDelegate);
            return this;
        }
        throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
    }
}
