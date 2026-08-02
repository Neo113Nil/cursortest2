package v3;

import B3.C2571o;
import B3.M;
import B3.q;
import N3.P;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.C5449k;
import androidx.media3.exoplayer.k0;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import j3.C7263e;
import j3.C7264f;
import j3.C7272n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m3.C8065g;
import t3.C9730B;
import t3.C9738d;
import t3.InterfaceC9731C;
import v3.o;

/* loaded from: classes.dex */
public final class J extends B3.C implements InterfaceC9731C {

    /* renamed from: a1, reason: collision with root package name */
    private final o.a f101833a1;

    /* renamed from: b1, reason: collision with root package name */
    private final C10201C f101834b1;

    /* renamed from: c1, reason: collision with root package name */
    private final C2571o f101835c1;

    /* renamed from: d1, reason: collision with root package name */
    private int f101836d1;

    /* renamed from: e1, reason: collision with root package name */
    private boolean f101837e1;

    /* renamed from: f1, reason: collision with root package name */
    private C7272n f101838f1;

    /* renamed from: g1, reason: collision with root package name */
    private C7272n f101839g1;

    /* renamed from: h1, reason: collision with root package name */
    private long f101840h1;

    /* renamed from: i1, reason: collision with root package name */
    private boolean f101841i1;

    /* renamed from: j1, reason: collision with root package name */
    private boolean f101842j1;

    /* renamed from: k1, reason: collision with root package name */
    private boolean f101843k1;

    /* renamed from: l1, reason: collision with root package name */
    private int f101844l1;

    /* renamed from: m1, reason: collision with root package name */
    private boolean f101845m1;

    /* renamed from: n1, reason: collision with root package name */
    private long f101846n1;

