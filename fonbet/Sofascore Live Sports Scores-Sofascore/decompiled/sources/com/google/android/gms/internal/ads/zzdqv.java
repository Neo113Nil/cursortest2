package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbp;
import com.ironsource.V3;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdqv extends zzdqw {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final JSONObject h;

    public zzdqv(zzfld zzfldVar, JSONObject jSONObject) {
        super(zzfldVar);
        this.b = zzbp.zzi(jSONObject, "tracking_urls_and_actions", "active_view");
        this.c = zzbp.zzj(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = zzbp.zzj(false, jSONObject, V3.c, "allow_pub_rendering");
        this.e = zzbp.zzj(false, jSONObject, "enable_omid");
        this.g = zzbp.zzk("", jSONObject, "watermark_overlay_png_base64");
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final boolean a() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final boolean b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final boolean c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final boolean d() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final String e() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzdqw
    public final zzflz f() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new zzflz(jSONObject) : this.a.V;
    }
}
