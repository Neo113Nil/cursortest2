package r20;

import Dj.InterfaceC2875c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u20.InterfaceC9924a;
import x20.C10649a;
import x20.C10651c;

/* renamed from: r20.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9164a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile E20.a f82859b;

    /* renamed from: d, reason: collision with root package name */
    private static Ld0.c f82861d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C9164a f82858a = new C9164a();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f82860c = k.b(C1409a.f82862a);

    /* renamed from: r20.a$a, reason: collision with other inner class name */
    /* synthetic */ class C1409a extends C7735q implements Function0<H20.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1409a f82862a = new C1409a(0, H20.b.class, "<init>", "<init>()V", 0);

        @Override // kotlin.jvm.functions.Function0
        public final H20.b invoke() {
            return new H20.b();
        }
    }

    @NotNull
    public static E20.a a() {
        E20.a aVar = f82859b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Библиотека OzonDebugMenu не инициализирована");
    }

    public static Object b() {
        return f82860c.getValue();
    }

    public static Ld0.c c() {
        return f82861d;
    }

    public static void e(Ld0.c cVar) {
        f82861d = cVar;
    }

    public final void d(@NotNull Application application, @NotNull C9167d settings) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(settings, "settings");
        InterfaceC9924a.C2197a c2197a = InterfaceC9924a.f99762b;
        Ld0.c cVar = f82861d;
        c2197a.d(cVar != null ? (InterfaceC2875c) cVar.d(InterfaceC2875c.class) : null);
        if (f82859b == null) {
            synchronized (this) {
                try {
                    if (f82859b == null) {
                        f82859b = new E20.a(application, settings);
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (settings.a().b()) {
            application.registerActivityLifecycleCallbacks(new C10649a(new C10651c(application)));
        }
    }
}
