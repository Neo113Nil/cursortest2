package defpackage;

import com.google.android.gms.internal.cast.zzhd;
import com.google.android.gms.internal.cast.zzhv;
import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zoo extends zzhv {
    public final /* synthetic */ epo c;

    public zoo(epo epoVar) {
        this.c = epoVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        epo epoVar = this.c;
        zzhd.a(i, epoVar.f);
        Object[] objArr = epoVar.e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
