package ru.ozon.fintech.ui.row.lazyrowV20;

import H30.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerAdapter;
import com.detmir.recycli.adapters.ScrollKeeper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.common.CenterLinearLayoutManager;
import ru.ozon.fintech.ui.common.MidDecorator;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001a2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/fintech/ui/row/lazyrowV20/LazyRowV20View;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerPagedAdapter", "Lcom/detmir/recycli/adapters/RecyclerAdapter;", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "state", "Lru/ozon/fintech/ui/row/lazyrowV20/LazyRowV20State;", "provideWidgetState", "provideActualWidget", "Landroid/view/View;", "bindState", "", "savePosition", "onDetachedFromWindow", "getPositionAndOffset", "Lkotlin/Pair;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyRowV20View extends WidgetFrameLayout {

    @NotNull
    private LinearLayoutManager llm;

    @NotNull
    private final RecyclerView recycler;

    @NotNull
    private final RecyclerAdapter recyclerPagedAdapter;
    private LazyRowV20State state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyRowV20View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Pair<Integer, Integer> getPositionAndOffset(LinearLayoutManager llm) {
        ViewParent parent;
        int findFirstVisibleItemPosition = llm.findFirstVisibleItemPosition();
        View findViewByPosition = llm.findViewByPosition(findFirstVisibleItemPosition);
        int i11 = 0;
        int x11 = findViewByPosition != null ? (int) findViewByPosition.getX() : 0;
        if (findViewByPosition != null && (parent = findViewByPosition.getParent()) != null && (parent instanceof ViewGroup)) {
            i11 = ((ViewGroup) parent).getPaddingLeft();
        }
        return new Pair<>(Integer.valueOf(findFirstVisibleItemPosition), Integer.valueOf(x11 - i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void savePosition() {
        ScrollKeeper scrollKeeper;
        ScrollKeeper scrollKeeper2;
        Pair<Integer, Integer> positionAndOffset = getPositionAndOffset(this.llm);
        int intValue = positionAndOffset.a().intValue();
        int intValue2 = positionAndOffset.b().intValue();
        LazyRowV20State lazyRowV20State = this.state;
        if (lazyRowV20State != null && (scrollKeeper2 = lazyRowV20State.getScrollKeeper()) != null) {
            scrollKeeper2.setPos(Integer.valueOf(intValue));
        }
        LazyRowV20State lazyRowV20State2 = this.state;
        if (lazyRowV20State2 == null || (scrollKeeper = lazyRowV20State2.getScrollKeeper()) == null) {
            return;
        }
        scrollKeeper.setOffset(Integer.valueOf(intValue2));
    }

    public final void bindState(@NotNull LazyRowV20State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        LazyRowV20State lazyRowV20State = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, lazyRowV20State != null ? lazyRowV20State.getCommon() : null);
        Common common2 = state.getCommon();
        LazyRowV20State lazyRowV20State2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, lazyRowV20State2 != null ? lazyRowV20State2.getCommon() : null);
        Common common3 = state.getCommon();
        LazyRowV20State lazyRowV20State3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, lazyRowV20State3 != null ? lazyRowV20State3.getCommon() : null, null, 4, null);
        this.state = state;
        this.recyclerPagedAdapter.bindState(state.getWidgets());
        ScrollKeeper scrollKeeper = state.getScrollKeeper();
        Integer pos = scrollKeeper != null ? scrollKeeper.getPos() : null;
        ScrollKeeper scrollKeeper2 = state.getScrollKeeper();
        Integer offset = scrollKeeper2 != null ? scrollKeeper2.getOffset() : null;
        this.llm.scrollToPositionWithOffset(pos != null ? pos.intValue() : 0, offset != null ? offset.intValue() : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        savePosition();
        super.onDetachedFromWindow();
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.recycler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyRowV20View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState, reason: from getter */
    public LazyRowV20State getState() {
        return this.state;
    }

    public /* synthetic */ LazyRowV20View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyRowV20View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.llm = new CenterLinearLayoutManager(context, 0, false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        this.recyclerPagedAdapter = recyclerAdapter;
        RecyclerView recyclerView = new RecyclerView(context);
        this.recycler = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        getPaddingFrameLayout().addView(recyclerView);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(this.llm);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.fintech.ui.row.lazyrowV20.LazyRowV20View$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                if (newState == 0) {
                    LazyRowV20View.this.savePosition();
                }
            }
        });
        recyclerView.setClipToOutline(true);
        r.a(recyclerView);
        recyclerView.addItemDecoration(new MidDecorator(0, 0, 0, 0, 0, MidDecorator.ORIENTATION.HORIZONTAL));
    }
}
