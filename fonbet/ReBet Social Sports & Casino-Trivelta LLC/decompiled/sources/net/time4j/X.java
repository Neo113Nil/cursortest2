package net.time4j;

import java.io.Serializable;
import oi.AbstractC5910f;

/* loaded from: classes5.dex */
public final class X extends AbstractC5910f implements InterfaceC5727u, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final X f57677a = new X();
    private static final long serialVersionUID = -4981215347844372171L;

    private Object readResolve() {
        return f57677a;
    }

    @Override // net.time4j.InterfaceC5729w
    public char a() {
        return 'Y';
    }

    @Override // oi.w
    public boolean b() {
        return true;
    }

    @Override // oi.AbstractC5910f
    public oi.M c(oi.x xVar) {
        if (xVar.x(F.f57534l)) {
            return b0.J();
        }
        return null;
    }

    @Override // oi.w
    public double getLength() {
        return EnumC5706f.f57794d.getLength();
    }

    public String toString() {
        return "WEEK_BASED_YEARS";
    }
}
