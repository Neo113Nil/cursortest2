package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* loaded from: classes4.dex */
public class p {
    CreativeInfo a;
    String b;
    String c;
    String d;

    public p(CreativeInfo creativeInfo, String str) {
        this(creativeInfo, str, null, null);
    }

    public p(CreativeInfo creativeInfo, String str, String str2) {
        this(creativeInfo, str, str2, null);
    }

    public p(CreativeInfo creativeInfo, String str, String str2, String str3) {
        this.a = creativeInfo;
        this.b = str;
        this.c = str2 == null ? creativeInfo.Y() : str2;
        this.d = str3;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(" how ? : ");
        sb.append(this.b);
        if (this.c != null) {
            str = "_" + this.c;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", debugInfo : ");
        sb.append(this.d);
        sb.append(", creative info : ");
        sb.append(this.a.aa());
        sb.append(", ci matching object address : ");
        sb.append(this.a.ak());
        return sb.toString();
    }
}
