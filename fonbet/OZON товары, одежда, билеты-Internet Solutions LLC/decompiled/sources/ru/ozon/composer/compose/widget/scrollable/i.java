package ru.ozon.composer.compose.widget.scrollable;

import B1.B;
import B1.C;
import android.graphics.Rect;
import jk0.q;
import k1.C7460f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private B f94742a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private q f94743b;

    public i() {
        q qVar;
        qVar = f.f94738a;
        this.f94743b = qVar;
    }

    @Override // ru.ozon.composer.compose.widget.scrollable.h
    public final float a(boolean z11) {
        jk0.l e11 = n.e(this.f94743b);
        B b11 = this.f94742a;
        if (b11 != null) {
            C7460f b12 = C.b(b11);
            if (!b12.x() && !e11.e().isEmpty()) {
                long a11 = b11.a();
                int i11 = ((int) (a11 >> 32)) * ((int) (a11 & 4294967295L));
                if (i11 != 0) {
                    Rect g10 = e11.g();
                    if (z11 || g10.isEmpty()) {
                        g10 = null;
                    }
                    float min = Math.min(b12.h(), e11.e().bottom) - Math.max(b12.q(), g10 != null ? g10.bottom : e11.e().top);
                    if (min < 0.0f) {
                        min = 0.0f;
                    }
                    return kotlin.ranges.h.d((b12.u() * min) / i11, 0.0f, 1.0f);
                }
            }
        }
        return 0.0f;
    }

    @Override // ru.ozon.composer.compose.widget.scrollable.h
    @NotNull
    public final q b() {
        return this.f94743b;
    }

    public final void c(@NotNull B coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f94742a = coordinates;
    }

    public final void d(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.f94743b = qVar;
    }
}
