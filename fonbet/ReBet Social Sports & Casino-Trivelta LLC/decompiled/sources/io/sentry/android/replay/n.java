package io.sentry.android.replay;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n INITIAL = new n("INITIAL", 0);
    public static final n STARTED = new n("STARTED", 1);
    public static final n RESUMED = new n("RESUMED", 2);
    public static final n PAUSED = new n("PAUSED", 3);
    public static final n STOPPED = new n("STOPPED", 4);
    public static final n CLOSED = new n("CLOSED", 5);

    private static final /* synthetic */ n[] $values() {
        return new n[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private n(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<n> getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
