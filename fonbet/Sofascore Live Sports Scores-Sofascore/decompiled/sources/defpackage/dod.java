package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dod implements zg2 {
    public final u84 a;
    public final Object b;
    public final Object[] c;
    public final yg2 d;
    public final qs3 e;
    public volatile boolean f;
    public pof g;
    public Throwable h;
    public boolean i;

    public dod(u84 u84Var, Object obj, Object[] objArr, yg2 yg2Var, qs3 qs3Var) {
        this.a = u84Var;
        this.b = obj;
        this.c = objArr;
        this.d = yg2Var;
        this.e = qs3Var;
    }

    @Override // defpackage.zg2
    public final synchronized qzf H() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((pof) b()).b;
    }

    @Override // defpackage.zg2
    public final void M(ph2 ph2Var) {
        pof pofVar;
        Throwable th;
        synchronized (this) {
            try {
                if (this.i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.i = true;
                pofVar = this.g;
                th = this.h;
                if (pofVar == null && th == null) {
                    try {
                        pof a = a();
                        this.g = a;
                        pofVar = a;
                    } catch (Throwable th2) {
                        th = th2;
                        kik.a0(th);
                        this.h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            ph2Var.m(this, th);
            return;
        }
        if (this.f) {
            pofVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(pofVar, new k1d(this, ph2Var, false, 3));
    }

    @Override // defpackage.zg2
    public final boolean Z() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            try {
                pof pofVar = this.g;
                if (pofVar == null || !pofVar.q) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    public final pof a() {
        il9 il9Var;
        jl9 c;
        u84 u84Var = this.a;
        yaa[] yaaVarArr = (yaa[]) u84Var.l;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length != yaaVarArr.length) {
            a70.p(fc6.h(yaaVarArr.length, ")", lnb.t(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        b0g b0gVar = new b0g((String) u84Var.h, (jl9) u84Var.g, (String) u84Var.i, (q89) u84Var.j, (zdc) u84Var.k, u84Var.a, u84Var.b, u84Var.c);
        if (u84Var.d) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            yaaVarArr[i].m(b0gVar, objArr[i]);
        }
        il9 il9Var2 = b0gVar.d;
        if (il9Var2 != null) {
            c = il9Var2.c();
        } else {
            String str = b0gVar.c;
            jl9 jl9Var = b0gVar.b;
            jl9Var.getClass();
            str.getClass();
            try {
                il9Var = new il9(0);
                il9Var.h(jl9Var, str);
            } catch (IllegalArgumentException unused) {
                il9Var = null;
            }
            c = il9Var != null ? il9Var.c() : null;
            if (c == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(jl9Var);
                String str2 = b0gVar.c;
                sb.append(", Relative: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        yzf yzfVar = b0gVar.k;
        if (yzfVar == null) {
            lm8 lm8Var = b0gVar.j;
            if (lm8Var != null) {
                yzfVar = new mm8(lm8Var.a, lm8Var.b);
            } else {
                l2a l2aVar = b0gVar.i;
                if (l2aVar != null) {
                    ArrayList arrayList2 = (ArrayList) l2aVar.d;
                    if (arrayList2.isEmpty()) {
                        a70.r("Multipart body must have at least one part.");
                        return null;
                    }
                    yzfVar = new ezc((gc2) l2aVar.b, (zdc) l2aVar.c, yol.j(arrayList2));
                } else if (b0gVar.h) {
                    yzfVar = yzf.create((zdc) null, new byte[0]);
                }
            }
        }
        zdc zdcVar = b0gVar.g;
        ef0 ef0Var = b0gVar.f;
        if (zdcVar != null) {
            if (yzfVar != null) {
                yzfVar = new a0g(yzfVar, zdcVar);
            } else {
                ef0Var.b("Content-Type", zdcVar.a);
            }
        }
        pzf pzfVar = b0gVar.e;
        pzfVar.a = c;
        ef0Var.getClass();
        pzfVar.c = vha.k(vha.i(ef0Var));
        pzfVar.e(b0gVar.a, yzfVar);
        dba dbaVar = new dba((Class) u84Var.e, this.b, (Method) u84Var.f, arrayList);
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(dba.class);
        orCreateKotlinClass.getClass();
        pzfVar.e = pzfVar.e.H(orCreateKotlinClass, dbaVar);
        return new pof((jod) this.d, new qzf(pzfVar));
    }

    public final ah2 b() {
        pof pofVar = this.g;
        if (pofVar != null) {
            return pofVar;
        }
        Throwable th = this.h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            pof a = a();
            this.g = a;
            return a;
        } catch (IOException | Error | RuntimeException e) {
            kik.a0(e);
            this.h = e;
            throw e;
        }
    }

    public final c2g c(d2g d2gVar) {
        i2g i2gVar = d2gVar.g;
        b2g k = d2gVar.k();
        k.g = new cod(i2gVar.contentType(), i2gVar.contentLength());
        d2g a = k.a();
        boolean z = a.q;
        int i = a.d;
        if (i < 200 || i >= 300) {
            try {
                x52 x52Var = new x52();
                i2gVar.source().y0(x52Var);
                i2g create = i2g.create(i2gVar.contentType(), i2gVar.contentLength(), x52Var);
                Objects.requireNonNull(create, "body == null");
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new c2g(a, null, create);
            } finally {
                i2gVar.close();
            }
        }
        if (i == 204 || i == 205) {
            if (z) {
                return new c2g(a, null, null);
            }
            a70.p("rawResponse must be successful response");
            return null;
        }
        bod bodVar = new bod(i2gVar);
        try {
            Object convert = this.e.convert(bodVar);
            if (z) {
                return new c2g(a, convert, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = bodVar.f;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // defpackage.zg2
    public final void cancel() {
        pof pofVar;
        this.f = true;
        synchronized (this) {
            pofVar = this.g;
        }
        if (pofVar != null) {
            pofVar.cancel();
        }
    }

    @Override // defpackage.zg2
    /* renamed from: clone, reason: collision with other method in class */
    public final zg2 mo784clone() {
        return new dod(this.a, this.b, this.c, this.d, this.e);
    }

    public final Object clone() {
        return new dod(this.a, this.b, this.c, this.d, this.e);
    }
}
