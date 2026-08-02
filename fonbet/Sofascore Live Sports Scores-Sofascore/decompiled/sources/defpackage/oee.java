package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class oee extends t7 implements wv9 {
    public final /* synthetic */ int b;
    public final bee c;

    public /* synthetic */ oee(bee beeVar, int i) {
        this.b = i;
        this.c = beeVar;
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.b;
        bee beeVar = this.c;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = beeVar.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && beeVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return beeVar.containsKey(obj);
        }
    }

    @Override // defpackage.v2
    public final int getSize() {
        int i = this.b;
        bee beeVar = this.c;
        switch (i) {
        }
        return beeVar.e;
    }

    @Override // defpackage.t7, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        bee beeVar = this.c;
        switch (i) {
            case 0:
                u0k u0kVar = beeVar.d;
                u0kVar.getClass();
                w0k[] w0kVarArr = new w0k[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    w0kVarArr[i2] = new x0k(0);
                }
                return new qee(u0kVar, w0kVarArr);
            default:
                u0k u0kVar2 = beeVar.d;
                u0kVar2.getClass();
                w0k[] w0kVarArr2 = new w0k[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    w0kVarArr2[i3] = new x0k(1);
                }
                return new qee(u0kVar2, w0kVarArr2);
        }
    }
}
