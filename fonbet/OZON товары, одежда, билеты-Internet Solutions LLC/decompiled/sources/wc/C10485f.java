package wc;

/* renamed from: wc.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10485f<R> extends Fc.f implements io.reactivex.j<R> {

    /* renamed from: i, reason: collision with root package name */
    final AbstractC10482c f103932i;

    /* renamed from: j, reason: collision with root package name */
    long f103933j;

    C10485f(AbstractC10482c abstractC10482c) {
        super(false);
        this.f103932i = abstractC10482c;
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        long j11 = this.f103933j;
        if (j11 != 0) {
            this.f103933j = 0L;
            f(j11);
        }
        AbstractC10482c abstractC10482c = this.f103932i;
        abstractC10482c.f103926k = false;
        abstractC10482c.e();
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        long j11 = this.f103933j;
        if (j11 != 0) {
            this.f103933j = 0L;
            f(j11);
        }
        this.f103932i.a(th2);
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(R r11) {
        this.f103933j++;
        this.f103932i.b(r11);
    }
}
