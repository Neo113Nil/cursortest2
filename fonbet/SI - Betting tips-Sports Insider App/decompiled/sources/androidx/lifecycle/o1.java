package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2228a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f2228a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((k1) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
