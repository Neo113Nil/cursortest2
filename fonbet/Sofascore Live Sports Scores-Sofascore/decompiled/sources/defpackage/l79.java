package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l79 extends n79 {
    @Override // defpackage.n79
    public final Object c(int i) {
        return new i79((o79) this.b, i, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        o79 o79Var = (o79) this.b;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int j = o79Var.j(tol.B(key), key);
        return j != -1 && sha.r(o79Var.a[j], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        o79 o79Var = (o79) this.b;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int B = tol.B(key);
        int j = o79Var.j(B, key);
        if (j == -1 || !sha.r(o79Var.a[j], value)) {
            return false;
        }
        o79Var.r(j, B);
        return true;
    }
}
