package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭔ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1034 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String[] f3297 = {StringFog.decrypt("TGvTqI/MeKgbesO11Npg\n", "Yxiq2/upFYc=\n"), StringFog.decrypt("w77RA4a6lpyOpMZfgao=\n", "7M2ocPLf+7M=\n"), StringFog.decrypt("HB/+E4591b8=\n", "M2yceuBSpso=\n"), StringFog.decrypt("LwTVDOdwyihzAg==\n", "AHesf5MVpwc=\n"), StringFog.decrypt("t8t8O7F85o760Wtn63zz1beWdj0=\n", "mLgFSMUZi6E=\n"), StringFog.decrypt("VUEjAyhSC+cPQShfK1JLph9XPl0uWAm8VUEv\n", "ejJacFw3Zsg=\n"), StringFog.decrypt("aGzemK2GeI8mb9fEipZlxTVq1I6rzXTQLA==\n", "Rx+n69njFaA=\n"), StringFog.decrypt("/S3Y1TktbPGxKNWOIGBp8P06zA==\n", "0km5oVgCAJ4=\n"), StringFog.decrypt("Q6WxLCDTIWsPoLx3I5UjKx+0\n", "bMHQWEH8TQQ=\n"), StringFog.decrypt("IuCAB4iRIz5u5Y1cmss=\n", "DYThc+m+T1E=\n")};

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f3296 = {StringFog.decrypt("mKjhxqU6ZmuOoeOd5TR7Z4mo5YzlJmA=\n", "+8eM6MtVFQM=\n"), StringFog.decrypt("KQJ9i2itnLg/C3/QKKOBtDgCecEosZr+LwF50WM=\n", "Sm0QpQbC79A=\n"), StringFog.decrypt("s9L/tPZ+QwCwzqOysGxfHrPVoqI=\n", "1qfR154fKm4=\n"), StringFog.decrypt("MLUJ65FVz1w7sw+hj07OTn2pEbWfSM9cNqg=\n", "U9pkxfo6ui8=\n"), StringFog.decrypt("uFShHgQottS/S61CBDnx1a5LqUIFM7rU\n", "2zvMMHBA36Y=\n"), StringFog.decrypt("6SnIAo3P4F3lMcBf2tn5\n", "ikalLPSqjDE=\n"), StringFog.decrypt("C00UPNh0giAHShdl2TWfKw9LCnk=\n", "aCJ5Eqwb8ko=\n"), StringFog.decrypt("baTX/4CbE2t1sZz9nYBYag==\n", "AMH5j+jzPRg=\n"), StringFog.decrypt("HGhWwe8LH28QckiK9kwSZxI=\n", "fwc774RicQg=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f3295 = {StringFog.decrypt("jdqHry0ynw==\n", "6r/pyl9b/L4=\n"), StringFog.decrypt("Y+rgIoK2Fw==\n", "FoSLTO3BefM=\n"), StringFog.decrypt("Fe0ROITOTrsW6Q==\n", "coJ+X+irEcg=\n"), StringFog.decrypt("h0BsSOI39so=\n", "wi0ZJINDmbg=\n"), StringFog.decrypt("BXTSTX6QuD4XXv0fc4y1cjA60FBj2aQmcg==\n", "RBq2PxH53B4=\n"), StringFog.decrypt("WK93+zvJo49Frg==\n", "K8scpFy5y+A=\n"), StringFog.decrypt("+JOJbxabTQ==\n", "jvHmFy6tPco=\n"), StringFog.decrypt("K+swNzMbPe8=\n", "TIRcU1VyToc=\n"), StringFog.decrypt("bWkvW2zD\n", "HwhBOAS2vI0=\n")};

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        if ((r0 == null ? false : r0.toLowerCase().contains(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("CK8V4PFU\n", "fs16mMliXR0=\n").toLowerCase())) != false) goto L65;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1042 m620(Context context) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        String[] strArr = f3297;
        int length = strArr.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (new File(strArr[i]).exists()) {
                arrayList.add(1);
                break;
            }
            i++;
        }
        PackageManager packageManager = context.getPackageManager();
        String[] strArr2 = f3296;
        int length2 = strArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            try {
                packageManager.getPackageInfo(strArr2[i2], 0);
                arrayList.add(2);
                break;
            } catch (Exception unused) {
                i2++;
            }
        }
        String str = Build.TAGS;
        if (str != null && str.contains(StringFog.decrypt("ubSwzEw/uia+\n", "zdHDuGFU318=\n"))) {
            arrayList.add(3);
        }
        try {
            Process exec = Runtime.getRuntime().exec(StringFog.decrypt("VyXQYbY=\n", "OkqlD8I1bfQ=\n"));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        exec.waitFor();
                        break;
                    }
                    if (readLine.contains(StringFog.decrypt("XzteG7JOHQ==\n", "cEgnaMYrcDg=\n")) && readLine.contains(StringFog.decrypt("R2Ms\n", "ZxFbgIt4Bjk=\n"))) {
                        arrayList.add(4);
                        break;
                    }
                } finally {
                    bufferedReader.close();
                }
            }
        } catch (Throwable unused2) {
        }
        String[] strArr3 = {Build.FINGERPRINT, Build.MODEL, Build.MANUFACTURER, Build.BRAND, Build.DEVICE, Build.PRODUCT};
        int i3 = 0;
        loop3: while (true) {
            if (i3 >= 6) {
                break;
            }
            String str2 = strArr3[i3];
            for (String str3 : f3295) {
                if (str2 == null ? false : str2.toLowerCase().contains(str3.toLowerCase())) {
                    arrayList.add(5);
                    break loop3;
                }
            }
            i3++;
        }
        String str4 = Build.HARDWARE;
        if (!(str4 == null ? false : str4.toLowerCase().contains(StringFog.decrypt("qQrgbCG3bQM=\n", "zmWMCEfeHms=\n").toLowerCase()))) {
            if (!(str4 == null ? false : str4.toLowerCase().contains(StringFog.decrypt("PuVktHo1\n", "TIQK1xJA2lE=\n").toLowerCase()))) {
            }
        }
        arrayList.add(6);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4) {
                z = true;
                break;
            }
        }
        z = false;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Integer) it2.next()).intValue();
            if (intValue2 == 5 || intValue2 == 6) {
                z2 = true;
                break;
            }
        }
        return new C1042(z, z2, arrayList);
    }
}
