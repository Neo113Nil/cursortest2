package com.vk.core.traffic;

import android.os.SystemClock;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.asu0;
import xsna.fb8;
import xsna.kv2;
import xsna.lip0;
import xsna.s3q0;
import xsna.y560;
import xsna.zrp;
import xsna.zv4;

/* compiled from: TrafficLightAsyncImpl.kt */
/* loaded from: classes.dex */
public final class TrafficLightAsyncImpl implements lip0 {
    public final CopyOnWriteArrayList<y560.a> a = new CopyOnWriteArrayList<>();
    public final fb8 b = new fb8(this, 10);
    public final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public volatile State d = State.BUSY;
    public volatile long e = SystemClock.elapsedRealtime();
    public ScheduledFuture f;
    public volatile boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TrafficLightAsyncImpl.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State BUSY;
        public static final State FREE;
        public static final State FREE_DETECT;

        static {
            State state = new State(SignalingProtocol.HUNGUP_REASON_BUSY, 0);
            BUSY = state;
            State state2 = new State("FREE_DETECT", 1);
            FREE_DETECT = state2;
            State state3 = new State("FREE", 2);
            FREE = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Override // xsna.lip0
    public final CopyOnWriteArrayList a() {
        return this.a;
    }

    /* JADX WARN: Finally extract failed */
    @Override // xsna.y560.a
    public final void b() {
        ScheduledFuture scheduledFuture;
        ReentrantReadWriteLock.ReadLock readLock = this.c.readLock();
        readLock.lock();
        try {
            if (this.d != State.BUSY && ((scheduledFuture = this.f) == null || !scheduledFuture.isCancelled())) {
                ReentrantReadWriteLock reentrantReadWriteLock = this.c;
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    this.d = State.FREE;
                    s3q0 s3q0Var = s3q0.a;
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    L l = L.a;
                    l.getClass();
                    LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"NetworkTrafficMeter: free network! busy time=" + ((elapsedRealtime - this.e) / 1000)});
                    }
                    this.e = elapsedRealtime;
                    if (this.g) {
                        l.getClass();
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l, L.LogType.d, new Object[]{"NetworkTrafficMeter: free network isn't called: VoipCall is active"});
                        }
                    } else {
                        Iterator<y560.a> it = this.a.iterator();
                        while (it.hasNext()) {
                            y560.a next = it.next();
                            ScheduledFuture scheduledFuture2 = this.f;
                            if (scheduledFuture2 != null && scheduledFuture2.isCancelled()) {
                                readLock.unlock();
                                return;
                            }
                            next.b();
                        }
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    readLock.unlock();
                    return;
                } catch (Throwable th) {
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            }
            readLock.unlock();
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    @Override // xsna.y560.a
    public final void c() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"NetworkTrafficMeter: busy network! free time=" + ((elapsedRealtime - this.e) / 1000)});
        }
        this.e = elapsedRealtime;
        Iterator<y560.a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // xsna.lip0
    public final void d() {
        ReentrantReadWriteLock.ReadLock readLock = this.c.readLock();
        readLock.lock();
        try {
            if (this.d == State.BUSY) {
                ReentrantReadWriteLock reentrantReadWriteLock = this.c;
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    asu0.a.getClass();
                    this.f = asu0.o().schedule(new kv2(this.b, 14), 8000L, TimeUnit.MILLISECONDS);
                    this.d = State.FREE_DETECT;
                    s3q0 s3q0Var = s3q0.a;
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                } catch (Throwable th) {
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
            readLock.unlock();
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    @Override // xsna.lip0
    public final boolean d1() {
        return this.d == State.FREE;
    }

    @Override // xsna.lip0
    public final void e() {
        this.g = false;
        ReentrantReadWriteLock.ReadLock readLock = this.c.readLock();
        readLock.lock();
        try {
            if (this.d == State.FREE) {
                b();
            }
            s3q0 s3q0Var = s3q0.a;
            readLock.unlock();
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // xsna.y560.a
    public final boolean f(String str) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"NetworkTrafficMeter: starts to check url for every callback"});
        }
        Iterator<y560.a> it = this.a.iterator();
        while (it.hasNext()) {
            y560.a next = it.next();
            if (next.f(str)) {
                next.c();
            }
        }
        return false;
    }

    @Override // xsna.lip0
    public final void g() {
        this.g = true;
    }

    @Override // xsna.lip0
    public final void h(String str) {
        ReentrantReadWriteLock.ReadLock readLock = this.c.readLock();
        readLock.lock();
        try {
            if (this.d != State.BUSY) {
                ReentrantReadWriteLock reentrantReadWriteLock = this.c;
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    ScheduledFuture scheduledFuture = this.f;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    if (this.d == State.FREE) {
                        asu0.a.getClass();
                        asu0.o().execute(new zv4(8, this, str));
                    }
                    this.d = State.BUSY;
                    s3q0 s3q0Var = s3q0.a;
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                } finally {
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
            readLock.unlock();
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }
}
