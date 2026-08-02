package defpackage;

import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzcs;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class aun extends zzcf {
    public final transient lun d;
    public final transient hun e;

    public aun(lun lunVar, hun hunVar) {
        this.d = lunVar;
        this.e = hunVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final int a(Object[] objArr) {
        return this.e.a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx
    public final zzca n() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    /* renamed from: o */
    public final zzcs iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
