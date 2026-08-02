package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.BannersDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.C4087f;
import di.C4093i;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"com/braze/storage/BannersDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/f;", "currentData", "migrateBannerStorageToJson", "(LK0/c;LL0/f;)LL0/f;", "migrateBannerImpressionMapToJson", "", "BANNERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "BANNERS_STORAGE_SHARED_PREFS", "BANNERS_ELIGIBILITY_SHARED_PREFS", "BANNERS_IMPRESSION_LOGGED_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BannersDataStoreProvider$Companion {
    public /* synthetic */ BannersDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.BANNERS_IMPRESSION_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$1$0(Object obj, String str) {
        return "Added impression:" + obj + " for banner:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$2$0() {
        return "Migration for Banners impression map completed successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$3() {
        return "Failed to migrate banner impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.BANNERS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$1$0(String str) {
        return "Added banner from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$1$1(Object obj) {
        return "Banner value from SharedPreferences: " + obj + " is not a String and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$2$0(List list) {
        return "Migration for banners completed successfully. Migrated " + list.size() + " banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$3() {
        return "Failed to migrate banner storage to DataStore.";
    }

    public final L0.f migrateBannerImpressionMapToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateBannerImpressionMapToJson$lambda$0;
                migrateBannerImpressionMapToJson$lambda$0 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$0();
                return migrateBannerImpressionMapToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2987a.f29404d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateBannerImpressionMapToJson$lambda$1$0;
                            migrateBannerImpressionMapToJson$lambda$1$0 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$1$0(value, str2);
                            return migrateBannerImpressionMapToJson$lambda$1$0;
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4084d0(Z0.f45341a, C4093i.f45370a), linkedHashMap);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = "{}";
            }
            L0.c d10 = currentData.d();
            d10.k(L0.i.g(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBannerImpressionMapToJson$lambda$2$0;
                    migrateBannerImpressionMapToJson$lambda$2$0 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$2$0();
                    return migrateBannerImpressionMapToJson$lambda$2$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBannerImpressionMapToJson$lambda$3;
                    migrateBannerImpressionMapToJson$lambda$3 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$3();
                    return migrateBannerImpressionMapToJson$lambda$3;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final L0.f migrateBannerStorageToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateBannerStorageToJson$lambda$0;
                migrateBannerStorageToJson$lambda$0 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$0();
                return migrateBannerStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.BANNERS.getKey()))) {
            return currentData;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2987a.f29404d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateBannerStorageToJson$lambda$1$0;
                            migrateBannerStorageToJson$lambda$1$0 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$1$0(str2);
                            return migrateBannerStorageToJson$lambda$1$0;
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2987a.f29404d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateBannerStorageToJson$lambda$1$1;
                            migrateBannerStorageToJson$lambda$1$1 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$1$1(value);
                            return migrateBannerStorageToJson$lambda$1$1;
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
            d10.k(L0.i.g(DataStoreKey.BANNERS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBannerStorageToJson$lambda$2$0;
                    migrateBannerStorageToJson$lambda$2$0 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$2$0(arrayList);
                    return migrateBannerStorageToJson$lambda$2$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBannerStorageToJson$lambda$3;
                    migrateBannerStorageToJson$lambda$3 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$3();
                    return migrateBannerStorageToJson$lambda$3;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private BannersDataStoreProvider$Companion() {
    }
}
