package o1;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.common.a;
import androidx.media3.exoplayer.p;
import b1.AbstractC2335D;
import b1.C2340I;
import b1.C2350d;
import b1.C2354h;
import com.google.common.collect.AbstractC3445z;
import com.twilio.voice.EventKeys;
import e1.AbstractC4131A;
import e1.AbstractC4134a;
import e1.AbstractC4144k;
import e1.AbstractC4156x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import m1.C5509h;
import m1.O0;
import m1.Q0;
import o1.InterfaceC5772y;
import o1.InterfaceC5773z;
import v1.AbstractC6596A;
import v1.AbstractC6610O;
import v1.C6625o;
import v1.InterfaceC6600E;
import v1.InterfaceC6627q;

/* loaded from: classes.dex */
public class a0 extends AbstractC6596A implements Q0 {

    /* renamed from: A5, reason: collision with root package name */
    public boolean f58781A5;

    /* renamed from: B5, reason: collision with root package name */
    public boolean f58782B5;

    /* renamed from: C5, reason: collision with root package name */
    public int f58783C5;

    /* renamed from: D5, reason: collision with root package name */
    public boolean f58784D5;

    /* renamed from: E5, reason: collision with root package name */
    public long f58785E5;

    /* renamed from: p5, reason: collision with root package name */
    public final Context f58786p5;

    /* renamed from: q5, reason: collision with root package name */
    public final InterfaceC5772y.a f58787q5;

    /* renamed from: r5, reason: collision with root package name */
    public final InterfaceC5773z f58788r5;

    /* renamed from: s5, reason: collision with root package name */
    public final C6625o f58789s5;

    /* renamed from: t5, reason: collision with root package name */
    public int f58790t5;

    /* renamed from: u5, reason: collision with root package name */
    public boolean f58791u5;

    /* renamed from: v5, reason: collision with root package name */
    public boolean f58792v5;

    /* renamed from: w5, reason: collision with root package name */
    public androidx.media3.common.a f58793w5;

    /* renamed from: x5, reason: collision with root package name */
    public androidx.media3.common.a f58794x5;

    /* renamed from: y5, reason: collision with root package name */
    public long f58795y5;

    /* renamed from: z5, reason: collision with root package name */
    public boolean f58796z5;

