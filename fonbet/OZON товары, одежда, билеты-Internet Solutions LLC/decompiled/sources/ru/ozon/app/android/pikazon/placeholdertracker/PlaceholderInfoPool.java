package ru.ozon.app.android.pikazon.placeholdertracker;

import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfoPool;", "", "", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;", "scrapHeap", "", "maxScrap", "<init>", "(Ljava/util/List;I)V", "", "isFull", "()Z", "info", "put", "(Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;)Z", "get", "()Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;", "Ljava/util/List;", "I", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlaceholderInfoPool {
    private final int maxScrap;

    @NotNull
    private final List<PlaceholderInfo> scrapHeap;

    public PlaceholderInfoPool(@NotNull List<PlaceholderInfo> scrapHeap, int i11) {
        Intrinsics.checkNotNullParameter(scrapHeap, "scrapHeap");
        this.scrapHeap = scrapHeap;
        this.maxScrap = i11;
    }

    private final boolean isFull() {
        return this.scrapHeap.size() >= this.maxScrap;
    }

    public final PlaceholderInfo get() {
        return (PlaceholderInfo) C7714v.v0(this.scrapHeap);
    }

    public final boolean put(@NotNull PlaceholderInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (isFull()) {
            return false;
        }
        info.clear();
        return this.scrapHeap.add(info);
    }

    public /* synthetic */ PlaceholderInfoPool(List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? new LinkedList() : list, (i12 & 2) != 0 ? 100 : i11);
    }
}
