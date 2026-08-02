package com.appsflyer.internal;

import com.appsflyer.exception_manager.ExceptionManager;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1iSDK extends AFLoggerBase {

    @NotNull
    private final AFc1aSDK registerClient;

    public AFg1iSDK(@NotNull AFc1aSDK aFc1aSDK) {
        aFc1aSDK.getClass();
        this.registerClient = aFc1aSDK;
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void e(@NotNull LogTag logTag, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        logTag.getClass();
        str.getClass();
        th.getClass();
        if (z3) {
            if (StringsKt.R(str)) {
                str = "missing label";
            }
            String withTag = withTag(str, logTag);
            ExceptionManager level = this.registerClient.getLevel();
            if (level != null) {
                level.storeNewException(th, withTag);
            }
        }
    }
}
