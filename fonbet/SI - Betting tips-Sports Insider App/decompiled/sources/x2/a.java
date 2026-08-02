package x2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.i0;
import com.sports.insider.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m4.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f25382d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f25383e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f25386c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f25385b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25384a = new HashMap();

    public a(Context context) {
        this.f25386c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f25382d == null) {
            synchronized (f25383e) {
                try {
                    if (f25382d == null) {
                        f25382d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f25382d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f25386c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f25385b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new i0(e7);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f25384a;
        if (g.r()) {
            try {
                Trace.beginSection(g.B(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a7 = bVar.a();
                if (!a7.isEmpty()) {
                    for (Class cls2 : a7) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.create(this.f25386c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th3) {
                throw new i0(th3);
            }
        }
        Trace.endSection();
        return obj;
    }
}
