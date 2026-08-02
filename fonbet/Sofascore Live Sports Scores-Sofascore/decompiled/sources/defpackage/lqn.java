package defpackage;

import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzca;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lqn extends zzca {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzca e;

    public lqn(zzca zzcaVar, int i, int i2) {
        this.e = zzcaVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final int d() {
        return this.e.m() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbl.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final int m() {
        return this.e.m() + this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final boolean p() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final Object[] q() {
        return this.e.q();
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final zzca subList(int i, int i2) {
        zzbl.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
