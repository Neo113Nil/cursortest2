package androidx.appcompat.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l4 extends y4.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f812b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f813c;

    /* renamed from: d, reason: collision with root package name */
    public int f814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f815e;

    public l4(m4 m4Var, int i5) {
        this.f812b = 0;
        this.f815e = m4Var;
        this.f814d = i5;
        this.f813c = false;
    }

    @Override // y4.a, androidx.core.view.h1
    public final void a() {
        switch (this.f812b) {
            case 0:
                ((m4) this.f815e).f821a.setVisibility(0);
                break;
            default:
                if (!this.f813c) {
                    this.f813c = true;
                    androidx.core.view.h1 h1Var = ((n.j) this.f815e).f20811d;
                    if (h1Var != null) {
                        h1Var.a();
                        break;
                    }
                }
                break;
        }
    }

    @Override // y4.a, androidx.core.view.h1
    public void onAnimationCancel() {
        switch (this.f812b) {
            case 0:
                this.f813c = true;
                break;
        }
    }

    @Override // androidx.core.view.h1
    public final void onAnimationEnd() {
        switch (this.f812b) {
            case 0:
                if (!this.f813c) {
                    ((m4) this.f815e).f821a.setVisibility(this.f814d);
                    break;
                }
                break;
            default:
                int i5 = this.f814d + 1;
                this.f814d = i5;
                n.j jVar = (n.j) this.f815e;
                if (i5 == jVar.f20808a.size()) {
                    androidx.core.view.h1 h1Var = jVar.f20811d;
                    if (h1Var != null) {
                        h1Var.onAnimationEnd();
                    }
                    this.f814d = 0;
                    this.f813c = false;
                    jVar.f20812e = false;
                    break;
                }
                break;
        }
    }

    public l4(n.j jVar) {
        this.f812b = 1;
        this.f815e = jVar;
        this.f813c = false;
        this.f814d = 0;
    }
}
