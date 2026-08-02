package di;

import Zh.InterfaceC1901b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class P extends AbstractC4104n0 {

    /* renamed from: c, reason: collision with root package name */
    public final bi.f f45318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(InterfaceC1901b kSerializer, InterfaceC1901b vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f45318c = new O(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // di.AbstractC4104n0, Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45318c;
    }

    @Override // di.AbstractC4077a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public HashMap b() {
        return new HashMap();
    }

    @Override // di.AbstractC4077a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int c(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    @Override // di.AbstractC4077a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(HashMap hashMap, int i10) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
    }

    @Override // di.AbstractC4077a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterator e(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // di.AbstractC4077a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int f(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public HashMap l(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        HashMap hashMap = map instanceof HashMap ? (HashMap) map : null;
        return hashMap == null ? new HashMap(map) : hashMap;
    }

    @Override // di.AbstractC4077a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Map m(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap;
    }
}