    public static final class b {
        public static void a(InterfaceC5773z interfaceC5773z, Object obj) {
            interfaceC5773z.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    public final class c implements InterfaceC5773z.d {
        public c() {
        }

        @Override // o1.InterfaceC5773z.d
        public void a(int i10) {
            if (Build.VERSION.SDK_INT >= 35 && a0.this.f58789s5 != null) {
                a0.this.f58789s5.e(i10);
            }
            a0.this.f58787q5.o(i10);
        }

        @Override // o1.InterfaceC5773z.d
        public void b(boolean z10) {
            a0.this.f58787q5.y(z10);
        }

        @Override // o1.InterfaceC5773z.d
        public void c(long j10) {
            a0.this.f58787q5.x(j10);
        }

        @Override // o1.InterfaceC5773z.d
        public void d(Exception exc) {
            AbstractC4156x.e("MediaCodecAudioRenderer", "Audio sink error", exc);
            a0.this.f58787q5.p(exc);
        }

        @Override // o1.InterfaceC5773z.d
        public void e(InterfaceC5773z.a aVar) {
            a0.this.f58787q5.q(aVar);
        }

        @Override // o1.InterfaceC5773z.d
        public void f(InterfaceC5773z.a aVar) {
            a0.this.f58787q5.r(aVar);
        }

        @Override // o1.InterfaceC5773z.d
        public void g() {
            a0.this.f58782B5 = true;
        }

        @Override // o1.InterfaceC5773z.d
        public void h() {
            p.a b12 = a0.this.b1();
            if (b12 != null) {
                b12.a();
            }
        }

        @Override // o1.InterfaceC5773z.d
        public void i(int i10, long j10, long j11) {
            a0.this.f58787q5.z(i10, j10, j11);
        }

        @Override // o1.InterfaceC5773z.d
        public void j() {
            a0.this.i0();
        }

        @Override // o1.InterfaceC5773z.d
        public void k() {
            a0.this.u2();
        }

        @Override // o1.InterfaceC5773z.d
        public void l() {
            p.a b12 = a0.this.b1();
            if (b12 != null) {
                b12.b();
            }
        }
    }

    public a0(Context context, InterfaceC6627q.b bVar, InterfaceC6600E interfaceC6600E, boolean z10, Handler handler, InterfaceC5772y interfaceC5772y, InterfaceC5773z interfaceC5773z) {
        this(context, bVar, interfaceC6600E, z10, handler, interfaceC5772y, interfaceC5773z, Build.VERSION.SDK_INT >= 35 ? new C6625o() : null);
    }

    public static boolean m2(String str) {
        return false;
    }

    public static boolean n2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    public static boolean o2() {
        return false;
    }

    private int q2(v1.t tVar, androidx.media3.common.a aVar) {
        "OMX.google.raw.decoder".equals(tVar.f66986a);
        return aVar.f20544p;
    }

    public static List s2(InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar, boolean z10, InterfaceC5773z interfaceC5773z) {
        v1.t r10;
        return aVar.f20543o == null ? AbstractC3445z.t() : (!interfaceC5773z.a(aVar) || (r10 = AbstractC6610O.r()) == null) ? AbstractC6610O.n(interfaceC6600E, aVar, z10, false) : AbstractC3445z.u(r10);
    }

    @Override // v1.AbstractC6596A
    public boolean B1(long j10, long j11, InterfaceC6627q interfaceC6627q, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, androidx.media3.common.a aVar) {
        AbstractC4134a.e(byteBuffer);
        this.f58785E5 = -9223372036854775807L;
        if (this.f58794x5 != null && (i11 & 2) != 0) {
            ((InterfaceC6627q) AbstractC4134a.e(interfaceC6627q)).releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            if (interfaceC6627q != null) {
                interfaceC6627q.releaseOutputBuffer(i10, false);
            }
            this.f66869h5.f56201f += i12;
            this.f58788r5.s();
            return true;
        }
        try {
            if (!this.f58788r5.l(byteBuffer, j12, i12)) {
                this.f58785E5 = j12;
                return false;
            }
            if (interfaceC6627q != null) {
                interfaceC6627q.releaseOutputBuffer(i10, false);
            }
            this.f66869h5.f56200e += i12;
            return true;
        } catch (InterfaceC5773z.c e10) {
            throw S(e10, this.f58793w5, e10.f58893b, (!j1() || U().f56266a == 0) ? 5001 : 5004);
        } catch (InterfaceC5773z.f e11) {
            throw S(e11, aVar, e11.f58898b, (!j1() || U().f56266a == 0) ? 5002 : 5003);
        }
    }

    @Override // v1.AbstractC6596A
    public void G1() {
        try {
            this.f58788r5.o();
            if (W0() != -9223372036854775807L) {
                this.f58785E5 = W0();
            }
        } catch (InterfaceC5773z.f e10) {
            throw S(e10, e10.f58899c, e10.f58898b, j1() ? 5003 : 5002);
        }
    }

    @Override // m1.Q0
    public long H() {
        if (getState() == 2) {
            x2();
        }
        return this.f58795y5;
    }

    @Override // v1.AbstractC6596A
    public float S0(float f10, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        int i10 = -1;
        for (androidx.media3.common.a aVar2 : aVarArr) {
            int i11 = aVar2.f20519G;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // v1.AbstractC6596A
    public List U0(InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar, boolean z10) {
        return AbstractC6610O.o(s2(interfaceC6600E, aVar, z10, this.f58788r5), aVar);
    }

    @Override // v1.AbstractC6596A
    public long V0(long j10, long j11, boolean z10) {
        boolean z11 = this.f58785E5 != -9223372036854775807L;
        if (!this.f58784D5) {
            return (z11 || super.b()) ? 1000000L : 10000L;
        }
        long i10 = this.f58788r5.i();
        if (!z11 || i10 == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(i10, this.f58785E5 - j10) / (d() != null ? d().f24315a : 1.0f)) / 2.0f)) - (e1.Z.a1(T().b()) - j11));
    }

