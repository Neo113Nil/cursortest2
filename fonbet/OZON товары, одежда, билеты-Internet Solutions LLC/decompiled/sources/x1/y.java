package x1;

import androidx.collection.C5153w;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5153w<a> f104926a = new C5153w<>((Object) null);

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f104927a;

        /* renamed from: b, reason: collision with root package name */
        private final long f104928b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f104929c;

        public a(long j11, long j12, boolean z11) {
            this.f104927a = j11;
            this.f104928b = j12;
            this.f104929c = z11;
        }

        public final boolean a() {
            return this.f104929c;
        }

        public final long b() {
            return this.f104928b;
        }

        public final long c() {
            return this.f104927a;
        }
    }

    public final void a() {
        this.f104926a.a();
    }

    @NotNull
    public final C10633h b(@NotNull z zVar, @NotNull AndroidComposeView androidComposeView) {
        boolean a11;
        long j11;
        long P02;
        C5153w c5153w = new C5153w(((ArrayList) zVar.b()).size());
        ArrayList arrayList = (ArrayList) zVar.b();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C10625A c10625a = (C10625A) arrayList.get(i11);
            long d11 = c10625a.d();
            C5153w<a> c5153w2 = this.f104926a;
            a b11 = c5153w2.b(d11);
            if (b11 == null) {
                a11 = false;
                j11 = c10625a.k();
                P02 = c10625a.f();
            } else {
                long c11 = b11.c();
                a11 = b11.a();
                j11 = c11;
                P02 = androidComposeView.P0(b11.b());
            }
            c5153w.f(c10625a.d(), new x(c10625a.d(), c10625a.k(), c10625a.f(), c10625a.b(), c10625a.h(), j11, P02, a11, c10625a.j(), c10625a.c(), c10625a.i(), c10625a.e()));
            if (c10625a.b()) {
                c5153w2.f(c10625a.d(), new a(c10625a.k(), c10625a.g(), c10625a.b()));
            } else {
                c5153w2.g(c10625a.d());
            }
        }
        return new C10633h(c5153w, zVar);
    }
}
