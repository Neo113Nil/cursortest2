package com.google.android.gms.internal.ads;

import defpackage.a70;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhzj implements zzhfn {
    public static final byte[] a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static zzhzj a(zzhwi zzhwiVar) {
        Provider a2 = zzhmb.a();
        if (a2 == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        zzicj zzicjVar = zzhwiVar.b;
        zzhwo zzhwoVar = zzhwiVar.a;
        zzhfr zzhfrVar = zzhfr.a;
        byte[] b = zzicjVar.a.b();
        zzhwoVar.c.b();
        zzhwoVar.a.a.getClass();
        zzhzj zzhzjVar = new zzhzj();
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        if (b.length != 32) {
            a70.p("Given private key's length is not 32");
            return null;
        }
        KeyFactory.getInstance("Ed25519", a2).generatePrivate(new PKCS8EncodedKeySpec(zziat.a(a, b)));
        return zzhzjVar;
    }
}
