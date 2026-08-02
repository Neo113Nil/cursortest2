package defpackage;

import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzgxw;
import com.google.android.gms.internal.ads.zzgxz;
import com.google.android.gms.internal.ads.zzhaa;
import com.ironsource.U3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qio extends zzgxw {
    public final /* synthetic */ int d = 0;
    public final transient Object e;

    public qio(Object obj) {
        obj.getClass();
        this.e = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((zzgxz) obj2).zzu().get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return obj2.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    /* renamed from: d */
    public final zzhaa iterator() {
        switch (this.d) {
            case 0:
                return new pio((zzgxz) this.e);
            default:
                return new wio(this.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.d) {
            case 1:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.d) {
            case 0:
                return new pio((zzgxz) this.e);
            default:
                return new wio(this.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, com.google.android.gms.internal.ads.zzgxi
    public zzgxm p() {
        switch (this.d) {
            case 1:
                return zzgxm.t(this.e);
            default:
                return super.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final boolean q() {
        switch (this.d) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public int r(Object[] objArr, int i) {
        switch (this.d) {
            case 1:
                objArr[i] = this.e;
                return i + 1;
            default:
                return super.r(objArr, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.d) {
            case 0:
                return ((zzgxz) this.e).e;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.d) {
            case 1:
                String obj = this.e.toString();
                return wt3.m(U3.j.d, obj, new StringBuilder(String.valueOf(obj).length() + 2), U3.j.e);
            default:
                return super.toString();
        }
    }

    public qio(zzgxz zzgxzVar) {
        this.e = zzgxzVar;
    }
}
