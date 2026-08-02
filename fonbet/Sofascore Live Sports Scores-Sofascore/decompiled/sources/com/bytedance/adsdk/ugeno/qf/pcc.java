package com.bytedance.adsdk.ugeno.qf;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.qf.pcc$pcc, reason: collision with other inner class name */
    public static class C0034pcc {
        public float[] gm;
        public GradientDrawable.Orientation pcc;
        public int[] sf;
    }

    public static boolean gm(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation oo(String str) {
        try {
            int parseInt = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            return parseInt == 90 ? GradientDrawable.Orientation.LEFT_RIGHT : parseInt == 180 ? GradientDrawable.Orientation.TOP_BOTTOM : parseInt == 270 ? GradientDrawable.Orientation.RIGHT_LEFT : parseInt == 135 ? GradientDrawable.Orientation.TL_BR : parseInt == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int pcc(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(U3.i.T)) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i2 = 1; i2 < charArray.length; i2++) {
                    sb.append(charArray[i2]);
                    sb.append(charArray[i2]);
                }
                return Color.parseColor(sb.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            if (split != null && split.length == 4) {
                return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2]));
            }
        }
        return i;
    }

    public static C0034pcc sf(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String substring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(substring)) {
                return null;
            }
            int pcc = pcc(substring, '%');
            int indexOf = substring.indexOf(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            String substring2 = substring.substring(0, indexOf);
            C0034pcc c0034pcc = new C0034pcc();
            c0034pcc.pcc = oo(substring2);
            String substring3 = substring.substring(indexOf + 1);
            int[] iArr = new int[pcc];
            float[] fArr = new float[pcc];
            for (int i = 0; i < pcc; i++) {
                int indexOf2 = substring3.indexOf("%");
                String trim = substring3.substring(0, indexOf2 + 1).trim();
                int indexOf3 = (trim.contains("rgba") ? trim.indexOf(")") : trim.indexOf(" ")) + 1;
                iArr[i] = pcc(trim.substring(0, indexOf3).trim());
                fArr[i] = gm.pcc(trim.substring(indexOf3, trim.indexOf("%")).trim(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 100.0f;
                int i2 = indexOf2 + 2;
                if (substring3.length() <= i2) {
                    break;
                }
                substring3 = substring3.substring(i2);
            }
            if (pcc < 2) {
                return null;
            }
            c0034pcc.sf = iArr;
            c0034pcc.gm = fArr;
            return c0034pcc;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int pcc(String str) {
        return pcc(str, -16777216);
    }

    public static int pcc(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            i2 = 255;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static int pcc(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }
}
