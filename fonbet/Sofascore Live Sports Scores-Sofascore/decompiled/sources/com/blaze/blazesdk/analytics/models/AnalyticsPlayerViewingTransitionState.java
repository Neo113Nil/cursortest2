package com.blaze.blazesdk.analytics.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import com.ironsource.U3;
import defpackage.b6h;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState;", "Landroid/os/Parcelable;", "current_mode", "Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState$PlayerViewingMode;", "next_mode", "<init>", "(Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState$PlayerViewingMode;Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState$PlayerViewingMode;)V", "getCurrent_mode", "()Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState$PlayerViewingMode;", "getNext_mode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PlayerViewingMode", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsPlayerViewingTransitionState implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AnalyticsPlayerViewingTransitionState> CREATOR = new a();

    @b6h("current_mode")
    @Nullable
    private final PlayerViewingMode current_mode;

    @b6h("next_mode")
    @Nullable
    private final PlayerViewingMode next_mode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/analytics/models/AnalyticsPlayerViewingTransitionState$PlayerViewingMode;", "Lcom/blaze/blazesdk/utils/parsing/EnumWithValue;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INLINE_PREVIEW", "INLINE_INTERACTIVE", "FULLSCREEN", "PICTURE_IN_PICTURE", "OUT_OF_SCREEN", "CASTING", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PlayerViewingMode implements EnumWithValue, Parcelable {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ PlayerViewingMode[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<PlayerViewingMode> CREATOR;

        @NotNull
        private final String value;
        public static final PlayerViewingMode INLINE_PREVIEW = new PlayerViewingMode("INLINE_PREVIEW", 0, "Inline Preview");
        public static final PlayerViewingMode INLINE_INTERACTIVE = new PlayerViewingMode("INLINE_INTERACTIVE", 1, "Inline Interactive");
        public static final PlayerViewingMode FULLSCREEN = new PlayerViewingMode("FULLSCREEN", 2, "Fullscreen");
        public static final PlayerViewingMode PICTURE_IN_PICTURE = new PlayerViewingMode("PICTURE_IN_PICTURE", 3, "Picture In Picture");
        public static final PlayerViewingMode OUT_OF_SCREEN = new PlayerViewingMode("OUT_OF_SCREEN", 4, "Out Of Screen");
        public static final PlayerViewingMode CASTING = new PlayerViewingMode("CASTING", 5, "Casting");

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return PlayerViewingMode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlayerViewingMode[i];
            }
        }

        private static final /* synthetic */ PlayerViewingMode[] $values() {
            return new PlayerViewingMode[]{INLINE_PREVIEW, INLINE_INTERACTIVE, FULLSCREEN, PICTURE_IN_PICTURE, OUT_OF_SCREEN, CASTING};
        }

        static {
            PlayerViewingMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
            CREATOR = new a();
        }

        private PlayerViewingMode(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static PlayerViewingMode valueOf(String str) {
            return (PlayerViewingMode) Enum.valueOf(PlayerViewingMode.class, str);
        }

        public static PlayerViewingMode[] values() {
            return (PlayerViewingMode[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
        @NotNull
        public String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(name());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AnalyticsPlayerViewingTransitionState(parcel.readInt() == 0 ? null : PlayerViewingMode.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PlayerViewingMode.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsPlayerViewingTransitionState[i];
        }
    }

    public /* synthetic */ AnalyticsPlayerViewingTransitionState(PlayerViewingMode playerViewingMode, PlayerViewingMode playerViewingMode2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : playerViewingMode, (i & 2) != 0 ? null : playerViewingMode2);
    }

    public static /* synthetic */ AnalyticsPlayerViewingTransitionState copy$default(AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState, PlayerViewingMode playerViewingMode, PlayerViewingMode playerViewingMode2, int i, Object obj) {
        if ((i & 1) != 0) {
            playerViewingMode = analyticsPlayerViewingTransitionState.current_mode;
        }
        if ((i & 2) != 0) {
            playerViewingMode2 = analyticsPlayerViewingTransitionState.next_mode;
        }
        return analyticsPlayerViewingTransitionState.copy(playerViewingMode, playerViewingMode2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final PlayerViewingMode getCurrent_mode() {
        return this.current_mode;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final PlayerViewingMode getNext_mode() {
        return this.next_mode;
    }

    @NotNull
    public final AnalyticsPlayerViewingTransitionState copy(@Nullable PlayerViewingMode current_mode, @Nullable PlayerViewingMode next_mode) {
        return new AnalyticsPlayerViewingTransitionState(current_mode, next_mode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPlayerViewingTransitionState)) {
            return false;
        }
        AnalyticsPlayerViewingTransitionState analyticsPlayerViewingTransitionState = (AnalyticsPlayerViewingTransitionState) other;
        return this.current_mode == analyticsPlayerViewingTransitionState.current_mode && this.next_mode == analyticsPlayerViewingTransitionState.next_mode;
    }

    @Nullable
    public final PlayerViewingMode getCurrent_mode() {
        return this.current_mode;
    }

    @Nullable
    public final PlayerViewingMode getNext_mode() {
        return this.next_mode;
    }

    public int hashCode() {
        PlayerViewingMode playerViewingMode = this.current_mode;
        int hashCode = (playerViewingMode == null ? 0 : playerViewingMode.hashCode()) * 31;
        PlayerViewingMode playerViewingMode2 = this.next_mode;
        return hashCode + (playerViewingMode2 != null ? playerViewingMode2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnalyticsPlayerViewingTransitionState(current_mode=" + this.current_mode + ", next_mode=" + this.next_mode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        PlayerViewingMode playerViewingMode = this.current_mode;
        if (playerViewingMode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            playerViewingMode.writeToParcel(dest, flags);
        }
        PlayerViewingMode playerViewingMode2 = this.next_mode;
        if (playerViewingMode2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            playerViewingMode2.writeToParcel(dest, flags);
        }
    }

    public AnalyticsPlayerViewingTransitionState(@Nullable PlayerViewingMode playerViewingMode, @Nullable PlayerViewingMode playerViewingMode2) {
        this.current_mode = playerViewingMode;
        this.next_mode = playerViewingMode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsPlayerViewingTransitionState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
