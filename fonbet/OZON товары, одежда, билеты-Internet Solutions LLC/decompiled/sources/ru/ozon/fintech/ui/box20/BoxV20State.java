package ru.ozon.fintech.ui.box20;

import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/ui/box20/BoxV20State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "widgets", "", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/util/List;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getWidgets", "()Ljava/util/List;", "provideId", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BoxV20State implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;
    private final List<RecyclerItem> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxV20State(@NotNull Common common, List<? extends RecyclerItem> list) {
        Intrinsics.checkNotNullParameter(common, "common");
        this.common = common;
        this.widgets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoxV20State copy$default(BoxV20State boxV20State, Common common, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = boxV20State.common;
        }
        if ((i11 & 2) != 0) {
            list = boxV20State.widgets;
        }
        return boxV20State.copy(common, list);
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

    public final List<RecyclerItem> component2() {
        return this.widgets;
    }

    @NotNull
    public final BoxV20State copy(@NotNull Common common, List<? extends RecyclerItem> widgets) {
        Intrinsics.checkNotNullParameter(common, "common");
        return new BoxV20State(common, widgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxV20State)) {
            return false;
        }
        BoxV20State boxV20State = (BoxV20State) other;
        return Intrinsics.d(this.common, boxV20State.common) && Intrinsics.d(this.widgets, boxV20State.widgets);
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final List<RecyclerItem> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int hashCode = this.common.hashCode() * 31;
        List<RecyclerItem> list = this.widgets;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        return "BoxV20State(common=" + this.common + ", widgets=" + this.widgets + ")";
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
