package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfya extends zzfxv {
    @Override // com.google.android.gms.internal.ads.zzfxw, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        zzfwk zzfwkVar;
        if (!TextUtils.isEmpty(str) && (zzfwkVar = zzfwk.c) != null) {
            for (zzfvq zzfvqVar : Collections.unmodifiableCollection(zzfwkVar.a)) {
                if (this.c.contains(zzfvqVar.g)) {
                    zzfxa zzfxaVar = zzfvqVar.d;
                    if (this.e >= zzfxaVar.c) {
                        zzfxaVar.d = 2;
                        zzfwr.a.a(zzfxaVar.c(), "setNativeViewHierarchy", str, zzfxaVar.a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        zzfxo zzfxoVar = this.b;
        JSONObject jSONObject = zzfxoVar.a;
        JSONObject jSONObject2 = this.d;
        if (zzfxg.e(jSONObject2, jSONObject)) {
            return null;
        }
        zzfxoVar.a = jSONObject2;
        return jSONObject2.toString();
    }
}
