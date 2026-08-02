package com.huawei.hms.health;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.unity3d.ads.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class aaca {
    private static int aab = -1;
    private static final aaba[] aaba = {new aaba(0, "handset", false, BuildConfig.FLAVOR, null, null), new aaba(1, "pad", false, "tablet", null == true ? 1 : 0, null), new aaba(2, "watch", true, "watch", "watch", null), new aaba(3, "kidwatch", false, "kidwatch", null == true ? 1 : 0, null), new aaba(4, "tv", true, "tv", "television", null), new aaba(5, "mobiletv", false, "mobiletv", null == true ? 1 : 0, null), new aaba(6, "glass", false, null == true ? 1 : 0, null == true ? 1 : 0, null), new aaba(7, "earphone", false, null == true ? 1 : 0, null == true ? 1 : 0, null), new aaba(8, "car", false, "car", "automotive", null)};
    private static final List<Integer> aabb = Arrays.asList(0, 1, 2);

    public static final class aaba {
        private int aab;
        private String aaba;
        private boolean aabb;
        private String aabc;
        private String aabd;

        public /* synthetic */ aaba(int i, String str, boolean z, String str2, String str3, aab aabVar) {
            this.aab = i;
            this.aaba = str;
            this.aabb = z;
            this.aabc = str2;
            this.aabd = str3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r7 != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
    
        if (r9 != 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int aab(Context context) {
        int i;
        int i2;
        String str = "";
        if (aab != -1) {
            StringBuilder aab2 = com.huawei.hms.health.aab.aab("get deviceType from cache: ");
            aab2.append(aab);
            aabz.aabb("DeviceTypeTool", aab2.toString());
        } else {
            if (context != null) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    aabz.aab("DeviceTypeTool", "packageManager is null.");
                    i = -1;
                } else {
                    FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
                    int length = systemAvailableFeatures.length;
                    i = -1;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        FeatureInfo featureInfo = systemAvailableFeatures[i3];
                        String str2 = featureInfo.name;
                        if (!TextUtils.isEmpty(str2) && str2.startsWith("com.huawei.software.features.")) {
                            String substring = str2.substring(29);
                            for (aaba aabaVar : aaba) {
                                if (substring.equals(aabaVar.aaba)) {
                                    i = aabaVar.aab;
                                    if (!aabaVar.aabb) {
                                        break;
                                    }
                                }
                            }
                            if (i != -1) {
                                StringBuilder aab3 = com.huawei.hms.health.aab.aab("Huawei Feature is found: ");
                                aab3.append(featureInfo.name);
                                aabz.aabb("DeviceTypeTool", aab3.toString());
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i == -1) {
                        i = -1;
                    }
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        Object invoke = cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, "ro.build.characteristics", "");
                        if (invoke instanceof String) {
                            Objects.toString(invoke);
                            str = (String) invoke;
                        }
                    } catch (Exception unused) {
                        aabz.aaba("DeviceTypeTool", "An exception occurred while reading SystemProperties: ro.build.characteristics");
                    }
                    if (TextUtils.isEmpty(str)) {
                        i2 = -1;
                    } else {
                        List asList = Arrays.asList(str.split(StringUtils.COMMA, 10));
                        Objects.toString(asList);
                        String str3 = null;
                        i2 = -1;
                        for (aaba aabaVar2 : aaba) {
                            if (asList.contains(aabaVar2.aabc)) {
                                i2 = aabaVar2.aab;
                                str3 = aabaVar2.aabc;
                                if (!aabaVar2.aabb) {
                                    break;
                                }
                            }
                        }
                        if (i2 != -1) {
                            aabz.aabb("DeviceTypeTool", "System property is found: " + str3);
                        }
                    }
                    if (i2 != -1) {
                        i = i2;
                    }
                    int length2 = systemAvailableFeatures.length;
                    int i4 = -1;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            break;
                        }
                        FeatureInfo featureInfo2 = systemAvailableFeatures[i5];
                        String str4 = featureInfo2.name;
                        if (!TextUtils.isEmpty(str4) && str4.startsWith("android.hardware.type.")) {
                            String substring2 = str4.substring(22);
                            aaba[] aabaVarArr = aaba;
                            int length3 = aabaVarArr.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length3) {
                                    break;
                                }
                                aaba aabaVar3 = aabaVarArr[i6];
                                if (substring2.equals(aabaVar3.aabd)) {
                                    i4 = aabaVar3.aab;
                                    break;
                                }
                                i6++;
                            }
                            if (i4 != -1) {
                                StringBuilder aab4 = com.huawei.hms.health.aab.aab("Android Feature is found: ");
                                aab4.append(featureInfo2.name);
                                aabz.aabb("DeviceTypeTool", aab4.toString());
                                break;
                            }
                        }
                        i5++;
                    }
                    if (i4 != -1) {
                        i = i4;
                    }
                }
                if (i != -1) {
                    aab = i;
                }
                StringBuilder aab5 = com.huawei.hms.health.aab.aab("Final DeviceType: ");
                aab5.append(aab);
                aabz.aabb("DeviceTypeTool", aab5.toString());
                return i;
            }
            aabz.aab("DeviceTypeTool", "context is null.");
        }
        return aab;
    }

    public static boolean aaba(Context context) {
        int aab2 = aab(context);
        return aabb.contains(Integer.valueOf(aab2)) || aab2 == -1;
    }

    public static int aabb(Context context) {
        return aab(context);
    }
}
