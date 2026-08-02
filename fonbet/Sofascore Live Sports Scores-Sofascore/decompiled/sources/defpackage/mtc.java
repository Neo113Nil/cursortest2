package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mtc {
    public static final ArrayDeque b = new ArrayDeque(0);
    public Object a;

    public static mtc a(Object obj) {
        mtc mtcVar;
        ArrayDeque arrayDeque = b;
        synchronized (arrayDeque) {
            mtcVar = (mtc) arrayDeque.poll();
        }
        if (mtcVar == null) {
            mtcVar = new mtc();
        }
        mtcVar.a = obj;
        return mtcVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mtc) && this.a.equals(((mtc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
