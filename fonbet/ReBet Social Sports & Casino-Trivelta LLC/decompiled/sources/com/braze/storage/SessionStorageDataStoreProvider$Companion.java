package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.SessionStorageDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.Z0;
import ei.AbstractC4212b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/SessionStorageDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/f;", "currentData", "migrateSealedSessionsMapToJson", "(LK0/c;LL0/f;)LL0/f;", "", "SESSION_STORAGE", "Ljava/lang/String;", "SESSION_STORAGE_SHAREDPREFS_NAME", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionStorageDataStoreProvider$Companion {
    public /* synthetic */ SessionStorageDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.SESSION_STORAGE_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$1$0(String str) {
        return "Migrated sealed session with key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$2$0(Map map) {
        return "Migration for sealed sessions completed. Migrated " + map.size() + " sessions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$3() {
        return "Failed to migrate sealed sessions map to DataStore.";
    }

    public final L0.f migrateSealedSessionsMapToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateSealedSessionsMapToJson$lambda$0;
                migrateSealedSessionsMapToJson$lambda$0 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$0();
                return migrateSealedSessionsMapToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.SESSION_STORAGE_MAP.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!Intrinsics.areEqual(str2, DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey()) && (value instanceof String)) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) q.f29452d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.r0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateSealedSessionsMapToJson$lambda$1$0;
                            migrateSealedSessionsMapToJson$lambda$1$0 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$1$0(str2);
                            return migrateSealedSessionsMapToJson$lambda$1$0;
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                Z0 z02 = Z0.f45341a;
                str = aVar.b(new C4084d0(z02, z02), linkedHashMap);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = "{}";
            }
            L0.c d10 = currentData.d();
            d10.k(L0.i.g(DataStoreKey.SESSION_STORAGE_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.s0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateSealedSessionsMapToJson$lambda$2$0;
                    migrateSealedSessionsMapToJson$lambda$2$0 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$2$0(linkedHashMap);
                    return migrateSealedSessionsMapToJson$lambda$2$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.t0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateSealedSessionsMapToJson$lambda$3;
                    migrateSealedSessionsMapToJson$lambda$3 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$3();
                    return migrateSealedSessionsMapToJson$lambda$3;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private SessionStorageDataStoreProvider$Companion() {
    }
}
