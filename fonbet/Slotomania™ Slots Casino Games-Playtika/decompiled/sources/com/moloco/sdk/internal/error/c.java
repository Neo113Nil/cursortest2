package com.moloco.sdk.internal.error;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements b {
    public static final int d = 0;
    public final com.moloco.sdk.internal.services.config.a a;
    public final com.moloco.sdk.internal.error.api.a b;
    public final String c;

    public c(com.moloco.sdk.internal.services.config.a configService, com.moloco.sdk.internal.error.api.a errorReportingApi) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(errorReportingApi, "errorReportingApi");
        this.a = configService;
        this.b = errorReportingApi;
        this.c = "ErrorReportingServiceImpl";
    }

    @Override // com.moloco.sdk.internal.error.b
    public void a(String error, a errorMetadata) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMetadata, "errorMetadata");
        if (!this.a.a(d.a)) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.c, "Error reporting is disabled. Tried to report error: " + error, null, false, 12, null);
            return;
        }
        String b = this.a.b(d.a);
        if (b == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.c, "Error reporting is enabled but with invalid url", null, false, 12, null);
        } else {
            this.b.a(error, b, errorMetadata);
        }
    }
}
