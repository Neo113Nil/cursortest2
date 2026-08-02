package j3;

import com.google.common.collect.AbstractC5880y;
import java.util.Collections;
import java.util.List;

/* renamed from: j3.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7254J {

    /* renamed from: a, reason: collision with root package name */
    public final C7253I f68967a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5880y<Integer> f68968b;

    static {
        m3.N.L(0);
        m3.N.L(1);
    }

    public C7254J(C7253I c7253i, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c7253i.f68962a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f68967a = c7253i;
        this.f68968b = AbstractC5880y.n(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7254J.class == obj.getClass()) {
            C7254J c7254j = (C7254J) obj;
            if (this.f68967a.equals(c7254j.f68967a) && this.f68968b.equals(c7254j.f68968b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f68968b.hashCode() * 31) + this.f68967a.hashCode();
    }
}
