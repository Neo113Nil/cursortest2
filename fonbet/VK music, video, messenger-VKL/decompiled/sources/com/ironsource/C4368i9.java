package com.ironsource;

import com.ironsource.Ve;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.i9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4368i9 {

    /* renamed from: com.ironsource.i9$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final void a(Runnable runnable) {
        R7.a(R7.a, runnable, 0L, 2, (Object) null);
    }

    public final void b(Runnable runnable) {
        R7.a.a(runnable);
    }

    public final IronSource.a[] a(List<? extends IronSourceAds.AdFormat> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = list.iterator();
        while (it.hasNext()) {
            int i = a.a[it.next().ordinal()];
            if (i == 1) {
                arrayList.add(IronSource.a.BANNER);
            } else if (i == 2) {
                arrayList.add(IronSource.a.INTERSTITIAL);
            } else if (i == 3) {
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final C4498pe b(C4498pe c4498pe) {
        return c4498pe.c() == 2080 ? new C4498pe(c4498pe.c(), "serverResponseIsNotValid") : c4498pe;
    }

    public final IronSourceError a(C4498pe c4498pe) {
        if (c4498pe.c() != 2070 && c4498pe.c() != 2110) {
            if (c4498pe.c() != 2080 && c4498pe.c() != 2100) {
                if (c4498pe.c() == 2090) {
                    return C4578u5.a.a();
                }
                return new IronSourceError(510, c4498pe.d());
            }
            return C4578u5.a.c();
        }
        return C4578u5.a.b();
    }

    public final void a(long j, Ve.a aVar) {
        JSONObject b = IronSourceUtils.b(true);
        try {
            b.put("isMultipleAdObjects", 1);
            b.put("duration", j);
            b.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Kb.u.d().q().a(new C4632x5(EnumC4650y5.SDK_INIT_SUCCESS, b));
    }

    public final void a(C4498pe c4498pe, long j) {
        JSONObject b = IronSourceUtils.b(true);
        try {
            b.put("errorCode", c4498pe.c());
            b.put("reason", c4498pe.d());
            b.put("duration", j);
            b.put("isMultipleAdObjects", 1);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Kb.u.d().q().a(new C4632x5(EnumC4650y5.SDK_INIT_FAILED, b));
    }

    public final void a(long j, long j2, long j3, long j4, long j5) {
        JSONObject b = IronSourceUtils.b(true);
        try {
            b.put(IronSourceConstants.EVENTS_EXT1, "parsingDurationMs=" + j + ";javaHeapKb=" + j2 + ";nativeHeapKb=" + j3 + ";sharedOtherKb=" + j4 + ";initResponseJsonSizeKb=" + j5);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Kb.u.d().q().a(new C4632x5(EnumC4650y5.TROUBLESHOOTING_INIT_SUCCESS, b));
    }
}
