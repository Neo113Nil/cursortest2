package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.ase;
import defpackage.c7p;
import defpackage.cp0;
import defpackage.fjn;
import defpackage.fn0;
import defpackage.fp0;
import defpackage.g7p;
import defpackage.kp0;
import defpackage.qpn;
import defpackage.y9f;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztd implements zzqz {
    public static final Object o = new Object();
    public static ScheduledExecutorService p;
    public static int q;
    public final AudioTrack a;
    public final zzri b;
    public final zzsq c;
    public qpn d;
    public final g7p e;
    public final boolean f;
    public final int g;
    public final kp0 h;
    public final zzeg i = new zzeg(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;

    public zztd(AudioTrack audioTrack, zzri zzriVar, zzsq zzsqVar, zzdp zzdpVar) {
        int i;
        this.a = audioTrack;
        this.b = zzriVar;
        this.c = zzsqVar;
        boolean d = zzfm.d(zzriVar.a);
        this.f = d;
        if (d) {
            i = zzfm.f(zzriVar.a) * Integer.bitCount(zzriVar.c);
            this.g = i;
        } else {
            i = -1;
            this.g = -1;
        }
        this.e = new g7p(new fjn(this, 29), zzdpVar, audioTrack, zzriVar.a, i, zzriVar.d);
        if (zzsqVar != null) {
            this.d = new qpn(audioTrack, zzsqVar);
        }
        this.h = b() ? new kp0(this) : null;
    }

    public final boolean a(int i, ByteBuffer byteBuffer) {
        zzsq zzsqVar;
        zzti zztiVar;
        zzqr zzqrVar;
        boolean z = this.f;
        if (!z && this.m == 0) {
            this.m = zztw.c(this.b.a, byteBuffer);
        }
        zzeg zzegVar = this.i;
        zzegVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = zzegVar.a;
        AudioTrack audioTrack = this.a;
        if (currentThread == thread) {
            g();
            int underrunCount = audioTrack.getUnderrunCount();
            int i2 = this.n;
            this.n = underrunCount;
            if (underrunCount > i2) {
                zzegVar.c(-1, y9f.q);
                zzegVar.d();
            }
        }
        int remaining = byteBuffer.remaining();
        int write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write >= 0) {
            r3 = write == remaining;
            if (z) {
                this.k += write;
                return r3;
            }
            if (r3) {
                this.l = (this.m * i) + this.l;
            }
            return r3;
        }
        if (write != -6 && write != -32) {
            r3 = false;
        }
        if (r3 && (zzsqVar = this.c) != null && (zzqrVar = (zztiVar = ((c7p) zzsqVar).a).f) != null) {
            zzql zzqlVar = zzql.f;
            zztiVar.e = zzqlVar;
            zzqrVar.b(zzqlVar);
        }
        throw new zzqy(write, r3);
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final long c() {
        return this.a.getBufferSizeInFrames();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d() {
        g7p g7pVar;
        zzdp zzdpVar;
        AudioTrack audioTrack;
        long j;
        long j2;
        fp0 fp0Var;
        int i;
        int i2;
        g7p g7pVar2;
        long b;
        int playState;
        int i3;
        int i4;
        long j3;
        int i5;
        AudioTrack audioTrack2;
        boolean timestamp;
        fp0 fp0Var2;
        boolean z;
        AudioTimestamp audioTimestamp;
        int i6;
        int i7;
        int i8;
        Method method;
        Method method2;
        Integer num;
        int i9;
        g7p g7pVar3 = this.e;
        fp0 fp0Var3 = g7pVar3.h;
        zzdp zzdpVar2 = g7pVar3.b;
        float f = g7pVar3.i;
        AudioTrack audioTrack3 = g7pVar3.d;
        if (audioTrack3.getPlayState() == 3) {
            long zzc = zzdpVar2.zzc() / 1000;
            j = 1000;
            if (zzc - g7pVar3.l >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                long v = zzfm.v(g7pVar3.e, g7pVar3.c());
                if (v != 0) {
                    long[] jArr = g7pVar3.c;
                    int i10 = g7pVar3.s;
                    if (f == 1.0f) {
                        i9 = i10;
                        i4 = 1;
                    } else {
                        i9 = i10;
                        i4 = 1;
                        v = Math.round(v / f);
                    }
                    jArr[i9] = v - zzc;
                    g7pVar3.s = (g7pVar3.s + 1) % 10;
                    int i11 = g7pVar3.t;
                    if (i11 < 10) {
                        g7pVar3.t = i11 + 1;
                    }
                    g7pVar3.l = zzc;
                    g7pVar3.k = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = g7pVar3.t;
                        if (i12 >= i13) {
                            break;
                        }
                        g7pVar3.k = (jArr[i12] / i13) + g7pVar3.k;
                        i12++;
                    }
                } else {
                    g7pVar = g7pVar3;
                    zzdpVar = zzdpVar2;
                    audioTrack = audioTrack3;
                }
            } else {
                i4 = 1;
            }
            long j4 = g7pVar3.n;
            if (!g7pVar3.g || (method = g7pVar3.m) == null || zzc - g7pVar3.o < 500000) {
                j3 = 500000;
            } else {
                try {
                    num = (Integer) method.invoke(audioTrack3, null);
                    String str = zzfm.a;
                    j3 = 500000;
                } catch (Exception unused) {
                    j3 = 500000;
                    method2 = null;
                }
                try {
                    long intValue = (num.intValue() * 1000) - g7pVar3.f;
                    g7pVar3.n = intValue;
                    long max = Math.max(intValue, 0L);
                    g7pVar3.n = max;
                    if (max > 10000000) {
                        StringBuilder sb = new StringBuilder(String.valueOf(max).length() + 41);
                        sb.append("Ignoring impossibly large audio latency: ");
                        sb.append(max);
                        zzeh.c(sb.toString());
                        g7pVar3.n = 0L;
                    }
                } catch (Exception unused2) {
                    method2 = null;
                    g7pVar3.m = method2;
                    g7pVar3.o = zzc;
                    if (j4 == g7pVar3.n) {
                    }
                    long b2 = g7pVar3.b(zzc);
                    fjn fjnVar = (fjn) fp0Var3.i;
                    int i14 = fp0Var3.a;
                    cp0 cp0Var = (cp0) fp0Var3.h;
                    if (i5 != 0) {
                    }
                    fp0Var3.e = zzc;
                    AudioTrack audioTrack4 = cp0Var.a;
                    AudioTimestamp audioTimestamp2 = cp0Var.b;
                    timestamp = audioTrack4.getTimestamp(audioTimestamp2);
                    if (timestamp) {
                    }
                    if (timestamp) {
                    }
                    i7 = 0;
                    i8 = fp0Var.b;
                    if (i8 == 0) {
                    }
                    long zzc2 = zzdpVar.zzc() / j;
                    if (fp0Var.b == 2) {
                    }
                    if (i2 != 0) {
                    }
                    playState = audioTrack.getPlayState();
                    if (playState == 3) {
                    }
                    return b;
                }
                g7pVar3.o = zzc;
            }
            i5 = j4 == g7pVar3.n ? i4 : 0;
            long b22 = g7pVar3.b(zzc);
            fjn fjnVar2 = (fjn) fp0Var3.i;
            int i142 = fp0Var3.a;
            cp0 cp0Var2 = (cp0) fp0Var3.h;
            if (i5 != 0) {
                j2 = 0;
                audioTrack2 = audioTrack3;
                if (zzc - fp0Var3.e < fp0Var3.d) {
                    g7pVar = g7pVar3;
                    zzdpVar = zzdpVar2;
                    audioTrack = audioTrack2;
                    fp0Var = fp0Var3;
                    i = 0;
                    long zzc22 = zzdpVar.zzc() / j;
                    i2 = fp0Var.b == 2 ? 1 : i;
                    if (i2 != 0) {
                        cp0 cp0Var3 = (cp0) fp0Var.h;
                        b = zzfm.y(zzc22 - (cp0Var3.b.nanoTime / j), f) + zzfm.v(fp0Var.a, cp0Var3.e);
                        g7pVar2 = g7pVar;
                    } else {
                        g7pVar2 = g7pVar;
                        b = g7pVar2.b(zzc22);
                    }
                    playState = audioTrack.getPlayState();
                    if (playState == 3) {
                        if (i2 != 0 || ((i3 = fp0Var.b) != 0 && i3 != 1)) {
                            g7pVar2.a(b);
                        }
                        long j5 = g7pVar2.z;
                        if (j5 != C.TIME_UNSET) {
                            long j6 = b - g7pVar2.y;
                            long y = zzfm.y(zzc22 - j5, f);
                            long j7 = g7pVar2.y + y;
                            long abs = Math.abs(j7 - b);
                            if (j6 != j2 && abs < 1000000) {
                                long j8 = (y * 10) / 100;
                                b = Math.max(j7 - j8, Math.min(b, j7 + j8));
                            }
                        }
                        g7pVar2.z = zzc22;
                        g7pVar2.y = b;
                    } else if (playState == 1) {
                        g7pVar2.a(b);
                    }
                    return b;
                }
            } else {
                audioTrack2 = audioTrack3;
                j2 = 0;
            }
            fp0Var3.e = zzc;
            AudioTrack audioTrack42 = cp0Var2.a;
            AudioTimestamp audioTimestamp22 = cp0Var2.b;
            timestamp = audioTrack42.getTimestamp(audioTimestamp22);
            if (timestamp) {
                g7pVar = g7pVar3;
                fp0Var2 = fp0Var3;
            } else {
                long j9 = audioTimestamp22.framePosition;
                g7pVar = g7pVar3;
                fp0Var2 = fp0Var3;
                if (cp0Var2.d > j9) {
                    cp0Var2.c++;
                }
                cp0Var2.d = j9;
                cp0Var2.e = j9 + (cp0Var2.c << 32);
            }
            if (timestamp) {
                zzdpVar = zzdpVar2;
                z = timestamp;
                audioTimestamp = audioTimestamp22;
                i6 = i142;
                audioTrack = audioTrack2;
                fp0Var = fp0Var2;
            } else {
                long j10 = audioTimestamp22.nanoTime / 1000;
                zzdpVar = zzdpVar2;
                z = timestamp;
                audioTimestamp = audioTimestamp22;
                long y2 = zzfm.y(zzc - (cp0Var2.b.nanoTime / 1000), f) + zzfm.v(i142, cp0Var2.e);
                if (Math.abs(j10 - zzc) > 5000000) {
                    long j11 = cp0Var2.e;
                    long g = ((zztd) fjnVar2.b).g();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 52 + String.valueOf(j10).length() + 2 + String.valueOf(zzc).length() + 2 + String.valueOf(b22).length() + 2 + String.valueOf(g).length());
                    fn0.t(j11, "Spurious audio timestamp (system clock mismatch): ", ", ", sb2);
                    sb2.append(j10);
                    fn0.t(zzc, ", ", ", ", sb2);
                    sb2.append(b22);
                    sb2.append(", ");
                    sb2.append(g);
                    zzeh.c(sb2.toString());
                    fp0Var = fp0Var2;
                    fp0Var.b(4);
                    i6 = i142;
                    audioTrack = audioTrack2;
                    cp0Var2 = cp0Var2;
                } else {
                    fp0Var = fp0Var2;
                    if (Math.abs(y2 - b22) > 5000000) {
                        cp0Var2 = cp0Var2;
                        long j12 = cp0Var2.e;
                        long g2 = ((zztd) fjnVar2.b).g();
                        i6 = i142;
                        audioTrack = audioTrack2;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(j12).length() + 54 + String.valueOf(j10).length() + 2 + String.valueOf(zzc).length() + 2 + String.valueOf(b22).length() + 2 + String.valueOf(g2).length());
                        fn0.t(j12, "Spurious audio timestamp (frame position mismatch): ", ", ", sb3);
                        sb3.append(j10);
                        fn0.t(zzc, ", ", ", ", sb3);
                        sb3.append(b22);
                        sb3.append(", ");
                        sb3.append(g2);
                        zzeh.c(sb3.toString());
                        fp0Var.b(4);
                    } else {
                        i6 = i142;
                        audioTrack = audioTrack2;
                        cp0Var2 = cp0Var2;
                        if (fp0Var.b == 4) {
                            i7 = 0;
                            fp0Var.b(0);
                            i8 = fp0Var.b;
                            if (i8 == 0) {
                                i = i7;
                                AudioTimestamp audioTimestamp3 = audioTimestamp;
                                if (z) {
                                    long j13 = audioTimestamp3.nanoTime;
                                    if (j13 / 1000 >= fp0Var.c) {
                                        fp0Var.f = cp0Var2.e;
                                        fp0Var.g = j13 / 1000;
                                        fp0Var.b(1);
                                    }
                                } else if (zzc - fp0Var.c > j3) {
                                    fp0Var.b(3);
                                }
                            } else if (i8 != i4) {
                                if (i8 != 2) {
                                    if (i8 == 3 && z) {
                                        fp0Var.b(i7);
                                    }
                                } else if (!z) {
                                    fp0Var.b(i7);
                                }
                                i = i7;
                            } else if (z) {
                                long j14 = cp0Var2.e;
                                long j15 = fp0Var.f;
                                if (j14 > j15) {
                                    int i15 = i6;
                                    if (Math.abs((zzfm.y(zzc - (cp0Var2.b.nanoTime / 1000), f) + zzfm.v(i15, cp0Var2.e)) - (zzfm.y(zzc - fp0Var.g, f) + zzfm.v(i15, j15))) < 1000) {
                                        fp0Var.b(2);
                                        i = 0;
                                    }
                                }
                                if (zzc - fp0Var.c > 2000000) {
                                    fp0Var.b(3);
                                } else {
                                    fp0Var.f = cp0Var2.e;
                                    fp0Var.g = audioTimestamp.nanoTime / 1000;
                                }
                                i = 0;
                            } else {
                                i = 0;
                                fp0Var.b(0);
                            }
                            long zzc222 = zzdpVar.zzc() / j;
                            if (fp0Var.b == 2) {
                            }
                            if (i2 != 0) {
                            }
                            playState = audioTrack.getPlayState();
                            if (playState == 3) {
                            }
                            return b;
                        }
                    }
                }
            }
            i7 = 0;
            i8 = fp0Var.b;
            if (i8 == 0) {
            }
            long zzc2222 = zzdpVar.zzc() / j;
            if (fp0Var.b == 2) {
            }
            if (i2 != 0) {
            }
            playState = audioTrack.getPlayState();
            if (playState == 3) {
            }
            return b;
        }
        g7pVar = g7pVar3;
        zzdpVar = zzdpVar2;
        audioTrack = audioTrack3;
        j = 1000;
        j2 = 0;
        fp0Var = fp0Var3;
        i = 0;
        long zzc22222 = zzdpVar.zzc() / j;
        if (fp0Var.b == 2) {
        }
        if (i2 != 0) {
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
        }
        return b;
    }

    public final void e(zzqj zzqjVar) {
        LogSessionId logSessionId;
        LogSessionId logSessionId2;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        synchronized (zzqjVar) {
            ase aseVar = zzqjVar.b;
            if (aseVar == null) {
                throw null;
            }
            logSessionId = aseVar.a;
        }
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(logSessionId2)) {
            return;
        }
        this.a.setLogSessionId(logSessionId);
    }

    public final void f(AudioDeviceInfo audioDeviceInfo) {
        this.a.setPreferredDevice(audioDeviceInfo);
    }

    public final long g() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        String str = zzfm.a;
        return ((j + r2) - 1) / this.g;
    }
}
