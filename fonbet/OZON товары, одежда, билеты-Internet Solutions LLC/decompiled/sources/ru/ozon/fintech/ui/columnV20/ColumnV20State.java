package ru.ozon.fintech.ui.columnV20;

import R90.d;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/fintech/ui/columnV20/ColumnV20State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "widgets", "", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/util/List;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getWidgets", "()Ljava/util/List;", "provideId", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ColumnV20State implements RecyclerItem, WidgetState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Common common;
    private final List<RecyclerItem> widgets;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/fintech/ui/columnV20/ColumnV20State$Companion;", "", "<init>", "()V", "create", "Lru/ozon/fintech/ui/columnV20/ColumnV20State;", "cbottomId", "", "widgetId", "widgets", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "paddings", "Landroid/graphics/Rect;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$0(ActionResult2UI it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }

        @NotNull
        public final ColumnV20State create(@NotNull String cbottomId, @NotNull String widgetId, @NotNull List<? extends RecyclerItem> widgets, Rect paddings) {
            Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            Intrinsics.checkNotNullParameter(widgets, "widgets");
            return new ColumnV20State(new Common(cbottomId, widgetId, null, null, null, null, null, new d(1), null, null, null, null, null, null, null, null, paddings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435456, 1, null), widgets);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ColumnV20State(@NotNull Common common, List<? extends RecyclerItem> list) {
        Intrinsics.checkNotNullParameter(common, "common");
        this.common = common;
        this.widgets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColumnV20State copy$default(ColumnV20State columnV20State, Common common, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = columnV20State.common;
        }
        if ((i11 & 2) != 0) {
            list = columnV20State.widgets;
        }
        return columnV20State.copy(common, list);
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
    public final ColumnV20State copy(@NotNull Common common, List<? extends RecyclerItem> widgets) {
        Intrinsics.checkNotNullParameter(common, "common");
        return new ColumnV20State(common, widgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColumnV20State)) {
            return false;
        }
        ColumnV20State columnV20State = (ColumnV20State) other;
        return Intrinsics.d(this.common, columnV20State.common) && Intrinsics.d(this.widgets, columnV20State.widgets);
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
        return "ColumnV20State(common=" + this.common + ", widgets=" + this.widgets + ")";
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
