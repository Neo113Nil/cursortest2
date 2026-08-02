package defpackage;

import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f0c implements q4a {
    public final int a;

    public f0c(int i) {
        this.a = i;
        if (i >= 0) {
            return;
        }
        u3a.a("maxLength must be at least zero");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0c) && this.a == ((f0c) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.q4a
    public final void i(b4h b4hVar) {
        KProperty[] kPropertyArr = y3h.a;
        a4h a4hVar = w3h.R;
        KProperty kProperty = y3h.a[29];
        b4hVar.a(a4hVar, Integer.valueOf(this.a));
    }

    @Override // defpackage.q4a
    public final void j(l9j l9jVar) {
        mo2 mo2Var = l9jVar.c;
        if (mo2Var.length() > this.a) {
            int length = mo2Var.length();
            m9j m9jVar = l9jVar.a;
            l9jVar.c(0, length, m9jVar.c.toString());
            l9jVar.f(m9jVar.d);
            l9jVar.a().q();
        }
    }

    public final String toString() {
        return wv8.j(new StringBuilder("InputTransformation.maxLength("), this.a, ')');
    }
}
