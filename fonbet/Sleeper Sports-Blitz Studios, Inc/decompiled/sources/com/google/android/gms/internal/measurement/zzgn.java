package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final /* synthetic */ class zzgn {
    public static <V> V zza(zzgq<V> zzgqVar) {
        try {
            return zzgqVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzgqVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
