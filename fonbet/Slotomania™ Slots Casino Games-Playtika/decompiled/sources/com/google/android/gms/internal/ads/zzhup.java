package com.google.android.gms.internal.ads;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final /* synthetic */ class zzhup implements zzhlf {
    static final /* synthetic */ zzhup zza = new zzhup();

    private /* synthetic */ zzhup() {
    }

    @Override // com.google.android.gms.internal.ads.zzhlf
    public final /* synthetic */ zzhdc zza(zzhdt zzhdtVar, Integer num) {
        zzhuj zzhujVar = (zzhuj) zzhdtVar;
        int i = zzhur.zza;
        ECParameterSpec zza2 = zzhujVar.zzd().zza();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhzm.zze.zzb("EC");
        keyPairGenerator.initialize(zza2);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        zzhum zzhumVar = new zzhum(null);
        zzhumVar.zza(zzhujVar);
        zzhumVar.zzc(num);
        zzhumVar.zzb(eCPublicKey.getW());
        zzhun zzd = zzhumVar.zzd();
        zzhuk zzhukVar = new zzhuk(null);
        zzhukVar.zza(zzd);
        zzhukVar.zzb(zzian.zza(eCPrivateKey.getS(), zzhda.zza()));
        return zzhukVar.zzc();
    }
}
