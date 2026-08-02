package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j79 extends n79 {
    public final /* synthetic */ int c;
    public final /* synthetic */ o79 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j79(o79 o79Var, int i) {
        super(o79Var, 0);
        this.c = i;
        this.d = o79Var;
    }

    @Override // defpackage.n79
    public final Object c(int i) {
        int i2 = this.c;
        o79 o79Var = this.d;
        switch (i2) {
            case 0:
                return new i79(o79Var, i, 0);
            case 1:
                return o79Var.a[i];
            default:
                return o79Var.b[i];
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.c;
        o79 o79Var = this.d;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    int i2 = o79Var.i(tol.B(key), key);
                    if (i2 != -1 && sha.r(value, o79Var.b[i2])) {
                        return true;
                    }
                }
                return false;
            case 1:
                return o79Var.containsKey(obj);
            default:
                return o79Var.containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.c;
        o79 o79Var = this.d;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    int B = tol.B(key);
                    int i2 = o79Var.i(B, key);
                    if (i2 != -1 && sha.r(value, o79Var.b[i2])) {
                        o79Var.q(i2, B);
                        break;
                    }
                }
                break;
            case 1:
                int B2 = tol.B(obj);
                int i3 = o79Var.i(B2, obj);
                if (i3 != -1) {
                    o79Var.q(i3, B2);
                    break;
                }
                break;
            default:
                int B3 = tol.B(obj);
                int j = o79Var.j(B3, obj);
                if (j != -1) {
                    o79Var.r(j, B3);
                    break;
                }
                break;
        }
        return true;
    }
}
