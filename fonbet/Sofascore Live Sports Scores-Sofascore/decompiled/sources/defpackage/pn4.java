package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pn4 {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public sv0 S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final x6k b;
    public Handler b0;
    public final do2 c;
    public final m1k d;
    public final ojj e;
    public final njj f;
    public final vvf g;
    public final ArrayDeque h;
    public int i;
    public in4 j;
    public final nn4 k;
    public final nn4 l;
    public cse m;
    public d4a n;
    public kn4 o;
    public kn4 p;
    public fo0 q;
    public eo0 r;
    public dn4 s;
    public lp0 t;
    public an0 u;
    public mn4 v;
    public mn4 w;
    public hke x;
    public boolean y;
    public long z;

    public pn4(rd4 rd4Var) {
        int deviceId;
        Context context = (Context) rd4Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = an0.b;
        this.b = (x6k) rd4Var.d;
        this.i = 0;
        this.r = (mp0) rd4Var.f;
        do2 do2Var = new do2();
        this.c = do2Var;
        m1k m1kVar = new m1k();
        m1kVar.m = nik.b;
        this.d = m1kVar;
        this.e = new ojj();
        this.f = new njj();
        this.g = hv9.A(m1kVar, do2Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new sv0();
        hke hkeVar = hke.d;
        this.w = new mn4(hkeVar, 0L, 0L);
        this.x = hkeVar;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new nn4();
        this.l = new nn4();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((kda.C(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = nik.a;
                    int i14 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i14 = Integer.reverseBytes(i14);
                    }
                    if ((i14 & (-2097152)) == -2097152 && (i6 = (i14 >>> 19) & 3) != 1 && (i7 = (i14 >>> 17) & 3) != 0) {
                        int i15 = (i14 >>> 12) & 15;
                        int i16 = (i14 >>> 10) & 3;
                        if (i15 != 0 && i15 != 15 && i16 != 3) {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        ilg.c();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                            if (i5 == -1) {
                                return i5;
                            }
                            ilg.c();
                            return 0;
                        }
                    }
                    i5 = -1;
                    if (i5 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return a.o;
                default:
                    switch (i) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i17 = position2;
                            while (true) {
                                if (i17 <= limit) {
                                    String str2 = nik.a;
                                    int i18 = byteBuffer.getInt(i17 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i18 = Integer.reverseBytes(i18);
                                    }
                                    if ((i18 & (-2)) == -126718022) {
                                        i8 = i17 - position2;
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return s02.W(new nm2(bArr, 16, 3, (byte) 0)).c;
                        case 18:
                            break;
                        default:
                            a70.r(ljg.j(i, "Unexpected audio encoding: "));
                            return 0;
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return dy0.b[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position4 = byteBuffer.position();
        byte b5 = byteBuffer.get(position4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b2 = byteBuffer.get(position4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b = byteBuffer.get(position4 + 5);
            } else {
                i3 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b2 = byteBuffer.get(position4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b = byteBuffer.get(position4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    public final void a(long j) {
        hke hkeVar;
        boolean v = v();
        int i = 1;
        boolean z = false;
        x6k x6kVar = this.b;
        if (v) {
            hkeVar = hke.d;
        } else {
            if (this.V || !this.p.i()) {
                hkeVar = hke.d;
            } else {
                int i2 = ((b) this.p.c).I;
                hkeVar = this.x;
                xvh xvhVar = (xvh) x6kVar.d;
                float f = hkeVar.a;
                z1a.s(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (xvhVar.b != f) {
                    xvhVar.b = f;
                    xvhVar.h = true;
                }
                float f2 = hkeVar.b;
                z1a.s(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (xvhVar.c != f2) {
                    xvhVar.c = f2;
                    xvhVar.h = true;
                }
            }
            this.x = hkeVar;
        }
        hke hkeVar2 = hkeVar;
        if (!this.V && this.p.i()) {
            int i3 = ((b) this.p.c).I;
            z = this.y;
            ((ehh) x6kVar.c).j = z;
        }
        this.y = z;
        this.h.add(new mn4(hkeVar2, Math.max(0L, j), nik.Z(((do0) this.p.e).b, j())));
        fo0 fo0Var = (fo0) this.p.f;
        this.q = fo0Var;
        fo0Var.a();
        d4a d4aVar = this.n;
        if (d4aVar != null) {
            boolean z2 = this.y;
            ro0 ro0Var = ((u2c) d4aVar.b).H0;
            Handler handler = ro0Var.a;
            if (handler != null) {
                handler.post(new po0(ro0Var, z2, i));
            }
        }
    }

    public final lp0 b(do0 do0Var) {
        try {
            return ((mp0) this.r).a(do0Var);
        } catch (bo0 e) {
            vo0 vo0Var = new vo0(do0Var.b, do0Var.c, do0Var.a, do0Var.f, (b) this.p.c, do0Var.e, e);
            d4a d4aVar = this.n;
            if (d4aVar == null) {
                throw vo0Var;
            }
            d4aVar.t(vo0Var);
            throw vo0Var;
        }
    }

    public final void c(b bVar, int[] iArr) {
        fo0 fo0Var;
        b bVar2;
        int i;
        int i2;
        if (this.s == null && this.a != null) {
            dn4 dn4Var = new dn4(this);
            this.s = dn4Var;
            mp0 mp0Var = (mp0) this.r;
            mp0Var.f();
            vdb vdbVar = mp0Var.e;
            if (vdbVar == null) {
                vdbVar = new vdb(Thread.currentThread());
                mp0Var.e = vdbVar;
            }
            vdbVar.a(dn4Var);
        }
        String str = bVar.o;
        int i3 = bVar.G;
        int i4 = bVar.I;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            z1a.s(nik.P(i4));
            int v = nik.v(i4) * i3;
            zu9 zu9Var = new zu9(4);
            zu9Var.e(this.g);
            zu9Var.c(this.e);
            zu9Var.d((mo0[]) this.b.b);
            fo0Var = new fo0(zu9Var.g());
            if (fo0Var.equals(this.q)) {
                fo0Var = this.q;
            }
            int i5 = bVar.J;
            int i6 = bVar.K;
            m1k m1kVar = this.d;
            m1kVar.i = i5;
            m1kVar.j = i6;
            this.c.i = iArr;
            ho0 ho0Var = new ho0(bVar.H, i3, i4);
            try {
                hv9 hv9Var = fo0Var.a;
                if (ho0Var.equals(ho0.e)) {
                    throw new ko0(ho0Var);
                }
                for (int i7 = 0; i7 < hv9Var.size(); i7++) {
                    mo0 mo0Var = (mo0) hv9Var.get(i7);
                    ho0 b = mo0Var.b(ho0Var);
                    if (mo0Var.isActive()) {
                        z1a.E(!b.equals(ho0.e));
                        ho0Var = b;
                    }
                }
                int i8 = ho0Var.b;
                int i9 = ho0Var.c;
                qm8 a = bVar.a();
                a.H = i9;
                a.G = ho0Var.a;
                a.F = i8;
                bVar2 = new b(a);
                i = v;
                i2 = nik.v(i9) * i8;
            } catch (ko0 e) {
                throw new to0(e, bVar);
            }
        } else {
            av9 av9Var = hv9.b;
            fo0Var = new fo0(vvf.e);
            bVar2 = bVar;
            i = -1;
            i2 = -1;
        }
        fo0 fo0Var2 = fo0Var;
        zn0 g = g(bVar2);
        b bVar3 = g.a;
        try {
            do0 c = ((mp0) this.r).c(g);
            boolean z = c.e;
            if (c.a == 0) {
                throw new to0(bf3.l("Invalid output encoding (isOffload=", ")", z), bVar3);
            }
            if (c.c == 0) {
                throw new to0(bf3.l("Invalid output channel config (isOffload=", ")", z), bVar3);
            }
            this.X = false;
            kn4 kn4Var = new kn4(bVar, bVar2, i, i2, c, fo0Var2);
            if (n()) {
                this.o = kn4Var;
            } else {
                this.p = kn4Var;
            }
        } catch (yn0 e2) {
            throw new to0(e2, bVar);
        }
    }

    public final void d(long j) {
        d4a d4aVar;
        zg6 zg6Var;
        if (this.K == null) {
            return;
        }
        nn4 nn4Var = this.l;
        if (nn4Var.a != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < nn4Var.c)) {
            return;
        }
        int remaining = this.K.remaining();
        try {
            boolean g = this.t.g(j, this.J, this.K);
            this.W = SystemClock.elapsedRealtime();
            nn4Var.a = null;
            nn4Var.b = C.TIME_UNSET;
            nn4Var.c = C.TIME_UNSET;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (d4aVar = this.n) != null && !g && !this.Y && (zg6Var = ((u2c) d4aVar.b).I) != null) {
                    zg6Var.a.R = true;
                }
            }
            if (this.p.i()) {
                this.B += remaining - this.K.remaining();
            }
            if (g) {
                if (!this.p.i()) {
                    z1a.E(this.K == this.I);
                    this.C = (this.D * this.J) + this.C;
                }
                this.K = null;
            }
        } catch (xn0 e) {
            boolean z = e.b;
            if (z) {
                if (j() <= 0) {
                    if (this.t.c()) {
                        if (((do0) this.p.e).e) {
                            this.X = true;
                        }
                    }
                }
                r4 = true;
            }
            yo0 yo0Var = new yo0(e.a, (b) this.p.c, r4);
            d4a d4aVar2 = this.n;
            if (d4aVar2 != null) {
                d4aVar2.t(yo0Var);
            }
            if (z) {
                throw yo0Var;
            }
            nn4Var.a(yo0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        ByteBuffer byteBuffer;
        if (!this.q.d()) {
            d(Long.MIN_VALUE);
            return this.K == null;
        }
        fo0 fo0Var = this.q;
        if (fo0Var.d() && !fo0Var.d) {
            fo0Var.d = true;
            ((mo0) fo0Var.b.get(0)).queueEndOfStream();
        }
        q(Long.MIN_VALUE);
        if (!this.q.c() || ((byteBuffer = this.K) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void f() {
        if (n()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new mn4(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            fo0 fo0Var = (fo0) this.p.f;
            this.q = fo0Var;
            fo0Var.a();
            this.j = null;
            kn4 kn4Var = this.o;
            if (kn4Var != null) {
                this.p = kn4Var;
                this.o = null;
            }
            c0.incrementAndGet();
            lp0 lp0Var = this.t;
            if (lp0Var.e.d.getPlayState() == 3) {
                lp0Var.a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && lp0Var.c()) {
                kp0 kp0Var = lp0Var.h;
                kp0Var.getClass();
                kp0Var.a();
            }
            g7h g7hVar = lp0Var.d;
            if (g7hVar != null) {
                AudioTrack audioTrack = (AudioTrack) g7hVar.b;
                gp0 gp0Var = (gp0) g7hVar.e;
                gp0Var.getClass();
                audioTrack.removeOnRoutingChangedListener(gp0Var);
                g7hVar.e = null;
                lp0Var.d = null;
            }
            AudioTrack audioTrack2 = lp0Var.a;
            vdb vdbVar = lp0Var.i;
            Handler q = nik.q(null);
            synchronized (lp0.p) {
                try {
                    ScheduledExecutorService scheduledExecutorService = lp0.q;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new u14(2));
                        lp0.q = scheduledExecutorService;
                    }
                    lp0.r++;
                    scheduledExecutorService.schedule(new p3(5, audioTrack2, q, vdbVar), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.t = null;
        }
        nn4 nn4Var = this.l;
        nn4Var.a = null;
        nn4Var.b = C.TIME_UNSET;
        nn4Var.c = C.TIME_UNSET;
        nn4 nn4Var2 = this.k;
        nn4Var2.a = null;
        nn4Var2.b = C.TIME_UNSET;
        nn4Var2.c = C.TIME_UNSET;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final zn0 g(b bVar) {
        zn0 zn0Var = new zn0(bVar);
        zn0Var.b = this.u;
        zn0Var.d = this.i != 0;
        zn0Var.c = this.T;
        zn0Var.e = this.Q;
        zn0Var.g = this.V;
        zn0Var.f = this.U;
        return new zn0(zn0Var);
    }

    public final int h(b bVar) {
        boolean z;
        if (!nik.P(bVar.I) || bVar.I == 2) {
            z = false;
        } else {
            qm8 a = bVar.a();
            a.H = 2;
            bVar = new b(a);
            z = true;
        }
        int i = ((mp0) this.r).b(g(bVar)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!this.p.i()) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.b;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        if (r5 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0091, code lost:
    
        if (m() == false) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(long j, int i, ByteBuffer byteBuffer) {
        long j2;
        long j3;
        long j4;
        ByteBuffer byteBuffer2 = this.I;
        z1a.s(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                if (this.t != null) {
                    do0 do0Var = (do0) this.p.e;
                    g((b) this.o.d);
                    if (!((do0) this.o.e).equals(do0Var)) {
                        p();
                        if (!l()) {
                            f();
                            a(j);
                        }
                    }
                }
                this.p = this.o;
                this.o = null;
                lp0 lp0Var = this.t;
                if (lp0Var != null && lp0Var.c() && ((do0) this.p.e).k) {
                    this.t.e();
                    lp0 lp0Var2 = this.t;
                    b bVar = (b) this.p.c;
                    lp0Var2.d(bVar.J, bVar.K);
                    this.Y = true;
                }
                a(j);
            }
            return false;
        }
        boolean n = n();
        nn4 nn4Var = this.k;
        if (!n) {
            try {
            } catch (vo0 e) {
                if (e.a) {
                    throw e;
                }
                nn4Var.a(e);
                return false;
            }
        }
        nn4Var.a = null;
        nn4Var.b = C.TIME_UNSET;
        nn4Var.c = C.TIME_UNSET;
        if (this.F) {
            this.G = Math.max(0L, j);
            this.E = false;
            this.F = false;
            if (v()) {
                t();
            }
            a(j);
            if (this.O) {
                o();
            }
        }
        if (this.I == null) {
            z1a.s(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!this.p.i() && this.D == 0) {
                    int i2 = i(((do0) this.p.e).a, byteBuffer);
                    this.D = i2;
                }
                if (this.v != null) {
                    if (e()) {
                        a(j);
                        this.v = null;
                    }
                    return false;
                }
                long j5 = this.G;
                kn4 kn4Var = this.p;
                if (kn4Var.i()) {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.z / this.p.a;
                } else {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.A;
                }
                long Z = nik.Z(((b) kn4Var.c).H, j4 - this.d.o) + j5;
                if (!this.E && Math.abs(Z - j) > 200000) {
                    d4a d4aVar = this.n;
                    if (d4aVar != null) {
                        StringBuilder o = ljg.o("Unexpected audio track timestamp discontinuity: expected ", Z, ", got ");
                        o.append(j);
                        d4aVar.t(new wo0(o.toString()));
                    }
                    this.E = true;
                }
                if (this.E) {
                    if (e()) {
                        long j6 = j - Z;
                        this.G += j6;
                        this.E = false;
                        a(j);
                        d4a d4aVar2 = this.n;
                        if (d4aVar2 != null && j6 != j3) {
                            ((u2c) d4aVar2.b).P0 = true;
                        }
                    }
                    return false;
                }
                if (this.p.i()) {
                    this.z += byteBuffer.remaining();
                } else {
                    this.A = (this.D * i) + this.A;
                }
                this.I = byteBuffer;
                this.J = i;
            }
            return true;
        }
        j2 = -9223372036854775807L;
        j3 = 0;
        q(j);
        if (!this.I.hasRemaining()) {
            this.I = null;
            this.J = 0;
            return true;
        }
        lp0 lp0Var3 = this.t;
        op0 op0Var = lp0Var3.e;
        long b = lp0Var3.b();
        if (op0Var.v != j2 && b > j3) {
            op0Var.b.getClass();
            if (SystemClock.elapsedRealtime() - op0Var.v >= 200) {
                tgj.d0("Resetting stalled audio output");
                f();
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.c() && this.N) {
            return false;
        }
        long j = j();
        long a = this.t.a();
        lp0 lp0Var = this.t;
        lp0Var.getClass();
        return j > nik.b0(a, (long) lp0Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean m() {
        lp0 b;
        umb umbVar;
        nn4 nn4Var = this.k;
        if (nn4Var.a != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < nn4Var.c)) {
            return false;
        }
        try {
            b = b((do0) this.p.e);
        } catch (vo0 e) {
            int i = ((do0) this.p.e).f;
            while (true) {
                kn4 kn4Var = this.p;
                if (i <= 1000000) {
                    if (!((do0) kn4Var.e).e) {
                        throw e;
                    }
                    this.X = true;
                    throw e;
                }
                int i2 = i / 2;
                int i3 = kn4Var.b;
                if (i3 == -1) {
                    i3 = 1;
                }
                int i4 = i2 % i3;
                int i5 = i4 != 0 ? (i3 - i4) + i2 : i2;
                co0 a = ((do0) kn4Var.e).a();
                a.f = i5;
                do0 do0Var = new do0(a);
                try {
                    b = b(do0Var);
                    kn4 kn4Var2 = this.p;
                    this.p = new kn4((b) kn4Var2.c, (b) kn4Var2.d, kn4Var2.a, kn4Var2.b, do0Var, (fo0) kn4Var2.f);
                    break;
                } catch (vo0 e2) {
                    e.addSuppressed(e2);
                    i = i5;
                }
            }
        }
        this.t = b;
        in4 in4Var = new in4(this, (do0) this.p.e);
        this.j = in4Var;
        b.i.a(in4Var);
        if (this.t.c()) {
            kn4 kn4Var3 = this.p;
            if (((do0) kn4Var3.e).k) {
                lp0 lp0Var = this.t;
                b bVar = (b) kn4Var3.c;
                lp0Var.d(bVar.J, bVar.K);
            }
        }
        cse cseVar = this.m;
        if (cseVar != null) {
            this.t.f(cseVar);
        }
        if (n()) {
            this.t.a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        boolean z = audioSessionId != this.Q;
        this.Q = audioSessionId;
        d4a d4aVar = this.n;
        if (d4aVar != null) {
            Object obj = this.p.e;
            ug5 ug5Var = new ug5();
            ro0 ro0Var = ((u2c) d4aVar.b).H0;
            Handler handler = ro0Var.a;
            if (handler != null) {
                handler.post(new oo0(ro0Var, ug5Var, 7));
            }
            if (z) {
                this.R = true;
                kn4 kn4Var4 = this.p;
                co0 a2 = ((do0) kn4Var4.e).a();
                int i6 = this.Q;
                a2.h = i6;
                this.p = new kn4((b) kn4Var4.c, (b) kn4Var4.d, kn4Var4.a, kn4Var4.b, new do0(a2), (fo0) kn4Var4.f);
                kn4 kn4Var5 = this.o;
                if (kn4Var5 != null) {
                    co0 a3 = ((do0) kn4Var5.e).a();
                    i6 = this.Q;
                    a3.h = i6;
                    this.o = new kn4((b) kn4Var5.c, (b) kn4Var5.d, kn4Var5.a, kn4Var5.b, new do0(a3), (fo0) kn4Var5.f);
                }
                u2c u2cVar = (u2c) this.n.b;
                if (Build.VERSION.SDK_INT >= 35 && (umbVar = u2cVar.J0) != null) {
                    umbVar.g(i6);
                }
                ro0 ro0Var2 = u2cVar.H0;
                Handler handler2 = ro0Var2.a;
                if (handler2 != null) {
                    handler2.post(new pn0(ro0Var2, i6, 1));
                }
            }
        }
        return true;
    }

    public final boolean n() {
        return this.t != null;
    }

    public final void o() {
        this.O = true;
        if (n()) {
            lp0 lp0Var = this.t;
            op0 op0Var = lp0Var.e;
            if (op0Var.u != C.TIME_UNSET) {
                op0Var.b.getClass();
                op0Var.u = nik.T(SystemClock.elapsedRealtime());
            }
            op0Var.j = nik.Z(op0Var.e, op0Var.a());
            op0Var.h.a(0);
            if (!lp0Var.j || lp0Var.c()) {
                lp0Var.a.play();
            }
        }
    }

    public final void p() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.t.c()) {
            this.N = false;
        }
        lp0 lp0Var = this.t;
        if (lp0Var.j) {
            return;
        }
        lp0Var.j = true;
        op0 op0Var = lp0Var.e;
        long b = lp0Var.b();
        op0Var.w = op0Var.a();
        op0Var.b.getClass();
        op0Var.u = nik.T(SystemClock.elapsedRealtime());
        op0Var.x = b;
        lp0Var.a.stop();
    }

    public final void q(long j) {
        ByteBuffer byteBuffer;
        d(j);
        if (this.K != null) {
            return;
        }
        if (!this.q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                u(byteBuffer2);
                d(j);
                return;
            }
            return;
        }
        while (!this.q.c()) {
            do {
                fo0 fo0Var = this.q;
                if (fo0Var.d()) {
                    ByteBuffer byteBuffer3 = fo0Var.c[fo0Var.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        fo0Var.e(mo0.a);
                        byteBuffer = fo0Var.c[fo0Var.b()];
                    }
                } else {
                    byteBuffer = mo0.a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer);
                    d(j);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    fo0 fo0Var2 = this.q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (fo0Var2.d() && !fo0Var2.d) {
                        fo0Var2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void r() {
        kn4 kn4Var = this.p;
        if (kn4Var != null) {
            kn4 kn4Var2 = this.o;
            if (kn4Var2 != null) {
                this.p = kn4Var2;
                this.o = null;
                kn4Var = kn4Var2;
            }
            try {
                do0 c = ((mp0) this.r).c(g((b) kn4Var.d));
                kn4 kn4Var3 = this.p;
                this.p = new kn4((b) kn4Var3.c, (b) kn4Var3.d, kn4Var3.a, kn4Var3.b, c, (fo0) kn4Var3.f);
            } catch (yn0 e) {
                yhk.q(new to0(e, (b) this.p.c));
                return;
            }
        }
        f();
    }

    public final void s() {
        f();
        av9 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((mo0) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        fo0 fo0Var = this.q;
        if (fo0Var != null) {
            hv9 hv9Var = fo0Var.a;
            for (int i = 0; i < hv9Var.size(); i++) {
                mo0 mo0Var = (mo0) hv9Var.get(i);
                mo0Var.a(io0.b);
                mo0Var.reset();
            }
            fo0Var.b.clear();
            fo0Var.c = new ByteBuffer[0];
            ho0 ho0Var = ho0.e;
            fo0Var.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void t() {
        if (n()) {
            lp0 lp0Var = this.t;
            hke hkeVar = this.x;
            AudioTrack audioTrack = lp0Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(nik.i(hkeVar.a, 0.1f, 8.0f)).setPitch(nik.i(hkeVar.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                tgj.e0("Failed to set playback params", e);
            }
            op0 op0Var = lp0Var.e;
            op0Var.i = audioTrack.getPlaybackParams().getSpeed();
            op0Var.h.a(0);
            op0Var.k = 0L;
            op0Var.t = 0;
            op0Var.s = 0;
            op0Var.l = 0L;
            op0Var.y = C.TIME_UNSET;
            op0Var.z = C.TIME_UNSET;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new hke(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        byte b;
        int i2;
        int i3;
        z1a.E(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (this.p.i()) {
                int b0 = (int) nik.b0(nik.T(20L), ((do0) this.p.e).b, 1000000L, RoundingMode.UP);
                long j = j();
                long j2 = b0;
                if (j < j2) {
                    kn4 kn4Var = this.p;
                    int i4 = ((do0) kn4Var.e).a;
                    int i5 = kn4Var.b;
                    int i6 = (int) j;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < b0) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i3 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                            } else if (i4 == 4) {
                                float i7 = nik.i(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (i7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (-i7) * (-2.1474836E9f) : i7 * 2.1474836E9f);
                            } else if (i4 == 21) {
                                i = ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                b = byteBuffer.get();
                            } else if (i4 != 22) {
                                if (i4 == 268435456) {
                                    i = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    i2 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                } else if (i4 == 1342177280) {
                                    i = ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                    i2 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                } else if (i4 == 1610612736) {
                                    i = ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                                    i2 = byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                } else if (i4 != 1879048192) {
                                    zzl.s();
                                    return;
                                } else {
                                    double max = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i3 = (int) (max < 0.0d ? (-max) * (-2.147483648E9d) : max * 2.147483647E9d);
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
                                b = byteBuffer.get();
                            }
                            int i8 = (int) ((i3 * i6) / j2);
                            if (i4 != 2) {
                                byteBuffer2.put((byte) (i8 >> 16));
                                byteBuffer2.put((byte) (i8 >> 24));
                            } else if (i4 == 3) {
                                byteBuffer2.put((byte) (i8 >> 24));
                            } else if (i4 != 4) {
                                if (i4 == 21) {
                                    byteBuffer2.put((byte) (i8 >> 8));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                    byteBuffer2.put((byte) (i8 >> 24));
                                } else if (i4 == 22) {
                                    byteBuffer2.put((byte) i8);
                                    byteBuffer2.put((byte) (i8 >> 8));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                    byteBuffer2.put((byte) (i8 >> 24));
                                } else if (i4 == 268435456) {
                                    byteBuffer2.put((byte) (i8 >> 24));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                } else if (i4 == 1342177280) {
                                    byteBuffer2.put((byte) (i8 >> 24));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                    byteBuffer2.put((byte) (i8 >> 8));
                                } else if (i4 == 1610612736) {
                                    byteBuffer2.put((byte) (i8 >> 24));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                    byteBuffer2.put((byte) (i8 >> 8));
                                    byteBuffer2.put((byte) i8);
                                } else if (i4 != 1879048192) {
                                    zzl.s();
                                    return;
                                } else if (i8 < 0) {
                                    byteBuffer2.putDouble((-i8) / (-2.147483648E9d));
                                } else {
                                    byteBuffer2.putDouble(i8 / 2.147483647E9d);
                                }
                            } else if (i8 < 0) {
                                byteBuffer2.putFloat((-i8) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i8 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i5) {
                                i6++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                        i3 = i | i2;
                        int i82 = (int) ((i3 * i6) / j2);
                        if (i4 != 2) {
                        }
                        if (byteBuffer.position() != position + i5) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.K = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.K = byteBuffer2;
        }
    }

    public final boolean v() {
        kn4 kn4Var = this.p;
        return kn4Var != null && ((do0) kn4Var.e).j;
    }
}
