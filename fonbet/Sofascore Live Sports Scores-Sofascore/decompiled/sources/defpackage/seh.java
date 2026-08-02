package defpackage;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class seh {
    public final a9h a;
    public final c8h b;
    public final b8h c;
    public final vhj d;
    public final ye4 e;
    public final x7f f;
    public final CoroutineContext g;
    public s7h h;
    public boolean i;
    public boolean j;
    public String k;

    public seh(a9h a9hVar, c8h c8hVar, b8h b8hVar, vhj vhjVar, ye4 ye4Var, x7f x7fVar, CoroutineContext coroutineContext) {
        a9hVar.getClass();
        c8hVar.getClass();
        b8hVar.getClass();
        vhjVar.getClass();
        ye4Var.getClass();
        x7fVar.getClass();
        coroutineContext.getClass();
        this.a = a9hVar;
        this.b = c8hVar;
        this.c = b8hVar;
        this.d = vhjVar;
        this.e = ye4Var;
        this.f = x7fVar;
        this.g = coroutineContext;
        peh pehVar = peh.a;
        this.k = "";
        xw3.L(s9a.c(coroutineContext), null, null, new oeh(this, null, 0), 3);
    }

    public final void a() {
        this.i = false;
        if (this.h == null) {
            return;
        }
        this.f.a();
        xw3.L(s9a.c(this.g), null, null, new oeh(this, null, 1), 3);
    }

    public final void b() {
        this.i = true;
        s7h s7hVar = this.h;
        if (s7hVar == null) {
            this.j = true;
            return;
        }
        rq3 rq3Var = null;
        if (s7hVar == null) {
            Intrinsics.i("localSessionData");
            throw null;
        }
        this.f.a();
        if (d(s7hVar) || c(s7hVar)) {
            xw3.L(s9a.c(this.g), null, null, new big(this, s7hVar, rq3Var, 9), 3);
        }
    }

    public final boolean c(s7h s7hVar) {
        Map map = s7hVar.c;
        boolean z = true;
        x7f x7fVar = this.f;
        if (map == null) {
            x7fVar.a();
            return true;
        }
        x7fVar.getClass();
        v7f v7fVar = (v7f) map.get(x7fVar.a());
        if (v7fVar != null && v7fVar.a == x7fVar.c && Intrinsics.c(v7fVar.b, (String) x7fVar.d.getValue())) {
            z = false;
        }
        if (z) {
            x7fVar.a();
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (defpackage.xd5.g(r6) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (defpackage.xd5.g(r6) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(s7h s7hVar) {
        long R;
        ygj ygjVar = s7hVar.b;
        x7h x7hVar = s7hVar.a;
        if (ygjVar == null) {
            String str = x7hVar.a;
            return false;
        }
        this.d.getClass();
        ygj a = vhj.a();
        wd5 wd5Var = xd5.b;
        long S = wkn.S(a.a - ygjVar.a, be5.MILLISECONDS);
        a9h a9hVar = this.a;
        xd5 c = a9hVar.a.c();
        if (c != null) {
            R = c.a;
            if (R > 0) {
            }
        }
        xd5 c2 = a9hVar.b.c();
        if (c2 != null) {
            R = c2.a;
            if (R > 0) {
            }
        }
        R = wkn.R(30, be5.MINUTES);
        boolean z = xd5.c(S, R) > 0;
        if (z) {
            String str2 = x7hVar.a;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, peh pehVar, rq3 rq3Var) {
        reh rehVar;
        int i;
        if (rq3Var instanceof reh) {
            rehVar = (reh) rq3Var;
            int i2 = rehVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rehVar.v = i2 - Integer.MIN_VALUE;
                Object obj = rehVar.t;
                lu3 lu3Var = lu3.a;
                i = rehVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    if (Intrinsics.c(this.k, str)) {
                        return Unit.a;
                    }
                    this.k = str;
                    v58 v58Var = v58.a;
                    rehVar.r = str;
                    rehVar.s = pehVar;
                    rehVar.v = 1;
                    obj = v58Var.b(rehVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pehVar = rehVar.s;
                    str = rehVar.r;
                    y6a.M(obj);
                }
                for (ew3 ew3Var : ((Map) obj).values()) {
                    s8h s8hVar = new s8h(str);
                    ew3Var.getClass();
                    Objects.toString(s8hVar);
                    l2a l2aVar = ew3Var.b;
                    synchronized (l2aVar) {
                        if (!Objects.equals((String) l2aVar.d, str)) {
                            r18 r18Var = (r18) l2aVar.b;
                            String str2 = (String) l2aVar.c;
                            if (str2 != null) {
                                try {
                                    r18Var.k(str2, "aqs.".concat(str)).createNewFile();
                                } catch (IOException unused) {
                                }
                            }
                            l2aVar.d = str;
                        }
                    }
                    int ordinal = pehVar.ordinal();
                    if (ordinal == 0) {
                        r8h.a.toString();
                    } else {
                        if (ordinal != 1) {
                            zzl.b();
                            return null;
                        }
                        r8h.a.toString();
                    }
                }
                return Unit.a;
            }
        }
        rehVar = new reh(this, rq3Var);
        Object obj2 = rehVar.t;
        lu3 lu3Var2 = lu3.a;
        i = rehVar.v;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return Unit.a;
    }
}
