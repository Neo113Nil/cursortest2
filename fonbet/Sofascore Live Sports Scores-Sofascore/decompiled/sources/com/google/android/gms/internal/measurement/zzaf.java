package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.dmi;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaf implements zzao {
    public final boolean a;

    public zzaf(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao c(String str, zzg zzgVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z = this.a;
        if (equals) {
            return new zzas(Boolean.toString(z));
        }
        a70.p(dmi.r(Boolean.toString(z), ".", str, " is not a function."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzaf) && this.a == ((zzaf) obj).a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return Boolean.toString(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzaf(Boolean.valueOf(this.a));
    }
}
