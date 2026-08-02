package ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation;

import Sc.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ordertracking.v4.presentation.view.OrderTrackingMarqueeView;
import xe.B0;
import xe.C10727i;
import xe.InterfaceC10733l;
import xe.M;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/MarqueeAnimationManager;", "", "Lxe/M;", "scope", "Lru/ozon/app/android/ordertracking/v4/presentation/view/OrderTrackingMarqueeView;", "view", "", "initialDelay", "shortDelay", "longDelay", "<init>", "(Lxe/M;Lru/ozon/app/android/ordertracking/v4/presentation/view/OrderTrackingMarqueeView;JJJ)V", "", "scheduleNextCycle", "()V", "cleanup", "startAnimation", "pauseAnimation", "resumeAnimation", "restartAnimationAfterRefresh", "stopAnimation", "stopAnimationWithFade", "(Lru/ozon/app/android/ordertracking/v4/presentation/view/OrderTrackingMarqueeView;)V", "Lxe/M;", "Lru/ozon/app/android/ordertracking/v4/presentation/view/OrderTrackingMarqueeView;", "J", "Lxe/B0;", "animationCycleJob", "Lxe/B0;", "", "animationCycleCount", "I", "lastPausedCycleCount", "Lxe/l;", "pauseContinuation", "Lxe/l;", "restartJob", "", "isActive", "Z", "isPaused", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarqueeAnimationManager {
    private int animationCycleCount;
    private B0 animationCycleJob;
    private final long initialDelay;
    private volatile boolean isActive;
    private volatile boolean isPaused;
    private int lastPausedCycleCount;
    private final long longDelay;
    private InterfaceC10733l<? super Unit> pauseContinuation;
    private B0 restartJob;

    @NotNull
    private final M scope;
    private final long shortDelay;

    @NotNull
    private final OrderTrackingMarqueeView view;

    public MarqueeAnimationManager(@NotNull M scope, @NotNull OrderTrackingMarqueeView view, long j11, long j12, long j13) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(view, "view");
        this.scope = scope;
        this.view = view;
        this.initialDelay = j11;
        this.shortDelay = j12;
        this.longDelay = j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanup() {
        this.isActive = false;
        this.isPaused = false;
        InterfaceC10733l<? super Unit> interfaceC10733l = this.pauseContinuation;
        if (interfaceC10733l != null) {
            interfaceC10733l.A(null);
        }
        this.pauseContinuation = null;
        B0 b02 = this.animationCycleJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.animationCycleJob = null;
        this.animationCycleCount = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleNextCycle() {
        if (this.isActive) {
            int i11 = this.animationCycleCount;
            this.animationCycleJob = C10727i.c(this.scope, null, null, new MarqueeAnimationManager$scheduleNextCycle$1(i11 != 0 ? i11 != 1 ? this.longDelay : this.shortDelay : this.initialDelay, this, null), 3);
        }
    }

    public final void pauseAnimation() {
        this.lastPausedCycleCount = this.animationCycleCount;
        this.isPaused = true;
        this.view.pauseAnimation();
    }

    public final void restartAnimationAfterRefresh() {
        B0 b02 = this.restartJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.restartJob = C10727i.c(this.scope, null, null, new MarqueeAnimationManager$restartAnimationAfterRefresh$1(this, null), 3);
    }

    public final void resumeAnimation() {
        this.isPaused = false;
        this.view.resumeAnimation();
        InterfaceC10733l<? super Unit> interfaceC10733l = this.pauseContinuation;
        if (interfaceC10733l != null) {
            r.Companion companion = r.INSTANCE;
            interfaceC10733l.resumeWith(Unit.f71690a);
        }
        this.pauseContinuation = null;
    }

    public final void startAnimation() {
        stopAnimation();
        this.isActive = true;
        this.isPaused = false;
        scheduleNextCycle();
    }

    public final void stopAnimation() {
        this.view.stopAnimation();
        B0 b02 = this.restartJob;
        if (b02 != null) {
            b02.j(null);
        }
        cleanup();
    }

    public final void stopAnimationWithFade(@NotNull OrderTrackingMarqueeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.stopAnimationWithFade();
        cleanup();
    }
}
