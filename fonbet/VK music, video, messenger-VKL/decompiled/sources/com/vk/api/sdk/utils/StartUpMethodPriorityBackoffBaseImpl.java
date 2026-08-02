package com.vk.api.sdk.utils;

import com.vk.api.sdk.utils.log.Logger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import xsna.asp;
import xsna.bpn0;
import xsna.d13;
import xsna.jz2;
import xsna.n03;
import xsna.nid0;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: StartUpMethodPriorityBackoffBaseImpl.kt */
/* loaded from: classes15.dex */
public final class StartUpMethodPriorityBackoffBaseImpl implements jz2 {
    public static final AtomicInteger n = new AtomicInteger();
    public final n03 a;
    public final Collection<String> b;
    public final Collection<String> c;
    public final boolean d;
    public final Mode e;
    public final d13 f;
    public volatile boolean l;
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashSet h = new LinkedHashSet();
    public final LinkedHashSet i = new LinkedHashSet();
    public final ReentrantLock j = new ReentrantLock();
    public final LinkedHashMap k = new LinkedHashMap();
    public final bpn0 m = new bpn0(new nid0(this, 9));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StartUpMethodPriorityBackoffBaseImpl.kt */
    /* loaded from: classes.dex */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode DO_NOT_WAIT;
        public static final Mode WAIT_REQUESTS;
        public static final Mode WAIT_RESPONSES;

        static {
            Mode mode = new Mode("DO_NOT_WAIT", 0);
            DO_NOT_WAIT = mode;
            Mode mode2 = new Mode("WAIT_REQUESTS", 1);
            WAIT_REQUESTS = mode2;
            Mode mode3 = new Mode("WAIT_RESPONSES", 2);
            WAIT_RESPONSES = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public StartUpMethodPriorityBackoffBaseImpl(n03 n03Var, Collection collection, Set set, boolean z, Mode mode, d13 d13Var) {
        this.a = n03Var;
        this.b = collection;
        this.c = set;
        this.d = z;
        this.e = mode;
        this.f = d13Var;
    }

    public static void e(Logger logger, String str) {
        logger.a(Logger.LogLevel.DEBUG, "StartUpMethodPriorityBackoffBaseImpl: " + str, null);
    }

    @Override // xsna.jz2
    public final int a() {
        int incrementAndGet = n.incrementAndGet();
        ReentrantLock reentrantLock = this.j;
        reentrantLock.lock();
        try {
            this.g.put(Integer.valueOf(incrementAndGet), reentrantLock.newCondition());
            s3q0 s3q0Var = s3q0.a;
            return incrementAndGet;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.jz2
    public final void b(int i, String str) {
        ReentrantLock reentrantLock = this.j;
        reentrantLock.lock();
        try {
            Condition condition = (Condition) this.g.get(Integer.valueOf(i));
            if (condition == null) {
                reentrantLock.unlock();
                return;
            }
            this.k.put(Integer.valueOf(i), str);
            if (c(str)) {
                e(this.f, "method " + str + " will wait, queue.size = " + f().size() + ", wasCleared = " + this.l);
                if (this.d && this.c.contains(str)) {
                    e(this.f, "method " + str + " will wait for start up completion");
                    this.h.add(Integer.valueOf(i));
                    condition.await();
                    e(this.f, "method " + str + " awoke after waiting for start up completion");
                } else if (this.e == Mode.WAIT_RESPONSES) {
                    e(this.f, "method " + str + " will wait for priority requests completion");
                    condition.await();
                    e(this.f, "method " + str + " awoke after waiting for priority requests completion");
                } else {
                    e(this.f, "method " + str + " will wait for 500 ms");
                    condition.await(500L, TimeUnit.MILLISECONDS);
                    e(this.f, "method " + str + " awoke after waiting for 500 ms");
                }
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // xsna.jz2
    public final boolean c(String str) {
        ReentrantLock reentrantLock = this.j;
        reentrantLock.lock();
        try {
            boolean z = true;
            if (!this.l && this.d && this.c.contains(str)) {
                return true;
            }
            if (this.e != Mode.DO_NOT_WAIT && !this.b.contains(str)) {
                if (f().isEmpty() || f().contains(str)) {
                    z = false;
                }
                if (!z && this.e == Mode.WAIT_REQUESTS) {
                    g(str);
                }
                return z;
            }
            g(str);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.jz2
    public final void d(String str) {
        ReentrantLock reentrantLock = this.j;
        reentrantLock.lock();
        try {
            g(str);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final CopyOnWriteArraySet<String> f() {
        return (CopyOnWriteArraySet) this.m.getValue();
    }

    public final void g(String str) {
        d13 d13Var = this.f;
        e(d13Var, "notifyMethodCall: " + str);
        if (f().remove(str)) {
            e(d13Var, "removed method " + str + " from priority queue");
        }
        if (f().isEmpty()) {
            e(d13Var, "priority queue is empty, notifying");
            h(true);
        }
    }

    public final void h(boolean z) {
        String str = "notifying " + (z ? "light only" : "all") + " locks";
        d13 d13Var = this.f;
        e(d13Var, str);
        LinkedHashMap linkedHashMap = this.g;
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Integer valueOf = Integer.valueOf(intValue);
            LinkedHashSet linkedHashSet = this.i;
            if (!linkedHashSet.contains(valueOf) && (!z || !this.h.contains(Integer.valueOf(intValue)))) {
                e(d13Var, "notifying lock for " + this.k.get(Integer.valueOf(intValue)));
                Condition condition = (Condition) linkedHashMap.get(Integer.valueOf(intValue));
                if (condition != null) {
                    condition.signalAll();
                }
                linkedHashSet.add(Integer.valueOf(intValue));
            }
        }
    }

    @Override // xsna.jz2
    public final boolean isActive() {
        if (f().isEmpty()) {
            return !this.l && this.d;
        }
        return true;
    }
}
