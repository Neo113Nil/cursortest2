package defpackage;

import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzcs;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qtn extends zzcf {
    public final transient lun d;
    public final transient Object[] e;
    public final transient int f;

    public qtn(lun lunVar, Object[] objArr, int i) {
        this.d = lunVar;
        this.e = objArr;
        this.f = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final int a(Object[] objArr) {
        return n().a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    /* renamed from: o */
    public final zzcs iterator() {
        return n().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf
    public final zzca s() {
        return new ftn(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
