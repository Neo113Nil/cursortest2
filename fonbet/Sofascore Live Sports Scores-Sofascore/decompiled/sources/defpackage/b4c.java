package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.b;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.facebook.ads.AdError;
import com.ironsource.C4427z5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b4c extends h3c {
    public static boolean A1;
    public static boolean B1;
    public static final int[] z1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final Context G0;
    public final boolean H0;
    public final ro0 I0;
    public final int J0;
    public final boolean K0;
    public final ppk L0;
    public final h12 M0;
    public final f4a N0;
    public final long O0;
    public final qpk P0;
    public final PriorityQueue Q0;
    public k9 R0;
    public boolean S0;
    public boolean T0;
    public xqk U0;
    public boolean V0;
    public int W0;
    public List X0;
    public Surface Y0;
    public PlaceholderSurface Z0;
    public ijh a1;
    public boolean b1;
    public int c1;
    public int d1;
    public long e1;
    public int f1;
    public int g1;
    public int h1;
    public vvg i1;
    public long j1;
    public boolean k1;
    public long l1;
    public int m1;
    public long n1;
    public zqk o1;
    public zqk p1;
    public int q1;
    public boolean r1;
    public int s1;
    public z3c t1;
    public npk u1;
    public long v1;
    public long w1;
    public boolean x1;
    public int y1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b4c(y3c y3cVar) {
        super(r0.getApplicationContext(), 2, y3cVar.c, y3cVar.e, 30.0f);
        Context context = y3cVar.a;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        this.J0 = y3cVar.h;
        this.U0 = null;
        this.I0 = new ro0(y3cVar.f, y3cVar.g, 1);
        this.H0 = this.U0 == null;
        this.L0 = new ppk(applicationContext, this, y3cVar.d);
        this.M0 = new h12(4);
        this.K0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.a1 = ijh.c;
        this.c1 = 1;
        this.d1 = 0;
        this.o1 = zqk.d;
        this.s1 = 0;
        this.p1 = null;
        this.q1 = -1000;
        this.v1 = C.TIME_UNSET;
        this.w1 = C.TIME_UNSET;
        this.N0 = new f4a((byte) 0, 28);
        this.Q0 = new PriorityQueue();
        this.O0 = -15000L;
        this.P0 = new qpk(0);
        this.i1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0736, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08b7, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean B0(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (b4c.class) {
            try {
                if (!A1) {
                    int i = Build.VERSION.SDK_INT;
                    char c = 28;
                    if (i <= 28) {
                        String str2 = Build.DEVICE;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z2 = 3;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z2 = 4;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z2 = 5;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z2 = 6;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z2 = 7;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z3 = true;
                                break;
                        }
                        B1 = z3;
                        A1 = true;
                    }
                    if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    z = false;
                                    break;
                                }
                                z = -1;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    z = 6;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    z = 7;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    z = 8;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            default:
                                if (i <= 26) {
                                    String str4 = Build.DEVICE;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c = '\t';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c = '\n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c = 11;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c = '\f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c = '\r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c = 14;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c = 15;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c = 16;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c = 17;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c = 18;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c = 19;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c = 20;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c = 21;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c = 22;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c = 23;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c = 24;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c = 25;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -993250458:
                                            if (str4.equals("A10-70L")) {
                                                c = 26;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c = 27;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -958336948:
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c = 29;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c = 30;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c = 31;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c = ' ';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c = '!';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c = '\"';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c = '#';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c = '$';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c = '%';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c = '&';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c = '\'';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c = '(';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c = ')';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c = '*';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c = '+';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c = ',';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c = '-';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c = '.';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c = '/';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c = '0';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c = '1';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c = '2';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c = '3';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c = '4';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c = '5';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c = '6';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c = '7';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c = '8';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c = '9';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c = ':';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c = ';';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c = '<';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c = C4427z5.U;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c = '>';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c = '?';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c = '@';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c = 'A';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c = 'B';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c = 'C';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c = 'D';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c = 'E';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c = 'F';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c = 'G';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c = 'H';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c = 'I';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c = 'J';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c = 'K';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c = 'L';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c = 'M';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c = 'N';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c = 'O';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c = 'P';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c = 'Q';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c = 'R';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c = 'S';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c = 'T';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c = 'U';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c = 'V';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c = 'W';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c = 'X';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c = 'Y';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c = 'Z';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c = '[';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c = '\\';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c = ']';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c = '^';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c = '_';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c = '`';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c = 'a';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c = 'b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c = 'c';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c = 'd';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c = 'e';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c = 'f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c = 'g';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c = 'h';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c = 'i';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c = 'j';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c = 'k';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c = 'l';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c = 'm';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c = 'n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c = 'o';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c = 'p';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c = 'q';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c = 'r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c = 's';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c = 't';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c = 'u';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c = 'v';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c = 'w';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c = 'x';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c = 'y';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c = 'z';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c = '{';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c = '|';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c = '}';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c = '~';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c = 127;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c = 128;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c = 129;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c = 130;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c = 131;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c = 132;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c = 133;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c = 134;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c = 135;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c = 136;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c = 137;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c = 138;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c = 139;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                    }
                                }
                                break;
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                break;
                        }
                        B1 = z3;
                        A1 = true;
                    }
                    z3 = true;
                    B1 = z3;
                    A1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return B1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int C0(a3c a3cVar, b bVar) {
        int i = bVar.v;
        int i2 = bVar.w;
        if (i != -1 && i2 != -1) {
            String str = bVar.o;
            str.getClass();
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair b = wz2.b(bVar);
                if (b != null) {
                    int intValue = ((Integer) b.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = MimeTypes.VIDEO_AV1;
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H263)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i * i2) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !a3cVar.f)))) {
                        return ((nik.g(i2, 16) * nik.g(i, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List D0(Context context, b bVar, boolean z, boolean z2) {
        List e;
        String str = bVar.o;
        if (str == null) {
            av9 av9Var = hv9.b;
            return vvf.e;
        }
        if ("video/dolby-vision".equals(str) && !i9a.y(context)) {
            String c = s3c.c(bVar);
            if (c == null) {
                av9 av9Var2 = hv9.b;
                e = vvf.e;
            } else {
                e = s3c.e(c, z, z2);
            }
            if (!e.isEmpty()) {
                return e;
            }
        }
        return s3c.g(bVar, z, z2);
    }

    public static int E0(a3c a3cVar, b bVar) {
        int i = bVar.p;
        List list = bVar.r;
        if (i == -1) {
            return C0(a3cVar, bVar);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return bVar.p + i2;
    }

    @Override // defpackage.n51
    public final boolean C(long j) {
        if (this.p0 == C.TIME_UNSET || j < this.j1) {
            return false;
        }
        long j2 = this.x0;
        return j2 == C.TIME_UNSET || j > j2;
    }

    @Override // defpackage.h3c
    public final lm4 F(a3c a3cVar, b bVar, b bVar2, boolean z) {
        int i;
        lm4 b = a3cVar.b(bVar, bVar2);
        float f = bVar.z;
        float f2 = bVar2.z;
        int i2 = b.e;
        k9 k9Var = this.R0;
        k9Var.getClass();
        if (bVar2.v > k9Var.a || bVar2.w > k9Var.b) {
            i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (E0(a3cVar, bVar2) > k9Var.c) {
            i2 |= 64;
        }
        if (this.d1 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!a3cVar.f || !z))) {
            if (Math.abs((Math.max(f2, f) / Math.min(f2, f)) - Math.round(r10)) > 0.01f) {
                i2 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
            }
        }
        int i3 = i2;
        return new lm4(a3cVar.a, bVar, bVar2, i3 != 0 ? 0 : b.d, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface F0(a3c a3cVar) {
        boolean z;
        yhe yheVar;
        xqk xqkVar = this.U0;
        if (xqkVar != null) {
            return xqkVar.l();
        }
        Surface surface = this.Y0;
        if (surface != null) {
            return surface;
        }
        PlaceholderSurface placeholderSurface = null;
        if (Build.VERSION.SDK_INT >= 35 && a3cVar.h) {
            return null;
        }
        z1a.E(N0(a3cVar));
        PlaceholderSurface placeholderSurface2 = this.Z0;
        if (placeholderSurface2 != null && placeholderSurface2.a != a3cVar.f) {
            if (placeholderSurface2 != null) {
                placeholderSurface2.release();
                this.Z0 = null;
            } else {
                placeholderSurface = placeholderSurface2;
            }
            placeholderSurface2 = placeholderSurface;
        }
        if (placeholderSurface2 != null) {
            return placeholderSurface2;
        }
        boolean z2 = a3cVar.f;
        int i = 1;
        boolean z3 = false;
        if (!z2) {
            int i2 = PlaceholderSurface.d;
        } else if (!PlaceholderSurface.a()) {
            z = false;
            z1a.E(z);
            yheVar = new yhe("ExoPlayer:PlaceholderSurface", i);
            int i3 = !z2 ? PlaceholderSurface.d : 0;
            yheVar.start();
            Handler handler = new Handler(yheVar.getLooper(), yheVar);
            yheVar.b = handler;
            yheVar.e = new tf5(handler, 1);
            synchronized (yheVar) {
                yheVar.b.obtainMessage(1, i3, 0).sendToTarget();
                while (((PlaceholderSurface) yheVar.f) == null && yheVar.d == null && yheVar.c == null) {
                    try {
                        yheVar.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = yheVar.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = yheVar.c;
            if (error != null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface3 = (PlaceholderSurface) yheVar.f;
            placeholderSurface3.getClass();
            this.Z0 = placeholderSurface3;
            return placeholderSurface3;
        }
        z = true;
        z1a.E(z);
        yheVar = new yhe("ExoPlayer:PlaceholderSurface", i);
        if (!z2) {
        }
        yheVar.start();
        Handler handler2 = new Handler(yheVar.getLooper(), yheVar);
        yheVar.b = handler2;
        yheVar.e = new tf5(handler2, 1);
        synchronized (yheVar) {
        }
    }

    @Override // defpackage.h3c
    public final x2c G(IllegalStateException illegalStateException, a3c a3cVar) {
        Surface surface = this.Y0;
        u3c u3cVar = new u3c(illegalStateException, a3cVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return u3cVar;
    }

    public final boolean G0(a3c a3cVar) {
        if (this.U0 != null) {
            return true;
        }
        Surface surface = this.Y0;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && a3cVar.h) || N0(a3cVar);
        }
        return true;
    }

    public final boolean H0(im4 im4Var) {
        if (i() || im4Var.i(536870912)) {
            return true;
        }
        long j = this.w1;
        return j == C.TIME_UNSET || j - (im4Var.k - this.w0.c) <= 100000;
    }

    public final void I0() {
        if (this.f1 > 0) {
            this.g.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.e1;
            int i = this.f1;
            ro0 ro0Var = this.I0;
            Handler handler = ro0Var.a;
            if (handler != null) {
                handler.post(new sqk(ro0Var, i, j));
            }
            this.f1 = 0;
            this.e1 = elapsedRealtime;
        }
    }

    public final void J0() {
        r2c r2cVar;
        if (this.r1 && (r2cVar = this.M) != null) {
            this.t1 = new z3c(this, r2cVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                r2cVar.c(bundle);
            }
        }
    }

    public final void K0(r2c r2cVar, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        r2cVar.l(i, j);
        Trace.endSection();
        this.v0.f++;
        this.g1 = 0;
        if (this.U0 == null) {
            zqk zqkVar = this.o1;
            boolean equals = zqkVar.equals(zqk.d);
            ro0 ro0Var = this.I0;
            if (!equals && !zqkVar.equals(this.p1)) {
                this.p1 = zqkVar;
                ro0Var.b(zqkVar);
            }
            ppk ppkVar = this.L0;
            boolean z = ppkVar.e != 3;
            ppkVar.e = 3;
            ppkVar.l.getClass();
            ppkVar.g = nik.T(SystemClock.elapsedRealtime());
            if (!z || (surface = this.Y0) == null) {
                return;
            }
            Handler handler = ro0Var.a;
            if (handler != null) {
                handler.post(new jd(ro0Var, surface, SystemClock.elapsedRealtime(), 6));
            }
            this.b1 = true;
        }
    }

    public final void L0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.Y0;
        ro0 ro0Var = this.I0;
        if (surface2 == surface) {
            if (surface != null) {
                zqk zqkVar = this.p1;
                if (zqkVar != null) {
                    ro0Var.b(zqkVar);
                }
                Surface surface3 = this.Y0;
                if (surface3 == null || !this.b1 || (handler = ro0Var.a) == null) {
                    return;
                }
                handler.post(new jd(ro0Var, surface3, SystemClock.elapsedRealtime(), 6));
                return;
            }
            return;
        }
        this.Y0 = surface;
        xqk xqkVar = this.U0;
        ppk ppkVar = this.L0;
        if (xqkVar == null) {
            ppkVar.g(surface);
        }
        this.b1 = false;
        int i = this.h;
        r2c r2cVar = this.M;
        if (r2cVar != null && this.U0 == null) {
            a3c a3cVar = this.T;
            a3cVar.getClass();
            if (!G0(a3cVar) || this.S0) {
                l0();
                V();
            } else {
                Surface F0 = F0(a3cVar);
                if (F0 != null) {
                    r2cVar.i(F0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        zzl.s();
                        return;
                    }
                    r2cVar.t();
                }
            }
        }
        if (surface != null) {
            zqk zqkVar2 = this.p1;
            if (zqkVar2 != null) {
                ro0Var.b(zqkVar2);
            }
        } else {
            this.p1 = null;
            xqk xqkVar2 = this.U0;
            if (xqkVar2 != null) {
                xqkVar2.p();
            }
        }
        if (i == 2) {
            xqk xqkVar3 = this.U0;
            if (xqkVar3 != null) {
                xqkVar3.s(true);
            } else {
                ppkVar.c(true);
            }
        }
        J0();
    }

    @Override // defpackage.h3c
    public final int M(im4 im4Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.i1 == null && !this.r1) || im4Var.k >= this.l || H0(im4Var)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean M0(long j, long j2, boolean z, boolean z2) {
        if (this.U0 != null && this.H0) {
            j2 -= -this.v1;
        }
        if (j < -500000 && !z) {
            jpg jpgVar = this.i;
            jpgVar.getClass();
            int skipData = jpgVar.skipData(j2 - this.k);
            if (skipData != 0) {
                this.j1 = j2;
                dm4 dm4Var = this.v0;
                PriorityQueue priorityQueue = this.Q0;
                if (z2) {
                    int i = dm4Var.e + skipData;
                    dm4Var.e = i;
                    dm4Var.g += this.h1;
                    dm4Var.e = priorityQueue.size() + i;
                } else {
                    dm4Var.k++;
                    P0(priorityQueue.size() + skipData, this.h1);
                }
                if (this.M != null) {
                    if (v0()) {
                        l0();
                        V();
                    } else if (t0()) {
                        K();
                    } else {
                        this.A0 = true;
                    }
                }
                xqk xqkVar = this.U0;
                if (xqkVar != null) {
                    xqkVar.r(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h3c
    public final float N(float f, b bVar, b[] bVarArr) {
        a3c a3cVar;
        float f2 = -1.0f;
        for (b bVar2 : bVarArr) {
            float f3 = bVar2.z;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.i1 == null || (a3cVar = this.T) == null) {
            return f4;
        }
        int i = bVar.v;
        int i2 = bVar.w;
        float f5 = -3.4028235E38f;
        if (a3cVar.i) {
            float f6 = a3cVar.l;
            if (f6 != -3.4028235E38f && a3cVar.j == i && a3cVar.k == i2) {
                f5 = f6;
            } else {
                f5 = 1024.0f;
                if (!a3cVar.g(i, i2, 1024.0d)) {
                    float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (true) {
                        float f8 = f5 - f7;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f7;
                        if (a3cVar.g(i, i2, f9)) {
                            f7 = f9;
                        } else {
                            f5 = f9;
                        }
                    }
                    f5 = f7;
                }
                a3cVar.l = f5;
                a3cVar.j = i;
                a3cVar.k = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    public final boolean N0(a3c a3cVar) {
        if (this.r1 || B0(a3cVar.a)) {
            return false;
        }
        return !a3cVar.f || PlaceholderSurface.a();
    }

    @Override // defpackage.h3c
    public final ArrayList O(b bVar, boolean z) {
        boolean z2 = this.r1;
        Context context = this.G0;
        List D0 = D0(context, bVar, z, z2);
        HashMap hashMap = s3c.a;
        ArrayList arrayList = new ArrayList(D0);
        Collections.sort(arrayList, new rs2(new ow9(2, context, bVar), 6));
        return arrayList;
    }

    public final void O0(r2c r2cVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        r2cVar.x(i);
        Trace.endSection();
        this.v0.g++;
    }

    public final void P0(int i, int i2) {
        dm4 dm4Var = this.v0;
        dm4Var.i += i;
        int i3 = i + i2;
        dm4Var.h += i3;
        this.f1 += i3;
        int i4 = this.g1 + i3;
        this.g1 = i4;
        dm4Var.j = Math.max(i4, dm4Var.j);
        int i5 = this.J0;
        if (i5 <= 0 || this.f1 < i5) {
            return;
        }
        I0();
    }

    public final void Q0(scc sccVar) {
        mij mijVar = this.p;
        if (mijVar.p()) {
            this.w1 = C.TIME_UNSET;
            return;
        }
        int b = mijVar.b(sccVar.a);
        if (b == -1) {
            this.w1 = C.TIME_UNSET;
        } else {
            this.w1 = mijVar.f(b, new iij(), false).d;
        }
    }

    @Override // defpackage.h3c
    public final vng R(a3c a3cVar, b bVar, MediaCrypto mediaCrypto, float f) {
        w13 w13Var;
        int i;
        k9 k9Var;
        Point point;
        int i2;
        Point point2;
        int i3;
        char c;
        boolean z;
        Pair b;
        int C0;
        String str = a3cVar.c;
        b[] bVarArr = this.j;
        bVarArr.getClass();
        int i4 = bVar.v;
        float f2 = bVar.z;
        w13 w13Var2 = bVar.E;
        int i5 = bVar.w;
        int E0 = E0(a3cVar, bVar);
        if (bVarArr.length == 1) {
            if (E0 != -1 && (C0 = C0(a3cVar, bVar)) != -1) {
                E0 = Math.min((int) (E0 * 1.5f), C0);
            }
            k9Var = new k9(i4, i5, E0);
            w13Var = w13Var2;
            i = i5;
        } else {
            int length = bVarArr.length;
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z2 = false;
            while (i8 < length) {
                b bVar2 = bVarArr[i8];
                b[] bVarArr2 = bVarArr;
                if (w13Var2 != null && bVar2.E == null) {
                    qm8 a = bVar2.a();
                    a.D = w13Var2;
                    bVar2 = new b(a);
                }
                lm4 b2 = a3cVar.b(bVar, bVar2);
                int i9 = length;
                int i10 = bVar2.w;
                if (b2.d != 0) {
                    int i11 = bVar2.v;
                    i3 = i8;
                    c = 65535;
                    z2 |= i11 == -1 || i10 == -1;
                    i6 = Math.max(i6, i11);
                    i7 = Math.max(i7, i10);
                    E0 = Math.max(E0, E0(a3cVar, bVar2));
                } else {
                    i3 = i8;
                    c = 65535;
                }
                length = i9;
                i8 = i3 + 1;
                bVarArr = bVarArr2;
            }
            if (z2) {
                tgj.d0("Resolutions unknown. Codec max resolution: " + i6 + "x" + i7);
                boolean z3 = i5 > i4;
                int i12 = z3 ? i5 : i4;
                int i13 = z3 ? i4 : i5;
                boolean z4 = z3;
                float f3 = i13 / i12;
                int i14 = 0;
                while (i14 < 9) {
                    int i15 = z1[i14];
                    int i16 = i14;
                    int i17 = (int) (i15 * f3);
                    if (i15 <= i12 || i17 <= i13) {
                        break;
                    }
                    if (z4) {
                        i15 = i17;
                    }
                    if (z4) {
                        i17 = i15;
                    }
                    int i18 = i12;
                    MediaCodecInfo.VideoCapabilities videoCapabilities = a3cVar.d.getVideoCapabilities();
                    if (videoCapabilities == null) {
                        w13Var = w13Var2;
                        i2 = i13;
                        point2 = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i2 = i13;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        w13Var = w13Var2;
                        point2 = new Point(nik.g(i15, widthAlignment) * widthAlignment, nik.g(i17, heightAlignment) * heightAlignment);
                    }
                    if (point2 != null) {
                        point = point2;
                        i = i5;
                        if (a3cVar.g(point2.x, point2.y, f2)) {
                            break;
                        }
                    } else {
                        i = i5;
                    }
                    i14 = i16 + 1;
                    i5 = i;
                    i12 = i18;
                    w13Var2 = w13Var;
                    i13 = i2;
                }
                w13Var = w13Var2;
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    qm8 a2 = bVar.a();
                    a2.u = i6;
                    a2.v = i7;
                    E0 = Math.max(E0, C0(a3cVar, new b(a2)));
                    tgj.d0("Codec max resolution adjusted to: " + i6 + "x" + i7);
                }
            } else {
                w13Var = w13Var2;
                i = i5;
            }
            k9Var = new k9(i6, i7, E0);
        }
        this.R0 = k9Var;
        int i19 = this.r1 ? this.s1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i);
        yaa.R(mediaFormat, bVar.r);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        yaa.H(mediaFormat, "rotation-degrees", bVar.A);
        if (w13Var != null) {
            w13 w13Var3 = w13Var;
            yaa.H(mediaFormat, "color-transfer", w13Var3.c);
            yaa.H(mediaFormat, "color-standard", w13Var3.a);
            yaa.H(mediaFormat, "color-range", w13Var3.b);
            byte[] bArr = w13Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(bVar.o) && (b = wz2.b(bVar)) != null) {
            yaa.H(mediaFormat, "profile", ((Integer) b.first).intValue());
        }
        mediaFormat.setInteger("max-width", k9Var.a);
        mediaFormat.setInteger("max-height", k9Var.b);
        yaa.H(mediaFormat, "max-input-size", k9Var.c);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.K0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.q1));
        }
        D(mediaFormat);
        Surface F0 = F0(a3cVar);
        if (this.U0 != null && !nik.Q(this.G0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new vng(a3cVar, mediaFormat, bVar, F0, mediaCrypto, null);
    }

    public final void R0(long j) {
        dm4 dm4Var = this.v0;
        dm4Var.l += j;
        dm4Var.m++;
        this.l1 += j;
        this.m1++;
    }

    @Override // defpackage.h3c
    public final void S(im4 im4Var) {
        if (this.T0) {
            ByteBuffer byteBuffer = im4Var.l;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        r2c r2cVar = this.M;
                        r2cVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        r2cVar.c(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.h3c
    public final boolean X(b bVar) {
        xqk xqkVar = this.U0;
        if (xqkVar == null || xqkVar.isInitialized()) {
            return true;
        }
        try {
            return this.U0.j(bVar);
        } catch (wqk e) {
            throw this.d(e, bVar, false, 7000);
        }
    }

    @Override // defpackage.h3c
    public final void Y(Exception exc) {
        tgj.A("Video codec error", exc);
        ro0 ro0Var = this.I0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new sqk(ro0Var, exc, 1));
        }
    }

    @Override // defpackage.h3c
    public final void Z(String str, long j, long j2) {
        String str2;
        ro0 ro0Var = this.I0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            str2 = str;
            handler.post(new sqk(ro0Var, str2, j, j2));
        } else {
            str2 = str;
        }
        this.S0 = B0(str2);
        a3c a3cVar = this.T;
        a3cVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9.equals(a3cVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = a3cVar.d.profileLevels;
            if (codecProfileLevelArr == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.T0 = z;
        J0();
    }

    @Override // defpackage.h3c
    public final void a0(vz2 vz2Var) {
        ro0 ro0Var = this.I0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new ecg(21, ro0Var, vz2Var));
        }
    }

    @Override // defpackage.h3c
    public final void b0(String str) {
        ro0 ro0Var = this.I0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new sqk(ro0Var, str, 2));
        }
    }

    @Override // defpackage.h3c
    public final lm4 c0(fp4 fp4Var) {
        lm4 c0 = super.c0(fp4Var);
        b bVar = (b) fp4Var.c;
        bVar.getClass();
        ro0 ro0Var = this.I0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new sqk(ro0Var, bVar, c0));
        }
        qpk qpkVar = this.P0;
        if (qpkVar != null) {
            qpkVar.b();
        }
        return c0;
    }

    @Override // defpackage.h3c
    public final void d0(b bVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        r2c r2cVar = this.M;
        if (r2cVar != null) {
            r2cVar.setVideoScalingMode(this.c1);
        }
        if (this.r1) {
            i = bVar.v;
            integer = bVar.w;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = bVar.B;
        int i2 = bVar.A;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.o1 = new zqk(i, integer, f);
        xqk xqkVar = this.U0;
        if (xqkVar == null || !this.x1) {
            this.L0.f(bVar.z);
        } else {
            qm8 a = bVar.a();
            a.u = i;
            a.v = integer;
            a.A = f;
            b bVar2 = new b(a);
            int i4 = this.W0;
            List list = this.X0;
            if (list == null) {
                av9 av9Var = hv9.b;
                list = vvf.e;
            }
            xqkVar.e(bVar2, this.w0.b, i4, list);
            this.W0 = 2;
        }
        this.x1 = false;
    }

    @Override // defpackage.n51
    public final void e() {
        xqk xqkVar = this.U0;
        if (xqkVar == null) {
            ppk ppkVar = this.L0;
            if (ppkVar.e == 0) {
                ppkVar.e = 1;
                return;
            }
            return;
        }
        int i = this.W0;
        if (i == 0 || i == 1) {
            this.W0 = 0;
        } else {
            xqkVar.k();
        }
    }

    @Override // defpackage.h3c
    public final void f0(long j) {
        super.f0(j);
        if (this.r1) {
            return;
        }
        this.h1--;
    }

    @Override // defpackage.h3c
    public final void g0() {
        xqk xqkVar = this.U0;
        if (xqkVar != null) {
            xqkVar.c();
            long j = this.v1;
            if (j == C.TIME_UNSET) {
                j = this.w0.b;
                this.v1 = j;
            }
            this.U0.b(-j);
        } else {
            this.L0.e(2);
        }
        this.x1 = true;
        J0();
    }

    @Override // defpackage.n51
    public final String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.h3c
    public final void h0(im4 im4Var) {
        ByteBuffer byteBuffer;
        f4a f4aVar = this.N0;
        if (f4aVar != null) {
            a3c a3cVar = this.T;
            a3cVar.getClass();
            if (a3cVar.b.equals(MimeTypes.VIDEO_AV1) && im4Var.i(1) && (byteBuffer = im4Var.i) != null) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) f4aVar.b;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.y1 = 0;
        int M = M(im4Var);
        if ((Build.VERSION.SDK_INT < 34 || (M & 32) == 0) && !this.r1) {
            this.h1++;
        }
    }

    @Override // defpackage.h3c, defpackage.n51, defpackage.jte
    public final void handleMessage(int i, Object obj) {
        if (i == 1) {
            L0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            npk npkVar = (npk) obj;
            this.u1 = npkVar;
            xqk xqkVar = this.U0;
            if (xqkVar != null) {
                xqkVar.t(npkVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.s1 != intValue) {
                this.s1 = intValue;
                if (this.r1) {
                    l0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.c1 = intValue2;
            r2c r2cVar = this.M;
            if (r2cVar != null) {
                r2cVar.setVideoScalingMode(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.d1 = intValue3;
            xqk xqkVar2 = this.U0;
            if (xqkVar2 != null) {
                xqkVar2.o(intValue3);
                return;
            }
            zpk zpkVar = this.L0.b;
            if (zpkVar.j == intValue3) {
                return;
            }
            zpkVar.j = intValue3;
            zpkVar.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(opk.a)) {
                xqk xqkVar3 = this.U0;
                if (xqkVar3 == null || !xqkVar3.isInitialized()) {
                    return;
                }
                this.U0.h();
                return;
            }
            this.X0 = list;
            xqk xqkVar4 = this.U0;
            if (xqkVar4 != null) {
                xqkVar4.f(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            ijh ijhVar = (ijh) obj;
            if (ijhVar.a == 0 || ijhVar.b == 0) {
                return;
            }
            this.a1 = ijhVar;
            xqk xqkVar5 = this.U0;
            if (xqkVar5 != null) {
                Surface surface = this.Y0;
                surface.getClass();
                xqkVar5.i(surface, ijhVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.q1 = ((Integer) obj).intValue();
                r2c r2cVar2 = this.M;
                if (r2cVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.q1));
                    r2cVar2.c(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.Y0;
                L0(null);
                obj.getClass();
                ((b4c) obj).handleMessage(1, surface2);
                break;
            case 18:
                boolean z = this.i1 != null;
                vvg vvgVar = (vvg) obj;
                this.i1 = vvgVar;
                if (z != (vvgVar != null)) {
                    y0(this.N);
                    break;
                }
                break;
            default:
                super.handleMessage(i, obj);
                break;
        }
    }

    @Override // defpackage.n51
    public final boolean j() {
        if (!this.r0) {
            return false;
        }
        xqk xqkVar = this.U0;
        return xqkVar == null || xqkVar.isEnded();
    }

    @Override // defpackage.h3c
    public final boolean j0(long j, long j2, r2c r2cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, b bVar) {
        int i4;
        r2cVar.getClass();
        long j4 = j3 - this.w0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.Q0;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        P0(i5, 0);
        xqk xqkVar = this.U0;
        if (xqkVar != null) {
            if (!z || z2) {
                return xqkVar.q(j3, new w3c(this, r2cVar, i, j4));
            }
            O0(r2cVar, i);
            return true;
        }
        int a = this.L0.a(j3, j, j2, this.w0.b, z, z2, this.M0);
        h12 h12Var = this.M0;
        qpk qpkVar = this.P0;
        if (qpkVar != null && a != 5 && a != 4) {
            qpkVar.a(j3, h12Var.a);
        }
        if (a == 0) {
            this.g.getClass();
            long nanoTime = System.nanoTime();
            npk npkVar = this.u1;
            if (npkVar != null) {
                npkVar.c(j4, nanoTime, bVar, this.O);
            }
            K0(r2cVar, i, nanoTime);
            R0(h12Var.a);
            return true;
        }
        if (a == 1) {
            long j5 = h12Var.b;
            long j6 = h12Var.a;
            if (j5 == this.n1) {
                O0(r2cVar, i);
            } else {
                npk npkVar2 = this.u1;
                if (npkVar2 != null) {
                    i4 = i;
                    npkVar2.c(j4, j5, bVar, this.O);
                } else {
                    i4 = i;
                }
                K0(r2cVar, i4, j5);
            }
            R0(j6);
            this.n1 = j5;
            return true;
        }
        if (a == 2) {
            Trace.beginSection("dropVideoBuffer");
            r2cVar.x(i);
            Trace.endSection();
            P0(0, 1);
            R0(h12Var.a);
            return true;
        }
        if (a == 3) {
            O0(r2cVar, i);
            R0(h12Var.a);
            return true;
        }
        if (a != 4 && a != 5) {
            a70.r(String.valueOf(a));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r6.a0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // defpackage.n51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l() {
        boolean z;
        xqk xqkVar;
        boolean isReady;
        if (this.E != null) {
            if (i()) {
                isReady = this.n;
            } else {
                jpg jpgVar = this.i;
                jpgVar.getClass();
                isReady = jpgVar.isReady();
            }
            if (!isReady && this.c0 < 0) {
                if (this.a0 != C.TIME_UNSET) {
                    this.g.getClass();
                }
            }
            z = true;
            xqkVar = this.U0;
            if (xqkVar == null) {
                return xqkVar.g(z);
            }
            if (z && (this.M == null || this.r1)) {
                return true;
            }
            return this.L0.b(z);
        }
        z = false;
        xqkVar = this.U0;
        if (xqkVar == null) {
        }
    }

    @Override // defpackage.h3c, defpackage.n51
    public final void m() {
        ro0 ro0Var = this.I0;
        this.p1 = null;
        this.w1 = C.TIME_UNSET;
        J0();
        this.b1 = false;
        this.t1 = null;
        this.k1 = true;
        int i = 24;
        try {
            super.m();
            dm4 dm4Var = this.v0;
            ro0Var.getClass();
            synchronized (dm4Var) {
            }
            Handler handler = ro0Var.a;
            if (handler != null) {
                handler.post(new ecg(i, ro0Var, dm4Var));
            }
            ro0Var.b(zqk.d);
        } catch (Throwable th) {
            dm4 dm4Var2 = this.v0;
            ro0Var.getClass();
            synchronized (dm4Var2) {
                Handler handler2 = ro0Var.a;
                if (handler2 != null) {
                    handler2.post(new ecg(i, ro0Var, dm4Var2));
                }
                ro0Var.b(zqk.d);
                throw th;
            }
        }
    }

    @Override // defpackage.h3c
    public final void m0() {
        xqk xqkVar = this.U0;
        if (xqkVar != null) {
            xqkVar.c();
        } else {
            long j = this.w0.f;
        }
    }

    @Override // defpackage.n51
    public final void n(boolean z, boolean z2) {
        xqk xqkVar;
        this.v0 = new dm4(1);
        syf syfVar = this.d;
        syfVar.getClass();
        boolean z3 = syfVar.b;
        z1a.E((z3 && this.s1 == 0) ? false : true);
        if (this.r1 != z3) {
            this.r1 = z3;
            l0();
        }
        dm4 dm4Var = this.v0;
        ro0 ro0Var = this.I0;
        Handler handler = ro0Var.a;
        if (handler != null) {
            handler.post(new sqk(ro0Var, dm4Var, 5));
        }
        boolean z4 = this.V0;
        ppk ppkVar = this.L0;
        if (!z4) {
            if (this.X0 != null && this.U0 == null) {
                lke lkeVar = new lke(this.G0, ppkVar);
                lkeVar.d = true;
                long j = this.O0;
                long j2 = C.TIME_UNSET;
                if (j != C.TIME_UNSET) {
                    j2 = -j;
                }
                lkeVar.g = j2;
                tqi tqiVar = this.g;
                tqiVar.getClass();
                lkeVar.e = tqiVar;
                z1a.E(!lkeVar.f);
                if (lkeVar.c == null) {
                    lkeVar.c = new oke();
                }
                qke qkeVar = new qke(lkeVar);
                lkeVar.f = true;
                if (1 >= qkeVar.p) {
                    qkeVar.p = 1;
                }
                SparseArray sparseArray = qkeVar.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    xqkVar = (xqk) sparseArray.get(0);
                } else {
                    mke mkeVar = new mke(qkeVar, qkeVar.a);
                    qkeVar.g.add(mkeVar);
                    sparseArray.put(0, mkeVar);
                    xqkVar = mkeVar;
                }
                this.U0 = xqkVar;
            }
            this.V0 = true;
        }
        xqk xqkVar2 = this.U0;
        if (xqkVar2 == null) {
            tqi tqiVar2 = this.g;
            tqiVar2.getClass();
            ppkVar.l = tqiVar2;
            ppkVar.e(!z2 ? 1 : 0);
            return;
        }
        xqkVar2.d(new v3c(this));
        npk npkVar = this.u1;
        if (npkVar != null) {
            this.U0.t(npkVar);
        }
        if (this.Y0 != null && !this.a1.equals(ijh.c)) {
            this.U0.i(this.Y0, this.a1);
        }
        this.U0.o(this.d1);
        this.U0.a(this.K);
        List list = this.X0;
        if (list != null) {
            this.U0.f(list);
        }
        this.W0 = !z2 ? 1 : 0;
        this.z0 = true;
    }

    @Override // defpackage.h3c, defpackage.n51
    public final void o(long j, boolean z, boolean z2) {
        xqk xqkVar = this.U0;
        if (xqkVar != null && !z) {
            xqkVar.r(true);
        }
        if (z2) {
            this.j1 = j;
        }
        super.o(j, z, z2);
        xqk xqkVar2 = this.U0;
        ppk ppkVar = this.L0;
        if (xqkVar2 == null) {
            ppkVar.b.b();
            ppkVar.h = C.TIME_UNSET;
            ppkVar.f = C.TIME_UNSET;
            ppkVar.e = Math.min(ppkVar.e, 1);
            ppkVar.i = C.TIME_UNSET;
            ppkVar.n = false;
        }
        qpk qpkVar = this.P0;
        if (qpkVar != null) {
            qpkVar.b();
        }
        if (z) {
            xqk xqkVar3 = this.U0;
            if (xqkVar3 != null) {
                xqkVar3.s(false);
            } else {
                ppkVar.c(false);
            }
        }
        J0();
        this.g1 = 0;
    }

    @Override // defpackage.h3c
    public final void o0() {
        super.o0();
        this.Q0.clear();
        this.h1 = 0;
        this.y1 = 0;
        this.k1 = false;
        f4a f4aVar = this.N0;
        if (f4aVar != null) {
            f4aVar.c = null;
            ByteBuffer byteBuffer = (ByteBuffer) f4aVar.b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // defpackage.n51
    public final void p() {
        xqk xqkVar = this.U0;
        if (xqkVar == null || !this.H0) {
            return;
        }
        xqkVar.release();
    }

    @Override // defpackage.n51
    public final void q() {
        try {
            try {
                this.f0 = false;
                n0();
                l0();
                xb5 xb5Var = this.H;
                if (xb5Var != null) {
                    xb5Var.d(null);
                }
                this.H = null;
            } catch (Throwable th) {
                xb5 xb5Var2 = this.H;
                if (xb5Var2 != null) {
                    xb5Var2.d(null);
                }
                this.H = null;
                throw th;
            }
        } finally {
            this.V0 = false;
            this.v1 = C.TIME_UNSET;
            PlaceholderSurface placeholderSurface = this.Z0;
            if (placeholderSurface != null) {
                placeholderSurface.release();
                this.Z0 = null;
            }
        }
    }

    @Override // defpackage.n51
    public final void r() {
        this.f1 = 0;
        this.g.getClass();
        this.e1 = SystemClock.elapsedRealtime();
        this.l1 = 0L;
        this.m1 = 0;
        xqk xqkVar = this.U0;
        if (xqkVar != null) {
            xqkVar.n();
        } else {
            this.L0.d();
        }
    }

    @Override // defpackage.n51
    public final void s() {
        I0();
        int i = this.m1;
        if (i != 0) {
            long j = this.l1;
            ro0 ro0Var = this.I0;
            Handler handler = ro0Var.a;
            if (handler != null) {
                handler.post(new sqk(ro0Var, j, i));
            }
            this.l1 = 0L;
            this.m1 = 0;
        }
        xqk xqkVar = this.U0;
        if (xqkVar != null) {
            xqkVar.m();
        } else {
            ppk ppkVar = this.L0;
            ppkVar.d = false;
            ppkVar.i = C.TIME_UNSET;
            zpk zpkVar = ppkVar.b;
            zpkVar.d = false;
            vpk vpkVar = zpkVar.c;
            if (vpkVar != null) {
                vpkVar.f();
            }
            zpkVar.a();
        }
        qpk qpkVar = this.P0;
        if (qpkVar != null) {
            qpkVar.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
    
        if ((r7 + 1) < 8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        if (r7 < 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        r2 = ((defpackage.xkd) r3.get(r7)).b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        r2 = r5.position();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // defpackage.h3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s0(im4 im4Var) {
        boolean z;
        ByteBuffer byteBuffer;
        ykd ykdVar;
        r0a r0aVar;
        boolean z2 = false;
        if (!H0(im4Var)) {
            boolean z3 = im4Var.k < this.l;
            qpk qpkVar = this.P0;
            if (qpkVar != null) {
                long j = qpkVar.a == C.TIME_UNSET ? -9223372036854775807L : (long) (((r2 - r6) * qpkVar.c) + qpkVar.b);
                if (j != C.TIME_UNSET && j < this.O0) {
                    z = true;
                    if ((!z3 || z) && !im4Var.i(268435456)) {
                        if (im4Var.i(67108864)) {
                            f4a f4aVar = this.N0;
                            if (f4aVar != null) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) f4aVar.b;
                                a3c a3cVar = this.T;
                                a3cVar.getClass();
                                if (a3cVar.b.equals(MimeTypes.VIDEO_AV1) && (byteBuffer = im4Var.i) != null) {
                                    boolean z4 = z3 || this.y1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        f4aVar.E(d2a.F(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList F = d2a.F(asReadOnlyBuffer);
                                    f4aVar.E(F);
                                    int size = F.size() - 1;
                                    int i = 0;
                                    while (size >= 0) {
                                        xkd xkdVar = (xkd) F.get(size);
                                        int i2 = xkdVar.a;
                                        if (i2 != 2 && i2 != 15) {
                                            if ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (ykdVar = (ykd) f4aVar.c) == null)) {
                                                break;
                                            }
                                            try {
                                                r0aVar = new r0a(ykdVar, xkdVar);
                                            } catch (wkd unused) {
                                                r0aVar = null;
                                            }
                                            if (r0aVar != null) {
                                                if (r0aVar.b) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((xkd) F.get(size)).a == 6 || ((xkd) F.get(size)).a == 3) {
                                            i++;
                                        }
                                        size--;
                                    }
                                    int limit = asReadOnlyBuffer.limit();
                                    if (limit == 0) {
                                        im4Var.A();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        k9 k9Var = this.R0;
                                        k9Var.getClass();
                                        if (k9Var.c + limit < asReadOnlyBuffer.capacity() && !im4Var.i(1073741824)) {
                                            ByteBuffer byteBuffer3 = im4Var.i;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z2) {
                                if (z3) {
                                    this.v0.e++;
                                } else {
                                    this.Q0.add(Long.valueOf(im4Var.k));
                                    this.y1++;
                                }
                            }
                            return z2;
                        }
                        im4Var.A();
                        z2 = true;
                        if (z2) {
                        }
                        return z2;
                    }
                }
            }
            z = false;
            if (!z3) {
            }
            if (im4Var.i(67108864)) {
            }
            z2 = true;
            if (z2) {
            }
            return z2;
        }
        return false;
    }

    @Override // defpackage.h3c, defpackage.n51
    public final void t(b[] bVarArr, long j, long j2, scc sccVar) {
        super.t(bVarArr, j, j2, sccVar);
        Q0(sccVar);
        qpk qpkVar = this.P0;
        if (qpkVar != null) {
            qpkVar.b();
        }
    }

    @Override // defpackage.h3c
    public final boolean t0() {
        boolean z;
        b bVar = this.N;
        long j = this.w1;
        if (j != C.TIME_UNSET) {
            if (this.B0 + 1 + j <= Long.MAX_VALUE - (this.w0.c + j)) {
                z = false;
                return this.i1 == null || this.k1 || this.r1 || (bVar != null && bVar.q > 0) || z || this.w0.f != C.TIME_UNSET;
            }
        }
        z = true;
        if (this.i1 == null) {
        }
    }

    @Override // defpackage.n51
    public final void u() {
        scc sccVar = this.q;
        if (sccVar != null) {
            Q0(sccVar);
        }
    }

    @Override // defpackage.h3c
    public final boolean u0(a3c a3cVar) {
        return G0(a3cVar);
    }

    @Override // defpackage.h3c
    public final boolean v0() {
        a3c a3cVar = this.T;
        if (this.U0 != null && a3cVar != null) {
            String str = a3cVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.v0();
    }

    @Override // defpackage.h3c, defpackage.n51
    public final void w(long j, long j2) {
        xqk xqkVar = this.U0;
        if (xqkVar != null) {
            try {
                xqkVar.render(j, j2);
            } catch (wqk e) {
                throw d(e, e.a, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.w(j, j2);
    }

    @Override // defpackage.h3c
    public final int x0(b bVar) {
        boolean z;
        int i = 0;
        if (!sjc.o(bVar.o)) {
            return n51.a(0, 0, 0, 0);
        }
        boolean z2 = bVar.s != null;
        Context context = this.G0;
        List D0 = D0(context, bVar, z2, false);
        if (z2 && D0.isEmpty()) {
            D0 = D0(context, bVar, false, false);
        }
        if (D0.isEmpty()) {
            return n51.a(1, 0, 0, 0);
        }
        int i2 = bVar.P;
        int i3 = 2;
        if (i2 != 0 && i2 != 2) {
            return n51.a(2, 0, 0, 0);
        }
        a3c a3cVar = (a3c) D0.get(0);
        boolean e = a3cVar.e(context, bVar);
        if (!e) {
            for (int i4 = 1; i4 < D0.size(); i4++) {
                a3c a3cVar2 = (a3c) D0.get(i4);
                if (a3cVar2.e(context, bVar)) {
                    z = false;
                    e = true;
                    a3cVar = a3cVar2;
                    break;
                }
            }
        }
        z = true;
        int i5 = e ? 4 : 3;
        int i6 = a3cVar.f(bVar) ? 16 : 8;
        int i7 = a3cVar.g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if ("video/dolby-vision".equals(bVar.o) && !i9a.y(context)) {
            i8 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (e) {
            List D02 = D0(context, bVar, z2, true);
            if (!D02.isEmpty()) {
                HashMap hashMap = s3c.a;
                ArrayList arrayList = new ArrayList(D02);
                Collections.sort(arrayList, new rs2(new ow9(i3, context, bVar), 6));
                a3c a3cVar3 = (a3c) arrayList.get(0);
                if (a3cVar3.e(context, bVar) && a3cVar3.f(bVar)) {
                    i = 32;
                }
            }
        }
        return i5 | i6 | i | i7 | i8;
    }

    @Override // defpackage.h3c, defpackage.n51
    public final void z(float f, float f2) {
        super.z(f, f2);
        xqk xqkVar = this.U0;
        if (xqkVar != null) {
            xqkVar.a(f);
        } else {
            this.L0.h(f);
        }
        qpk qpkVar = this.P0;
        if (qpkVar != null) {
            qpkVar.c(f);
        }
    }
}
