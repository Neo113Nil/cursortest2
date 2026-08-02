package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: PullRefreshState.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0000¢\u0006\u0002\b6J\u0015\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0000¢\u0006\u0002\b9J\u0015\u0010:\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b=J\u0015\u0010>\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b?J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\tH\u0002J\b\u0010E\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u001b\u0010\u0017\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u000fR+\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R+\u0010(\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010%R+\u0010,\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010'\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010%R+\u00100\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010'\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010%R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "animationScope", "Lkotlinx/coroutines/CoroutineScope;", "onRefreshState", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "", "refreshingOffset", "", "threshold", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;FF)V", "progress", "getProgress", "()F", "refreshing", "", "getRefreshing$material", "()Z", ViewProps.POSITION, "getPosition$material", "getThreshold$material", "adjustedDistancePulled", "getAdjustedDistancePulled", "adjustedDistancePulled$delegate", "Landroidx/compose/runtime/State;", "<set-?>", "_refreshing", "get_refreshing", "set_refreshing", "(Z)V", "_refreshing$delegate", "Landroidx/compose/runtime/MutableState;", "_position", "get_position", "set_position", "(F)V", "_position$delegate", "Landroidx/compose/runtime/MutableFloatState;", "distancePulled", "getDistancePulled", "setDistancePulled", "distancePulled$delegate", "_threshold", "get_threshold", "set_threshold", "_threshold$delegate", "_refreshingOffset", "get_refreshingOffset", "set_refreshingOffset", "_refreshingOffset$delegate", "onPull", "pullDelta", "onPull$material", "onRelease", "velocity", "onRelease$material", "setRefreshing", "setRefreshing$material", "setThreshold", "setThreshold$material", "setRefreshingOffset", "setRefreshingOffset$material", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "animateIndicatorTo", "Lkotlinx/coroutines/Job;", TypedValues.CycleType.S_WAVE_OFFSET, "calculateIndicatorPosition", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshState {
    public static final int $stable = 8;

    /* renamed from: _refreshingOffset$delegate, reason: from kotlin metadata */
    private final MutableFloatState _refreshingOffset;

    /* renamed from: _threshold$delegate, reason: from kotlin metadata */
    private final MutableFloatState _threshold;
    private final CoroutineScope animationScope;
    private final State<Function0<Unit>> onRefreshState;

    /* renamed from: adjustedDistancePulled$delegate, reason: from kotlin metadata */
    private final State adjustedDistancePulled = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            float adjustedDistancePulled_delegate$lambda$0;
            adjustedDistancePulled_delegate$lambda$0 = PullRefreshState.adjustedDistancePulled_delegate$lambda$0(PullRefreshState.this);
            return Float.valueOf(adjustedDistancePulled_delegate$lambda$0);
        }
    });

    /* renamed from: _refreshing$delegate, reason: from kotlin metadata */
    private final MutableState _refreshing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: _position$delegate, reason: from kotlin metadata */
    private final MutableFloatState _position = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* renamed from: distancePulled$delegate, reason: from kotlin metadata */
    private final MutableFloatState distancePulled = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutatorMutex mutatorMutex = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(CoroutineScope coroutineScope, State<? extends Function0<Unit>> state, float f, float f2) {
        this.animationScope = coroutineScope;
        this.onRefreshState = state;
        this._threshold = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this._refreshingOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material();
    }

    public final boolean getRefreshing$material() {
        return get_refreshing();
    }

    public final float getPosition$material() {
        return get_position();
    }

    public final float getThreshold$material() {
        return get_threshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float adjustedDistancePulled_delegate$lambda$0(PullRefreshState pullRefreshState) {
        return pullRefreshState.getDistancePulled() * 0.5f;
    }

    private final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing.getValue()).booleanValue();
    }

    private final void set_refreshing(boolean z) {
        this._refreshing.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float get_position() {
        return this._position.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_position(float f) {
        this._position.setFloatValue(f);
    }

    private final float getDistancePulled() {
        return this.distancePulled.getFloatValue();
    }

    private final void setDistancePulled(float f) {
        this.distancePulled.setFloatValue(f);
    }

    private final float get_threshold() {
        return this._threshold.getFloatValue();
    }

    private final void set_threshold(float f) {
        this._threshold.setFloatValue(f);
    }

    private final float get_refreshingOffset() {
        return this._refreshingOffset.getFloatValue();
    }

    private final void set_refreshingOffset(float f) {
        this._refreshingOffset.setFloatValue(f);
    }

    public final float onPull$material(float pullDelta) {
        if (get_refreshing()) {
            return 0.0f;
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(getDistancePulled() + pullDelta, 0.0f);
        float distancePulled = coerceAtLeast - getDistancePulled();
        setDistancePulled(coerceAtLeast);
        set_position(calculateIndicatorPosition());
        return distancePulled;
    }

    public final float onRelease$material(float velocity) {
        if (getRefreshing$material()) {
            return 0.0f;
        }
        if (getAdjustedDistancePulled() > getThreshold$material()) {
            this.onRefreshState.getValue().invoke();
        }
        animateIndicatorTo(0.0f);
        if (getDistancePulled() == 0.0f || velocity < 0.0f) {
            velocity = 0.0f;
        }
        setDistancePulled(0.0f);
        return velocity;
    }

    public final void setRefreshing$material(boolean refreshing) {
        if (get_refreshing() != refreshing) {
            set_refreshing(refreshing);
            setDistancePulled(0.0f);
            animateIndicatorTo(refreshing ? get_refreshingOffset() : 0.0f);
        }
    }

    public final void setThreshold$material(float threshold) {
        set_threshold(threshold);
    }

    public final void setRefreshingOffset$material(float refreshingOffset) {
        if (get_refreshingOffset() == refreshingOffset) {
            return;
        }
        set_refreshingOffset(refreshingOffset);
        if (getRefreshing$material()) {
            animateIndicatorTo(refreshingOffset);
        }
    }

    private final Job animateIndicatorTo(float offset) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new PullRefreshState$animateIndicatorTo$1(this, offset, null), 3, null);
        return launch$default;
    }

    private final float calculateIndicatorPosition() {
        if (getAdjustedDistancePulled() <= getThreshold$material()) {
            return getAdjustedDistancePulled();
        }
        float abs = Math.abs(getProgress()) - 1.0f;
        if (abs < 0.0f) {
            abs = 0.0f;
        }
        if (abs > 2.0f) {
            abs = 2.0f;
        }
        return getThreshold$material() + (getThreshold$material() * (abs - (((float) Math.pow(abs, 2)) / 4)));
    }
}
