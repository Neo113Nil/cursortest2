package com.safedk.android.analytics.brandsafety;

/* loaded from: classes4.dex */
public class w {
    public Long a;
    public Long b;
    public String c;
    public String d;

    public w(Long l, Long l2, String str, String str2) {
        this.a = l;
        this.b = l2;
        this.c = str;
        this.d = str2;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("TouchEventDetails{ ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
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
