package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class c3 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public c3(SessionStorageDataStoreProvider$Companion sessionStorageDataStoreProvider$Companion) {
        super(3, sessionStorageDataStoreProvider$Companion, SessionStorageDataStoreProvider$Companion.class, "migrateSealedSessionsMapToJson", "migrateSealedSessionsMapToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((SessionStorageDataStoreProvider$Companion) this.receiver).migrateSealedSessionsMapToJson((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
