package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.ddb;
import defpackage.v35;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfaq implements zzfdi {
    public final zzhdi a;
    public final ViewGroup b;
    public final Context c;
    public final Set d;

    public zzfaq(zzhdi zzhdiVar, ViewGroup viewGroup, Context context, Set set) {
        this.a = zzhdiVar;
        this.d = set;
        this.b = viewGroup;
        this.c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(new v35(this, 26));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 22;
    }
}
