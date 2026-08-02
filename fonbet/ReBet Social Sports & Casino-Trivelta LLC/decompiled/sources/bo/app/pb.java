package bo.app;

import com.braze.storage.C2995i;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class pb extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public pb() {
        super(3, C2995i.f29429b, ob.class, "migratePermissionCountsToDataStore", "migratePermissionCountsToDataStore(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ob) this.receiver).a((K0.c) obj, (L0.f) obj2);
    }
}
