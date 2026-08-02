package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bmc extends g7 implements p6e, vqf {
    public final fmc l;
    public final boolean m;
    public final boolean n;
    public final ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmc(Context context, fmc fmcVar, int i) {
        super(context);
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        context.getClass();
        this.l = fmcVar;
        this.m = z;
        this.n = z2;
        this.o = new ArrayList();
    }

    public final ArrayList G(List list) {
        ArrayList U0 = CollectionsKt.U0(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.o;
        arrayList2.clear();
        Object firstOrNull = CollectionsKt.firstOrNull(U0);
        if (!(firstOrNull instanceof zlc)) {
            firstOrNull = null;
        }
        if (firstOrNull != null) {
            arrayList.add(firstOrNull);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Event) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (Intrinsics.c(((Event) next2).getTournament().isLive(), Boolean.TRUE)) {
                arrayList5.add(next2);
            }
        }
        arrayList4.removeAll(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            Event event = (Event) next3;
            event.getClass();
            if (Intrinsics.c(event.getStatus().getType(), StatusKt.STATUS_FINISHED) || (ph0.v(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}, event.getStatus().getType()) && event.getStartTimestamp() * 1000 <= System.currentTimeMillis())) {
                arrayList6.add(next3);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next4 = it4.next();
            Event event2 = (Event) next4;
            event2.getClass();
            if (Intrinsics.c(event2.getStatus().getType(), StatusKt.STATUS_NOT_STARTED) || (ph0.v(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}, event2.getStatus().getType()) && event2.getStartTimestamp() * 1000 > System.currentTimeMillis())) {
                arrayList7.add(next4);
            }
        }
        ArrayList l = b.l(new Pair(arrayList6, ylc.FINISHED), new Pair(arrayList5, ylc.LIVE), new Pair(arrayList7, ylc.UPCOMING));
        if (this.m) {
            Collections.reverse(l);
        }
        Iterator it5 = l.iterator();
        boolean z = false;
        while (it5.hasNext()) {
            Pair pair = (Pair) it5.next();
            List list2 = (List) pair.a;
            ylc ylcVar = (ylc) pair.b;
            if (!list2.isEmpty()) {
                if (!this.n) {
                    if (z && this.l == fmc.a) {
                        arrayList.add(new CustomizableDivider(true, 0, true, null, 10, null));
                    } else {
                        z = true;
                    }
                    arrayList.add(ylcVar);
                    arrayList2.add(Integer.valueOf(arrayList.size() - 1));
                }
                arrayList.addAll(list2);
            }
        }
        Object j0 = CollectionsKt.j0(U0);
        Object obj = j0 instanceof zlc ? j0 : null;
        if (obj != null) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void H(List list) {
        list.getClass();
        ArrayList arrayList = this.i;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (Object obj : list) {
                if (obj instanceof Event) {
                    Iterator it = arrayList2.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        Object next = it.next();
                        if ((next instanceof Event) && ((Event) next).getId() == ((Event) obj).getId()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i > -1) {
                        arrayList2.remove(i);
                        arrayList2.add(i, obj);
                    }
                }
            }
            list = arrayList2;
        }
        F(G(list));
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        amc[] amcVarArr = amc.a;
        if (i == 0) {
            return Integer.valueOf(R.id.ripple_holder);
        }
        return null;
    }

    @Override // defpackage.p6e
    public final void c(List list) {
        list.getClass();
        ArrayList U0 = CollectionsKt.U0(this.i);
        o13.C(U0);
        U0.addAll(0, list);
        F(G(U0));
    }

    @Override // defpackage.vqf
    public final Object f(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).intValue() <= i) {
                arrayList.add(next);
            }
        }
        Integer num = (Integer) CollectionsKt.k0(arrayList);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        ArrayList arrayList2 = this.i;
        if (arrayList2.get(intValue) instanceof zlc) {
            Object a0 = CollectionsKt.a0(intValue + 1, arrayList2);
            if (a0 instanceof ylc) {
                return (ylc) a0;
            }
            return null;
        }
        Object obj = arrayList2.get(intValue);
        if (obj instanceof ylc) {
            return (ylc) obj;
        }
        return null;
    }

    @Override // defpackage.p6e
    public final void h(List list) {
        list.getClass();
        ArrayList U0 = CollectionsKt.U0(this.i);
        o13.E(U0);
        U0.addAll(list);
        F(G(U0));
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        amc[] amcVarArr = amc.a;
        return i == 0;
    }

    @Override // defpackage.p6e
    public final void m() {
        ArrayList U0 = CollectionsKt.U0(this.i);
        U0.add(zlc.a);
        F(U0);
    }

    @Override // defpackage.p6e
    public final void n() {
        ArrayList U0 = CollectionsKt.U0(this.i);
        U0.add(0, zlc.b);
        F(U0);
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 24);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof Event) {
            amc[] amcVarArr = amc.a;
            return 0;
        }
        if (obj instanceof zlc) {
            amc[] amcVarArr2 = amc.a;
            return 2;
        }
        if (obj instanceof ylc) {
            amc[] amcVarArr3 = amc.a;
            return 1;
        }
        if (obj instanceof j29) {
            amc[] amcVarArr4 = amc.a;
            return 3;
        }
        if (obj instanceof CustomizableDivider) {
            amc[] amcVarArr5 = amc.a;
            return 4;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        View olcVar;
        viewGroup.getClass();
        amc[] amcVarArr = amc.a;
        fmc fmcVar = this.l;
        Context context = this.b;
        if (i == 0) {
            int ordinal = fmcVar.ordinal();
            if (ordinal == 0) {
                olcVar = new olc(context);
            } else {
                if (ordinal != 1) {
                    zzl.b();
                    return null;
                }
                olcVar = new coc(context);
            }
            return new ja9(9, olcVar);
        }
        if (i == 1) {
            int ordinal2 = fmcVar.ordinal();
            if (ordinal2 == 0) {
                return new xlc(kqb.c(LayoutInflater.from(context), viewGroup), 0);
            }
            if (ordinal2 == 1) {
                return new as7(w16.a(LayoutInflater.from(context), viewGroup), 1);
            }
            zzl.b();
            return null;
        }
        if (i == 3) {
            ConstraintLayout constraintLayout = (ConstraintLayout) v82.g(LayoutInflater.from(context), viewGroup).b;
            constraintLayout.getClass();
            return new wh(constraintLayout);
        }
        if (i == 4) {
            return new wh(new SofaDivider(context, null, 6));
        }
        if (i != 2) {
            ilg.c();
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_loader, viewGroup, false);
        inflate.getClass();
        return new r71(10, inflate);
    }
}
