package ru.ozon.fintech.ui.lazycolumn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerAdapter;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.common.CenterLinearLayoutManager;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/ui/lazycolumn/LazyColumnView;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerPagedAdapter", "Lcom/detmir/recycli/adapters/RecyclerAdapter;", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "state", "Lru/ozon/fintech/ui/lazycolumn/LazyColumnState;", "dragAndDropHelper", "Lru/ozon/fintech/ui/lazycolumn/DragAndDropHelper;", "provideWidgetState", "provideActualWidget", "Landroid/view/View;", "bindState", "", "moveItem", "from", "to", "sendListChangedAction", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyColumnView extends WidgetFrameLayout {

    @NotNull
    private final DragAndDropHelper dragAndDropHelper;

    @NotNull
    private LinearLayoutManager llm;

    @NotNull
    private final RecyclerView recycler;

    @NotNull
    private final RecyclerAdapter recyclerPagedAdapter;
    private LazyColumnState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyColumnView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveItem(int from, int to) {
        LazyColumnState lazyColumnState = this.state;
        List<RecyclerItem> widgets = lazyColumnState != null ? lazyColumnState.getWidgets() : null;
        if (widgets == null || from == to || from < 0) {
            return;
        }
        List<RecyclerItem> list = widgets;
        if (from >= list.size() || to < 0 || to >= list.size()) {
            return;
        }
        ArrayList W02 = C7714v.W0(list);
        W02.add(to, (RecyclerItem) W02.remove(from));
        this.recyclerPagedAdapter.bindState(W02);
        LazyColumnState lazyColumnState2 = this.state;
        this.state = lazyColumnState2 != null ? LazyColumnState.copy$default(lazyColumnState2, null, W02, false, 5, null) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendListChangedAction() {
        Common common;
        ArrayList arrayList;
        List<RecyclerItem> widgets;
        LazyColumnState lazyColumnState = this.state;
        if (lazyColumnState == null || (common = lazyColumnState.getCommon()) == null) {
            return;
        }
        LazyColumnState lazyColumnState2 = this.state;
        if (lazyColumnState2 == null || (widgets = lazyColumnState2.getWidgets()) == null) {
            arrayList = null;
        } else {
            List<RecyclerItem> list = widgets;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((RecyclerItem) it.next()).provideId());
            }
        }
        common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.LIST_CHANGED, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, 2064376, null));
    }

    public final void bindState(@NotNull LazyColumnState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        LazyColumnState lazyColumnState = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, lazyColumnState != null ? lazyColumnState.getCommon() : null);
        Common common2 = state.getCommon();
        LazyColumnState lazyColumnState2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, lazyColumnState2 != null ? lazyColumnState2.getCommon() : null);
        Common common3 = state.getCommon();
        LazyColumnState lazyColumnState3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, lazyColumnState3 != null ? lazyColumnState3.getCommon() : null, null, 4, null);
        if (state.getDragEnabled()) {
            this.dragAndDropHelper.attachToRecyclerView(this.recycler);
        } else {
            this.dragAndDropHelper.attachToRecyclerView(null);
        }
        this.state = state;
        this.recyclerPagedAdapter.bindState(state.getWidgets());
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.recycler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyColumnView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState, reason: from getter */
    public LazyColumnState getState() {
        return this.state;
    }

    public /* synthetic */ LazyColumnView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyColumnView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.llm = new CenterLinearLayoutManager(context, 1, false);
        this.dragAndDropHelper = new DragAndDropHelper(new LazyColumnView$dragAndDropHelper$1(this), new LazyColumnView$dragAndDropHelper$2(this), null, 4, null);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        this.recyclerPagedAdapter = recyclerAdapter;
        RecyclerView recyclerView = new RecyclerView(context);
        this.recycler = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(this.llm);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setClipToOutline(true);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
    }
}
