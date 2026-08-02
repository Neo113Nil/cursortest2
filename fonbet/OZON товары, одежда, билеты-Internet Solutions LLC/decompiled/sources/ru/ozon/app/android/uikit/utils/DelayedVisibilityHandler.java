package ru.ozon.app.android.uikit.utils;

import B90.RunnableC2610l;
import B90.l0;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "", "view", "Landroid/view/View;", "delay", "", "<init>", "(Landroid/view/View;J)V", "startTime", "postedHide", "", "postedShow", "isDismissed", "delayedHide", "Ljava/lang/Runnable;", "delayedShow", "hide", "", "show", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DelayedVisibilityHandler {
    private final long delay;

    @NotNull
    private final Runnable delayedHide;

    @NotNull
    private final Runnable delayedShow;
    private boolean isDismissed;
    private boolean postedHide;
    private boolean postedShow;
    private long startTime;

    @NotNull
    private final View view;

    public DelayedVisibilityHandler(@NotNull View view, long j11) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.delay = j11;
        this.startTime = -1L;
        this.delayedHide = new RunnableC2610l(this, 6);
        this.delayedShow = new l0(this, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayedHide$lambda$0(DelayedVisibilityHandler delayedVisibilityHandler) {
        delayedVisibilityHandler.postedHide = false;
        delayedVisibilityHandler.startTime = -1L;
        delayedVisibilityHandler.view.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayedShow$lambda$1(DelayedVisibilityHandler delayedVisibilityHandler) {
        delayedVisibilityHandler.postedShow = false;
        if (delayedVisibilityHandler.isDismissed) {
            return;
        }
        delayedVisibilityHandler.startTime = System.currentTimeMillis();
        delayedVisibilityHandler.view.setVisibility(0);
    }

    public final synchronized void hide() {
        try {
            this.isDismissed = true;
            this.view.removeCallbacks(this.delayedShow);
            this.postedShow = false;
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = this.startTime;
            long j12 = currentTimeMillis - j11;
            if (j12 < 0 && j11 != -1) {
                if (!this.postedHide) {
                    this.view.postDelayed(this.delayedHide, 0 - j12);
                    this.postedHide = true;
                }
            }
            this.view.setVisibility(8);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void show() {
        this.startTime = -1L;
        this.isDismissed = false;
        this.view.removeCallbacks(this.delayedHide);
        this.postedHide = false;
        if (!this.postedShow) {
            this.view.postDelayed(this.delayedShow, this.delay);
            this.postedShow = true;
        }
    }

    public /* synthetic */ DelayedVisibilityHandler(View view, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i11 & 2) != 0 ? 300L : j11);
    }
}
