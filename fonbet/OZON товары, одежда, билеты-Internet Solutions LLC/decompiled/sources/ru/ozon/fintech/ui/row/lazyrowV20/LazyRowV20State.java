package ru.ozon.fintech.ui.row.lazyrowV20;

import G.g;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.detmir.recycli.adapters.ScrollKeeper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.common.MidDecorator;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J9\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/fintech/ui/row/lazyrowV20/LazyRowV20State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "scrollKeeper", "Lcom/detmir/recycli/adapters/ScrollKeeper;", "widgets", "", "orientation", "Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Lcom/detmir/recycli/adapters/ScrollKeeper;Ljava/util/List;Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getScrollKeeper", "()Lcom/detmir/recycli/adapters/ScrollKeeper;", "getWidgets", "()Ljava/util/List;", "getOrientation", "()Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "provideId", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LazyRowV20State implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;

    @NotNull
    private final MidDecorator.ORIENTATION orientation;
    private final ScrollKeeper scrollKeeper;

    @NotNull
    private final List<RecyclerItem> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyRowV20State(@NotNull Common common, ScrollKeeper scrollKeeper, @NotNull List<? extends RecyclerItem> widgets, @NotNull MidDecorator.ORIENTATION orientation) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.common = common;
        this.scrollKeeper = scrollKeeper;
        this.widgets = widgets;
        this.orientation = orientation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LazyRowV20State copy$default(LazyRowV20State lazyRowV20State, Common common, ScrollKeeper scrollKeeper, List list, MidDecorator.ORIENTATION orientation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = lazyRowV20State.common;
        }
        if ((i11 & 2) != 0) {
            scrollKeeper = lazyRowV20State.scrollKeeper;
        }
        if ((i11 & 4) != 0) {
            list = lazyRowV20State.widgets;
        }
        if ((i11 & 8) != 0) {
            orientation = lazyRowV20State.orientation;
        }
        return lazyRowV20State.copy(common, scrollKeeper, list, orientation);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final ScrollKeeper getScrollKeeper() {
        return this.scrollKeeper;
    }

    @NotNull
    public final List<RecyclerItem> component3() {
        return this.widgets;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final MidDecorator.ORIENTATION getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final LazyRowV20State copy(@NotNull Common common, ScrollKeeper scrollKeeper, @NotNull List<? extends RecyclerItem> widgets, @NotNull MidDecorator.ORIENTATION orientation) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return new LazyRowV20State(common, scrollKeeper, widgets, orientation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyRowV20State)) {
            return false;
        }
        LazyRowV20State lazyRowV20State = (LazyRowV20State) other;
        return Intrinsics.d(this.common, lazyRowV20State.common) && Intrinsics.d(this.scrollKeeper, lazyRowV20State.scrollKeeper) && Intrinsics.d(this.widgets, lazyRowV20State.widgets) && this.orientation == lazyRowV20State.orientation;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    @NotNull
    public final MidDecorator.ORIENTATION getOrientation() {
        return this.orientation;
    }

    public final ScrollKeeper getScrollKeeper() {
        return this.scrollKeeper;
    }

    @NotNull
    public final List<RecyclerItem> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int hashCode = this.common.hashCode() * 31;
        ScrollKeeper scrollKeeper = this.scrollKeeper;
        return this.orientation.hashCode() + g.b((hashCode + (scrollKeeper == null ? 0 : scrollKeeper.hashCode())) * 31, 31, this.widgets);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        return "LazyRowV20State(common=" + this.common + ", scrollKeeper=" + this.scrollKeeper + ", widgets=" + this.widgets + ", orientation=" + this.orientation + ")";
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ LazyRowV20State(Common common, ScrollKeeper scrollKeeper, List list, MidDecorator.ORIENTATION orientation, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(common, scrollKeeper, list, (i11 & 8) != 0 ? MidDecorator.ORIENTATION.HORIZONTAL : orientation);
    }
}
