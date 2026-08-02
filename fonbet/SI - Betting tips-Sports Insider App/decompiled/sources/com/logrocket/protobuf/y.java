package com.logrocket.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y implements y0 {
    static {
        if (r.f6780a == null) {
            synchronized (r.class) {
                try {
                    if (r.f6780a == null) {
                        Class cls = q.f6778a;
                        r rVar = null;
                        if (cls != null) {
                            try {
                                rVar = (r) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (rVar == null) {
                            rVar = r.f6781b;
                        }
                        r.f6780a = rVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
