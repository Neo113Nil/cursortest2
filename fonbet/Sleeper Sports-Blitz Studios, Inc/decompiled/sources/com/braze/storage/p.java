package com.braze.storage;

import android.content.Context;
import com.braze.enums.CardKey;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class p implements ICardStorageProvider {
    public static final Set k = SetsKt.setOf((Object[]) new String[]{CardKey.VIEWED.getKey(), CardKey.DISMISSED.getKey()});

    /* renamed from: a, reason: collision with root package name */
    public final String f739a;
    public final com.braze.managers.r b;
    public final m c;
    public long d;
    public long e;
    public final LinkedHashSet f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public Map i;
    public final com.braze.analytics.a j;

    public p(Context context, String userId, String apiKey, com.braze.managers.r brazeManager, final String currentSdkVersion) {
        List arrayList;
        List emptyList;
        List arrayList2;
        List emptyList2;
        List arrayList3;
        List emptyList3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(currentSdkVersion, "currentSdkVersion");
        this.f739a = userId;
        this.b = brazeManager;
        m mVar = new m(context, userId, apiKey);
        this.c = mVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f = linkedHashSet;
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        this.i = new LinkedHashMap();
        this.j = new com.braze.analytics.a();
        c();
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = mVar.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            Json.Companion companion = Json.INSTANCE;
                            companion.getSerializersModule();
                            emptyList = (List) companion.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), str);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        linkedHashSet.addAll(arrayList);
        LinkedHashSet linkedHashSet2 = this.h;
        m mVar2 = this.c;
        DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
        if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey2), 12, (Object) null);
            arrayList2 = new ArrayList();
        } else {
            try {
                Object readData2 = mVar2.readData(dataStoreKey2, "");
                Intrinsics.checkNotNull(readData2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) readData2;
                if (StringsKt.isBlank(str2)) {
                    arrayList2 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str2)) {
                        emptyList2 = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyList2 = CollectionsKt.emptyList();
                    } else {
                        try {
                            Json.Companion companion2 = Json.INSTANCE;
                            companion2.getSerializersModule();
                            emptyList2 = (List) companion2.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), str2);
                        } catch (Exception e3) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new com.braze.support.e(str2), 4, (Object) null);
                            emptyList2 = CollectionsKt.emptyList();
                        }
                    }
                    arrayList2 = CollectionsKt.toMutableList((Collection) emptyList2);
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new i0(dataStoreKey2), 8, (Object) null);
                arrayList2 = new ArrayList();
            }
        }
        linkedHashSet2.addAll(arrayList2);
        LinkedHashSet linkedHashSet3 = this.g;
        m mVar3 = this.c;
        DataStoreKey dataStoreKey3 = DataStoreKey.TEST_CARDS;
        if (dataStoreKey3.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey3), 12, (Object) null);
            arrayList3 = new ArrayList();
        } else {
            try {
                Object readData3 = mVar3.readData(dataStoreKey3, "");
                Intrinsics.checkNotNull(readData3, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) readData3;
                if (StringsKt.isBlank(str3)) {
                    arrayList3 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str3)) {
                        emptyList3 = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str3).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyList3 = CollectionsKt.emptyList();
                    } else {
                        try {
                            Json.Companion companion3 = Json.INSTANCE;
                            companion3.getSerializersModule();
                            emptyList3 = (List) companion3.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), str3);
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.e(str3), 4, (Object) null);
                            emptyList3 = CollectionsKt.emptyList();
                        }
                    }
                    arrayList3 = CollectionsKt.toMutableList((Collection) emptyList3);
                }
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new i0(dataStoreKey3), 8, (Object) null);
                arrayList3 = new ArrayList();
            }
        }
        linkedHashSet3.addAll(arrayList3);
        m mVar4 = this.c;
        DataStoreKey dataStoreKey4 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        Object readData4 = mVar4.readData(dataStoreKey4, "");
        Intrinsics.checkNotNull(readData4, "null cannot be cast to non-null type kotlin.String");
        final String str4 = (String) readData4;
        if (!Intrinsics.areEqual(currentSdkVersion, str4)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.a(str4, currentSdkVersion);
                }
            }, 6, (Object) null);
            this.c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
            this.c.writeData(dataStoreKey4, currentSdkVersion);
        }
        Object readData5 = this.c.readData(DataStoreKey.LAST_CARD_UPDATED_AT, 0L);
        Intrinsics.checkNotNull(readData5, "null cannot be cast to non-null type kotlin.Long");
        this.d = ((Long) readData5).longValue();
        Object readData6 = this.c.readData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
        Intrinsics.checkNotNull(readData6, "null cannot be cast to non-null type kotlin.Long");
        this.e = ((Long) readData6).longValue();
    }

    public static final String a(String str, String str2) {
        return "Detected SDK update from '" + str + "' -> '" + str2 + "'. Clearing config update time.";
    }

    public static final String b(JSONObject jSONObject) {
        return "Server card json: " + jSONObject;
    }

    public static final String c(JSONObject jSONObject) {
        return "Cached card json: " + jSONObject;
    }

    public static final String d() {
        return "The server card received is older than the cached card. Not updating the cached card.";
    }

    public static final String e(JSONObject jSONObject) {
        return "Server card has expired already. Not adding card to storage. Server card: " + jSONObject;
    }

    public static final String g(String str) {
        return "Card not present in storage for id: " + str;
    }

    public static final String h(String str) {
        return "Failed to read card json from storage. Json: " + str;
    }

    public static final String j(String str) {
        return "Removing card from test cache: " + str;
    }

    public static final String k(String str) {
        return "Removing card from storage with id: " + str;
    }

    public static final String l(String str) {
        return "Server card is marked as removed. Removing from card storage with id: " + str;
    }

    public static final String m(String str) {
        return "Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: " + str;
    }

    public static final String n(String str) {
        return "Can't update card field. Json cannot be parsed from disk or is not present. Id: " + str;
    }

    public static final String o(String str) {
        return "Removing card from storage with id: " + str;
    }

    public static final String p(String str) {
        return "Writing card to storage with id: " + str;
    }

    public final JSONObject f(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        final String str = (String) this.i.get(cardId);
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.g(cardId);
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.h(str);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final Object getCachedCardsAsEvent() {
        return a(true, (Long) null);
    }

    public final void i(final String cardId) {
        String str;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.j(cardId);
            }
        }, 6, (Object) null);
        LinkedHashSet linkedHashSet = this.g;
        linkedHashSet.remove(cardId);
        m mVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List list = CollectionsKt.toList(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            mVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsClicked(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.CLICKED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsDismissed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId);
        a(cardId, (JSONObject) null);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsViewed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.VIEWED);
    }

    @Override // com.braze.storage.ICardStorageProvider
    public final void markCardAsVisuallyRead(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        a(cardId, CardKey.READ);
    }

    public static final String c(String str) {
        return "Adding card to test cache: " + str;
    }

    public static final String d(JSONObject jSONObject) {
        return "Server card was locally dismissed already. Not adding card to storage. Server card: " + jSONObject;
    }

    public static final String e() {
        return "Input user id was null. Defaulting to the empty user id";
    }

    public final void a(final JSONObject json) {
        JSONObject jSONObject;
        String str;
        Set set = CollectionsKt.toSet(this.f);
        Set set2 = CollectionsKt.toSet(this.h);
        final String cardId = json.getString(CardKey.ID.getKey());
        Intrinsics.checkNotNull(cardId);
        final JSONObject f = f(cardId);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.b(json);
            }
        }, 7, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.c(f);
            }
        }, 7, (Object) null);
        Intrinsics.checkNotNullParameter(json, "serverCard");
        if (f != null) {
            String key = CardKey.CREATED.getKey();
            if (f.has(key) && json.has(key) && f.getLong(key) > json.getLong(key)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.d();
                    }
                }, 6, (Object) null);
                return;
            }
        }
        CardKey cardKey = CardKey.REMOVED;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        String key2 = cardKey.getKey();
        if (json.has(key2) ? json.getBoolean(key2) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.l(cardId);
                }
            }, 7, (Object) null);
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f.remove(cardId);
            m mVar = this.c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List list = CollectionsKt.toList(this.f);
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        Json.Companion companion = Json.INSTANCE;
                        companion.getSerializersModule();
                        str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                        str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    mVar.writeData(dataStoreKey, str);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
                }
            }
            i(cardId);
            a(cardId, (JSONObject) null);
            return;
        }
        if (set.contains(cardId)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.d(json);
                }
            }, 7, (Object) null);
            return;
        }
        if (set2.contains(cardId)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.e(json);
                }
            }, 7, (Object) null);
            return;
        }
        CardKey cardKey2 = CardKey.DISMISSED;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(cardKey2, "cardKey");
        String key3 = cardKey2.getKey();
        if (json.has(key3) ? json.getBoolean(key3) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.m(cardId);
                }
            }, 7, (Object) null);
            a(cardId);
            a(cardId, (JSONObject) null);
            return;
        }
        Intrinsics.checkNotNullParameter(json, "serverCard");
        if (f == null) {
            jSONObject = json;
        } else {
            jSONObject = new JSONObject();
            Iterator<String> keys = f.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, f.get(next));
            }
            Iterator<String> keys2 = json.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (k.contains(next2)) {
                    jSONObject.put(next2, f.getBoolean(next2) || json.getBoolean(next2));
                } else {
                    jSONObject.put(next2, json.get(next2));
                }
            }
        }
        a(cardId, jSONObject);
        CardKey cardKey3 = CardKey.IS_TEST;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(cardKey3, "cardKey");
        String key4 = cardKey3.getKey();
        if (json.has(key4) ? json.getBoolean(key4) : false) {
            b(cardId);
        }
    }

    public final void b(final String cardId) {
        String str;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.c(cardId);
            }
        }, 6, (Object) null);
        LinkedHashSet linkedHashSet = this.g;
        linkedHashSet.add(cardId);
        m mVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List list = CollectionsKt.toList(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            mVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String d(String str) {
        return "Failed to parse card JSON, skipping: " + str;
    }

    public static final String e(String str) {
        return "Deleting expired card from storage with id: " + str;
    }

    public final void c() {
        Iterable<String> arrayList;
        List emptyList;
        Pair pair;
        m mVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = mVar.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            Json.Companion companion = Json.INSTANCE;
                            companion.getSerializersModule();
                            emptyList = (List) companion.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), str);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (final String str2 : arrayList) {
            try {
                pair = TuplesKt.to(new JSONObject(str2).getString(CardKey.ID.getKey()), str2);
            } catch (JSONException e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.d(str2);
                    }
                }, 4, (Object) null);
                pair = null;
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        this.i = MapsKt.toMutableMap(MapsKt.toMap(arrayList2));
    }

    public static final String b() {
        return "Clearing content card storage.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ContentCardsUpdatedEvent a(com.braze.models.response.c contentCardsResponse, String str) {
        final p pVar;
        String str2;
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (str == 0) {
            pVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.e();
                }
            }, 7, (Object) null);
            objectRef.element = "";
        } else {
            pVar = this;
        }
        if (!Intrinsics.areEqual(pVar.f739a, objectRef.element)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.a(Ref.ObjectRef.this, pVar);
                }
            }, 6, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.a(Ref.ObjectRef.this);
            }
        }, 6, (Object) null);
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        long j = contentCardsResponse.f651a;
        if (j != -1) {
            this.d = j;
            this.c.writeData(DataStoreKey.LAST_CARD_UPDATED_AT, Long.valueOf(j));
        }
        long j2 = contentCardsResponse.b;
        if (j2 != -1) {
            this.e = j2;
            this.c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, Long.valueOf(j2));
        }
        this.c.writeData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, Long.valueOf(DateTimeUtils.nowInSeconds()));
        LinkedHashSet cardIdsToRetain = new LinkedHashSet();
        JSONArray jSONArray = contentCardsResponse.d;
        if (jSONArray != null && jSONArray.length() != 0) {
            for (JSONObject jSONObject : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new n(jSONArray)), new o(jSONArray))) {
                a(jSONObject);
                String string = jSONObject.getString(CardKey.ID.getKey());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                cardIdsToRetain.add(string);
            }
        }
        if (contentCardsResponse.c) {
            Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
            this.f.retainAll(cardIdsToRetain);
            m mVar = this.c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List list = CollectionsKt.toList(this.f);
            DataStoreValueType type = dataStoreKey.getType();
            DataStoreValueType dataStoreValueType = DataStoreValueType.LIST;
            String str3 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            if (type != dataStoreValueType) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        Json.Companion companion = Json.INSTANCE;
                        companion.getSerializersModule();
                        str2 = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                        str2 = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    mVar.writeData(dataStoreKey, str2);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
                }
            }
            Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
            LinkedHashSet linkedHashSet = this.h;
            linkedHashSet.retainAll(cardIdsToRetain);
            m mVar2 = this.c;
            DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
            List list2 = CollectionsKt.toList(linkedHashSet);
            if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        Json.Companion companion2 = Json.INSTANCE;
                        companion2.getSerializersModule();
                        str3 = companion2.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list2);
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                        if ((list2 instanceof Map) || !(list2 instanceof List)) {
                            str3 = "{}";
                        }
                    }
                    mVar2.writeData(dataStoreKey2, str3);
                } catch (Exception e4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new p0(dataStoreKey2), 8, (Object) null);
                }
            }
            cardIdsToRetain.addAll(this.g);
            a(cardIdsToRetain);
        }
        return a(false, (Long) null);
    }

    public static final String a(Ref.ObjectRef objectRef, p pVar) {
        return "The received cards are for user " + objectRef.element + " and the current user is " + pVar.f739a + " , the cards will be discarded and no changes will be made.";
    }

    public static final String a(Ref.ObjectRef objectRef) {
        return "Updating offline Content Cards for user with id: " + objectRef.element;
    }

    public final ContentCardsUpdatedEvent a(boolean z, Long l) {
        long longValue;
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List a2 = com.braze.models.h.a(jSONArray, this.b, this, this.j);
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
        String str = this.f739a;
        if (l != null) {
            longValue = l.longValue();
        } else {
            Object readData = this.c.readData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, 0L);
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
            longValue = ((Long) readData).longValue();
        }
        return new ContentCardsUpdatedEvent(list2, str, longValue, z);
    }

    public final void a(Card card) {
        String str;
        Intrinsics.checkNotNullParameter(card, "card");
        final String cardId = card.getId();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.e(cardId);
            }
        }, 7, (Object) null);
        a(cardId, (JSONObject) null);
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.h.add(cardId);
        m mVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.EXPIRED_CARDS;
        List list = CollectionsKt.toList(this.h);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                    str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                }
                mVar.writeData(dataStoreKey, str);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
            }
        }
        i(cardId);
    }

    public final void a(final String cardId, final CardKey cardKey) {
        final Boolean value = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject f = f(cardId);
        if (f == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.n(cardId);
                }
            }, 7, (Object) null);
            return;
        }
        try {
            f.put(cardKey.getKey(), value);
            a(cardId, f);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.a(value, cardKey);
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Object obj, CardKey cardKey) {
        return "Failed to update card json field to " + obj + " with key: " + cardKey;
    }

    public final void a(final String cardId, JSONObject jSONObject) {
        p pVar;
        String str;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (jSONObject == null) {
            pVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.o(cardId);
                }
            }, 7, (Object) null);
            pVar.i.remove(cardId);
        } else {
            pVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.p(cardId);
                }
            }, 7, (Object) null);
            pVar.i.put(cardId, jSONObject.toString());
        }
        List list = CollectionsKt.toList(pVar.i.values());
        m mVar = pVar.c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            mVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(String cardId) {
        String str;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f.add(cardId);
        m mVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        List list = CollectionsKt.toList(this.f);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            mVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(final LinkedHashSet cardIdsToRetain) {
        String str;
        Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
        final Set keySet = this.i.keySet();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.a(cardIdsToRetain, keySet);
            }
        }, 7, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!cardIdsToRetain.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final String str2 = (String) it.next();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.k(str2);
                }
            }, 7, (Object) null);
            this.i.remove(str2);
        }
        List list = CollectionsKt.toList(this.i.values());
        m mVar = this.c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            mVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Set set, Set set2) {
        return "Retaining card ids: " + set + " among cached card ids: " + set2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.b();
            }
        }, 7, (Object) null);
        this.i.clear();
        this.h.clear();
        this.c.clearAllData();
    }
}
