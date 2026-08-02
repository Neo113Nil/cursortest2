package bo.app;

import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class md extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public md() {
        super(3, com.braze.storage.m.f29442a, ld.class, "migrateRuntimeConfigToDataStore", "migrateRuntimeConfigToDataStore(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ld) this.receiver).a((K0.c) obj, (L0.f) obj2);
    }
}
