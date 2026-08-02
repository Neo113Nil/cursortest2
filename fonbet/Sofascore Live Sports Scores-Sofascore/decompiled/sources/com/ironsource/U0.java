package com.ironsource;

import com.ironsource.L6;
import com.ironsource.mediationsdk.IronSource;
import defpackage.zzl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class U0 {

    @NotNull
    public static final U0 a = new U0();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    private U0() {
    }

    @NotNull
    public static final L6.a a(@NotNull IronSource.a aVar) {
        aVar.getClass();
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return L6.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return L6.a.INTERSTITIAL;
        }
        if (i == 3) {
            return L6.a.BANNER;
        }
        if (i == 4) {
            return L6.a.NATIVE_AD;
        }
        zzl.b();
        return null;
    }
}
