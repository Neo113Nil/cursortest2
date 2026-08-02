package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.enums.CardKey;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0006B3\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u00101\u001a\u00020\t\u0012\u0006\u00103\u001a\u000202\u0012\b\b\u0002\u00104\u001a\u00020\t¢\u0006\u0004\b5\u00106J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0003J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0014H\u0007J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0007J\u001a\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0007J\u0016\u0010\u001c\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0007J\u0016\u0010\u0012\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010#R\u0011\u0010&\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010#R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0'8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0'8G¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0'8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010(R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010-¨\u00067"}, d2 = {"Lbo/app/b0;", "Lcom/braze/storage/ICardStorageProvider;", "Lcom/braze/events/ContentCardsUpdatedEvent;", "Lorg/json/JSONObject;", "serverCardJson", "", "b", "", "i", "", "cardId", "markCardAsVisuallyRead", "markCardAsViewed", "markCardAsClicked", "markCardAsDismissed", "Lbo/app/a0;", "contentCardsResponse", "userId", Constants.BRAZE_PUSH_CONTENT_KEY, "cardJson", "Lcom/braze/models/cards/Card;", "isFromOfflineStorage", "card", "Lcom/braze/enums/CardKey;", "cardKey", "", "value", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "c", "f", "e", "", "cardIdsToRetain", "", "g", "()J", "localStorageLastUpdatedTime", "lastCardUpdatedAt", "lastFullSyncAt", "", "()Ljava/util/Set;", "dismissedCardIdSet", "h", "testCardIdSet", "expiredCardIdSet", "()Lcom/braze/events/ContentCardsUpdatedEvent;", "cachedCardsAsEvent", "Landroid/content/Context;", "context", "apiKey", "Lbo/app/z1;", "brazeManager", "currentSdkVersion", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbo/app/z1;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class b0 implements ICardStorageProvider<ContentCardsUpdatedEvent> {
    public static final b f = new b(null);
    private static final Set<String> g = SetsKt.setOf((Object[]) new String[]{CardKey.VIEWED.getContentCardsKey(), CardKey.DISMISSED.getContentCardsKey()});
    private final String a;
    private final z1 b;
    private final SharedPreferences c;
    private final SharedPreferences d;
    private final b2 e;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Detected SDK update from '" + ((Object) this.b) + "' -> '" + this.c + "'. Clearing config update time.";
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
            return Intrinsics.stringPlus("Adding card to test cache: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Deleting expired card from storage with id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Card not present in storage for id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to read card json from storage. Json: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Removing card from test cache: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Removing card from storage with id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The server card received is older than the cached card. Discarding the server card.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card json: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Cached card json: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card is marked as removed. Removing from card storage with id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card was locally dismissed already. Not adding card to storage. Server card: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card has expired already. Not adding card to storage. Server card: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Can't update card field. Json cannot be parsed from disk or is not present. Id: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<String> {
        final /* synthetic */ Object b;
        final /* synthetic */ CardKey c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Object obj, CardKey cardKey) {
            super(0);
            this.b = obj;
            this.c = cardKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to update card json field to " + this.b + " with key: " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$e"}, k = 3, mv = {1, 6, 0})
    public static final class r extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.opt(i) instanceof JSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "it", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$f"}, k = 3, mv = {1, 6, 0})
    public static final class s extends Lambda implements Function1<Integer, JSONObject> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final JSONObject a(int i) {
            Object obj = this.b.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, org.json.JSONObject] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ JSONObject invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t extends Lambda implements Function0<String> {
        public static final t b = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Input user id was null. Defaulting to the empty user id";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.ObjectRef<String> b;
        final /* synthetic */ b0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(Ref.ObjectRef<String> objectRef, b0 b0Var) {
            super(0);
            this.b = objectRef;
            this.c = b0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The received cards are for user " + ((Object) this.b.element) + " and the current user is " + this.c.a + " , the cards will be discarded and no changes will be made.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.ObjectRef<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Updating offline Content Cards for user with id: ", this.b.element);
        }
    }

    public b0(Context context, String userId, String apiKey, z1 brazeManager, String currentSdkVersion) {
        b0 b0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(currentSdkVersion, "currentSdkVersion");
        this.a = userId;
        this.b = brazeManager;
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, userId, apiKey);
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.content_cards_storage_provider.metadata", cacheFileSuffix), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.content_cards_storage_provider.cards", cacheFileSuffix), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.c = sharedPreferences2;
        String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        if (Intrinsics.areEqual(currentSdkVersion, string)) {
            b0Var = this;
        } else {
            b0Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, b0Var, BrazeLogger.Priority.V, (Throwable) null, new a(string, currentSdkVersion), 2, (Object) null);
            sharedPreferences.edit().putLong("last_full_sync_at", 0L).putString("last_accessed_sdk_version", currentSdkVersion).apply();
        }
        b0Var.e = new z();
    }

    private final long g() {
        return this.d.getLong("last_storage_update_timestamp", 0L);
    }

    private final void i() {
        this.d.edit().putLong("last_storage_update_timestamp", DateTimeUtils.nowInSeconds()).apply();
    }

    @Override // com.braze.storage.ICardStorageProvider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ContentCardsUpdatedEvent getCachedCardsAsEvent() {
        return a(true);
    }

    public final Set<String> c() {
        List filterNotNull;
        Set<String> stringSet = this.d.getStringSet("dismissed", new HashSet());
        Set<String> mutableSet = (stringSet == null || (filterNotNull = CollectionsKt.filterNotNull(stringSet)) == null) ? null : CollectionsKt.toMutableSet(filterNotNull);
        return mutableSet == null ? CollectionsKt.toMutableSet(SetsKt.emptySet()) : mutableSet;
    }

    public final Set<String> d() {
        List filterNotNull;
        Set<String> stringSet = this.d.getStringSet("expired", new HashSet());
        Set<String> mutableSet = (stringSet == null || (filterNotNull = CollectionsKt.filterNotNull(stringSet)) == null) ? null : CollectionsKt.toMutableSet(filterNotNull);
        return mutableSet == null ? CollectionsKt.toMutableSet(SetsKt.emptySet()) : mutableSet;
    }

    public final long e() {
        return this.d.getLong("last_card_updated_at", 0L);
    }

    public final long f() {
        return this.d.getLong("last_full_sync_at", 0L);
    }

    public final Set<String> h() {
        List filterNotNull;
        Set<String> stringSet = this.d.getStringSet("test", new HashSet());
        Set<String> mutableSet = (stringSet == null || (filterNotNull = CollectionsKt.filterNotNull(stringSet)) == null) ? null : CollectionsKt.toMutableSet(filterNotNull);
        return mutableSet == null ? CollectionsKt.toMutableSet(SetsKt.emptySet()) : mutableSet;
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsClicked(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.CLICKED, Boolean.TRUE);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsDismissed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId);
        a(cardId, (JSONObject) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsViewed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.VIEWED, Boolean.TRUE);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public void markCardAsVisuallyRead(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.READ, Boolean.TRUE);
    }

    private final boolean b(JSONObject serverCardJson) {
        Set<String> c2 = c();
        Set<String> d2 = d();
        String serverCardId = serverCardJson.getString(CardKey.ID.getContentCardsKey());
        Intrinsics.checkNotNullExpressionValue(serverCardId, "serverCardId");
        JSONObject d3 = d(serverCardId);
        b bVar = f;
        if (bVar.b(d3, serverCardJson)) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, i.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new j(serverCardJson), 3, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new k(serverCardJson), 3, (Object) null);
            return false;
        }
        if (bVar.a(serverCardJson, CardKey.REMOVED)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new l(serverCardId), 3, (Object) null);
            e(serverCardId);
            f(serverCardId);
            a(serverCardId, (JSONObject) null);
            return true;
        }
        if (c2.contains(serverCardId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(serverCardJson), 3, (Object) null);
            return true;
        }
        if (d2.contains(serverCardId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new n(serverCardJson), 3, (Object) null);
            return true;
        }
        if (bVar.a(serverCardJson, CardKey.DISMISSED)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new o(serverCardId), 3, (Object) null);
            a(serverCardId);
            a(serverCardId, (JSONObject) null);
            return true;
        }
        a(serverCardId, bVar.a(d3, serverCardJson));
        if (bVar.a(serverCardJson, CardKey.IS_TEST)) {
            c(serverCardId);
        }
        return true;
    }

    public final void e(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Set<String> c2 = c();
        c2.remove(cardId);
        this.d.edit().putStringSet("dismissed", c2).apply();
    }

    public final void f(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new g(cardId), 2, (Object) null);
        Set<String> h2 = h();
        h2.remove(cardId);
        this.d.edit().putStringSet("test", h2).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ContentCardsUpdatedEvent a(a0 contentCardsResponse, String userId) {
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = userId;
        if (userId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, t.b, 3, (Object) null);
            objectRef.element = "";
        }
        if (!Intrinsics.areEqual(this.a, objectRef.element)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new u(objectRef, this), 2, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new v(objectRef), 2, (Object) null);
        a(contentCardsResponse);
        i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONArray d2 = contentCardsResponse.getD();
        if (d2 != null && d2.length() != 0) {
            for (JSONObject jSONObject : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, d2.length())), new r(d2)), new s(d2))) {
                if (b(jSONObject)) {
                    String string = jSONObject.getString(CardKey.ID.getContentCardsKey());
                    Intrinsics.checkNotNullExpressionValue(string, "serverCardJson.getString…rdKey.ID.contentCardsKey)");
                    linkedHashSet.add(string);
                }
            }
        }
        if (contentCardsResponse.getC()) {
            b(linkedHashSet);
            c(linkedHashSet);
            linkedHashSet.addAll(h());
            a(linkedHashSet);
        }
        return a(false);
    }

    public final void c(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(cardId), 2, (Object) null);
        Set<String> h2 = h();
        h2.add(cardId);
        this.d.edit().putStringSet("test", h2).apply();
    }

    public final JSONObject d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        String string = this.c.getString(cardId, null);
        if (string == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(cardId), 3, (Object) null);
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new f(string));
            return null;
        }
    }

    public final void c(Set<String> cardIdsToRetain) {
        Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
        Set<String> d2 = d();
        d2.retainAll(cardIdsToRetain);
        this.d.edit().putStringSet("expired", d2).apply();
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lbo/app/b0$b;", "", "Lorg/json/JSONObject;", "cachedCard", "serverCard", "", "b", Constants.BRAZE_PUSH_CONTENT_KEY, "json", "Lcom/braze/enums/CardKey;", "cardKey", "", "CARD_CACHE_FILE_NAME", "Ljava/lang/String;", "DISMISSALS_KEY", "EXPIRED_CARDS_KEY", "LAST_ACCESSED_SDK_VERSION", "LAST_CARD_UPDATED_AT_KEY", "LAST_FULL_SYNC_AT_KEY", "METADATA_CACHE_FILE_NAME", "STORAGE_LAST_UPDATED_TIMESTAMP_KEY", "TEST_CARDS_KEY", "", "localStateMergeKeys", "Ljava/util/Set;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final JSONObject a(JSONObject cachedCard, JSONObject serverCard) {
            Intrinsics.checkNotNullParameter(serverCard, "serverCard");
            if (cachedCard == null) {
                return serverCard;
            }
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = cachedCard.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, cachedCard.get(next));
            }
            Iterator<String> keys2 = serverCard.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (b0.g.contains(next2)) {
                    jSONObject.put(next2, cachedCard.getBoolean(next2) || serverCard.getBoolean(next2));
                } else {
                    jSONObject.put(next2, serverCard.get(next2));
                }
            }
            return jSONObject;
        }

        @JvmStatic
        public final boolean b(JSONObject cachedCard, JSONObject serverCard) {
            Intrinsics.checkNotNullParameter(serverCard, "serverCard");
            if (cachedCard == null) {
                return false;
            }
            String contentCardsKey = CardKey.CREATED.getContentCardsKey();
            return cachedCard.has(contentCardsKey) && serverCard.has(contentCardsKey) && cachedCard.getLong(contentCardsKey) > serverCard.getLong(contentCardsKey);
        }

        @JvmStatic
        public final boolean a(JSONObject json, CardKey cardKey) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(cardKey, "cardKey");
            String contentCardsKey = cardKey.getContentCardsKey();
            if (json.has(contentCardsKey)) {
                return json.getBoolean(contentCardsKey);
            }
            return false;
        }
    }

    public final void b(Set<String> cardIdsToRetain) {
        Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
        Set<String> c2 = c();
        c2.retainAll(cardIdsToRetain);
        this.d.edit().putStringSet("dismissed", c2).apply();
    }

    public final void b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Set<String> d2 = d();
        d2.add(cardId);
        this.d.edit().putStringSet("expired", d2).apply();
    }

    public /* synthetic */ b0(Context context, String str, String str2, z1 z1Var, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, z1Var, (i2 & 16) != 0 ? Constants.BRAZE_SDK_VERSION : str3);
    }

    public final Card a(JSONObject cardJson) {
        Intrinsics.checkNotNullParameter(cardJson, "cardJson");
        return bo.app.v.a(cardJson, CardKey.Provider.CONTENT_CARDS, this.b, this, this.e);
    }

    public final ContentCardsUpdatedEvent a(boolean isFromOfflineStorage) {
        CardKey.Provider provider = CardKey.Provider.CONTENT_CARDS;
        Map<String, ?> all = this.c.getAll();
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List<Card> a2 = bo.app.v.a(jSONArray, provider, this.b, this, this.e);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : a2) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            a((Card) it2.next());
        }
        return new ContentCardsUpdatedEvent(list2, this.a, g(), isFromOfflineStorage);
    }

    public final void a(Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        String id = card.getId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(id), 3, (Object) null);
        a(id, (JSONObject) null);
        b(id);
        f(id);
    }

    public final void a(String cardId, CardKey cardKey, Object value) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject d2 = d(cardId);
        if (d2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new p(cardId), 3, (Object) null);
            return;
        }
        try {
            d2.put(cardKey.getContentCardsKey(), value);
            a(cardId, d2);
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new q(value, cardKey));
        }
    }

    public final void a(a0 contentCardsResponse) {
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        SharedPreferences.Editor edit = this.d.edit();
        if (contentCardsResponse.getA() != -1) {
            edit.putLong("last_card_updated_at", contentCardsResponse.getA());
        }
        if (contentCardsResponse.getB() != -1) {
            edit.putLong("last_full_sync_at", contentCardsResponse.getB());
        }
        edit.apply();
    }

    public final void a(String cardId, JSONObject cardJson) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        SharedPreferences.Editor edit = this.c.edit();
        if (cardJson != null) {
            edit.putString(cardId, cardJson.toString());
        } else {
            edit.remove(cardId);
        }
        edit.apply();
    }

    public final void a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Set<String> c2 = c();
        c2.add(cardId);
        this.d.edit().putStringSet("dismissed", c2).apply();
    }

    public final void a(Set<String> cardIdsToRetain) {
        Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
        Set<String> keySet = this.c.getAll().keySet();
        SharedPreferences.Editor edit = this.c.edit();
        for (String str : keySet) {
            if (!cardIdsToRetain.contains(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(str), 3, (Object) null);
                edit.remove(str);
            }
        }
        edit.apply();
    }
}
