package com.blaze.blazesdk.style.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.models.BlazeExtraInfoKeyPreset;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.lnb;
import defpackage.wx4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006 "}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", U3.i.W, "", U3.i.X, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "keyPreset", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping$BlazeKeysPresets;", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping$BlazeKeysPresets;Ljava/lang/String;)V", "Lcom/blaze/blazesdk/shared/models/BlazeExtraInfoKeyPreset;", "(Lcom/blaze/blazesdk/shared/models/BlazeExtraInfoKeyPreset;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BlazeKeysPresets", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetItemCustomMapping implements BlazeParcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetItemCustomMapping> CREATOR = new a();

    @NotNull
    private final String key;

    @NotNull
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping$BlazeKeysPresets;", "Lcom/blaze/blazesdk/utils/parsing/EnumWithValue;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GAME_ID", "TEAM_ID", "PLAYER_ID", "ROUND_ID", "SEASON_ID", "ACTIVE_LABELS", "IS_CURRENTLY_LIVE", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @wx4
    public static final class BlazeKeysPresets implements EnumWithValue {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ BlazeKeysPresets[] $VALUES;

        @NotNull
        private final String value;
        public static final BlazeKeysPresets GAME_ID = new BlazeKeysPresets("GAME_ID", 0, AndroidGetAdPlayerContext.KEY_GAME_ID);
        public static final BlazeKeysPresets TEAM_ID = new BlazeKeysPresets("TEAM_ID", 1, "teamId");
        public static final BlazeKeysPresets PLAYER_ID = new BlazeKeysPresets("PLAYER_ID", 2, "playerId");
        public static final BlazeKeysPresets ROUND_ID = new BlazeKeysPresets("ROUND_ID", 3, "roundId");
        public static final BlazeKeysPresets SEASON_ID = new BlazeKeysPresets("SEASON_ID", 4, "seasonId");
        public static final BlazeKeysPresets ACTIVE_LABELS = new BlazeKeysPresets("ACTIVE_LABELS", 5, "activeLabels");
        public static final BlazeKeysPresets IS_CURRENTLY_LIVE = new BlazeKeysPresets("IS_CURRENTLY_LIVE", 6, "isCurrentlyLive");

        private static final /* synthetic */ BlazeKeysPresets[] $values() {
            return new BlazeKeysPresets[]{GAME_ID, TEAM_ID, PLAYER_ID, ROUND_ID, SEASON_ID, ACTIVE_LABELS, IS_CURRENTLY_LIVE};
        }

        static {
            BlazeKeysPresets[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private BlazeKeysPresets(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static BlazeKeysPresets valueOf(String str) {
            return (BlazeKeysPresets) Enum.valueOf(BlazeKeysPresets.class, str);
        }

        public static BlazeKeysPresets[] values() {
            return (BlazeKeysPresets[]) $VALUES.clone();
        }

        @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
        @NotNull
        public String getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BlazeWidgetItemCustomMapping(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetItemCustomMapping[i];
        }
    }

    public BlazeWidgetItemCustomMapping(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ BlazeWidgetItemCustomMapping copy$default(BlazeWidgetItemCustomMapping blazeWidgetItemCustomMapping, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeWidgetItemCustomMapping.key;
        }
        if ((i & 2) != 0) {
            str2 = blazeWidgetItemCustomMapping.value;
        }
        return blazeWidgetItemCustomMapping.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final BlazeWidgetItemCustomMapping copy(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        return new BlazeWidgetItemCustomMapping(key, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemCustomMapping)) {
            return false;
        }
        BlazeWidgetItemCustomMapping blazeWidgetItemCustomMapping = (BlazeWidgetItemCustomMapping) other;
        return Intrinsics.c(this.key, blazeWidgetItemCustomMapping.key) && Intrinsics.c(this.value, blazeWidgetItemCustomMapping.value);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeWidgetItemCustomMapping(key=");
        sb.append(this.key);
        sb.append(", value=");
        return lnb.q(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.key);
        dest.writeString(this.value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    @wx4
    public BlazeWidgetItemCustomMapping(@NotNull BlazeKeysPresets blazeKeysPresets, @NotNull String str) {
        this(blazeKeysPresets.getValue(), str);
        blazeKeysPresets.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeWidgetItemCustomMapping(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset, @NotNull String str) {
        this(blazeExtraInfoKeyPreset.getValue(), str);
        blazeExtraInfoKeyPreset.getClass();
        str.getClass();
    }
}
