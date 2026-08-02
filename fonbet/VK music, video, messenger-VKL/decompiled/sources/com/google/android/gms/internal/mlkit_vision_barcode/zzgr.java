package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import java.util.HashMap;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.f7r;
import xsna.mp70;
import xsna.np70;
import xsna.pft0;
import xsna.sq;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
final class zzgr implements mp70 {
    static final zzgr zza = new zzgr();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;
    private static final f7r zze;
    private static final f7r zzf;
    private static final f7r zzg;

    static {
        zzdk a = pft0.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(a.annotationType(), a);
        zzb = new f7r("cameraSource", sq.a(hashMap));
        zzdk a2 = pft0.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a2.annotationType(), a2);
        zzc = new f7r(SignalingProtocol.KEY_EVENT_TYPE, sq.a(hashMap2));
        zzdk a3 = pft0.a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(a3.annotationType(), a3);
        zzd = new f7r("requestedPreviewHeight", sq.a(hashMap3));
        zzdk a4 = pft0.a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(a4.annotationType(), a4);
        zze = new f7r("requestedPreviewWidth", sq.a(hashMap4));
        zzdk a5 = pft0.a(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(a5.annotationType(), a5);
        zzf = new f7r("actualPreviewHeight", sq.a(hashMap5));
        zzdk a6 = pft0.a(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(a6.annotationType(), a6);
        zzg = new f7r("actualPreviewWidth", sq.a(hashMap6));
    }

    private zzgr() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        throw null;
    }
}
