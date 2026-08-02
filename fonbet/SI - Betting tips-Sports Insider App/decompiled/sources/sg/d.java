package sg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d extends o {

    /* renamed from: b, reason: collision with root package name */
    public final c f23615b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(og.a element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        qg.g elementDesc = element.d();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f23615b = new c(elementDesc);
    }

    @Override // og.a
    public final qg.g d() {
        return this.f23615b;
    }

    @Override // sg.a
    public final Object e() {
        return new ArrayList();
    }

    @Override // sg.a
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // sg.a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    @Override // sg.a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }

    @Override // sg.a
    public final Object k(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // sg.a
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }

    @Override // sg.o
    public final void m(int i5, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i5, obj2);
    }
}
