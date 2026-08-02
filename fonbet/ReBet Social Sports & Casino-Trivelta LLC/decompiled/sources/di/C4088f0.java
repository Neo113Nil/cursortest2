package di;

import Zh.InterfaceC1901b;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4088f0 extends AbstractC4122x {

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f45358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4088f0(InterfaceC1901b eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f45358b = new C4086e0(eSerializer.getDescriptor());
    }

    @Override // di.AbstractC4120w, Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45358b;
    }

    @Override // di.AbstractC4077a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet b() {
        return new LinkedHashSet();
    }

    @Override // di.AbstractC4077a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int c(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // di.AbstractC4077a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(LinkedHashSet linkedHashSet, int i10) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
    }

    @Override // di.AbstractC4120w
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void o(LinkedHashSet linkedHashSet, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    @Override // di.AbstractC4077a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet l(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Set m(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
