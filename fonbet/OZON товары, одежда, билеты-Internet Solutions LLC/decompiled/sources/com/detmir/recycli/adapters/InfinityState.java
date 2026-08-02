package com.detmir.recycli.adapters;

import B0.C2454a;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B5\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u001a\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u001a¨\u0006-"}, d2 = {"Lcom/detmir/recycli/adapters/InfinityState;", "", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "items", "", "page", "", "endReached", "Lcom/detmir/recycli/adapters/InfinityState$a;", "requestState", "<init>", "(Ljava/util/List;IZLcom/detmir/recycli/adapters/InfinityState$a;)V", "toPageLoading", "(Ljava/lang/Integer;)Lcom/detmir/recycli/adapters/InfinityState;", "toPageError", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/detmir/recycli/adapters/InfinityState;", "toIdle", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/detmir/recycli/adapters/InfinityState;", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Z", "component4", "()Lcom/detmir/recycli/adapters/InfinityState$a;", "copy", "(Ljava/util/List;IZLcom/detmir/recycli/adapters/InfinityState$a;)Lcom/detmir/recycli/adapters/InfinityState;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "I", "getPage", "Z", "getEndReached", "Lcom/detmir/recycli/adapters/InfinityState$a;", "getRequestState", "a", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class InfinityState {
    private final boolean endReached;

    @NotNull
    private final List<RecyclerItem> items;
    private final int page;

    @NotNull
    private final a requestState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ERROR;
        public static final a IDLE;
        public static final a LOADING;

        static {
            a aVar = new a("IDLE", 0);
            IDLE = aVar;
            a aVar2 = new a("LOADING", 1);
            LOADING = aVar2;
            a aVar3 = new a("ERROR", 2);
            ERROR = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public InfinityState() {
        this(null, 0, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfinityState copy$default(InfinityState infinityState, List list, int i11, boolean z11, a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = infinityState.items;
        }
        if ((i12 & 2) != 0) {
            i11 = infinityState.page;
        }
        if ((i12 & 4) != 0) {
            z11 = infinityState.endReached;
        }
        if ((i12 & 8) != 0) {
            aVar = infinityState.requestState;
        }
        return infinityState.copy(list, i11, z11, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfinityState toIdle$default(InfinityState infinityState, List list, Boolean bool, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        if ((i11 & 2) != 0) {
            bool = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        return infinityState.toIdle(list, bool, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfinityState toPageError$default(InfinityState infinityState, Integer num, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            list = null;
        }
        return infinityState.toPageError(num, list);
    }

    public static /* synthetic */ InfinityState toPageLoading$default(InfinityState infinityState, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return infinityState.toPageLoading(num);
    }

    @NotNull
    public final List<RecyclerItem> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEndReached() {
        return this.endReached;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final a getRequestState() {
        return this.requestState;
    }

    @NotNull
    public final InfinityState copy(@NotNull List<? extends RecyclerItem> items, int page, boolean endReached, @NotNull a requestState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        return new InfinityState(items, page, endReached, requestState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfinityState)) {
            return false;
        }
        InfinityState infinityState = (InfinityState) other;
        return Intrinsics.d(this.items, infinityState.items) && this.page == infinityState.page && this.endReached == infinityState.endReached && this.requestState == infinityState.requestState;
    }

    public final boolean getEndReached() {
        return this.endReached;
    }

    @NotNull
    public final List<RecyclerItem> getItems() {
        return this.items;
    }

    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final a getRequestState() {
        return this.requestState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a11 = C2454a.a(this.page, this.items.hashCode() * 31, 31);
        boolean z11 = this.endReached;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return this.requestState.hashCode() + ((a11 + i11) * 31);
    }

    @NotNull
    public final InfinityState toIdle(List<? extends RecyclerItem> items, Boolean endReached, Integer page) {
        if (items == null) {
            items = this.items;
        }
        return copy(items, page != null ? page.intValue() : this.page, endReached != null ? endReached.booleanValue() : this.endReached, a.IDLE);
    }

    @NotNull
    public final InfinityState toPageError(Integer page, List<? extends RecyclerItem> items) {
        int intValue = page != null ? page.intValue() : this.page;
        if (items == null) {
            items = this.items;
        }
        return copy$default(this, items, intValue, false, a.ERROR, 4, null);
    }

    @NotNull
    public final InfinityState toPageLoading(Integer page) {
        return copy$default(this, null, page != null ? page.intValue() : this.page, false, a.LOADING, 5, null);
    }

    @NotNull
    public String toString() {
        return "InfinityState(items=" + this.items + ", page=" + this.page + ", endReached=" + this.endReached + ", requestState=" + this.requestState + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfinityState(@NotNull List<? extends RecyclerItem> items, int i11, boolean z11, @NotNull a requestState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        this.items = items;
        this.page = i11;
        this.endReached = z11;
        this.requestState = requestState;
    }

    public InfinityState(List list, int i11, boolean z11, a aVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? K.f71697a : list, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? a.IDLE : aVar);
    }
}
