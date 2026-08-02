package defpackage;

import com.google.android.gms.internal.cast.zzhv;
import com.google.android.gms.internal.cast.zzhz;
import com.google.android.gms.internal.cast.zzil;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class epo extends zzhz {
    public final transient fqo d;
    public final transient Object[] e;
    public final transient int f;

    public epo(fqo fqoVar, Object[] objArr, int i) {
        this.d = fqoVar;
        this.e = objArr;
        this.f = i;
    }

    @Override // com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    /* renamed from: d */
    public final zzil iterator() {
        return q().listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.zzhz, com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return q().listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int p(Object[] objArr) {
        return q().p(objArr);
    }

    @Override // com.google.android.gms.internal.cast.zzhz
    public final zzhv s() {
        return new zoo(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
