package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kv9 implements Serializable {
    public final Object[] a;
    public final Object[] b;

    public kv9(lv9 lv9Var) {
        int i = ((awf) lv9Var).f;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        cck it = lv9Var.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i2] = entry.getKey();
            objArr2[i2] = entry.getValue();
            i2++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.a;
        boolean z = objArr instanceof vv9;
        Object[] objArr2 = this.b;
        if (!z) {
            b10 b10Var = new b10(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                b10Var.A(objArr[i], objArr2[i]);
            }
            return b10Var.c(true);
        }
        vv9 vv9Var = (vv9) objArr;
        b10 b10Var2 = new b10(vv9Var.size());
        cck it = vv9Var.iterator();
        cck it2 = ((wu9) objArr2).iterator();
        while (it.hasNext()) {
            b10Var2.A(it.next(), it2.next());
        }
        return b10Var2.c(true);
    }
}
