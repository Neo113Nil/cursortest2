package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.ddb;
import defpackage.v35;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzevc implements zzfdi {
    public final zzhdi a;
    public final Context b;
    public final zzflw c;
    public final ViewGroup d;

    public zzevc(zzhdi zzhdiVar, Context context, zzflw zzflwVar, ViewGroup viewGroup) {
        this.a = zzhdiVar;
        this.b = context;
        this.c = zzflwVar;
        this.d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        zzbjg.a(this.b);
        return this.a.submit(new v35(this, 14));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 3;
    }
}
