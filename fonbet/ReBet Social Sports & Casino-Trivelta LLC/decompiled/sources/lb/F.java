package lb;

import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import java.util.HashMap;
import java.util.Map;
import kb.C5235u;

/* loaded from: classes3.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final G9.a f55682a = new G9.a("GetTokenResultFactory", new String[0]);

    public static C5235u a(String str) {
        Map hashMap;
        try {
            hashMap = E.b(str);
        } catch (zzaao e10) {
            f55682a.b("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new C5235u(str, hashMap);
    }
}
