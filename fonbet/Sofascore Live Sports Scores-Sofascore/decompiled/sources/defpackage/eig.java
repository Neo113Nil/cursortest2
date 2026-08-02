package defpackage;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class eig {
    public final Function1 a;
    public final y3g b;
    public final WebView c;
    public final String d;
    public String e;
    public final g62 f;

    public eig(Context context, Function1 function1) {
        y3g y3gVar = new y3g(context, 5);
        context.getClass();
        this.a = function1;
        this.b = y3gVar;
        this.c = (WebView) y3gVar.c;
        this.d = "https://mobile.smartadserver.com/";
        this.f = ml4.g(0, 7, null);
        ((WebView) y3gVar.b).setWebViewClient(new zhg(this, 0));
    }

    public final Object a(String str, hoi hoiVar) {
        g62 g = ml4.g(0, 7, null);
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new k50(this, str, g, null, 21), 3);
        return g.f(hoiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r14 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, sq3 sq3Var) {
        cig cigVar;
        int i;
        try {
            if (sq3Var instanceof cig) {
                cigVar = (cig) sq3Var;
                int i2 = cigVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cigVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = cigVar.s;
                    lu3 lu3Var = lu3.a;
                    i = cigVar.u;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj);
                        hs4 hs4Var = z45.a;
                        r69 r69Var = rob.a;
                        k50 k50Var = new k50(this, str, str2, rq3Var, 22);
                        cigVar.r = this;
                        cigVar.u = 1;
                        if (xw3.R(r69Var, k50Var, cigVar) != lu3Var) {
                            this = this;
                        }
                        return lu3Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = cigVar.r;
                        y6a.M(obj);
                        Exception exc = (Exception) obj;
                        if (exc != null) {
                            throw exc;
                        }
                        this.f.r(null);
                        return Unit.a;
                    }
                    this = cigVar.r;
                    y6a.M(obj);
                    g62 g62Var = this.f;
                    cigVar.r = this;
                    cigVar.u = 2;
                    obj = g62Var.f(cigVar);
                }
            }
            if (i != 0) {
            }
            g62 g62Var2 = this.f;
            cigVar.r = this;
            cigVar.u = 2;
            obj = g62Var2.f(cigVar);
        } catch (Throwable th) {
            this.f.r(null);
            throw th;
        }
        cigVar = new cig(this, sq3Var);
        Object obj2 = cigVar.s;
        lu3 lu3Var2 = lu3.a;
        i = cigVar.u;
        rq3 rq3Var2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (defpackage.xw3.R(r9, r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, sq3 sq3Var) {
        dig digVar;
        int i;
        try {
            if (sq3Var instanceof dig) {
                digVar = (dig) sq3Var;
                int i2 = digVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    digVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = digVar.s;
                    lu3 lu3Var = lu3.a;
                    i = digVar.u;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj);
                        hs4 hs4Var = z45.a;
                        r69 r69Var = rob.a;
                        m1f m1fVar = new m1f(this, str, rq3Var, 12);
                        digVar.r = this;
                        digVar.u = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = digVar.r;
                            y6a.M(obj);
                            Exception exc = (Exception) obj;
                            if (exc != null) {
                                throw exc;
                            }
                            this.f.r(null);
                            return Unit.a;
                        }
                        this = digVar.r;
                        y6a.M(obj);
                    }
                    g62 g62Var = this.f;
                    digVar.r = this;
                    digVar.u = 2;
                    obj = g62Var.f(digVar);
                }
            }
            if (i != 0) {
            }
            g62 g62Var2 = this.f;
            digVar.r = this;
            digVar.u = 2;
            obj = g62Var2.f(digVar);
        } catch (Throwable th) {
            this.f.r(null);
            throw th;
        }
        digVar = new dig(this, sq3Var);
        Object obj2 = digVar.s;
        lu3 lu3Var2 = lu3.a;
        i = digVar.u;
        rq3 rq3Var2 = null;
    }
}
