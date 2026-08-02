package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mh3 implements jkk {
    public final Function1 a;

    public mh3(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.jkk
    public final Object a(aee aeeVar) {
        return this.a.invoke(aeeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh3) && this.a.equals(((mh3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
