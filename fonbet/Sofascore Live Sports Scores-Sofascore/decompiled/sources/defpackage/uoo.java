package defpackage;

import com.google.android.gms.internal.ads.zzgxc;
import com.google.android.gms.internal.ads.zzgyt;
import com.google.android.gms.internal.ads.zzgzw;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uoo extends zzgxc {
    public final Map a;

    public uoo(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, com.google.android.gms.internal.ads.zzgxd
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final boolean containsValue(Object obj) {
        zio zioVar = new zio(entrySet().iterator(), 1);
        if (obj == null) {
            while (zioVar.hasNext()) {
                if (zioVar.next() == null) {
                }
            }
            return false;
        }
        while (zioVar.hasNext()) {
            if (obj.equals(zioVar.next())) {
            }
        }
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final Map d() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final Set entrySet() {
        return zzgzw.b(this.a.entrySet(), gfn.c);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && zzgyt.a(obj, this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.a.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final int hashCode() {
        return zzgzw.c(entrySet());
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final boolean isEmpty() {
        if (this.a.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final Set keySet() {
        return zzgzw.b(this.a.keySet(), gfn.d);
    }

    @Override // com.google.android.gms.internal.ads.zzgxc, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
