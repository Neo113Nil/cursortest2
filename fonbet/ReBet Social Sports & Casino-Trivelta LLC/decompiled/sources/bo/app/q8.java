package bo.app;

import com.braze.storage.GeofenceDataStoreProvider;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class q8 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public q8(o8 o8Var) {
        super(3, o8Var, o8.class, "migrateGeofencesListToJson", "migrateGeofencesListToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object dataStore$migrateGeofencesListToJson;
        dataStore$migrateGeofencesListToJson = GeofenceDataStoreProvider.getDataStore$migrateGeofencesListToJson((o8) this.receiver, (K0.c) obj, (L0.f) obj2, (Continuation) obj3);
        return dataStore$migrateGeofencesListToJson;
    }
}
