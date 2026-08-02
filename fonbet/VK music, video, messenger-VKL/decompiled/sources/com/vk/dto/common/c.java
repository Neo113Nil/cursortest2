package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: VideoFileFactory.kt */
/* loaded from: classes18.dex */
public final class c {
    public static final VideoFileOld a(Serializer serializer) {
        String H = serializer.H();
        if (H != null) {
            int hashCode = H.hashCode();
            if (hashCode != 1302572792) {
                if (hashCode != 1591703009) {
                    if (hashCode == 1844104930 && H.equals("interactive")) {
                        return new InteractiveVideoFile(serializer);
                    }
                } else if (H.equals("music_video")) {
                    return new MusicVideoFile(serializer);
                }
            } else if (H.equals("short_video")) {
                return new ClipVideoFile(serializer);
            }
        }
        return new VideoFileOld(serializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final VideoFileOld b(JSONObject jSONObject) {
        String optString = jSONObject.optString("type", "video");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != 1302572792) {
                if (hashCode != 1591703009) {
                    if (hashCode == 1844104930 && optString.equals("interactive")) {
                        return new InteractiveVideoFile(jSONObject);
                    }
                } else if (optString.equals("music_video")) {
                    return new MusicVideoFile(jSONObject, null, 2, 0 == true ? 1 : 0);
                }
            } else if (optString.equals("short_video")) {
                return new ClipVideoFile(jSONObject, null, null, null, 8, null);
            }
        }
        return new VideoFileOld(jSONObject);
    }

    public static final VideoFileOld c(JSONObject jSONObject, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Map map) {
        String optString = jSONObject.optString("type", "video");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != 1302572792) {
                if (hashCode != 1591703009) {
                    if (hashCode == 1844104930 && optString.equals("interactive")) {
                        return new InteractiveVideoFile(jSONObject);
                    }
                } else if (optString.equals("music_video")) {
                    return new MusicVideoFile(jSONObject, linkedHashMap2);
                }
            } else if (optString.equals("short_video")) {
                return new ClipVideoFile(jSONObject, linkedHashMap, linkedHashMap2, map);
            }
        }
        return new VideoFileOld(jSONObject);
    }
}
