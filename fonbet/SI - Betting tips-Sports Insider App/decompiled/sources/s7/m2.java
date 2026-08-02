package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f22881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f22882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22883c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o2 f22885e;

    public m2(o2 o2Var, l2 l2Var, l2 l2Var2, long j, boolean z5) {
        this.f22881a = l2Var;
        this.f22882b = l2Var2;
        this.f22883c = j;
        this.f22884d = z5;
        this.f22885e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22885e.t(this.f22881a, this.f22882b, this.f22883c, this.f22884d, null);
    }
}
