package com.vk.push.common;

/* compiled from: Logger.kt */
/* loaded from: classes.dex */
public interface Logger {

    /* compiled from: Logger.kt */
    public static final class DefaultImpls {
        public static Logger createLogger(Logger logger, Object obj) {
            return logger.createLogger(obj.getClass().getSimpleName());
        }

        public static /* synthetic */ void debug$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.debug(str, th);
        }

        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.error(str, th);
        }

        public static /* synthetic */ void info$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.info(str, th);
        }

        public static /* synthetic */ void verbose$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.verbose(str, th);
        }

        public static /* synthetic */ void warn$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.warn(str, th);
        }
    }

    Logger createLogger(Object obj);

    Logger createLogger(String str);

    void debug(String str, Throwable th);

    void error(String str, Throwable th);

    void info(String str, Throwable th);

    void verbose(String str, Throwable th);

    void warn(String str, Throwable th);
}
