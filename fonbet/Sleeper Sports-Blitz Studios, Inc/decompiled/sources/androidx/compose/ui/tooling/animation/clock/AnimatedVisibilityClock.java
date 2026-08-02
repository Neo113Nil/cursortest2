package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimatedVisibilityClock.android.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bH\u0016J\u001f\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!*\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@VX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "animation", "<init>", "(Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;)V", "getAnimation", "()Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "value", "state", "getState-jXw82LU", "()Ljava/lang/String;", "setState-7IW2chM", "(Ljava/lang/String;)V", "Ljava/lang/String;", "setStateParameters", "", "par1", "", "par2", "getMaxDurationPerIteration", "", "getMaxDuration", "setClockTime", "animationTimeNanos", "getTransitions", "", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "getAnimatedProperties", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "toCurrentTargetPair", "Lkotlin/Pair;", "", "toCurrentTargetPair-7IW2chM", "(Ljava/lang/String;)Lkotlin/Pair;", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimatedVisibilityClock implements ComposeAnimationClock<AnimatedVisibilityComposeAnimation, AnimatedVisibilityState> {
    public static final int $stable = 8;
    private final AnimatedVisibilityComposeAnimation animation;
    private String state;

    public AnimatedVisibilityClock(AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation) {
        String m8736getEnterjXw82LU;
        this.animation = animatedVisibilityComposeAnimation;
        if (getAnimation().m8716getAnimationObject().getCurrentState().booleanValue()) {
            m8736getEnterjXw82LU = AnimatedVisibilityState.INSTANCE.m8737getExitjXw82LU();
        } else {
            m8736getEnterjXw82LU = AnimatedVisibilityState.INSTANCE.m8736getEnterjXw82LU();
        }
        this.state = m8736getEnterjXw82LU;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public AnimatedVisibilityComposeAnimation getAnimation() {
        return this.animation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ AnimatedVisibilityState getState() {
        return AnimatedVisibilityState.m8729boximpl(getState());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ void setState(AnimatedVisibilityState animatedVisibilityState) {
        m8727setState7IW2chM(animatedVisibilityState.m8735unboximpl());
    }

    /* renamed from: getState-jXw82LU, reason: not valid java name and from getter */
    public String getState() {
        return this.state;
    }

    /* renamed from: setState-7IW2chM, reason: not valid java name */
    public void m8727setState7IW2chM(String str) {
        this.state = str;
        setClockTime(0L);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object par1, Object par2) {
        Intrinsics.checkNotNull(par1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState");
        m8727setState7IW2chM(((AnimatedVisibilityState) par1).m8735unboximpl());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return Utils_androidKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return Utils_androidKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long animationTimeNanos) {
        Transition<Boolean> m8716getAnimationObject = getAnimation().m8716getAnimationObject();
        Pair<Boolean, Boolean> m8725toCurrentTargetPair7IW2chM = m8725toCurrentTargetPair7IW2chM(getState());
        Boolean component1 = m8725toCurrentTargetPair7IW2chM.component1();
        component1.booleanValue();
        Boolean component2 = m8725toCurrentTargetPair7IW2chM.component2();
        component2.booleanValue();
        m8716getAnimationObject.seek(component1, component2, animationTimeNanos);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long stepMillis) {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations = Utils_androidKt.allAnimations(childTransition);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allAnimations, 10));
            Iterator<T> it = allAnimations.iterator();
            while (it.hasNext()) {
                arrayList.add(Utils_androidKt.createTransitionInfo((Transition.TransitionAnimationState) it.next(), stepMillis));
            }
            List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getTransitions$lambda$4$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((TransitionInfo) t).getLabel(), ((TransitionInfo) t2).getLabel());
                }
            });
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : sortedWith) {
                if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) obj).getLabel())) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return CollectionsKt.emptyList();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations = Utils_androidKt.allAnimations(childTransition);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = allAnimations.iterator();
            while (it.hasNext()) {
                Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) it.next();
                String label = transitionAnimationState.getLabel();
                Object value = transitionAnimationState.getValue();
                ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(label, value);
                if (composeAnimatedProperty != null) {
                    arrayList.add(composeAnimatedProperty);
                }
            }
            List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getAnimatedProperties$lambda$8$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((ComposeAnimatedProperty) t).getLabel(), ((ComposeAnimatedProperty) t2).getLabel());
                }
            });
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : sortedWith) {
                if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return CollectionsKt.emptyList();
    }

    /* renamed from: toCurrentTargetPair-7IW2chM, reason: not valid java name */
    private final Pair<Boolean, Boolean> m8725toCurrentTargetPair7IW2chM(String str) {
        return AnimatedVisibilityState.m8732equalsimpl0(str, AnimatedVisibilityState.INSTANCE.m8736getEnterjXw82LU()) ? TuplesKt.to(false, true) : TuplesKt.to(true, false);
    }
}
