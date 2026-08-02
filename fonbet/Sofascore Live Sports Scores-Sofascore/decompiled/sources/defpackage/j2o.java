package defpackage;

import com.google.android.gms.internal.consent_sdk.zzdw;
import com.google.android.gms.internal.consent_sdk.zzeb;
import com.ironsource.U3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j2o extends zzdw {
    public final transient Object d;

    public j2o(Object obj) {
        this.d = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final void a(Object[] objArr) {
        objArr[0] = this.d;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new m1o(this.d);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* renamed from: n */
    public final zzeb iterator() {
        return new m1o(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return lnb.o(U3.j.d, this.d.toString(), U3.j.e);
    }
}
