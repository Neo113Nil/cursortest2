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
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
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
        return extractExceptionQueueInternal(th, new AtomicInteger(-1), new HashSet<>(), new ArrayDeque(), null);
    }

    Deque<SentryException> extractExceptionQueueInternal(Throwable th, AtomicInteger atomicInteger, HashSet<Throwable> hashSet, Deque<SentryException> deque, String str) {
        Mechanism mechanism;
        Thread currentThread;
        Throwable th2;
        boolean z;
        Deque<SentryException> deque2 = deque;
        String str2 = str;
        int i = atomicInteger.get();
        Throwable th3 = th;
        while (th3 != null) {
            HashSet<Throwable> hashSet2 = hashSet;
            if (!hashSet2.add(th3)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i2 = 0;
            if (th3 instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th3;
                mechanism = exceptionMechanismException.getExceptionMechanism();
                Throwable throwable = exceptionMechanismException.getThrowable();
                currentThread = exceptionMechanismException.getThread();
                z = exceptionMechanismException.isSnapshot();
                th2 = throwable;
            } else {
                mechanism = new Mechanism();
                currentThread = Thread.currentThread();
                th2 = th3;
                z = false;
            }
            Mechanism mechanism2 = mechanism;
            deque2.addFirst(getSentryException(th2, mechanism2, Long.valueOf(currentThread.getId()), this.sentryStackTraceFactory.getStackFrames(th2.getStackTrace(), Boolean.FALSE.equals(mechanism2.isHandled())), z));
            if (mechanism2.getType() == null) {
                mechanism2.setType(str2);
            }
            if (atomicInteger.get() >= 0) {
                mechanism2.setParentId(Integer.valueOf(i));
            }
            int incrementAndGet = atomicInteger.incrementAndGet();
            mechanism2.setExceptionId(Integer.valueOf(incrementAndGet));
            Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i2 < length) {
                    extractExceptionQueueInternal(suppressed[i2], atomicInteger, hashSet2, deque2, "suppressed");
                    i2++;
                    hashSet2 = hashSet;
                    deque2 = deque;
                }
            }
            th3 = th2.getCause();
            str2 = null;
            deque2 = deque;
            i = incrementAndGet;
        }
        return deque;
    }
}
