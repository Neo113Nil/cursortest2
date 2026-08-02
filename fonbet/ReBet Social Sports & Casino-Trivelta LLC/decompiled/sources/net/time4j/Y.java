package net.time4j;

import li.AbstractC5468b;
import li.InterfaceC5467a;
import oi.InterfaceC5918n;

/* loaded from: classes5.dex */
public enum Y implements InterfaceC5918n, oi.v {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private static final Y[] ENUMS = values();

    public static Y f(int i10) {
        if (i10 >= 1 && i10 <= 7) {
            return ENUMS[i10 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i10);
    }

    @Override // oi.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public F apply(F f10) {
        return (F) f10.y(F.f57542t, this);
    }

    public int b() {
        return ordinal() + 1;
    }

    public int c(a0 a0Var) {
        return (((ordinal() + 7) - a0Var.f().ordinal()) % 7) + 1;
    }

    public Y d(int i10) {
        return f(((ordinal() + ((i10 % 7) + 7)) % 7) + 1);
    }

    @Override // oi.InterfaceC5918n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean test(InterfaceC5467a interfaceC5467a) {
        return AbstractC5468b.c(interfaceC5467a.n(), interfaceC5467a.o(), interfaceC5467a.p()) == b();
    }
}
