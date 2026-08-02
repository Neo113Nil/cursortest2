package com.ironsource;

import defpackage.mc3;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class Ef {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(WeakReference weakReference, Function1 function1) {
        weakReference.getClass();
        function1.getClass();
        Object obj = weakReference.get();
        if (obj != null) {
            function1.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Runnable b(T t, Function1<? super T, Unit> function1) {
        return new mc3(29, new WeakReference(t), function1);
    }
}
