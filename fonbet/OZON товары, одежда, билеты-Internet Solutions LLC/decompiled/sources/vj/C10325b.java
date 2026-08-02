package vj;

import De.C2862e;
import Ej.p;
import Je.d;
import Je.e;
import Sc.InterfaceC4008j;
import Sc.k;
import We.L;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.core.content.FileProvider;
import bd.h;
import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import wj.C10565a;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.N;
import xe.X0;

/* renamed from: vj.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10325b {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f103002g = new a();

    /* renamed from: h, reason: collision with root package name */
    private static volatile C10325b f103003h;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f103004a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10324a f103005b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C10565a f103006c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2862e f103007d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final d f103008e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f103009f;

    /* renamed from: vj.b$a */
    public static final class a {
        @NotNull
        public static Uri a() {
            Uri a11;
            C10325b c10325b = C10325b.f103003h;
            if (c10325b == null || (a11 = C10325b.a(c10325b)) == null) {
                throw new IllegalStateException("Error OzonHarLogger is not initialized, you need to call OzonHarLogger.init()");
            }
            return a11;
        }
    }

    /* renamed from: vj.b$b, reason: collision with other inner class name */
    static final class C2234b extends AbstractC7737t implements Function0<SharedPreferences> {
        C2234b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return C10325b.this.f103004a.getSharedPreferences("OZON_HAR_LOGGER_PREF", 0);
        }
    }

    /* renamed from: vj.b$c */
    public static final class c extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            p.c(message, th2);
        }
    }

    public C10325b(Application application, C10324a c10324a, C10565a c10565a) {
        this.f103004a = application;
        this.f103005b = c10324a;
        this.f103006c = c10565a;
        c cVar = new c(J.f105405n0);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f103007d = N.a(He.b.f10879b.plus(X0.b()).plus(cVar));
        this.f103008e = e.a();
        this.f103009f = k.b(new C2234b());
    }

    public static final Uri a(C10325b c10325b) {
        C10324a c10324a = c10325b.f103005b;
        Application application = c10325b.f103004a;
        File b11 = wj.b.b(application, c10324a);
        h.o(b11, c10325b.f103006c.a(), Charsets.UTF_8);
        Uri d11 = FileProvider.d(application, application.getPackageName() + ".android.harLogger.internal.LogHarRequestsFileProvider", b11);
        Intrinsics.checkNotNullExpressionValue(d11, "getUriForFile(...)");
        return d11;
    }

    public static final boolean g(C10325b c10325b) {
        return ((SharedPreferences) c10325b.f103009f.getValue()).getBoolean("har_logger_enabled", false);
    }

    public static final void i(C10325b c10325b, boolean z11) {
        ((SharedPreferences) c10325b.f103009f.getValue()).edit().putBoolean("har_logger_enabled", z11).apply();
    }

    public static final void j(C10325b c10325b, L l11) {
        if (((SharedPreferences) c10325b.f103009f.getValue()).getBoolean("har_logger_enabled", false)) {
            C10727i.c(c10325b.f103007d, null, null, new vj.c(l11, l11.y(Long.MAX_VALUE), c10325b, null), 3);
        }
    }
}
