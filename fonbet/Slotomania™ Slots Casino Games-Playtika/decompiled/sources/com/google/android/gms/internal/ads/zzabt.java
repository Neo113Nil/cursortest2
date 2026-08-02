package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
final class zzabt implements Runnable {
    private final zzabs zza;

    public zzabt(zzabs zzabsVar) {
        this.zza = zzabsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzo();
    }
}
