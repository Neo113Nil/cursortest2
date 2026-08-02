package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhnp extends RuntimeException {
    public zzhnp(String str) {
        super(str);
    }

    public static Object zza(zzhno zzhnoVar) {
        try {
            return zzhnoVar.zza();
        } catch (Exception e) {
            throw new zzhnp(e);
        }
    }

    public zzhnp(String str, Throwable th) {
        super(str, th);
    }

    public zzhnp(Throwable th) {
        super(th);
    }
}
