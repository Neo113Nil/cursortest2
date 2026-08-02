package defpackage;

import com.google.android.gms.internal.cast.zzhv;
import com.google.android.gms.internal.cast.zzhz;
import com.google.android.gms.internal.cast.zzil;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class spo extends zzhz {
    public final transient fqo d;
    public final transient xpo e;

    public spo(fqo fqoVar, xpo xpoVar) {
        this.d = fqoVar;
        this.e = xpoVar;
    }

    @Override // com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    /* renamed from: d */
    public final zzil iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.zzhz, com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int p(Object[] objArr) {
        return this.e.p(objArr);
    }

    @Override // com.google.android.gms.internal.cast.zzhz
    public final zzhv q() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
