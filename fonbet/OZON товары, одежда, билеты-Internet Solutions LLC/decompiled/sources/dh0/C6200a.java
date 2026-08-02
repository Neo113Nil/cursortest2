package dh0;

import G.g;
import Zg0.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sh0.C9697a;

/* renamed from: dh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6200a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final SimpleDateFormat f61624a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C9697a f61625b = new C9697a();

    /* renamed from: c, reason: collision with root package name */
    private static d f61626c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f61627d = 0;

    @NotNull
    public static String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return g.c(f61624a.format(Calendar.getInstance().getTime()), " | ", str);
    }

    public static d b() {
        return f61626c;
    }

    @NotNull
    public static C9697a c() {
        return f61625b;
    }

    public static void d(d dVar) {
        f61626c = dVar;
    }
}
