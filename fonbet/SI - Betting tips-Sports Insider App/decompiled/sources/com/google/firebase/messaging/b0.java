package com.google.firebase.messaging;

import androidx.appcompat.widget.c1;
import io.sentry.android.core.w0;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f6095d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f6096a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6097b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6098c;

    public b0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            w0.m("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f6095d.matcher(str3).matches()) {
            throw new IllegalArgumentException(c1.n("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f6096a = str3;
        this.f6097b = str;
        this.f6098c = r4.k.m(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f6096a.equals(b0Var.f6096a) && this.f6097b.equals(b0Var.f6097b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6097b, this.f6096a});
    }
}
