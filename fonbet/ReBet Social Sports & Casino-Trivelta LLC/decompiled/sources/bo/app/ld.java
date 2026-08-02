package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4087f;
import di.Z0;
import ei.AbstractC4212b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class ld {
    public static final String b(String str) {
        return "Migrated Int key: " + str;
    }

    public static final String c(String str) {
        return "Migrated Boolean key: " + str;
    }

    public final L0.f a(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.p5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.ld.a();
            }
        }, 7, (Object) null);
        try {
            L0.c d10 = currentData.d();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    d10.k(L0.i.g(str2), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.q5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.ld.a(str2);
                        }
                    }, 7, (Object) null);
                } else if (value instanceof Integer) {
                    d10.k(L0.i.e(str2), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.r5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.ld.b(str2);
                        }
                    }, 7, (Object) null);
                } else if (value instanceof Boolean) {
                    d10.k(L0.i.a(str2), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.s5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.ld.c(str2);
                        }
                    }, 7, (Object) null);
                } else if (value instanceof Set) {
                    final Set set = (Set) value;
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List list = CollectionsKt.toList(set);
                    try {
                        AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                        aVar.a();
                        str = aVar.b(new C4087f(Z0.f45341a), list);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    d10.k(L0.i.g(str2), str);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.t5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.ld.a(str2, set);
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.u5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.ld.a(str2, value);
                        }
                    }, 6, (Object) null);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ld.b();
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: c3.w5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ld.c();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String b() {
        return "Migration for RuntimeAppConfiguration completed successfully.";
    }

    public static final String c() {
        return "Failed to migrate runtime configuration to DataStore.";
    }

    public static final String a() {
        return "Starting migration for RuntimeAppConfiguration";
    }

    public static final String a(String str) {
        return "Migrated String key: " + str;
    }

    public static final String a(String str, Set set) {
        return "Migrated StringSet key: " + str + " with " + set.size() + " items";
    }

    public static final String a(String str, Object obj) {
        return "Unknown type for key: " + str + ", value: " + obj + " (type: " + (obj != null ? obj.getClass().getSimpleName() : null) + ") - skipping migration";
    }
}
