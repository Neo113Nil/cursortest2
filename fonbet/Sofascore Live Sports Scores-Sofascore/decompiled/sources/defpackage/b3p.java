package defpackage;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b3p extends n79 {
    public final /* synthetic */ int c;
    public final /* synthetic */ h3p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3p(h3p h3pVar, int i) {
        super(h3pVar, 1);
        this.c = i;
        this.d = h3pVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.c;
        h3p h3pVar = this.d;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    int p = h3pVar.p(bea.T(key), key);
                    if (p != -1 && Objects.equals(value, h3pVar.b[p])) {
                        return true;
                    }
                }
                return false;
            case 1:
                return h3pVar.containsKey(obj);
            default:
                return h3pVar.containsValue(obj);
        }
    }

    @Override // defpackage.n79
    public final Object d(int i) {
        int i2 = this.c;
        h3p h3pVar = this.d;
        switch (i2) {
            case 0:
                return new a3p(h3pVar, i, 0);
            case 1:
                return h3pVar.a[i];
            default:
                return h3pVar.b[i];
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.c;
        h3p h3pVar = this.d;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    int T = bea.T(key);
                    int p = h3pVar.p(T, key);
                    if (p != -1 && Objects.equals(value, h3pVar.b[p])) {
                        h3pVar.j(p, T, bea.T(h3pVar.b[p]));
                        break;
                    }
                }
                break;
            case 1:
                int T2 = bea.T(obj);
                int p2 = h3pVar.p(T2, obj);
                if (p2 != -1) {
                    h3pVar.j(p2, T2, bea.T(h3pVar.b[p2]));
                    break;
                }
                break;
            default:
                int T3 = bea.T(obj);
                int a = h3pVar.a(T3, obj);
                if (a != -1) {
                    h3pVar.j(a, bea.T(h3pVar.a[a]), T3);
                    break;
                }
                break;
        }
        return true;
    }
}
