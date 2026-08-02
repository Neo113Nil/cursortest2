package com.vk.push.common.utils;

import xsna.gzs;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: CommonExtensions.kt */
/* loaded from: classes5.dex */
public final class CommonExtensionsKt {
    public static final boolean ifTrue(boolean z, gzs<s3q0> gzsVar) {
        if (z) {
            gzsVar.invoke();
        }
        return z;
    }

    public static final <T1, T2, R> R multiLet(T1 t1, T2 t2, wzs<? super T1, ? super T2, ? extends R> wzsVar) {
        if (t1 == null || t2 == null) {
            return null;
        }
        return wzsVar.invoke(t1, t2);
    }
}
