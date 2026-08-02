package com.ironsource;

import com.ironsource.O6;
import com.ironsource.mediationsdk.IronSource;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes13.dex */
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

    public static final O6.a a(IronSource.a aVar) {
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return O6.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return O6.a.INTERSTITIAL;
        }
        if (i == 3) {
            return O6.a.BANNER;
        }
        if (i == 4) {
            return O6.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
