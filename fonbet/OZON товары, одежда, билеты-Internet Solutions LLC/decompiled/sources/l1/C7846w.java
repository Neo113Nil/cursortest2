package l1;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import p1.C8830a;

/* renamed from: l1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7846w implements InterfaceC7823h0 {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f72285d = true;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f72286a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f72287b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private C8830a f72288c;

    /* renamed from: l1.w$a */
    private static final class a {
        public static final long a(@NotNull View view) {
            long uniqueDrawingId;
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    public C7846w(@NotNull AndroidComposeView androidComposeView) {
        this.f72286a = androidComposeView;
    }

    @Override // l1.InterfaceC7823h0
    @NotNull
    public final o1.d a() {
        o1.e kVar;
        o1.d dVar;
        synchronized (this.f72287b) {
            try {
                AndroidComposeView androidComposeView = this.f72286a;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    a.a(androidComposeView);
                }
                if (i11 >= 29) {
                    kVar = new o1.j();
                } else if (f72285d) {
                    try {
                        kVar = new o1.f(this.f72286a);
                    } catch (Throwable unused) {
                        f72285d = false;
                        AndroidComposeView androidComposeView2 = this.f72286a;
                        C8830a c8830a = this.f72288c;
                        if (c8830a == null) {
                            C8830a c8830a2 = new C8830a(androidComposeView2.getContext());
                            androidComposeView2.addView(c8830a2, -1);
                            this.f72288c = c8830a2;
                            c8830a = c8830a2;
                        }
                        kVar = new o1.k(c8830a);
                    }
                } else {
                    AndroidComposeView androidComposeView3 = this.f72286a;
                    C8830a c8830a3 = this.f72288c;
                    if (c8830a3 == null) {
                        C8830a c8830a4 = new C8830a(androidComposeView3.getContext());
                        androidComposeView3.addView(c8830a4, -1);
                        this.f72288c = c8830a4;
                        c8830a3 = c8830a4;
                    }
                    kVar = new o1.k(c8830a3);
                }
                dVar = new o1.d(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // l1.InterfaceC7823h0
    public final void b(@NotNull o1.d dVar) {
        synchronized (this.f72287b) {
            dVar.y();
            Unit unit = Unit.f71690a;
        }
    }
}
