package com.ironsource;

import com.ironsource.M6;
import com.ironsource.mediationsdk.IronSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class W0 {
    public static final W0 a = new W0();

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

    private W0() {
    }

    @JvmStatic
    public static final M6.a a(IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        int i = a.a[adUnit.ordinal()];
        if (i == 1) {
            return M6.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return M6.a.INTERSTITIAL;
        }
        if (i == 3) {
            return M6.a.BANNER;
        }
        if (i == 4) {
            return M6.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
