package ru.ozon.app.android.travel.utils.coroutineAdapter;

import A0.h;
import Lm0.a;
import android.annotation.SuppressLint;
import androidx.recyclerview.widget.i;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.ListDelegationAdapter;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ5\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/utils/coroutineAdapter/CoroutineListDifferAdapter;", "", "T", "Lru/ozon/app/android/adapterdelegates/ListDelegationAdapter;", "", "Landroidx/recyclerview/widget/i$d;", "diffItemCallback", "<init>", "(Landroidx/recyclerview/widget/i$d;)V", "oldList", "newList", "Landroidx/recyclerview/widget/i$c;", "calculateListDiff", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "updateData", "(Ljava/util/List;)V", "diffResult", "updateUi", "(Landroidx/recyclerview/widget/i$c;)V", "Lxe/M;", "scope", "Lkotlin/Function0;", "postAction", "submitList", "(Lxe/M;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "", "position", "getItem", "(I)Ljava/lang/Object;", "getItemOrNull", "Lkotlin/Function1;", "update", "payload", "updateItem", "(ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "removeAt", "(I)V", "item", ProductAction.ACTION_ADD, "(ILjava/lang/Object;)V", "Landroidx/recyclerview/widget/i$d;", "", "list", "Ljava/util/List;", "Lxe/B0;", "diffUtilJob", "Lxe/B0;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CoroutineListDifferAdapter<T> extends ListDelegationAdapter<List<? extends T>> {

    @NotNull
    private final i.d<T> diffItemCallback;
    private B0 diffUtilJob;

    @NotNull
    private final List<T> list;

    public CoroutineListDifferAdapter(@NotNull i.d<T> diffItemCallback) {
        Intrinsics.checkNotNullParameter(diffItemCallback, "diffItemCallback");
        this.diffItemCallback = diffItemCallback;
        this.list = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object calculateListDiff(List<? extends T> list, List<? extends T> list2, d<? super i.c> dVar) {
        return C10727i.f(C10720e0.a(), new CoroutineListDifferAdapter$calculateListDiff$2(list, list2, this, null), dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(CoroutineListDifferAdapter coroutineListDifferAdapter, M m11, List list, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        coroutineListDifferAdapter.submitList(m11, list, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateData(List<? extends T> newList) {
        List<T> list = this.list;
        list.clear();
        list.addAll(newList);
        this.items = this.list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateUi(i.c diffResult) {
        if (diffResult != null) {
            diffResult.c(this);
        } else {
            notifyDataSetChanged();
        }
    }

    public final void add(int position, @NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.list.add(position, item);
        notifyItemInserted(position);
    }

    @NotNull
    public final T getItem(int position) {
        return this.list.get(position);
    }

    public final T getItemOrNull(int position) {
        return (T) C7714v.Q(position, this.list);
    }

    public final void removeAt(int position) {
        this.list.remove(position);
        notifyItemRemoved(position);
    }

    public final void submitList(@NotNull M scope, @NotNull List<? extends T> newList, Function0<Unit> postAction) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(newList, "newList");
        if (newList == this.list) {
            if (postAction != null) {
                postAction.invoke();
            }
        } else {
            B0 b02 = this.diffUtilJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.diffUtilJob = C10727i.c(scope, null, null, new CoroutineListDifferAdapter$submitList$1(this, newList, postAction, null), 3);
        }
    }

    public final void updateItem(int position, @NotNull Function1<? super T, ? extends T> update, Object payload) {
        Intrinsics.checkNotNullParameter(update, "update");
        h hVar = (Object) C7714v.Q(position, this.list);
        if (hVar == null) {
            a.f17149a.w(new IndexOutOfBoundsException("IndexOutOfBoundsException in function updateItem CoroutineListDifferAdapter"), "IndexOutOfBoundsException in function updateItem CoroutineListDifferAdapter", new Object[0]);
        } else {
            this.list.set(position, update.invoke(hVar));
            notifyItemChanged(position, payload);
        }
    }
}
