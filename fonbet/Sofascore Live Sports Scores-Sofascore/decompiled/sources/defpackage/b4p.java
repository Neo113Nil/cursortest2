package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class b4p extends c4p {
    @Override // defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = w().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // defpackage.c4p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return qea.M(w().entrySet());
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return w().l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return w().e.size();
    }

    @Override // defpackage.c4p
    public final boolean t() {
        return false;
    }

    public abstract f4p w();
}
