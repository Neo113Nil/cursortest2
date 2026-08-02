package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeGroupState;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B{\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b0\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010%J/\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010.JG\u00105\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u00106J!\u00107\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u00103\u001a\u00020\u001dH\u0016¢\u0006\u0004\b7\u0010 J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b8\u00109R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/SwipeItemTouchHelperCallback;", "Landroidx/recyclerview/widget/m$h;", "Lkotlin/Function1;", "", "", "onStartGroupSwipe", "Lkotlin/Function2;", "", "onProcessSwipeMovement", "Lkotlin/Function0;", "onHandleSwipeEnd", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeGroupState;", "getActiveSwipeGroups", "getCurrentlySwipingGroup", "", "isHandlingSwipeEnd", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/holder/SwipeableViewHolder;", "getTargetSwipeableHolder", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/holder/SwipeableViewHolder;", "target", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;Landroidx/recyclerview/widget/RecyclerView$C;)Z", "", "direction", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getSwipeThreshold", "(Landroidx/recyclerview/widget/RecyclerView$C;)F", "defaultValue", "getSwipeEscapeVelocity", "(F)F", "getSwipeVelocityThreshold", "animationType", "animateDx", "animateDy", "", "getAnimationDuration", "(Landroidx/recyclerview/widget/RecyclerView;IFF)J", "getMovementFlags", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)I", "Landroid/graphics/Canvas;", "canvas", "dX", "dY", "actionState", "isCurrentlyActive", "onChildDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;FFIZ)V", "onSelectedChanged", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwipeItemTouchHelperCallback extends m.h {

    @NotNull
    private final Function0<Map<String, SwipeGroupState>> getActiveSwipeGroups;

    @NotNull
    private final Function0<String> getCurrentlySwipingGroup;

    @NotNull
    private final Function0<Boolean> isHandlingSwipeEnd;

    @NotNull
    private final Function0<Unit> onHandleSwipeEnd;

    @NotNull
    private final Function2<String, Float, Unit> onProcessSwipeMovement;

    @NotNull
    private final Function1<String, Unit> onStartGroupSwipe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeItemTouchHelperCallback(@NotNull Function1<? super String, Unit> onStartGroupSwipe, @NotNull Function2<? super String, ? super Float, Unit> onProcessSwipeMovement, @NotNull Function0<Unit> onHandleSwipeEnd, @NotNull Function0<? extends Map<String, SwipeGroupState>> getActiveSwipeGroups, @NotNull Function0<String> getCurrentlySwipingGroup, @NotNull Function0<Boolean> isHandlingSwipeEnd) {
        super(0, 12);
        Intrinsics.checkNotNullParameter(onStartGroupSwipe, "onStartGroupSwipe");
        Intrinsics.checkNotNullParameter(onProcessSwipeMovement, "onProcessSwipeMovement");
        Intrinsics.checkNotNullParameter(onHandleSwipeEnd, "onHandleSwipeEnd");
        Intrinsics.checkNotNullParameter(getActiveSwipeGroups, "getActiveSwipeGroups");
        Intrinsics.checkNotNullParameter(getCurrentlySwipingGroup, "getCurrentlySwipingGroup");
        Intrinsics.checkNotNullParameter(isHandlingSwipeEnd, "isHandlingSwipeEnd");
        this.onStartGroupSwipe = onStartGroupSwipe;
        this.onProcessSwipeMovement = onProcessSwipeMovement;
        this.onHandleSwipeEnd = onHandleSwipeEnd;
        this.getActiveSwipeGroups = getActiveSwipeGroups;
        this.getCurrentlySwipingGroup = getCurrentlySwipingGroup;
        this.isHandlingSwipeEnd = isHandlingSwipeEnd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SwipeableViewHolder getTargetSwipeableHolder(RecyclerView recyclerView, RecyclerView.C viewHolder) {
        if (viewHolder instanceof SwipeableViewHolder) {
            String swipeGroupId = ((SwipeableViewHolder) viewHolder).getSwipeGroupId();
            SwipeableViewHolder swipeableViewHolder = viewHolder;
            if (swipeGroupId == null) {
                swipeableViewHolder = null;
            }
            return swipeableViewHolder;
        }
        if (viewHolder instanceof IslandSeparatorViewHolder) {
            Integer valueOf = Integer.valueOf(((IslandSeparatorViewHolder) viewHolder).getAdapterPosition());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(valueOf.intValue() - 1);
                SwipeableViewHolder swipeableViewHolder2 = findViewHolderForAdapterPosition instanceof SwipeableViewHolder ? (SwipeableViewHolder) findViewHolderForAdapterPosition : null;
                if (swipeableViewHolder2 != null && swipeableViewHolder2.getSwipeGroupId() != null) {
                    return swipeableViewHolder2;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.m.e
    public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.C viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (viewHolder instanceof SwipeableViewHolder) {
            return;
        }
        super.clearView(recyclerView, viewHolder);
    }

    @Override // androidx.recyclerview.widget.m.e
    public long getAnimationDuration(@NotNull RecyclerView recyclerView, int animationType, float animateDx, float animateDy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        return 0L;
    }

    @Override // androidx.recyclerview.widget.m.e
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.C viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (getTargetSwipeableHolder(recyclerView, viewHolder) != null) {
            return m.e.makeMovementFlags(0, 12);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.m.e
    public float getSwipeEscapeVelocity(float defaultValue) {
        return Float.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.m.e
    public float getSwipeThreshold(@NotNull RecyclerView.C viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return 0.99f;
    }

    @Override // androidx.recyclerview.widget.m.e
    public float getSwipeVelocityThreshold(float defaultValue) {
        return Float.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.m.e
    public void onChildDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.C viewHolder, float dX, float dY2, int actionState, boolean isCurrentlyActive) {
        SwipeableViewHolder targetSwipeableHolder;
        String swipeGroupId;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (this.isHandlingSwipeEnd.invoke().booleanValue() || (targetSwipeableHolder = getTargetSwipeableHolder(recyclerView, viewHolder)) == null || (swipeGroupId = targetSwipeableHolder.getSwipeGroupId()) == null) {
            return;
        }
        SwipeGroupState swipeGroupState = this.getActiveSwipeGroups.invoke().get(swipeGroupId);
        if (swipeGroupState == null || !swipeGroupState.getIsAnimating()) {
            if (isCurrentlyActive || Intrinsics.d(this.getCurrentlySwipingGroup.invoke(), swipeGroupId)) {
                if (isCurrentlyActive && !Intrinsics.d(this.getCurrentlySwipingGroup.invoke(), swipeGroupId)) {
                    this.onStartGroupSwipe.invoke(swipeGroupId);
                }
                this.onProcessSwipeMovement.invoke(swipeGroupId, Float.valueOf(dX));
            }
        }
    }

    @Override // androidx.recyclerview.widget.m.e
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.C viewHolder, @NotNull RecyclerView.C target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.m.e
    public void onSelectedChanged(RecyclerView.C viewHolder, int actionState) {
        if (actionState == 0) {
            this.onHandleSwipeEnd.invoke();
        }
        if (actionState != 0) {
            super.onSelectedChanged(viewHolder, actionState);
        }
    }

    @Override // androidx.recyclerview.widget.m.e
    public void onSwiped(@NotNull RecyclerView.C viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
