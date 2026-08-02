package ru.ozon.fintech.ui.lazycolumn;

import G.g;
import Pk0.a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/ui/lazycolumn/LazyColumnState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "widgets", "", "dragEnabled", "", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/util/List;Z)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getWidgets", "()Ljava/util/List;", "getDragEnabled", "()Z", "provideId", "", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LazyColumnState implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;
    private final boolean dragEnabled;

    @NotNull
    private final List<RecyclerItem> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyColumnState(@NotNull Common common, @NotNull List<? extends RecyclerItem> widgets, boolean z11) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.common = common;
        this.widgets = widgets;
        this.dragEnabled = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LazyColumnState copy$default(LazyColumnState lazyColumnState, Common common, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = lazyColumnState.common;
        }
        if ((i11 & 2) != 0) {
            list = lazyColumnState.widgets;
        }
        if ((i11 & 4) != 0) {
            z11 = lazyColumnState.dragEnabled;
        }
        return lazyColumnState.copy(common, list, z11);
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

    @NotNull
    public final List<RecyclerItem> component2() {
        return this.widgets;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDragEnabled() {
        return this.dragEnabled;
    }

    @NotNull
    public final LazyColumnState copy(@NotNull Common common, @NotNull List<? extends RecyclerItem> widgets, boolean dragEnabled) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        return new LazyColumnState(common, widgets, dragEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyColumnState)) {
            return false;
        }
        LazyColumnState lazyColumnState = (LazyColumnState) other;
        return Intrinsics.d(this.common, lazyColumnState.common) && Intrinsics.d(this.widgets, lazyColumnState.widgets) && this.dragEnabled == lazyColumnState.dragEnabled;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final boolean getDragEnabled() {
        return this.dragEnabled;
    }

    @NotNull
    public final List<RecyclerItem> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        return Boolean.hashCode(this.dragEnabled) + g.b(this.common.hashCode() * 31, 31, this.widgets);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        List<RecyclerItem> list = this.widgets;
        boolean z11 = this.dragEnabled;
        StringBuilder sb2 = new StringBuilder("LazyColumnState(common=");
        sb2.append(common);
        sb2.append(", widgets=");
        sb2.append(list);
        sb2.append(", dragEnabled=");
        return a.a(")", sb2, z11);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
