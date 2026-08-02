package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class w4 implements bjb, Serializable {
    public final void a(int i) {
        m66 m66Var = (m66) this;
        ili iliVar = new ili();
        System.currentTimeMillis();
        iliVar.a = i;
        iliVar.b = m66Var.b;
        Thread.currentThread().getName();
        m66Var.c.add(iliVar);
    }

    @Override // defpackage.bjb
    public final void j(Throwable th) {
        a(4);
    }

    @Override // defpackage.bjb
    public final void l(String str) {
        a(5);
    }

    public Object readResolve() throws ObjectStreamException {
        return ejb.b(((m66) this).a);
    }
}
