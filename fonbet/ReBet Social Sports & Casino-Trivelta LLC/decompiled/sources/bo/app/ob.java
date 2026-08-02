package bo.app;

import L0.f;
import com.braze.enums.DataStoreKey;
import com.braze.storage.C2995i;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.Y;
import di.Z0;
import ei.AbstractC4212b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ob {
    public static final String b() {
        return "Failed to migrate permission request counts to DataStore.";
    }

    public final L0.f a(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        f.a g10 = L0.i.g(DataStoreKey.PERMISSION_REQUEST_COUNTS.getKey());
        if (!currentData.b(g10)) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map b10 = sharedPrefs.b();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : b10.entrySet()) {
                    if (entry.getValue() instanceof Integer) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    final String str2 = (String) entry2.getKey();
                    final Object value = entry2.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    linkedHashMap.put(str2, (Integer) value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) C2995i.f29429b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.K8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.ob.a(str2, value);
                        }
                    }, 7, (Object) null);
                }
                if (!linkedHashMap.isEmpty()) {
                    L0.c d10 = currentData.d();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                        aVar.a();
                        str = aVar.b(new C4084d0(Z0.f45341a, Y.f45337a), linkedHashMap);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str = "{}";
                    }
                    d10.k(g10, str);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.L8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.ob.a();
                        }
                    }, 7, (Object) null);
                    return d10;
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: c3.M8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.ob.b();
                    }
                }, 4, (Object) null);
                return currentData;
            }
        }
        return currentData;
    }

    public static final String a(String str, Object obj) {
        return "Migrated permission count: " + str + " = " + obj;
    }

    public static final String a() {
        return "Permission request counts migration completed";
    }
}
