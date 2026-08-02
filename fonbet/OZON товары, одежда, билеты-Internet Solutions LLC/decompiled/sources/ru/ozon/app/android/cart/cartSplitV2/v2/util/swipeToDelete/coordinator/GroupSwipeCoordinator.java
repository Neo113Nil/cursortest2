package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator;

import FN.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeGroupState;

@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001X\b\u0007\u0018\u0000 [2\u00020\u0001:\u0001[B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u0006*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0003J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010\"J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010+J5\u00100\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u001e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020#H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00106\u001a\u00020#H\u0002¢\u0006\u0004\b7\u0010&J5\u0010:\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010/\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0002¢\u0006\u0004\b:\u0010;J-\u0010<\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010/\u001a\u00020#2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000608H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b>\u0010\"J\u000f\u0010?\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0014H\u0002¢\u0006\u0004\bA\u0010\"R4\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010B2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010B8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010FR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR&\u0010K\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0J0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020P0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010IR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttach", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetach", "onDestroy", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/holder/SwipeableViewHolder;", "viewHolder", "registerViewHolder", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/holder/SwipeableViewHolder;)V", "unregisterViewHolder", "", "animate", "openFirstGroup", "(Z)V", "", "groupId", "openGroup", "(Ljava/lang/String;Z)V", "closeFirstGroup", "closeGroup", "closeAllGroups", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/SwipeItemTouchHelperCallback;", "createTouchHelperCallback", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/SwipeItemTouchHelperCallback;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeGroupState;", "syncCurrentStateFromVH", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeGroupState;)V", "startGroupSwipe", "(Ljava/lang/String;)V", "", "dX", "processSwipeMovement", "(Ljava/lang/String;F)V", "handleSwipeEnd", "finishGroupSwipe", "state", "calculateShouldOpen", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeGroupState;)Z", "", "holders", "shouldOpen", "targetOffset", "finalizeSwipeState", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeGroupState;Ljava/util/Set;ZF)V", "getOrCreateGroupState", "(Ljava/lang/String;)Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeGroupState;", "getGroupMaxSwipeDistance", "(Ljava/lang/String;)F", "offset", "updateGroupOffset", "Lkotlin/Function0;", "onComplete", "animateToOffset", "(Ljava/lang/String;FZLkotlin/jvm/functions/Function0;)V", "animateGroupToOffset", "(Ljava/lang/String;FLkotlin/jvm/functions/Function0;)V", "cancelAnimation", "cancelAllAnimations", "exceptGroupId", "closeAllGroupsExcept", "Ljava/lang/ref/WeakReference;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/ref/WeakReference;", "getRecyclerView", "()Ljava/lang/ref/WeakReference;", "", "activeSwipeGroups", "Ljava/util/Map;", "", "viewHolderGroups", "currentlySwipingGroup", "Ljava/lang/String;", "isHandlingSwipeEnd", "Z", "Landroid/animation/ValueAnimator;", "activeAnimators", "Ljava/lang/Runnable;", "pendingSwipeEndRunnable", "Ljava/lang/Runnable;", "Landroidx/recyclerview/widget/m;", "itemTouchHelper", "Landroidx/recyclerview/widget/m;", "ru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator$scrollListener$1", "scrollListener", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator$scrollListener$1;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GroupSwipeCoordinator {
    private String currentlySwipingGroup;
    private boolean isHandlingSwipeEnd;
    private Runnable pendingSwipeEndRunnable;
    private WeakReference<RecyclerView> recyclerView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final Map<String, SwipeGroupState> activeSwipeGroups = new LinkedHashMap();

    @NotNull
    private final Map<String, Set<SwipeableViewHolder>> viewHolderGroups = new LinkedHashMap();

    @NotNull
    private final Map<String, ValueAnimator> activeAnimators = new LinkedHashMap();

    @NotNull
    private final m itemTouchHelper = new m(createTouchHelperCallback());

    @NotNull
    private final GroupSwipeCoordinator$scrollListener$1 scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator$scrollListener$1
        private boolean isScrolling;

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (newState == 0) {
                this.isScrolling = false;
            } else if (newState == 1 && !this.isScrolling) {
                this.isScrolling = true;
                GroupSwipeCoordinator.this.closeAllGroups(true);
            }
        }
    };

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator$Companion;", "", "<init>", "()V", "OPEN_THRESHOLD_RATIO", "", "CLOSE_THRESHOLD_RATIO", "ANIMATION_DURATION_MS", "", "INTERPOLATOR_FACTOR", "MIN_OFFSET_CHANGE", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void animateGroupToOffset(final String groupId, float targetOffset, final Function0<Unit> onComplete) {
        Set<SwipeableViewHolder> set;
        int i11 = 1;
        SwipeGroupState swipeGroupState = this.activeSwipeGroups.get(groupId);
        if (swipeGroupState == null || (set = this.viewHolderGroups.get(groupId)) == null) {
            return;
        }
        cancelAnimation(groupId);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(swipeGroupState.getSwipeOffset(), targetOffset);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.2f));
        ofFloat.addUpdateListener(new b(i11, swipeGroupState, set));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator$animateGroupToOffset$animator$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Map map;
                Intrinsics.checkNotNullParameter(animation, "animation");
                map = GroupSwipeCoordinator.this.activeAnimators;
                map.remove(groupId);
                onComplete.invoke();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Map map;
                Intrinsics.checkNotNullParameter(animation, "animation");
                map = GroupSwipeCoordinator.this.activeAnimators;
                map.remove(groupId);
                onComplete.invoke();
            }
        });
        this.activeAnimators.put(groupId, ofFloat);
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateGroupToOffset$lambda$17$lambda$16(SwipeGroupState swipeGroupState, Set set, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (!swipeGroupState.getIsAnimating()) {
            animation.cancel();
            return;
        }
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        swipeGroupState.setSwipeOffset(floatValue);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((SwipeableViewHolder) it.next()).updateSwipeOffset(floatValue, false);
        }
    }

    private final void animateToOffset(String groupId, float targetOffset, boolean animate, Function0<Unit> onComplete) {
        SwipeGroupState swipeGroupState = this.activeSwipeGroups.get(groupId);
        if (swipeGroupState == null) {
            return;
        }
        if (animate && !swipeGroupState.getIsAnimating()) {
            swipeGroupState.setAnimating(true);
            animateGroupToOffset(groupId, targetOffset, new GroupSwipeCoordinator$animateToOffset$1(swipeGroupState, onComplete));
        } else {
            swipeGroupState.setSwipeOffset(targetOffset);
            updateGroupOffset(groupId, targetOffset);
            onComplete.invoke();
        }
    }

    private final boolean calculateShouldOpen(SwipeGroupState state) {
        float abs = Math.abs(state.getSwipeOffset());
        return (state.getIsOpen() || state.getReachedOpenDuringSwipe()) ? abs >= state.getMaxSwipeDistance() * 0.9f : abs >= state.getMaxSwipeDistance() * 0.1f && state.getSwipeOffset() < 0.0f;
    }

    private final void cancelAllAnimations() {
        Iterator<T> it = this.activeAnimators.values().iterator();
        while (it.hasNext()) {
            ((ValueAnimator) it.next()).cancel();
        }
        this.activeAnimators.clear();
    }

    private final void cancelAnimation(String groupId) {
        ValueAnimator remove = this.activeAnimators.remove(groupId);
        if (remove != null) {
            remove.cancel();
        }
    }

    private final void closeAllGroupsExcept(String exceptGroupId) {
        Set<String> keySet = this.activeSwipeGroups.keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!Intrinsics.d((String) obj, exceptGroupId)) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            SwipeGroupState swipeGroupState = this.activeSwipeGroups.get(str);
            if (swipeGroupState != null && swipeGroupState.getIsOpen()) {
                closeGroup(str, true);
            }
        }
    }

    public static /* synthetic */ void closeFirstGroup$default(GroupSwipeCoordinator groupSwipeCoordinator, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        groupSwipeCoordinator.closeFirstGroup(z11);
    }

    private final SwipeItemTouchHelperCallback createTouchHelperCallback() {
        return new SwipeItemTouchHelperCallback(new GroupSwipeCoordinator$createTouchHelperCallback$1(this), new GroupSwipeCoordinator$createTouchHelperCallback$2(this), new GroupSwipeCoordinator$createTouchHelperCallback$3(this), new GroupSwipeCoordinator$createTouchHelperCallback$4(this), new GroupSwipeCoordinator$createTouchHelperCallback$5(this), new GroupSwipeCoordinator$createTouchHelperCallback$6(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finalizeSwipeState(SwipeGroupState state, Set<? extends SwipeableViewHolder> holders, boolean shouldOpen, float targetOffset) {
        state.setAnimating(false);
        state.setOpen(shouldOpen);
        state.setSwipeOffset(targetOffset);
        Iterator<T> it = holders.iterator();
        while (it.hasNext()) {
            ((SwipeableViewHolder) it.next()).onSwipeStateChanged(shouldOpen);
        }
    }

    private final void finishGroupSwipe(String groupId) {
        Set<SwipeableViewHolder> set;
        SwipeGroupState swipeGroupState = this.activeSwipeGroups.get(groupId);
        if (swipeGroupState == null || (set = this.viewHolderGroups.get(groupId)) == null || set.isEmpty()) {
            return;
        }
        swipeGroupState.setAnimating(true);
        boolean calculateShouldOpen = calculateShouldOpen(swipeGroupState);
        float f7 = calculateShouldOpen ? -swipeGroupState.getMaxSwipeDistance() : 0.0f;
        if (Math.abs(swipeGroupState.getSwipeOffset() - f7) < 2.0f) {
            finalizeSwipeState(swipeGroupState, set, calculateShouldOpen, f7);
        } else {
            animateGroupToOffset(groupId, f7, new GroupSwipeCoordinator$finishGroupSwipe$1(this, swipeGroupState, set, calculateShouldOpen, f7));
        }
    }

    private final float getGroupMaxSwipeDistance(String groupId) {
        Float valueOf;
        Set<SwipeableViewHolder> set = this.viewHolderGroups.get(groupId);
        if (set == null) {
            return 0.0f;
        }
        Iterator<T> it = set.iterator();
        if (it.hasNext()) {
            float maxSwipeDistance = ((SwipeableViewHolder) it.next()).getMaxSwipeDistance();
            while (it.hasNext()) {
                maxSwipeDistance = Math.max(maxSwipeDistance, ((SwipeableViewHolder) it.next()).getMaxSwipeDistance());
            }
            valueOf = Float.valueOf(maxSwipeDistance);
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return 0.0f;
    }

    private final SwipeGroupState getOrCreateGroupState(String groupId) {
        String str;
        Map<String, SwipeGroupState> map = this.activeSwipeGroups;
        SwipeGroupState swipeGroupState = map.get(groupId);
        if (swipeGroupState == null) {
            str = groupId;
            SwipeGroupState swipeGroupState2 = new SwipeGroupState(str, 0.0f, false, false, getGroupMaxSwipeDistance(groupId), false, 46, null);
            map.put(str, swipeGroupState2);
            swipeGroupState = swipeGroupState2;
        } else {
            str = groupId;
        }
        SwipeGroupState swipeGroupState3 = swipeGroupState;
        swipeGroupState3.setMaxSwipeDistance(getGroupMaxSwipeDistance(str));
        return swipeGroupState3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSwipeEnd() {
        RecyclerView recyclerView;
        WeakReference<RecyclerView> weakReference;
        RecyclerView recyclerView2;
        if (this.isHandlingSwipeEnd) {
            return;
        }
        this.isHandlingSwipeEnd = true;
        String str = this.currentlySwipingGroup;
        if (str != null) {
            finishGroupSwipe(str);
            this.currentlySwipingGroup = null;
        }
        Runnable runnable = this.pendingSwipeEndRunnable;
        if (runnable != null && (weakReference = this.recyclerView) != null && (recyclerView2 = weakReference.get()) != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        this.pendingSwipeEndRunnable = new KD.b(this, 3);
        WeakReference<RecyclerView> weakReference2 = this.recyclerView;
        if (weakReference2 == null || (recyclerView = weakReference2.get()) == null) {
            return;
        }
        recyclerView.post(this.pendingSwipeEndRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSwipeEnd$lambda$9(GroupSwipeCoordinator groupSwipeCoordinator) {
        groupSwipeCoordinator.isHandlingSwipeEnd = false;
        groupSwipeCoordinator.pendingSwipeEndRunnable = null;
    }

    public static /* synthetic */ void openFirstGroup$default(GroupSwipeCoordinator groupSwipeCoordinator, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        groupSwipeCoordinator.openFirstGroup(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processSwipeMovement(String groupId, float dX) {
        SwipeGroupState swipeGroupState = this.activeSwipeGroups.get(groupId);
        if (swipeGroupState == null) {
            return;
        }
        float maxSwipeDistance = swipeGroupState.getMaxSwipeDistance();
        if (maxSwipeDistance <= 0.0f) {
            return;
        }
        if (swipeGroupState.getIsOpen() && dX >= 0.0f) {
            dX = dX < 10.0f ? swipeGroupState.getSwipeOffset() : dX + (-maxSwipeDistance);
        } else if (swipeGroupState.getIsOpen() && dX < 0.0f) {
            float swipeOffset = swipeGroupState.getSwipeOffset() + dX;
            dX = -maxSwipeDistance;
            if (swipeOffset >= dX) {
                dX = swipeOffset;
            }
        }
        float d11 = h.d(dX, -maxSwipeDistance, 0.0f);
        if (Math.abs(d11 - swipeGroupState.getSwipeOffset()) > 0.5f) {
            updateGroupOffset(groupId, d11);
        }
        if (Math.abs(d11) >= maxSwipeDistance * 0.9f) {
            swipeGroupState.setReachedOpenDuringSwipe(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGroupSwipe(String groupId) {
        SwipeGroupState swipeGroupState = this.activeSwipeGroups.get(groupId);
        if (swipeGroupState != null) {
            syncCurrentStateFromVH(swipeGroupState);
        }
        if (swipeGroupState == null || !swipeGroupState.getIsOpen()) {
            closeAllGroupsExcept(groupId);
        }
        this.currentlySwipingGroup = groupId;
        Set<SwipeableViewHolder> set = this.viewHolderGroups.get(groupId);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ((SwipeableViewHolder) it.next()).ensureSwipeMenuInitialized();
            }
        }
        SwipeGroupState orCreateGroupState = getOrCreateGroupState(groupId);
        orCreateGroupState.setReachedOpenDuringSwipe(orCreateGroupState.getIsOpen());
        if (orCreateGroupState.getIsAnimating()) {
            cancelAnimation(groupId);
            orCreateGroupState.setAnimating(false);
        }
    }

    private final void syncCurrentStateFromVH(SwipeGroupState swipeGroupState) {
        SwipeableViewHolder swipeableViewHolder;
        Float currentOffset;
        Set<SwipeableViewHolder> set = this.viewHolderGroups.get(swipeGroupState.getGroupId());
        if (set == null || (swipeableViewHolder = (SwipeableViewHolder) C7714v.L(set)) == null || (currentOffset = swipeableViewHolder.getCurrentOffset()) == null) {
            return;
        }
        swipeGroupState.setSwipeOffset(currentOffset.floatValue());
        swipeGroupState.setOpen(calculateShouldOpen(swipeGroupState));
    }

    private final void updateGroupOffset(String groupId, float offset) {
        Set<SwipeableViewHolder> set;
        SwipeGroupState swipeGroupState = this.activeSwipeGroups.get(groupId);
        if (swipeGroupState == null || (set = this.viewHolderGroups.get(groupId)) == null) {
            return;
        }
        swipeGroupState.setSwipeOffset(offset);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            ((SwipeableViewHolder) it.next()).updateSwipeOffset(offset, false);
        }
    }

    public final void closeAllGroups(boolean animate) {
        Iterator it = C7714v.U0(this.activeSwipeGroups.keySet()).iterator();
        while (it.hasNext()) {
            closeGroup((String) it.next(), animate);
        }
    }

    public final void closeFirstGroup(boolean animate) {
        String str = (String) C7714v.L(this.viewHolderGroups.keySet());
        if (str == null) {
            return;
        }
        closeGroup(str, animate);
    }

    public final void closeGroup(@NotNull String groupId, boolean animate) {
        Set<SwipeableViewHolder> set;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        SwipeGroupState swipeGroupState = this.activeSwipeGroups.get(groupId);
        if (swipeGroupState == null || (set = this.viewHolderGroups.get(groupId)) == null) {
            return;
        }
        syncCurrentStateFromVH(swipeGroupState);
        animateToOffset(groupId, 0.0f, animate, new GroupSwipeCoordinator$closeGroup$1(swipeGroupState, set));
    }

    public final void onAttach(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (Intrinsics.d(this.recyclerView, recyclerView)) {
            return;
        }
        if (this.recyclerView != null) {
            onDetach();
        }
        this.recyclerView = new WeakReference<>(recyclerView);
        this.itemTouchHelper.attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.scrollListener);
    }

    public final void onDestroy() {
        cancelAllAnimations();
        onDetach();
        this.viewHolderGroups.clear();
        this.activeSwipeGroups.clear();
        this.currentlySwipingGroup = null;
        this.isHandlingSwipeEnd = false;
    }

    public final void onDetach() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        WeakReference<RecyclerView> weakReference = this.recyclerView;
        if (weakReference == null) {
            return;
        }
        Runnable runnable = this.pendingSwipeEndRunnable;
        if (runnable != null) {
            if (weakReference != null && (recyclerView2 = weakReference.get()) != null) {
                recyclerView2.removeCallbacks(runnable);
            }
            this.pendingSwipeEndRunnable = null;
        }
        WeakReference<RecyclerView> weakReference2 = this.recyclerView;
        if (weakReference2 != null && (recyclerView = weakReference2.get()) != null) {
            recyclerView.removeOnScrollListener(this.scrollListener);
        }
        this.itemTouchHelper.attachToRecyclerView(null);
        this.recyclerView = null;
    }

    public final void openFirstGroup(boolean animate) {
        String str = (String) C7714v.L(this.viewHolderGroups.keySet());
        if (str == null) {
            return;
        }
        openGroup(str, animate);
    }

    public final void openGroup(@NotNull String groupId, boolean animate) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        SwipeGroupState orCreateGroupState = getOrCreateGroupState(groupId);
        Set<SwipeableViewHolder> set = this.viewHolderGroups.get(groupId);
        if (set == null || orCreateGroupState.getIsOpen()) {
            return;
        }
        closeAllGroupsExcept(groupId);
        animateToOffset(groupId, -orCreateGroupState.getMaxSwipeDistance(), animate, new GroupSwipeCoordinator$openGroup$1(orCreateGroupState, set));
    }

    public final void registerViewHolder(@NotNull SwipeableViewHolder viewHolder) {
        SwipeGroupState swipeGroupState;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        String swipeGroupId = viewHolder.getSwipeGroupId();
        if (swipeGroupId == null) {
            return;
        }
        Map<String, Set<SwipeableViewHolder>> map = this.viewHolderGroups;
        Set<SwipeableViewHolder> set = map.get(swipeGroupId);
        if (set == null) {
            set = new LinkedHashSet<>();
            map.put(swipeGroupId, set);
        }
        if (!set.add(viewHolder) || (swipeGroupState = this.activeSwipeGroups.get(swipeGroupId)) == null) {
            return;
        }
        viewHolder.updateSwipeOffset(swipeGroupState.getSwipeOffset(), false);
        viewHolder.onSwipeStateChanged(swipeGroupState.getIsOpen());
    }

    public final void unregisterViewHolder(@NotNull SwipeableViewHolder viewHolder) {
        Set<SwipeableViewHolder> set;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        String swipeGroupId = viewHolder.getSwipeGroupId();
        if (swipeGroupId != null && (set = this.viewHolderGroups.get(swipeGroupId)) != null && set.remove(viewHolder) && set.isEmpty()) {
            this.viewHolderGroups.remove(swipeGroupId);
            this.activeSwipeGroups.remove(swipeGroupId);
        }
    }
}
