package defpackage;

import com.sofascore.model.newNetwork.PredictedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eaf extends a7e {
    public final fyk b;
    public final String c;
    public final boolean d;
    public final t6e e;

    public eaf(fyk fykVar, String str, boolean z, t6e t6eVar) {
        fykVar.getClass();
        str.getClass();
        t6eVar.getClass();
        this.b = fykVar;
        this.c = str;
        this.d = z;
        this.e = t6eVar;
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        c7eVar.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[LOOP:0: B:18:0x0096->B:20:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.a7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        daf dafVar;
        int i;
        int i2;
        Iterator it;
        if (sq3Var instanceof daf) {
            dafVar = (daf) sq3Var;
            int i3 = dafVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dafVar.u = i3 - Integer.MIN_VALUE;
                daf dafVar2 = dafVar;
                Object obj = dafVar2.s;
                lu3 lu3Var = lu3.a;
                i = dafVar2.u;
                t6e t6eVar = this.e;
                if (i != 0) {
                    y6a.M(obj);
                    Integer num = (Integer) y6eVar.a();
                    int intValue = num != null ? num.intValue() : 0;
                    String t6eVar2 = t6eVar.toString();
                    dafVar2.r = intValue;
                    dafVar2.u = 1;
                    obj = this.b.d(this.c, t6eVar2, intValue, this.d, dafVar2);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    i2 = intValue;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = dafVar2.r;
                    y6a.M(obj);
                }
                List list = (List) obj;
                List H0 = t6eVar != t6e.b ? CollectionsKt.H0(list, new wpb(28)) : CollectionsKt.H0(list, new wpb(29));
                Integer num2 = H0.isEmpty() ? null : new Integer(i2 + 1);
                ArrayList arrayList = new ArrayList(k13.r(H0, 10));
                it = H0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new xaf((PredictedEvent) it.next()));
                }
                return new z6e(arrayList, num2, Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
        }
        dafVar = new daf(this, sq3Var);
        daf dafVar22 = dafVar;
        Object obj2 = dafVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = dafVar22.u;
        t6e t6eVar3 = this.e;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        if (t6eVar3 != t6e.b) {
        }
        if (H0.isEmpty()) {
        }
        ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
        it = H0.iterator();
        while (it.hasNext()) {
        }
        return new z6e(arrayList2, num2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
