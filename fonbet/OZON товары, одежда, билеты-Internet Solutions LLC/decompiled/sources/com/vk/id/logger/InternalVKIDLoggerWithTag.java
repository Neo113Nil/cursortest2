package com.vk.id.logger;

import com.vk.id.logger.LogEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vk/id/logger/InternalVKIDLoggerWithTag;", "Lcom/vk/id/logger/InternalVKIDLogger;", "tag", "", "logEngine", "Lcom/vk/id/logger/LogEngine;", "<init>", "(Ljava/lang/String;Lcom/vk/id/logger/LogEngine;)V", "info", "", "message", "debug", "error", "throwable", "", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDLoggerWithTag implements InternalVKIDLogger {

    @NotNull
    private final LogEngine logEngine;

    @NotNull
    private final String tag;

    public InternalVKIDLoggerWithTag(@NotNull String tag, @NotNull LogEngine logEngine) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(logEngine, "logEngine");
        this.tag = tag;
        this.logEngine = logEngine;
    }

    @Override // com.vk.id.logger.InternalVKIDLogger
    public void debug(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.logEngine.log(LogEngine.LogLevel.DEBUG, this.tag, message, null);
    }

    @Override // com.vk.id.logger.InternalVKIDLogger
    public void error(@NotNull String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.logEngine.log(LogEngine.LogLevel.ERROR, this.tag, message, throwable);
    }

    @Override // com.vk.id.logger.InternalVKIDLogger
    public void info(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.logEngine.log(LogEngine.LogLevel.INFO, this.tag, message, null);
    }
}
