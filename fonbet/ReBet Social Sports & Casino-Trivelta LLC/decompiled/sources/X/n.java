package X;

import J.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f13367a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.node.a f13368b;

    /* renamed from: c, reason: collision with root package name */
    public NodeCoordinator f13369c;

    /* renamed from: d, reason: collision with root package name */
    public final a.b f13370d;

    /* renamed from: e, reason: collision with root package name */
    public a.b f13371e;

    /* renamed from: f, reason: collision with root package name */
    public C.a f13372f;

    public n(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f13367a = layoutNode;
        androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a(layoutNode);
        this.f13368b = aVar;
        this.f13369c = aVar;
        t C10 = aVar.C();
        this.f13370d = C10;
        this.f13371e = C10;
    }

    public final int b() {
        return this.f13371e.b();
    }

    public final a.b c() {
        return this.f13371e;
    }

    public final androidx.compose.ui.node.a d() {
        return this.f13368b;
    }

    public final List e() {
        C.a aVar = this.f13372f;
        if (aVar == null) {
            return CollectionsKt.emptyList();
        }
        int i10 = 0;
        C.a aVar2 = new C.a(new V.f[aVar.l()], 0);
        a.b c10 = c();
        while (c10 != null && c10 != g()) {
            NodeCoordinator d10 = c10.d();
            if (d10 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            d10.w();
            this.f13368b.w();
            a.b c11 = c10.c();
            if (c11 == this.f13370d) {
                c10.d();
                c11.d();
            }
            aVar2.b(new V.f((J.a) aVar.k()[i10], d10, null));
            c10 = c10.c();
            i10++;
        }
        return aVar2.f();
    }

    public final NodeCoordinator f() {
        return this.f13369c;
    }

    public final a.b g() {
        return this.f13370d;
    }

    public final boolean h(int i10) {
        return (i10 & b()) != 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.f13371e != this.f13370d) {
            a.b c10 = c();
            while (true) {
                if (c10 == null || c10 == g()) {
                    break;
                }
                sb2.append(String.valueOf(c10));
                if (c10.c() == this.f13370d) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                c10 = c10.c();
            }
        } else {
            sb2.append("]");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
