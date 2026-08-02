package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;

/* loaded from: classes4.dex */
public class h {
    private static final String e = "ClickUrlCandidate";
    public long a;
    public String b;
    public String c;
    public String d;

    public h(long j, String str, String str2, String str3) {
        this.a = 0L;
        this.d = null;
        Logger.d(e, "click url candidate, currentTime=", Long.valueOf(j), ", clickUrl=", str, ", ");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ClickUrlCandidate{ ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        if (this.d != null) {
            str = ", tag :" + this.d;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(" }");
        return sb.toString();
    }
}
