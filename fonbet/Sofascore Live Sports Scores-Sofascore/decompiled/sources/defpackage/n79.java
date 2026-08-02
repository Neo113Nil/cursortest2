package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class n79 extends AbstractSet {
    public final /* synthetic */ int a;
    public final AbstractMap b;

    public /* synthetic */ n79(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }

    public abstract Object c(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                ((o79) abstractMap).clear();
                break;
            default:
                ((h3p) abstractMap).clear();
                break;
        }
    }

    public abstract Object d(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new m79(this);
            default:
                return new m79(this, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                return ((o79) abstractMap).c;
            default:
                return ((h3p) abstractMap).c;
        }
    }
}
