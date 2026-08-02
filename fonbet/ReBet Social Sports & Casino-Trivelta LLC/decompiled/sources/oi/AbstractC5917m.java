package oi;

import li.AbstractC5469c;

/* renamed from: oi.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5917m extends K implements InterfaceC5911g {
    public int G(InterfaceC5911g interfaceC5911g) {
        long b10 = b();
        long b11 = interfaceC5911g.b();
        if (b10 < b11) {
            return -1;
        }
        return b10 == b11 ? 0 : 1;
    }

    @Override // java.lang.Comparable
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC5917m abstractC5917m) {
        if (s().r() == abstractC5917m.s().r()) {
            return G(abstractC5917m);
        }
        throw new ClassCastException("Cannot compare different types of dates, use instance of EpochDays as comparator instead.");
    }

    public final InterfaceC5915k I() {
        return s().q();
    }

    public boolean J(InterfaceC5911g interfaceC5911g) {
        return G(interfaceC5911g) > 0;
    }

    public boolean K(InterfaceC5911g interfaceC5911g) {
        return G(interfaceC5911g) < 0;
    }

    public AbstractC5917m L(C5912h c5912h) {
        long f10 = AbstractC5469c.f(b(), c5912h.b());
        try {
            return (AbstractC5917m) I().b(f10);
        } catch (IllegalArgumentException e10) {
            ArithmeticException arithmeticException = new ArithmeticException("Out of range: " + f10);
            arithmeticException.initCause(e10);
            throw arithmeticException;
        }
    }

    public final Object M(InterfaceC5915k interfaceC5915k, String str) {
        long b10 = b();
        if (interfaceC5915k.d() <= b10 && interfaceC5915k.a() >= b10) {
            return interfaceC5915k.b(b10);
        }
        throw new ArithmeticException("Cannot transform <" + b10 + "> to: " + str);
    }

    public AbstractC5917m N(Class cls) {
        String name = cls.getName();
        x z10 = x.z(cls);
        if (z10 != null) {
            return (AbstractC5917m) M(z10.q(), name);
        }
        throw new IllegalArgumentException("Cannot find any chronology for given target type: " + name);
    }

    public long b() {
        return I().c(t());
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
