package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzs {
    public static Object zza(Context context, String str, zzq zzqVar) throws zzr {
        try {
            try {
                return zzqVar.mo910zza(DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).b(str));
            } catch (Exception e) {
                throw new zzr(e);
            }
        } catch (Exception e2) {
            throw new zzr(e2);
        }
    }

    public static Context zzb(Context context) throws zzr {
        try {
            return DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).a;
        } catch (Exception e) {
            throw new zzr(e);
        }
    }
}
