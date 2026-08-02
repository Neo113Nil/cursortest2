package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzra;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
public final class zzlg implements zzgz {
    private static volatile zzlg zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zziq zzD;
    private String zzE;
    long zza;
    private final zzfv zzc;
    private final zzfa zzd;
    private zzam zze;
    private zzfc zzf;
    private zzkr zzg;
    private zzaa zzh;
    private final zzli zzi;
    private zzio zzj;
    private zzka zzk;
    private final zzkv zzl;
    private zzfm zzm;
    private final zzge zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzln zzF = new zzlb(this);

    zzlg(zzlh zzlhVar, zzge zzgeVar) {
        Preconditions.checkNotNull(zzlhVar);
        this.zzn = zzge.zzp(zzlhVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzkv(this);
        zzli zzliVar = new zzli(this);
        zzliVar.zzX();
        this.zzi = zzliVar;
        zzfa zzfaVar = new zzfa(this);
        zzfaVar.zzX();
        this.zzd = zzfaVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.zzX();
        this.zzc = zzfvVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaB().zzp(new zzkw(this, zzlhVar));
    }

    static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i, String str) {
        List zzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < zzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj("_err");
        zze.zzi(Long.valueOf(i).longValue());
        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) zze.zzaD();
        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfx zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zze2.zzaD();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        List zzp = zzfsVar.zzp();
        for (int i = 0; i < zzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i)).zzg())) {
                zzfsVar.zzh(i);
                return;
            }
        }
    }

    private final zzq zzac(String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzx())) {
            zzaA().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean zzad = zzad(zzj);
        if (zzad != null && !zzad.booleanValue()) {
            zzaA().zzd().zzb("App version does not match; dropping. appId", zzeu.zzn(str));
            return null;
        }
        String zzz = zzj.zzz();
        String zzx = zzj.zzx();
        long zzb2 = zzj.zzb();
        String zzw = zzj.zzw();
        long zzm = zzj.zzm();
        long zzj2 = zzj.zzj();
        boolean zzal = zzj.zzal();
        String zzy = zzj.zzy();
        zzj.zza();
        return new zzq(str, zzz, zzx, zzb2, zzw, zzm, zzj2, (String) null, zzal, false, zzy, 0L, 0L, 0, zzj.zzak(), false, zzj.zzs(), zzj.zzr(), zzj.zzk(), zzj.zzD(), (String) null, zzh(str).zzh(), "", (String) null, zzj.zzan(), zzj.zzq());
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzu(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzu(), 0).versionName;
                String zzx = zzhVar.zzx();
                if (zzx != null && zzx.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaB().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzaA().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzaA().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j, boolean z) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = true != z ? "_lte" : "_se";
        zzll zzp = zzamVar.zzp(zzgcVar.zzaq(), str);
        zzll zzllVar = (zzp == null || zzp.zze == null) ? new zzll(zzgcVar.zzaq(), "auto", str, zzax().currentTimeMillis(), Long.valueOf(j)) : new zzll(zzgcVar.zzaq(), "auto", str, zzax().currentTimeMillis(), Long.valueOf(((Long) zzp.zze).longValue() + j));
        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzd.zzf(str);
        zzd.zzg(zzax().currentTimeMillis());
        zzd.zze(((Long) zzllVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaD();
        int zza = zzli.zza(zzgcVar, str);
        if (zza >= 0) {
            zzgcVar.zzan(zza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j > 0) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzL(zzllVar);
            zzaA().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzllVar.zze);
        }
    }

    private final void zzag() {
        long max;
        long j;
        zzaB().zzg();
        zzB();
        if (this.zza > 0) {
            long abs = 3600000 - Math.abs(zzax().elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzaA().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzm().zzc();
                zzkr zzkrVar = this.zzg;
                zzal(zzkrVar);
                zzkrVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzai()) {
            zzaA().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkr zzkrVar2 = this.zzg;
            zzal(zzkrVar2);
            zzkrVar2.zza();
            return;
        }
        long currentTimeMillis = zzax().currentTimeMillis();
        zzg();
        long max2 = Math.max(0L, ((Long) zzeh.zzA.zza(null)).longValue());
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        boolean z = true;
        if (!zzamVar.zzH()) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            if (!zzamVar2.zzG()) {
                z = false;
            }
        }
        if (z) {
            String zzl = zzg().zzl();
            if (TextUtils.isEmpty(zzl) || ".none.".equals(zzl)) {
                zzg();
                max = Math.max(0L, ((Long) zzeh.zzu.zza(null)).longValue());
            } else {
                zzg();
                max = Math.max(0L, ((Long) zzeh.zzv.zza(null)).longValue());
            }
        } else {
            zzg();
            max = Math.max(0L, ((Long) zzeh.zzt.zza(null)).longValue());
        }
        long zza = this.zzk.zzc.zza();
        long zza2 = this.zzk.zzd.zza();
        zzam zzamVar3 = this.zze;
        zzal(zzamVar3);
        long j2 = 0;
        long zzd = zzamVar3.zzd();
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        boolean z2 = z;
        long max3 = Math.max(zzd, zzamVar4.zze());
        if (max3 == 0) {
            j = 0;
        } else {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            j = max2 + abs2;
            long max4 = Math.max(abs3, abs4);
            if (z2 && max4 > 0) {
                j = Math.min(abs2, max4) + max;
            }
            zzli zzliVar = this.zzi;
            zzal(zzliVar);
            if (!zzliVar.zzw(max4, max)) {
                j = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i = 0;
                while (true) {
                    zzg();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzeh.zzC.zza(null)).intValue()))) {
                        j = 0;
                        break;
                    }
                    zzg();
                    j += Math.max(j2, ((Long) zzeh.zzB.zza(null)).longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    }
                    i++;
                    j2 = 0;
                }
            }
            j2 = 0;
        }
        if (j == j2) {
            zzaA().zzj().zza("Next upload time is 0");
            zzm().zzc();
            zzkr zzkrVar3 = this.zzg;
            zzal(zzkrVar3);
            zzkrVar3.zza();
            return;
        }
        zzfa zzfaVar = this.zzd;
        zzal(zzfaVar);
        if (!zzfaVar.zza()) {
            zzaA().zzj().zza("No network");
            zzm().zzb();
            zzkr zzkrVar4 = this.zzg;
            zzal(zzkrVar4);
            zzkrVar4.zza();
            return;
        }
        long zza3 = this.zzk.zzb.zza();
        zzg();
        long max5 = Math.max(0L, ((Long) zzeh.zzr.zza(null)).longValue());
        zzli zzliVar2 = this.zzi;
        zzal(zzliVar2);
        if (!zzliVar2.zzw(zza3, max5)) {
            j = Math.max(j, zza3 + max5);
        }
        zzm().zzc();
        long currentTimeMillis2 = j - zzax().currentTimeMillis();
        if (currentTimeMillis2 <= 0) {
            zzg();
            currentTimeMillis2 = Math.max(0L, ((Long) zzeh.zzw.zza(null)).longValue());
            this.zzk.zzc.zzb(zzax().currentTimeMillis());
        }
        zzaA().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
        zzkr zzkrVar5 = this.zzg;
        zzal(zzkrVar5);
        zzkrVar5.zzd(currentTimeMillis2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:364:0x0b21, code lost:
    
        if (r11 > (com.google.android.gms.measurement.internal.zzag.zzA() + r7)) goto L356;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0387 A[Catch: all -> 0x0cb9, TryCatch #3 {all -> 0x0cb9, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:25:0x04fa, B:26:0x00f1, B:28:0x00ff, B:31:0x011f, B:33:0x0125, B:35:0x0137, B:37:0x0145, B:39:0x0155, B:41:0x0162, B:46:0x0167, B:49:0x0180, B:55:0x01b5, B:58:0x01bf, B:60:0x01cd, B:63:0x021e, B:64:0x01ed, B:66:0x01ff, B:73:0x022f, B:75:0x025b, B:76:0x0285, B:78:0x02bd, B:79:0x02c3, B:82:0x02cf, B:84:0x0305, B:85:0x0320, B:87:0x0326, B:89:0x0334, B:91:0x0348, B:92:0x033c, B:100:0x034f, B:103:0x0356, B:104:0x036e, B:106:0x0387, B:107:0x0393, B:110:0x039d, B:114:0x03c0, B:115:0x03af, B:124:0x043f, B:126:0x044b, B:129:0x045e, B:131:0x046f, B:133:0x047b, B:135:0x04e6, B:140:0x048f, B:142:0x049d, B:145:0x04b2, B:147:0x04c3, B:149:0x04cf, B:151:0x03c8, B:153:0x03d4, B:155:0x03e0, B:159:0x0425, B:160:0x03fd, B:163:0x040f, B:165:0x0415, B:167:0x041f, B:177:0x0510, B:179:0x051e, B:181:0x0529, B:183:0x055b, B:184:0x0531, B:186:0x053c, B:188:0x0542, B:190:0x054e, B:192:0x0556, B:199:0x055e, B:200:0x056a, B:203:0x0572, B:206:0x0584, B:207:0x0590, B:209:0x0598, B:210:0x05be, B:212:0x05e3, B:214:0x05f4, B:216:0x05fa, B:218:0x0606, B:219:0x0635, B:221:0x063b, B:225:0x0649, B:223:0x064d, B:227:0x0650, B:228:0x0653, B:229:0x0661, B:231:0x0667, B:233:0x0677, B:234:0x067e, B:236:0x068a, B:238:0x0691, B:241:0x0694, B:243:0x06d2, B:244:0x06e5, B:246:0x06eb, B:249:0x0706, B:251:0x0721, B:253:0x0738, B:255:0x073d, B:257:0x0741, B:259:0x0745, B:261:0x074f, B:262:0x0759, B:264:0x075d, B:266:0x0763, B:267:0x0771, B:268:0x077a, B:271:0x09ba, B:272:0x0786, B:337:0x079d, B:275:0x07b7, B:277:0x07dc, B:278:0x07e4, B:280:0x07ea, B:284:0x07fc, B:287:0x0812, B:289:0x0827, B:290:0x084a, B:292:0x0856, B:294:0x086b, B:295:0x08a7, B:298:0x08bf, B:300:0x08c6, B:302:0x08d5, B:304:0x08d9, B:306:0x08dd, B:308:0x08e1, B:309:0x08ed, B:310:0x08f2, B:312:0x08f8, B:314:0x0915, B:315:0x091a, B:316:0x09b7, B:318:0x0930, B:320:0x0935, B:323:0x0958, B:325:0x0984, B:326:0x098f, B:328:0x09a1, B:330:0x09a9, B:331:0x0940, B:340:0x07a3, B:342:0x09c2, B:344:0x09ce, B:345:0x09d4, B:346:0x09dc, B:348:0x09e2, B:350:0x09f9, B:352:0x0a0a, B:353:0x0a7a, B:355:0x0a80, B:357:0x0a98, B:360:0x0a9f, B:361:0x0ace, B:363:0x0b11, B:365:0x0b46, B:367:0x0b4a, B:368:0x0b55, B:370:0x0b98, B:372:0x0ba5, B:374:0x0bb4, B:377:0x0bcd, B:380:0x0be6, B:381:0x0b23, B:382:0x0aa7, B:384:0x0ab3, B:385:0x0ab7, B:386:0x0bfd, B:387:0x0c15, B:390:0x0c1d, B:392:0x0c22, B:395:0x0c32, B:397:0x0c4c, B:398:0x0c67, B:400:0x0c70, B:401:0x0c94, B:407:0x0c81, B:408:0x0a22, B:410:0x0a28, B:412:0x0a30, B:413:0x0a37, B:418:0x0a45, B:419:0x0a4c, B:421:0x0a6b, B:422:0x0a72, B:423:0x0a6f, B:424:0x0a49, B:426:0x0a34, B:428:0x059e, B:430:0x05a4, B:433:0x0ca7), top: B:2:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x044b A[Catch: all -> 0x0cb9, TryCatch #3 {all -> 0x0cb9, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:25:0x04fa, B:26:0x00f1, B:28:0x00ff, B:31:0x011f, B:33:0x0125, B:35:0x0137, B:37:0x0145, B:39:0x0155, B:41:0x0162, B:46:0x0167, B:49:0x0180, B:55:0x01b5, B:58:0x01bf, B:60:0x01cd, B:63:0x021e, B:64:0x01ed, B:66:0x01ff, B:73:0x022f, B:75:0x025b, B:76:0x0285, B:78:0x02bd, B:79:0x02c3, B:82:0x02cf, B:84:0x0305, B:85:0x0320, B:87:0x0326, B:89:0x0334, B:91:0x0348, B:92:0x033c, B:100:0x034f, B:103:0x0356, B:104:0x036e, B:106:0x0387, B:107:0x0393, B:110:0x039d, B:114:0x03c0, B:115:0x03af, B:124:0x043f, B:126:0x044b, B:129:0x045e, B:131:0x046f, B:133:0x047b, B:135:0x04e6, B:140:0x048f, B:142:0x049d, B:145:0x04b2, B:147:0x04c3, B:149:0x04cf, B:151:0x03c8, B:153:0x03d4, B:155:0x03e0, B:159:0x0425, B:160:0x03fd, B:163:0x040f, B:165:0x0415, B:167:0x041f, B:177:0x0510, B:179:0x051e, B:181:0x0529, B:183:0x055b, B:184:0x0531, B:186:0x053c, B:188:0x0542, B:190:0x054e, B:192:0x0556, B:199:0x055e, B:200:0x056a, B:203:0x0572, B:206:0x0584, B:207:0x0590, B:209:0x0598, B:210:0x05be, B:212:0x05e3, B:214:0x05f4, B:216:0x05fa, B:218:0x0606, B:219:0x0635, B:221:0x063b, B:225:0x0649, B:223:0x064d, B:227:0x0650, B:228:0x0653, B:229:0x0661, B:231:0x0667, B:233:0x0677, B:234:0x067e, B:236:0x068a, B:238:0x0691, B:241:0x0694, B:243:0x06d2, B:244:0x06e5, B:246:0x06eb, B:249:0x0706, B:251:0x0721, B:253:0x0738, B:255:0x073d, B:257:0x0741, B:259:0x0745, B:261:0x074f, B:262:0x0759, B:264:0x075d, B:266:0x0763, B:267:0x0771, B:268:0x077a, B:271:0x09ba, B:272:0x0786, B:337:0x079d, B:275:0x07b7, B:277:0x07dc, B:278:0x07e4, B:280:0x07ea, B:284:0x07fc, B:287:0x0812, B:289:0x0827, B:290:0x084a, B:292:0x0856, B:294:0x086b, B:295:0x08a7, B:298:0x08bf, B:300:0x08c6, B:302:0x08d5, B:304:0x08d9, B:306:0x08dd, B:308:0x08e1, B:309:0x08ed, B:310:0x08f2, B:312:0x08f8, B:314:0x0915, B:315:0x091a, B:316:0x09b7, B:318:0x0930, B:320:0x0935, B:323:0x0958, B:325:0x0984, B:326:0x098f, B:328:0x09a1, B:330:0x09a9, B:331:0x0940, B:340:0x07a3, B:342:0x09c2, B:344:0x09ce, B:345:0x09d4, B:346:0x09dc, B:348:0x09e2, B:350:0x09f9, B:352:0x0a0a, B:353:0x0a7a, B:355:0x0a80, B:357:0x0a98, B:360:0x0a9f, B:361:0x0ace, B:363:0x0b11, B:365:0x0b46, B:367:0x0b4a, B:368:0x0b55, B:370:0x0b98, B:372:0x0ba5, B:374:0x0bb4, B:377:0x0bcd, B:380:0x0be6, B:381:0x0b23, B:382:0x0aa7, B:384:0x0ab3, B:385:0x0ab7, B:386:0x0bfd, B:387:0x0c15, B:390:0x0c1d, B:392:0x0c22, B:395:0x0c32, B:397:0x0c4c, B:398:0x0c67, B:400:0x0c70, B:401:0x0c94, B:407:0x0c81, B:408:0x0a22, B:410:0x0a28, B:412:0x0a30, B:413:0x0a37, B:418:0x0a45, B:419:0x0a4c, B:421:0x0a6b, B:422:0x0a72, B:423:0x0a6f, B:424:0x0a49, B:426:0x0a34, B:428:0x059e, B:430:0x05a4, B:433:0x0ca7), top: B:2:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x048f A[Catch: all -> 0x0cb9, TryCatch #3 {all -> 0x0cb9, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:25:0x04fa, B:26:0x00f1, B:28:0x00ff, B:31:0x011f, B:33:0x0125, B:35:0x0137, B:37:0x0145, B:39:0x0155, B:41:0x0162, B:46:0x0167, B:49:0x0180, B:55:0x01b5, B:58:0x01bf, B:60:0x01cd, B:63:0x021e, B:64:0x01ed, B:66:0x01ff, B:73:0x022f, B:75:0x025b, B:76:0x0285, B:78:0x02bd, B:79:0x02c3, B:82:0x02cf, B:84:0x0305, B:85:0x0320, B:87:0x0326, B:89:0x0334, B:91:0x0348, B:92:0x033c, B:100:0x034f, B:103:0x0356, B:104:0x036e, B:106:0x0387, B:107:0x0393, B:110:0x039d, B:114:0x03c0, B:115:0x03af, B:124:0x043f, B:126:0x044b, B:129:0x045e, B:131:0x046f, B:133:0x047b, B:135:0x04e6, B:140:0x048f, B:142:0x049d, B:145:0x04b2, B:147:0x04c3, B:149:0x04cf, B:151:0x03c8, B:153:0x03d4, B:155:0x03e0, B:159:0x0425, B:160:0x03fd, B:163:0x040f, B:165:0x0415, B:167:0x041f, B:177:0x0510, B:179:0x051e, B:181:0x0529, B:183:0x055b, B:184:0x0531, B:186:0x053c, B:188:0x0542, B:190:0x054e, B:192:0x0556, B:199:0x055e, B:200:0x056a, B:203:0x0572, B:206:0x0584, B:207:0x0590, B:209:0x0598, B:210:0x05be, B:212:0x05e3, B:214:0x05f4, B:216:0x05fa, B:218:0x0606, B:219:0x0635, B:221:0x063b, B:225:0x0649, B:223:0x064d, B:227:0x0650, B:228:0x0653, B:229:0x0661, B:231:0x0667, B:233:0x0677, B:234:0x067e, B:236:0x068a, B:238:0x0691, B:241:0x0694, B:243:0x06d2, B:244:0x06e5, B:246:0x06eb, B:249:0x0706, B:251:0x0721, B:253:0x0738, B:255:0x073d, B:257:0x0741, B:259:0x0745, B:261:0x074f, B:262:0x0759, B:264:0x075d, B:266:0x0763, B:267:0x0771, B:268:0x077a, B:271:0x09ba, B:272:0x0786, B:337:0x079d, B:275:0x07b7, B:277:0x07dc, B:278:0x07e4, B:280:0x07ea, B:284:0x07fc, B:287:0x0812, B:289:0x0827, B:290:0x084a, B:292:0x0856, B:294:0x086b, B:295:0x08a7, B:298:0x08bf, B:300:0x08c6, B:302:0x08d5, B:304:0x08d9, B:306:0x08dd, B:308:0x08e1, B:309:0x08ed, B:310:0x08f2, B:312:0x08f8, B:314:0x0915, B:315:0x091a, B:316:0x09b7, B:318:0x0930, B:320:0x0935, B:323:0x0958, B:325:0x0984, B:326:0x098f, B:328:0x09a1, B:330:0x09a9, B:331:0x0940, B:340:0x07a3, B:342:0x09c2, B:344:0x09ce, B:345:0x09d4, B:346:0x09dc, B:348:0x09e2, B:350:0x09f9, B:352:0x0a0a, B:353:0x0a7a, B:355:0x0a80, B:357:0x0a98, B:360:0x0a9f, B:361:0x0ace, B:363:0x0b11, B:365:0x0b46, B:367:0x0b4a, B:368:0x0b55, B:370:0x0b98, B:372:0x0ba5, B:374:0x0bb4, B:377:0x0bcd, B:380:0x0be6, B:381:0x0b23, B:382:0x0aa7, B:384:0x0ab3, B:385:0x0ab7, B:386:0x0bfd, B:387:0x0c15, B:390:0x0c1d, B:392:0x0c22, B:395:0x0c32, B:397:0x0c4c, B:398:0x0c67, B:400:0x0c70, B:401:0x0c94, B:407:0x0c81, B:408:0x0a22, B:410:0x0a28, B:412:0x0a30, B:413:0x0a37, B:418:0x0a45, B:419:0x0a4c, B:421:0x0a6b, B:422:0x0a72, B:423:0x0a6f, B:424:0x0a49, B:426:0x0a34, B:428:0x059e, B:430:0x05a4, B:433:0x0ca7), top: B:2:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07dc A[Catch: all -> 0x0cb9, TryCatch #3 {all -> 0x0cb9, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:25:0x04fa, B:26:0x00f1, B:28:0x00ff, B:31:0x011f, B:33:0x0125, B:35:0x0137, B:37:0x0145, B:39:0x0155, B:41:0x0162, B:46:0x0167, B:49:0x0180, B:55:0x01b5, B:58:0x01bf, B:60:0x01cd, B:63:0x021e, B:64:0x01ed, B:66:0x01ff, B:73:0x022f, B:75:0x025b, B:76:0x0285, B:78:0x02bd, B:79:0x02c3, B:82:0x02cf, B:84:0x0305, B:85:0x0320, B:87:0x0326, B:89:0x0334, B:91:0x0348, B:92:0x033c, B:100:0x034f, B:103:0x0356, B:104:0x036e, B:106:0x0387, B:107:0x0393, B:110:0x039d, B:114:0x03c0, B:115:0x03af, B:124:0x043f, B:126:0x044b, B:129:0x045e, B:131:0x046f, B:133:0x047b, B:135:0x04e6, B:140:0x048f, B:142:0x049d, B:145:0x04b2, B:147:0x04c3, B:149:0x04cf, B:151:0x03c8, B:153:0x03d4, B:155:0x03e0, B:159:0x0425, B:160:0x03fd, B:163:0x040f, B:165:0x0415, B:167:0x041f, B:177:0x0510, B:179:0x051e, B:181:0x0529, B:183:0x055b, B:184:0x0531, B:186:0x053c, B:188:0x0542, B:190:0x054e, B:192:0x0556, B:199:0x055e, B:200:0x056a, B:203:0x0572, B:206:0x0584, B:207:0x0590, B:209:0x0598, B:210:0x05be, B:212:0x05e3, B:214:0x05f4, B:216:0x05fa, B:218:0x0606, B:219:0x0635, B:221:0x063b, B:225:0x0649, B:223:0x064d, B:227:0x0650, B:228:0x0653, B:229:0x0661, B:231:0x0667, B:233:0x0677, B:234:0x067e, B:236:0x068a, B:238:0x0691, B:241:0x0694, B:243:0x06d2, B:244:0x06e5, B:246:0x06eb, B:249:0x0706, B:251:0x0721, B:253:0x0738, B:255:0x073d, B:257:0x0741, B:259:0x0745, B:261:0x074f, B:262:0x0759, B:264:0x075d, B:266:0x0763, B:267:0x0771, B:268:0x077a, B:271:0x09ba, B:272:0x0786, B:337:0x079d, B:275:0x07b7, B:277:0x07dc, B:278:0x07e4, B:280:0x07ea, B:284:0x07fc, B:287:0x0812, B:289:0x0827, B:290:0x084a, B:292:0x0856, B:294:0x086b, B:295:0x08a7, B:298:0x08bf, B:300:0x08c6, B:302:0x08d5, B:304:0x08d9, B:306:0x08dd, B:308:0x08e1, B:309:0x08ed, B:310:0x08f2, B:312:0x08f8, B:314:0x0915, B:315:0x091a, B:316:0x09b7, B:318:0x0930, B:320:0x0935, B:323:0x0958, B:325:0x0984, B:326:0x098f, B:328:0x09a1, B:330:0x09a9, B:331:0x0940, B:340:0x07a3, B:342:0x09c2, B:344:0x09ce, B:345:0x09d4, B:346:0x09dc, B:348:0x09e2, B:350:0x09f9, B:352:0x0a0a, B:353:0x0a7a, B:355:0x0a80, B:357:0x0a98, B:360:0x0a9f, B:361:0x0ace, B:363:0x0b11, B:365:0x0b46, B:367:0x0b4a, B:368:0x0b55, B:370:0x0b98, B:372:0x0ba5, B:374:0x0bb4, B:377:0x0bcd, B:380:0x0be6, B:381:0x0b23, B:382:0x0aa7, B:384:0x0ab3, B:385:0x0ab7, B:386:0x0bfd, B:387:0x0c15, B:390:0x0c1d, B:392:0x0c22, B:395:0x0c32, B:397:0x0c4c, B:398:0x0c67, B:400:0x0c70, B:401:0x0c94, B:407:0x0c81, B:408:0x0a22, B:410:0x0a28, B:412:0x0a30, B:413:0x0a37, B:418:0x0a45, B:419:0x0a4c, B:421:0x0a6b, B:422:0x0a72, B:423:0x0a6f, B:424:0x0a49, B:426:0x0a34, B:428:0x059e, B:430:0x05a4, B:433:0x0ca7), top: B:2:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0827 A[Catch: all -> 0x0cb9, TryCatch #3 {all -> 0x0cb9, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:25:0x04fa, B:26:0x00f1, B:28:0x00ff, B:31:0x011f, B:33:0x0125, B:35:0x0137, B:37:0x0145, B:39:0x0155, B:41:0x0162, B:46:0x0167, B:49:0x0180, B:55:0x01b5, B:58:0x01bf, B:60:0x01cd, B:63:0x021e, B:64:0x01ed, B:66:0x01ff, B:73:0x022f, B:75:0x025b, B:76:0x0285, B:78:0x02bd, B:79:0x02c3, B:82:0x02cf, B:84:0x0305, B:85:0x0320, B:87:0x0326, B:89:0x0334, B:91:0x0348, B:92:0x033c, B:100:0x034f, B:103:0x0356, B:104:0x036e, B:106:0x0387, B:107:0x0393, B:110:0x039d, B:114:0x03c0, B:115:0x03af, B:124:0x043f, B:126:0x044b, B:129:0x045e, B:131:0x046f, B:133:0x047b, B:135:0x04e6, B:140:0x048f, B:142:0x049d, B:145:0x04b2, B:147:0x04c3, B:149:0x04cf, B:151:0x03c8, B:153:0x03d4, B:155:0x03e0, B:159:0x0425, B:160:0x03fd, B:163:0x040f, B:165:0x0415, B:167:0x041f, B:177:0x0510, B:179:0x051e, B:181:0x0529, B:183:0x055b, B:184:0x0531, B:186:0x053c, B:188:0x0542, B:190:0x054e, B:192:0x0556, B:199:0x055e, B:200:0x056a, B:203:0x0572, B:206:0x0584, B:207:0x0590, B:209:0x0598, B:210:0x05be, B:212:0x05e3, B:214:0x05f4, B:216:0x05fa, B:218:0x0606, B:219:0x0635, B:221:0x063b, B:225:0x0649, B:223:0x064d, B:227:0x0650, B:228:0x0653, B:229:0x0661, B:231:0x0667, B:233:0x0677, B:234:0x067e, B:236:0x068a, B:238:0x0691, B:241:0x0694, B:243:0x06d2, B:244:0x06e5, B:246:0x06eb, B:249:0x0706, B:251:0x0721, B:253:0x0738, B:255:0x073d, B:257:0x0741, B:259:0x0745, B:261:0x074f, B:262:0x0759, B:264:0x075d, B:266:0x0763, B:267:0x0771, B:268:0x077a, B:271:0x09ba, B:272:0x0786, B:337:0x079d, B:275:0x07b7, B:277:0x07dc, B:278:0x07e4, B:280:0x07ea, B:284:0x07fc, B:287:0x0812, B:289:0x0827, B:290:0x084a, B:292:0x0856, B:294:0x086b, B:295:0x08a7, B:298:0x08bf, B:300:0x08c6, B:302:0x08d5, B:304:0x08d9, B:306:0x08dd, B:308:0x08e1, B:309:0x08ed, B:310:0x08f2, B:312:0x08f8, B:314:0x0915, B:315:0x091a, B:316:0x09b7, B:318:0x0930, B:320:0x0935, B:323:0x0958, B:325:0x0984, B:326:0x098f, B:328:0x09a1, B:330:0x09a9, B:331:0x0940, B:340:0x07a3, B:342:0x09c2, B:344:0x09ce, B:345:0x09d4, B:346:0x09dc, B:348:0x09e2, B:350:0x09f9, B:352:0x0a0a, B:353:0x0a7a, B:355:0x0a80, B:357:0x0a98, B:360:0x0a9f, B:361:0x0ace, B:363:0x0b11, B:365:0x0b46, B:367:0x0b4a, B:368:0x0b55, B:370:0x0b98, B:372:0x0ba5, B:374:0x0bb4, B:377:0x0bcd, B:380:0x0be6, B:381:0x0b23, B:382:0x0aa7, B:384:0x0ab3, B:385:0x0ab7, B:386:0x0bfd, B:387:0x0c15, B:390:0x0c1d, B:392:0x0c22, B:395:0x0c32, B:397:0x0c4c, B:398:0x0c67, B:400:0x0c70, B:401:0x0c94, B:407:0x0c81, B:408:0x0a22, B:410:0x0a28, B:412:0x0a30, B:413:0x0a37, B:418:0x0a45, B:419:0x0a4c, B:421:0x0a6b, B:422:0x0a72, B:423:0x0a6f, B:424:0x0a49, B:426:0x0a34, B:428:0x059e, B:430:0x05a4, B:433:0x0ca7), top: B:2:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x084a A[Catch: all -> 0x0cb9, TryCatch #3 {all -> 0x0cb9, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:25:0x04fa, B:26:0x00f1, B:28:0x00ff, B:31:0x011f, B:33:0x0125, B:35:0x0137, B:37:0x0145, B:39:0x0155, B:41:0x0162, B:46:0x0167, B:49:0x0180, B:55:0x01b5, B:58:0x01bf, B:60:0x01cd, B:63:0x021e, B:64:0x01ed, B:66:0x01ff, B:73:0x022f, B:75:0x025b, B:76:0x0285, B:78:0x02bd, B:79:0x02c3, B:82:0x02cf, B:84:0x0305, B:85:0x0320, B:87:0x0326, B:89:0x0334, B:91:0x0348, B:92:0x033c, B:100:0x034f, B:103:0x0356, B:104:0x036e, B:106:0x0387, B:107:0x0393, B:110:0x039d, B:114:0x03c0, B:115:0x03af, B:124:0x043f, B:126:0x044b, B:129:0x045e, B:131:0x046f, B:133:0x047b, B:135:0x04e6, B:140:0x048f, B:142:0x049d, B:145:0x04b2, B:147:0x04c3, B:149:0x04cf, B:151:0x03c8, B:153:0x03d4, B:155:0x03e0, B:159:0x0425, B:160:0x03fd, B:163:0x040f, B:165:0x0415, B:167:0x041f, B:177:0x0510, B:179:0x051e, B:181:0x0529, B:183:0x055b, B:184:0x0531, B:186:0x053c, B:188:0x0542, B:190:0x054e, B:192:0x0556, B:199:0x055e, B:200:0x056a, B:203:0x0572, B:206:0x0584, B:207:0x0590, B:209:0x0598, B:210:0x05be, B:212:0x05e3, B:214:0x05f4, B:216:0x05fa, B:218:0x0606, B:219:0x0635, B:221:0x063b, B:225:0x0649, B:223:0x064d, B:227:0x0650, B:228:0x0653, B:229:0x0661, B:231:0x0667, B:233:0x0677, B:234:0x067e, B:236:0x068a, B:238:0x0691, B:241:0x0694, B:243:0x06d2, B:244:0x06e5, B:246:0x06eb, B:249:0x0706, B:251:0x0721, B:253:0x0738, B:255:0x073d, B:257:0x0741, B:259:0x0745, B:261:0x074f, B:262:0x0759, B:264:0x075d, B:266:0x0763, B:267:0x0771, B:268:0x077a, B:271:0x09ba, B:272:0x0786, B:337:0x079d, B:275:0x07b7, B:277:0x07dc, B:278:0x07e4, B:280:0x07ea, B:284:0x07fc, B:287:0x0812, B:289:0x0827, B:290:0x084a, B:292:0x0856, B:294:0x086b, B:295:0x08a7, B:298:0x08bf, B:300:0x08c6, B:302:0x08d5, B:304:0x08d9, B:306:0x08dd, B:308:0x08e1, B:309:0x08ed, B:310:0x08f2, B:312:0x08f8, B:314:0x0915, B:315:0x091a, B:316:0x09b7, B:318:0x0930, B:320:0x0935, B:323:0x0958, B:325:0x0984, B:326:0x098f, B:328:0x09a1, B:330:0x09a9, B:331:0x0940, B:340:0x07a3, B:342:0x09c2, B:344:0x09ce, B:345:0x09d4, B:346:0x09dc, B:348:0x09e2, B:350:0x09f9, B:352:0x0a0a, B:353:0x0a7a, B:355:0x0a80, B:357:0x0a98, B:360:0x0a9f, B:361:0x0ace, B:363:0x0b11, B:365:0x0b46, B:367:0x0b4a, B:368:0x0b55, B:370:0x0b98, B:372:0x0ba5, B:374:0x0bb4, B:377:0x0bcd, B:380:0x0be6, B:381:0x0b23, B:382:0x0aa7, B:384:0x0ab3, B:385:0x0ab7, B:386:0x0bfd, B:387:0x0c15, B:390:0x0c1d, B:392:0x0c22, B:395:0x0c32, B:397:0x0c4c, B:398:0x0c67, B:400:0x0c70, B:401:0x0c94, B:407:0x0c81, B:408:0x0a22, B:410:0x0a28, B:412:0x0a30, B:413:0x0a37, B:418:0x0a45, B:419:0x0a4c, B:421:0x0a6b, B:422:0x0a72, B:423:0x0a6f, B:424:0x0a49, B:426:0x0a34, B:428:0x059e, B:430:0x05a4, B:433:0x0ca7), top: B:2:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0b11 A[Catch: all -> 0x0cb9, TryCatch #3 {all -> 0x0cb9, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:25:0x04fa, B:26:0x00f1, B:28:0x00ff, B:31:0x011f, B:33:0x0125, B:35:0x0137, B:37:0x0145, B:39:0x0155, B:41:0x0162, B:46:0x0167, B:49:0x0180, B:55:0x01b5, B:58:0x01bf, B:60:0x01cd, B:63:0x021e, B:64:0x01ed, B:66:0x01ff, B:73:0x022f, B:75:0x025b, B:76:0x0285, B:78:0x02bd, B:79:0x02c3, B:82:0x02cf, B:84:0x0305, B:85:0x0320, B:87:0x0326, B:89:0x0334, B:91:0x0348, B:92:0x033c, B:100:0x034f, B:103:0x0356, B:104:0x036e, B:106:0x0387, B:107:0x0393, B:110:0x039d, B:114:0x03c0, B:115:0x03af, B:124:0x043f, B:126:0x044b, B:129:0x045e, B:131:0x046f, B:133:0x047b, B:135:0x04e6, B:140:0x048f, B:142:0x049d, B:145:0x04b2, B:147:0x04c3, B:149:0x04cf, B:151:0x03c8, B:153:0x03d4, B:155:0x03e0, B:159:0x0425, B:160:0x03fd, B:163:0x040f, B:165:0x0415, B:167:0x041f, B:177:0x0510, B:179:0x051e, B:181:0x0529, B:183:0x055b, B:184:0x0531, B:186:0x053c, B:188:0x0542, B:190:0x054e, B:192:0x0556, B:199:0x055e, B:200:0x056a, B:203:0x0572, B:206:0x0584, B:207:0x0590, B:209:0x0598, B:210:0x05be, B:212:0x05e3, B:214:0x05f4, B:216:0x05fa, B:218:0x0606, B:219:0x0635, B:221:0x063b, B:225:0x0649, B:223:0x064d, B:227:0x0650, B:228:0x0653, B:229:0x0661, B:231:0x0667, B:233:0x0677, B:234:0x067e, B:236:0x068a, B:238:0x0691, B:241:0x0694, B:243:0x06d2, B:244:0x06e5, B:246:0x06eb, B:249:0x0706, B:251:0x0721, B:253:0x0738, B:255:0x073d, B:257:0x0741, B:259:0x0745, B:261:0x074f, B:262:0x0759, B:264:0x075d, B:266:0x0763, B:267:0x0771, B:268:0x077a, B:271:0x09ba, B:272:0x0786, B:337:0x079d, B:275:0x07b7, B:277:0x07dc, B:278:0x07e4, B:280:0x07ea, B:284:0x07fc, B:287:0x0812, B:289:0x0827, B:290:0x084a, B:292:0x0856, B:294:0x086b, B:295:0x08a7, B:298:0x08bf, B:300:0x08c6, B:302:0x08d5, B:304:0x08d9, B:306:0x08dd, B:308:0x08e1, B:309:0x08ed, B:310:0x08f2, B:312:0x08f8, B:314:0x0915, B:315:0x091a, B:316:0x09b7, B:318:0x0930, B:320:0x0935, B:323:0x0958, B:325:0x0984, B:326:0x098f, B:328:0x09a1, B:330:0x09a9, B:331:0x0940, B:340:0x07a3, B:342:0x09c2, B:344:0x09ce, B:345:0x09d4, B:346:0x09dc, B:348:0x09e2, B:350:0x09f9, B:352:0x0a0a, B:353:0x0a7a, B:355:0x0a80, B:357:0x0a98, B:360:0x0a9f, B:361:0x0ace, B:363:0x0b11, B:365:0x0b46, B:367:0x0b4a, B:368:0x0b55, B:370:0x0b98, B:372:0x0ba5, B:374:0x0bb4, B:377:0x0bcd, B:380:0x0be6, B:381:0x0b23, B:382:0x0aa7, B:384:0x0ab3, B:385:0x0ab7, B:386:0x0bfd, B:387:0x0c15, B:390:0x0c1d, B:392:0x0c22, B:395:0x0c32, B:397:0x0c4c, B:398:0x0c67, B:400:0x0c70, B:401:0x0c94, B:407:0x0c81, B:408:0x0a22, B:410:0x0a28, B:412:0x0a30, B:413:0x0a37, B:418:0x0a45, B:419:0x0a4c, B:421:0x0a6b, B:422:0x0a72, B:423:0x0a6f, B:424:0x0a49, B:426:0x0a34, B:428:0x059e, B:430:0x05a4, B:433:0x0ca7), top: B:2:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0b98 A[Catch: all -> 0x0cb9, TRY_LEAVE, TryCatch #3 {all -> 0x0cb9, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x007a, B:17:0x00b0, B:20:0x00c2, B:22:0x00cc, B:25:0x04fa, B:26:0x00f1, B:28:0x00ff, B:31:0x011f, B:33:0x0125, B:35:0x0137, B:37:0x0145, B:39:0x0155, B:41:0x0162, B:46:0x0167, B:49:0x0180, B:55:0x01b5, B:58:0x01bf, B:60:0x01cd, B:63:0x021e, B:64:0x01ed, B:66:0x01ff, B:73:0x022f, B:75:0x025b, B:76:0x0285, B:78:0x02bd, B:79:0x02c3, B:82:0x02cf, B:84:0x0305, B:85:0x0320, B:87:0x0326, B:89:0x0334, B:91:0x0348, B:92:0x033c, B:100:0x034f, B:103:0x0356, B:104:0x036e, B:106:0x0387, B:107:0x0393, B:110:0x039d, B:114:0x03c0, B:115:0x03af, B:124:0x043f, B:126:0x044b, B:129:0x045e, B:131:0x046f, B:133:0x047b, B:135:0x04e6, B:140:0x048f, B:142:0x049d, B:145:0x04b2, B:147:0x04c3, B:149:0x04cf, B:151:0x03c8, B:153:0x03d4, B:155:0x03e0, B:159:0x0425, B:160:0x03fd, B:163:0x040f, B:165:0x0415, B:167:0x041f, B:177:0x0510, B:179:0x051e, B:181:0x0529, B:183:0x055b, B:184:0x0531, B:186:0x053c, B:188:0x0542, B:190:0x054e, B:192:0x0556, B:199:0x055e, B:200:0x056a, B:203:0x0572, B:206:0x0584, B:207:0x0590, B:209:0x0598, B:210:0x05be, B:212:0x05e3, B:214:0x05f4, B:216:0x05fa, B:218:0x0606, B:219:0x0635, B:221:0x063b, B:225:0x0649, B:223:0x064d, B:227:0x0650, B:228:0x0653, B:229:0x0661, B:231:0x0667, B:233:0x0677, B:234:0x067e, B:236:0x068a, B:238:0x0691, B:241:0x0694, B:243:0x06d2, B:244:0x06e5, B:246:0x06eb, B:249:0x0706, B:251:0x0721, B:253:0x0738, B:255:0x073d, B:257:0x0741, B:259:0x0745, B:261:0x074f, B:262:0x0759, B:264:0x075d, B:266:0x0763, B:267:0x0771, B:268:0x077a, B:271:0x09ba, B:272:0x0786, B:337:0x079d, B:275:0x07b7, B:277:0x07dc, B:278:0x07e4, B:280:0x07ea, B:284:0x07fc, B:287:0x0812, B:289:0x0827, B:290:0x084a, B:292:0x0856, B:294:0x086b, B:295:0x08a7, B:298:0x08bf, B:300:0x08c6, B:302:0x08d5, B:304:0x08d9, B:306:0x08dd, B:308:0x08e1, B:309:0x08ed, B:310:0x08f2, B:312:0x08f8, B:314:0x0915, B:315:0x091a, B:316:0x09b7, B:318:0x0930, B:320:0x0935, B:323:0x0958, B:325:0x0984, B:326:0x098f, B:328:0x09a1, B:330:0x09a9, B:331:0x0940, B:340:0x07a3, B:342:0x09c2, B:344:0x09ce, B:345:0x09d4, B:346:0x09dc, B:348:0x09e2, B:350:0x09f9, B:352:0x0a0a, B:353:0x0a7a, B:355:0x0a80, B:357:0x0a98, B:360:0x0a9f, B:361:0x0ace, B:363:0x0b11, B:365:0x0b46, B:367:0x0b4a, B:368:0x0b55, B:370:0x0b98, B:372:0x0ba5, B:374:0x0bb4, B:377:0x0bcd, B:380:0x0be6, B:381:0x0b23, B:382:0x0aa7, B:384:0x0ab3, B:385:0x0ab7, B:386:0x0bfd, B:387:0x0c15, B:390:0x0c1d, B:392:0x0c22, B:395:0x0c32, B:397:0x0c4c, B:398:0x0c67, B:400:0x0c70, B:401:0x0c94, B:407:0x0c81, B:408:0x0a22, B:410:0x0a28, B:412:0x0a30, B:413:0x0a37, B:418:0x0a45, B:419:0x0a4c, B:421:0x0a6b, B:422:0x0a72, B:423:0x0a6f, B:424:0x0a49, B:426:0x0a34, B:428:0x059e, B:430:0x05a4, B:433:0x0ca7), top: B:2:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0bb4 A[Catch: SQLiteException -> 0x0bcc, all -> 0x0cb9, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0bcc, blocks: (B:372:0x0ba5, B:374:0x0bb4), top: B:371:0x0ba5, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzah(String str, long j) {
        int i;
        int i2;
        long j2;
        zzam zzamVar;
        com.google.android.gms.internal.measurement.zzgd zzgdVar;
        long currentTimeMillis;
        long zzk;
        ContentValues contentValues;
        long parseLong;
        long j3;
        long j4;
        int i3;
        SecureRandom secureRandom;
        int i4;
        long j5;
        long zzr;
        int i5;
        String str2;
        boolean z;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        String str3;
        int i6;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        boolean z2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar3;
        String str4;
        int i7;
        String str5 = "_ai";
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        zzamVar2.zzw();
        try {
            zzld zzldVar = new zzld(this, null);
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzU(null, j, this.zzA, zzldVar);
            List list = zzldVar.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgc zzgcVar4 = (com.google.android.gms.internal.measurement.zzgc) zzldVar.zza.zzbB();
                zzgcVar4.zzr();
                com.google.android.gms.internal.measurement.zzfs zzfsVar2 = null;
                com.google.android.gms.internal.measurement.zzfs zzfsVar3 = null;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = -1;
                int i12 = -1;
                while (true) {
                    String str6 = "_et";
                    i = i9;
                    i2 = i10;
                    if (i8 >= zzldVar.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfs zzfsVar4 = (com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzft) zzldVar.zzc.get(i8)).zzbB();
                    zzfv zzfvVar = this.zzc;
                    zzal(zzfvVar);
                    com.google.android.gms.internal.measurement.zzfs zzfsVar5 = zzfsVar2;
                    if (zzfvVar.zzr(zzldVar.zza.zzy(), zzfsVar4.zzo())) {
                        zzaA().zzk().zzc("Dropping blocked raw event. appId", zzeu.zzn(zzldVar.zza.zzy()), this.zzn.zzj().zzd(zzfsVar4.zzo()));
                        zzfv zzfvVar2 = this.zzc;
                        zzal(zzfvVar2);
                        if (!zzfvVar2.zzp(zzldVar.zza.zzy())) {
                            zzfv zzfvVar3 = this.zzc;
                            zzal(zzfvVar3);
                            if (!zzfvVar3.zzs(zzldVar.zza.zzy()) && !"_err".equals(zzfsVar4.zzo())) {
                                zzv().zzO(this.zzF, zzldVar.zza.zzy(), 11, "_ev", zzfsVar4.zzo(), 0);
                            }
                        }
                        str2 = str5;
                        zzgcVar2 = zzgcVar4;
                        zzfsVar2 = zzfsVar5;
                    } else {
                        if (zzfsVar4.zzo().equals(zzhb.zza(str5))) {
                            zzfsVar4.zzi(str5);
                            zzaA().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzaA().zzr(), 5)) {
                                int i13 = 0;
                                while (i13 < zzfsVar4.zza()) {
                                    String str7 = str5;
                                    if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzfsVar4.zzn(i13).zzg()) && !zzfsVar4.zzn(i13).zzh().isEmpty() && AppLovinMediationProvider.ADMOB.equalsIgnoreCase(zzfsVar4.zzn(i13).zzh())) {
                                        zzaA().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i13++;
                                    str5 = str7;
                                }
                            }
                        }
                        str2 = str5;
                        zzfv zzfvVar4 = this.zzc;
                        zzal(zzfvVar4);
                        boolean zzq = zzfvVar4.zzq(zzldVar.zza.zzy(), zzfsVar4.zzo());
                        if (zzq) {
                            z = zzq;
                            zzfsVar = zzfsVar3;
                        } else {
                            zzal(this.zzi);
                            String zzo = zzfsVar4.zzo();
                            Preconditions.checkNotEmpty(zzo);
                            z = zzq;
                            zzfsVar = zzfsVar3;
                            if (zzo.hashCode() != 95027 || !zzo.equals("_ui")) {
                                zzgcVar = zzgcVar4;
                                str3 = "_et";
                                i6 = i11;
                                z = false;
                                if (z) {
                                    ArrayList arrayList = new ArrayList(zzfsVar4.zzp());
                                    int i14 = -1;
                                    int i15 = -1;
                                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                        if ("value".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i16)).zzg())) {
                                            i14 = i16;
                                        } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i16)).zzg())) {
                                            i15 = i16;
                                        }
                                    }
                                    if (i14 != -1) {
                                        if (((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i14)).zzw() || ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i14)).zzu()) {
                                            if (i15 != -1) {
                                                String zzh = ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i15)).zzh();
                                                if (zzh.length() == 3) {
                                                    int i17 = 0;
                                                    while (i17 < zzh.length()) {
                                                        int codePointAt = zzh.codePointAt(i17);
                                                        if (Character.isLetter(codePointAt)) {
                                                            i17 += Character.charCount(codePointAt);
                                                        }
                                                    }
                                                }
                                            }
                                            zzaA().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                            zzfsVar4.zzh(i14);
                                            zzab(zzfsVar4, "_c");
                                            zzaa(zzfsVar4, 19, "currency");
                                            break;
                                        }
                                        zzaA().zzl().zza("Value must be specified with a numeric type.");
                                        zzfsVar4.zzh(i14);
                                        zzab(zzfsVar4, "_c");
                                        zzaa(zzfsVar4, 18, "value");
                                    }
                                    if ("_e".equals(zzfsVar4.zzo())) {
                                        zzal(this.zzi);
                                        if (zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar4.zzaD(), "_fr") == null) {
                                            if (zzfsVar != null && Math.abs(zzfsVar.zzc() - zzfsVar4.zzc()) <= 1000) {
                                                com.google.android.gms.internal.measurement.zzfs zzfsVar6 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar.clone();
                                                if (zzaj(zzfsVar4, zzfsVar6)) {
                                                    zzgcVar2 = zzgcVar;
                                                    zzgcVar2.zzS(i12, zzfsVar6);
                                                    i11 = i6;
                                                    zzfsVar2 = null;
                                                    zzfsVar3 = null;
                                                    zzldVar.zzc.set(i8, (com.google.android.gms.internal.measurement.zzft) zzfsVar4.zzaD());
                                                    zzgcVar2.zzk(zzfsVar4);
                                                    i++;
                                                }
                                            }
                                            zzgcVar2 = zzgcVar;
                                            zzfsVar2 = zzfsVar4;
                                            i11 = i;
                                            zzfsVar3 = zzfsVar;
                                            zzldVar.zzc.set(i8, (com.google.android.gms.internal.measurement.zzft) zzfsVar4.zzaD());
                                            zzgcVar2.zzk(zzfsVar4);
                                            i++;
                                        } else {
                                            zzgcVar2 = zzgcVar;
                                            i11 = i6;
                                            zzfsVar2 = zzfsVar5;
                                            zzfsVar3 = zzfsVar;
                                            zzldVar.zzc.set(i8, (com.google.android.gms.internal.measurement.zzft) zzfsVar4.zzaD());
                                            zzgcVar2.zzk(zzfsVar4);
                                            i++;
                                        }
                                    } else {
                                        zzgcVar2 = zzgcVar;
                                        if ("_vs".equals(zzfsVar4.zzo())) {
                                            zzal(this.zzi);
                                            if (zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar4.zzaD(), str3) == null) {
                                                if (zzfsVar5 != null && Math.abs(zzfsVar5.zzc() - zzfsVar4.zzc()) <= 1000) {
                                                    com.google.android.gms.internal.measurement.zzfs zzfsVar7 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar5.clone();
                                                    if (zzaj(zzfsVar7, zzfsVar4)) {
                                                        int i18 = i6;
                                                        zzgcVar2.zzS(i18, zzfsVar7);
                                                        i11 = i18;
                                                        zzfsVar2 = null;
                                                        zzfsVar3 = null;
                                                        zzldVar.zzc.set(i8, (com.google.android.gms.internal.measurement.zzft) zzfsVar4.zzaD());
                                                        zzgcVar2.zzk(zzfsVar4);
                                                        i++;
                                                    }
                                                }
                                                i11 = i6;
                                                zzfsVar3 = zzfsVar4;
                                                i12 = i;
                                                zzfsVar2 = zzfsVar5;
                                                zzldVar.zzc.set(i8, (com.google.android.gms.internal.measurement.zzft) zzfsVar4.zzaD());
                                                zzgcVar2.zzk(zzfsVar4);
                                                i++;
                                            }
                                        }
                                        i11 = i6;
                                        zzfsVar2 = zzfsVar5;
                                        zzfsVar3 = zzfsVar;
                                        zzldVar.zzc.set(i8, (com.google.android.gms.internal.measurement.zzft) zzfsVar4.zzaD());
                                        zzgcVar2.zzk(zzfsVar4);
                                        i++;
                                    }
                                }
                                if ("_e".equals(zzfsVar4.zzo())) {
                                }
                            }
                        }
                        int i19 = 0;
                        boolean z3 = false;
                        boolean z4 = false;
                        while (true) {
                            z2 = z3;
                            if (i19 >= zzfsVar4.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfsVar4.zzn(i19).zzg())) {
                                com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zzfsVar4.zzn(i19).zzbB();
                                zzgcVar3 = zzgcVar4;
                                str4 = str6;
                                zzfwVar.zzi(1L);
                                zzfsVar4.zzk(i19, (com.google.android.gms.internal.measurement.zzfx) zzfwVar.zzaD());
                                i7 = i11;
                                z4 = true;
                            } else {
                                zzgcVar3 = zzgcVar4;
                                str4 = str6;
                                if ("_r".equals(zzfsVar4.zzn(i19).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zzfsVar4.zzn(i19).zzbB();
                                    i7 = i11;
                                    zzfwVar2.zzi(1L);
                                    zzfsVar4.zzk(i19, (com.google.android.gms.internal.measurement.zzfx) zzfwVar2.zzaD());
                                    z3 = true;
                                    i19++;
                                    i11 = i7;
                                    str6 = str4;
                                    zzgcVar4 = zzgcVar3;
                                } else {
                                    i7 = i11;
                                }
                            }
                            z3 = z2;
                            i19++;
                            i11 = i7;
                            str6 = str4;
                            zzgcVar4 = zzgcVar3;
                        }
                        zzgcVar = zzgcVar4;
                        str3 = str6;
                        int i20 = i11;
                        if (!z4 && z) {
                            zzaA().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfsVar4.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze.zzj("_c");
                            zze.zzi(1L);
                            zzfsVar4.zze(zze);
                        }
                        if (!z2) {
                            zzaA().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfsVar4.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze2.zzj("_r");
                            zze2.zzi(1L);
                            zzfsVar4.zze(zze2);
                        }
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        i6 = i20;
                        if (zzamVar4.zzl(zza(), zzldVar.zza.zzy(), false, false, false, false, true).zze > zzg().zze(zzldVar.zza.zzy(), zzeh.zzo)) {
                            zzab(zzfsVar4, "_r");
                        } else {
                            i2 = 1;
                        }
                        if (zzlo.zzak(zzfsVar4.zzo()) && z) {
                            zzam zzamVar5 = this.zze;
                            zzal(zzamVar5);
                            if (zzamVar5.zzl(zza(), zzldVar.zza.zzy(), false, false, true, false, false).zzc > zzg().zze(zzldVar.zza.zzy(), zzeh.zzn)) {
                                zzaA().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeu.zzn(zzldVar.zza.zzy()));
                                com.google.android.gms.internal.measurement.zzfw zzfwVar3 = null;
                                boolean z5 = false;
                                int i21 = -1;
                                for (int i22 = 0; i22 < zzfsVar4.zza(); i22++) {
                                    com.google.android.gms.internal.measurement.zzfx zzn = zzfsVar4.zzn(i22);
                                    if ("_c".equals(zzn.zzg())) {
                                        zzfwVar3 = (com.google.android.gms.internal.measurement.zzfw) zzn.zzbB();
                                        i21 = i22;
                                    } else if ("_err".equals(zzn.zzg())) {
                                        z5 = true;
                                    }
                                }
                                if (z5) {
                                    if (zzfwVar3 != null) {
                                        zzfsVar4.zzh(i21);
                                    } else {
                                        zzfwVar3 = null;
                                    }
                                }
                                if (zzfwVar3 != null) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar4 = (com.google.android.gms.internal.measurement.zzfw) zzfwVar3.clone();
                                    zzfwVar4.zzj("_err");
                                    zzfwVar4.zzi(10L);
                                    zzfsVar4.zzk(i21, (com.google.android.gms.internal.measurement.zzfx) zzfwVar4.zzaD());
                                } else {
                                    zzaA().zzd().zzb("Did not find conversion parameter. appId", zzeu.zzn(zzldVar.zza.zzy()));
                                }
                            }
                        }
                        if (z) {
                        }
                        if ("_e".equals(zzfsVar4.zzo())) {
                        }
                    }
                    i10 = i2;
                    i8++;
                    zzgcVar4 = zzgcVar2;
                    i9 = i;
                    str5 = str2;
                }
                com.google.android.gms.internal.measurement.zzgc zzgcVar5 = zzgcVar4;
                long j6 = 0;
                long j7 = 0;
                int i23 = i;
                int i24 = 0;
                while (i24 < i23) {
                    com.google.android.gms.internal.measurement.zzft zze3 = zzgcVar5.zze(i24);
                    if ("_e".equals(zze3.zzh())) {
                        zzal(this.zzi);
                        if (zzli.zzB(zze3, "_fr") != null) {
                            zzgcVar5.zzA(i24);
                            i23--;
                            i24--;
                            i24++;
                        }
                    }
                    zzal(this.zzi);
                    com.google.android.gms.internal.measurement.zzfx zzB = zzli.zzB(zze3, "_et");
                    if (zzB != null) {
                        Long valueOf = zzB.zzw() ? Long.valueOf(zzB.zzd()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j7 += valueOf.longValue();
                        }
                    }
                    i24++;
                }
                zzaf(zzgcVar5, j7, false);
                Iterator it = zzgcVar5.zzat().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it.next()).zzh())) {
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzA(zzgcVar5.zzaq(), "_se");
                        break;
                    }
                }
                if (zzli.zza(zzgcVar5, "_sid") >= 0) {
                    zzaf(zzgcVar5, j7, true);
                } else {
                    int zza = zzli.zza(zzgcVar5, "_se");
                    if (zza >= 0) {
                        zzgcVar5.zzB(zza);
                        zzaA().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeu.zzn(zzldVar.zza.zzy()));
                    }
                }
                zzli zzliVar = this.zzi;
                zzal(zzliVar);
                zzliVar.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                zzfv zzfvVar5 = zzliVar.zzf.zzc;
                zzal(zzfvVar5);
                if (zzfvVar5.zzn(zzgcVar5.zzaq())) {
                    zzam zzamVar7 = zzliVar.zzf.zze;
                    zzal(zzamVar7);
                    zzh zzj = zzamVar7.zzj(zzgcVar5.zzaq());
                    if (zzj != null && zzj.zzak() && zzliVar.zzt.zzg().zze()) {
                        zzliVar.zzt.zzaA().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzd.zzf("_npa");
                        zzd.zzg(zzliVar.zzt.zzg().zza());
                        zzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaD();
                        int i25 = 0;
                        while (true) {
                            if (i25 >= zzgcVar5.zzb()) {
                                zzgcVar5.zzm(zzgmVar);
                                break;
                            }
                            if ("_npa".equals(zzgcVar5.zzap(i25).zzf())) {
                                zzgcVar5.zzan(i25, zzgmVar);
                                break;
                            }
                            i25++;
                        }
                    }
                }
                zzgcVar5.zzai(Long.MAX_VALUE);
                zzgcVar5.zzQ(Long.MIN_VALUE);
                for (int i26 = 0; i26 < zzgcVar5.zza(); i26++) {
                    com.google.android.gms.internal.measurement.zzft zze4 = zzgcVar5.zze(i26);
                    if (zze4.zzd() < zzgcVar5.zzd()) {
                        zzgcVar5.zzai(zze4.zzd());
                    }
                    if (zze4.zzd() > zzgcVar5.zzc()) {
                        zzgcVar5.zzQ(zze4.zzd());
                    }
                }
                zzgcVar5.zzz();
                zzgcVar5.zzo();
                zzaa zzaaVar = this.zzh;
                zzal(zzaaVar);
                zzgcVar5.zzf(zzaaVar.zza(zzgcVar5.zzaq(), zzgcVar5.zzat(), zzgcVar5.zzau(), Long.valueOf(zzgcVar5.zzd()), Long.valueOf(zzgcVar5.zzc())));
                if (zzg().zzw(zzldVar.zza.zzy())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom zzG = zzv().zzG();
                    int i27 = 0;
                    while (i27 < zzgcVar5.zza()) {
                        com.google.android.gms.internal.measurement.zzfs zzfsVar8 = (com.google.android.gms.internal.measurement.zzfs) zzgcVar5.zze(i27).zzbB();
                        if (zzfsVar8.zzo().equals("_ep")) {
                            zzal(this.zzi);
                            String str8 = (String) zzli.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD(), "_en");
                            zzas zzasVar = (zzas) hashMap.get(str8);
                            if (zzasVar == null) {
                                zzam zzamVar8 = this.zze;
                                zzal(zzamVar8);
                                zzasVar = zzamVar8.zzn(zzldVar.zza.zzy(), (String) Preconditions.checkNotNull(str8));
                                if (zzasVar != null) {
                                    hashMap.put(str8, zzasVar);
                                }
                            }
                            if (zzasVar != null && zzasVar.zzi == null) {
                                Long l = zzasVar.zzj;
                                if (l != null && l.longValue() > 1) {
                                    zzal(this.zzi);
                                    zzli.zzz(zzfsVar8, "_sr", zzasVar.zzj);
                                }
                                Boolean bool = zzasVar.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzal(this.zzi);
                                    zzli.zzz(zzfsVar8, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                            }
                            zzgcVar5.zzS(i27, zzfsVar8);
                            j3 = j6;
                        } else {
                            zzfv zzfvVar6 = this.zzc;
                            zzal(zzfvVar6);
                            String zzy = zzldVar.zza.zzy();
                            String zza2 = zzfvVar6.zza(zzy, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(zza2)) {
                                try {
                                    parseLong = Long.parseLong(zza2);
                                } catch (NumberFormatException e) {
                                    zzfvVar6.zzt.zzaA().zzk().zzc("Unable to parse timezone offset. appId", zzeu.zzn(zzy), e);
                                }
                                long j8 = j6;
                                long zzr2 = zzv().zzr(zzfsVar8.zzc(), parseLong);
                                com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD();
                                j3 = j8;
                                Long l2 = 1L;
                                if (!TextUtils.isEmpty("_dbg")) {
                                    for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzftVar.zzi()) {
                                        j4 = parseLong;
                                        if (!"_dbg".equals(zzfxVar.zzg())) {
                                            parseLong = j4;
                                        } else if (l2.equals(Long.valueOf(zzfxVar.zzd()))) {
                                            i3 = 1;
                                            if (i3 > 0) {
                                            }
                                        } else {
                                            zzfv zzfvVar7 = this.zzc;
                                            zzal(zzfvVar7);
                                            i3 = zzfvVar7.zzc(zzldVar.zza.zzy(), zzfsVar8.zzo());
                                            if (i3 > 0) {
                                                zzaA().zzk().zzc("Sample rate must be positive. event, rate", zzfsVar8.zzo(), Integer.valueOf(i3));
                                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                                                zzgcVar5.zzS(i27, zzfsVar8);
                                            } else {
                                                zzas zzasVar2 = (zzas) hashMap.get(zzfsVar8.zzo());
                                                if (zzasVar2 == null) {
                                                    zzam zzamVar9 = this.zze;
                                                    zzal(zzamVar9);
                                                    zzasVar2 = zzamVar9.zzn(zzldVar.zza.zzy(), zzfsVar8.zzo());
                                                    if (zzasVar2 == null) {
                                                        zzaA().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzldVar.zza.zzy(), zzfsVar8.zzo());
                                                        zzasVar2 = new zzas(zzldVar.zza.zzy(), zzfsVar8.zzo(), 1L, 1L, 1L, zzfsVar8.zzc(), 0L, null, null, null, null);
                                                    }
                                                }
                                                zzal(this.zzi);
                                                Long l3 = (Long) zzli.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD(), "_eid");
                                                Boolean valueOf2 = Boolean.valueOf(l3 != null);
                                                if (i3 == 1) {
                                                    arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                                                    if (valueOf2.booleanValue() && (zzasVar2.zzi != null || zzasVar2.zzj != null || zzasVar2.zzk != null)) {
                                                        hashMap.put(zzfsVar8.zzo(), zzasVar2.zza(null, null, null));
                                                    }
                                                    zzgcVar5.zzS(i27, zzfsVar8);
                                                } else {
                                                    if (zzG.nextInt(i3) == 0) {
                                                        zzal(this.zzi);
                                                        Long valueOf3 = Long.valueOf(i3);
                                                        zzli.zzz(zzfsVar8, "_sr", valueOf3);
                                                        arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                                                        if (valueOf2.booleanValue()) {
                                                            zzasVar2 = zzasVar2.zza(null, valueOf3, null);
                                                        }
                                                        hashMap.put(zzfsVar8.zzo(), zzasVar2.zzb(zzfsVar8.zzc(), zzr2));
                                                        secureRandom = zzG;
                                                        i5 = i27;
                                                    } else {
                                                        Long l4 = zzasVar2.zzh;
                                                        if (l4 != null) {
                                                            zzr = l4.longValue();
                                                            j5 = zzr2;
                                                            secureRandom = zzG;
                                                            i4 = i27;
                                                        } else {
                                                            secureRandom = zzG;
                                                            i4 = i27;
                                                            j5 = zzr2;
                                                            zzr = zzv().zzr(zzfsVar8.zzb(), j4);
                                                        }
                                                        if (zzr != j5) {
                                                            zzal(this.zzi);
                                                            zzli.zzz(zzfsVar8, "_efs", 1L);
                                                            zzal(this.zzi);
                                                            Long valueOf4 = Long.valueOf(i3);
                                                            zzli.zzz(zzfsVar8, "_sr", valueOf4);
                                                            arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                                                            if (valueOf2.booleanValue()) {
                                                                zzasVar2 = zzasVar2.zza(null, valueOf4, true);
                                                            }
                                                            hashMap.put(zzfsVar8.zzo(), zzasVar2.zzb(zzfsVar8.zzc(), j5));
                                                        } else if (valueOf2.booleanValue()) {
                                                            hashMap.put(zzfsVar8.zzo(), zzasVar2.zza(l3, null, null));
                                                        }
                                                        i5 = i4;
                                                    }
                                                    zzgcVar5.zzS(i5, zzfsVar8);
                                                    i27 = i5 + 1;
                                                    zzG = secureRandom;
                                                    j6 = j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = parseLong;
                                zzfv zzfvVar72 = this.zzc;
                                zzal(zzfvVar72);
                                i3 = zzfvVar72.zzc(zzldVar.zza.zzy(), zzfsVar8.zzo());
                                if (i3 > 0) {
                                }
                            }
                            parseLong = j6;
                            long j82 = j6;
                            long zzr22 = zzv().zzr(zzfsVar8.zzc(), parseLong);
                            com.google.android.gms.internal.measurement.zzft zzftVar2 = (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD();
                            j3 = j82;
                            Long l22 = 1L;
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            j4 = parseLong;
                            zzfv zzfvVar722 = this.zzc;
                            zzal(zzfvVar722);
                            i3 = zzfvVar722.zzc(zzldVar.zza.zzy(), zzfsVar8.zzo());
                            if (i3 > 0) {
                            }
                        }
                        secureRandom = zzG;
                        i5 = i27;
                        i27 = i5 + 1;
                        zzG = secureRandom;
                        j6 = j3;
                    }
                    j2 = j6;
                    if (arrayList2.size() < zzgcVar5.zza()) {
                        zzgcVar5.zzr();
                        zzgcVar5.zzg(arrayList2);
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        zzam zzamVar10 = this.zze;
                        zzal(zzamVar10);
                        zzamVar10.zzE((zzas) entry.getValue());
                    }
                } else {
                    j2 = 0;
                }
                String zzy2 = zzldVar.zza.zzy();
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzh zzj2 = zzamVar11.zzj(zzy2);
                if (zzj2 == null) {
                    zzaA().zzd().zzb("Bundling raw events w/o app info. appId", zzeu.zzn(zzldVar.zza.zzy()));
                } else if (zzgcVar5.zza() > 0) {
                    long zzn2 = zzj2.zzn();
                    if (zzn2 != j2) {
                        zzgcVar5.zzab(zzn2);
                    } else {
                        zzgcVar5.zzv();
                    }
                    long zzp = zzj2.zzp();
                    if (zzp != j2) {
                        zzn2 = zzp;
                    }
                    if (zzn2 != j2) {
                        zzgcVar5.zzac(zzn2);
                    } else {
                        zzgcVar5.zzw();
                    }
                    zzj2.zzF();
                    zzgcVar5.zzI((int) zzj2.zzo());
                    zzj2.zzac(zzgcVar5.zzd());
                    zzj2.zzaa(zzgcVar5.zzc());
                    String zzt = zzj2.zzt();
                    if (zzt != null) {
                        zzgcVar5.zzW(zzt);
                    } else {
                        zzgcVar5.zzs();
                    }
                    zzam zzamVar12 = this.zze;
                    zzal(zzamVar12);
                    zzamVar12.zzD(zzj2);
                }
                if (zzgcVar5.zza() > 0) {
                    this.zzn.zzay();
                    zzfv zzfvVar8 = this.zzc;
                    zzal(zzfvVar8);
                    com.google.android.gms.internal.measurement.zzff zze5 = zzfvVar8.zze(zzldVar.zza.zzy());
                    try {
                        try {
                            if (zze5 != null && zze5.zzu()) {
                                zzgcVar5.zzK(zze5.zzc());
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar5.zzaD();
                                zzamVar.zzg();
                                zzamVar.zzW();
                                Preconditions.checkNotNull(zzgdVar);
                                Preconditions.checkNotEmpty(zzgdVar.zzy());
                                Preconditions.checkState(zzgdVar.zzbg());
                                zzamVar.zzz();
                                currentTimeMillis = zzamVar.zzt.zzax().currentTimeMillis();
                                zzk = zzgdVar.zzk();
                                zzamVar.zzt.zzf();
                                if (zzk >= currentTimeMillis - zzag.zzA()) {
                                    long zzk2 = zzgdVar.zzk();
                                    zzamVar.zzt.zzf();
                                }
                                zzamVar.zzt.zzaA().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeu.zzn(zzgdVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                                byte[] zzbx = zzgdVar.zzbx();
                                zzli zzliVar2 = zzamVar.zzf.zzi;
                                zzal(zzliVar2);
                                byte[] zzy3 = zzliVar2.zzy(zzbx);
                                zzamVar.zzt.zzaA().zzj().zzb("Saving bundle, size", Integer.valueOf(zzy3.length));
                                contentValues = new ContentValues();
                                contentValues.put("app_id", zzgdVar.zzy());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                                contentValues.put("data", zzy3);
                                contentValues.put("has_realtime", Integer.valueOf(i2));
                                if (zzgdVar.zzbm()) {
                                    contentValues.put("retry_count", Integer.valueOf(zzgdVar.zze()));
                                }
                                if (zzamVar.zzh().insert("queue", null, contentValues) == -1) {
                                    zzamVar.zzt.zzaA().zzd().zzb("Failed to insert bundle (got -1). appId", zzeu.zzn(zzgdVar.zzy()));
                                }
                            }
                            if (zzamVar.zzh().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e2) {
                            zzamVar.zzt.zzaA().zzd().zzc("Error storing bundle. appId", zzeu.zzn(zzgdVar.zzy()), e2);
                        }
                        zzli zzliVar22 = zzamVar.zzf.zzi;
                        zzal(zzliVar22);
                        byte[] zzy32 = zzliVar22.zzy(zzbx);
                        zzamVar.zzt.zzaA().zzj().zzb("Saving bundle, size", Integer.valueOf(zzy32.length));
                        contentValues = new ContentValues();
                        contentValues.put("app_id", zzgdVar.zzy());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                        contentValues.put("data", zzy32);
                        contentValues.put("has_realtime", Integer.valueOf(i2));
                        if (zzgdVar.zzbm()) {
                        }
                    } catch (IOException e3) {
                        zzamVar.zzt.zzaA().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzeu.zzn(zzgdVar.zzy()), e3);
                    }
                    if (zzldVar.zza.zzG().isEmpty()) {
                        zzgcVar5.zzK(-1L);
                    } else {
                        zzaA().zzk().zzb("Did not find measurement config or missing version info. appId", zzeu.zzn(zzldVar.zza.zzy()));
                    }
                    zzamVar = this.zze;
                    zzal(zzamVar);
                    zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar5.zzaD();
                    zzamVar.zzg();
                    zzamVar.zzW();
                    Preconditions.checkNotNull(zzgdVar);
                    Preconditions.checkNotEmpty(zzgdVar.zzy());
                    Preconditions.checkState(zzgdVar.zzbg());
                    zzamVar.zzz();
                    currentTimeMillis = zzamVar.zzt.zzax().currentTimeMillis();
                    zzk = zzgdVar.zzk();
                    zzamVar.zzt.zzf();
                    if (zzk >= currentTimeMillis - zzag.zzA()) {
                    }
                    zzamVar.zzt.zzaA().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeu.zzn(zzgdVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                    byte[] zzbx2 = zzgdVar.zzbx();
                }
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                List list2 = zzldVar.zzb;
                Preconditions.checkNotNull(list2);
                zzamVar13.zzg();
                zzamVar13.zzW();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i28 = 0; i28 < list2.size(); i28++) {
                    if (i28 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) list2.get(i28)).longValue());
                }
                sb.append(")");
                int delete = zzamVar13.zzh().delete("raw_events", sb.toString(), null);
                if (delete != list2.size()) {
                    zzamVar13.zzt.zzaA().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list2.size()));
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                try {
                    zzamVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzy2, zzy2});
                } catch (SQLiteException e4) {
                    zzamVar14.zzt.zzaA().zzd().zzc("Failed to remove unused event metadata. appId", zzeu.zzn(zzy2), e4);
                }
                zzam zzamVar15 = this.zze;
                zzal(zzamVar15);
                zzamVar15.zzC();
                zzam zzamVar16 = this.zze;
                zzal(zzamVar16);
                zzamVar16.zzx();
                return true;
            }
            zzam zzamVar17 = this.zze;
            zzal(zzamVar17);
            zzamVar17.zzC();
            zzam zzamVar18 = this.zze;
            zzal(zzamVar18);
            zzamVar18.zzx();
            return false;
        } catch (Throwable th) {
            zzam zzamVar19 = this.zze;
            zzal(zzamVar19);
            zzamVar19.zzx();
            throw th;
        }
    }

    private final boolean zzai() {
        zzaB().zzg();
        zzB();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        if (zzamVar.zzF()) {
            return true;
        }
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        return !TextUtils.isEmpty(zzamVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB = zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_sc");
        String zzh = zzB == null ? null : zzB.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB2 = zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_pc");
        String zzh2 = zzB2 != null ? zzB2.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB3 = zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_et");
        if (zzB3 == null || !zzB3.zzw() || zzB3.zzd() <= 0) {
            return true;
        }
        long zzd = zzB3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzB4 = zzli.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_et");
        if (zzB4 != null && zzB4.zzd() > 0) {
            zzd += zzB4.zzd();
        }
        zzal(this.zzi);
        zzli.zzz(zzfsVar2, "_et", Long.valueOf(zzd));
        zzal(this.zzi);
        zzli.zzz(zzfsVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzkt zzal(zzkt zzktVar) {
        if (zzktVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzktVar.zzY()) {
            return zzktVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(zzktVar.getClass()))));
    }

    public static zzlg zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzlg.class) {
                if (zzb == null) {
                    zzb = new zzlg((zzlh) Preconditions.checkNotNull(new zzlh(context)), null);
                }
            }
        }
        return zzb;
    }

    static /* bridge */ /* synthetic */ void zzy(zzlg zzlgVar, zzlh zzlhVar) {
        zzlgVar.zzaB().zzg();
        zzlgVar.zzm = new zzfm(zzlgVar);
        zzam zzamVar = new zzam(zzlgVar);
        zzamVar.zzX();
        zzlgVar.zze = zzamVar;
        zzlgVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzlgVar.zzc));
        zzka zzkaVar = new zzka(zzlgVar);
        zzkaVar.zzX();
        zzlgVar.zzk = zzkaVar;
        zzaa zzaaVar = new zzaa(zzlgVar);
        zzaaVar.zzX();
        zzlgVar.zzh = zzaaVar;
        zzio zzioVar = new zzio(zzlgVar);
        zzioVar.zzX();
        zzlgVar.zzj = zzioVar;
        zzkr zzkrVar = new zzkr(zzlgVar);
        zzkrVar.zzX();
        zzlgVar.zzg = zzkrVar;
        zzlgVar.zzf = new zzfc(zzlgVar);
        if (zzlgVar.zzr != zzlgVar.zzs) {
            zzlgVar.zzaA().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzlgVar.zzr), Integer.valueOf(zzlgVar.zzs));
        }
        zzlgVar.zzo = true;
    }

    final void zzA() {
        zzaB().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaB().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaA().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i = allocate.getInt();
                    } else if (read != -1) {
                        zzaA().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e) {
                    zzaA().zzd().zzb("Failed to read from channel", e);
                }
            }
            int zzi = this.zzn.zzh().zzi();
            zzaB().zzg();
            if (i > zzi) {
                zzaA().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                return;
            }
            if (i < zzi) {
                FileChannel fileChannel2 = this.zzx;
                zzaB().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaA().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(zzi);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaA().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaA().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                        return;
                    } catch (IOException e2) {
                        zzaA().zzd().zzb("Failed to write to channel", e2);
                    }
                }
                zzaA().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
            }
        }
    }

    final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzC(String str, com.google.android.gms.internal.measurement.zzgc zzgcVar) {
        int zza;
        int indexOf;
        zzfv zzfvVar = this.zzc;
        zzal(zzfvVar);
        Set zzk = zzfvVar.zzk(str);
        if (zzk != null) {
            zzgcVar.zzi(zzk);
        }
        zzfv zzfvVar2 = this.zzc;
        zzal(zzfvVar2);
        if (zzfvVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfv zzfvVar3 = this.zzc;
        zzal(zzfvVar3);
        if (zzfvVar3.zzy(str)) {
            if (zzg().zzs(str, zzeh.zzar)) {
                String zzas = zzgcVar.zzas();
                if (!TextUtils.isEmpty(zzas) && (indexOf = zzas.indexOf(".")) != -1) {
                    zzgcVar.zzY(zzas.substring(0, indexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfv zzfvVar4 = this.zzc;
        zzal(zzfvVar4);
        if (zzfvVar4.zzz(str) && (zza = zzli.zza(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(zza);
        }
        zzfv zzfvVar5 = this.zzc;
        zzal(zzfvVar5);
        if (zzfvVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfv zzfvVar6 = this.zzc;
        zzal(zzfvVar6);
        if (zzfvVar6.zzu(str)) {
            zzgcVar.zzn();
            zzlf zzlfVar = (zzlf) this.zzC.get(str);
            if (zzlfVar == null || zzlfVar.zzb + zzg().zzi(str, zzeh.zzT) < zzax().elapsedRealtime()) {
                zzlfVar = new zzlf(this);
                this.zzC.put(str, zzlfVar);
            }
            zzgcVar.zzR(zzlfVar.zza);
        }
        zzfv zzfvVar7 = this.zzc;
        zzal(zzfvVar7);
        if (zzfvVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    final void zzD(zzh zzhVar) {
        zzaB().zzg();
        if (TextUtils.isEmpty(zzhVar.zzz()) && TextUtils.isEmpty(zzhVar.zzs())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzu()), 204, null, null, null);
            return;
        }
        zzkv zzkvVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String zzz = zzhVar.zzz();
        if (TextUtils.isEmpty(zzz)) {
            zzz = zzhVar.zzs();
        }
        ArrayMap arrayMap = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) zzeh.zze.zza(null)).encodedAuthority((String) zzeh.zzf.zza(null)).path("config/app/".concat(String.valueOf(zzz))).appendQueryParameter("platform", "android");
        zzkvVar.zzt.zzf().zzh();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(77000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzu());
            URL url = new URL(uri);
            zzaA().zzj().zzb("Fetching remote configuration", str);
            zzfv zzfvVar = this.zzc;
            zzal(zzfvVar);
            com.google.android.gms.internal.measurement.zzff zze = zzfvVar.zze(str);
            zzfv zzfvVar2 = this.zzc;
            zzal(zzfvVar2);
            String zzh = zzfvVar2.zzh(str);
            if (zze != null) {
                if (!TextUtils.isEmpty(zzh)) {
                    ArrayMap arrayMap2 = new ArrayMap();
                    arrayMap2.put(HttpHeaders.IF_MODIFIED_SINCE, zzh);
                    arrayMap = arrayMap2;
                }
                zzfv zzfvVar3 = this.zzc;
                zzal(zzfvVar3);
                String zzf = zzfvVar3.zzf(str);
                if (!TextUtils.isEmpty(zzf)) {
                    if (arrayMap == null) {
                        arrayMap = new ArrayMap();
                    }
                    arrayMap.put(HttpHeaders.IF_NONE_MATCH, zzf);
                }
            }
            this.zzt = true;
            zzfa zzfaVar = this.zzd;
            zzal(zzfaVar);
            zzky zzkyVar = new zzky(this);
            zzfaVar.zzg();
            zzfaVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkyVar);
            zzfaVar.zzt.zzaB().zzo(new zzez(zzfaVar, str, url, null, arrayMap, zzkyVar));
        } catch (MalformedURLException unused) {
            zzaA().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeu.zzn(zzhVar.zzu()), uri);
        }
    }

    final void zzE(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> zzt;
        List<zzac> zzt2;
        List<zzac> zzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaB().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j = zzawVar.zzd;
        zzev zzb2 = zzev.zzb(zzawVar);
        zzaB().zzg();
        zziq zziqVar = null;
        if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
            zziqVar = this.zzD;
        }
        boolean z = false;
        zzlo.zzK(zziqVar, zzb2.zzd, false);
        zzaw zza = zzb2.zza();
        zzal(this.zzi);
        if (zzli.zzA(zza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzawVar2 = zza;
            } else if (!list.contains(zza.zza)) {
                zzaA().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zza.zza, zza.zzc);
                return;
            } else {
                Bundle zzc = zza.zzb.zzc();
                zzc.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(zza.zza, new zzau(zzc), zza.zzc, zza.zzd);
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                Preconditions.checkNotEmpty(str2);
                zzamVar2.zzg();
                zzamVar2.zzW();
                char c = 2;
                if (j < 0) {
                    zzamVar2.zzt.zzaA().zzk().zzc("Invalid time querying timed out conditional properties", zzeu.zzn(str2), Long.valueOf(j));
                    zzt = Collections.emptyList();
                } else {
                    zzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzacVar : zzt) {
                    if (zzacVar != null) {
                        boolean z2 = z;
                        zzaA().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzaw zzawVar3 = zzacVar.zzg;
                        if (zzawVar3 != null) {
                            zzY(new zzaw(zzawVar3, j), zzqVar);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zza(str2, zzacVar.zzc.zzb);
                        z = z2;
                    }
                }
                boolean z3 = z;
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                Preconditions.checkNotEmpty(str2);
                zzamVar4.zzg();
                zzamVar4.zzW();
                if (j < 0) {
                    zzamVar4.zzt.zzaA().zzk().zzc("Invalid time querying expired conditional properties", zzeu.zzn(str2), Long.valueOf(j));
                    zzt2 = Collections.emptyList();
                } else {
                    String[] strArr = new String[2];
                    strArr[z3 ? 1 : 0] = str2;
                    strArr[1] = String.valueOf(j);
                    zzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", strArr);
                }
                ArrayList arrayList = new ArrayList(zzt2.size());
                for (zzac zzacVar2 : zzt2) {
                    if (zzacVar2 != null) {
                        char c2 = c;
                        zzaA().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(str2, zzacVar2.zzc.zzb);
                        zzaw zzawVar4 = zzacVar2.zzk;
                        if (zzawVar4 != null) {
                            arrayList.add(zzawVar4);
                        }
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zza(str2, zzacVar2.zzc.zzb);
                        c = c2;
                    }
                }
                char c3 = c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzY(new zzaw((zzaw) it.next(), j), zzqVar);
                }
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                String str3 = zzawVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzamVar7.zzg();
                zzamVar7.zzW();
                if (j < 0) {
                    zzamVar7.zzt.zzaA().zzk().zzd("Invalid time querying triggered conditional properties", zzeu.zzn(str2), zzamVar7.zzt.zzj().zzd(str3), Long.valueOf(j));
                    zzt3 = Collections.emptyList();
                } else {
                    String[] strArr2 = new String[3];
                    strArr2[z3 ? 1 : 0] = str2;
                    strArr2[1] = str3;
                    strArr2[c3] = String.valueOf(j);
                    zzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", strArr2);
                }
                ArrayList arrayList2 = new ArrayList(zzt3.size());
                for (zzac zzacVar3 : zzt3) {
                    if (zzacVar3 != null) {
                        zzlj zzljVar = zzacVar3.zzc;
                        zzll zzllVar = new zzll((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzljVar.zzb, j, Preconditions.checkNotNull(zzljVar.zza()));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        if (zzamVar8.zzL(zzllVar)) {
                            zzaA().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                        } else {
                            zzaA().zzd().zzd("Too many active user properties, ignoring", zzeu.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                        }
                        zzaw zzawVar5 = zzacVar3.zzi;
                        if (zzawVar5 != null) {
                            arrayList2.add(zzawVar5);
                        }
                        zzacVar3.zzc = new zzlj(zzllVar);
                        zzacVar3.zze = true;
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzawVar2, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzY(new zzaw((zzaw) it2.next(), j), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    final void zzF(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzx())) {
            zzaA().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean zzad = zzad(zzj);
        if (zzad == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                zzaA().zzk().zzb("Could not find package. appId", zzeu.zzn(str));
            }
        } else if (!zzad.booleanValue()) {
            zzaA().zzd().zzb("App version does not match; dropping event. appId", zzeu.zzn(str));
            return;
        }
        String zzz = zzj.zzz();
        String zzx = zzj.zzx();
        long zzb2 = zzj.zzb();
        String zzw = zzj.zzw();
        long zzm = zzj.zzm();
        long zzj2 = zzj.zzj();
        boolean zzal = zzj.zzal();
        String zzy = zzj.zzy();
        zzj.zza();
        zzG(zzawVar, new zzq(str, zzz, zzx, zzb2, zzw, zzm, zzj2, (String) null, zzal, false, zzy, 0L, 0L, 0, zzj.zzak(), false, zzj.zzs(), zzj.zzr(), zzj.zzk(), zzj.zzD(), (String) null, zzh(str).zzh(), "", (String) null, zzj.zzan(), zzj.zzq()));
    }

    final void zzG(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzev zzb2 = zzev.zzb(zzawVar);
        zzlo zzv = zzv();
        Bundle bundle = zzb2.zzd;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzN(zzb2, zzg().zzd(zzqVar.zza));
        zzaw zza = zzb2.zza();
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zza.zza) && "referrer API v2".equals(zza.zzb.zzg("_cis"))) {
            String zzg = zza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg)) {
                zzW(new zzlj("_lgclid", zza.zzd, zzg, "auto"), zzqVar);
            }
        }
        zzE(zza, zzqVar);
    }

    final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:5:0x002c, B:13:0x0049, B:14:0x0160, B:24:0x0063, B:28:0x00b5, B:29:0x00a6, B:32:0x00bd, B:34:0x00c9, B:36:0x00cf, B:38:0x00d9, B:40:0x00e5, B:42:0x00eb, B:46:0x00f8, B:47:0x0114, B:49:0x0129, B:50:0x0148, B:52:0x0153, B:54:0x0159, B:55:0x015d, B:56:0x0137, B:57:0x0101, B:59:0x010c), top: B:4:0x002c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:5:0x002c, B:13:0x0049, B:14:0x0160, B:24:0x0063, B:28:0x00b5, B:29:0x00a6, B:32:0x00bd, B:34:0x00c9, B:36:0x00cf, B:38:0x00d9, B:40:0x00e5, B:42:0x00eb, B:46:0x00f8, B:47:0x0114, B:49:0x0129, B:50:0x0148, B:52:0x0153, B:54:0x0159, B:55:0x015d, B:56:0x0137, B:57:0x0101, B:59:0x010c), top: B:4:0x002c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:5:0x002c, B:13:0x0049, B:14:0x0160, B:24:0x0063, B:28:0x00b5, B:29:0x00a6, B:32:0x00bd, B:34:0x00c9, B:36:0x00cf, B:38:0x00d9, B:40:0x00e5, B:42:0x00eb, B:46:0x00f8, B:47:0x0114, B:49:0x0129, B:50:0x0148, B:52:0x0153, B:54:0x0159, B:55:0x015d, B:56:0x0137, B:57:0x0101, B:59:0x010c), top: B:4:0x002c, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzI(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        zzfa zzfaVar;
        zzaB().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzt = false;
                zzae();
            }
        }
        zzes zzj = zzaA().zzj();
        Integer valueOf = Integer.valueOf(bArr.length);
        zzj.zzb("onConfigFetched. Response size", valueOf);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzh zzj2 = zzamVar2.zzj(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (zzj2 == null) {
                    zzaA().zzk().zzb("App does not exist in onConfigFetched. appId", zzeu.zzn(str));
                } else {
                    if (!z && i != 404) {
                        zzj2.zzV(zzax().currentTimeMillis());
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zzD(zzj2);
                        zzaA().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                        zzfv zzfvVar = this.zzc;
                        zzal(zzfvVar);
                        zzfvVar.zzl(str);
                        this.zzk.zzd.zzb(zzax().currentTimeMillis());
                        if (i == 503 || i == 429) {
                            this.zzk.zzb.zzb(zzax().currentTimeMillis());
                        }
                        zzag();
                    }
                    List list = map != null ? (List) map.get(HttpHeaders.LAST_MODIFIED) : null;
                    String str2 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                    List list2 = map != null ? (List) map.get(HttpHeaders.ETAG) : null;
                    String str3 = (list2 == null || list2.isEmpty()) ? null : (String) list2.get(0);
                    if (i != 404 && i != 304) {
                        zzfv zzfvVar2 = this.zzc;
                        zzal(zzfvVar2);
                        zzfvVar2.zzt(str, bArr, str2, str3);
                        zzj2.zzM(zzax().currentTimeMillis());
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzD(zzj2);
                        if (i != 404) {
                            zzaA().zzl().zzb("Config not found. Using empty config. appId", str);
                        } else {
                            zzaA().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                        }
                        zzfaVar = this.zzd;
                        zzal(zzfaVar);
                        if (zzfaVar.zza() || !zzai()) {
                            zzag();
                        } else {
                            zzX();
                        }
                    }
                    zzfv zzfvVar3 = this.zzc;
                    zzal(zzfvVar3);
                    if (zzfvVar3.zze(str) == null) {
                        zzfv zzfvVar4 = this.zzc;
                        zzal(zzfvVar4);
                        zzfvVar4.zzt(str, null, null, null);
                    }
                    zzj2.zzM(zzax().currentTimeMillis());
                    zzam zzamVar42 = this.zze;
                    zzal(zzamVar42);
                    zzamVar42.zzD(zzj2);
                    if (i != 404) {
                    }
                    zzfaVar = this.zzd;
                    zzal(zzfaVar);
                    if (zzfaVar.zza()) {
                    }
                    zzag();
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            }
            if (th == null) {
                z = true;
                if (zzj2 == null) {
                }
                zzam zzamVar52 = this.zze;
                zzal(zzamVar52);
                zzamVar52.zzC();
            }
            z = false;
            if (zzj2 == null) {
            }
            zzam zzamVar522 = this.zze;
            zzal(zzamVar522);
            zzamVar522.zzC();
        } finally {
            zzam zzamVar6 = this.zze;
            zzal(zzamVar6);
            zzamVar6.zzx();
        }
    }

    final void zzJ(boolean z) {
        zzag();
    }

    final void zzK(int i, Throwable th, byte[] bArr, String str) {
        zzam zzamVar;
        long longValue;
        zzaB().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzae();
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzax().currentTimeMillis());
            if (i != 503 || i == 429) {
                this.zzk.zzb.zzb(zzax().currentTimeMillis());
            }
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzy(list);
            zzag();
        }
        if (th == null) {
            try {
                this.zzk.zzc.zzb(zzax().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzw();
            } catch (SQLiteException e) {
                zzaA().zzd().zzb("Database error while trying to delete uploaded bundles", e);
                this.zza = zzax().elapsedRealtime();
                zzaA().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            try {
                for (Long l : list) {
                    try {
                        zzamVar = this.zze;
                        zzal(zzamVar);
                        longValue = l.longValue();
                        zzamVar.zzg();
                        zzamVar.zzW();
                    } catch (SQLiteException e2) {
                        List list2 = this.zzz;
                        if (list2 == null || !list2.contains(l)) {
                            throw e2;
                        }
                    }
                    try {
                        if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    } catch (SQLiteException e3) {
                        zzamVar.zzt.zzaA().zzd().zzb("Failed to delete a bundle in a queue table", e3);
                        throw e3;
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
                this.zzz = null;
                zzfa zzfaVar = this.zzd;
                zzal(zzfaVar);
                if (zzfaVar.zza() && zzai()) {
                    zzX();
                } else {
                    this.zzA = -1L;
                    zzag();
                }
                this.zza = 0L;
            } catch (Throwable th2) {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
                throw th2;
            }
        }
        zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.zzk.zzd.zzb(zzax().currentTimeMillis());
        if (i != 503) {
        }
        this.zzk.zzb.zzb(zzax().currentTimeMillis());
        zzam zzamVar22 = this.zze;
        zzal(zzamVar22);
        zzamVar22.zzy(list);
        zzag();
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x052b A[Catch: all -> 0x055a, TryCatch #3 {all -> 0x055a, blocks: (B:24:0x00a8, B:26:0x00b5, B:28:0x00f6, B:30:0x0109, B:32:0x0121, B:34:0x0148, B:37:0x01a3, B:39:0x01a9, B:41:0x01b2, B:45:0x01e6, B:47:0x01f1, B:50:0x01ff, B:53:0x020d, B:56:0x0219, B:58:0x021c, B:61:0x023d, B:63:0x0242, B:65:0x0262, B:69:0x0277, B:71:0x029f, B:74:0x02a7, B:76:0x02b6, B:77:0x03a0, B:79:0x03cc, B:80:0x03cf, B:82:0x03f8, B:86:0x04ca, B:87:0x04cd, B:88:0x0549, B:93:0x040d, B:95:0x0432, B:97:0x043a, B:99:0x0444, B:103:0x0457, B:104:0x046c, B:107:0x0478, B:110:0x0487, B:112:0x04ab, B:114:0x04b3, B:115:0x04bb, B:117:0x04c1, B:121:0x0498, B:124:0x0463, B:129:0x041e, B:130:0x02c7, B:132:0x02f2, B:133:0x0303, B:135:0x030b, B:137:0x0311, B:139:0x031b, B:141:0x0325, B:143:0x032b, B:145:0x0331, B:147:0x0336, B:150:0x0358, B:154:0x035d, B:155:0x0371, B:156:0x0381, B:157:0x0391, B:158:0x04e3, B:160:0x0512, B:161:0x0515, B:162:0x052b, B:164:0x052f, B:165:0x0252, B:167:0x01cb, B:173:0x00bf, B:175:0x00c3, B:178:0x00d4, B:180:0x00e3, B:182:0x00ed, B:185:0x00f3), top: B:23:0x00a8, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0252 A[Catch: all -> 0x055a, TryCatch #3 {all -> 0x055a, blocks: (B:24:0x00a8, B:26:0x00b5, B:28:0x00f6, B:30:0x0109, B:32:0x0121, B:34:0x0148, B:37:0x01a3, B:39:0x01a9, B:41:0x01b2, B:45:0x01e6, B:47:0x01f1, B:50:0x01ff, B:53:0x020d, B:56:0x0219, B:58:0x021c, B:61:0x023d, B:63:0x0242, B:65:0x0262, B:69:0x0277, B:71:0x029f, B:74:0x02a7, B:76:0x02b6, B:77:0x03a0, B:79:0x03cc, B:80:0x03cf, B:82:0x03f8, B:86:0x04ca, B:87:0x04cd, B:88:0x0549, B:93:0x040d, B:95:0x0432, B:97:0x043a, B:99:0x0444, B:103:0x0457, B:104:0x046c, B:107:0x0478, B:110:0x0487, B:112:0x04ab, B:114:0x04b3, B:115:0x04bb, B:117:0x04c1, B:121:0x0498, B:124:0x0463, B:129:0x041e, B:130:0x02c7, B:132:0x02f2, B:133:0x0303, B:135:0x030b, B:137:0x0311, B:139:0x031b, B:141:0x0325, B:143:0x032b, B:145:0x0331, B:147:0x0336, B:150:0x0358, B:154:0x035d, B:155:0x0371, B:156:0x0381, B:157:0x0391, B:158:0x04e3, B:160:0x0512, B:161:0x0515, B:162:0x052b, B:164:0x052f, B:165:0x0252, B:167:0x01cb, B:173:0x00bf, B:175:0x00c3, B:178:0x00d4, B:180:0x00e3, B:182:0x00ed, B:185:0x00f3), top: B:23:0x00a8, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e6 A[Catch: all -> 0x055a, TryCatch #3 {all -> 0x055a, blocks: (B:24:0x00a8, B:26:0x00b5, B:28:0x00f6, B:30:0x0109, B:32:0x0121, B:34:0x0148, B:37:0x01a3, B:39:0x01a9, B:41:0x01b2, B:45:0x01e6, B:47:0x01f1, B:50:0x01ff, B:53:0x020d, B:56:0x0219, B:58:0x021c, B:61:0x023d, B:63:0x0242, B:65:0x0262, B:69:0x0277, B:71:0x029f, B:74:0x02a7, B:76:0x02b6, B:77:0x03a0, B:79:0x03cc, B:80:0x03cf, B:82:0x03f8, B:86:0x04ca, B:87:0x04cd, B:88:0x0549, B:93:0x040d, B:95:0x0432, B:97:0x043a, B:99:0x0444, B:103:0x0457, B:104:0x046c, B:107:0x0478, B:110:0x0487, B:112:0x04ab, B:114:0x04b3, B:115:0x04bb, B:117:0x04c1, B:121:0x0498, B:124:0x0463, B:129:0x041e, B:130:0x02c7, B:132:0x02f2, B:133:0x0303, B:135:0x030b, B:137:0x0311, B:139:0x031b, B:141:0x0325, B:143:0x032b, B:145:0x0331, B:147:0x0336, B:150:0x0358, B:154:0x035d, B:155:0x0371, B:156:0x0381, B:157:0x0391, B:158:0x04e3, B:160:0x0512, B:161:0x0515, B:162:0x052b, B:164:0x052f, B:165:0x0252, B:167:0x01cb, B:173:0x00bf, B:175:0x00c3, B:178:0x00d4, B:180:0x00e3, B:182:0x00ed, B:185:0x00f3), top: B:23:0x00a8, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0242 A[Catch: all -> 0x055a, TryCatch #3 {all -> 0x055a, blocks: (B:24:0x00a8, B:26:0x00b5, B:28:0x00f6, B:30:0x0109, B:32:0x0121, B:34:0x0148, B:37:0x01a3, B:39:0x01a9, B:41:0x01b2, B:45:0x01e6, B:47:0x01f1, B:50:0x01ff, B:53:0x020d, B:56:0x0219, B:58:0x021c, B:61:0x023d, B:63:0x0242, B:65:0x0262, B:69:0x0277, B:71:0x029f, B:74:0x02a7, B:76:0x02b6, B:77:0x03a0, B:79:0x03cc, B:80:0x03cf, B:82:0x03f8, B:86:0x04ca, B:87:0x04cd, B:88:0x0549, B:93:0x040d, B:95:0x0432, B:97:0x043a, B:99:0x0444, B:103:0x0457, B:104:0x046c, B:107:0x0478, B:110:0x0487, B:112:0x04ab, B:114:0x04b3, B:115:0x04bb, B:117:0x04c1, B:121:0x0498, B:124:0x0463, B:129:0x041e, B:130:0x02c7, B:132:0x02f2, B:133:0x0303, B:135:0x030b, B:137:0x0311, B:139:0x031b, B:141:0x0325, B:143:0x032b, B:145:0x0331, B:147:0x0336, B:150:0x0358, B:154:0x035d, B:155:0x0371, B:156:0x0381, B:157:0x0391, B:158:0x04e3, B:160:0x0512, B:161:0x0515, B:162:0x052b, B:164:0x052f, B:165:0x0252, B:167:0x01cb, B:173:0x00bf, B:175:0x00c3, B:178:0x00d4, B:180:0x00e3, B:182:0x00ed, B:185:0x00f3), top: B:23:0x00a8, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0262 A[Catch: all -> 0x055a, TRY_LEAVE, TryCatch #3 {all -> 0x055a, blocks: (B:24:0x00a8, B:26:0x00b5, B:28:0x00f6, B:30:0x0109, B:32:0x0121, B:34:0x0148, B:37:0x01a3, B:39:0x01a9, B:41:0x01b2, B:45:0x01e6, B:47:0x01f1, B:50:0x01ff, B:53:0x020d, B:56:0x0219, B:58:0x021c, B:61:0x023d, B:63:0x0242, B:65:0x0262, B:69:0x0277, B:71:0x029f, B:74:0x02a7, B:76:0x02b6, B:77:0x03a0, B:79:0x03cc, B:80:0x03cf, B:82:0x03f8, B:86:0x04ca, B:87:0x04cd, B:88:0x0549, B:93:0x040d, B:95:0x0432, B:97:0x043a, B:99:0x0444, B:103:0x0457, B:104:0x046c, B:107:0x0478, B:110:0x0487, B:112:0x04ab, B:114:0x04b3, B:115:0x04bb, B:117:0x04c1, B:121:0x0498, B:124:0x0463, B:129:0x041e, B:130:0x02c7, B:132:0x02f2, B:133:0x0303, B:135:0x030b, B:137:0x0311, B:139:0x031b, B:141:0x0325, B:143:0x032b, B:145:0x0331, B:147:0x0336, B:150:0x0358, B:154:0x035d, B:155:0x0371, B:156:0x0381, B:157:0x0391, B:158:0x04e3, B:160:0x0512, B:161:0x0515, B:162:0x052b, B:164:0x052f, B:165:0x0252, B:167:0x01cb, B:173:0x00bf, B:175:0x00c3, B:178:0x00d4, B:180:0x00e3, B:182:0x00ed, B:185:0x00f3), top: B:23:0x00a8, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03cc A[Catch: all -> 0x055a, TryCatch #3 {all -> 0x055a, blocks: (B:24:0x00a8, B:26:0x00b5, B:28:0x00f6, B:30:0x0109, B:32:0x0121, B:34:0x0148, B:37:0x01a3, B:39:0x01a9, B:41:0x01b2, B:45:0x01e6, B:47:0x01f1, B:50:0x01ff, B:53:0x020d, B:56:0x0219, B:58:0x021c, B:61:0x023d, B:63:0x0242, B:65:0x0262, B:69:0x0277, B:71:0x029f, B:74:0x02a7, B:76:0x02b6, B:77:0x03a0, B:79:0x03cc, B:80:0x03cf, B:82:0x03f8, B:86:0x04ca, B:87:0x04cd, B:88:0x0549, B:93:0x040d, B:95:0x0432, B:97:0x043a, B:99:0x0444, B:103:0x0457, B:104:0x046c, B:107:0x0478, B:110:0x0487, B:112:0x04ab, B:114:0x04b3, B:115:0x04bb, B:117:0x04c1, B:121:0x0498, B:124:0x0463, B:129:0x041e, B:130:0x02c7, B:132:0x02f2, B:133:0x0303, B:135:0x030b, B:137:0x0311, B:139:0x031b, B:141:0x0325, B:143:0x032b, B:145:0x0331, B:147:0x0336, B:150:0x0358, B:154:0x035d, B:155:0x0371, B:156:0x0381, B:157:0x0391, B:158:0x04e3, B:160:0x0512, B:161:0x0515, B:162:0x052b, B:164:0x052f, B:165:0x0252, B:167:0x01cb, B:173:0x00bf, B:175:0x00c3, B:178:0x00d4, B:180:0x00e3, B:182:0x00ed, B:185:0x00f3), top: B:23:0x00a8, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03f8 A[Catch: all -> 0x055a, TRY_LEAVE, TryCatch #3 {all -> 0x055a, blocks: (B:24:0x00a8, B:26:0x00b5, B:28:0x00f6, B:30:0x0109, B:32:0x0121, B:34:0x0148, B:37:0x01a3, B:39:0x01a9, B:41:0x01b2, B:45:0x01e6, B:47:0x01f1, B:50:0x01ff, B:53:0x020d, B:56:0x0219, B:58:0x021c, B:61:0x023d, B:63:0x0242, B:65:0x0262, B:69:0x0277, B:71:0x029f, B:74:0x02a7, B:76:0x02b6, B:77:0x03a0, B:79:0x03cc, B:80:0x03cf, B:82:0x03f8, B:86:0x04ca, B:87:0x04cd, B:88:0x0549, B:93:0x040d, B:95:0x0432, B:97:0x043a, B:99:0x0444, B:103:0x0457, B:104:0x046c, B:107:0x0478, B:110:0x0487, B:112:0x04ab, B:114:0x04b3, B:115:0x04bb, B:117:0x04c1, B:121:0x0498, B:124:0x0463, B:129:0x041e, B:130:0x02c7, B:132:0x02f2, B:133:0x0303, B:135:0x030b, B:137:0x0311, B:139:0x031b, B:141:0x0325, B:143:0x032b, B:145:0x0331, B:147:0x0336, B:150:0x0358, B:154:0x035d, B:155:0x0371, B:156:0x0381, B:157:0x0391, B:158:0x04e3, B:160:0x0512, B:161:0x0515, B:162:0x052b, B:164:0x052f, B:165:0x0252, B:167:0x01cb, B:173:0x00bf, B:175:0x00c3, B:178:0x00d4, B:180:0x00e3, B:182:0x00ed, B:185:0x00f3), top: B:23:0x00a8, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04ca A[Catch: all -> 0x055a, TryCatch #3 {all -> 0x055a, blocks: (B:24:0x00a8, B:26:0x00b5, B:28:0x00f6, B:30:0x0109, B:32:0x0121, B:34:0x0148, B:37:0x01a3, B:39:0x01a9, B:41:0x01b2, B:45:0x01e6, B:47:0x01f1, B:50:0x01ff, B:53:0x020d, B:56:0x0219, B:58:0x021c, B:61:0x023d, B:63:0x0242, B:65:0x0262, B:69:0x0277, B:71:0x029f, B:74:0x02a7, B:76:0x02b6, B:77:0x03a0, B:79:0x03cc, B:80:0x03cf, B:82:0x03f8, B:86:0x04ca, B:87:0x04cd, B:88:0x0549, B:93:0x040d, B:95:0x0432, B:97:0x043a, B:99:0x0444, B:103:0x0457, B:104:0x046c, B:107:0x0478, B:110:0x0487, B:112:0x04ab, B:114:0x04b3, B:115:0x04bb, B:117:0x04c1, B:121:0x0498, B:124:0x0463, B:129:0x041e, B:130:0x02c7, B:132:0x02f2, B:133:0x0303, B:135:0x030b, B:137:0x0311, B:139:0x031b, B:141:0x0325, B:143:0x032b, B:145:0x0331, B:147:0x0336, B:150:0x0358, B:154:0x035d, B:155:0x0371, B:156:0x0381, B:157:0x0391, B:158:0x04e3, B:160:0x0512, B:161:0x0515, B:162:0x052b, B:164:0x052f, B:165:0x0252, B:167:0x01cb, B:173:0x00bf, B:175:0x00c3, B:178:0x00d4, B:180:0x00e3, B:182:0x00ed, B:185:0x00f3), top: B:23:0x00a8, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x040d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzL(zzq zzqVar) {
        int i;
        int i2;
        zzas zzn;
        int i3;
        long zzc;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        long j;
        long j2;
        boolean z;
        SQLiteDatabase zzh;
        String[] strArr;
        int delete;
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzak(zzqVar)) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzh zzj = zzamVar.zzj(zzqVar.zza);
            if (zzj != null && TextUtils.isEmpty(zzj.zzz()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzj.zzM(0L);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzamVar2.zzD(zzj);
                zzfv zzfvVar = this.zzc;
                zzal(zzfvVar);
                zzfvVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long j3 = zzqVar.zzm;
            if (j3 == 0) {
                j3 = zzax().currentTimeMillis();
            }
            long j4 = j3;
            this.zzn.zzg().zzd();
            int i4 = zzqVar.zzn;
            if (i4 != 0 && i4 != 1) {
                zzaA().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeu.zzn(zzqVar.zza), Integer.valueOf(i4));
                i4 = 0;
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzll zzp = zzamVar4.zzp(zzqVar.zza, "_npa");
                if (zzp == null || "auto".equals(zzp.zzb)) {
                    if (zzqVar.zzr != null) {
                        zzlj zzljVar = new zzlj("_npa", j4, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto");
                        if (zzp == null || !zzp.zze.equals(zzljVar.zzd)) {
                            zzW(zzljVar, zzqVar);
                        }
                    } else if (zzp != null) {
                        zzP("_npa", zzqVar);
                    }
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzh zzj2 = zzamVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzj2 != null) {
                    i = 0;
                    if (zzv().zzao(zzqVar.zzb, zzj2.zzz(), zzqVar.zzq, zzj2.zzs())) {
                        zzaA().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeu.zzn(zzj2.zzu()));
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        String zzu = zzj2.zzu();
                        zzamVar6.zzW();
                        zzamVar6.zzg();
                        Preconditions.checkNotEmpty(zzu);
                        try {
                            zzh = zzamVar6.zzh();
                            strArr = new String[]{zzu};
                            delete = zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("apps", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("event_filters", "app_id=?", strArr) + zzh.delete("property_filters", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("consent_settings", "app_id=?", strArr);
                            zzph.zzc();
                            i2 = i4;
                        } catch (SQLiteException e) {
                            e = e;
                            i2 = i4;
                        }
                        try {
                            if (zzamVar6.zzt.zzf().zzs(null, zzeh.zzat)) {
                                delete += zzh.delete("default_event_params", "app_id=?", strArr);
                            }
                            if (delete > 0) {
                                zzamVar6.zzt.zzaA().zzj().zzc("Deleted application data. app, records", zzu, Integer.valueOf(delete));
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            zzamVar6.zzt.zzaA().zzd().zzc("Error deleting application data. appId, error", zzeu.zzn(zzu), e);
                            zzj2 = null;
                            if (zzj2 != null) {
                            }
                            zzd(zzqVar);
                            if (i2 == 0) {
                            }
                            if (zzn == null) {
                            }
                            zzam zzamVar7 = this.zze;
                            zzal(zzamVar7);
                            zzamVar7.zzC();
                        }
                        zzj2 = null;
                        if (zzj2 != null) {
                            int i5 = (zzj2.zzb() == -2147483648L || zzj2.zzb() == zzqVar.zzj) ? i : 1;
                            String zzx = zzj2.zzx();
                            if ((((zzj2.zzb() != -2147483648L || zzx == null || zzx.equals(zzqVar.zzc)) ? i : 1) | i5) != 0) {
                                Bundle bundle = new Bundle();
                                bundle.putString("_pv", zzx);
                                zzaw zzawVar = new zzaw("_au", new zzau(bundle), "auto", j4);
                                j4 = j4;
                                zzE(zzawVar, zzqVar);
                            }
                        }
                        zzd(zzqVar);
                        if (i2 == 0) {
                            zzam zzamVar8 = this.zze;
                            zzal(zzamVar8);
                            zzn = zzamVar8.zzn(zzqVar.zza, "_f");
                            i3 = i;
                        } else {
                            zzam zzamVar9 = this.zze;
                            zzal(zzamVar9);
                            zzn = zzamVar9.zzn(zzqVar.zza, "_v");
                            i3 = 1;
                        }
                        if (zzn == null) {
                            long j5 = ((j4 / 3600000) + 1) * 3600000;
                            if (i3 == 0) {
                                zzW(new zzlj("_fot", j4, Long.valueOf(j5), "auto"), zzqVar);
                                zzaB().zzg();
                                zzfm zzfmVar = (zzfm) Preconditions.checkNotNull(this.zzm);
                                String str = zzqVar.zza;
                                if (str != null && !str.isEmpty()) {
                                    zzfmVar.zza.zzaB().zzg();
                                    if (zzfmVar.zza()) {
                                        zzfl zzflVar = new zzfl(zzfmVar, str);
                                        zzfmVar.zza.zzaB().zzg();
                                        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                        PackageManager packageManager = zzfmVar.zza.zzaw().getPackageManager();
                                        if (packageManager == null) {
                                            zzfmVar.zza.zzaA().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                        } else {
                                            int i6 = i;
                                            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, i6);
                                            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                zzfmVar.zza.zzaA().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                            } else {
                                                ResolveInfo resolveInfo = queryIntentServices.get(i6);
                                                if (resolveInfo.serviceInfo != null) {
                                                    String str2 = resolveInfo.serviceInfo.packageName;
                                                    if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str2) && zzfmVar.zza()) {
                                                        try {
                                                            zzfmVar.zza.zzaA().zzj().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzfmVar.zza.zzaw(), new Intent(intent), zzflVar, 1) ? "available" : "not available");
                                                        } catch (RuntimeException e3) {
                                                            zzfmVar.zza.zzaA().zzd().zzb("Exception occurred while binding to Install Referrer Service", e3.getMessage());
                                                        }
                                                    } else {
                                                        zzfmVar.zza.zzaA().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        zzfmVar.zza.zzaA().zzi().zza("Install Referrer Reporter is not available");
                                    }
                                    zzaB().zzg();
                                    zzB();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("_c", 1L);
                                    bundle2.putLong("_r", 1L);
                                    bundle2.putLong("_uwa", 0L);
                                    bundle2.putLong("_pfo", 0L);
                                    bundle2.putLong("_sys", 0L);
                                    bundle2.putLong("_sysu", 0L);
                                    bundle2.putLong("_et", 1L);
                                    if (zzqVar.zzp) {
                                        bundle2.putLong("_dac", 1L);
                                    }
                                    String str3 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                    zzam zzamVar10 = this.zze;
                                    zzal(zzamVar10);
                                    Preconditions.checkNotEmpty(str3);
                                    zzamVar10.zzg();
                                    zzamVar10.zzW();
                                    zzc = zzamVar10.zzc(str3, "first_open_count");
                                    if (this.zzn.zzaw().getPackageManager() != null) {
                                        zzaA().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeu.zzn(str3));
                                    } else {
                                        try {
                                            packageInfo = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(str3, 0);
                                        } catch (PackageManager.NameNotFoundException e4) {
                                            zzaA().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeu.zzn(str3), e4);
                                            packageInfo = null;
                                        }
                                        if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                            applicationInfo = null;
                                        } else {
                                            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                                applicationInfo = null;
                                                if (!zzg().zzs(null, zzeh.zzad)) {
                                                    bundle2.putLong("_uwa", 1L);
                                                } else if (zzc == 0) {
                                                    bundle2.putLong("_uwa", 1L);
                                                    z = false;
                                                    j2 = 0;
                                                }
                                                j2 = zzc;
                                                z = false;
                                            } else {
                                                applicationInfo = null;
                                                j2 = zzc;
                                                z = true;
                                            }
                                            zzW(new zzlj("_fi", j4, Long.valueOf(true != z ? 0L : 1L), "auto"), zzqVar);
                                            zzc = j2;
                                        }
                                        try {
                                            applicationInfo = Wrappers.packageManager(this.zzn.zzaw()).getApplicationInfo(str3, 0);
                                        } catch (PackageManager.NameNotFoundException e5) {
                                            zzaA().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeu.zzn(str3), e5);
                                        }
                                        if (applicationInfo != null) {
                                            if ((applicationInfo.flags & 1) != 0) {
                                                j = 1;
                                                bundle2.putLong("_sys", 1L);
                                            } else {
                                                j = 1;
                                            }
                                            if ((applicationInfo.flags & 128) != 0) {
                                                bundle2.putLong("_sysu", j);
                                            }
                                        }
                                    }
                                    if (zzc >= 0) {
                                        bundle2.putLong("_pfo", zzc);
                                    }
                                    zzG(new zzaw("_f", new zzau(bundle2), "auto", j4), zzqVar);
                                }
                                zzfmVar.zza.zzaA().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                                zzaB().zzg();
                                zzB();
                                Bundle bundle22 = new Bundle();
                                bundle22.putLong("_c", 1L);
                                bundle22.putLong("_r", 1L);
                                bundle22.putLong("_uwa", 0L);
                                bundle22.putLong("_pfo", 0L);
                                bundle22.putLong("_sys", 0L);
                                bundle22.putLong("_sysu", 0L);
                                bundle22.putLong("_et", 1L);
                                if (zzqVar.zzp) {
                                }
                                String str32 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                zzam zzamVar102 = this.zze;
                                zzal(zzamVar102);
                                Preconditions.checkNotEmpty(str32);
                                zzamVar102.zzg();
                                zzamVar102.zzW();
                                zzc = zzamVar102.zzc(str32, "first_open_count");
                                if (this.zzn.zzaw().getPackageManager() != null) {
                                }
                                if (zzc >= 0) {
                                }
                                zzG(new zzaw("_f", new zzau(bundle22), "auto", j4), zzqVar);
                            } else {
                                zzW(new zzlj("_fvt", j4, Long.valueOf(j5), "auto"), zzqVar);
                                zzaB().zzg();
                                zzB();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("_c", 1L);
                                bundle3.putLong("_r", 1L);
                                bundle3.putLong("_et", 1L);
                                if (zzqVar.zzp) {
                                    bundle3.putLong("_dac", 1L);
                                }
                                zzG(new zzaw("_v", new zzau(bundle3), "auto", j4), zzqVar);
                            }
                        } else if (zzqVar.zzi) {
                            zzG(new zzaw("_cd", new zzau(new Bundle()), "auto", j4), zzqVar);
                        }
                        zzam zzamVar72 = this.zze;
                        zzal(zzamVar72);
                        zzamVar72.zzC();
                    }
                } else {
                    i = 0;
                }
                i2 = i4;
                if (zzj2 != null) {
                }
                zzd(zzqVar);
                if (i2 == 0) {
                }
                if (zzn == null) {
                }
                zzam zzamVar722 = this.zze;
                zzal(zzamVar722);
                zzamVar722.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    final void zzM() {
        this.zzr++;
    }

    final void zzN(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzO(zzacVar, zzac);
        }
    }

    final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzk = zzamVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzk != null) {
                    zzaA().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzk.zze) {
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        zzY((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzauVar != null ? zzauVar.zzc() : null, zzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzaA().zzk().zzc("Conditional user property doesn't exist", zzeu.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    final void zzP(String str, zzq zzqVar) {
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(str) && zzqVar.zzr != null) {
                zzaA().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzlj("_npa", zzax().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto"), zzqVar);
                return;
            }
            zzaA().zzc().zzb("Removing user property", this.zzn.zzj().zzf(str));
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(str)) {
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), str);
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzaA().zzc().zzb("User property removed", this.zzn.zzj().zzf(str));
            } finally {
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
            }
        }
    }

    final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzamVar.zzg();
        zzamVar.zzW();
        try {
            SQLiteDatabase zzh = zzamVar.zzh();
            String[] strArr = {str};
            int delete = zzh.delete("apps", "app_id=?", strArr) + zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("queue", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("main_event_params", "app_id=?", strArr) + zzh.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzamVar.zzt.zzaA().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzaA().zzd().zzc("Error resetting analytics data. appId, error", zzeu.zzn(str), e);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zziq zziqVar) {
        zzaB().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zziqVar != null) {
            this.zzE = str;
            this.zzD = zziqVar;
        }
    }

    protected final void zzS() {
        zzaB().zzg();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzax().currentTimeMillis());
        }
        zzag();
    }

    final void zzT(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzU(zzacVar, zzac);
        }
    }

    final void zzU(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.zze = false;
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzk != null && !zzk.zzb.equals(zzacVar2.zzb)) {
                    zzaA().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzk.zzb);
                }
                if (zzk != null && zzk.zze) {
                    zzacVar2.zzb = zzk.zzb;
                    zzacVar2.zzd = zzk.zzd;
                    zzacVar2.zzh = zzk.zzh;
                    zzacVar2.zzf = zzk.zzf;
                    zzacVar2.zzi = zzk.zzi;
                    zzacVar2.zze = true;
                    zzlj zzljVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlj(zzljVar.zzb, zzk.zzc.zzc, zzljVar.zza(), zzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzlj zzljVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlj(zzljVar2.zzb, zzacVar2.zzd, zzljVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z = true;
                }
                if (zzacVar2.zze) {
                    zzlj zzljVar3 = zzacVar2.zzc;
                    zzll zzllVar = new zzll((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzljVar3.zzb, zzljVar3.zzc, Preconditions.checkNotNull(zzljVar3.zza()));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzL(zzllVar)) {
                        zzaA().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                    } else {
                        zzaA().zzd().zzd("(2)Too many active user properties, ignoring", zzeu.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                    }
                    if (z && zzacVar2.zzi != null) {
                        zzY(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                if (zzamVar4.zzK(zzacVar2)) {
                    zzaA().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                } else {
                    zzaA().zzd().zzd("Too many conditional properties, ignoring", zzeu.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    final void zzV(String str, zzai zzaiVar) {
        zzaB().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzt.zzaA().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeu.zzn(str));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzaA().zzd().zzc("Error storing consent setting. appId, error", zzeu.zzn(str), e);
        }
    }

    final void zzW(zzlj zzljVar, zzq zzqVar) {
        long j;
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int zzl = zzv().zzl(zzljVar.zzb);
            if (zzl != 0) {
                zzlo zzv = zzv();
                String str = zzljVar.zzb;
                zzg();
                String zzD = zzv.zzD(str, 24, true);
                String str2 = zzljVar.zzb;
                zzv().zzO(this.zzF, zzqVar.zza, zzl, "_ev", zzD, str2 != null ? str2.length() : 0);
                return;
            }
            int zzd = zzv().zzd(zzljVar.zzb, zzljVar.zza());
            if (zzd != 0) {
                zzlo zzv2 = zzv();
                String str3 = zzljVar.zzb;
                zzg();
                String zzD2 = zzv2.zzD(str3, 24, true);
                Object zza = zzljVar.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    r6 = zza.toString().length();
                }
                zzv().zzO(this.zzF, zzqVar.zza, zzd, "_ev", zzD2, r6);
                return;
            }
            Object zzB = zzv().zzB(zzljVar.zzb, zzljVar.zza());
            if (zzB == null) {
                return;
            }
            if ("_sid".equals(zzljVar.zzb)) {
                long j2 = zzljVar.zzc;
                String str4 = zzljVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzam zzamVar = this.zze;
                zzal(zzamVar);
                zzll zzp = zzamVar.zzp(str5, "_sno");
                if (zzp != null) {
                    Object obj = zzp.zze;
                    if (obj instanceof Long) {
                        j = ((Long) obj).longValue();
                        zzW(new zzlj("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
                    }
                }
                if (zzp != null) {
                    zzaA().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp.zze);
                }
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzas zzn = zzamVar2.zzn(str5, "_s");
                if (zzn != null) {
                    j = zzn.zzc;
                    zzaA().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j));
                } else {
                    j = 0;
                }
                zzW(new zzlj("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
            }
            zzll zzllVar = new zzll((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzljVar.zzf), zzljVar.zzb, zzljVar.zzc, zzB);
            zzaA().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzllVar.zzc), zzB);
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                if ("_id".equals(zzllVar.zzc)) {
                    zzam zzamVar4 = this.zze;
                    zzal(zzamVar4);
                    zzll zzp2 = zzamVar4.zzp(zzqVar.zza, "_id");
                    if (zzp2 != null && !zzllVar.zze.equals(zzp2.zze)) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                boolean zzL = zzamVar6.zzL(zzllVar);
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzC();
                if (!zzL) {
                    zzaA().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                    zzv().zzO(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
            } finally {
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzx();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x050d, code lost:
    
        if (r3 != null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x050f, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0537, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0534, code lost:
    
        if (r3 == null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        if (r10 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        r22.zzA = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0116, code lost:
    
        if (r10 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r10 == null) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x028c A[Catch: all -> 0x0559, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x0559, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:69:0x013c, B:72:0x0164, B:75:0x016c, B:86:0x02c8, B:88:0x02ce, B:90:0x02da, B:91:0x02de, B:93:0x02e4, B:96:0x02f8, B:99:0x0301, B:101:0x0307, B:105:0x032c, B:106:0x031c, B:109:0x0326, B:115:0x032f, B:117:0x034a, B:120:0x035a, B:122:0x037e, B:124:0x03b6, B:126:0x03bb, B:128:0x03c3, B:129:0x03c6, B:131:0x03cb, B:132:0x03ce, B:134:0x03da, B:136:0x03f0, B:139:0x03f6, B:141:0x0405, B:142:0x0416, B:144:0x042b, B:146:0x0438, B:147:0x044d, B:149:0x0458, B:150:0x0461, B:152:0x0446, B:153:0x04af, B:185:0x028c, B:199:0x04ca, B:200:0x04cd, B:194:0x02c5, B:243:0x04ce, B:251:0x050f, B:253:0x0538, B:255:0x053e, B:257:0x0549, B:261:0x051a, B:271:0x0555, B:272:0x0558), top: B:2:0x0010, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c5 A[Catch: all -> 0x0559, TRY_ENTER, TryCatch #19 {all -> 0x0559, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:69:0x013c, B:72:0x0164, B:75:0x016c, B:86:0x02c8, B:88:0x02ce, B:90:0x02da, B:91:0x02de, B:93:0x02e4, B:96:0x02f8, B:99:0x0301, B:101:0x0307, B:105:0x032c, B:106:0x031c, B:109:0x0326, B:115:0x032f, B:117:0x034a, B:120:0x035a, B:122:0x037e, B:124:0x03b6, B:126:0x03bb, B:128:0x03c3, B:129:0x03c6, B:131:0x03cb, B:132:0x03ce, B:134:0x03da, B:136:0x03f0, B:139:0x03f6, B:141:0x0405, B:142:0x0416, B:144:0x042b, B:146:0x0438, B:147:0x044d, B:149:0x0458, B:150:0x0461, B:152:0x0446, B:153:0x04af, B:185:0x028c, B:199:0x04ca, B:200:0x04cd, B:194:0x02c5, B:243:0x04ce, B:251:0x050f, B:253:0x0538, B:255:0x053e, B:257:0x0549, B:261:0x051a, B:271:0x0555, B:272:0x0558), top: B:2:0x0010, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ca A[Catch: all -> 0x0559, TryCatch #19 {all -> 0x0559, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:69:0x013c, B:72:0x0164, B:75:0x016c, B:86:0x02c8, B:88:0x02ce, B:90:0x02da, B:91:0x02de, B:93:0x02e4, B:96:0x02f8, B:99:0x0301, B:101:0x0307, B:105:0x032c, B:106:0x031c, B:109:0x0326, B:115:0x032f, B:117:0x034a, B:120:0x035a, B:122:0x037e, B:124:0x03b6, B:126:0x03bb, B:128:0x03c3, B:129:0x03c6, B:131:0x03cb, B:132:0x03ce, B:134:0x03da, B:136:0x03f0, B:139:0x03f6, B:141:0x0405, B:142:0x0416, B:144:0x042b, B:146:0x0438, B:147:0x044d, B:149:0x0458, B:150:0x0461, B:152:0x0446, B:153:0x04af, B:185:0x028c, B:199:0x04ca, B:200:0x04cd, B:194:0x02c5, B:243:0x04ce, B:251:0x050f, B:253:0x0538, B:255:0x053e, B:257:0x0549, B:261:0x051a, B:271:0x0555, B:272:0x0558), top: B:2:0x0010, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138 A[Catch: all -> 0x0034, TryCatch #16 {all -> 0x0034, blocks: (B:6:0x0021, B:13:0x003e, B:18:0x0056, B:22:0x0067, B:26:0x0082, B:31:0x00b4, B:38:0x00c9, B:44:0x00f7, B:51:0x010e, B:52:0x0131, B:63:0x0138, B:64:0x013b, B:84:0x01aa), top: B:4:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ce A[Catch: all -> 0x0559, TryCatch #19 {all -> 0x0559, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:69:0x013c, B:72:0x0164, B:75:0x016c, B:86:0x02c8, B:88:0x02ce, B:90:0x02da, B:91:0x02de, B:93:0x02e4, B:96:0x02f8, B:99:0x0301, B:101:0x0307, B:105:0x032c, B:106:0x031c, B:109:0x0326, B:115:0x032f, B:117:0x034a, B:120:0x035a, B:122:0x037e, B:124:0x03b6, B:126:0x03bb, B:128:0x03c3, B:129:0x03c6, B:131:0x03cb, B:132:0x03ce, B:134:0x03da, B:136:0x03f0, B:139:0x03f6, B:141:0x0405, B:142:0x0416, B:144:0x042b, B:146:0x0438, B:147:0x044d, B:149:0x0458, B:150:0x0461, B:152:0x0446, B:153:0x04af, B:185:0x028c, B:199:0x04ca, B:200:0x04cd, B:194:0x02c5, B:243:0x04ce, B:251:0x050f, B:253:0x0538, B:255:0x053e, B:257:0x0549, B:261:0x051a, B:271:0x0555, B:272:0x0558), top: B:2:0x0010, inners: #23 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzX() {
        boolean z;
        Cursor cursor;
        zzam zzamVar;
        long zzz;
        Cursor cursor2;
        Cursor cursor3;
        int i;
        Cursor cursor4;
        List emptyList;
        String str;
        String str2;
        Cursor cursor5;
        byte[] byteArray;
        Cursor cursor6;
        zzaB().zzg();
        zzB();
        int i2 = 1;
        this.zzv = true;
        int i3 = 0;
        try {
            this.zzn.zzay();
            Boolean zzj = this.zzn.zzt().zzj();
            try {
                if (zzj == null) {
                    zzaA().zzk().zza("Upload data called on the client side before use of service was decided");
                    this.zzv = false;
                } else if (zzj.booleanValue()) {
                    zzaA().zzd().zza("Upload called in the client side when service should be used");
                    this.zzv = false;
                } else if (this.zza > 0) {
                    zzag();
                    this.zzv = false;
                } else {
                    zzaB().zzg();
                    if (this.zzy != null) {
                        zzaA().zzj().zza("Uploading requested multiple times");
                        this.zzv = false;
                    } else {
                        zzfa zzfaVar = this.zzd;
                        zzal(zzfaVar);
                        if (zzfaVar.zza()) {
                            long currentTimeMillis = zzax().currentTimeMillis();
                            Cursor cursor7 = null;
                            int zze = zzg().zze(null, zzeh.zzR);
                            zzg();
                            long zzz2 = currentTimeMillis - zzag.zzz();
                            for (int i4 = 0; i4 < zze && zzah(null, zzz2); i4++) {
                            }
                            long zza = this.zzk.zzc.zza();
                            if (zza != 0) {
                                zzaA().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza)));
                            }
                            zzam zzamVar2 = this.zze;
                            zzal(zzamVar2);
                            String zzr = zzamVar2.zzr();
                            long j = -1;
                            if (TextUtils.isEmpty(zzr)) {
                                try {
                                    this.zzA = -1L;
                                    zzamVar = this.zze;
                                    zzal(zzamVar);
                                    zzg();
                                    zzz = currentTimeMillis - zzag.zzz();
                                    zzamVar.zzg();
                                    zzamVar.zzW();
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = null;
                                }
                                try {
                                    cursor2 = zzamVar.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(zzz)});
                                    try {
                                    } catch (SQLiteException e) {
                                        e = e;
                                        zzamVar.zzt.zzaA().zzd().zzb("Error selecting expired configs", e);
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor2 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = null;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                                if (cursor2.moveToFirst()) {
                                    String str3 = cursor2.getString(0);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                        zzam zzamVar3 = this.zze;
                                        zzal(zzamVar3);
                                        zzh zzj2 = zzamVar3.zzj(str3);
                                        if (zzj2 != null) {
                                            zzD(zzj2);
                                        }
                                    }
                                } else {
                                    zzamVar.zzt.zzaA().zzj().zza("No expired configs for apps with pending events");
                                }
                            } else {
                                if (this.zzA == -1) {
                                    zzam zzamVar4 = this.zze;
                                    zzal(zzamVar4);
                                    try {
                                        cursor6 = zzamVar4.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        try {
                                            try {
                                                if (cursor6.moveToFirst()) {
                                                    j = cursor6.getLong(0);
                                                }
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                zzamVar4.zzt.zzaA().zzd().zzb("Error querying raw events", e);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor7 = cursor6;
                                            if (cursor7 != null) {
                                                cursor7.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        cursor6 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (cursor7 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                int zze2 = zzg().zze(zzr, zzeh.zzg);
                                int max = Math.max(0, zzg().zze(zzr, zzeh.zzh));
                                zzam zzamVar5 = this.zze;
                                zzal(zzamVar5);
                                zzamVar5.zzg();
                                zzamVar5.zzW();
                                Preconditions.checkArgument(zze2 > 0);
                                Preconditions.checkArgument(max > 0);
                                Preconditions.checkNotEmpty(zzr);
                                try {
                                    Cursor query = zzamVar5.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{zzr}, null, null, "rowid", String.valueOf(zze2));
                                    try {
                                        try {
                                            if (query.moveToFirst()) {
                                                ArrayList arrayList = new ArrayList();
                                                int i5 = 0;
                                                while (true) {
                                                    long j2 = query.getLong(i3);
                                                    try {
                                                        byte[] blob = query.getBlob(i2);
                                                        zzli zzliVar = zzamVar5.zzf.zzi;
                                                        zzal(zzliVar);
                                                        i = i2;
                                                        try {
                                                            try {
                                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                                byte[] bArr = new byte[1024];
                                                                while (true) {
                                                                    int read = gZIPInputStream.read(bArr);
                                                                    if (read <= 0) {
                                                                        break;
                                                                    }
                                                                    cursor5 = query;
                                                                    try {
                                                                        try {
                                                                            byteArrayOutputStream.write(bArr, 0, read);
                                                                            query = cursor5;
                                                                        } catch (IOException e5) {
                                                                            e = e5;
                                                                            try {
                                                                                zzliVar.zzt.zzaA().zzd().zzb("Failed to ungzip content", e);
                                                                                throw e;
                                                                            } catch (IOException e6) {
                                                                                e = e6;
                                                                                zzamVar5.zzt.zzaA().zzd().zzc("Failed to unzip queued bundle. appId", zzeu.zzn(zzr), e);
                                                                                if (cursor5.moveToNext()) {
                                                                                    break;
                                                                                }
                                                                                i2 = i;
                                                                                query = cursor5;
                                                                                i3 = 0;
                                                                                if (cursor5 != null) {
                                                                                }
                                                                                emptyList = arrayList;
                                                                                if (!emptyList.isEmpty()) {
                                                                                }
                                                                                this.zzv = false;
                                                                                zzae();
                                                                            }
                                                                        }
                                                                    } catch (SQLiteException e7) {
                                                                        e = e7;
                                                                        cursor4 = cursor5;
                                                                        try {
                                                                            zzamVar5.zzt.zzaA().zzd().zzc("Error querying bundles. appId", zzeu.zzn(zzr), e);
                                                                            emptyList = Collections.emptyList();
                                                                            if (cursor4 != null) {
                                                                            }
                                                                            if (!emptyList.isEmpty()) {
                                                                            }
                                                                            this.zzv = false;
                                                                            zzae();
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            cursor3 = cursor4;
                                                                            if (cursor3 != null) {
                                                                                cursor3.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        cursor3 = cursor5;
                                                                        if (cursor3 != null) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                gZIPInputStream.close();
                                                                byteArrayInputStream.close();
                                                                byteArray = byteArrayOutputStream.toByteArray();
                                                            } catch (IOException e8) {
                                                                e = e8;
                                                                cursor5 = query;
                                                            }
                                                        } catch (SQLiteException e9) {
                                                            e = e9;
                                                            cursor5 = query;
                                                            cursor4 = cursor5;
                                                            zzamVar5.zzt.zzaA().zzd().zzc("Error querying bundles. appId", zzeu.zzn(zzr), e);
                                                            emptyList = Collections.emptyList();
                                                            if (cursor4 != null) {
                                                                cursor4.close();
                                                            }
                                                            if (!emptyList.isEmpty()) {
                                                            }
                                                            this.zzv = false;
                                                            zzae();
                                                        }
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                        i = i2;
                                                        cursor5 = query;
                                                    }
                                                    if (!arrayList.isEmpty() && byteArray.length + i5 > max) {
                                                        cursor5 = query;
                                                        break;
                                                    }
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzli.zzl(com.google.android.gms.internal.measurement.zzgd.zzu(), byteArray);
                                                        if (!query.isNull(2)) {
                                                            zzgcVar.zzaf(query.getInt(2));
                                                        }
                                                        i5 += byteArray.length;
                                                        arrayList.add(Pair.create((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaD(), Long.valueOf(j2)));
                                                    } catch (IOException e11) {
                                                        zzamVar5.zzt.zzaA().zzd().zzc("Failed to merge queued bundle. appId", zzeu.zzn(zzr), e11);
                                                    }
                                                    cursor5 = query;
                                                    if (cursor5.moveToNext() || i5 > max) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i2 = i;
                                                        query = cursor5;
                                                        i3 = 0;
                                                    }
                                                }
                                                if (cursor5 != null) {
                                                    cursor5.close();
                                                }
                                                emptyList = arrayList;
                                            } else {
                                                emptyList = Collections.emptyList();
                                                if (query != null) {
                                                    query.close();
                                                }
                                                i = 1;
                                            }
                                        } catch (SQLiteException e12) {
                                            e = e12;
                                            i = 1;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cursor5 = query;
                                    }
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    i = 1;
                                    cursor4 = null;
                                } catch (Throwable th8) {
                                    th = th8;
                                    cursor3 = null;
                                }
                                if (!emptyList.isEmpty()) {
                                    if (zzh(zzr).zzi(zzah.AD_STORAGE)) {
                                        Iterator it = emptyList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str2 = null;
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                            if (!zzgdVar.zzK().isEmpty()) {
                                                str2 = zzgdVar.zzK();
                                                break;
                                            }
                                        }
                                        if (str2 != null) {
                                            int i6 = 0;
                                            while (true) {
                                                if (i6 >= emptyList.size()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzgd zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) emptyList.get(i6)).first;
                                                if (!zzgdVar2.zzK().isEmpty() && !zzgdVar2.zzK().equals(str2)) {
                                                    emptyList = emptyList.subList(0, i6);
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    com.google.android.gms.internal.measurement.zzga zza2 = com.google.android.gms.internal.measurement.zzgb.zza();
                                    int size = emptyList.size();
                                    ArrayList arrayList2 = new ArrayList(emptyList.size());
                                    int i7 = (zzg().zzt(zzr) && zzh(zzr).zzi(zzah.AD_STORAGE)) ? i : 0;
                                    boolean zzi = zzh(zzr).zzi(zzah.AD_STORAGE);
                                    boolean zzi2 = zzh(zzr).zzi(zzah.ANALYTICS_STORAGE);
                                    zzqr.zzc();
                                    boolean zzs = zzg().zzs(zzr, zzeh.zzao);
                                    for (int i8 = 0; i8 < size; i8++) {
                                        com.google.android.gms.internal.measurement.zzgc zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) emptyList.get(i8)).first).zzbB();
                                        arrayList2.add((Long) ((Pair) emptyList.get(i8)).second);
                                        zzg().zzh();
                                        zzgcVar2.zzam(77000L);
                                        zzgcVar2.zzal(currentTimeMillis);
                                        this.zzn.zzay();
                                        zzgcVar2.zzag(false);
                                        if (i7 == 0) {
                                            zzgcVar2.zzq();
                                        }
                                        if (!zzi) {
                                            zzgcVar2.zzx();
                                            zzgcVar2.zzt();
                                        }
                                        if (!zzi2) {
                                            zzgcVar2.zzn();
                                        }
                                        zzC(zzr, zzgcVar2);
                                        if (!zzs) {
                                            zzgcVar2.zzy();
                                        }
                                        if (zzg().zzs(zzr, zzeh.zzV)) {
                                            byte[] zzbx = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaD()).zzbx();
                                            zzli zzliVar2 = this.zzi;
                                            zzal(zzliVar2);
                                            zzgcVar2.zzJ(zzliVar2.zzd(zzbx));
                                        }
                                        zza2.zza(zzgcVar2);
                                    }
                                    if (Log.isLoggable(zzaA().zzr(), 2)) {
                                        zzli zzliVar3 = this.zzi;
                                        zzal(zzliVar3);
                                        str = zzliVar3.zzm((com.google.android.gms.internal.measurement.zzgb) zza2.zzaD());
                                    } else {
                                        str = null;
                                    }
                                    zzal(this.zzi);
                                    byte[] zzbx2 = ((com.google.android.gms.internal.measurement.zzgb) zza2.zzaD()).zzbx();
                                    zzku zza3 = this.zzl.zza(zzr);
                                    try {
                                        Preconditions.checkArgument(!arrayList2.isEmpty());
                                        if (this.zzy != null) {
                                            zzaA().zzd().zza("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.zzy = new ArrayList(arrayList2);
                                        }
                                        this.zzk.zzd.zzb(currentTimeMillis);
                                        zzaA().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zza2.zzb(0).zzy() : "?", Integer.valueOf(zzbx2.length), str);
                                        this.zzu = i;
                                        zzfa zzfaVar2 = this.zzd;
                                        zzal(zzfaVar2);
                                        URL url = new URL(zza3.zza());
                                        Map zzb2 = zza3.zzb();
                                        zzkx zzkxVar = new zzkx(this, zzr);
                                        zzfaVar2.zzg();
                                        zzfaVar2.zzW();
                                        Preconditions.checkNotNull(url);
                                        Preconditions.checkNotNull(zzbx2);
                                        Preconditions.checkNotNull(zzkxVar);
                                        zzfaVar2.zzt.zzaB().zzo(new zzez(zzfaVar2, zzr, url, zzbx2, zzb2, zzkxVar));
                                    } catch (MalformedURLException unused) {
                                        zzaA().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeu.zzn(zzr), zza3.zza());
                                    }
                                }
                            }
                            this.zzv = false;
                        } else {
                            zzaA().zzj().zza("Network not connected, ignoring upload request");
                            zzag();
                            this.zzv = false;
                        }
                    }
                }
                zzae();
            } catch (Throwable th9) {
                th = th9;
                z = false;
                this.zzv = z;
                zzae();
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            z = false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:298|(2:300|(1:302)(7:303|304|(1:306)|59|(0)(0)|62|(0)(0)))|307|308|309|310|304|(0)|59|(0)(0)|62|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x07ab, code lost:
    
        if (r11.isEmpty() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x09b9, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x02f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x02f1, code lost:
    
        r10.zzt.zzaA().zzd().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzeu.zzn(r14), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0557 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0590 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0654 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0661 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x066e A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06a7 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06b8 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06f7 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x071e A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0751 A[Catch: all -> 0x0aec, TRY_LEAVE, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07b0 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x07f6 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0848 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0855 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x086f A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x08fd A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x091d A[Catch: all -> 0x0aec, TRY_LEAVE, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x09af A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0a58 A[Catch: SQLiteException -> 0x0a73, all -> 0x0aec, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0a73, blocks: (B:226:0x0a49, B:228:0x0a58), top: B:225:0x0a49, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x09bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0723 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0608 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0371 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01dc A[Catch: all -> 0x0aec, TRY_ENTER, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0257 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0324 A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03cd A[Catch: all -> 0x0aec, TryCatch #7 {all -> 0x0aec, blocks: (B:44:0x0194, B:47:0x01a4, B:49:0x01ae, B:53:0x01ba, B:59:0x035b, B:62:0x0390, B:64:0x03cd, B:66:0x03d2, B:67:0x03e9, B:71:0x03fc, B:73:0x0416, B:75:0x041c, B:76:0x0433, B:81:0x045a, B:85:0x047e, B:86:0x0495, B:89:0x04a8, B:92:0x04c5, B:93:0x04d9, B:95:0x04e3, B:97:0x04f0, B:99:0x04f6, B:100:0x04ff, B:102:0x050d, B:105:0x0522, B:109:0x0557, B:110:0x056c, B:112:0x0590, B:115:0x05a8, B:118:0x05e9, B:119:0x0618, B:121:0x0654, B:122:0x0659, B:124:0x0661, B:125:0x0666, B:127:0x066e, B:128:0x0673, B:130:0x067e, B:132:0x068b, B:134:0x0699, B:135:0x069e, B:137:0x06a7, B:138:0x06ab, B:140:0x06b8, B:141:0x06bd, B:143:0x06e4, B:145:0x06ec, B:146:0x06f1, B:148:0x06f7, B:149:0x06fa, B:151:0x071e, B:153:0x0729, B:156:0x0731, B:157:0x074b, B:159:0x0751, B:162:0x0765, B:165:0x0771, B:168:0x077e, B:256:0x0797, B:171:0x07a7, B:174:0x07b0, B:175:0x07b3, B:177:0x07d1, B:179:0x07d5, B:181:0x07e7, B:183:0x07eb, B:185:0x07f6, B:186:0x0801, B:188:0x0848, B:189:0x084d, B:191:0x0855, B:193:0x085f, B:194:0x0862, B:196:0x086f, B:198:0x0891, B:199:0x089e, B:200:0x08d4, B:202:0x08dc, B:204:0x08e6, B:205:0x08f3, B:207:0x08fd, B:208:0x090a, B:209:0x0917, B:211:0x091d, B:214:0x094d, B:216:0x0992, B:217:0x099d, B:218:0x09a9, B:220:0x09af, B:224:0x09fb, B:226:0x0a49, B:228:0x0a58, B:229:0x0ab9, B:234:0x0a70, B:236:0x0a74, B:239:0x09bb, B:241:0x09e5, B:247:0x0a8b, B:248:0x0aa2, B:251:0x0aa4, B:261:0x0723, B:262:0x0608, B:265:0x053e, B:270:0x0371, B:271:0x0378, B:273:0x037e, B:276:0x038a, B:281:0x01d0, B:284:0x01dc, B:286:0x01f3, B:291:0x0211, B:294:0x0251, B:296:0x0257, B:298:0x0265, B:300:0x027c, B:303:0x0283, B:304:0x0319, B:306:0x0324, B:307:0x02b2, B:309:0x02d9, B:310:0x0304, B:313:0x02f1, B:315:0x021f, B:320:0x0247), top: B:43:0x0194, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzY(zzaw zzawVar, zzq zzqVar) {
        boolean z;
        String zzg;
        String str;
        long longValue;
        int i;
        String str2;
        int i2;
        int i3;
        zzll zzllVar;
        zzam zzamVar;
        zzau zzauVar;
        long j;
        long intValue;
        long j2;
        int i4;
        long j3;
        zzas zzn;
        zzar zzarVar;
        zzas zzasVar;
        com.google.android.gms.internal.measurement.zzgc zzu;
        long j4;
        long j5;
        Map emptyMap;
        ArrayList arrayList;
        zzai zzc;
        zzh zzj;
        List zzu2;
        int i5;
        zzam zzamVar2;
        zzam zzamVar3;
        zzat zzatVar;
        int i6;
        ContentValues contentValues;
        Pair zzd;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        long nanoTime = System.nanoTime();
        zzaB().zzg();
        zzB();
        String str3 = zzqVar.zza;
        zzal(this.zzi);
        if (!zzli.zzA(zzawVar, zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        zzfv zzfvVar = this.zzc;
        zzal(zzfvVar);
        if (zzfvVar.zzr(str3, zzawVar.zza)) {
            zzaA().zzk().zzc("Dropping blocked event. appId", zzeu.zzn(str3), this.zzn.zzj().zzd(zzawVar.zza));
            zzfv zzfvVar2 = this.zzc;
            zzal(zzfvVar2);
            if (!zzfvVar2.zzp(str3)) {
                zzfv zzfvVar3 = this.zzc;
                zzal(zzfvVar3);
                if (!zzfvVar3.zzs(str3)) {
                    if ("_err".equals(zzawVar.zza)) {
                        return;
                    }
                    zzv().zzO(this.zzF, str3, 11, "_ev", zzawVar.zza, 0);
                    return;
                }
            }
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            zzh zzj2 = zzamVar4.zzj(str3);
            if (zzj2 != null) {
                long abs = Math.abs(zzax().currentTimeMillis() - Math.max(zzj2.zzl(), zzj2.zzc()));
                zzg();
                if (abs > ((Long) zzeh.zzz.zza(null)).longValue()) {
                    zzaA().zzc().zza("Fetching config for blocked app");
                    zzD(zzj2);
                    return;
                }
                return;
            }
            return;
        }
        zzev zzb2 = zzev.zzb(zzawVar);
        zzv().zzN(zzb2, zzg().zzd(str3));
        zzpn.zzc();
        int zzf = zzg().zzs(null, zzeh.zzaA) ? zzg().zzf(str3, zzeh.zzQ, 10, 35) : 0;
        for (String str4 : new TreeSet(zzb2.zzd.keySet())) {
            if (FirebaseAnalytics.Param.ITEMS.equals(str4)) {
                zzlo zzv = zzv();
                Parcelable[] parcelableArray = zzb2.zzd.getParcelableArray(str4);
                zzpn.zzc();
                zzv.zzM(parcelableArray, zzf, zzg().zzs(null, zzeh.zzaA));
                nanoTime = nanoTime;
            }
        }
        long j6 = nanoTime;
        zzaw zza = zzb2.zza();
        if (Log.isLoggable(zzaA().zzr(), 2)) {
            zzaA().zzj().zzb("Logging event", this.zzn.zzj().zzc(zza));
        }
        zzpk.zzc();
        zzg().zzs(null, zzeh.zzax);
        zzam zzamVar5 = this.zze;
        zzal(zzamVar5);
        zzamVar5.zzw();
        try {
            zzd(zzqVar);
            if (!"ecommerce_purchase".equals(zza.zza) && !FirebaseAnalytics.Event.PURCHASE.equals(zza.zza) && !FirebaseAnalytics.Event.REFUND.equals(zza.zza)) {
                z = false;
                if (!"_iap".equals(zza.zza)) {
                    if (!z) {
                        i = 2;
                        str2 = "_err";
                        i2 = 1;
                        i3 = 0;
                        boolean zzak = zzlo.zzak(zza.zza);
                        boolean equals = str2.equals(zza.zza);
                        zzv();
                        zzauVar = zza.zzb;
                        if (zzauVar == null) {
                            j = 0;
                        } else {
                            zzat zzatVar2 = new zzat(zzauVar);
                            j = 0;
                            while (zzatVar2.hasNext()) {
                                if (zzauVar.zzf(zzatVar2.next()) instanceof Parcelable[]) {
                                    j += ((Parcelable[]) r15).length;
                                }
                            }
                        }
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        long j7 = j;
                        String str5 = str3;
                        zzak zzm = zzamVar6.zzm(zza(), str5, j7 + 1, true, zzak, false, equals, false);
                        long j8 = zzm.zzb;
                        zzg();
                        intValue = j8 - ((Integer) zzeh.zzk.zza(null)).intValue();
                        if (intValue > 0) {
                            if (intValue % 1000 == 1) {
                                zzaA().zzd().zzc("Data loss. Too many events logged. appId, count", zzeu.zzn(str5), Long.valueOf(zzm.zzb));
                            }
                            zzam zzamVar7 = this.zze;
                            zzal(zzamVar7);
                            zzamVar7.zzC();
                            return;
                        }
                        if (zzak) {
                            long j9 = zzm.zza;
                            zzg();
                            long intValue2 = j9 - ((Integer) zzeh.zzm.zza(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    zzaA().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeu.zzn(str5), Long.valueOf(zzm.zza));
                                }
                                zzv().zzO(this.zzF, str5, 16, "_ev", zza.zza, 0);
                                zzam zzamVar8 = this.zze;
                                zzal(zzamVar8);
                                zzamVar8.zzC();
                                return;
                            }
                        }
                        if (equals) {
                            j2 = 0;
                            long max = zzm.zzd - Math.max(i3, Math.min(1000000, zzg().zze(zzqVar.zza, zzeh.zzl)));
                            if (max > 0) {
                                if (max == 1) {
                                    zzaA().zzd().zzc("Too many error events logged. appId, count", zzeu.zzn(str5), Long.valueOf(zzm.zzd));
                                }
                                zzam zzamVar9 = this.zze;
                                zzal(zzamVar9);
                                zzamVar9.zzC();
                                return;
                            }
                        } else {
                            j2 = 0;
                        }
                        Bundle zzc2 = zza.zzb.zzc();
                        zzv().zzP(zzc2, "_o", zza.zzc);
                        if (zzv().zzaf(str5)) {
                            zzv().zzP(zzc2, "_dbg", 1L);
                            zzv().zzP(zzc2, "_r", 1L);
                        }
                        if ("_s".equals(zza.zza)) {
                            zzam zzamVar10 = this.zze;
                            zzal(zzamVar10);
                            zzll zzp = zzamVar10.zzp(zzqVar.zza, "_sno");
                            if (zzp != null && (zzp.zze instanceof Long)) {
                                zzv().zzP(zzc2, "_sno", zzp.zze);
                            }
                        }
                        zzam zzamVar11 = this.zze;
                        zzal(zzamVar11);
                        Preconditions.checkNotEmpty(str5);
                        zzamVar11.zzg();
                        zzamVar11.zzW();
                        try {
                            SQLiteDatabase zzh = zzamVar11.zzh();
                            i4 = 0;
                            try {
                                String valueOf = String.valueOf(Math.max(0, Math.min(1000000, zzamVar11.zzt.zzf().zze(str5, zzeh.zzp))));
                                String[] strArr = new String[i];
                                strArr[0] = str5;
                                strArr[i2] = valueOf;
                                j3 = zzh.delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", strArr);
                            } catch (SQLiteException e) {
                                e = e;
                                zzamVar11.zzt.zzaA().zzd().zzc("Error deleting over the limit events. appId", zzeu.zzn(str5), e);
                                j3 = j2;
                                if (j3 > j2) {
                                }
                                int i7 = i4;
                                zzar zzarVar2 = new zzar(this.zzn, zza.zzc, str5, zza.zza, zza.zzd, 0L, zzc2);
                                zzam zzamVar12 = this.zze;
                                zzal(zzamVar12);
                                zzn = zzamVar12.zzn(str5, zzarVar2.zzb);
                                if (zzn != null) {
                                }
                                zzam zzamVar13 = this.zze;
                                zzal(zzamVar13);
                                zzamVar13.zzE(zzasVar);
                                zzaB().zzg();
                                zzB();
                                Preconditions.checkNotNull(zzarVar);
                                Preconditions.checkNotNull(zzqVar);
                                Preconditions.checkNotEmpty(zzarVar.zza);
                                Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                                zzu = com.google.android.gms.internal.measurement.zzgd.zzu();
                                zzu.zzad(i2);
                                zzu.zzZ("android");
                                if (!TextUtils.isEmpty(zzqVar.zza)) {
                                }
                                if (!TextUtils.isEmpty(zzqVar.zzd)) {
                                }
                                if (!TextUtils.isEmpty(zzqVar.zzc)) {
                                }
                                zzqr.zzc();
                                if (!TextUtils.isEmpty(zzqVar.zzx)) {
                                    zzu.zzah(zzqVar.zzx);
                                }
                                j4 = zzqVar.zzj;
                                if (j4 != -2147483648L) {
                                }
                                zzu.zzV(zzqVar.zze);
                                if (!TextUtils.isEmpty(zzqVar.zzb)) {
                                }
                                zzu.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                                if (zzu.zzar().isEmpty()) {
                                    zzu.zzC(zzqVar.zzq);
                                }
                                j5 = zzqVar.zzf;
                                if (j5 != j2) {
                                }
                                zzu.zzP(zzqVar.zzs);
                                zzli zzliVar = this.zzi;
                                zzal(zzliVar);
                                com.google.android.gms.internal.measurement.zzhf zza2 = com.google.android.gms.internal.measurement.zzhf.zza(zzliVar.zzf.zzn.zzaw().getContentResolver(), com.google.android.gms.internal.measurement.zzhq.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzay
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.google.android.gms.internal.measurement.zzib.zzc();
                                    }
                                });
                                if (zza2 != null) {
                                }
                                if (emptyMap != null) {
                                    arrayList = new ArrayList();
                                    int intValue3 = ((Integer) zzeh.zzP.zza(null)).intValue();
                                    while (r12.hasNext()) {
                                    }
                                }
                                arrayList = null;
                                if (arrayList != null) {
                                }
                                zzc = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                                if (zzc.zzi(zzah.AD_STORAGE)) {
                                    zzd = this.zzk.zzd(zzqVar.zza, zzc);
                                    if (!TextUtils.isEmpty((CharSequence) zzd.first)) {
                                        zzu.zzae((String) zzd.first);
                                        if (zzd.second != null) {
                                        }
                                    }
                                }
                                this.zzn.zzg().zzv();
                                zzu.zzN(Build.MODEL);
                                this.zzn.zzg().zzv();
                                zzu.zzY(Build.VERSION.RELEASE);
                                zzu.zzak((int) this.zzn.zzg().zzb());
                                zzu.zzao(this.zzn.zzg().zzc());
                                zzpw.zzc();
                                if (zzg().zzs(null, zzeh.zzaE)) {
                                }
                                if (this.zzn.zzJ()) {
                                }
                                zzam zzamVar14 = this.zze;
                                zzal(zzamVar14);
                                zzj = zzamVar14.zzj(zzqVar.zza);
                                if (zzj == null) {
                                }
                                if (zzc.zzi(zzah.ANALYTICS_STORAGE)) {
                                    zzu.zzE((String) Preconditions.checkNotNull(zzj.zzv()));
                                }
                                if (!TextUtils.isEmpty(zzj.zzy())) {
                                }
                                zzam zzamVar15 = this.zze;
                                zzal(zzamVar15);
                                zzu2 = zzamVar15.zzu(zzqVar.zza);
                                while (i5 < zzu2.size()) {
                                }
                                zzamVar2 = this.zze;
                                zzal(zzamVar2);
                                com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzu.zzaD();
                                zzamVar2.zzg();
                                zzamVar2.zzW();
                                Preconditions.checkNotNull(zzgdVar);
                                Preconditions.checkNotEmpty(zzgdVar.zzy());
                                byte[] zzbx = zzgdVar.zzbx();
                                zzli zzliVar2 = zzamVar2.zzf.zzi;
                                zzal(zzliVar2);
                                long zzd2 = zzliVar2.zzd(zzbx);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("app_id", zzgdVar.zzy());
                                contentValues2.put("metadata_fingerprint", Long.valueOf(zzd2));
                                contentValues2.put(TtmlNode.TAG_METADATA, zzbx);
                                try {
                                    zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                    zzamVar3 = this.zze;
                                    zzal(zzamVar3);
                                    zzatVar = new zzat(zzarVar.zzf);
                                    while (true) {
                                        if (!zzatVar.hasNext()) {
                                        }
                                    }
                                    zzamVar3.zzg();
                                    zzamVar3.zzW();
                                    Preconditions.checkNotNull(zzarVar);
                                    Preconditions.checkNotEmpty(zzarVar.zza);
                                    zzli zzliVar3 = zzamVar3.zzf.zzi;
                                    zzal(zzliVar3);
                                    byte[] zzbx2 = zzliVar3.zzj(zzarVar).zzbx();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", zzarVar.zza);
                                    contentValues.put("name", zzarVar.zzb);
                                    contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(zzd2));
                                    contentValues.put("data", zzbx2);
                                    contentValues.put("realtime", Integer.valueOf(i6));
                                    try {
                                        if (zzamVar3.zzh().insert("raw_events", null, contentValues) != -1) {
                                        }
                                    } catch (SQLiteException e2) {
                                        zzamVar3.zzt.zzaA().zzd().zzc("Error storing raw event. appId", zzeu.zzn(zzarVar.zza), e2);
                                    }
                                    zzam zzamVar16 = this.zze;
                                    zzal(zzamVar16);
                                    zzamVar16.zzC();
                                    zzam zzamVar17 = this.zze;
                                    zzal(zzamVar17);
                                    zzamVar17.zzx();
                                    zzag();
                                    zzaA().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j6) + 500000) / 1000000));
                                    return;
                                } catch (SQLiteException e3) {
                                    zzamVar2.zzt.zzaA().zzd().zzc("Error storing raw event metadata. appId", zzeu.zzn(zzgdVar.zzy()), e3);
                                    throw e3;
                                }
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            i4 = 0;
                        }
                        if (j3 > j2) {
                            zzaA().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeu.zzn(str5), Long.valueOf(j3));
                        }
                        int i72 = i4;
                        zzar zzarVar22 = new zzar(this.zzn, zza.zzc, str5, zza.zza, zza.zzd, 0L, zzc2);
                        zzam zzamVar122 = this.zze;
                        zzal(zzamVar122);
                        zzn = zzamVar122.zzn(str5, zzarVar22.zzb);
                        if (zzn != null) {
                            zzam zzamVar18 = this.zze;
                            zzal(zzamVar18);
                            if (zzamVar18.zzf(str5) >= zzg().zzb(str5) && zzak) {
                                zzaA().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzeu.zzn(str5), this.zzn.zzj().zzd(zzarVar22.zzb), Integer.valueOf(zzg().zzb(str5)));
                                zzv().zzO(this.zzF, str5, 8, null, null, 0);
                                return;
                            } else {
                                zzasVar = new zzas(str5, zzarVar22.zzb, 0L, 0L, 0L, zzarVar22.zzd, 0L, null, null, null, null);
                                zzarVar = zzarVar22;
                            }
                        } else {
                            zzar zza3 = zzarVar22.zza(this.zzn, zzn.zzf);
                            zzas zzc3 = zzn.zzc(zza3.zzd);
                            zzarVar = zza3;
                            zzasVar = zzc3;
                        }
                        zzam zzamVar132 = this.zze;
                        zzal(zzamVar132);
                        zzamVar132.zzE(zzasVar);
                        zzaB().zzg();
                        zzB();
                        Preconditions.checkNotNull(zzarVar);
                        Preconditions.checkNotNull(zzqVar);
                        Preconditions.checkNotEmpty(zzarVar.zza);
                        Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                        zzu = com.google.android.gms.internal.measurement.zzgd.zzu();
                        zzu.zzad(i2);
                        zzu.zzZ("android");
                        if (!TextUtils.isEmpty(zzqVar.zza)) {
                            zzu.zzD(zzqVar.zza);
                        }
                        if (!TextUtils.isEmpty(zzqVar.zzd)) {
                            zzu.zzF(zzqVar.zzd);
                        }
                        if (!TextUtils.isEmpty(zzqVar.zzc)) {
                            zzu.zzG(zzqVar.zzc);
                        }
                        zzqr.zzc();
                        if (!TextUtils.isEmpty(zzqVar.zzx) && (zzg().zzs(null, zzeh.zzam) || zzg().zzs(zzqVar.zza, zzeh.zzao))) {
                            zzu.zzah(zzqVar.zzx);
                        }
                        j4 = zzqVar.zzj;
                        if (j4 != -2147483648L) {
                            zzu.zzH((int) j4);
                        }
                        zzu.zzV(zzqVar.zze);
                        if (!TextUtils.isEmpty(zzqVar.zzb)) {
                            zzu.zzU(zzqVar.zzb);
                        }
                        zzu.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                        if (zzu.zzar().isEmpty() && !TextUtils.isEmpty(zzqVar.zzq)) {
                            zzu.zzC(zzqVar.zzq);
                        }
                        j5 = zzqVar.zzf;
                        if (j5 != j2) {
                            zzu.zzM(j5);
                        }
                        zzu.zzP(zzqVar.zzs);
                        zzli zzliVar4 = this.zzi;
                        zzal(zzliVar4);
                        com.google.android.gms.internal.measurement.zzhf zza22 = com.google.android.gms.internal.measurement.zzhf.zza(zzliVar4.zzf.zzn.zzaw().getContentResolver(), com.google.android.gms.internal.measurement.zzhq.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzay
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.gms.internal.measurement.zzib.zzc();
                            }
                        });
                        emptyMap = zza22 != null ? Collections.emptyMap() : zza22.zzc();
                        if (emptyMap != null && !emptyMap.isEmpty()) {
                            arrayList = new ArrayList();
                            int intValue32 = ((Integer) zzeh.zzP.zza(null)).intValue();
                            for (Map.Entry entry : emptyMap.entrySet()) {
                                if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                    try {
                                        int parseInt = Integer.parseInt((String) entry.getValue());
                                        if (parseInt != 0) {
                                            arrayList.add(Integer.valueOf(parseInt));
                                            if (arrayList.size() >= intValue32) {
                                                zzliVar4.zzt.zzaA().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                break;
                                            }
                                            continue;
                                        } else {
                                            continue;
                                        }
                                    } catch (NumberFormatException e5) {
                                        zzliVar4.zzt.zzaA().zzk().zzb("Experiment ID NumberFormatException", e5);
                                    }
                                }
                            }
                        }
                        arrayList = null;
                        if (arrayList != null) {
                            zzu.zzh(arrayList);
                        }
                        zzc = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                        if (zzc.zzi(zzah.AD_STORAGE) && zzqVar.zzo) {
                            zzd = this.zzk.zzd(zzqVar.zza, zzc);
                            if (!TextUtils.isEmpty((CharSequence) zzd.first) && zzqVar.zzo) {
                                zzu.zzae((String) zzd.first);
                                if (zzd.second != null) {
                                    zzu.zzX(((Boolean) zzd.second).booleanValue());
                                }
                            }
                        }
                        this.zzn.zzg().zzv();
                        zzu.zzN(Build.MODEL);
                        this.zzn.zzg().zzv();
                        zzu.zzY(Build.VERSION.RELEASE);
                        zzu.zzak((int) this.zzn.zzg().zzb());
                        zzu.zzao(this.zzn.zzg().zzc());
                        zzpw.zzc();
                        if (zzg().zzs(null, zzeh.zzaE)) {
                            zzu.zzaj(zzqVar.zzz);
                        }
                        if (this.zzn.zzJ()) {
                            zzu.zzaq();
                            if (!TextUtils.isEmpty(null)) {
                                zzu.zzO(null);
                            }
                        }
                        zzam zzamVar142 = this.zze;
                        zzal(zzamVar142);
                        zzj = zzamVar142.zzj(zzqVar.zza);
                        if (zzj == null) {
                            zzj = new zzh(this.zzn, zzqVar.zza);
                            zzj.zzI(zzw(zzc));
                            zzj.zzW(zzqVar.zzk);
                            zzj.zzX(zzqVar.zzb);
                            if (zzc.zzi(zzah.AD_STORAGE)) {
                                zzj.zzaf(this.zzk.zzf(zzqVar.zza, zzqVar.zzo));
                            }
                            long j10 = j2;
                            zzj.zzab(j10);
                            zzj.zzac(j10);
                            zzj.zzaa(j10);
                            zzj.zzK(zzqVar.zzc);
                            zzj.zzL(zzqVar.zzj);
                            zzj.zzJ(zzqVar.zzd);
                            zzj.zzY(zzqVar.zze);
                            zzj.zzT(zzqVar.zzf);
                            zzj.zzad(zzqVar.zzh);
                            zzj.zzU(zzqVar.zzs);
                            zzam zzamVar19 = this.zze;
                            zzal(zzamVar19);
                            zzamVar19.zzD(zzj);
                        }
                        if (zzc.zzi(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzj.zzv())) {
                            zzu.zzE((String) Preconditions.checkNotNull(zzj.zzv()));
                        }
                        if (!TextUtils.isEmpty(zzj.zzy())) {
                            zzu.zzT((String) Preconditions.checkNotNull(zzj.zzy()));
                        }
                        zzam zzamVar152 = this.zze;
                        zzal(zzamVar152);
                        zzu2 = zzamVar152.zzu(zzqVar.zza);
                        for (i5 = i72; i5 < zzu2.size(); i5++) {
                            com.google.android.gms.internal.measurement.zzgl zzd3 = com.google.android.gms.internal.measurement.zzgm.zzd();
                            zzd3.zzf(((zzll) zzu2.get(i5)).zzc);
                            zzd3.zzg(((zzll) zzu2.get(i5)).zzd);
                            zzli zzliVar5 = this.zzi;
                            zzal(zzliVar5);
                            zzliVar5.zzu(zzd3, ((zzll) zzu2.get(i5)).zze);
                            zzu.zzl(zzd3);
                        }
                        try {
                            zzamVar2 = this.zze;
                            zzal(zzamVar2);
                            com.google.android.gms.internal.measurement.zzgd zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) zzu.zzaD();
                            zzamVar2.zzg();
                            zzamVar2.zzW();
                            Preconditions.checkNotNull(zzgdVar2);
                            Preconditions.checkNotEmpty(zzgdVar2.zzy());
                            byte[] zzbx3 = zzgdVar2.zzbx();
                            zzli zzliVar22 = zzamVar2.zzf.zzi;
                            zzal(zzliVar22);
                            long zzd22 = zzliVar22.zzd(zzbx3);
                            ContentValues contentValues22 = new ContentValues();
                            contentValues22.put("app_id", zzgdVar2.zzy());
                            contentValues22.put("metadata_fingerprint", Long.valueOf(zzd22));
                            contentValues22.put(TtmlNode.TAG_METADATA, zzbx3);
                            zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                            zzamVar3 = this.zze;
                            zzal(zzamVar3);
                            zzatVar = new zzat(zzarVar.zzf);
                            while (true) {
                                if (!zzatVar.hasNext()) {
                                    if ("_r".equals(zzatVar.next())) {
                                        break;
                                    }
                                } else {
                                    zzfv zzfvVar4 = this.zzc;
                                    zzal(zzfvVar4);
                                    boolean zzq = zzfvVar4.zzq(zzarVar.zza, zzarVar.zzb);
                                    zzam zzamVar20 = this.zze;
                                    zzal(zzamVar20);
                                    zzak zzl = zzamVar20.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                                    if (!zzq || zzl.zze >= zzg().zze(zzarVar.zza, zzeh.zzo)) {
                                        i6 = i72;
                                    }
                                }
                            }
                            zzamVar3.zzg();
                            zzamVar3.zzW();
                            Preconditions.checkNotNull(zzarVar);
                            Preconditions.checkNotEmpty(zzarVar.zza);
                            zzli zzliVar32 = zzamVar3.zzf.zzi;
                            zzal(zzliVar32);
                            byte[] zzbx22 = zzliVar32.zzj(zzarVar).zzbx();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", zzarVar.zza);
                            contentValues.put("name", zzarVar.zzb);
                            contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                            contentValues.put("metadata_fingerprint", Long.valueOf(zzd22));
                            contentValues.put("data", zzbx22);
                            contentValues.put("realtime", Integer.valueOf(i6));
                            if (zzamVar3.zzh().insert("raw_events", null, contentValues) != -1) {
                                zzamVar3.zzt.zzaA().zzd().zzb("Failed to insert raw event (got -1). appId", zzeu.zzn(zzarVar.zza));
                            } else {
                                this.zza = 0L;
                            }
                        } catch (IOException e6) {
                            zzaA().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", zzeu.zzn(zzu.zzaq()), e6);
                        }
                        zzam zzamVar162 = this.zze;
                        zzal(zzamVar162);
                        zzamVar162.zzC();
                        zzam zzamVar172 = this.zze;
                        zzal(zzamVar172);
                        zzamVar172.zzx();
                        zzag();
                        zzaA().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j6) + 500000) / 1000000));
                        return;
                    }
                    z = true;
                }
                zzg = zza.zzb.zzg("currency");
                if (z) {
                    str = str3;
                    longValue = zza.zzb.zze("value").longValue();
                } else {
                    double doubleValue = zza.zzb.zzd("value").doubleValue() * 1000000.0d;
                    if (doubleValue == 0.0d) {
                        str = str3;
                        doubleValue = zza.zzb.zze("value").longValue() * 1000000.0d;
                    } else {
                        str = str3;
                    }
                    if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                        zzaA().zzk().zzc("Data lost. Currency value is too big. appId", zzeu.zzn(str), Double.valueOf(doubleValue));
                        zzam zzamVar21 = this.zze;
                        zzal(zzamVar21);
                        zzamVar21.zzC();
                        return;
                    }
                    longValue = Math.round(doubleValue);
                    if (FirebaseAnalytics.Event.REFUND.equals(zza.zza)) {
                        longValue = -longValue;
                    }
                }
                if (!TextUtils.isEmpty(zzg)) {
                    String upperCase = zzg.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        String concat = "_ltv_".concat(String.valueOf(upperCase));
                        zzam zzamVar22 = this.zze;
                        zzal(zzamVar22);
                        String str6 = str;
                        zzll zzp2 = zzamVar22.zzp(str6, concat);
                        if (zzp2 != null) {
                            Object obj = zzp2.zze;
                            if (obj instanceof Long) {
                                i2 = 1;
                                i = 2;
                                str2 = "_err";
                                i3 = 0;
                                zzllVar = new zzll(str6, zza.zzc, concat, zzax().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + longValue));
                                str3 = str6;
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                if (!zzamVar.zzL(zzllVar)) {
                                    zzaA().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeu.zzn(str3), this.zzn.zzj().zzf(zzllVar.zzc), zzllVar.zze);
                                    zzv().zzO(this.zzF, str3, 9, null, null, 0);
                                }
                                boolean zzak2 = zzlo.zzak(zza.zza);
                                boolean equals2 = str2.equals(zza.zza);
                                zzv();
                                zzauVar = zza.zzb;
                                if (zzauVar == null) {
                                }
                                zzam zzamVar62 = this.zze;
                                zzal(zzamVar62);
                                long j72 = j;
                                String str52 = str3;
                                zzak zzm2 = zzamVar62.zzm(zza(), str52, j72 + 1, true, zzak2, false, equals2, false);
                                long j82 = zzm2.zzb;
                                zzg();
                                intValue = j82 - ((Integer) zzeh.zzk.zza(null)).intValue();
                                if (intValue > 0) {
                                }
                            }
                        }
                        i2 = 1;
                        i = 2;
                        str2 = "_err";
                        long j11 = longValue;
                        i3 = 0;
                        zzam zzamVar23 = this.zze;
                        zzal(zzamVar23);
                        int zze = zzg().zze(str6, zzeh.zzE) - 1;
                        Preconditions.checkNotEmpty(str6);
                        zzamVar23.zzg();
                        zzamVar23.zzW();
                        zzamVar23.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str6, str6, String.valueOf(zze)});
                        zzllVar = new zzll(str6, zza.zzc, concat, zzax().currentTimeMillis(), Long.valueOf(j11));
                        str3 = str6;
                        zzamVar = this.zze;
                        zzal(zzamVar);
                        if (!zzamVar.zzL(zzllVar)) {
                        }
                        boolean zzak22 = zzlo.zzak(zza.zza);
                        boolean equals22 = str2.equals(zza.zza);
                        zzv();
                        zzauVar = zza.zzb;
                        if (zzauVar == null) {
                        }
                        zzam zzamVar622 = this.zze;
                        zzal(zzamVar622);
                        long j722 = j;
                        String str522 = str3;
                        zzak zzm22 = zzamVar622.zzm(zza(), str522, j722 + 1, true, zzak22, false, equals22, false);
                        long j822 = zzm22.zzb;
                        zzg();
                        intValue = j822 - ((Integer) zzeh.zzk.zza(null)).intValue();
                        if (intValue > 0) {
                        }
                    }
                }
                i = 2;
                str2 = "_err";
                i2 = 1;
                str3 = str;
                i3 = 0;
                boolean zzak222 = zzlo.zzak(zza.zza);
                boolean equals222 = str2.equals(zza.zza);
                zzv();
                zzauVar = zza.zzb;
                if (zzauVar == null) {
                }
                zzam zzamVar6222 = this.zze;
                zzal(zzamVar6222);
                long j7222 = j;
                String str5222 = str3;
                zzak zzm222 = zzamVar6222.zzm(zza(), str5222, j7222 + 1, true, zzak222, false, equals222, false);
                long j8222 = zzm222.zzb;
                zzg();
                intValue = j8222 - ((Integer) zzeh.zzk.zza(null)).intValue();
                if (intValue > 0) {
                }
            }
            z = true;
            if (!"_iap".equals(zza.zza)) {
            }
            zzg = zza.zzb.zzg("currency");
            if (z) {
            }
            if (!TextUtils.isEmpty(zzg)) {
            }
            i = 2;
            str2 = "_err";
            i2 = 1;
            str3 = str;
            i3 = 0;
            boolean zzak2222 = zzlo.zzak(zza.zza);
            boolean equals2222 = str2.equals(zza.zza);
            zzv();
            zzauVar = zza.zzb;
            if (zzauVar == null) {
            }
            zzam zzamVar62222 = this.zze;
            zzal(zzamVar62222);
            long j72222 = j;
            String str52222 = str3;
            zzak zzm2222 = zzamVar62222.zzm(zza(), str52222, j72222 + 1, true, zzak2222, false, equals2222, false);
            long j82222 = zzm2222.zzb;
            zzg();
            intValue = j82222 - ((Integer) zzeh.zzk.zza(null)).intValue();
            if (intValue > 0) {
            }
        } finally {
            zzam zzamVar24 = this.zze;
            zzal(zzamVar24);
            zzamVar24.zzx();
        }
    }

    final boolean zzZ() {
        zzaB().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzaA().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzaw().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock tryLock = channel.tryLock();
            this.zzw = tryLock;
            if (tryLock != null) {
                zzaA().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzaA().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaA().zzd().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzaA().zzd().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzaA().zzk().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    final long zza() {
        long currentTimeMillis = zzax().currentTimeMillis();
        zzka zzkaVar = this.zzk;
        zzkaVar.zzW();
        zzkaVar.zzg();
        long zza = zzkaVar.zze.zza();
        if (zza == 0) {
            zza = zzkaVar.zzt.zzv().zzG().nextInt(86400000) + 1;
            zzkaVar.zze.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final zzeu zzaA() {
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzaA();
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final zzgb zzaB() {
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzaB();
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final Context zzaw() {
        return this.zzn.zzaw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final Clock zzax() {
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzax();
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final zzab zzay() {
        throw null;
    }

    final zzh zzd(zzq zzqVar) {
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzle zzleVar = null;
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzlf(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzj = zzamVar.zzj(zzqVar.zza);
        zzai zzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        String zzf = zzc.zzi(zzah.AD_STORAGE) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzj == null) {
            zzj = new zzh(this.zzn, zzqVar.zza);
            if (zzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzj.zzI(zzw(zzc));
            }
            if (zzc.zzi(zzah.AD_STORAGE)) {
                zzj.zzaf(zzf);
            }
        } else if (zzc.zzi(zzah.AD_STORAGE) && zzf != null && !zzf.equals(zzj.zzB())) {
            zzj.zzaf(zzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzc).first)) {
                zzj.zzI(zzw(zzc));
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzll zzllVar = new zzll(zzqVar.zza, "auto", "_lair", zzax().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzL(zzllVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzj.zzv()) && zzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzj.zzI(zzw(zzc));
        }
        zzj.zzX(zzqVar.zzb);
        zzj.zzG(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzj.zzW(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            zzj.zzY(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzj.zzK(zzqVar.zzc);
        }
        zzj.zzL(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzj.zzJ(str);
        }
        zzj.zzT(zzqVar.zzf);
        zzj.zzad(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzj.zzZ(zzqVar.zzg);
        }
        zzj.zzH(zzqVar.zzo);
        zzj.zzae(zzqVar.zzr);
        zzj.zzU(zzqVar.zzs);
        zzqr.zzc();
        if (zzg().zzs(null, zzeh.zzam) || zzg().zzs(zzqVar.zza, zzeh.zzao)) {
            zzj.zzah(zzqVar.zzx);
        }
        zzop.zzc();
        if (zzg().zzs(null, zzeh.zzal)) {
            zzj.zzag(zzqVar.zzt);
        } else {
            zzop.zzc();
            if (zzg().zzs(null, zzeh.zzak)) {
                zzj.zzag(null);
            }
        }
        zzra.zzc();
        if (zzg().zzs(null, zzeh.zzaq)) {
            zzj.zzai(zzqVar.zzy);
        }
        zzpw.zzc();
        if (zzg().zzs(null, zzeh.zzaE)) {
            zzj.zzaj(zzqVar.zzz);
        }
        if (zzj.zzam()) {
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzD(zzj);
        }
        return zzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    final zzai zzh(String str) {
        String str2;
        zzai zzaiVar = zzai.zza;
        zzaB().zzg();
        zzB();
        zzai zzaiVar2 = (zzai) this.zzB.get(str);
        if (zzaiVar2 != null) {
            return zzaiVar2;
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        zzamVar.zzg();
        zzamVar.zzW();
        Cursor cursor = null;
        try {
            try {
                cursor = zzamVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursor.moveToFirst()) {
                    str2 = cursor.getString(0);
                } else {
                    if (cursor != null) {
                        cursor.close();
                    }
                    str2 = "G1";
                }
                zzai zzb2 = zzai.zzb(str2);
                zzV(str, zzb2);
                return zzb2;
            } catch (SQLiteException e) {
                zzamVar.zzt.zzaA().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        return zzamVar;
    }

    public final zzep zzj() {
        return this.zzn.zzj();
    }

    public final zzfa zzl() {
        zzfa zzfaVar = this.zzd;
        zzal(zzfaVar);
        return zzfaVar;
    }

    public final zzfc zzm() {
        zzfc zzfcVar = this.zzf;
        if (zzfcVar != null) {
            return zzfcVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfv zzo() {
        zzfv zzfvVar = this.zzc;
        zzal(zzfvVar);
        return zzfvVar;
    }

    final zzge zzq() {
        return this.zzn;
    }

    public final zzio zzr() {
        zzio zzioVar = this.zzj;
        zzal(zzioVar);
        return zzioVar;
    }

    public final zzka zzs() {
        return this.zzk;
    }

    public final zzli zzu() {
        zzli zzliVar = this.zzi;
        zzal(zzliVar);
        return zzliVar;
    }

    public final zzlo zzv() {
        return ((zzge) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    final String zzw(zzai zzaiVar) {
        if (!zzaiVar.zzi(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String zzx(zzq zzqVar) {
        try {
            return (String) zzaB().zzh(new zzkz(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaA().zzd().zzc("Failed to get app instance id. appId", zzeu.zzn(zzqVar.zza), e);
            return null;
        }
    }

    final void zzz(Runnable runnable) {
        zzaB().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
