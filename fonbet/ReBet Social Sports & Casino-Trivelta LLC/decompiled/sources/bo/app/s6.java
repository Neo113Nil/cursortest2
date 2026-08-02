package bo.app;

import L0.f;
import com.braze.enums.DataStoreKey;
import com.braze.storage.C2991e;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.C4096j0;
import di.Z0;
import ei.AbstractC4212b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class s6 {
    public static final String b() {
        return "Starting migration for endpoint metadata";
    }

    public static final String c() {
        return "Failed to migrate endpoint metadata to DataStore.";
    }

    public final L0.f a(K0.c sharedPrefs, L0.f currentData) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ga
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.s6.b();
            }
        }, 7, (Object) null);
        f.a g10 = L0.i.g(DataStoreKey.ENDPOINT_LAST_REQUEST_MAP.getKey());
        f.a g11 = L0.i.g(DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP.getKey());
        if (currentData.b(g10) && currentData.b(g11)) {
            return currentData;
        }
        try {
            Pair a10 = a(sharedPrefs);
            return a(currentData, g10, g11, (Map) a10.component1(), (Map) a10.component2());
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Ha
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.s6.c();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String b(String str) {
        return "Migrated last request timestamp key: " + str;
    }

    public static Pair a(K0.c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map b10 = cVar.b();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : b10.entrySet()) {
            if (entry.getValue() instanceof Long) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            s6 s6Var = C2991e.f29417b;
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
            s6Var.a(str, ((Long) value).longValue(), linkedHashMap, linkedHashMap2);
        }
        return TuplesKt.to(linkedHashMap, linkedHashMap2);
    }

    public final void a(final String str, long j10, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (StringsKt.startsWith$default(str, "uri-at-", false, 2, (Object) null)) {
            linkedHashMap2.put(str, Long.valueOf(j10));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ja
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.s6.a(str);
                }
            }, 7, (Object) null);
        } else if (StringsKt.startsWith$default(str, "uri-", false, 2, (Object) null)) {
            linkedHashMap.put(str, Long.valueOf(j10));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ka
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.s6.b(str);
                }
            }, 7, (Object) null);
        }
    }

    public static final String a(String str) {
        return "Migrated attempt count key: " + str;
    }

    public static L0.c a(L0.f fVar, f.a aVar, f.a aVar2, Map map, Map map2) {
        f.a aVar3;
        String str;
        L0.c d10 = fVar.d();
        boolean b10 = fVar.b(aVar);
        String str2 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        if (!b10) {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar4 = AbstractC4212b.f46079d;
                aVar4.a();
                str = aVar4.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), map);
                aVar3 = aVar;
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                if (!(map instanceof Map) && (map instanceof List)) {
                    aVar3 = aVar;
                    str = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                } else {
                    aVar3 = aVar;
                    str = "{}";
                }
            }
            d10.k(aVar3, str);
        }
        if (!fVar.b(aVar2)) {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar5 = AbstractC4212b.f46079d;
                aVar5.a();
                str2 = aVar5.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), map2);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                if ((map2 instanceof Map) || !(map2 instanceof List)) {
                    str2 = "{}";
                }
            }
            d10.k(aVar2, str2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ia
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.s6.a();
            }
        }, 7, (Object) null);
        return d10;
    }

    public static final String a() {
        return "Endpoint metadata migration completed successfully";
    }
}
