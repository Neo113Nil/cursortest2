package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class xnl implements snl {
    public final k1l a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();

    public xnl(k1l k1lVar, wnl wnlVar) {
        this.a = k1lVar;
    }

    public final boolean a(ynl ynlVar) {
        boolean add;
        synchronized (this.c) {
            add = this.d.add(ynlVar);
        }
        return add;
    }

    public final void b(k1l k1lVar, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj instanceof String ? lnb.q(new StringBuilder("'"), (String) obj, '\'') : obj.toString());
        }
        this.b.post(new kdc(29, k1lVar, str, arrayList));
    }

    public final void c() {
        b(this.a, "pauseVideo", new Object[0]);
    }

    public final boolean d(y8 y8Var) {
        boolean remove;
        y8Var.getClass();
        synchronized (this.c) {
            remove = this.d.remove(y8Var);
        }
        return remove;
    }
}
