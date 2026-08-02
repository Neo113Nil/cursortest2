package ru.ozon.app.android.pdp.ui.configurators.common.additionalViewPool;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\r2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR8\u0010\u001d\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\u00070\u001bj\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\u0007`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionalRecycledViewPoolWrapper;", "Landroidx/recyclerview/widget/RecyclerView$u;", "innerViewPool", "Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionalRecycledViewPool;", "additionalViewPool", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$u;Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionalRecycledViewPool;)V", "", "Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/ViewType;", "viewType", "getMaxCount", "(I)I", "max", "", "setMaxRecycledViews", "(II)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "getRecycledView", "(I)Landroidx/recyclerview/widget/RecyclerView$C;", "scrap", "putRecycledView", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "getRecycledViewCount", "clear", "()V", "Landroidx/recyclerview/widget/RecyclerView$u;", "Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionalRecycledViewPool;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "maxCounts", "Ljava/util/HashMap;", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AdditionalRecycledViewPoolWrapper extends RecyclerView.u {

    @NotNull
    private final AdditionalRecycledViewPool additionalViewPool;

    @NotNull
    private final RecyclerView.u innerViewPool;

    @NotNull
    private final HashMap<Integer, Integer> maxCounts;
    public static final int $stable = 8;

    public AdditionalRecycledViewPoolWrapper(@NotNull RecyclerView.u innerViewPool, @NotNull AdditionalRecycledViewPool additionalViewPool) {
        Intrinsics.checkNotNullParameter(innerViewPool, "innerViewPool");
        Intrinsics.checkNotNullParameter(additionalViewPool, "additionalViewPool");
        this.innerViewPool = innerViewPool;
        this.additionalViewPool = additionalViewPool;
        this.maxCounts = new HashMap<>();
    }

    private final int getMaxCount(int viewType) {
        Integer num = this.maxCounts.get(Integer.valueOf(viewType));
        if (num != null) {
            return num.intValue();
        }
        return 5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void clear() {
        this.innerViewPool.clear();
        this.additionalViewPool.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public RecyclerView.C getRecycledView(int viewType) {
        RecyclerView.C recycledView = this.innerViewPool.getRecycledView(viewType);
        return recycledView == null ? this.additionalViewPool.getRecycledView(viewType) : recycledView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public int getRecycledViewCount(int viewType) {
        return this.innerViewPool.getRecycledViewCount(viewType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void putRecycledView(RecyclerView.C scrap) {
        Integer valueOf = scrap != null ? Integer.valueOf(scrap.getItemViewType()) : null;
        Integer valueOf2 = valueOf != null ? Integer.valueOf(getMaxCount(valueOf.intValue())) : null;
        if (valueOf != null) {
            int recycledViewCount = getRecycledViewCount(valueOf.intValue());
            if (valueOf2 != null && recycledViewCount == valueOf2.intValue() && valueOf2.intValue() != 0) {
                this.additionalViewPool.putRecycledView(valueOf.intValue(), scrap);
                return;
            }
        }
        this.innerViewPool.putRecycledView(scrap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void setMaxRecycledViews(int viewType, int max) {
        this.maxCounts.put(Integer.valueOf(viewType), Integer.valueOf(max));
        this.innerViewPool.setMaxRecycledViews(viewType, max);
    }
}
