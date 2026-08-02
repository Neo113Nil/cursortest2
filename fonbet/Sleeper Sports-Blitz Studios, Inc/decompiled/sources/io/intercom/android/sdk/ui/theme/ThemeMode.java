package io.intercom.android.sdk.ui.theme;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ThemeMode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/ui/theme/ThemeMode;", "", "<init>", "(Ljava/lang/String;I)V", "SYSTEM", "LIGHT", "DARK", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ThemeMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ThemeMode[] $VALUES;
    public static final ThemeMode SYSTEM = new ThemeMode("SYSTEM", 0);
    public static final ThemeMode LIGHT = new ThemeMode("LIGHT", 1);
    public static final ThemeMode DARK = new ThemeMode("DARK", 2);

    private static final /* synthetic */ ThemeMode[] $values() {
        return new ThemeMode[]{SYSTEM, LIGHT, DARK};
    }

    public static EnumEntries<ThemeMode> getEntries() {
        return $ENTRIES;
    }

    private ThemeMode(String str, int i) {
    }

    static {
        ThemeMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ThemeMode valueOf(String str) {
        return (ThemeMode) Enum.valueOf(ThemeMode.class, str);
    }

    public static ThemeMode[] values() {
        return (ThemeMode[]) $VALUES.clone();
    }
}
