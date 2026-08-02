package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.PushDeliveryDataStoreProvider$Companion;
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

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/PushDeliveryDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/f;", "currentData", "migratePushDeliveryEventsToJson", "(LK0/c;LL0/f;)LL0/f;", "", "PUSH_DELIVERY_DATA_STORE_STORAGE", "Ljava/lang/String;", "PUSH_DELIVERY_STORAGE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PushDeliveryDataStoreProvider$Companion {
    public /* synthetic */ PushDeliveryDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.PUSH_DELIVERY_EVENTS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$1$0(String str, Object obj) {
        return "Added PDE with campaign ID: " + str + " and timestamp: " + obj + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$2$0(Map map) {
        return "Migration for " + DataStoreKey.PUSH_DELIVERY_EVENTS.getKey() + " completed successfully with " + map.size() + " entries";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$3() {
        return "Failed to migrate push delivery events to DataStore.";
    }

    public final L0.f migratePushDeliveryEventsToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.V
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migratePushDeliveryEventsToJson$lambda$0;
                migratePushDeliveryEventsToJson$lambda$0 = PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$0();
                return migratePushDeliveryEventsToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.PUSH_DELIVERY_EVENTS.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2996j.f29431c, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.W
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migratePushDeliveryEventsToJson$lambda$1$0;
                            migratePushDeliveryEventsToJson$lambda$1$0 = PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$1$0(str2, value);
                            return migratePushDeliveryEventsToJson$lambda$1$0;
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
            d10.k(L0.i.g(DataStoreKey.PUSH_DELIVERY_EVENTS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.X
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migratePushDeliveryEventsToJson$lambda$2$0;
                    migratePushDeliveryEventsToJson$lambda$2$0 = PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$2$0(linkedHashMap);
                    return migratePushDeliveryEventsToJson$lambda$2$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.Y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migratePushDeliveryEventsToJson$lambda$3;
                    migratePushDeliveryEventsToJson$lambda$3 = PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$3();
                    return migratePushDeliveryEventsToJson$lambda$3;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private PushDeliveryDataStoreProvider$Companion() {
    }
}
