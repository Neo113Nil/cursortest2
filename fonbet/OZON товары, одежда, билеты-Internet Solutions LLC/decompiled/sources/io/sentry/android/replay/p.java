package io.sentry.android.replay;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/sentry/android/replay/p;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "STARTED", "RESUMED", "PAUSED", "STOPPED", "CLOSED", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p INITIAL = new p("INITIAL", 0);
    public static final p STARTED = new p("STARTED", 1);
    public static final p RESUMED = new p("RESUMED", 2);
    public static final p PAUSED = new p("PAUSED", 3);
    public static final p STOPPED = new p("STOPPED", 4);
    public static final p CLOSED = new p("CLOSED", 5);

    private static final /* synthetic */ p[] $values() {
        return new p[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private p(String str, int i11) {
    }

    @NotNull
    public static Xc.a<p> getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
