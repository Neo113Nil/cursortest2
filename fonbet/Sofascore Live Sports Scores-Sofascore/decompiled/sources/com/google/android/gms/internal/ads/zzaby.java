package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzaby;
import com.google.android.gms.internal.ads.zzacm;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzgts;
import com.ironsource.E9;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.c5o;
import defpackage.l7n;
import defpackage.x3o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaby implements zzabu, zziq {
    public static final s n = zzgxm.v(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final s o = zzgxm.v(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final s p = zzgxm.v(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final s q = zzgxm.v(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final s r = zzgxm.v(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final s s = zzgxm.v(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static zzaby t;
    public final Context a;
    public final zzgxp b;
    public final zzabs c;
    public final zzacm d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public String m;

    /* JADX WARN: Type inference failed for: r6v5, types: [t7n] */
    public zzaby(Context context, HashMap hashMap) {
        boolean z;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = zzgxp.a(hashMap);
        this.c = new zzabs();
        this.d = new zzacm();
        if (context == null) {
            this.l = 0;
            this.j = 1000000L;
            return;
        }
        zzes a = zzes.a(context);
        int b = a.b();
        this.l = b;
        this.j = d(b);
        ?? r6 = new zzem() { // from class: t7n
            @Override // com.google.android.gms.internal.ads.zzem
            public final void a(int i) {
                String b2;
                TelephonyManager telephonyManager;
                zzaby zzabyVar = zzaby.this;
                synchronized (zzabyVar) {
                    try {
                        if (zzabyVar.l != i || zzabyVar.m == null) {
                            zzabyVar.l = i;
                            if (i != 1 && i != 0 && i != 8) {
                                if (zzabyVar.m == null) {
                                    Context context2 = zzabyVar.a;
                                    String str = zzfm.a;
                                    if (context2 != null && (telephonyManager = (TelephonyManager) context2.getSystemService("phone")) != null) {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso)) {
                                            b2 = zzgts.b(networkCountryIso);
                                            zzabyVar.m = b2;
                                        }
                                    }
                                    b2 = zzgts.b(Locale.getDefault().getCountry());
                                    zzabyVar.m = b2;
                                }
                                zzabyVar.j = zzabyVar.d(i);
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                zzabyVar.c(zzabyVar.e > 0 ? (int) (elapsedRealtime - zzabyVar.f) : 0, zzabyVar.g, zzabyVar.j);
                                zzabyVar.f = elapsedRealtime;
                                zzabyVar.g = 0L;
                                zzabyVar.i = 0L;
                                zzabyVar.h = 0L;
                                zzacm zzacmVar = zzabyVar.d;
                                zzacmVar.a.clear();
                                zzacmVar.c = -1;
                                zzacmVar.d = 0;
                                zzacmVar.e = 0;
                            }
                        }
                    } finally {
                    }
                }
            }
        };
        Executor a2 = zzdi.a();
        CopyOnWriteArrayList copyOnWriteArrayList = a.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            c5o c5oVar = (c5o) it.next();
            if (c5oVar.a.get() == null) {
                copyOnWriteArrayList.remove(c5oVar);
            }
        }
        c5o c5oVar2 = new c5o(a, r6, a2);
        synchronized (a.c) {
            a.b.add(c5oVar2);
            z = a.e;
        }
        if (z) {
            c5oVar2.b.execute(new x3o(c5oVar2, 4));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0130, code lost:
    
        if (r3.equals("AQ") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x064f, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0148, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0b02, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x016e, code lost:
    
        if (r3.equals("GM") != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x047d, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0178, code lost:
    
        if (r3.equals("GL") != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x07ef, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0182, code lost:
    
        if (r3.equals("GI") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0994, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01d2, code lost:
    
        if (r3.equals("FK") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x06a9, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0214, code lost:
    
        if (r3.equals("ER") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x023a, code lost:
    
        if (r3.equals("CX") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0c1a, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0244, code lost:
    
        if (r3.equals("CW") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x025c, code lost:
    
        if (r3.equals("CU") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x08dd, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0282, code lost:
    
        if (r3.equals("CM") != false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0745, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x028c, code lost:
    
        if (r3.equals("CL") != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x040f, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0296, code lost:
    
        if (r3.equals("CK") != false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0be2, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02a0, code lost:
    
        if (r3.equals("ZW") != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0521, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02c6, code lost:
    
        if (r3.equals("YT") != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x06c1, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x02d0, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x02e8, code lost:
    
        if (r3.equals("WS") != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06dd, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02f2, code lost:
    
        if (r3.equals("WF") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x07ad, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02fc, code lost:
    
        if (r3.equals("VU") != false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x08cf, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0330, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x033a, code lost:
    
        if (r3.equals("VC") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0344, code lost:
    
        if (r3.equals("VA") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0386, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0ad8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x03ac, code lost:
    
        if (r3.equals("TV") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03c4, code lost:
    
        if (r3.equals("TR") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0c0c, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03ea, code lost:
    
        if (r3.equals("TM") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x03f4, code lost:
    
        if (r3.equals("TL") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x03fe, code lost:
    
        if (r3.equals("TJ") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0a88, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0408, code lost:
    
        if (r3.equals("TH") != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0424, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0b2c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x043c, code lost:
    
        if (r3.equals("SZ") != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0bbd, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0446, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0450, code lost:
    
        if (r3.equals("SX") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0476, code lost:
    
        if (r3.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY) != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x04ae, code lost:
    
        if (r3.equals("SM") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x04b8, code lost:
    
        if (r3.equals("SL") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0ba1, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x04d0, code lost:
    
        if (r3.equals("SJ") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x04da, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0b1e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x04e4, code lost:
    
        if (r3.equals("SH") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x04fc, code lost:
    
        if (r3.equals("SE") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0506, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0510, code lost:
    
        if (r3.equals("SC") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r3.equals("CI") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x051a, code lost:
    
        if (r3.equals("SB") != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0baf, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x058a, code lost:
    
        if (r3.equals("PY") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05a2, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05c8, code lost:
    
        if (r3.equals("PM") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x05fc, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x083b, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0622, code lost:
    
        if (r3.equals("PA") != false) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0c36, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0648, code lost:
    
        if (r3.equals("NU") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0656, code lost:
    
        if (r3.equals("NR") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007c, code lost:
    
        if (r3.equals("CG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x068a, code lost:
    
        if (r3.equals("NI") != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0abc, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x06a2, code lost:
    
        if (r3.equals("NF") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0a5e, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x06b0, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x06ba, code lost:
    
        if (r3.equals("NC") != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x06d6, code lost:
    
        if (r3.equals("MZ") != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x072a, code lost:
    
        if (r3.equals("MT") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0734, code lost:
    
        if (r3.equals("MS") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x073e, code lost:
    
        if (r3.equals("MR") != false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x075a, code lost:
    
        if (r3.equals("MP") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0784, code lost:
    
        if (r3.equals("MM") != false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0853, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x078e, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0aca, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x07a6, code lost:
    
        if (r3.equals("MH") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x07b4, code lost:
    
        if (r3.equals("MG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x07e8, code lost:
    
        if (r3.equals("MC") != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0804, code lost:
    
        if (r3.equals("LY") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x080e, code lost:
    
        if (r3.equals("LV") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0834, code lost:
    
        if (r3.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_LONG_SNAPPER) != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0842, code lost:
    
        if (r3.equals("LR") != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0a96, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x084c, code lost:
    
        if (r3.equals("LK") != false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x085a, code lost:
    
        if (r3.equals("LI") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x089c, code lost:
    
        if (r3.equals("KY") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x08a6, code lost:
    
        if (r3.equals("KW") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x09e0, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x08be, code lost:
    
        if (r3.equals("KN") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x08c8, code lost:
    
        if (r3.equals("KM") != false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x08d6, code lost:
    
        if (r3.equals("KI") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x091c, code lost:
    
        if (r3.equals("JO") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0934, code lost:
    
        if (r3.equals("JE") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x094b, code lost:
    
        if (r3.equals(com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE) != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x098d, code lost:
    
        if (r3.equals("IM") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x09c5, code lost:
    
        if (r3.equals("HU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00be, code lost:
    
        if (r3.equals("BQ") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x09cf, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x09d9, code lost:
    
        if (r3.equals("HR") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0bfe, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x0a57, code lost:
    
        if (r3.equals("EG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x0a65, code lost:
    
        if (r3.equals("EE") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x0a81, code lost:
    
        if (r3.equals("DZ") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0a8f, code lost:
    
        if (r3.equals("DO") != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0a9d, code lost:
    
        if (r3.equals("DM") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x0ab5, code lost:
    
        if (r3.equals("CR") != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x0ac3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x0ad1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0afb, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0b17, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0b25, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x0b4f, code lost:
    
        if (r3.equals("AZ") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x0b66, code lost:
    
        if (r3.equals("AI") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0b9a, code lost:
    
        if (r3.equals("DJ") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x0ba8, code lost:
    
        if (r3.equals("AG") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0bb6, code lost:
    
        if (r3.equals("AF") != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0bd2, code lost:
    
        if (r3.equals("AD") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0bdb, code lost:
    
        if (r3.equals("BZ") != false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0bf7, code lost:
    
        if (r3.equals("BB") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0c05, code lost:
    
        if (r3.equals("BA") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0c13, code lost:
    
        if (r3.equals("AX") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0c2f, code lost:
    
        if (r3.equals("AM") != false) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f2, code lost:
    
        if (r3.equals("BL") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0761, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x010a, code lost:
    
        if (r3.equals("AT") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0a6c, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
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
    public static int[] g(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 2091) {
            if (hashCode != 2092) {
                if (hashCode != 2102) {
                    if (hashCode != 2103) {
                        if (hashCode != 2111) {
                            if (hashCode != 2112) {
                                if (hashCode != 2135) {
                                    if (hashCode != 2136) {
                                        switch (hashCode) {
                                            case 2083:
                                                break;
                                            case 2084:
                                                if (str.equals("AE")) {
                                                    return new int[]{1, 4, 2, 3, 4, 1};
                                                }
                                                break;
                                            case 2085:
                                                break;
                                            case 2086:
                                                break;
                                            default:
                                                if (hashCode == 2182) {
                                                    break;
                                                } else if (hashCode != 2183) {
                                                    if (hashCode != 2266) {
                                                        if (hashCode != 2267) {
                                                            switch (hashCode) {
                                                                case 2088:
                                                                    break;
                                                                case 2094:
                                                                    if (str.equals("AO")) {
                                                                        return new int[]{3, 4, 4, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2105:
                                                                    break;
                                                                case 2114:
                                                                    if (str.equals("BD")) {
                                                                        return new int[]{2, 1, 3, 2, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2115:
                                                                    if (str.equals("BE")) {
                                                                        return new int[]{0, 0, 1, 0, 1, 2};
                                                                    }
                                                                    break;
                                                                case 2116:
                                                                    break;
                                                                case 2117:
                                                                    break;
                                                                case 2118:
                                                                    if (str.equals("BH")) {
                                                                        return new int[]{1, 3, 1, 3, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2119:
                                                                    break;
                                                                case 2120:
                                                                    if (str.equals("BJ")) {
                                                                        return new int[]{4, 4, 2, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2133:
                                                                    if (str.equals("BW")) {
                                                                        return new int[]{3, 2, 1, 0, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2142:
                                                                    break;
                                                                case 2145:
                                                                    break;
                                                                case 2159:
                                                                    break;
                                                                case 2177:
                                                                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END)) {
                                                                        return new int[]{0, 1, 4, 2, 2, 1};
                                                                    }
                                                                    break;
                                                                case 2185:
                                                                    break;
                                                                case 2187:
                                                                    break;
                                                                case 2198:
                                                                    break;
                                                                case 2206:
                                                                    if (str.equals("EC")) {
                                                                        return new int[]{1, 3, 2, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2208:
                                                                    break;
                                                                case E9.a.e /* 2210 */:
                                                                    break;
                                                                case 2247:
                                                                    if (str.equals("FM")) {
                                                                        return new int[]{4, 2, 4, 0, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2249:
                                                                    if (str.equals("FO")) {
                                                                        return new int[]{0, 2, 2, 0, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2252:
                                                                    if (str.equals("FR")) {
                                                                        return new int[]{1, 1, 1, 1, 0, 2};
                                                                    }
                                                                    break;
                                                                case 2285:
                                                                    if (str.equals("GT")) {
                                                                        return new int[]{2, 1, 2, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2286:
                                                                    if (str.equals("GU")) {
                                                                        return new int[]{2, 2, 4, 3, 3, 2};
                                                                    }
                                                                    break;
                                                                case 2288:
                                                                    if (str.equals("GW")) {
                                                                        return new int[]{4, 4, 1, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2290:
                                                                    if (str.equals("GY")) {
                                                                        return new int[]{3, 1, 1, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2307:
                                                                    if (str.equals("HK")) {
                                                                        return new int[]{0, 1, 0, 1, 1, 0};
                                                                    }
                                                                    break;
                                                                case 2314:
                                                                    break;
                                                                case 2316:
                                                                    break;
                                                                case 2317:
                                                                    break;
                                                                case 2331:
                                                                    if (str.equals("ID")) {
                                                                        return new int[]{3, 1, 3, 3, 2, 4};
                                                                    }
                                                                    break;
                                                                case 2332:
                                                                    if (str.equals("IE")) {
                                                                        return new int[]{1, 1, 1, 1, 1, 2};
                                                                    }
                                                                    break;
                                                                case 2339:
                                                                    if (str.equals("IL")) {
                                                                        return new int[]{1, 2, 2, 3, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2340:
                                                                    break;
                                                                case 2341:
                                                                    if (str.equals("IN")) {
                                                                        return new int[]{1, 1, 3, 2, 2, 3};
                                                                    }
                                                                    break;
                                                                case 2342:
                                                                    if (str.equals("IO")) {
                                                                        return new int[]{3, 2, 2, 0, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2344:
                                                                    if (str.equals("IQ")) {
                                                                        return new int[]{3, 2, 3, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2345:
                                                                    if (str.equals("IR")) {
                                                                        return new int[]{4, 2, 3, 3, 4, 3};
                                                                    }
                                                                    break;
                                                                case 2346:
                                                                    break;
                                                                case 2347:
                                                                    if (str.equals("IT")) {
                                                                        return new int[]{0, 1, 1, 2, 1, 2};
                                                                    }
                                                                    break;
                                                                case 2363:
                                                                    break;
                                                                case 2371:
                                                                    if (str.equals("JM")) {
                                                                        return new int[]{2, 4, 3, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2373:
                                                                    break;
                                                                case 2374:
                                                                    if (str.equals("JP")) {
                                                                        return new int[]{0, 3, 2, 3, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2394:
                                                                    if (str.equals("KE")) {
                                                                        return new int[]{3, 2, 1, 1, 1, 2};
                                                                    }
                                                                    break;
                                                                case 2396:
                                                                    if (str.equals("KG")) {
                                                                        return new int[]{2, 1, 1, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2397:
                                                                    if (str.equals("KH")) {
                                                                        return new int[]{1, 0, 4, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2398:
                                                                    break;
                                                                case 2402:
                                                                    break;
                                                                case 2403:
                                                                    break;
                                                                case 2407:
                                                                    if (str.equals("KR")) {
                                                                        return new int[]{0, 2, 2, 4, 4, 4};
                                                                    }
                                                                    break;
                                                                case 2412:
                                                                    break;
                                                                case 2414:
                                                                    break;
                                                                case 2415:
                                                                    if (str.equals("KZ")) {
                                                                        return new int[]{2, 1, 2, 2, 3, 2};
                                                                    }
                                                                    break;
                                                                case 2421:
                                                                    if (str.equals("LA")) {
                                                                        return new int[]{1, 2, 1, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2422:
                                                                    if (str.equals("LB")) {
                                                                        return new int[]{3, 1, 1, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2423:
                                                                    if (str.equals("LC")) {
                                                                        return new int[]{2, 2, 1, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2429:
                                                                    break;
                                                                case 2431:
                                                                    break;
                                                                case 2438:
                                                                    break;
                                                                case 2439:
                                                                    break;
                                                                case 2440:
                                                                    if (str.equals("LT")) {
                                                                        return new int[]{0, 1, 0, 1, 0, 2};
                                                                    }
                                                                    break;
                                                                case 2441:
                                                                    if (str.equals("LU")) {
                                                                        return new int[]{4, 0, 3, 2, 1, 3};
                                                                    }
                                                                    break;
                                                                case 2442:
                                                                    break;
                                                                case 2445:
                                                                    break;
                                                                case 2452:
                                                                    if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                                                                        return new int[]{3, 3, 1, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2454:
                                                                    break;
                                                                case 2455:
                                                                    if (str.equals("MD")) {
                                                                        return new int[]{1, 0, 0, 0, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2456:
                                                                    if (str.equals("ME")) {
                                                                        return new int[]{2, 0, 0, 1, 3, 2};
                                                                    }
                                                                    break;
                                                                case 2457:
                                                                    if (str.equals("MF")) {
                                                                        return new int[]{1, 2, 2, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2458:
                                                                    break;
                                                                case 2459:
                                                                    break;
                                                                case 2462:
                                                                    if (str.equals("MK")) {
                                                                        return new int[]{1, 0, 0, 1, 3, 2};
                                                                    }
                                                                    break;
                                                                case 2463:
                                                                    break;
                                                                case 2464:
                                                                    break;
                                                                case 2465:
                                                                    if (str.equals("MN")) {
                                                                        return new int[]{2, 0, 2, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2466:
                                                                    if (str.equals("MO")) {
                                                                        return new int[]{0, 2, 4, 4, 3, 1};
                                                                    }
                                                                    break;
                                                                case 2467:
                                                                    break;
                                                                case 2468:
                                                                    if (str.equals("MQ")) {
                                                                        return new int[]{2, 1, 2, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2469:
                                                                    break;
                                                                case 2470:
                                                                    break;
                                                                case 2471:
                                                                    break;
                                                                case 2472:
                                                                    if (str.equals("MU")) {
                                                                        return new int[]{3, 1, 0, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2473:
                                                                    if (str.equals("MV")) {
                                                                        return new int[]{3, 2, 1, 3, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2474:
                                                                    if (str.equals("MW")) {
                                                                        return new int[]{3, 2, 2, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2475:
                                                                    if (str.equals("MX")) {
                                                                        return new int[]{2, 4, 4, 4, 3, 2};
                                                                    }
                                                                    break;
                                                                case 2476:
                                                                    if (str.equals("MY")) {
                                                                        return new int[]{1, 0, 4, 1, 1, 0};
                                                                    }
                                                                    break;
                                                                case 2477:
                                                                    break;
                                                                case 2483:
                                                                    if (str.equals("NA")) {
                                                                        return new int[]{3, 4, 3, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2485:
                                                                    break;
                                                                case 2487:
                                                                    break;
                                                                case 2488:
                                                                    break;
                                                                case 2489:
                                                                    if (str.equals("NG")) {
                                                                        return new int[]{3, 4, 2, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2491:
                                                                    break;
                                                                case 2494:
                                                                    if (str.equals("NL")) {
                                                                        return new int[]{2, 1, 4, 3, 0, 4};
                                                                    }
                                                                    break;
                                                                case 2497:
                                                                    if (str.equals("NO")) {
                                                                        return new int[]{0, 0, 3, 0, 0, 2};
                                                                    }
                                                                    break;
                                                                case 2498:
                                                                    if (str.equals("NP")) {
                                                                        return new int[]{2, 2, 4, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2500:
                                                                    break;
                                                                case E9.b.e /* 2503 */:
                                                                    break;
                                                                case 2508:
                                                                    if (str.equals("NZ")) {
                                                                        return new int[]{0, 0, 1, 2, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2526:
                                                                    if (str.equals("OM")) {
                                                                        return new int[]{2, 3, 1, 2, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2545:
                                                                    break;
                                                                case 2549:
                                                                    if (str.equals("PE")) {
                                                                        return new int[]{1, 2, 4, 4, 3, 2};
                                                                    }
                                                                    break;
                                                                case 2550:
                                                                    if (str.equals("PF")) {
                                                                        return new int[]{2, 2, 3, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2551:
                                                                    break;
                                                                case 2552:
                                                                    if (str.equals("PH")) {
                                                                        return new int[]{2, 1, 2, 3, 2, 1};
                                                                    }
                                                                    break;
                                                                case 2555:
                                                                    if (str.equals("PK")) {
                                                                        return new int[]{3, 3, 3, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2556:
                                                                    if (str.equals("PL")) {
                                                                        return new int[]{1, 0, 2, 2, 4, 4};
                                                                    }
                                                                    break;
                                                                case 2557:
                                                                    break;
                                                                case 2562:
                                                                    if (str.equals(PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER)) {
                                                                        return new int[]{2, 0, 2, 1, 2, 0};
                                                                    }
                                                                    break;
                                                                case 2563:
                                                                    if (str.equals("PS")) {
                                                                        return new int[]{3, 4, 1, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2564:
                                                                    break;
                                                                case 2567:
                                                                    if (str.equals("PW")) {
                                                                        return new int[]{2, 2, 4, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2569:
                                                                    break;
                                                                case 2576:
                                                                    if (str.equals("QA")) {
                                                                        return new int[]{1, 4, 4, 4, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2611:
                                                                    if (str.equals("RE")) {
                                                                        return new int[]{0, 3, 2, 3, 1, 2};
                                                                    }
                                                                    break;
                                                                case 2621:
                                                                    if (str.equals("RO")) {
                                                                        return new int[]{0, 0, 1, 1, 3, 2};
                                                                    }
                                                                    break;
                                                                case 2625:
                                                                    if (str.equals("RS")) {
                                                                        return new int[]{1, 0, 0, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2627:
                                                                    if (str.equals("RU")) {
                                                                        return new int[]{1, 0, 0, 1, 3, 3};
                                                                    }
                                                                    break;
                                                                case 2629:
                                                                    if (str.equals("RW")) {
                                                                        return new int[]{3, 3, 2, 0, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2638:
                                                                    if (str.equals("SA")) {
                                                                        return new int[]{3, 1, 1, 2, 2, 0};
                                                                    }
                                                                    break;
                                                                case 2639:
                                                                    break;
                                                                case 2640:
                                                                    break;
                                                                case 2641:
                                                                    break;
                                                                case 2642:
                                                                    break;
                                                                case 2644:
                                                                    if (str.equals("SG")) {
                                                                        return new int[]{2, 3, 3, 3, 1, 1};
                                                                    }
                                                                    break;
                                                                case 2645:
                                                                    break;
                                                                case 2646:
                                                                    break;
                                                                case 2647:
                                                                    break;
                                                                case 2648:
                                                                    if (str.equals("SK")) {
                                                                        return new int[]{0, 1, 1, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2649:
                                                                    break;
                                                                case 2650:
                                                                    break;
                                                                case 2651:
                                                                    if (str.equals("SN")) {
                                                                        return new int[]{4, 4, 3, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2652:
                                                                    if (str.equals("SO")) {
                                                                        return new int[]{2, 2, 3, 4, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2655:
                                                                    if (str.equals("SR")) {
                                                                        return new int[]{2, 4, 4, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2656:
                                                                    break;
                                                                case 2657:
                                                                    if (str.equals("ST")) {
                                                                        return new int[]{2, 2, 1, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2659:
                                                                    if (str.equals("SV")) {
                                                                        return new int[]{2, 3, 2, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2661:
                                                                    break;
                                                                case 2662:
                                                                    break;
                                                                case 2663:
                                                                    break;
                                                                case 2671:
                                                                    if (str.equals("TC")) {
                                                                        return new int[]{3, 2, 1, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2672:
                                                                    break;
                                                                case 2675:
                                                                    if (str.equals("TG")) {
                                                                        return new int[]{3, 4, 1, 0, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2676:
                                                                    break;
                                                                case 2678:
                                                                    break;
                                                                case 2680:
                                                                    break;
                                                                case 2681:
                                                                    break;
                                                                case 2682:
                                                                    if (str.equals("TN")) {
                                                                        return new int[]{3, 1, 1, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2683:
                                                                    if (str.equals("TO")) {
                                                                        return new int[]{3, 2, 4, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2686:
                                                                    break;
                                                                case 2688:
                                                                    if (str.equals("TT")) {
                                                                        return new int[]{2, 4, 1, 0, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2690:
                                                                    break;
                                                                case 2691:
                                                                    if (str.equals("TW")) {
                                                                        return new int[]{0, 0, 0, 0, 0, 0};
                                                                    }
                                                                    break;
                                                                case 2694:
                                                                    if (str.equals("TZ")) {
                                                                        return new int[]{3, 4, 2, 1, 3, 2};
                                                                    }
                                                                    break;
                                                                case 2700:
                                                                    break;
                                                                case 2706:
                                                                    if (str.equals("UG")) {
                                                                        return new int[]{3, 3, 2, 3, 4, 2};
                                                                    }
                                                                    break;
                                                                case 2718:
                                                                    if (str.equals("US")) {
                                                                        return new int[]{2, 2, 4, 1, 3, 1};
                                                                    }
                                                                    break;
                                                                case 2724:
                                                                    if (str.equals("UY")) {
                                                                        return new int[]{2, 1, 1, 2, 1, 2};
                                                                    }
                                                                    break;
                                                                case 2725:
                                                                    if (str.equals("UZ")) {
                                                                        return new int[]{1, 2, 3, 4, 3, 2};
                                                                    }
                                                                    break;
                                                                case 2731:
                                                                    break;
                                                                case 2733:
                                                                    break;
                                                                case 2735:
                                                                    break;
                                                                case 2737:
                                                                    if (str.equals("VG")) {
                                                                        return new int[]{2, 2, 1, 1, 2, 4};
                                                                    }
                                                                    break;
                                                                case 2739:
                                                                    if (str.equals("VI")) {
                                                                        return new int[]{0, 2, 1, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2744:
                                                                    if (str.equals("VN")) {
                                                                        return new int[]{0, 0, 1, 2, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2751:
                                                                    break;
                                                                case 2767:
                                                                    break;
                                                                case 2780:
                                                                    break;
                                                                case 2803:
                                                                    if (str.equals("XK")) {
                                                                        return new int[]{1, 2, 1, 1, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2828:
                                                                    break;
                                                                case 2843:
                                                                    break;
                                                                case 2855:
                                                                    if (str.equals("ZA")) {
                                                                        return new int[]{2, 4, 2, 1, 1, 2};
                                                                    }
                                                                    break;
                                                                case 2867:
                                                                    if (str.equals("ZM")) {
                                                                        return new int[]{4, 4, 4, 3, 2, 2};
                                                                    }
                                                                    break;
                                                                case 2877:
                                                                    break;
                                                                default:
                                                                    switch (hashCode) {
                                                                        case 2152:
                                                                            break;
                                                                        case 2153:
                                                                            break;
                                                                        case 2154:
                                                                            break;
                                                                        case 2155:
                                                                            if (str.equals("CN")) {
                                                                                return new int[]{2, 0, 1, 1, 3, 1};
                                                                            }
                                                                            break;
                                                                        case 2156:
                                                                            if (str.equals("CO")) {
                                                                                return new int[]{2, 3, 3, 2, 2, 2};
                                                                            }
                                                                            break;
                                                                        default:
                                                                            switch (hashCode) {
                                                                                case 2162:
                                                                                    break;
                                                                                case 2163:
                                                                                    if (str.equals("CV")) {
                                                                                        return new int[]{2, 3, 0, 1, 2, 2};
                                                                                    }
                                                                                    break;
                                                                                case 2164:
                                                                                    break;
                                                                                case 2165:
                                                                                    break;
                                                                                case 2166:
                                                                                    if (str.equals("CY")) {
                                                                                        return new int[]{1, 0, 1, 0, 0, 2};
                                                                                    }
                                                                                    break;
                                                                                case 2167:
                                                                                    if (str.equals("CZ")) {
                                                                                        return new int[]{0, 0, 2, 0, 1, 2};
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    switch (hashCode) {
                                                                                        case 2221:
                                                                                            break;
                                                                                        case 2222:
                                                                                            if (str.equals("ES")) {
                                                                                                return new int[]{0, 0, 0, 0, 1, 0};
                                                                                            }
                                                                                            break;
                                                                                        case 2223:
                                                                                            if (str.equals("ET")) {
                                                                                                return new int[]{4, 3, 4, 4, 4, 2};
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            switch (hashCode) {
                                                                                                case 2243:
                                                                                                    if (str.equals("FI")) {
                                                                                                        return new int[]{0, 0, 0, 1, 0, 2};
                                                                                                    }
                                                                                                    break;
                                                                                                case 2244:
                                                                                                    if (str.equals("FJ")) {
                                                                                                        return new int[]{3, 2, 2, 3, 2, 2};
                                                                                                    }
                                                                                                    break;
                                                                                                case 2245:
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (hashCode) {
                                                                                                        case 2269:
                                                                                                            if (str.equals("GD")) {
                                                                                                                return new int[]{2, 2, 0, 0, 2, 2};
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2270:
                                                                                                            if (str.equals("GE")) {
                                                                                                                return new int[]{1, 1, 0, 2, 2, 2};
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2271:
                                                                                                            if (str.equals("GF")) {
                                                                                                                return new int[]{3, 2, 3, 3, 2, 2};
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2272:
                                                                                                            if (str.equals("GG")) {
                                                                                                                return new int[]{0, 2, 1, 1, 2, 2};
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2273:
                                                                                                            if (str.equals("GH")) {
                                                                                                                return new int[]{3, 3, 3, 2, 2, 2};
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2274:
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (hashCode) {
                                                                                                                case 2277:
                                                                                                                    break;
                                                                                                                case 2278:
                                                                                                                    break;
                                                                                                                case 2279:
                                                                                                                    if (str.equals("GN")) {
                                                                                                                        return new int[]{3, 4, 4, 2, 2, 2};
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (hashCode) {
                                                                                                                        case 2281:
                                                                                                                            if (str.equals("GP")) {
                                                                                                                                return new int[]{2, 1, 1, 3, 2, 2};
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 2282:
                                                                                                                            break;
                                                                                                                        case 2283:
                                                                                                                            if (str.equals("GR")) {
                                                                                                                                return new int[]{1, 0, 0, 0, 1, 2};
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (hashCode) {
                                                                                                                                case 2096:
                                                                                                                                    break;
                                                                                                                                case 2097:
                                                                                                                                    if (str.equals(PlayerKt.CRICKET_ALLROUNDER)) {
                                                                                                                                        return new int[]{2, 2, 2, 2, 1, 2};
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 2098:
                                                                                                                                    if (str.equals("AS")) {
                                                                                                                                        return new int[]{2, 2, 3, 3, 2, 2};
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 2099:
                                                                                                                                    break;
                                                                                                                                case 2100:
                                                                                                                                    if (str.equals("AU")) {
                                                                                                                                        return new int[]{0, 3, 1, 1, 3, 0};
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    switch (hashCode) {
                                                                                                                                        case 2122:
                                                                                                                                            break;
                                                                                                                                        case 2123:
                                                                                                                                            if (str.equals(PlayerKt.CRICKET_BATTER)) {
                                                                                                                                                return new int[]{0, 2, 0, 0, 2, 2};
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2124:
                                                                                                                                            if (str.equals("BN")) {
                                                                                                                                                return new int[]{3, 2, 0, 0, 2, 2};
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2125:
                                                                                                                                            if (str.equals("BO")) {
                                                                                                                                                return new int[]{1, 2, 4, 4, 2, 2};
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            switch (hashCode) {
                                                                                                                                                case 2127:
                                                                                                                                                    break;
                                                                                                                                                case 2128:
                                                                                                                                                    if (str.equals("BR")) {
                                                                                                                                                        return new int[]{1, 1, 1, 1, 2, 4};
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 2129:
                                                                                                                                                    if (str.equals("BS")) {
                                                                                                                                                        return new int[]{3, 2, 1, 1, 2, 2};
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 2130:
                                                                                                                                                    if (str.equals("BT")) {
                                                                                                                                                        return new int[]{3, 1, 2, 2, 3, 2};
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    switch (hashCode) {
                                                                                                                                                        case 2147:
                                                                                                                                                            if (str.equals("CF")) {
                                                                                                                                                                return new int[]{4, 2, 4, 2, 2, 2};
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 2149:
                                                                                                                                                            if (str.equals("CH")) {
                                                                                                                                                                return new int[]{0, 1, 0, 0, 0, 2};
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                            }
                                                                                                                                    }
                                                                                                                            }
                                                                                                                    }
                                                                                                            }
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                        } else if (str.equals("GB")) {
                                                            return new int[]{1, 1, 3, 2, 2, 2};
                                                        }
                                                    } else if (str.equals("GA")) {
                                                        return new int[]{3, 4, 0, 0, 2, 2};
                                                    }
                                                } else if (str.equals("DK")) {
                                                    return new int[]{0, 0, 2, 0, 0, 2};
                                                }
                                                break;
                                        }
                                    }
                                } else if (str.equals("BY")) {
                                    return new int[]{1, 2, 3, 3, 2, 2};
                                }
                            }
                        }
                    }
                } else if (str.equals("AW")) {
                    return new int[]{2, 2, 3, 4, 2, 2};
                }
            }
        } else if (str.equals("AL")) {
            return new int[]{1, 1, 1, 2, 2, 2};
        }
        return new int[]{2, 2, 2, 2, 2, 2};
    }

    @Override // com.google.android.gms.internal.ads.zzabu
    public final void a(zzpv zzpvVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l7n l7nVar = (l7n) it.next();
            if (l7nVar.b == zzpvVar) {
                l7nVar.c = true;
                copyOnWriteArrayList.remove(l7nVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabu
    public final void b(Handler handler, zzpv zzpvVar) {
        zzpvVar.getClass();
        zzabs zzabsVar = this.c;
        CopyOnWriteArrayList copyOnWriteArrayList = zzabsVar.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l7n l7nVar = (l7n) it.next();
            if (l7nVar.b == zzpvVar) {
                l7nVar.c = true;
                copyOnWriteArrayList.remove(l7nVar);
            }
        }
        zzabsVar.a.add(new l7n(handler, zzpvVar));
    }

    public final void c(int i, long j, final long j2) {
        final int i2;
        final long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.k) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.k = j2;
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            final l7n l7nVar = (l7n) it.next();
            if (!l7nVar.c) {
                l7nVar.a.post(new Runnable() { // from class: j7n
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        l7n.this.b.m(i2, j3, j2);
                    }
                });
            }
        }
    }

    public final long d(int i) {
        long longValue;
        Integer valueOf = Integer.valueOf(i);
        zzgxp zzgxpVar = this.b;
        Long l = (Long) zzgxpVar.get(valueOf);
        if (l == null) {
            l = (Long) zzgxpVar.get(0);
        } else if (l.longValue() == C.TIME_UNSET) {
            String str = this.m;
            if (str == null) {
                str = "";
            }
            int[] g = g(str);
            if (i != 2) {
                if (i == 3) {
                    longValue = ((Long) o.get(g[1])).longValue();
                } else if (i == 4) {
                    longValue = ((Long) p.get(g[2])).longValue();
                } else if (i == 5) {
                    longValue = ((Long) q.get(g[3])).longValue();
                } else if (i != 7) {
                    longValue = i != 9 ? i != 10 ? 1000000L : ((Long) r.get(g[4])).longValue() : ((Long) s.get(g[5])).longValue();
                }
                l = Long.valueOf(longValue);
            }
            longValue = ((Long) n.get(g[0])).longValue();
            l = Long.valueOf(longValue);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final synchronized void e(zzhk zzhkVar, zzhw zzhwVar, boolean z) {
        boolean z2;
        if (z) {
            zzhwVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.e == 0) {
                this.f = SystemClock.elapsedRealtime();
            }
            this.e++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r10.i >= 524288) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zziq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(zzhw zzhwVar, boolean z) {
        Throwable th;
        zzaby zzabyVar;
        boolean z2;
        zzaby zzabyVar2;
        try {
            if (z) {
                try {
                    zzhwVar.getClass();
                    z2 = true;
                } catch (Throwable th2) {
                    th = th2;
                    zzabyVar = this;
                    throw th;
                }
            } else {
                z2 = false;
            }
            if (z2) {
                try {
                    zzguk.f(this.e > 0);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i = (int) (elapsedRealtime - this.f);
                    this.h += i;
                    long j = this.i;
                    long j2 = this.g;
                    this.i = j + j2;
                    if (i > 0) {
                        zzacm zzacmVar = this.d;
                        zzacmVar.a((j2 * 8000.0f) / i, (int) Math.sqrt(j2));
                        if (this.h < 2000) {
                        }
                        this.j = (long) zzacmVar.b();
                        zzabyVar2 = this;
                        zzabyVar2.c(i, this.g, this.j);
                        zzabyVar2.f = elapsedRealtime;
                        zzabyVar2.g = 0L;
                    } else {
                        zzabyVar2 = this;
                    }
                    zzabyVar2.e--;
                } catch (Throwable th3) {
                    th = th3;
                    zzabyVar = this;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final synchronized void m(zzhw zzhwVar, boolean z, int i) {
        boolean z2;
        if (z) {
            zzhwVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.g += i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabu
    public final zzaby zze() {
        return this;
    }
}
