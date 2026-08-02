package X;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: f, reason: collision with root package name */
    public final NodeCoordinator f13361f;

    /* renamed from: g, reason: collision with root package name */
    public long f13362g;

    /* renamed from: h, reason: collision with root package name */
    public final V.c f13363h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f13364i;

    public l(NodeCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        this.f13361f = coordinator;
        this.f13362g = e0.g.f45452a.a();
        this.f13363h = new V.c(this);
        this.f13364i = new LinkedHashMap();
    }

    public V.a j() {
        return this.f13363h;
    }

    public final NodeCoordinator k() {
        return this.f13361f;
    }

    public LayoutNode l() {
        return this.f13361f.x();
    }

    public final V.c m() {
        return this.f13363h;
    }

    public long n() {
        return this.f13362g;
    }

    public final long o(l ancestor) {
        Intrinsics.checkNotNullParameter(ancestor, "ancestor");
        long a10 = e0.g.f45452a.a();
        l lVar = this;
        while (!Intrinsics.areEqual(lVar, ancestor)) {
            long n10 = lVar.n();
            a10 = e0.h.a(e0.g.c(a10) + e0.g.c(n10), e0.g.d(a10) + e0.g.d(n10));
            NodeCoordinator D10 = lVar.f13361f.D();
            Intrinsics.checkNotNull(D10);
            lVar = D10.y();
            Intrinsics.checkNotNull(lVar);
        }
        return a10;
    }
}
