package ji;

import ag.c;
import androidx.appcompat.app.v0;
import androidx.appcompat.widget.a0;
import cg.e;
import cg.n;
import cg.o;
import cg.p;
import cg.q;
import com.google.firebase.messaging.x;
import di.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final gi.a f18562a;

    /* renamed from: b, reason: collision with root package name */
    public final x f18563b;

    /* renamed from: c, reason: collision with root package name */
    public ThreadLocal f18564c;

    public a(gi.a scopeQualifier, x _koin) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter("_root_", "id");
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.f18562a = scopeQualifier;
        this.f18563b = _koin;
        new ArrayList();
        new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r5 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c clazz, gi.a aVar) {
        String str;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        x xVar = this.f18563b;
        io.sentry.config.a aVar2 = (io.sentry.config.a) xVar.f6182a;
        b bVar = b.f8381a;
        aVar2.getClass();
        if (b.f8385e.compareTo(bVar) > 0) {
            return c(aVar, clazz, null);
        }
        if (aVar != null) {
            str = " with qualifier '" + aVar + '\'';
        }
        str = "";
        ((io.sentry.config.a) xVar.f6182a).i(bVar, "|- '" + li.a.a(clazz) + '\'' + str + "...");
        p.f3941a.getClass();
        n.f3939a.getClass();
        q qVar = new q(c(aVar, clazz, null), o.a(System.nanoTime() - n.f3940b), null);
        io.sentry.config.a aVar3 = (io.sentry.config.a) xVar.f6182a;
        StringBuilder sb2 = new StringBuilder("|- '");
        sb2.append(li.a.a(clazz));
        sb2.append("' in ");
        cg.a aVar4 = cg.b.f3911b;
        sb2.append(cg.b.f(qVar.f3943b, e.f3917c) / 1000.0d);
        sb2.append(" ms");
        aVar3.i(bVar, sb2.toString());
        return qVar.f3942a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
    
        if (r0 == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a0 instanceContext) {
        Object obj;
        String str;
        l1.a aVar = (l1.a) this.f18563b.f6183b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "scope");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        aVar.getClass();
        fi.a aVar2 = (fi.a) instanceContext.f684f;
        c clazz = (c) instanceContext.f682d;
        String str2 = (String) instanceContext.f685g;
        io.sentry.config.a aVar3 = (io.sentry.config.a) instanceContext.f680b;
        Object obj2 = null;
        if (aVar2 == null || aVar2.f9626a.isEmpty()) {
            obj = null;
        } else {
            aVar3.f("|- ? " + str2 + " look in injected parameters");
            obj = aVar2.a(clazz);
        }
        if (obj == null) {
            v0 v0Var = (v0) ((x) aVar.f19314b).f6185d;
            gi.a aVar4 = (gi.a) instanceContext.f683e;
            v0Var.getClass();
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            gi.a scopeQualifier = this.f18562a;
            Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
            Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(li.a.a(clazz));
            sb2.append(':');
            sb2.append(aVar4 != null ? aVar4.f10338a : "");
            sb2.append(':');
            sb2.append(scopeQualifier);
            ci.b bVar = (ci.b) ((ConcurrentHashMap) v0Var.f365c).get(sb2.toString());
            Object b10 = bVar != null ? bVar.b(instanceContext) : null;
            if (b10 == null) {
                b10 = null;
            }
            if (b10 == null) {
                ThreadLocal threadLocal = this.f18564c;
                l lVar = threadLocal != null ? (l) threadLocal.get() : null;
                if (lVar != null && !lVar.isEmpty()) {
                    aVar3.f("|- ? " + str2 + " look in stack parameters");
                    fi.a aVar5 = (fi.a) lVar.f();
                    if (aVar5 != null) {
                        b10 = aVar5.a(clazz);
                    }
                }
                b10 = null;
            }
            obj2 = b10;
        } else {
            obj2 = obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        gi.a aVar6 = (gi.a) instanceContext.f683e;
        if (aVar6 != null) {
            str = " and qualifier '" + aVar6 + '\'';
        }
        str = "";
        String msg = "No definition found for type '" + li.a.a((c) instanceContext.f682d) + '\'' + str + ". Check your Modules configuration and add missing type and/or qualifier!";
        Intrinsics.checkNotNullParameter(msg, "msg");
        throw new bi.a(msg);
    }

    public final Object c(gi.a aVar, c cVar, fi.a aVar2) {
        l lVar;
        x xVar = this.f18563b;
        a0 a0Var = new a0((io.sentry.config.a) xVar.f6182a, this, cVar, aVar, aVar2);
        if (aVar2 == null) {
            return b(a0Var);
        }
        io.sentry.config.a aVar3 = (io.sentry.config.a) xVar.f6182a;
        b bVar = b.f8381a;
        aVar3.getClass();
        if (b.f8385e.compareTo(bVar) <= 0) {
            aVar3.i(bVar, "| >> parameters " + aVar2);
        }
        ThreadLocal threadLocal = this.f18564c;
        if (threadLocal == null || (lVar = (l) threadLocal.get()) == null) {
            lVar = new l();
            ThreadLocal threadLocal2 = new ThreadLocal();
            this.f18564c = threadLocal2;
            threadLocal2.set(lVar);
        }
        lVar.addFirst(aVar2);
        try {
            return b(a0Var);
        } finally {
            ((io.sentry.config.a) xVar.f6182a).f("| << parameters");
            if (!lVar.isEmpty()) {
                lVar.removeFirst();
            }
            if (lVar.isEmpty()) {
                ThreadLocal threadLocal3 = this.f18564c;
                if (threadLocal3 != null) {
                    threadLocal3.remove();
                }
                this.f18564c = null;
            }
        }
    }

    public final String toString() {
        return "['_root_']";
    }
}
