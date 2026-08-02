package O5;

import Q5.SnapshotContext;
import kotlin.jvm.internal.Intrinsics;
import oh.g;
import r5.C6208b;
import r5.InterfaceC6207a;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public static N5.a f8335b;

    /* renamed from: d, reason: collision with root package name */
    public static long f8337d;

    /* renamed from: e, reason: collision with root package name */
    public static int f8338e;

    /* renamed from: f, reason: collision with root package name */
    public static int f8339f;

    /* renamed from: g, reason: collision with root package name */
    public static int f8340g;

    /* renamed from: a, reason: collision with root package name */
    public static final b f8334a = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC6207a f8336c = new C6208b();

    @Override // O5.a
    public boolean a(g attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (h()) {
            return false;
        }
        boolean z10 = R4.a.e(attributes) || R4.a.k(attributes) || f().a() - f8337d > 60000;
        if (z10) {
            f8337d = f8334a.f().a();
        }
        return z10;
    }

    @Override // O5.a
    public void b() {
        int i10 = f8338e;
        if (i10 > 0) {
            f8338e = i10 - 1;
        } else {
            E5.b.f3006a.a("unregisterError called but errorCount is already 0 - possible double-unregister");
        }
    }

    @Override // O5.a
    public SnapshotContext c() {
        return new SnapshotContext(f8340g, f8338e, f8339f);
    }

    @Override // O5.a
    public void d() {
        f8339f++;
    }

    @Override // O5.a
    public void e() {
        f8338e++;
    }

    public InterfaceC6207a f() {
        return f8336c;
    }

    public final void g(N5.a configurationsManager) {
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        k(configurationsManager);
    }

    public final boolean h() {
        return f8338e == 0 && f8339f == 0 && f8340g == 0;
    }

    public void i(String screenName) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        f8340g++;
    }

    public void j() {
        f8338e = 0;
        f8339f = 0;
        f8340g = 1;
    }

    public void k(N5.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        f8335b = aVar;
    }
}
