package com.google.android.gms.internal.ads;

import defpackage.me4;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhwi extends zzhyn {
    public final zzhwo a;
    public final zzicj b;

    public zzhwi(zzhwo zzhwoVar, zzicj zzicjVar) {
        this.a = zzhwoVar;
        this.b = zzicjVar;
    }

    public static zzhwi d(zzhwo zzhwoVar, zzicj zzicjVar) {
        zzich zzichVar = zzicjVar.a;
        if (zzichVar.a.length != 32) {
            int length = zzichVar.a.length;
            throw new GeneralSecurityException(me4.g(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        byte[] b = zzhwoVar.b.b();
        zzhfr zzhfrVar = zzhfr.a;
        if (Arrays.equals(b, zzhmi.a(zzhmi.b(zzichVar.b())))) {
            return new zzhwi(zzhwoVar, zzicjVar);
        }
        defpackage.zzl.x("Ed25519 keys mismatch");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhyn, com.google.android.gms.internal.ads.zzhes
    public final zzhfj a() {
        return this.a.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhyn
    public final /* synthetic */ zzhyo c() {
        return this.a;
    }
}
