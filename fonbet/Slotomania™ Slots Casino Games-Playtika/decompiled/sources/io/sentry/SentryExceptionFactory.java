package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes7.dex */
public final class SentryExceptionFactory {
    private final SentryStackTraceFactory sentryStackTraceFactory;

    public SentryExceptionFactory(SentryStackTraceFactory sentryStackTraceFactory) {
        this.sentryStackTraceFactory = (SentryStackTraceFactory) Objects.requireNonNull(sentryStackTraceFactory, "The SentryStackTraceFactory is required.");
    }

    public List<SentryException> getSentryExceptionsFromThread(SentryThread sentryThread, Mechanism mechanism, Throwable th) {
        SentryStackTrace stacktrace = sentryThread.getStacktrace();
        if (stacktrace == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(getSentryException(th, mechanism, sentryThread.getId(), stacktrace.getFrames(), true));
        return arrayList;
    }

    public List<SentryException> getSentryExceptions(Throwable th) {
        return getSentryExceptions(extractExceptionQueue(th));
    }

    private List<SentryException> getSentryExceptions(Deque<SentryException> deque) {
        return new ArrayList(deque);
    }

    private SentryException getSentryException(Throwable th, Mechanism mechanism, Long l, List<SentryStackFrame> list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        SentryException sentryException = new SentryException();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            SentryStackTrace sentryStackTrace = new SentryStackTrace(list);
            if (z) {
                sentryStackTrace.setSnapshot(true);
            }
            sentryException.setStacktrace(sentryStackTrace);
        }
        sentryException.setThreadId(l);
        sentryException.setType(name);
        sentryException.setMechanism(mechanism);
        sentryException.setModule(name2);
        sentryException.setValue(message);
        return sentryException;
    }

    Deque<SentryException> extractExceptionQueue(Throwable th) {
        Thread currentThread;
        Mechanism mechanism;
        Throwable th2;
        boolean z;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th != null && hashSet.add(th)) {
            boolean z2 = false;
            if (th instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th;
                mechanism = exceptionMechanismException.getExceptionMechanism();
                Throwable throwable = exceptionMechanismException.getThrowable();
                currentThread = exceptionMechanismException.getThread();
                z = exceptionMechanismException.isSnapshot();
                th2 = throwable;
            } else {
                currentThread = Thread.currentThread();
                mechanism = null;
                th2 = th;
                z = false;
            }
            Mechanism mechanism2 = mechanism;
            if (mechanism2 != null && Boolean.FALSE.equals(mechanism2.isHandled())) {
                z2 = true;
            }
            arrayDeque.addFirst(getSentryException(th2, mechanism2, Long.valueOf(currentThread.getId()), this.sentryStackTraceFactory.getStackFrames(th2.getStackTrace(), z2), z));
            th = th2.getCause();
        }
        return arrayDeque;
    }
}
