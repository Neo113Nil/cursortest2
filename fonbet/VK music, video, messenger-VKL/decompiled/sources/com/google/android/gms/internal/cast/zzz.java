package com.google.android.gms.internal.cast;

import xsna.exc0;
import xsna.o100;
import xsna.uz9;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final /* synthetic */ class zzz implements zzhg {
    static final /* synthetic */ zzz zza = new zzz();

    private /* synthetic */ zzz() {
    }

    @Override // com.google.android.gms.internal.cast.zzhg
    public final Object zza() {
        int i = zzaa.zzc;
        o100 o100Var = uz9.m;
        exc0.e("Must be called from the main thread.");
        uz9 uz9Var = uz9.o;
        exc0.i(uz9Var);
        exc0.e("Must be called from the main thread.");
        return uz9Var.e.b;
    }
}
