package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.cnn;
import defpackage.hnn;
import defpackage.zmn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbic {
    public static final zmn a(Context context, zzbhr zzbhrVar) {
        zzbib zzbibVar = new zzbib(context);
        zmn zmnVar = new zmn(zzbibVar);
        cnn cnnVar = new cnn(zzbibVar, zzbhrVar, zmnVar);
        hnn hnnVar = new hnn(zzbibVar, zmnVar);
        synchronized (zzbibVar.d) {
            zzbhq zzbhqVar = new zzbhq(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), cnnVar, hnnVar);
            zzbibVar.a = zzbhqVar;
            zzbhqVar.checkAvailabilityAndConnect();
        }
        return zmnVar;
    }
}
