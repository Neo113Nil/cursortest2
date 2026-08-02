package Z1;

import H1.AbstractC1168a;
import H1.C;
import H1.C1171d;
import H1.C1174g;
import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.O;
import H1.P;
import H1.r;
import H1.u;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.AbstractC2356j;
import b1.C2338G;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.C4157y;
import e1.J;
import e1.Z;
import e2.s;
import e2.t;
import f1.AbstractC4230h;
import f1.C4223a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public class e implements InterfaceC1183p {

    /* renamed from: g0, reason: collision with root package name */
    public static final Map f14449g0;

    /* renamed from: A, reason: collision with root package name */
    public long f14450A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f14451B;

    /* renamed from: C, reason: collision with root package name */
    public long f14452C;

    /* renamed from: D, reason: collision with root package name */
    public long f14453D;

    /* renamed from: E, reason: collision with root package name */
    public long f14454E;

    /* renamed from: F, reason: collision with root package name */
    public C4157y f14455F;

    /* renamed from: G, reason: collision with root package name */
    public C4157y f14456G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f14457H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f14458I;

    /* renamed from: J, reason: collision with root package name */
    public int f14459J;

    /* renamed from: K, reason: collision with root package name */
    public long f14460K;

    /* renamed from: L, reason: collision with root package name */
    public long f14461L;

    /* renamed from: M, reason: collision with root package name */
    public int f14462M;

    /* renamed from: N, reason: collision with root package name */
    public int f14463N;

    /* renamed from: O, reason: collision with root package name */
    public int f14464O;

    /* renamed from: P, reason: collision with root package name */
    public int f14465P;

    /* renamed from: Q, reason: collision with root package name */
    public int f14466Q;

    /* renamed from: R, reason: collision with root package name */
    public int f14467R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f14468S;

    /* renamed from: T, reason: collision with root package name */
    public long f14469T;

    /* renamed from: U, reason: collision with root package name */
    public int f14470U;

    /* renamed from: V, reason: collision with root package name */
    public int f14471V;

    /* renamed from: W, reason: collision with root package name */
    public int f14472W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f14473X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f14474Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f14475Z;

    /* renamed from: a, reason: collision with root package name */
    public final Z1.c f14476a;

    /* renamed from: a0, reason: collision with root package name */
    public int f14477a0;

    /* renamed from: b, reason: collision with root package name */
    public final g f14478b;

    /* renamed from: b0, reason: collision with root package name */
    public byte f14479b0;
    private int[] blockSampleSizes;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f14480c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f14481c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14482d;

    /* renamed from: d0, reason: collision with root package name */
    public r f14483d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14484e;

    /* renamed from: f, reason: collision with root package name */
    public final s.a f14485f;

    /* renamed from: g, reason: collision with root package name */
    public final J f14486g;

    /* renamed from: h, reason: collision with root package name */
    public final J f14487h;

    /* renamed from: i, reason: collision with root package name */
    public final J f14488i;

    /* renamed from: j, reason: collision with root package name */
    public final J f14489j;

    /* renamed from: k, reason: collision with root package name */
    public final J f14490k;

    /* renamed from: l, reason: collision with root package name */
    public final J f14491l;

    /* renamed from: m, reason: collision with root package name */
    public final J f14492m;

    /* renamed from: n, reason: collision with root package name */
    public final J f14493n;

    /* renamed from: o, reason: collision with root package name */
    public final J f14494o;

    /* renamed from: p, reason: collision with root package name */
    public final J f14495p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f14496q;

    /* renamed from: r, reason: collision with root package name */
    public long f14497r;

    /* renamed from: s, reason: collision with root package name */
    public long f14498s;

    /* renamed from: t, reason: collision with root package name */
    public long f14499t;

    /* renamed from: u, reason: collision with root package name */
    public long f14500u;

    /* renamed from: v, reason: collision with root package name */
    public long f14501v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14502w;

    /* renamed from: x, reason: collision with root package name */
    public c f14503x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14504y;

    /* renamed from: z, reason: collision with root package name */
    public int f14505z;

    /* renamed from: e0, reason: collision with root package name */
    public static final u f14447e0 = new u() { // from class: Z1.d
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return e.b();
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Z.B0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: f0, reason: collision with root package name */
    public static final UUID f14448f0 = new UUID(72057594037932032L, -9223371306706625679L);

    public final class b implements Z1.b {
        public b() {
        }

        @Override // Z1.b
        public void a(int i10) {
            e.this.q(i10);
        }

        @Override // Z1.b
        public void b(int i10, int i11, InterfaceC1184q interfaceC1184q) {
            e.this.n(i10, i11, interfaceC1184q);
        }

        @Override // Z1.b
        public void c(int i10, double d10) {
            e.this.t(i10, d10);
        }

        @Override // Z1.b
        public void d(int i10, long j10) {
            e.this.z(i10, j10);
        }

        @Override // Z1.b
        public int e(int i10) {
            return e.this.w(i10);
        }

        @Override // Z1.b
        public boolean f(int i10) {
            return e.this.B(i10);
        }

        @Override // Z1.b
        public void g(int i10, String str) {
            e.this.I(i10, str);
        }

        @Override // Z1.b
        public void h(int i10, long j10, long j11) {
            e.this.H(i10, j10, j11);
        }
    }

    public static final class c {

        /* renamed from: R, reason: collision with root package name */
        public P f14524R;

        /* renamed from: S, reason: collision with root package name */
        public boolean f14525S;

        /* renamed from: V, reason: collision with root package name */
        public O f14528V;

        /* renamed from: W, reason: collision with root package name */
        public int f14529W;

        /* renamed from: a, reason: collision with root package name */
        public boolean f14530a;

        /* renamed from: b, reason: collision with root package name */
        public String f14531b;

        /* renamed from: c, reason: collision with root package name */
        public String f14532c;
        public byte[] codecPrivate;

        /* renamed from: d, reason: collision with root package name */
        public int f14533d;
        public byte[] dolbyVisionConfigBytes;

        /* renamed from: e, reason: collision with root package name */
        public int f14534e;

        /* renamed from: f, reason: collision with root package name */
        public int f14535f;

        /* renamed from: g, reason: collision with root package name */
        public int f14536g;

        /* renamed from: h, reason: collision with root package name */
        public int f14537h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f14538i;

        /* renamed from: j, reason: collision with root package name */
        public O.a f14539j;

        /* renamed from: k, reason: collision with root package name */
        public DrmInitData f14540k;
        public byte[] sampleStrippedBytes;

        /* renamed from: l, reason: collision with root package name */
        public int f14541l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f14542m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f14543n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f14544o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f14545p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f14546q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f14547r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f14548s = 0.0f;

        /* renamed from: t, reason: collision with root package name */
        public float f14549t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f14550u = 0.0f;
        public byte[] projectionData = null;

        /* renamed from: v, reason: collision with root package name */
        public int f14551v = -1;

        /* renamed from: w, reason: collision with root package name */
        public boolean f14552w = false;

        /* renamed from: x, reason: collision with root package name */
        public int f14553x = -1;

        /* renamed from: y, reason: collision with root package name */
        public int f14554y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f14555z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f14507A = 1000;

        /* renamed from: B, reason: collision with root package name */
        public int f14508B = 200;

        /* renamed from: C, reason: collision with root package name */
        public float f14509C = -1.0f;

        /* renamed from: D, reason: collision with root package name */
        public float f14510D = -1.0f;

        /* renamed from: E, reason: collision with root package name */
        public float f14511E = -1.0f;

        /* renamed from: F, reason: collision with root package name */
        public float f14512F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f14513G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f14514H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f14515I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f14516J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f14517K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f14518L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public int f14519M = 1;

        /* renamed from: N, reason: collision with root package name */
        public int f14520N = -1;

        /* renamed from: O, reason: collision with root package name */
        public int f14521O = AudioFormat.AUDIO_SAMPLE_RATE_8000;

        /* renamed from: P, reason: collision with root package name */
        public long f14522P = 0;

        /* renamed from: Q, reason: collision with root package name */
        public long f14523Q = 0;

        /* renamed from: T, reason: collision with root package name */
        public boolean f14526T = true;

        /* renamed from: U, reason: collision with root package name */
        public String f14527U = "eng";

        public static Pair k(J j10) {
            try {
                j10.c0(16);
                long C10 = j10.C();
                if (C10 == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (C10 == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (C10 != 826496599) {
                    AbstractC4156x.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] f10 = j10.f();
                for (int g10 = j10.g() + 20; g10 < f10.length - 4; g10++) {
                    if (f10[g10] == 0 && f10[g10 + 1] == 0 && f10[g10 + 2] == 1 && f10[g10 + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(f10, g10, f10.length)));
                    }
                }
                throw C2338G.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C2338G.a("Error parsing FourCC private data", null);
            }
        }

        public static boolean l(J j10) {
            try {
                int E10 = j10.E();
                if (E10 == 1) {
                    return true;
                }
                if (E10 == 65534) {
                    j10.b0(24);
                    if (j10.F() == e.f14448f0.getMostSignificantBits()) {
                        if (j10.F() == e.f14448f0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C2338G.a("Error parsing MS/ACM codec private", null);
            }
        }

        public static List m(byte[] bArr) {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw C2338G.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw C2338G.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw C2338G.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw C2338G.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C2338G.a("Error parsing vorbis codec private", null);
            }
        }

        public final void f() {
            AbstractC4134a.e(this.f14528V);
        }

        public final byte[] g(String str) {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw C2338G.a("Missing CodecPrivate for codec " + str, null);
        }

        public final byte[] h() {
            if (this.f14509C == -1.0f || this.f14510D == -1.0f || this.f14511E == -1.0f || this.f14512F == -1.0f || this.f14513G == -1.0f || this.f14514H == -1.0f || this.f14515I == -1.0f || this.f14516J == -1.0f || this.f14517K == -1.0f || this.f14518L == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f14509C * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f14510D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f14511E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f14512F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f14513G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f14514H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f14515I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f14516J * 50000.0f) + 0.5f));
            order.putShort((short) (this.f14517K + 0.5f));
            order.putShort((short) (this.f14518L + 0.5f));
            order.putShort((short) this.f14507A);
            order.putShort((short) this.f14508B);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0458  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0471  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0480  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x05bc  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x05d7  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x05da  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0492  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0473  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void i(r rVar, int i10) {
            char c10;
            List singletonList;
            String str;
            int i11;
            int i12;
            List list;
            String str2;
            String str3;
            a.b bVar;
            int i13;
            int i14;
            int i15;
            C4223a a10;
            String str4 = this.f14532c;
            str4.getClass();
            switch (str4.hashCode()) {
                case -2095576542:
                    if (str4.equals("V_MPEG4/ISO/AP")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -2095575984:
                    if (str4.equals("V_MPEG4/ISO/SP")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1985379776:
                    if (str4.equals("A_MS/ACM")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1784763192:
                    if (str4.equals("A_TRUEHD")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1730367663:
                    if (str4.equals("A_VORBIS")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1482641358:
                    if (str4.equals("A_MPEG/L2")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1482641357:
                    if (str4.equals("A_MPEG/L3")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1373388978:
                    if (str4.equals("V_MS/VFW/FOURCC")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -933872740:
                    if (str4.equals("S_DVBSUB")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -538363189:
                    if (str4.equals("V_MPEG4/ISO/ASP")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -538363109:
                    if (str4.equals("V_MPEG4/ISO/AVC")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -425012669:
                    if (str4.equals("S_VOBSUB")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -356037306:
                    if (str4.equals("A_DTS/LOSSLESS")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 62923557:
                    if (str4.equals("A_AAC")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 62923603:
                    if (str4.equals("A_AC3")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 62927045:
                    if (str4.equals("A_DTS")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 82318131:
                    if (str4.equals("V_AV1")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 82338133:
                    if (str4.equals("V_VP8")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 82338134:
                    if (str4.equals("V_VP9")) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99146302:
                    if (str4.equals("S_HDMV/PGS")) {
                        c10 = 19;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 444813526:
                    if (str4.equals("V_THEORA")) {
                        c10 = 20;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 542569478:
                    if (str4.equals("A_DTS/EXPRESS")) {
                        c10 = 21;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 635596514:
                    if (str4.equals("A_PCM/FLOAT/IEEE")) {
                        c10 = 22;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 725948237:
                    if (str4.equals("A_PCM/INT/BIG")) {
                        c10 = 23;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 725957860:
                    if (str4.equals("A_PCM/INT/LIT")) {
                        c10 = 24;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 738597099:
                    if (str4.equals("S_TEXT/ASS")) {
                        c10 = 25;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 738614379:
                    if (str4.equals("S_TEXT/SSA")) {
                        c10 = 26;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 855502857:
                    if (str4.equals("V_MPEGH/ISO/HEVC")) {
                        c10 = 27;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1045209816:
                    if (str4.equals("S_TEXT/WEBVTT")) {
                        c10 = 28;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1422270023:
                    if (str4.equals("S_TEXT/UTF8")) {
                        c10 = 29;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1809237540:
                    if (str4.equals("V_MPEG2")) {
                        c10 = 30;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1950749482:
                    if (str4.equals("A_EAC3")) {
                        c10 = 31;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1950789798:
                    if (str4.equals("A_FLAC")) {
                        c10 = ' ';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1951062397:
                    if (str4.equals("A_OPUS")) {
                        c10 = '!';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str5 = "audio/raw";
            switch (c10) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr = this.codecPrivate;
                    singletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = "video/mp4v-es";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null && (a10 = C4223a.a(new J(this.dolbyVisionConfigBytes))) != null) {
                        str = a10.f46170c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    int i16 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                        bVar.T(this.f14519M).z0(this.f14521O).s0(i11);
                        i13 = 1;
                    } else if (AbstractC2335D.t(str3)) {
                        if (this.f14546q == 0) {
                            int i17 = this.f14544o;
                            i14 = -1;
                            if (i17 == -1) {
                                i17 = this.f14541l;
                            }
                            this.f14544o = i17;
                            int i18 = this.f14545p;
                            if (i18 == -1) {
                                i18 = this.f14542m;
                            }
                            this.f14545p = i18;
                        } else {
                            i14 = -1;
                        }
                        float f10 = (this.f14544o == i14 || (i15 = this.f14545p) == i14) ? -1.0f : (this.f14542m * r2) / (this.f14541l * i15);
                        C2357k a11 = this.f14552w ? new C2357k.b().d(this.f14553x).c(this.f14555z).e(this.f14554y).f(h()).g(this.f14543n).b(this.f14543n).a() : null;
                        if (this.f14531b != null && e.f14449g0.containsKey(this.f14531b)) {
                            i14 = ((Integer) e.f14449g0.get(this.f14531b)).intValue();
                        }
                        if (this.f14547r == 0 && Float.compare(this.f14548s, 0.0f) == 0 && Float.compare(this.f14549t, 0.0f) == 0) {
                            if (Float.compare(this.f14550u, 0.0f) == 0) {
                                i14 = 0;
                            } else if (Float.compare(this.f14550u, 90.0f) == 0) {
                                i14 = 90;
                            } else if (Float.compare(this.f14550u, -180.0f) == 0 || Float.compare(this.f14550u, 180.0f) == 0) {
                                i14 = 180;
                            } else if (Float.compare(this.f14550u, -90.0f) == 0) {
                                i14 = 270;
                            }
                        }
                        bVar.F0(this.f14541l).h0(this.f14542m).u0(f10).x0(i14).v0(this.projectionData).B0(this.f14551v).V(a11);
                        i13 = 2;
                    } else {
                        if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw C2338G.a("Unexpected MIME type.", null);
                        }
                        i13 = 3;
                    }
                    if (this.f14531b != null && !e.f14449g0.containsKey(this.f14531b)) {
                        bVar.l0(this.f14531b);
                    }
                    androidx.media3.common.a P10 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11;
                    c11.c(P10);
                    return;
                case 2:
                    if (l(new J(g(this.f14532c)))) {
                        int n02 = Z.n0(this.f14520N);
                        if (n02 != 0) {
                            i11 = n02;
                            singletonList = null;
                            str = null;
                            i12 = -1;
                            if (this.dolbyVisionConfigBytes != null) {
                                str = a10.f46170c;
                                str5 = "video/dolby-vision";
                                break;
                            }
                            str3 = str5;
                            int i162 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                            bVar = new a.b();
                            if (AbstractC2335D.o(str3)) {
                            }
                            if (this.f14531b != null) {
                                bVar.l0(this.f14531b);
                                break;
                            }
                            androidx.media3.common.a P102 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162).k0(singletonList).U(str).c0(this.f14540k).P();
                            O c112 = rVar.c(this.f14533d, i13);
                            this.f14528V = c112;
                            c112.c(P102);
                            return;
                        }
                        AbstractC4156x.i("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f14520N + ". Setting mimeType to audio/x-unknown");
                    } else {
                        AbstractC4156x.i("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    }
                    singletonList = null;
                    str = null;
                    str5 = "audio/x-unknown";
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1622 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P1022 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c1122 = rVar.c(this.f14533d, i13);
                    this.f14528V = c1122;
                    c1122.c(P1022);
                    return;
                case 3:
                    this.f14524R = new P();
                    str5 = "audio/true-hd";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222;
                    c11222.c(P10222);
                    return;
                case 4:
                    singletonList = m(g(this.f14532c));
                    str5 = "audio/vorbis";
                    i12 = 8192;
                    str = null;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i162222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P102222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c112222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c112222;
                    c112222.c(P102222);
                    return;
                case 5:
                    str5 = "audio/mpeg-L2";
                    singletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1622222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P1022222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c1122222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c1122222;
                    c1122222.c(P1022222);
                    return;
                case 6:
                    str5 = "audio/mpeg";
                    singletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222;
                    c11222222.c(P10222222);
                    return;
                case 7:
                    Pair k10 = k(new J(g(this.f14532c)));
                    str5 = (String) k10.first;
                    singletonList = (List) k10.second;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i162222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P102222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c112222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c112222222;
                    c112222222.c(P102222222);
                    return;
                case '\b':
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(g(this.f14532c), 0, bArr2, 0, 4);
                    singletonList = AbstractC3445z.u(bArr2);
                    str = null;
                    str5 = "application/dvbsubs";
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1622222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P1022222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c1122222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c1122222222;
                    c1122222222.c(P1022222222);
                    return;
                case '\n':
                    C1171d b10 = C1171d.b(new J(g(this.f14532c)));
                    list = b10.f4399a;
                    this.f14529W = b10.f4400b;
                    str2 = b10.f4410l;
                    str5 = "video/avc";
                    List list2 = list;
                    str = str2;
                    singletonList = list2;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222222;
                    c11222222222.c(P10222222222);
                    return;
                case 11:
                    singletonList = AbstractC3445z.u(g(this.f14532c));
                    str = null;
                    str5 = "application/vobsub";
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i162222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P102222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c112222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c112222222222;
                    c112222222222.c(P102222222222);
                    return;
                case '\f':
                    str5 = "audio/vnd.dts.hd";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1622222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P1022222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c1122222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c1122222222222;
                    c1122222222222.c(P1022222222222);
                    return;
                case '\r':
                    singletonList = Collections.singletonList(g(this.f14532c));
                    AbstractC1168a.b f11 = AbstractC1168a.f(this.codecPrivate);
                    this.f14521O = f11.f4377a;
                    this.f14519M = f11.f4378b;
                    str = f11.f4379c;
                    str5 = "audio/mp4a-latm";
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222222222;
                    c11222222222222.c(P10222222222222);
                    return;
                case 14:
                    str5 = "audio/ac3";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i162222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P102222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c112222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c112222222222222;
                    c112222222222222.c(P102222222222222);
                    return;
                case 15:
                case 21:
                    str5 = "audio/vnd.dts";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1622222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P1022222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c1122222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c1122222222222222;
                    c1122222222222222.c(P1022222222222222);
                    return;
                case 16:
                    byte[] bArr3 = this.codecPrivate;
                    singletonList = bArr3 == null ? null : AbstractC3445z.u(bArr3);
                    str5 = "video/av01";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222222222222;
                    c11222222222222222.c(P10222222222222222);
                    return;
                case 17:
                    str5 = "video/x-vnd.on2.vp8";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i162222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P102222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c112222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c112222222222222222;
                    c112222222222222222.c(P102222222222222222);
                    return;
                case 18:
                    byte[] bArr4 = this.codecPrivate;
                    singletonList = bArr4 == null ? null : AbstractC3445z.u(bArr4);
                    str5 = "video/x-vnd.on2.vp9";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1622222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P1022222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c1122222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c1122222222222222222;
                    c1122222222222222222.c(P1022222222222222222);
                    return;
                case 19:
                    singletonList = null;
                    str = null;
                    str5 = "application/pgs";
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222222222222222;
                    c11222222222222222222.c(P10222222222222222222);
                    return;
                case 20:
                    str5 = "video/x-unknown";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i162222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P102222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c112222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c112222222222222222222;
                    c112222222222222222222.c(P102222222222222222222);
                    return;
                case 22:
                    if (this.f14520N == 32) {
                        singletonList = null;
                        str = null;
                        i12 = -1;
                        i11 = 4;
                        if (this.dolbyVisionConfigBytes != null) {
                        }
                        str3 = str5;
                        int i1622222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                        bVar = new a.b();
                        if (AbstractC2335D.o(str3)) {
                        }
                        if (this.f14531b != null) {
                        }
                        androidx.media3.common.a P1022222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                        O c1122222222222222222222 = rVar.c(this.f14533d, i13);
                        this.f14528V = c1122222222222222222222;
                        c1122222222222222222222.c(P1022222222222222222222);
                        return;
                    }
                    AbstractC4156x.i("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.f14520N + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str = null;
                    str5 = "audio/x-unknown";
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222222222222222222;
                    c11222222222222222222222.c(P10222222222222222222222);
                    return;
                case 23:
                    int i19 = this.f14520N;
                    if (i19 == 8) {
                        singletonList = null;
                        str = null;
                        i11 = 3;
                        i12 = -1;
                        if (this.dolbyVisionConfigBytes != null) {
                        }
                        str3 = str5;
                        int i162222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                        bVar = new a.b();
                        if (AbstractC2335D.o(str3)) {
                        }
                        if (this.f14531b != null) {
                        }
                        androidx.media3.common.a P102222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                        O c112222222222222222222222 = rVar.c(this.f14533d, i13);
                        this.f14528V = c112222222222222222222222;
                        c112222222222222222222222.c(P102222222222222222222222);
                        return;
                    }
                    if (i19 == 16) {
                        i11 = 268435456;
                    } else if (i19 == 24) {
                        i11 = 1342177280;
                    } else {
                        if (i19 != 32) {
                            AbstractC4156x.i("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.f14520N + ". Setting mimeType to audio/x-unknown");
                            singletonList = null;
                            str = null;
                            str5 = "audio/x-unknown";
                            i12 = -1;
                            i11 = -1;
                            if (this.dolbyVisionConfigBytes != null) {
                            }
                            str3 = str5;
                            int i1622222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                            bVar = new a.b();
                            if (AbstractC2335D.o(str3)) {
                            }
                            if (this.f14531b != null) {
                            }
                            androidx.media3.common.a P1022222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                            O c1122222222222222222222222 = rVar.c(this.f14533d, i13);
                            this.f14528V = c1122222222222222222222222;
                            c1122222222222222222222222.c(P1022222222222222222222222);
                            return;
                        }
                        i11 = 1610612736;
                    }
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222222222222222222222;
                    c11222222222222222222222222.c(P10222222222222222222222222);
                    return;
                case 24:
                    int n03 = Z.n0(this.f14520N);
                    if (n03 != 0) {
                        i11 = n03;
                        singletonList = null;
                        str = null;
                        i12 = -1;
                        if (this.dolbyVisionConfigBytes != null) {
                        }
                        str3 = str5;
                        int i162222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                        bVar = new a.b();
                        if (AbstractC2335D.o(str3)) {
                        }
                        if (this.f14531b != null) {
                        }
                        androidx.media3.common.a P102222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                        O c112222222222222222222222222 = rVar.c(this.f14533d, i13);
                        this.f14528V = c112222222222222222222222222;
                        c112222222222222222222222222.c(P102222222222222222222222222);
                        return;
                    }
                    AbstractC4156x.i("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.f14520N + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str = null;
                    str5 = "audio/x-unknown";
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1622222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P1022222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c1122222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c1122222222222222222222222222;
                    c1122222222222222222222222222.c(P1022222222222222222222222222);
                    return;
                case 25:
                case 26:
                    singletonList = AbstractC3445z.v(e.SSA_DIALOGUE_FORMAT, g(this.f14532c));
                    str5 = "text/x-ssa";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222222222222222222222222;
                    c11222222222222222222222222222.c(P10222222222222222222222222222);
                    return;
                case 27:
                    C a12 = C.a(new J(g(this.f14532c)));
                    list = a12.f4305a;
                    this.f14529W = a12.f4306b;
                    str2 = a12.f4320p;
                    str5 = "video/hevc";
                    List list22 = list;
                    str = str2;
                    singletonList = list22;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i162222222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P102222222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c112222222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c112222222222222222222222222222;
                    c112222222222222222222222222222.c(P102222222222222222222222222222);
                    return;
                case 28:
                    str5 = "text/vtt";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1622222222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P1022222222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c1122222222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c1122222222222222222222222222222;
                    c1122222222222222222222222222222.c(P1022222222222222222222222222222);
                    return;
                case 29:
                    str5 = "application/x-subrip";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222222222222222222222222222;
                    c11222222222222222222222222222222.c(P10222222222222222222222222222222);
                    return;
                case 30:
                    str5 = "video/mpeg2";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i162222222222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P102222222222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c112222222222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c112222222222222222222222222222222;
                    c112222222222222222222222222222222.c(P102222222222222222222222222222222);
                    return;
                case 31:
                    str5 = "audio/eac3";
                    singletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i1622222222222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P1022222222222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i1622222222222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c1122222222222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c1122222222222222222222222222222222;
                    c1122222222222222222222222222222222.c(P1022222222222222222222222222222222);
                    return;
                case ' ':
                    singletonList = Collections.singletonList(g(this.f14532c));
                    str5 = "audio/flac";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i16222222222222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P10222222222222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i16222222222222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c11222222222222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c11222222222222222222222222222222222;
                    c11222222222222222222222222222222222.c(P10222222222222222222222222222222222);
                    return;
                case '!':
                    singletonList = new ArrayList(3);
                    singletonList.add(g(this.f14532c));
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    singletonList.add(allocate.order(byteOrder).putLong(this.f14522P).array());
                    singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f14523Q).array());
                    str5 = "audio/opus";
                    i12 = 5760;
                    str = null;
                    i11 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                    }
                    str3 = str5;
                    int i162222222222222222222222222222222222 = (this.f14525S ? 2 : 0) | (this.f14526T ? 1 : 0);
                    bVar = new a.b();
                    if (AbstractC2335D.o(str3)) {
                    }
                    if (this.f14531b != null) {
                    }
                    androidx.media3.common.a P102222222222222222222222222222222222 = bVar.i0(i10).W(this.f14530a ? "video/webm" : "video/x-matroska").y0(str3).o0(i12).n0(this.f14527U).A0(i162222222222222222222222222222222222).k0(singletonList).U(str).c0(this.f14540k).P();
                    O c112222222222222222222222222222222222 = rVar.c(this.f14533d, i13);
                    this.f14528V = c112222222222222222222222222222222222;
                    c112222222222222222222222222222222222.c(P102222222222222222222222222222222222);
                    return;
                default:
                    throw C2338G.a("Unrecognized codec identifier.", null);
            }
        }

        public void j() {
            P p10 = this.f14524R;
            if (p10 != null) {
                p10.a(this.f14528V, this.f14539j);
            }
        }

        public void n() {
            P p10 = this.f14524R;
            if (p10 != null) {
                p10.b();
            }
        }

        public final boolean o(boolean z10) {
            return "A_OPUS".equals(this.f14532c) ? z10 : this.f14536g > 0;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f14449g0 = Collections.unmodifiableMap(hashMap);
    }

    public e(s.a aVar, int i10) {
        this(new Z1.a(), i10, aVar);
    }

    public static boolean A(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    public static void G(String str, long j10, byte[] bArr) {
        byte[] u10;
        int i10;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
                u10 = u(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                u10 = u(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                u10 = u(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(u10, 0, bArr, i10, u10.length);
    }

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new e(s.a.f45617a, 2)};
    }

    private void m() {
        AbstractC4134a.i(this.f14483d0);
    }

    public static int[] r(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    public static byte[] u(long j10, String str, long j11) {
        AbstractC4134a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        return Z.B0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    public boolean B(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public final boolean C(I i10, long j10) {
        if (this.f14451B) {
            this.f14453D = j10;
            i10.f4333a = this.f14452C;
            this.f14451B = false;
            return true;
        }
        if (this.f14504y) {
            long j11 = this.f14453D;
            if (j11 != -1) {
                i10.f4333a = j11;
                this.f14453D = -1L;
                return true;
            }
        }
        return false;
    }

    public final void D(InterfaceC1184q interfaceC1184q, int i10) {
        if (this.f14488i.j() >= i10) {
            return;
        }
        if (this.f14488i.b() < i10) {
            J j10 = this.f14488i;
            j10.d(Math.max(j10.b() * 2, i10));
        }
        interfaceC1184q.readFully(this.f14488i.f(), this.f14488i.j(), i10 - this.f14488i.j());
        this.f14488i.a0(i10);
    }

    public final void E() {
        this.f14470U = 0;
        this.f14471V = 0;
        this.f14472W = 0;
        this.f14473X = false;
        this.f14474Y = false;
        this.f14475Z = false;
        this.f14477a0 = 0;
        this.f14479b0 = (byte) 0;
        this.f14481c0 = false;
        this.f14491l.X(0);
    }

    public final long F(long j10) {
        long j11 = this.f14499t;
        if (j11 != -9223372036854775807L) {
            return Z.p1(j10, j11, 1000L);
        }
        throw C2338G.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public void H(int i10, long j10, long j11) {
        m();
        if (i10 == 160) {
            this.f14468S = false;
            this.f14469T = 0L;
            return;
        }
        if (i10 == 174) {
            c cVar = new c();
            this.f14503x = cVar;
            cVar.f14530a = this.f14502w;
            return;
        }
        if (i10 == 187) {
            this.f14457H = false;
            return;
        }
        if (i10 == 19899) {
            this.f14505z = -1;
            this.f14450A = -1L;
            return;
        }
        if (i10 == 20533) {
            v(i10).f14538i = true;
            return;
        }
        if (i10 == 21968) {
            v(i10).f14552w = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f14498s;
            if (j12 != -1 && j12 != j10) {
                throw C2338G.a("Multiple Segment elements not supported", null);
            }
            this.f14498s = j10;
            this.f14497r = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f14455F = new C4157y();
            this.f14456G = new C4157y();
        } else if (i10 == 524531317 && !this.f14504y) {
            if (this.f14482d && this.f14452C != -1) {
                this.f14451B = true;
            } else {
                this.f14483d0.q(new J.b(this.f14501v));
                this.f14504y = true;
            }
        }
    }

    public void I(int i10, String str) {
        if (i10 == 134) {
            v(i10).f14532c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                v(i10).f14531b = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                v(i10).f14527U = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f14502w = Objects.equals(str, "webm");
            return;
        }
        throw C2338G.a("DocType " + str + " not supported", null);
    }

    public final int J(InterfaceC1184q interfaceC1184q, c cVar, int i10, boolean z10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f14532c)) {
            K(interfaceC1184q, SUBRIP_PREFIX, i10);
            return s();
        }
        if ("S_TEXT/ASS".equals(cVar.f14532c) || "S_TEXT/SSA".equals(cVar.f14532c)) {
            K(interfaceC1184q, SSA_PREFIX, i10);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f14532c)) {
            K(interfaceC1184q, VTT_PREFIX, i10);
            return s();
        }
        O o10 = cVar.f14528V;
        if (!this.f14473X) {
            if (cVar.f14538i) {
                this.f14466Q &= -1073741825;
                if (!this.f14474Y) {
                    interfaceC1184q.readFully(this.f14488i.f(), 0, 1);
                    this.f14470U++;
                    if ((this.f14488i.f()[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw C2338G.a("Extension bit is set in signal byte", null);
                    }
                    this.f14479b0 = this.f14488i.f()[0];
                    this.f14474Y = true;
                }
                byte b10 = this.f14479b0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.f14466Q |= 1073741824;
                    if (!this.f14481c0) {
                        interfaceC1184q.readFully(this.f14493n.f(), 0, 8);
                        this.f14470U += 8;
                        this.f14481c0 = true;
                        this.f14488i.f()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f14488i.b0(0);
                        o10.f(this.f14488i, 1, 1);
                        this.f14471V++;
                        this.f14493n.b0(0);
                        o10.f(this.f14493n, 8, 1);
                        this.f14471V += 8;
                    }
                    if (z11) {
                        if (!this.f14475Z) {
                            interfaceC1184q.readFully(this.f14488i.f(), 0, 1);
                            this.f14470U++;
                            this.f14488i.b0(0);
                            this.f14477a0 = this.f14488i.M();
                            this.f14475Z = true;
                        }
                        int i12 = this.f14477a0 * 4;
                        this.f14488i.X(i12);
                        interfaceC1184q.readFully(this.f14488i.f(), 0, i12);
                        this.f14470U += i12;
                        short s10 = (short) ((this.f14477a0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f14496q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f14496q = ByteBuffer.allocate(i13);
                        }
                        this.f14496q.position(0);
                        this.f14496q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f14477a0;
                            if (i14 >= i11) {
                                break;
                            }
                            int Q10 = this.f14488i.Q();
                            if (i14 % 2 == 0) {
                                this.f14496q.putShort((short) (Q10 - i15));
                            } else {
                                this.f14496q.putInt(Q10 - i15);
                            }
                            i14++;
                            i15 = Q10;
                        }
                        int i16 = (i10 - this.f14470U) - i15;
                        if (i11 % 2 == 1) {
                            this.f14496q.putInt(i16);
                        } else {
                            this.f14496q.putShort((short) i16);
                            this.f14496q.putInt(0);
                        }
                        this.f14494o.Z(this.f14496q.array(), i13);
                        o10.f(this.f14494o, i13, 1);
                        this.f14471V += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.sampleStrippedBytes;
                if (bArr != null) {
                    this.f14491l.Z(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.f14466Q |= 268435456;
                this.f14495p.X(0);
                int j10 = (this.f14491l.j() + i10) - this.f14470U;
                this.f14488i.X(4);
                this.f14488i.f()[0] = (byte) ((j10 >> 24) & 255);
                this.f14488i.f()[1] = (byte) ((j10 >> 16) & 255);
                this.f14488i.f()[2] = (byte) ((j10 >> 8) & 255);
                this.f14488i.f()[3] = (byte) (j10 & 255);
                o10.f(this.f14488i, 4, 2);
                this.f14471V += 4;
            }
            this.f14473X = true;
        }
        int j11 = i10 + this.f14491l.j();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f14532c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f14532c)) {
            if (cVar.f14524R != null) {
                AbstractC4134a.g(this.f14491l.j() == 0);
                cVar.f14524R.d(interfaceC1184q);
            }
            while (true) {
                int i17 = this.f14470U;
                if (i17 >= j11) {
                    break;
                }
                int L10 = L(interfaceC1184q, o10, j11 - i17);
                this.f14470U += L10;
                this.f14471V += L10;
            }
        } else {
            byte[] f10 = this.f14487h.f();
            f10[0] = 0;
            f10[1] = 0;
            f10[2] = 0;
            int i18 = cVar.f14529W;
            int i19 = 4 - i18;
            while (this.f14470U < j11) {
                int i20 = this.f14472W;
                if (i20 == 0) {
                    M(interfaceC1184q, f10, i19, i18);
                    this.f14470U += i18;
                    this.f14487h.b0(0);
                    this.f14472W = this.f14487h.Q();
                    this.f14486g.b0(0);
                    o10.a(this.f14486g, 4);
                    this.f14471V += 4;
                } else {
                    int L11 = L(interfaceC1184q, o10, i20);
                    this.f14470U += L11;
                    this.f14471V += L11;
                    this.f14472W -= L11;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f14532c)) {
            this.f14489j.b0(0);
            o10.a(this.f14489j, 4);
            this.f14471V += 4;
        }
        return s();
    }

    public final void K(InterfaceC1184q interfaceC1184q, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f14492m.b() < length) {
            this.f14492m.Y(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f14492m.f(), 0, bArr.length);
        }
        interfaceC1184q.readFully(this.f14492m.f(), bArr.length, i10);
        this.f14492m.b0(0);
        this.f14492m.a0(length);
    }

    public final int L(InterfaceC1184q interfaceC1184q, O o10, int i10) {
        int a10 = this.f14491l.a();
        if (a10 <= 0) {
            return o10.e(interfaceC1184q, i10, false);
        }
        int min = Math.min(i10, a10);
        o10.a(this.f14491l, min);
        return min;
    }

    public final void M(InterfaceC1184q interfaceC1184q, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f14491l.a());
        interfaceC1184q.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f14491l.q(bArr, i10, min);
        }
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f14454E = -9223372036854775807L;
        this.f14459J = 0;
        this.f14476a.reset();
        this.f14478b.e();
        E();
        for (int i10 = 0; i10 < this.f14480c.size(); i10++) {
            ((c) this.f14480c.valueAt(i10)).n();
        }
    }

    @Override // H1.InterfaceC1183p
    public final void c(r rVar) {
        if (this.f14484e) {
            rVar = new t(rVar, this.f14485f);
        }
        this.f14483d0 = rVar;
    }

    @Override // H1.InterfaceC1183p
    public final int g(InterfaceC1184q interfaceC1184q, I i10) {
        this.f14458I = false;
        boolean z10 = true;
        while (z10 && !this.f14458I) {
            z10 = this.f14476a.a(interfaceC1184q);
            if (z10 && C(i10, interfaceC1184q.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f14480c.size(); i11++) {
            c cVar = (c) this.f14480c.valueAt(i11);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    public final void i(int i10) {
        if (this.f14455F == null || this.f14456G == null) {
            throw C2338G.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    @Override // H1.InterfaceC1183p
    public final boolean j(InterfaceC1184q interfaceC1184q) {
        return new f().b(interfaceC1184q);
    }

    public final void l(int i10) {
        if (this.f14503x != null) {
            return;
        }
        throw C2338G.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0244, code lost:
    
        throw b1.C2338G.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(int i10, int i11, InterfaceC1184q interfaceC1184q) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        InterfaceC1184q interfaceC1184q2 = interfaceC1184q;
        int i20 = 0;
        int i21 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.f14459J != 2) {
                    return;
                }
                y((c) this.f14480c.get(this.f14464O), this.f14467R, interfaceC1184q2, i11);
                return;
            }
            if (i10 == 16877) {
                x(v(i10), interfaceC1184q2, i11);
                return;
            }
            if (i10 == 16981) {
                l(i10);
                byte[] bArr = new byte[i11];
                this.f14503x.sampleStrippedBytes = bArr;
                interfaceC1184q2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                interfaceC1184q2.readFully(bArr2, 0, i11);
                v(i10).f14539j = new O.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f14490k.f(), (byte) 0);
                interfaceC1184q2.readFully(this.f14490k.f(), 4 - i11, i11);
                this.f14490k.b0(0);
                this.f14505z = (int) this.f14490k.O();
                return;
            }
            if (i10 == 25506) {
                l(i10);
                byte[] bArr3 = new byte[i11];
                this.f14503x.codecPrivate = bArr3;
                interfaceC1184q2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw C2338G.a("Unexpected id: " + i10, null);
            }
            l(i10);
            byte[] bArr4 = new byte[i11];
            this.f14503x.projectionData = bArr4;
            interfaceC1184q2.readFully(bArr4, 0, i11);
            return;
        }
        int i22 = 8;
        if (this.f14459J == 0) {
            this.f14464O = (int) this.f14478b.d(interfaceC1184q2, false, true, 8);
            this.f14465P = this.f14478b.b();
            this.f14461L = -9223372036854775807L;
            this.f14459J = 1;
            this.f14488i.X(0);
        }
        c cVar = (c) this.f14480c.get(this.f14464O);
        if (cVar == null) {
            interfaceC1184q2.l(i11 - this.f14465P);
            this.f14459J = 0;
            return;
        }
        cVar.f();
        if (this.f14459J == 1) {
            D(interfaceC1184q2, 3);
            int i23 = (this.f14488i.f()[2] & 6) >> 1;
            if (i23 == 0) {
                this.f14463N = 1;
                int[] r10 = r(this.blockSampleSizes, 1);
                this.blockSampleSizes = r10;
                r10[0] = (i11 - this.f14465P) - 3;
            } else {
                D(interfaceC1184q2, 4);
                int i24 = (this.f14488i.f()[3] & UByte.MAX_VALUE) + 1;
                this.f14463N = i24;
                int[] r11 = r(this.blockSampleSizes, i24);
                this.blockSampleSizes = r11;
                if (i23 == 2) {
                    int i25 = (i11 - this.f14465P) - 4;
                    int i26 = this.f14463N;
                    Arrays.fill(r11, 0, i26, i25 / i26);
                } else if (i23 == 1) {
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 4;
                    while (true) {
                        i17 = this.f14463N;
                        if (i27 >= i17 - 1) {
                            break;
                        }
                        this.blockSampleSizes[i27] = 0;
                        while (true) {
                            i18 = i29 + 1;
                            D(interfaceC1184q2, i18);
                            int i30 = this.f14488i.f()[i29] & UByte.MAX_VALUE;
                            int[] iArr = this.blockSampleSizes;
                            i19 = iArr[i27] + i30;
                            iArr[i27] = i19;
                            if (i30 != 255) {
                                break;
                            } else {
                                i29 = i18;
                            }
                        }
                        i28 += i19;
                        i27++;
                        i29 = i18;
                    }
                    this.blockSampleSizes[i17 - 1] = ((i11 - this.f14465P) - i29) - i28;
                } else {
                    if (i23 != 3) {
                        throw C2338G.a("Unexpected lacing value: " + i23, null);
                    }
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 4;
                    while (true) {
                        int i34 = this.f14463N;
                        i12 = i21;
                        if (i31 >= i34 - 1) {
                            i13 = i20;
                            this.blockSampleSizes[i34 - 1] = ((i11 - this.f14465P) - i33) - i32;
                            break;
                        }
                        this.blockSampleSizes[i31] = i20;
                        int i35 = i33 + 1;
                        D(interfaceC1184q2, i35);
                        if (this.f14488i.f()[i33] == 0) {
                            throw C2338G.a("No valid varint length mask found", null);
                        }
                        int i36 = i20;
                        while (true) {
                            if (i36 >= i22) {
                                i14 = i20;
                                i15 = i22;
                                i16 = i31;
                                j10 = 0;
                                break;
                            }
                            i15 = i22;
                            int i37 = i12 << (7 - i36);
                            i14 = i20;
                            if ((this.f14488i.f()[i33] & i37) != 0) {
                                i35 += i36;
                                D(interfaceC1184q2, i35);
                                int i38 = i33 + 1;
                                j10 = this.f14488i.f()[i33] & UByte.MAX_VALUE & (~i37);
                                while (true) {
                                    int i39 = i38;
                                    if (i39 >= i35) {
                                        break;
                                    }
                                    i38 = i39 + 1;
                                    j10 = (j10 << i15) | (this.f14488i.f()[i39] & UByte.MAX_VALUE);
                                    i31 = i31;
                                }
                                i16 = i31;
                                if (i16 > 0) {
                                    j10 -= (1 << ((i36 * 7) + 6)) - 1;
                                }
                            } else {
                                i36++;
                                interfaceC1184q2 = interfaceC1184q;
                                i20 = i14;
                                i22 = i15;
                            }
                        }
                        i33 = i35;
                        if (j10 < -2147483648L || j10 > 2147483647L) {
                            break;
                        }
                        int i40 = (int) j10;
                        int[] iArr2 = this.blockSampleSizes;
                        if (i16 != 0) {
                            i40 += iArr2[i16 - 1];
                        }
                        iArr2[i16] = i40;
                        i32 += i40;
                        i31 = i16 + 1;
                        interfaceC1184q2 = interfaceC1184q;
                        i21 = i12;
                        i20 = i14;
                        i22 = i15;
                    }
                }
            }
            i13 = 0;
            i12 = 1;
            this.f14460K = this.f14454E + F((this.f14488i.f()[i13] << 8) | (this.f14488i.f()[i12] & UByte.MAX_VALUE));
            this.f14466Q = (cVar.f14534e == 2 || (i10 == 163 && (this.f14488i.f()[2] & ByteCompanionObject.MIN_VALUE) == 128)) ? i12 : i13;
            this.f14459J = 2;
            this.f14462M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i41 = this.f14462M;
                if (i41 >= this.f14463N) {
                    this.f14459J = 0;
                    return;
                }
                int J10 = J(interfaceC1184q, cVar, this.blockSampleSizes[i41], false);
                c cVar2 = cVar;
                p(cVar2, this.f14460K + ((this.f14462M * cVar.f14535f) / 1000), this.f14466Q, J10, 0);
                this.f14462M++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i42 = this.f14462M;
                if (i42 >= this.f14463N) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                boolean z10 = i12;
                iArr3[i42] = J(interfaceC1184q, cVar, iArr3[i42], z10);
                this.f14462M += z10 ? 1 : 0;
            }
        }
    }

    public final H1.J o(C4157y c4157y, C4157y c4157y2) {
        int i10;
        if (this.f14498s == -1 || this.f14501v == -9223372036854775807L || c4157y == null || c4157y.d() == 0 || c4157y2 == null || c4157y2.d() != c4157y.d()) {
            return new J.b(this.f14501v);
        }
        int d10 = c4157y.d();
        int[] iArr = new int[d10];
        long[] jArr = new long[d10];
        long[] jArr2 = new long[d10];
        long[] jArr3 = new long[d10];
        int i11 = 0;
        for (int i12 = 0; i12 < d10; i12++) {
            jArr3[i12] = c4157y.c(i12);
            jArr[i12] = this.f14498s + c4157y2.c(i12);
        }
        while (true) {
            i10 = d10 - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        int i14 = i10;
        while (i14 > 0 && jArr3[i14] > this.f14501v) {
            i14--;
        }
        iArr[i14] = (int) ((this.f14498s + this.f14497r) - jArr[i14]);
        jArr2[i14] = this.f14501v - jArr3[i14];
        if (i14 < i10) {
            AbstractC4156x.i("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArr = Arrays.copyOf(iArr, i15);
            jArr = Arrays.copyOf(jArr, i15);
            jArr2 = Arrays.copyOf(jArr2, i15);
            jArr3 = Arrays.copyOf(jArr3, i15);
        }
        return new C1174g(iArr, jArr, jArr2, jArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(c cVar, long j10, int i10, int i11, int i12) {
        int j11;
        P p10 = cVar.f14524R;
        if (p10 != null) {
            p10.c(cVar.f14528V, j10, i10, i11, i12, cVar.f14539j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f14532c) || "S_TEXT/ASS".equals(cVar.f14532c) || "S_TEXT/SSA".equals(cVar.f14532c) || "S_TEXT/WEBVTT".equals(cVar.f14532c)) {
                if (this.f14463N > 1) {
                    AbstractC4156x.i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.f14461L;
                    if (j12 == -9223372036854775807L) {
                        AbstractC4156x.i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        G(cVar.f14532c, j12, this.f14492m.f());
                        int g10 = this.f14492m.g();
                        while (true) {
                            if (g10 >= this.f14492m.j()) {
                                break;
                            }
                            if (this.f14492m.f()[g10] == 0) {
                                this.f14492m.a0(g10);
                                break;
                            }
                            g10++;
                        }
                        O o10 = cVar.f14528V;
                        e1.J j13 = this.f14492m;
                        o10.a(j13, j13.j());
                        j11 = i11 + this.f14492m.j();
                        if ((i10 & 268435456) != 0) {
                            if (this.f14463N > 1) {
                                this.f14495p.X(0);
                            } else {
                                int j14 = this.f14495p.j();
                                cVar.f14528V.f(this.f14495p, j14, 2);
                                j11 += j14;
                            }
                        }
                        cVar.f14528V.g(j10, i10, j11, i12, cVar.f14539j);
                    }
                }
            }
            j11 = i11;
            if ((i10 & 268435456) != 0) {
            }
            cVar.f14528V.g(j10, i10, j11, i12, cVar.f14539j);
        }
        this.f14458I = true;
    }

    public void q(int i10) {
        m();
        if (i10 == 160) {
            if (this.f14459J != 2) {
                return;
            }
            c cVar = (c) this.f14480c.get(this.f14464O);
            cVar.f();
            if (this.f14469T > 0 && "A_OPUS".equals(cVar.f14532c)) {
                this.f14495p.Y(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f14469T).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f14463N; i12++) {
                i11 += this.blockSampleSizes[i12];
            }
            int i13 = 0;
            while (i13 < this.f14463N) {
                long j10 = this.f14460K + ((cVar.f14535f * i13) / 1000);
                int i14 = this.f14466Q;
                if (i13 == 0 && !this.f14468S) {
                    i14 |= 1;
                }
                int i15 = this.blockSampleSizes[i13];
                int i16 = i11 - i15;
                p(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.f14459J = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) AbstractC4134a.i(this.f14503x);
            String str = cVar2.f14532c;
            if (str == null) {
                throw C2338G.a("CodecId is missing in TrackEntry element", null);
            }
            if (A(str)) {
                cVar2.i(this.f14483d0, cVar2.f14533d);
                this.f14480c.put(cVar2.f14533d, cVar2);
            }
            this.f14503x = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f14505z;
            if (i17 != -1) {
                long j11 = this.f14450A;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f14452C = j11;
                        return;
                    }
                    return;
                }
            }
            throw C2338G.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            l(i10);
            c cVar3 = this.f14503x;
            if (cVar3.f14538i) {
                if (cVar3.f14539j == null) {
                    throw C2338G.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f14540k = new DrmInitData(new DrmInitData.SchemeData(AbstractC2356j.f24591a, "video/webm", this.f14503x.f14539j.encryptionKey));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            l(i10);
            c cVar4 = this.f14503x;
            if (cVar4.f14538i && cVar4.sampleStrippedBytes != null) {
                throw C2338G.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f14499t == -9223372036854775807L) {
                this.f14499t = 1000000L;
            }
            long j12 = this.f14500u;
            if (j12 != -9223372036854775807L) {
                this.f14501v = F(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f14480c.size() == 0) {
                throw C2338G.a("No valid tracks were found", null);
            }
            this.f14483d0.s();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f14504y) {
                this.f14483d0.q(o(this.f14455F, this.f14456G));
                this.f14504y = true;
            }
            this.f14455F = null;
            this.f14456G = null;
        }
    }

    public final int s() {
        int i10 = this.f14471V;
        E();
        return i10;
    }

    public void t(int i10, double d10) {
        if (i10 == 181) {
            v(i10).f14521O = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f14500u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                v(i10).f14509C = (float) d10;
                break;
            case 21970:
                v(i10).f14510D = (float) d10;
                break;
            case 21971:
                v(i10).f14511E = (float) d10;
                break;
            case 21972:
                v(i10).f14512F = (float) d10;
                break;
            case 21973:
                v(i10).f14513G = (float) d10;
                break;
            case 21974:
                v(i10).f14514H = (float) d10;
                break;
            case 21975:
                v(i10).f14515I = (float) d10;
                break;
            case 21976:
                v(i10).f14516J = (float) d10;
                break;
            case 21977:
                v(i10).f14517K = (float) d10;
                break;
            case 21978:
                v(i10).f14518L = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        v(i10).f14548s = (float) d10;
                        break;
                    case 30324:
                        v(i10).f14549t = (float) d10;
                        break;
                    case 30325:
                        v(i10).f14550u = (float) d10;
                        break;
                }
        }
    }

    public c v(int i10) {
        l(i10);
        return this.f14503x;
    }

    public int w(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
            case SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
            case 215:
            case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
            case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
            case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
            case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
            case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void x(c cVar, InterfaceC1184q interfaceC1184q, int i10) {
        if (cVar.f14537h != 1685485123 && cVar.f14537h != 1685480259) {
            interfaceC1184q.l(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.dolbyVisionConfigBytes = bArr;
        interfaceC1184q.readFully(bArr, 0, i10);
    }

    public void y(c cVar, int i10, InterfaceC1184q interfaceC1184q, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f14532c)) {
            interfaceC1184q.l(i11);
        } else {
            this.f14495p.X(i11);
            interfaceC1184q.readFully(this.f14495p.f(), 0, i11);
        }
    }

    public void z(int i10, long j10) {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw C2338G.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw C2338G.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                v(i10).f14534e = (int) j10;
                return;
            case 136:
                v(i10).f14526T = j10 == 1;
                return;
            case 155:
                this.f14461L = F(j10);
                return;
            case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                v(i10).f14519M = (int) j10;
                return;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                v(i10).f14541l = (int) j10;
                return;
            case SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE:
                i(i10);
                this.f14455F.a(F(j10));
                return;
            case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                v(i10).f14542m = (int) j10;
                return;
            case 215:
                v(i10).f14533d = (int) j10;
                return;
            case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                this.f14454E = F(j10);
                return;
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                this.f14467R = (int) j10;
                return;
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                if (this.f14457H) {
                    return;
                }
                i(i10);
                this.f14456G.a(j10);
                this.f14457H = true;
                return;
            case 251:
                this.f14468S = true;
                return;
            case 16871:
                v(i10).f14537h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw C2338G.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw C2338G.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw C2338G.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw C2338G.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw C2338G.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f14450A = j10 + this.f14498s;
                return;
            case 21432:
                int i11 = (int) j10;
                l(i10);
                if (i11 == 0) {
                    this.f14503x.f14551v = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f14503x.f14551v = 2;
                    return;
                } else if (i11 == 3) {
                    this.f14503x.f14551v = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f14503x.f14551v = 3;
                    return;
                }
            case 21680:
                v(i10).f14544o = (int) j10;
                return;
            case 21682:
                v(i10).f14546q = (int) j10;
                return;
            case 21690:
                v(i10).f14545p = (int) j10;
                return;
            case 21930:
                v(i10).f14525S = j10 == 1;
                return;
            case 21938:
                l(i10);
                c cVar = this.f14503x;
                cVar.f14552w = true;
                cVar.f14543n = (int) j10;
                return;
            case 21998:
                v(i10).f14536g = (int) j10;
                return;
            case 22186:
                v(i10).f14522P = j10;
                return;
            case 22203:
                v(i10).f14523Q = j10;
                return;
            case 25188:
                v(i10).f14520N = (int) j10;
                return;
            case 30114:
                this.f14469T = j10;
                return;
            case 30321:
                l(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f14503x.f14547r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f14503x.f14547r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f14503x.f14547r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f14503x.f14547r = 3;
                    return;
                }
            case 2352003:
                v(i10).f14535f = (int) j10;
                return;
            case 2807729:
                this.f14499t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        l(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f14503x.f14555z = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f14503x.f14555z = 1;
                            return;
                        }
                    case 21946:
                        l(i10);
                        int k10 = C2357k.k((int) j10);
                        if (k10 != -1) {
                            this.f14503x.f14554y = k10;
                            return;
                        }
                        return;
                    case 21947:
                        l(i10);
                        this.f14503x.f14552w = true;
                        int j11 = C2357k.j((int) j10);
                        if (j11 != -1) {
                            this.f14503x.f14553x = j11;
                            return;
                        }
                        return;
                    case 21948:
                        v(i10).f14507A = (int) j10;
                        return;
                    case 21949:
                        v(i10).f14508B = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public e(Z1.c cVar, int i10, s.a aVar) {
        this.f14498s = -1L;
        this.f14499t = -9223372036854775807L;
        this.f14500u = -9223372036854775807L;
        this.f14501v = -9223372036854775807L;
        this.f14452C = -1L;
        this.f14453D = -1L;
        this.f14454E = -9223372036854775807L;
        this.f14476a = cVar;
        cVar.b(new b());
        this.f14485f = aVar;
        this.f14482d = (i10 & 1) == 0;
        this.f14484e = (i10 & 2) == 0;
        this.f14478b = new g();
        this.f14480c = new SparseArray();
        this.f14488i = new e1.J(4);
        this.f14489j = new e1.J(ByteBuffer.allocate(4).putInt(-1).array());
        this.f14490k = new e1.J(4);
        this.f14486g = new e1.J(AbstractC4230h.NAL_START_CODE);
        this.f14487h = new e1.J(4);
        this.f14491l = new e1.J();
        this.f14492m = new e1.J();
        this.f14493n = new e1.J(8);
        this.f14494o = new e1.J();
        this.f14495p = new e1.J();
        this.blockSampleSizes = new int[1];
    }

    @Override // H1.InterfaceC1183p
    public final void release() {
    }
}
