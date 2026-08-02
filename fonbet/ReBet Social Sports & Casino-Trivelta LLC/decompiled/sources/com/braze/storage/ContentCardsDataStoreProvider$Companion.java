package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4087f;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"com/braze/storage/ContentCardsDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/f;", "currentData", "migrateContentCardsStorageToJson", "(LK0/c;LL0/f;)LL0/f;", "migrateContentCardsMetadataToJson", "", "CONTENT_CARDS_DATA_STORE_STORAGE", "Ljava/lang/String;", "CARD_CACHE_SHARED_PREFS", "METADATA_CACHE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentCardsDataStoreProvider$Companion {
    public /* synthetic */ ContentCardsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$0() {
        return "Starting migration for Content Cards metadata keys.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$1() {
        return "Metadata migration completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$2() {
        return "Failed to migrate content cards metadata to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.CONTENT_CARDS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$1$0(String str) {
        return "Added content card from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$1$1(Object obj) {
        return "Content card value from SharedPreferences: " + obj + " is not a String and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$2$0(List list) {
        return "Migration for content cards completed successfully. Migrated " + list.size() + " cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$3() {
        return "Failed to migrate content cards storage to DataStore.";
    }

    public final L0.f migrateContentCardsMetadataToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        String str2;
        String str3 = "42.2.0";
        String str4 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateContentCardsMetadataToJson$lambda$0;
                migrateContentCardsMetadataToJson$lambda$0 = ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$0();
                return migrateContentCardsMetadataToJson$lambda$0;
            }
        }, 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (currentData.b(L0.i.g(dataStoreKey.getKey()))) {
            return currentData;
        }
        try {
            L0.c d10 = currentData.d();
            Set e10 = sharedPrefs.e(dataStoreKey.getKey(), SetsKt.emptySet());
            if (e10 == null) {
                e10 = SetsKt.emptySet();
            }
            List list = CollectionsKt.toList(e10);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(Z0.f45341a), list);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            d10.k(L0.i.g(DataStoreKey.DISMISSED_CARDS.getKey()), str);
            Set e12 = sharedPrefs.e(DataStoreKey.EXPIRED_CARDS.getKey(), SetsKt.emptySet());
            if (e12 == null) {
                e12 = SetsKt.emptySet();
            }
            List list2 = CollectionsKt.toList(e12);
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar2 = AbstractC4212b.f46079d;
                aVar2.a();
                str2 = aVar2.b(new C4087f(Z0.f45341a), list2);
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str2 = (!(list2 instanceof Map) && (list2 instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            d10.k(L0.i.g(DataStoreKey.EXPIRED_CARDS.getKey()), str2);
            Set e14 = sharedPrefs.e(DataStoreKey.TEST_CARDS.getKey(), SetsKt.emptySet());
            if (e14 == null) {
                e14 = SetsKt.emptySet();
            }
            List list3 = CollectionsKt.toList(e14);
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar3 = AbstractC4212b.f46079d;
                aVar3.a();
                str4 = aVar3.b(new C4087f(Z0.f45341a), list3);
            } catch (Exception e15) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f29470E, (Throwable) e15, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                if ((list3 instanceof Map) || !(list3 instanceof List)) {
                    str4 = "{}";
                }
            }
            d10.k(L0.i.g(DataStoreKey.TEST_CARDS.getKey()), str4);
            DataStoreKey dataStoreKey2 = DataStoreKey.LAST_CARD_UPDATED_AT;
            d10.k(L0.i.f(dataStoreKey2.getKey()), Long.valueOf(sharedPrefs.c(dataStoreKey2.getKey(), 0L)));
            DataStoreKey dataStoreKey3 = DataStoreKey.LAST_FULL_CARD_SYNC_AT;
            d10.k(L0.i.f(dataStoreKey3.getKey()), Long.valueOf(sharedPrefs.c(dataStoreKey3.getKey(), 0L)));
            DataStoreKey dataStoreKey4 = DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP;
            d10.k(L0.i.f(dataStoreKey4.getKey()), Long.valueOf(sharedPrefs.c(dataStoreKey4.getKey(), 0L)));
            DataStoreKey dataStoreKey5 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
            String d11 = sharedPrefs.d(dataStoreKey5.getKey(), "42.2.0");
            if (d11 != null) {
                str3 = d11;
            }
            d10.k(L0.i.g(dataStoreKey5.getKey()), str3);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateContentCardsMetadataToJson$lambda$1;
                    migrateContentCardsMetadataToJson$lambda$1 = ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$1();
                    return migrateContentCardsMetadataToJson$lambda$1;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e16) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e16, false, new Function0() { // from class: X3.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateContentCardsMetadataToJson$lambda$2;
                    migrateContentCardsMetadataToJson$lambda$2 = ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$2();
                    return migrateContentCardsMetadataToJson$lambda$2;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final L0.f migrateContentCardsStorageToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateContentCardsStorageToJson$lambda$0;
                migrateContentCardsStorageToJson$lambda$0 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$0();
                return migrateContentCardsStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.CONTENT_CARDS.getKey()))) {
            return currentData;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2988b.f29408d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateContentCardsStorageToJson$lambda$1$0;
                            migrateContentCardsStorageToJson$lambda$1$0 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$1$0(str2);
                            return migrateContentCardsStorageToJson$lambda$1$0;
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2988b.f29408d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateContentCardsStorageToJson$lambda$1$1;
                            migrateContentCardsStorageToJson$lambda$1$1 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$1$1(value);
                            return migrateContentCardsStorageToJson$lambda$1$1;
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(Z0.f45341a), arrayList);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = arrayList instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            L0.c d10 = currentData.d();
            d10.k(L0.i.g(DataStoreKey.CONTENT_CARDS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateContentCardsStorageToJson$lambda$2$0;
                    migrateContentCardsStorageToJson$lambda$2$0 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$2$0(arrayList);
                    return migrateContentCardsStorageToJson$lambda$2$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateContentCardsStorageToJson$lambda$3;
                    migrateContentCardsStorageToJson$lambda$3 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$3();
                    return migrateContentCardsStorageToJson$lambda$3;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private ContentCardsDataStoreProvider$Companion() {
    }
}
