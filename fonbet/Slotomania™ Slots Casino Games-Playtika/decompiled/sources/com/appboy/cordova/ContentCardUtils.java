package com.appboy.cordova;

import android.util.Log;
import com.braze.enums.CardType;
import com.braze.models.cards.BannerImageCard;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.ironsource.X3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ContentCardUtils {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) ContentCardUtils.class);

    public static Card getCardById(List<Card> list, String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            Log.w(TAG, "Cannot get card by null or empty card id. Returning null.");
            return null;
        }
        if (list == null || list.isEmpty()) {
            Log.w(TAG, "Cannot find card in null or empty card list. Returning null.");
            return null;
        }
        for (Card card : list) {
            if (card.getId().equals(str)) {
                return card;
            }
        }
        Log.w(TAG, "Failed to find card by id " + str + " in list of cards: " + list + "\nReturning null.");
        return null;
    }

    public static JSONArray mapContentCards(List<Card> list) {
        JSONArray jSONArray = new JSONArray();
        for (Card card : list) {
            try {
                jSONArray.put(mapContentCardFields(card));
            } catch (JSONException e) {
                BrazeLogger.e(TAG, "Failed to map content card fields to JSON. Card: " + card, e);
            }
        }
        return jSONArray;
    }

    private static JSONObject mapContentCardFields(Card card) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", card.getId());
        jSONObject.put("created", card.getCreated());
        jSONObject.put("expiresAt", card.getExpiresAt());
        jSONObject.put("viewed", card.getWasViewedInternal());
        jSONObject.put("clicked", card.getIsClicked());
        jSONObject.put("pinned", card.getIsPinned());
        jSONObject.put("dismissed", card.getIsDismissedInternal());
        jSONObject.put("dismissible", card.getIsDismissibleByUser());
        jSONObject.put("url", card.getUrl());
        jSONObject.put("openURLInWebView", card.getOpenUriInWebView());
        jSONObject.put("extras", new JSONObject(card.getExtras()));
        int i = AnonymousClass1.$SwitchMap$com$braze$enums$CardType[card.getCardType().ordinal()];
        if (i == 1) {
            mapBannerImageCardFields(jSONObject, (BannerImageCard) card);
            return jSONObject;
        }
        if (i == 2) {
            mapCaptionedImageCardFields(jSONObject, (CaptionedImageCard) card);
            return jSONObject;
        }
        if (i == 3) {
            mapShortNewsCardFields(jSONObject, (ShortNewsCard) card);
            return jSONObject;
        }
        if (i != 4) {
            return jSONObject;
        }
        mapTextAnnouncementCardFields(jSONObject, (TextAnnouncementCard) card);
        return jSONObject;
    }

    /* renamed from: com.appboy.cordova.ContentCardUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$braze$enums$CardType;

        static {
            int[] iArr = new int[CardType.values().length];
            $SwitchMap$com$braze$enums$CardType = iArr;
            try {
                iArr[CardType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$braze$enums$CardType[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$braze$enums$CardType[CardType.SHORT_NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$braze$enums$CardType[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void mapCaptionedImageCardFields(JSONObject jSONObject, CaptionedImageCard captionedImageCard) throws JSONException {
        jSONObject.put("image", captionedImageCard.getImageUrl());
        jSONObject.put("imageAspectRatio", captionedImageCard.getAspectRatio());
        jSONObject.put("title", captionedImageCard.getTitle());
        jSONObject.put("cardDescription", captionedImageCard.getDescription());
        jSONObject.put(X3.j.D, captionedImageCard.getDomain());
        jSONObject.put("type", "Captioned");
    }

    private static void mapShortNewsCardFields(JSONObject jSONObject, ShortNewsCard shortNewsCard) throws JSONException {
        jSONObject.put("image", shortNewsCard.getImageUrl());
        jSONObject.put("title", shortNewsCard.getTitle());
        jSONObject.put("cardDescription", shortNewsCard.getDescription());
        jSONObject.put(X3.j.D, shortNewsCard.getDomain());
        jSONObject.put("type", "Classic");
    }

    private static void mapTextAnnouncementCardFields(JSONObject jSONObject, TextAnnouncementCard textAnnouncementCard) throws JSONException {
        jSONObject.put("title", textAnnouncementCard.getTitle());
        jSONObject.put("cardDescription", textAnnouncementCard.getDescription());
        jSONObject.put(X3.j.D, textAnnouncementCard.getDomain());
        jSONObject.put("type", "Classic");
    }

    private static void mapBannerImageCardFields(JSONObject jSONObject, BannerImageCard bannerImageCard) throws JSONException {
        jSONObject.put("image", bannerImageCard.getImageUrl());
        jSONObject.put("imageAspectRatio", bannerImageCard.getAspectRatio());
        jSONObject.put(X3.j.D, bannerImageCard.getDomain());
        jSONObject.put("type", "Banner");
    }
}
