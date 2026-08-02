package com.ironsource;

import com.ironsource.Te;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import defpackage.me4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.i9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4127i9 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    public final void a(long j, long j2, long j3, long j4, long j5) {
        JSONObject b = IronSourceUtils.b(true);
        try {
            b.put(IronSourceConstants.EVENTS_EXT1, "parsingDurationMs=" + j + ";javaHeapKb=" + j2 + ";nativeHeapKb=" + j3 + ";sharedOtherKb=" + j4 + ";initResponseJsonSizeKb=" + j5);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ib.v.d().q().a(new C4355v5(EnumC4373w5.TROUBLESHOOTING_INIT_SUCCESS, b));
    }

    @NotNull
    public final C4221ne b(@NotNull C4221ne c4221ne) {
        c4221ne.getClass();
        return c4221ne.c() == 2080 ? new C4221ne(c4221ne.c(), "serverResponseIsNotValid") : c4221ne;
    }

    public final void b(@NotNull Runnable runnable) {
        runnable.getClass();
        O7.a.a(runnable);
    }

    public final void a(@NotNull Runnable runnable) {
        runnable.getClass();
        O7.a(O7.a, runnable, 0L, 2, (Object) null);
    }

    @NotNull
    public final IronSourceError a(@NotNull C4221ne c4221ne) {
        c4221ne.getClass();
        if (c4221ne.c() != 2070 && c4221ne.c() != 2110) {
            if (c4221ne.c() != 2080 && c4221ne.c() != 2100) {
                if (c4221ne.c() == 2090) {
                    return C4301s5.a.a();
                }
                return new IronSourceError(510, c4221ne.d());
            }
            return C4301s5.a.c();
        }
        return C4301s5.a.b();
    }

    public final void a(long j, @NotNull Te.a aVar) {
        aVar.getClass();
        JSONObject b = IronSourceUtils.b(true);
        try {
            b.put("isMultipleAdObjects", 1);
            b.put(IronSourceConstants.EVENTS_DURATION, j);
            b.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ib.v.d().q().a(new C4355v5(EnumC4373w5.SDK_INIT_SUCCESS, b));
    }

    public final void a(@NotNull C4221ne c4221ne, long j) {
        c4221ne.getClass();
        JSONObject b = IronSourceUtils.b(true);
        try {
            b.put(IronSourceConstants.EVENTS_ERROR_CODE, c4221ne.c());
            b.put("reason", c4221ne.d());
            b.put(IronSourceConstants.EVENTS_DURATION, j);
            b.put("isMultipleAdObjects", 1);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ib.v.d().q().a(new C4355v5(EnumC4373w5.SDK_INIT_FAILED, b));
    }

    @NotNull
    public final IronSource.a[] a(@NotNull List<? extends IronSourceAds.AdFormat> list) {
        ArrayList k = me4.k(list);
        Iterator<? extends IronSourceAds.AdFormat> it = list.iterator();
        while (it.hasNext()) {
            int i = a.a[it.next().ordinal()];
            if (i == 1) {
                k.add(IronSource.a.BANNER);
            } else if (i == 2) {
                k.add(IronSource.a.INTERSTITIAL);
            } else if (i == 3) {
                k.add(IronSource.a.REWARDED_VIDEO);
            }
        }
        return (IronSource.a[]) k.toArray(new IronSource.a[0]);
    }
}
