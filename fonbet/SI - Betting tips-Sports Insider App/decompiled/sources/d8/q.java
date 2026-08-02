package d8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w7.g f8305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.integrity.e f8306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f8307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c cVar, w7.g gVar, w7.g gVar2, com.google.android.play.core.integrity.e eVar) {
        super(gVar);
        this.f8307d = cVar;
        this.f8305b = gVar2;
        this.f8306c = eVar;
    }

    @Override // d8.o
    public final void b() {
        synchronized (this.f8307d.f8285f) {
            try {
                c cVar = this.f8307d;
                w7.g gVar = this.f8305b;
                cVar.f8284e.add(gVar);
                gVar.f24979a.addOnCompleteListener(new l1.a(11, cVar, gVar, false));
                if (this.f8307d.f8290l.getAndIncrement() > 0) {
                    this.f8307d.f8281b.a("Already connected to the service.", new Object[0]);
                }
                c.b(this.f8307d, this.f8306c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
