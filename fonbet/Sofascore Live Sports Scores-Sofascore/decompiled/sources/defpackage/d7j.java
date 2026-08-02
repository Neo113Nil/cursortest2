package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d7j extends of implements nf, pyf {
    public final lcd f;
    public of g;

    public d7j(lcd lcdVar) {
        this.f = lcdVar;
    }

    @Override // defpackage.of
    public final void a() {
        if (this.a != 5) {
            b(zf.j);
            this.d.clear();
            of ofVar = this.g;
            if (ofVar != null) {
                ofVar.a();
            }
        }
    }

    @Override // defpackage.of
    public final float e() {
        of ofVar = this.g;
        return ofVar != null ? ofVar.e() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.of
    public final View f() {
        of ofVar = this.g;
        if (ofVar != null) {
            return ofVar.f();
        }
        return null;
    }

    @Override // defpackage.of
    public final int g() {
        of ofVar = this.g;
        if (ofVar != null) {
            return ofVar.g();
        }
        return 0;
    }

    @Override // defpackage.of
    public final void h() {
        of ofVar = this.g;
        if (ofVar != null) {
            ofVar.h();
        }
    }

    @Override // defpackage.of
    public final void i(int i, Rect rect) {
        rect.getClass();
        of ofVar = this.g;
        if (ofVar != null) {
            rect.getClass();
            ofVar.d(i, rect);
        }
    }

    @Override // defpackage.of
    public final void j(boolean z) {
        of ofVar = this.g;
        if (ofVar != null) {
            ofVar.j(z);
        }
    }

    @Override // defpackage.of
    public final void k(int i) {
        of ofVar = this.g;
        if (ofVar == null) {
            return;
        }
        ofVar.k(i);
    }

    @Override // defpackage.of
    public final void l() {
        of ofVar = this.g;
        if (ofVar != null) {
            ofVar.l();
        }
    }

    @Override // defpackage.of
    public final void m() {
        of ofVar = this.g;
        if (ofVar != null) {
            ofVar.m();
        }
    }

    public final void n(of ofVar) {
        if (Intrinsics.c(this.g, ofVar)) {
            return;
        }
        of ofVar2 = this.g;
        if (ofVar2 != null) {
            ofVar2.d.remove(this);
        }
        this.g = ofVar;
        if (ofVar != null) {
            ofVar.d.add(this);
        }
    }

    @Override // defpackage.nf
    public final void onAdEvent(zf zfVar) {
        zfVar.getClass();
        if (c7j.a[zfVar.ordinal()] == 1) {
            return;
        }
        b(zfVar);
    }

    @Override // defpackage.pyf
    public final void onAdRendered(of ofVar) {
        of ofVar2;
        d7j d7jVar = ofVar instanceof d7j ? (d7j) ofVar : null;
        if (d7jVar != null && (ofVar2 = d7jVar.g) != null) {
            ofVar = ofVar2;
        }
        n(ofVar);
    }
}
