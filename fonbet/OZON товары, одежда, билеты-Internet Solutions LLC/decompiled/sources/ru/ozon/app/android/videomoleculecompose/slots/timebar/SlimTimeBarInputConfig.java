package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import Ak.C2436a;
import Kk.C3532b;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarInputConfig;", "", "", "enabled", "", "durationMs", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDimensionsPx;", "dimensions", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;", "gravity", "showScrubber", "fineScrubEnabled", "<init>", "(ZJLru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDimensionsPx;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "()Z", "J", "getDurationMs", "()J", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDimensionsPx;", "getDimensions", "()Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarDimensionsPx;", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;", "getGravity", "()Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;", "getShowScrubber", "getFineScrubEnabled", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class SlimTimeBarInputConfig {

    @NotNull
    private final SlimTimeBarDimensionsPx dimensions;
    private final long durationMs;
    private final boolean enabled;
    private final boolean fineScrubEnabled;

    @NotNull
    private final SlimTimeBarGravity gravity;
    private final boolean showScrubber;

    public SlimTimeBarInputConfig(boolean z11, long j11, @NotNull SlimTimeBarDimensionsPx dimensions, @NotNull SlimTimeBarGravity gravity, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.enabled = z11;
        this.durationMs = j11;
        this.dimensions = dimensions;
        this.gravity = gravity;
        this.showScrubber = z12;
        this.fineScrubEnabled = z13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlimTimeBarInputConfig)) {
            return false;
        }
        SlimTimeBarInputConfig slimTimeBarInputConfig = (SlimTimeBarInputConfig) other;
        return this.enabled == slimTimeBarInputConfig.enabled && this.durationMs == slimTimeBarInputConfig.durationMs && Intrinsics.d(this.dimensions, slimTimeBarInputConfig.dimensions) && this.gravity == slimTimeBarInputConfig.gravity && this.showScrubber == slimTimeBarInputConfig.showScrubber && this.fineScrubEnabled == slimTimeBarInputConfig.fineScrubEnabled;
    }

    @NotNull
    public final SlimTimeBarDimensionsPx getDimensions() {
        return this.dimensions;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFineScrubEnabled() {
        return this.fineScrubEnabled;
    }

    @NotNull
    public final SlimTimeBarGravity getGravity() {
        return this.gravity;
    }

    public final boolean getShowScrubber() {
        return this.showScrubber;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fineScrubEnabled) + C3532b.a((this.gravity.hashCode() + ((this.dimensions.hashCode() + c.a(Boolean.hashCode(this.enabled) * 31, 31, this.durationMs)) * 31)) * 31, 31, this.showScrubber);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.enabled;
        long j11 = this.durationMs;
        SlimTimeBarDimensionsPx slimTimeBarDimensionsPx = this.dimensions;
        SlimTimeBarGravity slimTimeBarGravity = this.gravity;
        boolean z12 = this.showScrubber;
        boolean z13 = this.fineScrubEnabled;
        StringBuilder sb2 = new StringBuilder("SlimTimeBarInputConfig(enabled=");
        sb2.append(z11);
        sb2.append(", durationMs=");
        sb2.append(j11);
        sb2.append(", dimensions=");
        sb2.append(slimTimeBarDimensionsPx);
        sb2.append(", gravity=");
        sb2.append(slimTimeBarGravity);
        C2436a.e(", showScrubber=", ", fineScrubEnabled=", sb2, z12, z13);
        sb2.append(")");
        return sb2.toString();
    }
}
