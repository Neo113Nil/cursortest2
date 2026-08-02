package J;

import X.c;
import androidx.compose.ui.node.NodeCoordinator;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0126a f5865a = C0126a.f5866b;

    /* renamed from: J.a$a, reason: collision with other inner class name */
    public static final class C0126a implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C0126a f5866b = new C0126a();

        public String toString() {
            return "Modifier";
        }
    }

    public static abstract class b implements c {

        /* renamed from: b, reason: collision with root package name */
        public int f5868b;

        /* renamed from: d, reason: collision with root package name */
        public b f5870d;

        /* renamed from: e, reason: collision with root package name */
        public b f5871e;

        /* renamed from: f, reason: collision with root package name */
        public NodeCoordinator f5872f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f5873g;

        /* renamed from: a, reason: collision with root package name */
        public b f5867a = this;

        /* renamed from: c, reason: collision with root package name */
        public int f5869c = -1;

        @Override // X.c
        public final b a() {
            return this.f5867a;
        }

        public final int b() {
            return this.f5869c;
        }

        public final b c() {
            return this.f5871e;
        }

        public final NodeCoordinator d() {
            return this.f5872f;
        }

        public final int e() {
            return this.f5868b;
        }

        public final b f() {
            return this.f5870d;
        }

        public final boolean g() {
            return this.f5873g;
        }

        public final void h(int i10) {
            this.f5869c = i10;
        }

        public void i(NodeCoordinator nodeCoordinator) {
            this.f5872f = nodeCoordinator;
        }
    }
}
