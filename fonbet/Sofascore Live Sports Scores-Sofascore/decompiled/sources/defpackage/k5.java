package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class k5 extends f5 implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ azc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(azc azcVar, SortedMap sortedMap) {
        super(azcVar, sortedMap, 0);
        this.g = azcVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedSet d() {
        return new l5(this.g, f());
    }

    @Override // defpackage.f5, java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet d = d();
        this.f = d;
        return d;
    }

    public SortedMap f() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new k5(this.g, f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new k5(this.g, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new k5(this.g, f().tailMap(obj));
    }
}
