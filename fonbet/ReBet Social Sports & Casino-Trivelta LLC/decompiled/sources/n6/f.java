package n6;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import n6.h;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f57022a = new f();

    public static final void d(Context context) {
        h.b bVar;
        h c10;
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (m.a("com.android.billingclient.api.Purchase") == null || (c10 = (bVar = h.f57025s).c(context)) == null || !bVar.f().get()) {
                return;
            }
            if (j.d()) {
                c10.p("inapp", new Runnable() { // from class: n6.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.e();
                    }
                });
            } else {
                c10.o("inapp", new Runnable() { // from class: n6.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.f();
                    }
                });
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public static final void e() {
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            f57022a.c();
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public static final void f() {
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            f57022a.c();
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public final void c() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            j jVar = j.f57059a;
            h.b bVar = h.f57025s;
            j.e(bVar.d(), bVar.e());
            bVar.d().clear();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
