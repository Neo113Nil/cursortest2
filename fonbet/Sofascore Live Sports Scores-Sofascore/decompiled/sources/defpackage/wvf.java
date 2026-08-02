package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wvf extends hv9 {
    public final /* synthetic */ xvf c;

    public wvf(xvf xvfVar) {
        this.c = xvfVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xvf xvfVar = this.c;
        z1a.v(i, xvfVar.f);
        Object[] objArr = xvfVar.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }

    @Override // defpackage.hv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}
