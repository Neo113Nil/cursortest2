package com.unity3d.ads.core.log;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import defpackage.a70;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH&J\u001c\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u001c\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0016\u0010\u0012\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/log/Logger;", "", "logLevel", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevelInternal;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevelInternal;)V", "info", "", PglCryptUtils.KEY_MESSAGE, "", "debug", "fb", "Lkotlin/Function0;", "error", "e", "", "trace", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Logger {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: error");
                return;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.error(str, th);
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: trace");
                return;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.trace(str, th);
        }
    }

    void debug(@NotNull String message);

    void debug(@NotNull Function0<String> fb);

    void error(@NotNull String message, @Nullable Throwable e);

    @NotNull
    LogLevelInternal getLogLevel();

    void info(@NotNull String message);

    void setLogLevel(@NotNull LogLevelInternal logLevelInternal);

    void trace(@NotNull String message, @Nullable Throwable e);

    void trace(@NotNull Function0<String> fb);
}
