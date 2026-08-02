package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import xsna.jxc0;
import xsna.nwe0;
import xsna.tpk;

/* loaded from: classes13.dex */
public final class Range<C extends Comparable> extends nwe0 implements jxc0<C>, Serializable {
    public static final Range<Comparable> b = new Range<>(tpk.c.b, tpk.a.b);
    private static final long serialVersionUID = 0;
    final tpk<C> lowerBound;
    final tpk<C> upperBound;

    public Range(tpk<C> tpkVar, tpk<C> tpkVar2) {
        this.lowerBound = tpkVar;
        this.upperBound = tpkVar2;
        if (tpkVar.compareTo(tpkVar2) > 0 || tpkVar == tpk.a.b || tpkVar2 == tpk.c.b) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            tpkVar.b(sb2);
            sb2.append("..");
            tpkVar2.c(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static Range a(Long l, Long l2) {
        return new Range(new tpk.d(l), new tpk.b(l2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jxc0
    @Deprecated
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.lowerBound.i(comparable) && !this.upperBound.i(comparable);
    }

    public final C d() {
        return this.upperBound.h();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.upperBound.hashCode() + (this.lowerBound.hashCode() * 31);
    }

    public Object readResolve() {
        Range<Comparable> range = b;
        return equals(range) ? range : this;
    }

    public final String toString() {
        tpk<C> tpkVar = this.lowerBound;
        tpk<C> tpkVar2 = this.upperBound;
        StringBuilder sb = new StringBuilder(16);
        tpkVar.b(sb);
        sb.append("..");
        tpkVar2.c(sb);
        return sb.toString();
    }
}
