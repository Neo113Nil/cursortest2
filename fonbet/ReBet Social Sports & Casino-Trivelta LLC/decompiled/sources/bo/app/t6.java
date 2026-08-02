package bo.app;

import com.braze.storage.C2991e;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class t6 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public t6() {
        super(3, C2991e.f29417b, s6.class, "migrateEndpointMetadataToDataStore", "migrateEndpointMetadataToDataStore(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((s6) this.receiver).a((K0.c) obj, (L0.f) obj2);
    }
}
