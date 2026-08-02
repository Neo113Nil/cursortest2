package com.vk.metrics.performance.power;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.metrics.performance.power.PowerConsumptionChecker;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.l5m;
import xsna.s3q0;

/* compiled from: AppConsumptionReporter.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements izs<PowerConsumptionChecker.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(PowerConsumptionChecker.b bVar) {
        Object failure;
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem;
        Integer c;
        Integer k;
        Integer l;
        Integer m;
        PowerConsumptionChecker.b bVar2 = bVar;
        a aVar = (a) this.receiver;
        aVar.getClass();
        PowerConsumptionChecker.a aVar2 = bVar2.a;
        int i = aVar2.c;
        PowerConsumptionChecker.a aVar3 = bVar2.b;
        int i2 = aVar3.b;
        long j = aVar3.a;
        int i3 = aVar.c;
        if ((i3 != 0 && (aVar2.d || aVar3.d)) || (i3 != 0 && i3 - i2 < 0)) {
            aVar.c = i2;
            aVar.d = j;
        } else if (i3 == 0) {
            aVar.b = i;
            aVar.c = i2;
            aVar.e = i2;
            aVar.d = j;
            int a = a.a("all_delta");
            try {
                failure = Float.valueOf(a / (a.a("time_delta") / TimeUnit.MINUTES.toSeconds(1L)));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (Result.a(failure) != null) {
                failure = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            float floatValue = ((Number) failure).floatValue();
            if (Math.abs(floatValue) <= Float.MAX_VALUE) {
                schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.ENERGY_CONSUMPTION.h(), null, null, Integer.valueOf(a.a("temperature")), String.valueOf(floatValue), Integer.valueOf(a), null, Integer.valueOf(a.a("bg_delta")), null, Integer.valueOf(a.a("fg_delta")), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -698, 3, null);
            } else {
                schemeStat$TypeDevNullItem = null;
            }
            if (schemeStat$TypeDevNullItem != null && ((c = schemeStat$TypeDevNullItem.c()) == null || c.intValue() != 0 || (k = schemeStat$TypeDevNullItem.k()) == null || k.intValue() != 0 || (l = schemeStat$TypeDevNullItem.l()) == null || l.intValue() != 0 || (m = schemeStat$TypeDevNullItem.m()) == null || m.intValue() != 0)) {
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
            }
        } else {
            Preference.F(i3 - i2, "consumption_measurement", "all_delta");
            Preference.F(j - aVar.d, "consumption_measurement", "time_delta");
            if (i > aVar.b) {
                aVar.b = i;
                Preference.F(i, "consumption_measurement", "temperature");
            }
            boolean booleanValue = ((Boolean) aVar.a.invoke()).booleanValue();
            int i4 = aVar.e - i2;
            if (i4 < 0) {
                i4 = 0;
            }
            aVar.e = i2;
            if (i4 != 0) {
                if (booleanValue) {
                    Preference.F(Preference.m(0L, "consumption_measurement", "bg_delta") + i4, "consumption_measurement", "bg_delta");
                } else {
                    Preference.F(Preference.m(0L, "consumption_measurement", "fg_delta") + i4, "consumption_measurement", "fg_delta");
                }
            }
        }
        return s3q0.a;
    }
}
