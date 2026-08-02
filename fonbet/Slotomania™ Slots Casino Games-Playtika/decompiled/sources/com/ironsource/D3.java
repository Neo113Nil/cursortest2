package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class D3 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final int a(I3 cappingType) {
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        int i = a.a[cappingType.ordinal()];
        if (i == 1 || i == 2) {
            return 3000;
        }
        if (i == 3) {
            return 3001;
        }
        throw new NoWhenBranchMatchedException();
    }
}
