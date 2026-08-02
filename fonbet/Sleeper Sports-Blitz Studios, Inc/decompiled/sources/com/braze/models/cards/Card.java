package com.braze.models.cards;

import com.braze.analytics.b;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.managers.m0;
import com.braze.managers.r;
import com.braze.models.IPutIntoJson;
import com.braze.models.k;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u0000 ]2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001^B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0015R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u00101\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010\u000fR\"\u00103\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00102\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u00105R$\u00107\u001a\u00020\r2\u0006\u00106\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b7\u0010\u000fR\u001d\u00108\u001a\u00020\r8\u0006¢\u0006\u0012\n\u0004\b8\u00102\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u000fR\"\u0010<\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00102\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u00105R\"\u0010>\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00102\u001a\u0004\b>\u0010\u000f\"\u0004\b?\u00105R\u001c\u0010@\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\bA\u0010\u0015R\u001a\u0010C\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00102R\u0016\u0010H\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00102R\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00102R$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010Q\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bS\u0010;\u001a\u0004\bQ\u0010\u000f\"\u0004\bR\u00105R*\u0010T\u001a\u00020\r2\u0006\u0010T\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bW\u0010;\u001a\u0004\bU\u0010\u000f\"\u0004\bV\u00105R$\u0010Y\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u00105R\u0011\u0010[\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b[\u0010\u000fR\u0011\u0010\\\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\\\u0010\u000f¨\u0006_"}, d2 = {"Lcom/braze/models/cards/Card;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorage", "Lcom/braze/analytics/b;", "cardAnalytics", "<init>", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;Lcom/braze/storage/ICardStorageProvider;Lcom/braze/analytics/b;)V", "(Lorg/json/JSONObject;)V", "", "logImpression", "()Z", "logClick", "forJsonPut", "()Lorg/json/JSONObject;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "isValidCard", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "Lcom/braze/managers/m0;", "Lcom/braze/storage/ICardStorageProvider;", "Lcom/braze/analytics/b;", "", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "id", "Ljava/lang/String;", "getId", "", "created", "J", "getCreated", "()J", "expiresAt", "getExpiresAt", "isRemoved", "Z", "isPinned", "setPinned", "(Z)V", "value", "isClicked", "openUriInWebView", "getOpenUriInWebView", "getOpenUriInWebView$annotations", "()V", "isDismissibleByUser", "setDismissibleByUser", "isTest", "setTest", "url", "getUrl", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "wasViewedInternal", "isIndicatorHighlightedInternal", "isDismissedInternal", "Lcom/braze/models/cards/ICardListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/braze/models/cards/ICardListener;", "getListener", "()Lcom/braze/models/cards/ICardListener;", InAppPurchaseConstants.METHOD_SET_LISTENER, "(Lcom/braze/models/cards/ICardListener;)V", "isDismissed", "setDismissed", "isDismissed$annotations", MetricTracker.Action.VIEWED, "getViewed", "setViewed", "getViewed$annotations", "enabled", "isIndicatorHighlighted", "setIndicatorHighlighted", "isExpired", "isControl", "Companion", "com/braze/models/cards/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class Card implements IPutIntoJson<JSONObject> {
    public static final a Companion = new a();
    private static final long DEFAULT_EXPIRES_AT_VALUE = -1;
    private final m0 brazeManager;
    private final b cardAnalytics;
    private final ICardStorageProvider<?> cardStorage;
    private final CardType cardType;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;
    private final String id;
    private boolean isClicked;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final String url;
    private boolean wasViewedInternal;

    public Card(JSONObject jsonObject, m0 m0Var, ICardStorageProvider<?> iCardStorageProvider, b bVar) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.jsonObject = jsonObject;
        this.brazeManager = m0Var;
        this.cardStorage = iCardStorageProvider;
        this.cardAnalytics = bVar;
        this.extras = JsonUtils.convertJSONObjectToMap(jsonObject.optJSONObject(CardKey.EXTRAS.getKey()));
        String string = jsonObject.getString(CardKey.ID.getKey());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.id = string;
        this.cardType = CardType.DEFAULT;
        this.wasViewedInternal = jsonObject.optBoolean(CardKey.VIEWED.getKey());
        this.isDismissedInternal = jsonObject.optBoolean(CardKey.DISMISSED.getKey(), false);
        this.isPinned = jsonObject.optBoolean(CardKey.PINNED.getKey(), false);
        this.created = jsonObject.getLong(CardKey.CREATED.getKey());
        this.expiresAt = jsonObject.optLong(CardKey.EXPIRES_AT.getKey(), -1L);
        this.openUriInWebView = jsonObject.optBoolean(CardKey.OPEN_URI_IN_WEBVIEW.getKey(), false);
        this.isRemoved = jsonObject.optBoolean(CardKey.REMOVED.getKey(), false);
        this.isDismissibleByUser = jsonObject.optBoolean(CardKey.DISMISSIBLE.getKey(), false);
        this.isIndicatorHighlightedInternal = jsonObject.optBoolean(CardKey.READ.getKey(), this.wasViewedInternal);
        this.isClicked = jsonObject.optBoolean(CardKey.CLICKED.getKey(), false);
        this.isTest = jsonObject.optBoolean(CardKey.IS_TEST.getKey(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$1() {
        return "Cannot dismiss a card more than once. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$3() {
        return "Failed to log card as dismissed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isIndicatorHighlighted_$lambda$0() {
        return "Failed to mark card indicator as highlighted.";
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    public static /* synthetic */ void getViewed$annotations() {
    }

    public static /* synthetic */ void isDismissed$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidCard$lambda$13() {
        return "Card ID cannot be null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$10(Card card) {
        return "Logged click for card with id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$11(Card card) {
        return "Failed to log card clicked for id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$12(Card card) {
        return "Failed to log card as clicked for id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$4(Card card) {
        return "Logging impression event for card with id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$6(Card card) {
        return "Logging control impression event for card with id: " + card.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$8(Card card) {
        return "Failed to log card impression for card id: " + card.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(getClass(), other.getClass())) {
            Card card = (Card) other;
            if (this.created == card.created && Intrinsics.areEqual(this.id, card.id)) {
                return true;
            }
        }
        return false;
    }

    public CardType getCardType() {
        return this.cardType;
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

    public String getUrl() {
        return this.url;
    }

    /* renamed from: getViewed, reason: from getter */
    public final boolean getWasViewedInternal() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        long j = this.created;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: isClicked, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
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
        long j = this.expiresAt;
        return j != -1 && j <= DateTimeUtils.nowInSeconds();
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
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isValidCard$lambda$13;
                isValidCard$lambda$13 = Card.isValidCard$lambda$13();
                return isValidCard$lambda$13;
            }
        }, 6, (Object) null);
        return false;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String logClick$lambda$11;
                        logClick$lambda$11 = Card.logClick$lambda$11(Card.this);
                        return logClick$lambda$11;
                    }
                }, 6, (Object) null);
                return false;
            }
            b bVar = this.cardAnalytics;
            String cardId = this.id;
            ((com.braze.analytics.a) bVar).getClass();
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            k c = com.braze.models.outgoing.event.b.g.c(cardId);
            if (c != null) {
                ((r) this.brazeManager).a(c);
            }
            this.cardStorage.markCardAsClicked(this.id);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logClick$lambda$10;
                    logClick$lambda$10 = Card.logClick$lambda$10(Card.this);
                    return logClick$lambda$10;
                }
            }, 7, (Object) null);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logClick$lambda$12;
                    logClick$lambda$12 = Card.logClick$lambda$12(Card.this);
                    return logClick$lambda$12;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            if (isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String logImpression$lambda$6;
                        logImpression$lambda$6 = Card.logImpression$lambda$6(Card.this);
                        return logImpression$lambda$6;
                    }
                }, 6, (Object) null);
                b bVar = this.cardAnalytics;
                String cardId = this.id;
                ((com.braze.analytics.a) bVar).getClass();
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                k e = com.braze.models.outgoing.event.b.g.e(cardId);
                if (e != null) {
                    ((r) this.brazeManager).a(e);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String logImpression$lambda$4;
                        logImpression$lambda$4 = Card.logImpression$lambda$4(Card.this);
                        return logImpression$lambda$4;
                    }
                }, 6, (Object) null);
                b bVar2 = this.cardAnalytics;
                String cardId2 = this.id;
                ((com.braze.analytics.a) bVar2).getClass();
                Intrinsics.checkNotNullParameter(cardId2, "cardId");
                k i = com.braze.models.outgoing.event.b.g.i(cardId2);
                if (i != null) {
                    ((r) this.brazeManager).a(i);
                }
            }
            this.cardStorage.markCardAsViewed(this.id);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String logImpression$lambda$8;
                    logImpression$lambda$8 = Card.logImpression$lambda$8(Card.this);
                    return logImpression$lambda$8;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final void setDismissed(boolean z) {
        if (this.isDismissedInternal && z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_isDismissed_$lambda$1;
                    _set_isDismissed_$lambda$1 = Card._set_isDismissed_$lambda$1();
                    return _set_isDismissed_$lambda$1;
                }
            }, 6, (Object) null);
            return;
        }
        this.isDismissedInternal = z;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsDismissed(this.id);
        }
        if (z) {
            try {
                if (this.brazeManager == null || this.cardAnalytics == null || !isValidCard()) {
                    return;
                }
                b bVar = this.cardAnalytics;
                String cardId = this.id;
                ((com.braze.analytics.a) bVar).getClass();
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                k g = com.braze.models.outgoing.event.b.g.g(cardId);
                if (g != null) {
                    ((r) this.brazeManager).a(g);
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String _set_isDismissed_$lambda$3;
                        _set_isDismissed_$lambda$3 = Card._set_isDismissed_$lambda$3();
                        return _set_isDismissed_$lambda$3;
                    }
                }, 4, (Object) null);
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
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) e, false, new Function0() { // from class: com.braze.models.cards.Card$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_isIndicatorHighlighted_$lambda$0;
                    _set_isIndicatorHighlighted_$lambda$0 = Card._set_isIndicatorHighlighted_$lambda$0();
                    return _set_isIndicatorHighlighted_$lambda$0;
                }
            }, 4, (Object) null);
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
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsViewed(this.id);
        }
    }

    public String toString() {
        return StringsKt.trimIndent("\n            Card{\n            extras=" + this.extras + "\n            id='" + this.id + "'\n            created=" + this.created + "\n            expiresAt=" + this.expiresAt + "\n            viewed=" + this.wasViewedInternal + "\n            isRead=" + this.isIndicatorHighlightedInternal + "\n            isDismissed=" + this.isDismissedInternal + "\n            isRemoved=" + this.isRemoved + "\n            isPinned=" + this.isPinned + "\n            isClicked=" + this.isClicked + "\n            openUriInWebview=" + this.openUriInWebView + "\n            isDismissibleByUser=" + this.isDismissibleByUser + "\n            isTest=" + this.isTest + "\n            json=" + JsonUtils.getPrettyPrintedString(this.jsonObject) + "\n            }\n\n        ");
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getJsonKey() {
        return this.jsonObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Card(JSONObject jsonObject) {
        this(jsonObject, null, null, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
    }
}
