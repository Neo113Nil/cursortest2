package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static volatile q f1683a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f1684b;

    static {
        q qVar = new q();
        Map map = Collections.EMPTY_MAP;
        f1684b = qVar;
    }

    public static q a() {
        q qVar;
        u0 u0Var = u0.f1715c;
        q qVar2 = f1683a;
        if (qVar2 != null) {
            return qVar2;
        }
        synchronized (q.class) {
            try {
                qVar = f1683a;
                if (qVar == null) {
                    Class cls = p.f1668a;
                    q qVar3 = null;
                    if (cls != null) {
                        try {
                            qVar3 = (q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    qVar = qVar3 != null ? qVar3 : f1684b;
                    f1683a = qVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
