package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.header.TeamLogoView;
import com.sofascore.results.view.header.volleyball.VolleyballEventResultView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j89 implements krk {
    public final ConstraintLayout a;
    public final VolleyballEventResultView b;
    public final FrameLayout c;
    public final TextView d;
    public final FollowActionButton e;
    public final TeamLogoView f;
    public final TextView g;
    public final ConstraintLayout h;
    public final FollowActionButton i;
    public final TeamLogoView j;
    public final TextView k;
    public final Guideline l;

    public j89(ConstraintLayout constraintLayout, VolleyballEventResultView volleyballEventResultView, FrameLayout frameLayout, TextView textView, FollowActionButton followActionButton, TeamLogoView teamLogoView, TextView textView2, ConstraintLayout constraintLayout2, FollowActionButton followActionButton2, TeamLogoView teamLogoView2, TextView textView3, Guideline guideline) {
        this.a = constraintLayout;
        this.b = volleyballEventResultView;
        this.c = frameLayout;
        this.d = textView;
        this.e = followActionButton;
        this.f = teamLogoView;
        this.g = textView2;
        this.h = constraintLayout2;
        this.i = followActionButton2;
        this.j = teamLogoView2;
        this.k = textView3;
        this.l = guideline;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
