package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HomeV2Response.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/BadgeType;", "", "<init>", "(Ljava/lang/String;I)V", "UNREAD", "PASSIVE", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BadgeType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BadgeType[] $VALUES;

    @SerializedName("unread")
    public static final BadgeType UNREAD = new BadgeType("UNREAD", 0);

    @SerializedName("passive")
    public static final BadgeType PASSIVE = new BadgeType("PASSIVE", 1);

    private static final /* synthetic */ BadgeType[] $values() {
        return new BadgeType[]{UNREAD, PASSIVE};
    }

    public static EnumEntries<BadgeType> getEntries() {
        return $ENTRIES;
    }

    private BadgeType(String str, int i) {
    }

    static {
        BadgeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BadgeType valueOf(String str) {
        return (BadgeType) Enum.valueOf(BadgeType.class, str);
    }

    public static BadgeType[] values() {
        return (BadgeType[]) $VALUES.clone();
    }
}
