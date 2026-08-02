package com.ironsource;

import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.af, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C3989af implements J8, J8.a {
    private static final int c = 1;
    private final Map<IronSource.a, Integer> a = new HashMap();
    private final C4002ba b = new C4002ba();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.af$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C3989af() {
        for (IronSource.a aVar : IronSource.a.values()) {
            a(aVar, 1);
        }
    }

    private void a(@NotNull IronSource.a aVar, int i) {
        this.a.put(aVar, Integer.valueOf(i));
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            this.b.d(i);
            return;
        }
        if (i2 == 2) {
            this.b.b(i);
        } else if (i2 == 3) {
            this.b.a(i);
        } else {
            if (i2 != 4) {
                return;
            }
            this.b.c(i);
        }
    }

    @Override // com.ironsource.J8.a
    public synchronized void b(IronSource.a aVar) {
        if (aVar == null) {
            return;
        }
        a(aVar, this.a.get(aVar).intValue() + 1);
    }

    @Override // com.ironsource.J8
    public synchronized int a(IronSource.a aVar) {
        int i = -1;
        if (aVar == null) {
            return -1;
        }
        Integer num = this.a.get(aVar);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    @Override // com.ironsource.J8
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }
}
