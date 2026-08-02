package u20;

import Dj.EnumC2873a;
import Dj.InterfaceC2874b;
import U7.d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u20.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9925b implements InterfaceC9924a {

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2874b f99765c;

    private final void d(EnumC2873a enumC2873a, String str, Throwable th2) {
        String str2;
        InterfaceC2874b interfaceC2874b = this.f99765c;
        if (interfaceC2874b != null) {
            if (th2 == null) {
                str2 = "";
            } else {
                StringWriter stringWriter = new StringWriter();
                th2.printStackTrace(new PrintWriter(stringWriter));
                str2 = "\n" + stringWriter;
            }
            interfaceC2874b.b(enumC2873a, d.e(str, str2), null, null);
        }
    }

    @Override // Dj.InterfaceC2874b
    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC2874b.a.d(this, message);
    }

    @Override // Dj.InterfaceC2874b
    public final void b(@NotNull EnumC2873a level, @NotNull String message, LinkedHashMap linkedHashMap, Boolean bool) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        d(level, message, null);
    }

    public final void c(@NotNull EnumC2873a level, @NotNull String message, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(level, "level");
        d(level, message, throwable);
    }

    public final void e(@NotNull InterfaceC2874b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f99765c = logger;
    }
}
