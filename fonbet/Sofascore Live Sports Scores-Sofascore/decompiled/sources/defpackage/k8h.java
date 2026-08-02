package defpackage;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k8h {
    public final LinkedHashMap a = new LinkedHashMap();
    public final /* synthetic */ l8h b;

    public k8h(l8h l8hVar) {
        this.b = l8hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, String str, sq3 sq3Var) {
        i8h i8hVar;
        int i;
        boolean z;
        Iterable iterable;
        Iterator it;
        Object[] objArr;
        af0 af0Var;
        if (sq3Var instanceof i8h) {
            i8hVar = (i8h) sq3Var;
            int i2 = i8hVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i8hVar.v = i2 - Integer.MIN_VALUE;
                Object obj = i8hVar.t;
                lu3 lu3Var = lu3.a;
                i = i8hVar.v;
                z = false;
                z = false;
                if (i != 0) {
                    y6a.M(obj);
                    context.getClass();
                    xbl d = xbl.d(context);
                    d.getClass();
                    WorkDatabase workDatabase = d.c;
                    zti ztiVar = d.d;
                    workDatabase.getClass();
                    ztiVar.getClass();
                    str.getClass();
                    cfi cfiVar = new cfi(str, z ? 1 : 0);
                    n5h n5hVar = ((zbl) ztiVar).a;
                    n5hVar.getClass();
                    xh2 z2 = x2a.z(n5hVar, "loadStatusFuture", new deh(13, cfiVar, workDatabase));
                    i8hVar.r = this;
                    i8hVar.s = str;
                    i8hVar.v = 1;
                    obj = o3a.o(z2, i8hVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = i8hVar.s;
                    this = i8hVar.r;
                    y6a.M(obj);
                }
                iterable = (Iterable) obj;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (b.j(sbl.b, sbl.a).contains(((tbl) it.next()).b)) {
                            objArr = true;
                            break;
                        }
                    }
                }
                objArr = false;
                af0Var = (af0) this.a.get(str);
                if ((af0Var == null ? af0Var.b.get() : false) && objArr != false) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        i8hVar = new i8h(this, sq3Var);
        Object obj2 = i8hVar.t;
        lu3 lu3Var2 = lu3.a;
        i = i8hVar.v;
        z = false;
        z = false;
        if (i != 0) {
        }
        iterable = (Iterable) obj2;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (it.hasNext()) {
        }
        objArr = false;
        af0Var = (af0) this.a.get(str);
        if (af0Var == null ? af0Var.b.get() : false) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, af0 af0Var, sq3 sq3Var) {
        j8h j8hVar;
        int i;
        Context context2;
        ktd ktdVar;
        k8h k8hVar = this;
        if (sq3Var instanceof j8h) {
            j8hVar = (j8h) sq3Var;
            int i2 = j8hVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j8hVar.v = i2 - Integer.MIN_VALUE;
                Object obj = j8hVar.t;
                lu3 lu3Var = lu3.a;
                i = j8hVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    String str = af0Var.a;
                    af0 af0Var2 = (af0) k8hVar.a.put(str, af0Var);
                    if (af0Var2 != null) {
                        af0Var2.c.r(null);
                        af0Var2.b.set(false);
                        af0Var2.j.e(null);
                    }
                    ktd ktdVar2 = new ktd(SessionWorker.class);
                    Pair[] pairArr = {new Pair("KEY", str)};
                    hpo hpoVar = new hpo(18);
                    Pair pair = pairArr[0];
                    hpoVar.B(pair.b, (String) pair.a);
                    ltd ltdVar = (ltd) ((ktd) ktdVar2.f(hpoVar.l())).a();
                    context.getClass();
                    xbl d = xbl.d(context);
                    d.getClass();
                    ddb ddbVar = (ddb) d.b(str, nf6.a, ltdVar).b;
                    j8hVar.r = k8hVar;
                    context2 = context;
                    j8hVar.s = context2;
                    j8hVar.v = 1;
                    if (o3a.o(ddbVar, j8hVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Context context3 = j8hVar.s;
                    k8h k8hVar2 = j8hVar.r;
                    y6a.M(obj);
                    context2 = context3;
                    k8hVar = k8hVar2;
                }
                l8h l8hVar = k8hVar.b;
                context2.getClass();
                xbl d2 = xbl.d(context2);
                d2.getClass();
                nf6 nf6Var = nf6.b;
                ktdVar = new ktd(SessionWorker.class);
                TimeUnit.DAYS.getClass();
                ktdVar.c.g = 315360000000L;
                if (Long.MAX_VALUE - System.currentTimeMillis() > ktdVar.c.g) {
                    a70.p("The given initial delay is too large and will cause an overflow!");
                    return null;
                }
                ktdVar.c.j = new zm3(new nad(null), jbd.a, true, false, false, false, -1L, -1L, CollectionsKt.W0(new LinkedHashSet()));
                d2.b("sessionWorkerKeepEnabled", nf6Var, (ltd) ktdVar.a());
                return Unit.a;
            }
        }
        j8hVar = new j8h(k8hVar, sq3Var);
        Object obj2 = j8hVar.t;
        lu3 lu3Var2 = lu3.a;
        i = j8hVar.v;
        if (i != 0) {
        }
        l8h l8hVar2 = k8hVar.b;
        context2.getClass();
        xbl d22 = xbl.d(context2);
        d22.getClass();
        nf6 nf6Var2 = nf6.b;
        ktdVar = new ktd(SessionWorker.class);
        TimeUnit.DAYS.getClass();
        ktdVar.c.g = 315360000000L;
        if (Long.MAX_VALUE - System.currentTimeMillis() > ktdVar.c.g) {
        }
    }
}
