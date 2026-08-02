package defpackage;

import com.google.android.gms.internal.consent_sdk.zzdj;
import com.google.android.gms.internal.consent_sdk.zzdv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x0o extends zzdv {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzdv e;

    public x0o(zzdv zzdvVar, int i, int i2) {
        this.e = zzdvVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int d() {
        return this.e.m() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzdj.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final int m() {
        return this.e.m() + this.c;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final Object[] o() {
        return this.e.o();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final zzdv subList(int i, int i2) {
        zzdj.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
