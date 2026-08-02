package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C4427z5;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a4c extends g3c {
    public static final int[] n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean o1;
    public static boolean p1;
    public final Context E0;
    public final ypk F0;
    public final qo0 G0;
    public final long H0;
    public final int I0;
    public final boolean J0;
    public k9 K0;
    public boolean L0;
    public boolean M0;
    public Surface N0;
    public PlaceholderSurface O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public long U0;
    public long V0;
    public long W0;
    public int X0;
    public int Y0;
    public int Z0;
    public long a1;
    public long b1;
    public long c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public float h1;
    public yqk i1;
    public boolean j1;
    public int k1;
    public z3c l1;
    public mpk m1;

    public a4c(Context context, o2c o2cVar, Handler handler, lg6 lg6Var) {
        super(2, o2cVar, 30.0f);
        this.H0 = 5000L;
        this.I0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.E0 = applicationContext;
        this.F0 = new ypk(applicationContext);
        this.G0 = new qo0(handler, lg6Var);
        this.J0 = "NVIDIA".equals(lik.c);
        this.V0 = C.TIME_UNSET;
        this.e1 = -1;
        this.f1 = -1;
        this.h1 = -1.0f;
        this.Q0 = 1;
        this.k1 = 0;
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
    public static boolean m0(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (a4c.class) {
            try {
                if (!o1) {
                    int i = lik.a;
                    char c = 28;
                    if (i <= 28) {
                        String str2 = lik.b;
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
                        p1 = z3;
                        o1 = true;
                    }
                    if (i > 27 || !"HWEML".equals(lik.b)) {
                        String str3 = lik.d;
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
                                    String str4 = lik.b;
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
                        p1 = z3;
                        o1 = true;
                    }
                    z3 = true;
                    p1 = z3;
                    o1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int n0(z2c z2cVar, sm8 sm8Var) {
        int intValue;
        int i = sm8Var.q;
        int i2 = sm8Var.r;
        if (i != -1 && i2 != -1) {
            String str = sm8Var.l;
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair d = r3c.d(sm8Var);
                str = (d == null || !((intValue = ((Integer) d.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
            }
            str.getClass();
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals(MimeTypes.VIDEO_H263)) {
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
                    if (str.equals(MimeTypes.VIDEO_MP4V)) {
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
                    if (str.equals(MimeTypes.VIDEO_VP8)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals(MimeTypes.VIDEO_VP9)) {
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
                    String str2 = lik.d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(lik.c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !z2cVar.f)))) {
                        return ((lik.f(i2, 16) * lik.f(i, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static hv9 o0(Context context, hc5 hc5Var, sm8 sm8Var, boolean z, boolean z2) {
        String str = sm8Var.l;
        if (str == null) {
            av9 av9Var = hv9.b;
            return vvf.e;
        }
        hc5Var.getClass();
        List e = r3c.e(str, z, z2);
        String b = r3c.b(sm8Var);
        if (b == null) {
            return hv9.v(e);
        }
        List e2 = r3c.e(b, z, z2);
        if (lik.a >= 26 && "video/dolby-vision".equals(sm8Var.l) && !e2.isEmpty() && !x3c.a(context)) {
            return hv9.v(e2);
        }
        zu9 s = hv9.s();
        s.e(e);
        s.e(e2);
        return s.g();
    }

    public static int p0(z2c z2cVar, sm8 sm8Var) {
        int i = sm8Var.m;
        List list = sm8Var.n;
        if (i == -1) {
            return n0(z2cVar, sm8Var);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return sm8Var.m + i2;
    }

    @Override // defpackage.g3c
    public final boolean F() {
        return this.j1 && lik.a < 23;
    }

    @Override // defpackage.g3c
    public final float G(float f, sm8[] sm8VarArr) {
        float f2 = -1.0f;
        for (sm8 sm8Var : sm8VarArr) {
            float f3 = sm8Var.s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.g3c
    public final ArrayList H(hc5 hc5Var, sm8 sm8Var, boolean z) {
        hv9 o0 = o0(this.E0, hc5Var, sm8Var, z, this.j1);
        Pattern pattern = r3c.a;
        ArrayList arrayList = new ArrayList(o0);
        Collections.sort(arrayList, new rs2(new kr9(sm8Var, 8), 7));
        return arrayList;
    }

    @Override // defpackage.g3c
    public final n2c I(z2c z2cVar, sm8 sm8Var, MediaCrypto mediaCrypto, float f) {
        n2c n2cVar;
        k9 k9Var;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        int i;
        char c;
        boolean z;
        Pair d;
        int n0;
        PlaceholderSurface placeholderSurface = this.O0;
        if (placeholderSurface != null && placeholderSurface.a != z2cVar.f) {
            if (this.N0 == placeholderSurface) {
                this.N0 = null;
            }
            placeholderSurface.release();
            this.O0 = null;
        }
        String str = z2cVar.c;
        sm8[] sm8VarArr = this.h;
        sm8VarArr.getClass();
        int i2 = sm8Var.q;
        float f2 = sm8Var.s;
        int i3 = sm8Var.r;
        v13 v13Var = sm8Var.x;
        int p0 = p0(z2cVar, sm8Var);
        if (sm8VarArr.length == 1) {
            if (p0 != -1 && (n0 = n0(z2cVar, sm8Var)) != -1) {
                p0 = Math.min((int) (p0 * 1.5f), n0);
            }
            k9Var = new k9(i2, i3, p0);
            n2cVar = null;
        } else {
            int length = sm8VarArr.length;
            n2cVar = null;
            int i4 = i2;
            int i5 = i3;
            int i6 = 0;
            boolean z2 = false;
            while (i6 < length) {
                sm8 sm8Var2 = sm8VarArr[i6];
                int i7 = i6;
                if (v13Var != null && sm8Var2.x == null) {
                    pm8 a = sm8Var2.a();
                    a.w = v13Var;
                    sm8Var2 = new sm8(a);
                }
                km4 b = z2cVar.b(sm8Var, sm8Var2);
                sm8[] sm8VarArr2 = sm8VarArr;
                int i8 = sm8Var2.r;
                if (b.d != 0) {
                    int i9 = sm8Var2.q;
                    i = length;
                    c = 65535;
                    z2 |= i9 == -1 || i8 == -1;
                    i4 = Math.max(i4, i9);
                    i5 = Math.max(i5, i8);
                    p0 = Math.max(p0, p0(z2cVar, sm8Var2));
                } else {
                    i = length;
                    c = 65535;
                }
                i6 = i7 + 1;
                sm8VarArr = sm8VarArr2;
                length = i;
            }
            if (z2) {
                m6k.f0();
                boolean z3 = i3 > i2;
                int i10 = z3 ? i3 : i2;
                int i11 = z3 ? i2 : i3;
                boolean z4 = z3;
                float f3 = i11 / i10;
                int i12 = 0;
                while (i12 < 9) {
                    int i13 = n1[i12];
                    int i14 = i12;
                    int i15 = (int) (i13 * f3);
                    if (i13 <= i10 || i15 <= i11) {
                        break;
                    }
                    int i16 = i10;
                    int i17 = i11;
                    if (lik.a >= 21) {
                        int i18 = z4 ? i15 : i13;
                        if (!z4) {
                            i13 = i15;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = z2cVar.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(lik.f(i18, widthAlignment) * widthAlignment, lik.f(i13, heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (z2cVar.e(point2.x, point2.y, f2)) {
                            point = point3;
                            break;
                        }
                        i12 = i14 + 1;
                        i10 = i16;
                        i11 = i17;
                    } else {
                        try {
                            int f4 = lik.f(i13, 16) * 16;
                            int f5 = lik.f(i15, 16) * 16;
                            if (f4 * f5 <= r3c.i()) {
                                int i19 = z4 ? f5 : f4;
                                if (!z4) {
                                    f4 = f5;
                                }
                                point = new Point(i19, f4);
                            } else {
                                i12 = i14 + 1;
                                i10 = i16;
                                i11 = i17;
                            }
                        } catch (l3c unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i4 = Math.max(i4, point.x);
                    i5 = Math.max(i5, point.y);
                    pm8 a2 = sm8Var.a();
                    a2.p = i4;
                    a2.q = i5;
                    p0 = Math.max(p0, n0(z2cVar, new sm8(a2)));
                    m6k.f0();
                }
            }
            k9Var = new k9(i4, i5, p0);
        }
        this.K0 = k9Var;
        int i20 = this.j1 ? this.k1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i3);
        waa.L(mediaFormat, sm8Var.n);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        waa.H(mediaFormat, "rotation-degrees", sm8Var.t);
        if (v13Var != null) {
            waa.H(mediaFormat, "color-transfer", v13Var.c);
            waa.H(mediaFormat, "color-standard", v13Var.a);
            waa.H(mediaFormat, "color-range", v13Var.b);
            byte[] bArr = v13Var.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(sm8Var.l) && (d = r3c.d(sm8Var)) != null) {
            waa.H(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", k9Var.a);
        mediaFormat.setInteger("max-height", k9Var.b);
        waa.H(mediaFormat, "max-input-size", k9Var.c);
        if (lik.a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.J0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i20 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i20);
        }
        Surface surface = this.N0;
        Surface surface2 = surface;
        if (surface == null) {
            if (!v0(z2cVar)) {
                zzl.s();
                return n2cVar;
            }
            PlaceholderSurface placeholderSurface2 = this.O0;
            PlaceholderSurface placeholderSurface3 = placeholderSurface2;
            if (placeholderSurface2 == null) {
                PlaceholderSurface c2 = PlaceholderSurface.c(this.E0, z2cVar.f);
                this.O0 = c2;
                placeholderSurface3 = c2;
            }
            this.N0 = placeholderSurface3;
            surface2 = placeholderSurface3;
        }
        return new n2c(z2cVar, mediaFormat, sm8Var, surface2, mediaCrypto);
    }

    @Override // defpackage.g3c
    public final void J(hm4 hm4Var) {
        if (this.M0) {
            ByteBuffer byteBuffer = hm4Var.k;
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
                        q2c q2cVar = this.I;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        q2cVar.c(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.g3c
    public final void N(Exception exc) {
        m6k.C("Video codec error", exc);
        qo0 qo0Var = this.G0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new tqk(qo0Var, exc, 2));
        }
    }

    @Override // defpackage.g3c
    public final void O(String str, long j, long j2) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        qo0 qo0Var = this.G0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            str2 = str;
            handler.post(new tqk(qo0Var, str2, j, j2));
        } else {
            str2 = str;
        }
        this.L0 = m0(str2);
        z2c z2cVar = this.P;
        z2cVar.getClass();
        boolean z = false;
        if (lik.a >= 29 && MimeTypes.VIDEO_VP9.equals(z2cVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = z2cVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
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
        this.M0 = z;
        if (lik.a < 23 || !this.j1) {
            return;
        }
        q2c q2cVar = this.I;
        q2cVar.getClass();
        this.l1 = new z3c(this, q2cVar);
    }

    @Override // defpackage.g3c
    public final void P(String str) {
        qo0 qo0Var = this.G0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new tqk(qo0Var, str, 1));
        }
    }

    @Override // defpackage.g3c
    public final km4 Q(fp4 fp4Var) {
        km4 Q = super.Q(fp4Var);
        sm8 sm8Var = (sm8) fp4Var.c;
        qo0 qo0Var = this.G0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new tqk(qo0Var, sm8Var, Q));
        }
        return Q;
    }

    @Override // defpackage.g3c
    public final void R(sm8 sm8Var, MediaFormat mediaFormat) {
        int integer;
        q2c q2cVar = this.I;
        if (q2cVar != null) {
            q2cVar.setVideoScalingMode(this.Q0);
        }
        if (this.j1) {
            this.e1 = sm8Var.q;
            integer = sm8Var.r;
            this.f1 = integer;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.e1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            this.f1 = integer;
        }
        float f = sm8Var.u;
        this.h1 = f;
        int i = lik.a;
        int i2 = sm8Var.t;
        if (i < 21) {
            this.g1 = i2;
        } else if (i2 == 90 || i2 == 270) {
            int i3 = this.e1;
            this.e1 = integer;
            this.f1 = i3;
            this.h1 = 1.0f / f;
        }
        float f2 = sm8Var.s;
        ypk ypkVar = this.F0;
        ypkVar.f = f2;
        h68 h68Var = ypkVar.a;
        ((g68) h68Var.d).c();
        ((g68) h68Var.e).c();
        h68Var.a = false;
        h68Var.b = C.TIME_UNSET;
        h68Var.c = 0;
        ypkVar.b();
    }

    @Override // defpackage.g3c
    public final void T(long j) {
        super.T(j);
        if (this.j1) {
            return;
        }
        this.Z0--;
    }

    @Override // defpackage.g3c
    public final void U() {
        l0();
    }

    @Override // defpackage.g3c
    public final void V(hm4 hm4Var) {
        boolean z = this.j1;
        if (!z) {
            this.Z0++;
        }
        if (lik.a >= 23 || !z) {
            return;
        }
        long j = hm4Var.j;
        k0(j);
        s0();
        this.z0.f++;
        r0();
        T(j);
    }

    @Override // defpackage.g3c
    public final boolean X(long j, long j2, q2c q2cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, sm8 sm8Var) {
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z3;
        boolean z4;
        long j8;
        long j9;
        long j10;
        q2cVar.getClass();
        if (this.U0 == C.TIME_UNSET) {
            this.U0 = j;
        }
        if (j3 != this.a1) {
            ypk ypkVar = this.F0;
            j6 = -1;
            long j11 = ypkVar.n;
            if (j11 != -1) {
                ypkVar.p = j11;
                ypkVar.q = ypkVar.o;
            }
            ypkVar.m++;
            h68 h68Var = ypkVar.a;
            long j12 = j3 * 1000;
            j4 = 1000;
            ((g68) h68Var.d).b(j12);
            if (((g68) h68Var.d).a()) {
                h68Var.a = false;
                j5 = 0;
            } else {
                j5 = 0;
                if (h68Var.b != C.TIME_UNSET) {
                    if (h68Var.a) {
                        g68 g68Var = (g68) h68Var.e;
                        long j13 = g68Var.e;
                        if (!(j13 == 0 ? false : g68Var.h[(int) ((j13 - 1) % 15)])) {
                            j10 = j12;
                            h68Var.a = true;
                            j12 = j10;
                            ((g68) h68Var.e).b(j12);
                        }
                    }
                    ((g68) h68Var.e).c();
                    j10 = j12;
                    ((g68) h68Var.e).b(h68Var.b);
                    h68Var.a = true;
                    j12 = j10;
                    ((g68) h68Var.e).b(j12);
                }
            }
            if (h68Var.a && ((g68) h68Var.e).a()) {
                g68 g68Var2 = (g68) h68Var.d;
                h68Var.d = (g68) h68Var.e;
                h68Var.e = g68Var2;
                h68Var.a = false;
            }
            h68Var.b = j12;
            h68Var.c = ((g68) h68Var.d).a() ? 0 : h68Var.c + 1;
            ypkVar.b();
            this.a1 = j3;
        } else {
            j4 = 1000;
            j5 = 0;
            j6 = -1;
        }
        long j14 = this.B0;
        long j15 = j3 - j14;
        if (z && !z2) {
            w0(q2cVar, i);
            return true;
        }
        double d = this.G;
        boolean z5 = this.f == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * j4;
        long j16 = (long) ((j3 - j) / d);
        if (z5) {
            j16 -= elapsedRealtime - j2;
        }
        if (this.N0 == this.O0) {
            if (j16 >= -30000) {
                return false;
            }
            w0(q2cVar, i);
            y0(j16);
            return true;
        }
        long j17 = elapsedRealtime - this.b1;
        if (this.T0 ? this.R0 : !(z5 || this.S0)) {
            j7 = j17;
            z3 = false;
        } else {
            j7 = j17;
            z3 = true;
        }
        if (this.V0 == C.TIME_UNSET && j >= j14 && (z3 || (z5 && j16 < -30000 && j7 > 100000))) {
            long nanoTime = System.nanoTime();
            mpk mpkVar = this.m1;
            if (mpkVar != null) {
                mpkVar.c(j15, nanoTime, sm8Var, this.K);
            }
            if (lik.a >= 21) {
                u0(q2cVar, i, nanoTime);
            } else {
                t0(q2cVar, i);
            }
            y0(j16);
            return true;
        }
        if (!z5 || j == this.U0) {
            return false;
        }
        long nanoTime2 = System.nanoTime();
        long j18 = (j16 * j4) + nanoTime2;
        ypk ypkVar2 = this.F0;
        if (ypkVar2.p != j6 && ((g68) ypkVar2.a.d).a()) {
            h68 h68Var2 = ypkVar2.a;
            if (((g68) h68Var2.d).a()) {
                g68 g68Var3 = (g68) h68Var2.d;
                long j19 = g68Var3.f;
                j9 = j19 == j5 ? j5 : g68Var3.g / j19;
            } else {
                j9 = -9223372036854775807L;
            }
            long j20 = ypkVar2.q + ((long) (((ypkVar2.m - ypkVar2.p) * j9) / ypkVar2.i));
            if (Math.abs(j18 - j20) <= 20000000) {
                j18 = j20;
            } else {
                ypkVar2.m = j5;
                long j21 = j6;
                ypkVar2.p = j21;
                ypkVar2.n = j21;
            }
        }
        ypkVar2.n = ypkVar2.m;
        ypkVar2.o = j18;
        upk upkVar = ypkVar2.c;
        if (upkVar != null && ypkVar2.k != C.TIME_UNSET) {
            long j22 = upkVar.a;
            if (j22 != C.TIME_UNSET) {
                long j23 = ypkVar2.k;
                long j24 = (((j18 - j22) / j23) * j23) + j22;
                if (j18 <= j24) {
                    j8 = j24 - j23;
                } else {
                    j8 = j24;
                    j24 = j23 + j24;
                }
                if (j24 - j18 >= j18 - j8) {
                    j24 = j8;
                }
                j18 = j24 - ypkVar2.l;
            }
        }
        long j25 = j18;
        long j26 = (j25 - nanoTime2) / j4;
        boolean z6 = this.V0 != C.TIME_UNSET;
        if (j26 < -500000 && !z2) {
            ipg ipgVar = this.g;
            ipgVar.getClass();
            int skipData = ipgVar.skipData(j - this.i);
            if (skipData != 0) {
                dm4 dm4Var = this.z0;
                if (z6) {
                    dm4Var.e += skipData;
                    dm4Var.g += this.Z0;
                } else {
                    dm4Var.k++;
                    x0(skipData, this.Z0);
                }
                if (!E()) {
                    return false;
                }
                L();
                return false;
            }
        }
        if (j26 < -30000 && !z2) {
            if (z6) {
                w0(q2cVar, i);
                z4 = true;
            } else {
                q5a.y("dropVideoBuffer");
                q2cVar.C(i, false);
                q5a.B();
                z4 = true;
                x0(0, 1);
            }
            y0(j26);
            return z4;
        }
        if (lik.a >= 21) {
            if (j26 >= 50000) {
                return false;
            }
            mpk mpkVar2 = this.m1;
            if (mpkVar2 != null) {
                mpkVar2.c(j15, j25, sm8Var, this.K);
            }
            u0(q2cVar, i, j25);
            y0(j26);
            return true;
        }
        if (j26 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            return false;
        }
        if (j26 > 11000) {
            try {
                Thread.sleep((j26 - Ua.s) / j4);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        mpk mpkVar3 = this.m1;
        if (mpkVar3 != null) {
            mpkVar3.c(j15, j25, sm8Var, this.K);
        }
        t0(q2cVar, i);
        y0(j26);
        return true;
    }

    @Override // defpackage.g3c
    public final void b0() {
        super.b0();
        this.Z0 = 0;
    }

    @Override // defpackage.m51
    public final String e() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.g3c
    public final boolean f0(z2c z2cVar) {
        return this.N0 != null || v0(z2cVar);
    }

    @Override // defpackage.g3c, defpackage.m51
    public final boolean h() {
        PlaceholderSurface placeholderSurface;
        if (super.h() && (this.R0 || (((placeholderSurface = this.O0) != null && this.N0 == placeholderSurface) || this.I == null || this.j1))) {
            this.V0 = C.TIME_UNSET;
            return true;
        }
        if (this.V0 == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.V0) {
            return true;
        }
        this.V0 = C.TIME_UNSET;
        return false;
    }

    @Override // defpackage.g3c
    public final int h0(hc5 hc5Var, sm8 sm8Var) {
        boolean z;
        int i = 0;
        if (!rjc.i(sm8Var.l)) {
            return m51.b(0, 0, 0);
        }
        boolean z2 = sm8Var.o != null;
        Context context = this.E0;
        hv9 o0 = o0(context, hc5Var, sm8Var, z2, false);
        if (z2 && o0.isEmpty()) {
            o0 = o0(context, hc5Var, sm8Var, false, false);
        }
        if (o0.isEmpty()) {
            return m51.b(1, 0, 0);
        }
        int i2 = sm8Var.E;
        if (i2 != 0 && i2 != 2) {
            return m51.b(2, 0, 0);
        }
        z2c z2cVar = (z2c) o0.get(0);
        boolean c = z2cVar.c(sm8Var);
        if (!c) {
            for (int i3 = 1; i3 < o0.size(); i3++) {
                z2c z2cVar2 = (z2c) o0.get(i3);
                if (z2cVar2.c(sm8Var)) {
                    z = false;
                    c = true;
                    z2cVar = z2cVar2;
                    break;
                }
            }
        }
        z = true;
        int i4 = c ? 4 : 3;
        int i5 = 8;
        int i6 = z2cVar.d(sm8Var) ? 16 : 8;
        int i7 = z2cVar.g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (lik.a >= 26 && "video/dolby-vision".equals(sm8Var.l) && !x3c.a(context)) {
            i8 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (c) {
            hv9 o02 = o0(context, hc5Var, sm8Var, z2, true);
            if (!o02.isEmpty()) {
                Pattern pattern = r3c.a;
                ArrayList arrayList = new ArrayList(o02);
                Collections.sort(arrayList, new rs2(new kr9(sm8Var, i5), 7));
                z2c z2cVar3 = (z2c) arrayList.get(0);
                if (z2cVar3.c(sm8Var) && z2cVar3.d(sm8Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i6 | i | i7 | i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [android.view.Surface] */
    @Override // defpackage.m51, defpackage.ite
    public final void handleMessage(int i, Object obj) {
        Handler handler;
        Handler handler2;
        int intValue;
        ypk ypkVar = this.F0;
        if (i != 1) {
            if (i == 7) {
                this.m1 = (mpk) obj;
                return;
            }
            if (i == 10) {
                int intValue2 = ((Integer) obj).intValue();
                if (this.k1 != intValue2) {
                    this.k1 = intValue2;
                    if (this.j1) {
                        Z();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i == 5 && ypkVar.j != (intValue = ((Integer) obj).intValue())) {
                    ypkVar.j = intValue;
                    ypkVar.c(true);
                    return;
                }
                return;
            }
            int intValue3 = ((Integer) obj).intValue();
            this.Q0 = intValue3;
            q2c q2cVar = this.I;
            if (q2cVar != null) {
                q2cVar.setVideoScalingMode(intValue3);
                return;
            }
            return;
        }
        PlaceholderSurface placeholderSurface = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurface == null) {
            PlaceholderSurface placeholderSurface2 = this.O0;
            if (placeholderSurface2 != null) {
                placeholderSurface = placeholderSurface2;
            } else {
                z2c z2cVar = this.P;
                if (z2cVar != null && v0(z2cVar)) {
                    placeholderSurface = PlaceholderSurface.c(this.E0, z2cVar.f);
                    this.O0 = placeholderSurface;
                }
            }
        }
        Surface surface = this.N0;
        int i2 = 20;
        qo0 qo0Var = this.G0;
        if (surface == placeholderSurface) {
            if (placeholderSurface == null || placeholderSurface == this.O0) {
                return;
            }
            yqk yqkVar = this.i1;
            if (yqkVar != null && (handler = qo0Var.a) != null) {
                handler.post(new ecg(i2, qo0Var, yqkVar));
            }
            if (this.P0) {
                Surface surface2 = this.N0;
                Handler handler3 = qo0Var.a;
                if (handler3 != null) {
                    handler3.post(new jd(qo0Var, surface2, SystemClock.elapsedRealtime(), 5));
                    return;
                }
                return;
            }
            return;
        }
        this.N0 = placeholderSurface;
        ypkVar.getClass();
        PlaceholderSurface placeholderSurface3 = placeholderSurface instanceof PlaceholderSurface ? null : placeholderSurface;
        if (ypkVar.e != placeholderSurface3) {
            ypkVar.a();
            ypkVar.e = placeholderSurface3;
            ypkVar.c(true);
        }
        this.P0 = false;
        int i3 = this.f;
        q2c q2cVar2 = this.I;
        if (q2cVar2 != null) {
            if (lik.a < 23 || placeholderSurface == null || this.L0) {
                Z();
                L();
            } else {
                q2cVar2.i(placeholderSurface);
            }
        }
        if (placeholderSurface == null || placeholderSurface == this.O0) {
            this.i1 = null;
            l0();
            return;
        }
        yqk yqkVar2 = this.i1;
        if (yqkVar2 != null && (handler2 = qo0Var.a) != null) {
            handler2.post(new ecg(i2, qo0Var, yqkVar2));
        }
        l0();
        if (i3 == 2) {
            long j = this.H0;
            this.V0 = j > 0 ? SystemClock.elapsedRealtime() + j : C.TIME_UNSET;
        }
    }

    @Override // defpackage.g3c, defpackage.m51
    public final void i() {
        qo0 qo0Var = this.G0;
        this.i1 = null;
        l0();
        this.P0 = false;
        this.l1 = null;
        int i = 23;
        try {
            super.i();
            dm4 dm4Var = this.z0;
            qo0Var.getClass();
            synchronized (dm4Var) {
            }
            Handler handler = qo0Var.a;
            if (handler != null) {
                handler.post(new ecg(i, qo0Var, dm4Var));
            }
        } catch (Throwable th) {
            dm4 dm4Var2 = this.z0;
            qo0Var.getClass();
            synchronized (dm4Var2) {
                Handler handler2 = qo0Var.a;
                if (handler2 != null) {
                    handler2.post(new ecg(i, qo0Var, dm4Var2));
                }
                throw th;
            }
        }
    }

    @Override // defpackage.m51
    public final void j(boolean z, boolean z2) {
        this.z0 = new dm4(0);
        ryf ryfVar = this.c;
        ryfVar.getClass();
        boolean z3 = ryfVar.a;
        qx9.t((z3 && this.k1 == 0) ? false : true);
        if (this.j1 != z3) {
            this.j1 = z3;
            Z();
        }
        dm4 dm4Var = this.z0;
        qo0 qo0Var = this.G0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new tqk(qo0Var, dm4Var, 4));
        }
        this.S0 = z2;
        this.T0 = false;
    }

    @Override // defpackage.g3c, defpackage.m51
    public final void k(long j, boolean z) {
        super.k(j, z);
        l0();
        ypk ypkVar = this.F0;
        ypkVar.m = 0L;
        ypkVar.p = -1L;
        ypkVar.n = -1L;
        long j2 = C.TIME_UNSET;
        this.a1 = C.TIME_UNSET;
        this.U0 = C.TIME_UNSET;
        this.Y0 = 0;
        if (!z) {
            this.V0 = C.TIME_UNSET;
            return;
        }
        long j3 = this.H0;
        if (j3 > 0) {
            j2 = SystemClock.elapsedRealtime() + j3;
        }
        this.V0 = j2;
    }

    @Override // defpackage.m51
    public final void l() {
        try {
            try {
                z();
                Z();
                hpo hpoVar = this.C;
                if (hpoVar != null) {
                    hpoVar.D(null);
                }
                this.C = null;
            } catch (Throwable th) {
                hpo hpoVar2 = this.C;
                if (hpoVar2 != null) {
                    hpoVar2.D(null);
                }
                this.C = null;
                throw th;
            }
        } finally {
            PlaceholderSurface placeholderSurface = this.O0;
            if (placeholderSurface != null) {
                if (this.N0 == placeholderSurface) {
                    this.N0 = null;
                }
                placeholderSurface.release();
                this.O0 = null;
            }
        }
    }

    public final void l0() {
        q2c q2cVar;
        this.R0 = false;
        if (lik.a < 23 || !this.j1 || (q2cVar = this.I) == null) {
            return;
        }
        this.l1 = new z3c(this, q2cVar);
    }

    @Override // defpackage.m51
    public final void m() {
        this.X0 = 0;
        this.W0 = SystemClock.elapsedRealtime();
        this.b1 = SystemClock.elapsedRealtime() * 1000;
        this.c1 = 0L;
        this.d1 = 0;
        ypk ypkVar = this.F0;
        int i = 1;
        ypkVar.d = true;
        ypkVar.m = 0L;
        ypkVar.p = -1L;
        ypkVar.n = -1L;
        spk spkVar = ypkVar.b;
        if (spkVar != null) {
            upk upkVar = ypkVar.c;
            upkVar.getClass();
            upkVar.b.sendEmptyMessage(1);
            spkVar.d(new bnk(ypkVar, i));
        }
        ypkVar.c(false);
    }

    @Override // defpackage.m51
    public final void n() {
        this.V0 = C.TIME_UNSET;
        q0();
        int i = this.d1;
        if (i != 0) {
            long j = this.c1;
            qo0 qo0Var = this.G0;
            Handler handler = qo0Var.a;
            if (handler != null) {
                handler.post(new tqk(qo0Var, j, i));
            }
            this.c1 = 0L;
            this.d1 = 0;
        }
        ypk ypkVar = this.F0;
        ypkVar.d = false;
        spk spkVar = ypkVar.b;
        if (spkVar != null) {
            spkVar.h();
            upk upkVar = ypkVar.c;
            upkVar.getClass();
            upkVar.b.sendEmptyMessage(2);
        }
        ypkVar.a();
    }

    public final void q0() {
        if (this.X0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.W0;
            int i = this.X0;
            qo0 qo0Var = this.G0;
            Handler handler = qo0Var.a;
            if (handler != null) {
                handler.post(new tqk(qo0Var, i, j));
            }
            this.X0 = 0;
            this.W0 = elapsedRealtime;
        }
    }

    public final void r0() {
        this.T0 = true;
        if (this.R0) {
            return;
        }
        this.R0 = true;
        Surface surface = this.N0;
        qo0 qo0Var = this.G0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new jd(qo0Var, surface, SystemClock.elapsedRealtime(), 5));
        }
        this.P0 = true;
    }

    public final void s0() {
        int i = this.e1;
        if (i == -1 && this.f1 == -1) {
            return;
        }
        yqk yqkVar = this.i1;
        if (yqkVar != null && yqkVar.a == i && yqkVar.b == this.f1 && yqkVar.c == this.g1 && yqkVar.d == this.h1) {
            return;
        }
        yqk yqkVar2 = new yqk(i, this.h1, this.f1, this.g1);
        this.i1 = yqkVar2;
        qo0 qo0Var = this.G0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new ecg(20, qo0Var, yqkVar2));
        }
    }

    @Override // defpackage.g3c, defpackage.m51
    public final void t(float f, float f2) {
        super.t(f, f2);
        ypk ypkVar = this.F0;
        ypkVar.i = f;
        ypkVar.m = 0L;
        ypkVar.p = -1L;
        ypkVar.n = -1L;
        ypkVar.c(false);
    }

    public final void t0(q2c q2cVar, int i) {
        s0();
        q5a.y("releaseOutputBuffer");
        q2cVar.C(i, true);
        q5a.B();
        this.b1 = SystemClock.elapsedRealtime() * 1000;
        this.z0.f++;
        this.Y0 = 0;
        r0();
    }

    public final void u0(q2c q2cVar, int i, long j) {
        s0();
        q5a.y("releaseOutputBuffer");
        q2cVar.l(i, j);
        q5a.B();
        this.b1 = SystemClock.elapsedRealtime() * 1000;
        this.z0.f++;
        this.Y0 = 0;
        r0();
    }

    public final boolean v0(z2c z2cVar) {
        if (lik.a < 23 || this.j1 || m0(z2cVar.a)) {
            return false;
        }
        return !z2cVar.f || PlaceholderSurface.b(this.E0);
    }

    public final void w0(q2c q2cVar, int i) {
        q5a.y("skipVideoBuffer");
        q2cVar.C(i, false);
        q5a.B();
        this.z0.g++;
    }

    @Override // defpackage.g3c
    public final km4 x(z2c z2cVar, sm8 sm8Var, sm8 sm8Var2) {
        km4 b = z2cVar.b(sm8Var, sm8Var2);
        int i = b.e;
        int i2 = sm8Var2.q;
        k9 k9Var = this.K0;
        if (i2 > k9Var.a || sm8Var2.r > k9Var.b) {
            i |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (p0(z2cVar, sm8Var2) > this.K0.c) {
            i |= 64;
        }
        int i3 = i;
        return new km4(z2cVar.a, sm8Var, sm8Var2, i3 != 0 ? 0 : b.d, i3);
    }

    public final void x0(int i, int i2) {
        dm4 dm4Var = this.z0;
        dm4Var.i += i;
        int i3 = i + i2;
        dm4Var.h += i3;
        this.X0 += i3;
        int i4 = this.Y0 + i3;
        this.Y0 = i4;
        dm4Var.j = Math.max(i4, dm4Var.j);
        int i5 = this.I0;
        if (i5 <= 0 || this.X0 < i5) {
            return;
        }
        q0();
    }

    @Override // defpackage.g3c
    public final w2c y(IllegalStateException illegalStateException, z2c z2cVar) {
        Surface surface = this.N0;
        t3c t3cVar = new t3c(illegalStateException, z2cVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return t3cVar;
    }

    public final void y0(long j) {
        dm4 dm4Var = this.z0;
        dm4Var.l += j;
        dm4Var.m++;
        this.c1 += j;
        this.d1++;
    }
}
