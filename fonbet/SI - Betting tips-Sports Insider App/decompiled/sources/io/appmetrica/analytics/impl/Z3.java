package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13255a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13256b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13257c;

    public Z3(String str, Integer num, String str2) {
        this.f13255a = str;
        this.f13256b = num;
        this.f13257c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z3.class == obj.getClass()) {
            Z3 z32 = (Z3) obj;
            if (!this.f13255a.equals(z32.f13255a)) {
                return false;
            }
            Integer num = this.f13256b;
            if (num == null ? z32.f13256b != null : !num.equals(z32.f13256b)) {
                return false;
            }
            String str = this.f13257c;
            String str2 = z32.f13257c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13255a.hashCode() * 31;
        Integer num = this.f13256b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f13257c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
