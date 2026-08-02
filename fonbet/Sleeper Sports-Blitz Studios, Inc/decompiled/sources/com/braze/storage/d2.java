package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class d2 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public d2(a2 a2Var) {
        super(3, a2Var, a2.class, "migrateRegisteredGeofencesListToJson", "migrateRegisteredGeofencesListToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object dataStore$migrateRegisteredGeofencesListToJson;
        dataStore$migrateRegisteredGeofencesListToJson = GeofenceDataStoreProvider.getDataStore$migrateRegisteredGeofencesListToJson((a2) this.receiver, (SharedPreferencesView) obj, (Preferences) obj2, (Continuation) obj3);
        return dataStore$migrateRegisteredGeofencesListToJson;
    }
}
