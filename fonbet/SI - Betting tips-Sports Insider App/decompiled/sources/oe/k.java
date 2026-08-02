package oe;

import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import eg.t1;
import hg.d1;
import hg.u0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import pd.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f21209b;

    /* renamed from: c, reason: collision with root package name */
    public t1 f21210c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f21211d = new p0();

    /* renamed from: e, reason: collision with root package name */
    public final p0 f21212e = new p0();

    /* renamed from: f, reason: collision with root package name */
    public final p0 f21213f = new p0();

    /* renamed from: g, reason: collision with root package name */
    public final p0 f21214g = new p0();

    /* renamed from: h, reason: collision with root package name */
    public final p0 f21215h = new p0();

    /* renamed from: i, reason: collision with root package name */
    public final p0 f21216i = new p0();
    public final d1 j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f21217k;

    public k() {
        Boolean bool = Boolean.FALSE;
        this.j = u0.b(bool);
        this.f21217k = u0.b(bool);
    }

    public static void e(androidx.fragment.app.p0 activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        gf.k.b(new v(9));
        if (activity == null) {
            return;
        }
        try {
            String packageName = activity.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            Runtime.getRuntime().exec("pm clear " + packageName);
        } catch (Exception e7) {
            zc.d.b(6, null, e7);
        }
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        t1 t1Var = this.f21210c;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f21210c = null;
    }
}
