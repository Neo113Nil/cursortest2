package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes4.dex */
public class fm<T> extends ef {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final T f2095;

    public fm(T t) {
        this.f2095 = t;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        return new ea(this.f2095);
    }

    public String toString() {
        return new StringBuilder().append(this.f2095).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t = this.f2095;
            T t2 = ((fm) obj).f2095;
            if (t != null) {
                return t.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.f2095;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }
}
