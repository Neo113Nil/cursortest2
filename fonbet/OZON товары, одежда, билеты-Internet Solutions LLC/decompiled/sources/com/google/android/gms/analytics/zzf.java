package com.google.android.gms.analytics;

import java.util.Comparator;

/* loaded from: classes9.dex */
final class zzf implements Comparator<zzj> {
    zzf(zzg zzgVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzj zzjVar, zzj zzjVar2) {
        return zzjVar.getClass().getCanonicalName().compareTo(zzjVar2.getClass().getCanonicalName());
    }
}
