package com.braze.enums;

import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.appevents.UserDataStore;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b/\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, d2 = {"Lcom/braze/enums/CardKey;", "", "", "feedKey", "Ljava/lang/String;", "getFeedKey", "()Ljava/lang/String;", "contentCardsKey", "getContentCardsKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "Provider", "ID", "VIEWED", DebugCoroutineInfoImplKt.CREATED, "EXPIRES_AT", "EXTRAS", "OPEN_URI_IN_WEBVIEW", "TYPE", "CATEGORIES", "UPDATED", "DISMISSED", "REMOVED", "PINNED", "DISMISSIBLE", "IS_TEST", "READ", "CLICKED", "BANNER_IMAGE_IMAGE", "BANNER_IMAGE_URL", "BANNER_IMAGE_DOMAIN", "BANNER_IMAGE_ASPECT_RATIO", "CAPTIONED_IMAGE_IMAGE", "CAPTIONED_IMAGE_TITLE", "CAPTIONED_IMAGE_DESCRIPTION", "CAPTIONED_IMAGE_URL", "CAPTIONED_IMAGE_DOMAIN", "CAPTIONED_IMAGE_ASPECT_RATIO", "TEXT_ANNOUNCEMENT_TITLE", "TEXT_ANNOUNCEMENT_DESCRIPTION", "TEXT_ANNOUNCEMENT_URL", "TEXT_ANNOUNCEMENT_DOMAIN", "SHORT_NEWS_IMAGE", "SHORT_NEWS_TITLE", "SHORT_NEWS_DESCRIPTION", "SHORT_NEWS_URL", "SHORT_NEWS_DOMAIN", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public enum CardKey {
    ID("id", "id"),
    VIEWED("viewed", "v"),
    CREATED("created", "ca"),
    EXPIRES_AT("expires_at", "ea"),
    EXTRAS("extras", "e"),
    OPEN_URI_IN_WEBVIEW(InAppMessageBase.OPEN_URI_IN_WEBVIEW, "uw"),
    TYPE("type", "tp"),
    CATEGORIES("categories", ""),
    UPDATED("updated", ""),
    DISMISSED("", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE),
    REMOVED("", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ),
    PINNED("", "p"),
    DISMISSIBLE("", UserDataStore.DATE_OF_BIRTH),
    IS_TEST("", Constants.BRAZE_PUSH_TITLE_KEY),
    READ("", "read"),
    CLICKED("", "cl"),
    BANNER_IMAGE_IMAGE("image", "i"),
    BANNER_IMAGE_URL("url", "u"),
    BANNER_IMAGE_DOMAIN(X3.j.D, ""),
    BANNER_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    CAPTIONED_IMAGE_IMAGE("image", "i"),
    CAPTIONED_IMAGE_TITLE("title", TtmlNode.TAG_TT),
    CAPTIONED_IMAGE_DESCRIPTION("description", "ds"),
    CAPTIONED_IMAGE_URL("url", "u"),
    CAPTIONED_IMAGE_DOMAIN(X3.j.D, "dm"),
    CAPTIONED_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    TEXT_ANNOUNCEMENT_TITLE("title", TtmlNode.TAG_TT),
    TEXT_ANNOUNCEMENT_DESCRIPTION("description", "ds"),
    TEXT_ANNOUNCEMENT_URL("url", "u"),
    TEXT_ANNOUNCEMENT_DOMAIN(X3.j.D, "dm"),
    SHORT_NEWS_IMAGE("image", "i"),
    SHORT_NEWS_TITLE("title", TtmlNode.TAG_TT),
    SHORT_NEWS_DESCRIPTION("description", "ds"),
    SHORT_NEWS_URL("url", "u"),
    SHORT_NEWS_DOMAIN(X3.j.D, "dm");

    private final String contentCardsKey;
    private final String feedKey;
    private static final String BANNER_IMAGE_KEY = "banner_image";
    private static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    private static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    private static final String SHORT_NEWS_KEY = "short_news";
    private static final String CONTROL_KEY = "control";
    private static final Map<String, CardType> cardTypeMap = MapsKt.mapOf(TuplesKt.to(BANNER_IMAGE_KEY, CardType.BANNER), TuplesKt.to(CAPTIONED_IMAGE_KEY, CardType.CAPTIONED_IMAGE), TuplesKt.to(TEXT_ANNOUNCEMENT_KEY, CardType.TEXT_ANNOUNCEMENT), TuplesKt.to(SHORT_NEWS_KEY, CardType.SHORT_NEWS), TuplesKt.to(CONTROL_KEY, CardType.CONTROL));

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/braze/enums/CardKey$Provider;", "", "Lcom/braze/enums/CardKey;", "key", "", "getKey", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/enums/CardType;", "getCardTypeFromJson", "cardType", "getServerKeyFromCardType", "", "isContentCardProvider", "Z", "()Z", "<init>", "(Z)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class Provider {
        private final boolean isContentCardProvider;
        public static final Provider CONTENT_CARDS = new Provider(true);
        public static final Provider NEWS_FEED = new Provider(false);

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            final /* synthetic */ JSONObject b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(JSONObject jSONObject) {
                super(0);
                this.b = jSONObject;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Short News card doesn't contain image url, parsing type as Text Announcement. JSON: ", this.b);
            }
        }

        public Provider(boolean z) {
            this.isContentCardProvider = z;
        }

        public final CardType getCardTypeFromJson(JSONObject jsonObject) {
            String optionalString;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String optionalString2 = JsonUtils.getOptionalString(jsonObject, getKey(CardKey.TYPE));
            if (optionalString2 != null && optionalString2.length() != 0 && this.isContentCardProvider && Intrinsics.areEqual(optionalString2, CardKey.SHORT_NEWS_KEY) && ((optionalString = JsonUtils.getOptionalString(jsonObject, getKey(CardKey.SHORT_NEWS_IMAGE))) == null || optionalString.length() == 0)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(jsonObject), 2, (Object) null);
                optionalString2 = CardKey.TEXT_ANNOUNCEMENT_KEY;
            }
            return CardKey.cardTypeMap.containsKey(optionalString2) ? (CardType) CardKey.cardTypeMap.get(optionalString2) : CardType.DEFAULT;
        }

        public final String getKey(CardKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.isContentCardProvider ? key.getContentCardsKey() : key.getFeedKey();
        }

        public final String getServerKeyFromCardType(CardType cardType) {
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            for (Map.Entry entry : CardKey.cardTypeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (cardType == ((CardType) entry.getValue())) {
                    return str;
                }
            }
            return null;
        }

        /* renamed from: isContentCardProvider, reason: from getter */
        public final boolean getIsContentCardProvider() {
            return this.isContentCardProvider;
        }
    }

    CardKey(String str, String str2) {
        this.feedKey = str;
        this.contentCardsKey = str2;
    }

    public final String getContentCardsKey() {
        return this.contentCardsKey;
    }

    public final String getFeedKey() {
        return this.feedKey;
    }
}
