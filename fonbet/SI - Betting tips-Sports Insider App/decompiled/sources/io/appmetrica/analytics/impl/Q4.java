package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Q4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12770a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12771b;

    public Q4(String str, String str2) {
        this.f12770a = str;
        this.f12771b = str2;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f12771b);
    }

    public final String b() {
        return this.f12771b;
    }

    public final String c() {
        return this.f12770a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f12770a + "_" + ApiKeyUtils.createPartialApiKey(this.f12771b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Q4 q42 = (Q4) obj;
            String str = this.f12770a;
            if (str == null ? q42.f12770a != null : !str.equals(q42.f12770a)) {
                return false;
            }
            String str2 = this.f12771b;
            String str3 = q42.f12771b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12770a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12771b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f12770a + "_" + this.f12771b;
    }
}
