package ru.ozon.app.android.pikazon.placeholdertracker;

import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTrackingInfo;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "time", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTime;", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getTime-V4TSS7w", "()J", "J", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlaceholderTrackingInfo {

    @NotNull
    private static final PlaceholderTrackingInfo EMPTY;

    @NotNull
    private final String name;
    private final long time;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        EMPTY = new PlaceholderTrackingInfo("", PlaceholderTime.m902constructorimpl(0L), defaultConstructorMarker);
    }

    public /* synthetic */ PlaceholderTrackingInfo(String str, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceholderTrackingInfo)) {
            return false;
        }
        PlaceholderTrackingInfo placeholderTrackingInfo = (PlaceholderTrackingInfo) other;
        return Intrinsics.d(this.name, placeholderTrackingInfo.name) && PlaceholderTime.m904equalsimpl0(this.time, placeholderTrackingInfo.time);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* renamed from: getTime-V4TSS7w, reason: not valid java name and from getter */
    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return PlaceholderTime.m905hashCodeimpl(this.time) + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("PlaceholderTrackingInfo(name='", this.name, "', time=", PlaceholderTime.m906toStringimpl(this.time), ")");
    }

    private PlaceholderTrackingInfo(String name, long j11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.time = j11;
    }
}
