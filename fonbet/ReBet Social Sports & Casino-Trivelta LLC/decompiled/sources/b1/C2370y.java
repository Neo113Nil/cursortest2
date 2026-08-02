package b1;

import e1.Z;
import java.util.Objects;

/* renamed from: b1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2370y {

    /* renamed from: c, reason: collision with root package name */
    public static final String f24643c = Z.K0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f24644d = Z.K0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f24645a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24646b;

    public C2370y(String str, String str2) {
        this.f24645a = Z.d1(str);
        this.f24646b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2370y c2370y = (C2370y) obj;
            if (Objects.equals(this.f24645a, c2370y.f24645a) && Objects.equals(this.f24646b, c2370y.f24646b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f24646b.hashCode() * 31;
        String str = this.f24645a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
