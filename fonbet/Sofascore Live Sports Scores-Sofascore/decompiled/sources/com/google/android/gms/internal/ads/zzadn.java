package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
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
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import defpackage.ban;
import defpackage.bka;
import defpackage.ci3;
import defpackage.ean;
import defpackage.fn0;
import defpackage.gvd;
import defpackage.gvo;
import defpackage.jcn;
import defpackage.lv4;
import defpackage.mio;
import defpackage.o5i;
import defpackage.pyn;
import defpackage.qan;
import defpackage.qpk;
import defpackage.vlo;
import defpackage.vpk;
import defpackage.wgo;
import defpackage.yan;
import defpackage.ybn;
import defpackage.yhe;
import defpackage.z1a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzadn extends zzvz implements zzaec {
    public static final int[] o1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean p1;
    public static boolean q1;
    public final zzaex A0;
    public final boolean B0;
    public final zzaed C0;
    public final zzaeb D0;
    public final zzadf E0;
    public final zzact F0;
    public final long G0;
    public final qpk H0;
    public final PriorityQueue I0;
    public zzadl J0;
    public boolean K0;
    public boolean L0;
    public zzafd M0;
    public boolean N0;
    public int O0;
    public List P0;
    public Surface Q0;
    public zzadp R0;
    public zzev S0;
    public boolean T0;
    public int U0;
    public int V0;
    public long W0;
    public int X0;
    public int Y0;
    public int Z0;
    public zznl a1;
    public long b1;
    public boolean c1;
    public long d1;
    public int e1;
    public long f1;
    public zzbv g1;
    public zzbv h1;
    public int i1;
    public int j1;
    public zzaea k1;
    public long l1;
    public boolean m1;
    public int n1;
    public final Context y0;
    public final boolean z0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzadn(zzadk zzadkVar) {
        super(r1.getApplicationContext(), 2, r0);
        zzvh zzvhVar = zzadkVar.c;
        Context context = zzadkVar.a;
        Context applicationContext = context.getApplicationContext();
        this.y0 = applicationContext;
        this.M0 = null;
        this.A0 = new zzaex(zzadkVar.d, zzadkVar.e);
        this.z0 = this.M0 == null;
        this.C0 = new zzaed(applicationContext, this);
        this.D0 = new zzaeb();
        this.E0 = new zzadf(new bka(this, 29));
        this.B0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.S0 = zzev.c;
        this.U0 = 1;
        this.V0 = 0;
        this.g1 = zzbv.d;
        this.j1 = 0;
        this.h1 = null;
        this.i1 = -1000;
        this.l1 = C.TIME_UNSET;
        this.F0 = new zzact();
        this.I0 = new PriorityQueue();
        this.G0 = -15000L;
        this.H0 = new qpk(1);
        this.a1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H263) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int B0(zzvs zzvsVar, zzv zzvVar) {
        int i = zzvVar.v;
        int i2 = zzvVar.w;
        if (i != -1 && i2 != -1) {
            String str = zzvVar.o;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair b = zzdr.b(zzvVar);
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
            int i3 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        return Math.max(2097152, ((i * i2) * 3) / 4);
                    }
                    break;
                case 1187890754:
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        String str2 = Build.MODEL;
                        if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzvsVar.f)))) {
                            String str3 = zzfm.a;
                            return ((((i2 + 15) / 16) * ((i + 15) / 16)) * 768) / 4;
                        }
                    }
                    break;
                case 1599127256:
                    break;
                case 1599127257:
                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9)) {
                        i3 = 8;
                        return ((i * i2) * 3) / i3;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int F0(zzvs zzvsVar, zzv zzvVar) {
        int i = zzvVar.p;
        if (i == -1) {
            return B0(zzvsVar, zzvVar);
        }
        List list = zzvVar.r;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019a, code lost:
    
        if (r1.equals("EverStar_S") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a4, code lost:
    
        if (r1.equals("hwALE-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r1.equals("itel_S41") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b8, code lost:
    
        if (r1.equals("LS-5017") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c2, code lost:
    
        if (r1.equals("panell_d") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cc, code lost:
    
        if (r1.equals("j2xlteins") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d6, code lost:
    
        if (r1.equals("A7000plus") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e0, code lost:
    
        if (r1.equals("manning") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ea, code lost:
    
        if (r1.equals("GIONEE_WBL7519") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f4, code lost:
    
        if (r1.equals("GIONEE_WBL7365") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fe, code lost:
    
        if (r1.equals("GIONEE_WBL5708") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0208, code lost:
    
        if (r1.equals("QM16XE_U") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0212, code lost:
    
        if (r1.equals("Pixi5-10_4G") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021c, code lost:
    
        if (r1.equals("TB3-850M") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0226, code lost:
    
        if (r1.equals("TB3-850F") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0230, code lost:
    
        if (r1.equals("TB3-730X") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x023a, code lost:
    
        if (r1.equals("TB3-730F") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0244, code lost:
    
        if (r1.equals("A7020a48") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024e, code lost:
    
        if (r1.equals("A7010a48") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0258, code lost:
    
        if (r1.equals("griffin") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0262, code lost:
    
        if (r1.equals("marino_f") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026c, code lost:
    
        if (r1.equals("CPY83_I00") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0276, code lost:
    
        if (r1.equals("A2016a40") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0280, code lost:
    
        if (r1.equals("le_x6") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x028a, code lost:
    
        if (r1.equals("l5460") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0294, code lost:
    
        if (r1.equals("i9031") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029e, code lost:
    
        if (r1.equals("X3_HK") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a8, code lost:
    
        if (r1.equals("V23GB") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b2, code lost:
    
        if (r1.equals("Q4310") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02bc, code lost:
    
        if (r1.equals("Q4260") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c6, code lost:
    
        if (r1.equals("PRO7S") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d0, code lost:
    
        if (r1.equals("F3311") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02da, code lost:
    
        if (r1.equals("F3215") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e4, code lost:
    
        if (r1.equals("F3213") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02ee, code lost:
    
        if (r1.equals("F3211") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02f8, code lost:
    
        if (r1.equals("F3116") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0302, code lost:
    
        if (r1.equals("F3113") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x030c, code lost:
    
        if (r1.equals("F3111") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0316, code lost:
    
        if (r1.equals("E5643") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0320, code lost:
    
        if (r1.equals("A1601") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x032a, code lost:
    
        if (r1.equals("Aura_Note_2") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0334, code lost:
    
        if (r1.equals("602LV") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x033e, code lost:
    
        if (r1.equals("601LV") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0348, code lost:
    
        if (r1.equals("MEIZU_M5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0352, code lost:
    
        if (r1.equals("p212") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x035c, code lost:
    
        if (r1.equals("mido") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0366, code lost:
    
        if (r1.equals("kate") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0370, code lost:
    
        if (r1.equals("fugu") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x037a, code lost:
    
        if (r1.equals("XE2X") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0384, code lost:
    
        if (r1.equals("Q427") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x038e, code lost:
    
        if (r1.equals("Q350") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0398, code lost:
    
        if (r1.equals("P681") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03a2, code lost:
    
        if (r1.equals("F04J") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03ac, code lost:
    
        if (r1.equals("F04H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b6, code lost:
    
        if (r1.equals("F03H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r2.equals("machuca") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03c0, code lost:
    
        if (r1.equals("F02H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03ca, code lost:
    
        if (r1.equals("F01J") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03d4, code lost:
    
        if (r1.equals("F01H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03de, code lost:
    
        if (r1.equals("1714") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03e8, code lost:
    
        if (r1.equals("1713") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03f2, code lost:
    
        if (r1.equals("1601") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03fc, code lost:
    
        if (r1.equals("flo") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0406, code lost:
    
        if (r1.equals("deb") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0410, code lost:
    
        if (r1.equals("cv3") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x041a, code lost:
    
        if (r1.equals("cv1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0424, code lost:
    
        if (r1.equals("Z80") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x042e, code lost:
    
        if (r1.equals("QX1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0438, code lost:
    
        if (r1.equals("PLE") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0442, code lost:
    
        if (r1.equals("P85") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x044c, code lost:
    
        if (r1.equals("MX6") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0456, code lost:
    
        if (r1.equals("M5c") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0460, code lost:
    
        if (r1.equals("M04") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x046a, code lost:
    
        if (r1.equals("JGZ") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0474, code lost:
    
        if (r1.equals("mh") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x047e, code lost:
    
        if (r1.equals("b5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        if (r2.equals("once") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0488, code lost:
    
        if (r1.equals("V5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0492, code lost:
    
        if (r1.equals("V1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x049c, code lost:
    
        if (r1.equals("Q5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04a6, code lost:
    
        if (r1.equals("C1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04b0, code lost:
    
        if (r1.equals("woods_fn") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04ba, code lost:
    
        if (r1.equals("ELUGA_A3_Pro") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04c4, code lost:
    
        if (r1.equals("Z12_PRO") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04ce, code lost:
    
        if (r1.equals("BLACK-1X") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04d8, code lost:
    
        if (r1.equals("taido_row") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04e2, code lost:
    
        if (r1.equals("Pixi4-7_3G") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (r2.equals("magnolia") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04ec, code lost:
    
        if (r1.equals("GIONEE_GBL7360") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04f6, code lost:
    
        if (r1.equals("GiONEE_CBL7513") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0500, code lost:
    
        if (r1.equals("OnePlus5T") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x050a, code lost:
    
        if (r1.equals("whyred") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0514, code lost:
    
        if (r1.equals("watson") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x051e, code lost:
    
        if (r1.equals("SVP-DTV15") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0528, code lost:
    
        if (r1.equals("A7000-a") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0532, code lost:
    
        if (r1.equals("nicklaus_f") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x053c, code lost:
    
        if (r1.equals("tcl_eu") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0546, code lost:
    
        if (r1.equals("ELUGA_Ray_X") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r2.equals("aquaman") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0550, code lost:
    
        if (r1.equals("s905x018") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x055a, code lost:
    
        if (r1.equals("A10-70L") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0564, code lost:
    
        if (r1.equals("A10-70F") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x056e, code lost:
    
        if (r1.equals("namath") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0578, code lost:
    
        if (r1.equals("Slate_Pro") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0582, code lost:
    
        if (r1.equals("iris60") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x058c, code lost:
    
        if (r1.equals("BRAVIA_ATV2") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0596, code lost:
    
        if (r1.equals("GiONEE_GBL7319") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x05a0, code lost:
    
        if (r1.equals("panell_dt") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x05aa, code lost:
    
        if (r1.equals("panell_ds") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r2.equals("oneday") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05b4, code lost:
    
        if (r1.equals("panell_dl") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05be, code lost:
    
        if (r1.equals("vernee_M5") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05c8, code lost:
    
        if (r1.equals("pacificrim") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05d2, code lost:
    
        if (r1.equals("Phantom6") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05dc, code lost:
    
        if (r1.equals("ComioS1") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x05e6, code lost:
    
        if (r1.equals("XT1663") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05f0, code lost:
    
        if (r1.equals("RAIJIN") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05fa, code lost:
    
        if (r1.equals("AquaPowerM") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0603, code lost:
    
        if (r1.equals("PGN611") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x060c, code lost:
    
        if (r1.equals("PGN610") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r2.equals("dangalUHD") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0615, code lost:
    
        if (r1.equals("PGN528") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x061e, code lost:
    
        if (r1.equals("NX573J") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0627, code lost:
    
        if (r1.equals("NX541J") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0630, code lost:
    
        if (r1.equals("CP8676_I02") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0639, code lost:
    
        if (r1.equals("K50a40") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0642, code lost:
    
        if (r1.equals("GIONEE_SWW1631") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x064b, code lost:
    
        if (r1.equals("GIONEE_SWW1627") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0654, code lost:
    
        if (r1.equals("GIONEE_SWW1609") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r2.equals("dangalFHD") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0668, code lost:
    
        if (r2.equals("JSN-L21") == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        if (r2.equals("dangal") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        if (r2.equals("AFTEUFF014") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r2.equals("AFTSO001") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        if (r2.equals("AFTEU014") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        if (r2.equals("AFTEU011") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        if (r2.equals("AFTR") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        if (r2.equals("AFTN") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        if (r2.equals("AFTA") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cf, code lost:
    
        if (r2.equals("AFTKMST12") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        if (r2.equals("AFTJMST12") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f0, code lost:
    
        if (r1.equals("HWWAS-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
    
        if (r1.equals("HWVNS-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        if (r1.equals("ELUGA_Prim") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010e, code lost:
    
        if (r1.equals("ELUGA_Note") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
    
        if (r1.equals("ASUS_X00AD_2") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        if (r1.equals("HWCAM-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        if (r1.equals("HWBLN-H") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0136, code lost:
    
        if (r1.equals("DM-01K") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0140, code lost:
    
        if (r1.equals("BRAVIA_ATV3_4K") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014a, code lost:
    
        if (r1.equals("Infinix-X572") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
    
        if (r1.equals("PB2-670M") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015e, code lost:
    
        if (r1.equals("santoni") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0168, code lost:
    
        if (r1.equals("iball8735_9806") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0172, code lost:
    
        if (r1.equals("CPH1715") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
    
        if (r1.equals("CPH1609") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r1.equals("woods_f") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0190, code lost:
    
        if (r1.equals("htc_e56ml_dtul") != false) goto L38;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean G0(String str) {
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzadn.class) {
            if (!p1) {
                int i = Build.VERSION.SDK_INT;
                if (i <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            break;
                        case -1220081023:
                            break;
                        case -1220066608:
                            break;
                        case -1012436106:
                            break;
                        case -760312546:
                            break;
                        case -64886864:
                            break;
                        case 3415681:
                            break;
                        case 825323514:
                            break;
                    }
                    q1 = z;
                    p1 = true;
                }
                if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            break;
                        case -321033677:
                            break;
                        case 2006354:
                            break;
                        case 2006367:
                            break;
                        case 2006371:
                            break;
                        case 1785421873:
                            break;
                        case 1785421876:
                            break;
                        case 1798172390:
                            break;
                        case 2119412532:
                            break;
                        default:
                            if (i <= 26) {
                                String str4 = Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        break;
                                    case -2144781185:
                                        break;
                                    case -2144781160:
                                        break;
                                    case -2097309513:
                                        break;
                                    case -2022874474:
                                        break;
                                    case -1978993182:
                                        break;
                                    case -1978990237:
                                        break;
                                    case -1936688988:
                                        break;
                                    case -1936688066:
                                        break;
                                    case -1936688065:
                                        break;
                                    case -1931988508:
                                        break;
                                    case -1885099851:
                                        break;
                                    case -1696512866:
                                        break;
                                    case -1680025915:
                                        break;
                                    case -1615810839:
                                        break;
                                    case -1600724499:
                                        break;
                                    case -1554255044:
                                        break;
                                    case -1481772737:
                                        break;
                                    case -1481772730:
                                        break;
                                    case -1481772729:
                                        break;
                                    case -1320080169:
                                        break;
                                    case -1217592143:
                                        break;
                                    case -1180384755:
                                        break;
                                    case -1139198265:
                                        break;
                                    case -1052835013:
                                        break;
                                    case -993250464:
                                        break;
                                    case -993250458:
                                        break;
                                    case -965403638:
                                        break;
                                    case -958336948:
                                        break;
                                    case -879245230:
                                        break;
                                    case -842500323:
                                        break;
                                    case -821392978:
                                        break;
                                    case -797483286:
                                        break;
                                    case -794946968:
                                        break;
                                    case -788334647:
                                        break;
                                    case -782144577:
                                        break;
                                    case -575125681:
                                        break;
                                    case -521118391:
                                        break;
                                    case -430914369:
                                        break;
                                    case -290434366:
                                        break;
                                    case -282781963:
                                        break;
                                    case -277133239:
                                        break;
                                    case -173639913:
                                        break;
                                    case -56598463:
                                        break;
                                    case 2126:
                                        break;
                                    case 2564:
                                        break;
                                    case 2715:
                                        break;
                                    case 2719:
                                        break;
                                    case 3091:
                                        break;
                                    case 3483:
                                        break;
                                    case 73405:
                                        break;
                                    case 75537:
                                        break;
                                    case 75739:
                                        break;
                                    case 76779:
                                        break;
                                    case 78669:
                                        break;
                                    case 79305:
                                        break;
                                    case 80618:
                                        break;
                                    case 88274:
                                        break;
                                    case 98846:
                                        break;
                                    case 98848:
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        break;
                                    case 1513190:
                                        break;
                                    case 1514184:
                                        break;
                                    case 1514185:
                                        break;
                                    case 2133089:
                                        break;
                                    case 2133091:
                                        break;
                                    case 2133120:
                                        break;
                                    case 2133151:
                                        break;
                                    case 2133182:
                                        break;
                                    case 2133184:
                                        break;
                                    case 2436959:
                                        break;
                                    case 2463773:
                                        break;
                                    case 2464648:
                                        break;
                                    case 2689555:
                                        break;
                                    case 3154429:
                                        break;
                                    case 3284551:
                                        break;
                                    case 3351335:
                                        break;
                                    case 3386211:
                                        break;
                                    case 41325051:
                                        break;
                                    case 51349633:
                                        break;
                                    case 51350594:
                                        break;
                                    case 55178625:
                                        break;
                                    case 61542055:
                                        break;
                                    case 65355429:
                                        break;
                                    case 66214468:
                                        break;
                                    case 66214470:
                                        break;
                                    case 66214473:
                                        break;
                                    case 66215429:
                                        break;
                                    case 66215431:
                                        break;
                                    case 66215433:
                                        break;
                                    case 66216390:
                                        break;
                                    case 76402249:
                                        break;
                                    case 76404105:
                                        break;
                                    case 76404911:
                                        break;
                                    case 80963634:
                                        break;
                                    case 82882791:
                                        break;
                                    case 98715550:
                                        break;
                                    case 101370885:
                                        break;
                                    case 102844228:
                                        break;
                                    case 165221241:
                                        break;
                                    case 182191441:
                                        break;
                                    case 245388979:
                                        break;
                                    case 287431619:
                                        break;
                                    case 307593612:
                                        break;
                                    case 308517133:
                                        break;
                                    case 316215098:
                                        break;
                                    case 316215116:
                                        break;
                                    case 316246811:
                                        break;
                                    case 316246818:
                                        break;
                                    case 407160593:
                                        break;
                                    case 507412548:
                                        break;
                                    case 793982701:
                                        break;
                                    case 794038622:
                                        break;
                                    case 794040393:
                                        break;
                                    case 835649806:
                                        break;
                                    case 917340916:
                                        break;
                                    case 958008161:
                                        break;
                                    case 1060579533:
                                        break;
                                    case 1150207623:
                                        break;
                                    case 1176899427:
                                        break;
                                    case 1280332038:
                                        break;
                                    case 1306947716:
                                        break;
                                    case 1349174697:
                                        break;
                                    case 1522194893:
                                        break;
                                    case 1691543273:
                                        break;
                                    case 1691544261:
                                        break;
                                    case 1709443163:
                                        break;
                                    case 1865889110:
                                        break;
                                    case 1906253259:
                                        break;
                                    case 1977196784:
                                        break;
                                    case 2006372676:
                                        break;
                                    case 2019281702:
                                        break;
                                    case 2029784656:
                                        break;
                                    case 2030379515:
                                        break;
                                    case 2033393791:
                                        break;
                                    case 2047190025:
                                        break;
                                    case 2047252157:
                                        break;
                                    case 2048319463:
                                        break;
                                    case 2048855701:
                                        break;
                                    default:
                                        if (str3.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                }
                            }
                            break;
                    }
                    q1 = z;
                    p1 = true;
                }
                z = true;
                q1 = z;
                p1 = true;
            }
        }
        return q1;
    }

    public static List H0(Context context, zzv zzvVar, boolean z, boolean z2) {
        List a;
        String str = zzvVar.o;
        if (str == null) {
            mio mioVar = zzgxm.b;
            return s.e;
        }
        if ("video/dolby-vision".equals(str) && !z1a.a0(context)) {
            String d = zzwl.d(zzvVar);
            if (d == null) {
                mio mioVar2 = zzgxm.b;
                a = s.e;
            } else {
                a = zzwl.a(d, z, z2);
            }
            if (!a.isEmpty()) {
                return a;
            }
        }
        return zzwl.b(zzvVar, z, z2);
    }

    public final boolean A0(long j, long j2, boolean z, boolean z2) {
        if (this.M0 != null && this.z0) {
            j2 -= -this.l1;
        }
        if (j < -500000 && !z) {
            zzzg zzzgVar = this.i;
            zzzgVar.getClass();
            int l = zzzgVar.l(j2 - this.k);
            if (l != 0) {
                this.b1 = j2;
                Iterator it = this.I0.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((Long) it.next()).longValue() >= this.l) {
                        i++;
                    }
                }
                zzje zzjeVar = this.o0;
                if (z2) {
                    int i2 = zzjeVar.d + l;
                    zzjeVar.f += this.Z0;
                    zzjeVar.d = i2 + i;
                } else {
                    zzjeVar.j++;
                    x0(l + i, this.Z0);
                }
                if (this.K != null) {
                    if (N()) {
                        M();
                        K();
                    } else if (O()) {
                        v();
                    } else {
                        this.t0 = true;
                    }
                }
                zzafd zzafdVar = this.M0;
                if (zzafdVar != null) {
                    zzafdVar.zzg(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean B(long j) {
        if (this.j0 == C.TIME_UNSET || j < this.b1) {
            return false;
        }
        long j2 = this.q0;
        return j2 == C.TIME_UNSET || j > j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final void C(float f, float f2) {
        super.C(f, f2);
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null) {
            zzafdVar.d(f);
        } else {
            this.C0.f(f);
        }
        qpk qpkVar = this.H0;
        if (qpkVar != null) {
            qpkVar.e(f);
        }
    }

    public final void C0(zzvp zzvpVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        zzvpVar.k(i);
        Trace.endSection();
        this.o0.f++;
    }

    public final boolean D0(zzvs zzvsVar) {
        if (this.M0 != null) {
            return true;
        }
        Surface surface = this.Q0;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && zzvsVar.h) {
            return true;
        }
        if (G0(zzvsVar.a)) {
            return false;
        }
        return !zzvsVar.f || zzadp.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface E0(zzvs zzvsVar) {
        boolean z;
        yhe yheVar;
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null) {
            return zzafdVar.zzk();
        }
        Surface surface = this.Q0;
        if (surface != null) {
            return surface;
        }
        zzadp zzadpVar = null;
        if (Build.VERSION.SDK_INT >= 35 && zzvsVar.h) {
            return null;
        }
        boolean z2 = false;
        zzguk.f(!G0(zzvsVar.a) && (!zzvsVar.f || zzadp.a()));
        zzadp zzadpVar2 = this.R0;
        if (zzadpVar2 != null) {
            if (zzadpVar2.a != zzvsVar.f) {
                if (zzadpVar2 != null) {
                    zzadpVar2.release();
                    this.R0 = null;
                } else {
                    zzadpVar = zzadpVar2;
                }
                zzadpVar2 = zzadpVar;
            }
        }
        if (zzadpVar2 != null) {
            return zzadpVar2;
        }
        boolean z3 = zzvsVar.f;
        if (!z3) {
            int i = zzadp.d;
        } else if (!zzadp.a()) {
            z = false;
            zzguk.f(z);
            yheVar = new yhe("ExoPlayer:PlaceholderSurface", 2);
            int i2 = !z3 ? zzadp.d : 0;
            yheVar.start();
            Handler handler = new Handler(yheVar.getLooper(), yheVar);
            yheVar.b = handler;
            yheVar.e = new zzdw(handler);
            synchronized (yheVar) {
                yheVar.b.obtainMessage(1, i2, 0).sendToTarget();
                while (((zzadp) yheVar.f) == null && yheVar.d == null && yheVar.c == null) {
                    try {
                        yheVar.wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
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
            zzadp zzadpVar3 = (zzadp) yheVar.f;
            zzadpVar3.getClass();
            this.R0 = zzadpVar3;
            return zzadpVar3;
        }
        z = true;
        zzguk.f(z);
        yheVar = new yhe("ExoPlayer:PlaceholderSurface", 2);
        if (!z3) {
        }
        yheVar.start();
        Handler handler2 = new Handler(yheVar.getLooper(), yheVar);
        yheVar.b = handler2;
        yheVar.e = new zzdw(handler2);
        synchronized (yheVar) {
        }
    }

    public final void I0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.Q0;
        zzaex zzaexVar = this.A0;
        if (surface2 == surface) {
            if (surface != null) {
                zzbv zzbvVar = this.h1;
                if (zzbvVar != null) {
                    zzaexVar.a(zzbvVar);
                }
                Surface surface3 = this.Q0;
                if (surface3 == null || !this.T0 || (handler = zzaexVar.a) == null) {
                    return;
                }
                handler.post(new jcn(zzaexVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.Q0 = surface;
        zzafd zzafdVar = this.M0;
        zzaed zzaedVar = this.C0;
        if (zzafdVar == null) {
            zzaedVar.c(surface);
        }
        this.T0 = false;
        int i = this.h;
        zzvp zzvpVar = this.K;
        if (zzvpVar != null && this.M0 == null) {
            zzvs zzvsVar = this.R;
            zzvsVar.getClass();
            if (!D0(zzvsVar) || this.K0) {
                M();
                K();
            } else {
                Surface E0 = E0(zzvsVar);
                if (E0 != null) {
                    zzvpVar.r(E0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        defpackage.zzl.s();
                        return;
                    }
                    zzvpVar.zzo();
                }
            }
        }
        if (surface != null) {
            zzbv zzbvVar2 = this.h1;
            if (zzbvVar2 != null) {
                zzaexVar.a(zzbvVar2);
            }
        } else {
            this.h1 = null;
            zzafd zzafdVar2 = this.M0;
            if (zzafdVar2 != null) {
                zzafdVar2.zzq();
            }
        }
        if (i == 2) {
            zzafd zzafdVar3 = this.M0;
            if (zzafdVar3 != null) {
                zzafdVar3.zzw(true);
            } else {
                zzaedVar.getClass();
            }
        }
    }

    public final boolean J0(zziy zziyVar) {
        if (J() || zziyVar.b(536870912)) {
            return true;
        }
        long j = this.r;
        return j == C.TIME_UNSET || j - (zziyVar.e - this.p0.c) <= 100000;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean L(zzvs zzvsVar) {
        return D0(zzvsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean N() {
        zzvs zzvsVar = this.R;
        if (this.M0 != null && zzvsVar != null) {
            String str = zzvsVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.N();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean O() {
        boolean z;
        zzv zzvVar = this.L;
        long j = this.r;
        if (j != C.TIME_UNSET) {
            if (this.u0 + 1 + j <= Long.MAX_VALUE - (this.p0.c + j)) {
                z = false;
                return this.a1 == null || this.c1 || (zzvVar != null && zzvVar.q > 0) || z || this.p0.f != C.TIME_UNSET;
            }
        }
        z = true;
        if (this.a1 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void P() {
        super.P();
        this.I0.clear();
        this.Z0 = 0;
        this.n1 = 0;
        this.c1 = false;
        zzact zzactVar = this.F0;
        if (zzactVar != null) {
            zzactVar.b = null;
            ByteBuffer byteBuffer = zzactVar.a;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvr R(IllegalStateException illegalStateException, zzvs zzvsVar) {
        Surface surface = this.Q0;
        zzadg zzadgVar = new zzadg(illegalStateException, zzvsVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void S(zzv zzvVar) {
        zzafd zzafdVar = this.M0;
        if (zzafdVar == null || zzafdVar.zze()) {
            return;
        }
        try {
            zzafdVar.c(zzvVar);
        } catch (zzafc e) {
            throw q(e, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void T(zziy zziyVar) {
        ByteBuffer byteBuffer;
        zzi zziVar;
        zzvs zzvsVar = this.R;
        zzvsVar.getClass();
        if (zzvsVar.b.equals(MimeTypes.VIDEO_AV1) && (byteBuffer = zziyVar.d) != null) {
            zzv zzvVar = this.L;
            if (zzvVar != null && (zziVar = zzvVar.F) != null && zziVar.e > 8 && Build.VERSION.SDK_INT < 37) {
                Iterator it = zzgx.a(byteBuffer.asReadOnlyBuffer()).iterator();
                while (it.hasNext()) {
                    zzgv zzgvVar = (zzgv) it.next();
                    int i = zzgvVar.a;
                    ByteBuffer byteBuffer2 = zzgvVar.b;
                    if (i == 5) {
                        try {
                            zzguk.a(i == 5);
                            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                            if (zzgx.b(asReadOnlyBuffer) == 4) {
                                if (asReadOnlyBuffer.remaining() >= 6) {
                                    byte[] bArr = new byte[6];
                                    asReadOnlyBuffer.asReadOnlyBuffer().get(bArr);
                                    if (!Arrays.equals(bArr, gvd.d)) {
                                    }
                                }
                                byteBuffer.put(byteBuffer2.position(), (byte) 31);
                            }
                        } catch (BufferUnderflowException unused) {
                        }
                    }
                }
            }
            zzact zzactVar = this.F0;
            if (zzactVar != null && zziyVar.b(1)) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, position + 500));
                ByteBuffer byteBuffer3 = zzactVar.a;
                byteBuffer3.clear();
                byteBuffer3.put(byteBuffer);
                byteBuffer3.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
        this.n1 = 0;
        int U = U(zziyVar);
        if (Build.VERSION.SDK_INT < 34 || (U & 32) == 0) {
            this.Z0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final int U(zziy zziyVar) {
        return (Build.VERSION.SDK_INT < 34 || this.a1 == null || zziyVar.e >= this.l || J0(zziyVar)) ? 0 : 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // com.google.android.gms.internal.ads.zzvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V(zziy zziyVar) {
        boolean z;
        ByteBuffer byteBuffer;
        zzgw zzgwVar;
        zzgs zzgsVar;
        boolean z2 = false;
        if (!J0(zziyVar)) {
            boolean z3 = zziyVar.e < this.l;
            qpk qpkVar = this.H0;
            if (qpkVar != null) {
                long j = qpkVar.a == C.TIME_UNSET ? -9223372036854775807L : (long) (((r2 - r6) * qpkVar.c) + qpkVar.b);
                if (j != C.TIME_UNSET && j < this.G0) {
                    z = true;
                    if ((!z3 || z) && !zziyVar.b(268435456)) {
                        if (zziyVar.b(67108864)) {
                            zzact zzactVar = this.F0;
                            if (zzactVar != null) {
                                ByteBuffer byteBuffer2 = zzactVar.a;
                                zzvs zzvsVar = this.R;
                                zzvsVar.getClass();
                                if (zzvsVar.b.equals(MimeTypes.VIDEO_AV1) && (byteBuffer = zziyVar.d) != null) {
                                    boolean z4 = z3 || this.n1 <= 0;
                                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                    asReadOnlyBuffer.flip();
                                    if (byteBuffer2.hasRemaining()) {
                                        zzactVar.a(zzgx.a(byteBuffer2));
                                        byteBuffer2.position(byteBuffer2.limit());
                                    }
                                    ArrayList a = zzgx.a(asReadOnlyBuffer);
                                    zzactVar.a(a);
                                    int size = a.size() - 1;
                                    int i = 0;
                                    while (size >= 0) {
                                        zzgv zzgvVar = (zzgv) a.get(size);
                                        int i2 = zzgvVar.a;
                                        if (i2 != 2 && i2 != 15) {
                                            if (i2 == 3) {
                                                if (!z4) {
                                                    break;
                                                }
                                                i2 = 3;
                                            }
                                            if ((i2 != 6 && i2 != 3) || (zzgwVar = zzactVar.b) == null) {
                                                break;
                                            }
                                            try {
                                                zzgsVar = new zzgs(zzgwVar, zzgvVar);
                                            } catch (wgo unused) {
                                                zzgsVar = null;
                                            }
                                            if (zzgsVar != null) {
                                                if (zzgsVar.a) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        if (((zzgv) a.get(size)).a == 6 || ((zzgv) a.get(size)).a == 3) {
                                            i++;
                                        }
                                        size--;
                                    }
                                    int limit = (i > 1 || size + 1 >= 8) ? asReadOnlyBuffer.limit() : size >= 0 ? ((zzgv) a.get(size)).b.limit() : asReadOnlyBuffer.position();
                                    if (limit == 0) {
                                        zziyVar.c();
                                    } else if (limit != asReadOnlyBuffer.limit()) {
                                        zzadl zzadlVar = this.J0;
                                        zzadlVar.getClass();
                                        if (zzadlVar.c + limit < asReadOnlyBuffer.capacity() && !zziyVar.b(1073741824)) {
                                            ByteBuffer byteBuffer3 = zziyVar.d;
                                            byteBuffer3.getClass();
                                            byteBuffer3.position(limit);
                                        }
                                    }
                                }
                            }
                            if (z2) {
                                if (z3) {
                                    this.o0.d++;
                                } else {
                                    this.n1++;
                                }
                                this.I0.add(Long.valueOf(zziyVar.e));
                            }
                            return z2;
                        }
                        zziyVar.c();
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
            if (zziyVar.b(67108864)) {
            }
            z2 = true;
            if (z2) {
            }
            return z2;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final int W(zzv zzvVar) {
        boolean z;
        String str = zzvVar.o;
        if (!zzas.b(str)) {
            return 128;
        }
        int i = 0;
        boolean z2 = zzvVar.s != null;
        Context context = this.y0;
        List H0 = H0(context, zzvVar, z2, false);
        if (z2 && H0.isEmpty()) {
            H0 = H0(context, zzvVar, false, false);
        }
        if (H0.isEmpty()) {
            return 129;
        }
        if (zzvVar.P != 0) {
            return 130;
        }
        zzvs zzvsVar = (zzvs) H0.get(0);
        boolean b = zzvsVar.b(context, zzvVar);
        if (!b) {
            for (int i2 = 1; i2 < H0.size(); i2++) {
                zzvs zzvsVar2 = (zzvs) H0.get(i2);
                if (zzvsVar2.b(context, zzvVar)) {
                    b = true;
                    z = false;
                    zzvsVar = zzvsVar2;
                    break;
                }
            }
        }
        z = true;
        int i3 = true != b ? 3 : 4;
        int i4 = true != zzvsVar.c(zzvVar) ? 8 : 16;
        int i5 = true != zzvsVar.g ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if ("video/dolby-vision".equals(str) && !z1a.a0(context)) {
            i6 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (b) {
            List H02 = H0(context, zzvVar, z2, true);
            if (!H02.isEmpty()) {
                HashMap hashMap = zzwl.a;
                ArrayList arrayList = new ArrayList(H02);
                Collections.sort(arrayList, new o5i(new gvo(14, context, zzvVar), 5));
                zzvs zzvsVar3 = (zzvs) arrayList.get(0);
                if (zzvsVar3.b(context, zzvVar) && zzvsVar3.c(zzvVar)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final ArrayList X(zzv zzvVar) {
        Context context = this.y0;
        List H0 = H0(context, zzvVar, false, false);
        HashMap hashMap = zzwl.a;
        ArrayList arrayList = new ArrayList(H0);
        Collections.sort(arrayList, new o5i(new gvo(14, context, zzvVar), 5));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvm Z(zzvs zzvsVar, zzv zzvVar, float f) {
        zzadl zzadlVar;
        Point point;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        char c;
        int i6;
        Pair b;
        int B0;
        zzv[] zzvVarArr = this.j;
        zzvVarArr.getClass();
        int length = zzvVarArr.length;
        int F0 = F0(zzvsVar, zzvVar);
        float f2 = zzvVar.z;
        zzi zziVar = zzvVar.F;
        int i7 = zzvVar.w;
        int i8 = zzvVar.v;
        if (length == 1) {
            if (F0 != -1 && (B0 = B0(zzvsVar, zzvVar)) != -1) {
                F0 = Math.min((int) (F0 * 1.5f), B0);
            }
            zzadlVar = new zzadl(i8, i7, F0);
        } else {
            int i9 = i7;
            int i10 = i8;
            int i11 = 0;
            boolean z2 = false;
            while (i11 < length) {
                zzv zzvVar2 = zzvVarArr[i11];
                if (zziVar != null && zzvVar2.F == null) {
                    zzt zztVar = new zzt(zzvVar2);
                    zztVar.E = zziVar;
                    zzvVar2 = new zzv(zztVar);
                }
                zzjf d = zzvsVar.d(zzvVar, zzvVar2);
                zzv[] zzvVarArr2 = zzvVarArr;
                int i12 = zzvVar2.w;
                if (d.d != 0) {
                    int i13 = zzvVar2.v;
                    i5 = length;
                    c = 65535;
                    z2 |= i13 == -1 || i12 == -1;
                    i10 = Math.max(i10, i13);
                    i9 = Math.max(i9, i12);
                    F0 = Math.max(F0, F0(zzvsVar, zzvVar2));
                } else {
                    i5 = length;
                    c = 65535;
                }
                i11++;
                zzvVarArr = zzvVarArr2;
                length = i5;
            }
            if (z2) {
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i9).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i10);
                sb.append("x");
                sb.append(i9);
                zzeh.c(sb.toString());
                boolean z3 = i7 > i8;
                int i14 = z3 ? i7 : i8;
                int i15 = true != z3 ? i7 : i8;
                int i16 = 0;
                while (true) {
                    if (i16 >= 9) {
                        break;
                    }
                    float f3 = i15;
                    float f4 = i14;
                    int i17 = o1[i16];
                    int i18 = i16;
                    float f5 = i17;
                    if (i17 <= i14 || (i = (int) (f5 * (f3 / f4))) <= i15) {
                        break;
                    }
                    if (true != z3) {
                        i2 = i14;
                        i3 = i17;
                    } else {
                        i2 = i14;
                        i3 = i;
                    }
                    int i19 = true == z3 ? i17 : i;
                    MediaCodecInfo.VideoCapabilities videoCapabilities = zzvsVar.d.getVideoCapabilities();
                    point = videoCapabilities != null ? zzvs.j(videoCapabilities, i3, i19) : null;
                    if (point != null) {
                        z = z3;
                        i4 = i15;
                        if (zzvsVar.e(point.x, point.y, f2)) {
                            break;
                        }
                    } else {
                        z = z3;
                        i4 = i15;
                    }
                    i16 = i18 + 1;
                    z3 = z;
                    i14 = i2;
                    i15 = i4;
                }
                point = null;
                if (point != null) {
                    i10 = Math.max(i10, point.x);
                    i9 = Math.max(i9, point.y);
                    zzt zztVar2 = new zzt(zzvVar);
                    zztVar2.u = i10;
                    zztVar2.v = i9;
                    F0 = Math.max(F0, B0(zzvsVar, new zzv(zztVar2)));
                    StringBuilder sb2 = new StringBuilder(fn0.a(i10, 35) + String.valueOf(i9).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i10);
                    sb2.append("x");
                    sb2.append(i9);
                    zzeh.c(sb2.toString());
                }
            }
            zzadlVar = new zzadl(i10, i9, F0);
        }
        String str = zzvsVar.c;
        this.J0 = zzadlVar;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i8);
        mediaFormat.setInteger("height", i7);
        zzek.a(mediaFormat, zzvVar.r);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        zzek.b(mediaFormat, "rotation-degrees", zzvVar.A);
        if (zziVar != null) {
            zzek.b(mediaFormat, "color-transfer", zziVar.c);
            zzek.b(mediaFormat, "color-standard", zziVar.a);
            zzek.b(mediaFormat, "color-range", zziVar.b);
            byte[] bArr = zziVar.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.o) && (b = zzdr.b(zzvVar)) != null) {
            zzek.b(mediaFormat, "profile", ((Integer) b.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzadlVar.a);
        mediaFormat.setInteger("max-height", zzadlVar.b);
        zzek.b(mediaFormat, "max-input-size", zzadlVar.c);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.B0) {
            mediaFormat.setInteger("no-post-process", 1);
            i6 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i6 = 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(i6, -this.i1));
        }
        q0(mediaFormat);
        Surface E0 = E0(zzvsVar);
        if (this.M0 != null && !zzfm.l(this.y0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new zzvm(zzvsVar, mediaFormat, zzvVar, E0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzne, com.google.android.gms.internal.ads.zzng
    public final String a() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzjf a0(zzvs zzvsVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        int i;
        int i2;
        int i3;
        zzjf d = zzvsVar.d(zzvVar, zzvVar2);
        int i4 = d.e;
        zzadl zzadlVar = this.J0;
        zzadlVar.getClass();
        if (zzvVar2.v > zzadlVar.a || zzvVar2.w > zzadlVar.b) {
            i4 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (F0(zzvsVar, zzvVar2) > zzadlVar.c) {
            i4 |= 64;
        }
        if (this.V0 != Integer.MIN_VALUE && (i3 = Build.VERSION.SDK_INT) < 31 && (i3 != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f = zzvVar.z;
            if (f != -1.0f) {
                float f2 = zzvVar2.z;
                if (f2 != -1.0f && (!zzvsVar.f || !z)) {
                    if (Math.abs((Math.max(f2, f) / Math.min(f2, f)) - Math.round(r12)) > 0.01f) {
                        i4 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    }
                }
            }
        }
        String str = zzvsVar.a;
        if (i4 != 0) {
            i2 = 0;
            i = i4;
        } else {
            i = 0;
            i2 = d.d;
        }
        return new zzjf(str, zzvVar, zzvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final float c0(float f, zzv zzvVar, zzv[] zzvVarArr) {
        zzvs zzvsVar;
        float f2 = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f3 = zzvVar2.z;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f && this.K != null) {
            if (this.E0.b() != C.TIME_UNSET) {
                f2 = 1.0E9f / r10.b();
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.a1 == null || (zzvsVar = this.R) == null) {
            return f4;
        }
        int i = zzvVar.v;
        int i2 = zzvVar.w;
        float f5 = -3.4028235E38f;
        if (zzvsVar.i) {
            float f6 = zzvsVar.l;
            if (f6 != -3.4028235E38f && zzvsVar.j == i && zzvsVar.k == i2) {
                f5 = f6;
            } else {
                f5 = 1024.0f;
                if (!zzvsVar.e(i, i2, 1024.0d)) {
                    float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (true) {
                        float f8 = f5 - f7;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f7;
                        boolean e = zzvsVar.e(i, i2, f9);
                        if (true == e) {
                            f7 = f9;
                        }
                        if (true != e) {
                            f5 = f9;
                        }
                    }
                    f5 = f7;
                }
                zzvsVar.l = f5;
                zzvsVar.j = i;
                zzvsVar.k = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void d0(long j, long j2, String str) {
        String str2;
        zzaex zzaexVar = this.A0;
        Handler handler = zzaexVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new ybn(zzaexVar, str2, j, j2));
        } else {
            str2 = str;
        }
        this.K0 = G0(str2);
        zzvs zzvsVar = this.R;
        zzvsVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9.equals(zzvsVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = zzvsVar.d.profileLevels;
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
        this.L0 = z;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void e0(String str) {
        zzaex zzaexVar = this.A0;
        Handler handler = zzaexVar.a;
        if (handler != null) {
            handler.post(new ybn(zzaexVar, str, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzmz
    public final void f(int i, Object obj) {
        if (i == 1) {
            I0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzaea zzaeaVar = (zzaea) obj;
            this.k1 = zzaeaVar;
            zzafd zzafdVar = this.M0;
            if (zzafdVar != null) {
                zzafdVar.g(zzaeaVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.j1 != intValue) {
                this.j1 = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.U0 = intValue2;
            zzvp zzvpVar = this.K;
            if (zzvpVar != null) {
                zzvpVar.y(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.V0 = intValue3;
            zzafd zzafdVar2 = this.M0;
            if (zzafdVar2 != null) {
                zzafdVar2.E(intValue3);
                return;
            }
            zzaek zzaekVar = this.C0.b;
            if (zzaekVar.h == intValue3) {
                return;
            }
            zzaekVar.h = intValue3;
            zzaekVar.b(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.a)) {
                zzafd zzafdVar3 = this.M0;
                if (zzafdVar3 == null || !zzafdVar3.zze()) {
                    return;
                }
                zzafdVar3.zzf();
                return;
            }
            this.P0 = list;
            zzafd zzafdVar4 = this.M0;
            if (zzafdVar4 != null) {
                zzafdVar4.h(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzev zzevVar = (zzev) obj;
            if (zzevVar.a == 0 || zzevVar.b == 0) {
                return;
            }
            this.S0 = zzevVar;
            zzafd zzafdVar5 = this.M0;
            if (zzafdVar5 != null) {
                Surface surface = this.Q0;
                surface.getClass();
                zzafdVar5.f(surface, zzevVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.i1 = ((Integer) obj).intValue();
                zzvp zzvpVar2 = this.K;
                if (zzvpVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.i1));
                    zzvpVar2.j(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.Q0;
                I0(null);
                obj.getClass();
                ((zzadn) obj).f(1, surface2);
                break;
            case 18:
                boolean z = this.a1 != null;
                zznl zznlVar = (zznl) obj;
                this.a1 = zznlVar;
                if (z != (zznlVar != null)) {
                    r0(this.L);
                    break;
                }
                break;
            default:
                super.f(i, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void f0(Exception exc) {
        zzeh.f("Video codec error", exc);
        zzaex zzaexVar = this.A0;
        Handler handler = zzaexVar.a;
        if (handler != null) {
            handler.post(new ybn(zzaexVar, exc, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void g(long j, boolean z, boolean z2) {
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null && !z) {
            zzafdVar.zzg(true);
        }
        if (z2) {
            this.b1 = j;
        }
        super.g(j, z, z2);
        zzafd zzafdVar2 = this.M0;
        zzaed zzaedVar = this.C0;
        if (zzafdVar2 == null) {
            zzaedVar.b.a();
            zzaedVar.e = C.TIME_UNSET;
            zzaedVar.d = Math.min(zzaedVar.d, 1);
            zzaedVar.j = false;
        }
        qpk qpkVar = this.H0;
        if (qpkVar != null) {
            qpkVar.f();
        }
        if (z) {
            zzafd zzafdVar3 = this.M0;
            if (zzafdVar3 != null) {
                zzafdVar3.zzw(false);
            } else {
                zzaedVar.getClass();
            }
        }
        this.Y0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzjf g0(zzma zzmaVar) {
        zzjf g0 = super.g0(zzmaVar);
        zzv zzvVar = zzmaVar.b;
        zzvVar.getClass();
        zzaex zzaexVar = this.A0;
        Handler handler = zzaexVar.a;
        if (handler != null) {
            handler.post(new lv4(zzaexVar, zzvVar, g0, false, 13));
        }
        qpk qpkVar = this.H0;
        if (qpkVar != null) {
            qpkVar.f();
        }
        return g0;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final boolean h() {
        if (!this.m0) {
            return false;
        }
        zzafd zzafdVar = this.M0;
        return zzafdVar == null || zzafdVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void h0(zzv zzvVar, MediaFormat mediaFormat) {
        zzvp zzvpVar = this.K;
        if (zzvpVar != null) {
            zzvpVar.y(this.U0);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzvVar.C;
        int i = zzvVar.A;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.g1 = new zzbv(integer, integer2, f);
        zzafd zzafdVar = this.M0;
        if (zzafdVar == null || !this.m1) {
            float f2 = zzvVar.z;
            zzadf zzadfVar = this.E0;
            zzadfVar.f = f2;
            zzadfVar.a.d();
            zzadfVar.b.d();
            zzadfVar.c = false;
            zzadfVar.d = C.TIME_UNSET;
            zzadfVar.e = 0;
            zzadfVar.c();
        } else {
            zzt zztVar = new zzt(zzvVar);
            zztVar.u = integer;
            zztVar.v = integer2;
            zztVar.B = f;
            zzv zzvVar2 = new zzv(zztVar);
            int i3 = this.O0;
            List list = this.P0;
            if (list == null) {
                mio mioVar = zzgxm.b;
                list = s.e;
            }
            zzafdVar.j(zzvVar2, this.p0.b, i3, list);
            this.O0 = 2;
        }
        this.m1 = false;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void i() {
        zzafd zzafdVar = this.M0;
        if (zzafdVar == null) {
            zzaed zzaedVar = this.C0;
            if (zzaedVar.d == 0) {
                zzaedVar.d = 1;
                return;
            }
            return;
        }
        int i = this.O0;
        if (i == 0 || i == 1) {
            this.O0 = 0;
        } else {
            zzafdVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void i0() {
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null) {
            zzafdVar.zzi();
            long j = this.l1;
            if (j == C.TIME_UNSET) {
                j = this.p0.b;
                this.l1 = j;
            }
            this.M0.i(-j);
        } else {
            this.C0.a(2);
        }
        this.m1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void j() {
        this.X0 = 0;
        zzdp zzdpVar = this.g;
        zzdpVar.getClass();
        this.W0 = zzdpVar.zzb();
        this.d1 = 0L;
        this.e1 = 0;
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null) {
            zzafdVar.zza();
        } else {
            this.C0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean j0(long j, long j2, zzvp zzvpVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) {
        zzadf zzadfVar;
        zzvpVar.getClass();
        long j4 = j3 - this.p0.c;
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.I0;
            Long l = (Long) priorityQueue.peek();
            zzadfVar = this.E0;
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            zzadfVar.a(l.longValue() * 1000);
            if (l.longValue() >= this.l) {
                i4++;
            }
        }
        x0(i4, 0);
        zzadfVar.a(j3 * 1000);
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null) {
            if (!z || z2) {
                return zzafdVar.a(j3, new ean(this, zzvpVar, i, j4));
            }
            C0(zzvpVar, i);
            return true;
        }
        long j5 = this.p0.b;
        long b = zzadfVar.b();
        long j6 = zzadfVar.h;
        zzaed zzaedVar = this.C0;
        zzaeb zzaebVar = this.D0;
        int e = zzaedVar.e(j3, j, j2, j5, z, z2, b, j6, zzaebVar);
        qpk qpkVar = this.H0;
        if (qpkVar != null) {
            if (e != 5 && e != 4) {
                qpkVar.d(j3, zzaebVar.a);
            }
            return false;
        }
        if (e == 0) {
            zzdp zzdpVar = this.g;
            zzdpVar.getClass();
            long zzc = zzdpVar.zzc();
            zzaea zzaeaVar = this.k1;
            if (zzaeaVar != null) {
                zzaeaVar.b(j4, zzc, zzvVar, this.M);
            }
            z0(zzvpVar, i, zzc);
            y0(zzaebVar.a);
            return true;
        }
        if (e == 1) {
            long j7 = zzaebVar.b;
            long j8 = zzaebVar.a;
            if (j7 == this.f1) {
                C0(zzvpVar, i);
            } else {
                zzaea zzaeaVar2 = this.k1;
                if (zzaeaVar2 != null) {
                    zzaeaVar2.b(j4, j7, zzvVar, this.M);
                }
                z0(zzvpVar, i, j7);
            }
            y0(j8);
            this.f1 = j7;
            return true;
        }
        if (e != 2) {
            if (e == 3) {
                C0(zzvpVar, i);
                y0(zzaebVar.a);
                return true;
            }
            return false;
        }
        Trace.beginSection("dropVideoBuffer");
        zzvpVar.k(i);
        Trace.endSection();
        x0(0, 1);
        y0(zzaebVar.a);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void k() {
        int i = this.X0;
        zzaex zzaexVar = this.A0;
        if (i > 0) {
            zzdp zzdpVar = this.g;
            zzdpVar.getClass();
            long zzb = zzdpVar.zzb();
            long j = zzb - this.W0;
            int i2 = this.X0;
            Handler handler = zzaexVar.a;
            if (handler != null) {
                handler.post(new ci3(zzaexVar, i2, j, 1));
            }
            this.X0 = 0;
            this.W0 = zzb;
        }
        int i3 = this.e1;
        if (i3 != 0) {
            long j2 = this.d1;
            Handler handler2 = zzaexVar.a;
            if (handler2 != null) {
                handler2.post(new ybn(zzaexVar, j2, i3));
            }
            this.d1 = 0L;
            this.e1 = 0;
        }
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null) {
            zzafdVar.zzb();
        } else {
            zzaed zzaedVar = this.C0;
            zzaedVar.c = false;
            zzaek zzaekVar = zzaedVar.b;
            zzaekVar.c = false;
            vpk vpkVar = zzaekVar.b;
            if (vpkVar != null) {
                vpkVar.h();
            }
            zzaekVar.c();
        }
        qpk qpkVar = this.H0;
        if (qpkVar != null) {
            qpkVar.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void k0(zzjc zzjcVar) {
        zzaex zzaexVar = this.A0;
        Handler handler = zzaexVar.a;
        if (handler != null) {
            handler.post(new vlo(29, zzaexVar, zzjcVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void l() {
        zzaex zzaexVar = this.A0;
        this.h1 = null;
        this.T0 = false;
        this.c1 = true;
        int i = 27;
        try {
            super.l();
            zzje zzjeVar = this.o0;
            zzaexVar.getClass();
            synchronized (zzjeVar) {
            }
            Handler handler = zzaexVar.a;
            if (handler != null) {
                handler.post(new pyn(i, zzaexVar, zzjeVar));
            }
            zzaexVar.a(zzbv.d);
        } catch (Throwable th) {
            zzje zzjeVar2 = this.o0;
            zzaexVar.getClass();
            synchronized (zzjeVar2) {
                Handler handler2 = zzaexVar.a;
                if (handler2 != null) {
                    handler2.post(new pyn(i, zzaexVar, zzjeVar2));
                }
                zzaexVar.a(zzbv.d);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void l0() {
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null) {
            zzafdVar.zzi();
        } else {
            long j = this.p0.f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void m() {
        try {
            super.m();
        } finally {
            this.N0 = false;
            this.l1 = C.TIME_UNSET;
            zzadp zzadpVar = this.R0;
            if (zzadpVar != null) {
                zzadpVar.release();
                this.R0 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void n() {
        zzafd zzafdVar = this.M0;
        if (zzafdVar == null || !this.z0) {
            return;
        }
        zzafdVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void n0(zziy zziyVar) {
        if (this.L0) {
            ByteBuffer byteBuffer = zziyVar.f;
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
                        zzvp zzvpVar = this.K;
                        zzvpVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzvpVar.j(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void p0(long j) {
        super.p0(j);
        this.Z0--;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void t(boolean z, boolean z2) {
        zzafd zzafdVar;
        super.t(z, z2);
        p();
        zzje zzjeVar = this.o0;
        zzaex zzaexVar = this.A0;
        Handler handler = zzaexVar.a;
        if (handler != null) {
            handler.post(new ybn(zzaexVar, zzjeVar, 4));
        }
        boolean z3 = this.N0;
        zzaed zzaedVar = this.C0;
        if (!z3) {
            if (this.P0 != null && this.M0 == null) {
                zzadr zzadrVar = new zzadr(this.y0, zzaedVar);
                zzadrVar.d = true;
                zzadrVar.g = -this.G0;
                zzdp zzdpVar = this.g;
                zzdpVar.getClass();
                zzadrVar.e = zzdpVar;
                zzguk.f(!zzadrVar.f);
                if (zzadrVar.c == null) {
                    zzadrVar.c = new yan();
                }
                zzadz zzadzVar = new zzadz(zzadrVar);
                zzadrVar.f = true;
                SparseArray sparseArray = zzadzVar.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    zzafdVar = (zzafd) sparseArray.get(0);
                } else {
                    qan qanVar = new qan(zzadzVar, zzadzVar.a);
                    zzadzVar.g.add(qanVar);
                    sparseArray.put(0, qanVar);
                    zzafdVar = qanVar;
                }
                this.M0 = zzafdVar;
            }
            this.N0 = true;
        }
        int i = !z2 ? 1 : 0;
        zzafd zzafdVar2 = this.M0;
        if (zzafdVar2 == null) {
            zzdp zzdpVar2 = this.g;
            zzdpVar2.getClass();
            zzaedVar.h = zzdpVar2;
            zzaedVar.a(i);
            return;
        }
        zzafdVar2.e(new ban(this));
        zzaea zzaeaVar = this.k1;
        if (zzaeaVar != null) {
            this.M0.g(zzaeaVar);
        }
        if (this.Q0 != null && !this.S0.equals(zzev.c)) {
            this.M0.f(this.Q0, this.S0);
        }
        this.M0.E(this.V0);
        this.M0.d(this.I);
        List list = this.P0;
        if (list != null) {
            this.M0.h(list);
        }
        this.O0 = i;
        this.s0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void u(zzv[] zzvVarArr, long j, long j2, zzxo zzxoVar) {
        super.u(zzvVarArr, j, j2, zzxoVar);
        qpk qpkVar = this.H0;
        if (qpkVar != null) {
            qpkVar.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0.zzb() >= r7.V) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x() {
        boolean zza;
        boolean z = false;
        if (this.D != null) {
            if (J()) {
                zza = this.n;
            } else {
                zzzg zzzgVar = this.i;
                zzzgVar.getClass();
                zza = zzzgVar.zza();
            }
            if (!zza && this.X < 0) {
                if (this.V != C.TIME_UNSET) {
                    zzdp zzdpVar = this.g;
                    zzdpVar.getClass();
                }
            }
            z = true;
        }
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null) {
            return zzafdVar.zzh(z);
        }
        if (z && this.K == null) {
            return true;
        }
        return this.C0.d(z);
    }

    public final void x0(int i, int i2) {
        zzje zzjeVar = this.o0;
        zzjeVar.h += i;
        int i3 = i + i2;
        zzjeVar.g += i3;
        this.X0 += i3;
        int i4 = this.Y0 + i3;
        this.Y0 = i4;
        zzjeVar.i = Math.max(i4, zzjeVar.i);
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final void y(long j, long j2) {
        zzafd zzafdVar = this.M0;
        if (zzafdVar != null) {
            try {
                zzafdVar.b(j, j2);
            } catch (zzafc e) {
                throw q(e, e.a, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.y(j, j2);
    }

    public final void y0(long j) {
        zzje zzjeVar = this.o0;
        zzjeVar.k += j;
        zzjeVar.l++;
        this.d1 += j;
        this.e1++;
    }

    public final void z0(zzvp zzvpVar, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        zzvpVar.w(i, j);
        Trace.endSection();
        this.o0.e++;
        this.Y0 = 0;
        if (this.M0 == null) {
            zzbv zzbvVar = this.g1;
            boolean equals = zzbvVar.equals(zzbv.d);
            zzaex zzaexVar = this.A0;
            if (!equals && !zzbvVar.equals(this.h1)) {
                this.h1 = zzbvVar;
                zzaexVar.a(zzbvVar);
            }
            zzaed zzaedVar = this.C0;
            int i2 = zzaedVar.d;
            zzaedVar.d = 3;
            zzaedVar.f = zzfm.u(zzaedVar.h.zzb());
            if (i2 == 3 || (surface = this.Q0) == null) {
                return;
            }
            Handler handler = zzaexVar.a;
            if (handler != null) {
                handler.post(new jcn(zzaexVar, surface, SystemClock.elapsedRealtime()));
            }
            this.T0 = true;
        }
    }
}
