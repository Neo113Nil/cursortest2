package ru.ozon.fintech.ui.lazycolumn;

import C.D;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B9\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/ui/lazycolumn/DragAndDropHelper;", "Landroidx/recyclerview/widget/m;", "Lkotlin/Function2;", "", "", "onDrag", "Lkotlin/Function0;", "onListChangedAction", "Landroidx/recyclerview/widget/m$e;", "callback", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/recyclerview/widget/m$e;)V", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "Landroidx/recyclerview/widget/m$e;", "Companion", "DragCallback", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DragAndDropHelper extends m {
    private static final int CONTAINER_OVERSHOOT = 0;
    private static final float DEFAULT_ITEM_SCALE = 1.0f;
    private static final float DRAGGABLE_ITEM_SCALE = 1.05f;
    private static final long DRAGGABLE_SCALE_ANIM_DURATION = 100;
    private static final long FRAME_DELAY_MS = 8;

    @NotNull
    private final m.e callback;

    @NotNull
    private final Function2<Integer, Integer, Unit> onDrag;

    @NotNull
    private final Function0<Unit> onListChangedAction;
    private static final int EDGE_TRIGGER_PX = D.d(10);
    private static final int MAX_SCROLL_SPEED_PX = D.d(2);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010(\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010'J\u001f\u0010*\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010+JG\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u00101R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/fintech/ui/lazycolumn/DragAndDropHelper$DragCallback;", "Landroidx/recyclerview/widget/m$e;", "Lkotlin/Function2;", "", "", "onDrag", "Lkotlin/Function0;", "onListChangedAction", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "", "scale", "animateScale", "(Landroidx/recyclerview/widget/RecyclerView$C;F)V", "dY", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "limitOvershoot", "(FLandroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)F", "newDY", "handleAutoScroll", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;F)V", "scrollSpeed", "startAutoScroll", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "stopAutoScroll", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "isLongPressDragEnabled", "()Z", "getMovementFlags", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)I", "target", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;Landroidx/recyclerview/widget/RecyclerView$C;)Z", "direction", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "actionState", "onSelectedChanged", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "Landroid/graphics/Canvas;", "c", "dX", "isCurrentlyActive", "onChildDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;FFIZ)V", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Runnable;", "autoScrollRunnable", "Ljava/lang/Runnable;", "startPosition", "I", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class DragCallback extends m.e {
        private Runnable autoScrollRunnable;

        @NotNull
        private final Function2<Integer, Integer, Unit> onDrag;

        @NotNull
        private final Function0<Unit> onListChangedAction;
        private int startPosition;

        /* JADX WARN: Multi-variable type inference failed */
        public DragCallback(@NotNull Function2<? super Integer, ? super Integer, Unit> onDrag, @NotNull Function0<Unit> onListChangedAction) {
            Intrinsics.checkNotNullParameter(onDrag, "onDrag");
            Intrinsics.checkNotNullParameter(onListChangedAction, "onListChangedAction");
            this.onDrag = onDrag;
            this.onListChangedAction = onListChangedAction;
            this.startPosition = -1;
        }

        private final void animateScale(RecyclerView.C viewHolder, float scale) {
            viewHolder.itemView.animate().scaleX(scale).scaleY(scale).setDuration(DragAndDropHelper.DRAGGABLE_SCALE_ANIM_DURATION).start();
        }

        private final void handleAutoScroll(RecyclerView recyclerView, RecyclerView.C viewHolder, float newDY) {
            RecyclerView recyclerView2;
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            Object parent = recyclerView.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    recyclerView2 = null;
                    break;
                } else {
                    if (parent instanceof RecyclerView) {
                        recyclerView2 = (RecyclerView) parent;
                        break;
                    }
                    parent = ((View) parent).getParent();
                }
            }
            if (recyclerView2 == null) {
                return;
            }
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            viewHolder.itemView.getLocationOnScreen(iArr);
            recyclerView2.getLocationOnScreen(iArr2);
            int i11 = iArr[1] + ((int) newDY);
            int height = viewHolder.itemView.getHeight() + i11;
            int i12 = iArr2[1];
            int i13 = i11 - i12;
            int i14 = height - i12;
            int paddingTop = DragAndDropHelper.EDGE_TRIGGER_PX + recyclerView2.getPaddingTop();
            int height2 = (recyclerView2.getHeight() - recyclerView2.getPaddingBottom()) - DragAndDropHelper.EDGE_TRIGGER_PX;
            RecyclerView.g adapter = recyclerView.getAdapter();
            int cardsCount = adapter != null ? adapter.getCardsCount() : 0;
            int adapterPosition = viewHolder.getAdapterPosition();
            boolean z11 = adapterPosition == 0;
            boolean z12 = adapterPosition == cardsCount - 1;
            if (i13 < paddingTop && !z11 && recyclerView2.canScrollVertically(-1)) {
                startAutoScroll(recyclerView2, -DragAndDropHelper.MAX_SCROLL_SPEED_PX);
            } else if (i14 <= height2 || z12 || !recyclerView2.canScrollVertically(1)) {
                stopAutoScroll(recyclerView2);
            } else {
                startAutoScroll(recyclerView2, DragAndDropHelper.MAX_SCROLL_SPEED_PX);
            }
        }

        private final float limitOvershoot(float dY2, RecyclerView recyclerView, RecyclerView.C viewHolder) {
            int d11 = D.d(0);
            float f7 = -d11;
            return ((float) viewHolder.itemView.getTop()) + dY2 < f7 ? f7 - viewHolder.itemView.getTop() : ((float) viewHolder.itemView.getBottom()) + dY2 > ((float) (recyclerView.getHeight() + d11)) ? (recyclerView.getHeight() + d11) - viewHolder.itemView.getBottom() : dY2;
        }

        private final void startAutoScroll(final RecyclerView recyclerView, final int scrollSpeed) {
            stopAutoScroll(recyclerView);
            Runnable runnable = new Runnable() { // from class: ru.ozon.fintech.ui.lazycolumn.DragAndDropHelper$DragCallback$startAutoScroll$1
                @Override // java.lang.Runnable
                public void run() {
                    int i11 = scrollSpeed;
                    if (!(i11 < 0 ? recyclerView.canScrollVertically(-1) : i11 > 0 ? recyclerView.canScrollVertically(1) : false)) {
                        this.stopAutoScroll(recyclerView);
                    } else {
                        recyclerView.scrollBy(0, scrollSpeed);
                        recyclerView.postDelayed(this, 8L);
                    }
                }
            };
            recyclerView.post(runnable);
            this.autoScrollRunnable = runnable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void stopAutoScroll(RecyclerView recyclerView) {
            Runnable runnable = this.autoScrollRunnable;
            if (runnable != null) {
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(runnable);
                }
                this.autoScrollRunnable = null;
            }
        }

        @Override // androidx.recyclerview.widget.m.e
        public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.C viewHolder) {
            RecyclerView recyclerView2;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            super.clearView(recyclerView, viewHolder);
            animateScale(viewHolder, 1.0f);
            int adapterPosition = viewHolder.getAdapterPosition();
            int i11 = this.startPosition;
            if (i11 != -1 && i11 != adapterPosition) {
                this.onListChangedAction.invoke();
            }
            this.startPosition = -1;
            Intrinsics.checkNotNullParameter(recyclerView, "<this>");
            Object parent = recyclerView.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    recyclerView2 = null;
                    break;
                } else {
                    if (parent instanceof RecyclerView) {
                        recyclerView2 = (RecyclerView) parent;
                        break;
                    }
                    parent = ((View) parent).getParent();
                }
            }
            stopAutoScroll(recyclerView2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.C viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            return m.e.makeMovementFlags(3, 0);
        }

        @Override // androidx.recyclerview.widget.m.e
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.m.e
        public void onChildDraw(@NotNull Canvas c11, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.C viewHolder, float dX, float dY2, int actionState, boolean isCurrentlyActive) {
            Intrinsics.checkNotNullParameter(c11, "c");
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            float limitOvershoot = limitOvershoot(dY2, recyclerView, viewHolder);
            if (isCurrentlyActive && actionState == 2) {
                handleAutoScroll(recyclerView, viewHolder, limitOvershoot);
            }
            super.onChildDraw(c11, recyclerView, viewHolder, dX, limitOvershoot, actionState, isCurrentlyActive);
        }

        @Override // androidx.recyclerview.widget.m.e
        public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.C viewHolder, @NotNull RecyclerView.C target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            this.onDrag.invoke(Integer.valueOf(viewHolder.getAdapterPosition()), Integer.valueOf(target.getAdapterPosition()));
            return true;
        }

        @Override // androidx.recyclerview.widget.m.e
        public void onSelectedChanged(RecyclerView.C viewHolder, int actionState) {
            super.onSelectedChanged(viewHolder, actionState);
            if (actionState != 2 || viewHolder == null) {
                return;
            }
            this.startPosition = viewHolder.getAdapterPosition();
            animateScale(viewHolder, DragAndDropHelper.DRAGGABLE_ITEM_SCALE);
        }

        @Override // androidx.recyclerview.widget.m.e
        public void onSwiped(@NotNull RecyclerView.C viewHolder, int direction) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }
    }

    public /* synthetic */ DragAndDropHelper(Function2 function2, Function0 function0, m.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, function0, (i11 & 4) != 0 ? new DragCallback(function2, function0) : eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropHelper(@NotNull Function2<? super Integer, ? super Integer, Unit> onDrag, @NotNull Function0<Unit> onListChangedAction, @NotNull m.e callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        Intrinsics.checkNotNullParameter(onListChangedAction, "onListChangedAction");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onDrag = onDrag;
        this.onListChangedAction = onListChangedAction;
        this.callback = callback;
    }
}
