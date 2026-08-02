package n20;

import androidx.collection.C;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import k20.C7473e;
import k20.C7475g;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import n20.InterfaceC8427g;
import o20.C8633a;
import org.jetbrains.annotations.NotNull;

/* renamed from: n20.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C8425e<M extends InterfaceC8046a<?, ? extends l20.c>> implements k<M> {

    @NotNull
    private final ConcurrentHashMap<Integer, Collection<C8633a>> configsCache;

    @NotNull
    private final Object lock;

    @NotNull
    private final C<InterfaceC8427g> storeWidgets;

    @NotNull
    private final ConcurrentHashMap<Integer, Collection<C8426f<M>>> viewMappersCache;

    @NotNull
    private final C<M> viewMappersHashes;

    @NotNull
    private final C7475g widgetComponentStorage;

    public C8425e() {
        this.lock = new Object();
        this.configsCache = new ConcurrentHashMap<>();
        this.viewMappersCache = new ConcurrentHashMap<>();
        this.viewMappersHashes = new C<>();
        this.widgetComponentStorage = new C7475g();
        this.storeWidgets = new C<>();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n20.c] */
    /* renamed from: insertConfigs-6IFkDoY, reason: not valid java name */
    private final void m438insertConfigs6IFkDoY(String str, final long j11, final i iVar) {
        int hashCode = Long.hashCode(j11) + (str.hashCode() * 31);
        ConcurrentHashMap<Integer, Collection<C8633a>> concurrentHashMap = this.configsCache;
        Integer valueOf = Integer.valueOf(hashCode);
        final ?? r12 = new Function2() { // from class: n20.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Collection insertConfigs_6IFkDoY$lambda$14;
                C8425e c8425e = this;
                insertConfigs_6IFkDoY$lambda$14 = C8425e.insertConfigs_6IFkDoY$lambda$14(i.this, j11, c8425e, (Integer) obj, (Collection) obj2);
                return insertConfigs_6IFkDoY$lambda$14;
            }
        };
        concurrentHashMap.computeIfPresent(valueOf, new BiFunction() { // from class: n20.d
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Collection insertConfigs_6IFkDoY$lambda$15;
                insertConfigs_6IFkDoY$lambda$15 = C8425e.insertConfigs_6IFkDoY$lambda$15(C8423c.this, obj, obj2);
                return insertConfigs_6IFkDoY$lambda$15;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection insertConfigs_6IFkDoY$lambda$14(i iVar, long j11, C8425e c8425e, Integer num, Collection cachedConfigs) {
        Intrinsics.checkNotNullParameter(num, "<unused var>");
        Intrinsics.checkNotNullParameter(cachedConfigs, "cachedConfigs");
        C8633a e11 = InterfaceC8427g.b.e(iVar, j11, c8425e.widgetComponentStorage);
        if (e11 == null) {
            return cachedConfigs;
        }
        Tc.j builder = new Tc.j(new Tc.d(cachedConfigs.size() + 1));
        builder.addAll(cachedConfigs);
        builder.add(e11);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection insertConfigs_6IFkDoY$lambda$15(Function2 function2, Object obj, Object obj2) {
        return (Collection) function2.invoke(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n20.a] */
    /* renamed from: insertViewMappers-6IFkDoY, reason: not valid java name */
    private final void m439insertViewMappers6IFkDoY(String str, final long j11, final i iVar) {
        int hashCode = Long.hashCode(j11) + (str.hashCode() * 31);
        ConcurrentHashMap<Integer, Collection<C8426f<M>>> concurrentHashMap = this.viewMappersCache;
        Integer valueOf = Integer.valueOf(hashCode);
        final ?? r12 = new Function2() { // from class: n20.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Collection insertViewMappers_6IFkDoY$lambda$19;
                C8425e c8425e = this;
                insertViewMappers_6IFkDoY$lambda$19 = C8425e.insertViewMappers_6IFkDoY$lambda$19(i.this, j11, c8425e, (Integer) obj, (Collection) obj2);
                return insertViewMappers_6IFkDoY$lambda$19;
            }
        };
        concurrentHashMap.computeIfPresent(valueOf, new BiFunction() { // from class: n20.b
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Collection insertViewMappers_6IFkDoY$lambda$20;
                insertViewMappers_6IFkDoY$lambda$20 = C8425e.insertViewMappers_6IFkDoY$lambda$20(C8421a.this, obj, obj2);
                return insertViewMappers_6IFkDoY$lambda$20;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection insertViewMappers_6IFkDoY$lambda$19(i iVar, long j11, C8425e c8425e, Integer num, Collection cachedViewMappers) {
        Intrinsics.checkNotNullParameter(num, "<unused var>");
        Intrinsics.checkNotNullParameter(cachedViewMappers, "cachedViewMappers");
        LinkedHashSet<C8426f> f7 = InterfaceC8427g.b.f(iVar, j11, c8425e.widgetComponentStorage);
        if (f7 == null) {
            f7 = null;
        }
        if (f7 == null) {
            return cachedViewMappers;
        }
        for (C8426f c8426f : f7) {
            C<M> c11 = c8425e.viewMappersHashes;
            int a11 = c8426f.a();
            if (c11.c(a11) == null) {
                c11.j(a11, c8426f.b());
            }
        }
        Tc.j builder = new Tc.j(new Tc.d(f7.size() + cachedViewMappers.size()));
        builder.addAll(cachedViewMappers);
        builder.addAll(f7);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection insertViewMappers_6IFkDoY$lambda$20(Function2 function2, Object obj, Object obj2) {
        return (Collection) function2.invoke(obj, obj2);
    }

    private final void insertWidget(i value, boolean z11) {
        C7475g c7475g = this.widgetComponentStorage;
        C7473e<? extends InterfaceC6958a>[] components = value.widgetComponent(c7475g);
        c7475g.getClass();
        Intrinsics.checkNotNullParameter(components, "components");
        for (C7473e<? extends InterfaceC6958a> c7473e : components) {
            c7475g.a(c7473e);
        }
        synchronized (this.lock) {
            String widgetKey = value.getWidgetKey();
            Intrinsics.checkNotNullParameter(value, "value");
            InterfaceC8427g c11 = this.storeWidgets.c(widgetKey.hashCode());
            if (c11 == null) {
                this.storeWidgets.j(widgetKey.hashCode(), InterfaceC8427g.b.d(value));
                return;
            }
            c11.c(value, this);
            if (z11) {
                m441updateCache4cKulsw$composer_widget(value);
            }
            Unit unit = Unit.f71690a;
        }
    }

    private final void insertWidgets(Collection<? extends i> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            insertWidget((i) it.next(), false);
        }
    }

    @Override // n20.k
    public boolean containsWidget(@NotNull String key) {
        boolean b11;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            b11 = this.storeWidgets.b(key.hashCode());
        }
        return b11;
    }

    @Override // n20.k
    @NotNull
    public Collection<InterfaceC7243a<? extends Object>> getConfigs(@NotNull String value, long j11) {
        Collection<C8633a> a11;
        Intrinsics.checkNotNullParameter(value, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int hashCode = Long.hashCode(j11) + (value.hashCode() * 31);
        ConcurrentHashMap<Integer, Collection<C8633a>> concurrentHashMap = this.configsCache;
        Integer valueOf = Integer.valueOf(hashCode);
        Collection<C8633a> collection = concurrentHashMap.get(valueOf);
        if (collection == null) {
            synchronized (this.lock) {
                InterfaceC8427g c11 = this.storeWidgets.c(value.hashCode());
                a11 = c11 != null ? c11.a(j11, this.widgetComponentStorage) : null;
            }
            if (a11 != null) {
                Collection<C8633a> putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, a11);
                collection = putIfAbsent == null ? a11 : putIfAbsent;
            } else {
                collection = null;
            }
        }
        Collection<C8633a> collection2 = collection;
        if (collection2 == null) {
            return K.f71697a;
        }
        Collection<C8633a> collection3 = collection2;
        ArrayList arrayList = new ArrayList(C7714v.z(collection3, 10));
        Iterator<T> it = collection3.iterator();
        while (it.hasNext()) {
            arrayList.add(((C8633a) it.next()).a());
        }
        return arrayList;
    }

    @Override // n20.k
    public M getViewMapper(int i11) {
        M c11;
        synchronized (this.lock) {
            c11 = this.viewMappersHashes.c(i11);
        }
        return c11;
    }

    @Override // n20.k
    public Collection<C8426f<M>> getViewMappers(@NotNull String value, long j11) {
        LinkedHashSet<C8426f> b11;
        Intrinsics.checkNotNullParameter(value, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int hashCode = Long.hashCode(j11) + (value.hashCode() * 31);
        ConcurrentHashMap<Integer, Collection<C8426f<M>>> concurrentHashMap = this.viewMappersCache;
        Integer valueOf = Integer.valueOf(hashCode);
        Collection<C8426f<M>> collection = concurrentHashMap.get(valueOf);
        if (collection == null) {
            synchronized (this.lock) {
                try {
                    InterfaceC8427g c11 = this.storeWidgets.c(value.hashCode());
                    b11 = c11 != null ? c11.b(j11, this.widgetComponentStorage) : null;
                    if (b11 == null) {
                        b11 = null;
                    }
                    if (b11 == null) {
                        b11 = null;
                    } else {
                        for (C8426f c8426f : b11) {
                            C<M> c12 = this.viewMappersHashes;
                            int a11 = c8426f.a();
                            if (c12.c(a11) == null) {
                                c12.j(a11, c8426f.b());
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (b11 != null) {
                Collection<C8426f<M>> putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, b11);
                collection = putIfAbsent == null ? b11 : putIfAbsent;
            } else {
                collection = null;
            }
        }
        return collection;
    }

    @Override // n20.k
    public final void insert(@NotNull i widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        insertWidget(widget, true);
    }

    /* renamed from: insertWidget-yiMf5Ak$composer_widget, reason: not valid java name */
    public final void m440insertWidgetyiMf5Ak$composer_widget(@NotNull String key, @NotNull InterfaceC8427g widget) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(widget, "widget");
        synchronized (this.lock) {
            this.storeWidgets.j(key.hashCode(), widget);
            Unit unit = Unit.f71690a;
        }
    }

    /* renamed from: updateCache-4cKulsw$composer_widget, reason: not valid java name */
    public final void m441updateCache4cKulsw$composer_widget(@NotNull i widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        String widgetKey = widget.getWidgetKey();
        for (long j11 : widget.getVersions()) {
            m438insertConfigs6IFkDoY(widgetKey, j11, widget);
            m439insertViewMappers6IFkDoY(widgetKey, j11, widget);
        }
    }

    public C8425e(@NotNull Collection<? extends i> widgets) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.lock = new Object();
        this.configsCache = new ConcurrentHashMap<>();
        this.viewMappersCache = new ConcurrentHashMap<>();
        this.viewMappersHashes = new C<>();
        this.widgetComponentStorage = new C7475g();
        this.storeWidgets = new C<>(widgets.size());
        insertWidgets(widgets);
    }

    public C8425e(@NotNull Collection<? extends i> widgets, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        this.lock = new Object();
        this.configsCache = new ConcurrentHashMap<>();
        this.viewMappersCache = new ConcurrentHashMap<>();
        this.viewMappersHashes = new C<>();
        this.widgetComponentStorage = widgetComponentStorage;
        this.storeWidgets = new C<>(widgets.size());
        insertWidgets(widgets);
    }
}
