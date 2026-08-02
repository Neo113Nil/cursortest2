package ru.ozon.app.android.messenger.initializer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.logger.b;
import ru.ozon.app.android.logger.LoggerExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/messenger/initializer/MessengerNonFatalLogger;", "Lru/ozon/android/messenger/framework/logger/b;", "<init>", "()V", "", "throwable", "", "log", "(Ljava/lang/Throwable;)V", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerNonFatalLogger implements b {
    @Override // ru.ozon.android.messenger.framework.logger.b
    public void log(@NotNull String str) {
        b.a.a(this, str);
    }

    @Override // ru.ozon.android.messenger.framework.logger.c
    public void log(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        LoggerExtKt.sendNonFatal$default(throwable, null, null, null, 14, null);
    }
}
