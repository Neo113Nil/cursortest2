package defpackage;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e3p extends n79 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        h3p h3pVar = (h3p) this.b;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        h3pVar.getClass();
        int a = h3pVar.a(bea.T(key), key);
        return a != -1 && Objects.equals(h3pVar.a[a], value);
    }

    @Override // defpackage.n79
    public final /* bridge */ /* synthetic */ Object d(int i) {
        return new a3p((h3p) this.b, i, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        h3p h3pVar = (h3p) this.b;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int T = bea.T(key);
        int a = h3pVar.a(T, key);
        if (a == -1 || !Objects.equals(h3pVar.a[a], value)) {
            return false;
        }
        h3pVar.j(a, bea.T(h3pVar.a[a]), T);
        return true;
    }
}
