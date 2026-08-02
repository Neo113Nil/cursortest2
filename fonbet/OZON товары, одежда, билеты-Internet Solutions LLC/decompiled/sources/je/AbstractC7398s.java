package je;

import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;

/* renamed from: je.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7398s implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private int f69927a;

    protected abstract boolean b(@NotNull InterfaceC9842h interfaceC9842h);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s0) && obj.hashCode() == hashCode()) {
            s0 s0Var = (s0) obj;
            if (s0Var.getParameters().size() == getParameters().size()) {
                InterfaceC9842h p11 = p();
                InterfaceC9842h p12 = s0Var.p();
                if (p12 == null || le.l.k(p11) || Vd.i.y(p11) || le.l.k(p12) || Vd.i.y(p12)) {
                    return false;
                }
                return b(p12);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f69927a;
        if (i11 != 0) {
            return i11;
        }
        InterfaceC9842h p11 = p();
        int identityHashCode = (le.l.k(p11) || Vd.i.y(p11)) ? System.identityHashCode(this) : Vd.i.k(p11).hashCode();
        this.f69927a = identityHashCode;
        return identityHashCode;
    }
}
