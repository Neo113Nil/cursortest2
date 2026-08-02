package o2;

import H1.AbstractC1173f;
import androidx.media3.common.a;
import e1.AbstractC4134a;
import f1.C4233k;
import java.util.List;
import o2.L;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final List f58992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58993b;

    /* renamed from: c, reason: collision with root package name */
    public final C4233k f58994c;
    private final H1.O[] outputs;

    public O(List list, String str) {
        this.f58992a = list;
        this.f58993b = str;
        this.outputs = new H1.O[list.size()];
        C4233k c4233k = new C4233k(new C4233k.b() { // from class: o2.N
            @Override // f1.C4233k.b
            public final void a(long j10, e1.J j11) {
                AbstractC1173f.b(j10, j11, O.this.outputs);
            }
        });
        this.f58994c = c4233k;
        c4233k.g(3);
    }

    public void b(long j10, e1.J j11) {
        if (j11.a() < 9) {
            return;
        }
        int v10 = j11.v();
        int v11 = j11.v();
        int M10 = j11.M();
        if (v10 == 434 && v11 == 1195456820 && M10 == 3) {
            this.f58994c.a(j10, j11);
        }
    }

    public void c(H1.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.outputs.length; i10++) {
            dVar.a();
            H1.O c10 = rVar.c(dVar.c(), 3);
            androidx.media3.common.a aVar = (androidx.media3.common.a) this.f58992a.get(i10);
            String str = aVar.f20543o;
            AbstractC4134a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            c10.c(new a.b().j0(dVar.b()).W(this.f58993b).y0(str).A0(aVar.f20533e).n0(aVar.f20532d).Q(aVar.f20523K).k0(aVar.f20546r).P());
            this.outputs[i10] = c10;
        }
    }
}
