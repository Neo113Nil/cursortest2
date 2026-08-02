package androidx.work;

import java.util.HashSet;
import java.util.UUID;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bh10;
import xsna.epx;
import xsna.p6j;
import xsna.vu5;

/* compiled from: WorkInfo.kt */
/* loaded from: classes.dex */
public final class WorkInfo {
    public final UUID a;
    public final State b;
    public final HashSet c;
    public final Data d;
    public final Data e;
    public final int f;
    public final int g;
    public final p6j h;
    public final long i;
    public final a j;
    public final long k;
    public final int l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkInfo.kt */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State BLOCKED;
        public static final State CANCELLED;
        public static final State ENQUEUED;
        public static final State FAILED;
        public static final State RUNNING;
        public static final State SUCCEEDED;

        static {
            State state = new State("ENQUEUED", 0);
            ENQUEUED = state;
            State state2 = new State("RUNNING", 1);
            RUNNING = state2;
            State state3 = new State("SUCCEEDED", 2);
            SUCCEEDED = state3;
            State state4 = new State(SignalingProtocol.HUNGUP_REASON_FAILED, 3);
            FAILED = state4;
            State state5 = new State("BLOCKED", 4);
            BLOCKED = state5;
            State state6 = new State("CANCELLED", 5);
            CANCELLED = state6;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6};
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

        public final boolean h() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /* compiled from: WorkInfo.kt */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class.equals(obj.getClass())) {
                a aVar = (a) obj;
                if (aVar.a == this.a && aVar.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb.append(this.a);
            sb.append(", flexIntervalMillis=");
            return vu5.a('}', this.b, sb);
        }
    }

    public WorkInfo(UUID uuid, State state, HashSet hashSet, Data data, Data data2, int i, int i2, p6j p6jVar, long j, a aVar, long j2, int i3) {
        this.a = uuid;
        this.b = state;
        this.c = hashSet;
        this.d = data;
        this.e = data2;
        this.f = i;
        this.g = i2;
        this.h = p6jVar;
        this.i = j;
        this.j = aVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !WorkInfo.class.equals(obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f == workInfo.f && this.g == workInfo.g && this.a.equals(workInfo.a) && this.b == workInfo.b && epx.f(this.d, workInfo.d) && this.h.equals(workInfo.h) && this.i == workInfo.i && epx.f(this.j, workInfo.j) && this.k == workInfo.k && this.l == workInfo.l && this.c.equals(workInfo.c)) {
            return epx.f(this.e, workInfo.e);
        }
        return false;
    }

    public final int hashCode() {
        int a2 = bh10.a((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31, this.i);
        a aVar = this.j;
        return Integer.hashCode(this.l) + bh10.a((a2 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
