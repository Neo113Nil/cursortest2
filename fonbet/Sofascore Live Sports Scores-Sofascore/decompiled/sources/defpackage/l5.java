package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class l5 extends g5 implements SortedSet {
    public final /* synthetic */ azc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(azc azcVar, SortedMap sortedMap) {
        super(azcVar, sortedMap);
        this.d = azcVar;
    }

    public SortedMap c() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return c().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return c().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new l5(this.d, c().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return c().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new l5(this.d, c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new l5(this.d, c().tailMap(obj));
    }
}
