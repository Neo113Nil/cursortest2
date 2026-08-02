package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentOddsView;
import com.sofascore.results.view.BellButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f92 implements krk {
    public final /* synthetic */ int a = 2;
    public final ConstraintLayout b;
    public final FrameLayout c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final TextView h;
    public final TextView i;
    public final ImageView j;
    public final View k;
    public final View l;
    public final View m;
    public final View n;
    public final View o;
    public final View p;
    public final View q;
    public final View r;
    public final View s;
    public final View t;

    public f92(FrameLayout frameLayout, BellButton bellButton, TextView textView, ConstraintLayout constraintLayout, FeaturedTournamentOddsView featuredTournamentOddsView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, ImageView imageView2, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.c = frameLayout;
        this.l = bellButton;
        this.d = textView;
        this.b = constraintLayout;
        this.m = featuredTournamentOddsView;
        this.j = imageView;
        this.e = textView2;
        this.f = textView3;
        this.h = textView4;
        this.i = textView5;
        this.n = textView6;
        this.o = textView7;
        this.k = imageView2;
        this.p = textView8;
        this.q = textView9;
        this.r = textView10;
        this.s = textView11;
        this.t = textView12;
        this.g = textView13;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (i) {
            case 0:
            case 1:
                return constraintLayout;
            default:
                return this.c;
        }
    }

    public f92(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, View view, ImageView imageView5, FrameLayout frameLayout, TextView textView2, ImageView imageView6, ImageView imageView7, ImageView imageView8, TextView textView3, ImageView imageView9, LinearLayout linearLayout, TextView textView4, View view2, TextView textView5) {
        this.b = constraintLayout;
        this.j = imageView;
        this.k = imageView2;
        this.l = imageView3;
        this.m = imageView4;
        this.d = textView;
        this.s = view;
        this.n = imageView5;
        this.c = frameLayout;
        this.e = textView2;
        this.o = imageView6;
        this.p = imageView7;
        this.q = imageView8;
        this.f = textView3;
        this.r = imageView9;
        this.g = linearLayout;
        this.h = textView4;
        this.t = view2;
        this.i = textView5;
    }

    public f92(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, FrameLayout frameLayout2, TextView textView2, TextView textView3, LinearLayout linearLayout, ConstraintLayout constraintLayout5, FrameLayout frameLayout3, TextView textView4, ConstraintLayout constraintLayout6, TextView textView5, ImageView imageView, TextView textView6, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.b = constraintLayout;
        this.c = frameLayout;
        this.d = textView;
        this.k = constraintLayout2;
        this.l = constraintLayout3;
        this.m = constraintLayout4;
        this.n = frameLayout2;
        this.e = textView2;
        this.f = textView3;
        this.g = linearLayout;
        this.o = constraintLayout5;
        this.p = frameLayout3;
        this.h = textView4;
        this.q = constraintLayout6;
        this.i = textView5;
        this.j = imageView;
        this.r = textView6;
        this.s = linearLayout2;
        this.t = linearLayout3;
    }
}
