package Ab;

import com.google.android.gms.common.internal.AbstractC3189m;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f420a;

    public b(String str) {
        this.f420a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return AbstractC3189m.b(this.f420a, ((b) obj).f420a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f420a);
    }

    public String toString() {
        return AbstractC3189m.d(this).a("token", this.f420a).toString();
    }
}
