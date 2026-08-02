package t3;

import A3.b;
import B3.C2566j;
import L3.C3571k;
import L3.K;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.j0;
import java.util.ArrayList;
import v3.C10201C;

/* renamed from: t3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9740f implements G {

    /* renamed from: a, reason: collision with root package name */
    private final Context f99030a;

    /* renamed from: b, reason: collision with root package name */
    private final C2566j f99031b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f99032c;

    public C9740f(Context context) {
        this.f99030a = context;
        this.f99031b = new C2566j(context);
    }

    @Override // t3.G
    public final j0[] a(Handler handler, K k11, v3.o oVar, H3.g gVar, C3.b bVar) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f99032c;
        Context context = this.f99030a;
        C3571k.c cVar = new C3571k.c(context);
        C2566j c2566j = this.f99031b;
        cVar.j(c2566j);
        cVar.i();
        cVar.k(z11);
        cVar.l(handler);
        cVar.m(k11);
        cVar.n();
        arrayList.add(cVar.h());
        C10201C g10 = new C10201C.d(context).g();
        arrayList.add(new v3.J(this.f99030a, c2566j, this.f99032c, handler, oVar, g10));
        arrayList.add(new H3.h(gVar, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new C3.c(bVar, looper));
        arrayList.add(new C3.c(bVar, looper));
        arrayList.add(new M3.b());
        arrayList.add(new A3.f(new b.a(context)));
        return (j0[]) arrayList.toArray(new j0[0]);
    }

    @Override // t3.G
    public final void b(j0 j0Var) {
        j0Var.getClass();
    }

    public final void c() {
        this.f99032c = true;
    }
}
