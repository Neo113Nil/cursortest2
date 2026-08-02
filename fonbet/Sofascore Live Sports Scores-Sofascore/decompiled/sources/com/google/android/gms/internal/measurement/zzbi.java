package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.dmi;
import defpackage.lnb;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbi extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !zzgVar.d(str)) {
            a70.p(dmi.q("Command not found: ", str));
            return null;
        }
        zzao g = zzgVar.g(str);
        if (g instanceof zzai) {
            return ((zzai) g).d(zzgVar, arrayList);
        }
        a70.p(lnb.o("Function ", str, " is not defined"));
        return null;
    }
}
