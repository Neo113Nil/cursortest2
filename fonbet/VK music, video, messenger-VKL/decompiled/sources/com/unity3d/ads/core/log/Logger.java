package com.unity3d.ads.core.log;

import xsna.gzs;

/* compiled from: Logger.kt */
/* loaded from: classes14.dex */
public interface Logger {

    /* compiled from: Logger.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.error(str, th);
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.trace(str, th);
        }
    }

    void debug(String str);

    void debug(gzs<String> gzsVar);

    void error(String str, Throwable th);

    LogLevelInternal getLogLevel();

    void info(String str);

    void setLogLevel(LogLevelInternal logLevelInternal);

    void trace(String str, Throwable th);

    void trace(gzs<String> gzsVar);
}
