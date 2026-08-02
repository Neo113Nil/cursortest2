package sc;

import B90.C2601c;
import Kc.C3493a;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import oc.c;
import qc.InterfaceC9019a;
import qc.InterfaceC9020b;
import qc.InterfaceC9021c;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsConfigurator;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

/* renamed from: sc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9653a {

    /* renamed from: a, reason: collision with root package name */
    static final qc.o<Object, Object> f98521a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f98522b = new k();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC9019a f98523c = new h();

    /* renamed from: d, reason: collision with root package name */
    static final qc.g<Object> f98524d = new i();

    /* renamed from: e, reason: collision with root package name */
    public static final qc.g<Throwable> f98525e = new x();

    /* renamed from: f, reason: collision with root package name */
    public static final qc.p f98526f = new j();

    /* renamed from: g, reason: collision with root package name */
    static final qc.q<Object> f98527g = new C();

    /* renamed from: h, reason: collision with root package name */
    static final qc.q<Object> f98528h = new m();

    /* renamed from: i, reason: collision with root package name */
    static final Callable<Object> f98529i = new w();

    /* renamed from: j, reason: collision with root package name */
    static final Comparator<Object> f98530j = new s();

    /* renamed from: sc.a$A */
    /* loaded from: classes9.dex */
    static final class A<K, V, T> implements InterfaceC9020b<Map<K, V>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final qc.o<? super T, ? extends V> f98531a;

        /* renamed from: b, reason: collision with root package name */
        private final qc.o<? super T, ? extends K> f98532b;

        A(qc.o<? super T, ? extends V> oVar, qc.o<? super T, ? extends K> oVar2) {
            this.f98531a = oVar;
            this.f98532b = oVar2;
        }

        @Override // qc.InterfaceC9020b
        public final void accept(Object obj, Object obj2) throws Exception {
            ((Map) obj).put(this.f98532b.apply(obj2), this.f98531a.apply(obj2));
        }
    }

    /* renamed from: sc.a$B */
    /* loaded from: classes9.dex */
    static final class B<K, V, T> implements InterfaceC9020b<Map<K, Collection<V>>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final qc.o<? super K, ? extends Collection<? super V>> f98533a;

        /* renamed from: b, reason: collision with root package name */
        private final qc.o<? super T, ? extends V> f98534b;

        /* renamed from: c, reason: collision with root package name */
        private final qc.o<? super T, ? extends K> f98535c;

        B(qc.o<? super K, ? extends Collection<? super V>> oVar, qc.o<? super T, ? extends V> oVar2, qc.o<? super T, ? extends K> oVar3) {
            this.f98533a = oVar;
            this.f98534b = oVar2;
            this.f98535c = oVar3;
        }

        @Override // qc.InterfaceC9020b
        public final void accept(Object obj, Object obj2) throws Exception {
            Map map = (Map) obj;
            K apply = this.f98535c.apply(obj2);
            Collection<? super V> collection = (Collection) map.get(apply);
            if (collection == null) {
                collection = this.f98533a.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.f98534b.apply(obj2));
        }
    }

    /* renamed from: sc.a$C */
    static final class C implements qc.q<Object> {
        @Override // qc.q
        public final boolean test(Object obj) {
            return true;
        }
    }

    /* renamed from: sc.a$a, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    static final class C2168a<T> implements qc.g<T> {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC9019a f98536a;

        C2168a(InterfaceC9019a interfaceC9019a) {
            this.f98536a = interfaceC9019a;
        }

        @Override // qc.g
        public final void accept(T t2) throws Exception {
            this.f98536a.run();
        }
    }

    /* renamed from: sc.a$b, reason: case insensitive filesystem */
    /* loaded from: classes9.dex */
    static final class C9654b<T1, T2, R> implements qc.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC9021c<? super T1, ? super T2, ? extends R> f98537a;

        C9654b(InterfaceC9021c<? super T1, ? super T2, ? extends R> interfaceC9021c) {
            this.f98537a = interfaceC9021c;
        }

        @Override // qc.o
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.f98537a.apply(objArr2[0], objArr2[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr2.length);
        }
    }

    /* renamed from: sc.a$c, reason: case insensitive filesystem */
    /* loaded from: classes9.dex */
    static final class C9655c<T1, T2, T3, R> implements qc.o<Object[], R> {

        /* renamed from: a, reason: collision with root package name */
        final qc.h<T1, T2, T3, R> f98538a;

        C9655c(qc.h<T1, T2, T3, R> hVar) {
            this.f98538a = hVar;
        }

        @Override // qc.o
        public final Object apply(Object[] objArr) throws Exception {
            Boolean onComposerInitialized$lambda$2;
            Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
            }
            onComposerInitialized$lambda$2 = NotificationsSettingsConfigurator.onComposerInitialized$lambda$2((InterfaceC6511n) ((C2601c) this.f98538a).f3138a, objArr2[0], objArr2[1], objArr2[2]);
            return onComposerInitialized$lambda$2;
        }
    }

    /* renamed from: sc.a$d */
    /* loaded from: classes9.dex */
    static final class d<T> implements Callable<List<T>> {

        /* renamed from: a, reason: collision with root package name */
        final int f98539a;

        d(int i11) {
            this.f98539a = i11;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return new ArrayList(this.f98539a);
        }
    }

    /* renamed from: sc.a$e */
    /* loaded from: classes9.dex */
    static final class e<T> implements qc.q<T> {

        /* renamed from: a, reason: collision with root package name */
        final qc.e f98540a;

        e(qc.e eVar) {
            this.f98540a = eVar;
        }

        @Override // qc.q
        public final boolean test(T t2) throws Exception {
            boolean pollFlights$lambda$12;
            pollFlights$lambda$12 = AviaSearchResultViewModel.pollFlights$lambda$12((AviaSearchResultViewModel) ((AW.d) this.f98540a).f674a);
            return !pollFlights$lambda$12;
        }
    }

    /* renamed from: sc.a$f */
    /* loaded from: classes9.dex */
    static final class f<T, U> implements qc.o<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final Class<U> f98541a;

        f(Class<U> cls) {
            this.f98541a = cls;
        }

        @Override // qc.o
        public final U apply(T t2) throws Exception {
            return this.f98541a.cast(t2);
        }
    }

    /* renamed from: sc.a$g */
    /* loaded from: classes9.dex */
    static final class g<T, U> implements qc.q<T> {

        /* renamed from: a, reason: collision with root package name */
        final Class<U> f98542a;

        g(Class<U> cls) {
            this.f98542a = cls;
        }

        @Override // qc.q
        public final boolean test(T t2) throws Exception {
            return this.f98542a.isInstance(t2);
        }
    }

    /* renamed from: sc.a$h */
    static final class h implements InterfaceC9019a {
        @Override // qc.InterfaceC9019a
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: sc.a$i */
    static final class i implements qc.g<Object> {
        @Override // qc.g
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: sc.a$j */
    static final class j implements qc.p {
    }

    /* renamed from: sc.a$k */
    static final class k implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: sc.a$l */
    /* loaded from: classes9.dex */
    static final class l<T> implements qc.q<T> {

        /* renamed from: a, reason: collision with root package name */
        final T f98543a;

        l(T t2) {
            this.f98543a = t2;
        }

        @Override // qc.q
        public final boolean test(T t2) throws Exception {
            return C9656b.a(t2, this.f98543a);
        }
    }

    /* renamed from: sc.a$m */
    static final class m implements qc.q<Object> {
        @Override // qc.q
        public final boolean test(Object obj) {
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: sc.a$n */
    static final class n implements Callable<Set<Object>> {
        private static final /* synthetic */ n[] $VALUES;
        public static final n INSTANCE;

        static {
            n nVar = new n("INSTANCE", 0);
            INSTANCE = nVar;
            $VALUES = new n[]{nVar};
        }

        private n() {
            throw null;
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) $VALUES.clone();
        }

        @Override // java.util.concurrent.Callable
        public final Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    /* renamed from: sc.a$o */
    static final class o implements qc.o<Object, Object> {
        @Override // qc.o
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: sc.a$p */
    /* loaded from: classes9.dex */
    static final class p<T, U> implements Callable<U>, qc.o<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final U f98544a;

        p(U u11) {
            this.f98544a = u11;
        }

        @Override // qc.o
        public final U apply(T t2) throws Exception {
            return this.f98544a;
        }

        @Override // java.util.concurrent.Callable
        public final U call() throws Exception {
            return this.f98544a;
        }
    }

    /* renamed from: sc.a$q */
    /* loaded from: classes9.dex */
    static final class q<T> implements qc.o<List<T>, List<T>> {

        /* renamed from: a, reason: collision with root package name */
        final Comparator<? super T> f98545a;

        q(Comparator<? super T> comparator) {
            this.f98545a = comparator;
        }

        @Override // qc.o
        public final Object apply(Object obj) throws Exception {
            List list = (List) obj;
            Collections.sort(list, this.f98545a);
            return list;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: sc.a$r */
    /* loaded from: classes9.dex */
    static final class r implements Comparator<Object> {
        private static final /* synthetic */ r[] $VALUES;
        public static final r INSTANCE;

        static {
            r rVar = new r("INSTANCE", 0);
            INSTANCE = rVar;
            $VALUES = new r[]{rVar};
        }

        private r() {
            throw null;
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) $VALUES.clone();
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: sc.a$s */
    static final class s implements Comparator<Object> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: sc.a$t */
    /* loaded from: classes9.dex */
    static final class t<T> implements InterfaceC9019a {

        /* renamed from: a, reason: collision with root package name */
        final qc.g<? super io.reactivex.o<T>> f98546a;

        t(qc.g<? super io.reactivex.o<T>> gVar) {
            this.f98546a = gVar;
        }

        @Override // qc.InterfaceC9019a
        public final void run() throws Exception {
            this.f98546a.accept(io.reactivex.o.a());
        }
    }

    /* renamed from: sc.a$u */
    /* loaded from: classes9.dex */
    static final class u<T> implements qc.g<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final qc.g<? super io.reactivex.o<T>> f98547a;

        u(qc.g<? super io.reactivex.o<T>> gVar) {
            this.f98547a = gVar;
        }

        @Override // qc.g
        public final void accept(Throwable th2) throws Exception {
            this.f98547a.accept(io.reactivex.o.b(th2));
        }
    }

    /* renamed from: sc.a$v */
    /* loaded from: classes9.dex */
    static final class v<T> implements qc.g<T> {

        /* renamed from: a, reason: collision with root package name */
        final qc.g<? super io.reactivex.o<T>> f98548a;

        v(qc.g<? super io.reactivex.o<T>> gVar) {
            this.f98548a = gVar;
        }

        @Override // qc.g
        public final void accept(T t2) throws Exception {
            this.f98548a.accept(io.reactivex.o.c(t2));
        }
    }

    /* renamed from: sc.a$w */
    static final class w implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }
    }

    /* renamed from: sc.a$x */
    static final class x implements qc.g<Throwable> {
        @Override // qc.g
        public final void accept(Throwable th2) throws Exception {
            C3493a.f(new c(th2));
        }
    }

    /* renamed from: sc.a$y */
    /* loaded from: classes9.dex */
    static final class y<T> implements qc.o<T, Mc.b<T>> {

        /* renamed from: a, reason: collision with root package name */
        final TimeUnit f98549a;

        y(TimeUnit timeUnit, io.reactivex.x xVar) {
            this.f98549a = timeUnit;
        }

        @Override // qc.o
        public final Object apply(Object obj) throws Exception {
            TimeUnit timeUnit = this.f98549a;
            return new Mc.b(obj, io.reactivex.x.c(timeUnit), timeUnit);
        }
    }

    /* renamed from: sc.a$z */
    /* loaded from: classes9.dex */
    static final class z<K, T> implements InterfaceC9020b<Map<K, T>, T> {

        /* renamed from: a, reason: collision with root package name */
        private final qc.o<? super T, ? extends K> f98550a;

        z(qc.o<? super T, ? extends K> oVar) {
            this.f98550a = oVar;
        }

        @Override // qc.InterfaceC9020b
        public final void accept(Object obj, Object obj2) throws Exception {
            ((Map) obj).put(this.f98550a.apply(obj2), obj2);
        }
    }

    public static qc.o A() {
        C9656b.c(null, "f is null");
        throw null;
    }

    public static qc.o B() {
        C9656b.c(null, "f is null");
        throw null;
    }

    public static qc.o C() {
        C9656b.c(null, "f is null");
        throw null;
    }

    public static <T, K> InterfaceC9020b<Map<K, T>, T> D(qc.o<? super T, ? extends K> oVar) {
        return new z(oVar);
    }

    public static <T, K, V> InterfaceC9020b<Map<K, V>, T> E(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2) {
        return new A(oVar2, oVar);
    }

    public static <T, K, V> InterfaceC9020b<Map<K, Collection<V>>, T> F(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2, qc.o<? super K, ? extends Collection<? super V>> oVar3) {
        return new B(oVar3, oVar2, oVar);
    }

    public static <T> qc.g<T> a(InterfaceC9019a interfaceC9019a) {
        return new C2168a(interfaceC9019a);
    }

    public static <T> qc.q<T> b() {
        return (qc.q<T>) f98528h;
    }

    public static <T> qc.q<T> c() {
        return (qc.q<T>) f98527g;
    }

    public static <T, U> qc.o<T, U> d(Class<U> cls) {
        return new f(cls);
    }

    public static <T> Callable<List<T>> e(int i11) {
        return new d(i11);
    }

    public static <T> Callable<Set<T>> f() {
        return n.INSTANCE;
    }

    public static <T> qc.g<T> g() {
        return (qc.g<T>) f98524d;
    }

    public static <T> qc.q<T> h(T t2) {
        return new l(t2);
    }

    public static <T> qc.o<T, T> i() {
        return (qc.o<T, T>) f98521a;
    }

    public static <T, U> qc.q<T> j(Class<U> cls) {
        return new g(cls);
    }

    public static <T> Callable<T> k(T t2) {
        return new p(t2);
    }

    public static <T, U> qc.o<T, U> l(U u11) {
        return new p(u11);
    }

    public static <T> qc.o<List<T>, List<T>> m(Comparator<? super T> comparator) {
        return new q(comparator);
    }

    public static <T> Comparator<T> n() {
        return r.INSTANCE;
    }

    public static <T> Comparator<T> o() {
        return (Comparator<T>) f98530j;
    }

    public static <T> InterfaceC9019a p(qc.g<? super io.reactivex.o<T>> gVar) {
        return new t(gVar);
    }

    public static <T> qc.g<Throwable> q(qc.g<? super io.reactivex.o<T>> gVar) {
        return new u(gVar);
    }

    public static <T> qc.g<T> r(qc.g<? super io.reactivex.o<T>> gVar) {
        return new v(gVar);
    }

    public static <T> Callable<T> s() {
        return (Callable<T>) f98529i;
    }

    public static <T> qc.q<T> t(qc.e eVar) {
        return new e(eVar);
    }

    public static <T> qc.o<T, Mc.b<T>> u(TimeUnit timeUnit, io.reactivex.x xVar) {
        return new y(timeUnit, xVar);
    }

    public static qc.o v() {
        C9656b.c(null, "f is null");
        throw null;
    }

    public static <T1, T2, R> qc.o<Object[], R> w(InterfaceC9021c<? super T1, ? super T2, ? extends R> interfaceC9021c) {
        C9656b.c(interfaceC9021c, "f is null");
        return new C9654b(interfaceC9021c);
    }

    public static <T1, T2, T3, R> qc.o<Object[], R> x(qc.h<T1, T2, T3, R> hVar) {
        C9656b.c(hVar, "f is null");
        return new C9655c(hVar);
    }

    public static qc.o y() {
        C9656b.c(null, "f is null");
        throw null;
    }

    public static qc.o z() {
        C9656b.c(null, "f is null");
        throw null;
    }
}
