package ru.ozon.app.android.pdp.ui.configurators.common.additionalViewPool;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0003RD\u0010\u0012\u001a2\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000fj\u0018\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionalRecycledViewPool;", "", "<init>", "()V", "", "Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/ViewType;", "viewType", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "", "putRecycledView", "(ILandroidx/recyclerview/widget/RecyclerView$C;)V", "getRecycledView", "(I)Landroidx/recyclerview/widget/RecyclerView$C;", "clear", "Ljava/util/HashMap;", "Ljava/util/LinkedList;", "Lkotlin/collections/HashMap;", "holder", "Ljava/util/HashMap;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AdditionalRecycledViewPool {

    @NotNull
    private final HashMap<Integer, LinkedList<RecyclerView.C>> holder = new HashMap<>();

    public final void clear() {
        this.holder.clear();
    }

    public final RecyclerView.C getRecycledView(int viewType) {
        LinkedList<RecyclerView.C> linkedList = this.holder.get(Integer.valueOf(viewType));
        if (linkedList != null) {
            return (RecyclerView.C) C7714v.v0(linkedList);
        }
        return null;
    }

    public final void putRecycledView(int viewType, @NotNull RecyclerView.C viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        HashMap<Integer, LinkedList<RecyclerView.C>> hashMap = this.holder;
        Integer valueOf = Integer.valueOf(viewType);
        LinkedList<RecyclerView.C> linkedList = hashMap.get(valueOf);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            hashMap.put(valueOf, linkedList);
        }
        linkedList.addFirst(viewHolder);
    }
}
