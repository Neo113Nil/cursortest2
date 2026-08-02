package h20;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* renamed from: h20.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6787b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<a, InterfaceC6786a> f64729a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Class<? extends l20.c>, Pc.a<? extends InterfaceC6786a>> f64730b = new ConcurrentHashMap<>();

    /* renamed from: h20.b$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f64731a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Class<? extends l20.c> f64732b;

        public a(String str, @NotNull Class<? extends l20.c> clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            this.f64731a = str;
            this.f64732b = clazz;
        }

        @NotNull
        public final Class<? extends l20.c> a() {
            return this.f64732b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f64731a, aVar.f64731a) && Intrinsics.d(this.f64732b, aVar.f64732b);
        }

        public final int hashCode() {
            String str = this.f64731a;
            return this.f64732b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return "WidgetViewModelKey(hash=" + this.f64731a + ", clazz=" + this.f64732b + ")";
        }
    }

    public final void a(@NotNull List<? extends C7854a> viewObjects) {
        Intrinsics.checkNotNullParameter(viewObjects, "viewObjects");
        HashMap<a, InterfaceC6786a> hashMap = this.f64729a;
        boolean isEmpty = hashMap.isEmpty();
        ConcurrentHashMap<Class<? extends l20.c>, Pc.a<? extends InterfaceC6786a>> concurrentHashMap = this.f64730b;
        if (isEmpty && concurrentHashMap.isEmpty()) {
            return;
        }
        if (viewObjects.isEmpty()) {
            Collection<InterfaceC6786a> values = hashMap.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                ((InterfaceC6786a) it.next()).onCleared();
            }
            hashMap.clear();
            concurrentHashMap.clear();
            return;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C7854a c7854a : viewObjects) {
            hashSet.add(new a(String.valueOf(c7854a.i().e()), c7854a.d().getClass()));
            hashSet2.add(c7854a.d().getClass());
        }
        Iterator<Map.Entry<a, InterfaceC6786a>> it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<a, InterfaceC6786a> next = it2.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Map.Entry<a, InterfaceC6786a> entry = next;
            a key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            a aVar = key;
            InterfaceC6786a value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            InterfaceC6786a interfaceC6786a = value;
            if (!hashSet.contains(aVar)) {
                interfaceC6786a.onCleared();
                it2.remove();
            }
            Class<? extends l20.c> a11 = aVar.a();
            if (!hashSet2.contains(a11)) {
                concurrentHashMap.remove(a11);
            }
        }
    }

    public final InterfaceC6786a b(@NotNull l viewObject) {
        InterfaceC6786a interfaceC6786a;
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        a aVar = new a(String.valueOf(viewObject.i().e()), viewObject.d().getClass());
        HashMap<a, InterfaceC6786a> hashMap = this.f64729a;
        InterfaceC6786a interfaceC6786a2 = hashMap.get(aVar);
        if (interfaceC6786a2 == null) {
            Pc.a<? extends InterfaceC6786a> aVar2 = this.f64730b.get(viewObject.d().getClass());
            if (aVar2 == null || (interfaceC6786a = aVar2.get()) == null) {
                interfaceC6786a2 = null;
            } else {
                hashMap.put(aVar, interfaceC6786a);
                interfaceC6786a2 = interfaceC6786a;
            }
        }
        if (interfaceC6786a2 == null) {
            return null;
        }
        return interfaceC6786a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@NotNull l viewObject, @NotNull Pc.a provider) {
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f64730b.putIfAbsent(viewObject.d().getClass(), provider);
    }
}
