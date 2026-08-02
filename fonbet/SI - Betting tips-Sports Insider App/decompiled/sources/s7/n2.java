package s7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f22918b;

    public n2(o2 o2Var, int i5) {
        this.f22917a = i5;
        switch (i5) {
            case 1:
                Objects.requireNonNull(o2Var);
                this.f22918b = o2Var;
                break;
            default:
                Objects.requireNonNull(o2Var);
                this.f22918b = o2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22917a) {
            case 0:
                o2 o2Var = this.f22918b;
                o2Var.f22931e = o2Var.j;
                break;
            default:
                this.f22918b.j = null;
                break;
        }
    }
}
