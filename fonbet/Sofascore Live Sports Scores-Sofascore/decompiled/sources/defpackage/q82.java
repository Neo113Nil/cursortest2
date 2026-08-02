package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import com.sofascore.model.mvvm.model.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q82 extends hh {
    public final RecyclerView f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q82(RecyclerView recyclerView, String str) {
        super(recyclerView, new b42(3));
        str.getClass();
        this.f = recyclerView;
        this.g = str;
    }

    @Override // defpackage.hh
    public final int a() {
        return b().g.size();
    }

    @Override // defpackage.hh
    public final g7 b() {
        l adapter = this.f.getAdapter();
        adapter.getClass();
        return (p82) adapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // defpackage.hh
    public final void c(ArrayList arrayList) {
        ?? r5;
        ArrayList arrayList2;
        RecyclerView recyclerView = this.f;
        l adapter = recyclerView.getAdapter();
        p82 p82Var = adapter instanceof p82 ? (p82) adapter : null;
        Function1 function1 = this.b;
        if (p82Var == null || (arrayList2 = p82Var.i) == null) {
            r5 = km5.a;
        } else {
            r5 = new ArrayList(k13.r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                r5.add(function1.invoke(it.next()));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Object invoke = function1.invoke(next);
            if (invoke != null) {
                int indexOf = r5.indexOf(invoke) + 1;
                if (next instanceof APIBuzzerTile) {
                    Context context = recyclerView.getContext();
                    context.getClass();
                    APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) next;
                    j82 j82Var = (j82) CollectionsKt.a0(aPIBuzzerTile.getAction(), j82.b);
                    String name = j82Var != null ? j82Var.name() : null;
                    Integer z = yso.z(aPIBuzzerTile);
                    String reason = aPIBuzzerTile.getReason();
                    Event event = aPIBuzzerTile.getEvent();
                    nv.s(context, name, z, this.g, indexOf, reason, (event == null || Intrinsics.c(aPIBuzzerTile.getReason(), BuzzerConfigResponseKt.SURPRISE_EVENT_RESULT)) ? null : event.getStatus().getType(), Integer.valueOf(aPIBuzzerTile.getId()));
                } else if (next instanceof o82) {
                    Context context2 = recyclerView.getContext();
                    context2.getClass();
                    nv.s(context2, "SHOW_MORE", null, this.g, indexOf, null, null, null);
                }
                fh fhVar = (fh) this.c.get(invoke);
                if (fhVar != null) {
                    fhVar.b = true;
                }
            }
        }
    }

    @Override // defpackage.hh
    public final void f(Object obj, long j) {
        obj.getClass();
        Object invoke = this.b.invoke(obj);
        if (invoke != null) {
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
