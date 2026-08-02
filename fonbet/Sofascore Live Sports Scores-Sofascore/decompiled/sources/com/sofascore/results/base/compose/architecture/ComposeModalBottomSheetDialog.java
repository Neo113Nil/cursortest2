package com.sofascore.results.base.compose.architecture;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.a99;
import defpackage.av8;
import defpackage.cyb;
import defpackage.eqf;
import defpackage.g2;
import defpackage.he3;
import defpackage.hz8;
import defpackage.ie3;
import defpackage.ksa;
import defpackage.nf3;
import defpackage.of3;
import defpackage.q73;
import defpackage.qug;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.yrh;
import defpackage.yso;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ComposeModalBottomSheetDialog extends BaseModalBottomSheetDialog {
    public final boolean w = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View C(LayoutInflater layoutInflater) {
        Function2 I = I();
        if (I != null) {
            return yso.s(this, new tc3(1824073438, new he3(0, I), true));
        }
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        ComposeView composeView = a.b;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(1965674870, new ie3(this, 0), true));
        CoordinatorLayout coordinatorLayout = a.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    public final void F(ksa ksaVar, Function1 function1, of3 of3Var, int i) {
        Function1 function12;
        ksaVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(60344818);
        int i2 = (av8Var.g(ksaVar) ? 4 : 2) | i | 48 | (av8Var.i(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new q73(6);
                av8Var.n0(O);
            }
            Function1 function13 = (Function1) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = w();
                av8Var.n0(O2);
            }
            Function1 function14 = (Function1) O2;
            Unit unit = Unit.a;
            boolean z = (i2 & 14) == 4;
            Object O3 = av8Var.O();
            if (z || O3 == a99Var) {
                g2 g2Var = new g2(function13, ksaVar, function14, (rq3) null, 25);
                av8Var.n0(g2Var);
                O3 = g2Var;
            }
            hz8.o(av8Var, unit, (Function2) O3);
            function12 = function13;
        } else {
            av8Var.W();
            function12 = function1;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(this, ksaVar, function12, i, 12);
        }
    }

    public final void G(qug qugVar, Function1 function1, of3 of3Var, int i) {
        Function1 function12;
        qugVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1225765901);
        int i2 = (av8Var.g(qugVar) ? 4 : 2) | i | 48 | (av8Var.i(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new q73(7);
                av8Var.n0(O);
            }
            Function1 function13 = (Function1) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = w();
                av8Var.n0(O2);
            }
            Function1 function14 = (Function1) O2;
            Unit unit = Unit.a;
            boolean z = (i2 & 14) == 4;
            Object O3 = av8Var.O();
            if (z || O3 == a99Var) {
                g2 g2Var = new g2(function13, qugVar, function14, (rq3) null, 24);
                av8Var.n0(g2Var);
                O3 = g2Var;
            }
            hz8.o(av8Var, unit, (Function2) O3);
            function12 = function13;
        } else {
            av8Var.W();
            function12 = function1;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(this, qugVar, function12, i, 13);
        }
    }

    /* renamed from: H */
    public abstract tc3 getC();

    public Function2 I() {
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public boolean getY() {
        return this.w;
    }
}
