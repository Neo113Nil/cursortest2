package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lp0 {
    public static final Object p = new Object();
    public static ScheduledExecutorService q;
    public static int r;
    public final AudioTrack a;
    public final do0 b;
    public final hpo c;
    public g7h d;
    public final op0 e;
    public final boolean f;
    public final int g;
    public final kp0 h;
    public final vdb i = new vdb(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;

    public lp0(AudioTrack audioTrack, do0 do0Var, hpo hpoVar, tqi tqiVar) {
        int i;
        this.a = audioTrack;
        this.b = do0Var;
        this.c = hpoVar;
        int i2 = do0Var.a;
        boolean P = nik.P(i2);
        this.f = P;
        if (P) {
            i = nik.v(i2) * Integer.bitCount(do0Var.c);
            this.g = i;
        } else {
            i = -1;
            this.g = -1;
        }
        this.e = new op0(new j0l(this, 8), tqiVar, audioTrack, do0Var.a, i, do0Var.f);
        if (hpoVar != null) {
            this.d = new g7h(audioTrack, hpoVar);
        }
        this.h = c() ? new kp0(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        op0 op0Var;
        tqi tqiVar;
        AudioTrack audioTrack;
        long j;
        long j2;
        boolean z;
        boolean z2;
        op0 op0Var2;
        long b;
        int playState;
        int i;
        dp0 dp0Var;
        float f;
        AudioTimestamp audioTimestamp;
        boolean z3;
        float f2;
        int i2;
        float f3;
        Method method;
        op0 op0Var3 = this.e;
        tqi tqiVar2 = op0Var3.b;
        fp0 fp0Var = op0Var3.h;
        AudioTrack audioTrack2 = op0Var3.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = op0Var3.c;
            tqiVar2.getClass();
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - op0Var3.l >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                j = 1000;
                long Z = nik.Z(op0Var3.e, op0Var3.a());
                if (Z != 0) {
                    jArr[op0Var3.s] = nik.F(Z, op0Var3.i) - nanoTime;
                    op0Var3.s = (op0Var3.s + 1) % 10;
                    int i3 = op0Var3.t;
                    if (i3 < 10) {
                        op0Var3.t = i3 + 1;
                    }
                    op0Var3.l = nanoTime;
                    op0Var3.k = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = op0Var3.t;
                        if (i4 >= i5) {
                            break;
                        }
                        int i6 = i4;
                        op0Var3.k = (jArr[i6] / i5) + op0Var3.k;
                        i4 = i6 + 1;
                    }
                } else {
                    op0Var = op0Var3;
                    tqiVar = tqiVar2;
                    audioTrack = audioTrack2;
                }
            } else {
                j = 1000;
            }
            long j3 = op0Var3.n;
            if (op0Var3.g && (method = op0Var3.m) != null && nanoTime - op0Var3.o >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack2, null);
                    String str = nik.a;
                    long intValue = (num.intValue() * j) - op0Var3.f;
                    op0Var3.n = intValue;
                    long max = Math.max(intValue, 0L);
                    op0Var3.n = max;
                    if (max > 10000000) {
                        tgj.d0("Ignoring impossibly large audio latency: " + max);
                        op0Var3.n = 0L;
                    }
                } catch (Exception unused) {
                    op0Var3.m = null;
                }
                op0Var3.o = nanoTime;
            }
            boolean z4 = j3 != op0Var3.n;
            float f4 = op0Var3.i;
            long b2 = op0Var3.b(nanoTime);
            dp0 dp0Var2 = (dp0) fp0Var.h;
            dp0 dp0Var3 = (dp0) fp0Var.h;
            int i7 = fp0Var.a;
            if (z4) {
                dp0Var = dp0Var2;
                j2 = 0;
            } else {
                j2 = 0;
                dp0Var = dp0Var2;
                if (nanoTime - fp0Var.e < fp0Var.d) {
                    op0Var = op0Var3;
                    tqiVar = tqiVar2;
                    audioTrack = audioTrack2;
                    z = false;
                    tqiVar.getClass();
                    long nanoTime2 = System.nanoTime() / j;
                    z2 = fp0Var.b == 2 ? true : z;
                    if (z2) {
                        op0Var2 = op0Var;
                        float f5 = op0Var2.i;
                        dp0 dp0Var4 = (dp0) fp0Var.h;
                        b = nik.C(nanoTime2 - (dp0Var4.b.nanoTime / j), f5) + nik.Z(fp0Var.a, dp0Var4.e);
                    } else {
                        op0Var2 = op0Var;
                        b = op0Var2.b(nanoTime2);
                    }
                    playState = audioTrack.getPlayState();
                    if (playState == 3) {
                        if (z2 || ((i = fp0Var.b) != 0 && i != 1)) {
                            op0Var2.d(b);
                        }
                        long j4 = op0Var2.z;
                        if (j4 != C.TIME_UNSET) {
                            long j5 = b - op0Var2.y;
                            long C = nik.C(nanoTime2 - j4, op0Var2.i);
                            long j6 = op0Var2.y + C;
                            long abs = Math.abs(j6 - b);
                            if (j5 != j2 && abs < 1000000) {
                                long j7 = (C * 10) / 100;
                                b = nik.k(b, j6 - j7, j6 + j7);
                            }
                        }
                        op0Var2.z = nanoTime2;
                        op0Var2.y = b;
                    } else if (playState == 1) {
                        op0Var2.d(b);
                    }
                    return b;
                }
            }
            fp0Var.e = nanoTime;
            dp0 dp0Var5 = dp0Var;
            AudioTrack audioTrack3 = dp0Var5.a;
            AudioTimestamp audioTimestamp2 = dp0Var5.b;
            boolean timestamp = audioTrack3.getTimestamp(audioTimestamp2);
            if (timestamp) {
                f = f4;
                long j8 = audioTimestamp2.framePosition;
                op0Var = op0Var3;
                tqiVar = tqiVar2;
                long j9 = dp0Var5.d;
                if (j9 > j8) {
                    if (dp0Var5.f) {
                        dp0Var5.g += j9;
                        dp0Var5.f = false;
                    } else {
                        dp0Var5.c++;
                    }
                }
                dp0Var5.d = j8;
                dp0Var5.e = j8 + dp0Var5.g + (dp0Var5.c << 32);
            } else {
                op0Var = op0Var3;
                tqiVar = tqiVar2;
                f = f4;
            }
            if (timestamp) {
                j0l j0lVar = (j0l) fp0Var.i;
                long j10 = audioTimestamp2.nanoTime / j;
                audioTimestamp = audioTimestamp2;
                z3 = timestamp;
                float f6 = f;
                long C2 = nik.C(nanoTime - (dp0Var3.b.nanoTime / j), f6) + nik.Z(i7, dp0Var3.e);
                if (Math.abs(j10 - nanoTime) > 5000000) {
                    long j11 = dp0Var5.e;
                    j0lVar.getClass();
                    audioTrack = audioTrack2;
                    StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                    sb.append(j11);
                    sb.append(", ");
                    sb.append(j10);
                    fn0.t(nanoTime, ", ", ", ", sb);
                    sb.append(b2);
                    sb.append(", ");
                    sb.append(((lp0) j0lVar.b).b());
                    tgj.d0(sb.toString());
                    i2 = 4;
                    fp0Var.a(4);
                    f2 = f6;
                } else {
                    audioTrack = audioTrack2;
                    if (Math.abs(C2 - b2) > 5000000) {
                        long j12 = dp0Var5.e;
                        j0lVar.getClass();
                        f3 = f6;
                        StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                        sb2.append(j12);
                        sb2.append(", ");
                        sb2.append(j10);
                        fn0.t(nanoTime, ", ", ", ", sb2);
                        sb2.append(b2);
                        sb2.append(", ");
                        sb2.append(((lp0) j0lVar.b).b());
                        tgj.d0(sb2.toString());
                        i2 = 4;
                        fp0Var.a(4);
                    } else {
                        f3 = f6;
                        i2 = 4;
                        if (fp0Var.b == 4) {
                            fp0Var.a(0);
                        }
                    }
                    f2 = f3;
                }
            } else {
                audioTimestamp = audioTimestamp2;
                z3 = timestamp;
                f2 = f;
                i2 = 4;
                audioTrack = audioTrack2;
            }
            int i8 = fp0Var.b;
            if (i8 == 0) {
                AudioTimestamp audioTimestamp3 = audioTimestamp;
                z = false;
                if (z3) {
                    long j13 = audioTimestamp3.nanoTime;
                    if (j13 / j >= fp0Var.c) {
                        fp0Var.f = dp0Var5.e;
                        fp0Var.g = j13 / j;
                        fp0Var.a(1);
                    }
                } else if (nanoTime - fp0Var.c > 500000) {
                    fp0Var.a(3);
                }
            } else if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != i2) {
                            zzl.s();
                            return j2;
                        }
                    } else if (z3) {
                        z = false;
                        fp0Var.a(0);
                    }
                } else if (!z3) {
                    fp0Var.a(0);
                }
                z = false;
            } else if (z3) {
                long j14 = dp0Var5.e;
                long j15 = fp0Var.f;
                if (j14 > j15) {
                    if (Math.abs((nik.C(nanoTime - (dp0Var3.b.nanoTime / j), f2) + nik.Z(i7, dp0Var3.e)) - (nik.C(nanoTime - fp0Var.g, f2) + nik.Z(i7, j15))) < j) {
                        fp0Var.a(2);
                        z = false;
                    }
                }
                if (nanoTime - fp0Var.c > 2000000) {
                    fp0Var.a(3);
                } else {
                    fp0Var.f = dp0Var5.e;
                    fp0Var.g = audioTimestamp.nanoTime / j;
                }
                z = false;
            } else {
                z = false;
                fp0Var.a(0);
            }
            tqiVar.getClass();
            long nanoTime22 = System.nanoTime() / j;
            if (fp0Var.b == 2) {
            }
            if (z2) {
            }
            playState = audioTrack.getPlayState();
            if (playState == 3) {
            }
            return b;
        }
        op0Var = op0Var3;
        tqiVar = tqiVar2;
        audioTrack = audioTrack2;
        j = 1000;
        j2 = 0;
        z = false;
        tqiVar.getClass();
        long nanoTime222 = System.nanoTime() / j;
        if (fp0Var.b == 2) {
        }
        if (z2) {
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
        }
        return b;
    }

    public final long b() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = nik.a;
        return ((j + j2) - 1) / j2;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final void d(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i, i2);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.a;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        op0 op0Var = this.e;
        op0Var.A = true;
        ((dp0) op0Var.h.h).f = true;
    }

    public final void f(cse cseVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId a = cseVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a.equals(logSessionId)) {
            return;
        }
        this.a.setLogSessionId(a);
    }

    public final boolean g(long j, int i, ByteBuffer byteBuffer) {
        int write;
        boolean z;
        hpo hpoVar;
        mp0 mp0Var;
        i1k i1kVar;
        do0 do0Var = this.b;
        boolean z2 = this.f;
        if (!z2 && this.n == 0) {
            this.n = pn4.i(do0Var.a, byteBuffer);
        }
        vdb vdbVar = this.i;
        vdbVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = (Thread) vdbVar.c;
        AudioTrack audioTrack = this.a;
        if (currentThread == thread) {
            b();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.o;
            this.o = underrunCount;
            if (z3) {
                vdbVar.g(-1, new a70(10));
            }
        }
        int remaining = byteBuffer.remaining();
        if (do0Var.d) {
            if (j == Long.MIN_VALUE) {
                j = this.m;
            } else {
                this.m = j;
            }
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j * 1000);
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write >= 0) {
            z = write == remaining;
            if (z2) {
                this.k += write;
                return z;
            }
            if (z) {
                this.l = (this.n * i) + this.l;
            }
            return z;
        }
        z = write == -6 || write == -32;
        if (z && (hpoVar = this.c) != null && (i1kVar = (mp0Var = (mp0) hpoVar.a).h) != null) {
            jn0 jn0Var = jn0.f;
            mp0Var.g = jn0Var;
            i1kVar.d(jn0Var);
        }
        throw new xn0(write, z);
    }
}
