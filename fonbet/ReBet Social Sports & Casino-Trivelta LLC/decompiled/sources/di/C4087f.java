package di;

import Zh.InterfaceC1901b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4087f extends AbstractC4122x {

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f45357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4087f(InterfaceC1901b element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        this.f45357b = new C4085e(element.getDescriptor());
    }

    @Override // di.AbstractC4120w, Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45357b;
    }

    @Override // di.AbstractC4077a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ArrayList b() {
        return new ArrayList();
    }

    @Override // di.AbstractC4077a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int c(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // di.AbstractC4077a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(ArrayList arrayList, int i10) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // di.AbstractC4120w
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void o(ArrayList arrayList, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    @Override // di.AbstractC4077a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public ArrayList l(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public List m(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }
}
