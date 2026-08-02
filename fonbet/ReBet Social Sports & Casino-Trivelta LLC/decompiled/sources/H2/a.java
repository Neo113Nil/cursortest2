package H2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f4496d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f4497e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f4500c;

    /* renamed from: b, reason: collision with root package name */
    public final Set f4499b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final Map f4498a = new HashMap();

    public a(Context context) {
        this.f4500c = context.getApplicationContext();
    }

    public static a e(Context context) {
        if (f4496d == null) {
            synchronized (f4497e) {
                try {
                    if (f4496d == null) {
                        f4496d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f4496d;
    }

    public void a() {
        try {
            try {
                K2.a.c("Startup");
                b(this.f4500c.getPackageManager().getProviderInfo(new ComponentName(this.f4500c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new d(e10);
            }
        } finally {
            K2.a.f();
        }
    }

    public void b(Bundle bundle) {
        String string = this.f4500c.getString(c.f4501a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f4499b.add(cls);
                        }
                    }
                }
                Iterator it = this.f4499b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new d(e10);
            }
        }
    }

    public Object c(Class cls) {
        Object obj;
        synchronized (f4497e) {
            try {
                obj = this.f4498a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public final Object d(Class cls, Set set) {
        Object obj;
        if (K2.a.h()) {
            try {
                K2.a.c(cls.getSimpleName());
            } catch (Throwable th2) {
                K2.a.f();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f4498a.containsKey(cls)) {
            obj = this.f4498a.get(cls);
        } else {
            set.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class cls2 : a10) {
                        if (!this.f4498a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = bVar.create(this.f4500c);
                set.remove(cls);
                this.f4498a.put(cls, obj);
            } catch (Throwable th3) {
                throw new d(th3);
            }
        }
        K2.a.f();
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f4499b.contains(cls);
    }
}
