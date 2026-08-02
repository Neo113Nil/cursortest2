package v1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.p;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2356j;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.T;
import e1.Z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import k1.f;
import m1.C5507g;
import m1.C5509h;
import m1.O0;
import n1.G1;
import o1.b0;
import q1.C6090B;
import q1.InterfaceC6104m;
import v1.AbstractC6610O;
import v1.InterfaceC6627q;

/* renamed from: v1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6596A extends androidx.media3.exoplayer.c {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public final ArrayDeque f66824A;

    /* renamed from: B, reason: collision with root package name */
    public final b0 f66825B;

    /* renamed from: C, reason: collision with root package name */
    public androidx.media3.common.a f66826C;

    /* renamed from: D, reason: collision with root package name */
    public androidx.media3.common.a f66827D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC6104m f66828E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC6104m f66829F;

    /* renamed from: G, reason: collision with root package name */
    public p.a f66830G;

    /* renamed from: H, reason: collision with root package name */
    public MediaCrypto f66831H;

    /* renamed from: I, reason: collision with root package name */
    public long f66832I;

    /* renamed from: J, reason: collision with root package name */
    public float f66833J;

    /* renamed from: K, reason: collision with root package name */
    public float f66834K;

    /* renamed from: L, reason: collision with root package name */
    public InterfaceC6627q f66835L;

    /* renamed from: O, reason: collision with root package name */
    public androidx.media3.common.a f66836O;

    /* renamed from: P, reason: collision with root package name */
    public MediaFormat f66837P;

    /* renamed from: P4, reason: collision with root package name */
    public boolean f66838P4;

    /* renamed from: Q4, reason: collision with root package name */
    public boolean f66839Q4;

    /* renamed from: R, reason: collision with root package name */
    public boolean f66840R;

    /* renamed from: R4, reason: collision with root package name */
    public boolean f66841R4;

    /* renamed from: S4, reason: collision with root package name */
    public boolean f66842S4;

    /* renamed from: T, reason: collision with root package name */
    public float f66843T;

    /* renamed from: T1, reason: collision with root package name */
    public long f66844T1;

    /* renamed from: T4, reason: collision with root package name */
    public boolean f66845T4;

    /* renamed from: U4, reason: collision with root package name */
    public int f66846U4;

    /* renamed from: V, reason: collision with root package name */
    public ArrayDeque f66847V;

    /* renamed from: V1, reason: collision with root package name */
    public boolean f66848V1;

    /* renamed from: V4, reason: collision with root package name */
    public int f66849V4;

    /* renamed from: W, reason: collision with root package name */
    public c f66850W;

    /* renamed from: W4, reason: collision with root package name */
    public int f66851W4;

    /* renamed from: X, reason: collision with root package name */
    public t f66852X;

    /* renamed from: X4, reason: collision with root package name */
    public boolean f66853X4;

    /* renamed from: Y, reason: collision with root package name */
    public int f66854Y;

    /* renamed from: Y4, reason: collision with root package name */
    public boolean f66855Y4;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f66856Z;

    /* renamed from: Z4, reason: collision with root package name */
    public boolean f66857Z4;

    /* renamed from: a5, reason: collision with root package name */
    public long f66858a5;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f66859b1;

    /* renamed from: b2, reason: collision with root package name */
    public long f66860b2;

    /* renamed from: b5, reason: collision with root package name */
    public long f66861b5;

    /* renamed from: c5, reason: collision with root package name */
    public boolean f66862c5;

    /* renamed from: d5, reason: collision with root package name */
    public boolean f66863d5;

    /* renamed from: e5, reason: collision with root package name */
    public boolean f66864e5;

    /* renamed from: f5, reason: collision with root package name */
    public boolean f66865f5;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f66866g1;

    /* renamed from: g2, reason: collision with root package name */
    public int f66867g2;

    /* renamed from: g5, reason: collision with root package name */
    public m1.I f66868g5;

    /* renamed from: h5, reason: collision with root package name */
    public C5507g f66869h5;

    /* renamed from: i5, reason: collision with root package name */
    public e f66870i5;

    /* renamed from: j5, reason: collision with root package name */
    public long f66871j5;

    /* renamed from: k5, reason: collision with root package name */
    public boolean f66872k5;

    /* renamed from: l5, reason: collision with root package name */
    public boolean f66873l5;

    /* renamed from: m5, reason: collision with root package name */
    public boolean f66874m5;

    /* renamed from: n5, reason: collision with root package name */
    public long f66875n5;

    /* renamed from: o5, reason: collision with root package name */
    public long f66876o5;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f66877p1;

    /* renamed from: p2, reason: collision with root package name */
    public int f66878p2;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC6627q.b f66879r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC6600E f66880s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f66881t;

    /* renamed from: u, reason: collision with root package name */
    public final float f66882u;

    /* renamed from: v, reason: collision with root package name */
    public final k1.f f66883v;

    /* renamed from: w, reason: collision with root package name */
    public final k1.f f66884w;

    /* renamed from: x, reason: collision with root package name */
    public final k1.f f66885x;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f66886x1;

    /* renamed from: x2, reason: collision with root package name */
    public ByteBuffer f66887x2;

    /* renamed from: y, reason: collision with root package name */
    public final C6619i f66888y;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f66889y1;

    /* renamed from: y2, reason: collision with root package name */
    public boolean f66890y2;

    /* renamed from: z, reason: collision with root package name */
    public final MediaCodec.BufferInfo f66891z;

    /* renamed from: v1.A$b */
    public static final class b {
        public static void a(InterfaceC6627q.a aVar, G1 g12) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId a10 = g12.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a10.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.f66977b;
            stringId = a10.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    /* renamed from: v1.A$d */
    public final class d implements InterfaceC6627q.c {
        public d() {
        }

        @Override // v1.InterfaceC6627q.c
        public void a() {
            if (AbstractC6596A.this.f66830G != null) {
                AbstractC6596A.this.f66830G.b();
            }
        }

        @Override // v1.InterfaceC6627q.c
        public void b() {
            if (AbstractC6596A.this.f66830G != null) {
                AbstractC6596A.this.f66830G.b();
            }
        }
    }

    /* renamed from: v1.A$e */
    public static final class e {

        /* renamed from: e, reason: collision with root package name */
        public static final e f66898e = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f66899a;

        /* renamed from: b, reason: collision with root package name */
        public final long f66900b;

        /* renamed from: c, reason: collision with root package name */
        public final long f66901c;

        /* renamed from: d, reason: collision with root package name */
        public final e1.P f66902d = new e1.P();

        public e(long j10, long j11, long j12) {
            this.f66899a = j10;
            this.f66900b = j11;
            this.f66901c = j12;
        }
    }

    public AbstractC6596A(int i10, InterfaceC6627q.b bVar, InterfaceC6600E interfaceC6600E, boolean z10, float f10) {
        super(i10);
        this.f66879r = bVar;
        this.f66880s = (InterfaceC6600E) AbstractC4134a.e(interfaceC6600E);
        this.f66881t = z10;
        this.f66882u = f10;
        this.f66883v = k1.f.s();
        this.f66884w = new k1.f(0);
        this.f66885x = new k1.f(2);
        C6619i c6619i = new C6619i();
        this.f66888y = c6619i;
        this.f66891z = new MediaCodec.BufferInfo();
        this.f66833J = 1.0f;
        this.f66834K = 1.0f;
        this.f66832I = -9223372036854775807L;
        this.f66824A = new ArrayDeque();
        this.f66870i5 = e.f66898e;
        c6619i.p(0);
        c6619i.f54108d.order(ByteOrder.nativeOrder());
        this.f66825B = new b0();
        this.f66843T = -1.0f;
        this.f66854Y = 0;
        this.f66846U4 = 0;
        this.f66867g2 = -1;
        this.f66878p2 = -1;
        this.f66860b2 = -9223372036854775807L;
        this.f66858a5 = -9223372036854775807L;
        this.f66861b5 = -9223372036854775807L;
        this.f66871j5 = -9223372036854775807L;
        this.f66844T1 = -9223372036854775807L;
        this.f66849V4 = 0;
        this.f66851W4 = 0;
        this.f66869h5 = new C5507g();
        this.f66875n5 = -9223372036854775807L;
        this.f66876o5 = -9223372036854775807L;
    }

    public static boolean b2(androidx.media3.common.a aVar) {
        int i10 = aVar.f20527O;
        return i10 == 0 || i10 == 2;
    }

    public static boolean m1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean w0(String str) {
        return false;
    }

    public static boolean x0(String str) {
        return false;
    }

    public static boolean y0(t tVar) {
        String str = tVar.f66986a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && tVar.f66992g;
        }
        return true;
    }

    public static boolean z0(String str) {
        return Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    public C6628s A0(Throwable th2, t tVar) {
        return new C6628s(th2, tVar);
    }

    public final void A1() {
        int i10 = this.f66851W4;
        if (i10 == 1) {
            J0();
            return;
        }
        if (i10 == 2) {
            J0();
            e2();
        } else if (i10 == 3) {
            E1();
        } else {
            this.f66863d5 = true;
            G1();
        }
    }

    @Override // androidx.media3.exoplayer.p
    public final long B(long j10, long j11) {
        return V0(j10, j11, this.f66848V1);
    }

    public final void B0() {
        this.f66839Q4 = false;
        H1();
    }

    public abstract boolean B1(long j10, long j11, InterfaceC6627q interfaceC6627q, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, androidx.media3.common.a aVar);

    public final boolean C0() {
        if (this.f66853X4) {
            this.f66849V4 = 1;
            if (this.f66859b1) {
                this.f66851W4 = 3;
                return false;
            }
            this.f66851W4 = 1;
        }
        return true;
    }

    public final void C1() {
        this.f66857Z4 = true;
        MediaFormat outputFormat = ((InterfaceC6627q) AbstractC4134a.e(this.f66835L)).getOutputFormat();
        if (this.f66854Y != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f66886x1 = true;
        } else {
            this.f66837P = outputFormat;
            this.f66840R = true;
        }
    }

    public final void D0() {
        if (!this.f66853X4) {
            E1();
        } else {
            this.f66849V4 = 1;
            this.f66851W4 = 3;
        }
    }

    public final boolean D1(int i10) {
        O0 V10 = V();
        this.f66883v.f();
        int o02 = o0(V10, this.f66883v, i10 | 4);
        if (o02 == -5) {
            t1(V10);
            return true;
        }
        if (o02 != -4 || !this.f66883v.i()) {
            return false;
        }
        this.f66862c5 = true;
        A1();
        return false;
    }

    public final boolean E0() {
        if (this.f66853X4) {
            this.f66849V4 = 1;
            if (this.f66859b1) {
                this.f66851W4 = 3;
                return false;
            }
            this.f66851W4 = 2;
        } else {
            e2();
        }
        return true;
    }

    public final void E1() {
        F1();
        n1();
    }

    public final boolean F0(long j10, long j11) {
        boolean z10;
        boolean B12;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int k10;
        InterfaceC6627q interfaceC6627q = (InterfaceC6627q) AbstractC4134a.e(this.f66835L);
        if (!d1()) {
            if (this.f66866g1 && this.f66855Y4) {
                try {
                    k10 = interfaceC6627q.k(this.f66891z);
                } catch (IllegalStateException unused) {
                    A1();
                    if (this.f66863d5) {
                        F1();
                    }
                    return false;
                }
            } else {
                k10 = interfaceC6627q.k(this.f66891z);
            }
            if (k10 < 0) {
                if (k10 == -2) {
                    C1();
                    return true;
                }
                if (this.f66889y1 && (this.f66862c5 || this.f66849V4 == 2)) {
                    A1();
                }
                long j12 = this.f66844T1;
                if (j12 != -9223372036854775807L && j12 + 100 < T().a()) {
                    A1();
                }
                return false;
            }
            if (this.f66886x1) {
                this.f66886x1 = false;
                interfaceC6627q.releaseOutputBuffer(k10, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f66891z;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                A1();
                return false;
            }
            this.f66878p2 = k10;
            ByteBuffer l10 = interfaceC6627q.l(k10);
            this.f66887x2 = l10;
            if (l10 != null) {
                l10.position(this.f66891z.offset);
                ByteBuffer byteBuffer2 = this.f66887x2;
                MediaCodec.BufferInfo bufferInfo3 = this.f66891z;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            f2(this.f66891z.presentationTimeUs);
        }
        this.f66890y2 = this.f66891z.presentationTimeUs < X();
        long j13 = this.f66861b5;
        this.f66838P4 = j13 != -9223372036854775807L && j13 <= this.f66891z.presentationTimeUs;
        if (this.f66874m5) {
            long j14 = this.f66875n5;
            if (j14 == -9223372036854775807L || this.f66891z.presentationTimeUs > j14) {
                this.f66875n5 = this.f66891z.presentationTimeUs;
                this.f66890y2 = true;
                this.f66838P4 = false;
            } else {
                this.f66874m5 = false;
                this.f66875n5 = -9223372036854775807L;
            }
        }
        if (this.f66866g1 && this.f66855Y4) {
            try {
                byteBuffer = this.f66887x2;
                i10 = this.f66878p2;
                bufferInfo = this.f66891z;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                B12 = B1(j10, j11, interfaceC6627q, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f66890y2, this.f66838P4, (androidx.media3.common.a) AbstractC4134a.e(this.f66827D));
            } catch (IllegalStateException unused3) {
                A1();
                if (this.f66863d5) {
                    F1();
                }
                return z10;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.f66887x2;
            int i11 = this.f66878p2;
            MediaCodec.BufferInfo bufferInfo4 = this.f66891z;
            B12 = B1(j10, j11, interfaceC6627q, byteBuffer3, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f66890y2, this.f66838P4, (androidx.media3.common.a) AbstractC4134a.e(this.f66827D));
        }
        if (B12) {
            w1(this.f66891z.presentationTimeUs);
            boolean z11 = (this.f66891z.flags & 4) != 0 ? true : z10;
            if (!z11 && this.f66855Y4 && this.f66838P4) {
                this.f66844T1 = T().a();
            }
            M1();
            if (!z11) {
                return true;
            }
            A1();
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void F1() {
        try {
            InterfaceC6627q interfaceC6627q = this.f66835L;
            if (interfaceC6627q != null) {
                interfaceC6627q.release();
                this.f66869h5.f56197b++;
                s1(((t) AbstractC4134a.e(this.f66852X)).f66986a);
            }
            this.f66835L = null;
            try {
                MediaCrypto mediaCrypto = this.f66831H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f66835L = null;
            try {
                MediaCrypto mediaCrypto2 = this.f66831H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public final boolean G0(t tVar, androidx.media3.common.a aVar, InterfaceC6104m interfaceC6104m, InterfaceC6104m interfaceC6104m2) {
        k1.b f10;
        k1.b f11;
        if (interfaceC6104m == interfaceC6104m2) {
            return false;
        }
        if (interfaceC6104m2 != null && interfaceC6104m != null && (f10 = interfaceC6104m2.f()) != null && (f11 = interfaceC6104m.f()) != null && f10.getClass().equals(f11.getClass())) {
            if (!(f10 instanceof C6090B)) {
                return false;
            }
            if (!interfaceC6104m2.a().equals(interfaceC6104m.a())) {
                return true;
            }
            UUID uuid = AbstractC2356j.f24595e;
            if (!uuid.equals(interfaceC6104m.a()) && !uuid.equals(interfaceC6104m2.a())) {
                return !tVar.f66992g && (interfaceC6104m2.getState() == 2 || ((interfaceC6104m2.getState() == 3 || interfaceC6104m2.getState() == 4) && interfaceC6104m2.h((String) AbstractC4134a.e(aVar.f20543o))));
            }
        }
        return true;
    }

    public abstract void G1();

    public void H0() {
        this.f66873l5 = true;
    }

    public final void H1() {
        K1();
        this.f66842S4 = false;
        this.f66888y.f();
        this.f66885x.f();
        this.f66841R4 = false;
        this.f66825B.d();
    }

    @Override // androidx.media3.exoplayer.p
    public void I(float f10, float f11) {
        this.f66833J = f10;
        this.f66834K = f11;
        d2(this.f66836O);
    }

    public final boolean I0() {
        int i10;
        if (this.f66835L == null || (i10 = this.f66849V4) == 2 || this.f66862c5) {
            return false;
        }
        if (i10 == 0 && W1()) {
            D0();
        }
        InterfaceC6627q interfaceC6627q = (InterfaceC6627q) AbstractC4134a.e(this.f66835L);
        if (this.f66867g2 < 0) {
            int j10 = interfaceC6627q.j();
            this.f66867g2 = j10;
            if (j10 < 0) {
                return false;
            }
            this.f66884w.f54108d = interfaceC6627q.d(j10);
            this.f66884w.f();
        }
        if (this.f66849V4 == 1) {
            if (!this.f66889y1) {
                this.f66855Y4 = true;
                interfaceC6627q.queueInputBuffer(this.f66867g2, 0, 0, 0L, 4);
                L1();
            }
            this.f66849V4 = 2;
            return false;
        }
        if (this.f66877p1) {
            this.f66877p1 = false;
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(this.f66884w.f54108d);
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            interfaceC6627q.queueInputBuffer(this.f66867g2, 0, bArr.length, 0L, 0);
            L1();
            this.f66853X4 = true;
            return true;
        }
        if (this.f66846U4 == 1) {
            for (int i11 = 0; i11 < ((androidx.media3.common.a) AbstractC4134a.e(this.f66836O)).f20546r.size(); i11++) {
                ((ByteBuffer) AbstractC4134a.e(this.f66884w.f54108d)).put((byte[]) this.f66836O.f20546r.get(i11));
            }
            this.f66846U4 = 2;
        }
        int position = ((ByteBuffer) AbstractC4134a.e(this.f66884w.f54108d)).position();
        O0 V10 = V();
        try {
            int o02 = o0(V10, this.f66884w, 0);
            if (o02 == -3) {
                if (i()) {
                    this.f66861b5 = this.f66858a5;
                }
                return false;
            }
            if (o02 == -5) {
                if (this.f66846U4 == 2) {
                    this.f66884w.f();
                    this.f66846U4 = 1;
                }
                t1(V10);
                return true;
            }
            if (this.f66884w.i()) {
                this.f66861b5 = this.f66858a5;
                if (this.f66846U4 == 2) {
                    this.f66884w.f();
                    this.f66846U4 = 1;
                }
                this.f66862c5 = true;
                if (!this.f66853X4) {
                    A1();
                    return false;
                }
                if (!this.f66889y1) {
                    this.f66855Y4 = true;
                    interfaceC6627q.queueInputBuffer(this.f66867g2, 0, 0, 0L, 4);
                    L1();
                }
                return false;
            }
            if (!this.f66853X4 && !this.f66884w.k()) {
                this.f66884w.f();
                if (this.f66846U4 == 2) {
                    this.f66846U4 = 1;
                }
                return true;
            }
            if (T1(this.f66884w)) {
                return true;
            }
            boolean r10 = this.f66884w.r();
            if (r10) {
                this.f66884w.f54107c.b(position);
            }
            long j11 = this.f66884w.f54110f;
            if (this.f66864e5) {
                if (this.f66824A.isEmpty()) {
                    this.f66870i5.f66902d.a(j11, (androidx.media3.common.a) AbstractC4134a.e(this.f66826C));
                } else {
                    ((e) this.f66824A.peekLast()).f66902d.a(j11, (androidx.media3.common.a) AbstractC4134a.e(this.f66826C));
                }
                this.f66864e5 = false;
            }
            this.f66858a5 = Math.max(this.f66858a5, j11);
            if (i() || this.f66884w.l()) {
                this.f66861b5 = this.f66858a5;
            }
            this.f66884w.q();
            if (this.f66884w.h()) {
                c1(this.f66884w);
            }
            y1(this.f66884w);
            int O02 = O0(this.f66884w);
            if ((Build.VERSION.SDK_INT < 34 || (O02 & 32) == 0) && !U().f56267b) {
                this.f66876o5 = Math.max(this.f66876o5, this.f66884w.f54110f);
            }
            if (r10) {
                ((InterfaceC6627q) AbstractC4134a.e(interfaceC6627q)).a(this.f66867g2, 0, this.f66884w.f54107c, j11, O02);
            } else {
                ((InterfaceC6627q) AbstractC4134a.e(interfaceC6627q)).queueInputBuffer(this.f66867g2, 0, ((ByteBuffer) AbstractC4134a.e(this.f66884w.f54108d)).limit(), j11, O02);
            }
            L1();
            this.f66853X4 = true;
            this.f66846U4 = 0;
            this.f66869h5.f56198c++;
            return true;
        } catch (f.a e10) {
            q1(e10);
            D1(0);
            J0();
            return true;
        }
    }

    public void I1() {
        L1();
        M1();
        K1();
        this.f66860b2 = -9223372036854775807L;
        this.f66855Y4 = false;
        this.f66844T1 = -9223372036854775807L;
        this.f66853X4 = false;
        this.f66877p1 = false;
        this.f66886x1 = false;
        this.f66890y2 = false;
        this.f66838P4 = false;
        this.f66849V4 = 0;
        this.f66851W4 = 0;
        this.f66846U4 = this.f66845T4 ? 1 : 0;
        this.f66874m5 = false;
        this.f66875n5 = -9223372036854775807L;
        this.f66876o5 = -9223372036854775807L;
    }

    public final void J0() {
        try {
            ((InterfaceC6627q) AbstractC4134a.i(this.f66835L)).flush();
        } finally {
            I1();
        }
    }

    public void J1() {
        I1();
        this.f66868g5 = null;
        this.f66847V = null;
        this.f66852X = null;
        this.f66836O = null;
        this.f66837P = null;
        this.f66840R = false;
        this.f66857Z4 = false;
        this.f66843T = -1.0f;
        this.f66854Y = 0;
        this.f66856Z = false;
        this.f66859b1 = false;
        this.f66866g1 = false;
        this.f66889y1 = false;
        this.f66848V1 = false;
        this.f66845T4 = false;
        this.f66846U4 = 0;
    }

    @Override // androidx.media3.exoplayer.c, androidx.media3.exoplayer.q
    public final int K() {
        return 8;
    }

    public final boolean K0() {
        boolean L02 = L0();
        if (L02) {
            n1();
        }
        return L02;
    }

    public final void K1() {
        this.f66858a5 = -9223372036854775807L;
        this.f66861b5 = -9223372036854775807L;
        this.f66871j5 = -9223372036854775807L;
    }

    public final boolean L0() {
        if (this.f66835L == null) {
            return false;
        }
        if (X1()) {
            F1();
            return true;
        }
        if (U1()) {
            J0();
        } else {
            z1();
        }
        return false;
    }

    public final void L1() {
        this.f66867g2 = -1;
        this.f66884w.f54108d = null;
    }

    public final List M0(boolean z10) {
        androidx.media3.common.a aVar = (androidx.media3.common.a) AbstractC4134a.e(this.f66826C);
        List U02 = U0(this.f66880s, aVar, z10);
        if (!U02.isEmpty() || !z10) {
            return U02;
        }
        List U03 = U0(this.f66880s, aVar, false);
        if (!U03.isEmpty()) {
            AbstractC4156x.i("MediaCodecRenderer", "Drm session requires secure decoder for " + aVar.f20543o + ", but no secure decoder available. Trying to proceed with " + U03 + ".");
        }
        return U03;
    }

    public final void M1() {
        this.f66878p2 = -1;
        this.f66887x2 = null;
    }

    public final InterfaceC6627q N0() {
        return this.f66835L;
    }

    public final void N1(InterfaceC6104m interfaceC6104m) {
        InterfaceC6104m.e(this.f66828E, interfaceC6104m);
        this.f66828E = interfaceC6104m;
    }

    public int O0(k1.f fVar) {
        return 0;
    }

    public final void O1(e eVar) {
        this.f66870i5 = eVar;
        long j10 = eVar.f66901c;
        if (j10 != -9223372036854775807L) {
            this.f66872k5 = true;
            v1(j10);
        }
    }

    public final t P0() {
        return this.f66852X;
    }

    public final void P1() {
        this.f66865f5 = true;
    }

    public final androidx.media3.common.a Q0() {
        return this.f66836O;
    }

    public final void Q1(m1.I i10) {
        this.f66868g5 = i10;
    }

    public boolean R0() {
        return false;
    }

    public final void R1(InterfaceC6104m interfaceC6104m) {
        InterfaceC6104m.e(this.f66829F, interfaceC6104m);
        this.f66829F = interfaceC6104m;
    }

    public abstract float S0(float f10, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr);

    public final boolean S1(long j10) {
        return this.f66832I == -9223372036854775807L || T().b() - j10 < this.f66832I;
    }

    public final MediaFormat T0() {
        return this.f66837P;
    }

    public boolean T1(k1.f fVar) {
        if (!Y1(fVar)) {
            return false;
        }
        fVar.f();
        this.f66869h5.f56199d++;
        return true;
    }

    public abstract List U0(InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar, boolean z10);

    public boolean U1() {
        return true;
    }

    public long V0(long j10, long j11, boolean z10) {
        return super.B(j10, j11);
    }

    public boolean V1(t tVar) {
        return true;
    }

    public long W0() {
        return this.f66861b5;
    }

    public boolean W1() {
        return false;
    }

    public abstract InterfaceC6627q.a X0(t tVar, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, float f10);

    public boolean X1() {
        int i10 = this.f66851W4;
        if (i10 == 3 || ((this.f66856Z && !this.f66857Z4) || (this.f66859b1 && this.f66855Y4))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        AbstractC4134a.g(true);
        try {
            e2();
            return false;
        } catch (m1.I e10) {
            AbstractC4156x.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    public final long Y0() {
        return this.f66870i5.f66901c;
    }

    public boolean Y1(k1.f fVar) {
        return false;
    }

    public final long Z0() {
        return this.f66870i5.f66900b;
    }

    public boolean Z1(androidx.media3.common.a aVar) {
        return false;
    }

    @Override // androidx.media3.exoplayer.q
    public final int a(androidx.media3.common.a aVar) {
        try {
            return a2(this.f66880s, aVar);
        } catch (AbstractC6610O.c e10) {
            throw R(e10, aVar, 4002);
        }
    }

    public float a1() {
        return this.f66833J;
    }

    public abstract int a2(InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar);

    @Override // androidx.media3.exoplayer.p
    public boolean b() {
        return this.f66863d5;
    }

    public final p.a b1() {
        return this.f66830G;
    }

    @Override // androidx.media3.exoplayer.p
    public boolean c() {
        if (this.f66826C == null) {
            return false;
        }
        if (c0() || d1()) {
            return true;
        }
        return this.f66860b2 != -9223372036854775807L && T().b() < this.f66860b2;
    }

    public abstract void c1(k1.f fVar);

    public final boolean c2() {
        return d2(this.f66836O);
    }

    @Override // androidx.media3.exoplayer.c
    public void d0() {
        this.f66826C = null;
        O1(e.f66898e);
        this.f66824A.clear();
        if (this.f66839Q4) {
            B0();
        } else {
            L0();
        }
    }

    public final boolean d1() {
        return this.f66878p2 >= 0;
    }

    public final boolean d2(androidx.media3.common.a aVar) {
        if (this.f66835L != null && this.f66851W4 != 3 && getState() != 0) {
            float S02 = S0(this.f66834K, (androidx.media3.common.a) AbstractC4134a.e(aVar), Z());
            float f10 = this.f66843T;
            if (f10 == S02) {
                return true;
            }
            if (S02 == -1.0f) {
                D0();
                return false;
            }
            if (f10 == -1.0f && S02 <= this.f66882u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", S02);
            ((InterfaceC6627q) AbstractC4134a.e(this.f66835L)).setParameters(bundle);
            this.f66843T = S02;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.c
    public void e0(boolean z10, boolean z11) {
        this.f66869h5 = new C5507g();
    }

    public boolean e1() {
        return this.f66874m5;
    }

    public final void e2() {
        k1.b f10 = ((InterfaceC6104m) AbstractC4134a.e(this.f66829F)).f();
        if (f10 instanceof C6090B) {
            try {
                ((MediaCrypto) AbstractC4134a.e(this.f66831H)).setMediaDrmSession(((C6090B) f10).sessionId);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f66826C, 6006);
            }
        }
        N1(this.f66829F);
        this.f66849V4 = 0;
        this.f66851W4 = 0;
    }

    public final boolean f1() {
        if (!this.f66888y.z()) {
            return true;
        }
        long X10 = X();
        return l1(X10, this.f66888y.x()) == l1(X10, this.f66885x.f54110f);
    }

    public final void f2(long j10) {
        androidx.media3.common.a aVar = (androidx.media3.common.a) this.f66870i5.f66902d.j(j10);
        if (aVar == null && this.f66872k5 && this.f66837P != null) {
            aVar = (androidx.media3.common.a) this.f66870i5.f66902d.i();
        }
        if (aVar != null) {
            this.f66827D = aVar;
        } else if (!this.f66840R || this.f66827D == null) {
            return;
        }
        u1((androidx.media3.common.a) AbstractC4134a.e(this.f66827D), this.f66837P);
        this.f66840R = false;
        this.f66872k5 = false;
    }

    @Override // androidx.media3.exoplayer.c
    public void g0(long j10, boolean z10) {
        this.f66862c5 = false;
        this.f66863d5 = false;
        this.f66865f5 = false;
        if (this.f66839Q4) {
            H1();
        } else {
            K0();
        }
        if (this.f66870i5.f66902d.l() > 0) {
            this.f66864e5 = true;
        }
        this.f66870i5.f66902d.c();
        this.f66824A.clear();
    }

    public final void g1(androidx.media3.common.a aVar) {
        B0();
        String str = aVar.f20543o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f66888y.A(32);
        } else {
            this.f66888y.A(1);
        }
        this.f66839Q4 = true;
    }

    @Override // androidx.media3.exoplayer.p
    public void h(long j10, long j11) {
        boolean z10 = false;
        if (this.f66865f5) {
            this.f66865f5 = false;
            A1();
        }
        m1.I i10 = this.f66868g5;
        if (i10 != null) {
            this.f66868g5 = null;
            throw i10;
        }
        try {
            if (this.f66863d5) {
                G1();
                return;
            }
            if (this.f66826C != null || D1(2)) {
                n1();
                if (this.f66839Q4) {
                    T.a("bypassRender");
                    while (t0(j10, j11)) {
                    }
                    T.b();
                } else if (this.f66835L != null) {
                    long b10 = T().b();
                    T.a("drainAndFeed");
                    while (F0(j10, j11) && S1(b10)) {
                    }
                    while (I0() && S1(b10)) {
                    }
                    T.b();
                } else {
                    this.f66869h5.f56199d += q0(j10);
                    D1(1);
                }
                this.f66869h5.c();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw R(e10, this.f66826C, Z.f0(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            if (!m1(e11)) {
                throw e11;
            }
            q1(e11);
            if ((e11 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                F1();
            }
            C6628s A02 = A0(e11, P0());
            throw S(A02, this.f66826C, z10, A02.f66985c == 1101 ? 4006 : 4003);
        }
    }

    public final void h1(t tVar, MediaCrypto mediaCrypto) {
        this.f66852X = tVar;
        androidx.media3.common.a aVar = (androidx.media3.common.a) AbstractC4134a.e(this.f66826C);
        String str = tVar.f66986a;
        int i10 = Build.VERSION.SDK_INT;
        float S02 = S0(this.f66834K, aVar, Z());
        if (S02 <= this.f66882u) {
            S02 = -1.0f;
        }
        long b10 = T().b();
        InterfaceC6627q.a X02 = X0(tVar, aVar, mediaCrypto, S02);
        if (i10 >= 31) {
            b.a(X02, Y());
        }
        try {
            T.a("createCodec:" + str);
            InterfaceC6627q b11 = this.f66879r.b(X02);
            this.f66835L = b11;
            this.f66848V1 = b11.h(new d());
            T.b();
            long b12 = T().b();
            if (!tVar.p(aVar)) {
                AbstractC4156x.i("MediaCodecRenderer", Z.G("Format exceeds selected codec's capabilities [%s, %s]", androidx.media3.common.a.h(aVar), str));
            }
            this.f66843T = S02;
            this.f66836O = aVar;
            this.f66854Y = v0(str);
            this.f66856Z = z0(str);
            this.f66859b1 = w0(str);
            this.f66866g1 = x0(str);
            this.f66889y1 = y0(tVar) || R0();
            if (((InterfaceC6627q) AbstractC4134a.e(this.f66835L)).g()) {
                this.f66845T4 = true;
                this.f66846U4 = 1;
                this.f66877p1 = this.f66854Y != 0;
            }
            if (getState() == 2) {
                this.f66860b2 = T().b() + 1000;
            }
            this.f66869h5.f56196a++;
            r1(str, X02, b12, b12 - b10);
        } catch (Throwable th2) {
            T.b();
            throw th2;
        }
    }

    public final boolean i1() {
        AbstractC4134a.g(this.f66831H == null);
        InterfaceC6104m interfaceC6104m = this.f66828E;
        k1.b f10 = interfaceC6104m.f();
        if (C6090B.f63230c && (f10 instanceof C6090B)) {
            int state = interfaceC6104m.getState();
            if (state == 1) {
                InterfaceC6104m.a aVar = (InterfaceC6104m.a) AbstractC4134a.e(interfaceC6104m.getError());
                throw R(aVar, this.f66826C, aVar.f63330a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (f10 == null) {
            return interfaceC6104m.getError() != null;
        }
        if (f10 instanceof C6090B) {
            C6090B c6090b = (C6090B) f10;
            try {
                this.f66831H = new MediaCrypto(c6090b.f63231a, c6090b.sessionId);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f66826C, 6006);
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.c
    public void j0() {
        try {
            B0();
            F1();
        } finally {
            R1(null);
        }
    }

    public final boolean j1() {
        return this.f66839Q4;
    }

    public final boolean k1(androidx.media3.common.a aVar) {
        return this.f66829F == null && Z1(aVar);
    }

    public final boolean l1(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        androidx.media3.common.a aVar = this.f66827D;
        return (aVar != null && Objects.equals(aVar.f20543o, "audio/opus") && H1.H.g(j10, j11)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m0(androidx.media3.common.a[] aVarArr, long j10, long j11, D.b bVar) {
        if (this.f66870i5.f66901c == -9223372036854775807L) {
            O1(new e(-9223372036854775807L, j10, j11));
            if (this.f66873l5) {
                x1();
                return;
            }
            return;
        }
        if (this.f66824A.isEmpty()) {
            long j12 = this.f66858a5;
            if (j12 != -9223372036854775807L) {
                long j13 = this.f66871j5;
                if (j13 != -9223372036854775807L) {
                }
            }
            O1(new e(-9223372036854775807L, j10, j11));
            if (this.f66870i5.f66901c != -9223372036854775807L) {
                x1();
                return;
            }
            return;
        }
        this.f66824A.add(new e(this.f66858a5, j10, j11));
    }

    public final void n1() {
        androidx.media3.common.a aVar;
        boolean z10;
        if (this.f66835L != null || this.f66839Q4 || (aVar = this.f66826C) == null) {
            return;
        }
        if (k1(aVar)) {
            g1(aVar);
            return;
        }
        N1(this.f66829F);
        if (this.f66828E == null || i1()) {
            try {
                InterfaceC6104m interfaceC6104m = this.f66828E;
                if (interfaceC6104m != null) {
                    if (interfaceC6104m.getState() != 3) {
                        if (this.f66828E.getState() == 4) {
                        }
                    }
                    if (this.f66828E.h((String) AbstractC4134a.i(aVar.f20543o))) {
                        z10 = true;
                        o1(this.f66831H, z10);
                    }
                }
                z10 = false;
                o1(this.f66831H, z10);
            } catch (c e10) {
                throw R(e10, aVar, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.f66831H;
        if (mediaCrypto == null || this.f66835L != null) {
            return;
        }
        mediaCrypto.release();
        this.f66831H = null;
    }

    public final void o1(MediaCrypto mediaCrypto, boolean z10) {
        androidx.media3.common.a aVar = (androidx.media3.common.a) AbstractC4134a.e(this.f66826C);
        if (this.f66847V == null) {
            try {
                List M02 = M0(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f66847V = arrayDeque;
                if (this.f66881t) {
                    arrayDeque.addAll(M02);
                } else if (!M02.isEmpty()) {
                    this.f66847V.add((t) M02.get(0));
                }
                this.f66850W = null;
            } catch (AbstractC6610O.c e10) {
                throw new c(aVar, e10, z10, -49998);
            }
        }
        if (this.f66847V.isEmpty()) {
            throw new c(aVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) AbstractC4134a.e(this.f66847V);
        while (this.f66835L == null) {
            t tVar = (t) AbstractC4134a.e((t) arrayDeque2.peekFirst());
            if (!p1(aVar) || !V1(tVar)) {
                return;
            }
            try {
                h1(tVar, mediaCrypto);
            } catch (Exception e11) {
                AbstractC4156x.j("MediaCodecRenderer", "Failed to initialize decoder: " + tVar, e11);
                arrayDeque2.removeFirst();
                c cVar = new c(aVar, e11, z10, tVar);
                q1(cVar);
                if (this.f66850W == null) {
                    this.f66850W = cVar;
                } else {
                    this.f66850W = this.f66850W.c(cVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f66850W;
                }
            }
        }
        this.f66847V = null;
    }

    public boolean p1(androidx.media3.common.a aVar) {
        return true;
    }

    public abstract void q1(Exception exc);

    public abstract void r1(String str, InterfaceC6627q.a aVar, long j10, long j11);

    public final void s0() {
        AbstractC4134a.g(!this.f66862c5);
        O0 V10 = V();
        this.f66885x.f();
        do {
            this.f66885x.f();
            int o02 = o0(V10, this.f66885x, 0);
            if (o02 == -5) {
                t1(V10);
                return;
            }
            if (o02 == -4) {
                if (!this.f66885x.i()) {
                    this.f66858a5 = Math.max(this.f66858a5, this.f66885x.f54110f);
                    if (i() || this.f66884w.l()) {
                        this.f66861b5 = this.f66858a5;
                    }
                    if (this.f66864e5) {
                        androidx.media3.common.a aVar = (androidx.media3.common.a) AbstractC4134a.e(this.f66826C);
                        this.f66827D = aVar;
                        if (Objects.equals(aVar.f20543o, "audio/opus") && !this.f66827D.f20546r.isEmpty()) {
                            this.f66827D = this.f66827D.b().d0(H1.H.f((byte[]) this.f66827D.f20546r.get(0))).P();
                        }
                        u1(this.f66827D, null);
                        this.f66864e5 = false;
                    }
                    this.f66885x.q();
                    androidx.media3.common.a aVar2 = this.f66827D;
                    if (aVar2 != null && Objects.equals(aVar2.f20543o, "audio/opus")) {
                        if (this.f66885x.h()) {
                            k1.f fVar = this.f66885x;
                            fVar.f54106b = this.f66827D;
                            c1(fVar);
                        }
                        if (H1.H.g(X(), this.f66885x.f54110f)) {
                            this.f66825B.a(this.f66885x, this.f66827D.f20546r);
                        }
                    }
                    if (!f1()) {
                        break;
                    }
                } else {
                    this.f66862c5 = true;
                    this.f66861b5 = this.f66858a5;
                    return;
                }
            } else {
                if (o02 != -3) {
                    throw new IllegalStateException();
                }
                if (i()) {
                    this.f66861b5 = this.f66858a5;
                    return;
                }
                return;
            }
        } while (this.f66888y.u(this.f66885x));
        this.f66841R4 = true;
    }

    public abstract void s1(String str);

    @Override // androidx.media3.exoplayer.c, androidx.media3.exoplayer.o.b
    public void t(int i10, Object obj) {
        if (i10 == 11) {
            this.f66830G = (p.a) AbstractC4134a.e((p.a) obj);
        } else {
            super.t(i10, obj);
        }
    }

    public final boolean t0(long j10, long j11) {
        boolean z10;
        AbstractC4134a.g(!this.f66863d5);
        if (this.f66888y.z()) {
            C6619i c6619i = this.f66888y;
            z10 = false;
            if (!B1(j10, j11, null, c6619i.f54108d, this.f66878p2, 0, c6619i.y(), this.f66888y.w(), l1(X(), this.f66888y.x()), this.f66888y.i(), (androidx.media3.common.a) AbstractC4134a.e(this.f66827D))) {
                return false;
            }
            w1(this.f66888y.x());
            this.f66888y.f();
        } else {
            z10 = false;
        }
        if (this.f66862c5) {
            this.f66863d5 = true;
            return z10;
        }
        if (this.f66841R4) {
            AbstractC4134a.g(this.f66888y.u(this.f66885x));
            this.f66841R4 = z10;
        }
        if (this.f66842S4) {
            if (this.f66888y.z()) {
                return true;
            }
            B0();
            this.f66842S4 = z10;
            n1();
            if (!this.f66839Q4) {
                return z10;
            }
        }
        s0();
        if (this.f66888y.z()) {
            this.f66888y.q();
        }
        if (this.f66888y.z() || this.f66862c5 || this.f66842S4) {
            return true;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (E0() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d9, code lost:
    
        if (E0() == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5509h t1(O0 o02) {
        int i10;
        boolean z10 = true;
        this.f66864e5 = true;
        androidx.media3.common.a aVar = (androidx.media3.common.a) AbstractC4134a.e(o02.f56121b);
        String str = aVar.f20543o;
        if (str == null) {
            throw R(new IllegalArgumentException("Sample MIME type is null."), aVar, 4005);
        }
        if ((Objects.equals(str, "video/av01") || Objects.equals(aVar.f20543o, "video/x-vnd.on2.vp9")) && !aVar.f20546r.isEmpty()) {
            aVar = aVar.b().k0(null).P();
        }
        androidx.media3.common.a aVar2 = aVar;
        R1(o02.f56120a);
        this.f66826C = aVar2;
        if (this.f66839Q4) {
            this.f66842S4 = true;
            return null;
        }
        InterfaceC6627q interfaceC6627q = this.f66835L;
        if (interfaceC6627q == null) {
            this.f66847V = null;
            n1();
            return null;
        }
        t tVar = (t) AbstractC4134a.e(this.f66852X);
        androidx.media3.common.a aVar3 = (androidx.media3.common.a) AbstractC4134a.e(this.f66836O);
        if (G0(tVar, aVar2, this.f66828E, this.f66829F)) {
            D0();
            return new C5509h(tVar.f66986a, aVar3, aVar2, 0, 128);
        }
        boolean z11 = this.f66829F != this.f66828E;
        AbstractC4134a.g(true);
        C5509h u02 = u0(tVar, aVar3, aVar2);
        int i11 = u02.f56214d;
        if (i11 != 0) {
            i10 = 16;
            if (i11 == 1) {
                if (d2(aVar2)) {
                    this.f66836O = aVar2;
                    if (!z11) {
                    }
                }
                if (u02.f56214d != 0) {
                }
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException();
                }
                if (d2(aVar2)) {
                    this.f66836O = aVar2;
                    if (z11) {
                    }
                }
                return (u02.f56214d != 0 || (this.f66835L == interfaceC6627q && this.f66851W4 != 3)) ? u02 : new C5509h(tVar.f66986a, aVar3, aVar2, 0, i10);
            }
            if (d2(aVar2)) {
                this.f66845T4 = true;
                this.f66846U4 = 1;
                int i12 = this.f66854Y;
                if (i12 != 2 && (i12 != 1 || aVar2.f20550v != aVar3.f20550v || aVar2.f20551w != aVar3.f20551w)) {
                    z10 = false;
                }
                this.f66877p1 = z10;
                this.f66836O = aVar2;
                if (z11) {
                }
            }
            if (u02.f56214d != 0) {
            }
        }
        D0();
        i10 = 0;
        if (u02.f56214d != 0) {
        }
    }

    public abstract C5509h u0(t tVar, androidx.media3.common.a aVar, androidx.media3.common.a aVar2);

    public abstract void u1(androidx.media3.common.a aVar, MediaFormat mediaFormat);

    public final int v0(String str) {
        if (Build.VERSION.SDK_INT > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
            return 0;
        }
        String str2 = Build.MODEL;
        return (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) ? 2 : 0;
    }

    public void w1(long j10) {
        this.f66871j5 = j10;
        while (!this.f66824A.isEmpty() && j10 >= ((e) this.f66824A.peek()).f66899a) {
            O1((e) AbstractC4134a.e((e) this.f66824A.poll()));
            x1();
        }
    }

    public final void z1() {
        if (this.f66876o5 != -9223372036854775807L) {
            long X10 = X();
            long j10 = this.f66876o5;
            if (X10 > j10 || this.f66871j5 >= j10) {
                return;
            }
            this.f66874m5 = true;
            this.f66876o5 = -9223372036854775807L;
        }
    }

    /* renamed from: v1.A$c */
    public static class c extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f66892a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f66893b;

        /* renamed from: c, reason: collision with root package name */
        public final t f66894c;

        /* renamed from: d, reason: collision with root package name */
        public final String f66895d;

        /* renamed from: e, reason: collision with root package name */
        public final c f66896e;

        public c(androidx.media3.common.a aVar, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + aVar, th2, aVar.f20543o, z10, null, b(i10), null);
        }

        public static String b(int i10) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        public final c c(c cVar) {
            return new c(getMessage(), getCause(), this.f66892a, this.f66893b, this.f66894c, this.f66895d, cVar);
        }

        public c(androidx.media3.common.a aVar, Throwable th2, boolean z10, t tVar) {
            this("Decoder init failed: " + tVar.f66986a + ", " + aVar, th2, aVar.f20543o, z10, tVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        public c(String str, Throwable th2, String str2, boolean z10, t tVar, String str3, c cVar) {
            super(str, th2);
            this.f66892a = str2;
            this.f66893b = z10;
            this.f66894c = tVar;
            this.f66895d = str3;
            this.f66896e = cVar;
        }
    }

    @Override // androidx.media3.exoplayer.c
    public void k0() {
    }

    @Override // androidx.media3.exoplayer.c
    public void l0() {
    }

    public void x1() {
    }

    public void v1(long j10) {
    }

    public void y1(k1.f fVar) {
    }
}
