package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.eia;
import defpackage.iia;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J,\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0007¨\u0006\u0012"}, d2 = {"Lcom/appsflyer/internal/util/SdkUtil;", "", "<init>", "()V", "scheduleJob", "", "scheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "job", "Ljava/lang/Runnable;", "delay", "", "timeUnits", "Ljava/util/concurrent/TimeUnit;", "getMetaFrom", "", "", "paramsMap", "sdk_main_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFj1tSDK {

    @NotNull
    public static final AFj1tSDK registerClient = new AFj1tSDK();

    private AFj1tSDK() {
    }

    public static final void d(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull Runnable runnable, long j, @NotNull TimeUnit timeUnit) {
        scheduledExecutorService.getClass();
        runnable.getClass();
        timeUnit.getClass();
        try {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
        } catch (RejectedExecutionException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "scheduleJob failed with RejectedExecutionException", e, false, false, false, false, 120, null);
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "scheduleJob failed with exception", th, false, false, false, false, 120, null);
        }
    }

    @NotNull
    public static final Map<String, Object> d(@NotNull Map<String, Object> map) {
        map.getClass();
        Object obj = map.get("meta");
        Map<String, Object> map2 = (!(obj instanceof Map) || ((obj instanceof eia) && !(obj instanceof iia))) ? null : (Map) obj;
        if (map2 != null) {
            return map2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        map.put("meta", linkedHashMap);
        return linkedHashMap;
    }
}
