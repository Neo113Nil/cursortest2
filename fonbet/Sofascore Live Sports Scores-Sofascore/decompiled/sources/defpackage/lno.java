package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lno {
    public final Class a;
    public final Class b;

    public /* synthetic */ lno(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lno)) {
            return false;
        }
        lno lnoVar = (lno) obj;
        return lnoVar.a.equals(this.a) && lnoVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String simpleName2 = this.b.getSimpleName();
        return wt3.m(simpleName, " with primitive type: ", new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName2);
    }
}
