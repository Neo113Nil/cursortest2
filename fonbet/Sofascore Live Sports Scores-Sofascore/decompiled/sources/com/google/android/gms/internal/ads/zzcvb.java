package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcvb implements zzinw {
    public final zzinv a;
    public final zzinv b;

    public zzcvb(zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzcuy zzcuyVar = (zzcuy) this.a.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        Set singleton = ((JSONObject) this.b.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdlo(zzcuyVar, hsnVar));
        zzioe.a(singleton);
        return singleton;
    }
}
