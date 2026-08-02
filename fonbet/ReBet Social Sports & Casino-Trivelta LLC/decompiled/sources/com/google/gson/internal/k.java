package com.google.gson.internal;

import com.google.gson.s;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class k {

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38305a;

        public class a extends b {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Method f38306b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method) {
                super();
                this.f38306b = method;
            }

            @Override // com.google.gson.internal.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f38306b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* renamed from: com.google.gson.internal.k$b$b, reason: collision with other inner class name */
        public class C0533b extends b {
            public C0533b() {
                super();
            }

            @Override // com.google.gson.internal.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        static {
            b aVar;
            if (d.d()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
                if (aVar == null) {
                    aVar = new C0533b();
                }
                f38305a = aVar;
            }
            aVar = null;
            if (aVar == null) {
            }
            f38305a = aVar;
        }

        public b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f38305a.a(accessibleObject, obj);
    }

    public static s b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return s.ALLOW;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
