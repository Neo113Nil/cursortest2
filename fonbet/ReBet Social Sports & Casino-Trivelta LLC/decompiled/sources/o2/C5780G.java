package o2;

import H1.AbstractC1173f;
import androidx.media3.common.a;
import e1.AbstractC4134a;
import f1.C4233k;
import java.util.List;
import o2.L;

/* renamed from: o2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5780G {

    /* renamed from: a, reason: collision with root package name */
    public final List f58935a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58936b;

    /* renamed from: c, reason: collision with root package name */
    public final C4233k f58937c = new C4233k(new C4233k.b() { // from class: o2.F
        @Override // f1.C4233k.b
        public final void a(long j10, e1.J j11) {
            AbstractC1173f.a(j10, j11, C5780G.this.outputs);
        }
    });
    private final H1.O[] outputs;

    public C5780G(List list, String str) {
        this.f58935a = list;
        this.f58936b = str;
        this.outputs = new H1.O[list.size()];
    }

    public void b() {
        this.f58937c.d();
    }

    public void c(long j10, e1.J j11) {
        this.f58937c.a(j10, j11);
    }

    public void d(H1.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.outputs.length; i10++) {
            dVar.a();
            H1.O c10 = rVar.c(dVar.c(), 3);
            androidx.media3.common.a aVar = (androidx.media3.common.a) this.f58935a.get(i10);
            String str = aVar.f20543o;
            AbstractC4134a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = aVar.f20529a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            c10.c(new a.b().j0(str2).W(this.f58936b).y0(str).A0(aVar.f20533e).n0(aVar.f20532d).Q(aVar.f20523K).k0(aVar.f20546r).P());
            this.outputs[i10] = c10;
        }
    }

    public void e() {
        this.f58937c.d();
    }

    public void f(int i10) {
        this.f58937c.g(i10);
    }
}
