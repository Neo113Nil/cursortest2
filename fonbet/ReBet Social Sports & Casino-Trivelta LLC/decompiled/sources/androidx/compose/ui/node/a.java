package androidx.compose.ui.node;

import N.e;
import N.l;
import N.m;
import X.j;
import X.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends NodeCoordinator {

    /* renamed from: A, reason: collision with root package name */
    public static final C0347a f17612A = new C0347a(null);

    /* renamed from: B, reason: collision with root package name */
    public static final l f17613B;

    /* renamed from: y, reason: collision with root package name */
    public final t f17614y;

    /* renamed from: z, reason: collision with root package name */
    public X.l f17615z;

    /* renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    public static final class C0347a {
        public /* synthetic */ C0347a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0347a() {
        }
    }

    public final class b extends X.l {
        public b() {
            super(a.this);
        }
    }

    static {
        l a10 = N.b.a();
        a10.a(e.f7800a.b());
        a10.c(1.0f);
        a10.b(m.f7834a.a());
        f17613B = a10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f17614y = new t();
        C().i(this);
        this.f17615z = layoutNode.getLookaheadRoot() != null ? new b() : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void M(N.d canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        d b10 = j.b(x());
        C.a x10 = x().x();
        int l10 = x10.l();
        if (l10 > 0) {
            Object[] k10 = x10.k();
            int i10 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) k10[i10];
                if (layoutNode.B()) {
                    layoutNode.c(canvas);
                }
                i10++;
            } while (i10 < l10);
        }
        if (b10.getShowLayoutBounds()) {
            q(canvas, f17613B);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public t C() {
        return this.f17614y;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public X.l y() {
        return this.f17615z;
    }
}
