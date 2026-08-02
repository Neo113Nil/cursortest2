package sg0;

import Dj.EnumC2873a;
import Dj.InterfaceC2874b;
import Dj.InterfaceC2875c;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xj.e;

/* renamed from: sg0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC9693a extends InterfaceC2874b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2170a f98765a = C2170a.f98766d;

    /* renamed from: sg0.a$a, reason: collision with other inner class name */
    public static final class C2170a implements InterfaceC9693a {

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ C2170a f98766d = new C2170a();

        /* renamed from: c, reason: collision with root package name */
        private final /* synthetic */ C9694b f98767c = new C9694b();

        private C2170a() {
        }

        @Override // Dj.InterfaceC2874b
        public final void a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            b.d(this.f98767c, message);
        }

        @Override // Dj.InterfaceC2874b
        public final void b(@NotNull EnumC2873a level, @NotNull String message, LinkedHashMap linkedHashMap, Boolean bool) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f98767c.b(level, message, linkedHashMap, bool);
        }

        public final void c(InterfaceC2875c interfaceC2875c) {
            if (interfaceC2875c != null) {
                e logger = interfaceC2875c.f("DevTools", "OzonSentryHelper");
                C2170a c2170a = f98766d;
                c2170a.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c2170a.f98767c.e(logger);
            }
        }

        public final void d() {
            Intrinsics.checkNotNullParameter("OzonSentryHelperLimbPluginProvider: невозможно обработать диплинк, так как отсутствует плагин `AbToolLibsApi`", "message");
            b.a(this.f98767c);
        }

        public final void e(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            b.b(this.f98767c, message);
        }

        public final void f(@NotNull EnumC2873a level, @NotNull String message, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(level, "level");
            this.f98767c.c(level, message, throwable);
        }
    }

    /* renamed from: sg0.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static void a(@NotNull InterfaceC9693a interfaceC9693a) {
            Intrinsics.checkNotNullParameter("OzonSentryHelperLimbPluginProvider: невозможно обработать диплинк, так как отсутствует плагин `AbToolLibsApi`", "message");
            Intrinsics.checkNotNullParameter("OzonSentryHelperLimbPluginProvider: невозможно обработать диплинк, так как отсутствует плагин `AbToolLibsApi`", "message");
            interfaceC9693a.b(EnumC2873a.ERROR, "OzonSentryHelperLimbPluginProvider: невозможно обработать диплинк, так как отсутствует плагин `AbToolLibsApi`", null, null);
        }

        public static void b(@NotNull InterfaceC9693a interfaceC9693a, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            InterfaceC2874b.a.b(interfaceC9693a, message);
        }

        public static void d(@NotNull InterfaceC9693a interfaceC9693a, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            InterfaceC2874b.a.d(interfaceC9693a, message);
        }
    }
}
