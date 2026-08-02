package com.blaze.blazesdk.features.moments.models.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsLoopBehavior;
import com.blaze.blazesdk.utils.BlazeParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001a"}, d2 = {"Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "loopBehavior", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior;", "<init>", "(Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior;)V", "getLoopBehavior", "()Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior;", "setLoopBehavior", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeMomentsPlaybackConfiguration implements BlazeParcelable {

    @NotNull
    private BlazeMomentsLoopBehavior loopBehavior;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeMomentsPlaybackConfiguration> CREATOR = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeMomentsPlaybackConfiguration((BlazeMomentsLoopBehavior) parcel.readParcelable(BlazeMomentsPlaybackConfiguration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeMomentsPlaybackConfiguration[i];
        }
    }

    public BlazeMomentsPlaybackConfiguration(@NotNull BlazeMomentsLoopBehavior blazeMomentsLoopBehavior) {
        blazeMomentsLoopBehavior.getClass();
        this.loopBehavior = blazeMomentsLoopBehavior;
    }

    public static /* synthetic */ BlazeMomentsPlaybackConfiguration copy$default(BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, BlazeMomentsLoopBehavior blazeMomentsLoopBehavior, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeMomentsLoopBehavior = blazeMomentsPlaybackConfiguration.loopBehavior;
        }
        return blazeMomentsPlaybackConfiguration.copy(blazeMomentsLoopBehavior);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeMomentsLoopBehavior getLoopBehavior() {
        return this.loopBehavior;
    }

    @NotNull
    public final BlazeMomentsPlaybackConfiguration copy(@NotNull BlazeMomentsLoopBehavior loopBehavior) {
        loopBehavior.getClass();
        return new BlazeMomentsPlaybackConfiguration(loopBehavior);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BlazeMomentsPlaybackConfiguration) && Intrinsics.c(this.loopBehavior, ((BlazeMomentsPlaybackConfiguration) other).loopBehavior);
    }

    @NotNull
    public final BlazeMomentsLoopBehavior getLoopBehavior() {
        return this.loopBehavior;
    }

    public int hashCode() {
        return this.loopBehavior.hashCode();
    }

    public final void setLoopBehavior(@NotNull BlazeMomentsLoopBehavior blazeMomentsLoopBehavior) {
        blazeMomentsLoopBehavior.getClass();
        this.loopBehavior = blazeMomentsLoopBehavior;
    }

    @NotNull
    public String toString() {
        return "BlazeMomentsPlaybackConfiguration(loopBehavior=" + this.loopBehavior + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeParcelable(this.loopBehavior, flags);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration$Companion;", "", "<init>", "()V", "base", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazeMomentsPlaybackConfiguration base() {
            return new BlazeMomentsPlaybackConfiguration(BlazeMomentsLoopBehavior.InfiniteLoop.INSTANCE);
        }

        private Companion() {
        }
    }
}
