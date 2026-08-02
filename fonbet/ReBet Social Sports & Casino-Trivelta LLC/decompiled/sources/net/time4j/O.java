package net.time4j;

import java.util.Comparator;
import oi.InterfaceC5903D;
import oi.L;

/* loaded from: classes5.dex */
public class O implements InterfaceC5903D, Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57648a;

    public O(boolean z10) {
        this.f57648a = z10;
    }

    public static Comparator b() {
        return new O(false);
    }

    public static int d(oi.w wVar, oi.w wVar2) {
        int compare = Double.compare(wVar2.getLength(), wVar.getLength());
        if (compare != 0 || wVar.equals(wVar2)) {
            return compare;
        }
        throw new IllegalArgumentException("Mixing different units of same length not allowed.");
    }

    public static O h() {
        return new O(false);
    }

    public static O i() {
        return new O(false);
    }

    public static O n() {
        return new O(true);
    }

    @Override // java.util.Comparator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(L.a aVar, L.a aVar2) {
        return d((oi.w) aVar.b(), (oi.w) aVar2.b());
    }
}
