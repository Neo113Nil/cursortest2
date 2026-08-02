package com.applovin.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public class r4 {
    private final String a;
    private final String b;
    private final boolean c;

    r4(String str, String str2, Context context) {
        this.a = str.replace("android.permission.", "");
        this.b = str2;
        this.c = p0.a(str, context);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }
}