    /* loaded from: classes8.dex */
    private static final class a {
        public static void a(C10201C c10201c, Object obj) {
            c10201c.a0((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements s {
        b() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J(Context context, q.b bVar, boolean z11, Handler handler, o oVar, C10201C c10201c) {
        super(1, bVar, r3, z11, 44100.0f);
        B3.D d11 = B3.E.f2296T;
        C2571o c2571o = Build.VERSION.SDK_INT >= 35 ? new C2571o() : null;
        context.getApplicationContext();
        this.f101834b1 = c10201c;
        this.f101835c1 = c2571o;
        this.f101844l1 = -1000;
        this.f101833a1 = new o.a(handler, oVar);
        this.f101846n1 = -9223372036854775807L;
        c10201c.U(new b());
    }

    private int t1(C7272n c7272n) {
        C10209e v11 = this.f101834b1.v(c7272n);
        if (!v11.f101901a) {
            return 0;
        }
        int i11 = v11.f101902b ? 1536 : UserVerificationMethods.USER_VERIFY_NONE;
        return v11.f101903c ? i11 | 2048 : i11;
    }

    private void v1() {
        a();
        long u11 = this.f101834b1.u();
        if (u11 != Long.MIN_VALUE) {
            if (!this.f101841i1) {
                u11 = Math.max(this.f101840h1, u11);
            }
            this.f101840h1 = u11;
            this.f101841i1 = false;
        }
    }

    @Override // B3.C
    protected final void A0(s3.f fVar) {
        C7272n c7272n;
        if (Build.VERSION.SDK_INT < 29 || (c7272n = fVar.f98182b) == null || !Objects.equals(c7272n.f69127o, "audio/opus") || !D0()) {
            return;
        }
        ByteBuffer byteBuffer = fVar.f98187g;
        byteBuffer.getClass();
        C7272n c7272n2 = fVar.f98182b;
        c7272n2.getClass();
        if (byteBuffer.remaining() == 8) {
            this.f101834b1.V(c7272n2.f69105J, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // B3.C
    protected final void J0(Exception exc) {
        m3.s.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f101833a1.n(exc);
    }

    @Override // B3.C
    protected final void K0(String str, long j11, long j12) {
        this.f101833a1.s(str, j11, j12);
    }

    @Override // B3.C
    protected final void L0(String str) {
        this.f101833a1.t(str);
    }

    @Override // B3.C
    protected final C9738d M0(C9730B c9730b) throws C5449k {
        C7272n c7272n = c9730b.f98980b;
        c7272n.getClass();
        this.f101838f1 = c7272n;
        C9738d M02 = super.M0(c9730b);
        this.f101833a1.w(c7272n, M02);
        return M02;
    }

    @Override // B3.C
    protected final void N0(C7272n c7272n, MediaFormat mediaFormat) throws C5449k {
        C7272n c7272n2 = this.f101839g1;
        int[] iArr = null;
        if (c7272n2 != null) {
            c7272n = c7272n2;
        } else if (m0() != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(c7272n.f69127o) ? c7272n.f69104I : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? m3.N.C(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            C7272n.a aVar = new C7272n.a();
            aVar.y0("audio/raw");
            aVar.s0(integer);
            aVar.d0(c7272n.f69105J);
            aVar.e0(c7272n.f69106K);
            aVar.r0(c7272n.f69124l);
            aVar.Z(c7272n.f69125m);
            aVar.j0(c7272n.f69113a);
            aVar.l0(c7272n.f69114b);
            aVar.m0(c7272n.f69115c);
            aVar.n0(c7272n.f69116d);
            aVar.A0(c7272n.f69117e);
            aVar.w0(c7272n.f69118f);
            aVar.T(mediaFormat.getInteger("channel-count"));
            aVar.z0(mediaFormat.getInteger("sample-rate"));
            c7272n = aVar.P();
            if (this.f101837e1) {
                iArr = P.a(c7272n.f69102G);
            }
        }
        try {
            int i11 = Build.VERSION.SDK_INT;
            C10201C c10201c = this.f101834b1;
            if (i11 >= 29) {
                if (!D0() || G().f98986a == 0) {
                    c10201c.W(0);
                } else {
                    c10201c.W(G().f98986a);
                }
            }
            c10201c.n(c7272n, iArr);
        } catch (q e11) {
            throw D(e11, e11.f101938a, 5001);
        }
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f
    protected final void O() {
        o.a aVar = this.f101833a1;
        this.f101842j1 = true;
        this.f101838f1 = null;
        this.f101846n1 = -9223372036854775807L;
        try {
            this.f101834b1.s();
            try {
                super.O();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.O();
                throw th2;
            } finally {
            }
        }
    }

    @Override // B3.C
    protected final void O0(long j11) {
        this.f101834b1.getClass();
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f
    protected final void P(boolean z11, boolean z12) throws C5449k {
        super.P(z11, z12);
        this.f101833a1.v(this.f2257R0);
        boolean z13 = G().f98987b;
        C10201C c10201c = this.f101834b1;
        if (z13) {
            c10201c.r();
        } else {
            c10201c.o();
        }
        c10201c.Z(J());
        c10201c.T(F());
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f
    protected final void Q(long j11, boolean z11) throws C5449k {
        super.Q(j11, z11);
        this.f101834b1.s();
        this.f101840h1 = j11;
        this.f101846n1 = -9223372036854775807L;
        this.f101843k1 = false;
        this.f101841i1 = true;
    }

    @Override // B3.C
    protected final void Q0() {
        this.f101834b1.A();
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void R() {
        C2571o c2571o;
        this.f101834b1.N();
        if (Build.VERSION.SDK_INT < 35 || (c2571o = this.f101835c1) == null) {
            return;
        }
        c2571o.c();
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f
    protected final void T() {
        C10201C c10201c = this.f101834b1;
        this.f101843k1 = false;
        this.f101846n1 = -9223372036854775807L;
        try {
            super.T();
        } finally {
            if (this.f101842j1) {
                this.f101842j1 = false;
                c10201c.O();
            }
        }
    }

    @Override // B3.C
    protected final boolean T0(long j11, long j12, B3.q qVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, C7272n c7272n) throws C5449k {
        byteBuffer.getClass();
        this.f101846n1 = -9223372036854775807L;
        if (this.f101839g1 != null && (i12 & 2) != 0) {
            qVar.getClass();
            qVar.f(i11);
            return true;
        }
        C10201C c10201c = this.f101834b1;
        if (z11) {
            if (qVar != null) {
                qVar.f(i11);
            }
            this.f2257R0.f99016f += i13;
            c10201c.A();
            return true;
        }
        try {
            if (!c10201c.z(byteBuffer, j13, i13)) {
                this.f101846n1 = j13;
                return false;
            }
            if (qVar != null) {
                qVar.f(i11);
            }
            this.f2257R0.f99015e += i13;
            return true;
        } catch (r e11) {
            throw E(e11, this.f101838f1, e11.f101940b, (!D0() || G().f98986a == 0) ? 5001 : 5004);
        } catch (u e12) {
            throw E(e12, c7272n, e12.f101942b, (!D0() || G().f98986a == 0) ? 5002 : 5003);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void U() {
        this.f101834b1.J();
        this.f101845m1 = true;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void V() {
        v1();
        this.f101845m1 = false;
        this.f101834b1.I();
    }

    @Override // B3.C
    protected final void W0() throws C5449k {
        try {
            this.f101834b1.L();
            if (u0() != -9223372036854775807L) {
                this.f101846n1 = u0();
            }
        } catch (u e11) {
            throw E(e11, e11.f101943c, e11.f101942b, D0() ? 5003 : 5002);
        }
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.j0
    public final boolean a() {
        return super.a() && this.f101834b1.E();
    }

    @Override // t3.InterfaceC9731C
    public final void b(j3.x xVar) {
        this.f101834b1.Y(xVar);
    }

    @Override // B3.C
    protected final C9738d c0(B3.t tVar, C7272n c7272n, C7272n c7272n2) {
        C9738d b11 = tVar.b(c7272n, c7272n2);
        boolean E02 = E0(c7272n2);
        int i11 = b11.f99027e;
        if (E02) {
            i11 |= 32768;
        }
        "OMX.google.raw.decoder".equals(tVar.f2369a);
        if (c7272n2.f69128p > this.f101836d1) {
            i11 |= 64;
        }
        int i12 = i11;
        return new C9738d(tVar.f2369a, c7272n, c7272n2, i12 != 0 ? 0 : b11.f99026d, i12);
    }

    @Override // t3.InterfaceC9731C
    public final j3.x d() {
        return this.f101834b1.x();
    }

    @Override // androidx.media3.exoplayer.j0, androidx.media3.exoplayer.k0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // B3.C
    protected final boolean h1(C7272n c7272n) {
        if (G().f98986a != 0) {
            int t12 = t1(c7272n);
            if ((t12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                if (G().f98986a == 2 || (t12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    return true;
                }
                if (c7272n.f69105J == 0 && c7272n.f69106K == 0) {
                    return true;
                }
            }
        }
        return this.f101834b1.d0(c7272n);
    }

    @Override // t3.InterfaceC9731C
    public final boolean i() {
        boolean z11 = this.f101843k1;
        this.f101843k1 = false;
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if ((r5.isEmpty() ? null : r5.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    @Override // B3.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final int i1(B3.E e11, C7272n c7272n) throws M.b {
        int i11;
        String str;
        C7272n.a aVar;
        List f7;
        B3.t tVar;
        boolean z11;
        if (!j3.u.i(c7272n.f69127o)) {
            return k0.g(0, 0, 0, 0);
        }
        boolean z12 = true;
        int i12 = c7272n.f69111P;
        boolean z13 = i12 != 0;
        boolean z14 = i12 == 0 || i12 == 2;
        int i13 = 8;
        C10201C c10201c = this.f101834b1;
        if (z14) {
            if (z13) {
                List<B3.t> d11 = B3.M.d("audio/raw", false, false);
            }
            i11 = t1(c7272n);
            if (c10201c.d0(c7272n)) {
                return k0.g(4, 8, 32, i11);
            }
            str = c7272n.f69127o;
            if (!"audio/raw".equals(str) && !c10201c.d0(c7272n)) {
                return k0.g(1, 0, 0, 0);
            }
            aVar = new C7272n.a();
            aVar.y0("audio/raw");
            aVar.T(c7272n.f69102G);
            aVar.z0(c7272n.f69103H);
            aVar.s0(2);
            if (c10201c.d0(aVar.P())) {
                return k0.g(1, 0, 0, 0);
            }
            if (str == null) {
                f7 = AbstractC5880y.v();
            } else {
                if (c10201c.d0(c7272n)) {
                    List<B3.t> d12 = B3.M.d("audio/raw", false, false);
                    B3.t tVar2 = d12.isEmpty() ? null : d12.get(0);
                    if (tVar2 != null) {
                        f7 = AbstractC5880y.B(tVar2);
                    }
                }
                f7 = B3.M.f(e11, c7272n, false, false);
            }
            if (((AbstractCollection) f7).isEmpty()) {
                return k0.g(1, 0, 0, 0);
            }
            if (!z14) {
                return k0.g(2, 0, 0, 0);
            }
            B3.t tVar3 = (B3.t) f7.get(0);
            boolean g10 = tVar3.g(c7272n);
            if (!g10) {
                for (int i14 = 1; i14 < f7.size(); i14++) {
                    tVar = (B3.t) f7.get(i14);
                    if (tVar.g(c7272n)) {
                        z11 = false;
                        break;
                    }
                }
            }
            tVar = tVar3;
            z11 = true;
            z12 = g10;
            int i15 = z12 ? 4 : 3;
            if (z12 && tVar.h(c7272n)) {
                i13 = 16;
            }
            return (tVar.f2375g ? 64 : 0) | i15 | i13 | 32 | (z11 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0) | i11;
        }
        i11 = 0;
        str = c7272n.f69127o;
        if (!"audio/raw".equals(str)) {
        }
        aVar = new C7272n.a();
        aVar.y0("audio/raw");
        aVar.T(c7272n.f69102G);
        aVar.z0(c7272n.f69103H);
        aVar.s0(2);
        if (c10201c.d0(aVar.P())) {
        }
    }

    @Override // B3.C, androidx.media3.exoplayer.j0
    public final boolean isReady() {
        return this.f101834b1.B() || super.isReady();
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.h0.b
    public final void j(int i11, Object obj) throws C5449k {
        C2571o c2571o;
        C10201C c10201c = this.f101834b1;
        if (i11 == 2) {
            obj.getClass();
            c10201c.c0(((Float) obj).floatValue());
            return;
        }
        if (i11 == 3) {
            C7263e c7263e = (C7263e) obj;
            c7263e.getClass();
            c10201c.P(c7263e);
            return;
        }
        if (i11 == 6) {
            C7264f c7264f = (C7264f) obj;
            c7264f.getClass();
            c10201c.S(c7264f);
            return;
        }
        if (i11 == 12) {
            a.a(c10201c, obj);
            return;
        }
        if (i11 == 16) {
            obj.getClass();
            this.f101844l1 = ((Integer) obj).intValue();
            B3.q m02 = m0();
            if (m02 != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f101844l1));
                m02.a(bundle);
                return;
            }
            return;
        }
        if (i11 == 9) {
            obj.getClass();
            c10201c.b0(((Boolean) obj).booleanValue());
        } else {
            if (i11 != 10) {
                super.j(i11, obj);
                return;
            }
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            c10201c.Q(intValue);
            if (Build.VERSION.SDK_INT < 35 || (c2571o = this.f101835c1) == null) {
                return;
            }
            c2571o.e(intValue);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.j0
    public final InterfaceC9731C q() {
        return this;
    }

    @Override // B3.C
    protected final float q0(float f7, C7272n c7272n, C7272n[] c7272nArr) {
        int i11 = -1;
        for (C7272n c7272n2 : c7272nArr) {
            int i12 = c7272n2.f69103H;
            if (i12 != -1) {
                i11 = Math.max(i11, i12);
            }
        }
        if (i11 == -1) {
            return -1.0f;
        }
        return i11 * f7;
    }

    @Override // B3.C
    protected final ArrayList s0(B3.E e11, C7272n c7272n, boolean z11) throws M.b {
        List f7;
        if (c7272n.f69127o == null) {
            f7 = AbstractC5880y.v();
        } else {
            if (this.f101834b1.d0(c7272n)) {
                List<B3.t> d11 = B3.M.d("audio/raw", false, false);
                B3.t tVar = d11.isEmpty() ? null : d11.get(0);
                if (tVar != null) {
                    f7 = AbstractC5880y.B(tVar);
                }
            }
            f7 = B3.M.f(e11, c7272n, z11, false);
        }
        return B3.M.g(f7, c7272n);
    }

    @Override // B3.C
    protected final long t0(long j11, long j12) {
        boolean z11 = this.f101846n1 != -9223372036854775807L;
        if (this.f101845m1) {
            C10201C c10201c = this.f101834b1;
            long t2 = c10201c.t();
            if (z11 && t2 != -9223372036854775807L) {
                float min = Math.min(t2, this.f101846n1 - j11);
                float f7 = c10201c.x() != null ? c10201c.x().f69345a : 1.0f;
                F();
                return Math.max(10000L, ((long) ((min / f7) / 2.0f)) - (m3.N.Q(SystemClock.elapsedRealtime()) - j12));
            }
        } else if (z11 || super.a()) {
            return 1000000L;
        }
        return 10000L;
    }

    protected final void u1() {
        this.f101841i1 = true;
    }

    @Override // B3.C
    protected final q.a v0(B3.t tVar, C7272n c7272n, MediaCrypto mediaCrypto, float f7) {
        C7272n[] K11 = K();
        String str = tVar.f2369a;
        "OMX.google.raw.decoder".equals(str);
        int i11 = c7272n.f69128p;
        if (K11.length != 1) {
            for (C7272n c7272n2 : K11) {
                if (tVar.b(c7272n, c7272n2).f99026d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i11 = Math.max(i11, c7272n2.f69128p);
                }
            }
        }
        this.f101836d1 = i11;
        this.f101837e1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        int i12 = this.f101836d1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", tVar.f2371c);
        int i13 = c7272n.f69102G;
        mediaFormat.setInteger("channel-count", i13);
        int i14 = c7272n.f69103H;
        mediaFormat.setInteger("sample-rate", i14);
        m3.v.b(mediaFormat, c7272n.f69130r);
        m3.v.a(mediaFormat, "max-input-size", i12);
        int i15 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f7);
        }
        String str2 = c7272n.f69127o;
        if ("audio/ac4".equals(str2)) {
            Pair<Integer, Integer> c11 = C8065g.c(c7272n);
            if (c11 != null) {
                m3.v.a(mediaFormat, Scopes.PROFILE, ((Integer) c11.first).intValue());
                m3.v.a(mediaFormat, "level", ((Integer) c11.second).intValue());
            }
            if (i15 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        C7272n.a aVar = new C7272n.a();
        aVar.y0("audio/raw");
        aVar.T(i13);
        aVar.z0(i14);
        aVar.s0(4);
        if (this.f101834b1.w(aVar.P()) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i15 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i15 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f101844l1));
        }
        this.f101839g1 = (!"audio/raw".equals(tVar.f2370b) || "audio/raw".equals(str2)) ? null : c7272n;
        return q.a.a(tVar, mediaFormat, c7272n, mediaCrypto, this.f101835c1);
    }

    @Override // t3.InterfaceC9731C
    public final long z() {
        if (getState() == 2) {
            v1();
        }
        return this.f101840h1;
    }
}
