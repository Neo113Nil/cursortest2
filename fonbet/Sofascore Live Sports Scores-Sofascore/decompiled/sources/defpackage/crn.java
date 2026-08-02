package defpackage;

import com.google.android.gms.internal.fido.zzbm;
import com.google.android.gms.internal.fido.zzcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class crn extends zzcc {
    public final transient zzcc c;

    public crn(zzcc zzccVar) {
        this.c = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzcc zzccVar = this.c;
        zzbm.a(i, zzccVar.size());
        return zzccVar.get((zzccVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final zzcc p() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: q */
    public final zzcc subList(int i, int i2) {
        zzcc zzccVar = this.c;
        zzbm.b(i, i2, zzccVar.size());
        return zzccVar.subList(zzccVar.size() - i2, zzccVar.size() - i).p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
