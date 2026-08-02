package com.google.android.gms.internal.ads;

import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzs extends zzat {
    public final zzgxm c;

    public zzzs(String str, s sVar) {
        super(str, null, false, 1);
        this.c = zzgxm.x(sVar);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        zzgxm zzgxmVar = this.c;
        if (zzgxmVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(zzgxmVar);
        return wt3.m(message, "\nsniff failures: ", new StringBuilder(length + 17 + valueOf.length()), valueOf);
    }
}
