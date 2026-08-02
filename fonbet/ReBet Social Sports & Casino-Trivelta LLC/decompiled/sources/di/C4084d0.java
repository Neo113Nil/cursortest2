package di;

import Zh.InterfaceC1901b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4084d0 extends AbstractC4104n0 {

    /* renamed from: c, reason: collision with root package name */
    public final bi.f f45354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4084d0(InterfaceC1901b kSerializer, InterfaceC1901b vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f45354c = new C4082c0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // di.AbstractC4104n0, Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45354c;
    }

    @Override // di.AbstractC4077a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap b() {
        return new LinkedHashMap();
    }

    @Override // di.AbstractC4077a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int c(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // di.AbstractC4077a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(LinkedHashMap linkedHashMap, int i10) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
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
    public LinkedHashMap l(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // di.AbstractC4077a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Map m(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
