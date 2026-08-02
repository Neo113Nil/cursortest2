package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import com.google.common.base.Ascii;
import com.ironsource.B5;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import io.ktor.util.date.GMTDateParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzacw extends zzvl implements zzadl {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private long zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private zznb zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private int zzJ;
    private long zzK;
    private zzbv zzL;
    private zzbv zzM;
    private int zzN;
    private int zzO;
    private zzadj zzP;
    private long zzQ;
    private long zzR;
    private boolean zzS;
    private int zzT;
    private final Context zze;
    private final boolean zzf;
    private final zzaeg zzg;
    private final boolean zzh;
    private final zzadm zzi;
    private final zzadk zzj;
    private final zzacf zzk;
    private final long zzl;
    private final zzadn zzm;
    private final PriorityQueue zzn;
    private zzacv zzo;
    private boolean zzp;
    private boolean zzq;
    private zzaem zzr;
    private boolean zzs;
    private int zzt;
    private List zzu;
    private Surface zzv;
    private zzacy zzw;
    private zzet zzx;
    private boolean zzy;
    private int zzz;

    protected zzacw(zzacu zzacuVar) {
        super(zzacuVar.zze().getApplicationContext(), 2, zzacuVar.zzg(), zzacuVar.zzf(), false, 30.0f);
        Context applicationContext = zzacuVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzr = null;
        this.zzg = new zzaeg(zzacuVar.zzh(), zzacuVar.zzi());
        this.zzf = this.zzr == null;
        this.zzi = new zzadm(applicationContext, this, 0L);
        this.zzj = new zzadk();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzx = zzet.zza;
        this.zzz = 1;
        this.zzA = 0;
        this.zzL = zzbv.zza;
        this.zzO = 0;
        this.zzM = null;
        this.zzN = -1000;
        this.zzQ = C.TIME_UNSET;
        this.zzR = C.TIME_UNSET;
        this.zzk = new zzacf();
        this.zzn = new PriorityQueue();
        this.zzl = -15000L;
        this.zzm = new zzadn(1.0f);
        this.zzF = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        if (r3.equals("video/av01") != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzaw(zzve zzveVar, zzv zzvVar) {
        int i = zzvVar.zzw;
        int i2 = zzvVar.zzx;
        if (i != -1 && i2 != -1) {
            String str = zzvVar.zzp;
            str.getClass();
            char c = 2;
            if (MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
                Pair zze = zzdp.zze(zzvVar);
                if (zze != null) {
                    int intValue = ((Integer) zze.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            int i3 = 4;
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
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals(MimeTypes.VIDEO_MP4V)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals(MimeTypes.VIDEO_VP8)) {
                        c = 3;
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
                case 2:
                case 3:
                    return ((i * i2) * 3) / i3;
                case 4:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 5:
                    if (!"BRAVIA 4K 2015".equals(Build.MODEL) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(Build.MODEL) && (!"AFTS".equals(Build.MODEL) || !zzveVar.zzf)))) {
                        String str2 = zzfk.zza;
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i3 = 8;
                    return ((i * i2) * 3) / i3;
            }
        }
        return -1;
    }

    private final void zzbA() {
        zzacy zzacyVar = this.zzw;
        if (zzacyVar != null) {
            zzacyVar.release();
            this.zzw = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    /* renamed from: zzbB, reason: merged with bridge method [inline-methods] */
    public final void zzbo() {
        this.zzg.zzg(this.zzv);
        this.zzy = true;
    }

    private final void zzbC() {
        zzbv zzbvVar = this.zzM;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    protected static int zzbm(zzve zzveVar, zzv zzvVar) {
        int i = zzvVar.zzq;
        if (i == -1) {
            return zzaw(zzveVar, zzvVar);
        }
        List list = zzvVar.zzs;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x04c4, code lost:
    
        if (r1.equals("deb") != false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x07a2, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L515;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzbq(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzacw.class) {
            if (!zzc) {
                char c = 28;
                if (Build.VERSION.SDK_INT <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z2 = 3;
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
                                z2 = 7;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z2 = 4;
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
                                z2 = 5;
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
                    zzd = z3;
                    zzc = true;
                }
                if (Build.VERSION.SDK_INT > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z = 6;
                                break;
                            }
                            z = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z = 7;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z = 4;
                                break;
                            }
                            z = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z = 8;
                                break;
                            }
                            z = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z = 5;
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
                            if (Build.VERSION.SDK_INT <= 26) {
                                String str4 = Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c = '6';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c = '7';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c = '8';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c = 'J';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c = 22;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c = GMTDateParser.YEAR;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c = 'Z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c = 'e';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c = 'f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c = 'g';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c = '\r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c = 't';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c = 137;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c = 21;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c = GMTDateParser.HOURS;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c = '_';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c = 130;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c = 'a';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c = 'b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c = 'c';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c = '4';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c = 18;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c = 'F';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c = 'v';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c = 'W';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c = 'x';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c = '\"';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c = '~';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c = 'X';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c = '\t';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c = 'w';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c = 131;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c = 132;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c = AbstractJsonLexerKt.BEGIN_LIST;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c = '3';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c = '5';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c = 'i';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c = 'y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c = 17;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c = 138;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c = 31;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c = 134;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c = 'q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c = Ascii.MAX;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c = 129;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c = 'T';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c = 'I';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c = 'O';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c = 'P';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c = 'V';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c = '^';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c = 'k';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c = GMTDateParser.SECONDS;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c = 139;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c = 26;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c = 27;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c = '1';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c = Typography.dollar;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c = '%';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c = Typography.amp;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c = '\'';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c = '(';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c = ')';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c = AbstractJsonLexerKt.END_LIST;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c = GMTDateParser.MINUTES;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c = 'o';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c = 136;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c = '2';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c = 'K';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c = 'U';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c = '\\';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c = 'S';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c = 15;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c = 30;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c = GMTDateParser.ANY;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c = '+';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c = AbstractJsonLexerKt.COMMA;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c = '-';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c = '.';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c = FileSystemKt.UnixPathSeparator;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c = '0';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c = 'l';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c = 'n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c = 'p';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c = 128;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c = 135;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c = 'C';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c = 'L';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c = GMTDateParser.MONTH;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c = 25;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c = 'R';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c = Typography.less;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c = 11;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c = '\f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c = GMTDateParser.ZONE;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c = AbstractJsonLexerKt.BEGIN_OBJ;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c = '|';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c = AbstractJsonLexerKt.END_OBJ;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c = 'j';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c = 'r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c = '9';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c = AbstractJsonLexerKt.COLON;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c = ';';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c = 'Q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c = '\n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c = 'H';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c = '`';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c = 'N';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c = 'G';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c = Typography.greater;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c = '#';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c = B5.U;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c = 133;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c = 23;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c = 24;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c = 'D';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c = AbstractJsonLexerKt.UNICODE_ESC;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c = GMTDateParser.DAY_OF_MONTH;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c = 'E';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c = 19;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c = 29;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c = '?';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c = '@';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c = 14;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c = ' ';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c = '!';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c = 'A';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c = 'B';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    default:
                                        String str5 = Build.MODEL;
                                        if (str5.hashCode() == -594534941) {
                                            break;
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
                                    case AD_VISIBILITY_VALUE:
                                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                    case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                                    case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                                    case NATIVE_AD_DISPLAY_DURATION_VALUE:
                                    case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case Base64.mimeLineLength /* 76 */:
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
                                    case l.e /* 94 */:
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
                                    case ASSET_FAILED_STATUS_CODE_VALUE:
                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                    case JSON_ENCODE_ERROR_VALUE:
                                    case 'x':
                                    case TPAT_ERROR_VALUE:
                                    case INVALID_ADS_ENDPOINT_VALUE:
                                    case INVALID_RI_ENDPOINT_VALUE:
                                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                    case '~':
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case MRAID_JS_WRITE_FAILED_VALUE:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case 134:
                                    case 135:
                                    case PRIVACY_URL_ERROR_VALUE:
                                    case TPAT_RETRY_FAILED_VALUE:
                                    case 138:
                                    case 139:
                                        break;
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
                    zzd = z3;
                    zzc = true;
                }
                z3 = true;
                zzd = z3;
                zzc = true;
            }
        }
        return zzd;
    }

    protected static final boolean zzbr(zzve zzveVar) {
        return Build.VERSION.SDK_INT >= 35 && zzveVar.zzh;
    }

    private static List zzbs(Context context, zzvn zzvnVar, zzv zzvVar, boolean z, boolean z2) throws zzvp {
        String str = zzvVar.zzp;
        if (str == null) {
            return zzgvz.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !zzact.zza(context)) {
            List zzd2 = zzvx.zzd(zzvnVar, zzvVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zzvx.zzc(zzvnVar, zzvVar, z, z2);
    }

    private final void zzbt(zzxc zzxcVar) {
        int zze;
        zzbf zzN = zzN();
        if (zzN.zzg() || (zze = zzN.zze(zzxcVar.zza)) == -1) {
            this.zzR = C.TIME_UNSET;
        } else {
            this.zzR = zzN.zzd(zze, new zzbd(), false).zzd;
        }
    }

    private final void zzbu(Object obj) throws zzje {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzv == surface) {
            if (surface != null) {
                zzbC();
                Surface surface2 = this.zzv;
                if (surface2 == null || !this.zzy) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzv = surface;
        if (this.zzr == null) {
            this.zzi.zzd(surface);
        }
        this.zzy = false;
        int zze = zze();
        zzvb zzaI = zzaI();
        if (zzaI != null && this.zzr == null) {
            zzve zzaL = zzaL();
            zzaL.getClass();
            if (!zzby(zzaL) || this.zzp) {
                zzaM();
                zzaE();
            } else {
                Surface zzbz = zzbz(zzaL);
                if (zzbz != null) {
                    zzaI.zzn(zzbz);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzaI.zzo();
                }
            }
        }
        if (surface != null) {
            zzbC();
        } else {
            this.zzM = null;
            zzaem zzaemVar = this.zzr;
            if (zzaemVar != null) {
                zzaemVar.zzq();
            }
        }
        if (zze == 2) {
            zzaem zzaemVar2 = this.zzr;
            if (zzaemVar2 != null) {
                zzaemVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbv(zzip zzipVar) {
        if (zzcW() || zzipVar.zzd() || this.zzR == C.TIME_UNSET) {
            return true;
        }
        return this.zzR - (zzipVar.zze - zzbg()) <= 100000;
    }

    private final boolean zzbw(zzip zzipVar) {
        return zzipVar.zze < zzH();
    }

    private final void zzbx(long j, long j2, zzv zzvVar) {
        zzadj zzadjVar = this.zzP;
        if (zzadjVar != null) {
            zzadjVar.zzcS(j, j2, zzvVar, zzaK());
        }
    }

    private final boolean zzby(zzve zzveVar) {
        if (this.zzr != null) {
            return true;
        }
        Surface surface = this.zzv;
        return (surface != null && surface.isValid()) || zzbr(zzveVar) || zzaC(zzveVar);
    }

    private final Surface zzbz(zzve zzveVar) {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            return zzaemVar.zzk();
        }
        Surface surface = this.zzv;
        if (surface != null) {
            return surface;
        }
        if (zzbr(zzveVar)) {
            return null;
        }
        zzgsw.zzi(zzaC(zzveVar));
        zzacy zzacyVar = this.zzw;
        if (zzacyVar != null) {
            if (zzacyVar.zza != zzveVar.zzf) {
                zzbA();
            }
        }
        if (this.zzw == null) {
            this.zzw = zzacy.zzb(this.zze, zzveVar.zzf);
        }
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzA(long j, boolean z, boolean z2) throws zzje {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null && !z) {
            zzaemVar.zzg(true);
        }
        if (z2) {
            this.zzG = j;
        }
        super.zzA(j, z, z2);
        if (this.zzr == null) {
            this.zzi.zzl();
        }
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzd();
        }
        if (z) {
            zzaem zzaemVar2 = this.zzr;
            if (zzaemVar2 != null) {
                zzaemVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzD = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzB() {
        this.zzC = 0;
        this.zzB = zzM().zzb();
        this.zzI = 0L;
        this.zzJ = 0;
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzC() {
        if (this.zzC > 0) {
            long zzb2 = zzM().zzb();
            this.zzg.zzd(this.zzC, zzb2 - this.zzB);
            this.zzC = 0;
            this.zzB = zzb2;
        }
        int i = this.zzJ;
        if (i != 0) {
            this.zzg.zze(this.zzI, i);
            this.zzI = 0L;
            this.zzJ = 0;
        }
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzb();
        } else {
            this.zzi.zzc();
        }
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzD() {
        this.zzM = null;
        this.zzR = C.TIME_UNSET;
        this.zzy = false;
        this.zzH = true;
        try {
            super.zzD();
        } finally {
            zzaeg zzaegVar = this.zzg;
            zzaegVar.zzi(this.zza);
            zzaegVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzs = false;
            this.zzQ = C.TIME_UNSET;
            zzbA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzF() {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null || !this.zzf) {
            return;
        }
        zzaemVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzG(zzbf zzbfVar) {
        zzxc zzO = zzO();
        if (zzO != null) {
            zzbt(zzO);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu, com.google.android.gms.internal.ads.zzmw
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final boolean zzW(long j) {
        if (zzbf() == C.TIME_UNSET || j < this.zzG) {
            return false;
        }
        long zzaY = zzaY();
        return zzaY == C.TIME_UNSET || j > zzaY;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzmu
    public final void zzX(float f, float f2) throws zzje {
        super.zzX(f, f2);
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzc(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzY() {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzt;
        if (i == 0 || i == 1) {
            this.zzt = 0;
        } else {
            zzaemVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzmu
    public final void zzZ(long j, long j2) throws zzje {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            try {
                zzaemVar.zzv(j, j2);
            } catch (zzael e) {
                throw zzP(e, e.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.zzZ(j, j2);
    }

    protected final void zzaA(long j) {
        zziv zzivVar = this.zza;
        zzivVar.zzk += j;
        zzivVar.zzl++;
        this.zzI += j;
        this.zzJ++;
    }

    protected final void zzaB(zzvb zzvbVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzvbVar.zzd(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzD = 0;
        if (this.zzr == null) {
            zzbv zzbvVar = this.zzL;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzM)) {
                this.zzM = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzv == null) {
                return;
            }
            zzbo();
        }
    }

    protected final boolean zzaC(zzve zzveVar) {
        if (zzbq(zzveVar.zza)) {
            return false;
        }
        return !zzveVar.zzf || zzacy.zza(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzaG(zzve zzveVar) {
        return zzby(zzveVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzaO() {
        zzve zzaL = zzaL();
        if (this.zzr != null && zzaL != null) {
            String str = zzaL.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzaP() {
        boolean z;
        zzv zzaJ = zzaJ();
        long j = this.zzR;
        if (j != C.TIME_UNSET) {
            if (zzaQ() + j + 1 <= Long.MAX_VALUE - (zzbg() + this.zzR)) {
                z = false;
                return this.zzF == null || this.zzH || (zzaJ != null && zzaJ.zzr > 0) || z || zzbe() != C.TIME_UNSET;
            }
        }
        z = true;
        if (this.zzF == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzaR() {
        super.zzaR();
        this.zzn.clear();
        this.zzE = 0;
        this.zzT = 0;
        this.zzH = false;
        zzacf zzacfVar = this.zzk;
        if (zzacfVar != null) {
            zzacfVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zzvd zzaT(Throwable th, zzve zzveVar) {
        return new zzacq(th, zzveVar, this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzaU(zzv zzvVar) throws zzje {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null || zzaemVar.zze()) {
            return true;
        }
        try {
            zzaemVar.zzd(zzvVar);
            return true;
        } catch (zzael e) {
            throw zzP(e, zzvVar, false, AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzaV(zzip zzipVar) throws zzje {
        ByteBuffer byteBuffer;
        zzacf zzacfVar = this.zzk;
        if (zzacfVar != null) {
            zzve zzaL = zzaL();
            zzaL.getClass();
            if (zzaL.zzb.equals("video/av01") && zzipVar.zzc() && (byteBuffer = zzipVar.zzc) != null) {
                zzacfVar.zzb(byteBuffer);
            }
        }
        this.zzT = 0;
        int zzaW = zzaW(zzipVar);
        if (Build.VERSION.SDK_INT < 34 || (zzaW & 32) == 0) {
            this.zzE++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final int zzaW(zzip zzipVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzF == null || !zzbw(zzipVar) || zzbv(zzipVar)) ? 0 : 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzvl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean zzaX(zzip zzipVar) {
        boolean z;
        ByteBuffer byteBuffer;
        boolean z2 = false;
        if (zzbv(zzipVar)) {
            return false;
        }
        boolean zzbw = zzbw(zzipVar);
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            long zzb2 = zzadnVar.zzb(zzipVar.zze);
            if (zzb2 != C.TIME_UNSET && zzb2 < this.zzl) {
                z = true;
                if ((zzbw && !z) || zzipVar.zze()) {
                    return false;
                }
                if (zzipVar.zzf()) {
                    zzacf zzacfVar = this.zzk;
                    if (zzacfVar != null) {
                        zzve zzaL = zzaL();
                        zzaL.getClass();
                        if (zzaL.zzb.equals("video/av01") && (byteBuffer = zzipVar.zzc) != null) {
                            boolean z3 = zzbw || this.zzT <= 0;
                            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            asReadOnlyBuffer.flip();
                            int zza = zzacfVar.zza(asReadOnlyBuffer, z3);
                            if (zza == 0) {
                                zzipVar.zza();
                            } else if (zza != asReadOnlyBuffer.limit()) {
                                zzacv zzacvVar = this.zzo;
                                zzacvVar.getClass();
                                if (zzacvVar.zzc + zza < asReadOnlyBuffer.capacity() && !zzipVar.zzk()) {
                                    ByteBuffer byteBuffer2 = zzipVar.zzc;
                                    byteBuffer2.getClass();
                                    byteBuffer2.position(zza);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (zzbw) {
                            this.zza.zzd++;
                            return z2;
                        }
                        this.zzn.add(Long.valueOf(zzipVar.zze));
                        this.zzT++;
                    }
                    return z2;
                }
                zzipVar.zza();
                z2 = true;
                if (z2) {
                }
                return z2;
            }
        }
        z = false;
        if (zzbw) {
        }
        if (zzipVar.zzf()) {
        }
        z2 = true;
        if (z2) {
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzaZ(long j) {
        super.zzaZ(j);
        this.zzE--;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzmu
    public final boolean zzaa() {
        boolean zzba = zzba();
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            return zzaemVar.zzh(zzba);
        }
        if (zzba && zzaI() == null) {
            return true;
        }
        return this.zzi.zzi(zzba);
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzmu
    public final boolean zzab() {
        if (!super.zzab()) {
            return false;
        }
        zzaem zzaemVar = this.zzr;
        return zzaemVar == null || zzaemVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final int zzae(zzvn zzvnVar, zzv zzvVar) throws zzvp {
        boolean z;
        String str = zzvVar.zzp;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzvVar.zzt != null;
        List zzbs = zzbs(context, zzvnVar, zzvVar, z2, false);
        if (z2 && zzbs.isEmpty()) {
            zzbs = zzbs(context, zzvnVar, zzvVar, false, false);
        }
        if (zzbs.isEmpty()) {
            return 129;
        }
        if (!zzbj(zzvVar)) {
            return 130;
        }
        zzve zzveVar = (zzve) zzbs.get(0);
        boolean zzc2 = zzveVar.zzc(context, zzvVar);
        if (!zzc2) {
            for (int i2 = 1; i2 < zzbs.size(); i2++) {
                zzve zzveVar2 = (zzve) zzbs.get(i2);
                if (zzveVar2.zzc(context, zzvVar)) {
                    zzc2 = true;
                    z = false;
                    zzveVar = zzveVar2;
                    break;
                }
            }
        }
        z = true;
        int i3 = true != zzc2 ? 3 : 4;
        int i4 = true != zzveVar.zze(zzvVar) ? 8 : 16;
        int i5 = true != zzveVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !zzact.zza(context)) {
            i6 = 256;
        }
        if (zzc2) {
            List zzbs2 = zzbs(context, zzvnVar, zzvVar, z2, true);
            if (!zzbs2.isEmpty()) {
                zzve zzveVar3 = (zzve) zzvx.zze(context, zzbs2, zzvVar).get(0);
                if (zzveVar3.zzc(context, zzvVar) && zzveVar3.zze(zzvVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final List zzaf(zzvn zzvnVar, zzv zzvVar, boolean z) throws zzvp {
        Context context = this.zze;
        return zzvx.zze(context, zzbs(context, zzvnVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zzuy zzah(zzve zzveVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        int i;
        zzacv zzacvVar;
        Point point;
        int i2;
        int i3;
        int i4;
        boolean z;
        zzv[] zzvVarArr;
        char c;
        boolean z2;
        Pair zze;
        int zzaw;
        zzv[] zzJ = zzJ();
        int length = zzJ.length;
        int zzbm = zzbm(zzveVar, zzvVar);
        int i5 = zzvVar.zzx;
        int i6 = zzvVar.zzw;
        if (length == 1) {
            if (zzbm != -1 && (zzaw = zzaw(zzveVar, zzvVar)) != -1) {
                zzbm = Math.min((int) (zzbm * 1.5f), zzaw);
            }
            zzacvVar = new zzacv(i6, i5, zzbm);
            i = 35;
        } else {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            boolean z3 = false;
            i = 35;
            while (i9 < length) {
                zzv zzvVar2 = zzJ[i9];
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zzvVar2.zzF == null) {
                    zzt zza = zzvVar2.zza();
                    zza.zzE(zziVar);
                    zzvVar2 = zza.zzO();
                }
                if (zzveVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    int i10 = zzvVar2.zzw;
                    c = 65535;
                    if (i10 != -1) {
                        zzvVarArr = zzJ;
                        if (zzvVar2.zzx != -1) {
                            z2 = false;
                            z3 |= z2;
                            i8 = Math.max(i8, i10);
                            i7 = Math.max(i7, zzvVar2.zzx);
                            zzbm = Math.max(zzbm, zzbm(zzveVar, zzvVar2));
                        }
                    } else {
                        zzvVarArr = zzJ;
                    }
                    z2 = true;
                    z3 |= z2;
                    i8 = Math.max(i8, i10);
                    i7 = Math.max(i7, zzvVar2.zzx);
                    zzbm = Math.max(zzbm, zzbm(zzveVar, zzvVar2));
                } else {
                    zzvVarArr = zzJ;
                    c = 65535;
                }
                i9++;
                zzJ = zzvVarArr;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 44 + String.valueOf(i7).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i8);
                sb.append("x");
                sb.append(i7);
                zzef.zzc("MediaCodecVideoRenderer", sb.toString());
                boolean z4 = i5 > i6;
                int i11 = z4 ? i5 : i6;
                int i12 = true != z4 ? i5 : i6;
                int[] iArr = zzb;
                int i13 = 0;
                while (i13 < 9) {
                    float f2 = i12;
                    float f3 = i11;
                    int i14 = iArr[i13];
                    int i15 = i13;
                    float f4 = i14;
                    if (i14 <= i11 || (i2 = (int) (f4 * (f2 / f3))) <= i12) {
                        break;
                    }
                    int i16 = i11;
                    if (true != z4) {
                        i3 = i12;
                        i4 = i14;
                    } else {
                        i3 = i12;
                        i4 = i2;
                    }
                    if (true != z4) {
                        i14 = i2;
                    }
                    point = zzveVar.zzi(i4, i14);
                    float f5 = zzvVar.zzA;
                    if (point != null) {
                        z = z4;
                        if (zzveVar.zzg(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i13 = i15 + 1;
                    i11 = i16;
                    i12 = i3;
                    z4 = z;
                }
                point = null;
                if (point != null) {
                    i8 = Math.max(i8, point.x);
                    i7 = Math.max(i7, point.y);
                    zzt zza2 = zzvVar.zza();
                    zza2.zzv(i8);
                    zza2.zzw(i7);
                    zzbm = Math.max(zzbm, zzaw(zzveVar, zza2.zzO()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 35 + String.valueOf(i7).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i8);
                    sb2.append("x");
                    sb2.append(i7);
                    zzef.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzacvVar = new zzacv(i8, i7, zzbm);
        }
        String str = zzveVar.zzc;
        this.zzo = zzacvVar;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i6);
        mediaFormat.setInteger("height", i5);
        zzei.zza(mediaFormat, zzvVar.zzs);
        float f6 = zzvVar.zzA;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzei.zzb(mediaFormat, "rotation-degrees", zzvVar.zzB);
        zzi zziVar2 = zzvVar.zzF;
        if (zziVar2 != null) {
            zzei.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzei.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzei.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(zzvVar.zzp) && (zze = zzdp.zze(zzvVar)) != null) {
            zzei.zzb(mediaFormat, Scopes.PROFILE, ((Integer) zze.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzacvVar.zza);
        mediaFormat.setInteger("max-height", zzacvVar.zzb);
        zzei.zzb(mediaFormat, "max-input-size", zzacvVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzN));
        }
        zzbi(mediaFormat);
        Surface zzbz = zzbz(zzveVar);
        if (this.zzr != null && !zzfk.zzT(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzuy.zzb(zzveVar, mediaFormat, zzvVar, zzbz, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zziw zzai(zzve zzveVar, zzv zzvVar, zzv zzvVar2) {
        int i;
        int i2;
        zziw zzf = zzveVar.zzf(zzvVar, zzvVar2);
        int i3 = zzf.zze;
        zzacv zzacvVar = this.zzo;
        zzacvVar.getClass();
        if (zzvVar2.zzw > zzacvVar.zza || zzvVar2.zzx > zzacvVar.zzb) {
            i3 |= 256;
        }
        if (zzbm(zzveVar, zzvVar2) > zzacvVar.zzc) {
            i3 |= 64;
        }
        if (this.zzA != Integer.MIN_VALUE) {
            float f = zzvVar.zzA;
            if (f != -1.0f) {
                float f2 = zzvVar2.zzA;
                if (f2 != -1.0f && Math.abs(f2 - f) > 1.0f && (Build.VERSION.SDK_INT < 30 || (Build.VERSION.SDK_INT == 30 && Build.MODEL.startsWith("MiTV")))) {
                    i3 |= 65536;
                }
            }
        }
        String str = zzveVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzf.zzd;
        }
        return new zziw(str, zzvVar, zzvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final float zzak(float f, zzv zzvVar, zzv[] zzvVarArr) {
        zzve zzaL;
        float f2 = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f3 = zzvVar2.zzA;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.zzF == null || (zzaL = zzaL()) == null) {
            return f4;
        }
        float zzh = zzaL.zzh(zzvVar.zzw, zzvVar.zzx);
        return f4 != -1.0f ? Math.max(f4, zzh) : zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzal(String str, zzuy zzuyVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzp = zzbq(str);
        zzve zzaL = zzaL();
        zzaL.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(zzaL.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzb2 = zzaL.zzb();
            int length = zzb2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzb2[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzq = z;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzam(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzan(Exception exc) {
        zzef.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zziw zzao(zzlq zzlqVar) throws zzje {
        zziw zzao = super.zzao(zzlqVar);
        zzv zzvVar = zzlqVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzao);
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzd();
        }
        return zzao;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzap(zzv zzvVar, MediaFormat mediaFormat) {
        zzvb zzaI = zzaI();
        if (zzaI != null) {
            zzaI.zzq(this.zzz);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzvVar.zzC;
        int i = zzvVar.zzB;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzL = new zzbv(integer, integer2, f);
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null || !this.zzS) {
            this.zzi.zze(zzvVar.zzA);
        } else {
            zzt zza = zzvVar.zza();
            zza.zzv(integer);
            zza.zzw(integer2);
            zza.zzB(f);
            zzv zzO = zza.zzO();
            int i3 = this.zzt;
            List list = this.zzu;
            if (list == null) {
                list = zzgvz.zzi();
            }
            zzaemVar.zzs(1, zzO, zzbh(), i3, list);
            this.zzt = 2;
        }
        this.zzS = false;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzaq(long j, long j2, long j3, boolean z, boolean z2) throws zzje {
        int zzR;
        if (this.zzr != null && this.zzf) {
            j2 -= -this.zzQ;
        }
        if (j >= -500000 || z || (zzR = zzR(j2)) == 0) {
            return false;
        }
        this.zzG = j2;
        if (z2) {
            zziv zzivVar = this.zza;
            int i = zzivVar.zzd + zzR;
            zzivVar.zzd = i;
            zzivVar.zzf += this.zzE;
            zzivVar.zzd = i + this.zzn.size();
        } else {
            this.zza.zzj++;
            zzaz(zzR + this.zzn.size(), this.zzE);
        }
        zzaN();
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzar() {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzi();
            long j = this.zzQ;
            if (j == C.TIME_UNSET) {
                j = zzbh();
                this.zzQ = j;
            }
            this.zzr.zzo(-j);
        } else {
            this.zzi.zza(2);
        }
        this.zzS = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzat(zzit zzitVar) {
        this.zzg.zzk(zzitVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzau() {
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            zzaemVar.zzi();
        } else if (zzbe() != C.TIME_UNSET) {
            zzbe();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzav(zzip zzipVar) throws zzje {
        if (this.zzq) {
            ByteBuffer byteBuffer = zzipVar.zzf;
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
                        zzvb zzaI = zzaI();
                        zzaI.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaI.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzax(zzvb zzvbVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzvbVar.zzc(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzay(zzvb zzvbVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzvbVar.zzc(i, false);
        Trace.endSection();
        zzaz(0, 1);
    }

    protected final void zzaz(int i, int i2) {
        zziv zzivVar = this.zza;
        zzivVar.zzh += i;
        int i3 = i + i2;
        zzivVar.zzg += i3;
        this.zzC += i3;
        int i4 = this.zzD + i3;
        this.zzD = i4;
        zzivVar.zzi = Math.max(i4, zzivVar.zzi);
    }

    final /* synthetic */ Surface zzbp() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzy(boolean z, boolean z2) throws zzje {
        super.zzy(z, z2);
        zzK();
        this.zzg.zza(this.zza);
        if (!this.zzs) {
            if (this.zzu != null && this.zzr == null) {
                zzada zzadaVar = new zzada(this.zze, this.zzi);
                zzadaVar.zza(true);
                zzadaVar.zzc(-this.zzl);
                zzadaVar.zzb(zzM());
                zzadi zzd2 = zzadaVar.zzd();
                zzd2.zza(1);
                this.zzr = zzd2.zzb(0);
            }
            this.zzs = true;
        }
        int i = !z2 ? 1 : 0;
        zzaem zzaemVar = this.zzr;
        if (zzaemVar == null) {
            zzadm zzadmVar = this.zzi;
            zzadmVar.zzg(zzM());
            zzadmVar.zza(i);
            return;
        }
        zzaemVar.zzc(new zzacr(this), zzhbz.zza());
        zzadj zzadjVar = this.zzP;
        if (zzadjVar != null) {
            this.zzr.zzl(zzadjVar);
        }
        if (this.zzv != null && !this.zzx.equals(zzet.zza)) {
            this.zzr.zzp(this.zzv, this.zzx);
        }
        this.zzr.zzr(this.zzA);
        this.zzr.zzm(zzbb());
        List list = this.zzu;
        if (list != null) {
            this.zzr.zzn(list);
        }
        this.zzt = i;
        zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzz(zzv[] zzvVarArr, long j, long j2, zzxc zzxcVar) throws zzje {
        super.zzz(zzvVarArr, j, j2, zzxcVar);
        zzbt(zzxcVar);
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            zzadnVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzas(long j, long j2, zzvb zzvbVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzje {
        zzacw zzacwVar;
        long j4;
        zzvbVar.getClass();
        long zzbg = j3 - zzbg();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzn;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzaz(i4, 0);
        zzaem zzaemVar = this.zzr;
        if (zzaemVar != null) {
            if (!z || z2) {
                return zzaemVar.zzu(j3, new zzacs(this, zzvbVar, i, zzbg));
            }
            zzax(zzvbVar, i, zzbg);
            return true;
        }
        zzadm zzadmVar = this.zzi;
        long zzbh = zzbh();
        zzadk zzadkVar = this.zzj;
        int zzk = zzadmVar.zzk(j3, j, j2, zzbh, z, z2, zzadkVar);
        zzadn zzadnVar = this.zzm;
        if (zzadnVar != null) {
            if (zzk != 5 && zzk != 4) {
                zzadnVar.zza(j3, zzadkVar.zza());
            }
            return false;
        }
        if (zzk == 0) {
            long zzc2 = zzM().zzc();
            zzbx(zzbg, zzc2, zzvVar);
            zzaB(zzvbVar, i, zzbg, zzc2);
            zzaA(zzadkVar.zza());
            return true;
        }
        if (zzk != 1) {
            if (zzk == 2) {
                zzay(zzvbVar, i, zzbg);
                zzaA(zzadkVar.zza());
                return true;
            }
            if (zzk == 3) {
                zzax(zzvbVar, i, zzbg);
                zzaA(zzadkVar.zza());
                return true;
            }
            return false;
        }
        long zzb2 = zzadkVar.zzb();
        long zza = zzadkVar.zza();
        if (zzb2 == this.zzK) {
            zzax(zzvbVar, i, zzbg);
            j4 = zzb2;
            zzacwVar = this;
        } else {
            zzbx(zzbg, zzb2, zzvVar);
            zzaB(zzvbVar, i, zzbg, zzb2);
            zzacwVar = this;
            j4 = zzb2;
        }
        zzacwVar.zzaA(zza);
        zzacwVar.zzK = j4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmp
    public final void zzx(int i, Object obj) throws zzje {
        if (i == 1) {
            zzbu(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzadj zzadjVar = (zzadj) obj;
            this.zzP = zzadjVar;
            zzaem zzaemVar = this.zzr;
            if (zzaemVar != null) {
                zzaemVar.zzl(zzadjVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzO != intValue) {
                this.zzO = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzz = intValue2;
            zzvb zzaI = zzaI();
            if (zzaI != null) {
                zzaI.zzq(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzA = intValue3;
            zzaem zzaemVar2 = this.zzr;
            if (zzaemVar2 != null) {
                zzaemVar2.zzr(intValue3);
                return;
            } else {
                this.zzi.zzm(intValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzaem zzaemVar3 = this.zzr;
                if (zzaemVar3 == null || !zzaemVar3.zze()) {
                    return;
                }
                zzaemVar3.zzf();
                return;
            }
            this.zzu = list;
            zzaem zzaemVar4 = this.zzr;
            if (zzaemVar4 != null) {
                zzaemVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzet zzetVar = (zzet) obj;
            if (zzetVar.zza() == 0 || zzetVar.zzb() == 0) {
                return;
            }
            this.zzx = zzetVar;
            zzaem zzaemVar5 = this.zzr;
            if (zzaemVar5 != null) {
                Surface surface = this.zzv;
                surface.getClass();
                zzaemVar5.zzp(surface, zzetVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzN = ((Integer) obj).intValue();
                zzvb zzaI2 = zzaI();
                if (zzaI2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzN));
                    zzaI2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzv;
                zzbu(null);
                obj.getClass();
                ((zzacw) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzF != null;
                zznb zznbVar = (zznb) obj;
                this.zzF = zznbVar;
                if (z != (zznbVar != null)) {
                    zzbd();
                    break;
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }
}
