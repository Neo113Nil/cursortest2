package com.google.android.gms.internal.ads;

import android.os.Build;
import defpackage.bf3;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgfi implements zzinw {
    public final zzinx a;
    public final zzinx b;

    public zzgfi(zzinx zzinxVar, zzinx zzinxVar2) {
        this.a = zzinxVar;
        this.b = zzinxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        ExecutorService executorService = (ExecutorService) this.a.a;
        zzgei zzgeiVar = (zzgei) this.b.a;
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        bf3.v(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb.append(")");
        return new zzgfn(executorService, sb.toString(), zzgeiVar.e0());
    }
}
