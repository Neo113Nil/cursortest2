package oi;

import java.io.Serializable;
import li.AbstractC5469c;

/* loaded from: classes5.dex */
public abstract class K extends q implements Comparable, Serializable {
    /* renamed from: A */
    public abstract int compareTo(K k10);

    /* renamed from: B */
    public abstract H s();

    public final M C(Object obj) {
        return s().K(obj);
    }

    public K D(long j10, Object obj) {
        return E(AbstractC5469c.k(j10), obj);
    }

    public K E(long j10, Object obj) {
        if (j10 == 0) {
            return (K) t();
        }
        try {
            return (K) C(obj).b(t(), j10);
        } catch (IllegalArgumentException e10) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e10);
            throw arithmeticException;
        }
    }

    public long F(K k10, Object obj) {
        return C(obj).a(t(), k10);
    }
}
