package l5;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import n5.g;
import org.jetbrains.annotations.NotNull;
import p5.h;
import p5.m;
import r5.InterfaceC9172b;
import s5.InterfaceC9596d;
import v5.C10239m;

/* renamed from: l5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7873b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<q5.i> f72799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Pair<InterfaceC9596d<? extends Object, ? extends Object>, Class<? extends Object>>> f72800b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Pair<InterfaceC9172b<? extends Object>, Class<? extends Object>>> f72801c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Pair<h.a<? extends Object>, Class<? extends Object>>> f72802d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<g.a> f72803e;

    public /* synthetic */ C7873b(int i11, List list, List list2, List list3, List list4, List list5) {
        this(list, list2, list3, list4, list5);
    }

    @NotNull
    public final List<g.a> a() {
        return this.f72803e;
    }

    @NotNull
    public final List<Pair<h.a<? extends Object>, Class<? extends Object>>> b() {
        return this.f72802d;
    }

    @NotNull
    public final List<q5.i> c() {
        return this.f72799a;
    }

    @NotNull
    public final List<Pair<InterfaceC9172b<? extends Object>, Class<? extends Object>>> d() {
        return this.f72801c;
    }

    @NotNull
    public final List<Pair<InterfaceC9596d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.f72800b;
    }

    public final String f(@NotNull Object obj, @NotNull C10239m c10239m) {
        List<Pair<InterfaceC9172b<? extends Object>, Class<? extends Object>>> list = this.f72801c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Pair<InterfaceC9172b<? extends Object>, Class<? extends Object>> pair = list.get(i11);
            InterfaceC9172b<? extends Object> a11 = pair.a();
            if (pair.b().isAssignableFrom(obj.getClass())) {
                Intrinsics.g(a11, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String a12 = a11.a(obj, c10239m);
                if (a12 != null) {
                    return a12;
                }
            }
        }
        return null;
    }

    @NotNull
    public final Object g(@NotNull Object obj, @NotNull C10239m c10239m) {
        List<Pair<InterfaceC9596d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f72800b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Pair<InterfaceC9596d<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i11);
            InterfaceC9596d<? extends Object, ? extends Object> a11 = pair.a();
            if (pair.b().isAssignableFrom(obj.getClass())) {
                Intrinsics.g(a11, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object a12 = a11.a(obj, c10239m);
                if (a12 != null) {
                    obj = a12;
                }
            }
        }
        return obj;
    }

    public final Pair h(@NotNull m mVar, @NotNull C10239m c10239m, @NotNull i iVar, int i11) {
        List<g.a> list = this.f72803e;
        int size = list.size();
        while (i11 < size) {
            n5.g a11 = list.get(i11).a(mVar, c10239m);
            if (a11 != null) {
                return new Pair(a11, Integer.valueOf(i11));
            }
            i11++;
        }
        return null;
    }

    public final Pair i(@NotNull Object obj, @NotNull C10239m c10239m, @NotNull i iVar, int i11) {
        List<Pair<h.a<? extends Object>, Class<? extends Object>>> list = this.f72802d;
        int size = list.size();
        while (i11 < size) {
            Pair<h.a<? extends Object>, Class<? extends Object>> pair = list.get(i11);
            h.a<? extends Object> a11 = pair.a();
            if (pair.b().isAssignableFrom(obj.getClass())) {
                Intrinsics.g(a11, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                p5.h a12 = a11.a(obj, c10239m);
                if (a12 != null) {
                    return new Pair(a12, Integer.valueOf(i11));
                }
            }
            i11++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C7873b(List<? extends q5.i> list, List<? extends Pair<? extends InterfaceC9596d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends InterfaceC9172b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends h.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends g.a> list5) {
        this.f72799a = list;
        this.f72800b = list2;
        this.f72801c = list3;
        this.f72802d = list4;
        this.f72803e = list5;
    }

    /* renamed from: l5.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f72804a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f72805b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f72806c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList f72807d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final ArrayList f72808e;

        public a() {
            this.f72804a = new ArrayList();
            this.f72805b = new ArrayList();
            this.f72806c = new ArrayList();
            this.f72807d = new ArrayList();
            this.f72808e = new ArrayList();
        }

        @NotNull
        public final void a(@NotNull g.a aVar) {
            this.f72808e.add(aVar);
        }

        @NotNull
        public final void b(@NotNull h.a aVar, @NotNull Class cls) {
            this.f72807d.add(new Pair(aVar, cls));
        }

        @NotNull
        public final void c(@NotNull InterfaceC9172b interfaceC9172b, @NotNull Class cls) {
            this.f72806c.add(new Pair(interfaceC9172b, cls));
        }

        @NotNull
        public final void d(@NotNull InterfaceC9596d interfaceC9596d, @NotNull Class cls) {
            this.f72805b.add(new Pair(interfaceC9596d, cls));
        }

        @NotNull
        public final C7873b e() {
            return new C7873b(0, A5.c.a(this.f72804a), A5.c.a(this.f72805b), A5.c.a(this.f72806c), A5.c.a(this.f72807d), A5.c.a(this.f72808e));
        }

        @NotNull
        public final List<g.a> f() {
            return this.f72808e;
        }

        @NotNull
        public final List<Pair<h.a<? extends Object>, Class<? extends Object>>> g() {
            return this.f72807d;
        }

        public a(@NotNull C7873b c7873b) {
            this.f72804a = C7714v.W0(c7873b.c());
            this.f72805b = C7714v.W0(c7873b.e());
            this.f72806c = C7714v.W0(c7873b.d());
            this.f72807d = C7714v.W0(c7873b.b());
            this.f72808e = C7714v.W0(c7873b.a());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7873b() {
        this(r1, r1, r1, r1, r1);
        K k11 = K.f71697a;
    }
}
