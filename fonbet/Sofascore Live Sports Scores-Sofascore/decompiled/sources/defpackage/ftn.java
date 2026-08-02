package defpackage;

import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzca;
import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ftn extends zzca {
    public final /* synthetic */ qtn c;

    public ftn(qtn qtnVar) {
        this.c = qtnVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        qtn qtnVar = this.c;
        zzbl.a(i, qtnVar.f);
        Object[] objArr = qtnVar.e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
