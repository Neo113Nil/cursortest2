package nd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import td.InterfaceC9844j;

/* renamed from: nd.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8520Q implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X f76902a;

    public C8520Q(X x11) {
        this.f76902a = x11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X x11 = this.f76902a;
        Collection<InterfaceC9844j> t2 = x11.t();
        ArrayList arrayList = new ArrayList(C7714v.z(t2, 10));
        Iterator<T> it = t2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C8545j0(x11, (InterfaceC9844j) it.next()));
        }
        return arrayList;
    }
}
