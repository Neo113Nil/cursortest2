package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class elc extends hh {
    public final RecyclerView f;

    public elc(RecyclerView recyclerView) {
        super(recyclerView, new clc(1));
        this.f = recyclerView;
    }

    @Override // defpackage.hh
    public final int a() {
        return b().g.size();
    }

    @Override // defpackage.hh
    public final g7 b() {
        l adapter = this.f.getAdapter();
        adapter.getClass();
        return (hlc) adapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // defpackage.hh
    public final void c(ArrayList arrayList) {
        ?? r3;
        ArrayList arrayList2;
        RecyclerView recyclerView = this.f;
        l adapter = recyclerView.getAdapter();
        hlc hlcVar = adapter instanceof hlc ? (hlc) adapter : null;
        Function1 function1 = this.b;
        if (hlcVar == null || (arrayList2 = hlcVar.i) == null) {
            r3 = km5.a;
        } else {
            r3 = new ArrayList(k13.r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                r3.add(function1.invoke((qlc) it.next()));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            qlc qlcVar = (qlc) it2.next();
            Object invoke = function1.invoke(qlcVar);
            if (invoke != null) {
                int indexOf = r3.indexOf(invoke);
                Context context = recyclerView.getContext();
                context.getClass();
                nv.T(context, "chat", qlcVar.a.getId(), indexOf + 1);
                fh fhVar = (fh) this.c.get(invoke);
                if (fhVar != null) {
                    fhVar.b = true;
                }
            }
        }
    }

    @Override // defpackage.hh
    public final void f(Object obj, long j) {
        Object invoke;
        qlc qlcVar = (qlc) obj;
        qlcVar.getClass();
        if (qlcVar.b.b == null && (invoke = this.b.invoke(qlcVar)) != null) {
            HashMap hashMap = this.c;
            fh fhVar = (fh) hashMap.get(invoke);
            if (fhVar != null) {
                fhVar.a += j;
            } else {
                fhVar = new fh(j);
            }
            hashMap.put(invoke, fhVar);
        }
    }
}
