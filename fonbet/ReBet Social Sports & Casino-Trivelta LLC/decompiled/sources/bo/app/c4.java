package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c4 {
    public static final String b(String str) {
        return "DataStoreKey not found for key: " + str;
    }

    public final DataStoreKey a(final String key) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(key, "key");
        lazy = DataStoreKey.keyMap$delegate;
        DataStoreKey dataStoreKey = (DataStoreKey) ((Map) lazy.getValue()).get(key);
        if (dataStoreKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.D
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c4.b(key);
                }
            }, 6, (Object) null);
        }
        return dataStoreKey;
    }
}
