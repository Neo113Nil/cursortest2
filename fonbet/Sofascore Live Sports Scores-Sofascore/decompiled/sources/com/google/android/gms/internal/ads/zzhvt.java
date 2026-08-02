package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvt {
    public static final zzhvt c = new zzhvt("NIST_P256", zzhmm.a);
    public static final zzhvt d = new zzhvt("NIST_P384", zzhmm.b);
    public static final zzhvt e = new zzhvt("NIST_P521", zzhmm.c);
    public final String a;
    public final ECParameterSpec b;

    public zzhvt(String str, ECParameterSpec eCParameterSpec) {
        this.a = str;
        this.b = eCParameterSpec;
    }

    public final String toString() {
        return this.a;
    }
}
