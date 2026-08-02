package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzgt {
    private static zzgu zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        zzgl zzglVar = new zzgl(simpleArrayMap);
                        bufferedReader.close();
                        return zzglVar;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String zza2 = zza(split[0]);
                        String decode = Uri.decode(zza(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String zza3 = zza(split[2]);
                            str = Uri.decode(zza3);
                            if (str.length() < 1024 || str == zza3) {
                                hashMap.put(zza3, str);
                            }
                        }
                        SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(zza2);
                        if (simpleArrayMap2 == null) {
                            simpleArrayMap2 = new SimpleArrayMap();
                            simpleArrayMap.put(zza2, simpleArrayMap2);
                        }
                        simpleArrayMap2.put(decode, str);
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
    public static class zza {
        private static volatile Optional<zzgu> zza;

        public static Optional<zzgu> zza(Context context) {
            Optional<zzgu> optional;
            Optional<zzgu> zza2;
            Optional<zzgu> optional2 = zza;
            if (optional2 != null) {
                return optional2;
            }
            synchronized (zza.class) {
                optional = zza;
                if (optional == null) {
                    new zzgt();
                    if (zzgx.zza(Build.TYPE, Build.TAGS)) {
                        if (zzgf.zza() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        zza2 = zzgt.zza(context);
                    } else {
                        zza2 = Optional.absent();
                    }
                    optional = zza2;
                    zza = optional;
                }
            }
            return optional;
        }

        private zza() {
        }
    }

    private static Optional<File> zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? Optional.of(file) : Optional.absent();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return Optional.absent();
        }
    }

    static Optional<zzgu> zza(Context context) {
        Optional<zzgu> absent;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            Optional<File> zzb = zzb(context);
            if (zzb.isPresent()) {
                absent = Optional.of(zza(context, zzb.get()));
            } else {
                absent = Optional.absent();
            }
            return absent;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
