package defpackage;

import com.sofascore.model.fantasy.FantasyRoundPlayer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fj7 extends a7e {
    public final int b;
    public final Integer c;
    public final Float d;
    public final String e;
    public final wi7 f;
    public final String g;
    public final String h;
    public final String i;
    public final HashSet j;

    public fj7(int i, Integer num, Float f, String str, wi7 wi7Var, String str2, String str3, String str4) {
        wi7Var.getClass();
        this.b = i;
        this.c = num;
        this.d = f;
        this.e = str;
        this.f = wi7Var;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = new HashSet();
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        c7eVar.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[EDGE_INSN: B:24:0x00a3->B:25:0x00a3 BREAK  A[LOOP:0: B:15:0x007d->B:22:0x007d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[LOOP:1: B:26:0x00b2->B:28:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // defpackage.a7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        ej7 ej7Var;
        int i;
        int i2;
        Iterator it;
        boolean hasNext;
        HashSet hashSet;
        Iterator it2;
        if (sq3Var instanceof ej7) {
            ej7Var = (ej7) sq3Var;
            int i3 = ej7Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ej7Var.u = i3 - Integer.MIN_VALUE;
                ej7 ej7Var2 = ej7Var;
                Object obj = ej7Var2.s;
                lu3 lu3Var = lu3.a;
                i = ej7Var2.u;
                if (i != 0) {
                    y6a.M(obj);
                    Integer num = (Integer) y6eVar.a();
                    int intValue = num != null ? num.intValue() : 0;
                    ej7Var2.r = intValue;
                    ej7Var2.u = 1;
                    obj = this.f.I(this.b, intValue, this.g, this.c, this.d, this.e, this.h, this.i, ej7Var2);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    i2 = intValue;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = ej7Var2.r;
                    y6a.M(obj);
                }
                List list = (List) obj;
                Integer num2 = list.isEmpty() ? null : new Integer(i2 + 1);
                ArrayList arrayList = new ArrayList();
                it = list.iterator();
                while (true) {
                    hasNext = it.hasNext();
                    hashSet = this.j;
                    if (hasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (!hashSet.contains(new Integer(((FantasyRoundPlayer) next).getFantasyPlayer().getId()))) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    w1l.A(arrayList2, ((FantasyRoundPlayer) it2.next()).getFantasyPlayer().getId());
                }
                hashSet.addAll(arrayList2);
                return new z6e(arrayList, num2, Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
        }
        ej7Var = new ej7(this, sq3Var);
        ej7 ej7Var22 = ej7Var;
        Object obj2 = ej7Var22.s;
        lu3 lu3Var2 = lu3.a;
        i = ej7Var22.u;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        if (list2.isEmpty()) {
        }
        ArrayList arrayList3 = new ArrayList();
        it = list2.iterator();
        while (true) {
            hasNext = it.hasNext();
            hashSet = this.j;
            if (hasNext) {
            }
        }
        ArrayList arrayList22 = new ArrayList(k13.r(arrayList3, 10));
        it2 = arrayList3.iterator();
        while (it2.hasNext()) {
        }
        hashSet.addAll(arrayList22);
        return new z6e(arrayList3, num2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
