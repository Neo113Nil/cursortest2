package com.google.android.gms.internal.ads;

import defpackage.kho;
import defpackage.lho;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgvf {
    public static zzgvc a(zzgvc zzgvcVar) {
        return !(zzgvcVar instanceof lho) ? zzgvcVar instanceof kho ? zzgvcVar : zzgvcVar instanceof Serializable ? new kho(zzgvcVar) : new lho(zzgvcVar) : zzgvcVar;
    }
}
