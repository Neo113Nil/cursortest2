package wa;

import ja.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.v;
import u3.c;
import u3.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f25041a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25042b;

    public b(d dVar) {
        ArrayList arrayList;
        this.f25041a = dVar.getStatusCode();
        List<c> mapCategory = dVar.getMapCategory();
        if (mapCategory != null) {
            arrayList = new ArrayList(v.k(mapCategory, 10));
            for (c cVar : mapCategory) {
                arrayList.add(new e(cVar.getId(), cVar.getName(), cVar.getLogo()));
            }
        } else {
            arrayList = null;
        }
        this.f25042b = arrayList;
    }
}
