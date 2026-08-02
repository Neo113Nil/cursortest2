package ru.ozon.fintech.ui.row.lazyrow;

import H30.r;
import H30.z;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.common.MidDecorator;
import ru.ozon.fintech.ui.row.base.FrameRoundRow;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/ui/row/lazyrow/LazyRowView;", "Lru/ozon/fintech/ui/row/base/FrameRoundRow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerPagedAdapter", "Lcom/detmir/recycli/adapters/RecyclerAdapter;", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "state", "Lru/ozon/fintech/ui/row/lazyrow/LazyRowState;", "bindState", "", "savePosition", "onDetachedFromWindow", "getPositionAndOffset", "Lkotlin/Pair;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyRowView extends FrameRoundRow {

    @NotNull
    private LinearLayoutManager llm;

    @NotNull
    private final RecyclerView recycler;

    @NotNull
    private final RecyclerAdapter recyclerPagedAdapter;
    private LazyRowState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyRowView(@NotNull Context context) {
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
        LazyRowState lazyRowState = this.state;
        if (lazyRowState != null && (scrollKeeper2 = lazyRowState.getScrollKeeper()) != null) {
            scrollKeeper2.setPos(Integer.valueOf(intValue));
        }
        LazyRowState lazyRowState2 = this.state;
        if (lazyRowState2 == null || (scrollKeeper = lazyRowState2.getScrollKeeper()) == null) {
            return;
        }
        scrollKeeper.setOffset(Integer.valueOf(intValue2));
    }

    public final void bindState(@NotNull LazyRowState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        RecyclerView.n itemDecorationAt = this.recycler.getItemDecorationAt(0);
        Intrinsics.checkNotNullExpressionValue(itemDecorationAt, "getItemDecorationAt(...)");
        if (!Intrinsics.d(itemDecorationAt, state.toMidDecorator())) {
            this.recycler.removeItemDecorationAt(0);
            this.recycler.addItemDecoration(state.toMidDecorator());
        }
        RecyclerView recyclerView = this.recycler;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getBackColor());
        recyclerView.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        this.recycler.setOutlineProvider(getRounded(state.getRadius()));
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyRowView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LazyRowView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyRowView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.llm = new LinearLayoutManager(context, 0, false);
        View inflate = LayoutInflater.from(context).inflate(R.layout.fin_lazy_row_view, (ViewGroup) this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        this.recyclerPagedAdapter = recyclerAdapter;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.lazy_row_recycler);
        this.recycler = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(this.llm);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.fintech.ui.row.lazyrow.LazyRowView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                if (newState == 0) {
                    LazyRowView.this.savePosition();
                }
            }
        });
        recyclerView.setClipToOutline(true);
        r.a(recyclerView);
        recyclerView.addItemDecoration(new MidDecorator(0, 0, 0, 0, 0, MidDecorator.ORIENTATION.HORIZONTAL));
        LazyRowState lazyRowState = this.state;
        recyclerView.setOutlineProvider(getRounded(lazyRowState != null ? lazyRowState.getRadius() : null));
    }
}
