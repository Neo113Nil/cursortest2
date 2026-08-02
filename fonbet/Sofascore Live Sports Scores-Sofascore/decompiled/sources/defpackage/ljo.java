package defpackage;

import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzgxw;
import com.google.android.gms.internal.ads.zzhaa;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ljo extends zzgxw {
    public final transient njo d;
    public final transient mjo e;

    public ljo(njo njoVar, mjo mjoVar) {
        this.d = njoVar;
        this.e = mjoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    /* renamed from: d */
    public final zzhaa iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi
    public final zzgxm p() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final boolean q() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final int r(Object[] objArr, int i) {
        return this.e.r(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
