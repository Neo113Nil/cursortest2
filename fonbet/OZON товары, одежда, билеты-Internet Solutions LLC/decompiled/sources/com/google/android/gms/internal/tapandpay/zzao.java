package com.google.android.gms.internal.tapandpay;

/* loaded from: classes9.dex */
final class zzao<E> extends zzal<E> {
    private final zzaq<E> zza;

    zzao(zzaq<E> zzaqVar, int i11) {
        super(zzaqVar.size(), i11);
        this.zza = zzaqVar;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzal
    protected final E zza(int i11) {
        return this.zza.get(i11);
    }
}
