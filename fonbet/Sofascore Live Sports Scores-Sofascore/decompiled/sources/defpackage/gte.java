package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.EventMediaNews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgte;", "Lw41;", "Lcom/sofascore/model/mvvm/model/Player;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class gte extends w41 {
    public final t9c p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(Application application, t9c t9cVar) {
        super(application);
        t9cVar.getClass();
        this.p = t9cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(rq3 rq3Var) {
        fte fteVar;
        Object obj;
        int i;
        if (rq3Var instanceof fte) {
            fteVar = (fte) rq3Var;
            int i2 = fteVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fteVar.t = i2 - Integer.MIN_VALUE;
                obj = fteVar.r;
                lu3 lu3Var = lu3.a;
                i = fteVar.t;
                t9c t9cVar = this.p;
                if (i != 0) {
                    y6a.M(obj);
                    int id = ((Player) u()).getId();
                    fteVar.t = 1;
                    obj = t9cVar.p(id, fteVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Boolean.TRUE;
                }
                int id2 = ((Player) u()).getId();
                fteVar.t = 2;
                Object n = t9cVar.n(id2, fteVar);
                return n == lu3Var ? lu3Var : n;
            }
        }
        fteVar = new fte(this, (sq3) rq3Var);
        obj = fteVar.r;
        lu3 lu3Var2 = lu3.a;
        i = fteVar.t;
        t9c t9cVar2 = this.p;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.w41
    public final Object B(t41 t41Var) {
        return this.p.o(((Player) u()).getId(), t41Var);
    }

    @Override // defpackage.w41
    public final Object v(rq3 rq3Var) {
        return s9a.r(new gje(this, null, 4), rq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(rq3 rq3Var) {
        ete eteVar;
        int i;
        List list;
        if (rq3Var instanceof ete) {
            eteVar = (ete) rq3Var;
            int i2 = eteVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eteVar.t = i2 - Integer.MIN_VALUE;
                Object obj = eteVar.r;
                lu3 lu3Var = lu3.a;
                i = eteVar.t;
                ArrayList arrayList = null;
                if (i != 0) {
                    y6a.M(obj);
                    int id = ((Player) u()).getId();
                    eteVar.t = 1;
                    obj = this.p.f(id, eteVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new w5c((EventMediaNews) it.next()));
                    }
                }
                return (arrayList != null || arrayList.isEmpty()) ? km5.a : arrayList;
            }
        }
        eteVar = new ete(this, (sq3) rq3Var);
        Object obj2 = eteVar.r;
        lu3 lu3Var2 = lu3.a;
        i = eteVar.t;
        ArrayList arrayList2 = null;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        if (arrayList2 != null) {
        }
    }
}
