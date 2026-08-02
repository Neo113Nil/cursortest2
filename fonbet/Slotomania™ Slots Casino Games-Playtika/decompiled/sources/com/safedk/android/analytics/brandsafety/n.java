package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public class n {
    public Long a = Long.valueOf(System.currentTimeMillis());
    public Long b = Long.valueOf(SystemClock.elapsedRealtime());
    public String c;
    public String d;
    public String e;
    public String f;
    public n g;

    public n(String str, String str2, String str3, String str4, n nVar) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = nVar;
    }

    public String toString() {
        return "IntentDetails{ " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + " }";
    }
}
