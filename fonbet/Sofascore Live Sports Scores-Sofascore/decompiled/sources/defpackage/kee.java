package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kee extends x6 {
    public final /* synthetic */ int a;
    public final gee b;

    public /* synthetic */ kee(int i, gee geeVar) {
        this.a = i;
        this.b = geeVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        gee geeVar = this.b;
        switch (i) {
            case 0:
                geeVar.clear();
                break;
            default:
                geeVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    gee geeVar = this.b;
                    Object obj2 = geeVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && geeVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // defpackage.x6
    public final int d() {
        int i = this.a;
        gee geeVar = this.b;
        switch (i) {
        }
        return geeVar.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        gee geeVar = this.b;
        switch (i) {
            case 0:
                return new lee(geeVar);
            default:
                w0k[] w0kVarArr = new w0k[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    w0kVarArr[i2] = new y0k(1);
                }
                return new nee(geeVar, w0kVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                gee geeVar = this.b;
                if (!geeVar.containsKey(obj)) {
                    return false;
                }
                geeVar.remove(obj);
                return true;
        }
    }
}
