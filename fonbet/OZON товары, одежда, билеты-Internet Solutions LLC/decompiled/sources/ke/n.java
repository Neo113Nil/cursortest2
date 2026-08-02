package ke;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.K0;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;

/* loaded from: classes10.dex */
final class n implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final o f71499a;

    /* renamed from: b, reason: collision with root package name */
    private final h f71500b;

    public n(o oVar, h hVar) {
        this.f71499a = oVar;
        this.f71500b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<K0> o11 = this.f71499a.o();
        ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
        Iterator<T> it = o11.iterator();
        while (it.hasNext()) {
            arrayList.add(((K0) it.next()).M0(this.f71500b));
        }
        return arrayList;
    }
}
