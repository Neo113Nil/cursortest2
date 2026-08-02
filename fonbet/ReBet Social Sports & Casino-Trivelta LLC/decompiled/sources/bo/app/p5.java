package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p5 {
    public static final String a(qd qdVar) {
        return "Adding SDK Auth token to request '" + String.valueOf(qdVar.f25956d.readData(DataStoreKey.SDK_AUTH, "")) + "'";
    }

    public final void a(BrazeConfigurationProvider configurationProvider, final qd sdkAuthenticationCache, d9 brazeRequest, String deviceId) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(sdkAuthenticationCache, "sdkAuthenticationCache");
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        i2 i2Var = (i2) brazeRequest;
        i2Var.f25546g = deviceId;
        i2Var.f25547h = configurationProvider.getBrazeApiKey().f25307a;
        i2Var.f25548i = "42.2.0";
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        i2Var.f25545f = Long.valueOf(nowInMilliseconds);
        i2Var.f25544e = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(nowInMilliseconds));
        if (configurationProvider.isSdkAuthenticationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.Z8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.p5.a(bo.app.qd.this);
                }
            }, 6, (Object) null);
            i2Var.f25550k = String.valueOf(sdkAuthenticationCache.f25956d.readData(DataStoreKey.SDK_AUTH, ""));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.a9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.p5.a();
                }
            }, 6, (Object) null);
        }
    }

    public static final String a() {
        return "SDK Auth is disabled, not adding signature to request";
    }
}
