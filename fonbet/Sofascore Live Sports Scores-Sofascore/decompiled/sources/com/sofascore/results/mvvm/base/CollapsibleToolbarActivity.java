package com.sofascore.results.mvvm.base;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import defpackage.as9;
import defpackage.eq3;
import defpackage.hkg;
import defpackage.iz8;
import defpackage.mqi;
import defpackage.qa5;
import defpackage.tba;
import defpackage.tv3;
import defpackage.uy0;
import defpackage.vc;
import defpackage.vy0;
import defpackage.yj1;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CollapsibleToolbarActivity extends AbstractActivity {
    public static final /* synthetic */ int K = 0;
    public final mqi J = ypa.b(new yj1(this, 26));

    public static /* synthetic */ void V(CollapsibleToolbarActivity collapsibleToolbarActivity, String str, Country country, String str2, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        collapsibleToolbarActivity.T(str, country, str2, false);
    }

    public final vc Q() {
        return (vc) this.J.getValue();
    }

    public final ImageView R() {
        return (ImageView) Q().f.d;
    }

    public final void S(Team team, String str, Country country, String str2, boolean z) {
        team.getClass();
        iz8.D(Q().f, team, false);
        T(str, country, str2, z);
    }

    public final void T(String str, Country country, String str2, boolean z) {
        ((TextView) Q().f.g).setText(str);
        TextView textView = (TextView) Q().f.i;
        textView.setVisibility((str2 == null ? country != null ? country.getName() : null : str2) != null ? 0 : 8);
        if (str2 == null) {
            str2 = tv3.c(this, country != null ? country.getName() : null);
        }
        textView.setText(str2);
        ImageView imageView = (ImageView) Q().f.j;
        if (!z) {
            as9.c(imageView, country != null ? country.getAlpha2() : null, true, null, 4);
            imageView.setVisibility(country != null ? 0 : 8);
        } else {
            as9.a((ImageView) Q().f.d);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.team_logo_placeholder);
            imageView.setImageTintList(eq3.q(R.color.neutral_default, imageView.getContext()));
        }
    }

    public final void U(String str, Team team, boolean z, boolean z2, Gender gender) {
        ((TextView) Q().f.g).setText(str);
        if (z || z2) {
            ImageView imageView = (ImageView) Q().f.j;
            imageView.setImageDrawable(qa5.a.m(this));
            imageView.setVisibility(0);
            ((TextView) Q().f.i).setText(z2 ? hkg.Q(this, R.string.deceased, gender, new Object[0]) : getString(R.string.retired_player));
            return;
        }
        String p = tba.p(this, team);
        ((TextView) Q().f.i).setVisibility(p.length() > 0 ? 0 : 8);
        ((TextView) Q().f.i).setText(p);
        if (team != null) {
            ImageView imageView2 = (ImageView) Q().f.j;
            as9.o(imageView2, team.getId());
            imageView2.setVisibility(0);
        }
    }

    public final void W(Team team, Country country, boolean z) {
        if (team == null || Intrinsics.c(team.getName(), "No team")) {
            String alpha2 = country != null ? country.getAlpha2() : null;
            if (alpha2 != null) {
                Q().d.setBackground(new uy0(alpha2));
            }
        } else {
            Q().d.setBackground(new vy0(team.getId()));
        }
        if (z) {
            as9.a((ImageView) Q().f.d);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        H(Q().i);
    }
}
