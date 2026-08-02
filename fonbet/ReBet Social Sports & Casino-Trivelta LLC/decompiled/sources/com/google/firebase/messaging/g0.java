package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3189m;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f37959d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f37960a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37961b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37962c;

    public g0(String str, String str2) {
        this.f37960a = d(str2, str);
        this.f37961b = str;
        this.f37962c = str + "!" + str2;
    }

    public static g0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new g0(split[0], split[1]);
    }

    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f37959d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static g0 f(String str) {
        return new g0("S", str);
    }

    public static g0 g(String str) {
        return new g0("U", str);
    }

    public String b() {
        return this.f37961b;
    }

    public String c() {
        return this.f37960a;
    }

    public String e() {
        return this.f37962c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f37960a.equals(g0Var.f37960a) && this.f37961b.equals(g0Var.f37961b);
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f37961b, this.f37960a);
    }
}
