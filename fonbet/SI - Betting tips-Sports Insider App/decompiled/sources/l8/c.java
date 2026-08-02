package l8;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.x0;
import g6.v;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f19408b;

    /* renamed from: a, reason: collision with root package name */
    public final r7.a f19409a;

    public c(r7.a aVar) {
        v.h(aVar);
        this.f19409a = aVar;
        new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!m8.b.f20498b.contains(str) && m8.b.a(bundle, str2) && m8.b.c(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            j1 j1Var = (j1) this.f19409a.f22318b;
            j1Var.c(new x0(j1Var, str, str2, bundle, 1));
        }
    }
}
