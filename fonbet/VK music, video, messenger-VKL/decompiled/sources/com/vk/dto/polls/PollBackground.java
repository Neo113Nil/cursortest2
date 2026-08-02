package com.vk.dto.polls;

import android.graphics.Color;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.PollGradient;
import com.vk.dto.polls.PollTile;
import com.vk.log.L;
import com.vk.stickers.api.styles.StickerCommonStyle;
import io.appmetrica.analytics.impl.L2;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bxx;
import xsna.go9;
import xsna.ro;
import xsna.zcl;

/* compiled from: PollBackgrounds.kt */
/* loaded from: classes18.dex */
public abstract class PollBackground extends Serializer.StreamParcelableAdapter implements bxx {
    public final int b;
    public final int c;

    /* compiled from: PollBackgrounds.kt */
    public static final class a {
        public static PollBackground a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("photo");
            if (optJSONObject != null) {
                Serializer.c<PhotoPoll> cVar = PhotoPoll.CREATOR;
                return PhotoPoll.a.a(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(L2.g);
            if (optJSONObject2 == null) {
                return null;
            }
            String string = optJSONObject2.getString("type");
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != 3560110) {
                    if (hashCode != 89650992) {
                        if (hashCode == 94842723 && string.equals("color")) {
                            Serializer.c<PollContentColor> cVar2 = PollContentColor.CREATOR;
                            StickerCommonStyle.a aVar = StickerCommonStyle.Companion;
                            String string2 = optJSONObject2.getString(TtmlNode.TAG_STYLE);
                            StickerCommonStyle stickerCommonStyle = StickerCommonStyle.DARK;
                            aVar.getClass();
                            return new PollContentColor(optJSONObject2.getInt("id"), Color.parseColor("#" + optJSONObject2.optString("color", "566060")), StickerCommonStyle.a.a(string2, stickerCommonStyle));
                        }
                    } else if (string.equals("gradient")) {
                        Serializer.c<PollGradient> cVar3 = PollGradient.CREATOR;
                        return PollGradient.a.a(optJSONObject2);
                    }
                } else if (string.equals("tile")) {
                    Serializer.c<PollTile> cVar4 = PollTile.CREATOR;
                    return PollTile.a.a(optJSONObject2);
                }
            }
            throw new Exception(go9.b("Illegal poll background type = ", string));
        }
    }

    public PollBackground(int i, int i2, zcl zclVar) {
        this.b = i;
        this.c = i2;
    }

    public JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            ro.d(16);
            jSONObject.put("id", this.b).put("color", Long.toString(this.c & 4294967295L, 16));
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return getClass().equals(obj != null ? obj.getClass() : null) && this.b == ((PollBackground) obj).b;
    }

    public final int getId() {
        return this.b;
    }

    public int hashCode() {
        return this.b;
    }
}
