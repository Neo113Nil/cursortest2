package F1;

import F1.C1154p;
import F1.O;
import F1.P;
import F1.z;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.exoplayer.p;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import b1.AbstractC2335D;
import b1.AbstractC2346O;
import b1.W;
import b1.Y;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.collect.AbstractC3445z;
import com.twilio.voice.EventKeys;
import e1.AbstractC4131A;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.T;
import e1.Z;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Typography;
import lb.C5444x;
import m1.C5507g;
import m1.C5509h;
import m1.O0;
import m1.n1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import v1.AbstractC6596A;
import v1.AbstractC6610O;
import v1.C6628s;
import v1.InterfaceC6600E;
import v1.InterfaceC6627q;

/* renamed from: F1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1149k extends AbstractC6596A implements z.b {
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: i6, reason: collision with root package name */
    public static boolean f3334i6;

    /* renamed from: j6, reason: collision with root package name */
    public static boolean f3335j6;

    /* renamed from: A5, reason: collision with root package name */
    public final boolean f3336A5;

    /* renamed from: B5, reason: collision with root package name */
    public e f3337B5;

    /* renamed from: C5, reason: collision with root package name */
    public boolean f3338C5;

    /* renamed from: D5, reason: collision with root package name */
    public boolean f3339D5;

    /* renamed from: E5, reason: collision with root package name */
    public P f3340E5;

    /* renamed from: F5, reason: collision with root package name */
    public boolean f3341F5;

    /* renamed from: G5, reason: collision with root package name */
    public int f3342G5;

    /* renamed from: H5, reason: collision with root package name */
    public List f3343H5;

    /* renamed from: I5, reason: collision with root package name */
    public Surface f3344I5;

    /* renamed from: J5, reason: collision with root package name */
    public PlaceholderSurface f3345J5;

    /* renamed from: K5, reason: collision with root package name */
    public e1.L f3346K5;

    /* renamed from: L5, reason: collision with root package name */
    public boolean f3347L5;

    /* renamed from: M5, reason: collision with root package name */
    public int f3348M5;

    /* renamed from: N5, reason: collision with root package name */
    public int f3349N5;

    /* renamed from: O5, reason: collision with root package name */
    public long f3350O5;

    /* renamed from: P5, reason: collision with root package name */
    public int f3351P5;

    /* renamed from: Q5, reason: collision with root package name */
    public int f3352Q5;

    /* renamed from: R5, reason: collision with root package name */
    public int f3353R5;

    /* renamed from: S5, reason: collision with root package name */
    public n1 f3354S5;

    /* renamed from: T5, reason: collision with root package name */
    public boolean f3355T5;

    /* renamed from: U5, reason: collision with root package name */
    public long f3356U5;

    /* renamed from: V5, reason: collision with root package name */
    public int f3357V5;

    /* renamed from: W5, reason: collision with root package name */
    public long f3358W5;

    /* renamed from: X5, reason: collision with root package name */
    public Y f3359X5;

    /* renamed from: Y5, reason: collision with root package name */
    public Y f3360Y5;

    /* renamed from: Z5, reason: collision with root package name */
    public int f3361Z5;

    /* renamed from: a6, reason: collision with root package name */
    public boolean f3362a6;

    /* renamed from: b6, reason: collision with root package name */
    public int f3363b6;

    /* renamed from: c6, reason: collision with root package name */
    public f f3364c6;

    /* renamed from: d6, reason: collision with root package name */
    public y f3365d6;

    /* renamed from: e6, reason: collision with root package name */
    public long f3366e6;

    /* renamed from: f6, reason: collision with root package name */
    public long f3367f6;

    /* renamed from: g6, reason: collision with root package name */
    public boolean f3368g6;

    /* renamed from: h6, reason: collision with root package name */
    public int f3369h6;

    /* renamed from: p5, reason: collision with root package name */
    public final Context f3370p5;

    /* renamed from: q5, reason: collision with root package name */
    public final boolean f3371q5;

    /* renamed from: r5, reason: collision with root package name */
    public final O.a f3372r5;

    /* renamed from: s5, reason: collision with root package name */
    public final int f3373s5;

    /* renamed from: t5, reason: collision with root package name */
    public final boolean f3374t5;

    /* renamed from: u5, reason: collision with root package name */
    public final z f3375u5;

    /* renamed from: v5, reason: collision with root package name */
    public final z.a f3376v5;

    /* renamed from: w5, reason: collision with root package name */
    public final C1139a f3377w5;

    /* renamed from: x5, reason: collision with root package name */
    public final long f3378x5;

    /* renamed from: y5, reason: collision with root package name */
    public final A f3379y5;

    /* renamed from: z5, reason: collision with root package name */
    public final PriorityQueue f3380z5;

    /* renamed from: F1.k$b */
    public class b implements P.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6627q f3382a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f3383b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f3384c;

        public b(InterfaceC6627q interfaceC6627q, int i10, long j10) {
            this.f3382a = interfaceC6627q;
            this.f3383b = i10;
            this.f3384c = j10;
        }

        @Override // F1.P.b
        public void a(long j10) {
            C1149k.this.Y2(this.f3382a, this.f3383b, this.f3384c, j10);
        }

        @Override // F1.P.b
        public void b() {
            C1149k.this.l3(this.f3382a, this.f3383b, this.f3384c);
        }
    }

    /* renamed from: F1.k$c */
    public static final class c {
        public static boolean a(Context context) {
            boolean isHdr;
            DisplayManager displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                isHdr = display.isHdr();
                if (isHdr) {
                    for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                        if (i10 == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: F1.k$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3386a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3387b;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC6627q.b f3389d;

        /* renamed from: e, reason: collision with root package name */
        public long f3390e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f3391f;

        /* renamed from: g, reason: collision with root package name */
        public Handler f3392g;

        /* renamed from: h, reason: collision with root package name */
        public O f3393h;

        /* renamed from: i, reason: collision with root package name */
        public int f3394i;

        /* renamed from: k, reason: collision with root package name */
        public P f3396k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f3397l;

        /* renamed from: n, reason: collision with root package name */
        public boolean f3399n;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC6600E f3388c = InterfaceC6600E.f66903a;

        /* renamed from: j, reason: collision with root package name */
        public float f3395j = 30.0f;

        /* renamed from: m, reason: collision with root package name */
        public long f3398m = -9223372036854775807L;

        public d(Context context) {
            this.f3386a = context;
            this.f3389d = InterfaceC6627q.b.a(context);
        }

        public C1149k n() {
            AbstractC4134a.g(!this.f3387b);
            Handler handler = this.f3392g;
            AbstractC4134a.g((handler == null && this.f3393h == null) || !(handler == null || this.f3393h == null));
            this.f3387b = true;
            return new C1149k(this);
        }

        public d o(boolean z10) {
            this.f3399n = z10;
            return this;
        }

        public d p(long j10) {
            this.f3398m = j10;
            return this;
        }

        public d q(boolean z10) {
            this.f3397l = z10;
            return this;
        }

        public d r(long j10) {
            this.f3390e = j10;
            return this;
        }

        public d s(InterfaceC6627q.b bVar) {
            this.f3389d = bVar;
            return this;
        }

        public d t(boolean z10) {
            this.f3391f = z10;
            return this;
        }

        public d u(Handler handler) {
            this.f3392g = handler;
            return this;
        }

        public d v(O o10) {
            this.f3393h = o10;
            return this;
        }

        public d w(int i10) {
            this.f3394i = i10;
            return this;
        }

        public d x(InterfaceC6600E interfaceC6600E) {
            this.f3388c = interfaceC6600E;
            return this;
        }
    }

    /* renamed from: F1.k$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f3400a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3401b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3402c;

        public e(int i10, int i11, int i12) {
            this.f3400a = i10;
            this.f3401b = i11;
            this.f3402c = i12;
        }
    }

    /* renamed from: F1.k$f */
    public final class f implements InterfaceC6627q.d, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f3403a;

        public f(InterfaceC6627q interfaceC6627q) {
            Handler A10 = Z.A(this);
            this.f3403a = A10;
            interfaceC6627q.f(this, A10);
        }

        @Override // v1.InterfaceC6627q.d
        public void a(InterfaceC6627q interfaceC6627q, long j10, long j11) {
            if (Build.VERSION.SDK_INT >= 30) {
                b(j10);
            } else {
                this.f3403a.sendMessageAtFrontOfQueue(Message.obtain(this.f3403a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        public final void b(long j10) {
            C1149k c1149k = C1149k.this;
            if (this != c1149k.f3364c6 || c1149k.N0() == null) {
                return;
            }
            if (j10 == LongCompanionObject.MAX_VALUE) {
                C1149k.this.V2();
                return;
            }
            try {
                C1149k.this.U2(j10);
            } catch (m1.I e10) {
                C1149k.this.Q1(e10);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(Z.G1(message.arg1, message.arg2));
            return true;
        }
    }

    public C1149k(d dVar) {
        super(2, dVar.f3389d, dVar.f3388c, dVar.f3391f, dVar.f3395j);
        Context applicationContext = dVar.f3386a.getApplicationContext();
        this.f3370p5 = applicationContext;
        this.f3373s5 = dVar.f3394i;
        this.f3340E5 = dVar.f3396k;
        this.f3372r5 = new O.a(dVar.f3392g, dVar.f3393h);
        this.f3371q5 = this.f3340E5 == null;
        this.f3375u5 = new z(applicationContext, this, dVar.f3390e);
        this.f3376v5 = new z.a();
        this.f3374t5 = u2();
        this.f3346K5 = e1.L.f45487c;
        this.f3348M5 = 1;
        this.f3349N5 = 0;
        this.f3359X5 = Y.f24525e;
        this.f3363b6 = 0;
        this.f3360Y5 = null;
        this.f3361Z5 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f3366e6 = -9223372036854775807L;
        this.f3367f6 = -9223372036854775807L;
        this.f3377w5 = dVar.f3397l ? new C1139a() : null;
        this.f3380z5 = new PriorityQueue();
        if (dVar.f3398m != -9223372036854775807L) {
            this.f3378x5 = -dVar.f3398m;
            this.f3379y5 = new A(1.0f);
        } else {
            this.f3378x5 = -9223372036854775807L;
            this.f3379y5 = null;
        }
        this.f3336A5 = dVar.f3399n;
        this.f3354S5 = null;
    }

    public static List B2(Context context, InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar, boolean z10, boolean z11) {
        String str = aVar.f20543o;
        if (str == null) {
            return AbstractC3445z.t();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List h10 = AbstractC6610O.h(interfaceC6600E, aVar, z10, z11);
            if (!h10.isEmpty()) {
                return h10;
            }
        }
        return AbstractC6610O.n(interfaceC6600E, aVar, z10, z11);
    }

    public static int C2(v1.t tVar, androidx.media3.common.a aVar) {
        if (aVar.f20544p == -1) {
            return y2(tVar, aVar);
        }
        int size = aVar.f20546r.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((byte[]) aVar.f20546r.get(i11)).length;
        }
        return aVar.f20544p + i10;
    }

    public static int D2(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    public static void a3(InterfaceC6627q interfaceC6627q, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC6627q.setParameters(bundle);
    }

    public static int m3(Context context, InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar) {
        boolean z10;
        int i10 = 0;
        if (!AbstractC2335D.t(aVar.f20543o)) {
            return androidx.media3.exoplayer.q.r(0);
        }
        boolean z11 = aVar.f20547s != null;
        List B22 = B2(context, interfaceC6600E, aVar, z11, false);
        if (z11 && B22.isEmpty()) {
            B22 = B2(context, interfaceC6600E, aVar, false, false);
        }
        if (B22.isEmpty()) {
            return androidx.media3.exoplayer.q.r(1);
        }
        if (!AbstractC6596A.b2(aVar)) {
            return androidx.media3.exoplayer.q.r(2);
        }
        v1.t tVar = (v1.t) B22.get(0);
        boolean p10 = tVar.p(aVar);
        if (!p10) {
            for (int i11 = 1; i11 < B22.size(); i11++) {
                v1.t tVar2 = (v1.t) B22.get(i11);
                if (tVar2.p(aVar)) {
                    z10 = false;
                    p10 = true;
                    tVar = tVar2;
                    break;
                }
            }
        }
        z10 = true;
        int i12 = p10 ? 4 : 3;
        int i13 = tVar.s(aVar) ? 16 : 8;
        int i14 = tVar.f66993h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(aVar.f20543o) && !c.a(context)) {
            i15 = 256;
        }
        if (p10) {
            List B23 = B2(context, interfaceC6600E, aVar, z11, true);
            if (!B23.isEmpty()) {
                v1.t tVar3 = (v1.t) AbstractC6610O.o(B23, aVar).get(0);
                if (tVar3.p(aVar) && tVar3.s(aVar)) {
                    i10 = 32;
                }
            }
        }
        return androidx.media3.exoplayer.q.n(i12, i13, i10, i14, i15);
    }

    private void n3() {
        InterfaceC6627q N02 = N0();
        if (N02 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f3361Z5));
            N02.setParameters(bundle);
        }
    }

    public static boolean u2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean w2() {
        String str;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        char c10 = 7;
        if (i10 <= 28) {
            String str2 = Build.DEVICE;
            str2.getClass();
            switch (str2.hashCode()) {
                case -1339091551:
                    if (str2.equals("dangal")) {
                        z10 = false;
                        break;
                    }
                    z10 = -1;
                    break;
                case -1220081023:
                    if (str2.equals("dangalFHD")) {
                        z10 = true;
                        break;
                    }
                    z10 = -1;
                    break;
                case -1220066608:
                    if (str2.equals("dangalUHD")) {
                        z10 = 2;
                        break;
                    }
                    z10 = -1;
                    break;
                case -1012436106:
                    if (str2.equals("oneday")) {
                        z10 = 3;
                        break;
                    }
                    z10 = -1;
                    break;
                case -760312546:
                    if (str2.equals("aquaman")) {
                        z10 = 4;
                        break;
                    }
                    z10 = -1;
                    break;
                case -64886864:
                    if (str2.equals("magnolia")) {
                        z10 = 5;
                        break;
                    }
                    z10 = -1;
                    break;
                case 3415681:
                    if (str2.equals("once")) {
                        z10 = 6;
                        break;
                    }
                    z10 = -1;
                    break;
                case 825323514:
                    if (str2.equals("machuca")) {
                        z10 = 7;
                        break;
                    }
                    z10 = -1;
                    break;
                default:
                    z10 = -1;
                    break;
            }
            switch (z10) {
            }
            return true;
        }
        if (i10 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        str = Build.MODEL;
        str.getClass();
        switch (str) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                break;
            default:
                if (i10 <= 26) {
                    String str3 = Build.DEVICE;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (str3.equals("GIONEE_SWW1609")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -2144781185:
                            if (str3.equals("GIONEE_SWW1627")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -2144781160:
                            if (str3.equals("GIONEE_SWW1631")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -2097309513:
                            if (str3.equals("K50a40")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -2022874474:
                            if (str3.equals("CP8676_I02")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1978993182:
                            if (str3.equals("NX541J")) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1978990237:
                            if (str3.equals("NX573J")) {
                                c10 = 6;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1936688988:
                            break;
                        case -1936688066:
                            if (str3.equals("PGN610")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1936688065:
                            if (str3.equals("PGN611")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1931988508:
                            if (str3.equals("AquaPowerM")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1885099851:
                            if (str3.equals("RAIJIN")) {
                                c10 = 11;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1696512866:
                            if (str3.equals("XT1663")) {
                                c10 = '\f';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1680025915:
                            if (str3.equals("ComioS1")) {
                                c10 = '\r';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1615810839:
                            if (str3.equals("Phantom6")) {
                                c10 = 14;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1600724499:
                            if (str3.equals("pacificrim")) {
                                c10 = 15;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1554255044:
                            if (str3.equals("vernee_M5")) {
                                c10 = 16;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1481772737:
                            if (str3.equals("panell_dl")) {
                                c10 = 17;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1481772730:
                            if (str3.equals("panell_ds")) {
                                c10 = 18;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1481772729:
                            if (str3.equals("panell_dt")) {
                                c10 = 19;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1320080169:
                            if (str3.equals("GiONEE_GBL7319")) {
                                c10 = 20;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1217592143:
                            if (str3.equals("BRAVIA_ATV2")) {
                                c10 = 21;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1180384755:
                            if (str3.equals("iris60")) {
                                c10 = 22;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1139198265:
                            if (str3.equals("Slate_Pro")) {
                                c10 = 23;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1052835013:
                            if (str3.equals("namath")) {
                                c10 = 24;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -993250464:
                            if (str3.equals("A10-70F")) {
                                c10 = 25;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -993250458:
                            if (str3.equals("A10-70L")) {
                                c10 = 26;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -965403638:
                            if (str3.equals("s905x018")) {
                                c10 = 27;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -958336948:
                            if (str3.equals("ELUGA_Ray_X")) {
                                c10 = 28;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -879245230:
                            if (str3.equals("tcl_eu")) {
                                c10 = 29;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -842500323:
                            if (str3.equals("nicklaus_f")) {
                                c10 = 30;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -821392978:
                            if (str3.equals("A7000-a")) {
                                c10 = 31;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -797483286:
                            if (str3.equals("SVP-DTV15")) {
                                c10 = ' ';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -794946968:
                            if (str3.equals("watson")) {
                                c10 = '!';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -788334647:
                            if (str3.equals("whyred")) {
                                c10 = Typography.quote;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -782144577:
                            if (str3.equals("OnePlus5T")) {
                                c10 = '#';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -575125681:
                            if (str3.equals("GiONEE_CBL7513")) {
                                c10 = Typography.dollar;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -521118391:
                            if (str3.equals("GIONEE_GBL7360")) {
                                c10 = '%';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -430914369:
                            if (str3.equals("Pixi4-7_3G")) {
                                c10 = Typography.amp;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -290434366:
                            if (str3.equals("taido_row")) {
                                c10 = '\'';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -282781963:
                            if (str3.equals("BLACK-1X")) {
                                c10 = '(';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -277133239:
                            if (str3.equals("Z12_PRO")) {
                                c10 = ')';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -173639913:
                            if (str3.equals("ELUGA_A3_Pro")) {
                                c10 = '*';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -56598463:
                            if (str3.equals("woods_fn")) {
                                c10 = '+';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2126:
                            if (str3.equals("C1")) {
                                c10 = ',';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2564:
                            if (str3.equals("Q5")) {
                                c10 = '-';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2715:
                            if (str3.equals("V1")) {
                                c10 = '.';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2719:
                            if (str3.equals("V5")) {
                                c10 = '/';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3091:
                            if (str3.equals("b5")) {
                                c10 = '0';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3483:
                            if (str3.equals("mh")) {
                                c10 = '1';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 73405:
                            if (str3.equals("JGZ")) {
                                c10 = '2';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 75537:
                            if (str3.equals("M04")) {
                                c10 = '3';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 75739:
                            if (str3.equals("M5c")) {
                                c10 = '4';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 76779:
                            if (str3.equals("MX6")) {
                                c10 = '5';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 78669:
                            if (str3.equals("P85")) {
                                c10 = '6';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 79305:
                            if (str3.equals("PLE")) {
                                c10 = '7';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 80618:
                            if (str3.equals("QX1")) {
                                c10 = '8';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 88274:
                            if (str3.equals("Z80")) {
                                c10 = '9';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 98846:
                            if (str3.equals("cv1")) {
                                c10 = ':';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 98848:
                            if (str3.equals("cv3")) {
                                c10 = ';';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 99329:
                            if (str3.equals("deb")) {
                                c10 = Typography.less;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 101481:
                            if (str3.equals("flo")) {
                                c10 = '=';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1513190:
                            if (str3.equals("1601")) {
                                c10 = Typography.greater;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1514184:
                            if (str3.equals("1713")) {
                                c10 = '?';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1514185:
                            if (str3.equals("1714")) {
                                c10 = '@';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2133089:
                            if (str3.equals("F01H")) {
                                c10 = 'A';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2133091:
                            if (str3.equals("F01J")) {
                                c10 = 'B';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2133120:
                            if (str3.equals("F02H")) {
                                c10 = 'C';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2133151:
                            if (str3.equals("F03H")) {
                                c10 = 'D';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2133182:
                            if (str3.equals("F04H")) {
                                c10 = 'E';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2133184:
                            if (str3.equals("F04J")) {
                                c10 = 'F';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2436959:
                            if (str3.equals("P681")) {
                                c10 = 'G';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2463773:
                            if (str3.equals("Q350")) {
                                c10 = 'H';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2464648:
                            if (str3.equals("Q427")) {
                                c10 = 'I';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2689555:
                            if (str3.equals("XE2X")) {
                                c10 = 'J';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3154429:
                            if (str3.equals("fugu")) {
                                c10 = 'K';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3284551:
                            if (str3.equals("kate")) {
                                c10 = Matrix.MATRIX_TYPE_RANDOM_LT;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3351335:
                            if (str3.equals("mido")) {
                                c10 = 'M';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3386211:
                            if (str3.equals("p212")) {
                                c10 = 'N';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 41325051:
                            if (str3.equals("MEIZU_M5")) {
                                c10 = 'O';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 51349633:
                            if (str3.equals("601LV")) {
                                c10 = 'P';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 51350594:
                            if (str3.equals("602LV")) {
                                c10 = 'Q';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 55178625:
                            if (str3.equals("Aura_Note_2")) {
                                c10 = Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 61542055:
                            if (str3.equals("A1601")) {
                                c10 = 'S';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 65355429:
                            if (str3.equals("E5643")) {
                                c10 = 'T';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 66214468:
                            if (str3.equals("F3111")) {
                                c10 = Matrix.MATRIX_TYPE_RANDOM_UT;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 66214470:
                            if (str3.equals("F3113")) {
                                c10 = 'V';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 66214473:
                            if (str3.equals("F3116")) {
                                c10 = 'W';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 66215429:
                            if (str3.equals("F3211")) {
                                c10 = 'X';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 66215431:
                            if (str3.equals("F3213")) {
                                c10 = 'Y';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 66215433:
                            if (str3.equals("F3215")) {
                                c10 = Matrix.MATRIX_TYPE_ZERO;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 66216390:
                            if (str3.equals("F3311")) {
                                c10 = '[';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 76402249:
                            if (str3.equals("PRO7S")) {
                                c10 = '\\';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 76404105:
                            if (str3.equals("Q4260")) {
                                c10 = ']';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 76404911:
                            if (str3.equals("Q4310")) {
                                c10 = '^';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 80963634:
                            if (str3.equals("V23GB")) {
                                c10 = '_';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 82882791:
                            if (str3.equals("X3_HK")) {
                                c10 = '`';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 98715550:
                            if (str3.equals("i9031")) {
                                c10 = 'a';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 101370885:
                            if (str3.equals("l5460")) {
                                c10 = 'b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 102844228:
                            if (str3.equals("le_x6")) {
                                c10 = 'c';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 165221241:
                            if (str3.equals("A2016a40")) {
                                c10 = 'd';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 182191441:
                            if (str3.equals("CPY83_I00")) {
                                c10 = 'e';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 245388979:
                            if (str3.equals("marino_f")) {
                                c10 = 'f';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 287431619:
                            if (str3.equals("griffin")) {
                                c10 = 'g';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 307593612:
                            if (str3.equals("A7010a48")) {
                                c10 = 'h';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 308517133:
                            if (str3.equals("A7020a48")) {
                                c10 = 'i';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 316215098:
                            if (str3.equals("TB3-730F")) {
                                c10 = 'j';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 316215116:
                            if (str3.equals("TB3-730X")) {
                                c10 = 'k';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 316246811:
                            if (str3.equals("TB3-850F")) {
                                c10 = 'l';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 316246818:
                            if (str3.equals("TB3-850M")) {
                                c10 = 'm';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 407160593:
                            if (str3.equals("Pixi5-10_4G")) {
                                c10 = 'n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 507412548:
                            if (str3.equals("QM16XE_U")) {
                                c10 = 'o';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 793982701:
                            if (str3.equals("GIONEE_WBL5708")) {
                                c10 = 'p';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 794038622:
                            if (str3.equals("GIONEE_WBL7365")) {
                                c10 = 'q';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 794040393:
                            if (str3.equals("GIONEE_WBL7519")) {
                                c10 = 'r';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 835649806:
                            if (str3.equals("manning")) {
                                c10 = 's';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 917340916:
                            if (str3.equals("A7000plus")) {
                                c10 = 't';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 958008161:
                            if (str3.equals("j2xlteins")) {
                                c10 = 'u';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1060579533:
                            if (str3.equals("panell_d")) {
                                c10 = 'v';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1150207623:
                            if (str3.equals("LS-5017")) {
                                c10 = 'w';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1176899427:
                            if (str3.equals("itel_S41")) {
                                c10 = 'x';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1280332038:
                            if (str3.equals("hwALE-H")) {
                                c10 = 'y';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1306947716:
                            if (str3.equals("EverStar_S")) {
                                c10 = 'z';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1349174697:
                            if (str3.equals("htc_e56ml_dtul")) {
                                c10 = '{';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1522194893:
                            if (str3.equals("woods_f")) {
                                c10 = '|';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1691543273:
                            if (str3.equals("CPH1609")) {
                                c10 = '}';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1691544261:
                            if (str3.equals("CPH1715")) {
                                c10 = '~';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1709443163:
                            if (str3.equals("iball8735_9806")) {
                                c10 = 127;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1865889110:
                            if (str3.equals("santoni")) {
                                c10 = 128;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1906253259:
                            if (str3.equals("PB2-670M")) {
                                c10 = 129;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1977196784:
                            if (str3.equals("Infinix-X572")) {
                                c10 = 130;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2006372676:
                            if (str3.equals("BRAVIA_ATV3_4K")) {
                                c10 = 131;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2019281702:
                            if (str3.equals("DM-01K")) {
                                c10 = 132;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2029784656:
                            if (str3.equals("HWBLN-H")) {
                                c10 = 133;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2030379515:
                            if (str3.equals("HWCAM-H")) {
                                c10 = 134;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2033393791:
                            if (str3.equals("ASUS_X00AD_2")) {
                                c10 = 135;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2047190025:
                            if (str3.equals("ELUGA_Note")) {
                                c10 = 136;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2047252157:
                            if (str3.equals("ELUGA_Prim")) {
                                c10 = 137;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2048319463:
                            if (str3.equals("HWVNS-H")) {
                                c10 = 138;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2048855701:
                            if (str3.equals("HWWAS-H")) {
                                c10 = 139;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        default:
                            str.getClass();
                            if (!str.equals("JSN-L21")) {
                            }
                            break;
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
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case ' ':
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '[':
                        case '\\':
                        case ']':
                        case '^':
                        case '_':
                        case '`':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case '{':
                        case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        case '}':
                        case '~':
                        case 127:
                        case 128:
                        case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        case 130:
                        case 131:
                        case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        case 134:
                        case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        case 136:
                        case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0087, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int y2(v1.t tVar, androidx.media3.common.a aVar) {
        int i10 = aVar.f20550v;
        int i11 = aVar.f20551w;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        String str = (String) AbstractC4134a.e(aVar.f20543o);
        char c10 = 1;
        if ("video/dolby-vision".equals(str)) {
            Pair j10 = AbstractC6610O.j(aVar);
            if (j10 != null) {
                int intValue = ((Integer) j10.first).intValue();
                if (intValue == 512 || intValue == 1 || intValue == 2) {
                    str = "video/avc";
                } else if (intValue == 1024) {
                    str = "video/av01";
                }
            }
            str = "video/hevc";
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 3:
            case 5:
                return D2(i10 * i11, 2);
            case 2:
                return Math.max(PKIFailureInfo.badSenderNonce, D2(i10 * i11, 2));
            case 4:
                String str2 = Build.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Build.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && tVar.f66992g)))) {
                    return -1;
                }
                return D2(Z.k(i10, 16) * Z.k(i11, 16) * 256, 2);
            case 6:
                return D2(i10 * i11, 4);
            default:
                return -1;
        }
    }

    public static Point z2(v1.t tVar, androidx.media3.common.a aVar) {
        int i10 = aVar.f20551w;
        int i11 = aVar.f20550v;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            int i15 = z10 ? i14 : i13;
            if (!z10) {
                i13 = i14;
            }
            Point c10 = tVar.c(i15, i13);
            float f11 = aVar.f20554z;
            if (c10 != null && tVar.v(c10.x, c10.y, f11)) {
                return c10;
            }
        }
        return null;
    }

    @Override // v1.AbstractC6596A
    public C6628s A0(Throwable th2, v1.t tVar) {
        return new C1148j(th2, tVar, this.f3344I5);
    }

    public e A2(v1.t tVar, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        int y22;
        int i10 = aVar.f20550v;
        int i11 = aVar.f20551w;
        int C22 = C2(tVar, aVar);
        if (aVarArr.length == 1) {
            if (C22 != -1 && (y22 = y2(tVar, aVar)) != -1) {
                C22 = Math.min((int) (C22 * 1.5f), y22);
            }
            return new e(i10, i11, C22);
        }
        int length = aVarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            androidx.media3.common.a aVar2 = aVarArr[i12];
            if (aVar.f20516D != null && aVar2.f20516D == null) {
                aVar2 = aVar2.b().V(aVar.f20516D).P();
            }
            if (tVar.e(aVar, aVar2).f56214d != 0) {
                int i13 = aVar2.f20550v;
                z10 |= i13 == -1 || aVar2.f20551w == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, aVar2.f20551w);
                C22 = Math.max(C22, C2(tVar, aVar2));
            }
        }
        if (z10) {
            AbstractC4156x.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + C5444x.f55808b + i11);
            Point z22 = z2(tVar, aVar);
            if (z22 != null) {
                i10 = Math.max(i10, z22.x);
                i11 = Math.max(i11, z22.y);
                C22 = Math.max(C22, y2(tVar, aVar.b().F0(i10).h0(i11).P()));
                AbstractC4156x.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + C5444x.f55808b + i11);
            }
        }
        return new e(i10, i11, C22);
    }

    @Override // v1.AbstractC6596A
    public boolean B1(long j10, long j11, InterfaceC6627q interfaceC6627q, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, androidx.media3.common.a aVar) {
        AbstractC4134a.e(interfaceC6627q);
        long Y02 = j12 - Y0();
        p3(j12);
        P p10 = this.f3340E5;
        if (p10 != null) {
            if (!z10 || z11) {
                return p10.s(j12, new b(interfaceC6627q, i10, Y02));
            }
            l3(interfaceC6627q, i10, Y02);
            return true;
        }
        int c10 = this.f3375u5.c(j12, j10, j11, Z0(), z10, z11, this.f3376v5);
        A a10 = this.f3379y5;
        if (a10 != null && c10 != 5 && c10 != 4) {
            a10.b(j12, this.f3376v5.f());
        }
        if (c10 == 0) {
            long nanoTime = T().nanoTime();
            S2(Y02, nanoTime, aVar);
            Y2(interfaceC6627q, i10, Y02, nanoTime);
            r3(this.f3376v5.f());
            return true;
        }
        if (c10 == 1) {
            W2((InterfaceC6627q) AbstractC4134a.i(interfaceC6627q), i10, Y02, aVar);
            return true;
        }
        if (c10 == 2) {
            v2(interfaceC6627q, i10, Y02);
            r3(this.f3376v5.f());
            return true;
        }
        if (c10 == 3) {
            l3(interfaceC6627q, i10, Y02);
            r3(this.f3376v5.f());
            return true;
        }
        if (c10 == 4 || c10 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(c10));
    }

    public MediaFormat E2(androidx.media3.common.a aVar, String str, e eVar, float f10, boolean z10, int i10) {
        Pair j10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", aVar.f20550v);
        mediaFormat.setInteger("height", aVar.f20551w);
        AbstractC4131A.u(mediaFormat, aVar.f20546r);
        AbstractC4131A.o(mediaFormat, "frame-rate", aVar.f20554z);
        AbstractC4131A.p(mediaFormat, "rotation-degrees", aVar.f20513A);
        AbstractC4131A.n(mediaFormat, aVar.f20516D);
        if ("video/dolby-vision".equals(aVar.f20543o) && (j10 = AbstractC6610O.j(aVar)) != null) {
            AbstractC4131A.p(mediaFormat, "profile", ((Integer) j10.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f3400a);
        mediaFormat.setInteger("max-height", eVar.f3401b);
        AbstractC4131A.p(mediaFormat, "max-input-size", eVar.f3402c);
        int i11 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger(EventKeys.PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f3361Z5));
        }
        return mediaFormat;
    }

    public final Surface F2(v1.t tVar) {
        P p10 = this.f3340E5;
        if (p10 != null) {
            return p10.d();
        }
        Surface surface = this.f3344I5;
        if (surface != null) {
            return surface;
        }
        if (j3(tVar)) {
            return null;
        }
        AbstractC4134a.g(k3(tVar));
        PlaceholderSurface placeholderSurface = this.f3345J5;
        if (placeholderSurface != null && placeholderSurface.f22092a != tVar.f66992g) {
            X2();
        }
        if (this.f3345J5 == null) {
            this.f3345J5 = PlaceholderSurface.c(this.f3370p5, tVar.f66992g);
        }
        return this.f3345J5;
    }

    @Override // v1.AbstractC6596A
    public void G1() {
        P p10 = this.f3340E5;
        if (p10 != null) {
            p10.g();
        }
    }

    public final boolean G2(v1.t tVar) {
        if (this.f3340E5 != null) {
            return true;
        }
        Surface surface = this.f3344I5;
        return (surface != null && surface.isValid()) || j3(tVar) || k3(tVar);
    }

    public final boolean H2(k1.f fVar) {
        return fVar.f54110f < X();
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.p
    public void I(float f10, float f11) {
        super.I(f10, f11);
        P p10 = this.f3340E5;
        if (p10 != null) {
            p10.v(f10);
        } else {
            this.f3375u5.p(f10);
        }
        A a10 = this.f3379y5;
        if (a10 != null) {
            a10.e(f10);
        }
    }

    @Override // v1.AbstractC6596A
    public void I1() {
        super.I1();
        this.f3380z5.clear();
        this.f3353R5 = 0;
        this.f3369h6 = 0;
        this.f3355T5 = false;
        C1139a c1139a = this.f3377w5;
        if (c1139a != null) {
            c1139a.c();
        }
    }

    public final boolean I2(k1.f fVar) {
        if (i() || fVar.l() || this.f3367f6 == -9223372036854775807L) {
            return true;
        }
        return this.f3367f6 - (fVar.f54110f - Y0()) <= 100000;
    }

    @Override // F1.z.b
    public boolean J(long j10, long j11, boolean z10) {
        return g3(j10, j11, z10);
    }

    public boolean J2(long j10, boolean z10) {
        int q02 = q0(j10);
        if (q02 == 0) {
            return false;
        }
        if (z10) {
            C5507g c5507g = this.f66869h5;
            int i10 = c5507g.f56199d + q02;
            c5507g.f56199d = i10;
            c5507g.f56201f += this.f3353R5;
            c5507g.f56199d = i10 + this.f3380z5.size();
        } else {
            this.f66869h5.f56205j++;
            o3(q02 + this.f3380z5.size(), this.f3353R5);
        }
        K0();
        P p10 = this.f3340E5;
        if (p10 != null) {
            p10.y(false);
        }
        return true;
    }

    public final void K2() {
        if (this.f3351P5 > 0) {
            long b10 = T().b();
            this.f3372r5.n(this.f3351P5, b10 - this.f3350O5);
            this.f3351P5 = 0;
            this.f3350O5 = b10;
        }
    }

    public final void L2() {
        if (!this.f3375u5.g() || this.f3344I5 == null) {
            return;
        }
        T2();
    }

    public final void M2() {
        int i10 = this.f3357V5;
        if (i10 != 0) {
            this.f3372r5.r(this.f3356U5, i10);
            this.f3356U5 = 0L;
            this.f3357V5 = 0;
        }
    }

    public final void N2(Y y10) {
        if (y10.equals(Y.f24525e) || y10.equals(this.f3360Y5)) {
            return;
        }
        this.f3360Y5 = y10;
        this.f3372r5.t(y10);
    }

    @Override // v1.AbstractC6596A
    public int O0(k1.f fVar) {
        n1 n1Var;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f3336A5 || (((n1Var = this.f3354S5) != null && n1Var.f56287h) || this.f3362a6)) && H2(fVar) && !I2(fVar)) ? 32 : 0;
        }
        return 0;
    }

    public final void O2() {
        Surface surface = this.f3344I5;
        if (surface == null || !this.f3347L5) {
            return;
        }
        this.f3372r5.q(surface);
    }

    public final void P2() {
        Y y10 = this.f3360Y5;
        if (y10 != null) {
            this.f3372r5.t(y10);
        }
    }

    public final void Q2(MediaFormat mediaFormat) {
        if (this.f3340E5 == null || Z.P0(this.f3370p5)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    @Override // v1.AbstractC6596A
    public boolean R0() {
        return false;
    }

    public final void R2() {
        if (this.f3362a6) {
            int i10 = Build.VERSION.SDK_INT;
            InterfaceC6627q N02 = N0();
            if (N02 == null) {
                return;
            }
            this.f3364c6 = new f(N02);
            if (i10 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                N02.setParameters(bundle);
            }
        }
    }

    @Override // v1.AbstractC6596A
    public float S0(float f10, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        v1.t P02;
        float f11 = -1.0f;
        for (androidx.media3.common.a aVar2 : aVarArr) {
            float f12 = aVar2.f20554z;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        float f13 = f11 == -1.0f ? -1.0f : f11 * f10;
        if (this.f3354S5 == null || (P02 = P0()) == null) {
            return f13;
        }
        float g10 = P02.g(aVar.f20550v, aVar.f20551w);
        return f13 != -1.0f ? Math.max(f13, g10) : g10;
    }

    public final void S2(long j10, long j11, androidx.media3.common.a aVar) {
        y yVar = this.f3365d6;
        if (yVar != null) {
            yVar.e(j10, j11, aVar, T0());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    @Override // v1.AbstractC6596A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean T1(k1.f fVar) {
        boolean z10;
        ByteBuffer byteBuffer;
        boolean z11 = false;
        if (I2(fVar)) {
            return false;
        }
        boolean H22 = H2(fVar);
        A a10 = this.f3379y5;
        if (a10 != null) {
            long c10 = a10.c(fVar.f54110f);
            if (c10 != -9223372036854775807L && c10 < this.f3378x5) {
                z10 = true;
                if ((H22 && !z10) || fVar.h()) {
                    return false;
                }
                if (fVar.m()) {
                    if (this.f3377w5 != null && ((v1.t) AbstractC4134a.e(P0())).f66987b.equals("video/av01") && (byteBuffer = fVar.f54108d) != null) {
                        boolean z12 = H22 || this.f3369h6 <= 0;
                        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                        asReadOnlyBuffer.flip();
                        int d10 = this.f3377w5.d(asReadOnlyBuffer, z12);
                        if (d10 == 0) {
                            fVar.f();
                        } else if (d10 != asReadOnlyBuffer.limit() && ((e) AbstractC4134a.e(this.f3337B5)).f3402c + d10 < asReadOnlyBuffer.capacity() && !fVar.r()) {
                            ((ByteBuffer) AbstractC4134a.e(fVar.f54108d)).position(d10);
                        }
                    }
                    if (z11) {
                        if (H22) {
                            this.f66869h5.f56199d++;
                            return z11;
                        }
                        this.f3380z5.add(Long.valueOf(fVar.f54110f));
                        this.f3369h6++;
                    }
                    return z11;
                }
                fVar.f();
                z11 = true;
                if (z11) {
                }
                return z11;
            }
        }
        z10 = false;
        if (H22) {
        }
        if (fVar.m()) {
        }
        z11 = true;
        if (z11) {
        }
        return z11;
    }

    public final void T2() {
        this.f3372r5.q(this.f3344I5);
        this.f3347L5 = true;
    }

    @Override // v1.AbstractC6596A
    public List U0(InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar, boolean z10) {
        return AbstractC6610O.o(B2(this.f3370p5, interfaceC6600E, aVar, z10, this.f3362a6), aVar);
    }

    @Override // v1.AbstractC6596A
    public final boolean U1() {
        androidx.media3.common.a Q02 = Q0();
        n1 n1Var = this.f3354S5;
        if (n1Var == null) {
            return super.U1();
        }
        if (!n1Var.f56285f || this.f3355T5 || this.f3362a6) {
            return true;
        }
        return (Q02 != null && Q02.f20545q > 0) || e1() || W0() != -9223372036854775807L;
    }

    public void U2(long j10) {
        f2(j10);
        N2(this.f3359X5);
        this.f66869h5.f56200e++;
        L2();
        w1(j10);
    }

    @Override // v1.AbstractC6596A
    public boolean V1(v1.t tVar) {
        return G2(tVar);
    }

    public final void V2() {
        P1();
    }

    public final void W2(InterfaceC6627q interfaceC6627q, int i10, long j10, androidx.media3.common.a aVar) {
        C1149k c1149k;
        long g10 = this.f3376v5.g();
        long f10 = this.f3376v5.f();
        if (i3() && g10 == this.f3358W5) {
            l3(interfaceC6627q, i10, j10);
            c1149k = this;
        } else {
            c1149k = this;
            c1149k.S2(j10, g10, aVar);
            c1149k.Z2(interfaceC6627q, i10, j10, g10);
            g10 = g10;
        }
        r3(f10);
        c1149k.f3358W5 = g10;
    }

    @Override // v1.AbstractC6596A
    public InterfaceC6627q.a X0(v1.t tVar, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, float f10) {
        String str = tVar.f66988c;
        e A22 = A2(tVar, aVar, Z());
        this.f3337B5 = A22;
        MediaFormat E22 = E2(aVar, str, A22, f10, this.f3374t5, this.f3362a6 ? this.f3363b6 : 0);
        Surface F22 = F2(tVar);
        Q2(E22);
        return InterfaceC6627q.a.b(tVar, E22, aVar, F22, mediaCrypto);
    }

    @Override // v1.AbstractC6596A
    public final boolean X1() {
        v1.t P02 = P0();
        if (this.f3340E5 == null || P02 == null || !(P02.f66986a.equals("c2.mtk.avc.decoder") || P02.f66986a.equals("c2.mtk.hevc.decoder"))) {
            return super.X1();
        }
        return true;
    }

    public final void X2() {
        PlaceholderSurface placeholderSurface = this.f3345J5;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.f3345J5 = null;
        }
    }

    public final void Y2(InterfaceC6627q interfaceC6627q, int i10, long j10, long j11) {
        Z2(interfaceC6627q, i10, j10, j11);
    }

    public void Z2(InterfaceC6627q interfaceC6627q, int i10, long j10, long j11) {
        T.a("releaseOutputBuffer");
        interfaceC6627q.i(i10, j11);
        T.b();
        this.f66869h5.f56200e++;
        this.f3352Q5 = 0;
        if (this.f3340E5 == null) {
            N2(this.f3359X5);
            L2();
        }
    }

    @Override // v1.AbstractC6596A
    public int a2(InterfaceC6600E interfaceC6600E, androidx.media3.common.a aVar) {
        return m3(this.f3370p5, interfaceC6600E, aVar);
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.p
    public boolean b() {
        if (!super.b()) {
            return false;
        }
        P p10 = this.f3340E5;
        return p10 == null || p10.b();
    }

    public final void b3(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f3344I5 == surface) {
            if (surface != null) {
                P2();
                O2();
                return;
            }
            return;
        }
        this.f3344I5 = surface;
        if (this.f3340E5 == null) {
            this.f3375u5.o(surface);
        }
        this.f3347L5 = false;
        int state = getState();
        InterfaceC6627q N02 = N0();
        if (N02 != null && this.f3340E5 == null) {
            v1.t tVar = (v1.t) AbstractC4134a.e(P0());
            if (!G2(tVar) || this.f3338C5) {
                F1();
                n1();
            } else {
                c3(N02, F2(tVar));
            }
        }
        if (surface != null) {
            P2();
        } else {
            this.f3360Y5 = null;
            P p10 = this.f3340E5;
            if (p10 != null) {
                p10.w();
            }
        }
        if (state == 2) {
            P p11 = this.f3340E5;
            if (p11 != null) {
                p11.z(true);
            } else {
                this.f3375u5.e(true);
            }
        }
        R2();
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.p
    public boolean c() {
        boolean c10 = super.c();
        P p10 = this.f3340E5;
        if (p10 != null) {
            return p10.n(c10);
        }
        if (c10 && (N0() == null || this.f3362a6)) {
            return true;
        }
        return this.f3375u5.d(c10);
    }

    @Override // v1.AbstractC6596A
    public void c1(k1.f fVar) {
        if (this.f3339D5) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(fVar.f54111g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        a3((InterfaceC6627q) AbstractC4134a.e(N0()), bArr);
                    }
                }
            }
        }
    }

    public final void c3(InterfaceC6627q interfaceC6627q, Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        if (surface != null) {
            d3(interfaceC6627q, surface);
        } else {
            if (i10 < 35) {
                throw new IllegalStateException();
            }
            t2(interfaceC6627q);
        }
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void d0() {
        this.f3360Y5 = null;
        this.f3367f6 = -9223372036854775807L;
        R2();
        this.f3347L5 = false;
        this.f3364c6 = null;
        this.f3355T5 = true;
        try {
            super.d0();
        } finally {
            this.f3372r5.m(this.f66869h5);
            this.f3372r5.t(Y.f24525e);
        }
    }

    public void d3(InterfaceC6627q interfaceC6627q, Surface surface) {
        interfaceC6627q.e(surface);
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void e0(boolean z10, boolean z11) {
        super.e0(z10, z11);
        boolean z12 = U().f56267b;
        AbstractC4134a.g((z12 && this.f3363b6 == 0) ? false : true);
        if (this.f3362a6 != z12) {
            this.f3362a6 = z12;
            F1();
        }
        this.f3372r5.o(this.f66869h5);
        if (!this.f3341F5) {
            if (this.f3343H5 != null && this.f3340E5 == null) {
                C1154p s22 = s2(this.f3370p5, this.f3375u5);
                s22.X(1);
                this.f3340E5 = s22.K(0);
            }
            this.f3341F5 = true;
        }
        if (this.f3340E5 == null) {
            this.f3375u5.m(T());
            this.f3375u5.j(!z11 ? 1 : 0);
        } else {
            r2();
            this.f3342G5 = !z11 ? 1 : 0;
            H0();
        }
    }

    public void e3(List list) {
        if (list.equals(W.f24524a)) {
            P p10 = this.f3340E5;
            if (p10 == null || !p10.isInitialized()) {
                return;
            }
            this.f3340E5.e();
            return;
        }
        this.f3343H5 = list;
        P p11 = this.f3340E5;
        if (p11 != null) {
            p11.m(list);
        }
    }

    @Override // androidx.media3.exoplayer.c
    public void f0() {
        super.f0();
    }

    public boolean f3(long j10, long j11, boolean z10) {
        return j10 < -500000 && !z10;
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void g0(long j10, boolean z10) {
        P p10 = this.f3340E5;
        if (p10 != null && !z10) {
            p10.y(true);
        }
        super.g0(j10, z10);
        if (this.f3340E5 == null) {
            this.f3375u5.k();
        }
        A a10 = this.f3379y5;
        if (a10 != null) {
            a10.d();
        }
        if (z10) {
            P p11 = this.f3340E5;
            if (p11 != null) {
                p11.z(false);
            } else {
                this.f3375u5.e(false);
            }
        }
        R2();
        this.f3352Q5 = 0;
    }

    public boolean g3(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    @Override // androidx.media3.exoplayer.p, androidx.media3.exoplayer.q
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.p
    public void h(long j10, long j11) {
        P p10 = this.f3340E5;
        if (p10 != null) {
            try {
                p10.h(j10, j11);
            } catch (P.c e10) {
                throw R(e10, e10.f3301a, 7001);
            }
        }
        super.h(j10, j11);
    }

    @Override // androidx.media3.exoplayer.c
    public void h0() {
        super.h0();
        P p10 = this.f3340E5;
        if (p10 == null || !this.f3371q5) {
            return;
        }
        p10.release();
    }

    public boolean h3(long j10, long j11) {
        return j10 < -30000 && j11 > 100000;
    }

    public boolean i3() {
        return true;
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void j0() {
        try {
            super.j0();
        } finally {
            this.f3341F5 = false;
            this.f3366e6 = -9223372036854775807L;
            X2();
        }
    }

    public boolean j3(v1.t tVar) {
        return Build.VERSION.SDK_INT >= 35 && tVar.f66996k;
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void k0() {
        super.k0();
        this.f3351P5 = 0;
        this.f3350O5 = T().b();
        this.f3356U5 = 0L;
        this.f3357V5 = 0;
        P p10 = this.f3340E5;
        if (p10 != null) {
            p10.r();
        } else {
            this.f3375u5.h();
        }
    }

    public boolean k3(v1.t tVar) {
        if (this.f3362a6 || q2(tVar.f66986a)) {
            return false;
        }
        return !tVar.f66992g || PlaceholderSurface.b(this.f3370p5);
    }

    @Override // androidx.media3.exoplayer.p
    public void l() {
        P p10 = this.f3340E5;
        if (p10 == null) {
            this.f3375u5.a();
            return;
        }
        int i10 = this.f3342G5;
        if (i10 == 0 || i10 == 1) {
            this.f3342G5 = 0;
        } else {
            p10.p();
        }
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void l0() {
        K2();
        M2();
        P p10 = this.f3340E5;
        if (p10 != null) {
            p10.q();
        } else {
            this.f3375u5.i();
        }
        A a10 = this.f3379y5;
        if (a10 != null) {
            a10.d();
        }
        super.l0();
    }

    public void l3(InterfaceC6627q interfaceC6627q, int i10, long j10) {
        T.a("skipVideoBuffer");
        interfaceC6627q.releaseOutputBuffer(i10, false);
        T.b();
        this.f66869h5.f56201f++;
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c
    public void m0(androidx.media3.common.a[] aVarArr, long j10, long j11, D.b bVar) {
        super.m0(aVarArr, j10, j11, bVar);
        q3(bVar);
        A a10 = this.f3379y5;
        if (a10 != null) {
            a10.d();
        }
    }

    public void o3(int i10, int i11) {
        C5507g c5507g = this.f66869h5;
        c5507g.f56203h += i10;
        int i12 = i10 + i11;
        c5507g.f56202g += i12;
        this.f3351P5 += i12;
        int i13 = this.f3352Q5 + i12;
        this.f3352Q5 = i13;
        c5507g.f56204i = Math.max(i13, c5507g.f56204i);
        int i14 = this.f3373s5;
        if (i14 <= 0 || this.f3351P5 < i14) {
            return;
        }
        K2();
    }

    @Override // v1.AbstractC6596A
    public boolean p1(androidx.media3.common.a aVar) {
        P p10 = this.f3340E5;
        if (p10 == null || p10.isInitialized()) {
            return true;
        }
        try {
            return this.f3340E5.o(aVar);
        } catch (P.c e10) {
            throw R(e10, aVar, 7000);
        }
    }

    public void p2(P p10, int i10, androidx.media3.common.a aVar, int i11) {
        List list = this.f3343H5;
        if (list == null) {
            list = AbstractC3445z.t();
        }
        p10.k(i10, aVar, Z0(), i11, list);
    }

    public final void p3(long j10) {
        int i10 = 0;
        while (true) {
            Long l10 = (Long) this.f3380z5.peek();
            if (l10 == null || l10.longValue() >= j10) {
                break;
            }
            i10++;
            this.f3380z5.poll();
        }
        o3(i10, 0);
    }

    @Override // v1.AbstractC6596A
    public void q1(Exception exc) {
        AbstractC4156x.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f3372r5.s(exc);
    }

    public boolean q2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C1149k.class) {
            try {
                if (!f3334i6) {
                    f3335j6 = w2();
                    f3334i6 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3335j6;
    }

    public final void q3(D.b bVar) {
        AbstractC2346O b02 = b0();
        if (b02.q()) {
            this.f3367f6 = -9223372036854775807L;
        } else {
            this.f3367f6 = b02.h(((D.b) AbstractC4134a.e(bVar)).f21516a, new AbstractC2346O.b()).k();
        }
    }

    @Override // v1.AbstractC6596A
    public void r1(String str, InterfaceC6627q.a aVar, long j10, long j11) {
        this.f3372r5.k(str, j10, j11);
        this.f3338C5 = q2(str);
        this.f3339D5 = ((v1.t) AbstractC4134a.e(P0())).q();
        R2();
    }

    public final void r2() {
        this.f3340E5.j(new a(), Ta.r.a());
        y yVar = this.f3365d6;
        if (yVar != null) {
            this.f3340E5.t(yVar);
        }
        if (this.f3344I5 != null && !this.f3346K5.equals(e1.L.f45487c)) {
            this.f3340E5.x(this.f3344I5, this.f3346K5);
        }
        this.f3340E5.u(this.f3349N5);
        this.f3340E5.v(a1());
        List list = this.f3343H5;
        if (list != null) {
            this.f3340E5.m(list);
        }
    }

    public void r3(long j10) {
        this.f66869h5.a(j10);
        this.f3356U5 += j10;
        this.f3357V5++;
    }

    @Override // v1.AbstractC6596A
    public void s1(String str) {
        this.f3372r5.l(str);
    }

    public C1154p s2(Context context, z zVar) {
        return new C1154p.b(context, zVar).h(true).g(T()).f();
    }

    @Override // v1.AbstractC6596A, androidx.media3.exoplayer.c, androidx.media3.exoplayer.o.b
    public void t(int i10, Object obj) {
        if (i10 == 1) {
            b3(obj);
            return;
        }
        if (i10 == 7) {
            y yVar = (y) AbstractC4134a.e(obj);
            this.f3365d6 = yVar;
            P p10 = this.f3340E5;
            if (p10 != null) {
                p10.t(yVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int intValue = ((Integer) AbstractC4134a.e(obj)).intValue();
            if (this.f3363b6 != intValue) {
                this.f3363b6 = intValue;
                if (this.f3362a6) {
                    F1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            this.f3348M5 = ((Integer) AbstractC4134a.e(obj)).intValue();
            InterfaceC6627q N02 = N0();
            if (N02 != null) {
                N02.c(this.f3348M5);
                return;
            }
            return;
        }
        if (i10 == 5) {
            int intValue2 = ((Integer) AbstractC4134a.e(obj)).intValue();
            this.f3349N5 = intValue2;
            P p11 = this.f3340E5;
            if (p11 != null) {
                p11.u(intValue2);
                return;
            } else {
                this.f3375u5.l(intValue2);
                return;
            }
        }
        if (i10 == 13) {
            e3((List) AbstractC4134a.e(obj));
            return;
        }
        if (i10 == 14) {
            e1.L l10 = (e1.L) AbstractC4134a.e(obj);
            if (l10.b() == 0 || l10.a() == 0) {
                return;
            }
            this.f3346K5 = l10;
            P p12 = this.f3340E5;
            if (p12 != null) {
                p12.x((Surface) AbstractC4134a.i(this.f3344I5), l10);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                this.f3361Z5 = ((Integer) AbstractC4134a.e(obj)).intValue();
                n3();
                break;
            case 17:
                Surface surface = this.f3344I5;
                b3(null);
                ((C1149k) AbstractC4134a.e(obj)).t(1, surface);
                break;
            case 18:
                n1 n1Var = this.f3354S5;
                boolean z10 = n1Var != null && n1Var.f56283d;
                n1 n1Var2 = (n1) obj;
                this.f3354S5 = n1Var2;
                if (z10 != (n1Var2 != null && n1Var2.f56283d)) {
                    c2();
                    break;
                }
                break;
            default:
                super.t(i10, obj);
                break;
        }
    }

    @Override // v1.AbstractC6596A
    public C5509h t1(O0 o02) {
        C5509h t12 = super.t1(o02);
        this.f3372r5.p((androidx.media3.common.a) AbstractC4134a.e(o02.f56121b), t12);
        A a10 = this.f3379y5;
        if (a10 != null) {
            a10.d();
        }
        return t12;
    }

    public void t2(InterfaceC6627q interfaceC6627q) {
        interfaceC6627q.b();
    }

    @Override // v1.AbstractC6596A
    public C5509h u0(v1.t tVar, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        C5509h e10 = tVar.e(aVar, aVar2);
        int i10 = e10.f56215e;
        e eVar = (e) AbstractC4134a.e(this.f3337B5);
        if (aVar2.f20550v > eVar.f3400a || aVar2.f20551w > eVar.f3401b) {
            i10 |= 256;
        }
        if (C2(tVar, aVar2) > eVar.f3402c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C5509h(tVar.f66986a, aVar, aVar2, i11 != 0 ? 0 : e10.f56214d, i11);
    }

    @Override // v1.AbstractC6596A
    public void u1(androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        InterfaceC6627q N02 = N0();
        if (N02 != null) {
            N02.c(this.f3348M5);
        }
        if (this.f3362a6) {
            i10 = aVar.f20550v;
            integer = aVar.f20551w;
        } else {
            AbstractC4134a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = aVar.f20514B;
        int i11 = aVar.f20513A;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f3359X5 = new Y(i10, integer, f10);
        P p10 = this.f3340E5;
        if (p10 == null || !this.f3368g6) {
            this.f3375u5.n(aVar.f20554z);
        } else {
            p2(p10, 1, aVar.b().F0(i10).h0(integer).u0(f10).P(), this.f3342G5);
            this.f3342G5 = 2;
        }
        this.f3368g6 = false;
    }

    public void v2(InterfaceC6627q interfaceC6627q, int i10, long j10) {
        T.a("dropVideoBuffer");
        interfaceC6627q.releaseOutputBuffer(i10, false);
        T.b();
        o3(0, 1);
    }

    @Override // v1.AbstractC6596A
    public void w1(long j10) {
        super.w1(j10);
        if (this.f3362a6) {
            return;
        }
        this.f3353R5--;
    }

    @Override // F1.z.b
    public boolean x(long j10, long j11) {
        return h3(j10, j11);
    }

    @Override // v1.AbstractC6596A
    public void x1() {
        super.x1();
        P p10 = this.f3340E5;
        if (p10 != null) {
            p10.g();
            if (this.f3366e6 == -9223372036854775807L) {
                this.f3366e6 = Z0();
            }
            this.f3340E5.l(x2());
        } else {
            this.f3375u5.j(2);
        }
        this.f3368g6 = true;
        R2();
    }

    public long x2() {
        return -this.f3366e6;
    }

    @Override // v1.AbstractC6596A
    public void y1(k1.f fVar) {
        ByteBuffer byteBuffer;
        if (this.f3377w5 != null && ((v1.t) AbstractC4134a.e(P0())).f66987b.equals("video/av01") && (byteBuffer = fVar.f54108d) != null) {
            this.f3377w5.b(byteBuffer);
        }
        this.f3369h6 = 0;
        int O02 = O0(fVar);
        if ((Build.VERSION.SDK_INT < 34 || (O02 & 32) == 0) && !this.f3362a6) {
            this.f3353R5++;
        }
    }

    @Override // F1.z.b
    public boolean z(long j10, long j11, long j12, boolean z10, boolean z11) {
        if (this.f3340E5 != null && this.f3371q5) {
            j11 -= x2();
        }
        return f3(j10, j12, z10) && J2(j11, z11);
    }

    /* renamed from: F1.k$a */
    public class a implements P.a {
        public a() {
        }

        @Override // F1.P.a
        public void a(P.c cVar) {
            C1149k c1149k = C1149k.this;
            c1149k.Q1(c1149k.R(cVar, cVar.f3301a, 7001));
        }

        @Override // F1.P.a
        public void f() {
            if (C1149k.this.f3344I5 != null) {
                C1149k.this.T2();
            }
        }

        @Override // F1.P.a
        public void i() {
            p.a b12 = C1149k.this.b1();
            if (b12 != null) {
                b12.b();
            }
        }

        @Override // F1.P.a
        public void onFrameDropped() {
            if (C1149k.this.f3344I5 != null) {
                C1149k.this.o3(0, 1);
            }
        }

        @Override // F1.P.a
        public void c(Y y10) {
        }
    }
}
