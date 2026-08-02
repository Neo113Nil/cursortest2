package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3440g9 extends AbstractC3510j2 {
    public static final C3440g9 c = new C3440g9();
    public static final AtomicBoolean d = new AtomicBoolean(true);

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j = this.a / 1000;
            if (j != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j));
            }
            int i = this.b;
            if (i > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i));
            }
            Context context = AbstractC3424fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                int i2 = Pa.a(context, "banner_audio_pref_file").a.getInt("user_mute_count", -1);
                if (i2 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i2));
                }
            }
        }
        return jSONObject;
    }
}
