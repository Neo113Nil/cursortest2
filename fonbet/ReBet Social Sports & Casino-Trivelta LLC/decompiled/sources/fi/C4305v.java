package fi;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fi.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4305v {

    /* renamed from: a, reason: collision with root package name */
    public final Map f46784a = AbstractC4304u.a(16);

    /* renamed from: fi.v$a */
    public static final class a {
    }

    public final Object a(bi.f descriptor, a key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f46784a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(bi.f descriptor, a key, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object a10 = a(descriptor, key);
        if (a10 != null) {
            return a10;
        }
        Object invoke = defaultValue.invoke();
        c(descriptor, key, invoke);
        return invoke;
    }

    public final void c(bi.f descriptor, a key, Object value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map map = this.f46784a;
        Object obj = map.get(descriptor);
        if (obj == null) {
            obj = AbstractC4304u.a(2);
            map.put(descriptor, obj);
        }
        ((Map) obj).put(key, value);
    }
}
