package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.view.branding.BrandingHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z3f implements krk {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;

    public z3f(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, TextView textView, hrc hrcVar) {
        this.a = 9;
        this.b = constraintLayout;
        this.c = linearProgressIndicator;
        this.d = hrcVar;
    }

    public static z3f a(View view) {
        int i = R.id.indicator;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.indicator, view);
        if (circularProgressIndicator != null) {
            i = R.id.percentage;
            TextView textView = (TextView) nq8.B(R.id.percentage, view);
            if (textView != null) {
                return new z3f(6, textView, (ConstraintLayout) view, circularProgressIndicator);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static z3f b(View view) {
        int i = R.id.toolbar_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.toolbar_container, view);
        if (linearLayout != null) {
            i = R.id.toolbar_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) nq8.B(R.id.toolbar_title, view);
            if (appCompatTextView != null) {
                return new z3f((UnderlinedToolbar) view, linearLayout, appCompatTextView, 10);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static z3f c(View view) {
        int i = R.id.arrow;
        View B = nq8.B(R.id.arrow, view);
        if (B != null) {
            i = R.id.tooltip_text;
            TextView textView = (TextView) nq8.B(R.id.tooltip_text, view);
            if (textView != null) {
                return new z3f(11, textView, (LinearLayout) view, B);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static z3f d(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        View inflate = layoutInflater.inflate(R.layout.transfer_filter_modal_footer_layout, (ViewGroup) frameLayout, false);
        int i = R.id.apply_button;
        Button button = (Button) nq8.B(R.id.apply_button, inflate);
        if (button != null) {
            i = R.id.clear_filter_button;
            Button button2 = (Button) nq8.B(R.id.clear_filter_button, inflate);
            if (button2 != null) {
                return new z3f(12, button2, (ConstraintLayout) inflate, button);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static z3f e(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View inflate = layoutInflater.inflate(R.layout.view_standings_branding_header, (ViewGroup) recyclerView, false);
        int i = R.id.brand_header;
        BrandingHeaderView brandingHeaderView = (BrandingHeaderView) nq8.B(R.id.brand_header, inflate);
        if (brandingHeaderView != null) {
            i = R.id.brand_text;
            TextView textView = (TextView) nq8.B(R.id.brand_text, inflate);
            if (textView != null) {
                return new z3f(15, textView, (LinearLayout) inflate, brandingHeaderView);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        Object obj = this.c;
        ViewGroup viewGroup = this.b;
        switch (i) {
        }
        return (LinearLayout) viewGroup;
    }

    public /* synthetic */ z3f(ViewGroup viewGroup, LinearLayout linearLayout, TextView textView, int i) {
        this.a = i;
        this.c = viewGroup;
        this.b = linearLayout;
        this.d = textView;
    }

    public z3f(LinearLayout linearLayout, LinearLayout linearLayout2, woc wocVar, RecyclerView recyclerView) {
        this.a = 1;
        this.b = linearLayout;
        this.c = linearLayout2;
        this.d = wocVar;
    }

    public /* synthetic */ z3f(int i, View view, ViewGroup viewGroup, Object obj) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
        this.d = view;
    }
}
