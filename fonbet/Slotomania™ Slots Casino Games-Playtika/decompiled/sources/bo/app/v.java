package bo.app;

import com.braze.Constants;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.models.cards.BannerImageCard;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J6\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J6\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0015"}, d2 = {"Lbo/app/v;", "", "Lorg/json/JSONArray;", "cardJsonStringArray", "Lcom/braze/enums/CardKey$Provider;", "cardKeyProvider", "Lbo/app/z1;", "brazeManager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorageProvider", "Lbo/app/b2;", "cardAnalyticsProvider", "", "Lcom/braze/models/cards/Card;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lorg/json/JSONObject;", "jsonObject", "", "jsonString", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class v {
    public static final v a = new v();

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.BANNER.ordinal()] = 1;
            iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            iArr[CardType.CONTROL.ordinal()] = 5;
            a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$e"}, k = 3, mv = {1, 6, 0})
    public static final class b extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.opt(i) instanceof Object);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "it", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$f"}, k = 3, mv = {1, 6, 0})
    public static final class c extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final Object a(int i) {
            Object obj = this.b.get(i);
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/braze/models/cards/Card;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/Object;)Lcom/braze/models/cards/Card;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function1<Object, Card> {
        final /* synthetic */ CardKey.Provider b;
        final /* synthetic */ z1 c;
        final /* synthetic */ ICardStorageProvider<?> d;
        final /* synthetic */ b2 e;
        final /* synthetic */ JSONArray f;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            final /* synthetic */ Object b;
            final /* synthetic */ JSONArray c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, JSONArray jSONArray) {
                super(0);
                this.b = obj;
                this.c = jSONArray;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Unable to create Card JSON in array. Ignoring. Was on element: " + this.b + " of json array: " + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CardKey.Provider provider, z1 z1Var, ICardStorageProvider<?> iCardStorageProvider, b2 b2Var, JSONArray jSONArray) {
            super(1);
            this.b = provider;
            this.c = z1Var;
            this.d = iCardStorageProvider;
            this.e = b2Var;
            this.f = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Card invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                return v.a.a(it.toString(), this.b, this.c, this.d, this.e);
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(v.a, BrazeLogger.Priority.E, e, new a(it, this.f));
                return null;
            }
        }
    }

    private v() {
    }

    @JvmStatic
    public static final Card a(JSONObject jsonObject, CardKey.Provider cardKeyProvider, z1 brazeManager, ICardStorageProvider<?> cardStorageProvider, b2 cardAnalyticsProvider) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        CardType cardTypeFromJson = cardKeyProvider.getCardTypeFromJson(jsonObject);
        int i = cardTypeFromJson == null ? -1 : a.a[cardTypeFromJson.ordinal()];
        if (i == 1) {
            return new BannerImageCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i == 2) {
            return new CaptionedImageCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i == 3) {
            return new ShortNewsCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i == 4) {
            return new TextAnnouncementCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        if (i != 5) {
            return null;
        }
        return new ControlCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Card a(String jsonString, CardKey.Provider cardKeyProvider, z1 brazeManager, ICardStorageProvider<?> cardStorageProvider, b2 cardAnalyticsProvider) {
        return a(new JSONObject(jsonString), cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
    }

    @JvmStatic
    public static final List<Card> a(JSONArray cardJsonStringArray, CardKey.Provider cardKeyProvider, z1 brazeManager, ICardStorageProvider<?> cardStorageProvider, b2 cardAnalyticsProvider) {
        Intrinsics.checkNotNullParameter(cardJsonStringArray, "cardJsonStringArray");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.asSequence(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, cardJsonStringArray.length())), new b(cardJsonStringArray)), new c(cardJsonStringArray)).iterator()), new d(cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider, cardJsonStringArray)));
    }
}
