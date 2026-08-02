package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Fl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Hl f12239a;

    public Fl(Hl hl) {
        this.f12239a = hl;
    }

    public final void a(String str, Jl jl, C0161fm c0161fm) {
        ArrayList arrayList;
        synchronized (this.f12239a.f12328b) {
            try {
                Collection collection = (Collection) this.f12239a.f12327a.f14468a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ql) it.next()).a(jl, c0161fm);
        }
    }
}
