package u20;

import Dj.EnumC2873a;
import Dj.InterfaceC2874b;
import Dj.InterfaceC2875c;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xj.e;

/* renamed from: u20.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC9924a extends InterfaceC2874b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2197a f99762b = C2197a.f99763d;

    /* renamed from: u20.a$a, reason: collision with other inner class name */
    public static final class C2197a implements InterfaceC9924a {

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ C2197a f99763d = new C2197a();

        /* renamed from: c, reason: collision with root package name */
        private final /* synthetic */ C9925b f99764c = new C9925b();

        private C2197a() {
        }

        @Override // Dj.InterfaceC2874b
        public final void a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C9925b c9925b = this.f99764c;
            Intrinsics.checkNotNullParameter(message, "message");
            InterfaceC2874b.a.d(c9925b, message);
        }

        @Override // Dj.InterfaceC2874b
        public final void b(@NotNull EnumC2873a level, @NotNull String message, LinkedHashMap linkedHashMap, Boolean bool) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f99764c.b(level, message, linkedHashMap, bool);
        }

        public final void c() {
            Intrinsics.checkNotNullParameter("Открылся экран OzonDebugMenu", "message");
            C9925b c9925b = this.f99764c;
            Intrinsics.checkNotNullParameter("Открылся экран OzonDebugMenu", "message");
            Boolean bool = Boolean.FALSE;
            Intrinsics.checkNotNullParameter("Открылся экран OzonDebugMenu", "message");
            c9925b.b(EnumC2873a.DEBUG, "Открылся экран OzonDebugMenu", null, bool);
        }

        public final void d(InterfaceC2875c interfaceC2875c) {
            if (interfaceC2875c != null) {
                e logger = interfaceC2875c.f("DevTools", "OzonDebugMenu");
                C2197a c2197a = f99763d;
                c2197a.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c2197a.f99764c.e(logger);
            }
        }

        public final void e(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C9925b c9925b = this.f99764c;
            c9925b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            InterfaceC2874b.a.b(c9925b, message);
        }

        public final void f(@NotNull EnumC2873a level, @NotNull String message, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(level, "level");
            this.f99764c.c(level, message, throwable);
        }
    }

    /* renamed from: u20.a$b */
    public static final class b {
    }
}
