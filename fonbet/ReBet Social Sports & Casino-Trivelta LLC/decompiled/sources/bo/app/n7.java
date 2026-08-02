package bo.app;

import com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class n7 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public n7(Object obj) {
        super(3, obj, EventDuplicationValidatorDataStoreProvider$Companion.class, "migrateEventDuplicationMap", "migrateEventDuplicationMap(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((EventDuplicationValidatorDataStoreProvider$Companion) this.receiver).migrateEventDuplicationMap((K0.c) obj, (L0.f) obj2);
    }
}
