package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.PushMaxDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.C4096j0;
import di.Z0;
import ei.AbstractC4212b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"com/braze/storage/PushMaxDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/f;", "currentData", "migratePushMaxStorageToJson", "(LK0/c;LL0/f;)LL0/f;", "", "PUSH_MAX_DATA_STORE_STORAGE", "Ljava/lang/String;", "PUSH_MAX_STORAGE_SHARED_PREFS", "PUSH_MAX_METADATA_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PushMaxDataStoreProvider$Companion {
    public /* synthetic */ PushMaxDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$1$0(String str, Object obj) {
        return "Added push max campaign from SharedPreferences key: " + str + " with timestamp: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$1$1(Object obj) {
        return "Push max campaign value from SharedPreferences: " + obj + " is not a Long and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$2$0(Map map) {
        return "Migration for push max campaigns completed successfully. Migrated " + map.size() + " campaigns.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$3() {
        return "Failed to migrate push max storage to DataStore.";
    }

    public final L0.f migratePushMaxStorageToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migratePushMaxStorageToJson$lambda$0;
                migratePushMaxStorageToJson$lambda$0 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$0();
                return migratePushMaxStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) l.f29438d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migratePushMaxStorageToJson$lambda$1$0;
                            migratePushMaxStorageToJson$lambda$1$0 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$1$0(str2, value);
                            return migratePushMaxStorageToJson$lambda$1$0;
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) l.f29438d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.b0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migratePushMaxStorageToJson$lambda$1$1;
                            migratePushMaxStorageToJson$lambda$1$1 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$1$1(value);
                            return migratePushMaxStorageToJson$lambda$1$1;
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
            d10.k(L0.i.g(DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migratePushMaxStorageToJson$lambda$2$0;
                    migratePushMaxStorageToJson$lambda$2$0 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$2$0(linkedHashMap);
                    return migratePushMaxStorageToJson$lambda$2$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migratePushMaxStorageToJson$lambda$3;
                    migratePushMaxStorageToJson$lambda$3 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$3();
                    return migratePushMaxStorageToJson$lambda$3;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private PushMaxDataStoreProvider$Companion() {
    }
}
