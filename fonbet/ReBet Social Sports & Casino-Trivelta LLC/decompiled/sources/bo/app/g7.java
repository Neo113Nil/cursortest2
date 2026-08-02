package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.storage.C2992f;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.Z0;
import ei.AbstractC4212b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g7 {
    public static final String b() {
        return "Failed to migrate event storage to DataStore.";
    }

    public final L0.f a(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.o2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g7.a();
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.EVENT_STORAGE_MAP.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2992f.f29419b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.p2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.g7.a(str2);
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2992f.f29419b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.q2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.g7.a(value);
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
            d10.k(L0.i.g(DataStoreKey.EVENT_STORAGE_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.r2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g7.a(linkedHashMap);
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: c3.s2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g7.b();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a() {
        return "Starting migration for key: " + DataStoreKey.EVENT_STORAGE_MAP.getKey();
    }

    public static final String a(String str) {
        return "Added event from SharedPreferences key: " + str;
    }

    public static final String a(Object obj) {
        return "Event value from SharedPreferences: " + obj + " is not a String and will not be migrated to DataStore.";
    }

    public static final String a(Map map) {
        return "Migration for events completed successfully. Migrated " + map.size() + " events.";
    }
}
