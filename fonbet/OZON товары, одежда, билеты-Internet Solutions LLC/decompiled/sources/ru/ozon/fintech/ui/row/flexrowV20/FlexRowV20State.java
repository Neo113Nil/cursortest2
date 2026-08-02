package ru.ozon.fintech.ui.row.flexrowV20;

import Ep.a;
import G.g;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J4\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/ui/row/flexrowV20/FlexRowV20State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "widgets", "", "alignment", "", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/util/List;Ljava/lang/Integer;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getWidgets", "()Ljava/util/List;", "getAlignment", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "provideId", "", "component1", "component2", "component3", "copy", "(Lru/ozon/fintech/ui/utils/Common;Ljava/util/List;Ljava/lang/Integer;)Lru/ozon/fintech/ui/row/flexrowV20/FlexRowV20State;", "equals", "", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FlexRowV20State implements RecyclerItem, WidgetState {
    private final Integer alignment;

    @NotNull
    private final Common common;

    @NotNull
    private final List<RecyclerItem> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public FlexRowV20State(@NotNull Common common, @NotNull List<? extends RecyclerItem> widgets, Integer num) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.common = common;
        this.widgets = widgets;
        this.alignment = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlexRowV20State copy$default(FlexRowV20State flexRowV20State, Common common, List list, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = flexRowV20State.common;
        }
        if ((i11 & 2) != 0) {
            list = flexRowV20State.widgets;
        }
        if ((i11 & 4) != 0) {
            num = flexRowV20State.alignment;
        }
        return flexRowV20State.copy(common, list, num);
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
    public final Integer getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final FlexRowV20State copy(@NotNull Common common, @NotNull List<? extends RecyclerItem> widgets, Integer alignment) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        return new FlexRowV20State(common, widgets, alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlexRowV20State)) {
            return false;
        }
        FlexRowV20State flexRowV20State = (FlexRowV20State) other;
        return Intrinsics.d(this.common, flexRowV20State.common) && Intrinsics.d(this.widgets, flexRowV20State.widgets) && Intrinsics.d(this.alignment, flexRowV20State.alignment);
    }

    public final Integer getAlignment() {
        return this.alignment;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    @NotNull
    public final List<RecyclerItem> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int b11 = g.b(this.common.hashCode() * 31, 31, this.widgets);
        Integer num = this.alignment;
        return b11 + (num == null ? 0 : num.hashCode());
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
        Integer num = this.alignment;
        StringBuilder sb2 = new StringBuilder("FlexRowV20State(common=");
        sb2.append(common);
        sb2.append(", widgets=");
        sb2.append(list);
        sb2.append(", alignment=");
        return a.c(sb2, num, ")");
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
