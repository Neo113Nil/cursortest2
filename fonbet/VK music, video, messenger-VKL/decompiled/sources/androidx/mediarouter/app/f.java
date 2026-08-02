package androidx.mediarouter.app;

import android.view.View;
import androidx.mediarouter.app.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.bx10;
import xsna.fx10;
import xsna.h1u;

/* compiled from: MediaRouteDynamicControllerDialog.java */
/* loaded from: classes12.dex */
public final class f implements View.OnClickListener {
    public final /* synthetic */ e.h.c b;

    public f(e.h.c cVar) {
        this.b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e.h.c cVar = this.b;
        fx10 fx10Var = e.this.h;
        fx10.h hVar = cVar.q;
        fx10Var.getClass();
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        fx10.b();
        h1u c = fx10.c();
        fx10.d a = c.d.a();
        if (a != null) {
            List<fx10.h> singletonList = Collections.singletonList(hVar);
            ArrayList arrayList = new ArrayList();
            for (fx10.h hVar2 : singletonList) {
                bx10.b.a aVar = (bx10.b.a) a.x.get(hVar2.c);
                if (aVar == null || !aVar.e) {
                    hVar2.toString();
                } else {
                    arrayList.add(hVar2.b);
                }
            }
            if (!arrayList.isEmpty()) {
                if (a.g()) {
                    bx10.e eVar = c.e;
                    if (!(eVar instanceof bx10.b)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    ((bx10.b) eVar).o(arrayList);
                } else if (a.n()) {
                    c.f(a);
                    a.toString();
                } else {
                    a.toString();
                }
            }
        }
        cVar.m.setVisibility(4);
        cVar.n.setVisibility(0);
    }
}
