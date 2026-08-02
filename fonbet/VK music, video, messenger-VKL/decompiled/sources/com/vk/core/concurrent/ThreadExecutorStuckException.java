package com.vk.core.concurrent;

import com.vk.metrics.trackers.CriticalException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import xsna.adx0;
import xsna.gk2;
import xsna.ho8;
import xsna.j5g;
import xsna.jw5;

/* compiled from: ThreadExecutorStuckException.kt */
/* loaded from: classes17.dex */
public final class ThreadExecutorStuckException extends CriticalException {
    public static final /* synthetic */ int b = 0;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        public final /* synthetic */ long b;

        public a(long j) {
            this.b = j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            long j = ((adx0) t2).c;
            long j2 = this.b;
            return jw5.b(Long.valueOf(j2 - j), Long.valueOf(j2 - ((adx0) t).c));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ThreadExecutorStuckException(Collection<adx0> collection) {
        super(ho8.a(r0, j5g.g0(j5g.D0(new a(r1), r3), null, null, null, 0, new gk2(r1, 2), 31), ']'));
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder("tasks = [");
        long nanoTime = System.nanoTime();
        Collection<adx0> collection2 = collection;
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Task list should not be empty");
        }
        long nanoTime2 = System.nanoTime();
        Iterator<T> it = collection2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = nanoTime2 - ((adx0) next).c;
            do {
                Object next2 = it.next();
                long j2 = nanoTime2 - ((adx0) next2).c;
                if (j < j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        adx0 adx0Var = (adx0) next;
        Thread thread = adx0Var.d;
        setStackTrace((thread == null || (stackTrace = thread.getStackTrace()) == null) ? (StackTraceElement[]) adx0Var.e.toArray(new StackTraceElement[0]) : stackTrace);
    }
}
