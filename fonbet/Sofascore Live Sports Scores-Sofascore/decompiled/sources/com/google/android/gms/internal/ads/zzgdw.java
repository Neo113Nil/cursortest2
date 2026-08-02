package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgdw implements zzinw {
    public final zzinx a;

    public zzgdw(zzinx zzinxVar) {
        this.a = zzinxVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        File dir = ((Context) this.a.a).getDir("yqzdkcache", 0);
        zzioe.a(dir);
        return dir;
    }
}
