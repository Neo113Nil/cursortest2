package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzavn extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzavn(zzavm zzavmVar, zzavk zzavkVar, long j) {
        super(String.format(r0, zzawc.a("bk3t6gFTc30="), Long.valueOf(zzavmVar.a), Long.valueOf(zzavkVar.a), r5));
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(j);
        Optional.of(zzavkVar);
        Optional.of(valueOf);
    }

    public zzavn(zzavm zzavmVar, Exception exc) {
        super(String.format(Locale.US, zzawc.a("bk0="), Long.valueOf(zzavmVar.a)), exc);
        Optional.empty();
        Optional.empty();
    }
}
