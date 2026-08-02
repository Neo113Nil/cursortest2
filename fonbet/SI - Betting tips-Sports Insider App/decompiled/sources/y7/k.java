package y7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final w7.g f25701a;

    public k() {
        this.f25701a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e7) {
            w7.g gVar = this.f25701a;
            if (gVar != null) {
                gVar.c(e7);
            }
        }
    }

    public k(w7.g gVar) {
        this.f25701a = gVar;
    }
}
