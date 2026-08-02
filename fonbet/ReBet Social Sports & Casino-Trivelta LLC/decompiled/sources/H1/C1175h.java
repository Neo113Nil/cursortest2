package H1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: H1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175h {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4436a = new LinkedHashMap();

    public void a(C1174g c1174g) {
        long[] jArr = c1174g.timesUs;
        if (jArr.length <= 0 || this.f4436a.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.f4436a.put(Long.valueOf(c1174g.timesUs[0]), c1174g);
    }

    public C1174g b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C1174g c1174g : this.f4436a.values()) {
            arrayList.add(c1174g.sizes);
            arrayList2.add(c1174g.offsets);
            arrayList3.add(c1174g.durationsUs);
            arrayList4.add(c1174g.timesUs);
        }
        return new C1174g(com.google.common.primitives.f.f((int[][]) arrayList.toArray(new int[arrayList.size()][])), com.google.common.primitives.h.b((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), com.google.common.primitives.h.b((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), com.google.common.primitives.h.b((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int c() {
        return this.f4436a.size();
    }
}
