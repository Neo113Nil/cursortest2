package x1;

import D1.C2822w;
import D1.C2823x;
import androidx.compose.ui.platform.AndroidComposeView;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D1.H f104814a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10632g f104815b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y f104816c = new y();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2822w f104817d = new C2822w();

    /* renamed from: e, reason: collision with root package name */
    private boolean f104818e;

    public B(@NotNull D1.H h11) {
        this.f104814a = h11;
        this.f104815b = new C10632g((C2823x) h11.D());
    }

    public final void a() {
        this.f104815b.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(@NotNull z zVar, @NotNull AndroidComposeView androidComposeView, boolean z11) {
        Object[] objArr;
        C10632g c10632g;
        int i11;
        C2822w c2822w = this.f104817d;
        if (this.f104818e) {
            return 0;
        }
        try {
            this.f104818e = true;
            C10633h b11 = this.f104816c.b(zVar, androidComposeView);
            int h11 = b11.b().h();
            for (int i12 = 0; i12 < h11; i12++) {
                x i13 = b11.b().i(i12);
                if (!i13.g() && !i13.j()) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int h12 = b11.b().h();
            int i14 = 0;
            while (true) {
                c10632g = this.f104815b;
                if (i14 >= h12) {
                    break;
                }
                x i15 = b11.b().i(i14);
                if (objArr != false || C10639n.a(i15)) {
                    boolean z12 = i15.l() == 1;
                    D1.H h13 = this.f104814a;
                    long f7 = i15.f();
                    C2822w c2822w2 = this.f104817d;
                    int i16 = D1.H.f5237N;
                    h13.p0(f7, c2822w2, z12, true);
                    if (!c2822w.isEmpty()) {
                        c10632g.a(i15.d(), c2822w, C10639n.a(i15));
                        c2822w.clear();
                    }
                }
                i14++;
            }
            c10632g.e();
            boolean c11 = c10632g.c(b11, z11);
            if (!b11.d()) {
                int h14 = b11.b().h();
                for (int i17 = 0; i17 < h14; i17++) {
                    x i18 = b11.b().i(i17);
                    if (C10639n.j(i18) && i18.n()) {
                        i11 = 2;
                        break;
                    }
                }
            }
            i11 = 0;
            int i19 = i11 | (c11 ? 1 : 0);
            this.f104818e = false;
            return i19;
        } catch (Throwable th2) {
            this.f104818e = false;
            throw th2;
        }
    }

    public final void c() {
        if (this.f104818e) {
            return;
        }
        this.f104816c.a();
        this.f104815b.d();
    }
}
