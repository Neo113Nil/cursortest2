package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ib6 extends hb6 {
    public final TextView g;
    public final AppCompatTextView h;
    public final AppCompatTextView i;
    public final TextView j;
    public final TextView k;
    public final CircularProgressIndicator l;
    public final CircularProgressIndicator m;
    public final ConstraintLayout n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ib6(nb6 nb6Var, djf djfVar, String str, bb6 bb6Var) {
        super(nb6Var, r0, str, bb6Var);
        str.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) djfVar.b;
        constraintLayout.getClass();
        this.g = (TextView) djfVar.g;
        this.h = (AppCompatTextView) djfVar.f;
        this.i = (AppCompatTextView) djfVar.e;
        z3f z3fVar = (z3f) djfVar.d;
        this.j = (TextView) z3fVar.d;
        z3f z3fVar2 = (z3f) djfVar.c;
        this.k = (TextView) z3fVar2.d;
        this.l = (CircularProgressIndicator) z3fVar.c;
        this.m = (CircularProgressIndicator) z3fVar2.c;
        constraintLayout.getClass();
        this.n = constraintLayout;
    }

    @Override // defpackage.hb6
    public final ConstraintLayout d() {
        return this.n;
    }

    @Override // defpackage.hb6
    public final TextView e() {
        return this.g;
    }

    @Override // defpackage.hb6
    public final TextView f() {
        return this.k;
    }

    @Override // defpackage.hb6
    public final TextView g() {
        return this.j;
    }

    @Override // defpackage.hb6
    public final CircularProgressIndicator h() {
        return this.m;
    }

    @Override // defpackage.hb6
    public final CircularProgressIndicator i() {
        return this.l;
    }

    @Override // defpackage.hb6
    public final TextView j() {
        return this.i;
    }

    @Override // defpackage.hb6
    public final TextView k() {
        return this.h;
    }
}
