package mZ;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: mZ.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8116a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C8116a f74679a = new C8116a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SimpleDateFormat f74680b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

    private static String a(String str) {
        return G.g.c(f74680b.format(Calendar.getInstance().getTime()), " | ", str);
    }

    public final void b() {
        Intrinsics.checkNotNullParameter("Cached CDN config file is absent", "message");
        String message = a("Cached CDN config file is absent");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public final void c(@NotNull String message, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(a(message), "message");
    }
}
