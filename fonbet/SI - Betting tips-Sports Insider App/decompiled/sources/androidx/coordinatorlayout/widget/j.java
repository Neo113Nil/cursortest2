package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import s.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final p0.d f1249a = new p0.d(10);

    /* renamed from: b, reason: collision with root package name */
    public final n f1250b = new n(0);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1251c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f1252d = new HashSet();

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f1250b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                a(arrayList2.get(i5), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
