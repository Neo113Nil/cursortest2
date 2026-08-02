package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3142m {

    /* renamed from: a, reason: collision with root package name */
    public final Set f32537a = Collections.newSetFromMap(new WeakHashMap());

    public static C3140l a(Object obj, Looper looper, String str) {
        AbstractC3191o.n(obj, "Listener must not be null");
        AbstractC3191o.n(looper, "Looper must not be null");
        AbstractC3191o.n(str, "Listener type must not be null");
        return new C3140l(looper, obj, str);
    }

    public static C3140l b(Object obj, Executor executor, String str) {
        AbstractC3191o.n(obj, "Listener must not be null");
        AbstractC3191o.n(executor, "Executor must not be null");
        AbstractC3191o.n(str, "Listener type must not be null");
        return new C3140l(executor, obj, str);
    }

    public static C3140l.a c(Object obj, String str) {
        AbstractC3191o.n(obj, "Listener must not be null");
        AbstractC3191o.n(str, "Listener type must not be null");
        AbstractC3191o.h(str, "Listener type must not be empty");
        return new C3140l.a(obj, str);
    }

    public final void d() {
        Iterator it = this.f32537a.iterator();
        while (it.hasNext()) {
            ((C3140l) it.next()).a();
        }
        this.f32537a.clear();
    }
}
