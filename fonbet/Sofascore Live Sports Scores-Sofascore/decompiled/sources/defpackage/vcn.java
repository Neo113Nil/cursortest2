package defpackage;

import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vcn extends zzah {
    public final transient zzah c;

    public vcn(zzah zzahVar) {
        this.c = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzah zzahVar = this.c;
        zzr.a(i, zzahVar.size());
        return zzahVar.get((zzahVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean q() {
        return this.c.q();
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah s() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* renamed from: t */
    public final zzah subList(int i, int i2) {
        zzah zzahVar = this.c;
        zzr.b(i, i2, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i2, zzahVar.size() - i).s();
    }
}
