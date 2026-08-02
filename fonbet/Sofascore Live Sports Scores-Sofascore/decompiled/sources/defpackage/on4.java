package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class on4 implements zo0 {
    public static final Object d0 = new Object();
    public static ExecutorService e0;
    public static int f0;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public lo0[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public rv0 X;
    public gn4 Y;
    public boolean Z;
    public final in0 a;
    public long a0;
    public final ejg b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final co2 d;
    public final l1k e;
    public final lo0[] f;
    public final lo0[] g;
    public final r0a h;
    public final np0 i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public kp0 m;
    public final am0 n;
    public final am0 o;
    public final a99 p;
    public bse q;
    public bka r;
    public jn4 s;
    public jn4 t;
    public AudioTrack u;
    public zm0 v;
    public ln4 w;
    public ln4 x;
    public gke y;
    public ByteBuffer z;

    public on4(hcc hccVar) {
        this.a = (in0) hccVar.b;
        ejg ejgVar = (ejg) hccVar.c;
        this.b = ejgVar;
        int i = lik.a;
        this.c = false;
        this.k = false;
        this.l = 0;
        this.p = (a99) hccVar.d;
        r0a r0aVar = new r0a(1);
        this.h = r0aVar;
        r0aVar.j();
        this.i = new np0(new hpo(this));
        co2 co2Var = new co2();
        this.d = co2Var;
        l1k l1kVar = new l1k();
        l1kVar.m = lik.e;
        this.e = l1kVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new s0g(), co2Var, l1kVar);
        Collections.addAll(arrayList, (lo0[]) ejgVar.c);
        this.f = (lo0[]) arrayList.toArray(new lo0[0]);
        this.g = new lo0[]{new b88()};
        this.J = 1.0f;
        this.v = zm0.g;
        this.W = 0;
        this.X = new rv0();
        gke gkeVar = gke.d;
        this.x = new ln4(gkeVar, false, 0L, 0L);
        this.y = gkeVar;
        this.R = -1;
        this.K = new lo0[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new am0(3);
        this.o = new am0(3);
    }

    public static AudioFormat e(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        return lik.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        gke gkeVar;
        boolean z;
        qo0 qo0Var;
        Handler handler;
        boolean t = t();
        ejg ejgVar = this.b;
        if (t) {
            gkeVar = g().a;
            wvh wvhVar = (wvh) ejgVar.d;
            float f = gkeVar.a;
            if (wvhVar.c != f) {
                wvhVar.c = f;
                wvhVar.i = true;
            }
            float f2 = gkeVar.b;
            if (wvhVar.d != f2) {
                wvhVar.d = f2;
                wvhVar.i = true;
            }
        } else {
            gkeVar = gke.d;
        }
        gke gkeVar2 = gkeVar;
        int i = 0;
        if (t()) {
            boolean z2 = g().b;
            ((dhh) ejgVar.b).j = z2;
            z = z2;
        } else {
            z = false;
        }
        this.j.add(new ln4(gkeVar2, z, Math.max(0L, j), (i() * 1000000) / this.t.e));
        lo0[] lo0VarArr = this.t.i;
        ArrayList arrayList = new ArrayList();
        for (lo0 lo0Var : lo0VarArr) {
            if (lo0Var.isActive()) {
                arrayList.add(lo0Var);
            } else {
                lo0Var.flush();
            }
        }
        int size = arrayList.size();
        this.K = (lo0[]) arrayList.toArray(new lo0[size]);
        this.L = new ByteBuffer[size];
        int i2 = 0;
        while (true) {
            lo0[] lo0VarArr2 = this.K;
            if (i2 >= lo0VarArr2.length) {
                break;
            }
            lo0 lo0Var2 = lo0VarArr2[i2];
            lo0Var2.flush();
            this.L[i2] = lo0Var2.getOutput();
            i2++;
        }
        bka bkaVar = this.r;
        if (bkaVar == null || (handler = (qo0Var = ((t2c) bkaVar.b).F0).a) == null) {
            return;
        }
        handler.post(new po0(qo0Var, z, i));
    }

    public final void b(sm8 sm8Var, int[] iArr) {
        lo0[] lo0VarArr;
        int intValue;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int h;
        int[] iArr2;
        String str = sm8Var.l;
        int i8 = sm8Var.z;
        int i9 = sm8Var.y;
        int i10 = sm8Var.A;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            qx9.r(lik.w(i10));
            int p = lik.p(i10, i9);
            lo0[] lo0VarArr2 = (this.c && (i10 == 536870912 || i10 == 805306368 || i10 == 4)) ? this.g : this.f;
            int i11 = sm8Var.B;
            int i12 = sm8Var.C;
            l1k l1kVar = this.e;
            l1kVar.i = i11;
            l1kVar.j = i12;
            if (lik.a < 21 && i9 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i13 = 0; i13 < 6; i13++) {
                    iArr2[i13] = i13;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.i = iArr2;
            go0 go0Var = new go0(i8, i9, i10);
            for (lo0 lo0Var : lo0VarArr2) {
                try {
                    go0 a = lo0Var.a(go0Var);
                    if (lo0Var.isActive()) {
                        go0Var = a;
                    }
                } catch (jo0 e) {
                    throw new so0(e, sm8Var);
                }
            }
            int i14 = go0Var.c;
            int i15 = go0Var.b;
            i4 = go0Var.a;
            int k = lik.k(i15);
            i2 = lik.p(i14, i15);
            i5 = p;
            i = i14;
            lo0VarArr = lo0VarArr2;
            intValue = k;
            i3 = 0;
        } else {
            lo0[] lo0VarArr3 = new lo0[0];
            if (u(this.v, sm8Var)) {
                String str2 = sm8Var.l;
                str2.getClass();
                i = rjc.a(str2, sm8Var.i);
                lo0VarArr = lo0VarArr3;
                intValue = lik.k(i9);
                i2 = -1;
                i3 = 1;
            } else {
                Pair a2 = this.a.a(sm8Var);
                if (a2 == null) {
                    throw new so0("Unable to configure passthrough for: " + sm8Var, sm8Var);
                }
                int intValue2 = ((Integer) a2.first).intValue();
                lo0VarArr = lo0VarArr3;
                intValue = ((Integer) a2.second).intValue();
                i = intValue2;
                i2 = -1;
                i3 = 2;
            }
            i4 = i8;
            i5 = i2;
        }
        if (i == 0) {
            throw new so0("Invalid output encoding (mode=" + i3 + ") for: " + sm8Var, sm8Var);
        }
        if (intValue == 0) {
            throw new so0("Invalid output channel config (mode=" + i3 + ") for: " + sm8Var, sm8Var);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue, i);
        qx9.t(minBufferSize != -2);
        double d = this.k ? 8.0d : 1.0d;
        this.p.getClass();
        if (i3 != 0) {
            if (i3 == 1) {
                i6 = intValue;
                h = jaa.s((a99.y(i) * 50000000) / 1000000);
            } else if (i3 != 2) {
                ilg.c();
                return;
            } else {
                i6 = intValue;
                h = jaa.s(((i == 5 ? 500000 : 250000) * a99.y(i)) / 1000000);
            }
            i7 = i;
        } else {
            i6 = intValue;
            long j = i4;
            i7 = i;
            long j2 = i2;
            h = lik.h(minBufferSize * 4, jaa.s(((250000 * j) * j2) / 1000000), jaa.s(((750000 * j) * j2) / 1000000));
        }
        int max = (((Math.max(minBufferSize, (int) (h * d)) + i2) - 1) / i2) * i2;
        this.b0 = false;
        jn4 jn4Var = new jn4(sm8Var, i5, i3, i2, i4, i6, i7, max, lo0VarArr);
        if (m()) {
            this.s = jn4Var;
        } else {
            this.t = jn4Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r9.O != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z;
        int i;
        lo0[] lo0VarArr;
        if (this.R != -1) {
            z = false;
            i = this.R;
            lo0VarArr = this.K;
            if (i < lo0VarArr.length) {
            }
            return false;
        }
        this.R = 0;
        z = true;
        i = this.R;
        lo0VarArr = this.K;
        if (i < lo0VarArr.length) {
            lo0 lo0Var = lo0VarArr[i];
            if (z) {
                lo0Var.queueEndOfStream();
            }
            p(C.TIME_UNSET);
            if (lo0Var.isEnded()) {
                this.R++;
                z = true;
                i = this.R;
                lo0VarArr = this.K;
                if (i < lo0VarArr.length) {
                    ByteBuffer byteBuffer = this.O;
                    if (byteBuffer != null) {
                        v(byteBuffer, C.TIME_UNSET);
                    }
                    this.R = -1;
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        if (m()) {
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.c0 = false;
            this.F = 0;
            this.x = new ln4(g().a, g().b, 0L, 0L);
            this.I = 0L;
            this.w = null;
            this.j.clear();
            this.M = null;
            this.N = 0;
            this.O = null;
            this.T = false;
            this.S = false;
            this.R = -1;
            this.z = null;
            this.A = 0;
            this.e.o = 0L;
            int i = 0;
            while (true) {
                lo0[] lo0VarArr = this.K;
                if (i >= lo0VarArr.length) {
                    break;
                }
                lo0 lo0Var = lo0VarArr[i];
                lo0Var.flush();
                this.L[i] = lo0Var.getOutput();
                i++;
            }
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.u.pause();
            }
            if (n(this.u)) {
                kp0 kp0Var = this.m;
                kp0Var.getClass();
                kp0Var.b(this.u);
            }
            if (lik.a < 21 && !this.V) {
                this.W = 0;
            }
            jn4 jn4Var = this.s;
            if (jn4Var != null) {
                this.t = jn4Var;
                this.s = null;
            }
            np0 np0Var = this.i;
            np0Var.l = 0L;
            np0Var.w = 0;
            np0Var.v = 0;
            np0Var.m = 0L;
            np0Var.C = 0L;
            np0Var.F = 0L;
            np0Var.k = false;
            np0Var.c = null;
            np0Var.f = null;
            AudioTrack audioTrack2 = this.u;
            r0a r0aVar = this.h;
            r0aVar.i();
            synchronized (d0) {
                try {
                    ExecutorService executorService = e0;
                    if (executorService == null) {
                        executorService = Executors.newSingleThreadExecutor(new rh3("ExoPlayer:AudioTrackReleaseThread", 1));
                        e0 = executorService;
                    }
                    f0++;
                    executorService.execute(new mc3(18, audioTrack2, r0aVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.u = null;
        }
        this.o.c = null;
        this.n.c = null;
    }

    public final int f(sm8 sm8Var) {
        String str = sm8Var.l;
        int i = sm8Var.A;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (!lik.w(i)) {
                m6k.f0();
                return 0;
            }
            if (i != 2 && (!this.c || i != 4)) {
                return 1;
            }
        } else if ((this.b0 || !u(this.v, sm8Var)) && this.a.a(sm8Var) == null) {
            return 0;
        }
        return 2;
    }

    public final ln4 g() {
        ln4 ln4Var = this.w;
        if (ln4Var != null) {
            return ln4Var;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (ln4) arrayDeque.getLast() : this.x;
    }

    public final long h() {
        return this.t.c == 0 ? this.B / r0.b : this.C;
    }

    public final long i() {
        return this.t.c == 0 ? this.D / r0.d : this.E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02cc, code lost:
    
        if (r12 == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0096, code lost:
    
        if (l() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
    
        if (r10.a() == 0) goto L191;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(long j, int i, ByteBuffer byteBuffer) {
        np0 np0Var;
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4;
        ByteBuffer byteBuffer2 = this.M;
        qx9.r(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.s != null) {
            if (c()) {
                jn4 jn4Var = this.s;
                jn4 jn4Var2 = this.t;
                jn4Var.getClass();
                if (jn4Var2.c == jn4Var.c && jn4Var2.g == jn4Var.g && jn4Var2.e == jn4Var.e && jn4Var2.f == jn4Var.f && jn4Var2.d == jn4Var.d) {
                    this.t = this.s;
                    this.s = null;
                    if (n(this.u) && this.l != 3) {
                        if (this.u.getPlayState() == 3) {
                            this.u.setOffloadEndOfStream();
                        }
                        AudioTrack audioTrack = this.u;
                        sm8 sm8Var = this.t.a;
                        audioTrack.setOffloadDelayPadding(sm8Var.B, sm8Var.C);
                        this.c0 = true;
                    }
                } else {
                    o();
                    if (!k()) {
                        d();
                    }
                }
                a(j);
            }
            return false;
        }
        boolean m = m();
        am0 am0Var = this.n;
        if (!m) {
            try {
            } catch (uo0 e) {
                if (e.b) {
                    throw e;
                }
                am0Var.A(e);
                return false;
            }
        }
        am0Var.c = null;
        boolean z = this.H;
        np0 np0Var2 = this.i;
        if (z) {
            this.I = Math.max(0L, j);
            this.G = false;
            this.H = false;
            if (this.k && lik.a >= 23) {
                s(this.y);
            }
            a(j);
            if (this.U) {
                this.U = true;
                if (m()) {
                    ep0 ep0Var = np0Var2.f;
                    ep0Var.getClass();
                    ep0Var.a();
                    this.u.play();
                }
            }
        }
        long i5 = i();
        AudioTrack audioTrack2 = np0Var2.c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (np0Var2.h) {
            if (playState == 2) {
                np0Var2.p = false;
                return false;
            }
            if (playState == 1) {
            }
        }
        boolean z2 = np0Var2.p;
        boolean b3 = np0Var2.b(i5);
        np0Var2.p = b3;
        if (z2 && !b3 && playState != 1) {
            hpo hpoVar = np0Var2.a;
            int i6 = np0Var2.e;
            long F = lik.F(np0Var2.i);
            on4 on4Var = (on4) hpoVar.a;
            if (on4Var.r != null) {
                np0Var = np0Var2;
                long elapsedRealtime = SystemClock.elapsedRealtime() - on4Var.a0;
                qo0 qo0Var = ((t2c) on4Var.r.b).F0;
                Handler handler = qo0Var.a;
                if (handler != null) {
                    handler.post(new no0(qo0Var, i6, F, elapsedRealtime));
                }
                if (this.M == null) {
                    qx9.r(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                    if (byteBuffer.hasRemaining()) {
                        jn4 jn4Var3 = this.t;
                        if (jn4Var3.c != 0 && this.F == 0) {
                            int i7 = jn4Var3.g;
                            int i8 = 1024;
                            char c = 16;
                            switch (i7) {
                                case 5:
                                case 6:
                                case 18:
                                    if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                        i8 = un0.b[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
                                    } else {
                                        i8 = 1536;
                                    }
                                    this.F = i8;
                                    break;
                                case 7:
                                case 8:
                                    int position = byteBuffer.position();
                                    byte b4 = byteBuffer.get(position);
                                    if (b4 != -2) {
                                        if (b4 == -1) {
                                            i2 = (byteBuffer.get(position + 4) & 7) << 4;
                                            b2 = byteBuffer.get(position + 7);
                                        } else if (b4 != 31) {
                                            i2 = (byteBuffer.get(position + 4) & 1) << 6;
                                            b = byteBuffer.get(position + 5);
                                        } else {
                                            i2 = (byteBuffer.get(position + 5) & 7) << 4;
                                            b2 = byteBuffer.get(position + 6);
                                        }
                                        i3 = b2 & 60;
                                        i8 = (((i3 >> 2) | i2) + 1) * 32;
                                        this.F = i8;
                                        break;
                                    } else {
                                        i2 = (byteBuffer.get(position + 5) & 1) << 6;
                                        b = byteBuffer.get(position + 4);
                                    }
                                    i3 = b & 252;
                                    i8 = (((i3 >> 2) | i2) + 1) * 32;
                                    this.F = i8;
                                case 9:
                                    int position2 = byteBuffer.position();
                                    int i9 = lik.a;
                                    int i10 = byteBuffer.getInt(position2);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i10 = Integer.reverseBytes(i10);
                                    }
                                    i8 = yso.G(i10);
                                    if (i8 == -1) {
                                        ilg.c();
                                        return false;
                                    }
                                    this.F = i8;
                                    break;
                                case 10:
                                case 16:
                                    this.F = i8;
                                    break;
                                case 11:
                                case 12:
                                    i8 = a.o;
                                    this.F = i8;
                                    break;
                                case 13:
                                default:
                                    a70.r(ljg.j(i7, "Unexpected audio encoding: "));
                                    return false;
                                case 14:
                                    int position3 = byteBuffer.position();
                                    int limit = byteBuffer.limit() - 10;
                                    int i11 = position3;
                                    while (true) {
                                        if (i11 <= limit) {
                                            int i12 = lik.a;
                                            int i13 = byteBuffer.getInt(i11 + 4);
                                            char c2 = c;
                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                i13 = Integer.reverseBytes(i13);
                                            }
                                            if ((i13 & (-2)) == -126718022) {
                                                i4 = i11 - position3;
                                            } else {
                                                i11++;
                                                c = c2;
                                            }
                                        } else {
                                            i4 = -1;
                                        }
                                    }
                                    if (i4 == -1) {
                                        i8 = 0;
                                    } else {
                                        i8 = (40 << ((byteBuffer.get((byteBuffer.position() + i4) + ((byteBuffer.get((byteBuffer.position() + i4) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    }
                                    this.F = i8;
                                    break;
                                case 15:
                                    i8 = 512;
                                    this.F = i8;
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int position4 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(position4);
                                    i8 = o02.j0(new nm2(bArr, 16, 2, (byte) 0)).c;
                                    this.F = i8;
                                    break;
                            }
                        }
                        if (this.w != null) {
                            if (c()) {
                                a(j);
                                this.w = null;
                            }
                            return false;
                        }
                        long h = (((h() - this.e.o) * 1000000) / this.t.a.z) + this.I;
                        if (!this.G && Math.abs(h - j) > 200000) {
                            bka bkaVar = this.r;
                            StringBuilder o = ljg.o("Unexpected audio track timestamp discontinuity: expected ", h, ", got ");
                            o.append(j);
                            bkaVar.v(new wo0(o.toString()));
                            this.G = true;
                        }
                        if (this.G) {
                            if (c()) {
                                long j2 = j - h;
                                this.I += j2;
                                this.G = false;
                                a(j);
                                bka bkaVar2 = this.r;
                                if (bkaVar2 != null && j2 != 0) {
                                    ((t2c) bkaVar2.b).M0 = true;
                                }
                            }
                            return false;
                        }
                        if (this.t.c == 0) {
                            this.B += byteBuffer.remaining();
                        } else {
                            this.C = (this.F * i) + this.C;
                        }
                        this.M = byteBuffer;
                        this.N = i;
                    }
                    return true;
                }
                p(j);
                if (this.M.hasRemaining()) {
                    this.M = null;
                    this.N = 0;
                    return true;
                }
                long i14 = i();
                np0 np0Var3 = np0Var;
                if (np0Var3.y != C.TIME_UNSET && i14 > 0 && SystemClock.elapsedRealtime() - np0Var3.y >= 200) {
                    m6k.f0();
                    d();
                    return true;
                }
                return false;
            }
        }
        np0Var = np0Var2;
        if (this.M == null) {
        }
        p(j);
        if (this.M.hasRemaining()) {
        }
    }

    public final boolean k() {
        return m() && this.i.b(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l() {
        boolean z;
        AudioTrack a;
        bse bseVar;
        jn4 jn4Var;
        r0a r0aVar = this.h;
        synchronized (r0aVar) {
            z = r0aVar.b;
        }
        if (!z) {
            return false;
        }
        try {
            jn4Var = this.t;
            jn4Var.getClass();
        } catch (uo0 e) {
            jn4 jn4Var2 = this.t;
            if (jn4Var2.h > 1000000) {
                jn4 jn4Var3 = new jn4(jn4Var2.a, jn4Var2.b, jn4Var2.c, jn4Var2.d, jn4Var2.e, jn4Var2.f, jn4Var2.g, 1000000, jn4Var2.i);
                try {
                    try {
                        a = jn4Var3.a(this.Z, this.v, this.W);
                        this.t = jn4Var3;
                    } catch (uo0 e2) {
                        e.addSuppressed(e2);
                        if (this.t.c == 1) {
                            throw e;
                        }
                        this.b0 = true;
                        throw e;
                    }
                } catch (uo0 e3) {
                    bka bkaVar = this.r;
                    if (bkaVar != null) {
                        bkaVar.v(e3);
                    }
                    throw e3;
                }
            }
            if (this.t.c == 1) {
            }
        }
        try {
            a = jn4Var.a(this.Z, this.v, this.W);
            this.u = a;
            if (n(a)) {
                AudioTrack audioTrack = this.u;
                kp0 kp0Var = this.m;
                if (kp0Var == null) {
                    kp0Var = new kp0(this);
                    this.m = kp0Var;
                }
                Handler handler = kp0Var.a;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new ip0(handler, 1), (jp0) kp0Var.b);
                if (this.l != 3) {
                    AudioTrack audioTrack2 = this.u;
                    sm8 sm8Var = this.t.a;
                    audioTrack2.setOffloadDelayPadding(sm8Var.B, sm8Var.C);
                }
            }
            int i = lik.a;
            if (i >= 31 && (bseVar = this.q) != null) {
                fn4.a(this.u, bseVar);
            }
            this.W = this.u.getAudioSessionId();
            np0 np0Var = this.i;
            AudioTrack audioTrack3 = this.u;
            jn4 jn4Var4 = this.t;
            boolean z2 = jn4Var4.c == 2;
            int i2 = jn4Var4.g;
            int i3 = jn4Var4.d;
            int i4 = jn4Var4.h;
            np0Var.c = audioTrack3;
            np0Var.d = i3;
            np0Var.e = i4;
            np0Var.f = new ep0(audioTrack3);
            np0Var.g = audioTrack3.getSampleRate();
            np0Var.h = z2 && i < 23 && (i2 == 5 || i2 == 6);
            boolean w = lik.w(i2);
            np0Var.q = w;
            np0Var.i = w ? ((i4 / i3) * 1000000) / np0Var.g : -9223372036854775807L;
            np0Var.s = 0L;
            np0Var.t = 0L;
            np0Var.u = 0L;
            np0Var.p = false;
            np0Var.x = C.TIME_UNSET;
            np0Var.y = C.TIME_UNSET;
            np0Var.r = 0L;
            np0Var.o = 0L;
            np0Var.j = 1.0f;
            if (m()) {
                AudioTrack audioTrack4 = this.u;
                float f = this.J;
                if (i >= 21) {
                    audioTrack4.setVolume(f);
                } else {
                    audioTrack4.setStereoVolume(f, f);
                }
            }
            this.X.getClass();
            gn4 gn4Var = this.Y;
            if (gn4Var != null && i >= 23) {
                en4.a(this.u, gn4Var);
            }
            this.H = true;
            return true;
        } catch (uo0 e4) {
            bka bkaVar2 = this.r;
            if (bkaVar2 != null) {
                bkaVar2.v(e4);
            }
            throw e4;
        }
    }

    public final boolean m() {
        return this.u != null;
    }

    public final void o() {
        if (this.T) {
            return;
        }
        this.T = true;
        long i = i();
        np0 np0Var = this.i;
        np0Var.z = np0Var.a();
        np0Var.x = SystemClock.elapsedRealtime() * 1000;
        np0Var.A = i;
        this.u.stop();
        this.A = 0;
    }

    public final void p(long j) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.L[i - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = lo0.a;
                }
            }
            if (i == length) {
                v(byteBuffer, j);
            } else {
                lo0 lo0Var = this.K[i];
                if (i > this.R) {
                    lo0Var.queueInput(byteBuffer);
                }
                ByteBuffer output = lo0Var.getOutput();
                this.L[i] = output;
                if (output.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void q() {
        d();
        for (lo0 lo0Var : this.f) {
            lo0Var.reset();
        }
        for (lo0 lo0Var2 : this.g) {
            lo0Var2.reset();
        }
        this.U = false;
        this.b0 = false;
    }

    public final void r(gke gkeVar, boolean z) {
        ln4 g = g();
        if (gkeVar.equals(g.a) && z == g.b) {
            return;
        }
        ln4 ln4Var = new ln4(gkeVar, z, C.TIME_UNSET, C.TIME_UNSET);
        if (m()) {
            this.w = ln4Var;
        } else {
            this.x = ln4Var;
        }
    }

    public final void s(gke gkeVar) {
        if (m()) {
            try {
                this.u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(gkeVar.a).setPitch(gkeVar.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                m6k.g0("Failed to set playback params", e);
            }
            gkeVar = new gke(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            float f = gkeVar.a;
            np0 np0Var = this.i;
            np0Var.j = f;
            ep0 ep0Var = np0Var.f;
            if (ep0Var != null) {
                ep0Var.a();
            }
        }
        this.y = gkeVar;
    }

    public final boolean t() {
        if (this.Z || !MimeTypes.AUDIO_RAW.equals(this.t.a.l)) {
            return false;
        }
        int i = this.t.a.A;
        if (!this.c) {
            return true;
        }
        int i2 = lik.a;
        return (i == 536870912 || i == 805306368 || i == 4) ? false : true;
    }

    public final boolean u(zm0 zm0Var, sm8 sm8Var) {
        int i;
        int k;
        int i2 = lik.a;
        if (i2 >= 29 && (i = this.l) != 0) {
            String str = sm8Var.l;
            str.getClass();
            int a = rjc.a(str, sm8Var.i);
            if (a != 0 && (k = lik.k(sm8Var.y)) != 0) {
                AudioFormat e = e(sm8Var.z, k, a);
                dad dadVar = zm0Var.f;
                if (dadVar == null) {
                    dadVar = new dad(zm0Var);
                    zm0Var.f = dadVar;
                }
                AudioAttributes audioAttributes = (AudioAttributes) dadVar.b;
                int playbackOffloadSupport = i2 >= 31 ? AudioManager.getPlaybackOffloadSupport(e, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(e, audioAttributes) ? 0 : (i2 == 30 && lik.d.startsWith("Pixel")) ? 2 : 1;
                if (playbackOffloadSupport != 0) {
                    if (playbackOffloadSupport == 1) {
                        boolean z = (sm8Var.B == 0 && sm8Var.C == 0) ? false : true;
                        boolean z2 = i == 1;
                        if (!z || !z2) {
                        }
                    } else if (playbackOffloadSupport != 2) {
                        zzl.s();
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void v(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBuffer2;
        int write;
        int write2;
        bka bkaVar;
        yg6 yg6Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.O;
            if (byteBuffer3 != null) {
                qx9.r(byteBuffer3 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (lik.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < remaining) {
                        this.P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.P, 0, remaining);
                    byteBuffer.position(position);
                    this.Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i = lik.a;
            if (i < 21) {
                long j2 = this.D;
                np0 np0Var = this.i;
                int a = np0Var.e - ((int) (j2 - (np0Var.a() * np0Var.d)));
                if (a > 0) {
                    write = this.u.write(this.P, this.Q, Math.min(remaining2, a));
                    if (write > 0) {
                        this.Q += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.Z) {
                qx9.t(j != C.TIME_UNSET);
                AudioTrack audioTrack = this.u;
                if (i >= 26) {
                    byteBuffer2 = byteBuffer;
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1, j * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.z == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.z = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.z.putInt(4, remaining2);
                        this.z.putLong(8, j * 1000);
                        this.z.position(0);
                        this.A = remaining2;
                    }
                    int remaining3 = this.z.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.z, remaining3, 1);
                        if (write < 0) {
                            this.A = 0;
                        } else if (write < remaining3) {
                            write = 0;
                        }
                    }
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1);
                    if (write2 < 0) {
                        this.A = 0;
                    } else {
                        this.A -= write2;
                    }
                }
                write = write2;
            } else {
                byteBuffer2 = byteBuffer;
                write = this.u.write(byteBuffer2, remaining2, 1);
            }
            this.a0 = SystemClock.elapsedRealtime();
            am0 am0Var = this.o;
            if (write < 0) {
                xo0 xo0Var = new xo0(write, this.t.a, ((i >= 24 && write == -6) || write == -32) && this.E > 0);
                bka bkaVar2 = this.r;
                if (bkaVar2 != null) {
                    bkaVar2.v(xo0Var);
                }
                if (xo0Var.b) {
                    throw xo0Var;
                }
                am0Var.A(xo0Var);
                return;
            }
            am0Var.c = null;
            if (n(this.u)) {
                if (this.E > 0) {
                    this.c0 = false;
                }
                if (this.U && (bkaVar = this.r) != null && write < remaining2 && !this.c0 && (yg6Var = ((t2c) bkaVar.b).O0) != null) {
                    yg6Var.a.F = true;
                }
            }
            int i2 = this.t.c;
            if (i2 == 0) {
                this.D += write;
            }
            if (write == remaining2) {
                if (i2 != 0) {
                    qx9.t(byteBuffer2 == this.M);
                    this.E = (this.F * this.N) + this.E;
                }
                this.O = null;
            }
        }
    }
}
