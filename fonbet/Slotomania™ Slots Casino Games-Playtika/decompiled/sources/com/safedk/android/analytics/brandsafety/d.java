package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;

/* loaded from: classes4.dex */
public class d {
    private static final String j = "AdInfoKey";
    String a;
    String b;
    String c;
    String d;
    String e;
    BrandSafetyUtils.AdType f;
    String g = null;
    String h = null;
    boolean i = false;

    public d(String str, String str2, String str3, String str4, String str5, BrandSafetyUtils.AdType adType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = adType;
    }

    private boolean a(BrandSafetyUtils.AdType adType) {
        return (adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC) ? false : true;
    }

    public boolean equals(Object o) {
        Logger.d(j, "equals started with this: ", this, " and that: ", o);
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        d dVar = (d) o;
        boolean equals = this.a.equals(dVar.a);
        String str = this.b;
        boolean z = str != null && str.equals(dVar.b);
        boolean equals2 = this.d.equals(dVar.d);
        String str2 = this.e;
        boolean z2 = equals && equals2 && ((str2 != null && str2.equals(dVar.e)) || (this.e == null && dVar.e == null));
        String str3 = this.c;
        if (str3 != null) {
            z2 &= str3.equals(dVar.c);
            String a = CreativeInfoManager.a(this.d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
            if (a != null && a.contains(this.e) && !a(this.f)) {
                Logger.d(j, "not using placement id - equals result is: ", Boolean.valueOf(z2));
                return z2;
            }
        }
        return z2 && z;
    }

    public int hashCode() {
        String str;
        int hashCode = this.a.hashCode() * this.d.hashCode();
        String a = CreativeInfoManager.a(this.d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
        if (a(this.f) || (str = this.e) == null || a == null || !a.contains(str)) {
            hashCode *= this.b.hashCode();
        }
        String str2 = this.c;
        if (str2 != null) {
            return hashCode * str2.hashCode();
        }
        return hashCode;
    }

    public String toString() {
        return "AdInfoKey{adUnitId=" + this.a + ", placementId=" + this.b + ", eventId=" + com.safedk.android.utils.n.b((Object) this.c) + ", sdk=" + this.d + ", maxNetwork=" + com.safedk.android.utils.n.b((Object) this.e) + "}";
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("_");
        String str2 = this.b;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("_");
        String str3 = this.c;
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append("_");
        String str4 = this.d;
        sb.append(str4 != null ? str4 : "");
        return sb.toString();
    }

    public boolean a(d dVar, CreativeInfo creativeInfo) {
        if (dVar.equals(this)) {
            if (TextUtils.isEmpty(this.b)) {
                creativeInfo.j(dVar.b);
                this.b = dVar.b;
                return true;
            }
            return true;
        }
        return false;
    }
}
