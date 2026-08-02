package ng;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<i> f77137a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f77138b = new ConcurrentHashMap(UserVerificationMethods.USER_VERIFY_NONE, 0.75f, 2);

    static {
        h.a();
    }

    protected i() {
    }

    public static f a(String str, boolean z11) {
        lg.c.e(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f77138b;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar != null) {
            return iVar.b(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new g("No time-zone data files registered");
        }
        throw new g("Unknown time-zone ID: ".concat(str));
    }

    public static void d(i iVar) {
        lg.c.e(iVar, "provider");
        Iterator it = iVar.c().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            lg.c.e(str, "zoneId");
            if (((i) f77138b.putIfAbsent(str, iVar)) != null) {
                throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
            }
        }
        f77137a.add(iVar);
    }

    protected abstract f b(String str);

    protected abstract HashSet c();
}
