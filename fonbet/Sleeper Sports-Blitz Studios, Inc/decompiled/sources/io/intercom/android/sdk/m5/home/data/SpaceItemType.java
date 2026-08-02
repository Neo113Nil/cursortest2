package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HomeV2Response.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/SpaceItemType;", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGES", "HELP", "TICKETS", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SpaceItemType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SpaceItemType[] $VALUES;

    @SerializedName("messages")
    public static final SpaceItemType MESSAGES = new SpaceItemType("MESSAGES", 0);

    @SerializedName("help")
    public static final SpaceItemType HELP = new SpaceItemType("HELP", 1);

    @SerializedName("tickets")
    public static final SpaceItemType TICKETS = new SpaceItemType("TICKETS", 2);

    private static final /* synthetic */ SpaceItemType[] $values() {
        return new SpaceItemType[]{MESSAGES, HELP, TICKETS};
    }

    public static EnumEntries<SpaceItemType> getEntries() {
        return $ENTRIES;
    }

    private SpaceItemType(String str, int i) {
    }

    static {
        SpaceItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SpaceItemType valueOf(String str) {
        return (SpaceItemType) Enum.valueOf(SpaceItemType.class, str);
    }

    public static SpaceItemType[] values() {
        return (SpaceItemType[]) $VALUES.clone();
    }
}
