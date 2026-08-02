package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbw implements zzfdg {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public zzfbw(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfml.e("pn", bundle, this.a);
        Integer num = this.b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        zzfml.e("vnm", bundle, this.c);
        zzfml.e("dl", bundle, this.d);
        zzfml.e("ins_pn", bundle, this.e);
        zzfml.e("ini_pn", bundle, this.f);
    }
}
