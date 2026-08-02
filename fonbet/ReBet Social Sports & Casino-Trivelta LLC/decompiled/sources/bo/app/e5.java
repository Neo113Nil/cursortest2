package bo.app;

import com.braze.storage.C2989c;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class e5 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public e5() {
        super(3, C2989c.f29412b, d5.class, "migrateLegacyDeviceId", "migrateLegacyDeviceId(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((d5) this.receiver).a((K0.c) obj, (L0.f) obj2);
    }
}
