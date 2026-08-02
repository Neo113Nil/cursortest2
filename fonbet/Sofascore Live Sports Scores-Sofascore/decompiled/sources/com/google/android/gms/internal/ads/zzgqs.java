package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.tfo;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgqs implements zzinw {
    public final zzinx a;
    public final zzinx b;

    public zzgqs(zzinx zzinxVar, zzinx zzinxVar2) {
        this.a = zzinxVar;
        this.b = zzinxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return new tfo((Context) this.a.a, (ExecutorService) this.b.a);
    }
}
