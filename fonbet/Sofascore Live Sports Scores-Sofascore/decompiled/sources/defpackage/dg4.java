package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dg4 implements xnf {
    public final String b;
    public final Function1 c;
    public final ku3 d;
    public final Object f;
    public volatile ye4 g;
    public final /* synthetic */ int a = 0;
    public final Object e = new Object();

    public dg4(String str, e3c e3cVar, Function1 function1, ku3 ku3Var) {
        this.b = str;
        this.f = e3cVar;
        this.c = function1;
        this.d = ku3Var;
    }

    @Override // defpackage.xnf
    public final Object getValue(Object obj, KProperty kProperty) {
        qf4 qf4Var;
        q4f q4fVar;
        int i = 0;
        rq3 rq3Var = null;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                kProperty.getClass();
                qf4 qf4Var2 = (qf4) this.g;
                if (qf4Var2 != null) {
                    return qf4Var2;
                }
                synchronized (this.e) {
                    try {
                        if (((qf4) this.g) == null) {
                            Context applicationContext = context.getApplicationContext();
                            dpd dpdVar = new dpd(s18.a, (cqa) this.f, new h84(2, applicationContext, (Object) this));
                            Function1 function1 = this.c;
                            applicationContext.getClass();
                            List list = (List) function1.invoke(applicationContext);
                            ku3 ku3Var = this.d;
                            list.getClass();
                            this.g = new qf4(dpdVar, a.c(new ce4(list, rq3Var, i)), new hjg(), ku3Var);
                        }
                        qf4Var = (qf4) this.g;
                        qf4Var.getClass();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return qf4Var;
            default:
                Context context2 = (Context) obj;
                context2.getClass();
                kProperty.getClass();
                q4f q4fVar2 = (q4f) this.g;
                if (q4fVar2 != null) {
                    return q4fVar2;
                }
                synchronized (this.e) {
                    try {
                        if (((q4f) this.g) == null) {
                            Context applicationContext2 = context2.getApplicationContext();
                            vu3 vu3Var = (e3c) this.f;
                            Function1 function12 = this.c;
                            applicationContext2.getClass();
                            List list2 = (List) function12.invoke(applicationContext2);
                            ku3 ku3Var2 = this.d;
                            int i2 = 11;
                            zbe zbeVar = new zbe(i2, applicationContext2, this);
                            list2.getClass();
                            l18 l18Var = new l18(inb.k, new gl7(i2), new rsd(3, zbeVar));
                            if (vu3Var == null) {
                                vu3Var = new hjg();
                            }
                            this.g = new q4f(new q4f(new qf4(l18Var, a.c(new ce4(list2, rq3Var, i)), vu3Var, ku3Var2)));
                        }
                        q4fVar = (q4f) this.g;
                        q4fVar.getClass();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return q4fVar;
        }
    }

    public dg4(String str, cqa cqaVar, Function1 function1, ku3 ku3Var) {
        this.b = str;
        this.f = cqaVar;
        this.c = function1;
        this.d = ku3Var;
    }
}
