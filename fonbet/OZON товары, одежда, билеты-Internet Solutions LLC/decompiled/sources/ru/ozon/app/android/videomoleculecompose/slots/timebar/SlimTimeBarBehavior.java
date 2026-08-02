package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import Kk.C3532b;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;", "", "", "showScrubber", "clipToOuterCorners", "fineScrubEnabled", "<init>", "(ZZZ)V", "copy", "(ZZZ)Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowScrubber", "()Z", "getClipToOuterCorners", "getFineScrubEnabled", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SlimTimeBarBehavior {
    private final boolean clipToOuterCorners;
    private final boolean fineScrubEnabled;
    private final boolean showScrubber;

    public SlimTimeBarBehavior() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ SlimTimeBarBehavior copy$default(SlimTimeBarBehavior slimTimeBarBehavior, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = slimTimeBarBehavior.showScrubber;
        }
        if ((i11 & 2) != 0) {
            z12 = slimTimeBarBehavior.clipToOuterCorners;
        }
        if ((i11 & 4) != 0) {
            z13 = slimTimeBarBehavior.fineScrubEnabled;
        }
        return slimTimeBarBehavior.copy(z11, z12, z13);
    }

    @NotNull
    public final SlimTimeBarBehavior copy(boolean showScrubber, boolean clipToOuterCorners, boolean fineScrubEnabled) {
        return new SlimTimeBarBehavior(showScrubber, clipToOuterCorners, fineScrubEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlimTimeBarBehavior)) {
            return false;
        }
        SlimTimeBarBehavior slimTimeBarBehavior = (SlimTimeBarBehavior) other;
        return this.showScrubber == slimTimeBarBehavior.showScrubber && this.clipToOuterCorners == slimTimeBarBehavior.clipToOuterCorners && this.fineScrubEnabled == slimTimeBarBehavior.fineScrubEnabled;
    }

    public final boolean getClipToOuterCorners() {
        return this.clipToOuterCorners;
    }

    public final boolean getFineScrubEnabled() {
        return this.fineScrubEnabled;
    }

    public final boolean getShowScrubber() {
        return this.showScrubber;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fineScrubEnabled) + C3532b.a(Boolean.hashCode(this.showScrubber) * 31, 31, this.clipToOuterCorners);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.showScrubber;
        boolean z12 = this.clipToOuterCorners;
        return a.a(")", Lh.a.d("SlimTimeBarBehavior(showScrubber=", ", clipToOuterCorners=", ", fineScrubEnabled=", z11, z12), this.fineScrubEnabled);
    }

    public SlimTimeBarBehavior(boolean z11, boolean z12, boolean z13) {
        this.showScrubber = z11;
        this.clipToOuterCorners = z12;
        this.fineScrubEnabled = z13;
    }

    public /* synthetic */ SlimTimeBarBehavior(boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? true : z13);
    }
}
