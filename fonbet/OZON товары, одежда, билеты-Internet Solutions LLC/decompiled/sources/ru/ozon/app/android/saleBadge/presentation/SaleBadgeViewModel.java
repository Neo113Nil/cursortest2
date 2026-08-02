package ru.ozon.app.android.saleBadge.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0003R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/saleBadge/presentation/SaleBadgeViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "tryRunAnimation", "", "isVisible", "setWidgetVisible", "(Z)V", "", "defaultProgress", "targetProgress", "saveAnimProgressFromModel", "(Ljava/lang/Float;Ljava/lang/Float;)V", "progress", "saveAnimProgress", "(F)V", "alpha", "saveAnimAlpha", "reset", "resetState", "LAe/w0;", "_isStartAnimation", "LAe/w0;", "LAe/B0;", "isStartAnimation", "LAe/B0;", "()LAe/B0;", "LAe/x0;", "_savedAnimProgress", "LAe/x0;", "LAe/M0;", "savedAnimProgress", "LAe/M0;", "getSavedAnimProgress", "()LAe/M0;", "targetProgressFromModel", "Ljava/lang/Float;", "_savedAnimAlpha", "savedAnimAlpha", "getSavedAnimAlpha", "widgetIsVisible", "Z", "animationWasStarted", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaleBadgeViewModel extends w0 {

    @NotNull
    private final Ae.w0<Unit> _isStartAnimation;

    @NotNull
    private final x0<Float> _savedAnimAlpha;

    @NotNull
    private final x0<Float> _savedAnimProgress;
    private boolean animationWasStarted;

    @NotNull
    private final B0<Unit> isStartAnimation;

    @NotNull
    private final M0<Float> savedAnimAlpha;

    @NotNull
    private final M0<Float> savedAnimProgress;
    private Float targetProgressFromModel;
    private boolean widgetIsVisible;

    public SaleBadgeViewModel() {
        C0 b11 = E0.b(1, 0, EnumC11113a.DROP_OLDEST, 2);
        this._isStartAnimation = b11;
        this.isStartAnimation = C2399j.a(b11);
        x0<Float> a11 = O0.a(null);
        this._savedAnimProgress = a11;
        this.savedAnimProgress = C2399j.b(a11);
        x0<Float> a12 = O0.a(Float.valueOf(0.0f));
        this._savedAnimAlpha = a12;
        this.savedAnimAlpha = C2399j.b(a12);
    }

    private final void tryRunAnimation() {
        if (!this.widgetIsVisible || this.animationWasStarted) {
            return;
        }
        this.animationWasStarted = true;
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new SaleBadgeViewModel$tryRunAnimation$1(this, null), 3);
    }

    @NotNull
    public final M0<Float> getSavedAnimAlpha() {
        return this.savedAnimAlpha;
    }

    @NotNull
    public final M0<Float> getSavedAnimProgress() {
        return this.savedAnimProgress;
    }

    @NotNull
    public final B0<Unit> isStartAnimation() {
        return this.isStartAnimation;
    }

    public final void reset() {
        this.animationWasStarted = false;
        resetState();
        this._savedAnimProgress.tryEmit(null);
        this._savedAnimAlpha.tryEmit(Float.valueOf(0.0f));
        this.targetProgressFromModel = null;
        tryRunAnimation();
    }

    public final void resetState() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new SaleBadgeViewModel$resetState$1(this, null), 3);
    }

    public final void saveAnimAlpha(float alpha) {
        this._savedAnimAlpha.setValue(Float.valueOf(alpha));
    }

    public final void saveAnimProgress(float progress) {
        this._savedAnimProgress.setValue(Float.valueOf(progress));
    }

    public final void saveAnimProgressFromModel(Float defaultProgress, Float targetProgress) {
        this.targetProgressFromModel = targetProgress == null ? defaultProgress : targetProgress;
        if (defaultProgress == null || targetProgress != null) {
            return;
        }
        this._savedAnimProgress.tryEmit(defaultProgress);
    }

    public final void setWidgetVisible(boolean isVisible) {
        if (!this.widgetIsVisible && isVisible && this.animationWasStarted) {
            Float f7 = this.targetProgressFromModel;
            if (f7 != null) {
                this._savedAnimProgress.tryEmit(Float.valueOf(f7.floatValue()));
            }
            this._savedAnimAlpha.tryEmit(Float.valueOf(1.0f));
        } else if (!isVisible) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new SaleBadgeViewModel$setWidgetVisible$2(this, null), 3);
        }
        this.widgetIsVisible = isVisible;
        tryRunAnimation();
    }
}
