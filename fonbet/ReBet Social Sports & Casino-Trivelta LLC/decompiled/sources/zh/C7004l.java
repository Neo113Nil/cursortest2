package zh;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import yh.AbstractC6897f;

/* renamed from: zh.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7004l {

    /* renamed from: a, reason: collision with root package name */
    public final Map f69202a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f69203b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f69204c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f69205d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f69206e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final Set f69207f = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: g, reason: collision with root package name */
    public final Function f69208g;

    public C7004l(Function function) {
        this.f69208g = function;
    }

    public static /* synthetic */ Object a(C7004l c7004l, String str, String str2, oh.g gVar, String str3) {
        c7004l.getClass();
        return c7004l.i(AbstractC6897f.a(str).d(str2).c(str3).b(gVar).a());
    }

    public static /* synthetic */ Map b(String str) {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Map c(String str) {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Object d(C7004l c7004l, oh.g gVar, String str) {
        c7004l.getClass();
        return c7004l.i(AbstractC6897f.a(str).b(gVar).a());
    }

    public static /* synthetic */ Object e(C7004l c7004l, String str, oh.g gVar, String str2) {
        c7004l.getClass();
        return c7004l.i(AbstractC6897f.a(str).d(str2).b(gVar).a());
    }

    public static /* synthetic */ Map f(String str) {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Map g(String str) {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Object h(C7004l c7004l, String str, oh.g gVar, String str2) {
        c7004l.getClass();
        return c7004l.i(AbstractC6897f.a(str).c(str2).b(gVar).a());
    }

    public final Object i(AbstractC6897f abstractC6897f) {
        Object apply = this.f69208g.apply(abstractC6897f);
        synchronized (this.f69206e) {
            this.f69207f.add(apply);
        }
        return apply;
    }

    public Object j(final String str, final String str2, String str3, final oh.g gVar) {
        return (str2 == null || str3 == null) ? str2 != null ? ((Map) this.f69203b.computeIfAbsent(str, new Function() { // from class: zh.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7004l.b((String) obj);
            }
        })).computeIfAbsent(str2, new Function() { // from class: zh.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7004l.e(C7004l.this, str, gVar, (String) obj);
            }
        }) : str3 != null ? ((Map) this.f69204c.computeIfAbsent(str, new Function() { // from class: zh.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7004l.c((String) obj);
            }
        })).computeIfAbsent(str3, new Function() { // from class: zh.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7004l.h(C7004l.this, str, gVar, (String) obj);
            }
        }) : this.f69202a.computeIfAbsent(str, new Function() { // from class: zh.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7004l.d(C7004l.this, gVar, (String) obj);
            }
        }) : ((Map) ((Map) this.f69205d.computeIfAbsent(str, new Function() { // from class: zh.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7004l.g((String) obj);
            }
        })).computeIfAbsent(str2, new Function() { // from class: zh.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7004l.f((String) obj);
            }
        })).computeIfAbsent(str3, new Function() { // from class: zh.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C7004l.a(C7004l.this, str, str2, gVar, (String) obj);
            }
        });
    }
}
