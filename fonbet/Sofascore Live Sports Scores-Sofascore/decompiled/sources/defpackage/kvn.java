package defpackage;

import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzcs;
import com.ironsource.U3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kvn extends zzcf {
    public final transient Object d;

    public kvn(Object obj) {
        this.d = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final int a(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new nsn(this.d);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx
    public final zzca n() {
        Object[] objArr = {this.d};
        for (int i = 0; i < 1; i++) {
            dqn dqnVar = zzca.b;
            if (objArr[i] == null) {
                yhk.s(ljg.j(i, "at index "));
                return null;
            }
        }
        return zzca.s(1, objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    /* renamed from: o */
    public final zzcs iterator() {
        return new nsn(this.d);
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
