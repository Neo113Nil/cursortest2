package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.main.tutorial.PulsatingFrameLayout;
import com.sofascore.results.redesign.dividers.SofaDivider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class djf implements krk {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public djf(LinearLayout linearLayout, ImageView imageView, SwitchCompat switchCompat, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.a = 8;
        this.c = linearLayout;
        this.d = imageView;
        this.f = switchCompat;
        this.g = textView;
        this.e = textView2;
        this.b = constraintLayout;
    }

    public static djf a(View view) {
        int i = R.id.container_quick_links;
        PulsatingFrameLayout pulsatingFrameLayout = (PulsatingFrameLayout) nq8.B(R.id.container_quick_links, view);
        if (pulsatingFrameLayout != null) {
            i = R.id.icon_quick_links;
            if (((ImageView) nq8.B(R.id.icon_quick_links, view)) != null) {
                i = R.id.search_button;
                TextView textView = (TextView) nq8.B(R.id.search_button, view);
                if (textView != null) {
                    i = R.id.spinner;
                    Spinner spinner = (Spinner) nq8.B(R.id.spinner, view);
                    if (spinner != null) {
                        i = R.id.toolbar_container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.toolbar_container, view);
                        if (linearLayout != null) {
                            i = R.id.toolbar_title;
                            TextView textView2 = (TextView) nq8.B(R.id.toolbar_title, view);
                            if (textView2 != null) {
                                return new djf((UnderlinedToolbar) view, pulsatingFrameLayout, textView, spinner, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            case 1:
                return (LinearLayout) viewGroup;
            case 2:
                return (LinearLayout) viewGroup;
            case 3:
                return (LinearLayout) viewGroup;
            case 4:
                return (LinearLayout) viewGroup;
            case 5:
                return (ConstraintLayout) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (ConstraintLayout) viewGroup;
            case 8:
                return (LinearLayout) this.c;
            case 9:
                return (ConstraintLayout) viewGroup;
            case 10:
                return (UnderlinedToolbar) viewGroup;
            case 11:
                return (ConstraintLayout) viewGroup;
            default:
                return (CardView) viewGroup;
        }
    }

    public /* synthetic */ djf(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    public djf(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, SofaDivider sofaDivider) {
        this.a = 7;
        this.b = constraintLayout;
        this.d = imageView;
        this.e = imageView2;
        this.g = textView;
        this.c = textView2;
        this.f = sofaDivider;
    }

    public /* synthetic */ djf(ViewGroup viewGroup, TextView textView, Object obj, Object obj2, View view, View view2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.g = textView;
        this.c = obj;
        this.d = obj2;
        this.e = view;
        this.f = view2;
    }

    public djf(UnderlinedToolbar underlinedToolbar, PulsatingFrameLayout pulsatingFrameLayout, TextView textView, Spinner spinner, LinearLayout linearLayout, TextView textView2) {
        this.a = 10;
        this.b = underlinedToolbar;
        this.c = pulsatingFrameLayout;
        this.g = textView;
        this.d = spinner;
        this.e = linearLayout;
        this.f = textView2;
    }

    public djf(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2) {
        this.a = 11;
        this.b = constraintLayout;
        this.g = textView;
        this.c = textView2;
        this.f = textView3;
        this.d = imageView;
        this.e = imageView2;
    }

    public djf(ConstraintLayout constraintLayout, View view, View view2, TextView textView, TextView textView2, View view3) {
        this.a = 9;
        this.b = constraintLayout;
        this.c = view;
        this.d = view2;
        this.g = textView;
        this.e = textView2;
        this.f = view3;
    }
}
