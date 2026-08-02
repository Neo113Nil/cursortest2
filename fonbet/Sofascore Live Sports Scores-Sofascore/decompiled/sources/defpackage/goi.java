package defpackage;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class goi extends ghe {
    public final List b;
    public final foi c;
    public Object d;
    public final rq3[] e;
    public int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goi(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        list.getClass();
        this.b = list;
        this.c = new foi(this);
        this.d = obj;
        this.e = new rq3[list.size()];
        this.f = -1;
    }

    @Override // defpackage.ghe
    public final Object a(Object obj, sq3 sq3Var) {
        this.g = 0;
        if (this.b.size() == 0) {
            return obj;
        }
        obj.getClass();
        this.d = obj;
        if (this.f < 0) {
            return c(sq3Var);
        }
        a70.r("Already started");
        return null;
    }

    @Override // defpackage.ghe
    public final Object b() {
        return this.d;
    }

    @Override // defpackage.ghe
    public final Object c(rq3 rq3Var) {
        Object obj;
        if (this.g == this.b.size()) {
            obj = this.d;
        } else {
            rq3 b = z9a.b(rq3Var);
            b.getClass();
            int i = this.f + 1;
            this.f = i;
            rq3[] rq3VarArr = this.e;
            rq3VarArr[i] = b;
            if (e(true)) {
                int i2 = this.f;
                if (i2 < 0) {
                    a70.r("No more continuations to resume");
                    return null;
                }
                this.f = i2 - 1;
                rq3VarArr[i2] = null;
                obj = this.d;
            } else {
                obj = lu3.a;
            }
        }
        if (obj == lu3.a) {
            rq3Var.getClass();
        }
        return obj;
    }

    @Override // defpackage.ghe
    public final Object d(rq3 rq3Var, Object obj) {
        obj.getClass();
        this.d = obj;
        return c(rq3Var);
    }

    public final boolean e(boolean z) {
        ct8 ct8Var;
        Object obj;
        foi foiVar;
        do {
            int i = this.g;
            List list = this.b;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                p2g p2gVar = w2g.b;
                f(this.d);
                return false;
            }
            this.g = i + 1;
            ct8Var = (ct8) list.get(i);
            try {
                obj = this.d;
                foiVar = this.c;
                ct8Var.getClass();
                obj.getClass();
                foiVar.getClass();
                i5k.e(3, ct8Var);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                f(new u2g(th));
                return false;
            }
        } while (ct8Var.invoke(this, obj, foiVar) != lu3.a);
        return false;
    }

    public final void f(Object obj) {
        int i = this.f;
        if (i < 0) {
            a70.r("No more continuations to resume");
            return;
        }
        rq3[] rq3VarArr = this.e;
        rq3 rq3Var = rq3VarArr[i];
        rq3Var.getClass();
        int i2 = this.f;
        this.f = i2 - 1;
        rq3VarArr[i2] = null;
        p2g p2gVar = w2g.b;
        if (!(obj instanceof u2g)) {
            rq3Var.resumeWith(obj);
            return;
        }
        Throwable a = w2g.a(obj);
        a.getClass();
        try {
            a.getCause();
        } catch (Throwable unused) {
        }
        p2g p2gVar2 = w2g.b;
        rq3Var.resumeWith(new u2g(a));
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.c.getContext();
    }
}
