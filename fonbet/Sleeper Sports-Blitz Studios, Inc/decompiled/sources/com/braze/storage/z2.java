package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class z2 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public z2(ServerConfigDataStoreProvider$Companion serverConfigDataStoreProvider$Companion) {
        super(3, serverConfigDataStoreProvider$Companion, ServerConfigDataStoreProvider$Companion.class, "migrateBlocklistedLists", "migrateBlocklistedLists(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ServerConfigDataStoreProvider$Companion) this.receiver).migrateBlocklistedLists((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
