package net.time4j;

import li.InterfaceC5467a;
import oi.InterfaceC5918n;

/* loaded from: classes5.dex */
public enum B implements InterfaceC5918n, oi.v {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final B[] ENUMS = values();

    public static B d(int i10) {
        if (i10 >= 1 && i10 <= 12) {
            return ENUMS[i10 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i10);
    }

    @Override // oi.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public F apply(F f10) {
        return (F) f10.y(F.f57539q, this);
    }

    public int b() {
        return ordinal() + 1;
    }

    @Override // oi.InterfaceC5918n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean test(InterfaceC5467a interfaceC5467a) {
        return interfaceC5467a.o() == b();
    }
}
