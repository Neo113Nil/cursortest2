package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzql extends RuntimeException {
    public zzql(String str) {
        super(str);
    }

    public static <T> T zza(zzqo<T> zzqoVar) {
        try {
            return zzqoVar.zza();
        } catch (Exception e10) {
            throw new zzql(e10);
        }
    }

    public zzql(Throwable th2) {
        super(th2);
    }

    public zzql(String str, Throwable th2) {
        super(str, th2);
    }
}
