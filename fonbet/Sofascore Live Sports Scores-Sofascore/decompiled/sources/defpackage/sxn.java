package defpackage;

import com.google.android.gms.internal.fido.zzcc;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzdc;
import com.ironsource.U3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sxn extends zzcf {
    public final transient Object d;

    public sxn(Object obj) {
        this.d = obj;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new ztn(this.d);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    /* renamed from: n */
    public final zzdc iterator() {
        return new ztn(this.d);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc r() {
        Object[] objArr = {this.d};
        for (int i = 0; i < 1; i++) {
            kqn kqnVar = zzcc.b;
            if (objArr[i] == null) {
                yhk.s(ljg.j(i, "at index "));
                return null;
            }
        }
        return zzcc.r(1, objArr);
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
