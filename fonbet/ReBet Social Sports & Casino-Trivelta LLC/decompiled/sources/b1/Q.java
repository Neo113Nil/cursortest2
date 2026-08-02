package b1;

import com.google.common.collect.AbstractC3445z;
import e1.Z;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: c, reason: collision with root package name */
    public static final String f24399c = Z.K0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f24400d = Z.K0(1);

    /* renamed from: a, reason: collision with root package name */
    public final P f24401a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3445z f24402b;

    public Q(P p10, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= p10.f24395a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f24401a = p10;
        this.f24402b = AbstractC3445z.o(list);
    }

    public int a() {
        return this.f24401a.f24397c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q.class == obj.getClass()) {
            Q q10 = (Q) obj;
            if (this.f24401a.equals(q10.f24401a) && this.f24402b.equals(q10.f24402b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f24401a.hashCode() + (this.f24402b.hashCode() * 31);
    }
}
