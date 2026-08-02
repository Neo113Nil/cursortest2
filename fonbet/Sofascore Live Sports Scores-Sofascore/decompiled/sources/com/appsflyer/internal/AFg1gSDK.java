package com.appsflyer.internal;

import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1gSDK extends AFLoggerBase {
    private final boolean AFLogger;

    @NotNull
    private final AFc1aSDK d;

    public AFg1gSDK(@NotNull AFc1aSDK aFc1aSDK) {
        aFc1aSDK.getClass();
        this.d = aFc1aSDK;
        this.AFLogger = true;
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void d(@NotNull LogTag logTag, @NotNull String str, boolean z) {
        logTag.getClass();
        str.getClass();
        if (z) {
            this.d.AFLoggerLogLevel().AFLogger("D", extendedMsg(str, logTag));
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void e(@NotNull LogTag logTag, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        logTag.getClass();
        str.getClass();
        th.getClass();
        if (z4) {
            this.d.AFLoggerLogLevel().AFLogger("E", extendedMsg(str, logTag));
        }
        if (z4) {
            this.d.AFLoggerLogLevel().AFKeystoreWrapper(th);
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void force(@NotNull LogTag logTag, @NotNull String str) {
        logTag.getClass();
        str.getClass();
        this.d.AFLoggerLogLevel().AFLogger("F", extendedMsg(str, logTag));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final boolean getShouldExtendMsg() {
        return this.AFLogger;
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void i(@NotNull LogTag logTag, @NotNull String str, boolean z) {
        logTag.getClass();
        str.getClass();
        if (z) {
            this.d.AFLoggerLogLevel().AFLogger("I", extendedMsg(str, logTag));
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void v(@NotNull LogTag logTag, @NotNull String str, boolean z) {
        logTag.getClass();
        str.getClass();
        if (z) {
            this.d.AFLoggerLogLevel().AFLogger("V", extendedMsg(str, logTag));
        }
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void w(@NotNull LogTag logTag, @NotNull String str, boolean z) {
        logTag.getClass();
        str.getClass();
        if (z) {
            this.d.AFLoggerLogLevel().AFLogger("W", extendedMsg(str, logTag));
        }
    }
}
