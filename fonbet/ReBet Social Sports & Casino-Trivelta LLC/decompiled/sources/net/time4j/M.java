package net.time4j;

import li.InterfaceC5467a;
import oi.InterfaceC5918n;

/* loaded from: classes5.dex */
public enum M implements InterfaceC5918n, oi.v {
    Q1,
    Q2,
    Q3,
    Q4;

    private static final M[] ENUMS = values();

    public static M d(int i10) {
        if (i10 >= 1 && i10 <= 4) {
            return ENUMS[i10 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i10);
    }

    @Override // oi.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public F apply(F f10) {
        return (F) f10.y(F.f57538p, this);
    }

    public int b() {
        return ordinal() + 1;
    }

    @Override // oi.InterfaceC5918n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean test(InterfaceC5467a interfaceC5467a) {
        return b() == ((interfaceC5467a.o() - 1) / 3) + 1;
    }
}
