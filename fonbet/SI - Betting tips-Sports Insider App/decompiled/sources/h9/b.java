package h9;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10426a;

    /* renamed from: b, reason: collision with root package name */
    public final c f10427b;

    public b(Set set, c cVar) {
        this.f10426a = b(set);
        this.f10427b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f10424a);
            sb2.append('/');
            sb2.append(aVar.f10425b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f10426a;
        c cVar = this.f10427b;
        synchronized (((HashSet) cVar.f10430b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) cVar.f10430b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.t());
    }
}
