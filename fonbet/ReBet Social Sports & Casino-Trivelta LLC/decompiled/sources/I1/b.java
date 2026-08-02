package I1;

import H1.C1176i;
import H1.C1181n;
import H1.E;
import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.O;
import H1.r;
import H1.u;
import ai.verisoul.sdk.helpers.webview.VerisoulWebViewImplKt;
import androidx.media3.common.a;
import b1.C2338G;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4134a;
import e1.Z;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements InterfaceC1183p {

    /* renamed from: a, reason: collision with root package name */
    public final int f5310a;

    /* renamed from: b, reason: collision with root package name */
    public final O f5311b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5312c;

    /* renamed from: d, reason: collision with root package name */
    public long f5313d;

    /* renamed from: e, reason: collision with root package name */
    public int f5314e;

    /* renamed from: f, reason: collision with root package name */
    public int f5315f;

    /* renamed from: g, reason: collision with root package name */
    public long f5316g;

    /* renamed from: h, reason: collision with root package name */
    public int f5317h;

    /* renamed from: i, reason: collision with root package name */
    public int f5318i;

    /* renamed from: j, reason: collision with root package name */
    public long f5319j;

    /* renamed from: k, reason: collision with root package name */
    public r f5320k;

    /* renamed from: l, reason: collision with root package name */
    public O f5321l;

    /* renamed from: m, reason: collision with root package name */
    public O f5322m;

    /* renamed from: n, reason: collision with root package name */
    public J f5323n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5324o;

    /* renamed from: p, reason: collision with root package name */
    public long f5325p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5326q;
    private final byte[] scratch;

    /* renamed from: r, reason: collision with root package name */
    public static final u f5309r = new u() { // from class: I1.a
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return b.b();
        }
    };
    private static final int[] frameSizeBytesByTypeNb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] frameSizeBytesByTypeWb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] amrSignatureNb = Z.B0("#!AMR\n");
    private static final byte[] amrSignatureWb = Z.B0("#!AMR-WB\n");

    public b() {
        this(0);
    }

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new b()};
    }

    public static int e(int i10, long j10) {
        return (int) ((i10 * 8000000) / j10);
    }

    public static boolean r(InterfaceC1184q interfaceC1184q, byte[] bArr) {
        interfaceC1184q.g();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC1184q.n(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f5313d = 0L;
        this.f5314e = 0;
        this.f5315f = 0;
        this.f5325p = j11;
        J j12 = this.f5323n;
        if (!(j12 instanceof E)) {
            if (j10 == 0 || !(j12 instanceof C1176i)) {
                this.f5319j = 0L;
                return;
            } else {
                this.f5319j = ((C1176i) j12).c(j10);
                return;
            }
        }
        long b10 = ((E) j12).b(j10);
        this.f5319j = b10;
        if (m(b10, this.f5325p)) {
            return;
        }
        this.f5324o = true;
        this.f5322m = this.f5311b;
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f5320k = rVar;
        O c10 = rVar.c(0, 1);
        this.f5321l = c10;
        this.f5322m = c10;
        rVar.s();
    }

    public final void d() {
        AbstractC4134a.i(this.f5321l);
        Z.i(this.f5320k);
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        d();
        if (interfaceC1184q.getPosition() == 0 && !t(interfaceC1184q)) {
            throw C2338G.a("Could not find AMR header.", null);
        }
        p();
        int u10 = u(interfaceC1184q);
        q(interfaceC1184q.getLength(), u10);
        if (u10 == -1) {
            J j10 = this.f5323n;
            if (j10 instanceof E) {
                long j11 = this.f5319j + this.f5313d;
                ((E) j10).f(j11);
                this.f5320k.q(this.f5323n);
                this.f5321l.d(j11);
            }
        }
        return u10;
    }

    public final J h(long j10, boolean z10) {
        return new C1176i(j10, this.f5316g, e(this.f5317h, VerisoulWebViewImplKt.WEBVIEW_TIMEOUT), this.f5317h, z10);
    }

    public final int i(int i10) {
        if (n(i10)) {
            return this.f5312c ? frameSizeBytesByTypeWb[i10] : frameSizeBytesByTypeNb[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f5312c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw C2338G.a(sb2.toString(), null);
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        return t(interfaceC1184q);
    }

    public final boolean l(int i10) {
        if (this.f5312c) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    public final boolean m(long j10, long j11) {
        return Math.abs(j11 - j10) < VerisoulWebViewImplKt.WEBVIEW_TIMEOUT;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return o(i10) || l(i10);
    }

    public final boolean o(int i10) {
        if (this.f5312c) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    public final void p() {
        if (this.f5326q) {
            return;
        }
        this.f5326q = true;
        boolean z10 = this.f5312c;
        String str = z10 ? "audio/amr-wb" : "audio/amr";
        this.f5321l.c(new a.b().W(str).y0(z10 ? "audio/amr-wb" : "audio/3gpp").o0(z10 ? frameSizeBytesByTypeWb[8] : frameSizeBytesByTypeNb[7]).T(1).z0(z10 ? AudioFormat.AUDIO_SAMPLE_RATE_16000 : AudioFormat.AUDIO_SAMPLE_RATE_8000).P());
    }

    public final void q(long j10, int i10) {
        int i11;
        if (this.f5323n != null) {
            return;
        }
        int i12 = this.f5310a;
        if ((i12 & 4) != 0) {
            this.f5323n = new E(new long[]{this.f5316g}, new long[]{0}, -9223372036854775807L);
        } else if ((i12 & 1) == 0 || !((i11 = this.f5317h) == -1 || i11 == this.f5314e)) {
            this.f5323n = new J.b(-9223372036854775807L);
        } else if (this.f5318i >= 20 || i10 == -1) {
            J h10 = h(j10, (i12 & 2) != 0);
            this.f5323n = h10;
            this.f5321l.d(h10.m());
        }
        J j11 = this.f5323n;
        if (j11 != null) {
            this.f5320k.q(j11);
        }
    }

    public final int s(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.g();
        interfaceC1184q.n(this.scratch, 0, 1);
        byte b10 = this.scratch[0];
        if ((b10 & 131) <= 0) {
            return i((b10 >> 3) & 15);
        }
        throw C2338G.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    public final boolean t(InterfaceC1184q interfaceC1184q) {
        byte[] bArr = amrSignatureNb;
        if (r(interfaceC1184q, bArr)) {
            this.f5312c = false;
            interfaceC1184q.l(bArr.length);
            return true;
        }
        byte[] bArr2 = amrSignatureWb;
        if (!r(interfaceC1184q, bArr2)) {
            return false;
        }
        this.f5312c = true;
        interfaceC1184q.l(bArr2.length);
        return true;
    }

    public final int u(InterfaceC1184q interfaceC1184q) {
        if (this.f5315f == 0) {
            try {
                int s10 = s(interfaceC1184q);
                this.f5314e = s10;
                this.f5315f = s10;
                if (this.f5317h == -1) {
                    this.f5316g = interfaceC1184q.getPosition();
                    this.f5317h = this.f5314e;
                }
                if (this.f5317h == this.f5314e) {
                    this.f5318i++;
                }
                J j10 = this.f5323n;
                if (j10 instanceof E) {
                    E e10 = (E) j10;
                    long j11 = this.f5319j + this.f5313d + VerisoulWebViewImplKt.WEBVIEW_TIMEOUT;
                    long position = interfaceC1184q.getPosition() + this.f5314e;
                    if (!e10.c(j11, 100000L)) {
                        e10.a(j11, position);
                    }
                    if (this.f5324o && m(j11, this.f5325p)) {
                        this.f5324o = false;
                        this.f5322m = this.f5321l;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int e11 = this.f5322m.e(interfaceC1184q, this.f5315f, true);
        if (e11 == -1) {
            return -1;
        }
        int i10 = this.f5315f - e11;
        this.f5315f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f5322m.g(this.f5319j + this.f5313d, 1, this.f5314e, 0, null);
        this.f5313d += VerisoulWebViewImplKt.WEBVIEW_TIMEOUT;
        return 0;
    }

    public b(int i10) {
        this.f5310a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.scratch = new byte[1];
        this.f5317h = -1;
        C1181n c1181n = new C1181n();
        this.f5311b = c1181n;
        this.f5322m = c1181n;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
