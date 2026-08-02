package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzafi implements zzafj {
    static final /* synthetic */ zzafi zza = new zzafi();

    private /* synthetic */ zzafi() {
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final /* synthetic */ Constructor zza() {
        int i = zzafl.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzafp.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
