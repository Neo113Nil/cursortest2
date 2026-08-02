package com.unity3d.mediation;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a();

    /* renamed from: com.unity3d.mediation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0394a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    private a() {
    }

    @JvmStatic
    public static final IronSource.a a(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i = C0394a.a[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.a.BANNER;
        }
        if (i == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
