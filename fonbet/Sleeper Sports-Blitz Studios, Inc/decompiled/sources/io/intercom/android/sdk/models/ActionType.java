package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmptyState.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "HELP", "MESSAGE", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;

    @SerializedName("help")
    public static final ActionType HELP = new ActionType("HELP", 0);

    @SerializedName("message")
    public static final ActionType MESSAGE = new ActionType("MESSAGE", 1);

    private static final /* synthetic */ ActionType[] $values() {
        return new ActionType[]{HELP, MESSAGE};
    }

    public static EnumEntries<ActionType> getEntries() {
        return $ENTRIES;
    }

    private ActionType(String str, int i) {
    }

    static {
        ActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
