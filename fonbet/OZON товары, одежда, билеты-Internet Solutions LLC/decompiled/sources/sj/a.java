package sj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;

/* loaded from: classes6.dex */
public final class a extends ru.ozon.android.ozonLogger.core.d<AndroidLogEntry> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String team, @NotNull String group, Boolean bool) {
        super(team, group, bool);
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(group, "group");
    }

    @Override // ru.ozon.android.ozonLogger.core.d
    public final void a(AndroidLogEntry logEntry) {
        Intrinsics.checkNotNullParameter(logEntry, "logEntry");
        super.a(logEntry);
        logEntry.setTeam$ozon_logger_android_release(c());
        logEntry.setGroup$ozon_logger_android_release(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String team, @NotNull String group, Boolean bool, String str) {
        this(team, group, bool);
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(group, "group");
        d(str);
    }
}
