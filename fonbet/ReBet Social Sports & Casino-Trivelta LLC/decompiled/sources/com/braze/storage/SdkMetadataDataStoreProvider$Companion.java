package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.storage.SdkMetadataDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4087f;
import di.Z0;
import ei.AbstractC4212b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/SdkMetadataDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/f;", "currentData", "migrateMetadataToJson", "(LK0/c;LL0/f;)LL0/f;", "", "METADATA_DATA_STORE_STORAGE", "Ljava/lang/String;", "METADATA_STORAGE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SdkMetadataDataStoreProvider$Companion {
    public /* synthetic */ SdkMetadataDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.SDK_METADATA.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$1() {
        return "Key: " + DataStoreKey.SDK_METADATA.getKey() + " already exists in DataStore. Not performing migration.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$2(Set set) {
        return "Found " + set.size() + " metadata tags to migrate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$3$0(List list) {
        return "Migration for SDK metadata completed successfully. Migrated " + list.size() + " tags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$4() {
        return "Failed to migrate SDK metadata to DataStore.";
    }

    public final L0.f migrateMetadataToJson(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateMetadataToJson$lambda$0;
                migrateMetadataToJson$lambda$0 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$0();
                return migrateMetadataToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.SDK_METADATA.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateMetadataToJson$lambda$1;
                    migrateMetadataToJson$lambda$1 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$1();
                    return migrateMetadataToJson$lambda$1;
                }
            }, 7, (Object) null);
            return currentData;
        }
        try {
            final Set e10 = sharedPrefs.e("tags", SetsKt.emptySet());
            if (e10 == null) {
                e10 = SetsKt.emptySet();
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateMetadataToJson$lambda$2;
                    migrateMetadataToJson$lambda$2 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$2(e10);
                    return migrateMetadataToJson$lambda$2;
                }
            }, 7, (Object) null);
            final List list = CollectionsKt.toList(e10);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4087f(Z0.f45341a), list);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            L0.c d10 = currentData.d();
            d10.k(L0.i.g(DataStoreKey.SDK_METADATA.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateMetadataToJson$lambda$3$0;
                    migrateMetadataToJson$lambda$3$0 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$3$0(list);
                    return migrateMetadataToJson$lambda$3$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e12, false, new Function0() { // from class: X3.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateMetadataToJson$lambda$4;
                    migrateMetadataToJson$lambda$4 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$4();
                    return migrateMetadataToJson$lambda$4;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private SdkMetadataDataStoreProvider$Companion() {
    }
}
