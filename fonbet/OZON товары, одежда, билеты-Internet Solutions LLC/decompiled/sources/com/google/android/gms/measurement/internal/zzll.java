package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
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
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzpj;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* loaded from: classes9.dex */
public final class zzll implements zzhf {
    private static volatile zzll zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zziw zzD;
    private String zzE;

    @VisibleForTesting
    long zza;
    private final zzgb zzc;
    private final zzfg zzd;
    private zzam zze;
    private zzfi zzf;
    private zzkx zzg;
    private zzaa zzh;
    private final zzln zzi;
    private zziu zzj;
    private zzkg zzk;
    private final zzla zzl;
    private zzfs zzm;
    private final zzgk zzn;
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
    private final zzls zzF = new zzlg(this);

    zzll(zzlm zzlmVar, zzgk zzgkVar) {
        Preconditions.checkNotNull(zzlmVar);
        this.zzn = zzgk.zzp(zzlmVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzla(this);
        zzln zzlnVar = new zzln(this);
        zzlnVar.zzX();
        this.zzi = zzlnVar;
        zzfg zzfgVar = new zzfg(this);
        zzfgVar.zzX();
        this.zzd = zzfgVar;
        zzgb zzgbVar = new zzgb(this);
        zzgbVar.zzX();
        this.zzc = zzgbVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaz().zzp(new zzlb(this, zzlmVar));
    }

    @VisibleForTesting
    static final void zzZ(com.google.android.gms.internal.measurement.zzfr zzfrVar, int i11, String str) {
        List zzp = zzfrVar.zzp();
        for (int i12 = 0; i12 < zzp.size(); i12++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfw) zzp.get(i12)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
        zze.zzj("_err");
        zze.zzi(i11);
        com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zze.zzaE();
        com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zze2.zzaE();
        zzfrVar.zzf(zzfwVar);
        zzfrVar.zzf(zzfwVar2);
    }

    @VisibleForTesting
    static final void zzaa(com.google.android.gms.internal.measurement.zzfr zzfrVar, @NonNull String str) {
        List zzp = zzfrVar.zzp();
        for (int i11 = 0; i11 < zzp.size(); i11++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfw) zzp.get(i11)).zzg())) {
                zzfrVar.zzh(i11);
                return;
            }
        }
    }

    private final zzq zzab(String str) {
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean zzac = zzac(zzj);
        if (zzac == null || zzac.booleanValue()) {
            return new zzq(str, zzj.zzy(), zzj.zzw(), zzj.zzb(), zzj.zzv(), zzj.zzm(), zzj.zzj(), (String) null, zzj.zzaj(), false, zzj.zzx(), zzj.zza(), 0L, 0, zzj.zzai(), false, zzj.zzr(), zzj.zzq(), zzj.zzk(), zzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null);
        }
        zzay().zzd().zzb("App version does not match; dropping. appId", zzfa.zzn(str));
        return null;
    }

    private final Boolean zzac(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionName;
                String zzw = zzhVar.zzw();
                if (zzw != null && zzw.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzad() {
        zzaz().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzay().zzj().zza("Stopping uploading service(s)");
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

    @VisibleForTesting
    private final void zzae(com.google.android.gms.internal.measurement.zzgb zzgbVar, long j11, boolean z11) {
        String str = true != z11 ? "_lte" : "_se";
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        zzlq zzp = zzamVar.zzp(zzgbVar.zzaq(), str);
        zzlq zzlqVar = (zzp == null || zzp.zze == null) ? new zzlq(zzgbVar.zzaq(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(j11)) : new zzlq(zzgbVar.zzaq(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(((Long) zzp.zze).longValue() + j11));
        com.google.android.gms.internal.measurement.zzgk zzd = com.google.android.gms.internal.measurement.zzgl.zzd();
        zzd.zzf(str);
        zzd.zzg(zzav().currentTimeMillis());
        zzd.zze(((Long) zzlqVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzd.zzaE();
        int zza = zzln.zza(zzgbVar, str);
        if (zza >= 0) {
            zzgbVar.zzan(zza, zzglVar);
        } else {
            zzgbVar.zzm(zzglVar);
        }
        if (j11 > 0) {
            zzam zzamVar2 = this.zze;
            zzak(zzamVar2);
            zzamVar2.zzL(zzlqVar);
            zzay().zzj().zzc("Updated engagement user property. scope, value", true != z11 ? "lifetime" : "session-scoped", zzlqVar.zze);
        }
    }

    private final void zzaf() {
        long max;
        long j11;
        zzaz().zzg();
        zzB();
        if (this.zza > 0) {
            long abs = 3600000 - Math.abs(zzav().elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzm().zzc();
                zzkx zzkxVar = this.zzg;
                zzak(zzkxVar);
                zzkxVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzah()) {
            zzay().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkx zzkxVar2 = this.zzg;
            zzak(zzkxVar2);
            zzkxVar2.zza();
            return;
        }
        long currentTimeMillis = zzav().currentTimeMillis();
        zzg();
        long max2 = Math.max(0L, ((Long) zzen.zzz.zza(null)).longValue());
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        boolean z11 = true;
        if (!zzamVar.zzH()) {
            zzam zzamVar2 = this.zze;
            zzak(zzamVar2);
            if (!zzamVar2.zzG()) {
                z11 = false;
            }
        }
        if (z11) {
            String zzl = zzg().zzl();
            if (TextUtils.isEmpty(zzl) || ".none.".equals(zzl)) {
                zzg();
                max = Math.max(0L, ((Long) zzen.zzt.zza(null)).longValue());
            } else {
                zzg();
                max = Math.max(0L, ((Long) zzen.zzu.zza(null)).longValue());
            }
        } else {
            zzg();
            max = Math.max(0L, ((Long) zzen.zzs.zza(null)).longValue());
        }
        long zza = this.zzk.zzc.zza();
        long zza2 = this.zzk.zzd.zza();
        zzam zzamVar3 = this.zze;
        zzak(zzamVar3);
        long j12 = 0;
        long zzd = zzamVar3.zzd();
        zzam zzamVar4 = this.zze;
        zzak(zzamVar4);
        boolean z12 = z11;
        long max3 = Math.max(zzd, zzamVar4.zze());
        if (max3 == 0) {
            j11 = 0;
        } else {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            long max4 = Math.max(currentTimeMillis - abs3, abs4);
            long j13 = max2 + abs2;
            if (z12 && max4 > 0) {
                j13 = Math.min(abs2, max4) + max;
            }
            zzln zzlnVar = this.zzi;
            zzak(zzlnVar);
            j11 = !zzlnVar.zzw(max4, max) ? max4 + max : j13;
            if (abs4 != 0 && abs4 >= abs2) {
                int i11 = 0;
                while (true) {
                    zzg();
                    if (i11 >= Math.min(20, Math.max(0, ((Integer) zzen.zzB.zza(null)).intValue()))) {
                        j11 = 0;
                        break;
                    }
                    zzg();
                    j11 += Math.max(j12, ((Long) zzen.zzA.zza(null)).longValue()) * (1 << i11);
                    if (j11 > abs4) {
                        break;
                    }
                    i11++;
                    j12 = 0;
                }
            }
            j12 = 0;
        }
        if (j11 == j12) {
            zzay().zzj().zza("Next upload time is 0");
            zzm().zzc();
            zzkx zzkxVar3 = this.zzg;
            zzak(zzkxVar3);
            zzkxVar3.zza();
            return;
        }
        zzfg zzfgVar = this.zzd;
        zzak(zzfgVar);
        if (!zzfgVar.zza()) {
            zzay().zzj().zza("No network");
            zzm().zzb();
            zzkx zzkxVar4 = this.zzg;
            zzak(zzkxVar4);
            zzkxVar4.zza();
            return;
        }
        long zza3 = this.zzk.zzb.zza();
        zzg();
        long max5 = Math.max(0L, ((Long) zzen.zzq.zza(null)).longValue());
        zzln zzlnVar2 = this.zzi;
        zzak(zzlnVar2);
        if (!zzlnVar2.zzw(zza3, max5)) {
            j11 = Math.max(j11, zza3 + max5);
        }
        zzm().zzc();
        long currentTimeMillis2 = j11 - zzav().currentTimeMillis();
        if (currentTimeMillis2 <= 0) {
            zzg();
            currentTimeMillis2 = Math.max(0L, ((Long) zzen.zzv.zza(null)).longValue());
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzay().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
        zzkx zzkxVar5 = this.zzg;
        zzak(zzkxVar5);
        zzkxVar5.zzd(currentTimeMillis2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:388:0x0b6e, code lost:
    
        if (r11 > (com.google.android.gms.measurement.internal.zzag.zzA() + r7)) goto L385;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04e2 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:25:0x054d, B:26:0x00f5, B:28:0x0103, B:31:0x0123, B:33:0x0129, B:35:0x013b, B:37:0x0149, B:39:0x0159, B:41:0x0166, B:46:0x016b, B:49:0x0184, B:65:0x03c4, B:66:0x03d0, B:69:0x03de, B:73:0x0401, B:74:0x03f0, B:83:0x0489, B:85:0x0495, B:88:0x04a8, B:90:0x04b9, B:92:0x04c5, B:95:0x0537, B:101:0x04e2, B:103:0x04ee, B:106:0x0501, B:108:0x0512, B:110:0x051e, B:114:0x040d, B:116:0x0419, B:118:0x0425, B:123:0x046b, B:124:0x0443, B:127:0x0455, B:129:0x045b, B:131:0x0465, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x024a, B:144:0x021a, B:146:0x022a, B:154:0x0253, B:156:0x0284, B:157:0x02ae, B:159:0x02e6, B:160:0x02ed, B:163:0x02f9, B:165:0x0334, B:166:0x034f, B:168:0x0355, B:170:0x0365, B:172:0x037d, B:173:0x036d, B:183:0x0386, B:186:0x038e, B:187:0x03a6, B:203:0x055f, B:205:0x056d, B:207:0x0578, B:209:0x05ad, B:210:0x0582, B:212:0x058d, B:214:0x0593, B:216:0x059f, B:218:0x05a7, B:221:0x05b0, B:222:0x05bc, B:225:0x05c4, B:228:0x05d6, B:229:0x05e2, B:231:0x05ea, B:232:0x060f, B:234:0x0634, B:236:0x0645, B:238:0x064b, B:240:0x0657, B:241:0x0686, B:243:0x068c, B:247:0x069a, B:245:0x069e, B:249:0x06a1, B:250:0x06a4, B:251:0x06b2, B:253:0x06b8, B:255:0x06c8, B:256:0x06cf, B:258:0x06db, B:260:0x06e2, B:263:0x06e5, B:265:0x0723, B:266:0x0736, B:268:0x073c, B:271:0x0757, B:273:0x0772, B:275:0x0789, B:277:0x078e, B:279:0x0792, B:281:0x0796, B:283:0x07a0, B:284:0x07aa, B:286:0x07ae, B:288:0x07b4, B:289:0x07c2, B:290:0x07cb, B:293:0x0a00, B:294:0x07d8, B:360:0x07ef, B:297:0x0809, B:299:0x082e, B:300:0x0836, B:302:0x083c, B:306:0x084e, B:309:0x0864, B:311:0x087a, B:313:0x089f, B:315:0x08ab, B:317:0x08c0, B:318:0x08fc, B:323:0x0918, B:325:0x0923, B:327:0x0927, B:329:0x092b, B:331:0x092f, B:332:0x093b, B:333:0x0940, B:335:0x0946, B:337:0x095e, B:338:0x0963, B:339:0x09fd, B:341:0x097a, B:343:0x097e, B:346:0x09a9, B:348:0x09d1, B:349:0x09d8, B:353:0x09ee, B:354:0x098f, B:363:0x07f5, B:365:0x0a0a, B:367:0x0a18, B:368:0x0a1e, B:369:0x0a26, B:371:0x0a2c, B:374:0x0a46, B:376:0x0a57, B:377:0x0ac7, B:379:0x0acd, B:381:0x0ae5, B:384:0x0aec, B:385:0x0b1b, B:387:0x0b5e, B:389:0x0b93, B:391:0x0b97, B:392:0x0ba2, B:394:0x0be5, B:396:0x0bf2, B:398:0x0c01, B:401:0x0c1a, B:404:0x0c33, B:405:0x0b70, B:406:0x0af4, B:408:0x0b00, B:409:0x0b04, B:410:0x0c4a, B:411:0x0c62, B:414:0x0c6a, B:416:0x0c6f, B:419:0x0c7f, B:421:0x0c99, B:422:0x0cb4, B:424:0x0cbd, B:425:0x0cdb, B:431:0x0cc8, B:432:0x0a6f, B:434:0x0a75, B:436:0x0a7d, B:437:0x0a84, B:442:0x0a92, B:443:0x0a99, B:445:0x0ab8, B:446:0x0abf, B:447:0x0abc, B:448:0x0a96, B:450:0x0a81, B:452:0x05ef, B:454:0x05f5, B:457:0x0cee), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x082e A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:25:0x054d, B:26:0x00f5, B:28:0x0103, B:31:0x0123, B:33:0x0129, B:35:0x013b, B:37:0x0149, B:39:0x0159, B:41:0x0166, B:46:0x016b, B:49:0x0184, B:65:0x03c4, B:66:0x03d0, B:69:0x03de, B:73:0x0401, B:74:0x03f0, B:83:0x0489, B:85:0x0495, B:88:0x04a8, B:90:0x04b9, B:92:0x04c5, B:95:0x0537, B:101:0x04e2, B:103:0x04ee, B:106:0x0501, B:108:0x0512, B:110:0x051e, B:114:0x040d, B:116:0x0419, B:118:0x0425, B:123:0x046b, B:124:0x0443, B:127:0x0455, B:129:0x045b, B:131:0x0465, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x024a, B:144:0x021a, B:146:0x022a, B:154:0x0253, B:156:0x0284, B:157:0x02ae, B:159:0x02e6, B:160:0x02ed, B:163:0x02f9, B:165:0x0334, B:166:0x034f, B:168:0x0355, B:170:0x0365, B:172:0x037d, B:173:0x036d, B:183:0x0386, B:186:0x038e, B:187:0x03a6, B:203:0x055f, B:205:0x056d, B:207:0x0578, B:209:0x05ad, B:210:0x0582, B:212:0x058d, B:214:0x0593, B:216:0x059f, B:218:0x05a7, B:221:0x05b0, B:222:0x05bc, B:225:0x05c4, B:228:0x05d6, B:229:0x05e2, B:231:0x05ea, B:232:0x060f, B:234:0x0634, B:236:0x0645, B:238:0x064b, B:240:0x0657, B:241:0x0686, B:243:0x068c, B:247:0x069a, B:245:0x069e, B:249:0x06a1, B:250:0x06a4, B:251:0x06b2, B:253:0x06b8, B:255:0x06c8, B:256:0x06cf, B:258:0x06db, B:260:0x06e2, B:263:0x06e5, B:265:0x0723, B:266:0x0736, B:268:0x073c, B:271:0x0757, B:273:0x0772, B:275:0x0789, B:277:0x078e, B:279:0x0792, B:281:0x0796, B:283:0x07a0, B:284:0x07aa, B:286:0x07ae, B:288:0x07b4, B:289:0x07c2, B:290:0x07cb, B:293:0x0a00, B:294:0x07d8, B:360:0x07ef, B:297:0x0809, B:299:0x082e, B:300:0x0836, B:302:0x083c, B:306:0x084e, B:309:0x0864, B:311:0x087a, B:313:0x089f, B:315:0x08ab, B:317:0x08c0, B:318:0x08fc, B:323:0x0918, B:325:0x0923, B:327:0x0927, B:329:0x092b, B:331:0x092f, B:332:0x093b, B:333:0x0940, B:335:0x0946, B:337:0x095e, B:338:0x0963, B:339:0x09fd, B:341:0x097a, B:343:0x097e, B:346:0x09a9, B:348:0x09d1, B:349:0x09d8, B:353:0x09ee, B:354:0x098f, B:363:0x07f5, B:365:0x0a0a, B:367:0x0a18, B:368:0x0a1e, B:369:0x0a26, B:371:0x0a2c, B:374:0x0a46, B:376:0x0a57, B:377:0x0ac7, B:379:0x0acd, B:381:0x0ae5, B:384:0x0aec, B:385:0x0b1b, B:387:0x0b5e, B:389:0x0b93, B:391:0x0b97, B:392:0x0ba2, B:394:0x0be5, B:396:0x0bf2, B:398:0x0c01, B:401:0x0c1a, B:404:0x0c33, B:405:0x0b70, B:406:0x0af4, B:408:0x0b00, B:409:0x0b04, B:410:0x0c4a, B:411:0x0c62, B:414:0x0c6a, B:416:0x0c6f, B:419:0x0c7f, B:421:0x0c99, B:422:0x0cb4, B:424:0x0cbd, B:425:0x0cdb, B:431:0x0cc8, B:432:0x0a6f, B:434:0x0a75, B:436:0x0a7d, B:437:0x0a84, B:442:0x0a92, B:443:0x0a99, B:445:0x0ab8, B:446:0x0abf, B:447:0x0abc, B:448:0x0a96, B:450:0x0a81, B:452:0x05ef, B:454:0x05f5, B:457:0x0cee), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x087a A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:25:0x054d, B:26:0x00f5, B:28:0x0103, B:31:0x0123, B:33:0x0129, B:35:0x013b, B:37:0x0149, B:39:0x0159, B:41:0x0166, B:46:0x016b, B:49:0x0184, B:65:0x03c4, B:66:0x03d0, B:69:0x03de, B:73:0x0401, B:74:0x03f0, B:83:0x0489, B:85:0x0495, B:88:0x04a8, B:90:0x04b9, B:92:0x04c5, B:95:0x0537, B:101:0x04e2, B:103:0x04ee, B:106:0x0501, B:108:0x0512, B:110:0x051e, B:114:0x040d, B:116:0x0419, B:118:0x0425, B:123:0x046b, B:124:0x0443, B:127:0x0455, B:129:0x045b, B:131:0x0465, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x024a, B:144:0x021a, B:146:0x022a, B:154:0x0253, B:156:0x0284, B:157:0x02ae, B:159:0x02e6, B:160:0x02ed, B:163:0x02f9, B:165:0x0334, B:166:0x034f, B:168:0x0355, B:170:0x0365, B:172:0x037d, B:173:0x036d, B:183:0x0386, B:186:0x038e, B:187:0x03a6, B:203:0x055f, B:205:0x056d, B:207:0x0578, B:209:0x05ad, B:210:0x0582, B:212:0x058d, B:214:0x0593, B:216:0x059f, B:218:0x05a7, B:221:0x05b0, B:222:0x05bc, B:225:0x05c4, B:228:0x05d6, B:229:0x05e2, B:231:0x05ea, B:232:0x060f, B:234:0x0634, B:236:0x0645, B:238:0x064b, B:240:0x0657, B:241:0x0686, B:243:0x068c, B:247:0x069a, B:245:0x069e, B:249:0x06a1, B:250:0x06a4, B:251:0x06b2, B:253:0x06b8, B:255:0x06c8, B:256:0x06cf, B:258:0x06db, B:260:0x06e2, B:263:0x06e5, B:265:0x0723, B:266:0x0736, B:268:0x073c, B:271:0x0757, B:273:0x0772, B:275:0x0789, B:277:0x078e, B:279:0x0792, B:281:0x0796, B:283:0x07a0, B:284:0x07aa, B:286:0x07ae, B:288:0x07b4, B:289:0x07c2, B:290:0x07cb, B:293:0x0a00, B:294:0x07d8, B:360:0x07ef, B:297:0x0809, B:299:0x082e, B:300:0x0836, B:302:0x083c, B:306:0x084e, B:309:0x0864, B:311:0x087a, B:313:0x089f, B:315:0x08ab, B:317:0x08c0, B:318:0x08fc, B:323:0x0918, B:325:0x0923, B:327:0x0927, B:329:0x092b, B:331:0x092f, B:332:0x093b, B:333:0x0940, B:335:0x0946, B:337:0x095e, B:338:0x0963, B:339:0x09fd, B:341:0x097a, B:343:0x097e, B:346:0x09a9, B:348:0x09d1, B:349:0x09d8, B:353:0x09ee, B:354:0x098f, B:363:0x07f5, B:365:0x0a0a, B:367:0x0a18, B:368:0x0a1e, B:369:0x0a26, B:371:0x0a2c, B:374:0x0a46, B:376:0x0a57, B:377:0x0ac7, B:379:0x0acd, B:381:0x0ae5, B:384:0x0aec, B:385:0x0b1b, B:387:0x0b5e, B:389:0x0b93, B:391:0x0b97, B:392:0x0ba2, B:394:0x0be5, B:396:0x0bf2, B:398:0x0c01, B:401:0x0c1a, B:404:0x0c33, B:405:0x0b70, B:406:0x0af4, B:408:0x0b00, B:409:0x0b04, B:410:0x0c4a, B:411:0x0c62, B:414:0x0c6a, B:416:0x0c6f, B:419:0x0c7f, B:421:0x0c99, B:422:0x0cb4, B:424:0x0cbd, B:425:0x0cdb, B:431:0x0cc8, B:432:0x0a6f, B:434:0x0a75, B:436:0x0a7d, B:437:0x0a84, B:442:0x0a92, B:443:0x0a99, B:445:0x0ab8, B:446:0x0abf, B:447:0x0abc, B:448:0x0a96, B:450:0x0a81, B:452:0x05ef, B:454:0x05f5, B:457:0x0cee), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x089f A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:25:0x054d, B:26:0x00f5, B:28:0x0103, B:31:0x0123, B:33:0x0129, B:35:0x013b, B:37:0x0149, B:39:0x0159, B:41:0x0166, B:46:0x016b, B:49:0x0184, B:65:0x03c4, B:66:0x03d0, B:69:0x03de, B:73:0x0401, B:74:0x03f0, B:83:0x0489, B:85:0x0495, B:88:0x04a8, B:90:0x04b9, B:92:0x04c5, B:95:0x0537, B:101:0x04e2, B:103:0x04ee, B:106:0x0501, B:108:0x0512, B:110:0x051e, B:114:0x040d, B:116:0x0419, B:118:0x0425, B:123:0x046b, B:124:0x0443, B:127:0x0455, B:129:0x045b, B:131:0x0465, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x024a, B:144:0x021a, B:146:0x022a, B:154:0x0253, B:156:0x0284, B:157:0x02ae, B:159:0x02e6, B:160:0x02ed, B:163:0x02f9, B:165:0x0334, B:166:0x034f, B:168:0x0355, B:170:0x0365, B:172:0x037d, B:173:0x036d, B:183:0x0386, B:186:0x038e, B:187:0x03a6, B:203:0x055f, B:205:0x056d, B:207:0x0578, B:209:0x05ad, B:210:0x0582, B:212:0x058d, B:214:0x0593, B:216:0x059f, B:218:0x05a7, B:221:0x05b0, B:222:0x05bc, B:225:0x05c4, B:228:0x05d6, B:229:0x05e2, B:231:0x05ea, B:232:0x060f, B:234:0x0634, B:236:0x0645, B:238:0x064b, B:240:0x0657, B:241:0x0686, B:243:0x068c, B:247:0x069a, B:245:0x069e, B:249:0x06a1, B:250:0x06a4, B:251:0x06b2, B:253:0x06b8, B:255:0x06c8, B:256:0x06cf, B:258:0x06db, B:260:0x06e2, B:263:0x06e5, B:265:0x0723, B:266:0x0736, B:268:0x073c, B:271:0x0757, B:273:0x0772, B:275:0x0789, B:277:0x078e, B:279:0x0792, B:281:0x0796, B:283:0x07a0, B:284:0x07aa, B:286:0x07ae, B:288:0x07b4, B:289:0x07c2, B:290:0x07cb, B:293:0x0a00, B:294:0x07d8, B:360:0x07ef, B:297:0x0809, B:299:0x082e, B:300:0x0836, B:302:0x083c, B:306:0x084e, B:309:0x0864, B:311:0x087a, B:313:0x089f, B:315:0x08ab, B:317:0x08c0, B:318:0x08fc, B:323:0x0918, B:325:0x0923, B:327:0x0927, B:329:0x092b, B:331:0x092f, B:332:0x093b, B:333:0x0940, B:335:0x0946, B:337:0x095e, B:338:0x0963, B:339:0x09fd, B:341:0x097a, B:343:0x097e, B:346:0x09a9, B:348:0x09d1, B:349:0x09d8, B:353:0x09ee, B:354:0x098f, B:363:0x07f5, B:365:0x0a0a, B:367:0x0a18, B:368:0x0a1e, B:369:0x0a26, B:371:0x0a2c, B:374:0x0a46, B:376:0x0a57, B:377:0x0ac7, B:379:0x0acd, B:381:0x0ae5, B:384:0x0aec, B:385:0x0b1b, B:387:0x0b5e, B:389:0x0b93, B:391:0x0b97, B:392:0x0ba2, B:394:0x0be5, B:396:0x0bf2, B:398:0x0c01, B:401:0x0c1a, B:404:0x0c33, B:405:0x0b70, B:406:0x0af4, B:408:0x0b00, B:409:0x0b04, B:410:0x0c4a, B:411:0x0c62, B:414:0x0c6a, B:416:0x0c6f, B:419:0x0c7f, B:421:0x0c99, B:422:0x0cb4, B:424:0x0cbd, B:425:0x0cdb, B:431:0x0cc8, B:432:0x0a6f, B:434:0x0a75, B:436:0x0a7d, B:437:0x0a84, B:442:0x0a92, B:443:0x0a99, B:445:0x0ab8, B:446:0x0abf, B:447:0x0abc, B:448:0x0a96, B:450:0x0a81, B:452:0x05ef, B:454:0x05f5, B:457:0x0cee), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0b5e A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:25:0x054d, B:26:0x00f5, B:28:0x0103, B:31:0x0123, B:33:0x0129, B:35:0x013b, B:37:0x0149, B:39:0x0159, B:41:0x0166, B:46:0x016b, B:49:0x0184, B:65:0x03c4, B:66:0x03d0, B:69:0x03de, B:73:0x0401, B:74:0x03f0, B:83:0x0489, B:85:0x0495, B:88:0x04a8, B:90:0x04b9, B:92:0x04c5, B:95:0x0537, B:101:0x04e2, B:103:0x04ee, B:106:0x0501, B:108:0x0512, B:110:0x051e, B:114:0x040d, B:116:0x0419, B:118:0x0425, B:123:0x046b, B:124:0x0443, B:127:0x0455, B:129:0x045b, B:131:0x0465, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x024a, B:144:0x021a, B:146:0x022a, B:154:0x0253, B:156:0x0284, B:157:0x02ae, B:159:0x02e6, B:160:0x02ed, B:163:0x02f9, B:165:0x0334, B:166:0x034f, B:168:0x0355, B:170:0x0365, B:172:0x037d, B:173:0x036d, B:183:0x0386, B:186:0x038e, B:187:0x03a6, B:203:0x055f, B:205:0x056d, B:207:0x0578, B:209:0x05ad, B:210:0x0582, B:212:0x058d, B:214:0x0593, B:216:0x059f, B:218:0x05a7, B:221:0x05b0, B:222:0x05bc, B:225:0x05c4, B:228:0x05d6, B:229:0x05e2, B:231:0x05ea, B:232:0x060f, B:234:0x0634, B:236:0x0645, B:238:0x064b, B:240:0x0657, B:241:0x0686, B:243:0x068c, B:247:0x069a, B:245:0x069e, B:249:0x06a1, B:250:0x06a4, B:251:0x06b2, B:253:0x06b8, B:255:0x06c8, B:256:0x06cf, B:258:0x06db, B:260:0x06e2, B:263:0x06e5, B:265:0x0723, B:266:0x0736, B:268:0x073c, B:271:0x0757, B:273:0x0772, B:275:0x0789, B:277:0x078e, B:279:0x0792, B:281:0x0796, B:283:0x07a0, B:284:0x07aa, B:286:0x07ae, B:288:0x07b4, B:289:0x07c2, B:290:0x07cb, B:293:0x0a00, B:294:0x07d8, B:360:0x07ef, B:297:0x0809, B:299:0x082e, B:300:0x0836, B:302:0x083c, B:306:0x084e, B:309:0x0864, B:311:0x087a, B:313:0x089f, B:315:0x08ab, B:317:0x08c0, B:318:0x08fc, B:323:0x0918, B:325:0x0923, B:327:0x0927, B:329:0x092b, B:331:0x092f, B:332:0x093b, B:333:0x0940, B:335:0x0946, B:337:0x095e, B:338:0x0963, B:339:0x09fd, B:341:0x097a, B:343:0x097e, B:346:0x09a9, B:348:0x09d1, B:349:0x09d8, B:353:0x09ee, B:354:0x098f, B:363:0x07f5, B:365:0x0a0a, B:367:0x0a18, B:368:0x0a1e, B:369:0x0a26, B:371:0x0a2c, B:374:0x0a46, B:376:0x0a57, B:377:0x0ac7, B:379:0x0acd, B:381:0x0ae5, B:384:0x0aec, B:385:0x0b1b, B:387:0x0b5e, B:389:0x0b93, B:391:0x0b97, B:392:0x0ba2, B:394:0x0be5, B:396:0x0bf2, B:398:0x0c01, B:401:0x0c1a, B:404:0x0c33, B:405:0x0b70, B:406:0x0af4, B:408:0x0b00, B:409:0x0b04, B:410:0x0c4a, B:411:0x0c62, B:414:0x0c6a, B:416:0x0c6f, B:419:0x0c7f, B:421:0x0c99, B:422:0x0cb4, B:424:0x0cbd, B:425:0x0cdb, B:431:0x0cc8, B:432:0x0a6f, B:434:0x0a75, B:436:0x0a7d, B:437:0x0a84, B:442:0x0a92, B:443:0x0a99, B:445:0x0ab8, B:446:0x0abf, B:447:0x0abc, B:448:0x0a96, B:450:0x0a81, B:452:0x05ef, B:454:0x05f5, B:457:0x0cee), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0be5 A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:25:0x054d, B:26:0x00f5, B:28:0x0103, B:31:0x0123, B:33:0x0129, B:35:0x013b, B:37:0x0149, B:39:0x0159, B:41:0x0166, B:46:0x016b, B:49:0x0184, B:65:0x03c4, B:66:0x03d0, B:69:0x03de, B:73:0x0401, B:74:0x03f0, B:83:0x0489, B:85:0x0495, B:88:0x04a8, B:90:0x04b9, B:92:0x04c5, B:95:0x0537, B:101:0x04e2, B:103:0x04ee, B:106:0x0501, B:108:0x0512, B:110:0x051e, B:114:0x040d, B:116:0x0419, B:118:0x0425, B:123:0x046b, B:124:0x0443, B:127:0x0455, B:129:0x045b, B:131:0x0465, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x024a, B:144:0x021a, B:146:0x022a, B:154:0x0253, B:156:0x0284, B:157:0x02ae, B:159:0x02e6, B:160:0x02ed, B:163:0x02f9, B:165:0x0334, B:166:0x034f, B:168:0x0355, B:170:0x0365, B:172:0x037d, B:173:0x036d, B:183:0x0386, B:186:0x038e, B:187:0x03a6, B:203:0x055f, B:205:0x056d, B:207:0x0578, B:209:0x05ad, B:210:0x0582, B:212:0x058d, B:214:0x0593, B:216:0x059f, B:218:0x05a7, B:221:0x05b0, B:222:0x05bc, B:225:0x05c4, B:228:0x05d6, B:229:0x05e2, B:231:0x05ea, B:232:0x060f, B:234:0x0634, B:236:0x0645, B:238:0x064b, B:240:0x0657, B:241:0x0686, B:243:0x068c, B:247:0x069a, B:245:0x069e, B:249:0x06a1, B:250:0x06a4, B:251:0x06b2, B:253:0x06b8, B:255:0x06c8, B:256:0x06cf, B:258:0x06db, B:260:0x06e2, B:263:0x06e5, B:265:0x0723, B:266:0x0736, B:268:0x073c, B:271:0x0757, B:273:0x0772, B:275:0x0789, B:277:0x078e, B:279:0x0792, B:281:0x0796, B:283:0x07a0, B:284:0x07aa, B:286:0x07ae, B:288:0x07b4, B:289:0x07c2, B:290:0x07cb, B:293:0x0a00, B:294:0x07d8, B:360:0x07ef, B:297:0x0809, B:299:0x082e, B:300:0x0836, B:302:0x083c, B:306:0x084e, B:309:0x0864, B:311:0x087a, B:313:0x089f, B:315:0x08ab, B:317:0x08c0, B:318:0x08fc, B:323:0x0918, B:325:0x0923, B:327:0x0927, B:329:0x092b, B:331:0x092f, B:332:0x093b, B:333:0x0940, B:335:0x0946, B:337:0x095e, B:338:0x0963, B:339:0x09fd, B:341:0x097a, B:343:0x097e, B:346:0x09a9, B:348:0x09d1, B:349:0x09d8, B:353:0x09ee, B:354:0x098f, B:363:0x07f5, B:365:0x0a0a, B:367:0x0a18, B:368:0x0a1e, B:369:0x0a26, B:371:0x0a2c, B:374:0x0a46, B:376:0x0a57, B:377:0x0ac7, B:379:0x0acd, B:381:0x0ae5, B:384:0x0aec, B:385:0x0b1b, B:387:0x0b5e, B:389:0x0b93, B:391:0x0b97, B:392:0x0ba2, B:394:0x0be5, B:396:0x0bf2, B:398:0x0c01, B:401:0x0c1a, B:404:0x0c33, B:405:0x0b70, B:406:0x0af4, B:408:0x0b00, B:409:0x0b04, B:410:0x0c4a, B:411:0x0c62, B:414:0x0c6a, B:416:0x0c6f, B:419:0x0c7f, B:421:0x0c99, B:422:0x0cb4, B:424:0x0cbd, B:425:0x0cdb, B:431:0x0cc8, B:432:0x0a6f, B:434:0x0a75, B:436:0x0a7d, B:437:0x0a84, B:442:0x0a92, B:443:0x0a99, B:445:0x0ab8, B:446:0x0abf, B:447:0x0abc, B:448:0x0a96, B:450:0x0a81, B:452:0x05ef, B:454:0x05f5, B:457:0x0cee), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0c01 A[Catch: all -> 0x00e6, SQLiteException -> 0x0c19, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0c19, blocks: (B:396:0x0bf2, B:398:0x0c01), top: B:395:0x0bf2, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03c4 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:25:0x054d, B:26:0x00f5, B:28:0x0103, B:31:0x0123, B:33:0x0129, B:35:0x013b, B:37:0x0149, B:39:0x0159, B:41:0x0166, B:46:0x016b, B:49:0x0184, B:65:0x03c4, B:66:0x03d0, B:69:0x03de, B:73:0x0401, B:74:0x03f0, B:83:0x0489, B:85:0x0495, B:88:0x04a8, B:90:0x04b9, B:92:0x04c5, B:95:0x0537, B:101:0x04e2, B:103:0x04ee, B:106:0x0501, B:108:0x0512, B:110:0x051e, B:114:0x040d, B:116:0x0419, B:118:0x0425, B:123:0x046b, B:124:0x0443, B:127:0x0455, B:129:0x045b, B:131:0x0465, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x024a, B:144:0x021a, B:146:0x022a, B:154:0x0253, B:156:0x0284, B:157:0x02ae, B:159:0x02e6, B:160:0x02ed, B:163:0x02f9, B:165:0x0334, B:166:0x034f, B:168:0x0355, B:170:0x0365, B:172:0x037d, B:173:0x036d, B:183:0x0386, B:186:0x038e, B:187:0x03a6, B:203:0x055f, B:205:0x056d, B:207:0x0578, B:209:0x05ad, B:210:0x0582, B:212:0x058d, B:214:0x0593, B:216:0x059f, B:218:0x05a7, B:221:0x05b0, B:222:0x05bc, B:225:0x05c4, B:228:0x05d6, B:229:0x05e2, B:231:0x05ea, B:232:0x060f, B:234:0x0634, B:236:0x0645, B:238:0x064b, B:240:0x0657, B:241:0x0686, B:243:0x068c, B:247:0x069a, B:245:0x069e, B:249:0x06a1, B:250:0x06a4, B:251:0x06b2, B:253:0x06b8, B:255:0x06c8, B:256:0x06cf, B:258:0x06db, B:260:0x06e2, B:263:0x06e5, B:265:0x0723, B:266:0x0736, B:268:0x073c, B:271:0x0757, B:273:0x0772, B:275:0x0789, B:277:0x078e, B:279:0x0792, B:281:0x0796, B:283:0x07a0, B:284:0x07aa, B:286:0x07ae, B:288:0x07b4, B:289:0x07c2, B:290:0x07cb, B:293:0x0a00, B:294:0x07d8, B:360:0x07ef, B:297:0x0809, B:299:0x082e, B:300:0x0836, B:302:0x083c, B:306:0x084e, B:309:0x0864, B:311:0x087a, B:313:0x089f, B:315:0x08ab, B:317:0x08c0, B:318:0x08fc, B:323:0x0918, B:325:0x0923, B:327:0x0927, B:329:0x092b, B:331:0x092f, B:332:0x093b, B:333:0x0940, B:335:0x0946, B:337:0x095e, B:338:0x0963, B:339:0x09fd, B:341:0x097a, B:343:0x097e, B:346:0x09a9, B:348:0x09d1, B:349:0x09d8, B:353:0x09ee, B:354:0x098f, B:363:0x07f5, B:365:0x0a0a, B:367:0x0a18, B:368:0x0a1e, B:369:0x0a26, B:371:0x0a2c, B:374:0x0a46, B:376:0x0a57, B:377:0x0ac7, B:379:0x0acd, B:381:0x0ae5, B:384:0x0aec, B:385:0x0b1b, B:387:0x0b5e, B:389:0x0b93, B:391:0x0b97, B:392:0x0ba2, B:394:0x0be5, B:396:0x0bf2, B:398:0x0c01, B:401:0x0c1a, B:404:0x0c33, B:405:0x0b70, B:406:0x0af4, B:408:0x0b00, B:409:0x0b04, B:410:0x0c4a, B:411:0x0c62, B:414:0x0c6a, B:416:0x0c6f, B:419:0x0c7f, B:421:0x0c99, B:422:0x0cb4, B:424:0x0cbd, B:425:0x0cdb, B:431:0x0cc8, B:432:0x0a6f, B:434:0x0a75, B:436:0x0a7d, B:437:0x0a84, B:442:0x0a92, B:443:0x0a99, B:445:0x0ab8, B:446:0x0abf, B:447:0x0abc, B:448:0x0a96, B:450:0x0a81, B:452:0x05ef, B:454:0x05f5, B:457:0x0cee), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0495 A[Catch: all -> 0x00e6, TryCatch #2 {all -> 0x00e6, blocks: (B:3:0x000e, B:5:0x0025, B:8:0x002d, B:9:0x003f, B:12:0x0051, B:15:0x0078, B:17:0x00ae, B:20:0x00c0, B:22:0x00ca, B:25:0x054d, B:26:0x00f5, B:28:0x0103, B:31:0x0123, B:33:0x0129, B:35:0x013b, B:37:0x0149, B:39:0x0159, B:41:0x0166, B:46:0x016b, B:49:0x0184, B:65:0x03c4, B:66:0x03d0, B:69:0x03de, B:73:0x0401, B:74:0x03f0, B:83:0x0489, B:85:0x0495, B:88:0x04a8, B:90:0x04b9, B:92:0x04c5, B:95:0x0537, B:101:0x04e2, B:103:0x04ee, B:106:0x0501, B:108:0x0512, B:110:0x051e, B:114:0x040d, B:116:0x0419, B:118:0x0425, B:123:0x046b, B:124:0x0443, B:127:0x0455, B:129:0x045b, B:131:0x0465, B:136:0x01e4, B:139:0x01ee, B:141:0x01fc, B:143:0x024a, B:144:0x021a, B:146:0x022a, B:154:0x0253, B:156:0x0284, B:157:0x02ae, B:159:0x02e6, B:160:0x02ed, B:163:0x02f9, B:165:0x0334, B:166:0x034f, B:168:0x0355, B:170:0x0365, B:172:0x037d, B:173:0x036d, B:183:0x0386, B:186:0x038e, B:187:0x03a6, B:203:0x055f, B:205:0x056d, B:207:0x0578, B:209:0x05ad, B:210:0x0582, B:212:0x058d, B:214:0x0593, B:216:0x059f, B:218:0x05a7, B:221:0x05b0, B:222:0x05bc, B:225:0x05c4, B:228:0x05d6, B:229:0x05e2, B:231:0x05ea, B:232:0x060f, B:234:0x0634, B:236:0x0645, B:238:0x064b, B:240:0x0657, B:241:0x0686, B:243:0x068c, B:247:0x069a, B:245:0x069e, B:249:0x06a1, B:250:0x06a4, B:251:0x06b2, B:253:0x06b8, B:255:0x06c8, B:256:0x06cf, B:258:0x06db, B:260:0x06e2, B:263:0x06e5, B:265:0x0723, B:266:0x0736, B:268:0x073c, B:271:0x0757, B:273:0x0772, B:275:0x0789, B:277:0x078e, B:279:0x0792, B:281:0x0796, B:283:0x07a0, B:284:0x07aa, B:286:0x07ae, B:288:0x07b4, B:289:0x07c2, B:290:0x07cb, B:293:0x0a00, B:294:0x07d8, B:360:0x07ef, B:297:0x0809, B:299:0x082e, B:300:0x0836, B:302:0x083c, B:306:0x084e, B:309:0x0864, B:311:0x087a, B:313:0x089f, B:315:0x08ab, B:317:0x08c0, B:318:0x08fc, B:323:0x0918, B:325:0x0923, B:327:0x0927, B:329:0x092b, B:331:0x092f, B:332:0x093b, B:333:0x0940, B:335:0x0946, B:337:0x095e, B:338:0x0963, B:339:0x09fd, B:341:0x097a, B:343:0x097e, B:346:0x09a9, B:348:0x09d1, B:349:0x09d8, B:353:0x09ee, B:354:0x098f, B:363:0x07f5, B:365:0x0a0a, B:367:0x0a18, B:368:0x0a1e, B:369:0x0a26, B:371:0x0a2c, B:374:0x0a46, B:376:0x0a57, B:377:0x0ac7, B:379:0x0acd, B:381:0x0ae5, B:384:0x0aec, B:385:0x0b1b, B:387:0x0b5e, B:389:0x0b93, B:391:0x0b97, B:392:0x0ba2, B:394:0x0be5, B:396:0x0bf2, B:398:0x0c01, B:401:0x0c1a, B:404:0x0c33, B:405:0x0b70, B:406:0x0af4, B:408:0x0b00, B:409:0x0b04, B:410:0x0c4a, B:411:0x0c62, B:414:0x0c6a, B:416:0x0c6f, B:419:0x0c7f, B:421:0x0c99, B:422:0x0cb4, B:424:0x0cbd, B:425:0x0cdb, B:431:0x0cc8, B:432:0x0a6f, B:434:0x0a75, B:436:0x0a7d, B:437:0x0a84, B:442:0x0a92, B:443:0x0a99, B:445:0x0ab8, B:446:0x0abf, B:447:0x0abc, B:448:0x0a96, B:450:0x0a81, B:452:0x05ef, B:454:0x05f5, B:457:0x0cee), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzag(String str, long j11) {
        int i11;
        long j12;
        zzam zzamVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        long currentTimeMillis;
        long zzm;
        ContentValues contentValues;
        long parseLong;
        long j13;
        long j14;
        int i12;
        com.google.android.gms.internal.measurement.zzgb zzgbVar;
        SecureRandom secureRandom;
        zzli zzliVar;
        Long l11;
        long zzr;
        String str2;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17;
        int i18;
        zzli zzliVar2;
        int i19;
        int i21;
        int i22;
        com.google.android.gms.internal.measurement.zzfr zzfrVar;
        char c11;
        String str3 = "_ai";
        zzam zzamVar2 = this.zze;
        zzak(zzamVar2);
        zzamVar2.zzw();
        try {
            zzli zzliVar3 = new zzli(this, null);
            zzam zzamVar3 = this.zze;
            zzak(zzamVar3);
            zzamVar3.zzU(null, j11, this.zzA, zzliVar3);
            List list = zzliVar3.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgb zzgbVar2 = (com.google.android.gms.internal.measurement.zzgb) zzliVar3.zza.zzbB();
                zzgbVar2.zzr();
                com.google.android.gms.internal.measurement.zzfr zzfrVar2 = null;
                com.google.android.gms.internal.measurement.zzfr zzfrVar3 = null;
                int i23 = 0;
                int i24 = 0;
                int i25 = -1;
                int i26 = -1;
                int i27 = 0;
                while (true) {
                    i11 = i24;
                    com.google.android.gms.internal.measurement.zzfr zzfrVar4 = zzfrVar2;
                    if (i23 >= zzliVar3.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfr zzfrVar5 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfs) zzliVar3.zzc.get(i23)).zzbB();
                    zzgb zzgbVar3 = this.zzc;
                    zzak(zzgbVar3);
                    com.google.android.gms.internal.measurement.zzfr zzfrVar6 = zzfrVar3;
                    if (zzgbVar3.zzr(zzliVar3.zza.zzy(), zzfrVar5.zzo())) {
                        zzay().zzk().zzc("Dropping blocked raw event. appId", zzfa.zzn(zzliVar3.zza.zzy()), this.zzn.zzj().zzd(zzfrVar5.zzo()));
                        zzgb zzgbVar4 = this.zzc;
                        zzak(zzgbVar4);
                        if (!zzgbVar4.zzp(zzliVar3.zza.zzy())) {
                            zzgb zzgbVar5 = this.zzc;
                            zzak(zzgbVar5);
                            if (!zzgbVar5.zzs(zzliVar3.zza.zzy()) && !"_err".equals(zzfrVar5.zzo())) {
                                zzv().zzN(this.zzF, zzliVar3.zza.zzy(), 11, "_ev", zzfrVar5.zzo(), 0);
                            }
                        }
                        str2 = str3;
                        i22 = i23;
                        i24 = i11;
                        zzfrVar3 = zzfrVar6;
                    } else {
                        if (zzfrVar5.zzo().equals(zzhh.zza(str3))) {
                            zzfrVar5.zzi(str3);
                            zzay().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzay().zzq(), 5)) {
                                int i28 = 0;
                                while (i28 < zzfrVar5.zza()) {
                                    String str4 = str3;
                                    if ("ad_platform".equals(zzfrVar5.zzn(i28).zzg()) && !zzfrVar5.zzn(i28).zzh().isEmpty() && "admob".equalsIgnoreCase(zzfrVar5.zzn(i28).zzh())) {
                                        zzay().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i28++;
                                    str3 = str4;
                                }
                            }
                        }
                        str2 = str3;
                        zzgb zzgbVar6 = this.zzc;
                        zzak(zzgbVar6);
                        boolean zzq = zzgbVar6.zzq(zzliVar3.zza.zzy(), zzfrVar5.zzo());
                        if (zzq) {
                            z11 = zzq;
                            i13 = i23;
                            i14 = i27;
                        } else {
                            zzak(this.zzi);
                            String zzo = zzfrVar5.zzo();
                            Preconditions.checkNotEmpty(zzo);
                            z11 = zzq;
                            int hashCode = zzo.hashCode();
                            i14 = i27;
                            i13 = i23;
                            if (hashCode == 94660) {
                                if (zzo.equals("_in")) {
                                    c11 = 0;
                                    if (c11 != 0) {
                                    }
                                }
                                c11 = 65535;
                                if (c11 != 0) {
                                }
                            } else if (hashCode != 95025) {
                                if (hashCode == 95027 && zzo.equals("_ui")) {
                                    c11 = 1;
                                    if (c11 != 0 && c11 != 1 && c11 != 2) {
                                        i15 = i25;
                                        i18 = i14;
                                        z11 = false;
                                        if (z11) {
                                            ArrayList arrayList = new ArrayList(zzfrVar5.zzp());
                                            int i29 = 0;
                                            int i31 = -1;
                                            int i32 = -1;
                                            while (true) {
                                                i19 = i18;
                                                zzliVar2 = zzliVar3;
                                                if (i29 >= arrayList.size()) {
                                                    break;
                                                }
                                                if (AppMeasurementSdk.ConditionalUserProperty.VALUE.equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i29)).zzg())) {
                                                    i31 = i29;
                                                } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i29)).zzg())) {
                                                    i32 = i29;
                                                }
                                                i29++;
                                                i18 = i19;
                                                zzliVar3 = zzliVar2;
                                            }
                                            if (i31 != -1) {
                                                if (((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i31)).zzw() || ((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i31)).zzu()) {
                                                    if (i32 != -1) {
                                                        String zzh = ((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i32)).zzh();
                                                        if (zzh.length() == 3) {
                                                            int i33 = 0;
                                                            while (i33 < zzh.length()) {
                                                                int codePointAt = zzh.codePointAt(i33);
                                                                if (Character.isLetter(codePointAt)) {
                                                                    i33 += Character.charCount(codePointAt);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                    zzfrVar5.zzh(i31);
                                                    zzaa(zzfrVar5, "_c");
                                                    zzZ(zzfrVar5, 19, "currency");
                                                    break;
                                                }
                                                zzay().zzl().zza("Value must be specified with a numeric type.");
                                                zzfrVar5.zzh(i31);
                                                zzaa(zzfrVar5, "_c");
                                                zzZ(zzfrVar5, 18, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                            }
                                            if ("_e".equals(zzfrVar5.zzo())) {
                                                if ("_vs".equals(zzfrVar5.zzo())) {
                                                    zzak(this.zzi);
                                                    if (zzln.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar5.zzaE(), "_et") == null) {
                                                        if (zzfrVar4 == null || Math.abs(zzfrVar4.zzc() - zzfrVar5.zzc()) > 1000) {
                                                            i25 = i15;
                                                            zzfrVar3 = zzfrVar5;
                                                            i26 = i11;
                                                        } else {
                                                            com.google.android.gms.internal.measurement.zzfr zzfrVar7 = (com.google.android.gms.internal.measurement.zzfr) zzfrVar4.clone();
                                                            if (zzai(zzfrVar7, zzfrVar5)) {
                                                                i21 = i15;
                                                                zzgbVar2.zzT(i21, zzfrVar7);
                                                                zzfrVar3 = null;
                                                                zzfrVar4 = null;
                                                            } else {
                                                                i21 = i15;
                                                                zzfrVar3 = zzfrVar5;
                                                                i26 = i11;
                                                            }
                                                            i25 = i21;
                                                        }
                                                    }
                                                }
                                                i25 = i15;
                                                zzfrVar3 = zzfrVar6;
                                            } else {
                                                zzak(this.zzi);
                                                if (zzln.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar5.zzaE(), "_fr") == null) {
                                                    if (zzfrVar6 == null || Math.abs(zzfrVar6.zzc() - zzfrVar5.zzc()) > 1000) {
                                                        zzfrVar4 = zzfrVar5;
                                                        i25 = i11;
                                                        zzfrVar3 = zzfrVar6;
                                                    } else {
                                                        com.google.android.gms.internal.measurement.zzfr zzfrVar8 = (com.google.android.gms.internal.measurement.zzfr) zzfrVar6.clone();
                                                        if (zzai(zzfrVar5, zzfrVar8)) {
                                                            zzgbVar2.zzT(i26, zzfrVar8);
                                                            i25 = i15;
                                                            zzfrVar = null;
                                                            zzfrVar3 = null;
                                                        } else {
                                                            zzfrVar = zzfrVar5;
                                                            i25 = i11;
                                                            zzfrVar3 = zzfrVar6;
                                                        }
                                                        zzfrVar4 = zzfrVar;
                                                    }
                                                }
                                                i25 = i15;
                                                zzfrVar3 = zzfrVar6;
                                            }
                                            zzliVar3 = zzliVar2;
                                            i22 = i13;
                                            zzliVar3.zzc.set(i22, (com.google.android.gms.internal.measurement.zzfs) zzfrVar5.zzaE());
                                            i24 = i11 + 1;
                                            zzgbVar2.zzk(zzfrVar5);
                                            i27 = i19;
                                        } else {
                                            zzliVar2 = zzliVar3;
                                            i19 = i18;
                                        }
                                        if ("_e".equals(zzfrVar5.zzo())) {
                                        }
                                        zzliVar3 = zzliVar2;
                                        i22 = i13;
                                        zzliVar3.zzc.set(i22, (com.google.android.gms.internal.measurement.zzfs) zzfrVar5.zzaE());
                                        i24 = i11 + 1;
                                        zzgbVar2.zzk(zzfrVar5);
                                        i27 = i19;
                                    }
                                }
                                c11 = 65535;
                                if (c11 != 0) {
                                    i15 = i25;
                                    i18 = i14;
                                    z11 = false;
                                    if (z11) {
                                    }
                                    if ("_e".equals(zzfrVar5.zzo())) {
                                    }
                                    zzliVar3 = zzliVar2;
                                    i22 = i13;
                                    zzliVar3.zzc.set(i22, (com.google.android.gms.internal.measurement.zzfs) zzfrVar5.zzaE());
                                    i24 = i11 + 1;
                                    zzgbVar2.zzk(zzfrVar5);
                                    i27 = i19;
                                }
                            } else {
                                if (zzo.equals("_ug")) {
                                    c11 = 2;
                                    if (c11 != 0) {
                                    }
                                }
                                c11 = 65535;
                                if (c11 != 0) {
                                }
                            }
                        }
                        int i34 = 0;
                        boolean z13 = false;
                        boolean z14 = false;
                        while (true) {
                            z12 = z13;
                            if (i34 >= zzfrVar5.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfrVar5.zzn(i34).zzg())) {
                                com.google.android.gms.internal.measurement.zzfv zzfvVar = (com.google.android.gms.internal.measurement.zzfv) zzfrVar5.zzn(i34).zzbB();
                                zzfvVar.zzi(1L);
                                zzfrVar5.zzk(i34, (com.google.android.gms.internal.measurement.zzfw) zzfvVar.zzaE());
                                z14 = z14;
                                z13 = true;
                            } else {
                                boolean z15 = z14;
                                if ("_r".equals(zzfrVar5.zzn(i34).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfv zzfvVar2 = (com.google.android.gms.internal.measurement.zzfv) zzfrVar5.zzn(i34).zzbB();
                                    zzfvVar2.zzi(1L);
                                    zzfrVar5.zzk(i34, (com.google.android.gms.internal.measurement.zzfw) zzfvVar2.zzaE());
                                    z13 = z12;
                                    z14 = true;
                                } else {
                                    z13 = z12;
                                    z14 = z15;
                                }
                            }
                            i34++;
                        }
                        boolean z16 = z14;
                        if (z12 || !z11) {
                            i15 = i25;
                        } else {
                            i15 = i25;
                            zzay().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfrVar5.zzo()));
                            com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
                            zze.zzj("_c");
                            zze.zzi(1L);
                            zzfrVar5.zze(zze);
                        }
                        if (!z16) {
                            zzay().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfrVar5.zzo()));
                            com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                            zze2.zzj("_r");
                            zze2.zzi(1L);
                            zzfrVar5.zze(zze2);
                        }
                        zzam zzamVar4 = this.zze;
                        zzak(zzamVar4);
                        if (zzamVar4.zzl(zza(), zzliVar3.zza.zzy(), false, false, false, false, true).zze > zzg().zze(zzliVar3.zza.zzy(), zzen.zzn)) {
                            zzaa(zzfrVar5, "_r");
                            i16 = i14;
                        } else {
                            i16 = 1;
                        }
                        if (zzlt.zzai(zzfrVar5.zzo()) && z11) {
                            zzam zzamVar5 = this.zze;
                            zzak(zzamVar5);
                            i17 = i16;
                            if (zzamVar5.zzl(zza(), zzliVar3.zza.zzy(), false, false, true, false, false).zzc > zzg().zze(zzliVar3.zza.zzy(), zzen.zzm)) {
                                zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzfa.zzn(zzliVar3.zza.zzy()));
                                com.google.android.gms.internal.measurement.zzfv zzfvVar3 = null;
                                boolean z17 = false;
                                int i35 = -1;
                                for (int i36 = 0; i36 < zzfrVar5.zza(); i36++) {
                                    com.google.android.gms.internal.measurement.zzfw zzn = zzfrVar5.zzn(i36);
                                    com.google.android.gms.internal.measurement.zzfv zzfvVar4 = zzfvVar3;
                                    if ("_c".equals(zzn.zzg())) {
                                        zzfvVar3 = (com.google.android.gms.internal.measurement.zzfv) zzn.zzbB();
                                        i35 = i36;
                                    } else if ("_err".equals(zzn.zzg())) {
                                        zzfvVar3 = zzfvVar4;
                                        z17 = true;
                                    } else {
                                        zzfvVar3 = zzfvVar4;
                                    }
                                }
                                com.google.android.gms.internal.measurement.zzfv zzfvVar5 = zzfvVar3;
                                if (z17) {
                                    if (zzfvVar5 != null) {
                                        zzfrVar5.zzh(i35);
                                    } else {
                                        zzfvVar5 = null;
                                    }
                                }
                                if (zzfvVar5 != null) {
                                    com.google.android.gms.internal.measurement.zzfv zzfvVar6 = (com.google.android.gms.internal.measurement.zzfv) zzfvVar5.clone();
                                    zzfvVar6.zzj("_err");
                                    zzfvVar6.zzi(10L);
                                    zzfrVar5.zzk(i35, (com.google.android.gms.internal.measurement.zzfw) zzfvVar6.zzaE());
                                } else {
                                    zzay().zzd().zzb("Did not find conversion parameter. appId", zzfa.zzn(zzliVar3.zza.zzy()));
                                }
                            }
                        } else {
                            i17 = i16;
                        }
                        i18 = i17;
                        if (z11) {
                        }
                        if ("_e".equals(zzfrVar5.zzo())) {
                        }
                        zzliVar3 = zzliVar2;
                        i22 = i13;
                        zzliVar3.zzc.set(i22, (com.google.android.gms.internal.measurement.zzfs) zzfrVar5.zzaE());
                        i24 = i11 + 1;
                        zzgbVar2.zzk(zzfrVar5);
                        i27 = i19;
                    }
                    zzfrVar2 = zzfrVar4;
                    i23 = i22 + 1;
                    str3 = str2;
                }
                int i37 = i27;
                long j15 = 0;
                long j16 = 0;
                int i38 = i11;
                int i39 = 0;
                while (i39 < i38) {
                    com.google.android.gms.internal.measurement.zzfs zze3 = zzgbVar2.zze(i39);
                    if ("_e".equals(zze3.zzh())) {
                        zzak(this.zzi);
                        if (zzln.zzB(zze3, "_fr") != null) {
                            zzgbVar2.zzA(i39);
                            i38--;
                            i39--;
                            i39++;
                        }
                    }
                    zzak(this.zzi);
                    com.google.android.gms.internal.measurement.zzfw zzB = zzln.zzB(zze3, "_et");
                    if (zzB != null) {
                        Long valueOf = zzB.zzw() ? Long.valueOf(zzB.zzd()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j16 += valueOf.longValue();
                        }
                    }
                    i39++;
                }
                zzae(zzgbVar2, j16, false);
                Iterator it = zzgbVar2.zzas().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzfs) it.next()).zzh())) {
                        zzam zzamVar6 = this.zze;
                        zzak(zzamVar6);
                        zzamVar6.zzA(zzgbVar2.zzaq(), "_se");
                        break;
                    }
                }
                if (zzln.zza(zzgbVar2, "_sid") >= 0) {
                    zzae(zzgbVar2, j16, true);
                } else {
                    int zza = zzln.zza(zzgbVar2, "_se");
                    if (zza >= 0) {
                        zzgbVar2.zzB(zza);
                        zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzfa.zzn(zzliVar3.zza.zzy()));
                    }
                }
                zzln zzlnVar = this.zzi;
                zzak(zzlnVar);
                zzlnVar.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                zzgb zzgbVar7 = zzlnVar.zzf.zzc;
                zzak(zzgbVar7);
                if (zzgbVar7.zzn(zzgbVar2.zzaq())) {
                    zzam zzamVar7 = zzlnVar.zzf.zze;
                    zzak(zzamVar7);
                    zzh zzj = zzamVar7.zzj(zzgbVar2.zzaq());
                    if (zzj != null && zzj.zzai() && zzlnVar.zzs.zzg().zze()) {
                        zzlnVar.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgk zzd = com.google.android.gms.internal.measurement.zzgl.zzd();
                        zzd.zzf("_npa");
                        zzd.zzg(zzlnVar.zzs.zzg().zza());
                        zzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzd.zzaE();
                        int i41 = 0;
                        while (true) {
                            if (i41 >= zzgbVar2.zzb()) {
                                zzgbVar2.zzm(zzglVar);
                                break;
                            }
                            if ("_npa".equals(zzgbVar2.zzap(i41).zzf())) {
                                zzgbVar2.zzan(i41, zzglVar);
                                break;
                            }
                            i41++;
                        }
                    }
                }
                zzgbVar2.zzaj(Long.MAX_VALUE);
                zzgbVar2.zzR(Long.MIN_VALUE);
                for (int i42 = 0; i42 < zzgbVar2.zza(); i42++) {
                    com.google.android.gms.internal.measurement.zzfs zze4 = zzgbVar2.zze(i42);
                    if (zze4.zzd() < zzgbVar2.zzd()) {
                        zzgbVar2.zzaj(zze4.zzd());
                    }
                    if (zze4.zzd() > zzgbVar2.zzc()) {
                        zzgbVar2.zzR(zze4.zzd());
                    }
                }
                zzgbVar2.zzz();
                zzgbVar2.zzo();
                zzaa zzaaVar = this.zzh;
                zzak(zzaaVar);
                zzgbVar2.zzf(zzaaVar.zza(zzgbVar2.zzaq(), zzgbVar2.zzas(), zzgbVar2.zzat(), Long.valueOf(zzgbVar2.zzd()), Long.valueOf(zzgbVar2.zzc())));
                if (zzg().zzw(zzliVar3.zza.zzy())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom zzG = zzv().zzG();
                    int i43 = 0;
                    while (i43 < zzgbVar2.zza()) {
                        com.google.android.gms.internal.measurement.zzfr zzfrVar9 = (com.google.android.gms.internal.measurement.zzfr) zzgbVar2.zze(i43).zzbB();
                        if (zzfrVar9.zzo().equals("_ep")) {
                            zzak(this.zzi);
                            String str5 = (String) zzln.zzC((com.google.android.gms.internal.measurement.zzfs) zzfrVar9.zzaE(), "_en");
                            zzas zzasVar = (zzas) hashMap.get(str5);
                            if (zzasVar == null) {
                                zzam zzamVar8 = this.zze;
                                zzak(zzamVar8);
                                zzasVar = zzamVar8.zzn(zzliVar3.zza.zzy(), (String) Preconditions.checkNotNull(str5));
                                if (zzasVar != null) {
                                    hashMap.put(str5, zzasVar);
                                }
                            }
                            if (zzasVar != null && zzasVar.zzi == null) {
                                Long l12 = zzasVar.zzj;
                                if (l12 != null && l12.longValue() > 1) {
                                    zzak(this.zzi);
                                    zzln.zzz(zzfrVar9, "_sr", zzasVar.zzj);
                                }
                                Boolean bool = zzasVar.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzak(this.zzi);
                                    zzln.zzz(zzfrVar9, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar9.zzaE());
                            }
                            zzgbVar2.zzT(i43, zzfrVar9);
                            secureRandom = zzG;
                            j13 = j15;
                        } else {
                            zzgb zzgbVar8 = this.zzc;
                            zzak(zzgbVar8);
                            String zzy = zzliVar3.zza.zzy();
                            String zza2 = zzgbVar8.zza(zzy, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(zza2)) {
                                try {
                                    parseLong = Long.parseLong(zza2);
                                } catch (NumberFormatException e11) {
                                    zzgbVar8.zzs.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzfa.zzn(zzy), e11);
                                }
                                long j17 = j15;
                                long zzr2 = zzv().zzr(zzfrVar9.zzc(), parseLong);
                                com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzfrVar9.zzaE();
                                j13 = j17;
                                Long l13 = 1L;
                                if (!TextUtils.isEmpty("_dbg")) {
                                    for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzfsVar.zzi()) {
                                        j14 = parseLong;
                                        if (!"_dbg".equals(zzfwVar.zzg())) {
                                            parseLong = j14;
                                        } else if (l13.equals(Long.valueOf(zzfwVar.zzd()))) {
                                            i12 = 1;
                                            if (i12 > 0) {
                                            }
                                            secureRandom = zzG;
                                        } else {
                                            zzgb zzgbVar9 = this.zzc;
                                            zzak(zzgbVar9);
                                            i12 = zzgbVar9.zzc(zzliVar3.zza.zzy(), zzfrVar9.zzo());
                                            if (i12 > 0) {
                                                zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfrVar9.zzo(), Integer.valueOf(i12));
                                                arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar9.zzaE());
                                                zzgbVar2.zzT(i43, zzfrVar9);
                                            } else {
                                                zzas zzasVar2 = (zzas) hashMap.get(zzfrVar9.zzo());
                                                if (zzasVar2 == null) {
                                                    zzam zzamVar9 = this.zze;
                                                    zzak(zzamVar9);
                                                    zzasVar2 = zzamVar9.zzn(zzliVar3.zza.zzy(), zzfrVar9.zzo());
                                                    if (zzasVar2 == null) {
                                                        zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzliVar3.zza.zzy(), zzfrVar9.zzo());
                                                        zzasVar2 = new zzas(zzliVar3.zza.zzy(), zzfrVar9.zzo(), 1L, 1L, 1L, zzfrVar9.zzc(), 0L, null, null, null, null);
                                                    }
                                                }
                                                zzak(this.zzi);
                                                Long l14 = (Long) zzln.zzC((com.google.android.gms.internal.measurement.zzfs) zzfrVar9.zzaE(), "_eid");
                                                boolean z18 = l14 != null;
                                                if (i12 == 1) {
                                                    arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar9.zzaE());
                                                    if (z18 && (zzasVar2.zzi != null || zzasVar2.zzj != null || zzasVar2.zzk != null)) {
                                                        hashMap.put(zzfrVar9.zzo(), zzasVar2.zza(null, null, null));
                                                    }
                                                    zzgbVar2.zzT(i43, zzfrVar9);
                                                } else {
                                                    if (zzG.nextInt(i12) == 0) {
                                                        zzak(this.zzi);
                                                        Long valueOf2 = Long.valueOf(i12);
                                                        zzln.zzz(zzfrVar9, "_sr", valueOf2);
                                                        arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar9.zzaE());
                                                        if (z18) {
                                                            zzasVar2 = zzasVar2.zza(null, valueOf2, null);
                                                        }
                                                        hashMap.put(zzfrVar9.zzo(), zzasVar2.zzb(zzfrVar9.zzc(), zzr2));
                                                        secureRandom = zzG;
                                                        zzliVar = zzliVar3;
                                                    } else {
                                                        Long l15 = zzasVar2.zzh;
                                                        if (l15 != null) {
                                                            secureRandom = zzG;
                                                            zzliVar = zzliVar3;
                                                            l11 = l14;
                                                            zzgbVar = zzgbVar2;
                                                            zzr = l15.longValue();
                                                        } else {
                                                            zzgbVar = zzgbVar2;
                                                            secureRandom = zzG;
                                                            zzliVar = zzliVar3;
                                                            l11 = l14;
                                                            zzr = zzv().zzr(zzfrVar9.zzb(), j14);
                                                        }
                                                        if (zzr != zzr2) {
                                                            zzak(this.zzi);
                                                            zzln.zzz(zzfrVar9, "_efs", 1L);
                                                            zzak(this.zzi);
                                                            Long valueOf3 = Long.valueOf(i12);
                                                            zzln.zzz(zzfrVar9, "_sr", valueOf3);
                                                            arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar9.zzaE());
                                                            if (z18) {
                                                                zzasVar2 = zzasVar2.zza(null, valueOf3, Boolean.TRUE);
                                                            }
                                                            hashMap.put(zzfrVar9.zzo(), zzasVar2.zzb(zzfrVar9.zzc(), zzr2));
                                                        } else if (z18) {
                                                            hashMap.put(zzfrVar9.zzo(), zzasVar2.zza(l11, null, null));
                                                        }
                                                        zzgbVar2 = zzgbVar;
                                                    }
                                                    zzgbVar2.zzT(i43, zzfrVar9);
                                                    i43++;
                                                    zzG = secureRandom;
                                                    j15 = j13;
                                                    zzliVar3 = zzliVar;
                                                }
                                            }
                                            secureRandom = zzG;
                                        }
                                    }
                                }
                                j14 = parseLong;
                                zzgb zzgbVar92 = this.zzc;
                                zzak(zzgbVar92);
                                i12 = zzgbVar92.zzc(zzliVar3.zza.zzy(), zzfrVar9.zzo());
                                if (i12 > 0) {
                                }
                                secureRandom = zzG;
                            }
                            parseLong = j15;
                            long j172 = j15;
                            long zzr22 = zzv().zzr(zzfrVar9.zzc(), parseLong);
                            com.google.android.gms.internal.measurement.zzfs zzfsVar2 = (com.google.android.gms.internal.measurement.zzfs) zzfrVar9.zzaE();
                            j13 = j172;
                            Long l132 = 1L;
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            j14 = parseLong;
                            zzgb zzgbVar922 = this.zzc;
                            zzak(zzgbVar922);
                            i12 = zzgbVar922.zzc(zzliVar3.zza.zzy(), zzfrVar9.zzo());
                            if (i12 > 0) {
                            }
                            secureRandom = zzG;
                        }
                        zzliVar = zzliVar3;
                        i43++;
                        zzG = secureRandom;
                        j15 = j13;
                        zzliVar3 = zzliVar;
                    }
                    j12 = j15;
                    zzli zzliVar4 = zzliVar3;
                    if (arrayList2.size() < zzgbVar2.zza()) {
                        zzgbVar2.zzr();
                        zzgbVar2.zzg(arrayList2);
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        zzam zzamVar10 = this.zze;
                        zzak(zzamVar10);
                        zzamVar10.zzE((zzas) entry.getValue());
                    }
                    zzliVar3 = zzliVar4;
                } else {
                    j12 = 0;
                }
                String zzy2 = zzliVar3.zza.zzy();
                zzam zzamVar11 = this.zze;
                zzak(zzamVar11);
                zzh zzj2 = zzamVar11.zzj(zzy2);
                if (zzj2 == null) {
                    zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzfa.zzn(zzliVar3.zza.zzy()));
                } else if (zzgbVar2.zza() > 0) {
                    long zzn2 = zzj2.zzn();
                    if (zzn2 != j12) {
                        zzgbVar2.zzac(zzn2);
                    } else {
                        zzgbVar2.zzv();
                    }
                    long zzp = zzj2.zzp();
                    if (zzp != j12) {
                        zzn2 = zzp;
                    }
                    if (zzn2 != j12) {
                        zzgbVar2.zzad(zzn2);
                    } else {
                        zzgbVar2.zzw();
                    }
                    zzj2.zzE();
                    zzgbVar2.zzJ((int) zzj2.zzo());
                    zzj2.zzac(zzgbVar2.zzd());
                    zzj2.zzaa(zzgbVar2.zzc());
                    String zzs = zzj2.zzs();
                    if (zzs != null) {
                        zzgbVar2.zzX(zzs);
                    } else {
                        zzgbVar2.zzs();
                    }
                    zzam zzamVar12 = this.zze;
                    zzak(zzamVar12);
                    zzamVar12.zzD(zzj2);
                }
                if (zzgbVar2.zza() > 0) {
                    this.zzn.zzaw();
                    zzgb zzgbVar10 = this.zzc;
                    zzak(zzgbVar10);
                    com.google.android.gms.internal.measurement.zzfe zze5 = zzgbVar10.zze(zzliVar3.zza.zzy());
                    try {
                        try {
                            if (zze5 != null && zze5.zzs()) {
                                zzgbVar2.zzL(zze5.zzc());
                                zzamVar = this.zze;
                                zzak(zzamVar);
                                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzgbVar2.zzaE();
                                zzamVar.zzg();
                                zzamVar.zzW();
                                Preconditions.checkNotNull(zzgcVar);
                                Preconditions.checkNotEmpty(zzgcVar.zzy());
                                Preconditions.checkState(zzgcVar.zzbh());
                                zzamVar.zzz();
                                currentTimeMillis = zzamVar.zzs.zzav().currentTimeMillis();
                                zzm = zzgcVar.zzm();
                                zzamVar.zzs.zzf();
                                if (zzm >= currentTimeMillis - zzag.zzA()) {
                                    long zzm2 = zzgcVar.zzm();
                                    zzamVar.zzs.zzf();
                                }
                                zzamVar.zzs.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfa.zzn(zzgcVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgcVar.zzm()));
                                byte[] zzby = zzgcVar.zzby();
                                zzln zzlnVar2 = zzamVar.zzf.zzi;
                                zzak(zzlnVar2);
                                byte[] zzy3 = zzlnVar2.zzy(zzby);
                                zzamVar.zzs.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(zzy3.length));
                                contentValues = new ContentValues();
                                contentValues.put("app_id", zzgcVar.zzy());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(zzgcVar.zzm()));
                                contentValues.put("data", zzy3);
                                contentValues.put("has_realtime", Integer.valueOf(i37));
                                if (zzgcVar.zzbn()) {
                                    contentValues.put("retry_count", Integer.valueOf(zzgcVar.zze()));
                                }
                                if (zzamVar.zzh().insert("queue", null, contentValues) == -1) {
                                    zzamVar.zzs.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzfa.zzn(zzgcVar.zzy()));
                                }
                            }
                            if (zzamVar.zzh().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e12) {
                            zzamVar.zzs.zzay().zzd().zzc("Error storing bundle. appId", zzfa.zzn(zzgcVar.zzy()), e12);
                        }
                        zzln zzlnVar22 = zzamVar.zzf.zzi;
                        zzak(zzlnVar22);
                        byte[] zzy32 = zzlnVar22.zzy(zzby);
                        zzamVar.zzs.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(zzy32.length));
                        contentValues = new ContentValues();
                        contentValues.put("app_id", zzgcVar.zzy());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgcVar.zzm()));
                        contentValues.put("data", zzy32);
                        contentValues.put("has_realtime", Integer.valueOf(i37));
                        if (zzgcVar.zzbn()) {
                        }
                    } catch (IOException e13) {
                        zzamVar.zzs.zzay().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzfa.zzn(zzgcVar.zzy()), e13);
                    }
                    if (zzliVar3.zza.zzG().isEmpty()) {
                        zzgbVar2.zzL(-1L);
                    } else {
                        zzay().zzk().zzb("Did not find measurement config or missing version info. appId", zzfa.zzn(zzliVar3.zza.zzy()));
                    }
                    zzamVar = this.zze;
                    zzak(zzamVar);
                    zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzgbVar2.zzaE();
                    zzamVar.zzg();
                    zzamVar.zzW();
                    Preconditions.checkNotNull(zzgcVar);
                    Preconditions.checkNotEmpty(zzgcVar.zzy());
                    Preconditions.checkState(zzgcVar.zzbh());
                    zzamVar.zzz();
                    currentTimeMillis = zzamVar.zzs.zzav().currentTimeMillis();
                    zzm = zzgcVar.zzm();
                    zzamVar.zzs.zzf();
                    if (zzm >= currentTimeMillis - zzag.zzA()) {
                    }
                    zzamVar.zzs.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfa.zzn(zzgcVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgcVar.zzm()));
                    byte[] zzby2 = zzgcVar.zzby();
                }
                zzam zzamVar13 = this.zze;
                zzak(zzamVar13);
                List list2 = zzliVar3.zzb;
                Preconditions.checkNotNull(list2);
                zzamVar13.zzg();
                zzamVar13.zzW();
                StringBuilder sb2 = new StringBuilder("rowid in (");
                for (int i44 = 0; i44 < list2.size(); i44++) {
                    if (i44 != 0) {
                        sb2.append(",");
                    }
                    sb2.append(((Long) list2.get(i44)).longValue());
                }
                sb2.append(")");
                int delete = zzamVar13.zzh().delete("raw_events", sb2.toString(), null);
                if (delete != list2.size()) {
                    zzamVar13.zzs.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list2.size()));
                }
                zzam zzamVar14 = this.zze;
                zzak(zzamVar14);
                try {
                    zzamVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzy2, zzy2});
                } catch (SQLiteException e14) {
                    zzamVar14.zzs.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzfa.zzn(zzy2), e14);
                }
                zzam zzamVar15 = this.zze;
                zzak(zzamVar15);
                zzamVar15.zzC();
                zzam zzamVar16 = this.zze;
                zzak(zzamVar16);
                zzamVar16.zzx();
                return true;
            }
            zzam zzamVar17 = this.zze;
            zzak(zzamVar17);
            zzamVar17.zzC();
            zzam zzamVar18 = this.zze;
            zzak(zzamVar18);
            zzamVar18.zzx();
            return false;
        } catch (Throwable th2) {
            zzam zzamVar19 = this.zze;
            zzak(zzamVar19);
            zzamVar19.zzx();
            throw th2;
        }
    }

    private final boolean zzah() {
        zzaz().zzg();
        zzB();
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        if (zzamVar.zzF()) {
            return true;
        }
        zzam zzamVar2 = this.zze;
        zzak(zzamVar2);
        return !TextUtils.isEmpty(zzamVar2.zzr());
    }

    private final boolean zzai(com.google.android.gms.internal.measurement.zzfr zzfrVar, com.google.android.gms.internal.measurement.zzfr zzfrVar2) {
        Preconditions.checkArgument("_e".equals(zzfrVar.zzo()));
        zzak(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzB = zzln.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE(), "_sc");
        String zzh = zzB == null ? null : zzB.zzh();
        zzak(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzB2 = zzln.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar2.zzaE(), "_pc");
        String zzh2 = zzB2 != null ? zzB2.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfrVar.zzo()));
        zzak(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzB3 = zzln.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE(), "_et");
        if (zzB3 == null || !zzB3.zzw() || zzB3.zzd() <= 0) {
            return true;
        }
        long zzd = zzB3.zzd();
        zzak(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzB4 = zzln.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar2.zzaE(), "_et");
        if (zzB4 != null && zzB4.zzd() > 0) {
            zzd += zzB4.zzd();
        }
        zzak(this.zzi);
        zzln.zzz(zzfrVar2, "_et", Long.valueOf(zzd));
        zzak(this.zzi);
        zzln.zzz(zzfrVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzaj(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzkz zzak(zzkz zzkzVar) {
        if (zzkzVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzkzVar.zzY()) {
            return zzkzVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzkzVar.getClass())));
    }

    public static zzll zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzll.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzll((zzlm) Preconditions.checkNotNull(new zzlm(context)), null);
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    static /* bridge */ /* synthetic */ void zzy(zzll zzllVar, zzlm zzlmVar) {
        zzllVar.zzaz().zzg();
        zzllVar.zzm = new zzfs(zzllVar);
        zzam zzamVar = new zzam(zzllVar);
        zzamVar.zzX();
        zzllVar.zze = zzamVar;
        zzllVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzllVar.zzc));
        zzkg zzkgVar = new zzkg(zzllVar);
        zzkgVar.zzX();
        zzllVar.zzk = zzkgVar;
        zzaa zzaaVar = new zzaa(zzllVar);
        zzaaVar.zzX();
        zzllVar.zzh = zzaaVar;
        zziu zziuVar = new zziu(zzllVar);
        zziuVar.zzX();
        zzllVar.zzj = zziuVar;
        zzkx zzkxVar = new zzkx(zzllVar);
        zzkxVar.zzX();
        zzllVar.zzg = zzkxVar;
        zzllVar.zzf = new zzfi(zzllVar);
        if (zzllVar.zzr != zzllVar.zzs) {
            zzllVar.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzllVar.zzr), Integer.valueOf(zzllVar.zzs));
        }
        zzllVar.zzo = true;
    }

    @VisibleForTesting
    final void zzA() {
        zzaz().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzY()) {
            FileChannel fileChannel = this.zzx;
            zzaz().zzg();
            int i11 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzay().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i11 = allocate.getInt();
                    } else if (read != -1) {
                        zzay().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e11) {
                    zzay().zzd().zzb("Failed to read from channel", e11);
                }
            }
            int zzi = this.zzn.zzh().zzi();
            zzaz().zzg();
            if (i11 > zzi) {
                zzay().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i11), Integer.valueOf(zzi));
                return;
            }
            if (i11 < zzi) {
                FileChannel fileChannel2 = this.zzx;
                zzaz().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzay().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(zzi);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzay().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzay().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i11), Integer.valueOf(zzi));
                        return;
                    } catch (IOException e12) {
                        zzay().zzd().zzb("Failed to write to channel", e12);
                    }
                }
                zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i11), Integer.valueOf(zzi));
            }
        }
    }

    final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzC(zzh zzhVar) {
        C5132a c5132a;
        C5132a c5132a2;
        zzaz().zzg();
        if (TextUtils.isEmpty(zzhVar.zzy()) && TextUtils.isEmpty(zzhVar.zzr())) {
            zzH((String) Preconditions.checkNotNull(zzhVar.zzt()), 204, null, null, null);
            return;
        }
        zzla zzlaVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String zzy = zzhVar.zzy();
        if (TextUtils.isEmpty(zzy)) {
            zzy = zzhVar.zzr();
        }
        C5132a c5132a3 = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) zzen.zzd.zza(null)).encodedAuthority((String) zzen.zze.zza(null)).path("config/app/".concat(String.valueOf(zzy))).appendQueryParameter("platform", "android");
        zzlaVar.zzs.zzf().zzh();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(64000L)).appendQueryParameter("runtime_version", "0");
        zzpj.zzc();
        if (!zzlaVar.zzs.zzf().zzs(zzhVar.zzt(), zzen.zzaA)) {
            builder.appendQueryParameter("app_instance_id", zzhVar.zzu());
        }
        String uri = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzt());
            URL url = new URL(uri);
            zzay().zzj().zzb("Fetching remote configuration", str);
            zzgb zzgbVar = this.zzc;
            zzak(zzgbVar);
            com.google.android.gms.internal.measurement.zzfe zze = zzgbVar.zze(str);
            zzgb zzgbVar2 = this.zzc;
            zzak(zzgbVar2);
            String zzh = zzgbVar2.zzh(str);
            if (zze != null) {
                if (TextUtils.isEmpty(zzh)) {
                    c5132a2 = null;
                } else {
                    c5132a2 = new C5132a();
                    c5132a2.put("If-Modified-Since", zzh);
                }
                zzpj.zzc();
                if (zzg().zzs(null, zzen.zzaM)) {
                    zzgb zzgbVar3 = this.zzc;
                    zzak(zzgbVar3);
                    String zzf = zzgbVar3.zzf(str);
                    if (!TextUtils.isEmpty(zzf)) {
                        if (c5132a2 == null) {
                            c5132a2 = new C5132a();
                        }
                        c5132a3 = c5132a2;
                        c5132a3.put("If-None-Match", zzf);
                    }
                }
                c5132a = c5132a2;
                this.zzt = true;
                zzfg zzfgVar = this.zzd;
                zzak(zzfgVar);
                zzld zzldVar = new zzld(this);
                zzfgVar.zzg();
                zzfgVar.zzW();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(zzldVar);
                zzfgVar.zzs.zzaz().zzo(new zzff(zzfgVar, str, url, null, c5132a, zzldVar));
            }
            c5132a = c5132a3;
            this.zzt = true;
            zzfg zzfgVar2 = this.zzd;
            zzak(zzfgVar2);
            zzld zzldVar2 = new zzld(this);
            zzfgVar2.zzg();
            zzfgVar2.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzldVar2);
            zzfgVar2.zzs.zzaz().zzo(new zzff(zzfgVar2, str, url, null, c5132a, zzldVar2));
        } catch (MalformedURLException unused) {
            zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzfa.zzn(zzhVar.zzt()), uri);
        }
    }

    final void zzD(zzaw zzawVar, zzq zzqVar) {
        List<zzac> zzt;
        List<zzac> zzt2;
        List<zzac> zzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaz().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j11 = zzawVar.zzd;
        zzpp.zzc();
        zziw zziwVar = null;
        if (zzg().zzs(null, zzen.zzat)) {
            zzfb zzb2 = zzfb.zzb(zzawVar);
            zzaz().zzg();
            if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
                zziwVar = this.zzD;
            }
            zzlt.zzK(zziwVar, zzb2.zzd, false);
            zzawVar = zzb2.zza();
        }
        zzak(this.zzi);
        if (zzln.zzA(zzawVar, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list != null) {
                if (!list.contains(zzawVar.zza)) {
                    zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzawVar.zza, zzawVar.zzc);
                    return;
                } else {
                    Bundle zzc = zzawVar.zzb.zzc();
                    zzc.putLong("ga_safelisted", 1L);
                    zzawVar = new zzaw(zzawVar.zza, new zzau(zzc), zzawVar.zzc, zzawVar.zzd);
                }
            }
            zzam zzamVar = this.zze;
            zzak(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzak(zzamVar2);
                Preconditions.checkNotEmpty(str2);
                zzamVar2.zzg();
                zzamVar2.zzW();
                if (j11 < 0) {
                    zzamVar2.zzs.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzfa.zzn(str2), Long.valueOf(j11));
                    zzt = Collections.EMPTY_LIST;
                } else {
                    zzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j11)});
                }
                for (zzac zzacVar : zzt) {
                    if (zzacVar != null) {
                        zzay().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzaw zzawVar2 = zzacVar.zzg;
                        if (zzawVar2 != null) {
                            zzX(new zzaw(zzawVar2, j11), zzqVar);
                        }
                        zzam zzamVar3 = this.zze;
                        zzak(zzamVar3);
                        zzamVar3.zza(str2, zzacVar.zzc.zzb);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzak(zzamVar4);
                Preconditions.checkNotEmpty(str2);
                zzamVar4.zzg();
                zzamVar4.zzW();
                if (j11 < 0) {
                    zzamVar4.zzs.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzfa.zzn(str2), Long.valueOf(j11));
                    zzt2 = Collections.EMPTY_LIST;
                } else {
                    zzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j11)});
                }
                ArrayList arrayList = new ArrayList(zzt2.size());
                for (zzac zzacVar2 : zzt2) {
                    if (zzacVar2 != null) {
                        zzay().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzam zzamVar5 = this.zze;
                        zzak(zzamVar5);
                        zzamVar5.zzA(str2, zzacVar2.zzc.zzb);
                        zzaw zzawVar3 = zzacVar2.zzk;
                        if (zzawVar3 != null) {
                            arrayList.add(zzawVar3);
                        }
                        zzam zzamVar6 = this.zze;
                        zzak(zzamVar6);
                        zzamVar6.zza(str2, zzacVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzX(new zzaw((zzaw) it.next(), j11), zzqVar);
                }
                zzam zzamVar7 = this.zze;
                zzak(zzamVar7);
                String str3 = zzawVar.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzamVar7.zzg();
                zzamVar7.zzW();
                if (j11 < 0) {
                    zzamVar7.zzs.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzfa.zzn(str2), zzamVar7.zzs.zzj().zzd(str3), Long.valueOf(j11));
                    zzt3 = Collections.EMPTY_LIST;
                } else {
                    zzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j11)});
                }
                ArrayList arrayList2 = new ArrayList(zzt3.size());
                for (zzac zzacVar3 : zzt3) {
                    if (zzacVar3 != null) {
                        zzlo zzloVar = zzacVar3.zzc;
                        zzlq zzlqVar = new zzlq((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzloVar.zzb, j11, Preconditions.checkNotNull(zzloVar.zza()));
                        zzam zzamVar8 = this.zze;
                        zzak(zzamVar8);
                        if (zzamVar8.zzL(zzlqVar)) {
                            zzay().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzlqVar.zzc), zzlqVar.zze);
                        } else {
                            zzay().zzd().zzd("Too many active user properties, ignoring", zzfa.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzlqVar.zzc), zzlqVar.zze);
                        }
                        zzaw zzawVar4 = zzacVar3.zzi;
                        if (zzawVar4 != null) {
                            arrayList2.add(zzawVar4);
                        }
                        zzacVar3.zzc = new zzlo(zzlqVar);
                        zzacVar3.zze = true;
                        zzam zzamVar9 = this.zze;
                        zzak(zzamVar9);
                        zzamVar9.zzK(zzacVar3);
                    }
                }
                zzX(zzawVar, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzX(new zzaw((zzaw) it2.next(), j11), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzak(zzamVar10);
                zzamVar10.zzC();
                zzam zzamVar11 = this.zze;
                zzak(zzamVar11);
                zzamVar11.zzx();
            } catch (Throwable th2) {
                zzam zzamVar12 = this.zze;
                zzak(zzamVar12);
                zzamVar12.zzx();
                throw th2;
            }
        }
    }

    final void zzE(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        zzh zzj = zzamVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean zzac = zzac(zzj);
        if (zzac == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                zzay().zzk().zzb("Could not find package. appId", zzfa.zzn(str));
            }
        } else if (!zzac.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping event. appId", zzfa.zzn(str));
            return;
        }
        zzF(zzawVar, new zzq(str, zzj.zzy(), zzj.zzw(), zzj.zzb(), zzj.zzv(), zzj.zzm(), zzj.zzj(), (String) null, zzj.zzaj(), false, zzj.zzx(), zzj.zza(), 0L, 0, zzj.zzai(), false, zzj.zzr(), zzj.zzq(), zzj.zzk(), zzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null));
    }

    final void zzF(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzfb zzb2 = zzfb.zzb(zzawVar);
        zzlt zzv = zzv();
        Bundle bundle = zzb2.zzd;
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        zzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzM(zzb2, zzg().zzd(zzqVar.zza));
        zzaw zza = zzb2.zza();
        if ("_cmp".equals(zza.zza) && "referrer API v2".equals(zza.zzb.zzg("_cis"))) {
            String zzg = zza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg)) {
                zzV(new zzlo("_lgclid", zza.zzd, zzg, "auto"), zzqVar);
            }
        }
        zzD(zza, zzqVar);
    }

    final void zzG() {
        this.zzs++;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0190, B:25:0x006b, B:29:0x00bd, B:30:0x00ae, B:33:0x00c5, B:35:0x00d1, B:37:0x00d7, B:38:0x00df, B:41:0x00f0, B:43:0x00fc, B:45:0x0102, B:49:0x010f, B:52:0x0144, B:54:0x0159, B:55:0x0178, B:57:0x0183, B:59:0x0189, B:60:0x018d, B:61:0x0167, B:62:0x0128, B:64:0x0133), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a A[Catch: all -> 0x0013, TRY_ENTER, TryCatch #1 {all -> 0x0013, blocks: (B:82:0x0010, B:3:0x0016, B:15:0x0198, B:16:0x011f, B:51:0x011a, B:66:0x013e, B:75:0x019e, B:76:0x01a6, B:5:0x0030, B:13:0x004e, B:14:0x0190, B:25:0x006b, B:29:0x00bd, B:30:0x00ae, B:33:0x00c5, B:35:0x00d1, B:37:0x00d7, B:38:0x00df, B:41:0x00f0, B:43:0x00fc, B:45:0x0102, B:49:0x010f, B:52:0x0144, B:54:0x0159, B:55:0x0178, B:57:0x0183, B:59:0x0189, B:60:0x018d, B:61:0x0167, B:62:0x0128, B:64:0x0133), top: B:81:0x0010, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0190, B:25:0x006b, B:29:0x00bd, B:30:0x00ae, B:33:0x00c5, B:35:0x00d1, B:37:0x00d7, B:38:0x00df, B:41:0x00f0, B:43:0x00fc, B:45:0x0102, B:49:0x010f, B:52:0x0144, B:54:0x0159, B:55:0x0178, B:57:0x0183, B:59:0x0189, B:60:0x018d, B:61:0x0167, B:62:0x0128, B:64:0x0133), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0190, B:25:0x006b, B:29:0x00bd, B:30:0x00ae, B:33:0x00c5, B:35:0x00d1, B:37:0x00d7, B:38:0x00df, B:41:0x00f0, B:43:0x00fc, B:45:0x0102, B:49:0x010f, B:52:0x0144, B:54:0x0159, B:55:0x0178, B:57:0x0183, B:59:0x0189, B:60:0x018d, B:61:0x0167, B:62:0x0128, B:64:0x0133), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0190, B:25:0x006b, B:29:0x00bd, B:30:0x00ae, B:33:0x00c5, B:35:0x00d1, B:37:0x00d7, B:38:0x00df, B:41:0x00f0, B:43:0x00fc, B:45:0x0102, B:49:0x010f, B:52:0x0144, B:54:0x0159, B:55:0x0178, B:57:0x0183, B:59:0x0189, B:60:0x018d, B:61:0x0167, B:62:0x0128, B:64:0x0133), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x0190, B:25:0x006b, B:29:0x00bd, B:30:0x00ae, B:33:0x00c5, B:35:0x00d1, B:37:0x00d7, B:38:0x00df, B:41:0x00f0, B:43:0x00fc, B:45:0x0102, B:49:0x010f, B:52:0x0144, B:54:0x0159, B:55:0x0178, B:57:0x0183, B:59:0x0189, B:60:0x018d, B:61:0x0167, B:62:0x0128, B:64:0x0133), top: B:4:0x0030, outer: #1 }] */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzH(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        boolean z11;
        String str2;
        zzgb zzgbVar;
        zzam zzamVar;
        zzfg zzfgVar;
        zzgb zzgbVar2;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.zzt = false;
                zzad();
                throw th3;
            }
        }
        zzey zzj = zzay().zzj();
        Integer valueOf = Integer.valueOf(bArr.length);
        zzj.zzb("onConfigFetched. Response size", valueOf);
        zzam zzamVar2 = this.zze;
        zzak(zzamVar2);
        zzamVar2.zzw();
        try {
            zzam zzamVar3 = this.zze;
            zzak(zzamVar3);
            zzh zzj2 = zzamVar3.zzj(str);
            if (i11 != 200 && i11 != 204) {
                if (i11 == 304) {
                    i11 = 304;
                }
                z11 = false;
                if (zzj2 == null) {
                    zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzfa.zzn(str));
                } else {
                    if (!z11 && i11 != 404) {
                        zzj2.zzV(zzav().currentTimeMillis());
                        zzam zzamVar4 = this.zze;
                        zzak(zzamVar4);
                        zzamVar4.zzD(zzj2);
                        zzay().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i11), th2);
                        zzgb zzgbVar3 = this.zzc;
                        zzak(zzgbVar3);
                        zzgbVar3.zzl(str);
                        this.zzk.zzd.zzb(zzav().currentTimeMillis());
                        if (i11 == 503 || i11 == 429) {
                            this.zzk.zzb.zzb(zzav().currentTimeMillis());
                        }
                        zzaf();
                    }
                    List list = map != null ? (List) map.get("Last-Modified") : null;
                    String str3 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                    zzpj.zzc();
                    if (zzg().zzs(null, zzen.zzaM)) {
                        List list2 = map != null ? (List) map.get("ETag") : null;
                        if (list2 != null && !list2.isEmpty()) {
                            str2 = (String) list2.get(0);
                            if (i11 != 404 && i11 != 304) {
                                zzgbVar2 = this.zzc;
                                zzak(zzgbVar2);
                                if (!zzgbVar2.zzt(str, bArr, str3, str2)) {
                                    zzamVar = this.zze;
                                    zzak(zzamVar);
                                    zzamVar.zzx();
                                    this.zzt = false;
                                    zzad();
                                }
                                zzj2.zzM(zzav().currentTimeMillis());
                                zzam zzamVar5 = this.zze;
                                zzak(zzamVar5);
                                zzamVar5.zzD(zzj2);
                                if (i11 != 404) {
                                    zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                                } else {
                                    zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i11), valueOf);
                                }
                                zzfgVar = this.zzd;
                                zzak(zzfgVar);
                                if (zzfgVar.zza() || !zzah()) {
                                    zzaf();
                                } else {
                                    zzW();
                                }
                            }
                            zzgbVar = this.zzc;
                            zzak(zzgbVar);
                            if (zzgbVar.zze(str) == null) {
                                zzgb zzgbVar4 = this.zzc;
                                zzak(zzgbVar4);
                                if (!zzgbVar4.zzt(str, null, null, null)) {
                                    zzamVar = this.zze;
                                    zzak(zzamVar);
                                    zzamVar.zzx();
                                    this.zzt = false;
                                    zzad();
                                }
                            }
                            zzj2.zzM(zzav().currentTimeMillis());
                            zzam zzamVar52 = this.zze;
                            zzak(zzamVar52);
                            zzamVar52.zzD(zzj2);
                            if (i11 != 404) {
                            }
                            zzfgVar = this.zzd;
                            zzak(zzfgVar);
                            if (zzfgVar.zza()) {
                            }
                            zzaf();
                        }
                    }
                    str2 = null;
                    if (i11 != 404) {
                        zzgbVar2 = this.zzc;
                        zzak(zzgbVar2);
                        if (!zzgbVar2.zzt(str, bArr, str3, str2)) {
                        }
                        zzj2.zzM(zzav().currentTimeMillis());
                        zzam zzamVar522 = this.zze;
                        zzak(zzamVar522);
                        zzamVar522.zzD(zzj2);
                        if (i11 != 404) {
                        }
                        zzfgVar = this.zzd;
                        zzak(zzfgVar);
                        if (zzfgVar.zza()) {
                        }
                        zzaf();
                    }
                    zzgbVar = this.zzc;
                    zzak(zzgbVar);
                    if (zzgbVar.zze(str) == null) {
                    }
                    zzj2.zzM(zzav().currentTimeMillis());
                    zzam zzamVar5222 = this.zze;
                    zzak(zzamVar5222);
                    zzamVar5222.zzD(zzj2);
                    if (i11 != 404) {
                    }
                    zzfgVar = this.zzd;
                    zzak(zzfgVar);
                    if (zzfgVar.zza()) {
                    }
                    zzaf();
                }
                zzam zzamVar6 = this.zze;
                zzak(zzamVar6);
                zzamVar6.zzC();
                zzamVar = this.zze;
                zzak(zzamVar);
                zzamVar.zzx();
                this.zzt = false;
                zzad();
            }
            if (th2 == null) {
                z11 = true;
                if (zzj2 == null) {
                }
                zzam zzamVar62 = this.zze;
                zzak(zzamVar62);
                zzamVar62.zzC();
                zzamVar = this.zze;
                zzak(zzamVar);
                zzamVar.zzx();
                this.zzt = false;
                zzad();
            }
            z11 = false;
            if (zzj2 == null) {
            }
            zzam zzamVar622 = this.zze;
            zzak(zzamVar622);
            zzamVar622.zzC();
            zzamVar = this.zze;
            zzak(zzamVar);
            zzamVar.zzx();
            this.zzt = false;
            zzad();
        } catch (Throwable th4) {
            zzam zzamVar7 = this.zze;
            zzak(zzamVar7);
            zzamVar7.zzx();
            throw th4;
        }
    }

    final void zzI(boolean z11) {
        zzaf();
    }

    @VisibleForTesting
    final void zzJ(int i11, Throwable th2, byte[] bArr, String str) {
        zzam zzamVar;
        long longValue;
        zzaz().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.zzu = false;
                zzad();
                throw th3;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i11 != 200) {
            if (i11 == 204) {
                i11 = 204;
            }
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i11), th2);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i11 != 503 || i11 == 429) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            }
            zzam zzamVar2 = this.zze;
            zzak(zzamVar2);
            zzamVar2.zzy(list);
            zzaf();
            this.zzu = false;
            zzad();
        }
        if (th2 == null) {
            try {
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzaf();
                zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i11), Integer.valueOf(bArr.length));
                zzam zzamVar3 = this.zze;
                zzak(zzamVar3);
                zzamVar3.zzw();
            } catch (SQLiteException e11) {
                zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e11);
                this.zza = zzav().elapsedRealtime();
                zzay().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            try {
                for (Long l11 : list) {
                    try {
                        zzamVar = this.zze;
                        zzak(zzamVar);
                        longValue = l11.longValue();
                        zzamVar.zzg();
                        zzamVar.zzW();
                    } catch (SQLiteException e12) {
                        List list2 = this.zzz;
                        if (list2 == null || !list2.contains(l11)) {
                            throw e12;
                        }
                    }
                    try {
                        if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    } catch (SQLiteException e13) {
                        zzamVar.zzs.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e13);
                        throw e13;
                    }
                }
                zzam zzamVar4 = this.zze;
                zzak(zzamVar4);
                zzamVar4.zzC();
                zzam zzamVar5 = this.zze;
                zzak(zzamVar5);
                zzamVar5.zzx();
                this.zzz = null;
                zzfg zzfgVar = this.zzd;
                zzak(zzfgVar);
                if (zzfgVar.zza() && zzah()) {
                    zzW();
                } else {
                    this.zzA = -1L;
                    zzaf();
                }
                this.zza = 0L;
                this.zzu = false;
                zzad();
            } catch (Throwable th4) {
                zzam zzamVar6 = this.zze;
                zzak(zzamVar6);
                zzamVar6.zzx();
                throw th4;
            }
        }
        zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i11), th2);
        this.zzk.zzd.zzb(zzav().currentTimeMillis());
        if (i11 != 503) {
        }
        this.zzk.zzb.zzb(zzav().currentTimeMillis());
        zzam zzamVar22 = this.zze;
        zzak(zzamVar22);
        zzamVar22.zzy(list);
        zzaf();
        this.zzu = false;
        zzad();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:91|92|(2:94|(9:96|(3:98|(2:100|(1:102))(1:123)|122)(1:124)|103|(1:105)(1:121)|106|107|108|109|(4:111|(1:113)(1:117)|114|(1:116))))|125|108|109|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0495, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0496, code lost:
    
        zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzfa.zzn(r8), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04a9 A[Catch: all -> 0x00c2, TryCatch #2 {all -> 0x00c2, blocks: (B:24:0x00a5, B:26:0x00b4, B:30:0x010b, B:32:0x011e, B:34:0x0136, B:36:0x015d, B:38:0x01ac, B:42:0x01c2, B:44:0x01da, B:46:0x01e5, B:49:0x01f8, B:52:0x0206, B:55:0x0211, B:57:0x0214, B:61:0x0233, B:63:0x0238, B:65:0x0257, B:69:0x026a, B:71:0x0294, B:73:0x029e, B:75:0x02ad, B:76:0x039c, B:78:0x03c8, B:79:0x03cb, B:81:0x03f4, B:85:0x04c8, B:86:0x04cb, B:87:0x0540, B:92:0x0409, B:94:0x042e, B:96:0x0436, B:98:0x043c, B:102:0x044f, B:103:0x0464, B:106:0x0470, B:109:0x0485, B:111:0x04a9, B:113:0x04b1, B:114:0x04b9, B:116:0x04bf, B:120:0x0496, B:123:0x045b, B:128:0x041a, B:129:0x02c0, B:131:0x02ed, B:132:0x02fe, B:134:0x0305, B:136:0x030b, B:138:0x0315, B:140:0x031b, B:142:0x0321, B:144:0x0327, B:146:0x032c, B:151:0x0354, B:155:0x0359, B:156:0x036d, B:157:0x037d, B:159:0x038d, B:160:0x04dd, B:162:0x050d, B:163:0x0510, B:164:0x0524, B:166:0x0528, B:167:0x0247, B:169:0x00c5, B:171:0x00c9, B:174:0x00da, B:176:0x00eb, B:178:0x00f5, B:182:0x00fd), top: B:23:0x00a5, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0524 A[Catch: all -> 0x00c2, TryCatch #2 {all -> 0x00c2, blocks: (B:24:0x00a5, B:26:0x00b4, B:30:0x010b, B:32:0x011e, B:34:0x0136, B:36:0x015d, B:38:0x01ac, B:42:0x01c2, B:44:0x01da, B:46:0x01e5, B:49:0x01f8, B:52:0x0206, B:55:0x0211, B:57:0x0214, B:61:0x0233, B:63:0x0238, B:65:0x0257, B:69:0x026a, B:71:0x0294, B:73:0x029e, B:75:0x02ad, B:76:0x039c, B:78:0x03c8, B:79:0x03cb, B:81:0x03f4, B:85:0x04c8, B:86:0x04cb, B:87:0x0540, B:92:0x0409, B:94:0x042e, B:96:0x0436, B:98:0x043c, B:102:0x044f, B:103:0x0464, B:106:0x0470, B:109:0x0485, B:111:0x04a9, B:113:0x04b1, B:114:0x04b9, B:116:0x04bf, B:120:0x0496, B:123:0x045b, B:128:0x041a, B:129:0x02c0, B:131:0x02ed, B:132:0x02fe, B:134:0x0305, B:136:0x030b, B:138:0x0315, B:140:0x031b, B:142:0x0321, B:144:0x0327, B:146:0x032c, B:151:0x0354, B:155:0x0359, B:156:0x036d, B:157:0x037d, B:159:0x038d, B:160:0x04dd, B:162:0x050d, B:163:0x0510, B:164:0x0524, B:166:0x0528, B:167:0x0247, B:169:0x00c5, B:171:0x00c9, B:174:0x00da, B:176:0x00eb, B:178:0x00f5, B:182:0x00fd), top: B:23:0x00a5, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0247 A[Catch: all -> 0x00c2, TryCatch #2 {all -> 0x00c2, blocks: (B:24:0x00a5, B:26:0x00b4, B:30:0x010b, B:32:0x011e, B:34:0x0136, B:36:0x015d, B:38:0x01ac, B:42:0x01c2, B:44:0x01da, B:46:0x01e5, B:49:0x01f8, B:52:0x0206, B:55:0x0211, B:57:0x0214, B:61:0x0233, B:63:0x0238, B:65:0x0257, B:69:0x026a, B:71:0x0294, B:73:0x029e, B:75:0x02ad, B:76:0x039c, B:78:0x03c8, B:79:0x03cb, B:81:0x03f4, B:85:0x04c8, B:86:0x04cb, B:87:0x0540, B:92:0x0409, B:94:0x042e, B:96:0x0436, B:98:0x043c, B:102:0x044f, B:103:0x0464, B:106:0x0470, B:109:0x0485, B:111:0x04a9, B:113:0x04b1, B:114:0x04b9, B:116:0x04bf, B:120:0x0496, B:123:0x045b, B:128:0x041a, B:129:0x02c0, B:131:0x02ed, B:132:0x02fe, B:134:0x0305, B:136:0x030b, B:138:0x0315, B:140:0x031b, B:142:0x0321, B:144:0x0327, B:146:0x032c, B:151:0x0354, B:155:0x0359, B:156:0x036d, B:157:0x037d, B:159:0x038d, B:160:0x04dd, B:162:0x050d, B:163:0x0510, B:164:0x0524, B:166:0x0528, B:167:0x0247, B:169:0x00c5, B:171:0x00c9, B:174:0x00da, B:176:0x00eb, B:178:0x00f5, B:182:0x00fd), top: B:23:0x00a5, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e A[Catch: all -> 0x00c2, TryCatch #2 {all -> 0x00c2, blocks: (B:24:0x00a5, B:26:0x00b4, B:30:0x010b, B:32:0x011e, B:34:0x0136, B:36:0x015d, B:38:0x01ac, B:42:0x01c2, B:44:0x01da, B:46:0x01e5, B:49:0x01f8, B:52:0x0206, B:55:0x0211, B:57:0x0214, B:61:0x0233, B:63:0x0238, B:65:0x0257, B:69:0x026a, B:71:0x0294, B:73:0x029e, B:75:0x02ad, B:76:0x039c, B:78:0x03c8, B:79:0x03cb, B:81:0x03f4, B:85:0x04c8, B:86:0x04cb, B:87:0x0540, B:92:0x0409, B:94:0x042e, B:96:0x0436, B:98:0x043c, B:102:0x044f, B:103:0x0464, B:106:0x0470, B:109:0x0485, B:111:0x04a9, B:113:0x04b1, B:114:0x04b9, B:116:0x04bf, B:120:0x0496, B:123:0x045b, B:128:0x041a, B:129:0x02c0, B:131:0x02ed, B:132:0x02fe, B:134:0x0305, B:136:0x030b, B:138:0x0315, B:140:0x031b, B:142:0x0321, B:144:0x0327, B:146:0x032c, B:151:0x0354, B:155:0x0359, B:156:0x036d, B:157:0x037d, B:159:0x038d, B:160:0x04dd, B:162:0x050d, B:163:0x0510, B:164:0x0524, B:166:0x0528, B:167:0x0247, B:169:0x00c5, B:171:0x00c9, B:174:0x00da, B:176:0x00eb, B:178:0x00f5, B:182:0x00fd), top: B:23:0x00a5, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01da A[Catch: all -> 0x00c2, TryCatch #2 {all -> 0x00c2, blocks: (B:24:0x00a5, B:26:0x00b4, B:30:0x010b, B:32:0x011e, B:34:0x0136, B:36:0x015d, B:38:0x01ac, B:42:0x01c2, B:44:0x01da, B:46:0x01e5, B:49:0x01f8, B:52:0x0206, B:55:0x0211, B:57:0x0214, B:61:0x0233, B:63:0x0238, B:65:0x0257, B:69:0x026a, B:71:0x0294, B:73:0x029e, B:75:0x02ad, B:76:0x039c, B:78:0x03c8, B:79:0x03cb, B:81:0x03f4, B:85:0x04c8, B:86:0x04cb, B:87:0x0540, B:92:0x0409, B:94:0x042e, B:96:0x0436, B:98:0x043c, B:102:0x044f, B:103:0x0464, B:106:0x0470, B:109:0x0485, B:111:0x04a9, B:113:0x04b1, B:114:0x04b9, B:116:0x04bf, B:120:0x0496, B:123:0x045b, B:128:0x041a, B:129:0x02c0, B:131:0x02ed, B:132:0x02fe, B:134:0x0305, B:136:0x030b, B:138:0x0315, B:140:0x031b, B:142:0x0321, B:144:0x0327, B:146:0x032c, B:151:0x0354, B:155:0x0359, B:156:0x036d, B:157:0x037d, B:159:0x038d, B:160:0x04dd, B:162:0x050d, B:163:0x0510, B:164:0x0524, B:166:0x0528, B:167:0x0247, B:169:0x00c5, B:171:0x00c9, B:174:0x00da, B:176:0x00eb, B:178:0x00f5, B:182:0x00fd), top: B:23:0x00a5, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0214 A[Catch: all -> 0x00c2, TryCatch #2 {all -> 0x00c2, blocks: (B:24:0x00a5, B:26:0x00b4, B:30:0x010b, B:32:0x011e, B:34:0x0136, B:36:0x015d, B:38:0x01ac, B:42:0x01c2, B:44:0x01da, B:46:0x01e5, B:49:0x01f8, B:52:0x0206, B:55:0x0211, B:57:0x0214, B:61:0x0233, B:63:0x0238, B:65:0x0257, B:69:0x026a, B:71:0x0294, B:73:0x029e, B:75:0x02ad, B:76:0x039c, B:78:0x03c8, B:79:0x03cb, B:81:0x03f4, B:85:0x04c8, B:86:0x04cb, B:87:0x0540, B:92:0x0409, B:94:0x042e, B:96:0x0436, B:98:0x043c, B:102:0x044f, B:103:0x0464, B:106:0x0470, B:109:0x0485, B:111:0x04a9, B:113:0x04b1, B:114:0x04b9, B:116:0x04bf, B:120:0x0496, B:123:0x045b, B:128:0x041a, B:129:0x02c0, B:131:0x02ed, B:132:0x02fe, B:134:0x0305, B:136:0x030b, B:138:0x0315, B:140:0x031b, B:142:0x0321, B:144:0x0327, B:146:0x032c, B:151:0x0354, B:155:0x0359, B:156:0x036d, B:157:0x037d, B:159:0x038d, B:160:0x04dd, B:162:0x050d, B:163:0x0510, B:164:0x0524, B:166:0x0528, B:167:0x0247, B:169:0x00c5, B:171:0x00c9, B:174:0x00da, B:176:0x00eb, B:178:0x00f5, B:182:0x00fd), top: B:23:0x00a5, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0238 A[Catch: all -> 0x00c2, TryCatch #2 {all -> 0x00c2, blocks: (B:24:0x00a5, B:26:0x00b4, B:30:0x010b, B:32:0x011e, B:34:0x0136, B:36:0x015d, B:38:0x01ac, B:42:0x01c2, B:44:0x01da, B:46:0x01e5, B:49:0x01f8, B:52:0x0206, B:55:0x0211, B:57:0x0214, B:61:0x0233, B:63:0x0238, B:65:0x0257, B:69:0x026a, B:71:0x0294, B:73:0x029e, B:75:0x02ad, B:76:0x039c, B:78:0x03c8, B:79:0x03cb, B:81:0x03f4, B:85:0x04c8, B:86:0x04cb, B:87:0x0540, B:92:0x0409, B:94:0x042e, B:96:0x0436, B:98:0x043c, B:102:0x044f, B:103:0x0464, B:106:0x0470, B:109:0x0485, B:111:0x04a9, B:113:0x04b1, B:114:0x04b9, B:116:0x04bf, B:120:0x0496, B:123:0x045b, B:128:0x041a, B:129:0x02c0, B:131:0x02ed, B:132:0x02fe, B:134:0x0305, B:136:0x030b, B:138:0x0315, B:140:0x031b, B:142:0x0321, B:144:0x0327, B:146:0x032c, B:151:0x0354, B:155:0x0359, B:156:0x036d, B:157:0x037d, B:159:0x038d, B:160:0x04dd, B:162:0x050d, B:163:0x0510, B:164:0x0524, B:166:0x0528, B:167:0x0247, B:169:0x00c5, B:171:0x00c9, B:174:0x00da, B:176:0x00eb, B:178:0x00f5, B:182:0x00fd), top: B:23:0x00a5, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0257 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #2 {all -> 0x00c2, blocks: (B:24:0x00a5, B:26:0x00b4, B:30:0x010b, B:32:0x011e, B:34:0x0136, B:36:0x015d, B:38:0x01ac, B:42:0x01c2, B:44:0x01da, B:46:0x01e5, B:49:0x01f8, B:52:0x0206, B:55:0x0211, B:57:0x0214, B:61:0x0233, B:63:0x0238, B:65:0x0257, B:69:0x026a, B:71:0x0294, B:73:0x029e, B:75:0x02ad, B:76:0x039c, B:78:0x03c8, B:79:0x03cb, B:81:0x03f4, B:85:0x04c8, B:86:0x04cb, B:87:0x0540, B:92:0x0409, B:94:0x042e, B:96:0x0436, B:98:0x043c, B:102:0x044f, B:103:0x0464, B:106:0x0470, B:109:0x0485, B:111:0x04a9, B:113:0x04b1, B:114:0x04b9, B:116:0x04bf, B:120:0x0496, B:123:0x045b, B:128:0x041a, B:129:0x02c0, B:131:0x02ed, B:132:0x02fe, B:134:0x0305, B:136:0x030b, B:138:0x0315, B:140:0x031b, B:142:0x0321, B:144:0x0327, B:146:0x032c, B:151:0x0354, B:155:0x0359, B:156:0x036d, B:157:0x037d, B:159:0x038d, B:160:0x04dd, B:162:0x050d, B:163:0x0510, B:164:0x0524, B:166:0x0528, B:167:0x0247, B:169:0x00c5, B:171:0x00c9, B:174:0x00da, B:176:0x00eb, B:178:0x00f5, B:182:0x00fd), top: B:23:0x00a5, inners: #0, #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzK(zzq zzqVar) {
        long j11;
        zzh zzj;
        long j12;
        zzas zzn;
        boolean z11;
        long j13;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        long j14;
        long j15;
        boolean z12;
        long j16;
        boolean z13;
        String zzw;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzaj(zzqVar)) {
            zzam zzamVar = this.zze;
            zzak(zzamVar);
            zzh zzj2 = zzamVar.zzj(zzqVar.zza);
            if (zzj2 != null && TextUtils.isEmpty(zzj2.zzy()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzj2.zzM(0L);
                zzam zzamVar2 = this.zze;
                zzak(zzamVar2);
                zzamVar2.zzD(zzj2);
                zzgb zzgbVar = this.zzc;
                zzak(zzgbVar);
                zzgbVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long j17 = zzqVar.zzm;
            if (j17 == 0) {
                j17 = zzav().currentTimeMillis();
            }
            long j18 = j17;
            this.zzn.zzg().zzd();
            int i11 = zzqVar.zzn;
            if (i11 != 0 && i11 != 1) {
                zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzfa.zzn(zzqVar.zza), Integer.valueOf(i11));
                i11 = 0;
            }
            zzam zzamVar3 = this.zze;
            zzak(zzamVar3);
            zzamVar3.zzw();
            try {
                zzam zzamVar4 = this.zze;
                zzak(zzamVar4);
                zzlq zzp = zzamVar4.zzp(zzqVar.zza, "_npa");
                if (zzp != null && !"auto".equals(zzp.zzb)) {
                    j11 = 1;
                    zzam zzamVar5 = this.zze;
                    zzak(zzamVar5);
                    zzj = zzamVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                    if (zzj == null) {
                        j12 = j11;
                        if (zzv().zzam(zzqVar.zzb, zzj.zzy(), zzqVar.zzq, zzj.zzr())) {
                            zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzfa.zzn(zzj.zzt()));
                            zzam zzamVar6 = this.zze;
                            zzak(zzamVar6);
                            String zzt = zzj.zzt();
                            zzamVar6.zzW();
                            zzamVar6.zzg();
                            Preconditions.checkNotEmpty(zzt);
                            try {
                                SQLiteDatabase zzh = zzamVar6.zzh();
                                String[] strArr = {zzt};
                                int delete = zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("apps", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("event_filters", "app_id=?", strArr) + zzh.delete("property_filters", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("consent_settings", "app_id=?", strArr);
                                if (delete > 0) {
                                    zzamVar6.zzs.zzay().zzj().zzc("Deleted application data. app, records", zzt, Integer.valueOf(delete));
                                }
                            } catch (SQLiteException e11) {
                                zzamVar6.zzs.zzay().zzd().zzc("Error deleting application data. appId, error", zzfa.zzn(zzt), e11);
                            }
                            zzj = null;
                        }
                    } else {
                        j12 = j11;
                    }
                    if (zzj != null) {
                        if (zzj.zzb() != -2147483648L) {
                            j16 = -2147483648L;
                            if (zzj.zzb() != zzqVar.zzj) {
                                z13 = true;
                                zzw = zzj.zzw();
                                if (z13 | ((zzj.zzb() == j16 || zzw == null || zzw.equals(zzqVar.zzc)) ? false : true)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("_pv", zzw);
                                    zzaw zzawVar = new zzaw("_au", new zzau(bundle), "auto", j18);
                                    j18 = j18;
                                    zzD(zzawVar, zzqVar);
                                }
                            }
                        } else {
                            j16 = -2147483648L;
                        }
                        z13 = false;
                        zzw = zzj.zzw();
                        if (z13 | ((zzj.zzb() == j16 || zzw == null || zzw.equals(zzqVar.zzc)) ? false : true)) {
                        }
                    }
                    zzd(zzqVar);
                    if (i11 != 0) {
                        zzam zzamVar7 = this.zze;
                        zzak(zzamVar7);
                        zzn = zzamVar7.zzn(zzqVar.zza, "_f");
                        z11 = false;
                    } else {
                        zzam zzamVar8 = this.zze;
                        zzak(zzamVar8);
                        zzn = zzamVar8.zzn(zzqVar.zza, "_v");
                        z11 = true;
                    }
                    if (zzn != null) {
                        long j19 = ((j18 / 3600000) + j12) * 3600000;
                        if (z11) {
                            zzV(new zzlo("_fvt", j18, Long.valueOf(j19), "auto"), zzqVar);
                            zzaz().zzg();
                            zzB();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1L);
                            bundle2.putLong("_r", 1L);
                            bundle2.putLong("_et", 1L);
                            if (zzqVar.zzp) {
                                bundle2.putLong("_dac", 1L);
                            }
                            zzF(new zzaw("_v", new zzau(bundle2), "auto", j18), zzqVar);
                        } else {
                            zzV(new zzlo("_fot", j18, Long.valueOf(j19), "auto"), zzqVar);
                            zzaz().zzg();
                            zzfs zzfsVar = (zzfs) Preconditions.checkNotNull(this.zzm);
                            String str = zzqVar.zza;
                            if (str == null || str.isEmpty()) {
                                j13 = j18;
                                zzfsVar.zza.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                zzfsVar.zza.zzaz().zzg();
                                if (zzfsVar.zza()) {
                                    zzfr zzfrVar = new zzfr(zzfsVar, str);
                                    zzfsVar.zza.zzaz().zzg();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    j13 = j18;
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = zzfsVar.zza.zzau().getPackageManager();
                                    if (packageManager == null) {
                                        zzfsVar.zza.zzay().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            zzfsVar.zza.zzay().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str2 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str2) && zzfsVar.zza()) {
                                                    try {
                                                        zzfsVar.zza.zzay().zzj().zzb("Install Referrer Service is", true != ConnectionTracker.getInstance().bindService(zzfsVar.zza.zzau(), new Intent(intent), zzfrVar, 1) ? "not available" : "available");
                                                    } catch (RuntimeException e12) {
                                                        zzfsVar.zza.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", e12.getMessage());
                                                    }
                                                } else {
                                                    zzfsVar.zza.zzay().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzfsVar.zza.zzay().zzi().zza("Install Referrer Reporter is not available");
                                    j13 = j18;
                                }
                            }
                            zzaz().zzg();
                            zzB();
                            Bundle bundle3 = new Bundle();
                            long j21 = j12;
                            bundle3.putLong("_c", j21);
                            bundle3.putLong("_r", j21);
                            bundle3.putLong("_uwa", 0L);
                            bundle3.putLong("_pfo", 0L);
                            bundle3.putLong("_sys", 0L);
                            bundle3.putLong("_sysu", 0L);
                            bundle3.putLong("_et", j21);
                            if (zzqVar.zzp) {
                                bundle3.putLong("_dac", j21);
                            }
                            String str3 = (String) Preconditions.checkNotNull(zzqVar.zza);
                            zzam zzamVar9 = this.zze;
                            zzak(zzamVar9);
                            Preconditions.checkNotEmpty(str3);
                            zzamVar9.zzg();
                            zzamVar9.zzW();
                            long zzc = zzamVar9.zzc(str3, "first_open_count");
                            if (this.zzn.zzau().getPackageManager() == null) {
                                zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzfa.zzn(str3));
                            } else {
                                try {
                                    packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str3, 0);
                                } catch (PackageManager.NameNotFoundException e13) {
                                    zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzfa.zzn(str3), e13);
                                    packageInfo = null;
                                }
                                if (packageInfo != null) {
                                    long j22 = packageInfo.firstInstallTime;
                                    if (j22 != 0) {
                                        if (j22 != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (!zzg().zzs(null, zzen.zzac)) {
                                                bundle3.putLong("_uwa", 1L);
                                            } else if (zzc == 0) {
                                                bundle3.putLong("_uwa", 1L);
                                                z12 = false;
                                                j15 = 0;
                                            }
                                            j15 = zzc;
                                            z12 = false;
                                        } else {
                                            applicationInfo = null;
                                            j15 = zzc;
                                            z12 = true;
                                        }
                                        long j23 = j13;
                                        j13 = j23;
                                        zzV(new zzlo("_fi", j23, Long.valueOf(true != z12 ? 0L : 1L), "auto"), zzqVar);
                                        zzc = j15;
                                        applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str3, 0);
                                        if (applicationInfo != null) {
                                            if ((applicationInfo.flags & 1) != 0) {
                                                j14 = 1;
                                                bundle3.putLong("_sys", 1L);
                                            } else {
                                                j14 = 1;
                                            }
                                            if ((applicationInfo.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                                bundle3.putLong("_sysu", j14);
                                            }
                                        }
                                    }
                                }
                                applicationInfo = null;
                                applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str3, 0);
                                if (applicationInfo != null) {
                                }
                            }
                            if (zzc >= 0) {
                                bundle3.putLong("_pfo", zzc);
                            }
                            zzF(new zzaw("_f", new zzau(bundle3), "auto", j13), zzqVar);
                        }
                    } else if (zzqVar.zzi) {
                        zzF(new zzaw("_cd", new zzau(new Bundle()), "auto", j18), zzqVar);
                    }
                    zzam zzamVar10 = this.zze;
                    zzak(zzamVar10);
                    zzamVar10.zzC();
                    zzam zzamVar11 = this.zze;
                    zzak(zzamVar11);
                    zzamVar11.zzx();
                }
                if (zzqVar.zzr != null) {
                    j11 = 1;
                    zzlo zzloVar = new zzlo("_npa", j18, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto");
                    if (zzp == null || !zzp.zze.equals(zzloVar.zzd)) {
                        zzV(zzloVar, zzqVar);
                    }
                } else {
                    j11 = 1;
                    if (zzp != null) {
                        zzO(new zzlo("_npa", j18, null, "auto"), zzqVar);
                    }
                }
                zzam zzamVar52 = this.zze;
                zzak(zzamVar52);
                zzj = zzamVar52.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzj == null) {
                }
                if (zzj != null) {
                }
                zzd(zzqVar);
                if (i11 != 0) {
                }
                if (zzn != null) {
                }
                zzam zzamVar102 = this.zze;
                zzak(zzamVar102);
                zzamVar102.zzC();
                zzam zzamVar112 = this.zze;
                zzak(zzamVar112);
                zzamVar112.zzx();
            } catch (Throwable th2) {
                zzam zzamVar12 = this.zze;
                zzak(zzamVar12);
                zzamVar12.zzx();
                throw th2;
            }
        }
    }

    final void zzL() {
        this.zzr++;
    }

    final void zzM(zzac zzacVar) {
        zzq zzab = zzab((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzab != null) {
            zzN(zzacVar, zzab);
        }
    }

    final void zzN(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzaj(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzam zzamVar = this.zze;
            zzak(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzam zzamVar2 = this.zze;
                zzak(zzamVar2);
                zzac zzk = zzamVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzk != null) {
                    zzay().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzam zzamVar3 = this.zze;
                    zzak(zzamVar3);
                    zzamVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzk.zze) {
                        zzam zzamVar4 = this.zze;
                        zzak(zzamVar4);
                        zzamVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        zzX((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzauVar != null ? zzauVar.zzc() : null, zzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzay().zzk().zzc("Conditional user property doesn't exist", zzfa.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzak(zzamVar5);
                zzamVar5.zzC();
                zzam zzamVar6 = this.zze;
                zzak(zzamVar6);
                zzamVar6.zzx();
            } catch (Throwable th2) {
                zzam zzamVar7 = this.zze;
                zzak(zzamVar7);
                zzamVar7.zzx();
                throw th2;
            }
        }
    }

    final void zzO(zzlo zzloVar, zzq zzqVar) {
        zzaz().zzg();
        zzB();
        if (zzaj(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(zzloVar.zzb) && zzqVar.zzr != null) {
                zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzV(new zzlo("_npa", zzav().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto"), zzqVar);
                return;
            }
            zzay().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzloVar.zzb));
            zzam zzamVar = this.zze;
            zzak(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                zzne.zzc();
                if (this.zzn.zzf().zzs(null, zzen.zzan) && this.zzn.zzf().zzs(null, zzen.zzap) && "_id".equals(zzloVar.zzb)) {
                    zzam zzamVar2 = this.zze;
                    zzak(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzak(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), zzloVar.zzb);
                zzam zzamVar4 = this.zze;
                zzak(zzamVar4);
                zzamVar4.zzC();
                zzay().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzloVar.zzb));
                zzam zzamVar5 = this.zze;
                zzak(zzamVar5);
                zzamVar5.zzx();
            } catch (Throwable th2) {
                zzam zzamVar6 = this.zze;
                zzak(zzamVar6);
                zzamVar6.zzx();
                throw th2;
            }
        }
    }

    @VisibleForTesting
    final void zzP(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzamVar.zzg();
        zzamVar.zzW();
        try {
            SQLiteDatabase zzh = zzamVar.zzh();
            String[] strArr = {str};
            int delete = zzh.delete("apps", "app_id=?", strArr) + zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("queue", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("main_event_params", "app_id=?", strArr) + zzh.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzamVar.zzs.zzay().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e11) {
            zzamVar.zzs.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzfa.zzn(str), e11);
        }
        if (zzqVar.zzh) {
            zzK(zzqVar);
        }
    }

    public final void zzQ(String str, zziw zziwVar) {
        zzaz().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zziwVar != null) {
            this.zzE = str;
            this.zzD = zziwVar;
        }
    }

    protected final void zzR() {
        zzaz().zzg();
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzaf();
    }

    final void zzS(zzac zzacVar) {
        zzq zzab = zzab((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzab != null) {
            zzT(zzacVar, zzab);
        }
    }

    final void zzT(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzaj(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z11 = false;
            zzacVar2.zze = false;
            zzam zzamVar = this.zze;
            zzak(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzak(zzamVar2);
                zzac zzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzk != null && !zzk.zzb.equals(zzacVar2.zzb)) {
                    zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzk.zzb);
                }
                if (zzk != null && zzk.zze) {
                    zzacVar2.zzb = zzk.zzb;
                    zzacVar2.zzd = zzk.zzd;
                    zzacVar2.zzh = zzk.zzh;
                    zzacVar2.zzf = zzk.zzf;
                    zzacVar2.zzi = zzk.zzi;
                    zzacVar2.zze = true;
                    zzlo zzloVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlo(zzloVar.zzb, zzk.zzc.zzc, zzloVar.zza(), zzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzlo zzloVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlo(zzloVar2.zzb, zzacVar2.zzd, zzloVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z11 = true;
                }
                if (zzacVar2.zze) {
                    zzlo zzloVar3 = zzacVar2.zzc;
                    zzlq zzlqVar = new zzlq((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzloVar3.zzb, zzloVar3.zzc, Preconditions.checkNotNull(zzloVar3.zza()));
                    zzam zzamVar3 = this.zze;
                    zzak(zzamVar3);
                    if (zzamVar3.zzL(zzlqVar)) {
                        zzay().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzlqVar.zzc), zzlqVar.zze);
                    } else {
                        zzay().zzd().zzd("(2)Too many active user properties, ignoring", zzfa.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzlqVar.zzc), zzlqVar.zze);
                    }
                    if (z11 && zzacVar2.zzi != null) {
                        zzX(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzak(zzamVar4);
                if (zzamVar4.zzK(zzacVar2)) {
                    zzay().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                } else {
                    zzay().zzd().zzd("Too many conditional properties, ignoring", zzfa.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                }
                zzam zzamVar5 = this.zze;
                zzak(zzamVar5);
                zzamVar5.zzC();
                zzam zzamVar6 = this.zze;
                zzak(zzamVar6);
                zzamVar6.zzx();
            } catch (Throwable th2) {
                zzam zzamVar7 = this.zze;
                zzak(zzamVar7);
                zzamVar7.zzx();
                throw th2;
            }
        }
    }

    final void zzU(String str, zzai zzaiVar) {
        zzaz().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzs.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzfa.zzn(str));
            }
        } catch (SQLiteException e11) {
            zzamVar.zzs.zzay().zzd().zzc("Error storing consent setting. appId, error", zzfa.zzn(str), e11);
        }
    }

    final void zzV(zzlo zzloVar, zzq zzqVar) {
        long j11;
        zzaz().zzg();
        zzB();
        if (zzaj(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int zzl = zzv().zzl(zzloVar.zzb);
            if (zzl != 0) {
                zzlt zzv = zzv();
                String str = zzloVar.zzb;
                zzg();
                String zzD = zzv.zzD(str, 24, true);
                String str2 = zzloVar.zzb;
                zzv().zzN(this.zzF, zzqVar.zza, zzl, "_ev", zzD, str2 != null ? str2.length() : 0);
                return;
            }
            int zzd = zzv().zzd(zzloVar.zzb, zzloVar.zza());
            if (zzd != 0) {
                zzlt zzv2 = zzv();
                String str3 = zzloVar.zzb;
                zzg();
                String zzD2 = zzv2.zzD(str3, 24, true);
                Object zza = zzloVar.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    r6 = zza.toString().length();
                }
                zzv().zzN(this.zzF, zzqVar.zza, zzd, "_ev", zzD2, r6);
                return;
            }
            Object zzB = zzv().zzB(zzloVar.zzb, zzloVar.zza());
            if (zzB == null) {
                return;
            }
            if ("_sid".equals(zzloVar.zzb)) {
                long j12 = zzloVar.zzc;
                String str4 = zzloVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzam zzamVar = this.zze;
                zzak(zzamVar);
                zzlq zzp = zzamVar.zzp(str5, "_sno");
                if (zzp != null) {
                    Object obj = zzp.zze;
                    if (obj instanceof Long) {
                        j11 = ((Long) obj).longValue();
                        zzV(new zzlo("_sno", j12, Long.valueOf(j11 + 1), str4), zzqVar);
                    }
                }
                if (zzp != null) {
                    zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp.zze);
                }
                zzam zzamVar2 = this.zze;
                zzak(zzamVar2);
                zzas zzn = zzamVar2.zzn(str5, "_s");
                if (zzn != null) {
                    j11 = zzn.zzc;
                    zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j11));
                } else {
                    j11 = 0;
                }
                zzV(new zzlo("_sno", j12, Long.valueOf(j11 + 1), str4), zzqVar);
            }
            zzlq zzlqVar = new zzlq((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzloVar.zzf), zzloVar.zzb, zzloVar.zzc, zzB);
            zzay().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzlqVar.zzc), zzB);
            zzam zzamVar3 = this.zze;
            zzak(zzamVar3);
            zzamVar3.zzw();
            try {
                zzne.zzc();
                if (this.zzn.zzf().zzs(null, zzen.zzan) && "_id".equals(zzlqVar.zzc)) {
                    if (this.zzn.zzf().zzs(null, zzen.zzaq)) {
                        zzam zzamVar4 = this.zze;
                        zzak(zzamVar4);
                        zzlq zzp2 = zzamVar4.zzp(zzqVar.zza, "_id");
                        if (zzp2 != null && !zzlqVar.zze.equals(zzp2.zze)) {
                            zzam zzamVar5 = this.zze;
                            zzak(zzamVar5);
                            zzamVar5.zzA(zzqVar.zza, "_lair");
                        }
                    } else {
                        zzam zzamVar6 = this.zze;
                        zzak(zzamVar6);
                        zzamVar6.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzam zzamVar7 = this.zze;
                zzak(zzamVar7);
                boolean zzL = zzamVar7.zzL(zzlqVar);
                zzam zzamVar8 = this.zze;
                zzak(zzamVar8);
                zzamVar8.zzC();
                if (!zzL) {
                    zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzlqVar.zzc), zzlqVar.zze);
                    zzv().zzN(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
                zzam zzamVar9 = this.zze;
                zzak(zzamVar9);
                zzamVar9.zzx();
            } catch (Throwable th2) {
                zzam zzamVar10 = this.zze;
                zzak(zzamVar10);
                zzamVar10.zzx();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:314:0x069b, code lost:
    
        if (r13 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (r10 == null) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0683: MOVE (r9 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:324:0x0683 */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04bc A[Catch: all -> 0x0293, TryCatch #17 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:67:0x013a, B:70:0x0162, B:73:0x016a, B:82:0x02c2, B:84:0x02c8, B:86:0x02d4, B:87:0x02d8, B:89:0x02de, B:92:0x02f2, B:95:0x02fb, B:97:0x0301, B:101:0x0326, B:102:0x0316, B:105:0x0320, B:111:0x0329, B:113:0x0344, B:116:0x0354, B:118:0x0379, B:120:0x03b1, B:122:0x03b6, B:124:0x03be, B:125:0x03c1, B:127:0x03d0, B:129:0x03db, B:130:0x03de, B:132:0x03ea, B:134:0x03f5, B:135:0x03f8, B:137:0x0403, B:138:0x0406, B:140:0x0412, B:142:0x041d, B:144:0x0426, B:145:0x0429, B:147:0x0435, B:149:0x0440, B:150:0x0443, B:152:0x044f, B:154:0x045a, B:156:0x0469, B:158:0x0473, B:161:0x049a, B:162:0x04a5, B:163:0x04b0, B:165:0x04bc, B:167:0x04c7, B:169:0x04cc, B:170:0x04cf, B:172:0x04db, B:174:0x04f1, B:179:0x04fd, B:181:0x050e, B:182:0x0520, B:184:0x0542, B:186:0x0553, B:188:0x059b, B:190:0x05ad, B:191:0x05c2, B:193:0x05cd, B:194:0x05d6, B:196:0x05bb, B:197:0x061a, B:198:0x0588, B:199:0x0592, B:233:0x028e, B:247:0x0630, B:248:0x0633, B:242:0x02bf, B:295:0x0634, B:302:0x0671, B:304:0x069e, B:306:0x06a4, B:308:0x06af, B:311:0x067f, B:321:0x06ba, B:322:0x06bd), top: B:2:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04cc A[Catch: all -> 0x0293, TryCatch #17 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:67:0x013a, B:70:0x0162, B:73:0x016a, B:82:0x02c2, B:84:0x02c8, B:86:0x02d4, B:87:0x02d8, B:89:0x02de, B:92:0x02f2, B:95:0x02fb, B:97:0x0301, B:101:0x0326, B:102:0x0316, B:105:0x0320, B:111:0x0329, B:113:0x0344, B:116:0x0354, B:118:0x0379, B:120:0x03b1, B:122:0x03b6, B:124:0x03be, B:125:0x03c1, B:127:0x03d0, B:129:0x03db, B:130:0x03de, B:132:0x03ea, B:134:0x03f5, B:135:0x03f8, B:137:0x0403, B:138:0x0406, B:140:0x0412, B:142:0x041d, B:144:0x0426, B:145:0x0429, B:147:0x0435, B:149:0x0440, B:150:0x0443, B:152:0x044f, B:154:0x045a, B:156:0x0469, B:158:0x0473, B:161:0x049a, B:162:0x04a5, B:163:0x04b0, B:165:0x04bc, B:167:0x04c7, B:169:0x04cc, B:170:0x04cf, B:172:0x04db, B:174:0x04f1, B:179:0x04fd, B:181:0x050e, B:182:0x0520, B:184:0x0542, B:186:0x0553, B:188:0x059b, B:190:0x05ad, B:191:0x05c2, B:193:0x05cd, B:194:0x05d6, B:196:0x05bb, B:197:0x061a, B:198:0x0588, B:199:0x0592, B:233:0x028e, B:247:0x0630, B:248:0x0633, B:242:0x02bf, B:295:0x0634, B:302:0x0671, B:304:0x069e, B:306:0x06a4, B:308:0x06af, B:311:0x067f, B:321:0x06ba, B:322:0x06bd), top: B:2:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04db A[Catch: all -> 0x0293, TryCatch #17 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:67:0x013a, B:70:0x0162, B:73:0x016a, B:82:0x02c2, B:84:0x02c8, B:86:0x02d4, B:87:0x02d8, B:89:0x02de, B:92:0x02f2, B:95:0x02fb, B:97:0x0301, B:101:0x0326, B:102:0x0316, B:105:0x0320, B:111:0x0329, B:113:0x0344, B:116:0x0354, B:118:0x0379, B:120:0x03b1, B:122:0x03b6, B:124:0x03be, B:125:0x03c1, B:127:0x03d0, B:129:0x03db, B:130:0x03de, B:132:0x03ea, B:134:0x03f5, B:135:0x03f8, B:137:0x0403, B:138:0x0406, B:140:0x0412, B:142:0x041d, B:144:0x0426, B:145:0x0429, B:147:0x0435, B:149:0x0440, B:150:0x0443, B:152:0x044f, B:154:0x045a, B:156:0x0469, B:158:0x0473, B:161:0x049a, B:162:0x04a5, B:163:0x04b0, B:165:0x04bc, B:167:0x04c7, B:169:0x04cc, B:170:0x04cf, B:172:0x04db, B:174:0x04f1, B:179:0x04fd, B:181:0x050e, B:182:0x0520, B:184:0x0542, B:186:0x0553, B:188:0x059b, B:190:0x05ad, B:191:0x05c2, B:193:0x05cd, B:194:0x05d6, B:196:0x05bb, B:197:0x061a, B:198:0x0588, B:199:0x0592, B:233:0x028e, B:247:0x0630, B:248:0x0633, B:242:0x02bf, B:295:0x0634, B:302:0x0671, B:304:0x069e, B:306:0x06a4, B:308:0x06af, B:311:0x067f, B:321:0x06ba, B:322:0x06bd), top: B:2:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x028e A[ADDED_TO_REGION, EDGE_INSN: B:235:0x028e->B:233:0x028e BREAK  A[LOOP:4: B:205:0x01b5->B:231:0x0286], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02bf A[Catch: all -> 0x0293, TRY_ENTER, TryCatch #17 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:67:0x013a, B:70:0x0162, B:73:0x016a, B:82:0x02c2, B:84:0x02c8, B:86:0x02d4, B:87:0x02d8, B:89:0x02de, B:92:0x02f2, B:95:0x02fb, B:97:0x0301, B:101:0x0326, B:102:0x0316, B:105:0x0320, B:111:0x0329, B:113:0x0344, B:116:0x0354, B:118:0x0379, B:120:0x03b1, B:122:0x03b6, B:124:0x03be, B:125:0x03c1, B:127:0x03d0, B:129:0x03db, B:130:0x03de, B:132:0x03ea, B:134:0x03f5, B:135:0x03f8, B:137:0x0403, B:138:0x0406, B:140:0x0412, B:142:0x041d, B:144:0x0426, B:145:0x0429, B:147:0x0435, B:149:0x0440, B:150:0x0443, B:152:0x044f, B:154:0x045a, B:156:0x0469, B:158:0x0473, B:161:0x049a, B:162:0x04a5, B:163:0x04b0, B:165:0x04bc, B:167:0x04c7, B:169:0x04cc, B:170:0x04cf, B:172:0x04db, B:174:0x04f1, B:179:0x04fd, B:181:0x050e, B:182:0x0520, B:184:0x0542, B:186:0x0553, B:188:0x059b, B:190:0x05ad, B:191:0x05c2, B:193:0x05cd, B:194:0x05d6, B:196:0x05bb, B:197:0x061a, B:198:0x0588, B:199:0x0592, B:233:0x028e, B:247:0x0630, B:248:0x0633, B:242:0x02bf, B:295:0x0634, B:302:0x0671, B:304:0x069e, B:306:0x06a4, B:308:0x06af, B:311:0x067f, B:321:0x06ba, B:322:0x06bd), top: B:2:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0630 A[Catch: all -> 0x0293, TryCatch #17 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:67:0x013a, B:70:0x0162, B:73:0x016a, B:82:0x02c2, B:84:0x02c8, B:86:0x02d4, B:87:0x02d8, B:89:0x02de, B:92:0x02f2, B:95:0x02fb, B:97:0x0301, B:101:0x0326, B:102:0x0316, B:105:0x0320, B:111:0x0329, B:113:0x0344, B:116:0x0354, B:118:0x0379, B:120:0x03b1, B:122:0x03b6, B:124:0x03be, B:125:0x03c1, B:127:0x03d0, B:129:0x03db, B:130:0x03de, B:132:0x03ea, B:134:0x03f5, B:135:0x03f8, B:137:0x0403, B:138:0x0406, B:140:0x0412, B:142:0x041d, B:144:0x0426, B:145:0x0429, B:147:0x0435, B:149:0x0440, B:150:0x0443, B:152:0x044f, B:154:0x045a, B:156:0x0469, B:158:0x0473, B:161:0x049a, B:162:0x04a5, B:163:0x04b0, B:165:0x04bc, B:167:0x04c7, B:169:0x04cc, B:170:0x04cf, B:172:0x04db, B:174:0x04f1, B:179:0x04fd, B:181:0x050e, B:182:0x0520, B:184:0x0542, B:186:0x0553, B:188:0x059b, B:190:0x05ad, B:191:0x05c2, B:193:0x05cd, B:194:0x05d6, B:196:0x05bb, B:197:0x061a, B:198:0x0588, B:199:0x0592, B:233:0x028e, B:247:0x0630, B:248:0x0633, B:242:0x02bf, B:295:0x0634, B:302:0x0671, B:304:0x069e, B:306:0x06a4, B:308:0x06af, B:311:0x067f, B:321:0x06ba, B:322:0x06bd), top: B:2:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06a4 A[Catch: all -> 0x0293, TryCatch #17 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:67:0x013a, B:70:0x0162, B:73:0x016a, B:82:0x02c2, B:84:0x02c8, B:86:0x02d4, B:87:0x02d8, B:89:0x02de, B:92:0x02f2, B:95:0x02fb, B:97:0x0301, B:101:0x0326, B:102:0x0316, B:105:0x0320, B:111:0x0329, B:113:0x0344, B:116:0x0354, B:118:0x0379, B:120:0x03b1, B:122:0x03b6, B:124:0x03be, B:125:0x03c1, B:127:0x03d0, B:129:0x03db, B:130:0x03de, B:132:0x03ea, B:134:0x03f5, B:135:0x03f8, B:137:0x0403, B:138:0x0406, B:140:0x0412, B:142:0x041d, B:144:0x0426, B:145:0x0429, B:147:0x0435, B:149:0x0440, B:150:0x0443, B:152:0x044f, B:154:0x045a, B:156:0x0469, B:158:0x0473, B:161:0x049a, B:162:0x04a5, B:163:0x04b0, B:165:0x04bc, B:167:0x04c7, B:169:0x04cc, B:170:0x04cf, B:172:0x04db, B:174:0x04f1, B:179:0x04fd, B:181:0x050e, B:182:0x0520, B:184:0x0542, B:186:0x0553, B:188:0x059b, B:190:0x05ad, B:191:0x05c2, B:193:0x05cd, B:194:0x05d6, B:196:0x05bb, B:197:0x061a, B:198:0x0588, B:199:0x0592, B:233:0x028e, B:247:0x0630, B:248:0x0633, B:242:0x02bf, B:295:0x0634, B:302:0x0671, B:304:0x069e, B:306:0x06a4, B:308:0x06af, B:311:0x067f, B:321:0x06ba, B:322:0x06bd), top: B:2:0x0010, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136 A[Catch: all -> 0x0034, TryCatch #7 {all -> 0x0034, blocks: (B:6:0x0021, B:13:0x003e, B:18:0x0056, B:22:0x0067, B:26:0x0082, B:31:0x00b4, B:38:0x00c9, B:44:0x00f7, B:50:0x010c, B:51:0x0131, B:61:0x0136, B:62:0x0139, B:80:0x019c), top: B:4:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c8 A[Catch: all -> 0x0293, TryCatch #17 {all -> 0x0293, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:35:0x00bd, B:39:0x00e0, B:41:0x00f1, B:67:0x013a, B:70:0x0162, B:73:0x016a, B:82:0x02c2, B:84:0x02c8, B:86:0x02d4, B:87:0x02d8, B:89:0x02de, B:92:0x02f2, B:95:0x02fb, B:97:0x0301, B:101:0x0326, B:102:0x0316, B:105:0x0320, B:111:0x0329, B:113:0x0344, B:116:0x0354, B:118:0x0379, B:120:0x03b1, B:122:0x03b6, B:124:0x03be, B:125:0x03c1, B:127:0x03d0, B:129:0x03db, B:130:0x03de, B:132:0x03ea, B:134:0x03f5, B:135:0x03f8, B:137:0x0403, B:138:0x0406, B:140:0x0412, B:142:0x041d, B:144:0x0426, B:145:0x0429, B:147:0x0435, B:149:0x0440, B:150:0x0443, B:152:0x044f, B:154:0x045a, B:156:0x0469, B:158:0x0473, B:161:0x049a, B:162:0x04a5, B:163:0x04b0, B:165:0x04bc, B:167:0x04c7, B:169:0x04cc, B:170:0x04cf, B:172:0x04db, B:174:0x04f1, B:179:0x04fd, B:181:0x050e, B:182:0x0520, B:184:0x0542, B:186:0x0553, B:188:0x059b, B:190:0x05ad, B:191:0x05c2, B:193:0x05cd, B:194:0x05d6, B:196:0x05bb, B:197:0x061a, B:198:0x0588, B:199:0x0592, B:233:0x028e, B:247:0x0630, B:248:0x0633, B:242:0x02bf, B:295:0x0634, B:302:0x0671, B:304:0x069e, B:306:0x06a4, B:308:0x06af, B:311:0x067f, B:321:0x06ba, B:322:0x06bd), top: B:2:0x0010, inners: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzW() {
        boolean z11;
        Cursor cursor;
        Cursor cursor2;
        zzam zzamVar;
        long zzz;
        Cursor cursor3;
        String str;
        Cursor cursor4;
        int i11;
        Cursor cursor5;
        List list;
        String str2;
        String str3;
        int i12;
        int i13;
        boolean z12;
        int zza;
        String str4;
        Cursor cursor6;
        byte[] blob;
        byte[] byteArray;
        Cursor cursor7;
        zzaz().zzg();
        zzB();
        int i14 = 1;
        this.zzv = true;
        int i15 = 0;
        try {
            this.zzn.zzaw();
            Boolean zzj = this.zzn.zzt().zzj();
            try {
                if (zzj == null) {
                    zzay().zzk().zza("Upload data called on the client side before use of service was decided");
                    this.zzv = false;
                } else if (zzj.booleanValue()) {
                    zzay().zzd().zza("Upload called in the client side when service should be used");
                    this.zzv = false;
                } else if (this.zza > 0) {
                    zzaf();
                    this.zzv = false;
                } else {
                    zzaz().zzg();
                    if (this.zzy != null) {
                        zzay().zzj().zza("Uploading requested multiple times");
                        this.zzv = false;
                    } else {
                        zzfg zzfgVar = this.zzd;
                        zzak(zzfgVar);
                        if (zzfgVar.zza()) {
                            long currentTimeMillis = zzav().currentTimeMillis();
                            Cursor cursor8 = null;
                            int zze = zzg().zze(null, zzen.zzP);
                            zzg();
                            long zzz2 = currentTimeMillis - zzag.zzz();
                            for (int i16 = 0; i16 < zze && zzag(null, zzz2); i16++) {
                            }
                            long zza2 = this.zzk.zzc.zza();
                            if (zza2 != 0) {
                                zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza2)));
                            }
                            zzam zzamVar2 = this.zze;
                            zzak(zzamVar2);
                            String zzr = zzamVar2.zzr();
                            long j11 = -1;
                            if (TextUtils.isEmpty(zzr)) {
                                try {
                                    this.zzA = -1L;
                                    zzamVar = this.zze;
                                    zzak(zzamVar);
                                    zzg();
                                    zzz = currentTimeMillis - zzag.zzz();
                                    zzamVar.zzg();
                                    zzamVar.zzW();
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor;
                                }
                                try {
                                    cursor3 = zzamVar.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(zzz)});
                                    try {
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        zzamVar.zzs.zzay().zzd().zzb("Error selecting expired configs", e);
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    cursor3 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = null;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                                if (cursor3.moveToFirst()) {
                                    str = cursor3.getString(0);
                                    cursor3.close();
                                    if (!TextUtils.isEmpty(str)) {
                                    }
                                } else {
                                    zzamVar.zzs.zzay().zzj().zza("No expired configs for apps with pending events");
                                    cursor3.close();
                                    str = null;
                                    if (!TextUtils.isEmpty(str)) {
                                        zzam zzamVar3 = this.zze;
                                        zzak(zzamVar3);
                                        zzh zzj2 = zzamVar3.zzj(str);
                                        if (zzj2 != null) {
                                            zzC(zzj2);
                                        }
                                    }
                                }
                            } else {
                                if (this.zzA == -1) {
                                    zzam zzamVar4 = this.zze;
                                    zzak(zzamVar4);
                                    try {
                                        cursor7 = zzamVar4.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        try {
                                            try {
                                                if (cursor7.moveToFirst()) {
                                                    j11 = cursor7.getLong(0);
                                                }
                                            } catch (SQLiteException e13) {
                                                e = e13;
                                                zzamVar4.zzs.zzay().zzd().zzb("Error querying raw events", e);
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor8 = cursor7;
                                            if (cursor8 != null) {
                                                cursor8.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e14) {
                                        e = e14;
                                        cursor7 = null;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        if (cursor8 != null) {
                                        }
                                        throw th;
                                    }
                                    cursor7.close();
                                    this.zzA = j11;
                                }
                                int zze2 = zzg().zze(zzr, zzen.zzf);
                                int max = Math.max(0, zzg().zze(zzr, zzen.zzg));
                                zzam zzamVar5 = this.zze;
                                zzak(zzamVar5);
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
                                                int i17 = 0;
                                                while (true) {
                                                    long j12 = query.getLong(i15);
                                                    try {
                                                        blob = query.getBlob(i14);
                                                        i11 = i14;
                                                    } catch (IOException e15) {
                                                        e = e15;
                                                        i11 = i14;
                                                    }
                                                    try {
                                                        try {
                                                            zzln zzlnVar = zzamVar5.zzf.zzi;
                                                            zzak(zzlnVar);
                                                            try {
                                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                                                                while (true) {
                                                                    int read = gZIPInputStream.read(bArr);
                                                                    if (read <= 0) {
                                                                        break;
                                                                    }
                                                                    cursor6 = query;
                                                                    try {
                                                                        try {
                                                                            byteArrayOutputStream.write(bArr, 0, read);
                                                                            query = cursor6;
                                                                        } catch (IOException e16) {
                                                                            e = e16;
                                                                            try {
                                                                                zzlnVar.zzs.zzay().zzd().zzb("Failed to ungzip content", e);
                                                                                throw e;
                                                                            } catch (IOException e17) {
                                                                                e = e17;
                                                                                zzamVar5.zzs.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzfa.zzn(zzr), e);
                                                                                if (!cursor6.moveToNext()) {
                                                                                }
                                                                                cursor6.close();
                                                                                list = arrayList;
                                                                                if (!list.isEmpty()) {
                                                                                }
                                                                                this.zzv = false;
                                                                                zzad();
                                                                            }
                                                                        }
                                                                    } catch (SQLiteException e18) {
                                                                        e = e18;
                                                                        cursor5 = cursor6;
                                                                        try {
                                                                            zzamVar5.zzs.zzay().zzd().zzc("Error querying bundles. appId", zzfa.zzn(zzr), e);
                                                                            list = Collections.EMPTY_LIST;
                                                                            if (cursor5 != null) {
                                                                            }
                                                                            if (!list.isEmpty()) {
                                                                            }
                                                                            this.zzv = false;
                                                                            zzad();
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            cursor4 = cursor5;
                                                                            if (cursor4 != null) {
                                                                                cursor4.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        cursor4 = cursor6;
                                                                        if (cursor4 != null) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                gZIPInputStream.close();
                                                                byteArrayInputStream.close();
                                                                byteArray = byteArrayOutputStream.toByteArray();
                                                            } catch (IOException e19) {
                                                                e = e19;
                                                                cursor6 = query;
                                                            }
                                                        } catch (SQLiteException e21) {
                                                            e = e21;
                                                            cursor6 = query;
                                                            cursor5 = cursor6;
                                                            zzamVar5.zzs.zzay().zzd().zzc("Error querying bundles. appId", zzfa.zzn(zzr), e);
                                                            list = Collections.EMPTY_LIST;
                                                            if (cursor5 != null) {
                                                                cursor5.close();
                                                            }
                                                            if (!list.isEmpty()) {
                                                            }
                                                            this.zzv = false;
                                                            zzad();
                                                        }
                                                    } catch (IOException e22) {
                                                        e = e22;
                                                        cursor6 = query;
                                                        zzamVar5.zzs.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzfa.zzn(zzr), e);
                                                        if (!cursor6.moveToNext()) {
                                                            break;
                                                        }
                                                        i14 = i11;
                                                        query = cursor6;
                                                        i15 = 0;
                                                        cursor6.close();
                                                        list = arrayList;
                                                        if (!list.isEmpty()) {
                                                        }
                                                        this.zzv = false;
                                                        zzad();
                                                    }
                                                    if (!arrayList.isEmpty() && byteArray.length + i17 > max) {
                                                        cursor6 = query;
                                                        break;
                                                    }
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzgb zzgbVar = (com.google.android.gms.internal.measurement.zzgb) zzln.zzl(com.google.android.gms.internal.measurement.zzgc.zzu(), byteArray);
                                                        if (!query.isNull(2)) {
                                                            zzgbVar.zzag(query.getInt(2));
                                                        }
                                                        i17 += byteArray.length;
                                                        arrayList.add(Pair.create((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE(), Long.valueOf(j12)));
                                                    } catch (IOException e23) {
                                                        zzamVar5.zzs.zzay().zzd().zzc("Failed to merge queued bundle. appId", zzfa.zzn(zzr), e23);
                                                    }
                                                    cursor6 = query;
                                                    if (!cursor6.moveToNext() || i17 > max) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i14 = i11;
                                                        query = cursor6;
                                                        i15 = 0;
                                                    }
                                                }
                                                cursor6.close();
                                                list = arrayList;
                                            } else {
                                                list = Collections.EMPTY_LIST;
                                                query.close();
                                                i11 = 1;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor6 = query;
                                        }
                                    } catch (SQLiteException e24) {
                                        e = e24;
                                        i11 = 1;
                                    }
                                } catch (SQLiteException e25) {
                                    e = e25;
                                    i11 = 1;
                                    cursor5 = null;
                                } catch (Throwable th9) {
                                    th = th9;
                                    cursor4 = null;
                                }
                                if (!list.isEmpty()) {
                                    if (zzh(zzr).zzi(zzah.AD_STORAGE)) {
                                        Iterator it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str4 = null;
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((Pair) it.next()).first;
                                            if (!zzgcVar.zzK().isEmpty()) {
                                                str4 = zzgcVar.zzK();
                                                break;
                                            }
                                        }
                                        if (str4 != null) {
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 >= list.size()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzgc zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((Pair) list.get(i18)).first;
                                                if (!zzgcVar2.zzK().isEmpty() && !zzgcVar2.zzK().equals(str4)) {
                                                    list = list.subList(0, i18);
                                                    break;
                                                }
                                                i18++;
                                            }
                                        }
                                    }
                                    com.google.android.gms.internal.measurement.zzfz zza3 = com.google.android.gms.internal.measurement.zzga.zza();
                                    int size = list.size();
                                    ArrayList arrayList2 = new ArrayList(list.size());
                                    int i19 = (zzg().zzt(zzr) && zzh(zzr).zzi(zzah.AD_STORAGE)) ? i11 : 0;
                                    boolean zzi = zzh(zzr).zzi(zzah.AD_STORAGE);
                                    boolean zzi2 = zzh(zzr).zzi(zzah.ANALYTICS_STORAGE);
                                    zzps.zzc();
                                    boolean zzs = zzg().zzs(null, zzen.zzaH);
                                    int i21 = 0;
                                    while (i21 < size) {
                                        com.google.android.gms.internal.measurement.zzgb zzgbVar2 = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) list.get(i21)).first).zzbB();
                                        arrayList2.add((Long) ((Pair) list.get(i21)).second);
                                        zzg().zzh();
                                        zzgbVar2.zzam(64000L);
                                        zzgbVar2.zzal(currentTimeMillis);
                                        this.zzn.zzaw();
                                        zzgbVar2.zzah(false);
                                        if (i19 == 0) {
                                            zzgbVar2.zzq();
                                        }
                                        if (!zzi) {
                                            zzgbVar2.zzx();
                                            zzgbVar2.zzt();
                                        }
                                        if (!zzi2) {
                                            zzgbVar2.zzn();
                                        }
                                        zzpj.zzc();
                                        if (zzg().zzs(zzr, zzen.zzaC)) {
                                            zzgb zzgbVar3 = this.zzc;
                                            zzak(zzgbVar3);
                                            Set zzk = zzgbVar3.zzk(zzr);
                                            if (zzk != null) {
                                                zzgbVar2.zzi(zzk);
                                            }
                                        }
                                        if (zzg().zzs(zzr, zzen.zzaE)) {
                                            zzgb zzgbVar4 = this.zzc;
                                            zzak(zzgbVar4);
                                            if (zzgbVar4.zzv(zzr)) {
                                                zzgbVar2.zzp();
                                            }
                                            zzgb zzgbVar5 = this.zzc;
                                            zzak(zzgbVar5);
                                            if (zzgbVar5.zzy(zzr)) {
                                                zzgbVar2.zzu();
                                            }
                                        }
                                        if (zzg().zzs(zzr, zzen.zzaF)) {
                                            zzgb zzgbVar6 = this.zzc;
                                            zzak(zzgbVar6);
                                            if (zzgbVar6.zzz(zzr) && (zza = zzln.zza(zzgbVar2, "_id")) != -1) {
                                                zzgbVar2.zzB(zza);
                                            }
                                        }
                                        if (zzg().zzs(zzr, zzen.zzaG)) {
                                            zzgb zzgbVar7 = this.zzc;
                                            zzak(zzgbVar7);
                                            if (zzgbVar7.zzx(zzr)) {
                                                zzgbVar2.zzq();
                                            }
                                        }
                                        if (zzg().zzs(zzr, zzen.zzaJ)) {
                                            zzgb zzgbVar8 = this.zzc;
                                            zzak(zzgbVar8);
                                            if (zzgbVar8.zzu(zzr)) {
                                                zzgbVar2.zzn();
                                                if (zzg().zzs(zzr, zzen.zzaK)) {
                                                    zzlk zzlkVar = (zzlk) this.zzC.get(zzr);
                                                    if (zzlkVar != null) {
                                                        i13 = i19;
                                                        z12 = zzi;
                                                        i12 = size;
                                                        if (zzlkVar.zzb + zzg().zzi(zzr, zzen.zzR) < zzav().elapsedRealtime()) {
                                                        }
                                                        zzgbVar2.zzS(zzlkVar.zza);
                                                        if (zzg().zzs(zzr, zzen.zzaL)) {
                                                            zzgb zzgbVar9 = this.zzc;
                                                            zzak(zzgbVar9);
                                                            if (zzgbVar9.zzw(zzr)) {
                                                                zzgbVar2.zzy();
                                                            }
                                                        }
                                                        if (!zzs) {
                                                            zzgbVar2.zzy();
                                                        }
                                                        if (zzg().zzs(zzr, zzen.zzU)) {
                                                            byte[] zzby = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar2.zzaE()).zzby();
                                                            zzln zzlnVar2 = this.zzi;
                                                            zzak(zzlnVar2);
                                                            zzgbVar2.zzK(zzlnVar2.zzd(zzby));
                                                        }
                                                        zza3.zza(zzgbVar2);
                                                        i21++;
                                                        i19 = i13;
                                                        zzi = z12;
                                                        size = i12;
                                                    } else {
                                                        i12 = size;
                                                        i13 = i19;
                                                        z12 = zzi;
                                                    }
                                                    zzlkVar = new zzlk(this);
                                                    this.zzC.put(zzr, zzlkVar);
                                                    zzgbVar2.zzS(zzlkVar.zza);
                                                    if (zzg().zzs(zzr, zzen.zzaL)) {
                                                    }
                                                    if (!zzs) {
                                                    }
                                                    if (zzg().zzs(zzr, zzen.zzU)) {
                                                    }
                                                    zza3.zza(zzgbVar2);
                                                    i21++;
                                                    i19 = i13;
                                                    zzi = z12;
                                                    size = i12;
                                                }
                                            }
                                        }
                                        i12 = size;
                                        i13 = i19;
                                        z12 = zzi;
                                        if (zzg().zzs(zzr, zzen.zzaL)) {
                                        }
                                        if (!zzs) {
                                        }
                                        if (zzg().zzs(zzr, zzen.zzU)) {
                                        }
                                        zza3.zza(zzgbVar2);
                                        i21++;
                                        i19 = i13;
                                        zzi = z12;
                                        size = i12;
                                    }
                                    int i22 = size;
                                    if (Log.isLoggable(zzay().zzq(), 2)) {
                                        zzln zzlnVar3 = this.zzi;
                                        zzak(zzlnVar3);
                                        str2 = zzlnVar3.zzm((com.google.android.gms.internal.measurement.zzga) zza3.zzaE());
                                    } else {
                                        str2 = null;
                                    }
                                    zzak(this.zzi);
                                    byte[] zzby2 = ((com.google.android.gms.internal.measurement.zzga) zza3.zzaE()).zzby();
                                    zzla zzlaVar = this.zzl;
                                    zzpj.zzc();
                                    if (zzlaVar.zzs.zzf().zzs(zzr, zzen.zzaD)) {
                                        zzgb zzgbVar10 = zzlaVar.zzf.zzc;
                                        zzak(zzgbVar10);
                                        String zzi3 = zzgbVar10.zzi(zzr);
                                        if (TextUtils.isEmpty(zzi3)) {
                                            str3 = (String) zzen.zzp.zza(null);
                                        } else {
                                            Uri parse = Uri.parse((String) zzen.zzp.zza(null));
                                            Uri.Builder buildUpon = parse.buildUpon();
                                            buildUpon.authority(zzi3 + "." + parse.getAuthority());
                                            str3 = buildUpon.build().toString();
                                        }
                                    } else {
                                        str3 = (String) zzen.zzp.zza(null);
                                    }
                                    try {
                                        URL url = new URL(str3);
                                        Preconditions.checkArgument(!arrayList2.isEmpty());
                                        if (this.zzy != null) {
                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.zzy = new ArrayList(arrayList2);
                                        }
                                        this.zzk.zzd.zzb(currentTimeMillis);
                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", i22 > 0 ? zza3.zzb(0).zzy() : "?", Integer.valueOf(zzby2.length), str2);
                                        this.zzu = i11;
                                        zzfg zzfgVar2 = this.zzd;
                                        zzak(zzfgVar2);
                                        zzlc zzlcVar = new zzlc(this, zzr);
                                        zzfgVar2.zzg();
                                        zzfgVar2.zzW();
                                        Preconditions.checkNotNull(url);
                                        Preconditions.checkNotNull(zzby2);
                                        Preconditions.checkNotNull(zzlcVar);
                                        zzfgVar2.zzs.zzaz().zzo(new zzff(zzfgVar2, zzr, url, zzby2, null, zzlcVar));
                                    } catch (MalformedURLException unused) {
                                        zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzfa.zzn(zzr), str3);
                                    }
                                }
                            }
                            this.zzv = false;
                        } else {
                            zzay().zzj().zza("Network not connected, ignoring upload request");
                            zzaf();
                            this.zzv = false;
                        }
                    }
                }
                zzad();
            } catch (Throwable th10) {
                th = th10;
                z11 = false;
                this.zzv = z11;
                zzad();
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            z11 = false;
            this.zzv = z11;
            zzad();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:94|95|96)|(5:141|(4:144|(3:146|147|(2:149|(2:151|153)(1:237))(1:239))(1:243)|238|142)|244|154|(1:156)(29:157|(1:159)|160|(2:162|(2:166|(1:168)))|169|(1:171)|172|(2:174|(1:176))|177|(5:179|(1:181)|182|(1:184)|185)|186|(1:190)|191|(1:193)|194|(3:197|198|195)|199|200|201|202|203|(2:204|(2:206|(1:208)(1:223))(3:224|225|(1:230)(1:229)))|210|211|212|(1:214)(2:219|220)|215|216|217))|201|202|203|(3:204|(0)(0)|223)|210|211|212|(0)(0)|215|216|217) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:281|(2:283|(7:285|286|(1:288)|49|(0)(0)|52|(0)(0)))|289|290|291|292|293|294|286|(0)|49|(0)(0)|52|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(52:(2:61|(5:63|(1:65)|66|67|68))|69|(2:71|(5:73|(1:75)|76|77|78))|79|80|(1:82)|83|(2:85|(1:89))|90|91|92|93|(13:(3:94|95|96)|(5:141|(4:144|(3:146|147|(2:149|(2:151|153)(1:237))(1:239))(1:243)|238|142)|244|154|(1:156)(29:157|(1:159)|160|(2:162|(2:166|(1:168)))|169|(1:171)|172|(2:174|(1:176))|177|(5:179|(1:181)|182|(1:184)|185)|186|(1:190)|191|(1:193)|194|(3:197|198|195)|199|200|201|202|203|(2:204|(2:206|(1:208)(1:223))(3:224|225|(1:230)(1:229)))|210|211|212|(1:214)(2:219|220)|215|216|217))|201|202|203|(3:204|(0)(0)|223)|210|211|212|(0)(0)|215|216|217)|97|(1:99)|100|(2:102|(1:108)(3:105|106|107))(1:246)|109|(1:111)|112|(1:114)|115|(1:117)|118|(1:122)|123|(1:125)|126|(1:128)|129|(1:133)|134|(1:136)|137|245|(0)|160|(0)|169|(0)|172|(0)|177|(0)|186|(2:188|190)|191|(0)|194|(1:195)|199|200) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x093b, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x09f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x09f9, code lost:
    
        r2.zzs.zzay().zzd().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzfa.zzn(r9.zza), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0a0f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0a2a, code lost:
    
        zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzfa.zzn(r10.zzaq()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0291, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0292, code lost:
    
        r14.zzs.zzay().zzd().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzfa.zzn(r12), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x052c A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05f0 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05fd A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x060a A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0635 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0646 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0685 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06c9 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0731 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0752 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07c0 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07cd A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07e7 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0860 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0881 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x08a1 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0931 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x09dc A[Catch: all -> 0x014d, SQLiteException -> 0x09f2, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x09f2, blocks: (B:212:0x09cd, B:214:0x09dc), top: B:211:0x09cd, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x093d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05a3 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0310 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x02cc A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0367 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04ea A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:30:0x0122, B:32:0x0134, B:34:0x0140, B:35:0x0150, B:38:0x015d, B:40:0x0167, B:43:0x0172, B:49:0x02fa, B:52:0x032f, B:54:0x0367, B:56:0x036c, B:57:0x0383, B:61:0x0396, B:63:0x03af, B:65:0x03b5, B:66:0x03cc, B:71:0x03f3, B:75:0x0414, B:76:0x042b, B:79:0x043c, B:82:0x0459, B:83:0x046d, B:85:0x0477, B:87:0x0484, B:89:0x048a, B:90:0x0493, B:92:0x04a1, B:95:0x04b9, B:99:0x04ea, B:100:0x04ff, B:102:0x052c, B:105:0x0544, B:108:0x0585, B:109:0x05b3, B:111:0x05f0, B:112:0x05f5, B:114:0x05fd, B:115:0x0602, B:117:0x060a, B:118:0x060f, B:120:0x061f, B:122:0x0627, B:123:0x062c, B:125:0x0635, B:126:0x0639, B:128:0x0646, B:129:0x064b, B:131:0x0672, B:133:0x067a, B:134:0x067f, B:136:0x0685, B:137:0x0688, B:139:0x06a0, B:141:0x06a9, B:142:0x06c3, B:144:0x06c9, B:147:0x06df, B:149:0x06eb, B:151:0x06f8, B:241:0x0716, B:154:0x0726, B:159:0x0731, B:160:0x0734, B:162:0x0752, B:164:0x0764, B:166:0x0768, B:168:0x0773, B:169:0x077c, B:171:0x07c0, B:172:0x07c5, B:174:0x07cd, B:176:0x07d7, B:177:0x07da, B:179:0x07e7, B:181:0x0807, B:182:0x0812, B:184:0x0846, B:185:0x084b, B:186:0x0858, B:188:0x0860, B:190:0x086a, B:191:0x0877, B:193:0x0881, B:194:0x088e, B:195:0x089b, B:197:0x08a1, B:200:0x08d1, B:202:0x0914, B:203:0x091f, B:204:0x092b, B:206:0x0931, B:210:0x097f, B:212:0x09cd, B:214:0x09dc, B:215:0x0a3f, B:220:0x09f6, B:222:0x09f9, B:225:0x093d, B:227:0x0969, B:233:0x0a12, B:234:0x0a29, B:236:0x0a2a, B:246:0x05a3, B:249:0x04d1, B:253:0x0310, B:254:0x0317, B:256:0x031d, B:259:0x0329, B:264:0x0186, B:267:0x0192, B:269:0x01a9, B:274:0x01c7, B:277:0x0207, B:279:0x020d, B:281:0x021b, B:283:0x022c, B:285:0x023d, B:286:0x02c1, B:288:0x02cc, B:290:0x0264, B:292:0x027e, B:294:0x02a6, B:297:0x0292, B:298:0x01d5, B:303:0x01fd), top: B:29:0x0122, inners: #1, #2, #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzX(zzaw zzawVar, zzq zzqVar) {
        long j11;
        long longValue;
        String str;
        zzlq zzlqVar;
        Object obj;
        zzam zzamVar;
        zzau zzauVar;
        long j12;
        long intValue;
        int i11;
        long j13;
        int i12;
        zzas zzn;
        zzar zzarVar;
        zzas zzasVar;
        com.google.android.gms.internal.measurement.zzgb zzu;
        long j14;
        long j15;
        zzln zzlnVar;
        Map zzc;
        ArrayList arrayList;
        zzai zzc2;
        zzah zzahVar;
        zzag zzg;
        zzem zzemVar;
        zzh zzj;
        List zzu2;
        int i13;
        zzam zzamVar2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        zzam zzamVar3;
        zzat zzatVar;
        int i14;
        ContentValues contentValues;
        ArrayList arrayList2;
        SQLiteDatabase zzh;
        int min;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        long nanoTime = System.nanoTime();
        zzaz().zzg();
        zzB();
        String str2 = zzqVar.zza;
        zzak(this.zzi);
        if (!zzln.zzA(zzawVar, zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        zzgb zzgbVar = this.zzc;
        zzak(zzgbVar);
        if (zzgbVar.zzr(str2, zzawVar.zza)) {
            zzay().zzk().zzc("Dropping blocked event. appId", zzfa.zzn(str2), this.zzn.zzj().zzd(zzawVar.zza));
            zzgb zzgbVar2 = this.zzc;
            zzak(zzgbVar2);
            if (!zzgbVar2.zzp(str2)) {
                zzgb zzgbVar3 = this.zzc;
                zzak(zzgbVar3);
                if (!zzgbVar3.zzs(str2)) {
                    if ("_err".equals(zzawVar.zza)) {
                        return;
                    }
                    zzv().zzN(this.zzF, str2, 11, "_ev", zzawVar.zza, 0);
                    return;
                }
            }
            zzam zzamVar4 = this.zze;
            zzak(zzamVar4);
            zzh zzj2 = zzamVar4.zzj(str2);
            if (zzj2 != null) {
                long abs = Math.abs(zzav().currentTimeMillis() - Math.max(zzj2.zzl(), zzj2.zzc()));
                zzg();
                if (abs > ((Long) zzen.zzy.zza(null)).longValue()) {
                    zzay().zzc().zza("Fetching config for blocked app");
                    zzC(zzj2);
                    return;
                }
                return;
            }
            return;
        }
        zzfb zzb2 = zzfb.zzb(zzawVar);
        zzv().zzM(zzb2, zzg().zzd(str2));
        zzaw zza = zzb2.zza();
        if (Log.isLoggable(zzay().zzq(), 2)) {
            zzay().zzj().zzb("Logging event", this.zzn.zzj().zzc(zza));
        }
        zzam zzamVar5 = this.zze;
        zzak(zzamVar5);
        zzamVar5.zzw();
        try {
            zzd(zzqVar);
            zzne.zzc();
            if (!zzg().zzs(null, zzen.zzan) && zzg().zzs(null, zzen.zzao)) {
                zzam zzamVar6 = this.zze;
                zzak(zzamVar6);
                zzamVar6.zzA(zzqVar.zza, "_lair");
            }
            boolean z11 = "ecommerce_purchase".equals(zza.zza) || "purchase".equals(zza.zza) || ProductAction.ACTION_REFUND.equals(zza.zza);
            if (!"_iap".equals(zza.zza)) {
                if (z11) {
                    z11 = true;
                } else {
                    j11 = nanoTime;
                    str = "_err";
                    obj = null;
                    boolean zzai = zzlt.zzai(zza.zza);
                    boolean equals = str.equals(zza.zza);
                    zzv();
                    zzauVar = zza.zzb;
                    if (zzauVar != null) {
                        j12 = 0;
                    } else {
                        zzat zzatVar2 = new zzat(zzauVar);
                        j12 = 0;
                        while (zzatVar2.hasNext()) {
                            if (zzauVar.zzf(zzatVar2.next()) instanceof Parcelable[]) {
                                j12 += ((Parcelable[]) r15).length;
                            }
                        }
                    }
                    long j16 = j12 + 1;
                    zzam zzamVar7 = this.zze;
                    zzak(zzamVar7);
                    String str3 = str2;
                    zzak zzm = zzamVar7.zzm(zza(), str3, j16, true, zzai, false, equals, false);
                    long j17 = zzm.zzb;
                    zzg();
                    intValue = j17 - ((Integer) zzen.zzj.zza(obj)).intValue();
                    if (intValue <= 0) {
                        if (intValue % 1000 == 1) {
                            zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzfa.zzn(str3), Long.valueOf(zzm.zzb));
                        }
                        zzam zzamVar8 = this.zze;
                        zzak(zzamVar8);
                        zzamVar8.zzC();
                        zzam zzamVar9 = this.zze;
                        zzak(zzamVar9);
                        zzamVar9.zzx();
                        return;
                    }
                    if (zzai) {
                        long j18 = zzm.zza;
                        zzg();
                        long intValue2 = j18 - ((Integer) zzen.zzl.zza(obj)).intValue();
                        if (intValue2 > 0) {
                            if (intValue2 % 1000 == 1) {
                                zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzfa.zzn(str3), Long.valueOf(zzm.zza));
                            }
                            zzv().zzN(this.zzF, str3, 16, "_ev", zza.zza, 0);
                            zzam zzamVar10 = this.zze;
                            zzak(zzamVar10);
                            zzamVar10.zzC();
                            zzam zzamVar11 = this.zze;
                            zzak(zzamVar11);
                            zzamVar11.zzx();
                            return;
                        }
                    }
                    if (equals) {
                        long max = zzm.zzd - Math.max(0, Math.min(1000000, zzg().zze(zzqVar.zza, zzen.zzk)));
                        if (max > 0) {
                            if (max == 1) {
                                zzay().zzd().zzc("Too many error events logged. appId, count", zzfa.zzn(str3), Long.valueOf(zzm.zzd));
                            }
                            zzam zzamVar12 = this.zze;
                            zzak(zzamVar12);
                            zzamVar12.zzC();
                            zzam zzamVar13 = this.zze;
                            zzak(zzamVar13);
                            zzamVar13.zzx();
                            return;
                        }
                    }
                    Bundle zzc3 = zza.zzb.zzc();
                    zzv().zzO(zzc3, "_o", zza.zzc);
                    if (zzv().zzae(str3)) {
                        zzv().zzO(zzc3, "_dbg", 1L);
                        zzv().zzO(zzc3, "_r", 1L);
                    }
                    if ("_s".equals(zza.zza)) {
                        zzam zzamVar14 = this.zze;
                        zzak(zzamVar14);
                        zzlq zzp = zzamVar14.zzp(zzqVar.zza, "_sno");
                        if (zzp != null && (zzp.zze instanceof Long)) {
                            zzv().zzO(zzc3, "_sno", zzp.zze);
                        }
                    }
                    zzam zzamVar15 = this.zze;
                    zzak(zzamVar15);
                    Preconditions.checkNotEmpty(str3);
                    zzamVar15.zzg();
                    zzamVar15.zzW();
                    try {
                        zzh = zzamVar15.zzh();
                        min = Math.min(1000000, zzamVar15.zzs.zzf().zze(str3, zzen.zzo));
                        i11 = 0;
                    } catch (SQLiteException e11) {
                        e = e11;
                        i11 = 0;
                    }
                    try {
                        try {
                            j13 = zzh.delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str3, String.valueOf(Math.max(0, min))});
                        } catch (SQLiteException e12) {
                            e = e12;
                            zzamVar15.zzs.zzay().zzd().zzc("Error deleting over the limit events. appId", zzfa.zzn(str3), e);
                            j13 = 0;
                            if (j13 > 0) {
                            }
                            i12 = i11;
                            zzar zzarVar2 = new zzar(this.zzn, zza.zzc, str3, zza.zza, zza.zzd, 0L, zzc3);
                            zzam zzamVar16 = this.zze;
                            zzak(zzamVar16);
                            zzn = zzamVar16.zzn(str3, zzarVar2.zzb);
                            if (zzn != null) {
                            }
                            zzam zzamVar17 = this.zze;
                            zzak(zzamVar17);
                            zzamVar17.zzE(zzasVar);
                            zzaz().zzg();
                            zzB();
                            Preconditions.checkNotNull(zzarVar);
                            Preconditions.checkNotNull(zzqVar);
                            Preconditions.checkNotEmpty(zzarVar.zza);
                            Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                            zzu = com.google.android.gms.internal.measurement.zzgc.zzu();
                            zzu.zzae(1);
                            zzu.zzaa("android");
                            if (!TextUtils.isEmpty(zzqVar.zza)) {
                            }
                            if (!TextUtils.isEmpty(zzqVar.zzd)) {
                            }
                            if (!TextUtils.isEmpty(zzqVar.zzc)) {
                            }
                            zzps.zzc();
                            if (zzg().zzs(null, zzen.zzaH)) {
                                zzu.zzai(zzqVar.zzx);
                            }
                            j14 = zzqVar.zzj;
                            if (j14 != -2147483648L) {
                            }
                            zzu.zzW(zzqVar.zze);
                            if (!TextUtils.isEmpty(zzqVar.zzb)) {
                            }
                            zzu.zzM(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                            if (zzu.zzar().isEmpty()) {
                                zzu.zzC(zzqVar.zzq);
                            }
                            j15 = zzqVar.zzf;
                            if (j15 != 0) {
                            }
                            zzu.zzQ(zzqVar.zzs);
                            zzlnVar = this.zzi;
                            zzak(zzlnVar);
                            zzc = zzen.zzc(zzlnVar.zzf.zzn.zzau());
                            if (zzc != null) {
                                arrayList2 = new ArrayList();
                                int intValue3 = ((Integer) zzen.zzO.zza(null)).intValue();
                                while (r15.hasNext()) {
                                }
                                if (arrayList2.isEmpty()) {
                                }
                            }
                            arrayList = null;
                            if (arrayList != null) {
                            }
                            zzc2 = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                            zzahVar = zzah.AD_STORAGE;
                            if (zzc2.zzi(zzahVar)) {
                            }
                            this.zzn.zzg().zzu();
                            zzu.zzO(Build.MODEL);
                            this.zzn.zzg().zzu();
                            zzu.zzZ(Build.VERSION.RELEASE);
                            zzu.zzak((int) this.zzn.zzg().zzb());
                            zzu.zzao(this.zzn.zzg().zzc());
                            zzg = zzg();
                            zzemVar = zzen.zzah;
                            if (!zzg.zzs(null, zzemVar)) {
                            }
                            if (this.zzn.zzJ()) {
                            }
                            zzam zzamVar18 = this.zze;
                            zzak(zzamVar18);
                            zzj = zzamVar18.zzj(zzqVar.zza);
                            if (zzj == null) {
                            }
                            if (zzc2.zzi(zzah.ANALYTICS_STORAGE)) {
                            }
                            if (!TextUtils.isEmpty(zzj.zzx())) {
                            }
                            zzam zzamVar19 = this.zze;
                            zzak(zzamVar19);
                            zzu2 = zzamVar19.zzu(zzqVar.zza);
                            while (i13 < zzu2.size()) {
                            }
                            zzamVar2 = this.zze;
                            zzak(zzamVar2);
                            zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzu.zzaE();
                            zzamVar2.zzg();
                            zzamVar2.zzW();
                            Preconditions.checkNotNull(zzgcVar);
                            Preconditions.checkNotEmpty(zzgcVar.zzy());
                            byte[] zzby = zzgcVar.zzby();
                            zzln zzlnVar2 = zzamVar2.zzf.zzi;
                            zzak(zzlnVar2);
                            long zzd = zzlnVar2.zzd(zzby);
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("app_id", zzgcVar.zzy());
                            contentValues2.put("metadata_fingerprint", Long.valueOf(zzd));
                            contentValues2.put("metadata", zzby);
                            zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                            zzamVar3 = this.zze;
                            zzak(zzamVar3);
                            zzatVar = new zzat(zzarVar.zzf);
                            while (true) {
                                if (zzatVar.hasNext()) {
                                }
                            }
                            zzamVar3.zzg();
                            zzamVar3.zzW();
                            Preconditions.checkNotNull(zzarVar);
                            Preconditions.checkNotEmpty(zzarVar.zza);
                            zzln zzlnVar3 = zzamVar3.zzf.zzi;
                            zzak(zzlnVar3);
                            byte[] zzby2 = zzlnVar3.zzj(zzarVar).zzby();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", zzarVar.zza);
                            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzarVar.zzb);
                            contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                            contentValues.put("metadata_fingerprint", Long.valueOf(zzd));
                            contentValues.put("data", zzby2);
                            contentValues.put("realtime", Integer.valueOf(i14));
                            if (zzamVar3.zzh().insert("raw_events", null, contentValues) == -1) {
                            }
                            zzam zzamVar20 = this.zze;
                            zzak(zzamVar20);
                            zzamVar20.zzC();
                            zzam zzamVar21 = this.zze;
                            zzak(zzamVar21);
                            zzamVar21.zzx();
                            zzaf();
                            zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j11) + 500000) / 1000000));
                            return;
                        }
                        if (zzc != null && !zzc.isEmpty()) {
                            arrayList2 = new ArrayList();
                            int intValue32 = ((Integer) zzen.zzO.zza(null)).intValue();
                            for (Map.Entry entry : zzc.entrySet()) {
                                if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                    try {
                                        int parseInt = Integer.parseInt((String) entry.getValue());
                                        if (parseInt != 0) {
                                            arrayList2.add(Integer.valueOf(parseInt));
                                            if (arrayList2.size() >= intValue32) {
                                                zzlnVar.zzs.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList2.size()));
                                                break;
                                            }
                                            continue;
                                        } else {
                                            continue;
                                        }
                                    } catch (NumberFormatException e13) {
                                        zzlnVar.zzs.zzay().zzk().zzb("Experiment ID NumberFormatException", e13);
                                    }
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    zzu.zzh(arrayList);
                                }
                                zzc2 = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                                zzahVar = zzah.AD_STORAGE;
                                if (zzc2.zzi(zzahVar)) {
                                    Pair zzd2 = this.zzk.zzd(zzqVar.zza, zzc2);
                                    if (!TextUtils.isEmpty((CharSequence) zzd2.first) && zzqVar.zzo) {
                                        zzu.zzaf((String) zzd2.first);
                                        Object obj2 = zzd2.second;
                                        if (obj2 != null) {
                                            zzu.zzY(((Boolean) obj2).booleanValue());
                                        }
                                    }
                                }
                                this.zzn.zzg().zzu();
                                zzu.zzO(Build.MODEL);
                                this.zzn.zzg().zzu();
                                zzu.zzZ(Build.VERSION.RELEASE);
                                zzu.zzak((int) this.zzn.zzg().zzb());
                                zzu.zzao(this.zzn.zzg().zzc());
                                zzg = zzg();
                                zzemVar = zzen.zzah;
                                if (!zzg.zzs(null, zzemVar)) {
                                    zzu.zzD(zzqVar.zzl);
                                }
                                if (this.zzn.zzJ()) {
                                    zzu.zzaq();
                                    if (!TextUtils.isEmpty(null)) {
                                        zzu.zzP(null);
                                    }
                                }
                                zzam zzamVar182 = this.zze;
                                zzak(zzamVar182);
                                zzj = zzamVar182.zzj(zzqVar.zza);
                                if (zzj == null) {
                                    zzj = new zzh(this.zzn, zzqVar.zza);
                                    zzj.zzI(zzw(zzc2));
                                    zzj.zzW(zzqVar.zzk);
                                    zzj.zzX(zzqVar.zzb);
                                    if (zzc2.zzi(zzahVar)) {
                                        zzj.zzaf(this.zzk.zzf(zzqVar.zza));
                                    }
                                    zzj.zzab(0L);
                                    zzj.zzac(0L);
                                    zzj.zzaa(0L);
                                    zzj.zzK(zzqVar.zzc);
                                    zzj.zzL(zzqVar.zzj);
                                    zzj.zzJ(zzqVar.zzd);
                                    zzj.zzY(zzqVar.zze);
                                    zzj.zzT(zzqVar.zzf);
                                    zzj.zzad(zzqVar.zzh);
                                    if (!zzg().zzs(null, zzemVar)) {
                                        zzj.zzH(zzqVar.zzl);
                                    }
                                    zzj.zzU(zzqVar.zzs);
                                    zzam zzamVar22 = this.zze;
                                    zzak(zzamVar22);
                                    zzamVar22.zzD(zzj);
                                }
                                if (zzc2.zzi(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzj.zzu())) {
                                    zzu.zzF((String) Preconditions.checkNotNull(zzj.zzu()));
                                }
                                if (!TextUtils.isEmpty(zzj.zzx())) {
                                    zzu.zzU((String) Preconditions.checkNotNull(zzj.zzx()));
                                }
                                zzam zzamVar192 = this.zze;
                                zzak(zzamVar192);
                                zzu2 = zzamVar192.zzu(zzqVar.zza);
                                for (i13 = i12; i13 < zzu2.size(); i13++) {
                                    com.google.android.gms.internal.measurement.zzgk zzd3 = com.google.android.gms.internal.measurement.zzgl.zzd();
                                    zzd3.zzf(((zzlq) zzu2.get(i13)).zzc);
                                    zzd3.zzg(((zzlq) zzu2.get(i13)).zzd);
                                    zzln zzlnVar4 = this.zzi;
                                    zzak(zzlnVar4);
                                    zzlnVar4.zzu(zzd3, ((zzlq) zzu2.get(i13)).zze);
                                    zzu.zzl(zzd3);
                                }
                                zzamVar2 = this.zze;
                                zzak(zzamVar2);
                                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzu.zzaE();
                                zzamVar2.zzg();
                                zzamVar2.zzW();
                                Preconditions.checkNotNull(zzgcVar);
                                Preconditions.checkNotEmpty(zzgcVar.zzy());
                                byte[] zzby3 = zzgcVar.zzby();
                                zzln zzlnVar22 = zzamVar2.zzf.zzi;
                                zzak(zzlnVar22);
                                long zzd4 = zzlnVar22.zzd(zzby3);
                                ContentValues contentValues22 = new ContentValues();
                                contentValues22.put("app_id", zzgcVar.zzy());
                                contentValues22.put("metadata_fingerprint", Long.valueOf(zzd4));
                                contentValues22.put("metadata", zzby3);
                                zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                zzamVar3 = this.zze;
                                zzak(zzamVar3);
                                zzatVar = new zzat(zzarVar.zzf);
                                while (true) {
                                    if (zzatVar.hasNext()) {
                                        if ("_r".equals(zzatVar.next())) {
                                            break;
                                        }
                                    } else {
                                        zzgb zzgbVar4 = this.zzc;
                                        zzak(zzgbVar4);
                                        boolean zzq = zzgbVar4.zzq(zzarVar.zza, zzarVar.zzb);
                                        zzam zzamVar23 = this.zze;
                                        zzak(zzamVar23);
                                        zzak zzl = zzamVar23.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                                        if (!zzq || zzl.zze >= zzg().zze(zzarVar.zza, zzen.zzn)) {
                                            i14 = i12;
                                        }
                                    }
                                }
                                zzamVar3.zzg();
                                zzamVar3.zzW();
                                Preconditions.checkNotNull(zzarVar);
                                Preconditions.checkNotEmpty(zzarVar.zza);
                                zzln zzlnVar32 = zzamVar3.zzf.zzi;
                                zzak(zzlnVar32);
                                byte[] zzby22 = zzlnVar32.zzj(zzarVar).zzby();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", zzarVar.zza);
                                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzarVar.zzb);
                                contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                                contentValues.put("metadata_fingerprint", Long.valueOf(zzd4));
                                contentValues.put("data", zzby22);
                                contentValues.put("realtime", Integer.valueOf(i14));
                                if (zzamVar3.zzh().insert("raw_events", null, contentValues) == -1) {
                                    zzamVar3.zzs.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzfa.zzn(zzarVar.zza));
                                } else {
                                    this.zza = 0L;
                                }
                                zzam zzamVar202 = this.zze;
                                zzak(zzamVar202);
                                zzamVar202.zzC();
                                zzam zzamVar212 = this.zze;
                                zzak(zzamVar212);
                                zzamVar212.zzx();
                                zzaf();
                                zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j11) + 500000) / 1000000));
                                return;
                            }
                        }
                        zzamVar2.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                        zzamVar3 = this.zze;
                        zzak(zzamVar3);
                        zzatVar = new zzat(zzarVar.zzf);
                        while (true) {
                            if (zzatVar.hasNext()) {
                            }
                        }
                        zzamVar3.zzg();
                        zzamVar3.zzW();
                        Preconditions.checkNotNull(zzarVar);
                        Preconditions.checkNotEmpty(zzarVar.zza);
                        zzln zzlnVar322 = zzamVar3.zzf.zzi;
                        zzak(zzlnVar322);
                        byte[] zzby222 = zzlnVar322.zzj(zzarVar).zzby();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", zzarVar.zza);
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzarVar.zzb);
                        contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                        contentValues.put("metadata_fingerprint", Long.valueOf(zzd4));
                        contentValues.put("data", zzby222);
                        contentValues.put("realtime", Integer.valueOf(i14));
                        if (zzamVar3.zzh().insert("raw_events", null, contentValues) == -1) {
                        }
                        zzam zzamVar2022 = this.zze;
                        zzak(zzamVar2022);
                        zzamVar2022.zzC();
                        zzam zzamVar2122 = this.zze;
                        zzak(zzamVar2122);
                        zzamVar2122.zzx();
                        zzaf();
                        zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j11) + 500000) / 1000000));
                        return;
                    } catch (SQLiteException e14) {
                        zzamVar2.zzs.zzay().zzd().zzc("Error storing raw event metadata. appId", zzfa.zzn(zzgcVar.zzy()), e14);
                        throw e14;
                    }
                    if (j13 > 0) {
                        zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzfa.zzn(str3), Long.valueOf(j13));
                    }
                    i12 = i11;
                    zzar zzarVar22 = new zzar(this.zzn, zza.zzc, str3, zza.zza, zza.zzd, 0L, zzc3);
                    zzam zzamVar162 = this.zze;
                    zzak(zzamVar162);
                    zzn = zzamVar162.zzn(str3, zzarVar22.zzb);
                    if (zzn != null) {
                        zzam zzamVar24 = this.zze;
                        zzak(zzamVar24);
                        if (zzamVar24.zzf(str3) >= zzg().zzb(str3) && zzai) {
                            zzay().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzfa.zzn(str3), this.zzn.zzj().zzd(zzarVar22.zzb), Integer.valueOf(zzg().zzb(str3)));
                            zzv().zzN(this.zzF, str3, 8, null, null, 0);
                            zzam zzamVar25 = this.zze;
                            zzak(zzamVar25);
                            zzamVar25.zzx();
                            return;
                        }
                        zzasVar = new zzas(str3, zzarVar22.zzb, 0L, 0L, 0L, zzarVar22.zzd, 0L, null, null, null, null);
                        zzarVar = zzarVar22;
                    } else {
                        zzar zza2 = zzarVar22.zza(this.zzn, zzn.zzf);
                        zzas zzc4 = zzn.zzc(zza2.zzd);
                        zzarVar = zza2;
                        zzasVar = zzc4;
                    }
                    zzam zzamVar172 = this.zze;
                    zzak(zzamVar172);
                    zzamVar172.zzE(zzasVar);
                    zzaz().zzg();
                    zzB();
                    Preconditions.checkNotNull(zzarVar);
                    Preconditions.checkNotNull(zzqVar);
                    Preconditions.checkNotEmpty(zzarVar.zza);
                    Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                    zzu = com.google.android.gms.internal.measurement.zzgc.zzu();
                    zzu.zzae(1);
                    zzu.zzaa("android");
                    if (!TextUtils.isEmpty(zzqVar.zza)) {
                        zzu.zzE(zzqVar.zza);
                    }
                    if (!TextUtils.isEmpty(zzqVar.zzd)) {
                        zzu.zzG(zzqVar.zzd);
                    }
                    if (!TextUtils.isEmpty(zzqVar.zzc)) {
                        zzu.zzH(zzqVar.zzc);
                    }
                    zzps.zzc();
                    if (zzg().zzs(null, zzen.zzaH) && !TextUtils.isEmpty(zzqVar.zzx)) {
                        zzu.zzai(zzqVar.zzx);
                    }
                    j14 = zzqVar.zzj;
                    if (j14 != -2147483648L) {
                        zzu.zzI((int) j14);
                    }
                    zzu.zzW(zzqVar.zze);
                    if (!TextUtils.isEmpty(zzqVar.zzb)) {
                        zzu.zzV(zzqVar.zzb);
                    }
                    zzu.zzM(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                    if (zzu.zzar().isEmpty() && !TextUtils.isEmpty(zzqVar.zzq)) {
                        zzu.zzC(zzqVar.zzq);
                    }
                    j15 = zzqVar.zzf;
                    if (j15 != 0) {
                        zzu.zzN(j15);
                    }
                    zzu.zzQ(zzqVar.zzs);
                    zzlnVar = this.zzi;
                    zzak(zzlnVar);
                    zzc = zzen.zzc(zzlnVar.zzf.zzn.zzau());
                    arrayList = null;
                    if (arrayList != null) {
                    }
                    zzc2 = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                    zzahVar = zzah.AD_STORAGE;
                    if (zzc2.zzi(zzahVar)) {
                    }
                    this.zzn.zzg().zzu();
                    zzu.zzO(Build.MODEL);
                    this.zzn.zzg().zzu();
                    zzu.zzZ(Build.VERSION.RELEASE);
                    zzu.zzak((int) this.zzn.zzg().zzb());
                    zzu.zzao(this.zzn.zzg().zzc());
                    zzg = zzg();
                    zzemVar = zzen.zzah;
                    if (!zzg.zzs(null, zzemVar)) {
                    }
                    if (this.zzn.zzJ()) {
                    }
                    zzam zzamVar1822 = this.zze;
                    zzak(zzamVar1822);
                    zzj = zzamVar1822.zzj(zzqVar.zza);
                    if (zzj == null) {
                    }
                    if (zzc2.zzi(zzah.ANALYTICS_STORAGE)) {
                        zzu.zzF((String) Preconditions.checkNotNull(zzj.zzu()));
                    }
                    if (!TextUtils.isEmpty(zzj.zzx())) {
                    }
                    zzam zzamVar1922 = this.zze;
                    zzak(zzamVar1922);
                    zzu2 = zzamVar1922.zzu(zzqVar.zza);
                    while (i13 < zzu2.size()) {
                    }
                    zzamVar2 = this.zze;
                    zzak(zzamVar2);
                    zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzu.zzaE();
                    zzamVar2.zzg();
                    zzamVar2.zzW();
                    Preconditions.checkNotNull(zzgcVar);
                    Preconditions.checkNotEmpty(zzgcVar.zzy());
                    byte[] zzby32 = zzgcVar.zzby();
                    zzln zzlnVar222 = zzamVar2.zzf.zzi;
                    zzak(zzlnVar222);
                    long zzd42 = zzlnVar222.zzd(zzby32);
                    ContentValues contentValues222 = new ContentValues();
                    contentValues222.put("app_id", zzgcVar.zzy());
                    contentValues222.put("metadata_fingerprint", Long.valueOf(zzd42));
                    contentValues222.put("metadata", zzby32);
                }
            }
            String zzg2 = zza.zzb.zzg("currency");
            if (z11) {
                double doubleValue = zza.zzb.zzd(AppMeasurementSdk.ConditionalUserProperty.VALUE).doubleValue() * 1000000.0d;
                if (doubleValue == 0.0d) {
                    j11 = nanoTime;
                    doubleValue = zza.zzb.zze(AppMeasurementSdk.ConditionalUserProperty.VALUE).longValue() * 1000000.0d;
                } else {
                    j11 = nanoTime;
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzfa.zzn(str2), Double.valueOf(doubleValue));
                    zzam zzamVar26 = this.zze;
                    zzak(zzamVar26);
                    zzamVar26.zzC();
                    zzam zzamVar27 = this.zze;
                    zzak(zzamVar27);
                    zzamVar27.zzx();
                    return;
                }
                longValue = Math.round(doubleValue);
                if (ProductAction.ACTION_REFUND.equals(zza.zza)) {
                    longValue = -longValue;
                }
            } else {
                j11 = nanoTime;
                longValue = zza.zzb.zze(AppMeasurementSdk.ConditionalUserProperty.VALUE).longValue();
            }
            if (!TextUtils.isEmpty(zzg2)) {
                String upperCase = zzg2.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    zzam zzamVar28 = this.zze;
                    zzak(zzamVar28);
                    zzlq zzp2 = zzamVar28.zzp(str2, concat);
                    if (zzp2 != null) {
                        Object obj3 = zzp2.zze;
                        if (obj3 instanceof Long) {
                            long longValue2 = ((Long) obj3).longValue();
                            String str4 = zza.zzc;
                            long currentTimeMillis = zzav().currentTimeMillis();
                            Long valueOf = Long.valueOf(longValue2 + longValue);
                            str = "_err";
                            zzlqVar = new zzlq(str2, str4, concat, currentTimeMillis, valueOf);
                            str2 = str2;
                            obj = null;
                            zzamVar = this.zze;
                            zzak(zzamVar);
                            if (!zzamVar.zzL(zzlqVar)) {
                                zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzfa.zzn(str2), this.zzn.zzj().zzf(zzlqVar.zzc), zzlqVar.zze);
                                zzv().zzN(this.zzF, str2, 9, null, null, 0);
                            }
                            boolean zzai2 = zzlt.zzai(zza.zza);
                            boolean equals2 = str.equals(zza.zza);
                            zzv();
                            zzauVar = zza.zzb;
                            if (zzauVar != null) {
                            }
                            long j162 = j12 + 1;
                            zzam zzamVar72 = this.zze;
                            zzak(zzamVar72);
                            String str32 = str2;
                            zzak zzm2 = zzamVar72.zzm(zza(), str32, j162, true, zzai2, false, equals2, false);
                            long j172 = zzm2.zzb;
                            zzg();
                            intValue = j172 - ((Integer) zzen.zzj.zza(obj)).intValue();
                            if (intValue <= 0) {
                            }
                        }
                    }
                    long j19 = longValue;
                    str = "_err";
                    zzam zzamVar29 = this.zze;
                    zzak(zzamVar29);
                    int zze = zzg().zze(str2, zzen.zzD) - 1;
                    Preconditions.checkNotEmpty(str2);
                    zzamVar29.zzg();
                    zzamVar29.zzW();
                    zzamVar29.zzh().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str2, str2, String.valueOf(zze)});
                    obj = null;
                    zzlqVar = new zzlq(str2, zza.zzc, concat, zzav().currentTimeMillis(), Long.valueOf(j19));
                    str2 = str2;
                    zzamVar = this.zze;
                    zzak(zzamVar);
                    if (!zzamVar.zzL(zzlqVar)) {
                    }
                    boolean zzai22 = zzlt.zzai(zza.zza);
                    boolean equals22 = str.equals(zza.zza);
                    zzv();
                    zzauVar = zza.zzb;
                    if (zzauVar != null) {
                    }
                    long j1622 = j12 + 1;
                    zzam zzamVar722 = this.zze;
                    zzak(zzamVar722);
                    String str322 = str2;
                    zzak zzm22 = zzamVar722.zzm(zza(), str322, j1622, true, zzai22, false, equals22, false);
                    long j1722 = zzm22.zzb;
                    zzg();
                    intValue = j1722 - ((Integer) zzen.zzj.zza(obj)).intValue();
                    if (intValue <= 0) {
                    }
                }
            }
            str = "_err";
            obj = null;
            boolean zzai222 = zzlt.zzai(zza.zza);
            boolean equals222 = str.equals(zza.zza);
            zzv();
            zzauVar = zza.zzb;
            if (zzauVar != null) {
            }
            long j16222 = j12 + 1;
            zzam zzamVar7222 = this.zze;
            zzak(zzamVar7222);
            String str3222 = str2;
            zzak zzm222 = zzamVar7222.zzm(zza(), str3222, j16222, true, zzai222, false, equals222, false);
            long j17222 = zzm222.zzb;
            zzg();
            intValue = j17222 - ((Integer) zzen.zzj.zza(obj)).intValue();
            if (intValue <= 0) {
            }
        } catch (Throwable th2) {
            zzam zzamVar30 = this.zze;
            zzak(zzamVar30);
            zzamVar30.zzx();
            throw th2;
        }
    }

    @VisibleForTesting
    final boolean zzY() {
        zzaz().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzay().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzs.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzau().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock tryLock = channel.tryLock();
            this.zzw = tryLock;
            if (tryLock != null) {
                zzay().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzay().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e11) {
            zzay().zzd().zzb("Failed to acquire storage lock", e11);
            return false;
        } catch (IOException e12) {
            zzay().zzd().zzb("Failed to access storage lock file", e12);
            return false;
        } catch (OverlappingFileLockException e13) {
            zzay().zzk().zzb("Storage lock already acquired", e13);
            return false;
        }
    }

    final long zza() {
        long currentTimeMillis = zzav().currentTimeMillis();
        zzkg zzkgVar = this.zzk;
        zzkgVar.zzW();
        zzkgVar.zzg();
        long zza = zzkgVar.zze.zza();
        if (zza == 0) {
            zza = zzkgVar.zzs.zzv().zzG().nextInt(86400000) + 1;
            zzkgVar.zze.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final Context zzau() {
        return this.zzn.zzau();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final Clock zzav() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzav();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final zzab zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final zzfa zzay() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzay();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final zzgh zzaz() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    final zzh zzd(zzq zzqVar) {
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzpj.zzc();
        zzlj zzljVar = null;
        if (zzg().zzs(zzqVar.zza, zzen.zzaJ) && !zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzlk(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        zzh zzj = zzamVar.zzj(zzqVar.zza);
        zzai zzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        zzah zzahVar = zzah.AD_STORAGE;
        String zzf = zzc.zzi(zzahVar) ? this.zzk.zzf(zzqVar.zza) : "";
        if (zzj == null) {
            zzj = new zzh(this.zzn, zzqVar.zza);
            if (zzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzj.zzI(zzw(zzc));
            }
            if (zzc.zzi(zzahVar)) {
                zzj.zzaf(zzf);
            }
        } else if (zzc.zzi(zzahVar) && zzf != null && !zzf.equals(zzj.zzA())) {
            zzj.zzaf(zzf);
            zzne.zzc();
            zzag zzg = zzg();
            zzem zzemVar = zzen.zzan;
            if (!zzg.zzs(null, zzemVar) || !zzg().zzs(null, zzen.zzas)) {
                zzj.zzI(zzw(zzc));
            } else if (!"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzc).first)) {
                zzj.zzI(zzw(zzc));
            }
            zzne.zzc();
            if (zzg().zzs(null, zzemVar) && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzc).first)) {
                zzam zzamVar2 = this.zze;
                zzak(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzam zzamVar3 = this.zze;
                    zzak(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzlq zzlqVar = new zzlq(zzqVar.zza, "auto", "_lair", zzav().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzak(zzamVar4);
                        zzamVar4.zzL(zzlqVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzj.zzu()) && zzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzj.zzI(zzw(zzc));
        }
        zzj.zzX(zzqVar.zzb);
        zzj.zzF(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzj.zzW(zzqVar.zzk);
        }
        long j11 = zzqVar.zze;
        if (j11 != 0) {
            zzj.zzY(j11);
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
        if (!zzg().zzs(null, zzen.zzah)) {
            zzj.zzH(zzqVar.zzl);
        }
        zzj.zzG(zzqVar.zzo);
        zzj.zzae(zzqVar.zzr);
        zzj.zzU(zzqVar.zzs);
        zzps.zzc();
        if (zzg().zzs(null, zzen.zzaH)) {
            zzj.zzah(zzqVar.zzx);
        }
        zznz.zzc();
        if (zzg().zzs(null, zzen.zzaz)) {
            zzj.zzag(zzqVar.zzt);
        } else {
            zznz.zzc();
            if (zzg().zzs(null, zzen.zzay)) {
                zzj.zzag(null);
            }
        }
        if (zzj.zzak()) {
            zzam zzamVar5 = this.zze;
            zzak(zzamVar5);
            zzamVar5.zzD(zzj);
        }
        return zzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzak(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    final zzai zzh(String str) {
        String str2;
        zzai zzaiVar = zzai.zza;
        zzaz().zzg();
        zzB();
        zzai zzaiVar2 = (zzai) this.zzB.get(str);
        if (zzaiVar2 != null) {
            return zzaiVar2;
        }
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        Preconditions.checkNotNull(str);
        zzamVar.zzg();
        zzamVar.zzW();
        Cursor cursor = null;
        try {
            try {
                cursor = zzamVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursor.moveToFirst()) {
                    str2 = cursor.getString(0);
                    cursor.close();
                } else {
                    cursor.close();
                    str2 = "G1";
                }
                zzai zzb2 = zzai.zzb(str2);
                zzU(str, zzb2);
                return zzb2;
            } catch (SQLiteException e11) {
                zzamVar.zzs.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e11);
                throw e11;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzak(zzamVar);
        return zzamVar;
    }

    public final zzev zzj() {
        return this.zzn.zzj();
    }

    public final zzfg zzl() {
        zzfg zzfgVar = this.zzd;
        zzak(zzfgVar);
        return zzfgVar;
    }

    public final zzfi zzm() {
        zzfi zzfiVar = this.zzf;
        if (zzfiVar != null) {
            return zzfiVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzgb zzo() {
        zzgb zzgbVar = this.zzc;
        zzak(zzgbVar);
        return zzgbVar;
    }

    final zzgk zzq() {
        return this.zzn;
    }

    public final zziu zzr() {
        zziu zziuVar = this.zzj;
        zzak(zziuVar);
        return zziuVar;
    }

    public final zzkg zzs() {
        return this.zzk;
    }

    public final zzln zzu() {
        zzln zzlnVar = this.zzi;
        zzak(zzlnVar);
        return zzlnVar;
    }

    public final zzlt zzv() {
        return ((zzgk) Preconditions.checkNotNull(this.zzn)).zzv();
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
            return (String) zzaz().zzh(new zzle(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            zzay().zzd().zzc("Failed to get app instance id. appId", zzfa.zzn(zzqVar.zza), e11);
            return null;
        }
    }

    final void zzz(Runnable runnable) {
        zzaz().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
