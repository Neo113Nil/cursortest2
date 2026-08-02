package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p1f {
    public final SharedPreferences a;
    public final Context b;
    public final yzc c;
    public final yzc d;
    public final ad2 e;
    public b7 f;
    public boolean g;
    public g9i h;

    public p1f(Context context, SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = context;
        yzc yzcVar = new yzc();
        this.c = yzcVar;
        this.d = yzcVar;
        this.e = s9a.c(e.d(tz9.o(), z45.a));
        this.f = rlh.b;
    }

    public final boolean a(j1f j1fVar) {
        j1fVar.getClass();
        if (j1fVar.b != j7f.c) {
            return false;
        }
        long j = this.a.getLong("last_shown_pop_up_timestamp", 0L);
        wd5 wd5Var = xd5.b;
        if (xd5.k(wkn.S(yaa.w() - j, be5.SECONDS), be5.HOURS) < 12) {
            return false;
        }
        xw3.L(this.e, null, null, new gje(this, j1fVar, null, 6), 3);
        return true;
    }

    public final void b(Activity activity, boolean z) {
        if (!this.g || z) {
            this.g = true;
            xw3.L(this.e, null, null, new j8c(this, activity, (rq3) null, 28), 3);
        }
    }

    public final void c(KClass kClass) {
        SharedPreferences d;
        kClass.getClass();
        Context context = this.b;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putLong("last_shown_pop_up_timestamp", yaa.w());
        Unit unit = Unit.a;
        edit.apply();
        this.c.j(null);
        xw3.L(this.e, null, null, new j8c(this, kClass, (rq3) null, 29), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:29|30))(5:31|32|(1:44)(1:36)|37|(2:39|(1:41)(1:42))(5:43|(1:19)|20|21|(1:26)(2:23|24)))|12|(1:14)(1:28)|(1:19)|20|21|(0)(0)))|47|6|7|(0)(0)|12|(0)(0)|(0)|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        r5 = defpackage.w2g.b;
        r4 = new defpackage.u2g(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(j1f j1fVar, SharedPreferences sharedPreferences, Context context, Activity activity, sq3 sq3Var) {
        o1f o1fVar;
        Object obj;
        int i;
        boolean booleanValue;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        if (sq3Var instanceof o1f) {
            o1fVar = (o1f) sq3Var;
            int i4 = o1fVar.w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                o1fVar.w = i4 - Integer.MIN_VALUE;
                obj = o1fVar.u;
                lu3 lu3Var = lu3.a;
                i = o1fVar.w;
                boolean z3 = false;
                if (i != 0) {
                    y6a.M(obj);
                    p2g p2gVar = w2g.b;
                    booleanValue = ((Boolean) j1fVar.c.invoke(sharedPreferences)).booleanValue();
                    Function1 function1 = j1fVar.e;
                    int i5 = ((function1 == null || ((Boolean) function1.invoke(context)).booleanValue()) ? 0 : 1) ^ 1;
                    Function2 function2 = j1fVar.f;
                    if (function2 == null) {
                        i2 = i5;
                        z = false;
                        i3 = 1;
                        if (booleanValue && i3 != 0 && i2 != 0 && !z) {
                            z3 = true;
                        }
                        Serializable u2gVar = Boolean.valueOf(z3);
                        p2g p2gVar2 = w2g.b;
                        return w2g.a(u2gVar) == null ? u2gVar : Boolean.FALSE;
                    }
                    o1fVar.t = booleanValue;
                    o1fVar.r = 1;
                    o1fVar.s = i5;
                    o1fVar.w = 1;
                    Object invoke = function2.invoke(activity, o1fVar);
                    if (invoke == lu3Var) {
                        return lu3Var;
                    }
                    z2 = booleanValue;
                    obj = invoke;
                    i2 = i5;
                    i3 = 1;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = o1fVar.s;
                    i3 = o1fVar.r;
                    z2 = o1fVar.t;
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    booleanValue = z2;
                    z = true;
                } else {
                    booleanValue = z2;
                    z = false;
                }
                if (booleanValue) {
                    z3 = true;
                }
                Serializable u2gVar2 = Boolean.valueOf(z3);
                p2g p2gVar22 = w2g.b;
                if (w2g.a(u2gVar2) == null) {
                }
            }
        }
        o1fVar = new o1f(this, sq3Var);
        obj = o1fVar.u;
        lu3 lu3Var2 = lu3.a;
        i = o1fVar.w;
        boolean z32 = false;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        if (booleanValue) {
        }
        Serializable u2gVar22 = Boolean.valueOf(z32);
        p2g p2gVar222 = w2g.b;
        if (w2g.a(u2gVar22) == null) {
        }
    }
}
