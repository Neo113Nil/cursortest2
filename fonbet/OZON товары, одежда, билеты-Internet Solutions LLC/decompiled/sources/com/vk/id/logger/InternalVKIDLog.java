package com.vk.id.logger;

import com.vk.id.logger.LogEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vk/id/logger/InternalVKIDLog;", "Lcom/vk/id/logger/LogEngine;", "<init>", "()V", "", "tag", "Lcom/vk/id/logger/InternalVKIDLogger;", "createLoggerForTag", "(Ljava/lang/String;)Lcom/vk/id/logger/InternalVKIDLogger;", "Lcom/vk/id/logger/LogEngine$LogLevel;", "logLevel", "message", "", "throwable", "", "log", "(Lcom/vk/id/logger/LogEngine$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "logEngine", "Lcom/vk/id/logger/LogEngine;", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDLog implements LogEngine {

    @NotNull
    public static final InternalVKIDLog INSTANCE = new InternalVKIDLog();

    @NotNull
    private static LogEngine logEngine = new InternalVKIDFakeLogEngine();

    private InternalVKIDLog() {
    }

    @NotNull
    public final InternalVKIDLogger createLoggerForTag(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new InternalVKIDLoggerWithTag(tag, this);
    }

    @Override // com.vk.id.logger.LogEngine
    public void log(@NotNull LogEngine.LogLevel logLevel, @NotNull String tag, @NotNull String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        logEngine.log(logLevel, tag, message, throwable);
    }
}
