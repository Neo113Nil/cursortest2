package com.braze.storage;

import L0.f;
import com.braze.enums.DataStoreKey;
import com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/EventDuplicationValidatorDataStoreProvider$Companion", "", "<init>", "()V", "LK0/c;", "sharedPrefs", "LL0/f;", "currentData", "migrateEventDuplicationMap", "(LK0/c;LL0/f;)LL0/f;", "", "EVENT_DUPLICATION_VALIDATION_STORAGE", "Ljava/lang/String;", "STORAGE_PREFIX", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventDuplicationValidatorDataStoreProvider$Companion {
    public /* synthetic */ EventDuplicationValidatorDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence migrateEventDuplicationMap$lambda$1(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
        return str + ":" + ((Long) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$2$0(K0.c cVar) {
        return "Migration for event duplication map completed. Migrated " + cVar.b().size() + " events.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$3() {
        return "Failed to migrate event duplication map to DataStore.";
    }

    public final L0.f migrateEventDuplicationMap(final K0.c sharedPrefs, L0.f currentData) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.G
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateEventDuplicationMap$lambda$0;
                migrateEventDuplicationMap$lambda$0 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$0();
                return migrateEventDuplicationMap$lambda$0;
            }
        }, 7, (Object) null);
        f.a g10 = L0.i.g(DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey());
        if (currentData.b(g10)) {
            return currentData;
        }
        try {
            String joinToString$default = CollectionsKt.joinToString$default(sharedPrefs.b().entrySet(), ",", null, null, 0, null, new Function1() { // from class: X3.H
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence migrateEventDuplicationMap$lambda$1;
                    migrateEventDuplicationMap$lambda$1 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$1((Map.Entry) obj);
                    return migrateEventDuplicationMap$lambda$1;
                }
            }, 30, null);
            L0.c d10 = currentData.d();
            d10.k(g10, joinToString$default);
            BrazeLogger.brazelog$default(brazeLogger, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: X3.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateEventDuplicationMap$lambda$2$0;
                    migrateEventDuplicationMap$lambda$2$0 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$2$0(K0.c.this);
                    return migrateEventDuplicationMap$lambda$2$0;
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateEventDuplicationMap$lambda$3;
                    migrateEventDuplicationMap$lambda$3 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$3();
                    return migrateEventDuplicationMap$lambda$3;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private EventDuplicationValidatorDataStoreProvider$Companion() {
    }
}
