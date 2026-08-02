package defpackage;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class swm {
    public int a;
    public int b;
    public long c;
    public double d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 307200;
    public int r = 1;

    public final String a() {
        if (TextUtils.isEmpty(this.j)) {
            this.j = mwm.a(this.g);
        }
        return this.j;
    }

    public final int b() {
        int i = this.q;
        if (i < 0) {
            i = 307200;
            this.q = 307200;
        }
        long j = i;
        long j2 = this.c;
        if (j <= j2) {
            return i;
        }
        int i2 = (int) j2;
        this.q = i2;
        return i2;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", this.a);
            jSONObject.put("cover_url", this.f);
            jSONObject.put("cover_width", this.b);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.h);
            jSONObject.put("file_hash", a());
            jSONObject.put("resolution", this.e);
            jSONObject.put("size", this.c);
            jSONObject.put("video_duration", this.d);
            jSONObject.put("video_url", this.g);
            jSONObject.put("playable_download_url", this.i);
            jSONObject.put("if_playable_loading_show", this.m);
            jSONObject.put("remove_loading_page_type", this.n);
            jSONObject.put("fallback_endcard_judge", this.k);
            jSONObject.put("video_preload_size", b());
            jSONObject.put("reward_video_cached_type", this.o);
            jSONObject.put("execute_cached_type", this.p);
            jSONObject.put("endcard_render", this.l);
            jSONObject.put("replay_time", this.r);
            jSONObject.put("play_speed_ratio", -1.0d);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
