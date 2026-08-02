package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class p7 {
    private final com.applovin.impl.sdk.l a;
    private String b;
    private final String c = a(b5.l);
    private final String d = a(b5.m);
    private String e = (String) c5.a(b5.n, (Object) null, com.applovin.impl.sdk.l.p());
    private String f = (String) c5.a(b5.o, (Object) null, com.applovin.impl.sdk.l.p());

    public p7(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.a.a(z4.Q3)).booleanValue()) {
            this.a.c(b5.k);
        }
        String str = (String) this.a.a(b5.k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    private String a(b5 b5Var) {
        String str = (String) c5.a(b5Var, (Object) null, com.applovin.impl.sdk.l.p());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        c5.b(b5Var, lowerCase, com.applovin.impl.sdk.l.p());
        return lowerCase;
    }

    public void b(String str) {
        this.e = str;
        c5.b(b5.n, str, com.applovin.impl.sdk.l.p());
    }

    public void c(String str) {
        this.f = str;
        c5.b(b5.o, str, com.applovin.impl.sdk.l.p());
    }

    public void a(String str) {
        if (((Boolean) this.a.a(z4.Q3)).booleanValue()) {
            this.a.b(b5.k, str);
        }
        this.b = str;
        this.a.u().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.l lVar) {
        b5 b5Var = b5.p;
        String str = (String) lVar.a(b5Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        lVar.b(b5Var, valueOf);
        return valueOf;
    }
}
