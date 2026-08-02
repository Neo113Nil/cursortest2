package com.blaze.blazesdk.features.videos.models.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.lnb;
import defpackage.u0a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002$%B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "multiAspectRatio", "", "shouldOpenOnLandscape", "pip", "Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration$BlazeVideosPipConfiguration;", "<init>", "(ZZLcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration$BlazeVideosPipConfiguration;)V", "getMultiAspectRatio", "()Z", "setMultiAspectRatio", "(Z)V", "getShouldOpenOnLandscape", "setShouldOpenOnLandscape", "getPip", "()Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration$BlazeVideosPipConfiguration;", "setPip", "(Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration$BlazeVideosPipConfiguration;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "BlazeVideosPipConfiguration", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeVideosPlaybackConfiguration implements BlazeParcelable {
    private boolean multiAspectRatio;

    @NotNull
    private BlazeVideosPipConfiguration pip;
    private boolean shouldOpenOnLandscape;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeVideosPlaybackConfiguration> CREATOR = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeVideosPlaybackConfiguration(parcel.readInt() != 0, parcel.readInt() != 0, BlazeVideosPipConfiguration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeVideosPlaybackConfiguration[i];
        }
    }

    public BlazeVideosPlaybackConfiguration(boolean z, boolean z2, @NotNull BlazeVideosPipConfiguration blazeVideosPipConfiguration) {
        blazeVideosPipConfiguration.getClass();
        this.multiAspectRatio = z;
        this.shouldOpenOnLandscape = z2;
        this.pip = blazeVideosPipConfiguration;
    }

    public static /* synthetic */ BlazeVideosPlaybackConfiguration copy$default(BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, boolean z, boolean z2, BlazeVideosPipConfiguration blazeVideosPipConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blazeVideosPlaybackConfiguration.multiAspectRatio;
        }
        if ((i & 2) != 0) {
            z2 = blazeVideosPlaybackConfiguration.shouldOpenOnLandscape;
        }
        if ((i & 4) != 0) {
            blazeVideosPipConfiguration = blazeVideosPlaybackConfiguration.pip;
        }
        return blazeVideosPlaybackConfiguration.copy(z, z2, blazeVideosPipConfiguration);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getMultiAspectRatio() {
        return this.multiAspectRatio;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldOpenOnLandscape() {
        return this.shouldOpenOnLandscape;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeVideosPipConfiguration getPip() {
        return this.pip;
    }

    @NotNull
    public final BlazeVideosPlaybackConfiguration copy(boolean multiAspectRatio, boolean shouldOpenOnLandscape, @NotNull BlazeVideosPipConfiguration pip) {
        pip.getClass();
        return new BlazeVideosPlaybackConfiguration(multiAspectRatio, shouldOpenOnLandscape, pip);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeVideosPlaybackConfiguration)) {
            return false;
        }
        BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration = (BlazeVideosPlaybackConfiguration) other;
        return this.multiAspectRatio == blazeVideosPlaybackConfiguration.multiAspectRatio && this.shouldOpenOnLandscape == blazeVideosPlaybackConfiguration.shouldOpenOnLandscape && Intrinsics.c(this.pip, blazeVideosPlaybackConfiguration.pip);
    }

    public final boolean getMultiAspectRatio() {
        return this.multiAspectRatio;
    }

    @NotNull
    public final BlazeVideosPipConfiguration getPip() {
        return this.pip;
    }

    public final boolean getShouldOpenOnLandscape() {
        return this.shouldOpenOnLandscape;
    }

    public int hashCode() {
        return this.pip.hashCode() + u0a.t(Boolean.hashCode(this.multiAspectRatio) * 31, this.shouldOpenOnLandscape);
    }

    public final void setMultiAspectRatio(boolean z) {
        this.multiAspectRatio = z;
    }

    public final void setPip(@NotNull BlazeVideosPipConfiguration blazeVideosPipConfiguration) {
        blazeVideosPipConfiguration.getClass();
        this.pip = blazeVideosPipConfiguration;
    }

    public final void setShouldOpenOnLandscape(boolean z) {
        this.shouldOpenOnLandscape = z;
    }

    @NotNull
    public String toString() {
        return "BlazeVideosPlaybackConfiguration(multiAspectRatio=" + this.multiAspectRatio + ", shouldOpenOnLandscape=" + this.shouldOpenOnLandscape + ", pip=" + this.pip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.multiAspectRatio ? 1 : 0);
        dest.writeInt(this.shouldOpenOnLandscape ? 1 : 0);
        this.pip.writeToParcel(dest, flags);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration$BlazeVideosPipConfiguration;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "enterPipOnAppBackground", "", "<init>", "(Z)V", "getEnterPipOnAppBackground", "()Z", "setEnterPipOnAppBackground", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlazeVideosPipConfiguration implements BlazeParcelable {
        private boolean enterPipOnAppBackground;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<BlazeVideosPipConfiguration> CREATOR = new a();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new BlazeVideosPipConfiguration(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlazeVideosPipConfiguration[i];
            }
        }

        public BlazeVideosPipConfiguration(boolean z) {
            this.enterPipOnAppBackground = z;
        }

        public static /* synthetic */ BlazeVideosPipConfiguration copy$default(BlazeVideosPipConfiguration blazeVideosPipConfiguration, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = blazeVideosPipConfiguration.enterPipOnAppBackground;
            }
            return blazeVideosPipConfiguration.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnterPipOnAppBackground() {
            return this.enterPipOnAppBackground;
        }

        @NotNull
        public final BlazeVideosPipConfiguration copy(boolean enterPipOnAppBackground) {
            return new BlazeVideosPipConfiguration(enterPipOnAppBackground);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BlazeVideosPipConfiguration) && this.enterPipOnAppBackground == ((BlazeVideosPipConfiguration) other).enterPipOnAppBackground;
        }

        public final boolean getEnterPipOnAppBackground() {
            return this.enterPipOnAppBackground;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enterPipOnAppBackground);
        }

        public final void setEnterPipOnAppBackground(boolean z) {
            this.enterPipOnAppBackground = z;
        }

        @NotNull
        public String toString() {
            return lnb.r(new StringBuilder("BlazeVideosPipConfiguration(enterPipOnAppBackground="), this.enterPipOnAppBackground, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.enterPipOnAppBackground ? 1 : 0);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration$BlazeVideosPipConfiguration$Companion;", "", "<init>", "()V", "base", "Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration$BlazeVideosPipConfiguration;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final BlazeVideosPipConfiguration base() {
                return new BlazeVideosPipConfiguration(true);
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration$Companion;", "", "<init>", "()V", "base", "Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazeVideosPlaybackConfiguration base() {
            return new BlazeVideosPlaybackConfiguration(false, false, BlazeVideosPipConfiguration.INSTANCE.base());
        }

        private Companion() {
        }
    }
}
