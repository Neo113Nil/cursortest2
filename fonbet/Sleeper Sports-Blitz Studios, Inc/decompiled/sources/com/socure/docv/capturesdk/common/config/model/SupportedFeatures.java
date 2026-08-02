package com.socure.docv.capturesdk.common.config.model;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.OpenCvUtilsKt;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Resource.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\bJ\r\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/config/model/SupportedFeatures;", "", "()V", "memoryInfo", "Lcom/socure/docv/capturesdk/common/config/model/MemoryInfo;", "openCvSupported", "", "memInfo", "memInfo$capturesdk_productionRelease", "openCv", "openCv$capturesdk_productionRelease", "readMemory", "", "context", "Landroid/content/Context;", "readMemory$capturesdk_productionRelease", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SupportedFeatures {
    private MemoryInfo memoryInfo;
    private final boolean openCvSupported;

    public SupportedFeatures() {
        boolean useOpenCv = OpenCvUtilsKt.useOpenCv();
        this.openCvSupported = useOpenCv;
        ConstantsKt.setOPEN_CV_SUPPORTED(useOpenCv);
    }

    /* renamed from: openCv$capturesdk_productionRelease, reason: from getter */
    public final boolean getOpenCvSupported() {
        return this.openCvSupported;
    }

    /* renamed from: memInfo$capturesdk_productionRelease, reason: from getter */
    public final MemoryInfo getMemoryInfo() {
        return this.memoryInfo;
    }

    public final void readMemory$capturesdk_productionRelease(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            this.memoryInfo = new MemoryInfo((long) (memoryInfo.totalMem / 1000.0d), (long) (memoryInfo.availMem / 1000.0d), (long) (memoryInfo.threshold / 1000.0d), memoryInfo.lowMemory);
            LoggerKt.logDetailed("SDLT_SUP_F", "Read raw memory info - total: " + memoryInfo.totalMem + " | avail: " + memoryInfo.availMem);
            double d = ((double) memoryInfo.totalMem) / 1000000.0d;
            ConstantsKt.setTOTAL_MEMORY(d > 1.0d ? (long) d : -1L);
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_SUP_F", "Ex in reading memory info: " + Log.getStackTraceString(th), null, 4, null);
        }
        LoggerKt.logI("SDLT_SUP_F", "SupportedFeatures - TOTAL_MEMORY (MB): " + ConstantsKt.getTOTAL_MEMORY() + " | memoryInfo (kb): " + this.memoryInfo);
    }
}
