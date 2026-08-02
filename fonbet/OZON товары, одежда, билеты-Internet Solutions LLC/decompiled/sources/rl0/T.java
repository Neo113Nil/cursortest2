package rl0;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class T {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Locale f83642b = new Locale("ru", "RU");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TimeZone f83643c;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f83644a = Calendar.getInstance();

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"UTC\")");
        f83643c = timeZone;
    }
}
