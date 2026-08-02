package com.logrocket.core;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Class f6606h;

    /* renamed from: i, reason: collision with root package name */
    public static final Field f6607i;

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f6608a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f6609b;

    /* renamed from: c, reason: collision with root package name */
    public final LogRocketCore f6610c;

    /* renamed from: d, reason: collision with root package name */
    public final ba.d f6611d;

    /* renamed from: e, reason: collision with root package name */
    public final com.logrocket.core.graphics.f f6612e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6613f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6614g;

    static {
        Class<?> cls;
        Method method = aa.k.f110a;
        Field field = null;
        try {
            cls = Class.forName("com.android.internal.policy.DecorView");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f6606h = cls;
        try {
            field = aa.k.c(cls, "mWindow");
        } catch (ClassNotFoundException | NoSuchFieldException unused2) {
        }
        f6607i = field;
    }

    public j0(LogRocketCore logRocketCore, com.logrocket.core.graphics.f fVar, f fVar2) {
        int i5 = fVar2.f6444v;
        boolean z5 = fVar2.f6437n;
        this.f6608a = new WeakHashMap();
        this.f6609b = new WeakHashMap();
        this.f6611d = new ba.d("window-callback");
        this.f6610c = logRocketCore;
        this.f6612e = fVar;
        this.f6613f = i5;
        this.f6614g = z5;
    }

    public final Window a(View view) {
        Class cls;
        try {
            Class<?> cls2 = view.getClass();
            Field field = f6607i;
            if (field != null && (cls = f6606h) != null && cls.isAssignableFrom(cls2)) {
                return (Window) field.get(view);
            }
            for (Field field2 : cls2.getDeclaredFields()) {
                if (Window.class.isAssignableFrom(field2.getType())) {
                    field2.setAccessible(true);
                    return (Window) field2.get(view);
                }
            }
            return null;
        } catch (Throwable th2) {
            this.f6611d.e("Unable to find window from view", th2);
            LogRocketCore.l("Unable to find window from view", th2);
            return null;
        }
    }

    public final void b(ArrayList arrayList) {
        WeakHashMap weakHashMap = this.f6608a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                Window a7 = a((View) it.next());
                if (a7 != null && !weakHashMap.containsKey(a7)) {
                    w9.a aVar = new w9.a(a7, a7.getCallback(), this.f6610c, this.f6612e, this.f6613f, this.f6614g);
                    a7.setCallback(aVar);
                    weakHashMap.put(a7, null);
                    this.f6609b.put(aVar, null);
                }
            } catch (Throwable th2) {
                LogRocketCore.l("Unable to apply window callback", th2);
                this.f6611d.e("Unable to apply window callback", th2);
            }
        }
    }
}
