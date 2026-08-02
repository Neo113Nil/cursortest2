package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zznf;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzuc;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.fn0;
import defpackage.g7p;
import defpackage.gmo;
import defpackage.i4p;
import defpackage.i7p;
import defpackage.ilg;
import defpackage.j0a;
import defpackage.jgo;
import defpackage.kp0;
import defpackage.me4;
import defpackage.mio;
import defpackage.n7p;
import defpackage.nn4;
import defpackage.p7p;
import defpackage.q61;
import defpackage.qc;
import defpackage.qpn;
import defpackage.wh0;
import defpackage.wt3;
import defpackage.y5p;
import defpackage.yhk;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztw implements zzsi {
    public static final AtomicInteger Y = new AtomicInteger();
    public long A;
    public int B;
    public boolean C;
    public boolean D;
    public long E;
    public long F;
    public float G;
    public ByteBuffer H;
    public int I;
    public ByteBuffer J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public zze Q;
    public AudioDeviceInfo R;
    public int S;
    public long T;
    public long U;
    public long V;
    public Handler W;
    public final zztr X;
    public final Context a;
    public final zztl b;
    public final zzui c;
    public final zzcw d;
    public final zzuh e;
    public final s f;
    public final ArrayDeque g;
    public i7p h;
    public final nn4 i;
    public final nn4 j;
    public zzqj k;
    public gmo l;
    public j0a m;
    public j0a n;
    public zzck o;
    public final zzti p;
    public n7p q;
    public zztd r;
    public zzd s;
    public p7p t;
    public p7p u;
    public zzav v;
    public boolean w;
    public long x;
    public long y;
    public long z;

    public zztw(zztp zztpVar) {
        int deviceId;
        Context context = zztpVar.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.s = zzd.b;
        this.X = zztpVar.f;
        this.p = zztpVar.e;
        zztl zztlVar = new zztl();
        this.b = zztlVar;
        zzui zzuiVar = new zzui();
        this.c = zzuiVar;
        this.d = new zzcw();
        this.e = new zzuh();
        this.f = zzgxm.u(zzuiVar, zztlVar);
        this.G = 1.0f;
        this.O = 0;
        this.Q = new zze();
        zzav zzavVar = zzav.d;
        this.u = new p7p(zzavVar, 0L, 0L);
        this.v = zzavVar;
        this.w = false;
        this.g = new ArrayDeque();
        this.i = new nn4();
        this.j = new nn4();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.S = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b2 = byteBuffer.get(26);
                int i10 = 28;
                int i11 = 28;
                for (int i12 = 0; i12 < b2; i12++) {
                    i11 += byteBuffer.get(i12 + 27);
                }
                byte b3 = byteBuffer.get(i11 + 26);
                for (int i13 = 0; i13 < b3; i13++) {
                    i10 += byteBuffer.get(i11 + 27 + i13);
                }
                i2 = i11 + i10;
            }
            int i14 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((zzgy.b(byteBuffer.get(i14), byteBuffer.limit() - i14 > 1 ? byteBuffer.get(i14 + 1) : (byte) 0) * 48000) / 1000000);
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
                    String str = zzfm.a;
                    int i15 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i15 = Integer.reverseBytes(i15);
                    }
                    if ((i15 & (-2097152)) == -2097152 && (i7 = (i15 >>> 19) & 3) != 1 && (i8 = (i15 >>> 17) & 3) != 0) {
                        int i16 = i15 >>> 12;
                        int i17 = (i15 >>> 10) & 3;
                        int i18 = i16 & 15;
                        if (i18 != 0 && i18 != 15 && i17 != 3) {
                            i6 = 1152;
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    i6 = 384;
                                }
                            } else if (i7 != 3) {
                                i6 = 576;
                            }
                            if (i6 == -1) {
                                return i6;
                            }
                            ilg.c();
                            return 0;
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return com.ironsource.mediationsdk.metadata.a.o;
                default:
                    switch (i) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i19 = position2;
                            while (true) {
                                if (i19 <= limit) {
                                    String str2 = zzfm.a;
                                    int i20 = byteBuffer.getInt(i19 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i20 = Integer.reverseBytes(i20);
                                    }
                                    if ((i20 & (-2)) == -126718022) {
                                        i9 = i19 - position2;
                                    } else {
                                        i19++;
                                    }
                                } else {
                                    i9 = -1;
                                }
                            }
                            if (i9 != -1) {
                                return (40 << ((byteBuffer.get((byteBuffer.position() + i9) + ((byteBuffer.get((byteBuffer.position() + i9) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            return 0;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return zzafk.a(new zzet(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            a70.r(me4.g(i, "Unexpected audio encoding: ", new StringBuilder(String.valueOf(i).length() + 27)));
                            return 0;
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return zzafh.a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
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
        byte b4 = byteBuffer.get(position4);
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b = byteBuffer.get(position4 + 7);
            } else if (b4 != 31) {
                i4 = (byteBuffer.get(position4 + 4) & 1) << 6;
                i5 = byteBuffer.get(position4 + 5) & 252;
                i3 = (i5 >> 2) | i4;
            } else {
                i4 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b = byteBuffer.get(position4 + 6);
            }
            i5 = b & 60;
            i3 = (i5 >> 2) | i4;
        } else {
            i3 = ((byteBuffer.get(position4 + 5) & 1) << 6) | ((byteBuffer.get(position4 + 4) & 252) >> 2);
        }
        return (i3 + 1) * 32;
    }

    public final void a() {
        if (l()) {
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.B = 0;
            this.u = new p7p(this.v, 0L, 0L);
            this.E = 0L;
            this.t = null;
            this.g.clear();
            this.H = null;
            this.I = 0;
            this.J = null;
            this.L = false;
            this.K = false;
            this.M = false;
            this.c.o = 0L;
            d(C.TIME_UNSET);
            this.h = null;
            j0a j0aVar = this.m;
            if (j0aVar != null) {
                this.n = j0aVar;
                this.m = null;
            }
            Y.incrementAndGet();
            zztd zztdVar = this.r;
            if (zztdVar.e.d.getPlayState() == 3) {
                zztdVar.a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && zztdVar.b()) {
                kp0 kp0Var = zztdVar.h;
                kp0Var.getClass();
                kp0Var.c();
            }
            qpn qpnVar = zztdVar.d;
            if (qpnVar != null) {
                y5p y5pVar = (y5p) qpnVar.e;
                y5pVar.getClass();
                ((AudioTrack) qpnVar.b).removeOnRoutingChangedListener(y5pVar);
                qpnVar.e = null;
                zztdVar.d = null;
            }
            AudioTrack audioTrack = zztdVar.a;
            zzeg zzegVar = zztdVar.i;
            Handler p = zzfm.p();
            synchronized (zztd.o) {
                try {
                    ScheduledExecutorService scheduledExecutorService = zztd.p;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new qc(3));
                        zztd.p = scheduledExecutorService;
                    }
                    zztd.q++;
                    scheduledExecutorService.schedule(new jgo(16, audioTrack, p, zzegVar), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.r = null;
        }
        nn4 nn4Var = this.j;
        nn4Var.a = null;
        nn4Var.b = C.TIME_UNSET;
        nn4Var.c = C.TIME_UNSET;
        nn4 nn4Var2 = this.i;
        nn4Var2.a = null;
        nn4Var2.b = C.TIME_UNSET;
        nn4Var2.c = C.TIME_UNSET;
        this.U = 0L;
        this.V = 0L;
        Handler handler = this.W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        a();
        s sVar = this.f;
        int i = sVar.d;
        for (int i2 = 0; i2 < i; i2++) {
            ((zzcp) sVar.get(i2)).zzj();
        }
        this.d.zzj();
        this.e.zzj();
        zzck zzckVar = this.o;
        if (zzckVar != null) {
            int i3 = 0;
            while (true) {
                zzgxm zzgxmVar = zzckVar.a;
                if (i3 >= zzgxmVar.size()) {
                    break;
                }
                zzcp zzcpVar = (zzcp) zzgxmVar.get(i3);
                zzcpVar.b(zzcn.d);
                zzcpVar.zzj();
                i3++;
            }
            zzckVar.b.clear();
            zzckVar.c = new ByteBuffer[0];
            zzcl zzclVar = zzcl.e;
            zzckVar.d = false;
        }
        this.N = false;
    }

    public final void d(long j) {
        long j2;
        j0a j0aVar = this.n;
        this.o = (zzck) j0aVar.f;
        if (j == C.TIME_UNSET) {
            j2 = 0;
        } else {
            j2 = j - this.F;
            if (((zzbf) j0aVar.g) != zzbf.a && j0aVar.h != null) {
                zzbd zzbdVar = new zzbd();
                j0a j0aVar2 = this.n;
                ((zzbf) j0aVar2.g).o(j0aVar2.h, zzbdVar);
            }
        }
        zzck zzckVar = this.o;
        zzcm zzcmVar = new zzcm();
        j0a j0aVar3 = this.n;
        zzcmVar.b = (zzbf) j0aVar3.g;
        zzcmVar.c = j0aVar3.h;
        zzcmVar.a = j2;
        zzcn a = zzcmVar.a();
        ArrayList arrayList = zzckVar.b;
        arrayList.clear();
        zzckVar.d = false;
        int i = 0;
        while (true) {
            zzgxm zzgxmVar = zzckVar.a;
            if (i >= zzgxmVar.size()) {
                break;
            }
            zzcp zzcpVar = (zzcp) zzgxmVar.get(i);
            zzcpVar.b(a);
            if (zzcpVar.zzc()) {
                zzcm zzcmVar2 = new zzcm();
                long j3 = a.a;
                zzcmVar2.a = j3;
                zzcmVar2.b = a.b;
                zzcmVar2.c = a.c;
                zzcmVar2.a = zzcpVar.c(j3);
                a = zzcmVar2.a();
                arrayList.add(zzcpVar);
            }
            i++;
        }
        zzckVar.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= zzckVar.e(); i2++) {
            zzckVar.c[i2] = ((zzcp) arrayList.get(i2)).zzf();
        }
    }

    public final zztd e(zzri zzriVar) {
        try {
            return this.p.c(zzriVar);
        } catch (zzrf e) {
            int i = zzriVar.b;
            int i2 = zzriVar.c;
            int i3 = zzriVar.a;
            int i4 = zzriVar.d;
            String valueOf = String.valueOf((zzv) this.n.c);
            int length = String.valueOf(i).length();
            int length2 = String.valueOf(i2).length();
            int length3 = String.valueOf(i3).length();
            StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i4).length() + 2 + valueOf.length());
            me4.r(sb, "AudioTrack init failed 0 Config(", i, ", ", i2);
            me4.r(sb, ", ", i3, ", ", i4);
            zzse zzseVar = new zzse(wt3.m(") ", valueOf, sb, ""), e);
            gmo gmoVar = this.l;
            if (gmoVar == null) {
                throw zzseVar;
            }
            gmoVar.e(zzseVar);
            throw zzseVar;
        }
    }

    public final void f(long j) {
        ByteBuffer byteBuffer;
        i(j);
        if (this.J != null) {
            return;
        }
        if (!this.o.b()) {
            ByteBuffer byteBuffer2 = this.H;
            if (byteBuffer2 != null) {
                h(byteBuffer2);
                i(j);
                return;
            }
            return;
        }
        while (!this.o.c()) {
            do {
                zzck zzckVar = this.o;
                if (zzckVar.b()) {
                    ByteBuffer byteBuffer3 = zzckVar.c[zzckVar.e()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        zzckVar.d(zzcp.a);
                        byteBuffer = zzckVar.c[zzckVar.e()];
                    }
                } else {
                    byteBuffer = zzcp.a;
                }
                if (byteBuffer.hasRemaining()) {
                    h(byteBuffer);
                    i(j);
                } else {
                    ByteBuffer byteBuffer4 = this.H;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    zzck zzckVar2 = this.o;
                    ByteBuffer byteBuffer5 = this.H;
                    if (zzckVar2.b() && !zzckVar2.d) {
                        zzckVar2.d(byteBuffer5);
                    }
                }
            } while (this.J == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        ByteBuffer byteBuffer;
        if (!this.o.b()) {
            i(Long.MIN_VALUE);
            return this.J == null;
        }
        zzck zzckVar = this.o;
        if (zzckVar.b() && !zzckVar.d) {
            zzckVar.d = true;
            ((zzcp) zzckVar.b.get(0)).zze();
        }
        f(Long.MIN_VALUE);
        if (!this.o.c() || ((byteBuffer = this.J) != null && byteBuffer.hasRemaining())) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a0, code lost:
    
        if (r3 < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r3 < 0.0d) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        r3 = (-r3) * (-2.147483648E9d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c3, code lost:
    
        r3 = r3 * 2.147483647E9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e0, code lost:
    
        if (r3 < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e2, code lost:
    
        r3 = (-r3) * (-2.1474836E9f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e8, code lost:
    
        r3 = r3 * 2.1474836E9f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f9, code lost:
    
        if (r3 < 0.0d) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        long j;
        int i;
        int i2;
        int i3;
        float max;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        double max2;
        double d;
        zzguk.f(this.J == null);
        if (byteBuffer.hasRemaining()) {
            if (this.n.c()) {
                int w = (int) zzfm.w(zzfm.u(20L), ((zzri) this.n.e).b, 1000000L, RoundingMode.UP);
                long m = m();
                long j2 = w;
                if (m < j2) {
                    j0a j0aVar = this.n;
                    int i11 = ((zzri) j0aVar.e).a;
                    int i12 = j0aVar.b;
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i13 = (int) m;
                    while (byteBuffer.hasRemaining() && i13 < w) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 21) {
                                        if (i11 == 22) {
                                            j = j2;
                                            i7 = byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                            i8 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                            i9 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                            i10 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                        } else if (i11 == 268435456) {
                                            j = j2;
                                            i = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                            i2 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                        } else if (i11 == 1342177280) {
                                            j = j2;
                                            i4 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                            i5 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                            i6 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                        } else if (i11 != 1610612736) {
                                            j = j2;
                                            if (i11 == 1879048192) {
                                                max2 = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                            } else if (i11 == 1895825408) {
                                                max = Math.max(-1.0f, Math.min(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), 1.0f));
                                            } else {
                                                if (i11 != 1912602624) {
                                                    defpackage.zzl.s();
                                                    return;
                                                }
                                                max2 = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                            }
                                            i3 = (int) d;
                                        } else {
                                            j = j2;
                                            i7 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                            i8 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                            i9 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                            i10 = byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                        }
                                        i3 = i7 | i8 | i9 | i10;
                                    } else {
                                        j = j2;
                                        i4 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                                        i5 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                                        i6 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                                    }
                                    i3 = i4 | i5 | i6;
                                } else {
                                    j = j2;
                                    max = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                }
                                i3 = (int) f;
                            } else {
                                j = j2;
                                i3 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                            }
                            int i14 = (int) ((i3 * i13) / j);
                            if (i11 != 2) {
                                order.put((byte) (i14 >> 16));
                                order.put((byte) (i14 >> 24));
                            } else if (i11 == 3) {
                                order.put((byte) (i14 >> 24));
                            } else if (i11 != 4) {
                                if (i11 == 21) {
                                    order.put((byte) (i14 >> 8));
                                    order.put((byte) (i14 >> 16));
                                    order.put((byte) (i14 >> 24));
                                } else if (i11 == 22) {
                                    order.put((byte) i14);
                                    order.put((byte) (i14 >> 8));
                                    order.put((byte) (i14 >> 16));
                                    order.put((byte) (i14 >> 24));
                                } else if (i11 == 268435456) {
                                    order.put((byte) (i14 >> 24));
                                    order.put((byte) (i14 >> 16));
                                } else if (i11 == 1342177280) {
                                    order.put((byte) (i14 >> 24));
                                    order.put((byte) (i14 >> 16));
                                    order.put((byte) (i14 >> 8));
                                } else if (i11 == 1610612736) {
                                    order.put((byte) (i14 >> 24));
                                    order.put((byte) (i14 >> 16));
                                    order.put((byte) (i14 >> 8));
                                    order.put((byte) i14);
                                } else if (i11 != 1879048192) {
                                    if (i11 == 1895825408) {
                                        order.putInt(Integer.reverseBytes(Float.floatToIntBits(i14 < 0 ? (-i14) / (-2.1474836E9f) : i14 / 2.1474836E9f)));
                                    } else {
                                        if (i11 != 1912602624) {
                                            defpackage.zzl.s();
                                            return;
                                        }
                                        order.putLong(Long.reverseBytes(Double.doubleToLongBits(i14 < 0 ? (-i14) / (-2.147483648E9d) : i14 / 2.147483647E9d)));
                                    }
                                } else if (i14 < 0) {
                                    order.putDouble((-i14) / (-2.147483648E9d));
                                } else {
                                    order.putDouble(i14 / 2.147483647E9d);
                                }
                            } else if (i14 < 0) {
                                order.putFloat((-i14) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i14 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i12) {
                                i13++;
                                position = byteBuffer.position();
                            }
                            j2 = j;
                        } else {
                            j = j2;
                            i = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
                            i2 = (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
                        }
                        i3 = i | i2;
                        int i142 = (int) ((i3 * i13) / j);
                        if (i11 != 2) {
                        }
                        if (byteBuffer.position() != position + i12) {
                        }
                        j2 = j;
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.J = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.J = byteBuffer2;
        }
    }

    public final void i(long j) {
        if (this.J == null) {
            return;
        }
        nn4 nn4Var = this.j;
        if (nn4Var.a != null && (Y.get() > 0 || SystemClock.elapsedRealtime() < nn4Var.c)) {
            return;
        }
        int remaining = this.J.remaining();
        try {
            boolean a = this.r.a(this.I, this.J);
            this.T = SystemClock.elapsedRealtime();
            nn4Var.a = null;
            nn4Var.b = C.TIME_UNSET;
            nn4Var.c = C.TIME_UNSET;
            this.r.b();
            if (this.n.c()) {
                this.z += remaining - this.J.remaining();
            }
            if (a) {
                if (!this.n.c()) {
                    zzguk.f(this.J == this.H);
                    this.A = (this.B * this.I) + this.A;
                }
                this.J = null;
            }
        } catch (zzqy e) {
            boolean z = e.b;
            if (z) {
                if (m() <= 0) {
                    if (this.r.b()) {
                        Object obj = this.n.e;
                    }
                }
                r0 = true;
            }
            zzsh zzshVar = new zzsh(e.a, (zzv) this.n.c, r0);
            gmo gmoVar = this.l;
            if (gmoVar != null) {
                gmoVar.e(zzshVar);
            }
            if (z) {
                throw zzshVar;
            }
            nn4Var.b(zzshVar);
        }
    }

    public final void j() {
        j0a j0aVar = this.n;
        if (j0aVar != null) {
            j0a j0aVar2 = this.m;
            if (j0aVar2 != null) {
                this.n = j0aVar2;
                this.m = null;
                j0aVar = j0aVar2;
            }
            try {
                this.n = this.n.b(this.p.b(n((zzv) j0aVar.d)));
            } catch (zzra e) {
                yhk.q(new zzsd(e, (zzv) this.n.c));
                return;
            }
        }
        a();
    }

    public final void k(long j) {
        zzav zzavVar;
        boolean c = this.n.c();
        boolean z = false;
        zztr zztrVar = this.X;
        if (c) {
            int i = ((zzv) this.n.c).K;
            zzavVar = this.v;
            zzcv zzcvVar = zztrVar.c;
            float f = zzavVar.a;
            zzguk.a(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (zzcvVar.c != f) {
                zzcvVar.c = f;
                zzcvVar.i = true;
            }
            float f2 = zzavVar.b;
            zzguk.a(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (zzcvVar.d != f2) {
                zzcvVar.d = f2;
                zzcvVar.i = true;
            }
        } else {
            zzavVar = zzav.d;
        }
        zzav zzavVar2 = zzavVar;
        this.v = zzavVar2;
        if (this.n.c()) {
            int i2 = ((zzv) this.n.c).K;
            z = this.w;
            zztrVar.b.j = z;
        }
        this.w = z;
        this.g.add(new p7p(zzavVar2, Math.max(0L, j), zzfm.v(((zzri) this.n.e).b, m())));
        d(j);
        gmo gmoVar = this.l;
        if (gmoVar != null) {
            boolean z2 = this.w;
            zzry zzryVar = ((zzuc) gmoVar.b).z0;
            Handler handler = zzryVar.a;
            if (handler != null) {
                handler.post(new wh0(zzryVar, z2, 8));
            }
        }
    }

    public final boolean l() {
        return this.r != null;
    }

    public final long m() {
        if (!this.n.c()) {
            return this.A;
        }
        long j = this.z;
        long j2 = this.n.b;
        String str = zzfm.a;
        return ((j + j2) - 1) / j2;
    }

    public final zzrc n(zzv zzvVar) {
        zzrb zzrbVar = new zzrb(zzvVar);
        zzrbVar.b = this.s;
        zzrbVar.c = this.R;
        zzrbVar.d = this.O;
        zzrbVar.e = this.S;
        return new zzrc(zzrbVar);
    }

    public final int o(zzv zzvVar) {
        boolean z;
        int i = zzvVar.K;
        if (!zzfm.d(i) || i == 2) {
            z = false;
        } else {
            zzt zztVar = new zzt(zzvVar);
            zztVar.J = 2;
            zzvVar = new zzv(zztVar);
            z = true;
        }
        int i2 = this.p.a(n(zzvVar)).d;
        if (i2 != 1) {
            if (i2 != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, n7p] */
    public final void p(zzsb zzsbVar) {
        zzck zzckVar;
        int i;
        int i2;
        zzv zzvVar;
        n7p n7pVar = this.q;
        zzti zztiVar = this.p;
        if (n7pVar == null && this.a != null) {
            ?? r0 = new zzrg() { // from class: n7p
                @Override // com.google.android.gms.internal.ads.zzrg
                public final void zza() {
                    zznf zznfVar;
                    gmo gmoVar = zztw.this.l;
                    if (gmoVar != null) {
                        zzuc zzucVar = (zzuc) gmoVar.b;
                        synchronized (zzucVar.a) {
                            zznfVar = zzucVar.s;
                        }
                        if (zznfVar != null) {
                            zznfVar.zza();
                        }
                    }
                }
            };
            this.q = r0;
            zztiVar.e();
            zzeg zzegVar = zztiVar.c;
            zzeg zzegVar2 = zzegVar;
            if (zzegVar == null) {
                zzeg zzegVar3 = new zzeg(Thread.currentThread());
                zztiVar.c = zzegVar3;
                zzegVar2 = zzegVar3;
            }
            zzegVar2.a(r0);
        }
        zzv zzvVar2 = zzsbVar.a;
        String str = zzvVar2.o;
        int i3 = zzvVar2.H;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            int i4 = zzvVar2.K;
            zzguk.a(zzfm.d(i4));
            i = zzfm.f(i4) * i3;
            zzgxj zzgxjVar = new zzgxj();
            zzgxjVar.d(this.f);
            zzgxjVar.c(this.d);
            zzcp[] zzcpVarArr = this.X.a;
            zzgzf.a(2, zzcpVarArr);
            zzgxjVar.e(2);
            System.arraycopy(zzcpVarArr, 0, zzgxjVar.a, zzgxjVar.b, 2);
            zzgxjVar.b += 2;
            zzckVar = new zzck(zzgxjVar.f());
            if (zzckVar.equals(this.o)) {
                zzckVar = this.o;
            }
            int i5 = zzvVar2.L;
            int i6 = zzvVar2.M;
            zzui zzuiVar = this.c;
            zzuiVar.i = i5;
            zzuiVar.j = i6;
            this.b.i = zzsbVar.b;
            try {
                zzcl a = zzckVar.a(new zzcl(zzvVar2.J, i3, i4));
                zzt zztVar = new zzt(zzvVar2);
                int i7 = a.c;
                zztVar.J = i7;
                zztVar.I = a.a;
                int i8 = a.b;
                zztVar.G = i8;
                zztVar.H = i8 == i3 ? zzvVar2.I : -1;
                zzvVar = new zzv(zztVar);
                i2 = zzfm.f(i7) * i8;
            } catch (zzco e) {
                throw new zzsd(e, zzvVar2);
            }
        } else {
            mio mioVar = zzgxm.b;
            zzckVar = new zzck(s.e);
            i = -1;
            i2 = -1;
            zzvVar = zzvVar2;
        }
        zzck zzckVar2 = zzckVar;
        zzrc n = n(zzvVar);
        zzv zzvVar3 = n.a;
        try {
            zzri b = zztiVar.b(n);
            if (b.a == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new zzsd(sb.toString(), zzvVar3);
            }
            if (b.c == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new zzsd(sb2.toString(), zzvVar3);
            }
            zzbf zzbfVar = zzsbVar.c;
            zzxo zzxoVar = zzsbVar.d;
            j0a j0aVar = new j0a(zzvVar2, zzvVar, i, i2, b, zzckVar2, zzbfVar, zzxoVar != null ? zzxoVar.a : null);
            if (l()) {
                this.m = j0aVar;
            } else {
                this.n = j0aVar;
            }
        } catch (zzra e2) {
            throw new zzsd(e2, zzvVar2);
        }
    }

    public final void q() {
        this.N = true;
        if (l()) {
            zztd zztdVar = this.r;
            g7p g7pVar = zztdVar.e;
            if (g7pVar.u != C.TIME_UNSET) {
                g7pVar.u = zzfm.u(g7pVar.b.zzb());
            }
            g7pVar.j = zzfm.v(g7pVar.e, g7pVar.c());
            g7pVar.h.b(0);
            if (!zztdVar.j || zztdVar.b()) {
                zztdVar.a.play();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x024f, code lost:
    
        if (r0 != 0) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j, int i, ByteBuffer byteBuffer) {
        boolean z;
        zztd zztdVar;
        zzvl zzvlVar;
        long j2;
        long j3;
        long j4;
        ByteBuffer byteBuffer2 = this.H;
        zzguk.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.m != null) {
            if (g()) {
                if (this.r != null) {
                    zzri zzriVar = (zzri) this.n.e;
                    n((zzv) this.m.d);
                    if (!((zzri) this.m.e).equals(zzriVar)) {
                        if (!this.L) {
                            this.L = true;
                            if (this.r.b()) {
                                this.M = false;
                            }
                            zztd zztdVar2 = this.r;
                            if (!zztdVar2.j) {
                                zztdVar2.j = true;
                                g7p g7pVar = zztdVar2.e;
                                long g = zztdVar2.g();
                                g7pVar.w = g7pVar.c();
                                g7pVar.u = zzfm.u(g7pVar.b.zzb());
                                g7pVar.x = g;
                                zztdVar2.a.stop();
                            }
                        }
                        if (!t()) {
                            a();
                            k(j);
                        }
                    }
                }
                this.n = this.m;
                this.m = null;
                zztd zztdVar3 = this.r;
                if (zztdVar3 != null && zztdVar3.b()) {
                    Object obj = this.n.e;
                }
                k(j);
            }
            return false;
        }
        boolean l = l();
        nn4 nn4Var = this.i;
        if (!l) {
            try {
                if (nn4Var.a != null && (Y.get() > 0 || SystemClock.elapsedRealtime() < nn4Var.c)) {
                    z = true;
                    if (!z) {
                        try {
                            zztdVar = e((zzri) this.n.e);
                        } catch (zzse e) {
                            int i2 = ((zzri) this.n.e).d;
                            while (true) {
                                j0a j0aVar = this.n;
                                if (i2 <= 1000000) {
                                    Object obj2 = j0aVar.e;
                                    throw e;
                                }
                                int i3 = i2 >> 1;
                                int i4 = j0aVar.b;
                                if (i4 == -1) {
                                    i4 = 1;
                                }
                                int i5 = i3 % i4;
                                int i6 = i5 != 0 ? (i4 - i5) + i3 : i3;
                                zzrh zzrhVar = new zzrh((zzri) j0aVar.e);
                                zzrhVar.d = i6;
                                zzri zzriVar2 = new zzri(zzrhVar);
                                try {
                                    zztd e2 = e(zzriVar2);
                                    this.n = this.n.b(zzriVar2);
                                    zztdVar = e2;
                                    break;
                                } catch (zzse e3) {
                                    e.addSuppressed(e3);
                                    i2 = i6;
                                }
                            }
                        }
                        this.r = zztdVar;
                        i7p i7pVar = new i7p(this, (zzri) this.n.e);
                        this.h = i7pVar;
                        zztdVar.i.a(i7pVar);
                        if (this.r.b()) {
                            Object obj3 = this.n.e;
                        }
                        zzqj zzqjVar = this.k;
                        if (zzqjVar != null) {
                            this.r.e(zzqjVar);
                        }
                        if (l()) {
                            this.r.a.setVolume(this.G);
                        }
                        AudioDeviceInfo audioDeviceInfo = this.R;
                        if (audioDeviceInfo != null) {
                            this.r.f(audioDeviceInfo);
                        }
                        this.D = true;
                        int audioSessionId = this.r.a.getAudioSessionId();
                        int i7 = this.O;
                        this.O = audioSessionId;
                        gmo gmoVar = this.l;
                        if (gmoVar != null) {
                            int i8 = ((zzri) this.n.e).a;
                            zzsc zzscVar = new zzsc();
                            zzry zzryVar = ((zzuc) gmoVar.b).z0;
                            Handler handler = zzryVar.a;
                            if (handler != null) {
                                handler.post(new i4p(zzryVar, zzscVar, 7));
                            }
                            if (audioSessionId != i7) {
                                this.P = true;
                                j0a j0aVar2 = this.n;
                                zzrh zzrhVar2 = new zzrh((zzri) j0aVar2.e);
                                zzrhVar2.f = this.O;
                                this.n = j0aVar2.b(new zzri(zzrhVar2));
                                j0a j0aVar3 = this.m;
                                if (j0aVar3 != null) {
                                    zzrh zzrhVar3 = new zzrh((zzri) j0aVar3.e);
                                    zzrhVar3.f = this.O;
                                    this.m = j0aVar3.b(new zzri(zzrhVar3));
                                }
                                gmo gmoVar2 = this.l;
                                int i9 = this.O;
                                if (Build.VERSION.SDK_INT >= 35 && (zzvlVar = ((zzuc) gmoVar2.b).B0) != null) {
                                    zzvlVar.a(i9);
                                }
                                zzry zzryVar2 = ((zzuc) gmoVar2.b).z0;
                                Handler handler2 = zzryVar2.a;
                                if (handler2 != null) {
                                    handler2.post(new q61(zzryVar2, i9, 13));
                                }
                            }
                        }
                    }
                    return false;
                }
                z = false;
                if (!z) {
                }
                return false;
            } catch (zzse e4) {
                nn4Var.b(e4);
                return false;
            }
        }
        nn4Var.a = null;
        nn4Var.b = C.TIME_UNSET;
        nn4Var.c = C.TIME_UNSET;
        if (this.D) {
            this.E = Math.max(0L, j);
            this.C = false;
            this.D = false;
            k(j);
            if (this.N) {
                q();
            }
        }
        if (this.H == null) {
            zzguk.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!this.n.c() && this.B == 0) {
                    int c = c(((zzri) this.n.e).a, byteBuffer);
                    this.B = c;
                }
                if (this.t != null) {
                    if (g()) {
                        k(j);
                        this.t = null;
                    }
                    return false;
                }
                long j5 = this.E;
                j0a j0aVar4 = this.n;
                if (j0aVar4.c()) {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.x / this.n.a;
                } else {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.y;
                }
                long v = zzfm.v(((zzv) j0aVar4.c).J, j4 - this.c.o) + j5;
                if (!this.C && Math.abs(v - j) > 200000) {
                    gmo gmoVar3 = this.l;
                    if (gmoVar3 != null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(v).length() + 63 + String.valueOf(j).length());
                        fn0.t(v, "Unexpected audio track timestamp discontinuity: expected ", ", got ", sb);
                        sb.append(j);
                        gmoVar3.e(new zzsg(sb.toString()));
                    }
                    this.C = true;
                }
                if (this.C) {
                    if (g()) {
                        long j6 = j - v;
                        this.E += j6;
                        this.C = false;
                        k(j);
                        gmo gmoVar4 = this.l;
                        if (gmoVar4 != null && j6 != j3) {
                            ((zzuc) gmoVar4.b).H0 = true;
                        }
                    }
                    return false;
                }
                if (this.n.c()) {
                    this.x += byteBuffer.remaining();
                } else {
                    this.y = (this.B * i) + this.y;
                }
                this.H = byteBuffer;
                this.I = i;
            }
            return true;
        }
        j2 = -9223372036854775807L;
        j3 = 0;
        f(j);
        if (!this.H.hasRemaining()) {
            this.H = null;
            this.I = 0;
            return true;
        }
        zztd zztdVar4 = this.r;
        g7p g7pVar2 = zztdVar4.e;
        long g2 = zztdVar4.g();
        if (g7pVar2.v == j2 || g2 <= j3 || g7pVar2.b.zzb() - g7pVar2.v < 200) {
            return false;
        }
        zzeh.c("Resetting stalled audio output");
        a();
        return true;
    }

    public final void s() {
        if (!this.K && l() && g()) {
            if (!this.L) {
                this.L = true;
                if (this.r.b()) {
                    this.M = false;
                }
                zztd zztdVar = this.r;
                if (!zztdVar.j) {
                    zztdVar.j = true;
                    g7p g7pVar = zztdVar.e;
                    long g = zztdVar.g();
                    g7pVar.w = g7pVar.c();
                    g7pVar.u = zzfm.u(g7pVar.b.zzb());
                    g7pVar.x = g;
                    zztdVar.a.stop();
                }
            }
            this.K = true;
        }
    }

    public final boolean t() {
        if (!l()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.r.b() && this.M) {
            return false;
        }
        long m = m();
        long d = this.r.d();
        zztd zztdVar = this.r;
        zztdVar.getClass();
        return m > zzfm.w(d, (long) zztdVar.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }
}
