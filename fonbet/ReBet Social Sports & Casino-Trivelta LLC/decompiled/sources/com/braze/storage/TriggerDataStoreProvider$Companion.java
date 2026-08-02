package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.TriggerDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.C4087f;
import di.C4096j0;
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
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"com/braze/storage/TriggerDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/f;", "currentData", "migrateTriggersStorageToJson", "(LK0/c;LL0/f;)LL0/f;", "migrateTriggersReeligibilityToJson", "", "TRIGGERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "TRIGGERS_STORAGE_SHARED_PREFS", "TRIGGERS_REELIGIBILITY_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TriggerDataStoreProvider$Companion {
    public /* synthetic */ TriggerDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$1() {
        return "Migration already completed for triggered actions impression maps. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$2$0(String str) {
        return "Added timestamp for trigger:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$3$0() {
        return "Migration for " + DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey() + " completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$4() {
        return "Failed to migrate triggers reeligibility map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.TRIGGERED_ACTIONS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$1() {
        return "Migration already completed for triggered actions. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$2$0(String str) {
        return "Added triggered action from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$2$1(String str, Object obj) {
        return "Triggered action with key:" + str + " and value:" + obj + " from SharedPreferences has an invalid value and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$3$0(List list) {
        return "Migration for triggered actions completed successfully. Migrated " + list.size() + " actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$4() {
        return "Failed to migrate triggered actions to DataStore.";
    }

    public final L0.f migrateTriggersReeligibilityToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateTriggersReeligibilityToJson$lambda$0;
                migrateTriggersReeligibilityToJson$lambda$0 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$0();
                return migrateTriggersReeligibilityToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersReeligibilityToJson$lambda$1;
                    migrateTriggersReeligibilityToJson$lambda$1 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$1();
                    return migrateTriggersReeligibilityToJson$lambda$1;
                }
            }, 7, (Object) null);
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t.f29457d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.x0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateTriggersReeligibilityToJson$lambda$2$0;
                            migrateTriggersReeligibilityToJson$lambda$2$0 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$2$0(str2);
                            return migrateTriggersReeligibilityToJson$lambda$2$0;
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), linkedHashMap);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = "{}";
            }
            L0.c d10 = currentData.d();
            d10.k(L0.i.g(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersReeligibilityToJson$lambda$3$0;
                    migrateTriggersReeligibilityToJson$lambda$3$0 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$3$0();
                    return migrateTriggersReeligibilityToJson$lambda$3$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersReeligibilityToJson$lambda$4;
                    migrateTriggersReeligibilityToJson$lambda$4 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$4();
                    return migrateTriggersReeligibilityToJson$lambda$4;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final L0.f migrateTriggersStorageToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.A0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateTriggersStorageToJson$lambda$0;
                migrateTriggersStorageToJson$lambda$0 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$0();
                return migrateTriggersStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.TRIGGERED_ACTIONS.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.B0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersStorageToJson$lambda$1;
                    migrateTriggersStorageToJson$lambda$1 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$1();
                    return migrateTriggersStorageToJson$lambda$1;
                }
            }, 7, (Object) null);
            return currentData;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                final Object value = entry.getValue();
                if (!(value instanceof String) || StringsKt.isBlank((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t.f29457d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.D0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateTriggersStorageToJson$lambda$2$1;
                            migrateTriggersStorageToJson$lambda$2$1 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$2$1(str2, value);
                            return migrateTriggersStorageToJson$lambda$2$1;
                        }
                    }, 7, (Object) null);
                } else {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t.f29457d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.C0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateTriggersStorageToJson$lambda$2$0;
                            migrateTriggersStorageToJson$lambda$2$0 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$2$0(str2);
                            return migrateTriggersStorageToJson$lambda$2$0;
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
            d10.k(L0.i.g(DataStoreKey.TRIGGERED_ACTIONS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.E0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersStorageToJson$lambda$3$0;
                    migrateTriggersStorageToJson$lambda$3$0 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$3$0(arrayList);
                    return migrateTriggersStorageToJson$lambda$3$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.v0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersStorageToJson$lambda$4;
                    migrateTriggersStorageToJson$lambda$4 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$4();
                    return migrateTriggersStorageToJson$lambda$4;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private TriggerDataStoreProvider$Companion() {
    }
}
