package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class uho extends pho implements SortedSet {
    public final /* synthetic */ hjo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uho(hjo hjoVar, SortedMap sortedMap) {
        super(hjoVar, sortedMap);
        this.d = hjoVar;
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
        return new uho(this.d, c().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return c().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new uho(this.d, c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new uho(this.d, c().tailMap(obj));
    }
}
