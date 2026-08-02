package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kk3 implements glg, h2d {
    public final glg a;
    public final h2d b;
    public CoroutineContext c;
    public Throwable d;
    public final jk3 e;

    public kk3(glg glgVar) {
        j2d j2dVar = new j2d();
        glgVar.getClass();
        this.a = glgVar;
        this.b = j2dVar;
        this.e = new jk3(this);
    }

    @Override // defpackage.glg
    public final nlg V0(String str) {
        str.getClass();
        jk3 jk3Var = this.e;
        if (jk3Var == null) {
            return this.a.V0(str);
        }
        Object c = jk3Var.c(str);
        c.getClass();
        return new ik3((nlg) c);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        jk3 jk3Var = this.e;
        if (jk3Var != null) {
            jk3Var.h(-1);
        }
        this.a.close();
    }

    @Override // defpackage.h2d
    public final Object e(rq3 rq3Var) {
        return this.b.e(rq3Var);
    }

    @Override // defpackage.h2d
    public final void f(Object obj) {
        this.b.f(null);
    }

    public final void g(StringBuilder sb) {
        Iterable iterable;
        int i;
        jk3 jk3Var = this.e;
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            CoroutineContext coroutineContext = this.c;
            if (coroutineContext != null) {
                sb.append("\t\tCoroutine: " + coroutineContext);
                sb.append('\n');
            }
            Throwable th = this.d;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                String b = de6.b(th);
                b.getClass();
                i8b i8bVar = new i8b(b);
                if (i8bVar.hasNext()) {
                    Object next = i8bVar.next();
                    if (i8bVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (i8bVar.hasNext()) {
                            arrayList.add(i8bVar.next());
                        }
                        iterable = arrayList;
                    } else {
                        iterable = a.c(next);
                    }
                } else {
                    iterable = km5.a;
                }
                Iterator it = CollectionsKt.S(iterable, 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (jk3Var != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (jk3Var.c) {
                i = jk3Var.d;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.glg
    public final boolean y() {
        return this.a.y();
    }
}
