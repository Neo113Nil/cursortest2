package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final class p2 {
    public static final String b(String str) {
        return "Migrated Int key: " + str;
    }

    public static final String c(String str) {
        return "Migrated Boolean key: " + str;
    }

    public final Preferences a(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p2.a();
            }
        }, 7, (Object) null);
        try {
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    mutablePreferences.set(PreferencesKeys.stringKey(key), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p2.a(key);
                        }
                    }, 7, (Object) null);
                } else if (value instanceof Integer) {
                    mutablePreferences.set(PreferencesKeys.intKey(key), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p2.b(key);
                        }
                    }, 7, (Object) null);
                } else if (value instanceof Boolean) {
                    mutablePreferences.set(PreferencesKeys.booleanKey(key), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p2.c(key);
                        }
                    }, 7, (Object) null);
                } else if (value instanceof Set) {
                    final Set set = value instanceof Set ? (Set) value : null;
                    if (set != null) {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        List list = CollectionsKt.toList(set);
                        try {
                            Json.Companion companion = Json.INSTANCE;
                            companion.getSerializersModule();
                            str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                            str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                        }
                        mutablePreferences.set(PreferencesKeys.stringKey(key), str);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p2$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return p2.a(key, set);
                            }
                        }, 7, (Object) null);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p2$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return p2.a(value);
                            }
                        }, 6, (Object) null);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p2$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p2.a(key, value);
                        }
                    }, 6, (Object) null);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.p2$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p2.c();
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.p2$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p2.b();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String b() {
        return "Failed to migrate runtime configuration to DataStore.";
    }

    public static final String c() {
        return "Migration for RuntimeAppConfiguration completed successfully.";
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

    public static final String a(Object obj) {
        return "StringSet value from SharedPreferences: " + obj + " could not be cast to Set<String> and will not be migrated.";
    }

    public static final String a(String str, Object obj) {
        return "Unknown type for key: " + str + ", value: " + obj + " (type: " + (obj != null ? obj.getClass().getSimpleName() : null) + ") - skipping migration";
    }
}
