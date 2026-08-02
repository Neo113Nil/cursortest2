package net.time4j;

import java.io.Serializable;
import net.time4j.EnumC5706f;
import oi.AbstractC5910f;

/* loaded from: classes5.dex */
public final class E extends AbstractC5910f implements InterfaceC5727u, Serializable {
    private static final long serialVersionUID = 1988843503875912054L;
    private final int policy;
    private final EnumC5706f unit;

    public E(EnumC5706f enumC5706f, int i10) {
        this.unit = enumC5706f;
        this.policy = i10;
    }

    @Override // net.time4j.InterfaceC5729w
    public char a() {
        return (char) 0;
    }

    @Override // oi.w
    public boolean b() {
        return true;
    }

    @Override // oi.AbstractC5910f
    public oi.M c(oi.x xVar) {
        if (xVar.x(F.f57534l)) {
            return new EnumC5706f.j(this.unit, this.policy);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            E e10 = (E) obj;
            if (this.unit == e10.unit && this.policy == e10.policy) {
                return true;
            }
        }
        return false;
    }

    @Override // oi.w
    public double getLength() {
        return this.unit.getLength();
    }

    public int hashCode() {
        return (this.unit.hashCode() * 23) + (this.policy * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.unit.a());
        sb2.append('-');
        switch (this.policy) {
            case 1:
                sb2.append("NEXT_VALID_DATE");
                break;
            case 2:
                sb2.append("END_OF_MONTH");
                break;
            case 3:
                sb2.append("CARRY_OVER");
                break;
            case 4:
                sb2.append("UNLESS_INVALID");
                break;
            case 5:
                sb2.append("KEEPING_LAST_DATE");
                break;
            case 6:
                sb2.append("JODA_METRIC");
                break;
            default:
                sb2.append("PREVIOUS_VALID_DATE");
                break;
        }
        return sb2.toString();
    }
}
