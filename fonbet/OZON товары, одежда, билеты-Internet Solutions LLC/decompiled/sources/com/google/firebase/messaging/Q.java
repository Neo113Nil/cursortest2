package com.google.firebase.messaging;

import B0.A0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class Q {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f59641d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f59642a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59643b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59644c;

    private Q(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f59641d.matcher(str3).matches()) {
            throw new IllegalArgumentException(A0.b("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f59642a = str3;
        this.f59643b = str;
        this.f59644c = G.g.c(str, "!", str2);
    }

    static Q a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new Q(split[0], split[1]);
    }

    public final String b() {
        return this.f59643b;
    }

    public final String c() {
        return this.f59642a;
    }

    public final String d() {
        return this.f59644c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q11 = (Q) obj;
        return this.f59642a.equals(q11.f59642a) && this.f59643b.equals(q11.f59643b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f59643b, this.f59642a);
    }
}
