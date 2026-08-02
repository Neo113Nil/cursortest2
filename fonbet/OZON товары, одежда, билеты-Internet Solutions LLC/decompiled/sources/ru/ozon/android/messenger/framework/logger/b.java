package ru.ozon.android.messenger.framework.logger;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.initializer.MessengerNonFatalLogger;

/* loaded from: classes6.dex */
public interface b extends c {

    /* loaded from: classes10.dex */
    public static final class a {
        public static void a(@NotNull MessengerNonFatalLogger messengerNonFatalLogger, @NotNull String errorString) {
            Intrinsics.checkNotNullParameter(errorString, "errorString");
            messengerNonFatalLogger.log(new Exception(errorString));
        }
    }

    void log(@NotNull String str);
}
