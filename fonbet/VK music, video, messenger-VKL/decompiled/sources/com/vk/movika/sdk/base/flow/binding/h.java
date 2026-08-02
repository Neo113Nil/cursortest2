package com.vk.movika.sdk.base.flow.binding;

import kotlin.Result;
import xsna.kbb;
import xsna.ohi0;

/* loaded from: classes3.dex */
public final class h {
    public static boolean a(Object obj, ohi0 ohi0Var) {
        Object failure;
        try {
            failure = Boolean.valueOf(!(ohi0Var.f(obj) instanceof kbb.b));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            com.vk.movika.sdk.utils.c.c(ohi0Var, null, a, null, 5);
        }
        if (Result.a(failure) != null) {
            failure = Boolean.FALSE;
        }
        return ((Boolean) failure).booleanValue();
    }
}
