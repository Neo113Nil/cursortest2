package bo.app;

import com.braze.storage.C2992f;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class h7 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public h7() {
        super(3, C2992f.f29419b, g7.class, "migrateEventsStorageToJson", "migrateEventsStorageToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((g7) this.receiver).a((K0.c) obj, (L0.f) obj2);
    }
}
