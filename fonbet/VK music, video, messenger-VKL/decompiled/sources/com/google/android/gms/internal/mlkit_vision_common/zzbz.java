package com.google.android.gms.internal.mlkit_vision_common;

import java.io.IOException;
import java.util.HashMap;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.f7r;
import xsna.mp70;
import xsna.np70;
import xsna.sq;
import xsna.zyk0;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes12.dex */
final class zzbz implements mp70 {
    static final zzbz zza = new zzbz();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;
    private static final f7r zze;
    private static final f7r zzf;
    private static final f7r zzg;
    private static final f7r zzh;

    static {
        zzai b = zyk0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r("errorCode", sq.a(hashMap));
        zzai b2 = zyk0.b(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("hasResult", sq.a(hashMap2));
        zzai b3 = zyk0.b(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(b3.annotationType(), b3);
        zzd = new f7r("isColdCall", sq.a(hashMap3));
        zzai b4 = zyk0.b(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(b4.annotationType(), b4);
        zze = new f7r("imageInfo", sq.a(hashMap4));
        zzai b5 = zyk0.b(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(b5.annotationType(), b5);
        zzf = new f7r(SignalingProtocol.KEY_OPTIONS, sq.a(hashMap5));
        zzai b6 = zyk0.b(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(b6.annotationType(), b6);
        zzg = new f7r("detectedBarcodeFormats", sq.a(hashMap6));
        zzai b7 = zyk0.b(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(b7.annotationType(), b7);
        zzh = new f7r("detectedBarcodeValueTypes", sq.a(hashMap7));
    }

    private zzbz() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        throw null;
    }
}
