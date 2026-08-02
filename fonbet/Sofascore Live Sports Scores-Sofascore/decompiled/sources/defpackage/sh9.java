package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class sh9 {
    public static final bjb a = ejb.b("io.ktor.client.plugins.HttpCallValidator");
    public static final sx2 b = new sx2("HttpResponseValidator", (Function0) lh9.b, (Function1) new c69(27));
    public static final pm0 c;

    static {
        KType kType;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Boolean.class);
        try {
            kType = duf.b(Boolean.TYPE);
        } catch (Throwable unused) {
            kType = null;
        }
        c = new pm0("ExpectSuccessAttributeKey", new h5k(orCreateKotlinClass, kType));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit a(List list, Throwable th, xj9 xj9Var, sq3 sq3Var) {
        ph9 ph9Var;
        int i;
        Iterator it;
        if (sq3Var instanceof ph9) {
            ph9Var = (ph9) sq3Var;
            int i2 = ph9Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ph9Var.s = i2 - Integer.MIN_VALUE;
                Object obj = ph9Var.r;
                lu3 lu3Var = lu3.a;
                i = ph9Var.s;
                if (i != 0) {
                    y6a.M(obj);
                    a.l("Processing exception " + th + " for request " + xj9Var.getUrl());
                    it = list.iterator();
                } else {
                    if (i != 1 && i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    it = null;
                }
                if (it.hasNext()) {
                    return Unit.a;
                }
                if (it.next() == null) {
                    zzl.b();
                    return null;
                }
                pvd.j();
                return null;
            }
        }
        ph9Var = new ph9(sq3Var);
        Object obj2 = ph9Var.r;
        lu3 lu3Var2 = lu3.a;
        i = ph9Var.s;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(List list, aq4 aq4Var, sq3 sq3Var) {
        qh9 qh9Var;
        int i;
        Iterator it;
        if (sq3Var instanceof qh9) {
            qh9Var = (qh9) sq3Var;
            int i2 = qh9Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qh9Var.u = i2 - Integer.MIN_VALUE;
                Object obj = qh9Var.t;
                lu3 lu3Var = lu3.a;
                i = qh9Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    a.l("Validating response for request " + aq4Var.b().c().getUrl());
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = qh9Var.s;
                    aq4Var = qh9Var.r;
                    y6a.M(obj);
                }
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    qh9Var.r = aq4Var;
                    qh9Var.s = it;
                    qh9Var.u = 1;
                    if (function2.invoke(aq4Var, qh9Var) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        qh9Var = new qh9(sq3Var);
        Object obj2 = qh9Var.t;
        lu3 lu3Var2 = lu3.a;
        i = qh9Var.u;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }
}
