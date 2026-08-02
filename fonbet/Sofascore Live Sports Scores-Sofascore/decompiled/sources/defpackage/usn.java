package defpackage;

import com.google.android.gms.internal.fido.zzcc;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzcj;
import com.google.android.gms.internal.fido.zzcy;
import com.google.android.gms.internal.fido.zzdc;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class usn extends zzcf {
    public final /* synthetic */ zzcj d;

    public usn(zzcj zzcjVar) {
        this.d = zzcjVar;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.d.get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzcy.a(this.d.entrySet());
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return r().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    /* renamed from: n */
    public final zzdc iterator() {
        return r().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc s() {
        return new msn(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.d.size();
    }
}
