package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a7e {
    public final en0 a = new en0(new etd(15));

    public abstract Object a(c7e c7eVar);

    public final void b() {
        en0 en0Var = this.a;
        boolean z = false;
        if (!en0Var.b) {
            synchronized (((v9f) en0Var.d)) {
                if (!en0Var.b) {
                    z = true;
                    en0Var.b = true;
                    List S0 = CollectionsKt.S0((ArrayList) en0Var.e);
                    ((ArrayList) en0Var.e).clear();
                    etd etdVar = (etd) en0Var.c;
                    Iterator it = S0.iterator();
                    while (it.hasNext()) {
                        etdVar.invoke(it.next());
                    }
                }
            }
        }
        if (z && Build.ID != null && Log.isLoggable("Paging", 3)) {
            toString();
        }
    }

    public abstract Object c(y6e y6eVar, sq3 sq3Var);
}
