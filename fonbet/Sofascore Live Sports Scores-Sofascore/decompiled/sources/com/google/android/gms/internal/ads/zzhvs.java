package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhvs {
    public zzhvv a = null;
    public zzhvt b = null;
    public zzhvu c = null;
    public zzhvw d = zzhvw.e;

    private zzhvs() {
    }

    public final zzhvx a() {
        zzhvv zzhvvVar = this.a;
        if (zzhvvVar == null) {
            defpackage.zzl.x("signature encoding is not set");
            return null;
        }
        zzhvt zzhvtVar = this.b;
        if (zzhvtVar == null) {
            defpackage.zzl.x("EC curve type is not set");
            return null;
        }
        zzhvu zzhvuVar = this.c;
        if (zzhvuVar == null) {
            defpackage.zzl.x("hash type is not set");
            return null;
        }
        zzhvw zzhvwVar = this.d;
        if (zzhvtVar == zzhvt.c && zzhvuVar != zzhvu.b) {
            defpackage.zzl.x("NIST_P256 requires SHA256");
            return null;
        }
        zzhvt zzhvtVar2 = zzhvt.d;
        zzhvu zzhvuVar2 = zzhvu.d;
        if (zzhvtVar == zzhvtVar2 && zzhvuVar != zzhvu.c && zzhvuVar != zzhvuVar2) {
            defpackage.zzl.x("NIST_P384 requires SHA384 or SHA512");
            return null;
        }
        if (zzhvtVar != zzhvt.e || zzhvuVar == zzhvuVar2) {
            return new zzhvx(zzhvvVar, zzhvtVar, zzhvuVar, zzhvwVar);
        }
        defpackage.zzl.x("NIST_P521 requires SHA512");
        return null;
    }

    public /* synthetic */ zzhvs(int i) {
    }
}
