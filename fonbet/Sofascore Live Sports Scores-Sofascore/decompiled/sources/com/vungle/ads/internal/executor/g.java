package com.vungle.ads.internal.executor;

import defpackage.c00;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g {
    public static final h a(Runnable runnable, Runnable runnable2) {
        int i = j.b;
        return runnable instanceof com.vungle.ads.internal.task.j ? new e(runnable, runnable2) : new f(runnable, runnable2);
    }

    public static Callable b(Callable callable, i iVar) {
        return new c00(8, callable, iVar);
    }

    public static final Object a(Callable callable, Function0 function0) {
        callable.getClass();
        function0.getClass();
        try {
            return callable.call();
        } catch (OutOfMemoryError unused) {
            function0.invoke();
            return null;
        }
    }
}
