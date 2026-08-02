package com.google.android.gms.internal.ads;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import defpackage.b1g;
import defpackage.oco;
import defpackage.pco;
import defpackage.uh2;
import defpackage.xh2;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgfn implements zzgfh {
    public final ExecutorService a;
    public final String b;
    public final long c;

    public zzgfn(ExecutorService executorService, String str, long j) {
        this.a = executorService;
        this.b = str;
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final xh2 a(String str, byte[] bArr) {
        return b(str, true, bArr, CommonGatewayClient.HEADER_PROTOBUF);
    }

    public final xh2 b(String str, boolean z, byte[] bArr, String str2) {
        uh2 uh2Var = new uh2();
        uh2Var.c = new b1g();
        xh2 xh2Var = new xh2(uh2Var);
        uh2Var.b = xh2Var;
        uh2Var.a = pco.class;
        try {
            this.a.execute(new oco(this, str, uh2Var, z, str2, bArr));
            uh2Var.a = "";
            return xh2Var;
        } catch (Exception e) {
            xh2Var.b(e);
            return xh2Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final xh2 zza(String str) {
        return b(str, false, new byte[0], null);
    }
}
