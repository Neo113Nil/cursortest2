package ru.ozon.fintech.ui.container;

import H30.z;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.detmir.recycli.adapters.InfinityState;
import com.detmir.recycli.adapters.RecyclerAdapter;
import com.detmir.recycli.adapters.ScrollKeeper;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.container.LayoutType;

@Keep
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\rJ\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/fintech/ui/container/RecyclerContainerItemView;", "Landroid/widget/FrameLayout;", "Lcom/detmir/recycli/adapters/RecyclerAdapter$c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "savePosition", "()V", "Lru/ozon/fintech/ui/container/LayoutType;", "layoutType", "Landroidx/recyclerview/widget/RecyclerView$o;", "getLayoutManager", "(Lru/ozon/fintech/ui/container/LayoutType;)Landroidx/recyclerview/widget/RecyclerView$o;", "Lru/ozon/fintech/ui/container/RecyclerContainerItem;", "state", "bindState", "(Lru/ozon/fintech/ui/container/RecyclerContainerItem;)V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "curPage", "loadRange", "(I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/detmir/recycli/adapters/RecyclerAdapter;", "recyclerAdapter", "Lcom/detmir/recycli/adapters/RecyclerAdapter;", "Lru/ozon/fintech/ui/container/RecyclerContainerItem;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "flexlm", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "gridlm", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "staggeredlm", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "snapAttached", "Z", "Lru/ozon/fintech/ui/container/NestedRecyclerHelper;", "nestedRecyclerHelper", "Lru/ozon/fintech/ui/container/NestedRecyclerHelper;", "Landroidx/recyclerview/widget/D;", "snapHelper", "Landroidx/recyclerview/widget/D;", "Lkotlin/Function1;", "rangeCallback", "Lkotlin/jvm/functions/Function1;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecyclerContainerItemView extends FrameLayout implements RecyclerAdapter.c {
    private FlexboxLayoutManager flexlm;
    private GridLayoutManager gridlm;
    private LinearLayoutManager llm;

    @NotNull
    private final NestedRecyclerHelper nestedRecyclerHelper;
    private Function1<? super Integer, Unit> rangeCallback;

    @NotNull
    private final RecyclerView recycler;
    private RecyclerAdapter recyclerAdapter;
    private boolean snapAttached;

    @NotNull
    private final D snapHelper;
    private StaggeredGridLayoutManager staggeredlm;
    private RecyclerContainerItem state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecyclerContainerItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RecyclerView.o getLayoutManager(LayoutType layoutType) {
        if (layoutType == null) {
            return null;
        }
        if (layoutType.equals(LayoutType.Linear.INSTANCE)) {
            return this.llm;
        }
        if (layoutType.equals(LayoutType.Flex.INSTANCE)) {
            return this.flexlm;
        }
        if (layoutType instanceof LayoutType.Grid) {
            return this.gridlm;
        }
        if (layoutType instanceof LayoutType.Staggered) {
            return this.staggeredlm;
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void savePosition() {
        Integer num;
        RecyclerContainerItem recyclerContainerItem;
        RecyclerContainerItem recyclerContainerItem2;
        ScrollKeeper scrollKeeper;
        ScrollKeeper scrollKeeper2;
        ViewParent parent;
        RecyclerView.o layoutManager;
        LayoutType layoutType;
        RecyclerContainerItem recyclerContainerItem3 = this.state;
        int i11 = 0;
        View view = null;
        if (recyclerContainerItem3 != null && (layoutType = recyclerContainerItem3.getLayoutType()) != null) {
            if (layoutType.equals(LayoutType.Linear.INSTANCE)) {
                LinearLayoutManager linearLayoutManager = this.llm;
                if (linearLayoutManager != null) {
                    num = Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition());
                }
            } else if (layoutType.equals(LayoutType.Flex.INSTANCE)) {
                FlexboxLayoutManager flexboxLayoutManager = this.flexlm;
                if (flexboxLayoutManager != null) {
                    num = Integer.valueOf(flexboxLayoutManager.findFirstVisibleItemPosition());
                }
            } else if (layoutType instanceof LayoutType.Grid) {
                GridLayoutManager gridLayoutManager = this.gridlm;
                if (gridLayoutManager != null) {
                    num = Integer.valueOf(gridLayoutManager.findFirstVisibleItemPosition());
                }
            } else {
                if (!(layoutType instanceof LayoutType.Staggered)) {
                    throw new o();
                }
                num = 0;
            }
            if (num != null) {
                RecyclerContainerItem recyclerContainerItem4 = this.state;
                RecyclerView.o layoutManager2 = getLayoutManager(recyclerContainerItem4 != null ? recyclerContainerItem4.getLayoutType() : null);
                if (layoutManager2 != null) {
                    view = layoutManager2.findViewByPosition(num.intValue());
                }
            }
            int decoratedLeft = (view != null || (layoutManager = this.recycler.getLayoutManager()) == null) ? 0 : layoutManager.getDecoratedLeft(view);
            if (view != null && (parent = view.getParent()) != null && (parent instanceof ViewGroup)) {
                i11 = ((ViewGroup) parent).getPaddingLeft();
            }
            int i12 = decoratedLeft - i11;
            recyclerContainerItem = this.state;
            if (recyclerContainerItem != null && (scrollKeeper2 = recyclerContainerItem.getScrollKeeper()) != null) {
                scrollKeeper2.setPos(num);
            }
            recyclerContainerItem2 = this.state;
            if (recyclerContainerItem2 != null || (scrollKeeper = recyclerContainerItem2.getScrollKeeper()) == null) {
            }
            scrollKeeper.setOffset(Integer.valueOf(i12));
            return;
        }
        num = null;
        if (num != null) {
        }
        if (view != null) {
        }
        if (view != null) {
            i11 = ((ViewGroup) parent).getPaddingLeft();
        }
        int i122 = decoratedLeft - i11;
        recyclerContainerItem = this.state;
        if (recyclerContainerItem != null) {
            scrollKeeper2.setPos(num);
        }
        recyclerContainerItem2 = this.state;
        if (recyclerContainerItem2 != null) {
        }
    }

    public final void bindState(@NotNull RecyclerContainerItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Function0<Unit> onView = state.getOnView();
        if (onView != null) {
            onView.invoke();
        }
        if (this.recycler.getAdapter() == null) {
            RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
            this.recyclerAdapter = recyclerAdapter;
            recyclerAdapter.setInfinityCallbacks(this);
            RecyclerView recyclerView = this.recycler;
            RecyclerAdapter recyclerAdapter2 = this.recyclerAdapter;
            if (recyclerAdapter2 == null) {
                Intrinsics.n("recyclerAdapter");
                throw null;
            }
            recyclerView.setAdapter(recyclerAdapter2);
        }
        this.state = state;
        if (state.getOutOfParentBounds() != null) {
            this.recycler.setLayoutParams(new FrameLayout.LayoutParams(state.getOutOfParentBounds().getWidth(), -2));
        }
        if (state.getAllowSnap()) {
            if (!this.snapAttached) {
                this.snapAttached = true;
                this.snapHelper.attachToRecyclerView(this.recycler);
            }
        } else if (this.snapAttached) {
            this.snapAttached = false;
            this.snapHelper.attachToRecyclerView(null);
        }
        LayoutType layoutType = state.getLayoutType();
        if (Intrinsics.d(layoutType, LayoutType.Linear.INSTANCE)) {
            if (this.llm == null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
                this.llm = linearLayoutManager;
                this.recycler.setLayoutManager(linearLayoutManager);
            }
        } else if (Intrinsics.d(layoutType, LayoutType.Flex.INSTANCE)) {
            if (this.flexlm == null) {
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0, 1);
                this.flexlm = flexboxLayoutManager;
                this.recycler.setLayoutManager(flexboxLayoutManager);
            }
        } else if (layoutType instanceof LayoutType.Grid) {
            if (this.gridlm == null) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), ((LayoutType.Grid) state.getLayoutType()).getSpansCount(), 0);
                this.gridlm = gridLayoutManager;
                this.recycler.setLayoutManager(gridLayoutManager);
            }
        } else {
            if (!(layoutType instanceof LayoutType.Staggered)) {
                throw new o();
            }
            if (this.staggeredlm == null) {
                this.snapHelper.attachToRecyclerView(null);
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(((LayoutType.Staggered) state.getLayoutType()).getSpansCount(), 0);
                this.staggeredlm = staggeredGridLayoutManager;
                this.recycler.setLayoutManager(staggeredGridLayoutManager);
            }
        }
        z.a(this.recycler, state.getDmPadding());
        Integer backgroundColor = state.getBackgroundColor();
        if (backgroundColor != null) {
            this.recycler.setBackgroundColor(backgroundColor.intValue());
        } else {
            this.recycler.setBackground(null);
        }
        RecyclerAdapter recyclerAdapter3 = this.recyclerAdapter;
        if (recyclerAdapter3 == null) {
            Intrinsics.n("recyclerAdapter");
            throw null;
        }
        AttachItemViewToWindowCallback attachItemViewToWindowCallback = state.getAttachItemViewToWindowCallback();
        recyclerAdapter3.setAttachListeners(attachItemViewToWindowCallback != null ? AttachItemViewToWindowCallbackKt.getAttachListeners(attachItemViewToWindowCallback, state.getRecyclerState()) : null);
        int itemDecorationCount = this.recycler.getItemDecorationCount();
        while (itemDecorationCount > 0) {
            itemDecorationCount--;
            this.recycler.removeItemDecorationAt(itemDecorationCount);
        }
        List<RecyclerView.n> recyclerItemDecorations = state.getRecyclerItemDecorations();
        RecyclerView recyclerView2 = this.recycler;
        Iterator<T> it = recyclerItemDecorations.iterator();
        while (it.hasNext()) {
            recyclerView2.addItemDecoration((RecyclerView.n) it.next());
        }
        if (state.getRecyclerState() != null) {
            RecyclerAdapter recyclerAdapter4 = this.recyclerAdapter;
            if (recyclerAdapter4 == null) {
                Intrinsics.n("recyclerAdapter");
                throw null;
            }
            recyclerAdapter4.bindState(new InfinityState(state.getRecyclerState(), 0, true, null, 8, null));
        } else if (state.getInfinityRecyclerState() != null) {
            RecyclerAdapter recyclerAdapter5 = this.recyclerAdapter;
            if (recyclerAdapter5 == null) {
                Intrinsics.n("recyclerAdapter");
                throw null;
            }
            recyclerAdapter5.bindState(state.getInfinityRecyclerState());
            this.rangeCallback = state.getRangeCallback();
        }
        Integer pos = state.getScrollKeeper().getPos();
        Integer offset = state.getScrollKeeper().getOffset();
        RecyclerView.g adapter = this.recycler.getAdapter();
        int shimmersCount = adapter != null ? adapter.getShimmersCount() : 0;
        if (pos != null && offset != null && pos.intValue() < shimmersCount) {
            LayoutType layoutType2 = state.getLayoutType();
            if (Intrinsics.d(layoutType2, LayoutType.Linear.INSTANCE)) {
                LinearLayoutManager linearLayoutManager2 = this.llm;
                if (linearLayoutManager2 != null) {
                    linearLayoutManager2.scrollToPositionWithOffset(pos.intValue(), offset.intValue());
                }
            } else if (Intrinsics.d(layoutType2, LayoutType.Flex.INSTANCE)) {
                FlexboxLayoutManager flexboxLayoutManager2 = this.flexlm;
                if (flexboxLayoutManager2 != null) {
                    flexboxLayoutManager2.scrollToPosition(pos.intValue());
                }
            } else if (layoutType2 instanceof LayoutType.Grid) {
                GridLayoutManager gridLayoutManager2 = this.gridlm;
                if (gridLayoutManager2 != null) {
                    gridLayoutManager2.scrollToPositionWithOffset(pos.intValue(), offset.intValue());
                }
            } else if (!(layoutType2 instanceof LayoutType.Staggered)) {
                throw new o();
            }
        }
        if (state.getAnimateItems()) {
            return;
        }
        this.recycler.setItemAnimator(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        this.nestedRecyclerHelper.onDispatchTouchEvent(ev);
        return super.dispatchTouchEvent(ev);
    }

    @Override // com.detmir.recycli.adapters.RecyclerAdapter.c
    public void loadRange(int curPage) {
        Function1<? super Integer, Unit> function1 = this.rangeCallback;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(curPage));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        savePosition();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecyclerContainerItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RecyclerContainerItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerContainerItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.recycler_conteiner_view, (ViewGroup) this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_container_recycler);
        this.recycler = recyclerView;
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        C c11 = itemAnimator instanceof C ? (C) itemAnimator : null;
        if (c11 != null) {
            c11.setSupportsChangeAnimations(false);
        }
        this.nestedRecyclerHelper = new NestedRecyclerHelper(recyclerView, 0.0f, 2, null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.fintech.ui.container.RecyclerContainerItemView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrollStateChanged(recyclerView2, newState);
                if (newState == 0) {
                    RecyclerContainerItemView.this.savePosition();
                }
            }
        });
        this.snapHelper = new RecyclerStoresSnapHelper();
    }
}
