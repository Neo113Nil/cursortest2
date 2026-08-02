package th0;

import C.C2702w;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<SharedPreferences> f99530a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f99531b;

    public static final class a {
        @NotNull
        public static c a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new c(new th0.b(context));
        }
    }

    static final class b extends AbstractC7737t implements Function0<SharedPreferences> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return (SharedPreferences) c.this.f99530a.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Function0<? extends SharedPreferences> sharedPreferencesProvider) {
        Intrinsics.checkNotNullParameter(sharedPreferencesProvider, "sharedPreferencesProvider");
        this.f99530a = sharedPreferencesProvider;
        this.f99531b = k.b(new b());
    }

    public final void b() {
        C2702w.e((SharedPreferences) this.f99531b.getValue(), "WAS_INSTALLED_WITH_NEW_SDK_VERSION", true);
    }

    public final boolean c() {
        return ((SharedPreferences) this.f99531b.getValue()).getBoolean("WAS_INSTALLED_WITH_NEW_SDK_VERSION", false);
    }
}
