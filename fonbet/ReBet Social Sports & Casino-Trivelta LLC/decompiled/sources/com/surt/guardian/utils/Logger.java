package com.surt.guardian.utils;

import android.util.Log;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f41582a = new Logger();

    /* renamed from: b, reason: collision with root package name */
    public static Level f41583b = Level.INFO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/surt/guardian/utils/Logger$Level;", "", "(Ljava/lang/String;I)V", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "NONE", "securitysdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level VERBOSE = new Level("VERBOSE", 0);
        public static final Level DEBUG = new Level("DEBUG", 1);
        public static final Level INFO = new Level("INFO", 2);
        public static final Level WARN = new Level("WARN", 3);
        public static final Level ERROR = new Level("ERROR", 4);
        public static final Level NONE = new Level("NONE", 5);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{VERBOSE, DEBUG, INFO, WARN, ERROR, NONE};
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Level(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ void c(Logger logger, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        logger.b(str, str2, th2);
    }

    public final void a(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        f41583b.ordinal();
        Level.DEBUG.ordinal();
    }

    public final void b(String tag, String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (f41583b.ordinal() <= Level.ERROR.ordinal()) {
            if (th2 != null) {
                Log.e("SurtGuardian:" + tag, message, th2);
            } else {
                Log.e("SurtGuardian:" + tag, message);
            }
        }
    }

    public final void d(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        f41583b.ordinal();
        Level.INFO.ordinal();
    }

    public final void e(Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        f41583b = level;
    }

    public final void f(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (f41583b.ordinal() <= Level.WARN.ordinal()) {
            Log.w("SurtGuardian:" + tag, message);
        }
    }
}
