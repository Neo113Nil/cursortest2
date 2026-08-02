package defpackage;

import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzgxw;
import com.google.android.gms.internal.ads.zzhaa;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kjo extends zzgxw {
    public final transient njo d;
    public final transient Object[] e;
    public final transient int f;

    public kjo(njo njoVar, Object[] objArr, int i) {
        this.d = njoVar;
        this.e = objArr;
        this.f = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    /* renamed from: d */
    public final zzhaa iterator() {
        return p().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return p().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final boolean q() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final int r(Object[] objArr, int i) {
        return p().r(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final zzgxm w() {
        return new jjo(this);
    }
}
