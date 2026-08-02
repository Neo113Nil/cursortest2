package gi;

import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gi.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6740b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends InterfaceC6958a>, InterfaceC7081a<? extends InterfaceC6958a>> f64491a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap<Class<? extends InterfaceC6958a>, InterfaceC6958a> f64492b;

    public C6740b(@NotNull Map<Class<? extends InterfaceC6958a>, InterfaceC7081a<? extends InterfaceC6958a>> factories) {
        Intrinsics.checkNotNullParameter(factories, "factories");
        this.f64491a = factories;
        this.f64492b = new HashMap<>();
    }

    public final <T extends InterfaceC6958a> boolean a(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return this.f64492b.containsKey(clazz) || this.f64491a.containsKey(clazz);
    }

    @NotNull
    public final <T extends InterfaceC6958a> T b(@NotNull Class<? extends T> clazz) {
        Object obj;
        Class<? extends T> cls;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        HashMap<Class<? extends InterfaceC6958a>, InterfaceC6958a> hashMap = this.f64492b;
        T t2 = (T) hashMap.get(clazz);
        if (t2 != null) {
            return t2;
        }
        Map<Class<? extends InterfaceC6958a>, InterfaceC7081a<? extends InterfaceC6958a>> map = this.f64491a;
        if (map.get(clazz) != null) {
            cls = clazz;
        } else {
            Iterator<T> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (clazz.isAssignableFrom((Class) obj)) {
                    break;
                }
            }
            cls = (Class) obj;
        }
        if (cls == null) {
            throw new IllegalStateException("Can not find component for ".concat(clazz.getSimpleName()));
        }
        T t11 = (T) hashMap.get(cls);
        if (t11 != null) {
            return t11;
        }
        T t12 = (T) ((InterfaceC7081a) U.e(map, cls)).create(this);
        hashMap.put(cls, t12);
        Intrinsics.g(t12, "null cannot be cast to non-null type T of ru.ozon.android.di.provider.ComponentStorage.getComponent");
        return t12;
    }
}
