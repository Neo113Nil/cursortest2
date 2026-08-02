package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.enums.CardKey;
import com.braze.events.FeedUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\u001fB!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000b\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u000b\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0017¨\u0006 "}, d2 = {"Lbo/app/m1;", "Lcom/braze/storage/ICardStorageProvider;", "Lcom/braze/events/FeedUpdatedEvent;", "Lorg/json/JSONArray;", "cardsArray", "", "userId", "", "isFromOfflineStorage", "", "cardsTimestamp", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/m1$a;", "property", "", "", "cardId", "markCardAsVisuallyRead", "markCardAsViewed", "markCardAsDismissed", "markCardAsClicked", "", "cardIds", "()Lcom/braze/events/FeedUpdatedEvent;", "cachedCardsAsEvent", "Landroid/content/Context;", "context", "Lbo/app/z1;", "brazeManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbo/app/z1;)V", "b", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class m1 implements ICardStorageProvider<FeedUpdatedEvent> {
    public static final b f = new b(null);
    private final z1 a;
    private final SharedPreferences b;
    private final Set<String> c;
    private final Set<String> d;
    private final b2 e;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lbo/app/m1$a;", "", "", "setKey", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "flatKey", "b", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "READ_CARDS", "VIEWED_CARDS", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public enum a {
        READ_CARDS("read_cards_set", "read_cards_flat"),
        VIEWED_CARDS("viewed_cards_set", "viewed_cards_flat");

        private final String b;
        private final String c;

        a(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Updating offline feed for user with id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The received cards are for user " + ((Object) this.b) + " and the current user is " + ((Object) this.c) + ", the cards will be discarded and no changes will be made.";
        }
    }

    public m1(Context context, String str, z1 brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.a = brazeManager;
        this.e = new l1();
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.feedstorageprovider", StringUtils.getCacheFileSuffix(context, str == null ? "" : str)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…Id, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
        this.c = a(a.VIEWED_CARDS);
        this.d = a(a.READ_CARDS);
        a(str);
    }

    @Override // com.braze.storage.ICardStorageProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FeedUpdatedEvent getCachedCardsAsEvent() {
        return a(new JSONArray(this.b.getString("cards", "[]")), this.b.getString("uid", ""), true, this.b.getLong("cards_timestamp", -1L));
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsClicked(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsDismissed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsViewed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (this.c.contains(cardId)) {
            return;
        }
        this.c.add(cardId);
        a(this.c, a.VIEWED_CARDS);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsVisuallyRead(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (this.d.contains(cardId)) {
            return;
        }
        this.d.add(cardId);
        a(this.d, a.READ_CARDS);
    }

    public final FeedUpdatedEvent a(JSONArray cardsArray, String userId) {
        Intrinsics.checkNotNullParameter(cardsArray, "cardsArray");
        String str = userId == null ? "" : userId;
        String string = this.b.getString("uid", "");
        if (Intrinsics.areEqual(string, str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(userId), 2, (Object) null);
            long nowInSeconds = DateTimeUtils.nowInSeconds();
            a(cardsArray, nowInSeconds);
            Set<String> set = this.c;
            b bVar = f;
            set.retainAll(bVar.a(cardsArray));
            a(this.c, a.VIEWED_CARDS);
            this.d.retainAll(bVar.a(cardsArray));
            a(this.d, a.READ_CARDS);
            return a(cardsArray, userId, false, nowInSeconds);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(userId, string), 3, (Object) null);
        return null;
    }

    private final FeedUpdatedEvent a(JSONArray cardsArray, String userId, boolean isFromOfflineStorage, long cardsTimestamp) {
        List a2;
        if (cardsArray.length() == 0) {
            a2 = new ArrayList();
        } else {
            a2 = v.a(cardsArray, new CardKey.Provider(false), this.a, this, this.e);
        }
        List<Card> list = a2;
        for (Card card : list) {
            if (this.c.contains(card.getId())) {
                card.setViewed(true);
                card.setIndicatorHighlighted(true);
            }
            if (this.d.contains(card.getId())) {
                card.setIndicatorHighlighted(true);
            }
        }
        return new FeedUpdatedEvent(list, userId, isFromOfflineStorage, cardsTimestamp);
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\r\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0015"}, d2 = {"Lbo/app/m1$b;", "", "", "input", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lorg/json/JSONArray;", "cardsArray", "", "CARDS_KEY", "Ljava/lang/String;", "CARDS_TIMESTAMP_KEY", "FILE_NAME", "READ_CARDS_KEY_FLAT", "READ_CARDS_KEY_SET", "SEMICOLON_SEPARATOR", "USER_ID_KEY", "VIEWED_CARDS_KEY_FLAT", "VIEWED_CARDS_KEY_SET", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Set<String> a(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            HashSet hashSet = new HashSet();
            Object[] array = StringsKt.split$default((CharSequence) input, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            Collections.addAll(hashSet, Arrays.copyOf(strArr, strArr.length));
            return hashSet;
        }

        @JvmStatic
        public final Set<String> a(JSONArray cardsArray) {
            Intrinsics.checkNotNullParameter(cardsArray, "cardsArray");
            HashSet hashSet = new HashSet();
            int length = cardsArray.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                JSONObject jSONObject = cardsArray.getJSONObject(i);
                CardKey cardKey = CardKey.ID;
                if (jSONObject.has(cardKey.getFeedKey())) {
                    String string = jSONObject.getString(cardKey.getFeedKey());
                    Intrinsics.checkNotNullExpressionValue(string, "card.getString(CardKey.ID.feedKey)");
                    hashSet.add(string);
                }
                i = i2;
            }
            return hashSet;
        }
    }

    private final Set<String> a(a property) {
        String c2 = property.getC();
        if (this.b.contains(c2)) {
            String string = this.b.getString(c2, null);
            Set<String> a2 = string != null ? f.a(string) : null;
            SharedPreferences.Editor edit = this.b.edit();
            edit.remove(c2);
            edit.apply();
            if (a2 != null) {
                a(a2, property);
                return a2;
            }
        }
        return new ConcurrentSkipListSet(this.b.getStringSet(property.getB(), new HashSet()));
    }

    private final void a(JSONArray cardsArray, long cardsTimestamp) {
        SharedPreferences.Editor edit = this.b.edit();
        if (cardsArray.length() == 0) {
            edit.remove("cards");
        } else {
            edit.putString("cards", cardsArray.toString());
        }
        edit.putLong("cards_timestamp", cardsTimestamp);
        edit.apply();
    }

    private final void a(String userId) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString("uid", userId);
        edit.apply();
    }

    public final void a(Set<String> cardIds, a property) {
        Intrinsics.checkNotNullParameter(cardIds, "cardIds");
        Intrinsics.checkNotNullParameter(property, "property");
        String b2 = property.getB();
        SharedPreferences.Editor edit = this.b.edit();
        if (cardIds.isEmpty()) {
            edit.remove(b2);
        } else {
            edit.putStringSet(b2, cardIds);
        }
        edit.apply();
    }
}
