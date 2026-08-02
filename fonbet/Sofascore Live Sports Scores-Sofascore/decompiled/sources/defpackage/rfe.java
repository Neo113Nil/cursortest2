package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rfe implements krk {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final Object c;
    public final View d;
    public final View e;

    public rfe(LinearLayout linearLayout, View view, TextView textView, TextView textView2) {
        this.a = 9;
        this.b = linearLayout;
        this.d = view;
        this.e = textView;
        this.c = textView2;
    }

    public static rfe a(View view) {
        int i = R.id.background_container;
        if (((ImageView) nq8.B(R.id.background_container, view)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.chevron;
            ImageView imageView = (ImageView) nq8.B(R.id.chevron, view);
            if (imageView != null) {
                i = R.id.content_container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.content_container, view);
                if (linearLayout != null) {
                    i = R.id.title;
                    if (((TextView) nq8.B(R.id.title, view)) != null) {
                        return new rfe(7, imageView, linearLayout, constraintLayout, constraintLayout);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static rfe b(View view) {
        int i = R.id.bottom_divider;
        View B = nq8.B(R.id.bottom_divider, view);
        if (B != null) {
            i = R.id.data;
            TextView textView = (TextView) nq8.B(R.id.data, view);
            if (textView != null) {
                i = R.id.label;
                TextView textView2 = (TextView) nq8.B(R.id.label, view);
                if (textView2 != null) {
                    return new rfe((LinearLayout) view, B, textView, textView2);
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
                return (FrameLayout) viewGroup;
            case 3:
                return (CardView) viewGroup;
            case 4:
                return (ConstraintLayout) viewGroup;
            case 5:
                return (LinearLayout) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (ConstraintLayout) viewGroup;
            case 8:
                return (jfk) viewGroup;
            case 9:
                return (LinearLayout) viewGroup;
            case 10:
                return (NestedScrollView) viewGroup;
            case 11:
                return (f32) viewGroup;
            default:
                return (LinearLayout) viewGroup;
        }
    }

    public /* synthetic */ rfe(ViewGroup viewGroup, TextView textView, View view, View view2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.e = textView;
        this.c = view;
        this.d = view2;
    }

    public /* synthetic */ rfe(ViewGroup viewGroup, Object obj, TextView textView, View view, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
        this.e = textView;
        this.d = view;
    }

    public /* synthetic */ rfe(int i, View view, View view2, ViewGroup viewGroup, Object obj) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
        this.d = view;
        this.e = view2;
    }
}
