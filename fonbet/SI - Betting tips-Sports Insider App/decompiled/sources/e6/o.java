package e6;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f8734a;

    public o(e eVar) {
        this.f8734a = eVar;
    }

    @Override // e6.b
    public final void a(boolean z5) {
        Boolean valueOf = Boolean.valueOf(z5);
        e eVar = this.f8734a;
        eVar.f8705n.sendMessage(eVar.f8705n.obtainMessage(1, valueOf));
    }
}
