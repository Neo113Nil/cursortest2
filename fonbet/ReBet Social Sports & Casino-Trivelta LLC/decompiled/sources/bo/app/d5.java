package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d5 {
    public final L0.f a(K0.c sharedPrefs, L0.f currentData) {
        String str = "";
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        DataStoreKey dataStoreKey = DataStoreKey.LEGACY_DEVICE_ID;
        if (currentData.b(L0.i.g(dataStoreKey.getKey()))) {
            return currentData;
        }
        try {
            L0.c d10 = currentData.d();
            String d11 = sharedPrefs.d(DataStoreKey.DEVICE_ID.getKey(), "");
            if (d11 != null) {
                str = d11;
            }
            d10.k(L0.i.g(dataStoreKey.getKey()), str);
            return d10;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.G0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.d5.a();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a() {
        return "Failed to migrate legacy device id to DataStore.";
    }
}
