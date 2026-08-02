package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.C3171d;

/* loaded from: classes2.dex */
public final class zzaeu {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int j10 = C3171d.h().j(context, AbstractC3175h.f32612a);
            zza = Boolean.valueOf(j10 == 0 || j10 == 2);
        }
        return zza.booleanValue();
    }
}
