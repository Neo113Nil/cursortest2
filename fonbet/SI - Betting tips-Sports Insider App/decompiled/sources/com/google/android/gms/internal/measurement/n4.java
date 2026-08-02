package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class n4 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.e f5147a = new s.e(0);

    public static synchronized void a() {
        synchronized (n4.class) {
            s.e eVar = f5147a;
            Iterator it = ((s.d) eVar.values()).iterator();
            if (it.hasNext()) {
                ((n4) it.next()).getClass();
                throw null;
            }
            eVar.clear();
        }
    }
}
