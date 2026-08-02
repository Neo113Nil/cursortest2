package kotlin.coroutines.jvm.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/coroutines/jvm/internal/g;", "", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f71776a = new g();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f71777b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f71778c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f71779a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f71780b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f71781c;

        public a(Method method, Method method2, Method method3) {
            this.f71779a = method;
            this.f71780b = method2;
            this.f71781c = method3;
        }
    }

    public static String a(@NotNull kotlin.coroutines.jvm.internal.a continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        a aVar = f71778c;
        a aVar2 = f71777b;
        if (aVar == null) {
            try {
                a aVar3 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, new Class[0]));
                f71778c = aVar3;
                aVar = aVar3;
            } catch (Exception unused) {
                f71778c = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2) {
            Method method = aVar.f71779a;
            Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
            if (invoke != null) {
                Method method2 = aVar.f71780b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                if (invoke2 != null) {
                    Method method3 = aVar.f71781c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                    if (invoke3 instanceof String) {
                        return (String) invoke3;
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
