package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.models.FeatureFlag;
import com.braze.storage.FeatureFlagsDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.C4087f;
import di.C4093i;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"com/braze/storage/FeatureFlagsDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/f;", "currentData", "migrateFeatureFlagStorageToJson", "(LK0/c;LL0/f;)LL0/f;", "migrateFeatureFlagImpressionMapToJson", "", "FEATURE_FLAGS_DATA_STORE_STORAGE", "Ljava/lang/String;", "FEATURE_FLAGS_ELIGIBILITY_SHARED_PREFS", "FEATURE_FLAGS_STORAGE_SHARED_PREFS", "FEATURE_FLAGS_IMPRESSION_LOGGED_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeatureFlagsDataStoreProvider$Companion {
    public /* synthetic */ FeatureFlagsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$1$0(Object obj, String str) {
        return "Added impression:" + obj + " for feature flag:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$2$0() {
        return "Migration for Feature Flags impression map completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$3() {
        return "Failed to migrate Feature Flags impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.FEATURE_FLAGS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$1$0(String str) {
        return "Added feature flag from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$2$0(FeatureFlag featureFlag) {
        String str;
        if (featureFlag != null) {
            str = "Successfully decoded feature flag: " + featureFlag.getId();
        } else {
            str = null;
        }
        return String.valueOf(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$2$1(String str) {
        return "Failed to parse FeatureFlag from JSON: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$3$0() {
        return "Migration for feature flags completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$4() {
        return "Failed to migrate feature flags storage to DataStore.";
    }

    public final L0.f migrateFeatureFlagImpressionMapToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateFeatureFlagImpressionMapToJson$lambda$0;
                migrateFeatureFlagImpressionMapToJson$lambda$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$0();
                return migrateFeatureFlagImpressionMapToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2994h.f29425d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.S
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateFeatureFlagImpressionMapToJson$lambda$1$0;
                            migrateFeatureFlagImpressionMapToJson$lambda$1$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$1$0(value, str2);
                            return migrateFeatureFlagImpressionMapToJson$lambda$1$0;
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
            d10.k(L0.i.g(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateFeatureFlagImpressionMapToJson$lambda$2$0;
                    migrateFeatureFlagImpressionMapToJson$lambda$2$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$2$0();
                    return migrateFeatureFlagImpressionMapToJson$lambda$2$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateFeatureFlagImpressionMapToJson$lambda$3;
                    migrateFeatureFlagImpressionMapToJson$lambda$3 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$3();
                    return migrateFeatureFlagImpressionMapToJson$lambda$3;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final L0.f migrateFeatureFlagStorageToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        final FeatureFlag featureFlag;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.K
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateFeatureFlagStorageToJson$lambda$0;
                migrateFeatureFlagStorageToJson$lambda$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$0();
                return migrateFeatureFlagStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.FEATURE_FLAGS.getKey()))) {
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2994h.f29425d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.L
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateFeatureFlagStorageToJson$lambda$1$0;
                            migrateFeatureFlagStorageToJson$lambda$1$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$1$0(str2);
                            return migrateFeatureFlagStorageToJson$lambda$1$0;
                        }
                    }, 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                final String str3 = (String) arrayList.get(i10);
                try {
                    featureFlag = com.braze.support.e.f29482a.a(new JSONObject(str3));
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2994h.f29425d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.M
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateFeatureFlagStorageToJson$lambda$2$0;
                            migrateFeatureFlagStorageToJson$lambda$2$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$2$0(FeatureFlag.this);
                            return migrateFeatureFlagStorageToJson$lambda$2$0;
                        }
                    }, 7, (Object) null);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2994h.f29425d, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.N
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateFeatureFlagStorageToJson$lambda$2$1;
                            migrateFeatureFlagStorageToJson$lambda$2$1 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$2$1(str3);
                            return migrateFeatureFlagStorageToJson$lambda$2$1;
                        }
                    }, 4, (Object) null);
                    featureFlag = null;
                }
                if (featureFlag != null) {
                    arrayList2.add(featureFlag);
                }
                i10 = i11;
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(FeatureFlag.Companion.serializer()), arrayList2);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = arrayList2 instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            L0.c d10 = currentData.d();
            d10.k(L0.i.g(DataStoreKey.FEATURE_FLAGS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.O
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateFeatureFlagStorageToJson$lambda$3$0;
                    migrateFeatureFlagStorageToJson$lambda$3$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$3$0();
                    return migrateFeatureFlagStorageToJson$lambda$3$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e12, false, new Function0() { // from class: X3.P
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateFeatureFlagStorageToJson$lambda$4;
                    migrateFeatureFlagStorageToJson$lambda$4 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$4();
                    return migrateFeatureFlagStorageToJson$lambda$4;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private FeatureFlagsDataStoreProvider$Companion() {
    }
}
