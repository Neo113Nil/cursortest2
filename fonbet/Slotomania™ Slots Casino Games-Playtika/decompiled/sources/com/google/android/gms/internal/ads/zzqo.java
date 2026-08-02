package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzqo extends Exception {
    public final int zza;
    public final boolean zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqo(int i, boolean z) {
        super(r1.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("AudioOutput write failed: ");
        sb.append(i);
        this.zzb = z;
        this.zza = i;
    }
}
