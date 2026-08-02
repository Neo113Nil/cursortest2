package n00;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import m00.C8029a;
import org.jetbrains.annotations.NotNull;
import p00.InterfaceC8826b;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<C8029a> f76255a = O0.a(new C8029a(U.c(), U.c(), false));

    public final Boolean a() {
        Intrinsics.checkNotNullParameter("COMPOSER_ALERTS_DISABLED", "argumentName");
        return this.f76255a.getValue().c().get("COMPOSER_ALERTS_DISABLED");
    }

    @NotNull
    public final <T> T b(@NotNull InterfaceC8826b<T> flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        T t2 = (T) kotlin.reflect.e.b(flag.a(), this.f76255a.getValue().d().get(flag));
        return t2 == null ? flag.getDefaultValue() : t2;
    }

    @NotNull
    public final C8029a c() {
        return this.f76255a.getValue();
    }

    public final void d(@NotNull Tc.d debugFlags) {
        C8029a value;
        Intrinsics.checkNotNullParameter(debugFlags, "debugFlags");
        x0<C8029a> x0Var = this.f76255a;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, C8029a.b(value, debugFlags, null, false, 6)));
    }

    public final void e(@NotNull String key, boolean z11) {
        C8029a value;
        C8029a c8029a;
        LinkedHashMap u11;
        Intrinsics.checkNotNullParameter(key, "key");
        x0<C8029a> x0Var = this.f76255a;
        do {
            value = x0Var.getValue();
            c8029a = value;
            Map<String, Boolean> c11 = c8029a.c();
            Boolean valueOf = Boolean.valueOf(z11);
            u11 = U.u(c11);
            u11.put(key, valueOf);
        } while (!x0Var.b(value, C8029a.b(c8029a, null, u11, false, 5)));
    }

    public final <T> void f(@NotNull InterfaceC8826b<T> flagInfo, @NotNull T value) {
        C8029a value2;
        C8029a c8029a;
        LinkedHashMap u11;
        Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
        Intrinsics.checkNotNullParameter(value, "value");
        x0<C8029a> x0Var = this.f76255a;
        do {
            value2 = x0Var.getValue();
            c8029a = value2;
            u11 = U.u(c8029a.d());
            u11.put(flagInfo, value);
        } while (!x0Var.b(value2, C8029a.b(c8029a, u11, null, false, 6)));
    }

    @NotNull
    public final M0<C8029a> g() {
        return C2399j.b(this.f76255a);
    }
}
