package com.vk.api.video;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.log.L;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.fkq0;
import xsna.ncq0;
import xsna.rsg0;

/* loaded from: classes15.dex */
public final class VideoSave extends rsg0<a> {

    public enum Target {
        VIDEO("video"),
        MESSAGES("messages"),
        COMMENT("comment"),
        BOARD("board"),
        POST("post"),
        CHANNEL("channel");

        private final String value;

        Target(String str) {
            this.value = str;
        }

        public static Target a(String str) {
            for (Target target : values()) {
                if (str.equals(target.value)) {
                    return target;
                }
            }
            return VIDEO;
        }

        public final String h() {
            return this.value;
        }
    }

    public static class a {
        public ncq0 a;
        public String b;
        public int c;
        public String d;
        public String e;
        public int f;
        public int g;
        public long h;
        public long i;
        public double j;
    }

    public VideoSave(UserId userId, String str, String str2, Target target, boolean z, boolean z2, String str3, String str4, OrdData ordData, Long l, List list, int i, Long l2, boolean z3) {
        super("video.save");
        if (userId.b < 0) {
            F(fkq0.e(userId), "group_id");
        }
        if (!TextUtils.isEmpty(str)) {
            K("name", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            K("description", str2);
        }
        if (z) {
            C(1, "preview");
        }
        if (z2) {
            R("is_united_video_upload", true);
        }
        if (!TextUtils.isEmpty(str3)) {
            K("privacy_view", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            K("privacy_comment", str4);
        }
        if (l != null && l.longValue() > 0) {
            D(l.longValue(), "file_size");
        }
        if (list != null && !list.isEmpty()) {
            G("attach_short_videos", list);
        }
        if (l2.longValue() > 0) {
            C((int) (l2.longValue() / 1000), "publish_date");
        }
        if (ordData != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_ads", true);
                jSONObject.put("advertisers", new JSONArray().put(new JSONObject().put("er_id", ordData.d).put("ord_pred_id", ordData.c)));
                K("ord_info", jSONObject.toString());
            } catch (JSONException e) {
                L.i(e);
            }
        }
        if (i >= 0) {
            C(i, "donut_level_id");
        }
        K("target", target == null ? Target.VIDEO.h() : target.h());
        R("disable_convert_clip", true);
        if (z3) {
            C(1, "wallpost");
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(@NonNull JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            a aVar = new a();
            ncq0 ncq0Var = ncq0.d;
            aVar.a = ncq0.a.b(jSONObject2);
            aVar.c = jSONObject2.getInt("video_id");
            aVar.b = jSONObject2.optString("access_key");
            aVar.d = jSONObject2.optString("generated_title");
            aVar.e = jSONObject2.optString("title");
            if (jSONObject2.optJSONObject("upload_config") == null) {
                aVar.f = -1;
                aVar.g = -1;
                aVar.h = -1L;
                aVar.i = -1L;
                aVar.j = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                return aVar;
            }
            aVar.f = jSONObject2.optInt("retry_count", -1);
            aVar.g = jSONObject2.optInt("upload_channels_count", -1);
            jSONObject2.optBoolean("background_upload_enabled", true);
            aVar.h = jSONObject2.optLong("min_delay", -1L);
            aVar.i = jSONObject2.optLong("max_delay", -1L);
            aVar.j = jSONObject2.optDouble("factor", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            return aVar;
        } catch (Exception e) {
            L.g("vk", e);
            return null;
        }
    }
}
