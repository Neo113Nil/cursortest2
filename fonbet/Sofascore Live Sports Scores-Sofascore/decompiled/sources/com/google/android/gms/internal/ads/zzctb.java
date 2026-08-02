package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzctb implements zzcsl {
    public final Context a;
    public final com.google.android.gms.ads.internal.util.zzj b = com.google.android.gms.ads.internal.zzt.zzh().g();

    public zzctb(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void a(HashMap hashMap) {
        String str;
        if (hashMap.isEmpty() || (str = (String) hashMap.get("gad_idless")) == null) {
            return;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        this.b.zzw(parseBoolean);
        if (parseBoolean) {
            com.google.android.gms.ads.internal.util.zzac.zza(this.a);
        }
    }
}
