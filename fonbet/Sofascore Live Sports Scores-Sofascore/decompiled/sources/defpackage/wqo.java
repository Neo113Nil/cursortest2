package defpackage;

import com.google.android.gms.internal.cast.zzhv;
import com.google.android.gms.internal.cast.zzhz;
import com.google.android.gms.internal.cast.zzil;
import com.ironsource.U3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wqo extends zzhz {
    public final transient Object d;

    public wqo(Object obj) {
        this.d = obj;
    }

    @Override // com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    /* renamed from: d */
    public final zzil iterator() {
        return new koo(this.d);
    }

    @Override // com.google.android.gms.internal.cast.zzhz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.google.android.gms.internal.cast.zzhz, com.google.android.gms.internal.cast.zzhr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new koo(this.d);
    }

    @Override // com.google.android.gms.internal.cast.zzhr
    public final int p(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // com.google.android.gms.internal.cast.zzhz
    public final zzhv q() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.d.toString();
        return wt3.m(U3.j.d, obj, new StringBuilder(String.valueOf(obj).length() + 2), U3.j.e);
    }
}
