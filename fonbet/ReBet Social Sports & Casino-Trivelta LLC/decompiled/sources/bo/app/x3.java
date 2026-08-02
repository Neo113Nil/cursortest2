package bo.app;

import android.content.Context;
import com.braze.enums.CardKey;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.storage.C2988b;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import di.C4087f;
import di.Z0;
import ei.AbstractC4212b;
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
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x3 implements ICardStorageProvider {

    /* renamed from: k, reason: collision with root package name */
    public static final Set f26223k = SetsKt.setOf((Object[]) new String[]{CardKey.VIEWED.getKey(), CardKey.DISMISSED.getKey()});

    /* renamed from: a, reason: collision with root package name */
    public final String f26224a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f26225b;

    /* renamed from: c, reason: collision with root package name */
    public final C2988b f26226c;

    /* renamed from: d, reason: collision with root package name */
    public long f26227d;

    /* renamed from: e, reason: collision with root package name */
    public long f26228e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f26229f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f26230g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f26231h;

    /* renamed from: i, reason: collision with root package name */
    public Map f26232i;

    /* renamed from: j, reason: collision with root package name */
    public final r3 f26233j;

    public x3(Context context, String userId, String apiKey, e2 brazeManager) {
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
        final String str = "42.2.0";
        Intrinsics.checkNotNullParameter("42.2.0", "currentSdkVersion");
        this.f26224a = userId;
        this.f26225b = brazeManager;
        C2988b c2988b = new C2988b(context, userId, apiKey);
        this.f26226c = c2988b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f26229f = linkedHashSet;
        this.f26230g = new LinkedHashSet();
        this.f26231h = new LinkedHashSet();
        this.f26232i = new LinkedHashMap();
        this.f26233j = new r3();
        c();
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = c2988b.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) readData;
                if (StringsKt.isBlank(str2)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str2)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), "null")) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            aVar.a();
                            emptyList = (List) aVar.d(new C4087f(Z0.f45341a), str2);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new DataStoreUtils.a(str2), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        linkedHashSet.addAll(arrayList);
        LinkedHashSet linkedHashSet2 = this.f26231h;
        C2988b c2988b2 = this.f26226c;
        DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
        if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey2), 12, (Object) null);
            arrayList2 = new ArrayList();
        } else {
            try {
                Object readData2 = c2988b2.readData(dataStoreKey2, "");
                Intrinsics.checkNotNull(readData2, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) readData2;
                if (StringsKt.isBlank(str3)) {
                    arrayList2 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str3)) {
                        emptyList2 = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str3).toString(), "null")) {
                        emptyList2 = CollectionsKt.emptyList();
                    } else {
                        try {
                            AbstractC4212b.a aVar2 = AbstractC4212b.f46079d;
                            aVar2.a();
                            emptyList2 = (List) aVar2.d(new C4087f(Z0.f45341a), str3);
                        } catch (Exception e12) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e12, false, (Function0) new DataStoreUtils.a(str3), 4, (Object) null);
                            emptyList2 = CollectionsKt.emptyList();
                        }
                    }
                    arrayList2 = CollectionsKt.toMutableList((Collection) emptyList2);
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.j(dataStoreKey2), 8, (Object) null);
                arrayList2 = new ArrayList();
            }
        }
        linkedHashSet2.addAll(arrayList2);
        LinkedHashSet linkedHashSet3 = this.f26230g;
        C2988b c2988b3 = this.f26226c;
        DataStoreKey dataStoreKey3 = DataStoreKey.TEST_CARDS;
        if (dataStoreKey3.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey3), 12, (Object) null);
            arrayList3 = new ArrayList();
        } else {
            try {
                Object readData3 = c2988b3.readData(dataStoreKey3, "");
                Intrinsics.checkNotNull(readData3, "null cannot be cast to non-null type kotlin.String");
                String str4 = (String) readData3;
                if (StringsKt.isBlank(str4)) {
                    arrayList3 = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str4)) {
                        emptyList3 = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str4).toString(), "null")) {
                        emptyList3 = CollectionsKt.emptyList();
                    } else {
                        try {
                            AbstractC4212b.a aVar3 = AbstractC4212b.f46079d;
                            aVar3.a();
                            emptyList3 = (List) aVar3.d(new C4087f(Z0.f45341a), str4);
                        } catch (Exception e14) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f29470E, (Throwable) e14, false, (Function0) new DataStoreUtils.a(str4), 4, (Object) null);
                            emptyList3 = CollectionsKt.emptyList();
                        }
                    }
                    arrayList3 = CollectionsKt.toMutableList((Collection) emptyList3);
                }
            } catch (Exception e15) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e15, false, (Function0) new DataStoreProvider.j(dataStoreKey3), 8, (Object) null);
                arrayList3 = new ArrayList();
            }
        }
        linkedHashSet3.addAll(arrayList3);
        C2988b c2988b4 = this.f26226c;
        DataStoreKey dataStoreKey4 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
        Object readData4 = c2988b4.readData(dataStoreKey4, "");
        Intrinsics.checkNotNull(readData4, "null cannot be cast to non-null type kotlin.String");
        final String str5 = (String) readData4;
        if (!Intrinsics.areEqual("42.2.0", str5)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.Zb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.a(str5, str);
                }
            }, 6, (Object) null);
            this.f26226c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
            this.f26226c.writeData(dataStoreKey4, "42.2.0");
        }
        Object readData5 = this.f26226c.readData(DataStoreKey.LAST_CARD_UPDATED_AT, 0L);
        Intrinsics.checkNotNull(readData5, "null cannot be cast to non-null type kotlin.Long");
        this.f26227d = ((Long) readData5).longValue();
        Object readData6 = this.f26226c.readData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, 0L);
        Intrinsics.checkNotNull(readData6, "null cannot be cast to non-null type kotlin.Long");
        this.f26228e = ((Long) readData6).longValue();
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
        final String str = (String) this.f26232i.get(cardId);
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Rb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.g(cardId);
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Sb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.h(str);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final void i(final String cardId) {
        String str;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.gc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x3.j(cardId);
            }
        }, 6, (Object) null);
        LinkedHashSet linkedHashSet = this.f26230g;
        linkedHashSet.remove(cardId);
        C2988b c2988b = this.f26226c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List list = CollectionsKt.toList(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(Z0.f45341a), list);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            c2988b.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
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
        Set set = CollectionsKt.toSet(this.f26229f);
        Set set2 = CollectionsKt.toSet(this.f26231h);
        final String cardId = json.getString(CardKey.ID.getKey());
        Intrinsics.checkNotNull(cardId);
        final JSONObject f10 = f(cardId);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Tb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x3.b(json);
            }
        }, 7, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ub
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x3.c(f10);
            }
        }, 7, (Object) null);
        Intrinsics.checkNotNullParameter(json, "serverCard");
        if (f10 != null) {
            String key = CardKey.CREATED.getKey();
            if (f10.has(key) && json.has(key) && f10.getLong(key) > json.getLong(key)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Vb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.x3.d();
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
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Wb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.l(cardId);
                }
            }, 7, (Object) null);
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f26229f.remove(cardId);
            C2988b c2988b = this.f26226c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List list = CollectionsKt.toList(this.f26229f);
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                        aVar.a();
                        str = aVar.b(new C4087f(Z0.f45341a), list);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    c2988b.writeData(dataStoreKey, str);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            i(cardId);
            a(cardId, (JSONObject) null);
            return;
        }
        if (set.contains(cardId)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Xb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.d(json);
                }
            }, 7, (Object) null);
            return;
        }
        if (set2.contains(cardId)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Yb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.e(json);
                }
            }, 7, (Object) null);
            return;
        }
        CardKey cardKey2 = CardKey.DISMISSED;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(cardKey2, "cardKey");
        String key3 = cardKey2.getKey();
        if (json.has(key3) ? json.getBoolean(key3) : false) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ac
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.m(cardId);
                }
            }, 7, (Object) null);
            a(cardId);
            a(cardId, (JSONObject) null);
            return;
        }
        Intrinsics.checkNotNullParameter(json, "serverCard");
        if (f10 == null) {
            jSONObject = json;
        } else {
            jSONObject = new JSONObject();
            Iterator<String> keys = f10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, f10.get(next));
            }
            Iterator<String> keys2 = json.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (f26223k.contains(next2)) {
                    jSONObject.put(next2, f10.getBoolean(next2) || json.getBoolean(next2));
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
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.dc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x3.c(cardId);
            }
        }, 6, (Object) null);
        LinkedHashSet linkedHashSet = this.f26230g;
        linkedHashSet.add(cardId);
        C2988b c2988b = this.f26226c;
        DataStoreKey dataStoreKey = DataStoreKey.TEST_CARDS;
        List list = CollectionsKt.toList(linkedHashSet);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(Z0.f45341a), list);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            c2988b.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
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
        C2988b c2988b = this.f26226c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = c2988b.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            aVar.a();
                            emptyList = (List) aVar.d(new C4087f(Z0.f45341a), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (final String str2 : arrayList) {
            try {
                pair = TuplesKt.to(new JSONObject(str2).getString(CardKey.ID.getKey()), str2);
            } catch (JSONException e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e12, false, new Function0() { // from class: c3.hc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.x3.d(str2);
                    }
                }, 4, (Object) null);
                pair = null;
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        this.f26232i = MapsKt.toMutableMap(MapsKt.toMap(arrayList2));
    }

    public static final String b() {
        return "Clearing content card storage.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ContentCardsUpdatedEvent a(u3 contentCardsResponse, String str) {
        final x3 x3Var;
        String str2;
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (str == 0) {
            x3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) x3Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.kc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.e();
                }
            }, 7, (Object) null);
            objectRef.element = "";
        } else {
            x3Var = this;
        }
        if (!Intrinsics.areEqual(x3Var.f26224a, objectRef.element)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) x3Var, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.lc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.a(Ref.ObjectRef.this, x3Var);
                }
            }, 6, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Pb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x3.a(Ref.ObjectRef.this);
            }
        }, 6, (Object) null);
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        long j10 = contentCardsResponse.f26099a;
        if (j10 != -1) {
            this.f26227d = j10;
            this.f26226c.writeData(DataStoreKey.LAST_CARD_UPDATED_AT, Long.valueOf(j10));
        }
        long j11 = contentCardsResponse.f26100b;
        if (j11 != -1) {
            this.f26228e = j11;
            this.f26226c.writeData(DataStoreKey.LAST_FULL_CARD_SYNC_AT, Long.valueOf(j11));
        }
        this.f26226c.writeData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, Long.valueOf(DateTimeUtils.nowInSeconds()));
        LinkedHashSet cardIdsToRetain = new LinkedHashSet();
        JSONArray jSONArray = contentCardsResponse.f26102d;
        if (jSONArray != null && jSONArray.length() != 0) {
            for (JSONObject jSONObject : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new v3(jSONArray)), new w3(jSONArray))) {
                a(jSONObject);
                String string = jSONObject.getString(CardKey.ID.getKey());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                cardIdsToRetain.add(string);
            }
        }
        if (contentCardsResponse.f26101c) {
            Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
            this.f26229f.retainAll(cardIdsToRetain);
            C2988b c2988b = this.f26226c;
            DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
            List list = CollectionsKt.toList(this.f26229f);
            DataStoreValueType type = dataStoreKey.getType();
            DataStoreValueType dataStoreValueType = DataStoreValueType.LIST;
            String str3 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            if (type != dataStoreValueType) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                        aVar.a();
                        str2 = aVar.b(new C4087f(Z0.f45341a), list);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str2 = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    c2988b.writeData(dataStoreKey, str2);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
            LinkedHashSet linkedHashSet = this.f26231h;
            linkedHashSet.retainAll(cardIdsToRetain);
            C2988b c2988b2 = this.f26226c;
            DataStoreKey dataStoreKey2 = DataStoreKey.EXPIRED_CARDS;
            List list2 = CollectionsKt.toList(linkedHashSet);
            if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4212b.a aVar2 = AbstractC4212b.f46079d;
                        aVar2.a();
                        str3 = aVar2.b(new C4087f(Z0.f45341a), list2);
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e12, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        if ((list2 instanceof Map) || !(list2 instanceof List)) {
                            str3 = "{}";
                        }
                    }
                    c2988b2.writeData(dataStoreKey2, str3);
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.p(dataStoreKey2), 8, (Object) null);
                }
            }
            cardIdsToRetain.addAll(this.f26230g);
            a(cardIdsToRetain);
        }
        return a(false, (Long) null);
    }

    public static final String a(Ref.ObjectRef objectRef, x3 x3Var) {
        return "The received cards are for user " + objectRef.element + " and the current user is " + x3Var.f26224a + " , the cards will be discarded and no changes will be made.";
    }

    public static final String a(Ref.ObjectRef objectRef) {
        return "Updating offline Content Cards for user with id: " + objectRef.element;
    }

    public final ContentCardsUpdatedEvent a(boolean z10, Long l10) {
        long longValue;
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f26232i.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List a10 = n3.a(jSONArray, this.f26225b, this, this.f26233j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : a10) {
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
        String str = this.f26224a;
        if (l10 != null) {
            longValue = l10.longValue();
        } else {
            Object readData = this.f26226c.readData(DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP, 0L);
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
            longValue = ((Long) readData).longValue();
        }
        return new ContentCardsUpdatedEvent(list2, str, longValue, z10);
    }

    public final void a(Card card) {
        String str;
        Intrinsics.checkNotNullParameter(card, "card");
        final String cardId = card.getId();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ob
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x3.e(cardId);
            }
        }, 7, (Object) null);
        a(cardId, (JSONObject) null);
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f26231h.add(cardId);
        C2988b c2988b = this.f26226c;
        DataStoreKey dataStoreKey = DataStoreKey.EXPIRED_CARDS;
        List list = CollectionsKt.toList(this.f26231h);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                    aVar.a();
                    str = aVar.b(new C4087f(Z0.f45341a), list);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                    str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                }
                c2988b.writeData(dataStoreKey, str);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
            }
        }
        i(cardId);
    }

    public final void a(final String cardId, final CardKey cardKey) {
        final Boolean value = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject f10 = f(cardId);
        if (f10 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ic
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.n(cardId);
                }
            }, 7, (Object) null);
            return;
        }
        try {
            f10.put(cardKey.getKey(), value);
            a(cardId, f10);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.jc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.a(value, cardKey);
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Object obj, CardKey cardKey) {
        return "Failed to update card json field to " + obj + " with key: " + cardKey;
    }

    public final void a(final String cardId, JSONObject jSONObject) {
        x3 x3Var;
        String str;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        if (jSONObject == null) {
            x3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) x3Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ec
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.o(cardId);
                }
            }, 7, (Object) null);
            x3Var.f26232i.remove(cardId);
        } else {
            x3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) x3Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.fc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.p(cardId);
                }
            }, 7, (Object) null);
            x3Var.f26232i.put(cardId, jSONObject.toString());
        }
        List list = CollectionsKt.toList(x3Var.f26232i.values());
        C2988b c2988b = x3Var.f26226c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(Z0.f45341a), list);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            c2988b.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(String cardId) {
        String str;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f26229f.add(cardId);
        C2988b c2988b = this.f26226c;
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        List list = CollectionsKt.toList(this.f26229f);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(Z0.f45341a), list);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            c2988b.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(final LinkedHashSet cardIdsToRetain) {
        String str;
        Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
        final Set keySet = this.f26232i.keySet();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.bc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x3.a(cardIdsToRetain, keySet);
            }
        }, 7, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!cardIdsToRetain.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            final String str2 = (String) arrayList.get(i10);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.cc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.x3.k(str2);
                }
            }, 7, (Object) null);
            this.f26232i.remove(str2);
        }
        List list = CollectionsKt.toList(this.f26232i.values());
        C2988b c2988b = this.f26226c;
        DataStoreKey dataStoreKey = DataStoreKey.CONTENT_CARDS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(Z0.f45341a), list);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            c2988b.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Set set, Set set2) {
        return "Retaining card ids: " + set + " among cached card ids: " + set2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Qb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x3.b();
            }
        }, 7, (Object) null);
        this.f26232i.clear();
        this.f26231h.clear();
        this.f26226c.clearAllData();
    }
}
