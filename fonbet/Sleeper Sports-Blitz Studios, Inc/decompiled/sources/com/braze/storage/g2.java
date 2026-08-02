package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class g2 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public g2(PushDeliveryDataStoreProvider$Companion pushDeliveryDataStoreProvider$Companion) {
        super(3, pushDeliveryDataStoreProvider$Companion, PushDeliveryDataStoreProvider$Companion.class, "migratePushDeliveryEventsToJson", "migratePushDeliveryEventsToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((PushDeliveryDataStoreProvider$Companion) this.receiver).migratePushDeliveryEventsToJson((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
