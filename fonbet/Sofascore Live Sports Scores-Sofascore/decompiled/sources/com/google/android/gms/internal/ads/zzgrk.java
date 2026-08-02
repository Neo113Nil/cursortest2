package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.kgo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgrk extends zzbeu implements zzgrm {
    @Override // com.google.android.gms.internal.ads.zzgrm
    public final void Q1(Bundle bundle, kgo kgoVar) {
        Parcel J = J();
        zzbew.c(J, bundle);
        zzbew.e(J, kgoVar);
        l2(J, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrm
    public final void a1(Bundle bundle, kgo kgoVar) {
        Parcel J = J();
        zzbew.c(J, bundle);
        zzbew.e(J, kgoVar);
        l2(J, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzgrm
    public final void g0(String str, Bundle bundle, kgo kgoVar) {
        Parcel J = J();
        J.writeString(str);
        zzbew.c(J, bundle);
        zzbew.e(J, kgoVar);
        l2(J, 1);
    }
}
