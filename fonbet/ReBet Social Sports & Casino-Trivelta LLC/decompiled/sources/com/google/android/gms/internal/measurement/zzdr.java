package com.google.android.gms.internal.measurement;

import N9.d;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.Z2;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzdr extends zzeq {
    final /* synthetic */ Context zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzfb zzfbVar, Context context, Bundle bundle) {
        super(zzfbVar, true);
        this.zza = context;
        this.zzb = bundle;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        try {
            Context context = this.zza;
            AbstractC3191o.m(context);
            String a10 = Z2.a(context);
            AbstractC3191o.m(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(a10)) {
                a10 = Z2.a(context);
            }
            Boolean c10 = Z2.c("google_analytics_force_disable_updates", resources, a10);
            zzfb zzfbVar = this.zzc;
            zzfbVar.zzR(zzfbVar.zzc(context, c10 == null || !c10.booleanValue()));
            if (zzfbVar.zzQ() == null) {
                Log.w(zzfbVar.zzO(), "Failed to connect to measurement client.");
                return;
            }
            int a11 = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            ((zzcr) AbstractC3191o.m(zzfbVar.zzQ())).initialize(d.i(context), new zzdd(133005L, Math.max(a11, r0), Boolean.TRUE.equals(c10) || DynamiteModule.c(context, ModuleDescriptor.MODULE_ID) < a11, this.zzb, Z2.a(context)), this.zzh);
        } catch (Exception e10) {
            this.zzc.zzN(e10, true, false);
        }
    }
}
