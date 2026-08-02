package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.header.TeamLogoView;
import com.sofascore.results.view.header.TimeoutsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zla implements krk {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final FollowActionButton c;
    public final FollowActionButton d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TeamLogoView h;
    public final TextView i;
    public final TimeoutsView j;
    public final TextView k;
    public final ConstraintLayout l;
    public final TextView m;
    public final TextView n;
    public final TeamLogoView o;
    public final TextView p;
    public final TimeoutsView q;
    public final TextView r;
    public final Group s;
    public final TextView t;
    public final Guideline u;

    public zla(ConstraintLayout constraintLayout, FrameLayout frameLayout, FollowActionButton followActionButton, FollowActionButton followActionButton2, TextView textView, TextView textView2, TextView textView3, TeamLogoView teamLogoView, TextView textView4, TimeoutsView timeoutsView, TextView textView5, ConstraintLayout constraintLayout2, TextView textView6, TextView textView7, TeamLogoView teamLogoView2, TextView textView8, TimeoutsView timeoutsView2, TextView textView9, Group group, TextView textView10, Guideline guideline) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = followActionButton;
        this.d = followActionButton2;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
        this.h = teamLogoView;
        this.i = textView4;
        this.j = timeoutsView;
        this.k = textView5;
        this.l = constraintLayout2;
        this.m = textView6;
        this.n = textView7;
        this.o = teamLogoView2;
        this.p = textView8;
        this.q = timeoutsView2;
        this.r = textView9;
        this.s = group;
        this.t = textView10;
        this.u = guideline;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
