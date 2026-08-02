package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import Pk0.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDimensionsPx;", "", "", "barHeightPx", "scrubbedBarHeightPx", "scrubberEnabledSizePx", "scrubberDraggedSizePx", "trackCornerRadiusPx", "fineScrubYThresholdPx", "<init>", "(FFFFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getBarHeightPx", "()F", "getScrubbedBarHeightPx", "getScrubberEnabledSizePx", "getScrubberDraggedSizePx", "getTrackCornerRadiusPx", "getFineScrubYThresholdPx", "scrubberPaddingPx", "getScrubberPaddingPx", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SlimTimeBarDimensionsPx {
    private final float barHeightPx;
    private final float fineScrubYThresholdPx;
    private final float scrubbedBarHeightPx;
    private final float scrubberDraggedSizePx;
    private final float scrubberEnabledSizePx;
    private final float scrubberPaddingPx;
    private final float trackCornerRadiusPx;

    public SlimTimeBarDimensionsPx(float f7, float f11, float f12, float f13, float f14, float f15) {
        this.barHeightPx = f7;
        this.scrubbedBarHeightPx = f11;
        this.scrubberEnabledSizePx = f12;
        this.scrubberDraggedSizePx = f13;
        this.trackCornerRadiusPx = f14;
        this.fineScrubYThresholdPx = f15;
        this.scrubberPaddingPx = (Math.max(f12, f13) + 1.0f) / 2.0f;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlimTimeBarDimensionsPx)) {
            return false;
        }
        SlimTimeBarDimensionsPx slimTimeBarDimensionsPx = (SlimTimeBarDimensionsPx) other;
        return Float.compare(this.barHeightPx, slimTimeBarDimensionsPx.barHeightPx) == 0 && Float.compare(this.scrubbedBarHeightPx, slimTimeBarDimensionsPx.scrubbedBarHeightPx) == 0 && Float.compare(this.scrubberEnabledSizePx, slimTimeBarDimensionsPx.scrubberEnabledSizePx) == 0 && Float.compare(this.scrubberDraggedSizePx, slimTimeBarDimensionsPx.scrubberDraggedSizePx) == 0 && Float.compare(this.trackCornerRadiusPx, slimTimeBarDimensionsPx.trackCornerRadiusPx) == 0 && Float.compare(this.fineScrubYThresholdPx, slimTimeBarDimensionsPx.fineScrubYThresholdPx) == 0;
    }

    public final float getBarHeightPx() {
        return this.barHeightPx;
    }

    public final float getFineScrubYThresholdPx() {
        return this.fineScrubYThresholdPx;
    }

    public final float getScrubbedBarHeightPx() {
        return this.scrubbedBarHeightPx;
    }

    public final float getScrubberDraggedSizePx() {
        return this.scrubberDraggedSizePx;
    }

    public final float getScrubberEnabledSizePx() {
        return this.scrubberEnabledSizePx;
    }

    public final float getScrubberPaddingPx() {
        return this.scrubberPaddingPx;
    }

    public final float getTrackCornerRadiusPx() {
        return this.trackCornerRadiusPx;
    }

    public int hashCode() {
        return Float.hashCode(this.fineScrubYThresholdPx) + b.a(this.trackCornerRadiusPx, b.a(this.scrubberDraggedSizePx, b.a(this.scrubberEnabledSizePx, b.a(this.scrubbedBarHeightPx, Float.hashCode(this.barHeightPx) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "SlimTimeBarDimensionsPx(barHeightPx=" + this.barHeightPx + ", scrubbedBarHeightPx=" + this.scrubbedBarHeightPx + ", scrubberEnabledSizePx=" + this.scrubberEnabledSizePx + ", scrubberDraggedSizePx=" + this.scrubberDraggedSizePx + ", trackCornerRadiusPx=" + this.trackCornerRadiusPx + ", fineScrubYThresholdPx=" + this.fineScrubYThresholdPx + ")";
    }
}
