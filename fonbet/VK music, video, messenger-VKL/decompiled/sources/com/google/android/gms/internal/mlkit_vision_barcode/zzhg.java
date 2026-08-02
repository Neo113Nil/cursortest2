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
final class zzhg implements mp70 {
    static final zzhg zza = new zzhg();
    private static final f7r zzb;
    private static final f7r zzc;

    static {
        zzdk a = pft0.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(a.annotationType(), a);
        zzb = new f7r(SignalingProtocol.KEY_OPTIONS, sq.a(hashMap));
        zzdk a2 = pft0.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a2.annotationType(), a2);
        zzc = new f7r("errorCode", sq.a(hashMap2));
    }

    private zzhg() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        throw null;
    }
}
