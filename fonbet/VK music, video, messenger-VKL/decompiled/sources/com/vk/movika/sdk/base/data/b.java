package com.vk.movika.sdk.base.data;

import java.lang.ref.WeakReference;
import java.util.List;
import xsna.j8y;
import xsna.n9y;

/* loaded from: classes3.dex */
public final class b {
    public static final Object a = new Object();
    public static WeakReference<j8y> b = new WeakReference<>(null);

    public static j8y a(List list) {
        j8y j8yVar;
        synchronized (a) {
            j8yVar = b.get();
            if (j8yVar == null) {
                j8yVar = n9y.a(new a(list, 0));
                b = new WeakReference<>(j8yVar);
            }
        }
        return j8yVar;
    }
}
