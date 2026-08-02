package defpackage;

import com.sofascore.model.fantasy.FantasyUserLeague;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q27 extends a7e {
    public final int b;
    public final Integer c;
    public final wi7 d;
    public final HashSet e;

    public q27(int i, Integer num, wi7 wi7Var) {
        wi7Var.getClass();
        this.b = i;
        this.c = num;
        this.d = wi7Var;
        this.e = new HashSet();
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        c7eVar.getClass();
        Integer num = c7eVar.b;
        if (num != null) {
            c7eVar.a(num.intValue());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x005e, code lost:
    
        if (r10 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        if (r10 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[EDGE_INSN: B:25:0x00a4->B:26:0x00a4 BREAK  A[LOOP:0: B:16:0x0087->B:23:0x0087], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9 A[LOOP:1: B:27:0x00b3->B:29:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.a7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        p27 p27Var;
        int i;
        int intValue;
        List list;
        Iterator it;
        boolean hasNext;
        HashSet hashSet;
        Iterator it2;
        if (sq3Var instanceof p27) {
            p27Var = (p27) sq3Var;
            int i2 = p27Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p27Var.u = i2 - Integer.MIN_VALUE;
                Object obj = p27Var.s;
                lu3 lu3Var = lu3.a;
                i = p27Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    Integer num = (Integer) y6eVar.a();
                    intValue = num != null ? num.intValue() : 0;
                    int i3 = this.b;
                    Integer num2 = this.c;
                    wi7 wi7Var = this.d;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        p27Var.r = intValue;
                        p27Var.u = 1;
                        obj = wi7Var.w(i3, intValue2, intValue, p27Var);
                    } else {
                        p27Var.r = intValue;
                        p27Var.u = 2;
                        obj = wi7Var.v(i3, intValue, p27Var);
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    intValue = p27Var.r;
                    y6a.M(obj);
                    list = (List) obj;
                } else {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    intValue = p27Var.r;
                    y6a.M(obj);
                    list = (List) obj;
                }
                Integer num3 = list.isEmpty() ? null : new Integer(intValue + 1);
                ArrayList arrayList = new ArrayList();
                it = list.iterator();
                while (true) {
                    hasNext = it.hasNext();
                    hashSet = this.e;
                    if (hasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (!hashSet.contains(((FantasyUserLeague) next).getUserId())) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((FantasyUserLeague) it2.next()).getUserId());
                }
                hashSet.addAll(arrayList2);
                return new z6e(arrayList, num3, Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
        }
        p27Var = new p27(this, sq3Var);
        Object obj2 = p27Var.s;
        lu3 lu3Var2 = lu3.a;
        i = p27Var.u;
        if (i != 0) {
        }
        if (list.isEmpty()) {
        }
        ArrayList arrayList3 = new ArrayList();
        it = list.iterator();
        while (true) {
            hasNext = it.hasNext();
            hashSet = this.e;
            if (hasNext) {
            }
        }
        ArrayList arrayList22 = new ArrayList(k13.r(arrayList3, 10));
        it2 = arrayList3.iterator();
        while (it2.hasNext()) {
        }
        hashSet.addAll(arrayList22);
        return new z6e(arrayList3, num3, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
