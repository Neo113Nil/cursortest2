package com.ironsource.adqualitysdk.sdk.i;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Build;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮇ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1055 implements InterfaceC1129 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f3344;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f3343 = {StringFog.decrypt("GqVY\n", "acEzxgV3EYA=\n"), StringFog.decrypt("RuoYMj8K9m5F7g==\n", "IYV3VVNvqR0=\n"), StringFog.decrypt("oPfNL4n2ztG99g==\n", "05OmcO6Gpr4=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f3342 = {StringFog.decrypt("OnTsIhyhR60=\n", "fxmZTn3VKN8=\n"), StringFog.decrypt("No5fMjn4LKAkpHA=\n", "d+A7QFaRSIA=\n")};

    public C1055(Context context) {
        this.f3344 = context;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m628() {
        String lowerCase = Build.PRODUCT.toLowerCase();
        String str = Build.MODEL;
        for (String str2 : f3343) {
            if (lowerCase.contains(str2.toLowerCase())) {
                return true;
            }
        }
        for (String str3 : f3342) {
            if (str.toLowerCase().contains(str3.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1129
    public final String getName() {
        return StringFog.decrypt("dvCBw5wZqbNf5IfPjhavv334h94=\n", "HpHzp+t429Y=\n");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:49|50|(1:52)|53|(4:54|55|56|57)|(16:84|85|86|87|61|(1:63)|64|65|66|(2:68|(6:73|74|76|77|78|79))|82|74|76|77|78|79)|59|60|61|(0)|64|65|66|(0)|82|74|76|77|78|79) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:49|50|(1:52)|53|54|55|56|57|(16:84|85|86|87|61|(1:63)|64|65|66|(2:68|(6:73|74|76|77|78|79))|82|74|76|77|78|79)|59|60|61|(0)|64|65|66|(0)|82|74|76|77|78|79) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.StringFog.decrypt("FEs=\n", "bzYxMrP/Akw=\n");
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0093 A[Catch: Exception -> 0x00c9, LOOP:2: B:101:0x0091->B:102:0x0093, LOOP_END, TryCatch #7 {Exception -> 0x00c9, blocks: (B:22:0x006b, B:24:0x0078, B:26:0x007b, B:27:0x0088, B:102:0x0093, B:104:0x009c, B:106:0x00a5, B:109:0x00ae, B:111:0x00bb), top: B:21:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a5 A[Catch: Exception -> 0x00c9, TryCatch #7 {Exception -> 0x00c9, blocks: (B:22:0x006b, B:24:0x0078, B:26:0x007b, B:27:0x0088, B:102:0x0093, B:104:0x009c, B:106:0x00a5, B:109:0x00ae, B:111:0x00bb), top: B:21:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: Exception -> 0x0089, TRY_LEAVE, TryCatch #8 {Exception -> 0x0089, blocks: (B:14:0x0052, B:16:0x0057), top: B:13:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:66:0x0191, B:68:0x019f, B:70:0x01af, B:74:0x01bd), top: B:65:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f A[Catch: Exception -> 0x016d, TRY_LEAVE, TryCatch #2 {Exception -> 0x016d, blocks: (B:57:0x015c, B:84:0x016f), top: B:56:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0142 A[Catch: Exception -> 0x014b, TRY_LEAVE, TryCatch #5 {Exception -> 0x014b, blocks: (B:47:0x012f, B:94:0x0142), top: B:46:0x012f }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1129
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0350 mo221() {
        long j;
        long j2;
        long[] jArr;
        long j3;
        String lowerCase;
        int i;
        int i2;
        int i3;
        boolean z;
        Intent registerReceiver;
        SensorManager sensorManager;
        int i4;
        int i5;
        double d;
        ActivityManager activityManager;
        ArrayList arrayList = new ArrayList();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors < 3) {
            arrayList.add(50);
        }
        try {
            activityManager = (ActivityManager) this.f3344.getSystemService(StringFog.decrypt("qk/340LLkss=\n", "yyyDijSi5rI=\n"));
        } catch (Exception unused) {
        }
        if (activityManager == null) {
            j = 0;
            if (j < 1024) {
                arrayList.add(51);
            }
            try {
                long[] jArr2 = new long[5];
                for (i4 = 0; i4 < 5; i4++) {
                    long nanoTime = System.nanoTime();
                    long j4 = 0;
                    j2 = 0;
                    for (int i6 = 0; i6 < 10000; i6++) {
                        long j5 = i6;
                        j4 = (j5 * j5) + j4;
                    }
                    try {
                        jArr2[i4] = System.nanoTime() - nanoTime;
                        if (j4 == Long.MIN_VALUE) {
                            throw new RuntimeException(StringFog.decrypt("TUAjcshzaa5aQjQ=\n", "OC5RF6kQAc8=\n"));
                        }
                    } catch (Exception unused2) {
                        jArr = new long[]{j2, -1};
                        long j6 = jArr[0];
                        j3 = jArr[1];
                        if (j3 > j2) {
                        }
                        if (m628()) {
                        }
                        lowerCase = Build.FINGERPRINT.toLowerCase();
                        if (!lowerCase.contains(StringFog.decrypt("yyoIW7pcSA==\n", "rE9mPsg1K00=\n"))) {
                        }
                        arrayList.add(54);
                        sensorManager = (SensorManager) this.f3344.getSystemService(StringFog.decrypt("3UzaSmCR\n", "rim0OQ/jKPY=\n"));
                        if (sensorManager != null) {
                        }
                    }
                }
                j2 = 0;
                double d2 = 0.0d;
                for (i5 = 0; i5 < 5; i5++) {
                    d2 += jArr2[i5];
                }
                double d3 = 0.0d;
                double d4 = 5.0d;
                d = d2 / 5.0d;
                if (d != 0.0d) {
                    jArr = new long[]{0, 0};
                } else {
                    int i7 = 0;
                    while (i7 < 5) {
                        double d5 = d4;
                        double d6 = jArr2[i7] - d;
                        d3 += d6 * d6;
                        i7++;
                        d4 = d5;
                    }
                    jArr = new long[]{(long) d, (long) (d3 / d4)};
                }
            } catch (Exception unused3) {
                j2 = 0;
            }
            long j62 = jArr[0];
            j3 = jArr[1];
            if (j3 > j2 && j62 > j2 && Math.sqrt(j3) / j62 > 0.5d) {
                arrayList.add(52);
            }
            if (m628()) {
                arrayList.add(53);
            }
            lowerCase = Build.FINGERPRINT.toLowerCase();
            if (!lowerCase.contains(StringFog.decrypt("yyoIW7pcSA==\n", "rE9mPsg1K00=\n")) || lowerCase.contains(StringFog.decrypt("A/V2bhGdpBYE\n", "d5AFGjz2wW8=\n"))) {
                arrayList.add(54);
            }
            try {
                sensorManager = (SensorManager) this.f3344.getSystemService(StringFog.decrypt("3UzaSmCR\n", "rim0OQ/jKPY=\n"));
            } catch (Exception unused4) {
            }
            if (sensorManager != null) {
                i = sensorManager.getSensorList(-1).size();
                if (i < 5) {
                }
                registerReceiver = this.f3344.registerReceiver(null, new IntentFilter(StringFog.decrypt("IebVg9yBEYsp5sWU3ZxbxCP82J7dxjfkFNz0o+q3Nu0Bxva09w==\n", "QIix8bPodaU=\n")));
                if (registerReceiver != null) {
                }
                i2 = -1;
                i3 = i2;
                if (i3 == 250) {
                }
                JSONObject jSONObject = new JSONObject();
                String decrypt = StringFog.decrypt("KkoThw3S0ZEsSw==\n", "QzlW6ni+sOU=\n");
                if (!m628()) {
                }
                z = true;
                jSONObject.put(decrypt, z);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringFog.decrypt("zta/JrKkvJTM578wuaM=\n", "vqTQRdfXz/s=\n"), availableProcessors);
                jSONObject2.put(StringFog.decrypt("EyN/W/rj79MIPnJ31A==\n", "Z0wLOpauir4=\n"), j);
                jSONObject2.put(StringFog.decrypt("PPkdma2q9e86+RGeoKjt/Q==\n", "SJBw8MPNo44=\n"), j3);
                jSONObject2.put(StringFog.decrypt("QHnQhFLzQZVGcso=\n", "Mxy+9z2BAvo=\n"), i);
                jSONObject2.put(StringFog.decrypt("Hs7hoYdiyi4ZwuU=\n", "fK+V1eIQs3o=\n"), i3);
                jSONObject2.put(StringFog.decrypt("hYryd2C8yemZhPNif6bV+w==\n", "7euBMg3JpYg=\n"), jSONObject.optBoolean(StringFog.decrypt("72Y/lzPYr8XpZw==\n", "hhV6+ka0zrE=\n"), false));
                String decrypt2 = jSONObject2.toString();
                return new C0350(arrayList.isEmpty(), arrayList, decrypt2, null);
            }
            i = 0;
            if (i < 5) {
                arrayList.add(55);
            }
            try {
                try {
                    registerReceiver = this.f3344.registerReceiver(null, new IntentFilter(StringFog.decrypt("IebVg9yBEYsp5sWU3ZxbxCP82J7dxjfkFNz0o+q3Nu0Bxva09w==\n", "QIix8bPodaU=\n")));
                } catch (Exception unused5) {
                }
            } catch (Exception unused6) {
                i2 = -1;
            }
            if (registerReceiver != null) {
                i2 = -1;
                try {
                    i3 = registerReceiver.getIntExtra(StringFog.decrypt("F9yHk0t8LkYWy48=\n", "Y7nq4y4OTzI=\n"), -1);
                } catch (Exception unused7) {
                }
                if (i3 == 250) {
                    arrayList.add(56);
                }
                JSONObject jSONObject3 = new JSONObject();
                String decrypt3 = StringFog.decrypt("KkoThw3S0ZEsSw==\n", "QzlW6ni+sOU=\n");
                if (!m628()) {
                    String lowerCase2 = Build.FINGERPRINT.toLowerCase();
                    if (!lowerCase2.contains(StringFog.decrypt("yyoIW7pcSA==\n", "rE9mPsg1K00=\n")) && !lowerCase2.contains(StringFog.decrypt("A/V2bhGdpBYE\n", "d5AFGjz2wW8=\n"))) {
                        z = false;
                        jSONObject3.put(decrypt3, z);
                        JSONObject jSONObject22 = new JSONObject();
                        jSONObject22.put(StringFog.decrypt("zta/JrKkvJTM578wuaM=\n", "vqTQRdfXz/s=\n"), availableProcessors);
                        jSONObject22.put(StringFog.decrypt("EyN/W/rj79MIPnJ31A==\n", "Z0wLOpauir4=\n"), j);
                        jSONObject22.put(StringFog.decrypt("PPkdma2q9e86+RGeoKjt/Q==\n", "SJBw8MPNo44=\n"), j3);
                        jSONObject22.put(StringFog.decrypt("QHnQhFLzQZVGcso=\n", "Mxy+9z2BAvo=\n"), i);
                        jSONObject22.put(StringFog.decrypt("Hs7hoYdiyi4ZwuU=\n", "fK+V1eIQs3o=\n"), i3);
                        jSONObject22.put(StringFog.decrypt("hYryd2C8yemZhPNif6bV+w==\n", "7euBMg3JpYg=\n"), jSONObject3.optBoolean(StringFog.decrypt("72Y/lzPYr8XpZw==\n", "hhV6+ka0zrE=\n"), false));
                        String decrypt22 = jSONObject22.toString();
                        return new C0350(arrayList.isEmpty(), arrayList, decrypt22, null);
                    }
                }
                z = true;
                jSONObject3.put(decrypt3, z);
                JSONObject jSONObject222 = new JSONObject();
                jSONObject222.put(StringFog.decrypt("zta/JrKkvJTM578wuaM=\n", "vqTQRdfXz/s=\n"), availableProcessors);
                jSONObject222.put(StringFog.decrypt("EyN/W/rj79MIPnJ31A==\n", "Z0wLOpauir4=\n"), j);
                jSONObject222.put(StringFog.decrypt("PPkdma2q9e86+RGeoKjt/Q==\n", "SJBw8MPNo44=\n"), j3);
                jSONObject222.put(StringFog.decrypt("QHnQhFLzQZVGcso=\n", "Mxy+9z2BAvo=\n"), i);
                jSONObject222.put(StringFog.decrypt("Hs7hoYdiyi4ZwuU=\n", "fK+V1eIQs3o=\n"), i3);
                jSONObject222.put(StringFog.decrypt("hYryd2C8yemZhPNif6bV+w==\n", "7euBMg3JpYg=\n"), jSONObject3.optBoolean(StringFog.decrypt("72Y/lzPYr8XpZw==\n", "hhV6+ka0zrE=\n"), false));
                String decrypt222 = jSONObject222.toString();
                return new C0350(arrayList.isEmpty(), arrayList, decrypt222, null);
            }
            i2 = -1;
            i3 = i2;
            if (i3 == 250) {
            }
            JSONObject jSONObject32 = new JSONObject();
            String decrypt32 = StringFog.decrypt("KkoThw3S0ZEsSw==\n", "QzlW6ni+sOU=\n");
            if (!m628()) {
            }
            z = true;
            jSONObject32.put(decrypt32, z);
            JSONObject jSONObject2222 = new JSONObject();
            jSONObject2222.put(StringFog.decrypt("zta/JrKkvJTM578wuaM=\n", "vqTQRdfXz/s=\n"), availableProcessors);
            jSONObject2222.put(StringFog.decrypt("EyN/W/rj79MIPnJ31A==\n", "Z0wLOpauir4=\n"), j);
            jSONObject2222.put(StringFog.decrypt("PPkdma2q9e86+RGeoKjt/Q==\n", "SJBw8MPNo44=\n"), j3);
            jSONObject2222.put(StringFog.decrypt("QHnQhFLzQZVGcso=\n", "Mxy+9z2BAvo=\n"), i);
            jSONObject2222.put(StringFog.decrypt("Hs7hoYdiyi4ZwuU=\n", "fK+V1eIQs3o=\n"), i3);
            jSONObject2222.put(StringFog.decrypt("hYryd2C8yemZhPNif6bV+w==\n", "7euBMg3JpYg=\n"), jSONObject32.optBoolean(StringFog.decrypt("72Y/lzPYr8XpZw==\n", "hhV6+ka0zrE=\n"), false));
            String decrypt2222 = jSONObject2222.toString();
            return new C0350(arrayList.isEmpty(), arrayList, decrypt2222, null);
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        j = memoryInfo.totalMem / 1048576;
        if (j < 1024) {
        }
        long[] jArr22 = new long[5];
        while (i4 < 5) {
        }
        j2 = 0;
        double d22 = 0.0d;
        while (i5 < 5) {
        }
        double d32 = 0.0d;
        double d42 = 5.0d;
        d = d22 / 5.0d;
        if (d != 0.0d) {
        }
        long j622 = jArr[0];
        j3 = jArr[1];
        if (j3 > j2) {
            arrayList.add(52);
        }
        if (m628()) {
        }
        lowerCase = Build.FINGERPRINT.toLowerCase();
        if (!lowerCase.contains(StringFog.decrypt("yyoIW7pcSA==\n", "rE9mPsg1K00=\n"))) {
        }
        arrayList.add(54);
        sensorManager = (SensorManager) this.f3344.getSystemService(StringFog.decrypt("3UzaSmCR\n", "rim0OQ/jKPY=\n"));
        if (sensorManager != null) {
        }
    }
}
