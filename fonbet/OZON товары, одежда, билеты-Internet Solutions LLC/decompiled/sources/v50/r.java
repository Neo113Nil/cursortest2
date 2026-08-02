package v50;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v50.p;

/* loaded from: classes3.dex */
public final class r implements p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f102402a = new r();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f102403b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Handler f102404c = new Handler(Looper.getMainLooper(), new q());

    /* renamed from: d, reason: collision with root package name */
    private static p.b f102405d;

    /* renamed from: e, reason: collision with root package name */
    private static p.b f102406e;

    public static boolean g(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 0) {
            return false;
        }
        Object obj = msg.obj;
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottomsnack.ui.SnackbarManager.SnackbarRecord");
        p.b bVar = (p.b) obj;
        synchronized (f102403b) {
            try {
                if (!Intrinsics.d(f102405d, bVar)) {
                    if (Intrinsics.d(f102406e, bVar)) {
                    }
                    Unit unit = Unit.f71690a;
                }
                h(bVar);
                Unit unit2 = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    private static boolean h(p.b bVar) {
        WeakReference<p.a> d11;
        p.a aVar;
        if (bVar == null || (d11 = bVar.d()) == null || (aVar = d11.get()) == null) {
            return false;
        }
        f102404c.removeCallbacksAndMessages(aVar);
        aVar.dismiss();
        return true;
    }

    private static boolean l(p.a aVar) {
        p.b bVar = f102405d;
        if (bVar != null) {
            return bVar.e(aVar);
        }
        return false;
    }

    private static void n(p.b bVar) {
        Handler handler = f102404c;
        handler.removeCallbacksAndMessages(bVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), bVar != null ? bVar.c() : 2000);
    }

    @Override // v50.p
    public final void a(@NotNull j snack, int i11) {
        p.a aVar;
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102403b) {
            try {
                if (l(snack)) {
                    f102404c.removeCallbacksAndMessages(f102405d);
                    n(f102405d);
                } else {
                    f102406e = new p.b(snack, i11);
                    p.b bVar = f102405d;
                    if (bVar == null || !h(bVar)) {
                        f102405d = null;
                        p.b bVar2 = f102406e;
                        if (bVar2 != null) {
                            f102405d = bVar2;
                            f102406e = null;
                            WeakReference<p.a> d11 = bVar2.d();
                            if (d11 == null || (aVar = d11.get()) == null) {
                                f102405d = null;
                            } else {
                                aVar.show();
                            }
                        }
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v50.p
    public final void b(@NotNull j snack) {
        p.b bVar;
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102403b) {
            try {
                if (l(snack) && (bVar = f102405d) != null && bVar.b()) {
                    p.b bVar2 = f102405d;
                    if (bVar2 != null) {
                        bVar2.g(false);
                    }
                    n(f102405d);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v50.p
    public final void c(@NotNull j snack) {
        Intrinsics.checkNotNullParameter(snack, "snack");
    }

    @Override // v50.p
    public final void d(@NotNull j snack) {
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102403b) {
            try {
                if (l(snack)) {
                    n(f102405d);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v50.p
    public final void e(@NotNull j snack) {
        p.a aVar;
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102403b) {
            try {
                if (l(snack)) {
                    f102405d = null;
                    p.b bVar = f102406e;
                    if (bVar != null && bVar != null) {
                        f102405d = bVar;
                        f102406e = null;
                        WeakReference<p.a> d11 = bVar.d();
                        if (d11 == null || (aVar = d11.get()) == null) {
                            f102405d = null;
                        } else {
                            aVar.show();
                        }
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v50.p
    public final void f(@NotNull j snack) {
        p.b bVar;
        Intrinsics.checkNotNullParameter(snack, "snack");
        synchronized (f102403b) {
            try {
                if (l(snack) && (bVar = f102405d) != null && !bVar.b()) {
                    p.b bVar2 = f102405d;
                    if (bVar2 != null) {
                        bVar2.g(true);
                    }
                    f102404c.removeCallbacksAndMessages(f102405d);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        WeakReference<p.a> d11;
        p.a aVar;
        p.b bVar = f102405d;
        if (bVar == null || (d11 = bVar.d()) == null || (aVar = d11.get()) == null) {
            return;
        }
        aVar.dismiss();
    }

    @NotNull
    public final Set<String> j() {
        WeakReference<p.a> d11;
        p.a aVar;
        String id2;
        WeakReference<p.a> d12;
        p.a aVar2;
        String id3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        p.b bVar = f102405d;
        if (bVar != null && (d12 = bVar.d()) != null && (aVar2 = d12.get()) != null && (id3 = aVar2.getId()) != null) {
            linkedHashSet.add(id3);
        }
        p.b bVar2 = f102406e;
        if (bVar2 != null && (d11 = bVar2.d()) != null && (aVar = d11.get()) != null && (id2 = aVar.getId()) != null) {
            linkedHashSet.add(id2);
        }
        return linkedHashSet;
    }

    public final p.a k(String str) {
        p.b bVar;
        p.b bVar2;
        WeakReference<p.a> d11;
        WeakReference<p.a> d12;
        p.a aVar;
        if (str != null && (bVar = f102405d) != null) {
            if (Intrinsics.d((bVar == null || (d12 = bVar.d()) == null || (aVar = d12.get()) == null) ? null : aVar.getId(), str) && (bVar2 = f102405d) != null && (d11 = bVar2.d()) != null) {
                return d11.get();
            }
        }
        return null;
    }

    public final void m(@NotNull p.a snack) {
        p.b bVar;
        Intrinsics.checkNotNullParameter(snack, "snack");
        if (!l(snack) || (bVar = f102405d) == null || bVar.b()) {
            return;
        }
        f102404c.removeCallbacksAndMessages(f102405d);
        n(f102405d);
    }
}
