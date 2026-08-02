package com.google.android.gms.internal.ads;

import defpackage.een;
import defpackage.emo;
import defpackage.q7o;
import defpackage.xco;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgge extends zzgfw {
    public final ExecutorService b;
    public final xco c;
    public final zzgub d;

    public zzgge(File file, ExecutorService executorService, xco xcoVar, zzgub zzgubVar) {
        super(file);
        this.b = executorService;
        this.c = xcoVar;
        this.d = zzgubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final emo a() {
        return zzhcy.c(this.b, new q7o(this, 12));
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final emo b(Object obj) {
        return zzhcy.c(this.b, new een(11, this, obj));
    }
}
