package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* compiled from: InvalidationTracker.kt */
/* loaded from: classes.dex */
public final class ObservedTableStates {
    public final ReentrantLock a = new ReentrantLock();
    public final long[] b;
    public final boolean[] c;
    public boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvalidationTracker.kt */
    public static final class ObserveOp {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObserveOp[] $VALUES;
        public static final ObserveOp ADD;
        public static final ObserveOp NO_OP;
        public static final ObserveOp REMOVE;

        static {
            ObserveOp observeOp = new ObserveOp("NO_OP", 0);
            NO_OP = observeOp;
            ObserveOp observeOp2 = new ObserveOp("ADD", 1);
            ADD = observeOp2;
            ObserveOp observeOp3 = new ObserveOp(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 2);
            REMOVE = observeOp3;
            ObserveOp[] observeOpArr = {observeOp, observeOp2, observeOp3};
            $VALUES = observeOpArr;
            $ENTRIES = new asp(observeOpArr);
        }

        public ObserveOp() {
            throw null;
        }

        public static ObserveOp valueOf(String str) {
            return (ObserveOp) Enum.valueOf(ObserveOp.class, str);
        }

        public static ObserveOp[] values() {
            return (ObserveOp[]) $VALUES.clone();
        }
    }

    public ObservedTableStates(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }

    public final boolean a(int[] iArr) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.d = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(int[] iArr) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this.d = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }
}
