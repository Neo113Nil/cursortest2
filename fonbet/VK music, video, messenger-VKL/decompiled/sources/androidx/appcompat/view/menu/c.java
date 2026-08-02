package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.b;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes11.dex */
public final class c implements Runnable {
    public final /* synthetic */ b.d b;
    public final /* synthetic */ h c;
    public final /* synthetic */ f d;
    public final /* synthetic */ b.c e;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.e = cVar;
        this.b = dVar;
        this.c = hVar;
        this.d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = b.this;
        b.d dVar = this.b;
        if (dVar != null) {
            bVar.A = true;
            dVar.b.c(false);
            bVar.A = false;
        }
        h hVar = this.c;
        if (hVar.isEnabled() && hVar.hasSubMenu()) {
            this.d.q(hVar, null, 4);
        }
    }
}
