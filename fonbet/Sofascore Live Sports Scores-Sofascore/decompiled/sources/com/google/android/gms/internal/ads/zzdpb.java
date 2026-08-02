package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdpb implements zzinw {
    public final zzdoy a;

    public zzdpb(zzdoy zzdoyVar) {
        this.a = zzdoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdrb zzdrbVar = this.a.a.a;
        zzioe.a(zzdrbVar);
        Set singleton = zzdrbVar.d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        zzioe.a(singleton);
        return singleton;
    }
}
