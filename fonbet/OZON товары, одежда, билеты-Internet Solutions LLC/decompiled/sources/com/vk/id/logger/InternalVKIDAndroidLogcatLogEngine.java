package com.vk.id.logger;

import Sc.o;
import android.util.Log;
import com.vk.id.logger.LogEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/vk/id/logger/InternalVKIDAndroidLogcatLogEngine;", "Lcom/vk/id/logger/LogEngine;", "<init>", "()V", "log", "", "logLevel", "Lcom/vk/id/logger/LogEngine$LogLevel;", "tag", "", "message", "throwable", "", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDAndroidLogcatLogEngine implements LogEngine {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogEngine.LogLevel.values().length];
            try {
                iArr[LogEngine.LogLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogEngine.LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogEngine.LogLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.id.logger.LogEngine
    public void log(@NotNull LogEngine.LogLevel logLevel, @NotNull String tag, @NotNull String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        int i11 = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i11 == 1) {
            Log.i(tag, message);
        } else if (i11 == 2) {
            Log.d(tag, message);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            Log.e(tag, message, throwable);
        }
    }
}
