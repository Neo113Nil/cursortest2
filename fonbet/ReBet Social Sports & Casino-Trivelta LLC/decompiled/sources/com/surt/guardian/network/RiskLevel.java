package com.surt.guardian.network;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/surt/guardian/network/RiskLevel;", "", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH", "BLOCKED", "UNKNOWN", "securitysdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RiskLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RiskLevel[] $VALUES;
    public static final RiskLevel LOW = new RiskLevel("LOW", 0);
    public static final RiskLevel MEDIUM = new RiskLevel("MEDIUM", 1);
    public static final RiskLevel HIGH = new RiskLevel("HIGH", 2);
    public static final RiskLevel BLOCKED = new RiskLevel("BLOCKED", 3);
    public static final RiskLevel UNKNOWN = new RiskLevel("UNKNOWN", 4);

    private static final /* synthetic */ RiskLevel[] $values() {
        return new RiskLevel[]{LOW, MEDIUM, HIGH, BLOCKED, UNKNOWN};
    }

    static {
        RiskLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RiskLevel(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<RiskLevel> getEntries() {
        return $ENTRIES;
    }

    public static RiskLevel valueOf(String str) {
        return (RiskLevel) Enum.valueOf(RiskLevel.class, str);
    }

    public static RiskLevel[] values() {
        return (RiskLevel[]) $VALUES.clone();
    }
}
