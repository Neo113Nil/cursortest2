package ai.verisoul.sdk.logger;

import ai.verisoul.sdk.VerisoulEnvironment;
import android.util.Log;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ \u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0004J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u001e\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lai/verisoul/sdk/logger/Logger;", "", "()V", "isDebugMode", "", "loggerService", "Lai/verisoul/sdk/logger/LoggerService;", "debug", "", "tag", "", "message", "error", "info", "init", "environment", "Lai/verisoul/sdk/VerisoulEnvironment;", "projectId", "isDebug", "initializeLoggerService", "metricLog", "name", EventKeys.VALUE_KEY, "", "updateSessionId", "sessionId", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Logger {

    @NotNull
    public static final Logger INSTANCE = new Logger();
    private static boolean isDebugMode;

    @Nullable
    private static LoggerService loggerService;

    private Logger() {
    }

    public static /* synthetic */ void init$default(Logger logger, VerisoulEnvironment verisoulEnvironment, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        logger.init(verisoulEnvironment, str, z10);
    }

    private final void initializeLoggerService(VerisoulEnvironment environment, String projectId) {
        LoggerService loggerService2 = new LoggerService();
        loggerService = loggerService2;
        loggerService2.initialize(environment, projectId);
    }

    public final void debug(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        LoggerService loggerService2 = loggerService;
        if (loggerService2 != null) {
            loggerService2.info(tag + " " + message, new Object[0]);
        }
    }

    public final void error(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (isDebugMode) {
            Log.e(tag, message);
        }
        LoggerService loggerService2 = loggerService;
        if (loggerService2 != null) {
            loggerService2.error(tag + " " + message, new Object[0]);
        }
    }

    public final void info(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (isDebugMode) {
            Log.i(tag, message);
        }
        LoggerService loggerService2 = loggerService;
        if (loggerService2 != null) {
            loggerService2.info(tag + " " + message, new Object[0]);
        }
    }

    public final void init(@NotNull VerisoulEnvironment environment, @NotNull String projectId, boolean isDebug) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        isDebugMode = Intrinsics.areEqual(environment, VerisoulEnvironment.Dev.INSTANCE) || isDebug;
        initializeLoggerService(environment, projectId);
    }

    public final void metricLog(@NotNull String tag, @NotNull String name, long value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(name, "name");
        if (isDebugMode) {
            Log.i(tag, name);
        }
        String str = tag + " " + name;
        LoggerService loggerService2 = loggerService;
        if (loggerService2 != null) {
            loggerService2.recordMetric(str, value, MapsKt.emptyMap());
        }
    }

    public final void updateSessionId(@NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        LoggerService loggerService2 = loggerService;
        if (loggerService2 != null) {
            loggerService2.setSessionId(sessionId);
        }
    }
}
