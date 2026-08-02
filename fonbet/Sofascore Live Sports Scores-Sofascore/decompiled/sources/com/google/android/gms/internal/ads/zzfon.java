package com.google.android.gms.internal.ads;

import defpackage.cpn;
import defpackage.ewn;
import defpackage.h8o;
import defpackage.ohn;
import defpackage.tko;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfon {
    public final zzfof a;
    public final tko b;
    public boolean c = false;
    public boolean d = false;

    public zzfon(r rVar, ohn ohnVar, zzfof zzfofVar) {
        this.a = zzfofVar;
        h8o h8oVar = (h8o) zzfofVar;
        this.b = zzhcy.f(zzhcy.h((zzhcq) ((zzfhw) ohnVar.b).b(h8oVar.b, h8oVar.a, null), new ewn(this, ohnVar, rVar, zzfofVar, 4), zzfofVar.zza()), Exception.class, new cpn(this, ohnVar), zzfofVar.zza());
    }

    public final synchronized tko a(h8o h8oVar) {
        if (!this.d && !this.c) {
            zzfof zzfofVar = this.a;
            if (zzfofVar.zzb() != null && h8oVar.g != null && zzfofVar.zzb().equals(h8oVar.g)) {
                this.c = true;
                return this.b;
            }
        }
        return null;
    }
}
