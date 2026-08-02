package com.ironsource.adqualitysdk.sdk.i;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ч, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0384 implements InterfaceC1129 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1128;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f1127 = {StringFog.decrypt("rY+FexE+kwu+koctBXmGCKqShzwY\n", "zuDoVXxX52Y=\n"), StringFog.decrypt("zsODM7XIVanC2o9ztN1fot/BwG2zzkqpyMGBabU=\n", "razuHdCvOts=\n"), StringFog.decrypt("aZzHQcWSkmJ/itIA3IQ=\n", "Bu6gb7Xg/Ro=\n"), StringFog.decrypt("WLWdHZnSIHtSrpFK298idkuun1yZ3D92\n", "O9rwM/W3VgI=\n"), StringFog.decrypt("cx2pmYl9dtxuAL6ZjXl6y38OvNaY\n", "HG/Ot/ocGLg=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f1126 = {StringFog.decrypt("HTH/6IaDs9kYOrXohoih2QEkvumMheueFyel+4WNoIU=\n", "eVTRmunhxfc=\n"), StringFog.decrypt("nTkdlmBeOv+EOUCFZQ==\n", "9FYz4AFwX4c=\n"), StringFog.decrypt("UZYNECC6czlJ3UYfNQ==\n", "PPMjZ0XTAFE=\n"), StringFog.decrypt("eTgDi/vlrrNlLwCL+vewvXEvFg==\n", "FkpkpZeW3tw=\n"), StringFog.decrypt("3+W+T1xvZzrV4f0SWmxhPM7rpwQ=\n", "vIrTYS8OEkg=\n")};

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String[] f1125 = {StringFog.decrypt("XYlpClcr6Q1RjmpTVmr0BlmPd08=\n", "PuYEJCNEmWc=\n"), StringFog.decrypt("y91+d+SKkHjIwSJxopiMZsvaI2E=\n", "rqhQFIzr+RY=\n"), StringFog.decrypt("fBNodSy+1YB3FW4/MqXUkjEPcCsio9WAeg4=\n", "H3wFW0fRoPM=\n"), StringFog.decrypt("02hdTtPXjmvFYV8Vk9mTZ8JoWQSTy4g=\n", "sAcwYL24/QM=\n"), StringFog.decrypt("lmVMCF09UXWRekBUXSwWdIB6RFRcJl11\n", "9QohJilVOAc=\n"), StringFog.decrypt("j4I8J4jfL2SDmjR638k2\n", "7O1RCfG6Qwg=\n"), StringFog.decrypt("Z4axYyc8pJ1rgLhjMDeui22Hu2MkO6yDbYe7Yw88gZ90q7UhKjuuiFeMrjsvMaXBR6aVAw==\n", "BOncTUZSwO8=\n"), StringFog.decrypt("KetpKhmDYVk68XcqFopnXjP0ZXAZgw==\n", "SoQEBHrrBDU=\n"), StringFog.decrypt("0dJ34VA5Ot/V3HeqbDM7mQ==\n", "sr0azzNQUvE=\n"), StringFog.decrypt("ReQUob0YmTZF+gChqRuAPEL3EOQ=\n", "KpZzj8567Vk=\n"), StringFog.decrypt("hkUB+LN2vWCBBBy9sw==\n", "5Sps1tQD3BI=\n")};

    public C0384(Context context) {
        this.f1128 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1129
    public final String getName() {
        return StringFog.decrypt("LRZGT6bnzfgtFkR1t+nN+y0K\n", "SHgwJtSIo5U=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1129
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0350 mo221() {
        ArrayList arrayList;
        ArrayList<String> arrayList2;
        String decrypt;
        ArrayList arrayList3 = new ArrayList();
        ArrayList m222 = m222(f1127);
        if (!m222.isEmpty()) {
            arrayList3.add(40);
        }
        ArrayList m2222 = m222(f1126);
        if (!m2222.isEmpty()) {
            arrayList3.add(41);
        }
        ArrayList m2223 = m222(f1125);
        if (!m2223.isEmpty()) {
            arrayList3.add(42);
        }
        try {
            List<ApplicationInfo> installedApplications = this.f1128.getPackageManager().getInstalledApplications(128);
            arrayList = new ArrayList();
            for (ApplicationInfo applicationInfo : installedApplications) {
                if (applicationInfo.packageName.toLowerCase().contains(StringFog.decrypt("Dztc\n", "eUsyn8wqLB0=\n"))) {
                    arrayList.add(applicationInfo.packageName);
                }
            }
        } catch (Throwable unused) {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            arrayList3.add(33);
        }
        try {
            ActivityManager activityManager = (ActivityManager) this.f1128.getSystemService(StringFog.decrypt("FOLwEV0B0A8=\n", "dYGEeCtopHY=\n"));
            if (activityManager == null) {
                arrayList2 = new ArrayList();
            } else {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    arrayList2 = new ArrayList();
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (it.hasNext()) {
                        String str = it.next().processName;
                        if (m220(str)) {
                            arrayList4.add(str);
                        }
                    }
                    arrayList2 = arrayList4;
                }
            }
        } catch (Exception unused2) {
            arrayList2 = new ArrayList();
        }
        for (String str2 : arrayList2) {
            if (!m222.contains(str2) && !m2222.contains(str2) && !m2223.contains(str2)) {
                arrayList3.add(43);
                break;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringFog.decrypt("AelmSGSszB8d6A==\n", "cZsJMB34o3A=\n"), new JSONArray((Collection) m222));
            jSONObject.put(StringFog.decrypt("HbpBO3Kz5Nw7sF0yYA==\n", "b98yXhPBh7Q=\n"), new JSONArray((Collection) m2222));
            jSONObject.put(StringFog.decrypt("zwr/Veau+kPAEQ==\n", "rGKaNJL6lSw=\n"), new JSONArray((Collection) m2223));
            jSONObject.put(StringFog.decrypt("sDcmbqIovw==\n", "xkdIL9JYzMQ=\n"), new JSONArray((Collection) arrayList));
            decrypt = jSONObject.toString();
        } catch (Exception unused3) {
            decrypt = StringFog.decrypt("SFI=\n", "My8Aa+eKV+Q=\n");
        }
        return new C0350(arrayList3.isEmpty(), arrayList3, decrypt, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m222(String[] strArr) {
        PackageManager packageManager = this.f1128.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            try {
                packageManager.getPackageInfo(str, 0);
                arrayList.add(str);
            } catch (PackageManager.NameNotFoundException | SecurityException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m220(String str) {
        String lowerCase = str.toLowerCase();
        for (String str2 : f1127) {
            if (lowerCase.contains(str2.toLowerCase())) {
                return true;
            }
        }
        for (String str3 : f1126) {
            if (lowerCase.contains(str3.toLowerCase())) {
                return true;
            }
        }
        for (String str4 : f1125) {
            if (lowerCase.contains(str4.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
