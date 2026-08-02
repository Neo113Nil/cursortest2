package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzata;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzauv;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzbh extends zzauv {
    public final /* synthetic */ byte[] o;
    public final /* synthetic */ Map p;
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbl zzblVar, int i, String str, zzatx zzatxVar, zzatw zzatwVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzatxVar, zzatwVar);
        this.o = bArr;
        this.p = map;
        this.q = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauv, com.google.android.gms.internal.ads.zzats
    /* renamed from: g */
    public final void d(String str) {
        this.q.zze(str);
        super.d(str);
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final Map zzm() throws zzata {
        Map map = this.p;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final byte[] zzn() throws zzata {
        byte[] bArr = this.o;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
