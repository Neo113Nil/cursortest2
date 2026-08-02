package bo.app;

import com.braze.storage.PushDeliveryDataStoreProvider$Companion;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class cc extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public cc(Object obj) {
        super(3, obj, PushDeliveryDataStoreProvider$Companion.class, "migratePushDeliveryEventsToJson", "migratePushDeliveryEventsToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((PushDeliveryDataStoreProvider$Companion) this.receiver).migratePushDeliveryEventsToJson((K0.c) obj, (L0.f) obj2);
    }
}
