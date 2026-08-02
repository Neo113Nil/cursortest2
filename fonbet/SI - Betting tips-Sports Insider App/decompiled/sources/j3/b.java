package j3;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import m3.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final k3.f f18250a;

    public b(k3.f tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f18250a = tracker;
    }

    @Override // j3.d
    public final hg.c a(e3.f constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return new hg.c(new androidx.lifecycle.c(this, (Continuation) null, 23), g.f19227a, -2, gg.a.f10048a);
    }

    @Override // j3.d
    public final boolean c(o workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return b(workSpec) && e(this.f18250a.a());
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
