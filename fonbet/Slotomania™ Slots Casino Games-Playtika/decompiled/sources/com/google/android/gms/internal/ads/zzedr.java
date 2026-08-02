package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public class zzedr extends Exception {
    private final int zza;

    public zzedr(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzedr(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzedr(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
