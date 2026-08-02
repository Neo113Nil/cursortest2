package com.sofascore.results.profile.topLeaderboards;

import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardsActivity;
import defpackage.baf;
import defpackage.bti;
import defpackage.caf;
import defpackage.hkg;
import defpackage.joa;
import defpackage.mqi;
import defpackage.sy0;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/profile/topLeaderboards/ProfileTopLeaderboardsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "yfa", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileTopLeaderboardsActivity extends Hilt_ProfileTopLeaderboardsActivity {
    public static final /* synthetic */ int N = 0;
    public final mqi K;
    public final mqi L;
    public final joa M;

    public ProfileTopLeaderboardsActivity() {
        final int i = 0;
        this.K = ypa.b(new Function0(this) { // from class: kbf
            public final /* synthetic */ ProfileTopLeaderboardsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProfileTopLeaderboardsActivity profileTopLeaderboardsActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = ProfileTopLeaderboardsActivity.N;
                        return bti.a(profileTopLeaderboardsActivity.getLayoutInflater());
                    case 1:
                        int i4 = ProfileTopLeaderboardsActivity.N;
                        return new caf(profileTopLeaderboardsActivity, profileTopLeaderboardsActivity.Q().i, profileTopLeaderboardsActivity.Q().g);
                    default:
                        int i5 = ProfileTopLeaderboardsActivity.N;
                        Bundle extras = profileTopLeaderboardsActivity.getIntent().getExtras();
                        if (extras != null) {
                            return (baf) gz8.M(extras, "INITIAL_TAB", baf.class);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.L = ypa.b(new Function0(this) { // from class: kbf
            public final /* synthetic */ ProfileTopLeaderboardsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProfileTopLeaderboardsActivity profileTopLeaderboardsActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = ProfileTopLeaderboardsActivity.N;
                        return bti.a(profileTopLeaderboardsActivity.getLayoutInflater());
                    case 1:
                        int i4 = ProfileTopLeaderboardsActivity.N;
                        return new caf(profileTopLeaderboardsActivity, profileTopLeaderboardsActivity.Q().i, profileTopLeaderboardsActivity.Q().g);
                    default:
                        int i5 = ProfileTopLeaderboardsActivity.N;
                        Bundle extras = profileTopLeaderboardsActivity.getIntent().getExtras();
                        if (extras != null) {
                            return (baf) gz8.M(extras, "INITIAL_TAB", baf.class);
                        }
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.M = ypa.a(ysa.c, new Function0(this) { // from class: kbf
            public final /* synthetic */ ProfileTopLeaderboardsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProfileTopLeaderboardsActivity profileTopLeaderboardsActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfileTopLeaderboardsActivity.N;
                        return bti.a(profileTopLeaderboardsActivity.getLayoutInflater());
                    case 1:
                        int i4 = ProfileTopLeaderboardsActivity.N;
                        return new caf(profileTopLeaderboardsActivity, profileTopLeaderboardsActivity.Q().i, profileTopLeaderboardsActivity.Q().g);
                    default:
                        int i5 = ProfileTopLeaderboardsActivity.N;
                        Bundle extras = profileTopLeaderboardsActivity.getIntent().getExtras();
                        if (extras != null) {
                            return (baf) gz8.M(extras, "INITIAL_TAB", baf.class);
                        }
                        return null;
                }
            }
        });
    }

    public final bti Q() {
        return (bti) this.K.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(Q().a);
        H((UnderlinedToolbar) Q().h.c);
        String string = getString(R.string.leaderboards_title);
        string.getClass();
        setTitle(string);
        AbstractActivity.O(Q().g, Integer.valueOf(hkg.X(this)), getColor(R.color.on_color_primary));
        Q().c.setBackground(sy0.a);
        ViewPager2 viewPager2 = Q().i;
        mqi mqiVar = this.L;
        viewPager2.setAdapter((caf) mqiVar.getValue());
        ((caf) mqiVar.getValue()).x(baf.e);
        baf bafVar = (baf) this.M.getValue();
        if (bafVar != null) {
            int D = ((caf) mqiVar.getValue()).D(bafVar);
            Integer valueOf = Integer.valueOf(D);
            if (D < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
                Q().i.c(i, false);
            }
        }
        i = 0;
        Q().i.c(i, false);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "LeaderboardScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
