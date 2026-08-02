package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.ServerConfigDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4087f;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.json.JSONArray;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"com/braze/storage/ServerConfigDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/c;", "mutablePrefs", "Lcom/braze/enums/DataStoreKey;", "key", "", "migrateBlocklistedList", "(LK0/c;LL0/c;Lcom/braze/enums/DataStoreKey;)V", "LL0/f;", "currentData", "migrateBlocklistedLists", "(LK0/c;LL0/f;)LL0/f;", "", "SERVER_CONFIG_DATA_STORE_STORAGE", "Ljava/lang/String;", "SERVER_CONFIG_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ServerConfigDataStoreProvider$Companion {
    public /* synthetic */ ServerConfigDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void migrateBlocklistedList(K0.c sharedPrefs, L0.c mutablePrefs, final DataStoreKey key) {
        String str;
        try {
            String d10 = sharedPrefs.d(key.getKey(), null);
            if (d10 != null && !StringsKt.isBlank(d10)) {
                JSONArray jSONArray = new JSONArray(d10);
                final ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(string);
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
                mutablePrefs.k(L0.i.g(key.getKey()), str);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String migrateBlocklistedList$lambda$0;
                        migrateBlocklistedList$lambda$0 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$0(DataStoreKey.this, arrayList);
                        return migrateBlocklistedList$lambda$0;
                    }
                }, 7, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBlocklistedList$lambda$1;
                    migrateBlocklistedList$lambda$1 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$1(DataStoreKey.this);
                    return migrateBlocklistedList$lambda$1;
                }
            }, 7, (Object) null);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBlocklistedList$lambda$2;
                    migrateBlocklistedList$lambda$2 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$2(DataStoreKey.this);
                    return migrateBlocklistedList$lambda$2;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$0(DataStoreKey dataStoreKey, List list) {
        return "Migrated " + dataStoreKey.getKey() + " with " + list.size() + " items.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$1(DataStoreKey dataStoreKey) {
        return "No data found for " + dataStoreKey.getKey() + ", skipping";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$2(DataStoreKey dataStoreKey) {
        return "Failed to migrate " + dataStoreKey.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$0() {
        return "Starting migration for blocklisted lists";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$1() {
        return "Blocklisted lists already migrated, skipping";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$2() {
        return "Migration for blocklisted lists completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$3() {
        return "Failed to migrate blocklisted lists to DataStore";
    }

    public final L0.f migrateBlocklistedLists(K0.c sharedPrefs, L0.f currentData) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateBlocklistedLists$lambda$0;
                migrateBlocklistedLists$lambda$0 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$0();
                return migrateBlocklistedLists$lambda$0;
            }
        }, 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.BLOCKLISTED_EVENTS;
        if (!currentData.b(L0.i.g(dataStoreKey.getKey()))) {
            DataStoreKey dataStoreKey2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES;
            if (!currentData.b(L0.i.g(dataStoreKey2.getKey()))) {
                DataStoreKey dataStoreKey3 = DataStoreKey.BLOCKLISTED_PURCHASES;
                if (!currentData.b(L0.i.g(dataStoreKey3.getKey()))) {
                    try {
                        L0.c d10 = currentData.d();
                        migrateBlocklistedList(sharedPrefs, d10, dataStoreKey);
                        migrateBlocklistedList(sharedPrefs, d10, dataStoreKey2);
                        migrateBlocklistedList(sharedPrefs, d10, dataStoreKey3);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.k0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String migrateBlocklistedLists$lambda$2;
                                migrateBlocklistedLists$lambda$2 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$2();
                                return migrateBlocklistedLists$lambda$2;
                            }
                        }, 7, (Object) null);
                        return d10;
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.l0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String migrateBlocklistedLists$lambda$3;
                                migrateBlocklistedLists$lambda$3 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$3();
                                return migrateBlocklistedLists$lambda$3;
                            }
                        }, 4, (Object) null);
                        return currentData;
                    }
                }
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateBlocklistedLists$lambda$1;
                migrateBlocklistedLists$lambda$1 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$1();
                return migrateBlocklistedLists$lambda$1;
            }
        }, 7, (Object) null);
        return currentData;
    }

    private ServerConfigDataStoreProvider$Companion() {
    }
}
