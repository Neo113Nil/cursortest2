package r4;

import android.view.ViewTreeObserver;
import gf.o;
import gf.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f22314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f22315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg.l f22316d;

    public m(f fVar, ViewTreeObserver viewTreeObserver, eg.l lVar) {
        this.f22314b = fVar;
        this.f22315c = viewTreeObserver;
        this.f22316d = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f22314b;
        i b10 = k.b(fVar);
        if (b10 != null) {
            ViewTreeObserver viewTreeObserver = this.f22315c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                fVar.f22297b.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f22313a) {
                this.f22313a = true;
                o oVar = q.f10031a;
                this.f22316d.resumeWith(b10);
            }
        }
        return true;
    }
}
