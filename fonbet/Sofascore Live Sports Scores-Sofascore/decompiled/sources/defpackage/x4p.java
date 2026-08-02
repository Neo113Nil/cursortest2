package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x4p extends q3p {
    public final /* synthetic */ z4p c;

    public x4p(z4p z4pVar) {
        this.c = z4pVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        z4p z4pVar = this.c;
        jca.e0(i, z4pVar.f);
        Object[] objArr = z4pVar.e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
