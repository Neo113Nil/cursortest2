package qd;

import java.util.EnumMap;
import java.util.HashMap;
import je.Y;
import kotlin.jvm.functions.Function0;
import qd.m;

/* loaded from: classes.dex */
final class k implements Function0<m.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f81835a;

    k(m mVar) {
        this.f81835a = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final m.b invoke() {
        EnumMap enumMap = new EnumMap(p.class);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (p pVar : p.values()) {
            String b11 = pVar.g().b();
            m mVar = this.f81835a;
            Y b12 = m.b(mVar, b11);
            Y b13 = m.b(mVar, pVar.e().b());
            enumMap.put((EnumMap) pVar, (p) b13);
            hashMap.put(b12, b13);
            hashMap2.put(b13, b12);
        }
        return new m.b(enumMap, hashMap, hashMap2);
    }
}
