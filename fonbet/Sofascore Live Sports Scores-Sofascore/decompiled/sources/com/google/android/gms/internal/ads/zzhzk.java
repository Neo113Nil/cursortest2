package com.google.android.gms.internal.ads;

import defpackage.a70;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhzk implements zzhfo {
    public static final byte[] e = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    public final PublicKey a;
    public final byte[] b;
    public final byte[] c;
    public final Provider d;

    public zzhzk(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) {
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Can not use Ed25519 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            a70.p("Given public key's length is not 32.");
            throw null;
        }
        this.a = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(zziat.a(e, bArr)));
        this.b = bArr2;
        this.c = bArr3;
        this.d = provider;
    }

    public static zzhzk a(zzhwo zzhwoVar) {
        Provider a = zzhmb.a();
        if (a == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (zzhlx.a(1)) {
            return new zzhzk(zzhwoVar.b.b(), zzhwoVar.c.b(), zzhwoVar.a.a.equals(zzhwg.d) ? new byte[]{0} : new byte[0], a);
        }
        defpackage.zzl.x("Can not use Ed25519 in FIPS-mode.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            defpackage.zzl.x("Invalid signature length: 64");
            return;
        }
        if (!zzhpd.c(bArr3, bArr)) {
            defpackage.zzl.x("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance("Ed25519", this.d);
        signature.initVerify(this.a);
        signature.update(bArr2);
        signature.update(this.c);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        defpackage.zzl.x("Signature check failed.");
    }
}
