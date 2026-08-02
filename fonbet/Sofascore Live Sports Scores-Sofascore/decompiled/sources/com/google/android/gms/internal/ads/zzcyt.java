package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.jle;
import defpackage.slo;
import defpackage.vlo;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcyt implements zzeqc {
    public final List a;

    public zzcyt(zzcyl zzcylVar) {
        this.a = Collections.singletonList(zzhcy.a(zzcylVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeqc
    public final void zzm() {
        for (ddb ddbVar : this.a) {
            ddbVar.addListener(new vlo(0, ddbVar, new jle(11)), slo.a);
        }
    }

    public zzcyt(List list) {
        this.a = list;
    }
}
