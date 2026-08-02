package com.iab.omid.library.corpmailru.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes13.dex */
public class d {

    @SuppressLint({"StaticFieldLeak"})
    private static d a = new d();
    private Context b;

    private d() {
    }

    public static d a() {
        return a;
    }

    public Context b() {
        return this.b;
    }

    public void a(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
    }
}
