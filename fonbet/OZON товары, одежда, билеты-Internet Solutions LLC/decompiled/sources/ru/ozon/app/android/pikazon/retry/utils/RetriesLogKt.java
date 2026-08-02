package ru.ozon.app.android.pikazon.retry.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.logging.PikazonLogger;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"retriesLog", "", "message", "", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RetriesLogKt {
    public static final void retriesLog(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        PikazonLogger.INSTANCE.log("Retry | " + message);
    }
}
