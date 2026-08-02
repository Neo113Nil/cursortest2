package androidx.compose.ui.node;

import X.i;
import X.r;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: G4, reason: collision with root package name */
    public static final a f17636G4 = a.f17637a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f17637a = new a();
    }

    static /* synthetic */ void b(d dVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        dVar.a(z10);
    }

    static /* synthetic */ void d(d dVar, LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        dVar.c(layoutNode, z10, z11);
    }

    static /* synthetic */ void h(d dVar, LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        dVar.g(layoutNode, z10, z11, z12);
    }

    void a(boolean z10);

    void c(LayoutNode layoutNode, boolean z10, boolean z11);

    long e(long j10);

    void f(LayoutNode layoutNode);

    void g(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12);

    LayoutNode getRoot();

    i getSharedDrawScope();

    boolean getShowLayoutBounds();

    r getSnapshotObserver();
}
