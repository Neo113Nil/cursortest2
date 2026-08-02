package com.google.android.gms.internal.ads;

import defpackage.bf3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhnf extends zzhfj {
    public final zzhot a;

    public zzhnf(zzhot zzhotVar) {
        this.a = zzhotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.a.b.L() != 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnf)) {
            return false;
        }
        zzhot zzhotVar = ((zzhnf) obj).a;
        zzhot zzhotVar2 = this.a;
        zzhtw zzhtwVar = zzhotVar2.b;
        zzhtw zzhtwVar2 = zzhotVar2.b;
        int L = zzhtwVar.L();
        zzhtw zzhtwVar3 = zzhotVar.b;
        zzhtw zzhtwVar4 = zzhotVar.b;
        return L == zzhtwVar3.L() && zzhtwVar2.D().equals(zzhtwVar4.D()) && zzhtwVar2.E().equals(zzhtwVar4.E());
    }

    public final int hashCode() {
        zzhot zzhotVar = this.a;
        return Objects.hash(zzhotVar.b, zzhotVar.a);
    }

    public final String toString() {
        zzhot zzhotVar = this.a;
        String D = zzhotVar.b.D();
        int L = zzhotVar.b.L() - 2;
        return bf3.k("(typeUrl=", D, ", outputPrefixType=", L != 1 ? L != 2 ? L != 3 ? L != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
