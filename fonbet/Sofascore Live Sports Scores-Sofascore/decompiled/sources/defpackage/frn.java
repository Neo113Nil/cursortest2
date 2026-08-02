package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcfa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class frn extends zzcfa {
    public final /* synthetic */ QueryInfoGenerationCallback a;

    public frn(zzcak zzcakVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.a = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void J1(String str, Bundle bundle, String str2) {
        this.a.onSuccess(new QueryInfo(new zzex(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zza(String str) {
        this.a.onFailure(str);
    }
}
