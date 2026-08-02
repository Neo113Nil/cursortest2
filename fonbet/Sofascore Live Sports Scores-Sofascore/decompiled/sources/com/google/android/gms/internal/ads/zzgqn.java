package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.ddb;
import defpackage.x3o;
import defpackage.xlo;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgqn implements zzgqe, zzggg {
    public final Context a;
    public final zzgrh b;
    public final zzhdi c;
    public final zzgei d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public ddb f = xlo.b;

    public zzgqn(Context context, zzgei zzgeiVar, zzgrh zzgrhVar, zzhdi zzhdiVar) {
        this.a = context;
        this.b = zzgrhVar;
        this.c = zzhdiVar;
        this.d = zzgeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void a(HashMap hashMap, Context context, View view) {
        hashMap.put("gs", this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void b(HashMap hashMap) {
        hashMap.put("gs", this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void c(HashMap hashMap) {
        hashMap.put("gs", this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzggg
    public final ddb zza() {
        if (this.e.getAndSet(true) || !this.d.W()) {
            return xlo.b;
        }
        return this.c.submit(new x3o(this, 22));
    }
}
