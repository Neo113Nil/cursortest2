package je;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe.AbstractC9028C;
import qe.AbstractC9032c;
import qe.AbstractC9034e;
import te.C9865a;

/* loaded from: classes.dex */
public final class o0 extends AbstractC9034e<AbstractC7393m0<?>, AbstractC7393m0<?>> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f69907b = new a();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final o0 f69908c = new o0(kotlin.collections.K.f71697a);

    public static final class a extends AbstractC9028C<AbstractC7393m0<?>, AbstractC7393m0<?>> {
        @NotNull
        public static o0 f(@NotNull List attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return attributes.isEmpty() ? o0.f69908c : new o0(attributes, 0);
        }

        @Override // qe.AbstractC9028C
        public final int b(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String key, @NotNull Function1<? super String, Integer> compute) {
            int intValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 != null) {
                        intValue = num2.intValue();
                    } else {
                        Integer invoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(invoke.intValue()));
                        intValue = invoke.intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return intValue;
        }
    }

    private o0() {
        throw null;
    }

    public /* synthetic */ o0(List list, int i11) {
        this(list);
    }

    @NotNull
    public final o0 i(@NotNull o0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f69907b.d().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            AbstractC7393m0<?> abstractC7393m0 = b().get(intValue);
            AbstractC7393m0<?> abstractC7393m02 = other.b().get(intValue);
            C9865a.a(arrayList, abstractC7393m0 == null ? abstractC7393m02 != null ? abstractC7393m02.a(abstractC7393m0) : null : abstractC7393m0.a(abstractC7393m02));
        }
        return a.f(arrayList);
    }

    @NotNull
    public final o0 k(@NotNull o0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f69907b.d().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            AbstractC7393m0<?> abstractC7393m0 = b().get(intValue);
            AbstractC7393m0<?> abstractC7393m02 = other.b().get(intValue);
            C9865a.a(arrayList, abstractC7393m0 == null ? abstractC7393m02 != null ? abstractC7393m02.c(abstractC7393m0) : null : abstractC7393m0.c(abstractC7393m02));
        }
        return a.f(arrayList);
    }

    @NotNull
    public final o0 l(@NotNull C7396p attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        kotlin.reflect.d<? extends C7396p> kClass = attribute.b();
        a aVar = f69907b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String u11 = kClass.u();
        Intrinsics.f(u11);
        return b().get(aVar.c(u11)) != null ? this : isEmpty() ? new o0(C7714v.a0(attribute)) : a.f(C7714v.q0(attribute, C7714v.U0(this)));
    }

    @NotNull
    public final o0 m(@NotNull C7396p attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (!isEmpty()) {
            AbstractC9032c<AbstractC7393m0<?>> b11 = b();
            ArrayList arrayList = new ArrayList();
            for (AbstractC7393m0<?> abstractC7393m0 : b11) {
                if (!Intrinsics.d(abstractC7393m0, attribute)) {
                    arrayList.add(abstractC7393m0);
                }
            }
            if (arrayList.size() != b().getSize()) {
                f69907b.getClass();
                return a.f(arrayList);
            }
        }
        return this;
    }

    private o0(List<? extends AbstractC7393m0<?>> list) {
        for (AbstractC7393m0<?> abstractC7393m0 : list) {
            e(abstractC7393m0.b(), abstractC7393m0);
        }
    }
}
