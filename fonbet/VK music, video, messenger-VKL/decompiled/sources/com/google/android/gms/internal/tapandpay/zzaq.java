package com.google.android.gms.internal.tapandpay;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
final class zzaq<E> extends zzam<E> {
    private final zzan<E> zza;

    public zzaq(zzan<E> zzanVar, int i) {
        super(zzanVar.size(), i);
        this.zza = zzanVar;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzam
    public final E zza(int i) {
        return this.zza.get(i);
    }
}
