package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nv9 extends wu9 {
    public final iv9 b;

    public nv9(iv9 iv9Var) {
        this.b = iv9Var;
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.b.d().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wu9
    /* renamed from: q */
    public final cck iterator() {
        return new mv9(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.f;
    }

    @Override // defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}
