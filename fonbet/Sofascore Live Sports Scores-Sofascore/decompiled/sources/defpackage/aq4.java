package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aq4 implements gj9, ku3 {
    public final /* synthetic */ int a = 0;
    public final zk9 b;
    public final qj9 c;
    public final lu8 d;
    public final lu8 e;
    public final CoroutineContext f;
    public final xh9 g;
    public final Object h;
    public final o89 i;

    public aq4(xpg xpgVar, byte[] bArr, aq4 aq4Var) {
        qj9 qj9Var;
        lu8 lu8Var;
        lu8 lu8Var2;
        this.g = xpgVar;
        this.h = bArr;
        this.b = aq4Var.d();
        switch (aq4Var.a) {
            case 0:
                qj9Var = aq4Var.c;
                break;
            default:
                qj9Var = aq4Var.c;
                break;
        }
        this.c = qj9Var;
        switch (aq4Var.a) {
            case 0:
                lu8Var = aq4Var.d;
                break;
            default:
                lu8Var = aq4Var.d;
                break;
        }
        this.d = lu8Var;
        switch (aq4Var.a) {
            case 0:
                lu8Var2 = aq4Var.e;
                break;
            default:
                lu8Var2 = aq4Var.e;
                break;
        }
        this.e = lu8Var2;
        this.i = aq4Var.a();
        this.f = aq4Var.getCoroutineContext();
    }

    @Override // defpackage.gj9
    public final o89 a() {
        int i = this.a;
        o89 o89Var = this.i;
        switch (i) {
            case 0:
                return (w89) o89Var;
            default:
                return o89Var;
        }
    }

    public final xh9 b() {
        int i = this.a;
        xh9 xh9Var = this.g;
        switch (i) {
            case 0:
                return xh9Var;
            default:
                return (xpg) xh9Var;
        }
    }

    public final db2 c() {
        int i = this.a;
        Object obj = this.h;
        switch (i) {
            case 0:
                return (db2) obj;
            default:
                return n9e.b((byte[]) obj);
        }
    }

    public final zk9 d() {
        int i = this.a;
        return this.b;
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        switch (this.a) {
        }
        return this.f;
    }

    public final String toString() {
        return "HttpResponse[" + b().c().getUrl() + ", " + d() + ']';
    }

    public aq4(xh9 xh9Var, jk9 jk9Var) {
        this.g = xh9Var;
        this.f = jk9Var.f;
        this.b = jk9Var.a;
        this.c = jk9Var.d;
        this.d = jk9Var.b;
        this.e = jk9Var.g;
        Object obj = jk9Var.e;
        db2 db2Var = obj instanceof db2 ? (db2) obj : null;
        if (db2Var == null) {
            db2.a.getClass();
            db2Var = cb2.b;
        }
        this.h = db2Var;
        this.i = jk9Var.c;
    }
}
