package com.sofascore.results.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.sofascore.results.R;
import defpackage.ab;
import defpackage.aba;
import defpackage.b71;
import defpackage.c25;
import defpackage.cn9;
import defpackage.hpo;
import defpackage.ia0;
import defpackage.j4;
import defpackage.krk;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.ok3;
import defpackage.r0;
import defpackage.u2;
import defpackage.w82;
import defpackage.y7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/results/dialog/BaseSuggestChangesDialog;", "Lkrk;", "T", "Lcom/sofascore/results/dialog/BaseFullScreenDialog;", "Lc25;", "", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseSuggestChangesDialog<T extends krk> extends BaseFullScreenDialog<c25> {
    public krk w;
    public final /* synthetic */ hpo v = new hpo();
    public final mqi x = ypa.b(new b71(this, 0));

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n(1, R.style.RedesignFullScreenDialog_AdjustPan);
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public void onResume() {
        View view;
        super.onResume();
        ia0 ia0Var = ia0.q;
        if (ok3.p().e().getIsLoggedIn() && (view = (View) this.v.a) != null) {
            view.setVisibility(8);
        }
        c25 c25Var = (c25) this.s;
        if (c25Var != null) {
            c25Var.c.d.setEnabled(ok3.p().e().getIsLoggedIn());
        }
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        c25 c25Var = (c25) this.s;
        if (c25Var != null) {
            w82 w82Var = c25Var.c;
            ImageView imageView = w82Var.c;
            aba.y(imageView, 0, 1);
            z8e.a0(imageView, 1000L, new b71(this, 1));
            TextView textView = w82Var.d;
            aba.y(textView, 0, 3);
            z8e.a0(textView, 1000L, new j4(17, c25Var, this));
            w82Var.e.setText(u());
            ia0 ia0Var = ia0.q;
            if (!ok3.p().e().getIsLoggedIn()) {
                c25Var.a.post(new r0(21, this, c25Var));
            }
        }
        y();
        v().b().e(getViewLifecycleOwner(), new y7(2, new u2(this, 17)));
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final krk s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.dialog_suggest_changes, viewGroup, false);
        int i = R.id.action_banner;
        ViewStub viewStub = (ViewStub) nq8.B(R.id.action_banner, inflate);
        if (viewStub != null) {
            i = R.id.header;
            View B = nq8.B(R.id.header, inflate);
            if (B != null) {
                int i2 = R.id.close_icon;
                ImageView imageView = (ImageView) nq8.B(R.id.close_icon, B);
                if (imageView != null) {
                    i2 = R.id.submit_button;
                    TextView textView = (TextView) nq8.B(R.id.submit_button, B);
                    if (textView != null) {
                        i2 = R.id.title;
                        TextView textView2 = (TextView) nq8.B(R.id.title, B);
                        if (textView2 != null) {
                            w82 w82Var = new w82((ConstraintLayout) B, imageView, textView, textView2, 1);
                            i = R.id.nested_scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) nq8.B(R.id.nested_scroll_view, inflate);
                            if (nestedScrollView != null) {
                                c25 c25Var = new c25((CoordinatorLayout) inflate, viewStub, w82Var, nestedScrollView);
                                krk x = x(layoutInflater, nestedScrollView);
                                x.getRoot().setOnTouchListener(new ab(2));
                                this.w = x;
                                nestedScrollView.addView(x.getRoot());
                                return c25Var;
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i2)));
                return null;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public String u() {
        return (String) this.x.getValue();
    }

    public abstract cn9 v();

    public abstract boolean w();

    public abstract krk x(LayoutInflater layoutInflater, NestedScrollView nestedScrollView);

    public abstract void y();

    public abstract void z();
}
