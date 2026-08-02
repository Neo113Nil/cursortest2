package io.sentry.android.replay;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ nf.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q INITIAL = new q("INITIAL", 0);
    public static final q STARTED = new q("STARTED", 1);
    public static final q RESUMED = new q("RESUMED", 2);
    public static final q PAUSED = new q("PAUSED", 3);
    public static final q STOPPED = new q("STOPPED", 4);
    public static final q CLOSED = new q("CLOSED", 5);

    private static final /* synthetic */ q[] $values() {
        return new q[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = com.google.android.play.core.appupdate.b.l($values);
    }

    private q(String str, int i5) {
    }

    @NotNull
    public static nf.a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
