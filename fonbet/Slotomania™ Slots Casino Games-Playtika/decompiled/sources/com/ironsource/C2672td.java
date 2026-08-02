package com.ironsource;

import com.ironsource.F0;
import com.ironsource.Fd;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2672td implements InterfaceC2690ud {
    private final LevelPlay.AdFormat a;

    /* renamed from: com.ironsource.td$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public C2672td(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = adFormat;
    }

    private final C2636rd a(Fd.c cVar, int i, Ua ua) {
        String c = cVar.c();
        if (c == null) {
            IronLog.INTERNAL.warning("invalid adUnitId");
            return null;
        }
        List<String> d = cVar.d();
        if (d == null) {
            IronLog.INTERNAL.warning("invalid instances");
            return null;
        }
        C2445h0 c2445h0 = new C2445h0(com.unity3d.mediation.a.a(this.a), C2702v7.a.a(), c, null, null, null, 56, null);
        AbstractC2731x0 a2 = a(c2445h0, ua);
        if (a2 == null) {
            IronLog.INTERNAL.warning("adunit data is null");
            return null;
        }
        IronSource.a a3 = com.unity3d.mediation.a.a(this.a);
        F0.b bVar = F0.b.MEDIATION;
        V0 v0 = new V0(new C2588p0(a3, bVar), a2, bVar);
        v0.e().a(new D0(v0, c2445h0, null, 4, null));
        return new C2636rd(c, d, i, new C2744xd(v0, a2, null, 4, null), v0);
    }

    private final AbstractC2731x0 a(C2445h0 c2445h0, Ua ua) {
        try {
            int i = a.a[this.a.ordinal()];
            if (i == 1) {
                return B9.z.a(c2445h0, ua, false);
            }
            if (i == 2) {
                return C2369ce.z.a(c2445h0, ua, false);
            }
            throw new IllegalArgumentException("Unsupported ad format for preload: " + this.a);
        } catch (Exception e) {
            IronLog.INTERNAL.error("Failed to create AdUnitData for ad format " + this.a + ": " + e.getMessage() + "\n" + ExceptionsKt.stackTraceToString(e));
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC2690ud
    public List<InterfaceC2654sd> a(List<Fd.c> config, int i, Ua levelPlayConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(levelPlayConfig, "levelPlayConfig");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = config.iterator();
        while (it.hasNext()) {
            C2636rd a2 = a((Fd.c) it.next(), i, levelPlayConfig);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
