package bo.app;

import com.braze.storage.TriggerDataStoreProvider$Companion;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class bg extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public bg(Object obj) {
        super(3, obj, TriggerDataStoreProvider$Companion.class, "migrateTriggersStorageToJson", "migrateTriggersStorageToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((TriggerDataStoreProvider$Companion) this.receiver).migrateTriggersStorageToJson((K0.c) obj, (L0.f) obj2);
    }
}
