package com.vk.dto.user;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.status.StatusImagePopup;
import com.vk.dto.status.StatusImagePopupPhoto;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.wq;

/* compiled from: ImageStatusParser.java */
@Deprecated
/* loaded from: classes18.dex */
public final class a {
    public static ImageStatus a(JSONObject jSONObject) throws JSONException {
        String optString = jSONObject.optString("title");
        Image image = new Image(jSONObject.getJSONArray("image"));
        int optInt = jSONObject.optInt("emoji_id");
        String optString2 = jSONObject.optString("event_name");
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        Image image2 = optJSONArray != null ? new Image(optJSONArray) : null;
        StatusImagePopupPhoto statusImagePopupPhoto = image2 != null ? new StatusImagePopupPhoto("custom", image2) : null;
        String optString3 = jSONObject.optString("title");
        String optString4 = jSONObject.optString("text");
        JSONObject optJSONObject = jSONObject.optJSONObject("button");
        if (optJSONObject != null && !optJSONObject.has(TtmlNode.TAG_STYLE)) {
            optJSONObject.put(TtmlNode.TAG_STYLE, "primary");
        }
        LinkButton linkButton = optJSONObject != null ? new LinkButton(optJSONObject) : null;
        StatusImagePopup statusImagePopup = new StatusImagePopup(null, null, statusImagePopupPhoto, optString3, optString4, null, linkButton != null ? Collections.singletonList(linkButton) : null, null, true, null);
        Serializer.c<ImageStatus> cVar = ImageStatus.CREATOR;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("tags");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i = wq.b(optJSONArray2, i, arrayList, i, 1)) {
            }
        }
        return new ImageStatus(optInt, optString, image, arrayList, optInt, optString2, statusImagePopup);
    }

    @Nullable
    public static ImageStatus b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("image_status")) {
            return c(jSONObject.getJSONObject("image_status"));
        }
        if (jSONObject.has("emoji_status")) {
            return a(jSONObject.getJSONObject("emoji_status"));
        }
        return null;
    }

    public static ImageStatus c(JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("id");
        String optString = jSONObject.optString("name");
        Image image = new Image(jSONObject.getJSONArray("images"));
        Serializer.c<ImageStatus> cVar = ImageStatus.CREATOR;
        JSONArray optJSONArray = jSONObject.optJSONArray("tags");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i = wq.b(optJSONArray, i, arrayList, i, 1)) {
            }
        }
        return new ImageStatus(optInt, optString, image, arrayList);
    }
}
