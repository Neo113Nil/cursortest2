package i6;

import i6.s;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f65911a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s.c.a f65912b;

    t(s.c.a aVar, boolean z11) {
        this.f65912b = aVar;
        this.f65911a = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s.c.a aVar = this.f65912b;
        aVar.getClass();
        p6.l.a();
        s.c cVar = s.c.this;
        boolean z11 = cVar.f65906a;
        boolean z12 = this.f65911a;
        cVar.f65906a = z12;
        if (z11 != z12) {
            ((s.b) cVar.f65907b).a(z12);
        }
    }
}
