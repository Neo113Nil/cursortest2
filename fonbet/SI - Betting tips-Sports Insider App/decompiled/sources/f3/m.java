package f3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.i implements vf.b {

    /* renamed from: b, reason: collision with root package name */
    public int f9397b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f9398c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f9399d;

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f9397b;
        if (i5 == 0) {
            h8.b.B(obj);
            Throwable th2 = this.f9398c;
            long j = this.f9399d;
            e3.x.e().d(o.f9403a, "Cannot check for unfinished work", th2);
            long min = Math.min(j * 30000, o.f9404b);
            this.f9397b = 1;
            if (eg.c0.j(min, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Boolean.TRUE;
    }
}
