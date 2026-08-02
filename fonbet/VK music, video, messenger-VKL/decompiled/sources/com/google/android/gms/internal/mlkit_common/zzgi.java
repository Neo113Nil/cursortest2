package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import java.util.HashMap;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.f7r;
import xsna.mp70;
import xsna.np70;
import xsna.sq;
import xsna.yil0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
final class zzgi implements mp70 {
    static final zzgi zza = new zzgi();
    private static final f7r zzb;
    private static final f7r zzc;
    private static final f7r zzd;
    private static final f7r zze;
    private static final f7r zzf;
    private static final f7r zzg;
    private static final f7r zzh;

    static {
        zzbo b = yil0.b(1);
        HashMap hashMap = new HashMap();
        hashMap.put(b.annotationType(), b);
        zzb = new f7r(SignalingProtocol.KEY_OPTIONS, sq.a(hashMap));
        zzbo b2 = yil0.b(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b2.annotationType(), b2);
        zzc = new f7r("roughDownloadDurationMs", sq.a(hashMap2));
        zzbo b3 = yil0.b(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(b3.annotationType(), b3);
        zzd = new f7r("errorCode", sq.a(hashMap3));
        zzbo b4 = yil0.b(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(b4.annotationType(), b4);
        zze = new f7r("exactDownloadDurationMs", sq.a(hashMap4));
        zzbo b5 = yil0.b(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(b5.annotationType(), b5);
        zzf = new f7r("downloadStatus", sq.a(hashMap5));
        zzbo b6 = yil0.b(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(b6.annotationType(), b6);
        zzg = new f7r("downloadFailureStatus", sq.a(hashMap6));
        zzbo b7 = yil0.b(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(b7.annotationType(), b7);
        zzh = new f7r("mddDownloadErrorCodes", sq.a(hashMap7));
    }

    private zzgi() {
    }

    @Override // xsna.wip
    public final /* bridge */ /* synthetic */ void encode(Object obj, np70 np70Var) throws IOException {
        zzlk zzlkVar = (zzlk) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(zzb, zzlkVar.zzc());
        np70Var2.add(zzc, zzlkVar.zzf());
        np70Var2.add(zzd, zzlkVar.zza());
        np70Var2.add(zze, zzlkVar.zze());
        np70Var2.add(zzf, zzlkVar.zzb());
        np70Var2.add(zzg, zzlkVar.zzd());
        np70Var2.add(zzh, (Object) null);
    }
}
