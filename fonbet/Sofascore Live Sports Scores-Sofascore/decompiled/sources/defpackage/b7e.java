package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class b7e extends qzh implements p6e {
    public final boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7e(Context context) {
        super(context);
        context.getClass();
        this.t = true;
    }

    public static void V(List list, ArrayList arrayList) {
        Event d;
        for (Object obj : list) {
            if (obj instanceof y21) {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Object next = it.next();
                    y21 y21Var = next instanceof y21 ? (y21) next : null;
                    if (y21Var != null && (d = y21Var.d()) != null && d.getId() == ((y21) obj).d().getId() && !Intrinsics.c(next, obj)) {
                        break;
                    } else {
                        i++;
                    }
                }
                Integer valueOf = i >= 0 ? Integer.valueOf(i) : null;
                if (valueOf == null) {
                    return;
                }
                int intValue = valueOf.intValue();
                int i2 = intValue - 1;
                if (i2 >= 0) {
                    Object obj2 = arrayList.get(i2);
                    obj2.getClass();
                    if (obj2 instanceof lrj) {
                        if (intValue == arrayList.size() - 1) {
                            arrayList.remove(i2);
                        } else if (intValue + 1 <= arrayList.size() - 1) {
                            Object obj3 = arrayList.get(intValue);
                            obj3.getClass();
                            if (obj3 instanceof lrj) {
                                arrayList.remove(i2);
                            }
                        }
                        intValue--;
                    }
                }
                arrayList.remove(intValue);
            }
        }
    }

    public static void W(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i = 0;
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            if (next instanceof mrj) {
                mrj mrjVar = (mrj) obj;
                if (mrjVar == null || ((mrj) next).getTournamentId() != mrjVar.getTournamentId() || (CollectionsKt.a0(i - 1, arrayList) instanceof Transfer)) {
                    ((mrj) next).a(next instanceof lrj);
                    Object a0 = CollectionsKt.a0(i - 1, arrayList);
                    y21 y21Var = a0 instanceof y21 ? (y21) a0 : null;
                    if (y21Var != null) {
                        y21Var.n = true;
                    }
                    obj = next;
                } else {
                    arrayList2.add(Integer.valueOf(i));
                }
            }
            i = i2;
        }
        Iterator it2 = CollectionsKt.B0(arrayList2).iterator();
        while (it2.hasNext()) {
            int intValue = ((Number) it2.next()).intValue();
            if (intValue <= arrayList.size() - 1) {
                arrayList.remove(intValue);
            }
        }
    }

    public final void X(List list) {
        list.getClass();
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            F(list);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        for (Object obj : list) {
            if (obj instanceof y21) {
                Iterator it = arrayList2.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Object next = it.next();
                    if ((next instanceof y21) && ((y21) next).d().getId() == ((y21) obj).d().getId()) {
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
        F(arrayList2);
    }

    @Override // defpackage.p6e
    public final void c(List list) {
        ArrayList k = me4.k(list);
        k.addAll(this.i);
        if (this.t) {
            k.remove(q6e.a);
        }
        V(list, k);
        k.addAll(0, list);
        W(k);
        F(k);
    }

    @Override // defpackage.p6e
    public final void h(List list) {
        ArrayList k = me4.k(list);
        k.addAll(this.i);
        if (this.t) {
            k.remove(q6e.b);
        }
        V(list, k);
        k.addAll(list);
        W(k);
        F(k);
    }

    @Override // defpackage.qzh, defpackage.ysk
    public final boolean j(int i, Object obj) {
        return !(obj instanceof q6e) && super.j(i, obj);
    }

    @Override // defpackage.p6e
    public final void m() {
        q6e q6eVar = q6e.b;
        if (!this.t) {
            q6eVar = null;
        }
        F(CollectionsKt.w0(b.k(q6eVar), this.i));
    }

    @Override // defpackage.p6e
    public final void n() {
        q6e q6eVar = q6e.a;
        if (!this.t) {
            q6eVar = null;
        }
        F(CollectionsKt.w0(this.i, b.k(q6eVar)));
    }

    @Override // defpackage.g7
    public void s() {
        super.s();
        this.s.clear();
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public int v(Object obj) {
        obj.getClass();
        if (!(obj instanceof q6e)) {
            return super.v(obj);
        }
        haf hafVar = pzh.b;
        return 24;
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        if (i != 24) {
            return super.z(viewGroup, i);
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.row_loader, viewGroup, false);
        inflate.getClass();
        return new r71(11, inflate);
    }
}
