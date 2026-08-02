package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzggf {
    public final ExecutorService a;

    public zzggf(ExecutorService executorService) {
        this.a = executorService;
    }

    public final zzgge a(File file, byte[] bArr, zzgub zzgubVar) {
        return new zzgge(file, this.a, new zzgfy(bArr), zzgubVar);
    }
}
