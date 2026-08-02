package com.ironsource;

import com.ironsource.E0;
import com.ironsource.Ed;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import defpackage.de6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.sd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4309sd implements InterfaceC4327td {

    @NotNull
    private final LevelPlay.AdFormat a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.sd$a */
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

    public C4309sd(@NotNull LevelPlay.AdFormat adFormat) {
        adFormat.getClass();
        this.a = adFormat;
    }

    @InterfaceC4307sb
    private final C4274qd a(Ed.c cVar, int i, Sa sa) {
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
        C4100h0 c4100h0 = new C4100h0(com.unity3d.mediation.a.a(this.a), C4303s7.a.a(), c, null, null, null, 56, null);
        AbstractC4386x0 a2 = a(c4100h0, sa);
        if (a2 == null) {
            IronLog.INTERNAL.warning("adunit data is null");
            return null;
        }
        IronSource.a a3 = com.unity3d.mediation.a.a(this.a);
        E0.b bVar = E0.b.MEDIATION;
        T0 t0 = new T0(new C4243p0(a3, bVar), a2, bVar);
        t0.f().a(new C0(t0, c4100h0, null, 4, null));
        return new C4274qd(c, d, i, new C4381wd(t0, a2, null, 4, null), t0);
    }

    private final AbstractC4386x0 a(C4100h0 c4100h0, Sa sa) {
        try {
            int i = a.a[this.a.ordinal()];
            if (i == 1) {
                return B9.z.a(c4100h0, sa, false);
            }
            if (i == 2) {
                return C4006be.z.a(c4100h0, sa, false);
            }
            throw new IllegalArgumentException("Unsupported ad format for preload: " + this.a);
        } catch (Exception e) {
            IronLog.INTERNAL.error("Failed to create AdUnitData for ad format " + this.a + ": " + e.getMessage() + "\n" + de6.b(e));
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4327td
    @NotNull
    public List<InterfaceC4291rd> a(@NotNull List<Ed.c> list, int i, @NotNull Sa sa) {
        list.getClass();
        sa.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C4274qd a2 = a((Ed.c) it.next(), i, sa);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
