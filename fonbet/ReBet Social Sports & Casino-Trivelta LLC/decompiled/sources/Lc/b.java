package Lc;

import com.swmansion.rnscreens.C3834z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7139a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7140b;

    public final void a(C3834z screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f7140b = true;
        c(screen);
    }

    public final void b(C3834z screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f7139a = true;
        c(screen);
    }

    public final void c(C3834z c3834z) {
        if (this.f7139a && this.f7140b) {
            c3834z.A();
            c3834z.F();
        }
    }
}
