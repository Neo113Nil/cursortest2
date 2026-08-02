package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eb6 extends hb6 {
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final CircularProgressIndicator j;
    public final CircularProgressIndicator k;
    public final ConstraintLayout l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb6(nb6 nb6Var, djf djfVar, String str, bb6 bb6Var) {
        super(nb6Var, r0, str, bb6Var);
        str.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) djfVar.b;
        constraintLayout.getClass();
        this.g = (TextView) djfVar.g;
        this.h = (TextView) djfVar.d;
        this.i = (TextView) djfVar.c;
        this.j = (CircularProgressIndicator) djfVar.f;
        this.k = (CircularProgressIndicator) djfVar.e;
        constraintLayout.getClass();
        this.l = constraintLayout;
    }

    @Override // defpackage.hb6
    public final ConstraintLayout d() {
        return this.l;
    }

    @Override // defpackage.hb6
    public final TextView e() {
        return this.g;
    }

    @Override // defpackage.hb6
    public final TextView f() {
        return this.i;
    }

    @Override // defpackage.hb6
    public final TextView g() {
        return this.h;
    }

    @Override // defpackage.hb6
    public final CircularProgressIndicator h() {
        return this.k;
    }

    @Override // defpackage.hb6
    public final CircularProgressIndicator i() {
        return this.j;
    }

    @Override // defpackage.hb6
    public final TextView j() {
        return null;
    }

    @Override // defpackage.hb6
    public final TextView k() {
        return null;
    }
}
