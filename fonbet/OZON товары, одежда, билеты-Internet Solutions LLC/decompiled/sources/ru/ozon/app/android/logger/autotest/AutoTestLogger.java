package ru.ozon.app.android.logger.autotest;

import android.util.Log;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.OzonLogger;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/logger/autotest/AutoTestLogger;", "Lru/ozon/app/android/logger/OzonLogger;", "<init>", "()V", "", "priority", "", "tag", "msg", "", "log", "(ILjava/lang/String;Ljava/lang/String;)V", "", "isLogToSentry", "Z", "()Z", "setLogToSentry", "(Z)V", "logger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoTestLogger implements OzonLogger {
    private boolean isLogToSentry;

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void log(int priority, String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Intrinsics.d(tag, "AutoTest")) {
            Log.println(priority, tag, msg);
        }
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void logEvent(@NotNull String str, @NotNull Map<String, String> map, @NotNull String str2, int i11) {
        OzonLogger.DefaultImpls.logEvent(this, str, map, str2, i11);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void logException(@NotNull Throwable th2) {
        OzonLogger.DefaultImpls.logException(this, th2);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void putKey(@NotNull String str, Boolean bool) {
        OzonLogger.DefaultImpls.putKey(this, str, bool);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void setLogToSentry(boolean z11) {
        this.isLogToSentry = z11;
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void setTag(@NotNull String str, @NotNull String str2) {
        OzonLogger.DefaultImpls.setTag(this, str, str2);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void setUserId(String str) {
        OzonLogger.DefaultImpls.setUserId(this, str);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void putKey(@NotNull String str, Long l11) {
        OzonLogger.DefaultImpls.putKey(this, str, l11);
    }

    @Override // ru.ozon.app.android.logger.OzonLogger
    public void putKey(@NotNull String str, String str2) {
        OzonLogger.DefaultImpls.putKey(this, str, str2);
    }
}
