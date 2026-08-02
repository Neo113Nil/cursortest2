package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2835o {
    public static final String a = "DEC_FAILED_TO_LOAD";
    public static final String b = "DEC_LOADED_WITH_NO_APP_ICON";
    public static final String c = "DECLoaderImpl";

    public static final void b(String str) {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, c, str, false, 4, null);
    }

    public static final InterfaceC2833m a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, com.moloco.sdk.internal.error.b errorReportingService) {
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        return new C2834n(mediaCacheRepository, errorReportingService);
    }
}
