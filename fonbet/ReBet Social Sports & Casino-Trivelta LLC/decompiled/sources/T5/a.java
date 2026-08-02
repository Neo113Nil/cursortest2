package T5;

import E5.b;
import Q4.q;
import Q4.s;
import U5.f;
import a6.C1921a;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10956a = new a();

    public void a() {
        f.f12066a.t();
    }

    public void b(Context context, C1921a options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        if (c()) {
            return;
        }
        if (g(options)) {
            f.f12066a.y(context, options);
        } else {
            b.f3006a.a("SessionReplay.initialize skipped");
        }
    }

    public boolean c() {
        return f.f12066a.z();
    }

    public boolean d() {
        return f.f12066a.A();
    }

    public final void e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(s.f9356b, Boolean.TRUE);
    }

    public final boolean f(C1921a c1921a) {
        boolean z10 = RangesKt.random(new IntRange(0, 100), Random.INSTANCE) > c1921a.h();
        b.f3006a.a("Dropping session: " + z10);
        return z10;
    }

    public final boolean g(C1921a c1921a) {
        return q.f9352a.z() && !f(c1921a);
    }

    public void h() {
        if (c()) {
            f.f12066a.F();
        }
    }

    public void i() {
        f.f12066a.G();
    }

    public void j() {
        f.f12066a.J();
    }
}
