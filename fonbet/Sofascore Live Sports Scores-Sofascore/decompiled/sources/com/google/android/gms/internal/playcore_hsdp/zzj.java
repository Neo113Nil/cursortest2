package com.google.android.gms.internal.playcore_hsdp;

import defpackage.foo;
import defpackage.wjo;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzj {
    public static zzg a(zzg zzgVar) {
        return !(zzgVar instanceof foo) ? zzgVar instanceof wjo ? zzgVar : zzgVar instanceof Serializable ? new wjo(zzgVar) : new foo(zzgVar) : zzgVar;
    }
}
