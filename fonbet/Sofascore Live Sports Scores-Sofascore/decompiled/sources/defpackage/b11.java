package defpackage;

import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b11 implements rq4 {
    public final /* synthetic */ u11 a;

    public b11(u11 u11Var) {
        this.a = u11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0017, code lost:
    
        if (defpackage.mz1.C() == false) goto L8;
     */
    @Override // defpackage.rq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        u11 u11Var = this.a;
        if (u11Var.k != e6b.e || u11Var.f() != null) {
            ia0 ia0Var = ia0.q;
        }
        u11Var.j = true;
        AdType.Banner banner = u11Var.t;
        if (banner != null) {
            u11Var.j(banner);
        }
        AdManagerAdView adManagerAdView = u11Var.l;
        if (adManagerAdView != null) {
            adManagerAdView.resume();
        }
        u11Var.l(false);
        ViewGroup f = u11Var.f();
        if (f != null) {
            u11Var.r(f);
        }
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        u11 u11Var = this.a;
        u11Var.h();
        AdManagerAdView adManagerAdView = u11Var.l;
        if (adManagerAdView != null) {
            adManagerAdView.pause();
        }
        u11Var.l(true);
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        u11 u11Var = this.a;
        u11Var.c.getLifecycle().d(this);
        u11Var.c();
    }

    @Override // defpackage.rq4
    public final void onStart(u6b u6bVar) {
        u6bVar.getClass();
        u11 u11Var = this.a;
        if (u11Var.k != e6b.d || u11Var.f() != null) {
            ia0 ia0Var = ia0.q;
            if (mz1.C()) {
                return;
            }
        }
        u11Var.j = true;
        AdType.Banner banner = u11Var.t;
        if (banner != null) {
            u11Var.j(banner);
        }
    }
}
