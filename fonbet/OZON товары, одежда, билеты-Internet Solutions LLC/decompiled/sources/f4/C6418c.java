package f4;

import N3.C;
import N3.C3650a;
import N3.C3653d;
import N3.C3656g;
import N3.C3659j;
import N3.G;
import N3.H;
import N3.InterfaceC3665p;
import N3.M;
import N3.N;
import N3.q;
import N3.r;
import Ve.C4598rp;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.m;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import j3.C7266h;
import j3.C7267i;
import j3.C7270l;
import j3.C7272n;
import j3.u;
import j3.v;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k4.o;
import k4.p;
import m3.C8049B;
import m3.C8050C;
import m3.s;
import m3.t;
import n3.C8428a;
import n3.C8434g;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* renamed from: f4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6418c implements InterfaceC3665p {

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f62608f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f62609g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final byte[] f62610h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final byte[] f62611i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final UUID f62612j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final Map<String, Integer> f62613k0;

    /* renamed from: A, reason: collision with root package name */
    private long f62614A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f62615B;

    /* renamed from: C, reason: collision with root package name */
    private long f62616C;

    /* renamed from: D, reason: collision with root package name */
    private long f62617D;

    /* renamed from: E, reason: collision with root package name */
    private long f62618E;

    /* renamed from: F, reason: collision with root package name */
    private t f62619F;

    /* renamed from: G, reason: collision with root package name */
    private t f62620G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f62621H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f62622I;

    /* renamed from: J, reason: collision with root package name */
    private int f62623J;

    /* renamed from: K, reason: collision with root package name */
    private long f62624K;

    /* renamed from: L, reason: collision with root package name */
    private long f62625L;

    /* renamed from: M, reason: collision with root package name */
    private int f62626M;

    /* renamed from: N, reason: collision with root package name */
    private int f62627N;

    /* renamed from: O, reason: collision with root package name */
    private int[] f62628O;

    /* renamed from: P, reason: collision with root package name */
    private int f62629P;

    /* renamed from: Q, reason: collision with root package name */
    private int f62630Q;

    /* renamed from: R, reason: collision with root package name */
    private int f62631R;

    /* renamed from: S, reason: collision with root package name */
    private int f62632S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f62633T;

    /* renamed from: U, reason: collision with root package name */
    private long f62634U;

    /* renamed from: V, reason: collision with root package name */
    private int f62635V;

    /* renamed from: W, reason: collision with root package name */
    private int f62636W;

    /* renamed from: X, reason: collision with root package name */
    private int f62637X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f62638Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f62639Z;

    /* renamed from: a, reason: collision with root package name */
    private final C6416a f62640a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f62641a0;

    /* renamed from: b, reason: collision with root package name */
    private final C6420e f62642b;

    /* renamed from: b0, reason: collision with root package name */
    private int f62643b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<b> f62644c;

    /* renamed from: c0, reason: collision with root package name */
    private byte f62645c0;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f62646d;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f62647d0;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f62648e;

    /* renamed from: e0, reason: collision with root package name */
    private r f62649e0;

    /* renamed from: f, reason: collision with root package name */
    private final o.a f62650f;

    /* renamed from: g, reason: collision with root package name */
    private final C8050C f62651g;

    /* renamed from: h, reason: collision with root package name */
    private final C8050C f62652h;

    /* renamed from: i, reason: collision with root package name */
    private final C8050C f62653i;

    /* renamed from: j, reason: collision with root package name */
    private final C8050C f62654j;

    /* renamed from: k, reason: collision with root package name */
    private final C8050C f62655k;

    /* renamed from: l, reason: collision with root package name */
    private final C8050C f62656l;

    /* renamed from: m, reason: collision with root package name */
    private final C8050C f62657m;

    /* renamed from: n, reason: collision with root package name */
    private final C8050C f62658n;

    /* renamed from: o, reason: collision with root package name */
    private final C8050C f62659o;

    /* renamed from: p, reason: collision with root package name */
    private final C8050C f62660p;

    /* renamed from: q, reason: collision with root package name */
    private ByteBuffer f62661q;

    /* renamed from: r, reason: collision with root package name */
    private long f62662r;

    /* renamed from: s, reason: collision with root package name */
    private long f62663s;

    /* renamed from: t, reason: collision with root package name */
    private long f62664t;

    /* renamed from: u, reason: collision with root package name */
    private long f62665u;

    /* renamed from: v, reason: collision with root package name */
    private long f62666v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f62667w;

    /* renamed from: x, reason: collision with root package name */
    private b f62668x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f62669y;

    /* renamed from: z, reason: collision with root package name */
    private int f62670z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f4.c$a */
    final class a implements InterfaceC6417b {
        a() {
        }
    }

    /* renamed from: f4.c$b */
    /* loaded from: classes8.dex */
    protected static final class b {

        /* renamed from: P, reason: collision with root package name */
        public byte[] f62687P;

        /* renamed from: V, reason: collision with root package name */
        public N f62693V;

        /* renamed from: W, reason: collision with root package name */
        public boolean f62694W;

        /* renamed from: Z, reason: collision with root package name */
        public M f62697Z;

        /* renamed from: a, reason: collision with root package name */
        public boolean f62698a;

        /* renamed from: a0, reason: collision with root package name */
        public int f62699a0;

        /* renamed from: b, reason: collision with root package name */
        public String f62700b;

        /* renamed from: c, reason: collision with root package name */
        public String f62701c;

        /* renamed from: d, reason: collision with root package name */
        public int f62702d;

        /* renamed from: e, reason: collision with root package name */
        public int f62703e;

        /* renamed from: f, reason: collision with root package name */
        public int f62704f;

        /* renamed from: g, reason: collision with root package name */
        public int f62705g;

        /* renamed from: h, reason: collision with root package name */
        private int f62706h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f62707i;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f62708j;

        /* renamed from: k, reason: collision with root package name */
        public M.a f62709k;

        /* renamed from: l, reason: collision with root package name */
        public byte[] f62710l;

        /* renamed from: m, reason: collision with root package name */
        public C7270l f62711m;

        /* renamed from: n, reason: collision with root package name */
        public int f62712n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f62713o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f62714p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f62715q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f62716r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f62717s = 0;

        /* renamed from: t, reason: collision with root package name */
        public int f62718t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f62719u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public float f62720v = 0.0f;

        /* renamed from: w, reason: collision with root package name */
        public float f62721w = 0.0f;

        /* renamed from: x, reason: collision with root package name */
        public byte[] f62722x = null;

        /* renamed from: y, reason: collision with root package name */
        public int f62723y = -1;

        /* renamed from: z, reason: collision with root package name */
        public boolean f62724z = false;

        /* renamed from: A, reason: collision with root package name */
        public int f62672A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f62673B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f62674C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f62675D = 1000;

        /* renamed from: E, reason: collision with root package name */
        public int f62676E = m.e.DEFAULT_DRAG_ANIMATION_DURATION;

        /* renamed from: F, reason: collision with root package name */
        public float f62677F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f62678G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f62679H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f62680I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f62681J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f62682K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f62683L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f62684M = -1.0f;

        /* renamed from: N, reason: collision with root package name */
        public float f62685N = -1.0f;

        /* renamed from: O, reason: collision with root package name */
        public float f62686O = -1.0f;

        /* renamed from: Q, reason: collision with root package name */
        public int f62688Q = 1;

        /* renamed from: R, reason: collision with root package name */
        public int f62689R = -1;

        /* renamed from: S, reason: collision with root package name */
        public int f62690S = 8000;

        /* renamed from: T, reason: collision with root package name */
        public long f62691T = 0;

        /* renamed from: U, reason: collision with root package name */
        public long f62692U = 0;

        /* renamed from: X, reason: collision with root package name */
        public boolean f62695X = true;

        /* renamed from: Y, reason: collision with root package name */
        private String f62696Y = "eng";

        protected b() {
        }

        static void a(b bVar) {
            bVar.f62697Z.getClass();
        }

        static boolean e(b bVar, boolean z11) {
            return "A_OPUS".equals(bVar.f62701c) ? z11 : bVar.f62705g > 0;
        }

        private byte[] f(String str) throws v {
            byte[] bArr = this.f62710l;
            if (bArr != null) {
                return bArr;
            }
            throw v.a(null, "Missing CodecPrivate for codec " + str);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:271:0x0546, code lost:
        
            if (r1.y() == f4.C6418c.f62612j0.getLeastSignificantBits()) goto L282;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:117:0x05b8  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x059d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x05b6  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x05c5  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x07af  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x07c9  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x07cc  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x05d4  */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.RuntimeException] */
        /* JADX WARN: Type inference failed for: r1v24 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void g(r rVar, int i11) throws v {
            char c11;
            int i12;
            int i13;
            String str;
            List<byte[]> list;
            int i14;
            List<byte[]> list2;
            List<byte[]> list3;
            int i15;
            List<byte[]> list4;
            String str2;
            List<byte[]> list5;
            Pair pair;
            String str3;
            String str4;
            List<byte[]> list6;
            List<byte[]> list7;
            List<byte[]> list8;
            List<byte[]> list9;
            List<byte[]> list10;
            String str5;
            C7272n.a aVar;
            int i16;
            int i17;
            C7267i c7267i;
            byte[] bArr;
            int i18;
            C8428a a11;
            String str6 = this.f62701c;
            str6.getClass();
            String str7 = "video/x-unknown";
            String str8 = "audio/raw";
            byte b11 = 1;
            switch (str6.hashCode()) {
                case -2095576542:
                    if (str6.equals("V_MPEG4/ISO/AP")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -2095575984:
                    if (str6.equals("V_MPEG4/ISO/SP")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1985379776:
                    if (str6.equals("A_MS/ACM")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1784763192:
                    if (str6.equals("A_TRUEHD")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1730367663:
                    if (str6.equals("A_VORBIS")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1482641358:
                    if (str6.equals("A_MPEG/L2")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1482641357:
                    if (str6.equals("A_MPEG/L3")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1373388978:
                    if (str6.equals("V_MS/VFW/FOURCC")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -933872740:
                    if (str6.equals("S_DVBSUB")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -538363189:
                    if (str6.equals("V_MPEG4/ISO/ASP")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -538363109:
                    if (str6.equals("V_MPEG4/ISO/AVC")) {
                        c11 = '\n';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -425012669:
                    if (str6.equals("S_VOBSUB")) {
                        c11 = 11;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -356037306:
                    if (str6.equals("A_DTS/LOSSLESS")) {
                        c11 = '\f';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 62923557:
                    if (str6.equals("A_AAC")) {
                        c11 = '\r';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 62923603:
                    if (str6.equals("A_AC3")) {
                        c11 = 14;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 62927045:
                    if (str6.equals("A_DTS")) {
                        c11 = 15;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 82318131:
                    if (str6.equals("V_AV1")) {
                        c11 = 16;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 82338133:
                    if (str6.equals("V_VP8")) {
                        c11 = 17;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 82338134:
                    if (str6.equals("V_VP9")) {
                        c11 = 18;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 99146302:
                    if (str6.equals("S_HDMV/PGS")) {
                        c11 = 19;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 444813526:
                    if (str6.equals("V_THEORA")) {
                        c11 = 20;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 542569478:
                    if (str6.equals("A_DTS/EXPRESS")) {
                        c11 = 21;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 635596514:
                    if (str6.equals("A_PCM/FLOAT/IEEE")) {
                        c11 = 22;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 725948237:
                    if (str6.equals("A_PCM/INT/BIG")) {
                        c11 = 23;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 725957860:
                    if (str6.equals("A_PCM/INT/LIT")) {
                        c11 = 24;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 738597099:
                    if (str6.equals("S_TEXT/ASS")) {
                        c11 = 25;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 738614379:
                    if (str6.equals("S_TEXT/SSA")) {
                        c11 = 26;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 855502857:
                    if (str6.equals("V_MPEGH/ISO/HEVC")) {
                        c11 = 27;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1045209816:
                    if (str6.equals("S_TEXT/WEBVTT")) {
                        c11 = 28;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1422270023:
                    if (str6.equals("S_TEXT/UTF8")) {
                        c11 = 29;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1809237540:
                    if (str6.equals("V_MPEG2")) {
                        c11 = 30;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1950749482:
                    if (str6.equals("A_EAC3")) {
                        c11 = 31;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1950789798:
                    if (str6.equals("A_FLAC")) {
                        c11 = ' ';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1951062397:
                    if (str6.equals("A_OPUS")) {
                        c11 = '!';
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                case 1:
                case '\t':
                    i12 = 2;
                    i13 = 1;
                    byte[] bArr2 = this.f62710l;
                    List<byte[]> singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                    str8 = "video/mp4v-es";
                    str = null;
                    list = singletonList;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null && (a11 = C8428a.a(new C8050C(this.f62687P))) != null) {
                        str = a11.f76369a;
                        str8 = "video/dolby-vision";
                    }
                    str5 = str8;
                    int i19 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                        aVar.T(this.f62688Q);
                        aVar.z0(this.f62690S);
                        aVar.s0(i14);
                    } else if (u.l(str5)) {
                        if (this.f62717s == 0) {
                            int i21 = this.f62715q;
                            i16 = -1;
                            if (i21 == -1) {
                                i21 = this.f62712n;
                            }
                            this.f62715q = i21;
                            int i22 = this.f62716r;
                            if (i22 == -1) {
                                i22 = this.f62713o;
                            }
                            this.f62716r = i22;
                        } else {
                            i16 = -1;
                        }
                        float f7 = (this.f62715q == i16 || (i18 = this.f62716r) == i16) ? -1.0f : (this.f62713o * r2) / (this.f62712n * i18);
                        if (this.f62724z) {
                            if (this.f62677F == -1.0f || this.f62678G == -1.0f || this.f62679H == -1.0f || this.f62680I == -1.0f || this.f62681J == -1.0f || this.f62682K == -1.0f || this.f62683L == -1.0f || this.f62684M == -1.0f || this.f62685N == -1.0f || this.f62686O == -1.0f) {
                                i17 = 0;
                                bArr = null;
                            } else {
                                bArr = new byte[25];
                                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                i17 = 0;
                                order.put((byte) 0);
                                order.putShort((short) ((this.f62677F * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.f62678G * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.f62679H * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.f62680I * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.f62681J * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.f62682K * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.f62683L * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.f62684M * 50000.0f) + 0.5f));
                                order.putShort((short) (this.f62685N + 0.5f));
                                order.putShort((short) (this.f62686O + 0.5f));
                                order.putShort((short) this.f62675D);
                                order.putShort((short) this.f62676E);
                            }
                            C7267i.a aVar2 = new C7267i.a();
                            aVar2.d(this.f62672A);
                            aVar2.c(this.f62674C);
                            aVar2.e(this.f62673B);
                            aVar2.f(bArr);
                            aVar2.g(this.f62714p);
                            aVar2.b(this.f62714p);
                            c7267i = aVar2.a();
                        } else {
                            i17 = 0;
                            c7267i = null;
                        }
                        if (this.f62700b != null && C6418c.f62613k0.containsKey(this.f62700b)) {
                            i16 = ((Integer) C6418c.f62613k0.get(this.f62700b)).intValue();
                        }
                        if (this.f62718t == 0 && Float.compare(this.f62719u, 0.0f) == 0 && Float.compare(this.f62720v, 0.0f) == 0) {
                            if (Float.compare(this.f62721w, 0.0f) == 0) {
                                i16 = i17;
                            } else if (Float.compare(this.f62721w, 90.0f) == 0) {
                                i16 = 90;
                            } else if (Float.compare(this.f62721w, -180.0f) == 0 || Float.compare(this.f62721w, 180.0f) == 0) {
                                i16 = 180;
                            } else if (Float.compare(this.f62721w, -90.0f) == 0) {
                                i16 = 270;
                            }
                        }
                        aVar.F0(this.f62712n);
                        aVar.h0(this.f62713o);
                        aVar.u0(f7);
                        aVar.x0(i16);
                        aVar.v0(this.f62722x);
                        aVar.B0(this.f62723y);
                        aVar.V(c7267i);
                        i13 = i12;
                    } else {
                        if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
                            throw v.a(null, "Unexpected MIME type.");
                        }
                        i13 = 3;
                    }
                    if (this.f62700b != null && !C6418c.f62613k0.containsKey(this.f62700b)) {
                        aVar.l0(this.f62700b);
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11 = aVar.P();
                    M track = rVar.track(this.f62702d, i13);
                    this.f62697Z = track;
                    track.a(P11);
                    return;
                case 2:
                    i12 = 2;
                    C8050C c8050c = new C8050C(f(this.f62701c));
                    try {
                        int x11 = c8050c.x();
                        i13 = 1;
                        if (x11 != 1) {
                            if (x11 == 65534) {
                                c8050c.R(24);
                                if (c8050c.y() == C6418c.f62612j0.getMostSignificantBits()) {
                                    break;
                                }
                            }
                            s.f("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                            str8 = "audio/x-unknown";
                            str = null;
                            list = null;
                            i14 = -1;
                            list2 = list;
                            i15 = -1;
                            list4 = list2;
                            if (this.f62687P != null) {
                                str = a11.f76369a;
                                str8 = "video/dolby-vision";
                                break;
                            }
                            str5 = str8;
                            int i192 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                            aVar = new C7272n.a();
                            if (u.i(str5)) {
                            }
                            if (this.f62700b != null) {
                                aVar.l0(this.f62700b);
                                break;
                            }
                            aVar.i0(i11);
                            aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                            aVar.y0(str5);
                            aVar.o0(i15);
                            aVar.n0(this.f62696Y);
                            aVar.A0(i192);
                            aVar.k0(list4);
                            aVar.U(str);
                            aVar.c0(this.f62711m);
                            C7272n P112 = aVar.P();
                            M track2 = rVar.track(this.f62702d, i13);
                            this.f62697Z = track2;
                            track2.a(P112);
                            return;
                        }
                        int i23 = this.f62689R;
                        int i24 = m3.N.f74289a;
                        int C11 = m3.N.C(i23, ByteOrder.LITTLE_ENDIAN);
                        if (C11 != 0) {
                            i14 = C11;
                            str = null;
                            list2 = null;
                            i15 = -1;
                            list4 = list2;
                            if (this.f62687P != null) {
                            }
                            str5 = str8;
                            int i1922 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                            aVar = new C7272n.a();
                            if (u.i(str5)) {
                            }
                            if (this.f62700b != null) {
                            }
                            aVar.i0(i11);
                            aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                            aVar.y0(str5);
                            aVar.o0(i15);
                            aVar.n0(this.f62696Y);
                            aVar.A0(i1922);
                            aVar.k0(list4);
                            aVar.U(str);
                            aVar.c0(this.f62711m);
                            C7272n P1122 = aVar.P();
                            M track22 = rVar.track(this.f62702d, i13);
                            this.f62697Z = track22;
                            track22.a(P1122);
                            return;
                        }
                        s.f("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f62689R + ". Setting mimeType to audio/x-unknown");
                        str8 = "audio/x-unknown";
                        str = null;
                        list = null;
                        i14 = -1;
                        list2 = list;
                        i15 = -1;
                        list4 = list2;
                        if (this.f62687P != null) {
                        }
                        str5 = str8;
                        int i19222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                        aVar = new C7272n.a();
                        if (u.i(str5)) {
                        }
                        if (this.f62700b != null) {
                        }
                        aVar.i0(i11);
                        aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                        aVar.y0(str5);
                        aVar.o0(i15);
                        aVar.n0(this.f62696Y);
                        aVar.A0(i19222);
                        aVar.k0(list4);
                        aVar.U(str);
                        aVar.c0(this.f62711m);
                        C7272n P11222 = aVar.P();
                        M track222 = rVar.track(this.f62702d, i13);
                        this.f62697Z = track222;
                        track222.a(P11222);
                        return;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw v.a(null, "Error parsing MS/ACM codec private");
                    }
                case 3:
                    i12 = 2;
                    this.f62693V = new N();
                    str8 = "audio/true-hd";
                    str = null;
                    list3 = null;
                    i14 = -1;
                    i15 = -1;
                    list5 = list3;
                    i13 = 1;
                    list4 = list5;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222 = aVar.P();
                    M track2222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222;
                    track2222.a(P112222);
                    return;
                case 4:
                    byte[] f11 = f(this.f62701c);
                    try {
                        try {
                            if (f11[0] != 2) {
                                throw v.a(null, "Error parsing vorbis codec private");
                            }
                            int i25 = 0;
                            int i26 = 1;
                            while (true) {
                                int i27 = f11[i26] & 255;
                                if (i27 == 255) {
                                    i25 += 255;
                                    i26++;
                                } else {
                                    int i28 = i26 + 1;
                                    int i29 = i25 + i27;
                                    int i31 = 0;
                                    while (true) {
                                        try {
                                            int i32 = f11[i28] & 255;
                                            if (i32 != 255) {
                                                int i33 = i28 + 1;
                                                int i34 = i31 + i32;
                                                if (f11[i33] != 1) {
                                                    throw v.a(null, "Error parsing vorbis codec private");
                                                }
                                                byte[] bArr3 = new byte[i29];
                                                System.arraycopy(f11, i33, bArr3, 0, i29);
                                                int i35 = i33 + i29;
                                                if (f11[i35] != 3) {
                                                    throw v.a(null, "Error parsing vorbis codec private");
                                                }
                                                int i36 = i35 + i34;
                                                if (f11[i36] != 5) {
                                                    throw v.a(null, "Error parsing vorbis codec private");
                                                }
                                                byte[] bArr4 = new byte[f11.length - i36];
                                                System.arraycopy(f11, i36, bArr4, 0, f11.length - i36);
                                                i12 = 2;
                                                ArrayList arrayList = new ArrayList(2);
                                                arrayList.add(bArr3);
                                                arrayList.add(bArr4);
                                                str8 = "audio/vorbis";
                                                i14 = -1;
                                                i13 = 1;
                                                i15 = 8192;
                                                list4 = arrayList;
                                                str = null;
                                                if (this.f62687P != null) {
                                                }
                                                str5 = str8;
                                                int i1922222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                                                aVar = new C7272n.a();
                                                if (u.i(str5)) {
                                                }
                                                if (this.f62700b != null) {
                                                }
                                                aVar.i0(i11);
                                                aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                                                aVar.y0(str5);
                                                aVar.o0(i15);
                                                aVar.n0(this.f62696Y);
                                                aVar.A0(i1922222);
                                                aVar.k0(list4);
                                                aVar.U(str);
                                                aVar.c0(this.f62711m);
                                                C7272n P1122222 = aVar.P();
                                                M track22222 = rVar.track(this.f62702d, i13);
                                                this.f62697Z = track22222;
                                                track22222.a(P1122222);
                                                return;
                                            }
                                            i31 += 255;
                                            i28++;
                                        } catch (ArrayIndexOutOfBoundsException unused2) {
                                            f11 = 0;
                                            throw v.a(f11, "Error parsing vorbis codec private");
                                        }
                                    }
                                }
                            }
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                        }
                    } catch (ArrayIndexOutOfBoundsException unused4) {
                        f11 = 0;
                    }
                    break;
                case 5:
                    str2 = "audio/mpeg-L2";
                    str8 = str2;
                    str = null;
                    list5 = null;
                    i12 = 2;
                    i14 = -1;
                    i15 = 4096;
                    i13 = 1;
                    list4 = list5;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i19222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11222222 = aVar.P();
                    M track222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track222222;
                    track222222.a(P11222222);
                    return;
                case 6:
                    str2 = "audio/mpeg";
                    str8 = str2;
                    str = null;
                    list5 = null;
                    i12 = 2;
                    i14 = -1;
                    i15 = 4096;
                    i13 = 1;
                    list4 = list5;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222222 = aVar.P();
                    M track2222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222222;
                    track2222222.a(P112222222);
                    return;
                case 7:
                    C8050C c8050c2 = new C8050C(f(this.f62701c));
                    try {
                        c8050c2.S(16);
                        long v11 = c8050c2.v();
                        if (v11 == 1482049860) {
                            pair = new Pair("video/divx", null);
                        } else if (v11 == 859189832) {
                            pair = new Pair("video/3gpp", null);
                        } else {
                            if (v11 == 826496599) {
                                int f12 = c8050c2.f() + 20;
                                byte[] e11 = c8050c2.e();
                                while (f12 < e11.length - 4) {
                                    if (e11[f12] == 0 && e11[f12 + 1] == 0 && e11[f12 + 2] == b11) {
                                        if (e11[f12 + 3] == 15) {
                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(e11, f12, e11.length)));
                                        }
                                    }
                                    f12++;
                                    b11 = 1;
                                }
                                throw v.a(null, "Failed to find FourCC VC1 initialization data");
                            }
                            s.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                            pair = new Pair("video/x-unknown", null);
                        }
                        String str9 = (String) pair.first;
                        List<byte[]> list11 = (List) pair.second;
                        str8 = str9;
                        str = null;
                        i12 = 2;
                        list3 = list11;
                        i14 = -1;
                        i15 = -1;
                        list5 = list3;
                        i13 = 1;
                        list4 = list5;
                        if (this.f62687P != null) {
                        }
                        str5 = str8;
                        int i1922222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                        aVar = new C7272n.a();
                        if (u.i(str5)) {
                        }
                        if (this.f62700b != null) {
                        }
                        aVar.i0(i11);
                        aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                        aVar.y0(str5);
                        aVar.o0(i15);
                        aVar.n0(this.f62696Y);
                        aVar.A0(i1922222222);
                        aVar.k0(list4);
                        aVar.U(str);
                        aVar.c0(this.f62711m);
                        C7272n P1122222222 = aVar.P();
                        M track22222222 = rVar.track(this.f62702d, i13);
                        this.f62697Z = track22222222;
                        track22222222.a(P1122222222);
                        return;
                    } catch (ArrayIndexOutOfBoundsException unused5) {
                        throw v.a(null, "Error parsing FourCC private data");
                    }
                case '\b':
                    byte[] bArr5 = new byte[4];
                    System.arraycopy(f(this.f62701c), 0, bArr5, 0, 4);
                    str8 = "application/dvbsubs";
                    list9 = AbstractC5880y.B(bArr5);
                    str = null;
                    list8 = list9;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i19222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11222222222 = aVar.P();
                    M track222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track222222222;
                    track222222222.a(P11222222222);
                    return;
                case '\n':
                    C3653d a12 = C3653d.a(new C8050C(f(this.f62701c)));
                    this.f62699a0 = a12.f18569b;
                    ArrayList arrayList2 = a12.f18568a;
                    str3 = "video/avc";
                    str = a12.f18579l;
                    list7 = arrayList2;
                    str8 = str3;
                    list8 = list7;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222222222 = aVar.P();
                    M track2222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222222222;
                    track2222222222.a(P112222222222);
                    return;
                case 11:
                    str8 = "application/vobsub";
                    list9 = AbstractC5880y.B(f(this.f62701c));
                    str = null;
                    list8 = list9;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i1922222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i1922222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P1122222222222 = aVar.P();
                    M track22222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track22222222222;
                    track22222222222.a(P1122222222222);
                    return;
                case '\f':
                    str7 = "audio/vnd.dts.hd";
                    str8 = str7;
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i19222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11222222222222 = aVar.P();
                    M track222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track222222222222;
                    track222222222222.a(P11222222222222);
                    return;
                case '\r':
                    List<byte[]> singletonList2 = Collections.singletonList(f(this.f62701c));
                    byte[] bArr6 = this.f62710l;
                    C3650a.C0354a b12 = C3650a.b(new C8049B(bArr6.length, bArr6), false);
                    this.f62690S = b12.f18542a;
                    this.f62688Q = b12.f18543b;
                    str3 = "audio/mp4a-latm";
                    str = b12.f18544c;
                    list7 = singletonList2;
                    str8 = str3;
                    list8 = list7;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222222222222 = aVar.P();
                    M track2222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222222222222;
                    track2222222222222.a(P112222222222222);
                    return;
                case 14:
                    str7 = "audio/ac3";
                    str8 = str7;
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i1922222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i1922222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P1122222222222222 = aVar.P();
                    M track22222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track22222222222222;
                    track22222222222222.a(P1122222222222222);
                    return;
                case 15:
                case 21:
                    str7 = "audio/vnd.dts";
                    str8 = str7;
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i19222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11222222222222222 = aVar.P();
                    M track222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track222222222222222;
                    track222222222222222.a(P11222222222222222);
                    return;
                case 16:
                    byte[] bArr7 = this.f62710l;
                    str4 = "video/av01";
                    list10 = bArr7 == null ? null : AbstractC5880y.B(bArr7);
                    str8 = str4;
                    list9 = list10;
                    str = null;
                    list8 = list9;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222222222222222 = aVar.P();
                    M track2222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222222222222222;
                    track2222222222222222.a(P112222222222222222);
                    return;
                case 17:
                    str7 = "video/x-vnd.on2.vp8";
                    str8 = str7;
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i1922222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i1922222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P1122222222222222222 = aVar.P();
                    M track22222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track22222222222222222;
                    track22222222222222222.a(P1122222222222222222);
                    return;
                case 18:
                    byte[] bArr8 = this.f62710l;
                    str4 = "video/x-vnd.on2.vp9";
                    list10 = bArr8 == null ? null : AbstractC5880y.B(bArr8);
                    str8 = str4;
                    list9 = list10;
                    str = null;
                    list8 = list9;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i19222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11222222222222222222 = aVar.P();
                    M track222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track222222222222222222;
                    track222222222222222222.a(P11222222222222222222);
                    return;
                case 19:
                    str8 = "application/pgs";
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222222222222222222 = aVar.P();
                    M track2222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222222222222222222;
                    track2222222222222222222.a(P112222222222222222222);
                    return;
                case 20:
                    str8 = str7;
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i1922222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i1922222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P1122222222222222222222 = aVar.P();
                    M track22222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track22222222222222222222;
                    track22222222222222222222.a(P1122222222222222222222);
                    return;
                case 22:
                    if (this.f62689R == 32) {
                        str = null;
                        list2 = null;
                        i12 = 2;
                        i13 = 1;
                        i14 = 4;
                        i15 = -1;
                        list4 = list2;
                        if (this.f62687P != null) {
                        }
                        str5 = str8;
                        int i19222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                        aVar = new C7272n.a();
                        if (u.i(str5)) {
                        }
                        if (this.f62700b != null) {
                        }
                        aVar.i0(i11);
                        aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                        aVar.y0(str5);
                        aVar.o0(i15);
                        aVar.n0(this.f62696Y);
                        aVar.A0(i19222222222222222222222);
                        aVar.k0(list4);
                        aVar.U(str);
                        aVar.c0(this.f62711m);
                        C7272n P11222222222222222222222 = aVar.P();
                        M track222222222222222222222 = rVar.track(this.f62702d, i13);
                        this.f62697Z = track222222222222222222222;
                        track222222222222222222222.a(P11222222222222222222222);
                        return;
                    }
                    s.f("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.f62689R + ". Setting mimeType to audio/x-unknown");
                    str = null;
                    list6 = null;
                    i12 = 2;
                    str8 = "audio/x-unknown";
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222222222222222222222 = aVar.P();
                    M track2222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222222222222222222222;
                    track2222222222222222222222.a(P112222222222222222222222);
                    return;
                case 23:
                    int i37 = this.f62689R;
                    if (i37 == 8) {
                        i14 = 3;
                    } else if (i37 == 16) {
                        i14 = 268435456;
                    } else if (i37 == 24) {
                        i14 = 1342177280;
                    } else {
                        if (i37 != 32) {
                            s.f("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.f62689R + ". Setting mimeType to audio/x-unknown");
                            str = null;
                            list6 = null;
                            i12 = 2;
                            str8 = "audio/x-unknown";
                            i13 = 1;
                            list = list6;
                            i14 = -1;
                            list2 = list;
                            i15 = -1;
                            list4 = list2;
                            if (this.f62687P != null) {
                            }
                            str5 = str8;
                            int i1922222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                            aVar = new C7272n.a();
                            if (u.i(str5)) {
                            }
                            if (this.f62700b != null) {
                            }
                            aVar.i0(i11);
                            aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                            aVar.y0(str5);
                            aVar.o0(i15);
                            aVar.n0(this.f62696Y);
                            aVar.A0(i1922222222222222222222222);
                            aVar.k0(list4);
                            aVar.U(str);
                            aVar.c0(this.f62711m);
                            C7272n P1122222222222222222222222 = aVar.P();
                            M track22222222222222222222222 = rVar.track(this.f62702d, i13);
                            this.f62697Z = track22222222222222222222222;
                            track22222222222222222222222.a(P1122222222222222222222222);
                            return;
                        }
                        i14 = 1610612736;
                    }
                    str = null;
                    list2 = null;
                    i12 = 2;
                    i13 = 1;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i19222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11222222222222222222222222 = aVar.P();
                    M track222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track222222222222222222222222;
                    track222222222222222222222222.a(P11222222222222222222222222);
                    return;
                case 24:
                    int i38 = this.f62689R;
                    int i39 = m3.N.f74289a;
                    int C12 = m3.N.C(i38, ByteOrder.LITTLE_ENDIAN);
                    if (C12 != 0) {
                        i14 = C12;
                        str = null;
                        list2 = null;
                        i12 = 2;
                        i13 = 1;
                        i15 = -1;
                        list4 = list2;
                        if (this.f62687P != null) {
                        }
                        str5 = str8;
                        int i192222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                        aVar = new C7272n.a();
                        if (u.i(str5)) {
                        }
                        if (this.f62700b != null) {
                        }
                        aVar.i0(i11);
                        aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                        aVar.y0(str5);
                        aVar.o0(i15);
                        aVar.n0(this.f62696Y);
                        aVar.A0(i192222222222222222222222222);
                        aVar.k0(list4);
                        aVar.U(str);
                        aVar.c0(this.f62711m);
                        C7272n P112222222222222222222222222 = aVar.P();
                        M track2222222222222222222222222 = rVar.track(this.f62702d, i13);
                        this.f62697Z = track2222222222222222222222222;
                        track2222222222222222222222222.a(P112222222222222222222222222);
                        return;
                    }
                    s.f("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.f62689R + ". Setting mimeType to audio/x-unknown");
                    str = null;
                    list6 = null;
                    i12 = 2;
                    str8 = "audio/x-unknown";
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i1922222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i1922222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P1122222222222222222222222222 = aVar.P();
                    M track22222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track22222222222222222222222222;
                    track22222222222222222222222222.a(P1122222222222222222222222222);
                    return;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    str = null;
                    str8 = "text/x-ssa";
                    list8 = AbstractC5880y.C(C6418c.f62609g0, f(this.f62701c));
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i19222222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19222222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11222222222222222222222222222 = aVar.P();
                    M track222222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track222222222222222222222222222;
                    track222222222222222222222222222.a(P11222222222222222222222222222);
                    return;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    C a13 = C.a(new C8050C(f(this.f62701c)));
                    this.f62699a0 = a13.f18469b;
                    str3 = "video/hevc";
                    List<byte[]> list12 = a13.f18468a;
                    str = a13.f18481n;
                    list7 = list12;
                    str8 = str3;
                    list8 = list7;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222222222222222222222222222 = aVar.P();
                    M track2222222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222222222222222222222222222;
                    track2222222222222222222222222222.a(P112222222222222222222222222222);
                    return;
                case 28:
                    str8 = "text/vtt";
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i1922222222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i1922222222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P1122222222222222222222222222222 = aVar.P();
                    M track22222222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track22222222222222222222222222222;
                    track22222222222222222222222222222.a(P1122222222222222222222222222222);
                    return;
                case 29:
                    str8 = "application/x-subrip";
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i19222222222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19222222222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11222222222222222222222222222222 = aVar.P();
                    M track222222222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track222222222222222222222222222222;
                    track222222222222222222222222222222.a(P11222222222222222222222222222222);
                    return;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    str7 = "video/mpeg2";
                    str8 = str7;
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222222222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222222222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222222222222222222222222222222 = aVar.P();
                    M track2222222222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222222222222222222222222222222;
                    track2222222222222222222222222222222.a(P112222222222222222222222222222222);
                    return;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str7 = "audio/eac3";
                    str8 = str7;
                    str = null;
                    list8 = null;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i1922222222222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i1922222222222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P1122222222222222222222222222222222 = aVar.P();
                    M track22222222222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track22222222222222222222222222222222;
                    track22222222222222222222222222222222.a(P1122222222222222222222222222222222);
                    return;
                case ' ':
                    str4 = "audio/flac";
                    list10 = Collections.singletonList(f(this.f62701c));
                    str8 = str4;
                    list9 = list10;
                    str = null;
                    list8 = list9;
                    i12 = 2;
                    list6 = list8;
                    i13 = 1;
                    list = list6;
                    i14 = -1;
                    list2 = list;
                    i15 = -1;
                    list4 = list2;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i19222222222222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i19222222222222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P11222222222222222222222222222222222 = aVar.P();
                    M track222222222222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track222222222222222222222222222222222;
                    track222222222222222222222222222222222.a(P11222222222222222222222222222222222);
                    return;
                case '!':
                    ArrayList arrayList3 = new ArrayList(3);
                    arrayList3.add(f(this.f62701c));
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    arrayList3.add(allocate.order(byteOrder).putLong(this.f62691T).array());
                    arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f62692U).array());
                    str8 = "audio/opus";
                    i12 = 2;
                    i13 = 1;
                    i14 = -1;
                    i15 = 5760;
                    str = null;
                    list4 = arrayList3;
                    if (this.f62687P != null) {
                    }
                    str5 = str8;
                    int i192222222222222222222222222222222222 = (this.f62694W ? i12 : 0) | (this.f62695X ? 1 : 0);
                    aVar = new C7272n.a();
                    if (u.i(str5)) {
                    }
                    if (this.f62700b != null) {
                    }
                    aVar.i0(i11);
                    aVar.W(this.f62698a ? "video/webm" : "video/x-matroska");
                    aVar.y0(str5);
                    aVar.o0(i15);
                    aVar.n0(this.f62696Y);
                    aVar.A0(i192222222222222222222222222222222222);
                    aVar.k0(list4);
                    aVar.U(str);
                    aVar.c0(this.f62711m);
                    C7272n P112222222222222222222222222222222222 = aVar.P();
                    M track2222222222222222222222222222222222 = rVar.track(this.f62702d, i13);
                    this.f62697Z = track2222222222222222222222222222222222;
                    track2222222222222222222222222222222222.a(P112222222222222222222222222222222222);
                    return;
                default:
                    throw v.a(null, "Unrecognized codec identifier.");
            }
        }

        public final void h() {
            N n11 = this.f62693V;
            if (n11 != null) {
                n11.a(this.f62697Z, this.f62709k);
            }
        }

        public final void i() {
            N n11 = this.f62693V;
            if (n11 != null) {
                n11.b();
            }
        }
    }

    static {
        int i11 = m3.N.f74289a;
        f62609g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f62610h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f62611i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f62612j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        C4598rp.e(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        C4598rp.e(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f62613k0 = Collections.unmodifiableMap(hashMap);
    }

    public C6418c(o.a aVar, int i11) {
        C6416a c6416a = new C6416a();
        this.f62663s = -1L;
        this.f62664t = -9223372036854775807L;
        this.f62665u = -9223372036854775807L;
        this.f62666v = -9223372036854775807L;
        this.f62616C = -1L;
        this.f62617D = -1L;
        this.f62618E = -9223372036854775807L;
        this.f62640a = c6416a;
        c6416a.a(new a());
        this.f62650f = aVar;
        this.f62646d = (i11 & 1) == 0;
        this.f62648e = (i11 & 2) == 0;
        this.f62642b = new C6420e();
        this.f62644c = new SparseArray<>();
        this.f62653i = new C8050C(4);
        this.f62654j = new C8050C(ByteBuffer.allocate(4).putInt(-1).array());
        this.f62655k = new C8050C(4);
        this.f62651g = new C8050C(C8434g.f76385a);
        this.f62652h = new C8050C(4);
        this.f62656l = new C8050C();
        this.f62657m = new C8050C();
        this.f62658n = new C8050C(8);
        this.f62659o = new C8050C();
        this.f62660p = new C8050C();
        this.f62628O = new int[1];
    }

    private void j(int i11) throws v {
        if (this.f62619F == null || this.f62620G == null) {
            throw v.a(null, "Element " + i11 + " must be in a Cues");
        }
    }

    private void k(int i11) throws v {
        if (this.f62668x != null) {
            return;
        }
        throw v.a(null, "Element " + i11 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m(b bVar, long j11, int i11, int i12, int i13) {
        boolean z11;
        byte[] p11;
        int i14;
        int i15;
        N n11 = bVar.f62693V;
        if (n11 != null) {
            n11.c(bVar.f62697Z, j11, i11, i12, i13, bVar.f62709k);
            z11 = true;
        } else {
            z11 = true;
            if ("S_TEXT/UTF8".equals(bVar.f62701c) || "S_TEXT/ASS".equals(bVar.f62701c) || "S_TEXT/SSA".equals(bVar.f62701c) || "S_TEXT/WEBVTT".equals(bVar.f62701c)) {
                if (this.f62627N > 1) {
                    s.f("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.f62625L;
                    if (j12 == -9223372036854775807L) {
                        s.f("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = bVar.f62701c;
                        C8050C c8050c = this.f62657m;
                        byte[] e11 = c8050c.e();
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                p11 = p("%01d:%02d:%02d:%02d", j12, 10000L);
                                i14 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                p11 = p("%02d:%02d:%02d.%03d", j12, 1000L);
                                i14 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                p11 = p("%02d:%02d:%02d,%03d", j12, 1000L);
                                i14 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(p11, 0, e11, i14, p11.length);
                        int f7 = c8050c.f();
                        while (true) {
                            if (f7 < c8050c.i()) {
                                if (c8050c.e()[f7] == 0) {
                                    c8050c.Q(f7);
                                } else {
                                    f7++;
                                }
                            }
                        }
                        bVar.f62697Z.e(c8050c.i(), c8050c);
                        i15 = c8050c.i() + i12;
                        if ((i11 & 268435456) != 0) {
                            int i16 = this.f62627N;
                            C8050C c8050c2 = this.f62660p;
                            if (i16 > 1) {
                                c8050c2.O(0);
                            } else {
                                int i17 = c8050c2.i();
                                bVar.f62697Z.f(c8050c2, i17, 2);
                                i15 += i17;
                            }
                        }
                        bVar.f62697Z.b(j11, i11, i15, i13, bVar.f62709k);
                    }
                }
            }
            i15 = i12;
            if ((i11 & 268435456) != 0) {
            }
            bVar.f62697Z.b(j11, i11, i15, i13, bVar.f62709k);
        }
        this.f62622I = z11;
    }

    private static byte[] p(String str, long j11, long j12) {
        G10.a.c(j11 != -9223372036854775807L);
        int i11 = (int) (j11 / 3600000000L);
        long j13 = j11 - (i11 * 3600000000L);
        int i12 = (int) (j13 / 60000000);
        long j14 = j13 - (i12 * 60000000);
        int i13 = (int) (j14 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j14 - (i13 * 1000000)) / j12)));
        int i14 = m3.N.f74289a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private void r(C3659j c3659j, int i11) throws IOException {
        C8050C c8050c = this.f62653i;
        if (c8050c.i() >= i11) {
            return;
        }
        if (c8050c.b() < i11) {
            c8050c.d(Math.max(c8050c.b() * 2, i11));
        }
        c3659j.b(c8050c.e(), c8050c.i(), i11 - c8050c.i(), false);
        c8050c.Q(i11);
    }

    private void s() {
        this.f62635V = 0;
        this.f62636W = 0;
        this.f62637X = 0;
        this.f62638Y = false;
        this.f62639Z = false;
        this.f62641a0 = false;
        this.f62643b0 = 0;
        this.f62645c0 = (byte) 0;
        this.f62647d0 = false;
        this.f62656l.O(0);
    }

    private long t(long j11) throws v {
        long j12 = this.f62664t;
        if (j12 == -9223372036854775807L) {
            throw v.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i11 = m3.N.f74289a;
        return m3.N.Z(j11, j12, 1000L, RoundingMode.DOWN);
    }

    private int w(C3659j c3659j, b bVar, int i11, boolean z11) throws IOException {
        int d11;
        int d12;
        int i12;
        if ("S_TEXT/UTF8".equals(bVar.f62701c)) {
            x(c3659j, f62608f0, i11);
            int i13 = this.f62636W;
            s();
            return i13;
        }
        if ("S_TEXT/ASS".equals(bVar.f62701c) || "S_TEXT/SSA".equals(bVar.f62701c)) {
            x(c3659j, f62610h0, i11);
            int i14 = this.f62636W;
            s();
            return i14;
        }
        if ("S_TEXT/WEBVTT".equals(bVar.f62701c)) {
            x(c3659j, f62611i0, i11);
            int i15 = this.f62636W;
            s();
            return i15;
        }
        M m11 = bVar.f62697Z;
        boolean z12 = this.f62638Y;
        C8050C c8050c = this.f62656l;
        if (!z12) {
            boolean z13 = bVar.f62707i;
            C8050C c8050c2 = this.f62653i;
            if (z13) {
                this.f62631R &= -1073741825;
                boolean z14 = this.f62639Z;
                int i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
                if (!z14) {
                    c3659j.b(c8050c2.e(), 0, 1, false);
                    this.f62635V++;
                    if ((c8050c2.e()[0] & 128) == 128) {
                        throw v.a(null, "Extension bit is set in signal byte");
                    }
                    this.f62645c0 = c8050c2.e()[0];
                    this.f62639Z = true;
                }
                byte b11 = this.f62645c0;
                if ((b11 & 1) == 1) {
                    boolean z15 = (b11 & 2) == 2;
                    this.f62631R |= 1073741824;
                    if (!this.f62647d0) {
                        C8050C c8050c3 = this.f62658n;
                        c3659j.b(c8050c3.e(), 0, 8, false);
                        this.f62635V += 8;
                        this.f62647d0 = true;
                        byte[] e11 = c8050c2.e();
                        if (!z15) {
                            i16 = 0;
                        }
                        e11[0] = (byte) (i16 | 8);
                        c8050c2.R(0);
                        m11.f(c8050c2, 1, 1);
                        this.f62636W++;
                        c8050c3.R(0);
                        m11.f(c8050c3, 8, 1);
                        this.f62636W += 8;
                    }
                    if (z15) {
                        if (!this.f62641a0) {
                            c3659j.b(c8050c2.e(), 0, 1, false);
                            this.f62635V++;
                            c8050c2.R(0);
                            this.f62643b0 = c8050c2.E();
                            this.f62641a0 = true;
                        }
                        int i17 = this.f62643b0 * 4;
                        c8050c2.O(i17);
                        c3659j.b(c8050c2.e(), 0, i17, false);
                        this.f62635V += i17;
                        short s11 = (short) ((this.f62643b0 / 2) + 1);
                        int i18 = (s11 * 6) + 2;
                        ByteBuffer byteBuffer = this.f62661q;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f62661q = ByteBuffer.allocate(i18);
                        }
                        this.f62661q.position(0);
                        this.f62661q.putShort(s11);
                        int i19 = 0;
                        int i21 = 0;
                        while (true) {
                            i12 = this.f62643b0;
                            if (i19 >= i12) {
                                break;
                            }
                            int I11 = c8050c2.I();
                            if (i19 % 2 == 0) {
                                this.f62661q.putShort((short) (I11 - i21));
                            } else {
                                this.f62661q.putInt(I11 - i21);
                            }
                            i19++;
                            i21 = I11;
                        }
                        int i22 = (i11 - this.f62635V) - i21;
                        if (i12 % 2 == 1) {
                            this.f62661q.putInt(i22);
                        } else {
                            this.f62661q.putShort((short) i22);
                            this.f62661q.putInt(0);
                        }
                        byte[] array = this.f62661q.array();
                        C8050C c8050c4 = this.f62659o;
                        c8050c4.P(i18, array);
                        m11.f(c8050c4, i18, 1);
                        this.f62636W += i18;
                    }
                }
            } else {
                byte[] bArr = bVar.f62708j;
                if (bArr != null) {
                    c8050c.P(bArr.length, bArr);
                }
            }
            if (b.e(bVar, z11)) {
                this.f62631R |= 268435456;
                this.f62660p.O(0);
                int i23 = (c8050c.i() + i11) - this.f62635V;
                c8050c2.O(4);
                c8050c2.e()[0] = (byte) ((i23 >> 24) & 255);
                c8050c2.e()[1] = (byte) ((i23 >> 16) & 255);
                c8050c2.e()[2] = (byte) ((i23 >> 8) & 255);
                c8050c2.e()[3] = (byte) (i23 & 255);
                m11.f(c8050c2, 4, 2);
                this.f62636W += 4;
            }
            this.f62638Y = true;
        }
        int i24 = c8050c.i() + i11;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f62701c) && !"V_MPEGH/ISO/HEVC".equals(bVar.f62701c)) {
            if (bVar.f62693V != null) {
                G10.a.h(c8050c.i() == 0);
                bVar.f62693V.d(c3659j);
            }
            while (true) {
                int i25 = this.f62635V;
                if (i25 >= i24) {
                    break;
                }
                int i26 = i24 - i25;
                int a11 = c8050c.a();
                if (a11 > 0) {
                    d12 = Math.min(i26, a11);
                    m11.e(d12, c8050c);
                } else {
                    d12 = m11.d(c3659j, i26, false);
                }
                this.f62635V += d12;
                this.f62636W += d12;
            }
        } else {
            C8050C c8050c5 = this.f62652h;
            byte[] e12 = c8050c5.e();
            e12[0] = 0;
            e12[1] = 0;
            e12[2] = 0;
            int i27 = bVar.f62699a0;
            int i28 = 4 - i27;
            while (this.f62635V < i24) {
                int i29 = this.f62637X;
                if (i29 == 0) {
                    int min = Math.min(i27, c8050c.a());
                    c3659j.b(e12, i28 + min, i27 - min, false);
                    if (min > 0) {
                        c8050c.n(i28, min, e12);
                    }
                    this.f62635V += i27;
                    c8050c5.R(0);
                    this.f62637X = c8050c5.I();
                    C8050C c8050c6 = this.f62651g;
                    c8050c6.R(0);
                    m11.e(4, c8050c6);
                    this.f62636W += 4;
                } else {
                    int a12 = c8050c.a();
                    if (a12 > 0) {
                        d11 = Math.min(i29, a12);
                        m11.e(d11, c8050c);
                    } else {
                        d11 = m11.d(c3659j, i29, false);
                    }
                    this.f62635V += d11;
                    this.f62636W += d11;
                    this.f62637X -= d11;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f62701c)) {
            C8050C c8050c7 = this.f62654j;
            c8050c7.R(0);
            m11.e(4, c8050c7);
            this.f62636W += 4;
        }
        int i31 = this.f62636W;
        s();
        return i31;
    }

    private void x(C3659j c3659j, byte[] bArr, int i11) throws IOException {
        int length = bArr.length + i11;
        C8050C c8050c = this.f62657m;
        if (c8050c.b() < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i11);
            c8050c.P(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, c8050c.e(), 0, bArr.length);
        }
        c3659j.b(c8050c.e(), bArr.length, i11, false);
        c8050c.R(0);
        c8050c.Q(length);
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f62618E = -9223372036854775807L;
        int i11 = 0;
        this.f62623J = 0;
        this.f62640a.d();
        this.f62642b.e();
        s();
        while (true) {
            SparseArray<b> sparseArray = this.f62644c;
            if (i11 >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i11).i();
            i11++;
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        if (this.f62648e) {
            rVar = new p(rVar, this.f62650f);
        }
        this.f62649e0 = rVar;
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        return new C6419d().b((C3659j) qVar);
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        int i11 = 0;
        this.f62622I = false;
        boolean z11 = true;
        while (z11 && !this.f62622I) {
            C3659j c3659j = (C3659j) qVar;
            boolean b11 = this.f62640a.b(c3659j);
            if (b11) {
                long position = c3659j.getPosition();
                if (this.f62615B) {
                    this.f62617D = position;
                    g10.f18501a = this.f62616C;
                    this.f62615B = false;
                    return 1;
                }
                if (this.f62669y) {
                    long j11 = this.f62617D;
                    if (j11 != -1) {
                        g10.f18501a = j11;
                        this.f62617D = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
            z11 = b11;
        }
        if (z11) {
            return 0;
        }
        while (true) {
            SparseArray<b> sparseArray = this.f62644c;
            if (i11 >= sparseArray.size()) {
                return -1;
            }
            b valueAt = sparseArray.valueAt(i11);
            b.a(valueAt);
            valueAt.h();
            i11++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0285, code lost:
    
        throw j3.v.a(null, "EBML lacing sample size out of range.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void l(int i11, int i12, C3659j c3659j) throws IOException {
        int i13;
        int i14;
        int i15;
        C8050C c8050c;
        int i16;
        int i17;
        int i18;
        int i19;
        C8050C c8050c2;
        long j11;
        int i21;
        int i22;
        int i23;
        SparseArray<b> sparseArray = this.f62644c;
        int i24 = 1;
        int i25 = 0;
        if (i11 != 161 && i11 != 163) {
            if (i11 == 165) {
                if (this.f62623J != 2) {
                    return;
                }
                b bVar = sparseArray.get(this.f62629P);
                if (this.f62632S != 4 || !"V_VP9".equals(bVar.f62701c)) {
                    c3659j.m(i12, false);
                    return;
                }
                C8050C c8050c3 = this.f62660p;
                c8050c3.O(i12);
                c3659j.b(c8050c3.e(), 0, i12, false);
                return;
            }
            if (i11 == 16877) {
                k(i11);
                b bVar2 = this.f62668x;
                if (bVar2.f62706h != 1685485123 && bVar2.f62706h != 1685480259) {
                    c3659j.m(i12, false);
                    return;
                }
                byte[] bArr = new byte[i12];
                bVar2.f62687P = bArr;
                c3659j.b(bArr, 0, i12, false);
                return;
            }
            if (i11 == 16981) {
                k(i11);
                byte[] bArr2 = new byte[i12];
                this.f62668x.f62708j = bArr2;
                c3659j.b(bArr2, 0, i12, false);
                return;
            }
            if (i11 == 18402) {
                byte[] bArr3 = new byte[i12];
                c3659j.b(bArr3, 0, i12, false);
                k(i11);
                this.f62668x.f62709k = new M.a(1, bArr3, 0, 0);
                return;
            }
            if (i11 == 21419) {
                C8050C c8050c4 = this.f62655k;
                Arrays.fill(c8050c4.e(), (byte) 0);
                c3659j.b(c8050c4.e(), 4 - i12, i12, false);
                c8050c4.R(0);
                this.f62670z = (int) c8050c4.G();
                return;
            }
            if (i11 == 25506) {
                k(i11);
                byte[] bArr4 = new byte[i12];
                this.f62668x.f62710l = bArr4;
                c3659j.b(bArr4, 0, i12, false);
                return;
            }
            if (i11 != 30322) {
                throw v.a(null, "Unexpected id: " + i11);
            }
            k(i11);
            byte[] bArr5 = new byte[i12];
            this.f62668x.f62722x = bArr5;
            c3659j.b(bArr5, 0, i12, false);
            return;
        }
        int i26 = this.f62623J;
        int i27 = 8;
        C8050C c8050c5 = this.f62653i;
        if (i26 == 0) {
            C6420e c6420e = this.f62642b;
            this.f62629P = (int) c6420e.d(c3659j, false, true, 8);
            this.f62630Q = c6420e.b();
            this.f62625L = -9223372036854775807L;
            this.f62623J = 1;
            c8050c5.O(0);
        }
        b bVar3 = sparseArray.get(this.f62629P);
        if (bVar3 == null) {
            c3659j.m(i12 - this.f62630Q, false);
            this.f62623J = 0;
            return;
        }
        b.a(bVar3);
        if (this.f62623J == 1) {
            r(c3659j, 3);
            int i28 = (c8050c5.e()[2] & 6) >> 1;
            if (i28 == 0) {
                this.f62627N = 1;
                int[] iArr = this.f62628O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                this.f62628O = iArr;
                iArr[0] = (i12 - this.f62630Q) - 3;
            } else {
                r(c3659j, 4);
                int i29 = (c8050c5.e()[3] & 255) + 1;
                this.f62627N = i29;
                int[] iArr2 = this.f62628O;
                if (iArr2 == null) {
                    iArr2 = new int[i29];
                } else if (iArr2.length < i29) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i29)];
                }
                this.f62628O = iArr2;
                if (i28 == 2) {
                    int i31 = (i12 - this.f62630Q) - 4;
                    int i32 = this.f62627N;
                    Arrays.fill(iArr2, 0, i32, i31 / i32);
                } else if (i28 == 1) {
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 4;
                    while (true) {
                        i21 = this.f62627N - 1;
                        if (i33 >= i21) {
                            break;
                        }
                        this.f62628O[i33] = 0;
                        while (true) {
                            i22 = i35 + 1;
                            r(c3659j, i22);
                            int i36 = c8050c5.e()[i35] & 255;
                            int[] iArr3 = this.f62628O;
                            i23 = iArr3[i33] + i36;
                            iArr3[i33] = i23;
                            if (i36 != 255) {
                                break;
                            } else {
                                i35 = i22;
                            }
                        }
                        i34 += i23;
                        i33++;
                        i35 = i22;
                    }
                    this.f62628O[i21] = ((i12 - this.f62630Q) - i35) - i34;
                } else {
                    if (i28 != 3) {
                        throw v.a(null, "Unexpected lacing value: " + i28);
                    }
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 4;
                    while (true) {
                        int i41 = this.f62627N - i24;
                        if (i37 >= i41) {
                            i13 = i24;
                            i15 = i25;
                            c8050c = c8050c5;
                            this.f62628O[i41] = ((i12 - this.f62630Q) - i39) - i38;
                            break;
                        }
                        this.f62628O[i37] = i25;
                        int i42 = i39 + 1;
                        r(c3659j, i42);
                        if (c8050c5.e()[i39] == 0) {
                            throw v.a(null, "No valid varint length mask found");
                        }
                        int i43 = i25;
                        while (true) {
                            if (i43 >= i27) {
                                i16 = i24;
                                i17 = i25;
                                i18 = i38;
                                i19 = i27;
                                c8050c2 = c8050c5;
                                j11 = 0;
                                i39 = i42;
                                break;
                            }
                            i19 = i27;
                            int i44 = i24 << (7 - i43);
                            if ((c8050c5.e()[i39] & i44) != 0) {
                                i16 = i24;
                                int i45 = i42 + i43;
                                r(c3659j, i45);
                                int i46 = c8050c5.e()[i39] & 255 & (~i44);
                                int i47 = i25;
                                i18 = i38;
                                j11 = i46;
                                while (i42 < i45) {
                                    j11 = (j11 << i19) | (c8050c5.e()[i42] & 255);
                                    i42++;
                                    c8050c5 = c8050c5;
                                    i47 = i47;
                                }
                                i17 = i47;
                                c8050c2 = c8050c5;
                                if (i37 > 0) {
                                    j11 -= (1 << ((i43 * 7) + 6)) - 1;
                                }
                                i39 = i45;
                            } else {
                                i43++;
                                i27 = i19;
                            }
                        }
                        if (j11 < -2147483648L || j11 > 2147483647L) {
                            break;
                        }
                        int i48 = (int) j11;
                        int[] iArr4 = this.f62628O;
                        if (i37 != 0) {
                            i48 += iArr4[i37 - 1];
                        }
                        iArr4[i37] = i48;
                        i38 = i18 + i48;
                        i37++;
                        i24 = i16;
                        i27 = i19;
                        c8050c5 = c8050c2;
                        i25 = i17;
                    }
                }
            }
            i13 = 1;
            i15 = 0;
            c8050c = c8050c5;
            this.f62624K = this.f62618E + t((c8050c.e()[i15] << 8) | (c8050c.e()[i13] & 255));
            this.f62631R = (bVar3.f62703e == 2 || (i11 == 163 && (c8050c.e()[2] & 128) == 128)) ? i13 : i15;
            this.f62623J = 2;
            this.f62626M = i15;
            i14 = 163;
        } else {
            i13 = 1;
            i14 = 163;
        }
        if (i11 == i14) {
            while (true) {
                int i49 = this.f62626M;
                if (i49 >= this.f62627N) {
                    this.f62623J = 0;
                    return;
                }
                int w11 = w(c3659j, bVar3, this.f62628O[i49], false);
                b bVar4 = bVar3;
                m(bVar4, this.f62624K + ((this.f62626M * bVar3.f62704f) / 1000), this.f62631R, w11, 0);
                this.f62626M++;
                bVar3 = bVar4;
            }
        } else {
            while (true) {
                int i51 = this.f62626M;
                if (i51 >= this.f62627N) {
                    return;
                }
                int[] iArr5 = this.f62628O;
                boolean z11 = i13;
                iArr5[i51] = w(c3659j, bVar3, iArr5[i51], z11);
                this.f62626M += z11 ? 1 : 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02e1, code lost:
    
        if (r9.equals("S_DVBSUB") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void n(int i11) throws v {
        H bVar;
        int i12;
        char c11 = '\b';
        int i13 = 0;
        G10.a.i(this.f62649e0);
        SparseArray<b> sparseArray = this.f62644c;
        if (i11 == 160) {
            if (this.f62623J != 2) {
                return;
            }
            b bVar2 = sparseArray.get(this.f62629P);
            b.a(bVar2);
            if (this.f62634U > 0 && "A_OPUS".equals(bVar2.f62701c)) {
                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f62634U).array();
                C8050C c8050c = this.f62660p;
                c8050c.getClass();
                c8050c.P(array.length, array);
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.f62627N; i15++) {
                i14 += this.f62628O[i15];
            }
            int i16 = 0;
            while (i16 < this.f62627N) {
                long j11 = this.f62624K + ((bVar2.f62704f * i16) / 1000);
                int i17 = this.f62631R;
                if (i16 == 0 && !this.f62633T) {
                    i17 |= 1;
                }
                int i18 = this.f62628O[i16];
                int i19 = i14 - i18;
                m(bVar2, j11, i17, i18, i19);
                i16++;
                i14 = i19;
            }
            this.f62623J = 0;
            return;
        }
        if (i11 != 174) {
            if (i11 == 19899) {
                int i21 = this.f62670z;
                if (i21 != -1) {
                    long j12 = this.f62614A;
                    if (j12 != -1) {
                        if (i21 == 475249515) {
                            this.f62616C = j12;
                            return;
                        }
                        return;
                    }
                }
                throw v.a(null, "Mandatory element SeekID or SeekPosition not found");
            }
            if (i11 == 25152) {
                k(i11);
                b bVar3 = this.f62668x;
                if (bVar3.f62707i) {
                    M.a aVar = bVar3.f62709k;
                    if (aVar == null) {
                        throw v.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                    }
                    bVar3.f62711m = new C7270l(new C7270l.b(C7266h.f69061a, "video/webm", aVar.f18517b));
                    return;
                }
                return;
            }
            if (i11 == 28032) {
                k(i11);
                b bVar4 = this.f62668x;
                if (bVar4.f62707i && bVar4.f62708j != null) {
                    throw v.a(null, "Combining encryption and compression is not supported");
                }
                return;
            }
            if (i11 == 357149030) {
                if (this.f62664t == -9223372036854775807L) {
                    this.f62664t = 1000000L;
                }
                long j13 = this.f62665u;
                if (j13 != -9223372036854775807L) {
                    this.f62666v = t(j13);
                    return;
                }
                return;
            }
            if (i11 == 374648427) {
                if (sparseArray.size() == 0) {
                    throw v.a(null, "No valid tracks were found");
                }
                this.f62649e0.endTracks();
                return;
            }
            if (i11 != 475249515) {
                return;
            }
            if (!this.f62669y) {
                r rVar = this.f62649e0;
                t tVar = this.f62619F;
                t tVar2 = this.f62620G;
                if (this.f62663s == -1 || this.f62666v == -9223372036854775807L || tVar == null || tVar.d() == 0 || tVar2 == null || tVar2.d() != tVar.d()) {
                    bVar = new H.b(this.f62666v);
                } else {
                    int d11 = tVar.d();
                    int[] iArr = new int[d11];
                    long[] jArr = new long[d11];
                    long[] jArr2 = new long[d11];
                    long[] jArr3 = new long[d11];
                    for (int i22 = 0; i22 < d11; i22++) {
                        jArr3[i22] = tVar.c(i22);
                        jArr[i22] = tVar2.c(i22) + this.f62663s;
                    }
                    while (true) {
                        i12 = d11 - 1;
                        if (i13 >= i12) {
                            break;
                        }
                        int i23 = i13 + 1;
                        iArr[i13] = (int) (jArr[i23] - jArr[i13]);
                        jArr2[i13] = jArr3[i23] - jArr3[i13];
                        i13 = i23;
                    }
                    int i24 = i12;
                    while (i24 > 0 && jArr3[i24] > this.f62666v) {
                        i24--;
                    }
                    iArr[i24] = (int) ((this.f62663s + this.f62662r) - jArr[i24]);
                    jArr2[i24] = this.f62666v - jArr3[i24];
                    if (i24 < i12) {
                        s.f("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                        int i25 = i24 + 1;
                        iArr = Arrays.copyOf(iArr, i25);
                        jArr = Arrays.copyOf(jArr, i25);
                        jArr2 = Arrays.copyOf(jArr2, i25);
                        jArr3 = Arrays.copyOf(jArr3, i25);
                    }
                    bVar = new C3656g(iArr, jArr, jArr2, jArr3);
                }
                rVar.seekMap(bVar);
                this.f62669y = true;
            }
            this.f62619F = null;
            this.f62620G = null;
            return;
        }
        b bVar5 = this.f62668x;
        G10.a.i(bVar5);
        String str = bVar5.f62701c;
        if (str == null) {
            throw v.a(null, "CodecId is missing in TrackEntry element");
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -933872740:
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c11 = 22;
                    break;
                }
                c11 = 65535;
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c11 = 23;
                    break;
                }
                c11 = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c11 = 24;
                    break;
                }
                c11 = 65535;
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c11 = 25;
                    break;
                }
                c11 = 65535;
                break;
            case 738614379:
                if (str.equals("S_TEXT/SSA")) {
                    c11 = 26;
                    break;
                }
                c11 = 65535;
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c11 = 27;
                    break;
                }
                c11 = 65535;
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c11 = 28;
                    break;
                }
                c11 = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c11 = 29;
                    break;
                }
                c11 = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c11 = 30;
                    break;
                }
                c11 = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c11 = 31;
                    break;
                }
                c11 = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c11 = ' ';
                    break;
                }
                c11 = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c11 = '!';
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
            case 29:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case ' ':
            case '!':
                bVar5.g(this.f62649e0, bVar5.f62702d);
                sparseArray.put(bVar5.f62702d, bVar5);
                break;
        }
        this.f62668x = null;
    }

    protected final void o(int i11, double d11) throws v {
        if (i11 == 181) {
            k(i11);
            this.f62668x.f62690S = (int) d11;
            return;
        }
        if (i11 == 17545) {
            this.f62665u = (long) d11;
            return;
        }
        switch (i11) {
            case 21969:
                k(i11);
                this.f62668x.f62677F = (float) d11;
                break;
            case 21970:
                k(i11);
                this.f62668x.f62678G = (float) d11;
                break;
            case 21971:
                k(i11);
                this.f62668x.f62679H = (float) d11;
                break;
            case 21972:
                k(i11);
                this.f62668x.f62680I = (float) d11;
                break;
            case 21973:
                k(i11);
                this.f62668x.f62681J = (float) d11;
                break;
            case 21974:
                k(i11);
                this.f62668x.f62682K = (float) d11;
                break;
            case 21975:
                k(i11);
                this.f62668x.f62683L = (float) d11;
                break;
            case 21976:
                k(i11);
                this.f62668x.f62684M = (float) d11;
                break;
            case 21977:
                k(i11);
                this.f62668x.f62685N = (float) d11;
                break;
            case 21978:
                k(i11);
                this.f62668x.f62686O = (float) d11;
                break;
            default:
                switch (i11) {
                    case 30323:
                        k(i11);
                        this.f62668x.f62719u = (float) d11;
                        break;
                    case 30324:
                        k(i11);
                        this.f62668x.f62720v = (float) d11;
                        break;
                    case 30325:
                        k(i11);
                        this.f62668x.f62721w = (float) d11;
                        break;
                }
        }
    }

    protected final void q(int i11, long j11) throws v {
        if (i11 == 20529) {
            if (j11 == 0) {
                return;
            }
            throw v.a(null, "ContentEncodingOrder " + j11 + " not supported");
        }
        if (i11 == 20530) {
            if (j11 == 1) {
                return;
            }
            throw v.a(null, "ContentEncodingScope " + j11 + " not supported");
        }
        switch (i11) {
            case 131:
                k(i11);
                this.f62668x.f62703e = (int) j11;
                return;
            case 136:
                k(i11);
                this.f62668x.f62695X = j11 == 1;
                return;
            case 155:
                this.f62625L = t(j11);
                return;
            case 159:
                k(i11);
                this.f62668x.f62688Q = (int) j11;
                return;
            case 176:
                k(i11);
                this.f62668x.f62712n = (int) j11;
                return;
            case 179:
                j(i11);
                this.f62619F.a(t(j11));
                return;
            case 186:
                k(i11);
                this.f62668x.f62713o = (int) j11;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 215 */:
                k(i11);
                this.f62668x.f62702d = (int) j11;
                return;
            case 231:
                this.f62618E = t(j11);
                return;
            case 238:
                this.f62632S = (int) j11;
                return;
            case 241:
                if (this.f62621H) {
                    return;
                }
                j(i11);
                this.f62620G.a(j11);
                this.f62621H = true;
                return;
            case 251:
                this.f62633T = true;
                return;
            case 16871:
                k(i11);
                this.f62668x.f62706h = (int) j11;
                return;
            case 16980:
                if (j11 == 3) {
                    return;
                }
                throw v.a(null, "ContentCompAlgo " + j11 + " not supported");
            case 17029:
                if (j11 < 1 || j11 > 2) {
                    throw v.a(null, "DocTypeReadVersion " + j11 + " not supported");
                }
                return;
            case 17143:
                if (j11 == 1) {
                    return;
                }
                throw v.a(null, "EBMLReadVersion " + j11 + " not supported");
            case 18401:
                if (j11 == 5) {
                    return;
                }
                throw v.a(null, "ContentEncAlgo " + j11 + " not supported");
            case 18408:
                if (j11 == 1) {
                    return;
                }
                throw v.a(null, "AESSettingsCipherMode " + j11 + " not supported");
            case 21420:
                this.f62614A = j11 + this.f62663s;
                return;
            case 21432:
                int i12 = (int) j11;
                k(i11);
                if (i12 == 0) {
                    this.f62668x.f62723y = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f62668x.f62723y = 2;
                    return;
                } else if (i12 == 3) {
                    this.f62668x.f62723y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.f62668x.f62723y = 3;
                    return;
                }
            case 21680:
                k(i11);
                this.f62668x.f62715q = (int) j11;
                return;
            case 21682:
                k(i11);
                this.f62668x.f62717s = (int) j11;
                return;
            case 21690:
                k(i11);
                this.f62668x.f62716r = (int) j11;
                return;
            case 21930:
                k(i11);
                this.f62668x.f62694W = j11 == 1;
                return;
            case 21938:
                k(i11);
                b bVar = this.f62668x;
                bVar.f62724z = true;
                bVar.f62714p = (int) j11;
                return;
            case 21998:
                k(i11);
                this.f62668x.f62705g = (int) j11;
                return;
            case 22186:
                k(i11);
                this.f62668x.f62691T = j11;
                return;
            case 22203:
                k(i11);
                this.f62668x.f62692U = j11;
                return;
            case 25188:
                k(i11);
                this.f62668x.f62689R = (int) j11;
                return;
            case 30114:
                this.f62634U = j11;
                return;
            case 30321:
                k(i11);
                int i13 = (int) j11;
                if (i13 == 0) {
                    this.f62668x.f62718t = 0;
                    return;
                }
                if (i13 == 1) {
                    this.f62668x.f62718t = 1;
                    return;
                } else if (i13 == 2) {
                    this.f62668x.f62718t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f62668x.f62718t = 3;
                    return;
                }
            case 2352003:
                k(i11);
                this.f62668x.f62704f = (int) j11;
                return;
            case 2807729:
                this.f62664t = j11;
                return;
            default:
                switch (i11) {
                    case 21945:
                        k(i11);
                        int i14 = (int) j11;
                        if (i14 == 1) {
                            this.f62668x.f62674C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.f62668x.f62674C = 1;
                            return;
                        }
                    case 21946:
                        k(i11);
                        int h11 = C7267i.h((int) j11);
                        if (h11 != -1) {
                            this.f62668x.f62673B = h11;
                            return;
                        }
                        return;
                    case 21947:
                        k(i11);
                        this.f62668x.f62724z = true;
                        int g10 = C7267i.g((int) j11);
                        if (g10 != -1) {
                            this.f62668x.f62672A = g10;
                            return;
                        }
                        return;
                    case 21948:
                        k(i11);
                        this.f62668x.f62675D = (int) j11;
                        return;
                    case 21949:
                        k(i11);
                        this.f62668x.f62676E = (int) j11;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }

    protected final void u(int i11, long j11, long j12) throws v {
        G10.a.i(this.f62649e0);
        if (i11 == 160) {
            this.f62633T = false;
            this.f62634U = 0L;
            return;
        }
        if (i11 == 174) {
            b bVar = new b();
            this.f62668x = bVar;
            bVar.f62698a = this.f62667w;
            return;
        }
        if (i11 == 187) {
            this.f62621H = false;
            return;
        }
        if (i11 == 19899) {
            this.f62670z = -1;
            this.f62614A = -1L;
            return;
        }
        if (i11 == 20533) {
            k(i11);
            this.f62668x.f62707i = true;
            return;
        }
        if (i11 == 21968) {
            k(i11);
            this.f62668x.f62724z = true;
            return;
        }
        if (i11 == 408125543) {
            long j13 = this.f62663s;
            if (j13 != -1 && j13 != j11) {
                throw v.a(null, "Multiple Segment elements not supported");
            }
            this.f62663s = j11;
            this.f62662r = j12;
            return;
        }
        if (i11 == 475249515) {
            this.f62619F = new t();
            this.f62620G = new t();
        } else if (i11 == 524531317 && !this.f62669y) {
            if (this.f62646d && this.f62616C != -1) {
                this.f62615B = true;
            } else {
                this.f62649e0.seekMap(new H.b(this.f62666v));
                this.f62669y = true;
            }
        }
    }

    protected final void v(int i11, String str) throws v {
        if (i11 == 134) {
            k(i11);
            this.f62668x.f62701c = str;
            return;
        }
        if (i11 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                this.f62667w = str.equals("webm");
                return;
            }
            throw v.a(null, "DocType " + str + " not supported");
        }
        if (i11 == 21358) {
            k(i11);
            this.f62668x.f62700b = str;
        } else {
            if (i11 != 2274716) {
                return;
            }
            k(i11);
            this.f62668x.f62696Y = str;
        }
    }
}
