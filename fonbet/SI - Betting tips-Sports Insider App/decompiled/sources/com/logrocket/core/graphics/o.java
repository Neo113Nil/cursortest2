package com.logrocket.core.graphics;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f6582a;

    /* renamed from: b, reason: collision with root package name */
    public String f6583b;

    /* renamed from: c, reason: collision with root package name */
    public String f6584c;

    public o(View view) {
        this.f6582a = view.getClass().getSimpleName();
        this.f6583b = com.google.android.play.core.appupdate.b.s(view);
        this.f6584c = view.getTag() instanceof String ? (String) view.getTag() : "";
    }

    public String a() {
        return this.f6583b;
    }

    public final String b() {
        String str;
        String str2 = "";
        if (this.f6584c.isEmpty()) {
            str = "";
        } else {
            str = "." + this.f6584c;
        }
        if (!this.f6583b.isEmpty()) {
            str2 = "#" + this.f6583b;
        }
        return d9.e.m(new StringBuilder(), this.f6582a, str, str2);
    }

    public String c() {
        return this.f6584c;
    }

    public o(String str) {
        this.f6582a = str;
        this.f6584c = "";
        this.f6583b = "";
    }
}
