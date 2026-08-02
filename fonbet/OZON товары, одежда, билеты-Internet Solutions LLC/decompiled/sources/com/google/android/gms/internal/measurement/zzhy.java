package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class zzhy {
    public static final /* synthetic */ int zzc = 0;
    private static volatile zzhw zze = null;
    private static volatile boolean zzf = false;
    final zzhv zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;
    private static final Object zzd = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzia zzh = new zzia(new Object() { // from class: com.google.android.gms.internal.measurement.zzhq
    }, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* synthetic */ zzhy(zzhv zzhvVar, String str, Object obj, boolean z11, zzhx zzhxVar) {
        if (zzhvVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzhvVar;
        this.zzb = str;
        this.zzj = obj;
        this.zzm = true;
    }

    static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zzd;
            synchronized (obj) {
                try {
                    if (zze == null) {
                        synchronized (obj) {
                            zzhw zzhwVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzhwVar != null) {
                                if (zzhwVar.zza() != context) {
                                }
                            }
                            zzhe.zze();
                            zzhz.zzc();
                            zzhm.zze();
                            zze = new zzhb(context, zzij.zza(new zzif() { // from class: com.google.android.gms.internal.measurement.zzhp
                                @Override // com.google.android.gms.internal.measurement.zzif
                                public final Object zza() {
                                    zzid zzc2;
                                    zzid zzc3;
                                    Context context2 = context;
                                    int i11 = zzhy.zzc;
                                    String str = Build.TYPE;
                                    String str2 = Build.TAGS;
                                    if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                                        return zzid.zzc();
                                    }
                                    if (zzha.zza() && !context2.isDeviceProtectedStorage()) {
                                        context2 = context2.createDeviceProtectedStorageContext();
                                    }
                                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        StrictMode.allowThreadDiskWrites();
                                        try {
                                            File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                            zzc2 = file.exists() ? zzid.zzd(file) : zzid.zzc();
                                        } catch (RuntimeException e11) {
                                            Log.e("HermeticFileOverrides", "no data dir", e11);
                                            zzc2 = zzid.zzc();
                                        }
                                        if (zzc2.zzb()) {
                                            File file2 = (File) zzc2.zza();
                                            try {
                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                try {
                                                    HashMap hashMap = new HashMap();
                                                    HashMap hashMap2 = new HashMap();
                                                    while (true) {
                                                        String readLine = bufferedReader.readLine();
                                                        if (readLine == null) {
                                                            break;
                                                        }
                                                        String[] split = readLine.split(" ", 3);
                                                        if (split.length != 3) {
                                                            Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                                        } else {
                                                            String str3 = new String(split[0]);
                                                            String decode = Uri.decode(new String(split[1]));
                                                            String str4 = (String) hashMap2.get(split[2]);
                                                            if (str4 == null) {
                                                                String str5 = new String(split[2]);
                                                                str4 = Uri.decode(str5);
                                                                if (str4.length() < 1024 || str4 == str5) {
                                                                    hashMap2.put(str5, str4);
                                                                }
                                                            }
                                                            if (!hashMap.containsKey(str3)) {
                                                                hashMap.put(str3, new HashMap());
                                                            }
                                                            ((Map) hashMap.get(str3)).put(decode, str4);
                                                        }
                                                    }
                                                    Log.i("HermeticFileOverrides", "Parsed " + file2.toString());
                                                    zzhg zzhgVar = new zzhg(hashMap);
                                                    bufferedReader.close();
                                                    zzc3 = zzid.zzd(zzhgVar);
                                                } catch (Throwable th2) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (Throwable th3) {
                                                        try {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                                        } catch (Exception unused) {
                                                        }
                                                    }
                                                    throw th2;
                                                }
                                            } catch (IOException e12) {
                                                throw new RuntimeException(e12);
                                            }
                                        } else {
                                            zzc3 = zzid.zzc();
                                        }
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        return zzc3;
                                    } catch (Throwable th4) {
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        throw th4;
                                    }
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                } finally {
                }
            }
        }
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:43:0x009e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0065, B:24:0x006f, B:27:0x00a0, B:29:0x00b0, B:31:0x00c4, B:32:0x00c7, B:33:0x00cb, B:34:0x0078, B:36:0x007e, B:39:0x0090, B:41:0x0096, B:43:0x009e, B:44:0x008e, B:48:0x0057, B:49:0x00d0, B:50:0x00d5, B:51:0x00d6), top: B:11:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        zzhj zza;
        Object zzb;
        if (!this.zzm && this.zzb == null) {
            throw new NullPointerException("flagName must not be null");
        }
        int i11 = zzi.get();
        if (this.zzk < i11) {
            synchronized (this) {
                try {
                    if (this.zzk < i11) {
                        zzhw zzhwVar = zze;
                        if (zzhwVar == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        zzhv zzhvVar = this.zza;
                        boolean z11 = zzhvVar.zzf;
                        if (zzhvVar.zzb == null) {
                            Context zza2 = zzhwVar.zza();
                            String str = this.zza.zza;
                            zza = zzhz.zza(zza2, null);
                        } else if (zzhn.zza(zzhwVar.zza(), this.zza.zzb)) {
                            boolean z12 = this.zza.zzh;
                            zza = zzhe.zza(zzhwVar.zza().getContentResolver(), this.zza.zzb);
                        } else {
                            zza = null;
                        }
                        Object zza3 = (zza == null || (zzb = zza.zzb(zzc())) == null) ? null : zza(zzb);
                        if (zza3 == null) {
                            if (!this.zza.zze) {
                                String zzb2 = zzhm.zza(zzhwVar.zza()).zzb(this.zza.zze ? null : this.zzb);
                                if (zzb2 != null) {
                                    zza3 = zza(zzb2);
                                    if (zza3 == null) {
                                        zza3 = this.zzj;
                                    }
                                }
                            }
                            zza3 = null;
                            if (zza3 == null) {
                            }
                        }
                        zzid zzidVar = (zzid) zzhwVar.zzb().zza();
                        if (zzidVar.zzb()) {
                            zzhg zzhgVar = (zzhg) zzidVar.zza();
                            zzhv zzhvVar2 = this.zza;
                            String zza4 = zzhgVar.zza(zzhvVar2.zzb, null, zzhvVar2.zzd, this.zzb);
                            zza3 = zza4 == null ? this.zzj : zza(zza4);
                        }
                        this.zzl = zza3;
                        this.zzk = i11;
                    }
                } finally {
                }
            }
        }
        return this.zzl;
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
