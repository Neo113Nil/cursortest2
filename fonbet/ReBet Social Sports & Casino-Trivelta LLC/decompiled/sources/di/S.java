package di;

import Zh.InterfaceC1901b;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class S extends AbstractC4122x {

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f45323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(InterfaceC1901b eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f45323b = new Q(eSerializer.getDescriptor());
    }

    @Override // di.AbstractC4120w, Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45323b;
    }

    @Override // di.AbstractC4077a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public HashSet b() {
        return new HashSet();
    }

    @Override // di.AbstractC4077a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int c(HashSet hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // di.AbstractC4077a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(HashSet hashSet, int i10) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
    }

    @Override // di.AbstractC4120w
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void o(HashSet hashSet, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(obj);
    }

    @Override // di.AbstractC4077a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashSet l(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Set m(HashSet hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }
}