    @Override // v1.AbstractC6596A
    public InterfaceC6627q.a X0(v1.t tVar, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, float f10) {
        this.f58790t5 = r2(tVar, aVar, Z());
        this.f58791u5 = m2(tVar.f66986a);
        this.f58792v5 = n2(tVar.f66986a);
        MediaFormat t22 = t2(aVar, tVar.f66988c, this.f58790t5, f10);
        this.f58794x5 = (!"audio/raw".equals(tVar.f66987b) || "audio/raw".equals(aVar.f20543o)) ? null : aVar;
        return InterfaceC6627q.a.a(tVar, t22, aVar, mediaCrypto, this.f58789s5);
    }

    @Override // v1.AbstractC6596A
    public boolean Z1(androidx.media3.common.a aVar) {
        if (U().f56266a != 0) {
            int p22 = p2(aVar);
            if ((p22 & 512) != 0) {
                if (U().f56266a == 2 || (p22 & 1024) != 0) {
                    return true;
                }
                if (aVar.f20521I == 0 && aVar.f20522J == 0) {
                    return true;
                }
            }
        }
        return this.f58788r5.a(aVar);
    }

    @Override // v1.AbstractC6596A
    public int a2(InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar) {
        int i10;
        boolean z10;
        if (!AbstractC2335D.o(aVar.f20543o)) {
            return androidx.media3.exoplayer.q.r(0);
        }
        boolean z11 = true;
        boolean z12 = aVar.f20527O != 0;
        boolean b22 = AbstractC6596A.b2(aVar);
        int i11 = 8;
        if (!b22 || (z12 && AbstractC6610O.r() == null)) {
            i10 = 0;
        } else {
            i10 = p2(aVar);
            if (this.f58788r5.a(aVar)) {
                return androidx.media3.exoplayer.q.o(4, 8, 32, i10);
            }
        }
        if ("audio/raw".equals(aVar.f20543o) && !this.f58788r5.a(aVar)) {
            return androidx.media3.exoplayer.q.r(1);
        }
        if (!this.f58788r5.a(e1.Z.p0(2, aVar.f20518F, aVar.f20519G))) {
            return androidx.media3.exoplayer.q.r(1);
        }
        List s22 = s2(interfaceC6600E, aVar, false, this.f58788r5);
        if (s22.isEmpty()) {
            return androidx.media3.exoplayer.q.r(1);
        }
        if (!b22) {
            return androidx.media3.exoplayer.q.r(2);
        }
        v1.t tVar = (v1.t) s22.get(0);
        boolean p10 = tVar.p(aVar);
        if (!p10) {
            for (int i12 = 1; i12 < s22.size(); i12++) {
                v1.t tVar2 = (v1.t) s22.get(i12);
                if (tVar2.p(aVar)) {
                    z10 = false;
                    tVar = tVar2;
                    break;
                }
            }
        }
        z10 = true;
        z11 = p10;
        int i13 = z11 ? 4 : 3;
        if (z11 && tVar.s(aVar)) {
            i11 = 16;
        }
        return androidx.media3.exoplayer.q.A(i13, i11, 32, tVar.f66993h ? 64 : 0, z10 ? 128 : 0, i10);
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.p
    public boolean b() {
        return super.b() && this.f58788r5.b();
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.p
    public boolean c() {
        return this.f58788r5.f() || super.c();
    }

    @Override // v1.AbstractC6596A
    public void c1(k1.f fVar) {
        androidx.media3.common.a aVar;
        if (Build.VERSION.SDK_INT < 29 || (aVar = fVar.f54106b) == null || !Objects.equals(aVar.f20543o, "audio/opus") || !j1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(fVar.f54111g);
        int i10 = ((androidx.media3.common.a) AbstractC4134a.e(fVar.f54106b)).f20521I;
        if (byteBuffer.remaining() == 8) {
            this.f58788r5.p(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // m1.Q0
    public C2340I d() {
        return this.f58788r5.d();
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void d0() {
        this.f58781A5 = true;
        this.f58793w5 = null;
        this.f58785E5 = -9223372036854775807L;
        try {
            this.f58788r5.flush();
            try {
                super.d0();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.d0();
                throw th2;
            } finally {
            }
        }
    }

    @Override // m1.Q0
    public void e(C2340I c2340i) {
        this.f58788r5.e(c2340i);
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void e0(boolean z10, boolean z11) {
        super.e0(z10, z11);
        this.f58787q5.v(this.f66869h5);
        if (U().f56267b) {
            this.f58788r5.t();
        } else {
            this.f58788r5.k();
        }
        this.f58788r5.w(Y());
        this.f58788r5.y(T());
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void g0(long j10, boolean z10) {
        super.g0(j10, z10);
        this.f58788r5.flush();
        this.f58795y5 = j10;
        this.f58785E5 = -9223372036854775807L;
        this.f58782B5 = false;
        this.f58796z5 = true;
    }

    @Override // androidx.media3.exoplayer.p, androidx.media3.exoplayer.q
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.c
    public void h0() {
        C6625o c6625o;
        this.f58788r5.release();
        if (Build.VERSION.SDK_INT < 35 || (c6625o = this.f58789s5) == null) {
            return;
        }
        c6625o.c();
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void j0() {
        this.f58782B5 = false;
        this.f58785E5 = -9223372036854775807L;
        try {
            super.j0();
        } finally {
            if (this.f58781A5) {
                this.f58781A5 = false;
                this.f58788r5.reset();
            }
        }
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void k0() {
        super.k0();
        this.f58788r5.play();
        this.f58784D5 = true;
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void l0() {
        x2();
        this.f58784D5 = false;
        this.f58788r5.pause();
        super.l0();
    }

    public final int p2(androidx.media3.common.a aVar) {
        C5759k c10 = this.f58788r5.c(aVar);
        if (!c10.f58846a) {
            return 0;
        }
        int i10 = c10.f58847b ? 1536 : 512;
        return c10.f58848c ? i10 | 2048 : i10;
    }

    @Override // v1.AbstractC6596A
    public void q1(Exception exc) {
        AbstractC4156x.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f58787q5.n(exc);
    }

    @Override // v1.AbstractC6596A
    public void r1(String str, InterfaceC6627q.a aVar, long j10, long j11) {
        this.f58787q5.s(str, j10, j11);
    }

    public int r2(v1.t tVar, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        int q22 = q2(tVar, aVar);
        if (aVarArr.length == 1) {
            return q22;
        }
        for (androidx.media3.common.a aVar2 : aVarArr) {
            if (tVar.e(aVar, aVar2).f56214d != 0) {
                q22 = Math.max(q22, q2(tVar, aVar2));
            }
        }
        return q22;
    }

    @Override // m1.Q0
    public boolean s() {
        boolean z10 = this.f58782B5;
        this.f58782B5 = false;
        return z10;
    }

    @Override // v1.AbstractC6596A
    public void s1(String str) {
        this.f58787q5.t(str);
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c, androidx.media3.exoplayer.o.b
    public void t(int i10, Object obj) {
        if (i10 == 2) {
            this.f58788r5.h(((Float) AbstractC4134a.e(obj)).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f58788r5.n((C2350d) AbstractC4134a.e((C2350d) obj));
            return;
        }
        if (i10 == 6) {
            this.f58788r5.v((C2354h) AbstractC4134a.e((C2354h) obj));
            return;
        }
        if (i10 == 12) {
            b.a(this.f58788r5, obj);
            return;
        }
        if (i10 == 16) {
            this.f58783C5 = ((Integer) AbstractC4134a.e(obj)).intValue();
            w2();
        } else if (i10 == 9) {
            this.f58788r5.z(((Boolean) AbstractC4134a.e(obj)).booleanValue());
        } else if (i10 != 10) {
            super.t(i10, obj);
        } else {
            v2(((Integer) AbstractC4134a.e(obj)).intValue());
        }
    }

    @Override // v1.AbstractC6596A
    public C5509h t1(O0 o02) {
        androidx.media3.common.a aVar = (androidx.media3.common.a) AbstractC4134a.e(o02.f56121b);
        this.f58793w5 = aVar;
        C5509h t12 = super.t1(o02);
        this.f58787q5.w(aVar, t12);
        return t12;
    }

    public MediaFormat t2(androidx.media3.common.a aVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", aVar.f20518F);
        mediaFormat.setInteger("sample-rate", aVar.f20519G);
        AbstractC4131A.u(mediaFormat, aVar.f20546r);
        AbstractC4131A.p(mediaFormat, "max-input-size", i10);
        int i11 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger(EventKeys.PRIORITY, 0);
        if (f10 != -1.0f && !o2()) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if ("audio/ac4".equals(aVar.f20543o)) {
            Pair w10 = AbstractC4144k.w(aVar);
            if (w10 != null) {
                AbstractC4131A.p(mediaFormat, "profile", ((Integer) w10.first).intValue());
                AbstractC4131A.p(mediaFormat, "level", ((Integer) w10.second).intValue());
            }
            if (i11 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.f58788r5.u(e1.Z.p0(4, aVar.f20518F, aVar.f20519G)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f58783C5));
        }
        return mediaFormat;
    }

    @Override // v1.AbstractC6596A
    public C5509h u0(v1.t tVar, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        C5509h e10 = tVar.e(aVar, aVar2);
        int i10 = e10.f56215e;
        if (k1(aVar2)) {
            i10 |= 32768;
        }
        if (q2(tVar, aVar2) > this.f58790t5) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C5509h(tVar.f66986a, aVar, aVar2, i11 != 0 ? 0 : e10.f56214d, i11);
    }

    @Override // v1.AbstractC6596A
    public void u1(androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        int i10;
        androidx.media3.common.a aVar2 = this.f58794x5;
        int[] iArr = null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (N0() != null) {
            AbstractC4134a.e(mediaFormat);
            androidx.media3.common.a P10 = new a.b().y0("audio/raw").s0("audio/raw".equals(aVar.f20543o) ? aVar.f20520H : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? e1.Z.n0(mediaFormat.getInteger("v-bits-per-sample")) : 2).d0(aVar.f20521I).e0(aVar.f20522J).r0(aVar.f20540l).Z(aVar.f20541m).j0(aVar.f20529a).l0(aVar.f20530b).m0(aVar.f20531c).n0(aVar.f20532d).A0(aVar.f20533e).w0(aVar.f20534f).T(mediaFormat.getInteger("channel-count")).z0(mediaFormat.getInteger("sample-rate")).P();
            if (this.f58791u5 && P10.f20518F == 6 && (i10 = aVar.f20518F) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < aVar.f20518F; i11++) {
                    iArr[i11] = i11;
                }
            } else if (this.f58792v5) {
                iArr = H1.S.a(P10.f20518F);
            }
            aVar = P10;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!j1() || U().f56266a == 0) {
                    this.f58788r5.j(0);
                } else {
                    this.f58788r5.j(U().f56266a);
                }
            }
            this.f58788r5.m(aVar, 0, iArr);
        } catch (InterfaceC5773z.b e10) {
            throw R(e10, e10.f58891a, 5001);
        }
    }

    public void u2() {
        this.f58796z5 = true;
    }

    @Override // v1.AbstractC6596A
    public void v1(long j10) {
        this.f58788r5.r(j10);
    }

    public final void v2(int i10) {
        C6625o c6625o;
        this.f58788r5.g(i10);
        if (Build.VERSION.SDK_INT < 35 || (c6625o = this.f58789s5) == null) {
            return;
        }
        c6625o.e(i10);
    }

    public final void w2() {
        InterfaceC6627q N02 = N0();
        if (N02 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f58783C5));
            N02.setParameters(bundle);
        }
    }

    @Override // v1.AbstractC6596A
    public void x1() {
        super.x1();
        this.f58788r5.s();
    }

    public final void x2() {
        long q10 = this.f58788r5.q(b());
        if (q10 != Long.MIN_VALUE) {
            if (!this.f58796z5) {
                q10 = Math.max(this.f58795y5, q10);
            }
            this.f58795y5 = q10;
            this.f58796z5 = false;
        }
    }

    public a0(Context context, InterfaceC6627q.b bVar, InterfaceC6600E interfaceC6600E, boolean z10, Handler handler, InterfaceC5772y interfaceC5772y, InterfaceC5773z interfaceC5773z, C6625o c6625o) {
        super(1, bVar, interfaceC6600E, z10, 44100.0f);
        this.f58786p5 = context.getApplicationContext();
        this.f58788r5 = interfaceC5773z;
        this.f58789s5 = c6625o;
        this.f58783C5 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f58787q5 = new InterfaceC5772y.a(handler, interfaceC5772y);
        this.f58785E5 = -9223372036854775807L;
        interfaceC5773z.x(new c());
    }

    @Override // androidx.media3.exoplayer.c, androidx.media3.exoplayer.p
    public Q0 P() {
        return this;
    }
}
