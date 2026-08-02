package com.google.android.gms.internal.ads;

import defpackage.ohn;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdge extends zzdjn implements zzdej, zzdfo {
    public final zzfld b;
    public final AtomicBoolean c;
    public final zzflo d;

    public zzdge(Set set, zzfld zzfldVar, zzflo zzfloVar) {
        super(set);
        this.c = new AtomicBoolean();
        this.b = zzfldVar;
        this.d = zzfloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        int i = this.b.b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            q0();
        }
    }

    public final void q0() {
        com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.d9)).booleanValue() && (zztVar = this.b.e0) != null && zztVar.zza == 3 && this.c.compareAndSet(false, true)) {
            p0(new ohn(zztVar, 9));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zzl() {
        if (this.b.b == 1) {
            q0();
        }
    }
}
