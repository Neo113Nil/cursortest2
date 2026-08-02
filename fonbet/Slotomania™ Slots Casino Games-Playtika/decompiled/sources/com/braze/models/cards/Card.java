package com.braze.models.cards;

import bo.app.b2;
import bo.app.x1;
import bo.app.z1;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Constants;
import com.braze.enums.CardCategory;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.enums.Channel;
import com.braze.models.IPutIntoJson;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 j2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001kB9\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010a\u001a\u00020`\u0012\b\u0010c\u001a\u0004\u0018\u00010b\u0012\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\b\u0010e\u001a\u0004\u0018\u00010d¢\u0006\u0004\bf\u0010gB\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010h\u001a\u00020`¢\u0006\u0004\bf\u0010iJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u0014\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0007J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010(\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R4\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0017\u00101\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b1\u00100R\"\u00102\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010/\u001a\u0004\b2\u00100\"\u0004\b3\u00104R$\u00105\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b5\u00100R\u001d\u00106\u001a\u00020\u00038\u0006¢\u0006\u0012\n\u0004\b6\u0010/\u0012\u0004\b8\u00109\u001a\u0004\b7\u00100R\"\u0010:\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010/\u001a\u0004\b:\u00100\"\u0004\b;\u00104R\"\u0010<\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b<\u00100\"\u0004\b=\u00104R\u001c\u0010>\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010\u001e\u001a\u0004\b?\u0010 R\u001a\u0010A\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010/R\u0016\u0010F\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010/R\u0016\u0010G\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010/R\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010U\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u00100\"\u0004\bV\u00104R*\u0010W\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bY\u00109\u001a\u0004\bW\u00100\"\u0004\bX\u00104R*\u0010Z\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\b]\u00109\u001a\u0004\b[\u00100\"\u0004\b\\\u00104R\u0011\u0010^\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b^\u00100R\u0011\u0010_\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b_\u00100¨\u0006l"}, d2 = {"Lcom/braze/models/cards/Card;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "logImpression", "logClick", "Ljava/util/EnumSet;", "Lcom/braze/enums/CardCategory;", "categories", "isInCategorySet", "forJsonPut", "", "toString", "isValidCard", "", "other", "equals", "", "hashCode", "jsonObject", "Lorg/json/JSONObject;", "Lcom/braze/storage/ICardStorageProvider;", "cardStorage", "Lcom/braze/storage/ICardStorageProvider;", "", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "created", "J", "getCreated", "()J", "updated", "getUpdated", "expiresAt", "getExpiresAt", "<set-?>", "Ljava/util/EnumSet;", "getCategories", "()Ljava/util/EnumSet;", "isContentCard", "Z", "()Z", "isRemoved", "isPinned", "setPinned", "(Z)V", "isClicked", "openUriInWebView", "getOpenUriInWebView", "getOpenUriInWebView$annotations", "()V", "isDismissibleByUser", "setDismissibleByUser", "isTest", "setTest", "url", "getUrl", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "wasViewedInternal", "isIndicatorHighlightedInternal", "isDismissedInternal", "Lcom/braze/enums/Channel;", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "Lcom/braze/models/cards/ICardListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/braze/models/cards/ICardListener;", "getListener", "()Lcom/braze/models/cards/ICardListener;", "setListener", "(Lcom/braze/models/cards/ICardListener;)V", "enabled", "isIndicatorHighlighted", "setIndicatorHighlighted", "isDismissed", "setDismissed", "isDismissed$annotations", "viewed", "getViewed", "setViewed", "getViewed$annotations", "isExpired", "isControl", "Lcom/braze/enums/CardKey$Provider;", "cardKeysProvider", "Lbo/app/z1;", "brazeManager", "Lbo/app/b2;", "cardAnalytics", "<init>", "(Lorg/json/JSONObject;Lcom/braze/enums/CardKey$Provider;Lbo/app/z1;Lcom/braze/storage/ICardStorageProvider;Lbo/app/b2;)V", "cardKeyProvider", "(Lorg/json/JSONObject;Lcom/braze/enums/CardKey$Provider;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public class Card implements IPutIntoJson<JSONObject> {
    private static final long DEFAULT_EXPIRES_AT_VALUE = -1;
    private final z1 brazeManager;
    private final b2 cardAnalytics;
    private final ICardStorageProvider<?> cardStorage;
    private final CardType cardType;
    private EnumSet<CardCategory> categories;
    private final Channel channel;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;
    private final String id;
    private boolean isClicked;
    private final boolean isContentCard;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final long updated;
    private final String url;
    private boolean wasViewedInternal;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$e"}, k = 3, mv = {1, 6, 0})
    public static final class b extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.opt(i) instanceof String);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "it", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$f"}, k = 3, mv = {1, 6, 0})
    public static final class c extends Lambda implements Function1<Integer, String> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final String a(int i) {
            Object obj = this.b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot dismiss a card more than once. Doing nothing.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        public static final e b = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log card as dismissed.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to mark card indicator as highlighted.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        public static final g b = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Card ID cannot be null";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Logged click for card with id: ", Card.this.getId());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log card clicked for id: ", Card.this.getId());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log card as clicked for id: ", Card.this.getId());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Logging impression event for card with id: ", Card.this.getId());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Logging control impression event for card with id: ", Card.this.getId());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log card impression for card id: ", Card.this.getId());
        }
    }

    public Card(JSONObject jsonObject, CardKey.Provider cardKeysProvider, z1 z1Var, ICardStorageProvider<?> iCardStorageProvider, b2 b2Var) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeysProvider, "cardKeysProvider");
        this.jsonObject = jsonObject;
        this.brazeManager = z1Var;
        this.cardStorage = iCardStorageProvider;
        this.cardAnalytics = b2Var;
        this.extras = JsonUtils.convertJSONObjectToMap(jsonObject.optJSONObject(cardKeysProvider.getKey(CardKey.EXTRAS)));
        String string = jsonObject.getString(cardKeysProvider.getKey(CardKey.ID));
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(car…vider.getKey(CardKey.ID))");
        this.id = string;
        this.isContentCard = cardKeysProvider.getIsContentCardProvider();
        this.cardType = CardType.DEFAULT;
        this.channel = cardKeysProvider.getIsContentCardProvider() ? Channel.CONTENT_CARD : Channel.NEWS_FEED;
        this.wasViewedInternal = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.VIEWED));
        this.isDismissedInternal = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.DISMISSED), false);
        this.isPinned = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.PINNED), false);
        this.created = jsonObject.getLong(cardKeysProvider.getKey(CardKey.CREATED));
        this.expiresAt = jsonObject.optLong(cardKeysProvider.getKey(CardKey.EXPIRES_AT), -1L);
        this.openUriInWebView = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.OPEN_URI_IN_WEBVIEW), false);
        this.isRemoved = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.REMOVED), false);
        JSONArray optJSONArray = jsonObject.optJSONArray(cardKeysProvider.getKey(CardKey.CATEGORIES));
        if (optJSONArray == null || optJSONArray.length() == 0) {
            this.categories = EnumSet.of(CardCategory.NO_CATEGORY);
        } else {
            EnumSet<CardCategory> noneOf = EnumSet.noneOf(CardCategory.class);
            Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new b(optJSONArray)), new c(optJSONArray)).iterator();
            while (it.hasNext()) {
                CardCategory cardCategory = CardCategory.get((String) it.next());
                if (cardCategory != null) {
                    noneOf.add(cardCategory);
                }
            }
            this.categories = noneOf;
        }
        this.updated = this.jsonObject.optLong(cardKeysProvider.getKey(CardKey.UPDATED), this.created);
        this.isDismissibleByUser = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.DISMISSIBLE), false);
        this.isIndicatorHighlightedInternal = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.READ), this.wasViewedInternal);
        this.isClicked = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.CLICKED), false);
        this.isTest = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.IS_TEST), false);
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    public static /* synthetic */ void getViewed$annotations() {
    }

    public static /* synthetic */ void isDismissed$annotations() {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(getClass(), other.getClass())) {
            Card card = (Card) other;
            if (this.updated == card.updated && Intrinsics.areEqual(this.id, card.id)) {
                return true;
            }
        }
        return false;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final EnumSet<CardCategory> getCategories() {
        return this.categories;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final long getCreated() {
        return this.created;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final ICardListener getListener() {
        return this.listener;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public final long getUpdated() {
        return this.updated;
    }

    public String getUrl() {
        return this.url;
    }

    /* renamed from: getViewed, reason: from getter */
    public final boolean getWasViewedInternal() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        long j2 = this.updated;
        return hashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    /* renamed from: isClicked, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    /* renamed from: isContentCard, reason: from getter */
    public final boolean getIsContentCard() {
        return this.isContentCard;
    }

    public final boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    /* renamed from: isDismissed, reason: from getter */
    public final boolean getIsDismissedInternal() {
        return this.isDismissedInternal;
    }

    /* renamed from: isDismissibleByUser, reason: from getter */
    public final boolean getIsDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j2 = this.expiresAt;
        return j2 != -1 && j2 <= DateTimeUtils.nowInSeconds();
    }

    public final boolean isInCategorySet(EnumSet<CardCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        EnumSet<CardCategory> enumSet = this.categories;
        if (enumSet == null) {
            return false;
        }
        Iterator it = categories.iterator();
        while (it.hasNext()) {
            if (enumSet.contains((CardCategory) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isIndicatorHighlighted, reason: from getter */
    public final boolean getIsIndicatorHighlightedInternal() {
        return this.isIndicatorHighlightedInternal;
    }

    /* renamed from: isPinned, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    /* renamed from: isRemoved, reason: from getter */
    public final boolean getIsRemoved() {
        return this.isRemoved;
    }

    /* renamed from: isTest, reason: from getter */
    public final boolean getIsTest() {
        return this.isTest;
    }

    public final boolean isValidCard() {
        if (!StringsKt.isBlank(this.id)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, g.b, 2, (Object) null);
        return false;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new i(), 2, (Object) null);
                return false;
            }
            x1 a = this.cardAnalytics.a(this.id);
            if (a != null) {
                this.brazeManager.a(a);
            }
            this.cardStorage.markCardAsClicked(this.id);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(), 3, (Object) null);
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new j());
            return false;
        }
    }

    public final boolean logImpression() {
        Card card;
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            try {
                if (isControl()) {
                    card = this;
                    try {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, card, BrazeLogger.Priority.V, (Throwable) null, new l(), 2, (Object) null);
                        x1 b2 = card.cardAnalytics.b(card.id);
                        if (b2 != null) {
                            card.brazeManager.a(b2);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new m());
                        return false;
                    }
                } else {
                    card = this;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, card, BrazeLogger.Priority.V, (Throwable) null, new k(), 2, (Object) null);
                    x1 c2 = card.cardAnalytics.c(card.id);
                    if (c2 != null) {
                        card.brazeManager.a(c2);
                    }
                }
                card.cardStorage.markCardAsViewed(card.id);
                return true;
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public final void setDismissed(boolean z) {
        x1 d2;
        if (this.isDismissedInternal && z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
            return;
        }
        this.isDismissedInternal = z;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsDismissed(this.id);
        }
        if (z) {
            try {
                if (this.brazeManager != null && this.cardAnalytics != null && isValidCard() && (d2 = this.cardAnalytics.d(this.id)) != null) {
                    this.brazeManager.a(d2);
                }
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, e.b);
            }
        }
    }

    public final void setDismissibleByUser(boolean z) {
        this.isDismissibleByUser = z;
    }

    public final void setIndicatorHighlighted(boolean z) {
        ICardStorageProvider<?> iCardStorageProvider;
        this.isIndicatorHighlightedInternal = z;
        try {
            ICardListener iCardListener = this.listener;
            if (iCardListener != null) {
                iCardListener.onCardUpdate();
            }
        } catch (Exception unused) {
        }
        if (!z || (iCardStorageProvider = this.cardStorage) == null) {
            return;
        }
        try {
            iCardStorageProvider.markCardAsVisuallyRead(this.id);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.D, e2, f.b);
        }
    }

    public final void setListener(ICardListener iCardListener) {
        this.listener = iCardListener;
    }

    public final void setPinned(boolean z) {
        this.isPinned = z;
    }

    public final void setTest(boolean z) {
        this.isTest = z;
    }

    public final void setViewed(boolean z) {
        this.wasViewedInternal = z;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider == null) {
            return;
        }
        iCardStorageProvider.markCardAsViewed(this.id);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n            Card{\n            extras=");
        sb.append(this.extras).append("\n            id='").append(this.id).append("'\n            created=").append(this.created).append("\n            updated=").append(this.updated).append("\n            expiresAt=").append(this.expiresAt).append("\n            categories=").append(this.categories).append("\n            isContentCard=").append(this.isContentCard).append("\n            viewed=").append(this.wasViewedInternal).append("\n            isRead=").append(this.isIndicatorHighlightedInternal).append("\n            isDismissed=").append(this.isDismissedInternal).append("\n            isRemoved=").append(this.isRemoved).append("\n            isPinned=");
        sb.append(this.isPinned).append("\n            isClicked=").append(this.isClicked).append("\n            openUriInWebview=").append(this.openUriInWebView).append("\n            isDismissibleByUser=").append(this.isDismissibleByUser).append("\n            isTest=").append(this.isTest).append("\n            json=").append(JsonUtils.getPrettyPrintedString(this.jsonObject)).append("\n            }\n\n        ");
        return StringsKt.trimIndent(sb.toString());
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getKey() {
        return this.jsonObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Card(JSONObject jsonObject, CardKey.Provider cardKeyProvider) {
        this(jsonObject, cardKeyProvider, null, null, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
    }
}
