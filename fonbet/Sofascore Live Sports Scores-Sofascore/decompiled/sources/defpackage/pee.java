package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pee extends t7 implements xv9 {
    public final /* synthetic */ int b;
    public final cee c;

    public /* synthetic */ pee(cee ceeVar, int i) {
        this.b = i;
        this.c = ceeVar;
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.b;
        cee ceeVar = this.c;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = ceeVar.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && ceeVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return ceeVar.containsKey(obj);
        }
    }

    @Override // defpackage.v2
    public final int getSize() {
        int i = this.b;
        cee ceeVar = this.c;
        switch (i) {
        }
        return ceeVar.e;
    }

    @Override // defpackage.t7, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        cee ceeVar = this.c;
        switch (i) {
            case 0:
                v0k v0kVar = ceeVar.d;
                w0k[] w0kVarArr = new w0k[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    w0kVarArr[i2] = new y0k(0);
                }
                return new ree(v0kVar, w0kVarArr);
            default:
                v0k v0kVar2 = ceeVar.d;
                w0k[] w0kVarArr2 = new w0k[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    w0kVarArr2[i3] = new y0k(1);
                }
                return new ree(v0kVar2, w0kVarArr2);
        }
    }
}
