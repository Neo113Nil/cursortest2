package com.google.gson.internal;

import com.google.gson.p;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        static final a f59997a;

        /* renamed from: com.google.gson.internal.q$a$a, reason: collision with other inner class name */
        final class C0911a extends a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f59998b;

            C0911a(Method method) {
                this.f59998b = method;
            }

            @Override // com.google.gson.internal.q.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.f59998b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e11) {
                    throw new RuntimeException("Failed invoking canAccess", e11);
                }
            }
        }

        final class b extends a {
            @Override // com.google.gson.internal.q.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        static {
            a c0911a;
            if (i.a()) {
                try {
                    c0911a = new C0911a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
                if (c0911a == null) {
                    c0911a = new b();
                }
                f59997a = c0911a;
            }
            c0911a = null;
            if (c0911a == null) {
            }
            f59997a = c0911a;
        }

        abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static boolean a(Object obj, AccessibleObject accessibleObject) {
        return a.f59997a.a(obj, accessibleObject);
    }

    public static p.a b(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p.a a11 = ((com.google.gson.p) it.next()).a();
            if (a11 != p.a.INDECISIVE) {
                return a11;
            }
        }
        return p.a.ALLOW;
    }
}
