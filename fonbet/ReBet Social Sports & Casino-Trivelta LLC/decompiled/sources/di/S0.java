package di;

import Zh.InterfaceC1901b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public final class S0 extends AbstractC4120w {

    /* renamed from: b, reason: collision with root package name */
    public final KClass f45324b;

    /* renamed from: c, reason: collision with root package name */
    public final bi.f f45325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(KClass kClass, InterfaceC1901b eSerializer) {
        super(eSerializer, null);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f45324b = kClass;
        this.f45325c = new C4083d(eSerializer.getDescriptor());
    }

    @Override // di.AbstractC4120w, Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45325c;
    }

    @Override // di.AbstractC4077a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public ArrayList b() {
        return new ArrayList();
    }

    @Override // di.AbstractC4077a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int c(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // di.AbstractC4077a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void d(ArrayList arrayList, int i10) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    @Override // di.AbstractC4077a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Iterator e(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return ArrayIteratorKt.iterator(objArr);
    }

    @Override // di.AbstractC4077a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public int f(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length;
    }

    @Override // di.AbstractC4120w
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void o(ArrayList arrayList, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    @Override // di.AbstractC4077a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public ArrayList l(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(ArraysKt.asList(objArr));
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Object[] m(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return D0.q(arrayList, this.f45324b);
    }
}
