package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m19 {
    public final Context a;
    public final py3 b;
    public final String c;

    public m19(Context context) {
        context.getClass();
        this.a = context;
        this.b = new py3(context);
        String string = context.getString(R.string.google_login_id);
        string.getClass();
        this.c = string;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ix8 ix8Var, sq3 sq3Var) {
        j19 j19Var;
        int i;
        if (sq3Var instanceof j19) {
            j19Var = (j19) sq3Var;
            int i2 = j19Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j19Var.t = i2 - Integer.MIN_VALUE;
                Object obj = j19Var.r;
                lu3 lu3Var = lu3.a;
                i = j19Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    FragmentActivity K = hkg.K(this.a);
                    if (K == null) {
                        a70.r("Get credential must be called with an activity context.");
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    ix8Var.getClass();
                    arrayList.add(ix8Var);
                    fx8 fx8Var = new fx8(CollectionsKt.S0(arrayList));
                    j19Var.t = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(j19Var));
                    lj2Var.t();
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    lj2Var.v(new my3(cancellationSignal, 1));
                    sz8 sz8Var = new sz8(lj2Var, 17);
                    hg0 hg0Var = new hg0(1);
                    qy3 a = si0.a(new si0(K), fx8Var);
                    if (a == null) {
                        sz8Var.c(new dx8("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 2));
                    } else {
                        a.onGetCredential(K, fx8Var, cancellationSignal, hg0Var, sz8Var);
                    }
                    obj = lj2Var.q();
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
                v09 d = z9.d((Bundle) ((gx8) obj).a.b);
                return new i19(d.c, d.d);
            }
        }
        j19Var = new j19(this, sq3Var);
        Object obj2 = j19Var.r;
        lu3 lu3Var2 = lu3.a;
        i = j19Var.t;
        if (i != 0) {
        }
        v09 d2 = z9.d((Bundle) ((gx8) obj2).a.b);
        return new i19(d2.c, d2.d);
    }

    public final ix8 b(n19 n19Var) {
        int ordinal = n19Var.ordinal();
        String str = this.c;
        if (ordinal == 0) {
            str.getClass();
            return new px8(str);
        }
        if (ordinal != 1) {
            zzl.b();
            return null;
        }
        str.getClass();
        if (str.length() > 0) {
            return new jx8(str);
        }
        a70.p("serverClientId should not be empty");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|25|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        throw r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        k19 k19Var;
        int i;
        if (sq3Var instanceof k19) {
            k19Var = (k19) sq3Var;
            int i2 = k19Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k19Var.t = i2 - Integer.MIN_VALUE;
                Object obj = k19Var.r;
                lu3 lu3Var = lu3.a;
                i = k19Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    py3 py3Var = this.b;
                    gw2 gw2Var = new gw2();
                    k19Var.t = 1;
                    if (py3.a(py3Var, gw2Var, k19Var) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        k19Var = new k19(this, sq3Var);
        Object obj2 = k19Var.r;
        lu3 lu3Var2 = lu3.a;
        i = k19Var.t;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(5:23|24|25|(1:27)|22)|20))|41|6|7|(0)(0)|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r2.invoke((defpackage.i19) r14, r0) != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003e, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        r10 = defpackage.s38.a();
        r11.getClass();
        r10.c(new defpackage.h19("No credentials available (" + r11 + ")", r9));
        r13.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0039, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        r10 = defpackage.s38.a();
        r11.getClass();
        r10.c(new defpackage.h19("Credential request failed (" + r11 + ")", r9));
        r12.invoke(r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r12v0, types: [k1e, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r13v3, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [m19] */
    /* JADX WARN: Type inference failed for: r9v4, types: [long] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(big bigVar, n19 n19Var, k1e k1eVar, l97 l97Var, sq3 sq3Var) {
        l19 l19Var;
        int i;
        big bigVar2;
        long j;
        l97 l97Var2;
        Function1 function1;
        if (sq3Var instanceof l19) {
            l19Var = (l19) sq3Var;
            int i2 = l19Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l19Var.y = i2 - Integer.MIN_VALUE;
                Object obj = l19Var.w;
                lu3 lu3Var = lu3.a;
                i = l19Var.y;
                if (i != 0) {
                    y6a.M(obj);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        ix8 b = b(n19Var);
                        l19Var.r = bigVar;
                        l19Var.s = n19Var;
                        l19Var.t = k1eVar;
                        l19Var.u = l97Var;
                        l19Var.v = elapsedRealtime;
                        l19Var.y = 1;
                        obj = a(b, l19Var);
                        if (obj != lu3Var) {
                            bigVar2 = bigVar;
                            j = elapsedRealtime;
                            function1 = k1eVar;
                            l97Var2 = l97Var;
                        }
                        return lu3Var;
                    } catch (bx8 e) {
                        e = e;
                        this = elapsedRealtime;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this;
                        if (elapsedRealtime2 < 1000) {
                            s38 a = s38.a();
                            n19Var.getClass();
                            a.c(new h19("Credential request cancelled after " + elapsedRealtime2 + "ms without showing UI (" + n19Var + ")", e));
                            l97Var.invoke();
                        }
                        return Unit.a;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = l19Var.v;
                    Function0 function0 = l19Var.u;
                    Function1 function12 = l19Var.t;
                    n19 n19Var2 = l19Var.s;
                    y6a.M(obj);
                    return Unit.a;
                }
                j = l19Var.v;
                ?? r13 = l19Var.u;
                Function1 function13 = l19Var.t;
                n19Var = l19Var.s;
                bigVar2 = l19Var.r;
                y6a.M(obj);
                function1 = function13;
                l97Var2 = r13;
                l19Var.r = null;
                l19Var.s = n19Var;
                l19Var.t = function1;
                l19Var.u = l97Var2;
                l19Var.v = j;
                l19Var.y = 2;
            }
        }
        l19Var = new l19(this, sq3Var);
        Object obj2 = l19Var.w;
        lu3 lu3Var2 = lu3.a;
        i = l19Var.y;
        if (i != 0) {
        }
        l19Var.r = null;
        l19Var.s = n19Var;
        l19Var.t = function1;
        l19Var.u = l97Var2;
        l19Var.v = j;
        l19Var.y = 2;
    }
}
