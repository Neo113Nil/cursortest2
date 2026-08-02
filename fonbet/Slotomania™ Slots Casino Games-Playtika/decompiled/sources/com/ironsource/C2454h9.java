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
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2454h9 {

    /* renamed from: com.ironsource.h9$a */
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
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Q7.a(Q7.a, runnable, 0L, 2, (Object) null);
    }

    public final void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Q7.a.a(callback);
    }

    public final IronSource.a[] a(List<? extends IronSourceAds.AdFormat> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
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

    public final C2602pe b(C2602pe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new C2602pe(error.c(), "serverResponseIsNotValid") : error;
    }

    public final IronSourceError a(C2602pe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.c() != 2070 && error.c() != 2110) {
            if (error.c() != 2080 && error.c() != 2100) {
                if (error.c() == 2090) {
                    return C2682u5.a.a();
                }
                return new IronSourceError(510, error.d());
            }
            return C2682u5.a.c();
        }
        return C2682u5.a.b();
    }

    public final void a(long j, Ve.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject b = IronSourceUtils.b(true);
        try {
            b.put("isMultipleAdObjects", 1);
            b.put("duration", j);
            b.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.b());
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Jb.u.d().q().a(new C2736x5(EnumC2754y5.SDK_INIT_SUCCESS, b));
    }

    public final void a(C2602pe error, long j) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject b = IronSourceUtils.b(true);
        try {
            b.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            b.put("reason", error.d());
            b.put("duration", j);
            b.put("isMultipleAdObjects", 1);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Jb.u.d().q().a(new C2736x5(EnumC2754y5.SDK_INIT_FAILED, b));
    }

    public final void a(long j, long j2, long j3, long j4, long j5) {
        JSONObject b = IronSourceUtils.b(true);
        try {
            b.put(IronSourceConstants.EVENTS_EXT1, "parsingDurationMs=" + j + ";javaHeapKb=" + j2 + ";nativeHeapKb=" + j3 + ";sharedOtherKb=" + j4 + ";initResponseJsonSizeKb=" + j5);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Jb.u.d().q().a(new C2736x5(EnumC2754y5.TROUBLESHOOTING_INIT_SUCCESS, b));
    }
}
