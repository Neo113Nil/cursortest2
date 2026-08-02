package k5;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: k5.x1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7584x1 {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C7584x1 f70885c;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Sm0.a> f70886a = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set<InterfaceC7545n1> f70887b = Collections.synchronizedSet(new LinkedHashSet());

    private C7584x1() {
    }

    public static C7584x1 a() {
        C7584x1 c7584x1;
        C7584x1 c7584x12 = f70885c;
        if (c7584x12 != null) {
            return c7584x12;
        }
        synchronized (C7584x1.class) {
            try {
                c7584x1 = f70885c;
                if (c7584x1 == null) {
                    c7584x1 = new C7584x1();
                    f70885c = c7584x1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7584x1;
    }

    public final void b(@NonNull Sm0.a aVar) {
        aVar.getClass();
        this.f70886a.put(aVar.getClass(), aVar);
        Iterator it = new LinkedHashSet(this.f70887b).iterator();
        while (it.hasNext()) {
            ((InterfaceC7545n1) it.next()).b();
        }
    }
}
