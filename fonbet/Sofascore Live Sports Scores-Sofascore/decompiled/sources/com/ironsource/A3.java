package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.zzl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class A3 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[F3.values().length];
            try {
                iArr[F3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final int a(@NotNull F3 f3) {
        f3.getClass();
        int i = a.a[f3.ordinal()];
        if (i == 1 || i == 2) {
            return IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        }
        if (i == 3) {
            return 3001;
        }
        zzl.b();
        return 0;
    }
}
