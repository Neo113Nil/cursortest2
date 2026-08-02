package pe;

import android.content.res.Resources;
import android.os.Parcelable;
import androidx.lifecycle.k1;
import eg.c0;
import eg.m0;
import eg.t1;
import eg.y;
import hg.d1;
import hg.u0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final id.c f21833b = new id.c(0);

    /* renamed from: c, reason: collision with root package name */
    public final d1 f21834c = u0.b(Boolean.FALSE);

    /* renamed from: d, reason: collision with root package name */
    public final d1 f21835d = u0.b(null);

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f21836e;

    /* renamed from: f, reason: collision with root package name */
    public t1 f21837f;

    /* renamed from: g, reason: collision with root package name */
    public final CoroutineContext f21838g;

    /* renamed from: h, reason: collision with root package name */
    public final t f21839h;

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f21840i;

    public f() {
        y yVar = new y("FollowViewModel");
        lg.e eVar = m0.f9201a;
        CoroutineContext c2 = kotlin.coroutines.e.c(yVar, jg.q.f18523a);
        this.f21836e = c2;
        this.f21838g = kotlin.coroutines.e.c(new y("room_observer_follow"), lg.d.f20063c);
        this.f21839h = new t(wf.b.b((Resources.getSystem().getDisplayMetrics().densityDpi / 160.0f) * 15));
        c0.t(androidx.lifecycle.d1.i(this), c2.t(zc.a.f25907a), null, new androidx.lifecycle.b(this, (Continuation) null, 20), 2);
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        t1 t1Var = this.f21837f;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f21837f = null;
        this.f21840i = null;
    }
}
