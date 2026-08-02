package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsb {
    public final zzv a;
    public final zzhbf b;
    public final zzbf c;
    public final zzxo d;

    public /* synthetic */ zzsb(zzsa zzsaVar) {
        this.a = zzsaVar.a;
        this.b = zzsaVar.b;
        this.c = zzsaVar.c;
        this.d = zzsaVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsb)) {
            return false;
        }
        zzsb zzsbVar = (zzsb) obj;
        return this.a.equals(zzsbVar.a) && Objects.equals(this.b, zzsbVar.b) && this.c.equals(zzsbVar.c) && Objects.equals(this.d, zzsbVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        zzhbf zzhbfVar = this.b;
        int hashCode2 = this.c.hashCode() + ((hashCode + (zzhbfVar == null ? 0 : zzhbfVar.hashCode())) * 31);
        zzxo zzxoVar = this.d;
        return (hashCode2 * 31) + (zzxoVar != null ? zzxoVar.hashCode() : 0);
    }
}
