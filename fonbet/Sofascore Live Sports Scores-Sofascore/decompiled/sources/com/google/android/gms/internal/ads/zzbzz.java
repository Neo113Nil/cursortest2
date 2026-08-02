package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbzz {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;
    public final String g;
    public final Bundle h;

    public zzbzz(boolean z, String str, boolean z2, boolean z3, String str2, int i, String str3, String str4) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = i;
        this.g = str3;
        Bundle bundle = null;
        if (!TextUtils.isEmpty(str4)) {
            try {
                bundle = zzbp.zzl(new JSONObject(str4));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("PlayPrewarmOptions.parseHsdpExtraQueryParams", e);
            }
        }
        this.h = bundle;
    }
}
