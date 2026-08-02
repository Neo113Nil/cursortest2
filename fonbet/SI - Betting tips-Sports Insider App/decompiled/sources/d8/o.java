package d8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final w7.g f8302a;

    public o() {
        this.f8302a = null;
    }

    public void a(Exception exc) {
        w7.g gVar = this.f8302a;
        if (gVar != null) {
            gVar.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e7) {
            a(e7);
        }
    }

    public o(w7.g gVar) {
        this.f8302a = gVar;
    }
}
