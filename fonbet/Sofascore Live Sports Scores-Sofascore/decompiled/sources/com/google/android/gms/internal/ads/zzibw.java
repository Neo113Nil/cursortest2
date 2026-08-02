package com.google.android.gms.internal.ads;

import defpackage.soo;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzibw implements zzhrh {
    public final soo a;
    public final String b;
    public final SecretKeySpec c;
    public final int d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public zzibw(String str, SecretKeySpec secretKeySpec) {
        int i;
        soo sooVar = new soo(this);
        this.a = sooVar;
        if (!zzhlx.a(2)) {
            defpackage.zzl.x("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.b = str;
        this.c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i = 20;
                    this.d = i;
                    sooVar.get();
                    return;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i = 28;
                    this.d = i;
                    sooVar.get();
                    return;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i = 32;
                    this.d = i;
                    sooVar.get();
                    return;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i = 48;
                    this.d = i;
                    sooVar.get();
                    return;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i = 64;
                    this.d = i;
                    sooVar.get();
                    return;
                }
                break;
        }
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
    }

    @Override // com.google.android.gms.internal.ads.zzhrh
    public final byte[] a(int i, byte[] bArr) {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        soo sooVar = this.a;
        ((Mac) sooVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) sooVar.get()).doFinal(), i);
    }
}
