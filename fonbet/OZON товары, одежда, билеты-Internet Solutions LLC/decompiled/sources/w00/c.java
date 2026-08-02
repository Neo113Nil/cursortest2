package w00;

import i00.InterfaceC6980a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static InterfaceC6980a f103325a = b.a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f103326b = 0;

    public static void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter("ComposerDebugMenu", "tag");
        f103325a.log(message);
    }

    public static void b(@NotNull InterfaceC6980a logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        f103325a = logger;
    }
}
