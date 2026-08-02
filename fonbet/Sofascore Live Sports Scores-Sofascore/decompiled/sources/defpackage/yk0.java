package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class yk0 extends pij {
    public static final yz1 h;
    public static yk0 i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final long l;
    public static final long m;
    public int e;
    public int f = -1;
    public long g;

    static {
        yz1 yz1Var = new yz1(10, false);
        yz1Var.c = new yk0[8];
        h = yz1Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        k = newCondition;
        l = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        m = 60000000000L;
    }

    public final void h() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                fkf.E(this);
                Unit unit = Unit.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            h.f(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
