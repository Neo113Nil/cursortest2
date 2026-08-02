package com.google.android.gms.internal.ads;

import android.R;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.fn0;
import defpackage.x5n;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzdr {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        int i5;
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = zzfm.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static Pair b(zzv zzvVar) {
        boolean z;
        zzdq c2 = c(zzvVar);
        if (c2 == null || !(z = c2.c)) {
            return null;
        }
        zzguk.f(z);
        Integer valueOf = Integer.valueOf(c2.a);
        zzguk.f(z);
        return new Pair(valueOf, Integer.valueOf(c2.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0218, code lost:
    
        if (r2.equals("vvi1") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0226, code lost:
    
        if (r5.length >= 3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0228, code lost:
    
        defpackage.x5n.r(r13, "Ignoring malformed VVC codec string: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x022d, code lost:
    
        r0 = java.lang.Integer.parseInt(r5[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0233, code lost:
    
        if (r0 != 1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0235, code lost:
    
        if (r15 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0239, code lost:
    
        if (r15.c != 6) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023b, code lost:
    
        r11 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024e, code lost:
    
        r0 = r5[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0254, code lost:
    
        switch(r0.hashCode()) {
            case 70918: goto L199;
            case 70921: goto L196;
            case 70976: goto L193;
            case 70979: goto L190;
            case 70982: goto L187;
            case 71013: goto L184;
            case 74609: goto L181;
            case 74667: goto L178;
            case 74670: goto L175;
            case 74704: goto L172;
            case 74728: goto L169;
            case 74762: goto L166;
            case 74765: goto L163;
            case 74820: goto L160;
            case 74823: goto L157;
            case 74826: goto L154;
            case 74857: goto L151;
            case 2193610: goto L148;
            case 2193647: goto L145;
            case 2193705: goto L142;
            case 2312774: goto L139;
            case 2312811: goto L136;
            case 2312869: goto L133;
            default: goto L202;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025f, code lost:
    
        if (r0.equals("L144") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0261, code lost:
    
        r2 = 2097152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0379, code lost:
    
        if (r2 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x037b, code lost:
    
        com.google.android.gms.internal.ads.zzeh.c("Unknown VVC level string: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026d, code lost:
    
        if (r0.equals("L128") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x026f, code lost:
    
        r2 = 524288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x027b, code lost:
    
        if (r0.equals("L112") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027d, code lost:
    
        r2 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0289, code lost:
    
        if (r0.equals("H144") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x028b, code lost:
    
        r2 = 4194304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0297, code lost:
    
        if (r0.equals("H128") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0299, code lost:
    
        r2 = java.lang.Integer.valueOf(com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a5, code lost:
    
        if (r0.equals("H112") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a7, code lost:
    
        r2 = 262144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02b3, code lost:
    
        if (r0.equals("L96") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02b5, code lost:
    
        r2 = 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02c1, code lost:
    
        if (r0.equals("L86") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02c3, code lost:
    
        r2 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02cf, code lost:
    
        if (r0.equals("L83") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02d1, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02db, code lost:
    
        if (r0.equals("L80") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02dd, code lost:
    
        r2 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02e7, code lost:
    
        if (r0.equals("L67") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02e9, code lost:
    
        r2 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f3, code lost:
    
        if (r0.equals("L64") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f5, code lost:
    
        r2 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ff, code lost:
    
        if (r0.equals("L51") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0301, code lost:
    
        r2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x030b, code lost:
    
        if (r0.equals("L48") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x030d, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0317, code lost:
    
        if (r0.equals("L35") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0319, code lost:
    
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0323, code lost:
    
        if (r0.equals("L32") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0325, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x032e, code lost:
    
        if (r0.equals("L16") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0330, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0339, code lost:
    
        if (r0.equals("H96") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x033b, code lost:
    
        r2 = java.lang.Integer.valueOf(com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0346, code lost:
    
        if (r0.equals("H86") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0348, code lost:
    
        r2 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0353, code lost:
    
        if (r0.equals("H83") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0355, code lost:
    
        r2 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x035d, code lost:
    
        if (r0.equals("H80") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x035f, code lost:
    
        r2 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0368, code lost:
    
        if (r0.equals("H67") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x036a, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0373, code lost:
    
        if (r0.equals("H64") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0375, code lost:
    
        r2 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0377, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x023e, code lost:
    
        if (r15 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0242, code lost:
    
        if (r15.e != 8) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0244, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0246, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x024b, code lost:
    
        if (r0 != 65) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x024d, code lost:
    
        r11 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0390, code lost:
    
        defpackage.x5n.r(r5[1], "Unknown VVC profile IDC: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0399, code lost:
    
        defpackage.x5n.r(r13, "Ignoring malformed VVC codec string: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0221, code lost:
    
        if (r2.equals("vvc1") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0669, code lost:
    
        if (r2.equals("hvc1") != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0672, code lost:
    
        if (r2.equals("hev1") != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0681, code lost:
    
        if (r2.equals("avc2") != false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x068e, code lost:
    
        r0 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0692, code lost:
    
        if (r0 >= 2) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0694, code lost:
    
        defpackage.x5n.r(r13, "Ignoring malformed AVC codec string: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x06a0, code lost:
    
        if (r5[1].length() != 6) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x06a2, code lost:
    
        r6 = 16;
        r0 = java.lang.Integer.parseInt(r5[1].substring(0, 2), 16);
        r2 = java.lang.Integer.parseInt(r5[1].substring(4), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x06d1, code lost:
    
        if (r0 == 66) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x06d5, code lost:
    
        if (r0 == 77) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x06d9, code lost:
    
        if (r0 == 88) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x06dd, code lost:
    
        if (r0 == 100) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x06e1, code lost:
    
        if (r0 == 110) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x06e5, code lost:
    
        if (r0 == 122) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x06e9, code lost:
    
        if (r0 == 244) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x06eb, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x06fb, code lost:
    
        if (r3 != (-1)) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x06fd, code lost:
    
        defpackage.x5n.p(r0, "Unknown AVC profile: ", new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0711, code lost:
    
        switch(r2) {
            case 10: goto L486;
            case 11: goto L485;
            case 12: goto L487;
            case 13: goto L484;
            default: goto L467;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0714, code lost:
    
        switch(r2) {
            case 20: goto L483;
            case 21: goto L482;
            case 22: goto L481;
            default: goto L468;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0717, code lost:
    
        switch(r2) {
            case 30: goto L480;
            case 31: goto L479;
            case 32: goto L478;
            default: goto L469;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x071a, code lost:
    
        switch(r2) {
            case 40: goto L477;
            case 41: goto L476;
            case 42: goto L475;
            default: goto L470;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x071d, code lost:
    
        switch(r2) {
            case 50: goto L474;
            case 51: goto L473;
            case 52: goto L472;
            default: goto L471;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0720, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0722, code lost:
    
        r1 = 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0725, code lost:
    
        r1 = 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0728, code lost:
    
        r1 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x072b, code lost:
    
        r1 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x072e, code lost:
    
        r1 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0731, code lost:
    
        r1 = com.ironsource.mediationsdk.metadata.a.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0734, code lost:
    
        r1 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0737, code lost:
    
        r1 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x073a, code lost:
    
        r1 = androidx.core.app.NotificationCompat.FLAG_LOCAL_ONLY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x073d, code lost:
    
        r1 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0740, code lost:
    
        r1 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0743, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0745, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0747, code lost:
    
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0749, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x074a, code lost:
    
        if (r1 != (-1)) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x074c, code lost:
    
        defpackage.x5n.p(r2, "Unknown AVC level: ", new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x06ed, code lost:
    
        r3 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x06f0, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x06f2, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x06f4, code lost:
    
        r3 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x06f6, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x06f8, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x06fa, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x06bb, code lost:
    
        r6 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x06bd, code lost:
    
        if (r0 < 3) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x06bf, code lost:
    
        r0 = java.lang.Integer.parseInt(r5[1]);
        r2 = java.lang.Integer.parseInt(r5[2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0768, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r13).length() + 37);
        r1.append("Ignoring malformed AVC codec string: ");
        r1.append(r13);
        com.google.android.gms.internal.ads.zzeh.c(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0785, code lost:
    
        defpackage.x5n.r(r13, "Ignoring malformed AVC codec string: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x068c, code lost:
    
        if (r2.equals("avc1") != false) goto L430;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0551 A[Catch: NumberFormatException -> 0x0569, TryCatch #6 {NumberFormatException -> 0x0569, blocks: (B:329:0x0504, B:331:0x0518, B:341:0x0536, B:344:0x0551, B:346:0x0561), top: B:328:0x0504 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0561 A[Catch: NumberFormatException -> 0x0569, TRY_LEAVE, TryCatch #6 {NumberFormatException -> 0x0569, blocks: (B:329:0x0504, B:331:0x0518, B:341:0x0536, B:344:0x0551, B:346:0x0561), top: B:328:0x0504 }] */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0b80  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzdq c(zzv zzvVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Integer num;
        Integer num2;
        Integer valueOf = Integer.valueOf(com.ironsource.mediationsdk.metadata.a.o);
        Integer valueOf2 = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
        int i11 = 8;
        String str = zzvVar.k;
        zzi zziVar = zzvVar.F;
        if (str != null) {
            String[] split = str.split("\\.");
            boolean equals = "video/dolby-vision".equals(zzvVar.o);
            zzdq zzdqVar = zzdq.d;
            if (!equals) {
                String str2 = split[0];
                switch (str2.hashCode()) {
                    case 2986313:
                        if (str2.equals("ac-4")) {
                            if (split.length == 4) {
                                try {
                                    int parseInt = Integer.parseInt(split[1]);
                                    int parseInt2 = Integer.parseInt(split[2]);
                                    int parseInt3 = Integer.parseInt(split[3]);
                                    if (parseInt == 0) {
                                        if (parseInt2 == 0) {
                                            i = 257;
                                            if (i != -1) {
                                            }
                                        }
                                        i = -1;
                                        if (i != -1) {
                                        }
                                    } else if (parseInt != 1) {
                                        if (parseInt == 2) {
                                            if (parseInt2 == 1) {
                                                i = IronSourceError.ERROR_RV_LOAD_DURING_LOAD;
                                            } else if (parseInt2 == 2) {
                                                i = IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED;
                                            }
                                            if (i != -1) {
                                                if (parseInt3 != 0) {
                                                    if (parseInt3 == 1) {
                                                        i2 = 2;
                                                    } else if (parseInt3 == 2) {
                                                        i2 = 4;
                                                    } else if (parseInt3 != 3) {
                                                        i11 = parseInt3 != 4 ? -1 : 16;
                                                    }
                                                    i11 = i2;
                                                } else {
                                                    i11 = 1;
                                                }
                                                if (i11 != -1) {
                                                    break;
                                                } else {
                                                    x5n.p(parseInt3, "Unknown AC-4 level: ", new StringBuilder(String.valueOf(parseInt3).length() + 20));
                                                    break;
                                                }
                                            } else {
                                                StringBuilder sb = new StringBuilder(String.valueOf(parseInt).length() + 23 + String.valueOf(parseInt2).length());
                                                sb.append("Unknown AC-4 profile: ");
                                                sb.append(parseInt);
                                                sb.append(".");
                                                sb.append(parseInt2);
                                                zzeh.c(sb.toString());
                                                break;
                                            }
                                        }
                                        i = -1;
                                        if (i != -1) {
                                        }
                                    } else {
                                        if (parseInt2 == 0) {
                                            i = 513;
                                        } else {
                                            if (parseInt2 == 1) {
                                                i = 514;
                                            }
                                            i = -1;
                                        }
                                        if (i != -1) {
                                        }
                                    }
                                } catch (NumberFormatException unused) {
                                    x5n.r(str, "Ignoring malformed AC-4 codec string: ");
                                    break;
                                }
                            } else {
                                x5n.r(str, "Ignoring malformed AC-4 codec string: ");
                                break;
                            }
                        }
                        break;
                    case 3001066:
                        if (str2.equals("apv1")) {
                            if (split.length >= 4) {
                                try {
                                    int parseInt4 = Integer.parseInt(split[1].substring(4));
                                    int parseInt5 = Integer.parseInt(split[2].substring(4));
                                    int parseInt6 = Integer.parseInt(split[3].substring(4));
                                    if (parseInt4 != 33) {
                                        if (parseInt4 != 44) {
                                            x5n.p(parseInt4, "Unrecognized APV profile: ", new StringBuilder(String.valueOf(parseInt4).length() + 26));
                                            break;
                                        } else {
                                            i3 = 8192;
                                        }
                                    } else {
                                        i3 = 1;
                                    }
                                    switch (parseInt5) {
                                        case 30:
                                            if (parseInt6 == 0) {
                                                i4 = 257;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 258;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 260;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 264;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 33:
                                            if (parseInt6 == 0) {
                                                i4 = 513;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 514;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 516;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = IronSourceError.ERROR_NO_INTERNET_CONNECTION;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 60:
                                            if (parseInt6 == 0) {
                                                i4 = IronSourceError.ERROR_LOAD_FAILED_TIMEOUT;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = IronSourceError.ERROR_RV_LOAD_DURING_LOAD;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 63:
                                            if (parseInt6 == 0) {
                                                i4 = 2049;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = IronSourceError.ERROR_LEGACY_INIT_POST_FAILED;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 2052;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 2056;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 90:
                                            if (parseInt6 == 0) {
                                                i4 = 4097;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 4098;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 4100;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 4104;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 93:
                                            if (parseInt6 == 0) {
                                                i4 = 8193;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 8194;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 8196;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 8200;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 120:
                                            if (parseInt6 == 0) {
                                                i4 = 16385;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 16386;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 16388;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 16392;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case INVALID_RI_ENDPOINT_VALUE:
                                            if (parseInt6 == 0) {
                                                i4 = 32769;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 32770;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 32772;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 32776;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 150:
                                            if (parseInt6 == 0) {
                                                i4 = 65537;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 65538;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 65540;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 65544;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 153:
                                            if (parseInt6 == 0) {
                                                i4 = 131073;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 131074;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 131076;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 131080;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 180:
                                            if (parseInt6 == 0) {
                                                i4 = 262145;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 262146;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 262148;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 262152;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case 183:
                                            if (parseInt6 == 0) {
                                                i4 = 524289;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 524290;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 524292;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 524296;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case AD_NOT_LOADED_VALUE:
                                            if (parseInt6 == 0) {
                                                i4 = 1048577;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 1048578;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 1048580;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 1048584;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                                            if (parseInt6 == 0) {
                                                i4 = 2097153;
                                                break;
                                            } else if (parseInt6 == 1) {
                                                i4 = 2097154;
                                                break;
                                            } else if (parseInt6 == 2) {
                                                i4 = 2097156;
                                                break;
                                            } else if (parseInt6 == 3) {
                                                i4 = 2097160;
                                                break;
                                            } else {
                                                x5n.o(fn0.a(parseInt6, 23), parseInt6, "Unrecognized APV band: ");
                                                i4 = -1;
                                                break;
                                            }
                                        default:
                                            x5n.p(parseInt5, "Unrecognized APV level index: ", new StringBuilder(String.valueOf(parseInt5).length() + 30));
                                            i4 = -1;
                                            break;
                                    }
                                    if (i4 != -1) {
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    zzeh.d("Ignoring malformed APV codec string: ".concat(String.valueOf(str)), e);
                                    break;
                                }
                            } else {
                                x5n.r(str, "Ignoring malformed APV codec string: ");
                                break;
                            }
                        }
                        break;
                    case 3004662:
                        if (str2.equals("av01")) {
                            if (split.length >= 4) {
                                try {
                                    int parseInt7 = Integer.parseInt(split[1]);
                                    int parseInt8 = Integer.parseInt(split[2].substring(0, 2));
                                    int parseInt9 = Integer.parseInt(split[3]);
                                    if (parseInt7 == 0) {
                                        if (parseInt9 == 8) {
                                            i5 = 1;
                                        } else if (parseInt9 != 10) {
                                            x5n.p(parseInt9, "Unknown AV1 bit depth: ", new StringBuilder(String.valueOf(parseInt9).length() + 23));
                                            break;
                                        } else {
                                            i5 = (zziVar == null || !(zziVar.d != null || (i6 = zziVar.c) == 7 || i6 == 6)) ? 2 : 4096;
                                        }
                                        switch (parseInt8) {
                                            case 0:
                                                i11 = 1;
                                                break;
                                            case 1:
                                                i11 = 2;
                                                break;
                                            case 2:
                                                i11 = 4;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i11 = 16;
                                                break;
                                            case 5:
                                                i11 = 32;
                                                break;
                                            case 6:
                                                i11 = 64;
                                                break;
                                            case 7:
                                                i11 = 128;
                                                break;
                                            case 8:
                                                i11 = NotificationCompat.FLAG_LOCAL_ONLY;
                                                break;
                                            case 9:
                                                i11 = 512;
                                                break;
                                            case 10:
                                                i11 = 1024;
                                                break;
                                            case 11:
                                                i11 = com.ironsource.mediationsdk.metadata.a.o;
                                                break;
                                            case 12:
                                                i11 = 4096;
                                                break;
                                            case 13:
                                                i11 = 8192;
                                                break;
                                            case 14:
                                                i11 = 16384;
                                                break;
                                            case 15:
                                                i11 = 32768;
                                                break;
                                            case 16:
                                                i11 = 65536;
                                                break;
                                            case 17:
                                                i11 = 131072;
                                                break;
                                            case 18:
                                                i11 = 262144;
                                                break;
                                            case 19:
                                                i11 = 524288;
                                                break;
                                            case 20:
                                                i11 = 1048576;
                                                break;
                                            case 21:
                                                i11 = 2097152;
                                                break;
                                            case 22:
                                                i11 = 4194304;
                                                break;
                                            case 23:
                                                i11 = 8388608;
                                                break;
                                            default:
                                                i11 = -1;
                                                break;
                                        }
                                        if (i11 != -1) {
                                            break;
                                        } else {
                                            x5n.p(parseInt8, "Unknown AV1 level: ", new StringBuilder(String.valueOf(parseInt8).length() + 19));
                                            break;
                                        }
                                    } else {
                                        x5n.p(parseInt7, "Unknown AV1 profile: ", new StringBuilder(String.valueOf(parseInt7).length() + 21));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    x5n.r(str, "Ignoring malformed AV1 codec string: ");
                                    break;
                                }
                            } else {
                                x5n.r(str, "Ignoring malformed AV1 codec string: ");
                                break;
                            }
                        }
                        break;
                    case 3006243:
                        i7 = 32;
                        break;
                    case 3006244:
                        i7 = 32;
                        break;
                    case 3199032:
                        break;
                    case 3214780:
                        break;
                    case 3224753:
                        if (str2.equals("iamf")) {
                            if (split.length >= 4) {
                                try {
                                    int parseInt10 = Integer.parseInt(split[1]);
                                    String str3 = split[3];
                                    switch (str3.hashCode()) {
                                        case 2464863:
                                            if (str3.equals("Opus")) {
                                                if (parseInt10 == 0) {
                                                    i8 = R.attr.label;
                                                    break;
                                                } else if (parseInt10 == 1) {
                                                    i8 = R.id.checkbox;
                                                    break;
                                                } else if (parseInt10 == 2) {
                                                    i8 = R.string.copy;
                                                    break;
                                                } else {
                                                    x5n.o(fn0.a(parseInt10, 32), parseInt10, "Unrecognized IAMF Opus profile: ");
                                                    i8 = -1;
                                                    break;
                                                }
                                            }
                                            zzeh.c("Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str3));
                                            i8 = -1;
                                        case 3114792:
                                            if (str3.equals("fLaC")) {
                                                if (parseInt10 == 0) {
                                                    i8 = R.attr.manageSpaceActivity;
                                                    break;
                                                } else if (parseInt10 == 1) {
                                                    i8 = R.id.empty;
                                                    break;
                                                } else if (parseInt10 == 2) {
                                                    i8 = R.string.defaultVoiceMailAlphaTag;
                                                    break;
                                                } else {
                                                    x5n.o(fn0.a(parseInt10, 32), parseInt10, "Unrecognized IAMF FLAC profile: ");
                                                    i8 = -1;
                                                    break;
                                                }
                                            }
                                            zzeh.c("Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str3));
                                            i8 = -1;
                                        case 3238865:
                                            if (str3.equals("ipcm")) {
                                                if (parseInt10 == 0) {
                                                    i8 = R.attr.writePermission;
                                                    break;
                                                } else if (parseInt10 == 1) {
                                                    i8 = R.id.icon2;
                                                    break;
                                                } else if (parseInt10 == 2) {
                                                    i8 = R.string.httpErrorUnsupportedScheme;
                                                    break;
                                                } else {
                                                    x5n.o(fn0.a(parseInt10, 31), parseInt10, "Unrecognized IAMF PCM profile: ");
                                                    i8 = -1;
                                                    break;
                                                }
                                            }
                                            zzeh.c("Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str3));
                                            i8 = -1;
                                        case 3356560:
                                            if (str3.equals("mp4a")) {
                                                if (parseInt10 == 0) {
                                                    i8 = R.attr.icon;
                                                    break;
                                                } else if (parseInt10 == 1) {
                                                    i8 = R.id.content;
                                                    break;
                                                } else if (parseInt10 == 2) {
                                                    i8 = R.string.copyUrl;
                                                    break;
                                                } else {
                                                    x5n.o(fn0.a(parseInt10, 31), parseInt10, "Unrecognized IAMF AAC profile: ");
                                                    i8 = -1;
                                                    break;
                                                }
                                            }
                                            zzeh.c("Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str3));
                                            i8 = -1;
                                        default:
                                            zzeh.c("Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str3));
                                            i8 = -1;
                                            break;
                                    }
                                    if (i8 != -1) {
                                        break;
                                    }
                                } catch (NumberFormatException e2) {
                                    zzeh.d("Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(split[1])), e2);
                                    break;
                                }
                            } else {
                                zzeh.c("Ignoring malformed IAMF codec string: ".concat(str));
                                break;
                            }
                        }
                        break;
                    case 3356560:
                        if (str2.equals("mp4a")) {
                            if (split.length == 3) {
                                try {
                                    if (MimeTypes.AUDIO_AAC.equals(zzas.e(Integer.parseInt(split[1], 16)))) {
                                        int parseInt11 = Integer.parseInt(split[2]);
                                        int i12 = 17;
                                        if (parseInt11 != 17) {
                                            if (parseInt11 == 20) {
                                                i9 = 20;
                                            } else if (parseInt11 == 23) {
                                                i9 = 23;
                                            } else if (parseInt11 != 29) {
                                                i12 = 39;
                                                if (parseInt11 != 39) {
                                                    i12 = 42;
                                                    if (parseInt11 != 42) {
                                                        switch (parseInt11) {
                                                            case 1:
                                                                i9 = 1;
                                                                break;
                                                            case 2:
                                                                i9 = 2;
                                                                break;
                                                            case 3:
                                                                i9 = 3;
                                                                break;
                                                            case 4:
                                                                i9 = 4;
                                                                break;
                                                            case 5:
                                                                i9 = 5;
                                                                break;
                                                            case 6:
                                                                i9 = 6;
                                                                break;
                                                            default:
                                                                i9 = -1;
                                                                break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i9 = 29;
                                            }
                                            if (i9 == -1) {
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder(29);
                                                sb2.append("Unrecognized MP4A profile: -1");
                                                zzeh.c(sb2.toString());
                                                break;
                                            }
                                        }
                                        i9 = i12;
                                        if (i9 == -1) {
                                        }
                                    }
                                } catch (NumberFormatException unused3) {
                                    x5n.r(str, "Ignoring malformed MP4A codec string: ");
                                    break;
                                }
                            } else {
                                x5n.r(str, "Ignoring malformed MP4A codec string: ");
                                break;
                            }
                        }
                        break;
                    case 3475740:
                        if (str2.equals("s263")) {
                            if (split.length >= 3) {
                                try {
                                    int parseInt12 = Integer.parseInt(split[1]);
                                    int parseInt13 = Integer.parseInt(split[2]);
                                    switch (parseInt12) {
                                        case 0:
                                            i10 = 1;
                                            break;
                                        case 1:
                                            i10 = 2;
                                            break;
                                        case 2:
                                            i10 = 4;
                                            break;
                                        case 3:
                                            i10 = 8;
                                            break;
                                        case 4:
                                            i10 = 16;
                                            break;
                                        case 5:
                                            i10 = 32;
                                            break;
                                        case 6:
                                            i10 = 64;
                                            break;
                                        case 7:
                                            i10 = 128;
                                            break;
                                        case 8:
                                            i10 = NotificationCompat.FLAG_LOCAL_ONLY;
                                            break;
                                        default:
                                            i10 = -1;
                                            break;
                                    }
                                    if (i10 != -1) {
                                        if (parseInt13 == 10) {
                                            i11 = 1;
                                        } else if (parseInt13 == 20) {
                                            i11 = 2;
                                        } else if (parseInt13 == 30) {
                                            i11 = 4;
                                        } else if (parseInt13 != 40) {
                                            i11 = parseInt13 != 45 ? parseInt13 != 50 ? parseInt13 != 60 ? parseInt13 != 70 ? -1 : 128 : 64 : 32 : 16;
                                        }
                                        if (i11 != -1) {
                                            break;
                                        } else {
                                            x5n.p(parseInt13, "Unknown H263 level: ", new StringBuilder(String.valueOf(parseInt13).length() + 20));
                                            break;
                                        }
                                    } else {
                                        x5n.p(parseInt12, "Unknown H263 profile: ", new StringBuilder(String.valueOf(parseInt12).length() + 22));
                                        break;
                                    }
                                } catch (NumberFormatException unused4) {
                                    x5n.r(str, "Ignoring malformed H263 codec string: ");
                                    break;
                                }
                            } else {
                                x5n.r(str, "Ignoring malformed H263 codec string: ");
                                break;
                            }
                        }
                        break;
                    case 3624515:
                        if (str2.equals("vp09")) {
                            if (split.length >= 3) {
                                try {
                                    int parseInt14 = Integer.parseInt(split[1]);
                                    int parseInt15 = Integer.parseInt(split[2]);
                                    int i13 = parseInt14 != 0 ? parseInt14 != 1 ? parseInt14 != 2 ? parseInt14 != 3 ? -1 : 8 : 4 : 2 : 1;
                                    if (i13 != -1) {
                                        if (parseInt15 == 10) {
                                            i11 = 1;
                                        } else if (parseInt15 == 11) {
                                            i11 = 2;
                                        } else if (parseInt15 == 20) {
                                            i11 = 4;
                                        } else if (parseInt15 != 21) {
                                            if (parseInt15 == 30) {
                                                i11 = 16;
                                            } else if (parseInt15 == 31) {
                                                i11 = 32;
                                            } else if (parseInt15 == 40) {
                                                i11 = 64;
                                            } else if (parseInt15 == 41) {
                                                i11 = 128;
                                            } else if (parseInt15 == 50) {
                                                i11 = NotificationCompat.FLAG_LOCAL_ONLY;
                                            } else if (parseInt15 != 51) {
                                                switch (parseInt15) {
                                                    case 60:
                                                        i11 = com.ironsource.mediationsdk.metadata.a.o;
                                                        break;
                                                    case 61:
                                                        i11 = 4096;
                                                        break;
                                                    case 62:
                                                        i11 = 8192;
                                                        break;
                                                    default:
                                                        i11 = -1;
                                                        break;
                                                }
                                            } else {
                                                i11 = 512;
                                            }
                                        }
                                        if (i11 != -1) {
                                            break;
                                        } else {
                                            x5n.p(parseInt15, "Unknown VP9 level: ", new StringBuilder(String.valueOf(parseInt15).length() + 19));
                                            break;
                                        }
                                    } else {
                                        x5n.p(parseInt14, "Unknown VP9 profile: ", new StringBuilder(String.valueOf(parseInt14).length() + 21));
                                        break;
                                    }
                                } catch (NumberFormatException unused5) {
                                    x5n.r(str, "Ignoring malformed VP9 codec string: ");
                                    break;
                                }
                            } else {
                                x5n.r(str, "Ignoring malformed VP9 codec string: ");
                                break;
                            }
                        }
                        break;
                    case 3631854:
                        break;
                    case 3632040:
                        break;
                }
                return null;
            }
            if (split.length < 3) {
                zzeh.c("Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            Matcher matcher = c.matcher(split[1]);
            if (!matcher.matches()) {
                zzeh.c("Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            String group = matcher.group(1);
            group.getClass();
            int hashCode = group.hashCode();
            if (hashCode != 1567) {
                switch (hashCode) {
                    case 1536:
                        if (group.equals("00")) {
                            num = 1;
                            break;
                        }
                        num = null;
                        break;
                    case 1537:
                        if (group.equals("01")) {
                            num = 2;
                            break;
                        }
                        num = null;
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            num = 4;
                            break;
                        }
                        num = null;
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            num = 8;
                            break;
                        }
                        num = null;
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            num = 16;
                            break;
                        }
                        num = null;
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            num = 32;
                            break;
                        }
                        num = null;
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            num = 64;
                            break;
                        }
                        num = null;
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            num = 128;
                            break;
                        }
                        num = null;
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            num = valueOf2;
                            break;
                        }
                        num = null;
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            num = 512;
                            break;
                        }
                        num = null;
                        break;
                    default:
                        num = null;
                        break;
                }
                if (num == null) {
                    zzeh.c("Unknown Dolby Vision profile string: ".concat(group));
                    return zzdqVar;
                }
                String str4 = split[2];
                int hashCode2 = str4.hashCode();
                switch (hashCode2) {
                    case 1537:
                        if (str4.equals("01")) {
                            num2 = 1;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1538:
                        if (str4.equals("02")) {
                            num2 = 2;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1539:
                        if (str4.equals("03")) {
                            num2 = 4;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1540:
                        if (str4.equals("04")) {
                            num2 = 8;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1541:
                        if (str4.equals("05")) {
                            num2 = 16;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1542:
                        if (str4.equals("06")) {
                            num2 = 32;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1543:
                        if (str4.equals("07")) {
                            num2 = 64;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1544:
                        if (str4.equals("08")) {
                            num2 = 128;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1545:
                        if (str4.equals("09")) {
                            num2 = valueOf2;
                            break;
                        }
                        num2 = null;
                        break;
                    default:
                        switch (hashCode2) {
                            case 1567:
                                if (str4.equals("10")) {
                                    num2 = 512;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1568:
                                if (str4.equals("11")) {
                                    num2 = 1024;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1569:
                                if (str4.equals("12")) {
                                    num2 = valueOf;
                                    break;
                                }
                                num2 = null;
                                break;
                            case 1570:
                                if (str4.equals("13")) {
                                    num2 = 4096;
                                    break;
                                }
                                num2 = null;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                }
                if (num2 != null) {
                    return new zzdq(num.intValue(), num2.intValue(), true);
                }
                zzeh.c("Unknown Dolby Vision level string: ".concat(str4));
                return null;
            }
            if (group.equals("10")) {
                num = 1024;
                if (num == null) {
                }
            }
            num = null;
            if (num == null) {
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzdq d(String str, String[] strArr, zzi zziVar) {
        int i;
        Integer num = null;
        if (strArr.length < 4) {
            x5n.r(str, "Ignoring malformed HEVC codec string: ");
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            x5n.r(str, "Ignoring malformed HEVC codec string: ");
            return null;
        }
        String group = matcher.group(1);
        boolean equals = "1".equals(group);
        zzdq zzdqVar = zzdq.d;
        if (equals) {
            i = 1;
        } else {
            if (!"2".equals(group)) {
                x5n.r(group, "Unknown HEVC profile string: ");
                return zzdqVar;
            }
            i = (zziVar == null || zziVar.c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        switch (str2.hashCode()) {
            case 70821:
                if (str2.equals("H30")) {
                    num = 2;
                    break;
                }
                break;
            case 70914:
                if (str2.equals("H60")) {
                    num = 8;
                    break;
                }
                break;
            case 70917:
                if (str2.equals("H63")) {
                    num = 32;
                    break;
                }
                break;
            case 71007:
                if (str2.equals("H90")) {
                    num = 128;
                    break;
                }
                break;
            case 71010:
                if (str2.equals("H93")) {
                    num = 512;
                    break;
                }
                break;
            case 74665:
                if (str2.equals("L30")) {
                    num = 1;
                    break;
                }
                break;
            case 74758:
                if (str2.equals("L60")) {
                    num = 4;
                    break;
                }
                break;
            case 74761:
                if (str2.equals("L63")) {
                    num = 16;
                    break;
                }
                break;
            case 74851:
                if (str2.equals("L90")) {
                    num = 64;
                    break;
                }
                break;
            case 74854:
                if (str2.equals("L93")) {
                    num = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
                    break;
                }
                break;
            case 2193639:
                if (str2.equals("H120")) {
                    num = Integer.valueOf(com.ironsource.mediationsdk.metadata.a.o);
                    break;
                }
                break;
            case 2193642:
                if (str2.equals("H123")) {
                    num = 8192;
                    break;
                }
                break;
            case 2193732:
                if (str2.equals("H150")) {
                    num = 32768;
                    break;
                }
                break;
            case 2193735:
                if (str2.equals("H153")) {
                    num = 131072;
                    break;
                }
                break;
            case 2193738:
                if (str2.equals("H156")) {
                    num = 524288;
                    break;
                }
                break;
            case 2193825:
                if (str2.equals("H180")) {
                    num = 2097152;
                    break;
                }
                break;
            case 2193828:
                if (str2.equals("H183")) {
                    num = 8388608;
                    break;
                }
                break;
            case 2193831:
                if (str2.equals("H186")) {
                    num = 33554432;
                    break;
                }
                break;
            case 2312803:
                if (str2.equals("L120")) {
                    num = 1024;
                    break;
                }
                break;
            case 2312806:
                if (str2.equals("L123")) {
                    num = 4096;
                    break;
                }
                break;
            case 2312896:
                if (str2.equals("L150")) {
                    num = 16384;
                    break;
                }
                break;
            case 2312899:
                if (str2.equals("L153")) {
                    num = Integer.valueOf(C.DEFAULT_BUFFER_SEGMENT_SIZE);
                    break;
                }
                break;
            case 2312902:
                if (str2.equals("L156")) {
                    num = 262144;
                    break;
                }
                break;
            case 2312989:
                if (str2.equals("L180")) {
                    num = Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    break;
                }
                break;
            case 2312992:
                if (str2.equals("L183")) {
                    num = 4194304;
                    break;
                }
                break;
            case 2312995:
                if (str2.equals("L186")) {
                    num = Integer.valueOf(C.DEFAULT_MUXED_BUFFER_SIZE);
                    break;
                }
                break;
        }
        if (num != null) {
            return new zzdq(i, num.intValue(), true);
        }
        zzeh.c("Unknown HEVC level string: ".concat(str2));
        return zzdqVar;
    }
}
