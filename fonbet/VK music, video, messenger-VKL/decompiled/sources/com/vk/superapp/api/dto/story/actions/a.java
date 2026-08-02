package com.vk.superapp.api.dto.story.actions;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.actions.WebActionEmoji;
import com.vk.superapp.api.dto.story.actions.WebActionQuestion;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.f370;
import xsna.fkq0;
import xsna.go9;
import xsna.gzs;
import xsna.rl3;
import xsna.s3q0;
import xsna.zr;

/* compiled from: WebStickerAction.kt */
/* loaded from: classes6.dex */
public final class a {
    public static final a a = new a();

    /* compiled from: WebStickerAction.kt */
    /* renamed from: com.vk.superapp.api.dto.story.actions.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1863a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebStickerType.values().length];
            try {
                iArr[WebStickerType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebStickerType.HASHTAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebStickerType.MENTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebStickerType.GEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WebStickerType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WebStickerType.TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WebStickerType.QUESTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WebStickerType.EMOJI.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WebStickerType.STICKER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WebStickerType.MARKET_ITEM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WebStickerType.SERVICE_YC_ITEM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WebStickerType.APP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[WebStickerType.AUDIO_TRACK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final StickerAction a(JSONObject jSONObject) {
        UserId userId;
        WebStickerType.a aVar = WebStickerType.Companion;
        String string = jSONObject.getString("action_type");
        aVar.getClass();
        WebStickerType a2 = WebStickerType.a.a(string);
        if (a2 == WebStickerType.SITUATIONAL_THEME) {
            return new WebActionSituationalTheme();
        }
        if (a2 == WebStickerType.SITUATIONAL_TEMPLATE) {
            return jSONObject.has("action") ? new WebActionSituationalTemplate(jSONObject) : new WebActionSituationalTemplate(0, null, 3, null);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("action");
        switch (a2 == null ? -1 : C1863a.$EnumSwitchMapping$0[a2.ordinal()]) {
            case 1:
                Serializer.c<WebActionText> cVar = WebActionText.CREATOR;
                return new WebActionText(jSONObject2.getString("text"), jSONObject2.optString(TtmlNode.TAG_STYLE, null), jSONObject2.optString("background_style", null), jSONObject2.optString("alignment", null), jSONObject2.optString("selection_color", null), f370.u("font_size", jSONObject2), f370.u("font_size_px", jSONObject2));
            case 2:
                return new WebActionHashtag(jSONObject2.getString("hashtag"), jSONObject2.optString(TtmlNode.TAG_STYLE, null));
            case 3:
                return new WebActionMention(jSONObject2.getString("mention"), jSONObject2.optString(TtmlNode.TAG_STYLE, null));
            case 4:
                Serializer.c<WebActionPlace> cVar2 = WebActionPlace.CREATOR;
                int i = jSONObject2.getInt("place_id");
                String string2 = jSONObject2.getString("title");
                int optInt = jSONObject2.optInt("category_id", -1);
                return new WebActionPlace(i, string2, optInt == -1 ? null : Integer.valueOf(optInt), jSONObject2.optString(TtmlNode.TAG_STYLE, null), jSONObject2.optString("subtitle", null));
            case 5:
                return new WebActionLink(jSONObject2.getString("link"), jSONObject2.optString("tooltip_text_key", null), jSONObject2.optString("text", null), jSONObject2.optString(TtmlNode.TAG_STYLE, null));
            case 6:
                Serializer.c<WebActionTime> cVar3 = WebActionTime.CREATOR;
                String optString = jSONObject2.optString(TtmlNode.TAG_STYLE, "date");
                if (!rl3.G(new String[]{"black", "white", "green", "text", "date", "memories"}, optString)) {
                    throw new JSONException(go9.b("Not supported style ", optString));
                }
                long optLong = jSONObject2.optLong("timestamp_ms", -1L);
                Long valueOf = optLong == -1 ? null : Long.valueOf(optLong);
                String optString2 = jSONObject2.optString("title", null);
                String optString3 = jSONObject2.optString("date", null);
                if (valueOf == null || optString3 == null) {
                    return new WebActionTime(optString, valueOf, optString2, optString3);
                }
                throw new JSONException("You can't pass both ");
            case 7:
                Serializer.c<WebActionQuestion> cVar4 = WebActionQuestion.CREATOR;
                return WebActionQuestion.a.a(jSONObject2);
            case 8:
                Serializer.c<WebActionEmoji> cVar5 = WebActionEmoji.CREATOR;
                String string3 = jSONObject2.getString("emoji");
                String a3 = WebActionEmoji.a.a(string3);
                if (a3 == null || !rl3.G(WebActionEmoji.d, a3)) {
                    throw new JSONException(zr.a("Emoji ", string3, " not supported"));
                }
                return new WebActionEmoji(string3);
            case 9:
                return new WebActionSticker(jSONObject2.getInt("sticker_id"), jSONObject2.optInt("pack_id", 0));
            case 10:
                String string4 = jSONObject2.getString("title");
                Long z = f370.z(jSONObject2, "product_id");
                Long z2 = f370.z(jSONObject2, "owner_id");
                if (z2 != null) {
                    long longValue = z2.longValue();
                    gzs<s3q0> gzsVar = fkq0.a;
                    userId = new UserId(longValue);
                } else {
                    userId = null;
                }
                return new WebActionMarketItem(string4, z, userId, jSONObject2.optString("link", null));
            case 11:
                return new WebActionServiceYcItem(jSONObject2.optString(TtmlNode.TAG_STYLE, null));
            case 12:
                return new WebActionApp(jSONObject2.getInt("app_id"), jSONObject2.optString(X3.i.L0, null));
            case 13:
                return new WebActionAudioTrack(jSONObject2.getString("audio_track_id"), jSONObject2.getString("audio_track_performer"), jSONObject2.getString("audio_track_title"), jSONObject2.has("audio_track_album") ? jSONObject2.getString("audio_track_album") : "", jSONObject2.optString("audio_track_thumb"), jSONObject2.optInt("start_from", 0));
            default:
                throw new JSONException("not supported action type " + a2);
        }
    }
}
