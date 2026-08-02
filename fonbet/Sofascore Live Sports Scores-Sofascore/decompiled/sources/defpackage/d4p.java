package defpackage;

import java.util.AbstractMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d4p extends q3p {
    public final /* synthetic */ e4p c;

    public d4p(e4p e4pVar) {
        this.c = e4pVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        f4p f4pVar = this.c.d;
        return new AbstractMap.SimpleImmutableEntry(f4pVar.d.f.get(i), f4pVar.e.get(i));
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.d.e.size();
    }
}
