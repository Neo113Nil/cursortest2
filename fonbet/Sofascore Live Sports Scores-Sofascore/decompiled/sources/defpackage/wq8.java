package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wq8 implements krk {
    public final CoordinatorLayout a;
    public final ImageView b;
    public final ImageView c;
    public final LinearLayout d;
    public final CardView e;
    public final TextView f;
    public final ViewPager2 g;

    public wq8(CoordinatorLayout coordinatorLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, CardView cardView, TextView textView, ViewPager2 viewPager2) {
        this.a = coordinatorLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = linearLayout;
        this.e = cardView;
        this.f = textView;
        this.g = viewPager2;
    }

    public static wq8 a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_weekly_events, (ViewGroup) null, false);
        int i = R.id.app_bar;
        if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
            i = R.id.next_week_button;
            ImageView imageView = (ImageView) nq8.B(R.id.next_week_button, inflate);
            if (imageView != null) {
                i = R.id.previous_week_button;
                ImageView imageView2 = (ImageView) nq8.B(R.id.previous_week_button, inflate);
                if (imageView2 != null) {
                    i = R.id.week_picker_button_container;
                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.week_picker_button_container, inflate);
                    if (linearLayout != null) {
                        i = R.id.week_picker_card;
                        CardView cardView = (CardView) nq8.B(R.id.week_picker_card, inflate);
                        if (cardView != null) {
                            i = R.id.week_text;
                            TextView textView = (TextView) nq8.B(R.id.week_text, inflate);
                            if (textView != null) {
                                i = R.id.weekly_pager;
                                ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.weekly_pager, inflate);
                                if (viewPager2 != null) {
                                    return new wq8((CoordinatorLayout) inflate, imageView, imageView2, linearLayout, cardView, textView, viewPager2);
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
