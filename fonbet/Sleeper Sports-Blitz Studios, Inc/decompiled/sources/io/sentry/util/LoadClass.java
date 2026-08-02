package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.LazyEvaluator;

/* loaded from: classes9.dex */
public class LoadClass {
    public Class<?> loadClass(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(SentryLevel.INFO, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(SentryLevel.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(SentryLevel.ERROR, "Failed to initialize " + str, th);
            return null;
        }
    }

    public boolean isClassAvailable(String str, ILogger iLogger) {
        return loadClass(str, iLogger) != null;
    }

    public boolean isClassAvailable(String str, SentryOptions sentryOptions) {
        return isClassAvailable(str, sentryOptions != null ? sentryOptions.getLogger() : null);
    }

    public LazyEvaluator<Boolean> isClassAvailableLazy(final String str, final ILogger iLogger) {
        return new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.util.LoadClass$$ExternalSyntheticLambda0
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return LoadClass.this.m13451lambda$isClassAvailableLazy$0$iosentryutilLoadClass(str, iLogger);
            }
        });
    }

    /* renamed from: lambda$isClassAvailableLazy$0$io-sentry-util-LoadClass, reason: not valid java name */
    /* synthetic */ Boolean m13451lambda$isClassAvailableLazy$0$iosentryutilLoadClass(String str, ILogger iLogger) {
        return Boolean.valueOf(isClassAvailable(str, iLogger));
    }

    public LazyEvaluator<Boolean> isClassAvailableLazy(final String str, final SentryOptions sentryOptions) {
        return new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.util.LoadClass$$ExternalSyntheticLambda1
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return LoadClass.this.m13452lambda$isClassAvailableLazy$1$iosentryutilLoadClass(str, sentryOptions);
            }
        });
    }

    /* renamed from: lambda$isClassAvailableLazy$1$io-sentry-util-LoadClass, reason: not valid java name */
    /* synthetic */ Boolean m13452lambda$isClassAvailableLazy$1$iosentryutilLoadClass(String str, SentryOptions sentryOptions) {
        return Boolean.valueOf(isClassAvailable(str, sentryOptions));
    }
}
